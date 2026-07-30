package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.immomo.mmutil.log.Log4Android;
import com.immomo.mmutil.task.C3804c;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class uhw {

    /* JADX INFO: renamed from: d */
    private static final String f176600d = "uhw";

    /* JADX INFO: renamed from: e */
    private static uhw f176601e;

    /* JADX INFO: renamed from: a */
    private boolean f176602a = false;

    /* JADX INFO: renamed from: b */
    private ArrayList<xul> f176603b;

    /* JADX INFO: renamed from: c */
    private HashMap<String, xul> f176604c;

    /* JADX INFO: renamed from: l.uhw$a */
    public class RunnableC20433a implements Runnable {
        public RunnableC20433a() {
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(uhw.this.f176603b);
            uhw.this.f176603b.clear();
            try {
                uhw.this.m193795m(arrayList);
                arrayList.clear();
            } catch (Exception e) {
                Log4Android.m18417f().m18422e(e);
            }
        }
    }

    private uhw() {
    }

    /* JADX INFO: renamed from: c */
    private void m193791c(String str, File file) throws Throwable {
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
                    syl.m186709b(randomAccessFile);
                } catch (IOException e2) {
                    e = e2;
                    mxv.m156927b(f176600d, e.getMessage());
                    syl.m186709b(randomAccessFile);
                }
            } catch (Throwable th2) {
                th = th2;
                syl.m186709b(randomAccessFile);
                throw th;
            }
        } catch (IOException e3) {
            randomAccessFile = null;
            e = e3;
        } catch (Throwable th3) {
            randomAccessFile = null;
            th = th3;
            syl.m186709b(randomAccessFile);
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m193792d(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(TextUtils.isEmpty(str3) ? "" : Integer.valueOf(str3.hashCode()));
        return sb.toString();
    }

    /* JADX INFO: renamed from: e */
    public static uhw m193793e() {
        if (f176601e == null) {
            f176601e = new uhw();
        }
        return f176601e;
    }

    /* JADX INFO: renamed from: l */
    private void m193794l(String str, File file) {
        BufferedWriter bufferedWriter;
        Throwable th;
        try {
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
            try {
                bufferedWriter.write(new String(str.getBytes("iso-8859-1"), "UTF-8"));
                bufferedWriter.flush();
                syl.m186709b(bufferedWriter);
            } catch (Throwable th2) {
                th = th2;
                try {
                    mxv.m156927b(f176600d, th.getMessage());
                } finally {
                    syl.m186709b(bufferedWriter);
                }
            }
        } catch (Throwable th3) {
            bufferedWriter = null;
            th = th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public void m193795m(ArrayList<xul> arrayList) throws Throwable {
        if (!this.f176602a || arrayList == null || arrayList.isEmpty()) {
            return;
        }
        File fileM164469g = ohw.m164469g();
        if (fileM164469g.exists() || fileM164469g.createNewFile()) {
            JSONObject jSONObject = new JSONObject();
            for (xul xulVar : arrayList) {
                if (xulVar != null && xulVar.mo101935a()) {
                    jSONObject.put(xulVar.m211116b() + "", xulVar.mo101936e());
                    mxv.m156926a(f176600d, "tang------写入一条log " + xulVar.mo101936e().toString());
                }
            }
            if (fileM164469g.length() == 0) {
                m193794l(jSONObject.toString(), fileM164469g);
            } else {
                m193791c(jSONObject.toString(), fileM164469g);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public xul m193796f(String str) {
        HashMap<String, xul> map;
        if (!this.f176602a || (map = this.f176604c) == null) {
            return null;
        }
        return map.get(str);
    }

    /* JADX INFO: renamed from: g */
    public synchronized boolean m193797g(String str, xul xulVar) {
        try {
            if (this.f176602a && !TextUtils.isEmpty(str) && xulVar != null) {
                if (this.f176604c == null) {
                    this.f176604c = new HashMap<>();
                }
                mxv.m156926a(f176600d, "tang-------纪录临时的LOG " + str + "   " + this.f176604c.size());
                this.f176604c.put(str, xulVar);
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: h */
    public synchronized void m193798h(String str) {
        HashMap<String, xul> map = this.f176604c;
        if (map != null && !map.isEmpty()) {
            mxv.m156926a(f176600d, "tang-------移除临时的LOG " + str + "   " + this.f176604c.size());
            this.f176604c.remove(str);
        }
    }

    /* JADX INFO: renamed from: i */
    public synchronized boolean m193799i(xul xulVar) {
        if (this.f176602a && xulVar != null) {
            if (!xulVar.mo101935a()) {
                mxv.m156927b(f176600d, "tang-----日志错误，被丢弃");
                return false;
            }
            if (this.f176603b == null) {
                this.f176603b = new ArrayList<>();
            }
            if (this.f176603b.contains(xulVar)) {
                return false;
            }
            this.f176603b.add(xulVar);
            if (this.f176603b.size() >= 3) {
                m193800j();
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public int m193800j() {
        ArrayList<xul> arrayList;
        mxv.m156926a(f176600d, "tang-------saveLog2File 将日志写入到文件中,日志条数有 " + this.f176603b.size());
        if (!this.f176602a || (arrayList = this.f176603b) == null || arrayList.size() == 0) {
            return 0;
        }
        int size = this.f176603b.size();
        C3804c.m18444d(1, new RunnableC20433a());
        return size;
    }

    /* JADX INFO: renamed from: k */
    public void m193801k(boolean z) {
        this.f176602a = z;
    }
}
