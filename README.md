# Tree
A tree data structure can be defined recursively as a collection of nodes (starting at a root node), where each node is a data structure consisting of a value, together with a list of references to nodes (the "children"), with the constraints that no reference is duplicated, and none points to the root.

## Implementation
Since a tree is a collection of nodes, **Node** class has been created. The collection of all these Nodes is used for making the **Tree** class.

Each **Node** contains some information. This includes information about it's ***value*** , ***parent*** and ***children***.
Each **Tree** contains information about the number of nodes, collection of Nodes, root and depth of the tree.

### Node Class

**Instance Variables** : *int parent*, *int value*, *boolean root*, *List child(Integer type)*. <br>
**parent** contains the details of the parent of the node, **value** contains the value of the node, **root** is True if the current node is the root of the tree, and is False if not.

**Methods** : *add_child()*, which adds the of the node, into the List child.

### Tree Class

**Instance Variables** : *int l*,*int value(Array)*, *int depth*, *Node nodes(Array)*, *Node root*. <br>
**l** contains the number of nodes, **value** is an array containing all the values of the nodes of the tree, **depth** contains the depth of the tree, **nodes** contains the Nodes of the tree, and **root** contains  the root Node.

**Methods** : *setValues()*, *printVal()*, *traverse(Node StartingNode)*, *give_depth(Node StartingNode, int CurrentDepth)*. <br>
**setValues()** sets the Nodes Values, **traverse(Node StartingNode)** traverses through the whole array and prints the whole tree, **give_depth(Node StartingNode, int CurrentDepth)** finds out the depth of the node starting at StartingNode.

## Representation of the tree

A tree is represented in an array. E.g. (-1, 0, 4, 0, 3). <br>
For ease, if **n** denotes the number of nodes, the values of the tree are from **0 to n-1**. 
Each element of the array (eg, 4 at index 2) is the **parent** of the element of **index** (4 is the parent of 2, 0 is the parent of 1 and 3, 3 is parent of 4).<br>
If an element is -1, it denotes the index is the **Root** of the parent. (0 is the ROOT here).

This representation denotes the whole tree.

#### Representation:
-1 0 4 0 3

          0
      1       3
              4    
              2
       
