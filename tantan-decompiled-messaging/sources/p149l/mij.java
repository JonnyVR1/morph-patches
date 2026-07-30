package p149l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.cosmos.mdlog.MDLog;
import com.immomo.mmutil.FileUtil;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class mij {
    /* JADX INFO: renamed from: a */
    public static File m154673a(String str, kij kijVar) {
        File fileM154675c = m154675c(str, kijVar.f123351g);
        if (!TextUtils.isEmpty(kijVar.f123345a)) {
            fileM154675c = new File(fileM154675c, kijVar.f123345a);
        }
        if (!fileM154675c.exists()) {
            fileM154675c.mkdirs();
        }
        return fileM154675c;
    }

    /* JADX INFO: renamed from: b */
    public static File m154674b(String str) {
        return m154675c(str, false);
    }

    /* JADX INFO: renamed from: c */
    public static File m154675c(String str, boolean z) {
        if (!z) {
            return z750.m217437h(str);
        }
        File fileM164464b = ohw.m164464b();
        if (fileM164464b != null) {
            return new File(fileM164464b, str);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static File m154676d(String str, String str2) {
        File file = new File(str + File.separator + m154678f(str2));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX INFO: renamed from: e */
    public static File m154677e(String str, File file) {
        String name = file.getName();
        return new File(m154676d(str, name), name);
    }

    /* JADX INFO: renamed from: f */
    public static String m154678f(String str) {
        return str.substring(0, 2) + File.separator + str.substring(2, 4);
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    private static ArrayList<String> m154679g(File file) {
        File file2 = new File(file, "record.ini");
        if (!file2.exists()) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            String strM18411h = FileUtil.m18411h(file2);
            if (!TextUtils.isEmpty(strM18411h)) {
                arrayList.addAll(Arrays.asList(strM18411h.split(SignParameters.NEW_LINE)));
            }
            return arrayList;
        } catch (Throwable th) {
            MDLog.printErrStackTrace("GameResourceFileUtils", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    private static ArrayList<String> m154680h(String str, kij kijVar) {
        return m154679g(m154673a(str, kijVar));
    }

    /* JADX INFO: renamed from: i */
    public static String m154681i(String str) {
        int iLastIndexOf = str.lastIndexOf("/");
        if (iLastIndexOf >= 0) {
            return str.substring(iLastIndexOf + 1);
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m154682j(String str, kij kijVar) {
        String strM154681i = m154681i(kijVar.f123346b);
        if (TextUtils.isEmpty(strM154681i)) {
            return true;
        }
        ArrayList<String> arrayListM154680h = m154680h(str, kijVar);
        if (arrayListM154680h == null) {
            return false;
        }
        return arrayListM154680h.contains(strM154681i);
    }

    /* JADX INFO: renamed from: k */
    public static void m154683k(String str, kij kijVar) throws Throwable {
        File file = new File(m154673a(str, kijVar), "record.ini");
        ArrayList arrayList = new ArrayList();
        ArrayList<String> arrayListM154680h = m154680h(str, kijVar);
        if (arrayListM154680h != null) {
            arrayList.addAll(arrayListM154680h);
        }
        arrayList.add(m154681i(kijVar.f123346b));
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append('\n');
        }
        try {
            FileUtil.m18414k(file, sb.toString());
        } catch (IOException e) {
            MDLog.printErrStackTrace("GameResourceFileUtils", e);
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m154684l(String str, kij kijVar, boolean z) throws Throwable {
        File file = new File(m154673a(str, kijVar), "record.ini");
        if (!z) {
            str = "#";
        }
        try {
            FileUtil.m18414k(file, str);
        } catch (IOException e) {
            MDLog.printErrStackTrace("GameResourceFileUtils", e);
        }
    }
}
