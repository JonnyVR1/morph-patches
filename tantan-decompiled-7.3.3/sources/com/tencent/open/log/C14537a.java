package com.tencent.open.log;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.tencent.tauth.Tencent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: com.tencent.open.log.a */
/* JADX INFO: loaded from: classes2.dex */
public class C14537a extends Tracer implements Handler.Callback {

    /* JADX INFO: renamed from: a */
    private C14538b f61113a;

    /* JADX INFO: renamed from: b */
    private FileWriter f61114b;

    /* JADX INFO: renamed from: c */
    private File f61115c;

    /* JADX INFO: renamed from: d */
    private char[] f61116d;

    /* JADX INFO: renamed from: e */
    private volatile C14542f f61117e;

    /* JADX INFO: renamed from: f */
    private volatile C14542f f61118f;

    /* JADX INFO: renamed from: g */
    private volatile C14542f f61119g;

    /* JADX INFO: renamed from: h */
    private volatile C14542f f61120h;

    /* JADX INFO: renamed from: i */
    private volatile boolean f61121i;

    /* JADX INFO: renamed from: j */
    private HandlerThread f61122j;

    /* JADX INFO: renamed from: k */
    private Handler f61123k;

    public C14537a(int i, boolean z, C14543g c14543g, C14538b c14538b) {
        super(i, z, c14543g);
        this.f61121i = false;
        m85517a(c14538b);
        this.f61117e = new C14542f();
        this.f61118f = new C14542f();
        this.f61119g = this.f61117e;
        this.f61120h = this.f61118f;
        this.f61116d = new char[c14538b.m85530c()];
        HandlerThread handlerThread = new HandlerThread(c14538b.m85526b(), c14538b.m85533d());
        this.f61122j = handlerThread;
        handlerThread.start();
        if (!this.f61122j.isAlive() || this.f61122j.getLooper() == null) {
            return;
        }
        this.f61123k = new Handler(this.f61122j.getLooper(), this);
    }

    /* JADX INFO: renamed from: a */
    private void m85509a(File file) {
        File[] fileArrListFiles;
        File parentFile = file.getParentFile();
        if (parentFile == null || !parentFile.exists() || !parentFile.isDirectory() || (fileArrListFiles = parentFile.listFiles()) == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (m85511b(file2)) {
                String name = file2.getName();
                if (C14538b.m85520a(System.currentTimeMillis() - (Tencent.USE_ONE_HOUR ? 3600000L : 259200000L)).compareTo(name.substring(32, 43)) > 0) {
                    SLog.m85488d("FileTracer", "delete name=" + name + ", success=" + file2.delete());
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private boolean m85511b(File file) {
        if (file == null) {
            return false;
        }
        String name = file.getName();
        SLog.m85488d("FileTracer", "name=" + name);
        return !TextUtils.isEmpty(name) && name.length() == 47 && name.startsWith("com.tencent.mobileqq_connectSdk.") && name.endsWith(".log");
    }

    /* JADX INFO: renamed from: f */
    private void m85512f() {
        if (Thread.currentThread() == this.f61122j && !this.f61121i) {
            this.f61121i = true;
            m85515i();
            try {
                try {
                    this.f61120h.m85542a(m85513g(), this.f61116d);
                } catch (IOException e) {
                    SLog.m85491e("FileTracer", "flushBuffer exception", e);
                }
                this.f61120h.m85543b();
                this.f61121i = false;
            } catch (Throwable th) {
                this.f61120h.m85543b();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    private Writer m85513g() {
        File fileM85523a = m85519c().m85523a();
        if (fileM85523a != null && (!fileM85523a.equals(this.f61115c) || this.f61114b == null)) {
            this.f61115c = fileM85523a;
            m85514h();
            try {
                this.f61114b = new FileWriter(this.f61115c, true);
            } catch (IOException unused) {
                this.f61114b = null;
                SLog.m85490e(SLog.TAG, "-->obtainFileWriter() app specific file permission denied");
            }
            m85509a(fileM85523a);
        }
        return this.f61114b;
    }

    /* JADX INFO: renamed from: h */
    private void m85514h() {
        try {
            FileWriter fileWriter = this.f61114b;
            if (fileWriter != null) {
                fileWriter.flush();
                this.f61114b.close();
            }
        } catch (IOException e) {
            SLog.m85491e(SLog.TAG, "-->closeAppSpecificFileWriter() exception:", e);
        }
    }

    /* JADX INFO: renamed from: i */
    private void m85515i() {
        synchronized (this) {
            try {
                if (this.f61119g == this.f61117e) {
                    this.f61119g = this.f61118f;
                    this.f61120h = this.f61117e;
                } else {
                    this.f61119g = this.f61117e;
                    this.f61120h = this.f61118f;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public C14538b m85519c() {
        return this.f61113a;
    }

    @Override // com.tencent.open.log.Tracer
    public void doTrace(int i, Thread thread, long j, String str, String str2, Throwable th) {
        m85510a(m85508e().m85545a(i, thread, j, str, str2, th));
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 1024) {
            return true;
        }
        m85512f();
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void m85518b() {
        m85514h();
        this.f61122j.quit();
    }

    public C14537a(C14538b c14538b) {
        this(C14539c.f61134b, true, C14543g.f61151a, c14538b);
    }

    /* JADX INFO: renamed from: a */
    private void m85510a(String str) {
        this.f61119g.m85541a(str);
        if (this.f61119g.m85540a() >= m85519c().m85530c()) {
            m85516a();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m85516a() {
        if (this.f61123k.hasMessages(1024)) {
            this.f61123k.removeMessages(1024);
        }
        this.f61123k.sendEmptyMessage(1024);
    }

    /* JADX INFO: renamed from: a */
    public void m85517a(C14538b c14538b) {
        this.f61113a = c14538b;
    }
}
