package amazingstacks;

/**
 *
 * @author luisvillagomez
 */
public class BacktrackingAnt extends WanderingAnt {
    
    LinkedStack<Cell> stack;
    boolean backTrack;
    
    public BacktrackingAnt(Cell target){
        super(target);
        stack = new LinkedStack<Cell>();
        
    }
    
    @Override
    public void moveLookingForFood()
    {
       
    }
    
   
    
}
    

    
