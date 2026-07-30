package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.c0;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import l.c3c0;
import l.i0g0;
import l.mqi0;
import l.n4q;
import l.t100;
import l.vwb;
import l.xdl0;
import p003l.eqh0;
import p028v.VImage;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemHeartbeatNotify extends FrameLayout implements c0.c {

    /* JADX INFO: renamed from: a */
    public FrameLayout f890a;

    /* JADX INFO: renamed from: b */
    public VImage f891b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f892c;

    /* JADX INFO: renamed from: d */
    public SVGAnimationView f893d;

    /* JADX INFO: renamed from: e */
    public VText f894e;

    /* JADX INFO: renamed from: f */
    public VText f895f;

    /* JADX INFO: renamed from: g */
    public View f896g;

    /* JADX INFO: renamed from: h */
    public VText f897h;

    /* JADX INFO: renamed from: i */
    public String f898i;

    /* JADX INFO: renamed from: j */
    public String f899j;

    /* JADX INFO: renamed from: k */
    public String f900k;

    /* JADX INFO: renamed from: l */
    public boolean f901l;

    /* JADX INFO: renamed from: m */
    public boolean f902m;

    public ItemHeartbeatNotify(@NonNull Context context) {
        super(context);
        this.f898i = "还剩%s可以和有缘的她发送消息";
        this.f899j = "还剩%s可以和有缘的他发送消息";
        this.f900k = "";
        this.f901l = false;
        this.f902m = true;
    }

    private void setLeave(boolean z) {
        xdl0.M(this.f892c, !z);
        xdl0.M(this.f891b, z);
        AppCompatTextView appCompatTextView = this.f895f;
        xdl0.M(appCompatTextView, !TextUtils.isEmpty(appCompatTextView.getText()));
        if (CoreModule.P().i().u() && z) {
            xdl0.M(this.f890a, true);
            xdl0.M(this.f897h, false);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1276a(View view) {
        n4q.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final String m1277b(long j) {
        long jO = j - mqi0.o();
        AppCompatTextView appCompatTextView = this.f895f;
        if (jO <= 0) {
            appCompatTextView.setText("对方已经离开了对话");
            setLeave(true);
            return "信号已消失";
        }
        appCompatTextView.setText(this.f899j);
        setLeave(false);
        if (jO > 3600000) {
            return String.format(this.f898i, (jO / 3600000) + "小时");
        }
        String str = this.f898i;
        if (jO > 60000) {
            return String.format(str, ((jO / 60000) % 60) + "分钟");
        }
        return String.format(str, (jO / 1000) + "秒");
    }

    /* JADX INFO: renamed from: c */
    public final String[] m1278c(long j) {
        long jO = j - mqi0.o();
        String[] strArr = new String[2];
        String str = "";
        if (jO <= 0) {
            this.f895f.setText("对方已经离开了对话");
            this.f894e.setText("信号已消失");
            setLeave(true);
            strArr[0] = "信号已消失，对方已经离开了对话";
            strArr[1] = "";
            return strArr;
        }
        String strK = CoreModule.c.t1.k(jO);
        setLeave(false);
        String str2 = String.format(this.f898i, strK);
        if (!TextUtils.isEmpty(this.f899j)) {
            str = "，" + this.f899j;
        }
        strArr[0] = str2.concat(str);
        strArr[1] = strK;
        return strArr;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CoreModule.c.t1.t(this);
        if (this.f902m) {
            this.f893d.stopAnimation(false);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m1276a(this);
        this.f894e.getPaint().setFakeBoldText(true);
        if (CoreModule.P().i().u()) {
            xdl0.M(this.f890a, false);
            xdl0.M(this.f897h, true);
            xdl0.V(this.f890a, t100.d(20.0f));
            xdl0.W(this.f890a, t100.d(20.0f));
            this.f902m = false;
        }
        if (this.f902m) {
            SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/12065e8a-9ab6-424a-a8cd-a32325e7c33d11.pdf").autoPlay(false).repeatCount(-1).into(this.f893d);
        }
        if (CoreModule.P().i().u()) {
            this.f891b.setImageResource(c3c0.A0);
            this.f890a.setBackgroundResource(c3c0.K2);
        }
    }

    /* JADX INFO: renamed from: u */
    public void m1279u(String str, long j, long j2, long j3, long j4) {
        if (!CoreModule.P().i().u()) {
            this.f894e.setText(m1277b(j3));
            return;
        }
        String[] strArrM1278c = m1278c(j3);
        boolean zIsEmpty = TextUtils.isEmpty(strArrM1278c[1]);
        AppCompatTextView appCompatTextView = this.f897h;
        if (zIsEmpty) {
            appCompatTextView.setText(strArrM1278c[0]);
        } else {
            appCompatTextView.setText(i0g0.b0(strArrM1278c[0], vwb.M(strArrM1278c[1]), -98787, eqh0.m3924c(3)));
        }
    }

    public ItemHeartbeatNotify(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f898i = "还剩%s可以和有缘的她发送消息";
        this.f899j = "还剩%s可以和有缘的他发送消息";
        this.f900k = "";
        this.f901l = false;
        this.f902m = true;
    }

    public ItemHeartbeatNotify(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f898i = "还剩%s可以和有缘的她发送消息";
        this.f899j = "还剩%s可以和有缘的他发送消息";
        this.f900k = "";
        this.f901l = false;
        this.f902m = true;
    }
}
