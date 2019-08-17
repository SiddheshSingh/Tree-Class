# Tree
A tree data structure can be defined recursively as a collection of nodes (starting at a root node), where each node is a data structure consisting of a value, together with a list of references to nodes (the "children"), with the constraints that no reference is duplicated, and none points to the root.

## Implementation
Since a tree is a collection of nodes, **Node** class has been created. The collection of all these Nodes is used for making the **Tree** class.

Each **Node** contains some information. This includes information about it's ***value*** , ***parent*** and ***children***.
Each **Tree** contains information about the number of nodes, collection of Nodes, root and depth of the tree.

