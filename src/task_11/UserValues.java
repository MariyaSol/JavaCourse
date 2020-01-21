package task_11;
enum Direction {RIGHT, LEFT}
public class UserValues {



    int Index = -1;
    Direction Dir = null;



    public void setDir(Direction dir) {
        Dir = dir;
    }

    public void setIndex(int index) {
        Index = index;
    }

    public int getIndex() {
        return Index;
    }

    public Direction getDir() {
        return Dir;
    }
}
