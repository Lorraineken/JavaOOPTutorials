// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      Tree myFavoriteOakTree = new Tree(125,
              5,TreeType.OAK);

      Tree myFavoriteMapleTree = new Tree(90,
              30,TreeType.MAPLE);

     // System.out.println(myFavoriteOakTree.treeType);

        myFavoriteOakTree.announceTallTree();
    }
}