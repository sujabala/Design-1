

public class HashMap {

	public static void main(String[] args) {
	

	}

	
	 ListNode[] nodes = new ListNode[10000];
	    /** Initialize your data structure here. */
	    public HashMap() {
	        
	    }
	    
	    /** value will always be non-negative. */
	    public void put(int key, int value) {
	        int index = getIndex(key);
	        ListNode prev = findElement(index, key);
	        if(prev.next == null){
	            prev.next = new ListNode(key,value);
	        }
	        else{
	            prev.next.val = value;
	        }
	    }
	    
	    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
	    public int get(int key) {
	        int index = getIndex(key);
	        ListNode curr = findElement(index, key);
	        return curr.next == null? -1: curr.next.val;
	        
	    }
	    
	    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
	    public void remove(int key) {
	        int index = getIndex(key);
	        ListNode curr = findElement(index, key);
	        if(curr.next != null){
	            curr.next = curr.next.next;
	        }
	        
	    }
	    
	    private int getIndex(int key){
	        return Integer.hashCode(key) % 10000;
	        
	    }
	        
	        
	  
	    private ListNode findElement(int index, int key){
	        if(nodes[index] == null){
	            return nodes[index] = new ListNode(-1,-1);
	        }
	        ListNode prev = nodes[index] ; 
	        while(prev.next != null && prev.next.key != key){
	            prev = prev.next;
	        }
	        return prev;
	    }
	    
	    private static class ListNode{
	        int key;
	        int val;
	        ListNode next;
	        
	        ListNode(int key, int val){
	            this.key = key;
	            this.val = val;
	        }
	    }
}
