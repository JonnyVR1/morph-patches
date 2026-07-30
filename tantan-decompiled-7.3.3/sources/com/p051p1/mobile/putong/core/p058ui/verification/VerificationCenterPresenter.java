package com.p051p1.mobile.putong.core.p058ui.verification;

import android.os.Bundle;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PicVerificationInfo;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.core.p058ui.verification.VerificationCenterPresenter;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.MediaLocalStatus;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.StudentVerificationStatus;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p153l.ar2;
import p153l.ner;
import p153l.oki;
import p153l.pcj;
import p153l.pf60;
import p153l.psd0;
import p153l.qcj;
import p153l.rcj;
import p153l.sim;
import p153l.uxj0;
import p153l.vb0;
import p153l.x5l0;
import p153l.xc20;
import p153l.y20;
import p153l.zki0;

/* JADX INFO: loaded from: classes12.dex */
public class VerificationCenterPresenter extends ar2<C9085a> {

    /* JADX INFO: renamed from: a */
    public VerificationCenter f37495a;

    /* JADX INFO: renamed from: b */
    public StudentVerificationStatus f37496b;

    /* JADX INFO: renamed from: c */
    public StudentVerificationStatus f37497c;

    /* JADX INFO: renamed from: d */
    public StudentVerificationStatus f37498d;

    /* JADX INFO: renamed from: e */
    public StudentVerificationStatus f37499e;

    public enum VerificationType {
        STUDENT,
        PIC,
        AGE
    }

    public VerificationCenterPresenter(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m57181g0(Throwable th) {
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ void m57185k0(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m57187m0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m57188p0(Bundle bundle) {
        boolean zM200644f = vb0.m200644f();
        V v2 = this.viewModel;
        if (zM200644f) {
            ((C9085a) v2).m57242P(true);
        } else {
            ((C9085a) v2).m57242P(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m57189q0(pf60 pf60Var) {
        ((C9085a) this.viewModel).m57243Q(false);
        VerificationCenter verificationCenter = (VerificationCenter) pf60Var.f152157b;
        this.f37495a = verificationCenter;
        if (NullChecker.m82486a(verificationCenter) && NullChecker.m82486a(this.f37495a.picVerificationInfo)) {
            this.f37497c = this.f37495a.picVerificationInfo.status;
        }
        ((C9085a) this.viewModel).m57241O(VerificationType.PIC);
        if (vb0.m200644f() && NullChecker.m82486a(this.f37495a) && NullChecker.m82486a(this.f37495a.ageVerificationInfo)) {
            this.f37499e = this.f37495a.ageVerificationInfo.status;
            ((C9085a) this.viewModel).m57241O(VerificationType.AGE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m57190r0(C4470c c4470c) {
        act().progressDismiss();
        x5l0.f192502a = true;
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.p2l0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f150279a.m57188p0((Bundle) obj);
            }
        });
        duringCreated(psd0.m173625r(CoreModule.f18264c.f20381e0.m116596o9(), CoreModule.f18264c.f20294B0.m32614j4(), new rcj() { // from class: l.q2l0
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return jyb.m147494Y((User) obj, (VerificationCenter) obj2);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.r2l0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f160950a.m57189q0((pf60) obj);
            }
        }));
        duringCreated(new pcj() { // from class: l.s2l0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return CoreModule.f18264c.f20294B0.m32620p4(CoreModule.m30929H().userId());
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.t2l0
            @Override // p153l.y20
            public final void call(Object obj) {
                VerificationCenterPresenter.m57185k0((uxj0) obj);
            }
        }, new y20() { // from class: l.u2l0
            @Override // p153l.y20
            public final void call(Object obj) {
                VerificationCenterPresenter.m57181g0((Throwable) obj);
            }
        }));
        duringCreated(lifecycle()).filter(new qcj() { // from class: l.v2l0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
            }
        }).skip(1).subscribe(psd0.m173597H(new y20() { // from class: l.w2l0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f186915a.m57190r0((C4470c) obj);
            }
        }, new y20() { // from class: l.x2l0
            @Override // p153l.y20
            public final void call(Object obj) {
                VerificationCenterPresenter.m57187m0((Throwable) obj);
            }
        }));
        xc20.m210108t(act());
    }

    @Override // p153l.k3m
    public void destroy() {
    }

    /* JADX INFO: renamed from: n0 */
    public StudentVerificationStatus m57191n0() {
        return this.f37499e;
    }

    /* JADX INFO: renamed from: o0 */
    public StudentVerificationStatus m57192o0() {
        return this.f37498d;
    }

    /* JADX INFO: renamed from: s0 */
    public void m57193s0(String str) {
        Picture picture = new Picture();
        picture.url = oki.m168011B(str);
        picture.status = MediaLocalStatus.get("raw");
        picture.size = new Dimension(new sim(oki.m168038z(picture.url)).f168843d);
        if (this.f37495a == null) {
            VerificationCenter verificationCenter = new VerificationCenter();
            this.f37495a = verificationCenter;
            verificationCenter.picVerificationInfo = new PicVerificationInfo();
        }
        this.f37495a.picVerificationInfo.media = picture;
        zki0.m220078G(act(), false, true, picture, this.f37495a);
    }
}
