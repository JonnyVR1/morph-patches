package com.p000p1.mobile.putong.core.newui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Space;
import com.p000p1.mobile.putong.core.newui.view.WechatNotifyBannerView;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.WechatMicroProgramLaunchInfo;
import com.p1.mobile.putong.core.data.WechatNotifySetting;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.eqh0;
import l.jmp0;
import l.upa;
import l.x2c0;
import l.xdl0;
import l.zvf0;
import p009l.g70;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class WechatNotifyBannerView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public WechatNotifyBannerView f5817a;

    /* JADX INFO: renamed from: b */
    public VImage f5818b;

    /* JADX INFO: renamed from: c */
    public VText f5819c;

    /* JADX INFO: renamed from: d */
    public VText f5820d;

    /* JADX INFO: renamed from: e */
    public Space f5821e;

    /* JADX INFO: renamed from: f */
    public VImage f5822f;

    public WechatNotifyBannerView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m8070a(d30 d30Var, View view) {
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m8071b(WechatNotifySetting wechatNotifySetting, View view) {
        WechatMicroProgramLaunchInfo wechatMicroProgramLaunchInfo = wechatNotifySetting.wechatLaunch;
        if (wechatMicroProgramLaunchInfo != null) {
            g70.INSTANCE.m14794a(wechatMicroProgramLaunchInfo.userName, wechatMicroProgramLaunchInfo.path);
        }
        zvf0.r("e_open_wechat_notification", "p_messages_view");
    }

    /* JADX INFO: renamed from: c */
    public final void m8072c(View view) {
        jmp0.a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public void m8073d(final WechatNotifySetting wechatNotifySetting, final d30 d30Var) {
        String str = "他";
        if (!CoreModule.P().a().eg() && (CoreModule.P().a().N8() || !CoreModule.c.e0.na().isFemale())) {
            str = "她";
        }
        this.f5819c.setText(String.format("在微信上接收通知，不错过%s的消息，", str));
        xdl0.E0(this, new View.OnClickListener() { // from class: l.hmp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WechatNotifyBannerView.m8071b(wechatNotifySetting, view);
            }
        });
        xdl0.E0(this.f5822f, new View.OnClickListener() { // from class: l.imp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WechatNotifyBannerView.m8070a(d30Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public void m8074e() {
        zvf0.x("e_open_wechat_notification", "p_messages_view");
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m8072c(this);
        this.f5819c.setTypeface(eqh0.c(3), 1);
        this.f5820d.setTypeface(eqh0.c(3), 1);
        if (upa.z()) {
            this.f5822f.setImageResource(x2c0.Ff);
        }
    }

    public WechatNotifyBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WechatNotifyBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
