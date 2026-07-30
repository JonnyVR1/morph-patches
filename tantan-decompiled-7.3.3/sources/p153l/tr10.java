package p153l;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import androidx.multidex.MultiDexExtractor;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class tr10 {

    /* JADX INFO: renamed from: a */
    public static final Set<File> f175796a = new HashSet();

    /* JADX INFO: renamed from: b */
    public static final boolean f175797b = m192395m(System.getProperty("java.vm.version"));

    /* JADX INFO: renamed from: l.tr10$a */
    public static final class C20380a {
        /* JADX INFO: renamed from: a */
        public static void m192397a(ClassLoader classLoader, List<? extends File> list, File file) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, IOException, IllegalArgumentException, InvocationTargetException {
            IOException[] iOExceptionArr;
            Object obj = tr10.m192389g(classLoader, "pathList").get(classLoader);
            ArrayList<IOException> arrayList = new ArrayList();
            tr10.m192388f(obj, "dexElements", m192398b(obj, new ArrayList(list), file, arrayList));
            if (arrayList.size() > 0) {
                for (IOException iOException : arrayList) {
                }
                Field fieldM192389g = tr10.m192389g(obj, "dexElementsSuppressedExceptions");
                IOException[] iOExceptionArr2 = (IOException[]) fieldM192389g.get(obj);
                if (iOExceptionArr2 == null) {
                    iOExceptionArr = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
                } else {
                    IOException[] iOExceptionArr3 = new IOException[arrayList.size() + iOExceptionArr2.length];
                    arrayList.toArray(iOExceptionArr3);
                    System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList.size(), iOExceptionArr2.length);
                    iOExceptionArr = iOExceptionArr3;
                }
                fieldM192389g.set(obj, iOExceptionArr);
                IOException iOException2 = new IOException("I/O exception during makeDexElement");
                iOException2.initCause((Throwable) arrayList.get(0));
                throw iOException2;
            }
        }

        /* JADX INFO: renamed from: b */
        public static Object[] m192398b(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return (Object[]) tr10.m192390h(obj, "makeDexElements", ArrayList.class, File.class, ArrayList.class).invoke(obj, arrayList, file, arrayList2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m192386d(Context context) throws Exception {
        File file = new File(context.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            file.getPath();
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                file.getPath();
                return;
            }
            for (File file2 : fileArrListFiles) {
                file2.getPath();
                file2.length();
                if (file2.delete()) {
                    file2.getPath();
                } else {
                    file2.getPath();
                }
            }
            if (file.delete()) {
                file.getPath();
            } else {
                file.getPath();
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m192387e(Context context, File file, File file2, String str, String str2, boolean z) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InstantiationException, IOException, SecurityException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        Set<File> set = f175796a;
        synchronized (set) {
            try {
                if (set.contains(file)) {
                    return;
                }
                set.add(file);
                System.getProperty("java.vm.version");
                try {
                    ClassLoader classLoader = context.getClassLoader();
                    if (classLoader == null) {
                        Log.e("MultiDex", "Context class loader is null. Must be running in test mode. Skip patching.");
                        return;
                    }
                    try {
                        m192386d(context);
                    } catch (Throwable unused) {
                    }
                    File fileM192392j = m192392j(context, file2, str);
                    MultiDexExtractor multiDexExtractor = new MultiDexExtractor(file, fileM192392j);
                    try {
                        try {
                            m192394l(classLoader, fileM192392j, multiDexExtractor.m3191B(context, str2, false));
                        } catch (IOException e) {
                            if (!z) {
                                throw e;
                            }
                            m192394l(classLoader, fileM192392j, multiDexExtractor.m3191B(context, str2, true));
                        }
                        try {
                            multiDexExtractor.close();
                            e = null;
                        } catch (IOException e2) {
                            e = e2;
                        }
                        if (e != null) {
                            throw e;
                        }
                    } catch (Throwable th) {
                        try {
                            multiDexExtractor.close();
                        } catch (IOException unused2) {
                        }
                        throw th;
                    }
                } catch (RuntimeException unused3) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m192388f(Object obj, String str, Object[] objArr) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        Field fieldM192389g = m192389g(obj, str);
        Object[] objArr2 = (Object[]) fieldM192389g.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        fieldM192389g.set(obj, objArr3);
    }

    /* JADX INFO: renamed from: g */
    public static Field m192389g(Object obj, String str) throws NoSuchFieldException {
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new NoSuchFieldException("Field " + str + " not found in " + obj.getClass());
    }

    /* JADX INFO: renamed from: h */
    public static Method m192390h(Object obj, String str, Class<?>... clsArr) throws NoSuchMethodException {
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Method declaredMethod = superclass.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
            }
        }
        StringBuilder sb = new StringBuilder("Method ");
        sb.append(str);
        sb.append(" with parameters ");
        sb.append(Arrays.asList(clsArr));
        sr10.m187582a(sb, obj.getClass());
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static ApplicationInfo m192391i(Context context) {
        try {
            return context.getApplicationInfo();
        } catch (RuntimeException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public static File m192392j(Context context, File file, String str) throws IOException {
        File file2 = new File(file, "code_cache");
        try {
            m192396n(file2);
        } catch (IOException unused) {
            file2 = new File(context.getFilesDir(), "code_cache");
            m192396n(file2);
        }
        File file3 = new File(file2, str);
        m192396n(file3);
        return file3;
    }

    /* JADX INFO: renamed from: k */
    public static void m192393k(Context context) {
        if (f175797b) {
            return;
        }
        try {
            ApplicationInfo applicationInfoM192391i = m192391i(context);
            if (applicationInfoM192391i == null) {
                return;
            }
            m192387e(context, new File(applicationInfoM192391i.sourceDir), new File(applicationInfoM192391i.dataDir), "secondary-dexes", "", true);
        } catch (Exception e) {
            Log.e("MultiDex", "MultiDex installation failure", e);
            zzq0.m222278a("MultiDex installation failed (", e.getMessage(), ").");
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m192394l(ClassLoader classLoader, File file, List<? extends File> list) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InstantiationException, IOException, SecurityException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        if (list.isEmpty()) {
            return;
        }
        C20380a.m192397a(classLoader, list, file);
    }

    /* JADX INFO: renamed from: m */
    public static boolean m192395m(String str) {
        if (str == null) {
            return false;
        }
        Matcher matcher = Pattern.compile("(\\d+)\\.(\\d+)(\\.\\d+)?").matcher(str);
        if (!matcher.matches()) {
            return false;
        }
        try {
            int i = Integer.parseInt(matcher.group(1));
            return i > 2 || (i == 2 && Integer.parseInt(matcher.group(2)) >= 1);
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m192396n(File file) throws IOException {
        file.mkdir();
        if (file.isDirectory()) {
            return;
        }
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            Log.e("MultiDex", "Failed to create dir " + file.getPath() + ". Parent file is null.");
        } else {
            Log.e("MultiDex", "Failed to create dir " + file.getPath() + ". parent file is a dir " + parentFile.isDirectory() + ", a file " + parentFile.isFile() + ", exists " + parentFile.exists() + ", readable " + parentFile.canRead() + ", writable " + parentFile.canWrite());
        }
        rr10.m182681a("Failed to create directory ", file.getPath());
    }
}
