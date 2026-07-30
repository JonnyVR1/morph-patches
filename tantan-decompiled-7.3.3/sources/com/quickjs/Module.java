package com.quickjs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public abstract class Module extends JSContext {
    public Module(QuickJS quickJS, long j) {
        super(quickJS, j);
    }

    public String convertModuleName(String str, String str2) {
        if (str2 != null && str2.length() != 0) {
            str2 = str2.replace("//", "/");
            if (str2.startsWith("./")) {
                str2 = str2.substring(2);
            }
            if (str2.charAt(0) != '/' && str != null && str.length() != 0) {
                String strReplace = str.replace("//", "/");
                if (strReplace.startsWith("./")) {
                    strReplace = strReplace.substring(2);
                }
                if (strReplace.equals("/")) {
                    return "/".concat(str2);
                }
                if (strReplace.endsWith("/")) {
                    return strReplace.concat(str2);
                }
                String[] strArrSplit = strReplace.split("/");
                String[] strArrSplit2 = str2.split("/");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                Collections.addAll(arrayList, strArrSplit);
                Collections.addAll(arrayList2, strArrSplit2);
                while (!arrayList2.isEmpty() && ((String) arrayList2.get(0)).equals("..")) {
                    arrayList2.remove(0);
                    arrayList.remove(arrayList.size() - 1);
                }
                if (!arrayList.isEmpty()) {
                    arrayList.remove(arrayList.size() - 1);
                }
                StringBuilder sb = new StringBuilder();
                if (strReplace.startsWith("/")) {
                    sb.append("/");
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    sb.append((String) it.next());
                    sb.append("/");
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    sb.append((String) it2.next());
                    sb.append("/");
                }
                sb.deleteCharAt(sb.length() - 1);
                return sb.toString();
            }
        }
        return str2;
    }

    public abstract String getModuleScript(String str);
}
