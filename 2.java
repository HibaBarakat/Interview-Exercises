import java.util.Queue;
import java.util.Set;

class Lock{
    public int openLock(String[] deadends, String target) {
        int distance = 0 ;
        Set<String> visited = new HashSet<>();
        Set<String> deadend = new HashSet<>(Arrays.asList(deadends));
        Queue<String> queue = new LinkedList<>();

        if(deadend.contains(target)) return -1;
        if(target == "0000") return 0;


        queue.offer("0000");
        while(queue.isEmpty() == false){
            String code = queue.poll();
            if (deadendsSet.contains(code)) {
                continue;
            }
            if (target.equals(code)) return distance;
            
            char[] charsCode = code.toCharArray();
            for(int i = 0 ; i<4 ; i++){
                char temp = charsCode[i];
                for (int j = -1; j<=1 ; j+=2 ){
                    charsCode =  (char)((temp - '0' + j + 10) % 10 + '0');
                    String newCode = new String(charsCode);
                    if(visited.contains(newCode) == false && deadend.contains(newCode)==false){
                        queue.offer(newCode);
                        visited.add(newCode);
                    }
                }
                charsCode[i] = temp;
            }
            distance++;

        }



        return -1;

    }

}