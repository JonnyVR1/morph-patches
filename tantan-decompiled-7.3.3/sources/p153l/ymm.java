package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.MomentMessage;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes13.dex */
public class ymm extends n570 implements wh00 {

    /* JADX INFO: renamed from: d */
    public String f200677d;

    /* JADX INFO: renamed from: e */
    public String f200678e;

    /* JADX INFO: renamed from: f */
    public WeakReference<fmm> f200679f;

    /* JADX INFO: renamed from: g */
    public WeakReference<Act> f200680g;

    public ymm(Act act, fmm fmmVar, String str, String str2) {
        super(null);
        this.f200677d = str;
        this.f200678e = str2;
        this.f200679f = new WeakReference<>(fmmVar);
        this.f200680g = new WeakReference<>(act);
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m216715E(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m216721K(bkj0 bkj0Var) {
        fmm fmmVar = this.f200679f.get();
        if (NullChecker.m82486a(fmmVar)) {
            fmmVar.m126302R0(bkj0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m216722L(Throwable th) {
        fmm fmmVar = this.f200679f.get();
        if (NullChecker.m82486a(fmmVar)) {
            fmmVar.m126303S0(th);
        }
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: A */
    public void mo65689A() {
        Act act = this.f200680g.get();
        if (act == null) {
            return;
        }
        act.duringCreated(FeedModule.f39703d.m145601Rb(this.f200677d, this.f200678e)).subscribe(psd0.m173597H(new y20() { // from class: l.smm
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f169590a.m216721K((bkj0) obj);
            }
        }, new y20() { // from class: l.tmm
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f174948a.m216722L((Throwable) obj);
            }
        }));
    }

    @Override // p153l.wh00
    /* JADX INFO: renamed from: d */
    public void mo139300d(MomentMessage momentMessage, String str) {
        fmm fmmVar = this.f200679f.get();
        if (fmmVar == null) {
            return;
        }
        fmmVar.m126308a1(momentMessage, str);
    }

    @Override // p153l.wh00
    /* JADX INFO: renamed from: f */
    public void mo139301f() {
        fmm fmmVar = this.f200679f.get();
        if (fmmVar == null) {
            return;
        }
        fmmVar.m126290A0();
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: o */
    public void mo65702o() {
        mo65689A();
        final fmm fmmVar = this.f200679f.get();
        Act act = this.f200680g.get();
        if (fmmVar == null || act == null) {
            return;
        }
        act.duringCreated(FeedModule.f39703d.f121289C0).subscribe(psd0.m173596G(new y20() { // from class: l.umm
            @Override // p153l.y20
            public final void call(Object obj) {
                fmmVar.m126297L0();
            }
        }));
        act.duringCreated(FeedModule.f39703d.f121363l0).subscribe(psd0.m173596G(new y20() { // from class: l.vmm
            @Override // p153l.y20
            public final void call(Object obj) {
                fmmVar.m126301Q0();
            }
        }));
        act.duringCreated(FeedModule.f39703d.f121306J0).subscribe(psd0.m173596G(new y20() { // from class: l.wmm
            @Override // p153l.y20
            public final void call(Object obj) {
                fmmVar.m126298N0((MomentMessage) obj);
            }
        }));
        act.duringCreated(FeedModule.f39703d.f121309K0).subscribe(psd0.m173596G(new y20() { // from class: l.xmm
            @Override // p153l.y20
            public final void call(Object obj) {
                fmmVar.m126299O0((MomentMessage) obj);
            }
        }));
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: z */
    public void mo65703z() {
        Act act = this.f200680g.get();
        final fmm fmmVar = this.f200679f.get();
        if (fmmVar == null || act == null) {
            return;
        }
        act.duringCreated(FeedModule.f39703d.m145561M6(this.f200677d, this.f200678e, fmmVar.f99802f)).subscribe(psd0.m173597H(new y20() { // from class: l.qmm
            @Override // p153l.y20
            public final void call(Object obj) {
                fmmVar.m126300P0((bkj0) obj);
            }
        }, new y20() { // from class: l.rmm
            @Override // p153l.y20
            public final void call(Object obj) {
                ymm.m216715E((Throwable) obj);
            }
        }));
    }

    @Override // p153l.wh00
    /* JADX INFO: renamed from: a */
    public void mo139298a() {
    }

    @Override // p153l.wh00
    /* JADX INFO: renamed from: c */
    public void mo139299c() {
    }
}
