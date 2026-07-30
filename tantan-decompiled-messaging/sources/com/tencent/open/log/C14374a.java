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
public class C14374a extends Tracer implements Handler.Callback {

    /* JADX INFO: renamed from: a */
    private C14375b f60265a;

    /* JADX INFO: renamed from: b */
    private FileWriter f60266b;

    /* JADX INFO: renamed from: c */
    private File f60267c;

    /* JADX INFO: renamed from: d */
    private char[] f60268d;

    /* JADX INFO: renamed from: e */
    private volatile C14379f f60269e;

    /* JADX INFO: renamed from: f */
    private volatile C14379f f60270f;

    /* JADX INFO: renamed from: g */
    private volatile C14379f f60271g;

    /* JADX INFO: renamed from: h */
    private volatile C14379f f60272h;

    /* JADX INFO: renamed from: i */
    private volatile boolean f60273i;

    /* JADX INFO: renamed from: j */
    private HandlerThread f60274j;

    /* JADX INFO: renamed from: k */
    private Handler f60275k;

    public C14374a(int i, boolean z, C14380g c14380g, C14375b c14375b) {
        super(i, z, c14380g);
        this.f60273i = false;
        m84334a(c14375b);
        this.f60269e = new C14379f();
        this.f60270f = new C14379f();
        this.f60271g = this.f60269e;
        this.f60272h = this.f60270f;
        this.f60268d = new char[c14375b.m84347c()];
        HandlerThread handlerThread = new HandlerThread(c14375b.m84343b(), c14375b.m84350d());
        this.f60274j = handlerThread;
        handlerThread.start();
        if (!this.f60274j.isAlive() || this.f60274j.getLooper() == null) {
            return;
        }
        this.f60275k = new Handler(this.f60274j.getLooper(), this);
    }

    /* JADX INFO: renamed from: a */
    private void m84326a(File file) {
        File[] fileArrListFiles;
        File parentFile = file.getParentFile();
        if (parentFile == null || !parentFile.exists() || !parentFile.isDirectory() || (fileArrListFiles = parentFile.listFiles()) == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (m84328b(file2)) {
                String name = file2.getName();
                if (C14375b.m84337a(System.currentTimeMillis() - (Tencent.USE_ONE_HOUR ? 3600000L : 259200000L)).compareTo(name.substring(32, 43)) > 0) {
                    SLog.m84305d("FileTracer", "delete name=" + name + ", success=" + file2.delete());
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private boolean m84328b(File file) {
        if (file == null) {
            return false;
        }
        String name = file.getName();
        SLog.m84305d("FileTracer", "name=" + name);
        return !TextUtils.isEmpty(name) && name.length() == 47 && name.startsWith("com.tencent.mobileqq_connectSdk.") && name.endsWith(".log");
    }

    /* JADX INFO: renamed from: f */
    private void m84329f() {
        if (Thread.currentThread() == this.f60274j && !this.f60273i) {
            this.f60273i = true;
            m84332i();
            try {
                try {
                    this.f60272h.m84359a(m84330g(), this.f60268d);
                } catch (IOException e) {
                    SLog.m84308e("FileTracer", "flushBuffer exception", e);
                }
                this.f60272h.m84360b();
                this.f60273i = false;
            } catch (Throwable th) {
                this.f60272h.m84360b();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    private Writer m84330g() {
        File fileM84340a = m84336c().m84340a();
        if (fileM84340a != null && (!fileM84340a.equals(this.f60267c) || this.f60266b == null)) {
            this.f60267c = fileM84340a;
            m84331h();
            try {
                this.f60266b = new FileWriter(this.f60267c, true);
            } catch (IOException unused) {
                this.f60266b = null;
                SLog.m84307e(SLog.TAG, "-->obtainFileWriter() app specific file permission denied");
            }
            m84326a(fileM84340a);
        }
        return this.f60266b;
    }

    /* JADX INFO: renamed from: h */
    private void m84331h() {
        try {
            FileWriter fileWriter = this.f60266b;
            if (fileWriter != null) {
                fileWriter.flush();
                this.f60266b.close();
            }
        } catch (IOException e) {
            SLog.m84308e(SLog.TAG, "-->closeAppSpecificFileWriter() exception:", e);
        }
    }

    /* JADX INFO: renamed from: i */
    private void m84332i() {
        synchronized (this) {
            try {
                if (this.f60271g == this.f60269e) {
                    this.f60271g = this.f60270f;
                    this.f60272h = this.f60269e;
                } else {
                    this.f60271g = this.f60269e;
                    this.f60272h = this.f60270f;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public C14375b m84336c() {
        return this.f60265a;
    }

    @Override // com.tencent.open.log.Tracer
    public void doTrace(int i, Thread thread, long j, String str, String str2, Throwable th) {
        m84327a(m84325e().m84362a(i, thread, j, str, str2, th));
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 1024) {
            return true;
        }
        m84329f();
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void m84335b() {
        m84331h();
        this.f60274j.quit();
    }

    public C14374a(C14375b c14375b) {
        this(C14376c.f60286b, true, C14380g.f60303a, c14375b);
    }

    /* JADX INFO: renamed from: a */
    private void m84327a(String str) {
        this.f60271g.m84358a(str);
        if (this.f60271g.m84357a() >= m84336c().m84347c()) {
            m84333a();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m84333a() {
        if (this.f60275k.hasMessages(1024)) {
            this.f60275k.removeMessages(1024);
        }
        this.f60275k.sendEmptyMessage(1024);
    }

    /* JADX INFO: renamed from: a */
    public void m84334a(C14375b c14375b) {
        this.f60265a = c14375b;
    }
}
