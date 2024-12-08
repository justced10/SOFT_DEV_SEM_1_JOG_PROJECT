package utilz;



import java.awt.geom.Rectangle2D;



public class HelpMethods {

    public static boolean IsEntityOnFloor(Rectangle2D.Float hitbox, int[][] lvlData) {

        // Logic to check if the entity is on the floor

        return true; // Stub implementation

    }



    public static boolean CanMoveHere(float x, float y, float width, float height, int[][] lvlData) {

        // Logic to check if an entity can move to the specified position

        return true; // Stub implementation

    }



    public static float GetEntityYPosUnderRoofOrAboveFloor(Rectangle2D.Float hitbox, float airSpeed) {

        // Logic to calculate entity's Y position during collision

        return hitbox.y; // Stub implementation

    }



    public static float GetEntityXPosNextToWall(Rectangle2D.Float hitbox, float xSpeed) {

        // Logic to calculate entity's X position during collision

        return hitbox.x; // Stub implementation

    }

}