import java.util.ArrayList;
import java.util.List;

class Node{
    int parent, value,depth;
    Boolean root;
    List<Integer> child;
    
    Node(int parent,  int value){
        this.child = new ArrayList<>();
        this.parent = parent;
        this.value = value;

        if(parent==-1){
            root=true;
            depth = 1;
        } 
        else root = false;
    }
    
    void add_child(int child){
        this.child.add(child);
    }

}

class Tree{
    int l,values[],depth;

    Node nodes[],root;

    Tree(int l,int values[]){
        this.l = l;
        this.values = values;
        nodes = new Node[l];
        setValues();
    }
    void setValues(){
        // Declaring the nodes
        for(int i=0; i<this.l; i++) this.nodes[i] = new Node(this.values[i], i);
        for(int i=0; i<this.l; i++) {
            // Declaring parent of every node
            int val = this.nodes[i].parent;
            // Declaring child of every
            if(val != -1) this.nodes[val].add_child(i);
            else root = nodes[i]; 
        }
    }

    void printVal(){
        for(int i=0; i<this.l; i++) 
        System.out.println(this.nodes[i].parent+","+this.nodes[i].value+":"+this.nodes[i].child);
        System.out.println(this.root.value);
    }

    Node traverse(Node curnode){
        List<Integer> children = curnode.child;
        System.out.println(curnode.value);
        if(!children.isEmpty()){
            int l = children.size();
            for(int i=0; i<l; i++){
                int child = children.get(i);
                traverse(nodes[child]);
            }
        }
        return curnode;
    }
    Node give_depth(Node curnode,int depth){
        List<Integer> children = curnode.child;
        if(!children.isEmpty()){
            int l = children.size();
            for(int i=0; i<l; i++){
                int child = children.get(i);
                nodes[child].depth = depth;
                if(this.depth<depth) this.depth = depth; 
                give_depth(nodes[child],depth+1);
            }
        }
        
        return curnode;
    }
}  

public class tree_h{
    public static void main(String arg[]){
        int l = 5;
        int values[] = {-1 ,0 ,4 ,0 ,3};
        Tree t = new Tree(l,values);
        //t.printVal();
                
        //t.give_depth(t.root,1);
        //System.out.println("Max : "+ t.depth);

        t.traverse(t.root);
    }
}