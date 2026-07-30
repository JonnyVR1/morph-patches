package p149l;

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
public class tiq0 implements mql {

    /* JADX INFO: renamed from: a */
    protected Context f170602a;

    /* JADX INFO: renamed from: b */
    private HashMap<String, ArrayList<siq0>> f170603b;

    public tiq0(Context context) {
        m189212f(context);
    }

    /* JADX INFO: renamed from: d */
    public static String m189206d(siq0 siq0Var) {
        return String.valueOf(siq0Var.f164730a);
    }

    /* JADX INFO: renamed from: e */
    private List<String> m189207e(String str) throws Throwable {
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
                            if (jxq0.m143820a(bArr) == -573785174) {
                                int i2 = fileInputStream2.read(bArr2);
                                if (i2 == -1) {
                                    break;
                                }
                                if (i2 != 4) {
                                    ilq0.m137025B("eventData read from cache file failed cause lengthBuffer error");
                                    break;
                                }
                                int iM143820a = jxq0.m143820a(bArr2);
                                if (iM143820a < 1 || iM143820a > 4096) {
                                    ilq0.m137025B("eventData read from cache file failed cause lengthBuffer < 1 || lengthBuffer > 4K");
                                    break;
                                }
                                byte[] bArr3 = new byte[iM143820a];
                                if (fileInputStream2.read(bArr3) != iM143820a) {
                                    ilq0.m137025B("eventData read from cache file failed cause buffer size not equal length");
                                    break;
                                }
                                String strM189214m = m189214m(bArr3);
                                if (!TextUtils.isEmpty(strM189214m)) {
                                    arrayList.add(strM189214m);
                                }
                            } else {
                                ilq0.m137025B("eventData read from cache file failed because magicNumber error");
                                break;
                            }
                        } else {
                            ilq0.m137025B("eventData read from cache file failed because magicNumber error");
                            break;
                        }
                    } catch (Exception e) {
                        e = e;
                        fileInputStream = fileInputStream2;
                        ilq0.m137044q(e);
                        dxq0.m114018b(fileInputStream);
                        return arrayList;
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        dxq0.m114018b(fileInputStream);
                        throw th;
                    }
                }
                dxq0.m114018b(fileInputStream2);
                return arrayList;
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: g */
    private void m189208g(RandomAccessFile randomAccessFile, FileLock fileLock) {
        if (fileLock != null && fileLock.isValid()) {
            try {
                fileLock.release();
            } catch (IOException e) {
                ilq0.m137044q(e);
            }
        }
        dxq0.m114018b(randomAccessFile);
    }

    /* JADX INFO: renamed from: h */
    private void m189209h(String str, String str2) {
        t2f t2fVarM218847e = zhq0.m218833f(this.f170602a).m218847e(5001, "24:" + str + Constants.SEPARATOR_COMMA + str2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(t2fVarM218847e.mo102164d());
        mo146956i(arrayList);
    }

    /* JADX INFO: renamed from: k */
    private siq0[] m189210k(siq0[] siq0VarArr) throws Throwable {
        FileLock fileLockLock;
        RandomAccessFile randomAccessFile;
        BufferedOutputStream bufferedOutputStream;
        String strM189211l = m189211l(siq0VarArr[0]);
        BufferedOutputStream bufferedOutputStream2 = null;
        if (TextUtils.isEmpty(strM189211l)) {
            return null;
        }
        try {
            File file = new File(strM189211l + ".lock");
            dxq0.m114022f(file);
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                fileLockLock = randomAccessFile.getChannel().lock();
                try {
                    bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File(strM189211l), true));
                    try {
                        try {
                            int i = 0;
                            for (siq0 siq0Var : siq0VarArr) {
                                if (siq0Var != null) {
                                    byte[] bArrM189215n = m189215n(siq0Var.mo102164d());
                                    if (bArrM189215n == null || bArrM189215n.length < 1 || bArrM189215n.length > 4096) {
                                        ilq0.m137025B("event data throw a invalid item ");
                                    } else {
                                        if (!fmq0.m122194d(this.f170602a, strM189211l)) {
                                            int length = siq0VarArr.length - i;
                                            siq0[] siq0VarArr2 = new siq0[length];
                                            System.arraycopy(siq0VarArr, i, siq0VarArr2, 0, length);
                                            dxq0.m114018b(bufferedOutputStream);
                                            m189208g(randomAccessFile, fileLockLock);
                                            return siq0VarArr2;
                                        }
                                        bufferedOutputStream.write(jxq0.m143821b(-573785174));
                                        bufferedOutputStream.write(jxq0.m143821b(bArrM189215n.length));
                                        bufferedOutputStream.write(bArrM189215n);
                                        bufferedOutputStream.flush();
                                        i++;
                                    }
                                }
                            }
                        } catch (Exception e) {
                            e = e;
                            ilq0.m137042o("event data write to cache file failed cause exception", e);
                        }
                    } catch (Throwable th) {
                        th = th;
                        bufferedOutputStream2 = bufferedOutputStream;
                        dxq0.m114018b(bufferedOutputStream2);
                        m189208g(randomAccessFile, fileLockLock);
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    bufferedOutputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    dxq0.m114018b(bufferedOutputStream2);
                    m189208g(randomAccessFile, fileLockLock);
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
        dxq0.m114018b(bufferedOutputStream);
        m189208g(randomAccessFile, fileLockLock);
        return null;
    }

    /* JADX INFO: renamed from: l */
    private String m189211l(siq0 siq0Var) {
        File file = new File(this.f170602a.getFilesDir(), NotificationCompat.CATEGORY_EVENT);
        String str = file.getAbsolutePath() + File.separator + m189206d(siq0Var);
        for (int i = 0; i < 100; i++) {
            String str2 = str + i;
            if (fmq0.m122194d(this.f170602a, str2)) {
                return str2;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0037 A[PHI: r2 r3 r4
      0x0037: PHI (r2v11 java.nio.channels.FileLock) = (r2v4 java.nio.channels.FileLock), (r2v2 java.nio.channels.FileLock), (r2v2 java.nio.channels.FileLock) binds: [B:68:0x010b, B:32:0x0092, B:19:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x0037: PHI (r3v15 java.io.RandomAccessFile) = (r3v4 java.io.RandomAccessFile), (r3v2 java.io.RandomAccessFile), (r3v2 java.io.RandomAccessFile) binds: [B:68:0x010b, B:32:0x0092, B:19:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x0037: PHI (r4v9 java.io.File) = (r4v3 java.io.File), (r4v1 java.io.File), (r4v1 java.io.File) binds: [B:68:0x010b, B:32:0x0092, B:19:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p149l.ymq0
    /* JADX INFO: renamed from: a */
    public void mo150541a() throws Throwable {
        fmq0.m122193c(this.f170602a, NotificationCompat.CATEGORY_EVENT, "eventUploading");
        File[] fileArrM122196f = fmq0.m122196f(this.f170602a, "eventUploading");
        if (fileArrM122196f == null || fileArrM122196f.length <= 0) {
            return;
        }
        FileLock fileLockLock = null;
        File file = null;
        RandomAccessFile randomAccessFile = null;
        for (File file2 : fileArrM122196f) {
            if (file2 == null) {
                if (fileLockLock != null && fileLockLock.isValid()) {
                    try {
                        fileLockLock.release();
                    } catch (IOException e) {
                        ilq0.m137044q(e);
                    }
                }
                dxq0.m114018b(randomAccessFile);
                if (file != null) {
                    file.delete();
                }
            } else {
                try {
                    try {
                        if (file2.length() > 5242880) {
                            ilq0.m137025B("eventData read from cache file failed because " + file2.getName() + " is too big, length " + file2.length());
                            m189209h(file2.getName(), Formatter.formatFileSize(this.f170602a, file2.length()));
                            file2.delete();
                            if (fileLockLock != null && fileLockLock.isValid()) {
                                try {
                                    fileLockLock.release();
                                } catch (IOException e2) {
                                    ilq0.m137044q(e2);
                                }
                            }
                            dxq0.m114018b(randomAccessFile);
                            if (file != null) {
                                file.delete();
                            }
                        } else {
                            String absolutePath = file2.getAbsolutePath();
                            File file3 = new File(absolutePath + ".lock");
                            try {
                                dxq0.m114022f(file3);
                                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file3, "rw");
                                try {
                                    fileLockLock = randomAccessFile2.getChannel().lock();
                                    mo146956i(m189207e(absolutePath));
                                    file2.delete();
                                    if (fileLockLock != null && fileLockLock.isValid()) {
                                        try {
                                            fileLockLock.release();
                                        } catch (IOException e3) {
                                            ilq0.m137044q(e3);
                                        }
                                    }
                                    dxq0.m114018b(randomAccessFile2);
                                    file3.delete();
                                    randomAccessFile = randomAccessFile2;
                                    file = file3;
                                } catch (Exception e4) {
                                    e = e4;
                                    randomAccessFile = randomAccessFile2;
                                    file = file3;
                                    ilq0.m137044q(e);
                                    if (fileLockLock != null && fileLockLock.isValid()) {
                                        try {
                                            fileLockLock.release();
                                        } catch (IOException e5) {
                                            ilq0.m137044q(e5);
                                        }
                                    }
                                    dxq0.m114018b(randomAccessFile);
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
                                            ilq0.m137044q(e6);
                                        }
                                    }
                                    dxq0.m114018b(randomAccessFile);
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

    @Override // p149l.ooq0
    /* JADX INFO: renamed from: b */
    public void mo150543b() throws Throwable {
        HashMap<String, ArrayList<siq0>> map = this.f170603b;
        if (map == null) {
            return;
        }
        if (map.size() > 0) {
            Iterator<String> it = this.f170603b.keySet().iterator();
            while (it.hasNext()) {
                ArrayList<siq0> arrayList = this.f170603b.get(it.next());
                if (arrayList != null && arrayList.size() > 0) {
                    siq0[] siq0VarArr = new siq0[arrayList.size()];
                    arrayList.toArray(siq0VarArr);
                    m189213j(siq0VarArr);
                }
            }
        }
        this.f170603b.clear();
    }

    /* JADX INFO: renamed from: f */
    public void m189212f(Context context) {
        this.f170602a = context;
    }

    /* JADX INFO: renamed from: i */
    public void mo146956i(List<String> list) {
        throw null;
    }

    /* JADX INFO: renamed from: j */
    public void m189213j(siq0[] siq0VarArr) throws Throwable {
        if (siq0VarArr == null || siq0VarArr.length == 0 || siq0VarArr[0] == null) {
            ilq0.m137040m("event data write to cache file failed because data null");
            return;
        }
        do {
            siq0VarArr = m189210k(siq0VarArr);
            if (siq0VarArr == null || siq0VarArr.length <= 0) {
                return;
            }
        } while (siq0VarArr[0] != null);
    }

    /* JADX INFO: renamed from: m */
    public String m189214m(byte[] bArr) {
        byte[] bArrM122195e;
        if (bArr != null && bArr.length >= 1) {
            if (!zhq0.m218833f(this.f170602a).m218846d().m176522f()) {
                return vlq0.m198849l(bArr);
            }
            String strM122192b = fmq0.m122192b(this.f170602a);
            if (!TextUtils.isEmpty(strM122192b) && (bArrM122195e = fmq0.m122195e(strM122192b)) != null && bArrM122195e.length > 0) {
                try {
                    return vlq0.m198849l(Base64.decode(auq0.m99035b(bArrM122195e, bArr), 2));
                } catch (InvalidAlgorithmParameterException e) {
                    ilq0.m137044q(e);
                } catch (InvalidKeyException e2) {
                    ilq0.m137044q(e2);
                } catch (NoSuchAlgorithmException e3) {
                    ilq0.m137044q(e3);
                } catch (BadPaddingException e4) {
                    ilq0.m137044q(e4);
                } catch (IllegalBlockSizeException e5) {
                    ilq0.m137044q(e5);
                } catch (NoSuchPaddingException e6) {
                    ilq0.m137044q(e6);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public byte[] m189215n(String str) {
        byte[] bArrM122195e;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!zhq0.m218833f(this.f170602a).m218846d().m176522f()) {
            return vlq0.m198847j(str);
        }
        String strM122192b = fmq0.m122192b(this.f170602a);
        byte[] bArrM198847j = vlq0.m198847j(str);
        if (!TextUtils.isEmpty(strM122192b) && bArrM198847j != null && bArrM198847j.length > 1 && (bArrM122195e = fmq0.m122195e(strM122192b)) != null) {
            try {
                if (bArrM122195e.length > 1) {
                    return auq0.m99036c(bArrM122195e, Base64.encode(bArrM198847j, 2));
                }
            } catch (Exception e) {
                ilq0.m137044q(e);
            }
        }
        return null;
    }

    @Override // p149l.mql
    /* JADX INFO: renamed from: b */
    public void mo155957b(HashMap<String, ArrayList<siq0>> map) {
        this.f170603b = map;
    }

    @Override // p149l.ooq0
    /* JADX INFO: renamed from: a */
    public void mo150542a(siq0 siq0Var) {
        if ((siq0Var instanceof t2f) && this.f170603b != null) {
            t2f t2fVar = (t2f) siq0Var;
            String strM189206d = m189206d(t2fVar);
            ArrayList<siq0> arrayList = this.f170603b.get(strM189206d);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            arrayList.add(t2fVar);
            this.f170603b.put(strM189206d, arrayList);
        }
    }
}
