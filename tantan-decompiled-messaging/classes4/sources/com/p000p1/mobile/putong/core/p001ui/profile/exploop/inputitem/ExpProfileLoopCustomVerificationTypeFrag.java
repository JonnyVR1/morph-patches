package com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopFragmentFactory;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.putong.core.ui.VText_Medium;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.f6c0;
import l.mkd0;
import l.osi0;
import l.qp4;
import l.u4c0;
import l.w9j;
import l.x2c0;
import l.xdl0;
import l.zvf0;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ExpProfileLoopCustomVerificationTypeFrag extends ExpProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: F */
    public View f1162F;

    /* JADX INFO: renamed from: G */
    public View f1163G;

    /* JADX INFO: renamed from: H */
    public VImage f1164H;

    /* JADX INFO: renamed from: I */
    public VImage f1165I;

    /* JADX INFO: renamed from: J */
    public VImage f1166J;

    /* JADX INFO: renamed from: K */
    public VText_Medium f1167K;

    /* JADX INFO: renamed from: L */
    public VText_Medium f1168L;

    /* JADX INFO: renamed from: M */
    public VText_Medium f1169M;

    /* JADX INFO: renamed from: N */
    public VText f1170N;

    /* JADX INFO: renamed from: O */
    public VText f1171O;

    /* JADX INFO: renamed from: P */
    public VText f1172P;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y4 */
    public /* synthetic */ void m1833Y4(View view) {
        zvf0.r("e_go_verify", "p_avatar_verify");
        VerificationCenter verificationCenterK4 = CoreModule.c.B0.k4();
        if (NullChecker.a(verificationCenterK4) && TEnum.equals(verificationCenterK4.picVerificationInfo.status, "verified")) {
            osi0.g("已认证");
            m1698M4().m1686a2().m24655q0();
        } else if (!NullChecker.a(verificationCenterK4) || !TEnum.equals(verificationCenterK4.picVerificationInfo.status, "pending")) {
            qp4.o(act());
        } else {
            osi0.g("正在审核中");
            m1698M4().m1686a2().m24655q0();
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: O4 */
    public View mo1701O4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(f6c0.P2, viewGroup, false);
        this.f1162F = viewInflate;
        this.f1163G = viewInflate.findViewById(u4c0.L0);
        this.f1164H = this.f1162F.findViewById(u4c0.v5);
        this.f1165I = this.f1162F.findViewById(u4c0.x5);
        this.f1166J = this.f1162F.findViewById(u4c0.z5);
        this.f1167K = this.f1162F.findViewById(u4c0.he);
        this.f1168L = this.f1162F.findViewById(u4c0.ie);
        this.f1169M = this.f1162F.findViewById(u4c0.je);
        this.f1170N = this.f1162F.findViewById(u4c0.ad);
        this.f1171O = this.f1162F.findViewById(u4c0.bd);
        this.f1172P = this.f1162F.findViewById(u4c0.cd);
        return this.f1162F;
    }

    /* JADX INFO: renamed from: Z4 */
    public final /* synthetic */ void m1834Z4(VerificationCenter verificationCenter) {
        m1698M4().m1686a2().m24655q0();
    }

    /* JADX INFO: renamed from: g4 */
    public void m1835g4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.g4(bundle);
        if (this.f1106z == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_MY_TAB_OPT) {
            this.f1164H.setImageResource(x2c0.I0);
            this.f1165I.setImageResource(x2c0.J0);
            this.f1166J.setImageResource(x2c0.K0);
            this.f1167K.setText("更快认识合适的人");
            this.f1168L.setText("隐私保护升级");
            this.f1169M.setText("获得认证标识");
            this.f1170N.setText("获得只看认证用户、优先推荐权益");
            this.f1171O.setText("认证后，你的真实信息将被更好保护");
            this.f1172P.setText("个人资料上会显示头像本人认证标识");
        }
        xdl0.E0(this.f1163G, new View.OnClickListener() { // from class: l.khf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14330a.m1833Y4(view);
            }
        });
        act().duringCreated(CoreModule.c.B0.j4().distinctUntilChanged().skip(1).filter(new w9j() { // from class: l.lhf
            public final Object call(Object obj) {
                VerificationCenter verificationCenter = (VerificationCenter) obj;
                return Boolean.valueOf(verificationCenter != null && TEnum.equals(verificationCenter.picVerificationInfo.status, "pending"));
            }
        }).take(1)).subscribe(mkd0.G(new e30() { // from class: l.mhf
            public final void call(Object obj) {
                this.f15386a.m1834Z4((VerificationCenter) obj);
            }
        }));
    }
}
