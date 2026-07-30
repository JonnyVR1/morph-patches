package com.p000p1.mobile.putong.core.p004ui.verification;

import android.os.Bundle;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.verification.VerificationCenterPresenter;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.data.PicVerificationInfo;
import com.p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.putong.data.Dimension;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.MediaLocalStatus;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.StudentVerificationStatus;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.j760;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.pgm;
import l.rhi;
import l.roj0;
import l.s7m;
import l.v9j;
import l.vwb;
import l.w9j;
import l.x9j;
import p006l.p420;
import p006l.rwk0;
import p006l.zb0;
import p006l.zbi0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class VerificationCenterPresenter extends jq2<C0358a> {

    /* JADX INFO: renamed from: a */
    public VerificationCenter f6428a;

    /* JADX INFO: renamed from: b */
    public StudentVerificationStatus f6429b;

    /* JADX INFO: renamed from: c */
    public StudentVerificationStatus f6430c;

    /* JADX INFO: renamed from: d */
    public StudentVerificationStatus f6431d;

    /* JADX INFO: renamed from: e */
    public StudentVerificationStatus f6432e;

    public enum VerificationType {
        STUDENT,
        PIC,
        AGE
    }

    public VerificationCenterPresenter(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m9420g0(Throwable th) {
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ void m9424k0(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m9426m0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m9427p0(Bundle bundle) {
        boolean zM28639f = zb0.m28639f();
        s7m s7mVar = ((jq2) this).viewModel;
        if (zM28639f) {
            ((C0358a) s7mVar).m9483P(true);
        } else {
            ((C0358a) s7mVar).m9483P(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m9428q0(j760 j760Var) {
        ((C0358a) ((jq2) this).viewModel).m9484Q(false);
        VerificationCenter verificationCenter = (VerificationCenter) j760Var.b;
        this.f6428a = verificationCenter;
        if (NullChecker.a(verificationCenter) && NullChecker.a(this.f6428a.picVerificationInfo)) {
            this.f6430c = this.f6428a.picVerificationInfo.status;
        }
        ((C0358a) ((jq2) this).viewModel).m9482O(VerificationType.PIC);
        if (zb0.m28639f() && NullChecker.a(this.f6428a) && NullChecker.a(this.f6428a.ageVerificationInfo)) {
            this.f6432e = this.f6428a.ageVerificationInfo.status;
            ((C0358a) ((jq2) this).viewModel).m9482O(VerificationType.AGE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m9429r0(c cVar) {
        act().progressDismiss();
        rwk0.f20826a = true;
    }

    /* JADX INFO: renamed from: a0 */
    public void m9430a0() {
        creates(new e30() { // from class: l.jtk0
            public final void call(Object obj) {
                this.f15397a.m9427p0((Bundle) obj);
            }
        });
        duringCreated(mkd0.r(CoreModule.f1534c.f3628e0.m21486o9(), CoreModule.f1534c.f3541B0.m3541j4(), new x9j() { // from class: l.ktk0
            public final Object call(Object obj, Object obj2) {
                return vwb.Y((User) obj, (VerificationCenter) obj2);
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.ltk0
            public final void call(Object obj) {
                this.f16645a.m9428q0((j760) obj);
            }
        }));
        duringCreated(new v9j() { // from class: l.mtk0
            public final Object call() {
                return CoreModule.f1534c.f3541B0.m3547p4(CoreModule.m1850H().userId());
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.ntk0
            public final void call(Object obj) {
                VerificationCenterPresenter.m9424k0((roj0) obj);
            }
        }, new e30() { // from class: l.otk0
            public final void call(Object obj) {
                VerificationCenterPresenter.m9420g0((Throwable) obj);
            }
        }));
        duringCreated(lifecycle()).filter(new w9j() { // from class: l.ptk0
            public final Object call(Object obj) {
                return Boolean.valueOf(((c) obj) == c.i);
            }
        }).skip(1).subscribe(mkd0.H(new e30() { // from class: l.qtk0
            public final void call(Object obj) {
                this.f20059a.m9429r0((c) obj);
            }
        }, new e30() { // from class: l.rtk0
            public final void call(Object obj) {
                VerificationCenterPresenter.m9426m0((Throwable) obj);
            }
        }));
        p420.m21036t(act());
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: n0 */
    public StudentVerificationStatus m9431n0() {
        return this.f6432e;
    }

    /* JADX INFO: renamed from: o0 */
    public StudentVerificationStatus m9432o0() {
        return this.f6431d;
    }

    /* JADX INFO: renamed from: s0 */
    public void m9433s0(String str) {
        Picture picture = new Picture();
        ((Media) picture).url = rhi.B(str);
        ((Media) picture).status = MediaLocalStatus.get("raw");
        picture.size = new Dimension(new pgm(rhi.z(((Media) picture).url)).d);
        if (this.f6428a == null) {
            VerificationCenter verificationCenter = new VerificationCenter();
            this.f6428a = verificationCenter;
            verificationCenter.picVerificationInfo = new PicVerificationInfo();
        }
        this.f6428a.picVerificationInfo.media = picture;
        zbi0.m28649G(act(), false, true, picture, this.f6428a);
    }
}
