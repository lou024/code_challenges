public class Main {

    public static void main(String[] args) {
        Integer[] a = {1,2,3,4};
        CircularArray<Integer> circularArray = new CircularArray<>(a);

        // before rotations
        System.out.println("before rotations:");
        for(Integer i : circularArray) {
            System.out.print(i + " ");
        }

        // rotate forwards
        circularArray.rotateForward();
        circularArray.rotateForward();
        System.out.println("\nafter forward rotation (2):");
        for(Integer i : circularArray) {
            System.out.print(i + " ");
        }
        // rotate backwards
        circularArray.rotateBackward();
        circularArray.rotateBackward();
        circularArray.rotateBackward();
        System.out.println("\nafter backward rotation (3):");
        for(Integer i : circularArray) {
            System.out.print(i + " ");
        }

    }
}
