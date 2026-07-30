package com.p046p1.mobile.putong.live.livingroom.virtual.fans;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceTagBubble;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.view.SayHiBubbleView;
import com.p046p1.mobile.putong.live.livingroom.voice.chat.view.VoiceChatInputView;
import com.tantanapp.common.utils.NullChecker;
import p147v.VText;
import p149l.d30;
import p149l.d5p0;
import p149l.d8c0;
import p149l.e51;
import p149l.i3c0;
import p149l.s7m;
import p149l.t100;
import p149l.t6c0;
import p149l.uvr;
import p149l.w3o0;
import p149l.w8u;
import p149l.x4p0;
import p149l.x8u;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceVirtualFansView extends RelativeLayout implements s7m<x4p0> {

    /* JADX INFO: renamed from: a */
    public TextView f52290a;

    /* JADX INFO: renamed from: b */
    public VText f52291b;

    /* JADX INFO: renamed from: c */
    public x4p0 f52292c;

    /* JADX INFO: renamed from: d */
    public final PopupWindow f52293d;

    public VoiceVirtualFansView(Context context) {
        super(context);
        this.f52293d = new PopupWindow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m76939j(View view) {
        m76941s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m76940k(View view) {
        if (NullChecker.m81303a(this.f52292c)) {
            this.f52292c.m207008W3();
        }
    }

    /* JADX INFO: renamed from: s */
    private void m76941s() {
        this.f52292c.m207010Z3();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    @Override // p149l.s7m
    public Act act() {
        return (Act) getContext();
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: e */
    public final void m76942e(View view) {
        d5p0.m110067a(this, view);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(x4p0 x4p0Var) {
        this.f52292c = x4p0Var;
    }

    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void m76945l() {
        if (this.f52293d.isShowing()) {
            this.f52293d.dismiss();
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m76946m(SayHiBubbleView sayHiBubbleView, View view) {
        sayHiBubbleView.measure(xdl0.m208412y0(), xdl0.m208408w0());
        this.f52293d.showAsDropDown(view, -sayHiBubbleView.getMeasuredWidth(), -(view.getMeasuredHeight() - ((view.getMeasuredHeight() - t100.m186890d(38.0f)) / 2)));
    }

    /* JADX INFO: renamed from: n */
    public void m76947n() {
        xdl0.m208344M(this, true);
        xdl0.m208344M(this.f52290a, false);
        xdl0.m208344M(this.f52291b, true);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76942e(this);
        m76950r();
    }

    /* JADX INFO: renamed from: p */
    public void m76948p() {
        this.f52290a.setText("0");
    }

    /* JADX WARN: Type inference failed for: r7v11, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r7v7, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r7v9, types: [l.ho2] */
    /* JADX INFO: renamed from: q */
    public void m76949q(String str, BLiveVoiceTagBubble bLiveVoiceTagBubble) {
        final SayHiBubbleView sayHiBubbleView = (SayHiBubbleView) LayoutInflater.from(getContext()).inflate(t6c0.f168360ga, (ViewGroup) null);
        sayHiBubbleView.setBackgroundResource(i3c0.f110837Q9);
        int i = t100.f167260i;
        int i2 = t100.f167258g;
        sayHiBubbleView.setPadding(i, i2, t100.f167263l, i2);
        sayHiBubbleView.m76648f(bLiveVoiceTagBubble, this.f52292c.m206027E2().m149818o(), this.f52292c.m206027E2().m132140j0(), this.f52292c.m206027E2().m149814k(), new d30() { // from class: l.a5p0
            @Override // p149l.d30
            public final void call() {
                this.f67717a.m76945l();
            }
        });
        this.f52293d.setContentView(sayHiBubbleView);
        final TextView textView = this.f52290a;
        e51.m114741F(this.f52292c.act(), new Runnable() { // from class: l.b5p0
            @Override // java.lang.Runnable
            public final void run() {
                this.f73687a.m76946m(sayHiBubbleView, textView);
            }
        });
        e51.m114743H(this.f52292c.act(), new Runnable() { // from class: l.c5p0
            @Override // java.lang.Runnable
            public final void run() {
                this.f79409a.m76945l();
            }
        }, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: r */
    public void m76950r() {
        xdl0.m208329E0(this.f52290a, new View.OnClickListener() { // from class: l.y4p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f196325a.m76939j(view);
            }
        });
        xdl0.m208329E0(this.f52291b, new View.OnClickListener() { // from class: l.z4p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f201624a.m76940k(view);
            }
        });
        this.f52293d.setOutsideTouchable(true);
        this.f52293d.setWidth(-2);
        this.f52293d.setHeight(-2);
        this.f52293d.setAnimationStyle(d8c0.f84858m);
    }

    public void setData(w3o0 w3o0Var) {
        long jM201357J = w3o0Var.m201357J();
        if (jM201357J > uvr.m196087d().m162676J1()) {
            VoiceChatInputView.f53019t = uvr.m196087d().m162674I1();
        } else {
            VoiceChatInputView.f53019t = 1000;
        }
        if (jM201357J > uvr.m196087d().m162678K1()) {
            CommonMaskAvatarView.setEnableMask(false);
            CommonMaskAvatarView.setEnableAnimMask(false);
        } else if (jM201357J < ((double) uvr.m196087d().m162678K1()) * 0.75d) {
            CommonMaskAvatarView.setEnableMask(true);
            CommonMaskAvatarView.setEnableAnimMask(true);
        }
        String strM202218u = w8u.m202218u(R$string.f47593vi, Long.valueOf(w3o0Var.m201357J()));
        if (x8u.m207441k()) {
            strM202218u = String.valueOf(w3o0Var.m201357J());
        }
        this.f52290a.setText(strM202218u);
    }

    /* JADX INFO: renamed from: u */
    public void m76951u(boolean z) {
        xdl0.m208344M(this, z);
        if (z) {
            xdl0.m208344M(this.f52290a, true);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m76952v(double d) {
        this.f52290a.setText(String.valueOf(d));
    }

    public VoiceVirtualFansView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52293d = new PopupWindow();
    }

    public VoiceVirtualFansView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52293d = new PopupWindow();
    }
}
