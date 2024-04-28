/**
 * FurnitureVisitor
 */
public interface FurnitureVisitor {

    void visit(Chair chair);
    void visit(Table table);
    void visit(Sofa sofa);
}
