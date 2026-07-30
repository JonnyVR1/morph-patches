package p153l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLivePopupConfig;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes9.dex */
public class bvk0 extends lbl0 {
    private BLivePopupConfig popupConfig;

    @Override // p153l.lbl0
    /* JADX INFO: renamed from: a */
    public void mo96996a(Act act) {
        super.mo96996a(act);
        BLivePopupConfig bLivePopupConfig = this.popupConfig;
        if (bLivePopupConfig == null || TextUtils.isEmpty(bLivePopupConfig.title)) {
            m153583e(act);
        } else {
            m106578p(act, this.popupConfig);
        }
    }

    @Override // p153l.lbl0
    /* JADX INFO: renamed from: f */
    public String mo96997f() {
        return "VChatCouponChecker";
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m106575m(jl80 jl80Var, Act act, View view) {
        jl80Var.dismiss();
        m153583e(act);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m106576n(jl80 jl80Var, Act act, View view) {
        jl80Var.dismiss();
        m153583e(act);
    }

    /* JADX INFO: renamed from: o */
    public bvk0 m106577o(BLivePopupConfig bLivePopupConfig) {
        this.popupConfig = bLivePopupConfig;
        return this;
    }

    /* JADX INFO: renamed from: p */
    public final void m106578p(final Act act, BLivePopupConfig bLivePopupConfig) {
        View viewInflate = LayoutInflater.from(act).inflate(xec0.f193827V0, (ViewGroup) null);
        final jl80 jl80VarM146020O = new jl80.C17971a(act).m146023R(viewInflate).m146020O();
        viewInflate.findViewById(ldc0.f131466I).setOnClickListener(new View.OnClickListener() { // from class: l.zuk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f206134a.m106575m(jl80VarM146020O, act, view);
            }
        });
        viewInflate.findViewById(ldc0.f131458G).setOnClickListener(new View.OnClickListener() { // from class: l.avk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f73627a.m106576n(jl80VarM146020O, act, view);
            }
        });
        ((TextView) viewInflate.findViewById(ldc0.f131500R1)).setText(bLivePopupConfig.title);
        ((TextView) viewInflate.findViewById(ldc0.f131486N)).setText(bLivePopupConfig.content);
        ((TextView) viewInflate.findViewById(ldc0.f131466I)).setText(bLivePopupConfig.button);
        izs.m142868s("context_square", (VDraweeView) viewInflate.findViewById(ldc0.f131606u0), bLivePopupConfig.picture);
        jl80VarM146020O.setCanceledOnTouchOutside(false);
        jl80VarM146020O.show();
        i4g0.m138526x("e_live_video_call_coupon_pop", "p_live_video_quickchat");
    }
}
