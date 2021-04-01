package com.fang.Test;

import com.fang.Utils.ConvertUtil;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class test {
    public static void main(String[] args) {
        // 文件的路径
//        String src = "E:\\eclipse-workspace1\\MSACode\\arcs20\\arcs-auth\\arcs-auth-server\\src\\main\\java\\com\\hundsun\\arcs\\auth\\util\\Util.java";
//        String src = "E:\\eclipse-workspace1\\MSACode\\arcs20\\arcs-auth\\arcs-auth-server\\src\\main\\java\\com\\hundsun\\arcs\\auth\\util\\Util.java";
//        String src ="E:\\eclipse-workspace1\\MSACode\\arcs20\\arcs-uf\\arcs-uf-api\\src\\main\\java\\com\\hundsun\\arcs\\uf\\bean\\UfUserLimit.java";
        String src = "E:\\eclipse-workspace1\\MSACode\\arcs20\\arcs-biz\\arcs-biz-app\\src\\main\\java\\com\\hundsun\\arcs\\biz\\ws\\Result.java";
        File file = new File(src);
        try {
            String js = FileUtils.readFileToString(file, "utf-8");
//            String js = "params.opBranchNo=8888;\n" +
//                    "\t\tparams.operatorNo=\"8802\";\n" +
//                    "\t\tparams.userType=\"1\";  \n" +
//                    "\t\tparams.opPassword=\"{F#%')+-/\\\"\";\n" +
//                    "\t\tparams.opStation=\"1234567890\"; \n" +
//                    "\t\tparams.opEntrustWay=\"4\";";
            String str = ConvertUtil.lineToHump(js);
//            str = str.replace("public" ,"private");
//        String str = ConvertUtil.humpToLine(js);
            System.out.println(str);
//            System.out.println(js);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
