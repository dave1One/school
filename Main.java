
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    // instance variables - replace the example below with your own
    BinarySearchTree<Entry> BST;
    BinaryTree<Character> BT;
    BinarySearchTree<Entry> BSTZwei = new BinarySearchTree<Entry>();
    
    public Main()
    {
        BinarySearchTree<Entry> BST = new BinarySearchTree<Entry>();
        BST.insert(new Entry(10));
        BST.insert(new Entry(12));
        BST.insert(new Entry(9));
        BST.insert(new Entry(6));
        
        BinaryTree<Character> BT = new BinaryTree<Character>('J');
        BinaryTree<Character> a = new BinaryTree<Character>('A');
        BinaryTree<Character> n = new BinaryTree<Character>('N');
        BT.setLeftTree(n);
        BT.setRightTree(a);
        
        wasTueIch(BST);
        System.out.println();
        wasTueIch(BT);
    }
    
        
    
    public void wasTueIch(BinarySearchTree<Entry> pBST){
      if(pBST.isEmpty())
        return;
      System.out.print(pBST.getContent().getWert() + " ");
      wasTueIch(pBST.getLeftTree());
      wasTueIch(pBST.getRightTree());
      
    }
    
        public void wasTueIch(BinaryTree<Character> pBT){
      if(pBT.isEmpty())
        return;
      System.out.print(pBT.getContent() + " ");
      wasTueIch(pBT.getLeftTree());
      wasTueIch(pBT.getRightTree());
      
    }

    
}
