package com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.core.p058ui.VText_Medium;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopFragmentFactory;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p151v.VImage;
import p151v.VText;
import p153l.adc0;
import p153l.bnl0;
import p153l.dbc0;
import p153l.i4g0;
import p153l.kec0;
import p153l.pq4;
import p153l.psd0;
import p153l.qcj;
import p153l.r1j0;
import p153l.y20;

/* JADX INFO: loaded from: classes4.dex */
public class ExpProfileLoopCustomVerificationTypeFrag extends ExpProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: F */
    public View f34188F;

    /* JADX INFO: renamed from: G */
    public View f34189G;

    /* JADX INFO: renamed from: H */
    public VImage f34190H;

    /* JADX INFO: renamed from: I */
    public VImage f34191I;

    /* JADX INFO: renamed from: J */
    public VImage f34192J;

    /* JADX INFO: renamed from: K */
    public VText_Medium f34193K;

    /* JADX INFO: renamed from: L */
    public VText_Medium f34194L;

    /* JADX INFO: renamed from: M */
    public VText_Medium f34195M;

    /* JADX INFO: renamed from: N */
    public VText f34196N;

    /* JADX INFO: renamed from: O */
    public VText f34197O;

    /* JADX INFO: renamed from: P */
    public VText f34198P;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y4 */
    public /* synthetic */ void m52542Y4(View view) {
        i4g0.m138520r("e_go_verify", "p_avatar_verify");
        VerificationCenter verificationCenterM32615k4 = CoreModule.f18264c.f20294B0.m32615k4();
        if (NullChecker.m82486a(verificationCenterM32615k4) && TEnum.equals(verificationCenterM32615k4.picVerificationInfo.status, "verified")) {
            r1j0.m179420g("已认证");
            m52426M4().m52414b2().m110171q0();
        } else if (!NullChecker.m82486a(verificationCenterM32615k4) || !TEnum.equals(verificationCenterM32615k4.picVerificationInfo.status, "pending")) {
            pq4.m173307o(act());
        } else {
            r1j0.m179420g("正在审核中");
            m52426M4().m52414b2().m110171q0();
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: O4 */
    public View mo52429O4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(kec0.f125563P2, viewGroup, false);
        this.f34188F = viewInflate;
        this.f34189G = viewInflate.findViewById(adc0.f69992L0);
        this.f34190H = (VImage) this.f34188F.findViewById(adc0.f70638x5);
        this.f34191I = (VImage) this.f34188F.findViewById(adc0.f70672z5);
        this.f34192J = (VImage) this.f34188F.findViewById(adc0.f69827B5);
        this.f34193K = (VText_Medium) this.f34188F.findViewById(adc0.f70426ke);
        this.f34194L = (VText_Medium) this.f34188F.findViewById(adc0.f70443le);
        this.f34195M = (VText_Medium) this.f34188F.findViewById(adc0.f70460me);
        this.f34196N = (VText) this.f34188F.findViewById(adc0.f70290cd);
        this.f34197O = (VText) this.f34188F.findViewById(adc0.f70307dd);
        this.f34198P = (VText) this.f34188F.findViewById(adc0.f70324ed);
        return this.f34188F;
    }

    /* JADX INFO: renamed from: Z4 */
    public final /* synthetic */ void m52543Z4(VerificationCenter verificationCenter) {
        m52426M4().m52414b2().m110171q0();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        if (this.f34132z == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_MY_TAB_OPT) {
            this.f34190H.setImageResource(dbc0.f86265J0);
            this.f34191I.setImageResource(dbc0.f86297K0);
            this.f34192J.setImageResource(dbc0.f86329L0);
            this.f34193K.setText("更快认识合适的人");
            this.f34194L.setText("隐私保护升级");
            this.f34195M.setText("获得认证标识");
            this.f34196N.setText("获得只看认证用户、优先推荐权益");
            this.f34197O.setText("认证后，你的真实信息将被更好保护");
            this.f34198P.setText("个人资料上会显示头像本人认证标识");
        }
        bnl0.m105509E0(this.f34189G, new View.OnClickListener() { // from class: l.qif
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f157835a.m52542Y4(view);
            }
        });
        act().duringCreated(CoreModule.f18264c.f20294B0.m32614j4().distinctUntilChanged().skip(1).filter(new qcj() { // from class: l.rif
            @Override // p153l.qcj
            public final Object call(Object obj) {
                VerificationCenter verificationCenter = (VerificationCenter) obj;
                return Boolean.valueOf(verificationCenter != null && TEnum.equals(verificationCenter.picVerificationInfo.status, "pending"));
            }
        }).take(1)).subscribe(psd0.m173596G(new y20() { // from class: l.sif
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f168819a.m52543Z4((VerificationCenter) obj);
            }
        }));
    }
}
