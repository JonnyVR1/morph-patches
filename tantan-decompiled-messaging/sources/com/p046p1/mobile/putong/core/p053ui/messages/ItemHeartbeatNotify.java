package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.RunnableC4733c0;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VImage;
import p147v.VText;
import p149l.c3c0;
import p149l.eqh0;
import p149l.i0g0;
import p149l.mqi0;
import p149l.n4q;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemHeartbeatNotify extends FrameLayout implements RunnableC4733c0.c {

    /* JADX INFO: renamed from: a */
    public FrameLayout f30999a;

    /* JADX INFO: renamed from: b */
    public VImage f31000b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f31001c;

    /* JADX INFO: renamed from: d */
    public SVGAnimationView f31002d;

    /* JADX INFO: renamed from: e */
    public VText f31003e;

    /* JADX INFO: renamed from: f */
    public VText f31004f;

    /* JADX INFO: renamed from: g */
    public View f31005g;

    /* JADX INFO: renamed from: h */
    public VText f31006h;

    /* JADX INFO: renamed from: i */
    public String f31007i;

    /* JADX INFO: renamed from: j */
    public String f31008j;

    /* JADX INFO: renamed from: k */
    public String f31009k;

    /* JADX INFO: renamed from: l */
    public boolean f31010l;

    /* JADX INFO: renamed from: m */
    public boolean f31011m;

    public ItemHeartbeatNotify(@NonNull Context context) {
        super(context);
        this.f31007i = "还剩%s可以和有缘的她发送消息";
        this.f31008j = "还剩%s可以和有缘的他发送消息";
        this.f31009k = "";
        this.f31010l = false;
        this.f31011m = true;
    }

    private void setLeave(boolean z) {
        xdl0.m208344M(this.f31001c, !z);
        xdl0.m208344M(this.f31000b, z);
        VText vText = this.f31004f;
        xdl0.m208344M(vText, !TextUtils.isEmpty(vText.getText()));
        if (CoreModule.m29935P().m94658i().mo158450u() && z) {
            xdl0.m208344M(this.f30999a, true);
            xdl0.m208344M(this.f31006h, false);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m48196a(View view) {
        n4q.m157885a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final String m48197b(long j) {
        long jM155944o = j - mqi0.m155944o();
        VText vText = this.f31004f;
        if (jM155944o <= 0) {
            vText.setText("对方已经离开了对话");
            setLeave(true);
            return "信号已消失";
        }
        vText.setText(this.f31008j);
        setLeave(false);
        if (jM155944o > 3600000) {
            return String.format(this.f31007i, (jM155944o / 3600000) + "小时");
        }
        String str = this.f31007i;
        if (jM155944o > Constants.ONE_MIN_IN_MILLIS) {
            return String.format(str, ((jM155944o / Constants.ONE_MIN_IN_MILLIS) % 60) + "分钟");
        }
        return String.format(str, (jM155944o / 1000) + "秒");
    }

    /* JADX INFO: renamed from: c */
    public final String[] m48198c(long j) {
        long jM155944o = j - mqi0.m155944o();
        String[] strArr = new String[2];
        String str = "";
        if (jM155944o <= 0) {
            this.f31004f.setText("对方已经离开了对话");
            this.f31003e.setText("信号已消失");
            setLeave(true);
            strArr[0] = "信号已消失，对方已经离开了对话";
            strArr[1] = "";
            return strArr;
        }
        String strM31507k = CoreModule.f17545c.f19685t1.m31507k(jM155944o);
        setLeave(false);
        String str2 = String.format(this.f31007i, strM31507k);
        if (!TextUtils.isEmpty(this.f31008j)) {
            str = "，" + this.f31008j;
        }
        strArr[0] = str2.concat(str);
        strArr[1] = strM31507k;
        return strArr;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CoreModule.f17545c.f19685t1.m31515t(this);
        if (this.f31011m) {
            this.f31002d.stopAnimation(false);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48196a(this);
        this.f31003e.getPaint().setFakeBoldText(true);
        if (CoreModule.m29935P().m94658i().mo158450u()) {
            xdl0.m208344M(this.f30999a, false);
            xdl0.m208344M(this.f31006h, true);
            xdl0.m208358V(this.f30999a, t100.m186890d(20.0f));
            xdl0.m208359W(this.f30999a, t100.m186890d(20.0f));
            this.f31011m = false;
        }
        if (this.f31011m) {
            SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/12065e8a-9ab6-424a-a8cd-a32325e7c33d11.pdf").autoPlay(false).repeatCount(-1).into(this.f31002d);
        }
        if (CoreModule.m29935P().m94658i().mo158450u()) {
            this.f31000b.setImageResource(c3c0.f78468A0);
            this.f30999a.setBackgroundResource(c3c0.f78560K2);
        }
    }

    @Override // com.p046p1.mobile.putong.core.api.RunnableC4733c0.c
    /* JADX INFO: renamed from: u */
    public void mo31527u(String str, long j, long j2, long j3, long j4) {
        if (!CoreModule.m29935P().m94658i().mo158450u()) {
            this.f31003e.setText(m48197b(j3));
            return;
        }
        String[] strArrM48198c = m48198c(j3);
        boolean zIsEmpty = TextUtils.isEmpty(strArrM48198c[1]);
        VText vText = this.f31006h;
        if (zIsEmpty) {
            vText.setText(strArrM48198c[0]);
        } else {
            vText.setText(i0g0.m133861b0(strArrM48198c[0], vwb.m200299M(strArrM48198c[1]), -98787, eqh0.m117752c(3)));
        }
    }

    public ItemHeartbeatNotify(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31007i = "还剩%s可以和有缘的她发送消息";
        this.f31008j = "还剩%s可以和有缘的他发送消息";
        this.f31009k = "";
        this.f31010l = false;
        this.f31011m = true;
    }

    public ItemHeartbeatNotify(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31007i = "还剩%s可以和有缘的她发送消息";
        this.f31008j = "还剩%s可以和有缘的他发送消息";
        this.f31009k = "";
        this.f31010l = false;
        this.f31011m = true;
    }
}
