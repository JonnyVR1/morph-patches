package p149l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLivePopupConfig;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes13.dex */
public class vlk0 extends g2l0 {
    private BLivePopupConfig popupConfig;

    @Override // p149l.g2l0
    /* JADX INFO: renamed from: a */
    public void mo94566a(Act act) {
        super.mo94566a(act);
        BLivePopupConfig bLivePopupConfig = this.popupConfig;
        if (bLivePopupConfig == null || TextUtils.isEmpty(bLivePopupConfig.title)) {
            m124169e(act);
        } else {
            m198808p(act, this.popupConfig);
        }
    }

    @Override // p149l.g2l0
    /* JADX INFO: renamed from: f */
    public String mo94567f() {
        return "VChatCouponChecker";
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m198805m(dd80 dd80Var, Act act, View view) {
        dd80Var.dismiss();
        m124169e(act);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m198806n(dd80 dd80Var, Act act, View view) {
        dd80Var.dismiss();
        m124169e(act);
    }

    /* JADX INFO: renamed from: o */
    public vlk0 m198807o(BLivePopupConfig bLivePopupConfig) {
        this.popupConfig = bLivePopupConfig;
        return this;
    }

    /* JADX INFO: renamed from: p */
    public final void m198808p(final Act act, BLivePopupConfig bLivePopupConfig) {
        View viewInflate = LayoutInflater.from(act).inflate(s6c0.f162713V0, (ViewGroup) null);
        final dd80 dd80VarM110960O = new dd80.C16336a(act).m110963R(viewInflate).m110960O();
        viewInflate.findViewById(f5c0.f95009I).setOnClickListener(new View.OnClickListener() { // from class: l.tlk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f171028a.m198805m(dd80VarM110960O, act, view);
            }
        });
        viewInflate.findViewById(f5c0.f95001G).setOnClickListener(new View.OnClickListener() { // from class: l.ulk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f177072a.m198806n(dd80VarM110960O, act, view);
            }
        });
        ((TextView) viewInflate.findViewById(f5c0.f95043R1)).setText(bLivePopupConfig.title);
        ((TextView) viewInflate.findViewById(f5c0.f95029N)).setText(bLivePopupConfig.content);
        ((TextView) viewInflate.findViewById(f5c0.f95009I)).setText(bLivePopupConfig.button);
        hxs.m133406s("context_square", (VDraweeView) viewInflate.findViewById(f5c0.f95149u0), bLivePopupConfig.picture);
        dd80VarM110960O.setCanceledOnTouchOutside(false);
        dd80VarM110960O.show();
        zvf0.m220402x("e_live_video_call_coupon_pop", "p_live_video_quickchat");
    }
}
