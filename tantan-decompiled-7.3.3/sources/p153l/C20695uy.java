package p153l;

import android.os.Bundle;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.account.p055ui.accountai.SignUpAiAct;
import com.p051p1.mobile.putong.account.p055ui.camera.AccountVideoRecordFrag;
import com.p051p1.mobile.putong.data.Media;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: renamed from: l.uy */
/* JADX INFO: loaded from: classes9.dex */
public class C20695uy extends ar2<r00> {

    /* JADX INFO: renamed from: c */
    public static boolean f181524c;

    /* JADX INFO: renamed from: d */
    public static boolean f181525d;

    /* JADX INFO: renamed from: e */
    public static boolean f181526e;

    /* JADX INFO: renamed from: f */
    public static boolean f181527f;

    /* JADX INFO: renamed from: a */
    public AccountVideoRecordFrag f181528a;

    /* JADX INFO: renamed from: b */
    public boolean f181529b;

    public C20695uy(AccountVideoRecordFrag accountVideoRecordFrag) {
        super(accountVideoRecordFrag);
        this.f181528a = accountVideoRecordFrag;
    }

    /* JADX INFO: renamed from: m0 */
    public void m198566m0(Bundle bundle) {
        creates(new y20() { // from class: l.ly
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134022a.m198567n0((Bundle) obj);
            }
        });
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.my
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f139308a.m198568o0((C4470c) obj);
            }
        }));
        duringCreated(C20574uh.m196005d().f178979f).observeOn(fo0.m126432a()).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.ny
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f144281a.m198569p0((Boolean) obj);
            }
        }));
        C20870vo.m202031j().m202034h();
        C20870vo.m202030f();
        ((r00) this.viewModel).m179149k1(bundle);
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m198567n0(Bundle bundle) {
        ((r00) this.viewModel).m179168r2();
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m198568o0(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            ((r00) this.viewModel).m179180v2();
        } else if (c4470c == C4470c.f16268j) {
            ((r00) this.viewModel).m179176u2();
        } else if (c4470c == C4470c.f16271m) {
            ((r00) this.viewModel).m179171s2();
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m198569p0(Boolean bool) {
        ((r00) this.viewModel).m179140g3(bool.booleanValue());
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m198570q0(uxj0 uxj0Var) {
        ((r00) this.viewModel).m179165q2();
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m198571r0(List list) {
        C18882nj.m163352C().m163393T(list);
        if (NullChecker.m82487b(this.viewModel)) {
            ((r00) this.viewModel).m179059C2(list);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m198572s0(pf60 pf60Var) {
        if (NullChecker.m82487b(this.viewModel)) {
            ((r00) this.viewModel).m179183w2((List) pf60Var.f152156a, (List) pf60Var.f152157b);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m198573t0(List list) {
        int size = list.size();
        V v2 = this.viewModel;
        if (size > 0) {
            ((r00) v2).m179115X2((Media) list.get(0));
        } else {
            ((r00) v2).m179115X2(null);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public void m198574u0() {
        if (this.f181529b) {
            return;
        }
        duringCreated(SignUpAiAct.f17074c.m154185L());
        duringCreated(SignUpAiAct.f17074c.m154177D(false)).subscribe(psd0.m173596G(new y20() { // from class: l.oy
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f149727a.m198570q0((uxj0) obj);
            }
        }));
        duringCreated(SignUpAiAct.f17074c.m154189z()).subscribe(psd0.m173596G(new y20() { // from class: l.py
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f154606a.m198571r0((List) obj);
            }
        }));
        act().duringCreated(C22421c.combineLatest(SignUpAiAct.f17074c.m154174A(), SignUpAiAct.f17074c.m154188y(), new C19690qy())).subscribe(psd0.m173597H(new y20() { // from class: l.ry
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f165393a.m198572s0((pf60) obj);
            }
        }, new y20() { // from class: l.sy
            @Override // p153l.y20
            public final void call(Object obj) {
                CrashHelper.m82479c((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x0 */
    public void m198575x0(boolean z) {
        this.f181529b = z;
    }

    /* JADX INFO: renamed from: y0 */
    public void m198576y0() {
        C21173ws c21173ws = new C21173ws(act(), true, true);
        c21173ws.m207718i().observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.ty
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f176627a.m198573t0((List) obj);
            }
        }));
        act().getSupportLoaderManager().mo3089e(0, null, c21173ws);
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
