package p149l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.cosmos.mdlog.MDLog;
import com.immomo.mmutil.FileUtil;
import com.immomo.mmutil.log.Log4Android;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import immomo.com.mklibrary.core.NDKWrapper;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.Enumeration;
import java.util.Formatter;
import java.util.Iterator;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class mpj0 {

    /* JADX INFO: renamed from: a */
    private static final String f135065a = "mpj0";

    /* JADX INFO: renamed from: b */
    private static final String[] f135066b = {"../", "~/"};

    /* JADX INFO: renamed from: a */
    private static boolean m155812a(String str, Iterator<String> it, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str) || it == null || jSONObject == null) {
            return false;
        }
        while (it.hasNext()) {
            if (!m155814c(str, it.next(), jSONObject)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    private static boolean m155813b(String str) {
        File fileM217441l = z750.m217441l(str);
        if (!fileM217441l.exists()) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(FileUtil.m18411h(fileM217441l));
            return m155812a(str, jSONObject.keys(), jSONObject);
        } catch (Exception e) {
            mxv.m156927b(f135065a, "checkValidate 失败，读取校验文件失败");
            Log4Android.m18417f().m18422e(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m155814c(String str, String str2, JSONObject jSONObject) throws Throwable {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || jSONObject == null) {
            return false;
        }
        FileInputStream fileInputStream = null;
        try {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                String strOptString = jSONObject.optString(str2);
                File file = new File(str, str2);
                if (!TextUtils.isEmpty(strOptString) && file.exists()) {
                    byte[] bArr = new byte[ShareConstants.MD5_FILE_BUF_LENGTH];
                    FileInputStream fileInputStream2 = new FileInputStream(file);
                    while (true) {
                        try {
                            int i = fileInputStream2.read(bArr);
                            if (i <= 0) {
                                break;
                            }
                            messageDigest.update(bArr, 0, i);
                        } catch (Exception e) {
                            e = e;
                            fileInputStream = fileInputStream2;
                            e.printStackTrace();
                            syl.m186709b(fileInputStream);
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            fileInputStream = fileInputStream2;
                            syl.m186709b(fileInputStream);
                            throw th;
                        }
                    }
                    fileInputStream2.close();
                    byte[] bArrDigest = messageDigest.digest();
                    Formatter formatter = new Formatter();
                    for (byte b : bArrDigest) {
                        formatter.format("%02x", Byte.valueOf(b));
                    }
                    boolean zEquals = strOptString.equals(formatter.toString());
                    formatter.close();
                    syl.m186709b(fileInputStream2);
                    return zEquals;
                }
                syl.m186709b(null);
                return false;
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m155815d(String str, boolean z) throws Exception {
        System.currentTimeMillis();
        File fileM217441l = z750.m217441l(str);
        File fileM217438i = z ? z750.m217438i(str) : z750.m217440k(str);
        if (fileM217441l.exists() && fileM217438i.exists()) {
            byte[] bArrM18410g = FileUtil.m18410g(fileM217438i);
            if (z) {
                return c0f.m104749c(FileUtil.m18411h(fileM217441l), bArrM18410g, NDKWrapper.m86991b());
            }
            String strM217444o = z750.m217444o(fileM217441l);
            String strM104747a = c0f.m104747a(bArrM18410g, NDKWrapper.m86990a());
            if (strM104747a != null && strM104747a.equals(strM217444o)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m155816e(String str, File file, String str2, uhj uhjVar) {
        return m155817f(str, file, str2, false, uhjVar);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m155817f(String str, File file, String str2, boolean z, uhj uhjVar) {
        return file.getName().endsWith(".7z") ? immomo.com.mklibrary.core.utils.FileUtil.m87160w(file, str2) : m155818g(str, file.getAbsolutePath(), str2, z, uhjVar);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m155818g(String str, String str2, String str3, boolean z, uhj uhjVar) {
        try {
            m155820i(str, str2, str3, z, uhjVar);
            return true;
        } catch (Exception e) {
            Log4Android.m18417f().m18422e(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: h */
    public static int m155819h(String str, xhw xhwVar, String str2, boolean z) throws Exception {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str3 = z ? "alpha-" : "";
        File fileM217435f = z750.m217435f(str3 + str, str2);
        if (!fileM217435f.exists()) {
            mxv.m156926a(f135065a, "tang--------下载的离线包不存在");
            return -1;
        }
        File fileM217442m = z750.m217442m(ohw.f144066m + str3 + str);
        if (!fileM217442m.exists()) {
            fileM217442m.mkdirs();
        }
        String absolutePath = fileM217442m.getAbsolutePath();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        boolean zM155816e = m155816e("", fileM217435f, absolutePath, null);
        if (!zM155816e) {
            FileUtil.m18406c(fileM217442m);
            fileM217435f.delete();
            return -1;
        }
        if (xhwVar != null) {
            xhwVar.m208832A(System.currentTimeMillis() - jCurrentTimeMillis2);
        }
        String str4 = f135065a;
        mxv.m156926a(str4, "tang-------解压离线包耗时 " + (System.currentTimeMillis() - jCurrentTimeMillis2) + "   解压是否成功 " + zM155816e + "    " + fileM217442m.exists());
        v750 v750Var = new v750(str);
        v750Var.m197342h(absolutePath);
        v750Var.m197347m(yhw.m214862s().m214872u(str));
        long jM197340f = v750Var.m197340f();
        if (v750Var.f180303c == null) {
            FileUtil.m18406c(fileM217442m);
            fileM217435f.delete();
            return -2;
        }
        if (!m155822k(v750Var)) {
            mxv.m156926a(str4, "tang------离线包校验失败，删除临时离线包和临时解压包");
            FileUtil.m18406c(fileM217442m);
            fileM217435f.delete();
            return -2;
        }
        File fileM217437h = z750.m217437h(str3 + str);
        FileUtil.m18406c(fileM217437h);
        mxv.m156926a(str4, "tang-------删除旧包 " + fileM217437h.getAbsolutePath());
        fileM217442m.renameTo(fileM217437h);
        mxv.m156926a(str4, "tang-------重命名新的离线包 " + fileM217442m.getAbsolutePath() + "  ----> " + fileM217437h.getAbsolutePath());
        StringBuilder sb = new StringBuilder();
        sb.append(str3);
        sb.append(str);
        File fileM217433d = z750.m217433d(sb.toString(), jM197340f, str2);
        fileM217433d.delete();
        FileUtil.m18404a(fileM217435f, fileM217433d);
        z750.m217431b(str3 + str, jM197340f);
        fileM217435f.delete();
        mxv.m156926a(str4, "tang---------解压并且校验离线包耗时 " + (System.currentTimeMillis() - jCurrentTimeMillis));
        return 1;
    }

    /* JADX INFO: renamed from: i */
    public static void m155820i(String str, String str2, String str3, boolean z, uhj uhjVar) throws Exception {
        BufferedOutputStream bufferedOutputStream;
        Closeable closeable = null;
        try {
            ZipFile zipFile = new ZipFile(str2);
            try {
                int size = zipFile.size();
                Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                int i = 0;
                while (enumerationEntries.hasMoreElements()) {
                    if (uhjVar != null) {
                        i++;
                        uhjVar.mo182482b(str, 1, 0, size, i);
                    }
                    ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                    String name = zipEntryNextElement.getName();
                    if (!m155821j(name)) {
                        throw new IllegalArgumentException("unsecurity zipfile!");
                    }
                    InputStream inputStream = zipFile.getInputStream(zipEntryNextElement);
                    File file = new File(str3, name);
                    if (!zipEntryNextElement.isDirectory()) {
                        File file2 = new File(file.getParent());
                        if (!file2.exists()) {
                            file2.mkdirs();
                        }
                        if (z) {
                            File file3 = new File(file2, ".nomedia");
                            if (!file3.exists()) {
                                file3.createNewFile();
                            }
                        }
                        try {
                            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file), 4096);
                            try {
                                byte[] bArr = new byte[8192];
                                while (true) {
                                    int i2 = inputStream.read(bArr, 0, 4096);
                                    if (i2 == -1) {
                                        break;
                                    } else {
                                        bufferedOutputStream.write(bArr, 0, i2);
                                    }
                                }
                                bufferedOutputStream.flush();
                                try {
                                    syl.m186709b(inputStream);
                                    syl.m186709b(bufferedOutputStream);
                                    file.setLastModified(System.currentTimeMillis());
                                    closeable = bufferedOutputStream;
                                } catch (IOException e) {
                                    e = e;
                                    closeable = zipFile;
                                    try {
                                        MDLog.printErrStackTrace("MK", e);
                                        throw e;
                                    } catch (Throwable th) {
                                        th = th;
                                        new File(str3).setLastModified(System.currentTimeMillis());
                                        syl.m186708a(closeable, bufferedOutputStream);
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    closeable = zipFile;
                                    new File(str3).setLastModified(System.currentTimeMillis());
                                    syl.m186708a(closeable, bufferedOutputStream);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                closeable = bufferedOutputStream;
                                try {
                                    th.printStackTrace();
                                    throw th;
                                } catch (Throwable th4) {
                                    syl.m186709b(inputStream);
                                    syl.m186709b(closeable);
                                    throw th4;
                                }
                            }
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    } else if (!file.exists()) {
                        file.mkdirs();
                    }
                }
                new File(str3).setLastModified(System.currentTimeMillis());
                syl.m186708a(zipFile, closeable);
            } catch (IOException e2) {
                e = e2;
                bufferedOutputStream = null;
            } catch (Throwable th6) {
                th = th6;
                bufferedOutputStream = null;
            }
        } catch (IOException e3) {
            e = e3;
            bufferedOutputStream = null;
        } catch (Throwable th7) {
            th = th7;
            bufferedOutputStream = null;
        }
    }

    /* JADX INFO: renamed from: j */
    private static boolean m155821j(@NonNull String str) {
        for (String str2 : f135066b) {
            if (str.contains(str2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m155822k(v750 v750Var) throws Exception {
        String strM197337c = v750Var.m197337c();
        long jCurrentTimeMillis = System.currentTimeMillis();
        File file = v750Var.f180305e;
        h460 h460Var = v750Var.f180303c;
        if (!file.exists() || h460Var == null) {
            return false;
        }
        boolean zM155815d = m155815d(strM197337c, v750Var.m197344j());
        MDLog.m7390d("webRsa", "Bid: %s, verify result : %s, needAsymEncyrpt: %s", v750Var.f180301a, Boolean.valueOf(zM155815d), Boolean.valueOf(v750Var.m197344j()));
        if (!zM155815d) {
            return false;
        }
        boolean zM155813b = m155813b(strM197337c);
        mxv.m156926a(f135065a, "tang-------------------校验整个离线包耗时 " + (System.currentTimeMillis() - jCurrentTimeMillis) + "     path " + strM197337c);
        return zM155813b;
    }
}
