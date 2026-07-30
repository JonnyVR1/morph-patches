package com.p051p1.mobile.putong.core.newui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Space;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.WechatMicroProgramLaunchInfo;
import com.p051p1.mobile.putong.core.data.WechatNotifySetting;
import com.p051p1.mobile.putong.core.newui.view.WechatNotifyBannerView;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.tantanapp.common.utils.NullChecker;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.c70;
import p153l.dbc0;
import p153l.gra;
import p153l.i4g0;
import p153l.lyh0;
import p153l.nvp0;
import p153l.x20;

/* JADX INFO: loaded from: classes11.dex */
public class WechatNotifyBannerView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public WechatNotifyBannerView f27887a;

    /* JADX INFO: renamed from: b */
    public VImage f27888b;

    /* JADX INFO: renamed from: c */
    public VText f27889c;

    /* JADX INFO: renamed from: d */
    public VText f27890d;

    /* JADX INFO: renamed from: e */
    public Space f27891e;

    /* JADX INFO: renamed from: f */
    public VImage f27892f;

    public WechatNotifyBannerView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m44992a(x20 x20Var, View view) {
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m44993b(WechatNotifySetting wechatNotifySetting, View view) {
        WechatMicroProgramLaunchInfo wechatMicroProgramLaunchInfo = wechatNotifySetting.wechatLaunch;
        if (wechatMicroProgramLaunchInfo != null) {
            c70.INSTANCE.m108261a(wechatMicroProgramLaunchInfo.userName, wechatMicroProgramLaunchInfo.path);
        }
        i4g0.m138520r("e_open_wechat_notification", OMSDialogPositon.p_messages_view);
    }

    /* JADX INFO: renamed from: c */
    public final void m44994c(View view) {
        nvp0.m164910a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public void m44995d(final WechatNotifySetting wechatNotifySetting, final x20 x20Var) {
        String str = "他";
        if (!CoreModule.m30933P().m143405a().mo34494eg() && (CoreModule.m30933P().m143405a().mo34377N8() || !CoreModule.f18264c.f20381e0.m116593na().isFemale())) {
            str = "她";
        }
        this.f27889c.setText(String.format("在微信上接收通知，不错过%s的消息，", str));
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.lvp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WechatNotifyBannerView.m44993b(wechatNotifySetting, view);
            }
        });
        bnl0.m105509E0(this.f27892f, new View.OnClickListener() { // from class: l.mvp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WechatNotifyBannerView.m44992a(x20Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public void m44996e() {
        i4g0.m138526x("e_open_wechat_notification", OMSDialogPositon.p_messages_view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m44994c(this);
        this.f27889c.setTypeface(lyh0.m156283c(3), 1);
        this.f27890d.setTypeface(lyh0.m156283c(3), 1);
        if (gra.m131778z()) {
            this.f27892f.setImageResource(dbc0.f87449tg);
        }
    }

    public WechatNotifyBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WechatNotifyBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
