package April;

import java.util.ArrayList;

public class _12April {
    public static void main(String[] args) {
        String path = "/home//foo/";
        System.out.println(Simplifypath(path));
    }

    private static String Simplifypath(String path) {

        var dirs = new ArrayList<String>();
        for(var dir : path.split("/")) {
            if(dir.isEmpty() || dir.equals(".")){
                continue;
            }
            if(dir.equals("..")) {
                if(!dirs.isEmpty()){
                    dirs.remove(dirs.size()-1);
                }
            }
            else {
                dirs.add(dir);
            }
        }
        return "/" + String.join("/", dirs);
    }
}
