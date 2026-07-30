package com.p074ss.android.ttvecamera;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p153l.m6m;
import p153l.n6m;

/* JADX INFO: loaded from: classes11.dex */
public class TEFocusSettings {

    /* JADX INFO: renamed from: a */
    private final int f56238a;

    /* JADX INFO: renamed from: b */
    private final int f56239b;

    /* JADX INFO: renamed from: c */
    private final int f56240c;

    /* JADX INFO: renamed from: d */
    private final int f56241d;

    /* JADX INFO: renamed from: e */
    private final float f56242e;

    /* JADX INFO: renamed from: f */
    private long f56243f;

    /* JADX INFO: renamed from: g */
    private boolean f56244g = true;

    /* JADX INFO: renamed from: h */
    private boolean f56245h = true;

    /* JADX INFO: renamed from: i */
    private boolean f56246i = false;

    /* JADX INFO: renamed from: j */
    private boolean f56247j = true;

    /* JADX INFO: renamed from: k */
    private CoordinatesMode f56248k = CoordinatesMode.VIEW;

    /* JADX INFO: renamed from: l */
    private InterfaceC13481b f56249l = new C13482c();

    public enum CoordinatesMode {
        VIEW,
        ORIGINAL_FRAME
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TEFocusSettings$b */
    public interface InterfaceC13481b {
        /* JADX INFO: renamed from: a */
        void mo81717a(int i, int i2, String str);
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TEFocusSettings$c */
    public static class C13482c implements InterfaceC13481b {
        private C13482c() {
        }

        @Override // com.p074ss.android.ttvecamera.TEFocusSettings.InterfaceC13481b
        /* JADX INFO: renamed from: a */
        public void mo81717a(int i, int i2, String str) {
            if (i > 0) {
                C13504g.m81997a("TEFocusNullCallback", "Focus done, cost: " + i + "ms");
            } else {
                C13504g.m82001e("TEFocusNullCallback", "Focus failed, error code: " + i + ", msg: " + str);
            }
            C13504g.m82003g();
        }
    }

    public TEFocusSettings(int i, int i2, int i3, int i4, float f) {
        this.f56238a = i;
        this.f56239b = i2;
        this.f56240c = i3;
        this.f56241d = i4;
        this.f56242e = f;
    }

    /* JADX INFO: renamed from: a */
    public Rect m81697a(int i, boolean z) {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public Rect m81698b(int i, boolean z) {
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public m6m m81699c() {
        return null;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public n6m m81700d() {
        return null;
    }

    /* JADX INFO: renamed from: e */
    public CoordinatesMode m81701e() {
        return this.f56248k;
    }

    /* JADX INFO: renamed from: f */
    public float m81702f() {
        return this.f56242e;
    }

    /* JADX INFO: renamed from: g */
    public InterfaceC13481b m81703g() {
        return this.f56249l;
    }

    /* JADX INFO: renamed from: h */
    public int m81704h() {
        return (int) (System.currentTimeMillis() - this.f56243f);
    }

    /* JADX INFO: renamed from: i */
    public int m81705i() {
        return this.f56239b;
    }

    /* JADX INFO: renamed from: j */
    public int m81706j() {
        return this.f56238a;
    }

    /* JADX INFO: renamed from: k */
    public int m81707k() {
        return this.f56240c;
    }

    /* JADX INFO: renamed from: l */
    public int m81708l() {
        return this.f56241d;
    }

    /* JADX INFO: renamed from: m */
    public boolean m81709m() {
        return this.f56247j;
    }

    /* JADX INFO: renamed from: n */
    public boolean m81710n() {
        return this.f56246i;
    }

    /* JADX INFO: renamed from: o */
    public boolean m81711o() {
        return this.f56244g;
    }

    /* JADX INFO: renamed from: p */
    public boolean m81712p() {
        return this.f56245h;
    }

    /* JADX INFO: renamed from: q */
    public void m81713q() {
        this.f56243f = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: r */
    public void m81714r(CoordinatesMode coordinatesMode) {
        this.f56248k = coordinatesMode;
    }

    /* JADX INFO: renamed from: s */
    public void m81715s(boolean z) {
        this.f56244g = z;
    }

    /* JADX INFO: renamed from: t */
    public void m81716t(boolean z) {
        this.f56245h = z;
    }

    public String toString() {
        return "TEFocusSettings{width =" + this.f56238a + ", height =" + this.f56239b + ", x =" + this.f56240c + ", y =" + this.f56241d + ", need focus =" + this.f56244g + ", need meter =" + this.f56245h + ", lock =" + this.f56246i + ", from user=" + this.f56247j + ", CoordinatesMode" + this.f56248k + '}';
    }
}
