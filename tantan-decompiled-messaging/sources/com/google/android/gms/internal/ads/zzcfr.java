package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.TextureView;
import androidx.annotation.Nullable;
import p149l.p5t0;
import p149l.t4t0;
import p149l.y5t0;
import p149l.z5t0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zzcfr extends TextureView implements y5t0 {

    /* JADX INFO: renamed from: a */
    public final p5t0 f10134a;

    /* JADX INFO: renamed from: b */
    public final z5t0 f10135b;

    public zzcfr(Context context) {
        super(context);
        this.f10134a = new p5t0();
        this.f10135b = new z5t0(context, this);
    }

    /* JADX INFO: renamed from: A */
    public void mo13584A(int i) {
    }

    /* JADX INFO: renamed from: B */
    public void mo13585B(int i) {
    }

    /* JADX INFO: renamed from: f */
    public void mo13586f(int i) {
    }

    /* JADX INFO: renamed from: g */
    public void mo13587g(int i) {
    }

    /* JADX INFO: renamed from: h */
    public void mo13588h(@Nullable String str, @Nullable String[] strArr, @Nullable Integer num) {
        mo13581v(str);
    }

    /* JADX INFO: renamed from: i */
    public abstract int mo13568i();

    /* JADX INFO: renamed from: j */
    public abstract int mo13569j();

    /* JADX INFO: renamed from: k */
    public abstract int mo13570k();

    /* JADX INFO: renamed from: l */
    public abstract int mo13571l();

    /* JADX INFO: renamed from: m */
    public abstract int mo13572m();

    /* JADX INFO: renamed from: n */
    public abstract long mo13573n();

    /* JADX INFO: renamed from: o */
    public abstract long mo13574o();

    /* JADX INFO: renamed from: p */
    public abstract long mo13575p();

    /* JADX INFO: renamed from: q */
    public abstract String mo13576q();

    /* JADX INFO: renamed from: r */
    public abstract void mo13577r();

    /* JADX INFO: renamed from: s */
    public abstract void mo13578s();

    /* JADX INFO: renamed from: t */
    public abstract void mo13579t(int i);

    /* JADX INFO: renamed from: u */
    public abstract void mo13580u(t4t0 t4t0Var);

    /* JADX INFO: renamed from: v */
    public abstract void mo13581v(@Nullable String str);

    /* JADX INFO: renamed from: w */
    public abstract void mo13582w();

    /* JADX INFO: renamed from: x */
    public abstract void mo13583x(float f, float f2);

    @Nullable
    /* JADX INFO: renamed from: y */
    public Integer mo13589y() {
        return null;
    }

    /* JADX INFO: renamed from: z */
    public void mo13590z(int i) {
    }

    public abstract void zzn();
}
