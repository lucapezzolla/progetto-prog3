import java.util.ArrayList;

public class Cell {

    private CellVal value;
    Position pos;

    ArrayList<Cell> neighbours;
    Boolean visited;
    private double coefficient;


    public Cell(CellVal value, Position pos)  {
        this.value = value;
        this.pos = pos;
        this.neighbours = new ArrayList<>(8);

    }

    public Cell(){
        this.value = CellVal.empty;

    }

    public void addNeighbours(Cell neighbour) {
        this.neighbours.add(neighbour);
    }

    public ArrayList<Cell> getNeighbours() {
        return neighbours;
    }

    public CellVal getValue() {
        return value;
    }

    public void setValue(CellVal value) {
        this.value = value;
    }

    public void setVisited(Boolean bool) {
        this.visited = bool;
    }

    public Boolean getVisited()  {
        return this.visited;
    }

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }

    public double getCoefficient() {
        return this.coefficient;
    }


}