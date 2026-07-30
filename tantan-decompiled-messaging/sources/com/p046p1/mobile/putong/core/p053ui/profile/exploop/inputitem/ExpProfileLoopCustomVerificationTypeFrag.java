package com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopFragmentFactory;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p147v.VImage;
import p147v.VText;
import p149l.e30;
import p149l.f6c0;
import p149l.mkd0;
import p149l.osi0;
import p149l.qp4;
import p149l.u4c0;
import p149l.w9j;
import p149l.x2c0;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes4.dex */
public class ExpProfileLoopCustomVerificationTypeFrag extends ExpProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: F */
    public View f33340F;

    /* JADX INFO: renamed from: G */
    public View f33341G;

    /* JADX INFO: renamed from: H */
    public VImage f33342H;

    /* JADX INFO: renamed from: I */
    public VImage f33343I;

    /* JADX INFO: renamed from: J */
    public VImage f33344J;

    /* JADX INFO: renamed from: K */
    public VText_Medium f33345K;

    /* JADX INFO: renamed from: L */
    public VText_Medium f33346L;

    /* JADX INFO: renamed from: M */
    public VText_Medium f33347M;

    /* JADX INFO: renamed from: N */
    public VText f33348N;

    /* JADX INFO: renamed from: O */
    public VText f33349O;

    /* JADX INFO: renamed from: P */
    public VText f33350P;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y4 */
    public /* synthetic */ void m51359Y4(View view) {
        zvf0.m220396r("e_go_verify", "p_avatar_verify");
        VerificationCenter verificationCenterM31612k4 = CoreModule.f17545c.f19552B0.m31612k4();
        if (NullChecker.m81303a(verificationCenterM31612k4) && TEnum.equals(verificationCenterM31612k4.picVerificationInfo.status, "verified")) {
            osi0.m165783g("已认证");
            m51243M4().m51231a2().m203205q0();
        } else if (!NullChecker.m81303a(verificationCenterM31612k4) || !TEnum.equals(verificationCenterM31612k4.picVerificationInfo.status, "pending")) {
            qp4.m175809o(act());
        } else {
            osi0.m165783g("正在审核中");
            m51243M4().m51231a2().m203205q0();
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: O4 */
    public View mo51246O4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(f6c0.f95509P2, viewGroup, false);
        this.f33340F = viewInflate;
        this.f33341G = viewInflate.findViewById(u4c0.f173904L0);
        this.f33342H = (VImage) this.f33340F.findViewById(u4c0.f174513v5);
        this.f33343I = (VImage) this.f33340F.findViewById(u4c0.f174547x5);
        this.f33344J = (VImage) this.f33340F.findViewById(u4c0.f174581z5);
        this.f33345K = (VText_Medium) this.f33340F.findViewById(u4c0.f174285he);
        this.f33346L = (VText_Medium) this.f33340F.findViewById(u4c0.f174302ie);
        this.f33347M = (VText_Medium) this.f33340F.findViewById(u4c0.f174318je);
        this.f33348N = (VText) this.f33340F.findViewById(u4c0.f174165ad);
        this.f33349O = (VText) this.f33340F.findViewById(u4c0.f174182bd);
        this.f33350P = (VText) this.f33340F.findViewById(u4c0.f174199cd);
        return this.f33340F;
    }

    /* JADX INFO: renamed from: Z4 */
    public final /* synthetic */ void m51360Z4(VerificationCenter verificationCenter) {
        m51243M4().m51231a2().m203205q0();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        if (this.f33284z == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_MY_TAB_OPT) {
            this.f33342H.setImageResource(x2c0.f189408I0);
            this.f33343I.setImageResource(x2c0.f189439J0);
            this.f33344J.setImageResource(x2c0.f189470K0);
            this.f33345K.setText("更快认识合适的人");
            this.f33346L.setText("隐私保护升级");
            this.f33347M.setText("获得认证标识");
            this.f33348N.setText("获得只看认证用户、优先推荐权益");
            this.f33349O.setText("认证后，你的真实信息将被更好保护");
            this.f33350P.setText("个人资料上会显示头像本人认证标识");
        }
        xdl0.m208329E0(this.f33341G, new View.OnClickListener() { // from class: l.khf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f123144a.m51359Y4(view);
            }
        });
        act().duringCreated(CoreModule.f17545c.f19552B0.m31611j4().distinctUntilChanged().skip(1).filter(new w9j() { // from class: l.lhf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                VerificationCenter verificationCenter = (VerificationCenter) obj;
                return Boolean.valueOf(verificationCenter != null && TEnum.equals(verificationCenter.picVerificationInfo.status, "pending"));
            }
        }).take(1)).subscribe(mkd0.m154955G(new e30() { // from class: l.mhf
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f133814a.m51360Z4((VerificationCenter) obj);
            }
        }));
    }
}
