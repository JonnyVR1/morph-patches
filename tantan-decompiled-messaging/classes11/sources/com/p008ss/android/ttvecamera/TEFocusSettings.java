package com.p008ss.android.ttvecamera;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p009l.w3m;
import p009l.x3m;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class TEFocusSettings {

    /* JADX INFO: renamed from: a */
    private final int f8996a;

    /* JADX INFO: renamed from: b */
    private final int f8997b;

    /* JADX INFO: renamed from: c */
    private final int f8998c;

    /* JADX INFO: renamed from: d */
    private final int f8999d;

    /* JADX INFO: renamed from: e */
    private final float f9000e;

    /* JADX INFO: renamed from: f */
    private long f9001f;

    /* JADX INFO: renamed from: g */
    private boolean f9002g = true;

    /* JADX INFO: renamed from: h */
    private boolean f9003h = true;

    /* JADX INFO: renamed from: i */
    private boolean f9004i = false;

    /* JADX INFO: renamed from: j */
    private boolean f9005j = true;

    /* JADX INFO: renamed from: k */
    private CoordinatesMode f9006k = CoordinatesMode.VIEW;

    /* JADX INFO: renamed from: l */
    private InterfaceC0720b f9007l = new C0721c();

    public enum CoordinatesMode {
        VIEW,
        ORIGINAL_FRAME
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TEFocusSettings$b */
    public interface InterfaceC0720b {
        /* JADX INFO: renamed from: a */
        void mo10885a(int i, int i2, String str);
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TEFocusSettings$c */
    public static class C0721c implements InterfaceC0720b {
        private C0721c() {
        }

        @Override // com.p008ss.android.ttvecamera.TEFocusSettings.InterfaceC0720b
        /* JADX INFO: renamed from: a */
        public void mo10885a(int i, int i2, String str) {
            if (i > 0) {
                C0743g.m11165a("TEFocusNullCallback", "Focus done, cost: " + i + "ms");
            } else {
                C0743g.m11169e("TEFocusNullCallback", "Focus failed, error code: " + i + ", msg: " + str);
            }
            C0743g.m11171g();
        }
    }

    public TEFocusSettings(int i, int i2, int i3, int i4, float f) {
        this.f8996a = i;
        this.f8997b = i2;
        this.f8998c = i3;
        this.f8999d = i4;
        this.f9000e = f;
    }

    /* JADX INFO: renamed from: a */
    public Rect m10865a(int i, boolean z) {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public Rect m10866b(int i, boolean z) {
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public w3m m10867c() {
        return null;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public x3m m10868d() {
        return null;
    }

    /* JADX INFO: renamed from: e */
    public CoordinatesMode m10869e() {
        return this.f9006k;
    }

    /* JADX INFO: renamed from: f */
    public float m10870f() {
        return this.f9000e;
    }

    /* JADX INFO: renamed from: g */
    public InterfaceC0720b m10871g() {
        return this.f9007l;
    }

    /* JADX INFO: renamed from: h */
    public int m10872h() {
        return (int) (System.currentTimeMillis() - this.f9001f);
    }

    /* JADX INFO: renamed from: i */
    public int m10873i() {
        return this.f8997b;
    }

    /* JADX INFO: renamed from: j */
    public int m10874j() {
        return this.f8996a;
    }

    /* JADX INFO: renamed from: k */
    public int m10875k() {
        return this.f8998c;
    }

    /* JADX INFO: renamed from: l */
    public int m10876l() {
        return this.f8999d;
    }

    /* JADX INFO: renamed from: m */
    public boolean m10877m() {
        return this.f9005j;
    }

    /* JADX INFO: renamed from: n */
    public boolean m10878n() {
        return this.f9004i;
    }

    /* JADX INFO: renamed from: o */
    public boolean m10879o() {
        return this.f9002g;
    }

    /* JADX INFO: renamed from: p */
    public boolean m10880p() {
        return this.f9003h;
    }

    /* JADX INFO: renamed from: q */
    public void m10881q() {
        this.f9001f = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: r */
    public void m10882r(CoordinatesMode coordinatesMode) {
        this.f9006k = coordinatesMode;
    }

    /* JADX INFO: renamed from: s */
    public void m10883s(boolean z) {
        this.f9002g = z;
    }

    /* JADX INFO: renamed from: t */
    public void m10884t(boolean z) {
        this.f9003h = z;
    }

    public String toString() {
        return "TEFocusSettings{width =" + this.f8996a + ", height =" + this.f8997b + ", x =" + this.f8998c + ", y =" + this.f8999d + ", need focus =" + this.f9002g + ", need meter =" + this.f9003h + ", lock =" + this.f9004i + ", from user=" + this.f9005j + ", CoordinatesMode" + this.f9006k + '}';
    }
}
