package p153l;

import android.text.TextUtils;
import android.util.Log;
import com.clevertap.android.sdk.Constants;
import com.hellogroup.common.thread.C3486c;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class mkw {

    /* JADX INFO: renamed from: d */
    private static final String f137339d = "mkw";

    /* JADX INFO: renamed from: e */
    private static mkw f137340e;

    /* JADX INFO: renamed from: a */
    private boolean f137341a = true;

    /* JADX INFO: renamed from: b */
    private ArrayList<pxl> f137342b;

    /* JADX INFO: renamed from: c */
    private HashMap<String, pxl> f137343c;

    /* JADX INFO: renamed from: l.mkw$a */
    public class RunnableC18644a implements Runnable {
        public RunnableC18644a() {
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(mkw.this.f137342b);
            mkw.this.f137342b.clear();
            try {
                mkw.this.m158845n(arrayList);
                arrayList.clear();
            } catch (Exception e) {
                Log.e(mkw.f137339d, "", e);
            }
        }
    }

    private mkw() {
    }

    /* JADX INFO: renamed from: d */
    private void m158841d(String str, File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        Throwable th;
        IOException e;
        try {
            String str2 = new String(str.getBytes("iso-8859-1"), "UTF-8");
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                try {
                    randomAccessFile.seek(randomAccessFile.length() - 1);
                    randomAccessFile.writeBytes(str2.replaceFirst("\\{", Constants.SEPARATOR_COMMA));
                    n1m.m161127b(randomAccessFile);
                } catch (IOException e2) {
                    e = e2;
                    jzv.m147729b(f137339d, e.getMessage());
                    n1m.m161127b(randomAccessFile);
                }
            } catch (Throwable th2) {
                th = th2;
                n1m.m161127b(randomAccessFile);
                throw th;
            }
        } catch (IOException e3) {
            randomAccessFile = null;
            e = e3;
        } catch (Throwable th3) {
            randomAccessFile = null;
            th = th3;
            n1m.m161127b(randomAccessFile);
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m158842e(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(TextUtils.isEmpty(str3) ? "" : Integer.valueOf(str3.hashCode()));
        return sb.toString();
    }

    /* JADX INFO: renamed from: f */
    public static mkw m158843f() {
        if (f137340e == null) {
            f137340e = new mkw();
        }
        return f137340e;
    }

    /* JADX INFO: renamed from: m */
    private void m158844m(String str, File file) {
        BufferedWriter bufferedWriter;
        Throwable th;
        try {
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
            try {
                bufferedWriter.write(new String(str.getBytes("iso-8859-1"), "UTF-8"));
                bufferedWriter.flush();
                n1m.m161127b(bufferedWriter);
            } catch (Throwable th2) {
                th = th2;
                try {
                    jzv.m147729b(f137339d, th.getMessage());
                } finally {
                    n1m.m161127b(bufferedWriter);
                }
            }
        } catch (Throwable th3) {
            bufferedWriter = null;
            th = th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public void m158845n(ArrayList<pxl> arrayList) throws Throwable {
        if (!this.f137341a || arrayList == null || arrayList.isEmpty()) {
            return;
        }
        File fileM110397f = ckw.m110397f();
        if (fileM110397f.exists() || fileM110397f.createNewFile()) {
            JSONObject jSONObject = new JSONObject();
            for (pxl pxlVar : arrayList) {
                if (pxlVar != null && pxlVar.mo116154a()) {
                    jSONObject.put(pxlVar.m174232b() + "", pxlVar.mo116155d());
                    jzv.m147728a(f137339d, "tang------写入一条log " + pxlVar.mo116155d().toString());
                }
            }
            if (fileM110397f.length() == 0) {
                m158844m(jSONObject.toString(), fileM110397f);
            } else {
                m158841d(jSONObject.toString(), fileM110397f);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public pxl m158846g(String str) {
        HashMap<String, pxl> map;
        if (!this.f137341a || (map = this.f137343c) == null) {
            return null;
        }
        return map.get(str);
    }

    /* JADX INFO: renamed from: h */
    public synchronized boolean m158847h(String str, pxl pxlVar) {
        try {
            if (this.f137341a && !TextUtils.isEmpty(str) && pxlVar != null) {
                if (this.f137343c == null) {
                    this.f137343c = new HashMap<>();
                }
                jzv.m147728a(f137339d, "tang-------纪录临时的LOG " + str + "   " + this.f137343c.size());
                this.f137343c.put(str, pxlVar);
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: i */
    public synchronized void m158848i(String str) {
        HashMap<String, pxl> map = this.f137343c;
        if (map != null && !map.isEmpty()) {
            jzv.m147728a(f137339d, "tang-------移除临时的LOG " + str + "   " + this.f137343c.size());
            this.f137343c.remove(str);
        }
    }

    /* JADX INFO: renamed from: j */
    public synchronized boolean m158849j(pxl pxlVar) {
        if (this.f137341a && pxlVar != null) {
            if (!pxlVar.mo116154a()) {
                jzv.m147729b(f137339d, "tang-----日志错误，被丢弃");
                return false;
            }
            if (this.f137342b == null) {
                this.f137342b = new ArrayList<>();
            }
            if (this.f137342b.contains(pxlVar)) {
                return false;
            }
            this.f137342b.add(pxlVar);
            if (this.f137342b.size() >= 3) {
                m158850k();
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public int m158850k() {
        ArrayList<pxl> arrayList;
        jzv.m147728a(f137339d, "tang-------saveLog2File 将日志写入到文件中,日志条数有 " + this.f137342b.size());
        if (!this.f137341a || (arrayList = this.f137342b) == null || arrayList.size() == 0) {
            return 0;
        }
        int size = this.f137342b.size();
        C3486c.m17566d(1, new RunnableC18644a());
        return size;
    }

    /* JADX INFO: renamed from: l */
    public void m158851l(boolean z) {
        this.f137341a = z;
    }
}
