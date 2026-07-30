package com.p051p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.AttributeSet;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import com.tantanapp.common.utils.NullChecker;
import p151v.VImage;
import p153l.dbc0;
import p153l.x20;

/* JADX INFO: loaded from: classes11.dex */
public class SuperLikeBanner extends VImage implements Handler.Callback {

    /* JADX INFO: renamed from: d */
    public boolean f24752d;

    /* JADX INFO: renamed from: e */
    public int f24753e;

    /* JADX INFO: renamed from: f */
    public boolean f24754f;

    /* JADX INFO: renamed from: g */
    public x20 f24755g;

    /* JADX INFO: renamed from: h */
    @DrawableRes
    public int[] f24756h;

    /* JADX INFO: renamed from: i */
    public long f24757i;

    /* JADX INFO: renamed from: j */
    public Handler f24758j;

    /* JADX INFO: renamed from: k */
    public int f24759k;

    /* JADX INFO: renamed from: l */
    public long f24760l;

    public SuperLikeBanner(Context context) {
        super(context);
        this.f24752d = false;
        this.f24753e = -1;
        this.f24754f = false;
        this.f24757i = 17L;
    }

    /* JADX INFO: renamed from: h */
    public void m40204h(@DrawableRes int[] iArr, long j) {
        this.f24756h = iArr;
        this.f24757i = Math.max(j, 17L);
        this.f24758j = new Handler(Looper.getMainLooper(), this);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NonNull Message message) {
        m40206j();
        return true;
    }

    /* JADX INFO: renamed from: i */
    public void m40205i() {
        this.f24752d = false;
        this.f24753e = -1;
        this.f24754f = false;
    }

    /* JADX INFO: renamed from: j */
    public final void m40206j() {
        if (this.f24752d) {
            boolean z = this.f24754f;
            int i = this.f24753e;
            if (z) {
                int i2 = i - 1;
                this.f24753e = i2;
                if (i2 < 0) {
                    this.f24753e = 0;
                    this.f24752d = false;
                }
            } else {
                int i3 = i + 1;
                this.f24753e = i3;
                int[] iArr = this.f24756h;
                if (i3 >= iArr.length) {
                    this.f24753e = iArr.length - 1;
                    this.f24752d = false;
                }
            }
            setImageResource(this.f24756h[this.f24753e]);
            if (this.f24752d) {
                this.f24758j.sendEmptyMessageAtTime(0, this.f24760l + (((long) Math.abs(this.f24753e - this.f24759k)) * this.f24757i));
            } else if (NullChecker.m82486a(this.f24755g)) {
                this.f24755g.call();
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m40207k() {
        m40208l(false, null);
    }

    /* JADX INFO: renamed from: l */
    public void m40208l(boolean z, x20 x20Var) {
        this.f24758j.removeCallbacksAndMessages(null);
        this.f24759k = this.f24753e;
        this.f24760l = SystemClock.uptimeMillis();
        this.f24752d = true;
        this.f24754f = z;
        this.f24755g = x20Var;
        m40206j();
    }

    public void setResByGender(boolean z) {
        int[] iArr;
        if (z) {
            int i = dbc0.f87597y3;
            iArr = new int[]{dbc0.f87403s3, dbc0.f87436t3, dbc0.f87629z3, dbc0.f85980A3, dbc0.f86012B3, dbc0.f86044C3, dbc0.f86076D3, dbc0.f86108E3, dbc0.f86140F3, dbc0.f86172G3, dbc0.f87469u3, dbc0.f87501v3, dbc0.f87533w3, dbc0.f87565x3, i, i};
        } else {
            int i2 = dbc0.f86396N3;
            iArr = new int[]{dbc0.f86204H3, dbc0.f86236I3, dbc0.f86428O3, dbc0.f86460P3, dbc0.f86492Q3, dbc0.f86524R3, dbc0.f86556S3, dbc0.f86588T3, dbc0.f86620U3, dbc0.f86652V3, dbc0.f86268J3, dbc0.f86300K3, dbc0.f86332L3, dbc0.f86364M3, i2, i2};
        }
        this.f24756h = iArr;
    }

    public SuperLikeBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24752d = false;
        this.f24753e = -1;
        this.f24754f = false;
        this.f24757i = 17L;
    }

    public SuperLikeBanner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24752d = false;
        this.f24753e = -1;
        this.f24754f = false;
        this.f24757i = 17L;
    }
}
