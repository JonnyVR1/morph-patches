package p149l;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.eclipse.jetty.http.HttpTokens;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.spongycastle.math.p131ec.Tnaf;

/* JADX INFO: loaded from: classes7.dex */
public class bti0 {
    /* JADX INFO: renamed from: a */
    public static JSONArray m103845a(Object obj) throws JSONException {
        if (!obj.getClass().isArray()) {
            throw new JSONException(sgw.m184137a(new byte[]{126, 9, 69, 23, 0, 70, 64, 20, 88, 90, 8, 18, 89, Tnaf.POW_2_WIDTH, 84, 23, 5, 7, 68, 7, 11, 23}) + obj.getClass());
        }
        int length = Array.getLength(obj);
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < length; i++) {
            jSONArray.put(m103854j(Array.get(obj, i)));
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m103846b(String str) {
        File file = new File(str);
        if (file.exists() && file.isFile()) {
            return file.canRead();
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static JSONArray m103847c(Collection<?> collection) {
        JSONArray jSONArray = new JSONArray();
        if (collection != null) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                jSONArray.put(m103854j(it.next()));
            }
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: d */
    public static JSONObject m103848d(Map<?, ?> map) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw new NullPointerException(sgw.m184137a(new byte[]{91, 3, 72, 23, 92, 91, Tnaf.POW_2_WIDTH, 8, 68, 91, HttpTokens.CARRIAGE_RETURN}));
                }
                try {
                    jSONObject.put(str, m103854j(entry.getValue()));
                } catch (JSONException unused) {
                }
            }
        } catch (Exception unused2) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: e */
    public static List<String> m103849e(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            FileReader fileReader = new FileReader(str);
            try {
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            bufferedReader.close();
                            fileReader.close();
                            return arrayList;
                        }
                        if (!line.trim().isEmpty()) {
                            arrayList.add(line);
                        }
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable th3) {
                                th.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    }
                    try {
                        throw th;
                    } catch (Throwable th4) {
                        try {
                            fileReader.close();
                        } catch (Throwable th5) {
                            th.addSuppressed(th5);
                        }
                        throw th4;
                    }
                }
            } catch (Throwable th6) {
                throw th6;
            }
        } catch (IOException unused) {
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: f */
    public static <E> List<E> m103850f(List<E> list) {
        ArrayList arrayList = new ArrayList();
        for (E e : list) {
            if (!arrayList.contains(e)) {
                arrayList.add(e);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public static String m103851g(String str) {
        return str != null ? Pattern.compile(sgw.m184137a(new byte[]{57, 26, 60, 75, 107, 26, 108, 21, 27})).matcher(str).replaceAll("") : "";
    }

    /* JADX INFO: renamed from: h */
    public static String m103852h(String str) {
        return str.replaceAll(sgw.m184137a(new byte[]{108, 72}), sgw.m184137a(new byte[]{111}));
    }

    /* JADX INFO: renamed from: i */
    public static String m103853i(String str) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(str).getInputStream()));
            StringBuffer stringBuffer = new StringBuffer();
            char[] cArr = new char[1024];
            while (true) {
                int i = bufferedReader.read(cArr);
                if (i == -1) {
                    bufferedReader.close();
                    return stringBuffer.toString();
                }
                stringBuffer.append(cArr, 0, i);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: j */
    private static Object m103854j(Object obj) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject)) {
            return obj;
        }
        try {
            if (obj instanceof Collection) {
                return m103847c((Collection) obj);
            }
            if (obj.getClass().isArray()) {
                return m103845a(obj);
            }
            if (obj instanceof Map) {
                return m103848d((Map) obj);
            }
            if ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) {
                return obj;
            }
            if (obj.getClass().getPackage() == null || !obj.getClass().getPackage().getName().startsWith(sgw.m184137a(new byte[]{90, 7, 71, 86, 79}))) {
                return null;
            }
            return obj.toString();
        } catch (Exception unused) {
            return null;
        }
    }
}
