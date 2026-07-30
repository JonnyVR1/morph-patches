package com.p000p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.AttributeSet;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.x2c0;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class SuperLikeBanner extends VImage implements Handler.Callback {

    /* JADX INFO: renamed from: d */
    public boolean f2788d;

    /* JADX INFO: renamed from: e */
    public int f2789e;

    /* JADX INFO: renamed from: f */
    public boolean f2790f;

    /* JADX INFO: renamed from: g */
    public d30 f2791g;

    /* JADX INFO: renamed from: h */
    @DrawableRes
    public int[] f2792h;

    /* JADX INFO: renamed from: i */
    public long f2793i;

    /* JADX INFO: renamed from: j */
    public Handler f2794j;

    /* JADX INFO: renamed from: k */
    public int f2795k;

    /* JADX INFO: renamed from: l */
    public long f2796l;

    public SuperLikeBanner(Context context) {
        super(context);
        this.f2788d = false;
        this.f2789e = -1;
        this.f2790f = false;
        this.f2793i = 17L;
    }

    /* JADX INFO: renamed from: h */
    public void m3219h(@DrawableRes int[] iArr, long j) {
        this.f2792h = iArr;
        this.f2793i = Math.max(j, 17L);
        this.f2794j = new Handler(Looper.getMainLooper(), this);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NonNull Message message) {
        m3221j();
        return true;
    }

    /* JADX INFO: renamed from: i */
    public void m3220i() {
        this.f2788d = false;
        this.f2789e = -1;
        this.f2790f = false;
    }

    /* JADX INFO: renamed from: j */
    public final void m3221j() {
        if (this.f2788d) {
            boolean z = this.f2790f;
            int i = this.f2789e;
            if (z) {
                int i2 = i - 1;
                this.f2789e = i2;
                if (i2 < 0) {
                    this.f2789e = 0;
                    this.f2788d = false;
                }
            } else {
                int i3 = i + 1;
                this.f2789e = i3;
                int[] iArr = this.f2792h;
                if (i3 >= iArr.length) {
                    this.f2789e = iArr.length - 1;
                    this.f2788d = false;
                }
            }
            setImageResource(this.f2792h[this.f2789e]);
            if (this.f2788d) {
                this.f2794j.sendEmptyMessageAtTime(0, this.f2796l + (((long) Math.abs(this.f2789e - this.f2795k)) * this.f2793i));
            } else if (NullChecker.a(this.f2791g)) {
                this.f2791g.call();
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m3222k() {
        m3223l(false, null);
    }

    /* JADX INFO: renamed from: l */
    public void m3223l(boolean z, d30 d30Var) {
        this.f2794j.removeCallbacksAndMessages(null);
        this.f2795k = this.f2789e;
        this.f2796l = SystemClock.uptimeMillis();
        this.f2788d = true;
        this.f2790f = z;
        this.f2791g = d30Var;
        m3221j();
    }

    public void setResByGender(boolean z) {
        int[] iArr;
        if (z) {
            int i = x2c0.x3;
            iArr = new int[]{x2c0.r3, x2c0.s3, x2c0.y3, x2c0.z3, x2c0.A3, x2c0.B3, x2c0.C3, x2c0.D3, x2c0.E3, x2c0.F3, x2c0.t3, x2c0.u3, x2c0.v3, x2c0.w3, i, i};
        } else {
            int i2 = x2c0.M3;
            iArr = new int[]{x2c0.G3, x2c0.H3, x2c0.N3, x2c0.O3, x2c0.P3, x2c0.Q3, x2c0.R3, x2c0.S3, x2c0.T3, x2c0.U3, x2c0.I3, x2c0.J3, x2c0.K3, x2c0.L3, i2, i2};
        }
        this.f2792h = iArr;
    }

    public SuperLikeBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2788d = false;
        this.f2789e = -1;
        this.f2790f = false;
        this.f2793i = 17L;
    }

    public SuperLikeBanner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2788d = false;
        this.f2789e = -1;
        this.f2790f = false;
        this.f2793i = 17L;
    }
}
