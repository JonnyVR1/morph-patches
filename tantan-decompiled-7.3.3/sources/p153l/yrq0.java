package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.util.Base64;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: loaded from: classes2.dex */
public class yrq0 implements ysl {

    /* JADX INFO: renamed from: a */
    protected Context f201351a;

    /* JADX INFO: renamed from: b */
    private HashMap<String, ArrayList<xrq0>> f201352b;

    public yrq0(Context context) {
        m217229f(context);
    }

    /* JADX INFO: renamed from: d */
    public static String m217222d(xrq0 xrq0Var) {
        return String.valueOf(xrq0Var.f195947a);
    }

    /* JADX INFO: renamed from: e */
    private List<String> m217223e(String str) throws Throwable {
        ArrayList arrayList = new ArrayList();
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        FileInputStream fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(new File(str));
                while (true) {
                    try {
                        int i = fileInputStream2.read(bArr);
                        if (i == -1) {
                            break;
                        }
                        if (i == 4) {
                            if (p6r0.m170921a(bArr) == -573785174) {
                                int i2 = fileInputStream2.read(bArr2);
                                if (i2 == -1) {
                                    break;
                                }
                                if (i2 != 4) {
                                    ouq0.m169378B("eventData read from cache file failed cause lengthBuffer error");
                                    break;
                                }
                                int iM170921a = p6r0.m170921a(bArr2);
                                if (iM170921a < 1 || iM170921a > 4096) {
                                    ouq0.m169378B("eventData read from cache file failed cause lengthBuffer < 1 || lengthBuffer > 4K");
                                    break;
                                }
                                byte[] bArr3 = new byte[iM170921a];
                                if (fileInputStream2.read(bArr3) != iM170921a) {
                                    ouq0.m169378B("eventData read from cache file failed cause buffer size not equal length");
                                    break;
                                }
                                String strM217231m = m217231m(bArr3);
                                if (!TextUtils.isEmpty(strM217231m)) {
                                    arrayList.add(strM217231m);
                                }
                            } else {
                                ouq0.m169378B("eventData read from cache file failed because magicNumber error");
                                break;
                            }
                        } else {
                            ouq0.m169378B("eventData read from cache file failed because magicNumber error");
                            break;
                        }
                    } catch (Exception e) {
                        e = e;
                        fileInputStream = fileInputStream2;
                        ouq0.m169397q(e);
                        j6r0.m143691b(fileInputStream);
                        return arrayList;
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        j6r0.m143691b(fileInputStream);
                        throw th;
                    }
                }
                j6r0.m143691b(fileInputStream2);
                return arrayList;
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: g */
    private void m217224g(RandomAccessFile randomAccessFile, FileLock fileLock) {
        if (fileLock != null && fileLock.isValid()) {
            try {
                fileLock.release();
            } catch (IOException e) {
                ouq0.m169397q(e);
            }
        }
        j6r0.m143691b(randomAccessFile);
    }

    /* JADX INFO: renamed from: h */
    private void m217225h(String str, String str2) {
        y3f y3fVarM122277e = erq0.m122263f(this.f201351a).m122277e(5001, "24:" + str + Constants.SEPARATOR_COMMA + str2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(y3fVarM122277e.mo131534d());
        mo178825i(arrayList);
    }

    /* JADX INFO: renamed from: k */
    private xrq0[] m217226k(xrq0[] xrq0VarArr) throws Throwable {
        FileLock fileLockLock;
        RandomAccessFile randomAccessFile;
        BufferedOutputStream bufferedOutputStream;
        String strM217227l = m217227l(xrq0VarArr[0]);
        BufferedOutputStream bufferedOutputStream2 = null;
        if (TextUtils.isEmpty(strM217227l)) {
            return null;
        }
        try {
            File file = new File(strM217227l + ".lock");
            j6r0.m143695f(file);
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                fileLockLock = randomAccessFile.getChannel().lock();
                try {
                    bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File(strM217227l), true));
                    try {
                        try {
                            int i = 0;
                            for (xrq0 xrq0Var : xrq0VarArr) {
                                if (xrq0Var != null) {
                                    byte[] bArrM217232n = m217232n(xrq0Var.mo131534d());
                                    if (bArrM217232n == null || bArrM217232n.length < 1 || bArrM217232n.length > 4096) {
                                        ouq0.m169378B("event data throw a invalid item ");
                                    } else {
                                        if (!lvq0.m156003d(this.f201351a, strM217227l)) {
                                            int length = xrq0VarArr.length - i;
                                            xrq0[] xrq0VarArr2 = new xrq0[length];
                                            System.arraycopy(xrq0VarArr, i, xrq0VarArr2, 0, length);
                                            j6r0.m143691b(bufferedOutputStream);
                                            m217224g(randomAccessFile, fileLockLock);
                                            return xrq0VarArr2;
                                        }
                                        bufferedOutputStream.write(p6r0.m170922b(-573785174));
                                        bufferedOutputStream.write(p6r0.m170922b(bArrM217232n.length));
                                        bufferedOutputStream.write(bArrM217232n);
                                        bufferedOutputStream.flush();
                                        i++;
                                    }
                                }
                            }
                        } catch (Exception e) {
                            e = e;
                            ouq0.m169395o("event data write to cache file failed cause exception", e);
                        }
                    } catch (Throwable th) {
                        th = th;
                        bufferedOutputStream2 = bufferedOutputStream;
                        j6r0.m143691b(bufferedOutputStream2);
                        m217224g(randomAccessFile, fileLockLock);
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    bufferedOutputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    j6r0.m143691b(bufferedOutputStream2);
                    m217224g(randomAccessFile, fileLockLock);
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                fileLockLock = null;
                bufferedOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileLockLock = null;
            }
        } catch (Exception e4) {
            e = e4;
            fileLockLock = null;
            randomAccessFile = null;
            bufferedOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileLockLock = null;
            randomAccessFile = null;
        }
        j6r0.m143691b(bufferedOutputStream);
        m217224g(randomAccessFile, fileLockLock);
        return null;
    }

    /* JADX INFO: renamed from: l */
    private String m217227l(xrq0 xrq0Var) {
        File file = new File(this.f201351a.getFilesDir(), NotificationCompat.CATEGORY_EVENT);
        String str = file.getAbsolutePath() + File.separator + m217222d(xrq0Var);
        for (int i = 0; i < 100; i++) {
            String str2 = str + i;
            if (lvq0.m156003d(this.f201351a, str2)) {
                return str2;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0037 A[PHI: r2 r3 r4
      0x0037: PHI (r2v11 java.nio.channels.FileLock) = (r2v4 java.nio.channels.FileLock), (r2v2 java.nio.channels.FileLock), (r2v2 java.nio.channels.FileLock) binds: [B:68:0x010b, B:32:0x0092, B:19:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x0037: PHI (r3v15 java.io.RandomAccessFile) = (r3v4 java.io.RandomAccessFile), (r3v2 java.io.RandomAccessFile), (r3v2 java.io.RandomAccessFile) binds: [B:68:0x010b, B:32:0x0092, B:19:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x0037: PHI (r4v9 java.io.File) = (r4v3 java.io.File), (r4v1 java.io.File), (r4v1 java.io.File) binds: [B:68:0x010b, B:32:0x0092, B:19:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p153l.ewq0
    /* JADX INFO: renamed from: a */
    public void mo122959a() throws Throwable {
        lvq0.m156002c(this.f201351a, NotificationCompat.CATEGORY_EVENT, "eventUploading");
        File[] fileArrM156005f = lvq0.m156005f(this.f201351a, "eventUploading");
        if (fileArrM156005f == null || fileArrM156005f.length <= 0) {
            return;
        }
        FileLock fileLockLock = null;
        File file = null;
        RandomAccessFile randomAccessFile = null;
        for (File file2 : fileArrM156005f) {
            if (file2 == null) {
                if (fileLockLock != null && fileLockLock.isValid()) {
                    try {
                        fileLockLock.release();
                    } catch (IOException e) {
                        ouq0.m169397q(e);
                    }
                }
                j6r0.m143691b(randomAccessFile);
                if (file != null) {
                    file.delete();
                }
            } else {
                try {
                    try {
                        if (file2.length() > 5242880) {
                            ouq0.m169378B("eventData read from cache file failed because " + file2.getName() + " is too big, length " + file2.length());
                            m217225h(file2.getName(), Formatter.formatFileSize(this.f201351a, file2.length()));
                            file2.delete();
                            if (fileLockLock != null && fileLockLock.isValid()) {
                                try {
                                    fileLockLock.release();
                                } catch (IOException e2) {
                                    ouq0.m169397q(e2);
                                }
                            }
                            j6r0.m143691b(randomAccessFile);
                            if (file != null) {
                                file.delete();
                            }
                        } else {
                            String absolutePath = file2.getAbsolutePath();
                            File file3 = new File(absolutePath + ".lock");
                            try {
                                j6r0.m143695f(file3);
                                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file3, "rw");
                                try {
                                    fileLockLock = randomAccessFile2.getChannel().lock();
                                    mo178825i(m217223e(absolutePath));
                                    file2.delete();
                                    if (fileLockLock != null && fileLockLock.isValid()) {
                                        try {
                                            fileLockLock.release();
                                        } catch (IOException e3) {
                                            ouq0.m169397q(e3);
                                        }
                                    }
                                    j6r0.m143691b(randomAccessFile2);
                                    file3.delete();
                                    randomAccessFile = randomAccessFile2;
                                    file = file3;
                                } catch (Exception e4) {
                                    e = e4;
                                    randomAccessFile = randomAccessFile2;
                                    file = file3;
                                    ouq0.m169397q(e);
                                    if (fileLockLock != null && fileLockLock.isValid()) {
                                        try {
                                            fileLockLock.release();
                                        } catch (IOException e5) {
                                            ouq0.m169397q(e5);
                                        }
                                    }
                                    j6r0.m143691b(randomAccessFile);
                                    if (file != null) {
                                        file.delete();
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    randomAccessFile = randomAccessFile2;
                                    file = file3;
                                    if (fileLockLock != null && fileLockLock.isValid()) {
                                        try {
                                            fileLockLock.release();
                                        } catch (IOException e6) {
                                            ouq0.m169397q(e6);
                                        }
                                    }
                                    j6r0.m143691b(randomAccessFile);
                                    if (file == null) {
                                        throw th;
                                    }
                                    file.delete();
                                    throw th;
                                }
                            } catch (Exception e7) {
                                e = e7;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Exception e8) {
                    e = e8;
                }
            }
        }
    }

    @Override // p153l.uxq0
    /* JADX INFO: renamed from: b */
    public void mo183214b() throws Throwable {
        HashMap<String, ArrayList<xrq0>> map = this.f201352b;
        if (map == null) {
            return;
        }
        if (map.size() > 0) {
            Iterator<String> it = this.f201352b.keySet().iterator();
            while (it.hasNext()) {
                ArrayList<xrq0> arrayList = this.f201352b.get(it.next());
                if (arrayList != null && arrayList.size() > 0) {
                    xrq0[] xrq0VarArr = new xrq0[arrayList.size()];
                    arrayList.toArray(xrq0VarArr);
                    m217230j(xrq0VarArr);
                }
            }
        }
        this.f201352b.clear();
    }

    /* JADX INFO: renamed from: f */
    public void m217229f(Context context) {
        this.f201351a = context;
    }

    /* JADX INFO: renamed from: i */
    public void mo178825i(List<String> list) {
        throw null;
    }

    /* JADX INFO: renamed from: j */
    public void m217230j(xrq0[] xrq0VarArr) throws Throwable {
        if (xrq0VarArr == null || xrq0VarArr.length == 0 || xrq0VarArr[0] == null) {
            ouq0.m169393m("event data write to cache file failed because data null");
            return;
        }
        do {
            xrq0VarArr = m217226k(xrq0VarArr);
            if (xrq0VarArr == null || xrq0VarArr.length <= 0) {
                return;
            }
        } while (xrq0VarArr[0] != null);
    }

    /* JADX INFO: renamed from: m */
    public String m217231m(byte[] bArr) {
        byte[] bArrM156004e;
        if (bArr != null && bArr.length >= 1) {
            if (!erq0.m122263f(this.f201351a).m122276d().m198245f()) {
                return bvq0.m106598l(bArr);
            }
            String strM156001b = lvq0.m156001b(this.f201351a);
            if (!TextUtils.isEmpty(strM156001b) && (bArrM156004e = lvq0.m156004e(strM156001b)) != null && bArrM156004e.length > 0) {
                try {
                    return bvq0.m106598l(Base64.decode(g3r0.m128757b(bArrM156004e, bArr), 2));
                } catch (InvalidAlgorithmParameterException e) {
                    ouq0.m169397q(e);
                } catch (InvalidKeyException e2) {
                    ouq0.m169397q(e2);
                } catch (NoSuchAlgorithmException e3) {
                    ouq0.m169397q(e3);
                } catch (BadPaddingException e4) {
                    ouq0.m169397q(e4);
                } catch (IllegalBlockSizeException e5) {
                    ouq0.m169397q(e5);
                } catch (NoSuchPaddingException e6) {
                    ouq0.m169397q(e6);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public byte[] m217232n(String str) {
        byte[] bArrM156004e;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!erq0.m122263f(this.f201351a).m122276d().m198245f()) {
            return bvq0.m106596j(str);
        }
        String strM156001b = lvq0.m156001b(this.f201351a);
        byte[] bArrM106596j = bvq0.m106596j(str);
        if (!TextUtils.isEmpty(strM156001b) && bArrM106596j != null && bArrM106596j.length > 1 && (bArrM156004e = lvq0.m156004e(strM156001b)) != null) {
            try {
                if (bArrM156004e.length > 1) {
                    return g3r0.m128758c(bArrM156004e, Base64.encode(bArrM106596j, 2));
                }
            } catch (Exception e) {
                ouq0.m169397q(e);
            }
        }
        return null;
    }

    @Override // p153l.ysl
    /* JADX INFO: renamed from: b */
    public void mo217228b(HashMap<String, ArrayList<xrq0>> map) {
        this.f201352b = map;
    }

    @Override // p153l.uxq0
    /* JADX INFO: renamed from: a */
    public void mo183213a(xrq0 xrq0Var) {
        if ((xrq0Var instanceof y3f) && this.f201352b != null) {
            y3f y3fVar = (y3f) xrq0Var;
            String strM217222d = m217222d(y3fVar);
            ArrayList<xrq0> arrayList = this.f201352b.get(strM217222d);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            arrayList.add(y3fVar);
            this.f201352b.put(strM217222d, arrayList);
        }
    }
}
