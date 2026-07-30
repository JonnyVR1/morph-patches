package tech.sud.logger;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
import android.util.ArrayMap;
import android.util.Log;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Formatter;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import p149l.idg0;
import p149l.sdg0;
import p149l.smg0;
import p149l.wgg0;
import tech.sud.base.utils.Utils;
import tech.sud.base.utils.UtilsBridge;

/* JADX INFO: loaded from: classes3.dex */
public final class LogUtils {

    /* JADX INFO: renamed from: A */
    public static final int f207528A = 7;

    /* JADX INFO: renamed from: D */
    public static final int f207529D = 3;

    /* JADX INFO: renamed from: E */
    public static final int f207530E = 6;

    /* JADX INFO: renamed from: I */
    public static final int f207531I = 4;
    public static boolean Sudint = false;
    public static SimpleDateFormat Sudnew = null;

    /* JADX INFO: renamed from: V */
    public static final int f207532V = 2;

    /* JADX INFO: renamed from: W */
    public static final int f207533W = 5;

    /* JADX INFO: renamed from: Suddo, reason: collision with root package name */
    public static final char[] f210126Suddo = {'V', 'D', 'I', 'W', 'E', 'A'};

    /* JADX INFO: renamed from: Sudif, reason: collision with root package name */
    public static final String f210127Sudif = System.getProperty("file.separator");
    public static final String LINE_SEP = System.getProperty("line.separator");
    public static final Sudcase Sudfor = new Sudcase();
    public static final int Sudtry = Process.myPid();
    public static final ExecutorService Sudbyte = Executors.newSingleThreadExecutor();
    public static final ArrayMap Sudcase = new ArrayMap();

    static {
        Suddo();
    }

    public static void Suddo(String str, String str2, boolean z) throws BadPaddingException, InvalidKeySpecException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        byte[] bArrDoFinal;
        if (Sudfor.Sudelse) {
            if (z) {
                HashMap map = smg0.f165343a;
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
                keyGenerator.init(256);
                byte[] encoded = keyGenerator.generateKey().getEncoded();
                wgg0 wgg0Var = new wgg0();
                wgg0Var.f186193a = encoded;
                smg0.f165343a.put(str, wgg0Var);
                int length = encoded.length;
                byte[] bArr = new byte[length];
                for (int i = 0; i < length; i++) {
                    byte b = encoded[i];
                    bArr[i] = b;
                    bArr[i] = (byte) (b ^ 2);
                }
                String strM183492a = sdg0.m183492a(bArr);
                SharedPreferences.Editor editorEdit = idg0.m135446a().f112553a.edit();
                editorEdit.putString("key_aes_key_prefix_" + str, strM183492a);
                editorEdit.commit();
                PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(sdg0.m183493b("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA84624QluMte2OQf27WRmq4q3nVjVCQX0o+2lZm3ktKHG2PZf5AjxjZiCuNjqfWSo1gJDsyJZC4FSubhhjDSXrPcJRKS6lXt5DKuhABWWqgkUhcJX3/loigHG4Abyi/+b0NkKPaqTbJ64j9jylyXvO6fj1TMmOw+5zJ/6rV0FMVHosyTUX0zTCt6T5OooGiSt+wCvxlj1IT6vqJ4k8EyM6zYhPzQMK7xZniUyYfdl4OeS9NMT1wW62scuEQ5y2VVeHxFSeauGw9CaQLMIjZl2yj87N8gEtsRj5+hQWmG2kEQOZMv9jRwLGpsH0JoBdJwiThf0fYdB3T1jtgL5eyUnewIDAQAB")));
                if (encoded.length == 0) {
                    bArrDoFinal = null;
                } else {
                    Cipher cipher = Cipher.getInstance("RSA/None/PKCS1Padding");
                    cipher.init(1, publicKeyGeneratePublic);
                    bArrDoFinal = cipher.doFinal(encoded);
                }
                String str3 = sdg0.m183492a(bArrDoFinal) + LINE_SEP;
                Sudfor.getClass();
                UtilsBridge.writeFileFromString(str, str3, true);
            }
            str2 = smg0.m184949a(str, str2) + LINE_SEP;
        }
        Sudfor.getClass();
        UtilsBridge.writeFileFromString(str, str2, true);
    }

    public static void Sudif(String str, String str2) {
        File[] fileArrListFiles;
        Sudcase sudcase = Sudfor;
        if (sudcase.Sudbyte > 0 && (fileArrListFiles = new File(str).getParentFile().listFiles(new Sudtry())) != null && fileArrListFiles.length > 0) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy_MM_dd", Locale.US);
            try {
                long time = simpleDateFormat.parse(str2).getTime() - (((long) sudcase.Sudbyte) * 86400000);
                for (File file : fileArrListFiles) {
                    String name = file.getName();
                    name.getClass();
                    Matcher matcher = Pattern.compile("[0-9]{4}_[0-9]{2}_[0-9]{2}").matcher(name);
                    if (simpleDateFormat.parse(matcher.find() ? matcher.group() : "").getTime() <= time) {
                        Sudbyte.execute(new Sudbyte(file));
                    }
                }
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m221575a(Object... objArr) {
        Sudfor.getClass();
        UtilsBridge.isSpace("");
        log(7, "", objArr);
    }

    public static void aTag(String str, Object... objArr) {
        log(7, str, objArr);
    }

    public static String buildField(String str, Object obj) {
        return "  " + str + "：" + obj;
    }

    /* JADX INFO: renamed from: d */
    public static void m221576d(Object... objArr) {
        Sudfor.getClass();
        UtilsBridge.isSpace("");
        log(3, "", objArr);
    }

    public static void dTag(String str, Object... objArr) {
        log(3, str, objArr);
    }

    /* JADX INFO: renamed from: e */
    public static void m221577e(Object... objArr) {
        Sudfor.getClass();
        UtilsBridge.isSpace("");
        log(6, "", objArr);
    }

    public static void eTag(String str, Object... objArr) {
        log(6, str, objArr);
    }

    public static void file(Object obj) {
        Sudfor.getClass();
        UtilsBridge.isSpace("");
        log(19, "", obj);
    }

    public static Sudcase getConfig() {
        return Sudfor;
    }

    public static String getErrorInfo(Throwable th) {
        if (th == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        for (Throwable cause = th.getCause(); cause != null; cause = cause.getCause()) {
            cause.printStackTrace(printWriter);
        }
        printWriter.close();
        stringBuffer.append(stringWriter.toString());
        stringBuffer.append(SignParameters.NEW_LINE + Log.getStackTraceString(th));
        return stringBuffer.toString();
    }

    public static String getLogDirPath(Context context) {
        if (context == null) {
            return null;
        }
        File filesDir = (!UtilsBridge.isSDCardEnableByEnvironment() || context.getExternalFilesDir(null) == null) ? context.getFilesDir() : context.getExternalFilesDir(null);
        if (filesDir == null) {
            return null;
        }
        return filesDir.getAbsolutePath() + File.separator + "SudMGPLogs";
    }

    public static List<File> getLogFiles() {
        Sudcase sudcase = Sudfor;
        String str = sudcase.f210131Sudif;
        if (str == null) {
            str = sudcase.f210130Suddo;
        }
        File file = new File(str);
        if (!file.exists()) {
            return new ArrayList();
        }
        File[] fileArrListFiles = file.listFiles(new Sudif());
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, fileArrListFiles);
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    public static void m221578i(Object... objArr) {
        Sudfor.getClass();
        UtilsBridge.isSpace("");
        log(4, "", objArr);
    }

    public static void iTag(String str, Object... objArr) {
        log(4, str, objArr);
    }

    public static void json(Object obj) {
        Sudfor.getClass();
        UtilsBridge.isSpace("");
        log(35, "", obj);
    }

    public static void log(int i, String str, Object... objArr) {
        Sudelse sudelse;
        String str2;
        String strSubstring;
        if (!Sudint) {
            Suddo();
        }
        Sudcase sudcase = Sudfor;
        sudcase.getClass();
        int i2 = i & 15;
        int i3 = i & 240;
        if (sudcase.Sudint || i3 == 16) {
            if (i2 >= 2 || i2 >= 2) {
                StackTraceElement[] stackTrace = new Throwable().getStackTrace();
                if (stackTrace == null || stackTrace.length == 0) {
                    sudelse = new Sudelse(str, ": ", null);
                } else if (3 >= stackTrace.length) {
                    String strSuddo = Suddo(stackTrace[stackTrace.length - 1]);
                    if (UtilsBridge.isSpace(str)) {
                        int iIndexOf = strSuddo.indexOf(46);
                        if (iIndexOf != -1) {
                            strSuddo = strSuddo.substring(0, iIndexOf);
                        }
                    } else {
                        strSuddo = str;
                    }
                    sudelse = new Sudelse(strSuddo, ": ", null);
                } else {
                    StackTraceElement stackTraceElement = stackTrace[3];
                    String strSuddo2 = Suddo(stackTraceElement);
                    if (UtilsBridge.isSpace(str)) {
                        int iIndexOf2 = strSuddo2.indexOf(46);
                        strSubstring = iIndexOf2 == -1 ? strSuddo2 : strSuddo2.substring(0, iIndexOf2);
                    } else {
                        strSubstring = str;
                    }
                    if (sudcase.Sudnew) {
                        String string = new Formatter().format("%s, %s.%s(%s:%d)", Thread.currentThread().getName(), stackTraceElement.getClassName(), stackTraceElement.getMethodName(), strSuddo2, Integer.valueOf(stackTraceElement.getLineNumber())).toString();
                        sudelse = new Sudelse(strSubstring, " [" + string + "]: ", new String[]{string});
                    } else {
                        sudelse = new Sudelse(strSubstring, ": ", null);
                    }
                }
                String string2 = "null";
                if (objArr != null) {
                    if (objArr.length == 1) {
                        Object obj = objArr[0];
                        if (obj != null) {
                            string2 = i3 == 32 ? Sudchar.Suddo(32, obj) : i3 == 48 ? Sudchar.Suddo(48, obj) : Suddo(obj);
                        }
                    } else {
                        StringBuilder sb = new StringBuilder();
                        int length = objArr.length;
                        for (int i4 = 0; i4 < length; i4++) {
                            Object obj2 = objArr[i4];
                            sb.append("args[");
                            sb.append(i4);
                            sb.append("] = ");
                            sb.append(Suddo(obj2));
                            sb.append(LINE_SEP);
                        }
                        string2 = sb.toString();
                    }
                }
                if (string2.length() == 0) {
                    string2 = "log nothing";
                }
                Sudcase sudcase2 = Sudfor;
                if (!sudcase2.Sudint || i3 == 16 || i2 < 2) {
                    str2 = string2;
                } else {
                    String str3 = sudelse.f210134Suddo;
                    String[] strArr = sudelse.f210135Sudif;
                    StringBuilder sb2 = new StringBuilder();
                    if (sudcase2.Sudtry) {
                        sb2.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                        String str4 = LINE_SEP;
                        sb2.append(str4);
                        sb2.append("┌────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
                        sb2.append(str4);
                        if (strArr != null) {
                            for (String str5 : strArr) {
                                sb2.append("│ ");
                                sb2.append(str5);
                                sb2.append(LINE_SEP);
                            }
                            sb2.append("├┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄");
                            sb2.append(LINE_SEP);
                        }
                        for (String str6 : string2.split(LINE_SEP)) {
                            sb2.append("│ ");
                            sb2.append(str6);
                            sb2.append(LINE_SEP);
                        }
                        sb2.append("└────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
                    } else {
                        if (strArr != null) {
                            sb2.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                            sb2.append(LINE_SEP);
                            for (String str7 : strArr) {
                                sb2.append(str7);
                                sb2.append(LINE_SEP);
                            }
                        }
                        sb2.append(string2);
                    }
                    String string3 = sb2.toString();
                    int length2 = string3.length();
                    boolean z = Sudfor.Sudtry;
                    int i5 = z ? (length2 - 113) / 1100 : length2 / 1100;
                    if (i5 <= 0) {
                        str2 = string2;
                        Log.println(i2, str3, string3);
                    } else if (z) {
                        Log.println(i2, str3, string3.substring(0, 1100) + LINE_SEP + "└────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
                        int i6 = 1100;
                        int i7 = 1;
                        while (i7 < i5) {
                            StringBuilder sb3 = new StringBuilder(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                            String str8 = LINE_SEP;
                            sb3.append(str8);
                            sb3.append("┌────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
                            sb3.append(str8);
                            sb3.append("│ ");
                            String str9 = string2;
                            int i8 = i6 + 1100;
                            sb3.append(string3.substring(i6, i8));
                            sb3.append(str8);
                            sb3.append("└────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
                            Log.println(i2, str3, sb3.toString());
                            Sudfor.getClass();
                            i7++;
                            i6 = i8;
                            string2 = str9;
                        }
                        str2 = string2;
                        if (i6 != length2 - 113) {
                            StringBuilder sb4 = new StringBuilder(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                            String str10 = LINE_SEP;
                            sb4.append(str10);
                            sb4.append("┌────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
                            sb4.append(str10);
                            sb4.append("│ ");
                            sb4.append(string3.substring(i6, length2));
                            Log.println(i2, str3, sb4.toString());
                            Sudfor.getClass();
                        }
                    } else {
                        str2 = string2;
                        Log.println(i2, str3, string3.substring(0, 1100));
                        int i9 = 1100;
                        int i10 = 1;
                        while (i10 < i5) {
                            StringBuilder sb5 = new StringBuilder(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                            sb5.append(LINE_SEP);
                            int i11 = i9 + 1100;
                            sb5.append(string3.substring(i9, i11));
                            Log.println(i2, str3, sb5.toString());
                            Sudfor.getClass();
                            i10++;
                            i9 = i11;
                        }
                        if (i9 != length2) {
                            Log.println(i2, str3, MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + LINE_SEP + string3.substring(i9, length2));
                            Sudfor.getClass();
                        }
                    }
                }
                Sudfor.getClass();
                if (i3 != 16 || i2 < 2) {
                    return;
                }
                Thread threadCurrentThread = Thread.currentThread();
                Sudbyte.execute(new Suddo(i2, sudelse, str2, threadCurrentThread.getId(), threadCurrentThread.getName()));
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m221579v(Object... objArr) {
        Sudfor.getClass();
        UtilsBridge.isSpace("");
        log(2, "", objArr);
    }

    public static void vTag(String str, Object... objArr) {
        log(2, str, objArr);
    }

    /* JADX INFO: renamed from: w */
    public static void m221580w(Object... objArr) {
        Sudfor.getClass();
        UtilsBridge.isSpace("");
        log(5, "", objArr);
    }

    public static void wTag(String str, Object... objArr) {
        log(5, str, objArr);
    }

    public static void xml(String str) {
        Sudfor.getClass();
        UtilsBridge.isSpace("");
        log(51, "", str);
    }

    public static void file(int i, Object obj) {
        Sudfor.getClass();
        UtilsBridge.isSpace("");
        log(i | 16, "", obj);
    }

    public static void json(int i, Object obj) {
        Sudfor.getClass();
        UtilsBridge.isSpace("");
        log(i | 32, "", obj);
    }

    public static void xml(int i, String str) {
        Sudfor.getClass();
        UtilsBridge.isSpace("");
        log(i | 48, "", str);
    }

    public static void file(String str, Object obj) {
        log(19, str, obj);
    }

    public static void json(String str, Object obj) {
        log(35, str, obj);
    }

    public static void xml(String str, String str2) {
        log(51, str, str2);
    }

    public static void file(int i, String str, Object obj) {
        log(i | 16, str, obj);
    }

    public static void json(int i, String str, Object obj) {
        log(i | 32, str, obj);
    }

    public static void xml(int i, String str, String str2) {
        log(i | 48, str, str2);
    }

    public static String Suddo(Object obj) {
        String string;
        if (obj == null) {
            return "null";
        }
        ArrayMap arrayMap = Sudcase;
        if (!arrayMap.isEmpty()) {
            Class<?> cls = obj.getClass();
            if (cls.isAnonymousClass() || cls.isSynthetic()) {
                Type[] genericInterfaces = cls.getGenericInterfaces();
                if (genericInterfaces.length == 1) {
                    Type rawType = genericInterfaces[0];
                    while (rawType instanceof ParameterizedType) {
                        rawType = ((ParameterizedType) rawType).getRawType();
                    }
                    string = rawType.toString();
                } else {
                    Type genericSuperclass = cls.getGenericSuperclass();
                    while (genericSuperclass instanceof ParameterizedType) {
                        genericSuperclass = ((ParameterizedType) genericSuperclass).getRawType();
                    }
                    string = genericSuperclass.toString();
                }
                if (string.startsWith("class ")) {
                    string = string.substring(6);
                } else if (string.startsWith("interface ")) {
                    string = string.substring(10);
                }
                try {
                    cls = Class.forName(string);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
            if (arrayMap.get(cls) != null) {
                throw new ClassCastException();
            }
        }
        return Sudchar.Suddo(-1, obj);
    }

    public static boolean Suddo(String str, String str2) throws BadPaddingException, InvalidKeySpecException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        File file = new File(str);
        if (file.exists()) {
            return file.isFile();
        }
        boolean zCreateNewFile = false;
        if (!UtilsBridge.createOrExistsDir(file.getParentFile())) {
            return false;
        }
        try {
            Suddo(str);
            Sudif(str, str2);
            zCreateNewFile = file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (zCreateNewFile) {
            Sudcase sudcase = Sudfor;
            sudcase.f210129Sudchar.addFirst("Date of Log", str2);
            Suddo(str, sudcase.f210129Sudchar.toString(), true);
        }
        return zCreateNewFile;
    }

    public static void Suddo(String str) {
        File[] fileArrListFiles;
        int i = Sudfor.Sudlong;
        if (i >= 1 && (fileArrListFiles = new File(str).getParentFile().listFiles(new Sudfor())) != null && fileArrListFiles.length > 0 && fileArrListFiles.length >= i) {
            ArrayList arrayList = new ArrayList();
            for (File file : fileArrListFiles) {
                arrayList.add(file);
            }
            Collections.sort(arrayList, new Sudint());
            int size = arrayList.size() - i;
            for (int i2 = 0; i2 < size; i2++) {
                Sudbyte.execute(new Sudnew((File) arrayList.get(i2)));
            }
        }
    }

    public static String Suddo(StackTraceElement stackTraceElement) {
        String fileName = stackTraceElement.getFileName();
        if (fileName != null) {
            return fileName;
        }
        String className = stackTraceElement.getClassName();
        String[] strArrSplit = className.split("\\.");
        if (strArrSplit.length > 0) {
            className = strArrSplit[strArrSplit.length - 1];
        }
        int iIndexOf = className.indexOf(36);
        if (iIndexOf != -1) {
            className = className.substring(0, iIndexOf);
        }
        return className.concat(".java");
    }

    public static void Suddo() {
        Sudcase config;
        Application app = Utils.getApp();
        if (app == null || (config = getConfig()) == null) {
            return;
        }
        config.Sudint = false;
        config.Sudbyte = 5;
        config.Sudnew = false;
        config.Sudtry = false;
        String logDirPath = getLogDirPath(app);
        if (UtilsBridge.isSpace(logDirPath)) {
            config.f210131Sudif = null;
        } else {
            String str = f210127Sudif;
            if (!logDirPath.endsWith(str)) {
                logDirPath = logDirPath + str;
            }
            config.f210131Sudif = logDirPath;
        }
        if (UtilsBridge.isSpace("SudMGP")) {
            config.Sudfor = "util";
        } else {
            config.Sudfor = "SudMGP";
        }
        config.Sudgoto = 20971520L;
        config.Sudlong = 4;
        Sudint = true;
    }
}
