package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.TextureView;
import androidx.annotation.Nullable;
import p153l.eft0;
import p153l.fft0;
import p153l.vet0;
import p153l.zdt0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zzcfr extends TextureView implements eft0 {

    /* JADX INFO: renamed from: a */
    public final vet0 f10171a;

    /* JADX INFO: renamed from: b */
    public final fft0 f10172b;

    public zzcfr(Context context) {
        super(context);
        this.f10171a = new vet0();
        this.f10172b = new fft0(context, this);
    }

    /* JADX INFO: renamed from: A */
    public void mo13638A(int i) {
    }

    /* JADX INFO: renamed from: B */
    public void mo13639B(int i) {
    }

    /* JADX INFO: renamed from: f */
    public void mo13640f(int i) {
    }

    /* JADX INFO: renamed from: g */
    public void mo13641g(int i) {
    }

    /* JADX INFO: renamed from: h */
    public void mo13642h(@Nullable String str, @Nullable String[] strArr, @Nullable Integer num) {
        mo13635v(str);
    }

    /* JADX INFO: renamed from: i */
    public abstract int mo13622i();

    /* JADX INFO: renamed from: j */
    public abstract int mo13623j();

    /* JADX INFO: renamed from: k */
    public abstract int mo13624k();

    /* JADX INFO: renamed from: l */
    public abstract int mo13625l();

    /* JADX INFO: renamed from: m */
    public abstract int mo13626m();

    /* JADX INFO: renamed from: n */
    public abstract long mo13627n();

    /* JADX INFO: renamed from: o */
    public abstract long mo13628o();

    /* JADX INFO: renamed from: p */
    public abstract long mo13629p();

    /* JADX INFO: renamed from: q */
    public abstract String mo13630q();

    /* JADX INFO: renamed from: r */
    public abstract void mo13631r();

    /* JADX INFO: renamed from: s */
    public abstract void mo13632s();

    /* JADX INFO: renamed from: t */
    public abstract void mo13633t(int i);

    /* JADX INFO: renamed from: u */
    public abstract void mo13634u(zdt0 zdt0Var);

    /* JADX INFO: renamed from: v */
    public abstract void mo13635v(@Nullable String str);

    /* JADX INFO: renamed from: w */
    public abstract void mo13636w();

    /* JADX INFO: renamed from: x */
    public abstract void mo13637x(float f, float f2);

    @Nullable
    /* JADX INFO: renamed from: y */
    public Integer mo13643y() {
        return null;
    }

    /* JADX INFO: renamed from: z */
    public void mo13644z(int i) {
    }

    public abstract void zzn();
}
