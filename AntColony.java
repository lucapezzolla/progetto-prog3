public class AntColony {
    public static final int ANTS = 300;
    public static final int ITERATIONS = 100;
    public static final int PHERO_QNT = 100;
    public static final double A = 1;
    public static final double B = 5;
    public static final double EVAPORATE_PER = 0.5;
    public static final int NO_NEIGHBOUR = -1;
    public static final int NO_PHEROMONE = -1;

    private Labyrinth lab;

    public AntColony() {
        for(int i = 0; i < lab.getEndPos(); i++) {
            for(int j = 0; j < lab.getEndPos(); j++) {
                lab[i][j].setVisited(false);
            }
        }
    }


    public Cell selectEdge(Ant ant, int i, int j) {
        for(int i = 0; i < lab.getEndPos(); i++) {
            for(int j = 0; j < lab.getEndPos(); j++) {
                if(lab.getCell(i,j).getVisited() == Boolean.FALSE)
                    lab.getCell(i,j).setCoefficient(//ComputeCoefficient());
                    if(lab.getCell(i,j).getCoefficient() > ant.getBest()) {
                        ant.setBest(lab.getCell(i,j).getCoefficient());
                        ant.setResult(lab.getCell(i,j).setCoefficient());
            }
                    else if(lab.getCell(i,j).getCoefficient() == ant.getBest() && ant.getResult() > 0.5)
                        ant.setResult(lab.getCell(i,j).setCoefficient());
        }
    }

        return lab.getCell(i,j);
}


    


