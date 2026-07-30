package p153l;

import android.content.Context;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p135ec.Tnaf;

/* JADX INFO: loaded from: classes7.dex */
public class xgl {

    /* JADX INFO: renamed from: b */
    private static final String f194203b = riw.m181611a(new byte[]{85, 30, 82, 82, 17, 18, 111, 3, 67, 69, 14, 20});

    /* JADX INFO: renamed from: a */
    static StringBuilder f194202a = new StringBuilder();

    /* JADX INFO: renamed from: a */
    private static int m210900a(Object obj, String str) {
        Set setKeySet;
        try {
            Field declaredField = obj.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            setKeySet = ((HashMap) declaredField.get(obj)).keySet();
        } catch (Throwable unused) {
            setKeySet = null;
        }
        if (setKeySet == null || setKeySet.isEmpty()) {
            return 0;
        }
        try {
            Iterator it = setKeySet.iterator();
            int i = 0;
            while (it.hasNext()) {
                try {
                    String lowerCase = it.next().toString().toLowerCase(Locale.ROOT);
                    if (lowerCase.contains(riw.m181611a(new byte[]{89, 11, 92, 88, 12, 9})) || lowerCase.contains(riw.m181611a(new byte[]{88, 3, 93, 91, 14, 1, 66, 9, 68, 71})) || lowerCase.contains(riw.m181611a(new byte[]{71, 3, 92, 88, 12, 9}))) {
                        f194202a.append(lowerCase.split(riw.m181611a(new byte[]{19, 3, 73, 86, 2, 18}))[0] + riw.m181611a(new byte[]{20, 66}));
                        if (i == 0 || i == 3) {
                            i++;
                        }
                    }
                } catch (Throwable unused2) {
                }
            }
            return i;
        } catch (Throwable unused3) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m210901b(Context context) {
        String str = context.getApplicationInfo().dataDir;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(File.separator);
        sb.append(riw.m181611a(new byte[]{30, 72}));
        return new File(sb.toString()).canRead() ? 1 : 0;
    }

    /* JADX INFO: renamed from: c */
    public static String m210902c() throws Exception {
        ArrayList arrayList = new ArrayList();
        String[] strArr = {riw.m181611a(new byte[]{66, 3, 31, 81, 19, 15, 84, 7, 31, 68, 4, 20, 70, 3, 67}), riw.m181611a(new byte[]{83, 9, 92, 25, Tnaf.POW_2_WIDTH, 15, 88, 9, 94, 25, 12, 7, 87, 15, 82})};
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(riw.m181611a(new byte[]{31, 22, 67, 88, 2, 73, 67, 3, 93, 81, 78, 11, 81, 22, 66})));
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        for (int i = 0; i < 2; i++) {
                            String str = strArr[i];
                            if (line.contains(str)) {
                                arrayList.add(str);
                            }
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
                            fileInputStream.close();
                        } catch (Throwable th5) {
                            th.addSuppressed(th5);
                        }
                        throw th4;
                    }
                }
                bufferedReader.close();
                fileInputStream.close();
            } catch (Throwable th6) {
                throw th6;
            }
        } catch (IOException e) {
            Log.e(riw.m181611a(new byte[]{100, 39, 118}), riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 83, 14, 84, 84, 10, 43, 81, 10, 88, 84, 8, 9, 69, 21, 120, 89, 11, 3, 83, 18, 11, 23}) + e);
        }
        return Arrays.toString((String[]) arrayList.toArray(new String[0]));
    }

    /* JADX INFO: renamed from: d */
    public static String m210903d(String[] strArr, String str) throws Exception {
        File file = new File(str);
        StringBuilder sb = new StringBuilder();
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        for (String str2 : strArr) {
                            if (line.contains(str2)) {
                                sb.append(line);
                                sb.append(riw.m181611a(new byte[]{19}));
                            }
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
                            fileInputStream.close();
                        } catch (Throwable th5) {
                            th.addSuppressed(th5);
                        }
                        throw th4;
                    }
                }
                bufferedReader.close();
                fileInputStream.close();
                return sb.toString();
            } catch (Throwable th6) {
                throw th6;
            }
        } catch (IOException e) {
            Log.e(riw.m181611a(new byte[]{100, 39, 118}), riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 83, 14, 84, 84, 10, 43, 81, 10, 88, 84, 8, 9, 69, 21, 120, 89, 11, 3, 83, 18, 11, 23}) + e + riw.m181611a(new byte[]{64, 7, 69, 95, 91, 70}) + str);
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m210904e(ClassLoader classLoader, Context context) {
        Object objNewInstance;
        f194202a = new StringBuilder();
        try {
            objNewInstance = classLoader.loadClass(riw.m181611a(new byte[]{84, 3, 31, 69, 14, 4, 70, 72, 80, 89, 5, 20, 95, 15, 85, 25, 25, 22, 95, 21, 84, 83, 79, 62, 64, 9, 66, 82, 5, 46, 85, 10, 65, 82, 19, 21})).newInstance();
        } catch (Throwable unused) {
            objNewInstance = null;
        }
        try {
            int iM210900a = m210900a(objNewInstance, riw.m181611a(new byte[]{86, 15, 84, 91, 5, 37, 81, 5, 89, 82}));
            if (iM210900a != 0) {
                return iM210900a;
            }
            int iM210900a2 = m210900a(objNewInstance, riw.m181611a(new byte[]{93, 3, 69, 95, 14, 2, 115, 7, 82, 95, 4}));
            if (iM210900a2 != 0) {
                return iM210900a2;
            }
            int iM210900a3 = m210900a(objNewInstance, riw.m181611a(new byte[]{83, 9, 95, 68, 21, 20, 69, 5, 69, 88, 19, 37, 81, 5, 89, 82}));
            if (iM210900a3 != 0) {
                return iM210900a3;
            }
            return 0;
        } catch (Throwable unused2) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m210905f() {
        try {
            return m210903d(new String[]{riw.m181611a(new byte[]{93, 7, 86, 94, 18, HttpTokens.CARRIAGE_RETURN})}, riw.m181611a(new byte[]{31, 22, 67, 88, 2, 73, 67, 3, 93, 81, 78, 11, 95, 19, 95, 67, 18}));
        } catch (Exception unused) {
            return f194203b;
        }
    }

    /* JADX INFO: renamed from: g */
    public static String m210906g() {
        return f194202a.toString();
    }
}
