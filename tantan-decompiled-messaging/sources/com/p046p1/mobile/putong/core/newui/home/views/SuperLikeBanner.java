package com.p046p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.AttributeSet;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import com.tantanapp.common.utils.NullChecker;
import p147v.VImage;
import p149l.d30;
import p149l.x2c0;

/* JADX INFO: loaded from: classes11.dex */
public class SuperLikeBanner extends VImage implements Handler.Callback {

    /* JADX INFO: renamed from: d */
    public boolean f24010d;

    /* JADX INFO: renamed from: e */
    public int f24011e;

    /* JADX INFO: renamed from: f */
    public boolean f24012f;

    /* JADX INFO: renamed from: g */
    public d30 f24013g;

    /* JADX INFO: renamed from: h */
    @DrawableRes
    public int[] f24014h;

    /* JADX INFO: renamed from: i */
    public long f24015i;

    /* JADX INFO: renamed from: j */
    public Handler f24016j;

    /* JADX INFO: renamed from: k */
    public int f24017k;

    /* JADX INFO: renamed from: l */
    public long f24018l;

    public SuperLikeBanner(Context context) {
        super(context);
        this.f24010d = false;
        this.f24011e = -1;
        this.f24012f = false;
        this.f24015i = 17L;
    }

    /* JADX INFO: renamed from: h */
    public void m39201h(@DrawableRes int[] iArr, long j) {
        this.f24014h = iArr;
        this.f24015i = Math.max(j, 17L);
        this.f24016j = new Handler(Looper.getMainLooper(), this);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NonNull Message message) {
        m39203j();
        return true;
    }

    /* JADX INFO: renamed from: i */
    public void m39202i() {
        this.f24010d = false;
        this.f24011e = -1;
        this.f24012f = false;
    }

    /* JADX INFO: renamed from: j */
    public final void m39203j() {
        if (this.f24010d) {
            boolean z = this.f24012f;
            int i = this.f24011e;
            if (z) {
                int i2 = i - 1;
                this.f24011e = i2;
                if (i2 < 0) {
                    this.f24011e = 0;
                    this.f24010d = false;
                }
            } else {
                int i3 = i + 1;
                this.f24011e = i3;
                int[] iArr = this.f24014h;
                if (i3 >= iArr.length) {
                    this.f24011e = iArr.length - 1;
                    this.f24010d = false;
                }
            }
            setImageResource(this.f24014h[this.f24011e]);
            if (this.f24010d) {
                this.f24016j.sendEmptyMessageAtTime(0, this.f24018l + (((long) Math.abs(this.f24011e - this.f24017k)) * this.f24015i));
            } else if (NullChecker.m81303a(this.f24013g)) {
                this.f24013g.call();
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m39204k() {
        m39205l(false, null);
    }

    /* JADX INFO: renamed from: l */
    public void m39205l(boolean z, d30 d30Var) {
        this.f24016j.removeCallbacksAndMessages(null);
        this.f24017k = this.f24011e;
        this.f24018l = SystemClock.uptimeMillis();
        this.f24010d = true;
        this.f24012f = z;
        this.f24013g = d30Var;
        m39203j();
    }

    public void setResByGender(boolean z) {
        int[] iArr;
        if (z) {
            int i = x2c0.f190702x3;
            iArr = new int[]{x2c0.f190510r3, x2c0.f190542s3, x2c0.f190734y3, x2c0.f190766z3, x2c0.f189157A3, x2c0.f189189B3, x2c0.f189221C3, x2c0.f189253D3, x2c0.f189285E3, x2c0.f189317F3, x2c0.f190574t3, x2c0.f190606u3, x2c0.f190638v3, x2c0.f190670w3, i, i};
        } else {
            int i2 = x2c0.f189535M3;
            iArr = new int[]{x2c0.f189349G3, x2c0.f189380H3, x2c0.f189566N3, x2c0.f189597O3, x2c0.f189628P3, x2c0.f189659Q3, x2c0.f189690R3, x2c0.f189721S3, x2c0.f189752T3, x2c0.f189783U3, x2c0.f189411I3, x2c0.f189442J3, x2c0.f189473K3, x2c0.f189504L3, i2, i2};
        }
        this.f24014h = iArr;
    }

    public SuperLikeBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24010d = false;
        this.f24011e = -1;
        this.f24012f = false;
        this.f24015i = 17L;
    }

    public SuperLikeBanner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24010d = false;
        this.f24011e = -1;
        this.f24012f = false;
        this.f24015i = 17L;
    }
}
