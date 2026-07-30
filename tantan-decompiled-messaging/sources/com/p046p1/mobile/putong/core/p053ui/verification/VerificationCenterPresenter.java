package com.p046p1.mobile.putong.core.p053ui.verification;

import android.os.Bundle;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PicVerificationInfo;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.core.p053ui.verification.VerificationCenterPresenter;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.MediaLocalStatus;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.StudentVerificationStatus;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p149l.e30;
import p149l.j760;
import p149l.jq2;
import p149l.mcr;
import p149l.mkd0;
import p149l.p420;
import p149l.pgm;
import p149l.rhi;
import p149l.roj0;
import p149l.rwk0;
import p149l.v9j;
import p149l.w9j;
import p149l.x9j;
import p149l.zb0;
import p149l.zbi0;

/* JADX INFO: loaded from: classes9.dex */
public class VerificationCenterPresenter extends jq2<C8922a> {

    /* JADX INFO: renamed from: a */
    public VerificationCenter f36647a;

    /* JADX INFO: renamed from: b */
    public StudentVerificationStatus f36648b;

    /* JADX INFO: renamed from: c */
    public StudentVerificationStatus f36649c;

    /* JADX INFO: renamed from: d */
    public StudentVerificationStatus f36650d;

    /* JADX INFO: renamed from: e */
    public StudentVerificationStatus f36651e;

    public enum VerificationType {
        STUDENT,
        PIC,
        AGE
    }

    public VerificationCenterPresenter(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m55998g0(Throwable th) {
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ void m56002k0(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m56004m0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m56005p0(Bundle bundle) {
        boolean zM217809f = zb0.m217809f();
        V v2 = this.viewModel;
        if (zM217809f) {
            ((C8922a) v2).m56059P(true);
        } else {
            ((C8922a) v2).m56059P(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m56006q0(j760 j760Var) {
        ((C8922a) this.viewModel).m56060Q(false);
        VerificationCenter verificationCenter = (VerificationCenter) j760Var.f116565b;
        this.f36647a = verificationCenter;
        if (NullChecker.m81303a(verificationCenter) && NullChecker.m81303a(this.f36647a.picVerificationInfo)) {
            this.f36649c = this.f36647a.picVerificationInfo.status;
        }
        ((C8922a) this.viewModel).m56058O(VerificationType.PIC);
        if (zb0.m217809f() && NullChecker.m81303a(this.f36647a) && NullChecker.m81303a(this.f36647a.ageVerificationInfo)) {
            this.f36651e = this.f36647a.ageVerificationInfo.status;
            ((C8922a) this.viewModel).m56058O(VerificationType.AGE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m56007r0(C4319c c4319c) {
        act().progressDismiss();
        rwk0.f161351a = true;
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.jtk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f119645a.m56005p0((Bundle) obj);
            }
        });
        duringCreated(mkd0.m154984r(CoreModule.f17545c.f19639e0.m169523o9(), CoreModule.f17545c.f19552B0.m31611j4(), new x9j() { // from class: l.ktk0
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return vwb.m200311Y((User) obj, (VerificationCenter) obj2);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.ltk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f129977a.m56006q0((j760) obj);
            }
        }));
        duringCreated(new v9j() { // from class: l.mtk0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return CoreModule.f17545c.f19552B0.m31617p4(CoreModule.m29931H().userId());
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.ntk0
            @Override // p149l.e30
            public final void call(Object obj) {
                VerificationCenterPresenter.m56002k0((roj0) obj);
            }
        }, new e30() { // from class: l.otk0
            @Override // p149l.e30
            public final void call(Object obj) {
                VerificationCenterPresenter.m55998g0((Throwable) obj);
            }
        }));
        duringCreated(lifecycle()).filter(new w9j() { // from class: l.ptk0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
            }
        }).skip(1).subscribe(mkd0.m154956H(new e30() { // from class: l.qtk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f156369a.m56007r0((C4319c) obj);
            }
        }, new e30() { // from class: l.rtk0
            @Override // p149l.e30
            public final void call(Object obj) {
                VerificationCenterPresenter.m56004m0((Throwable) obj);
            }
        }));
        p420.m167354t(act());
    }

    @Override // p149l.q0m
    public void destroy() {
    }

    /* JADX INFO: renamed from: n0 */
    public StudentVerificationStatus m56008n0() {
        return this.f36651e;
    }

    /* JADX INFO: renamed from: o0 */
    public StudentVerificationStatus m56009o0() {
        return this.f36650d;
    }

    /* JADX INFO: renamed from: s0 */
    public void m56010s0(String str) {
        Picture picture = new Picture();
        picture.url = rhi.m179355B(str);
        picture.status = MediaLocalStatus.get("raw");
        picture.size = new Dimension(new pgm(rhi.m179382z(picture.url)).f148730d);
        if (this.f36647a == null) {
            VerificationCenter verificationCenter = new VerificationCenter();
            this.f36647a = verificationCenter;
            verificationCenter.picVerificationInfo = new PicVerificationInfo();
        }
        this.f36647a.picVerificationInfo.media = picture;
        zbi0.m217858G(act(), false, true, picture, this.f36647a);
    }
}
