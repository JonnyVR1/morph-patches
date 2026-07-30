package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.RunnableC4884c0;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.ibc0;
import p153l.jyb;
import p153l.lyh0;
import p153l.n6q;
import p153l.pzi0;
import p153l.q8g0;
import p153l.qa00;

/* JADX INFO: loaded from: classes3.dex */
public class ItemHeartbeatNotify extends FrameLayout implements RunnableC4884c0.c {

    /* JADX INFO: renamed from: a */
    public FrameLayout f31847a;

    /* JADX INFO: renamed from: b */
    public VImage f31848b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f31849c;

    /* JADX INFO: renamed from: d */
    public SVGAnimationView f31850d;

    /* JADX INFO: renamed from: e */
    public VText f31851e;

    /* JADX INFO: renamed from: f */
    public VText f31852f;

    /* JADX INFO: renamed from: g */
    public View f31853g;

    /* JADX INFO: renamed from: h */
    public VText f31854h;

    /* JADX INFO: renamed from: i */
    public String f31855i;

    /* JADX INFO: renamed from: j */
    public String f31856j;

    /* JADX INFO: renamed from: k */
    public String f31857k;

    /* JADX INFO: renamed from: l */
    public boolean f31858l;

    /* JADX INFO: renamed from: m */
    public boolean f31859m;

    public ItemHeartbeatNotify(@NonNull Context context) {
        super(context);
        this.f31855i = "还剩%s可以和有缘的她发送消息";
        this.f31856j = "还剩%s可以和有缘的他发送消息";
        this.f31857k = "";
        this.f31858l = false;
        this.f31859m = true;
    }

    private void setLeave(boolean z) {
        bnl0.m105524M(this.f31849c, !z);
        bnl0.m105524M(this.f31848b, z);
        VText vText = this.f31852f;
        bnl0.m105524M(vText, !TextUtils.isEmpty(vText.getText()));
        if (CoreModule.m30933P().m143412i().mo180542u() && z) {
            bnl0.m105524M(this.f31847a, true);
            bnl0.m105524M(this.f31854h, false);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m49379a(View view) {
        n6q.m161796a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final String m49380b(long j) {
        long jM174454o = j - pzi0.m174454o();
        VText vText = this.f31852f;
        if (jM174454o <= 0) {
            vText.setText("对方已经离开了对话");
            setLeave(true);
            return "信号已消失";
        }
        vText.setText(this.f31856j);
        setLeave(false);
        if (jM174454o > 3600000) {
            return String.format(this.f31855i, (jM174454o / 3600000) + "小时");
        }
        String str = this.f31855i;
        if (jM174454o > Constants.ONE_MIN_IN_MILLIS) {
            return String.format(str, ((jM174454o / Constants.ONE_MIN_IN_MILLIS) % 60) + "分钟");
        }
        return String.format(str, (jM174454o / 1000) + "秒");
    }

    /* JADX INFO: renamed from: c */
    public final String[] m49381c(long j) {
        long jM174454o = j - pzi0.m174454o();
        String[] strArr = new String[2];
        String str = "";
        if (jM174454o <= 0) {
            this.f31852f.setText("对方已经离开了对话");
            this.f31851e.setText("信号已消失");
            setLeave(true);
            strArr[0] = "信号已消失，对方已经离开了对话";
            strArr[1] = "";
            return strArr;
        }
        String strM32510k = CoreModule.f18264c.f20427t1.m32510k(jM174454o);
        setLeave(false);
        String str2 = String.format(this.f31855i, strM32510k);
        if (!TextUtils.isEmpty(this.f31856j)) {
            str = "，" + this.f31856j;
        }
        strArr[0] = str2.concat(str);
        strArr[1] = strM32510k;
        return strArr;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CoreModule.f18264c.f20427t1.m32518t(this);
        if (this.f31859m) {
            this.f31850d.stopAnimation(false);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49379a(this);
        this.f31851e.getPaint().setFakeBoldText(true);
        if (CoreModule.m30933P().m143412i().mo180542u()) {
            bnl0.m105524M(this.f31847a, false);
            bnl0.m105524M(this.f31854h, true);
            bnl0.m105538V(this.f31847a, qa00.m175859d(20.0f));
            bnl0.m105539W(this.f31847a, qa00.m175859d(20.0f));
            this.f31859m = false;
        }
        if (this.f31859m) {
            SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/12065e8a-9ab6-424a-a8cd-a32325e7c33d11.pdf").autoPlay(false).repeatCount(-1).into(this.f31850d);
        }
        if (CoreModule.m30933P().m143412i().mo180542u()) {
            this.f31848b.setImageResource(ibc0.f113743A0);
            this.f31847a.setBackgroundResource(ibc0.f113835K2);
        }
    }

    @Override // com.p051p1.mobile.putong.core.api.RunnableC4884c0.c
    /* JADX INFO: renamed from: u */
    public void mo32530u(String str, long j, long j2, long j3, long j4) {
        if (!CoreModule.m30933P().m143412i().mo180542u()) {
            this.f31851e.setText(m49380b(j3));
            return;
        }
        String[] strArrM49381c = m49381c(j3);
        boolean zIsEmpty = TextUtils.isEmpty(strArrM49381c[1]);
        VText vText = this.f31854h;
        if (zIsEmpty) {
            vText.setText(strArrM49381c[0]);
        } else {
            vText.setText(q8g0.m175796b0(strArrM49381c[0], jyb.m147482M(strArrM49381c[1]), -98787, lyh0.m156283c(3)));
        }
    }

    public ItemHeartbeatNotify(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31855i = "还剩%s可以和有缘的她发送消息";
        this.f31856j = "还剩%s可以和有缘的他发送消息";
        this.f31857k = "";
        this.f31858l = false;
        this.f31859m = true;
    }

    public ItemHeartbeatNotify(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31855i = "还剩%s可以和有缘的她发送消息";
        this.f31856j = "还剩%s可以和有缘的他发送消息";
        this.f31857k = "";
        this.f31858l = false;
        this.f31859m = true;
    }
}
