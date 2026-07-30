package com.p069ss.android.ttvecamera;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p149l.w3m;
import p149l.x3m;

/* JADX INFO: loaded from: classes11.dex */
public class TEFocusSettings {

    /* JADX INFO: renamed from: a */
    private final int f55390a;

    /* JADX INFO: renamed from: b */
    private final int f55391b;

    /* JADX INFO: renamed from: c */
    private final int f55392c;

    /* JADX INFO: renamed from: d */
    private final int f55393d;

    /* JADX INFO: renamed from: e */
    private final float f55394e;

    /* JADX INFO: renamed from: f */
    private long f55395f;

    /* JADX INFO: renamed from: g */
    private boolean f55396g = true;

    /* JADX INFO: renamed from: h */
    private boolean f55397h = true;

    /* JADX INFO: renamed from: i */
    private boolean f55398i = false;

    /* JADX INFO: renamed from: j */
    private boolean f55399j = true;

    /* JADX INFO: renamed from: k */
    private CoordinatesMode f55400k = CoordinatesMode.VIEW;

    /* JADX INFO: renamed from: l */
    private InterfaceC13318b f55401l = new C13319c();

    public enum CoordinatesMode {
        VIEW,
        ORIGINAL_FRAME
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TEFocusSettings$b */
    public interface InterfaceC13318b {
        /* JADX INFO: renamed from: a */
        void mo80534a(int i, int i2, String str);
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TEFocusSettings$c */
    public static class C13319c implements InterfaceC13318b {
        private C13319c() {
        }

        @Override // com.p069ss.android.ttvecamera.TEFocusSettings.InterfaceC13318b
        /* JADX INFO: renamed from: a */
        public void mo80534a(int i, int i2, String str) {
            if (i > 0) {
                C13341g.m80814a("TEFocusNullCallback", "Focus done, cost: " + i + "ms");
            } else {
                C13341g.m80818e("TEFocusNullCallback", "Focus failed, error code: " + i + ", msg: " + str);
            }
            C13341g.m80820g();
        }
    }

    public TEFocusSettings(int i, int i2, int i3, int i4, float f) {
        this.f55390a = i;
        this.f55391b = i2;
        this.f55392c = i3;
        this.f55393d = i4;
        this.f55394e = f;
    }

    /* JADX INFO: renamed from: a */
    public Rect m80514a(int i, boolean z) {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public Rect m80515b(int i, boolean z) {
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public w3m m80516c() {
        return null;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public x3m m80517d() {
        return null;
    }

    /* JADX INFO: renamed from: e */
    public CoordinatesMode m80518e() {
        return this.f55400k;
    }

    /* JADX INFO: renamed from: f */
    public float m80519f() {
        return this.f55394e;
    }

    /* JADX INFO: renamed from: g */
    public InterfaceC13318b m80520g() {
        return this.f55401l;
    }

    /* JADX INFO: renamed from: h */
    public int m80521h() {
        return (int) (System.currentTimeMillis() - this.f55395f);
    }

    /* JADX INFO: renamed from: i */
    public int m80522i() {
        return this.f55391b;
    }

    /* JADX INFO: renamed from: j */
    public int m80523j() {
        return this.f55390a;
    }

    /* JADX INFO: renamed from: k */
    public int m80524k() {
        return this.f55392c;
    }

    /* JADX INFO: renamed from: l */
    public int m80525l() {
        return this.f55393d;
    }

    /* JADX INFO: renamed from: m */
    public boolean m80526m() {
        return this.f55399j;
    }

    /* JADX INFO: renamed from: n */
    public boolean m80527n() {
        return this.f55398i;
    }

    /* JADX INFO: renamed from: o */
    public boolean m80528o() {
        return this.f55396g;
    }

    /* JADX INFO: renamed from: p */
    public boolean m80529p() {
        return this.f55397h;
    }

    /* JADX INFO: renamed from: q */
    public void m80530q() {
        this.f55395f = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: r */
    public void m80531r(CoordinatesMode coordinatesMode) {
        this.f55400k = coordinatesMode;
    }

    /* JADX INFO: renamed from: s */
    public void m80532s(boolean z) {
        this.f55396g = z;
    }

    /* JADX INFO: renamed from: t */
    public void m80533t(boolean z) {
        this.f55397h = z;
    }

    public String toString() {
        return "TEFocusSettings{width =" + this.f55390a + ", height =" + this.f55391b + ", x =" + this.f55392c + ", y =" + this.f55393d + ", need focus =" + this.f55396g + ", need meter =" + this.f55397h + ", lock =" + this.f55398i + ", from user=" + this.f55399j + ", CoordinatesMode" + this.f55400k + '}';
    }
}
