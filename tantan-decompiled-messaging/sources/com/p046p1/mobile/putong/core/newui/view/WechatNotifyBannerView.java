package com.p046p1.mobile.putong.core.newui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Space;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.WechatMicroProgramLaunchInfo;
import com.p046p1.mobile.putong.core.data.WechatNotifySetting;
import com.p046p1.mobile.putong.core.newui.view.WechatNotifyBannerView;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.tantanapp.common.utils.NullChecker;
import p147v.VImage;
import p147v.VText;
import p149l.d30;
import p149l.eqh0;
import p149l.g70;
import p149l.jmp0;
import p149l.upa;
import p149l.x2c0;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class WechatNotifyBannerView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public WechatNotifyBannerView f27039a;

    /* JADX INFO: renamed from: b */
    public VImage f27040b;

    /* JADX INFO: renamed from: c */
    public VText f27041c;

    /* JADX INFO: renamed from: d */
    public VText f27042d;

    /* JADX INFO: renamed from: e */
    public Space f27043e;

    /* JADX INFO: renamed from: f */
    public VImage f27044f;

    public WechatNotifyBannerView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m43806a(d30 d30Var, View view) {
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m43807b(WechatNotifySetting wechatNotifySetting, View view) {
        WechatMicroProgramLaunchInfo wechatMicroProgramLaunchInfo = wechatNotifySetting.wechatLaunch;
        if (wechatMicroProgramLaunchInfo != null) {
            g70.INSTANCE.m124682a(wechatMicroProgramLaunchInfo.userName, wechatMicroProgramLaunchInfo.path);
        }
        zvf0.m220396r("e_open_wechat_notification", OMSDialogPositon.p_messages_view);
    }

    /* JADX INFO: renamed from: c */
    public final void m43808c(View view) {
        jmp0.m142218a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public void m43809d(final WechatNotifySetting wechatNotifySetting, final d30 d30Var) {
        String str = "他";
        if (!CoreModule.m29935P().m94651a().mo33491eg() && (CoreModule.m29935P().m94651a().mo33374N8() || !CoreModule.f17545c.f19639e0.m169520na().isFemale())) {
            str = "她";
        }
        this.f27041c.setText(String.format("在微信上接收通知，不错过%s的消息，", str));
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.hmp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WechatNotifyBannerView.m43807b(wechatNotifySetting, view);
            }
        });
        xdl0.m208329E0(this.f27044f, new View.OnClickListener() { // from class: l.imp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WechatNotifyBannerView.m43806a(d30Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public void m43810e() {
        zvf0.m220402x("e_open_wechat_notification", OMSDialogPositon.p_messages_view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m43808c(this);
        this.f27041c.setTypeface(eqh0.m117752c(3), 1);
        this.f27042d.setTypeface(eqh0.m117752c(3), 1);
        if (upa.m194847z()) {
            this.f27044f.setImageResource(x2c0.f189329Ff);
        }
    }

    public WechatNotifyBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WechatNotifyBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
