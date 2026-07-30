package com.tencent.liteav.beauty.p093b;

import android.opengl.GLES20;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.p087b.InterfaceC14007b;
import com.tencent.liteav.basic.p088c.C14016i;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.b.j */
/* JADX INFO: loaded from: classes2.dex */
public class C14082j {

    /* JADX INFO: renamed from: j */
    private static String f58718j = "GPUGreenScreen";

    /* JADX INFO: renamed from: a */
    private int f58719a;

    /* JADX INFO: renamed from: b */
    private int f58720b;

    /* JADX INFO: renamed from: c */
    private boolean f58721c;

    /* JADX INFO: renamed from: d */
    private C14096x f58722d;

    /* JADX INFO: renamed from: e */
    private boolean f58723e;

    /* JADX INFO: renamed from: f */
    private C14016i f58724f;

    /* JADX INFO: renamed from: g */
    private C14077e f58725g;

    /* JADX INFO: renamed from: h */
    private C14089q f58726h;

    /* JADX INFO: renamed from: i */
    private boolean f58727i;

    /* JADX INFO: renamed from: k */
    private InterfaceC14007b f58728k;

    /* JADX INFO: renamed from: b */
    private void m83130b() {
        TXCLog.m82969i(f58718j, "come into destroyPlayer");
        C14096x c14096x = this.f58722d;
        if (c14096x != null) {
            c14096x.m83164a();
        }
        this.f58722d = null;
        this.f58723e = false;
        this.f58727i = false;
        TXCLog.m82969i(f58718j, "come out destroyPlayer");
    }

    /* JADX INFO: renamed from: c */
    private void m83131c() {
        int i = this.f58720b;
        if (i != -1 && i != this.f58719a) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.f58720b = -1;
        }
        int i2 = this.f58719a;
        if (i2 != -1) {
            GLES20.glDeleteTextures(1, new int[]{i2}, 0);
            this.f58719a = -1;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m83133a() {
        TXCLog.m82969i(f58718j, "come into GreenScreen destroy");
        m83130b();
        m83131c();
        C14016i c14016i = this.f58724f;
        if (c14016i != null) {
            c14016i.mo82806d();
            this.f58724f = null;
        }
        C14077e c14077e = this.f58725g;
        if (c14077e != null) {
            c14077e.mo82806d();
            this.f58725g = null;
        }
        C14089q c14089q = this.f58726h;
        if (c14089q != null) {
            c14089q.mo82806d();
            this.f58726h = null;
        }
        this.f58721c = false;
        TXCLog.m82969i(f58718j, "come out GreenScreen destroy");
    }

    /* JADX INFO: renamed from: a */
    public void m83134a(InterfaceC14007b interfaceC14007b) {
        TXCLog.m82969i(f58718j, "set notify");
        this.f58728k = interfaceC14007b;
    }

    /* JADX INFO: renamed from: a */
    public int m83132a(int i) {
        return i;
    }
}
