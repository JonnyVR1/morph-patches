package com.tencent.liteav.beauty.p098b;

import android.opengl.GLES20;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.p092b.InterfaceC14170b;
import com.tencent.liteav.basic.p093c.C14179i;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.b.j */
/* JADX INFO: loaded from: classes2.dex */
public class C14245j {

    /* JADX INFO: renamed from: j */
    private static String f59566j = "GPUGreenScreen";

    /* JADX INFO: renamed from: a */
    private int f59567a;

    /* JADX INFO: renamed from: b */
    private int f59568b;

    /* JADX INFO: renamed from: c */
    private boolean f59569c;

    /* JADX INFO: renamed from: d */
    private C14259x f59570d;

    /* JADX INFO: renamed from: e */
    private boolean f59571e;

    /* JADX INFO: renamed from: f */
    private C14179i f59572f;

    /* JADX INFO: renamed from: g */
    private C14240e f59573g;

    /* JADX INFO: renamed from: h */
    private C14252q f59574h;

    /* JADX INFO: renamed from: i */
    private boolean f59575i;

    /* JADX INFO: renamed from: k */
    private InterfaceC14170b f59576k;

    /* JADX INFO: renamed from: b */
    private void m84313b() {
        TXCLog.m84152i(f59566j, "come into destroyPlayer");
        C14259x c14259x = this.f59570d;
        if (c14259x != null) {
            c14259x.m84347a();
        }
        this.f59570d = null;
        this.f59571e = false;
        this.f59575i = false;
        TXCLog.m84152i(f59566j, "come out destroyPlayer");
    }

    /* JADX INFO: renamed from: c */
    private void m84314c() {
        int i = this.f59568b;
        if (i != -1 && i != this.f59567a) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.f59568b = -1;
        }
        int i2 = this.f59567a;
        if (i2 != -1) {
            GLES20.glDeleteTextures(1, new int[]{i2}, 0);
            this.f59567a = -1;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m84316a() {
        TXCLog.m84152i(f59566j, "come into GreenScreen destroy");
        m84313b();
        m84314c();
        C14179i c14179i = this.f59572f;
        if (c14179i != null) {
            c14179i.mo83989d();
            this.f59572f = null;
        }
        C14240e c14240e = this.f59573g;
        if (c14240e != null) {
            c14240e.mo83989d();
            this.f59573g = null;
        }
        C14252q c14252q = this.f59574h;
        if (c14252q != null) {
            c14252q.mo83989d();
            this.f59574h = null;
        }
        this.f59569c = false;
        TXCLog.m84152i(f59566j, "come out GreenScreen destroy");
    }

    /* JADX INFO: renamed from: a */
    public void m84317a(InterfaceC14170b interfaceC14170b) {
        TXCLog.m84152i(f59566j, "set notify");
        this.f59576k = interfaceC14170b;
    }

    /* JADX INFO: renamed from: a */
    public int m84315a(int i) {
        return i;
    }
}
