package p002l;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import com.p000p1.mobile.putong.live.livingroom.archi.act.LiveAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.ui.splash.SplashProxyAct;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import l.e30;
import l.ffw;
import l.qib0;
import l.vdt;
import l.ypv;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class myi extends xxl {

    /* JADX INFO: renamed from: c */
    public final nt10 f15742c;

    /* JADX INFO: renamed from: d */
    public final boolean f15743d;

    public myi(nt10 nt10Var, c<Pair<Boolean, Boolean>> cVar, f6t f6tVar) {
        super(cVar, f6tVar);
        this.f15742c = nt10Var;
        this.f15743d = nt10Var instanceof dkf0;
    }

    @Override // p002l.xxl
    /* JADX INFO: renamed from: f */
    public void mo10924f() {
        m26172c(Act.foreground()).skip(this.f15743d ? 1 : 0).subscribe(ffw.d(new e30() { // from class: l.kyi
            public final void call(Object obj) {
                this.f14584a.m18313k((Act.r) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i */
    public final void m18311i(nt10 nt10Var) {
        if (nt10Var instanceof dkf0) {
            ((dkf0) nt10Var).mo11926c(false);
        }
        nt10Var.mo18909a(true);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m18312j(Boolean bool) {
        if (bool.booleanValue()) {
            m18311i(this.f15742c);
        } else {
            m18314l();
        }
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m18313k(Act.r rVar) {
        boolean z;
        Boolean boolValueOf;
        AudienceStartData audienceStartData;
        if (rVar == null) {
            return;
        }
        WeakReference weakReference = rVar.a;
        Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
        if (!this.f15743d || (!((z = activity instanceof LiveAct)) && !(activity instanceof SplashProxyAct) && activity.getClass() != qib0.c0.getSignOutJumpAct())) {
            if (m26173d()) {
                m18311i(this.f15742c);
                return;
            } else if (ypv.a.N(activity)) {
                ypv.a.b(activity, new e30() { // from class: l.lyi
                    public final void call(Object obj) {
                        this.f15173a.m18312j((Boolean) obj);
                    }
                });
                return;
            } else {
                m18314l();
                return;
            }
        }
        if (z) {
            Intent intent = activity.getIntent();
            audienceStartData = NullChecker.a(intent) ? (AudienceStartData) intent.getSerializableExtra("LIVE_AUDIENCE_START_DATA") : null;
            boolValueOf = (NullChecker.a(intent) && intent.getBooleanExtra("jump_to_tag", false)) ? Boolean.valueOf(!TextUtils.isEmpty(intent.getStringExtra("live_type"))) : null;
        } else {
            boolValueOf = null;
            audienceStartData = null;
        }
        BLiveAbsData bLiveAbsData = audienceStartData != null ? audienceStartData.live : null;
        boolean zB = vdt.b(2);
        nt10 nt10Var = this.f15742c;
        if (zB) {
            ((dkf0) nt10Var).mo11927d(true, false, bLiveAbsData, boolValueOf);
        } else {
            ((dkf0) nt10Var).mo11927d(true, true, bLiveAbsData, boolValueOf);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m18314l() {
        if (m26173d() || !m26174e()) {
            return;
        }
        nt10 nt10Var = this.f15742c;
        nt10Var.mo18909a(nt10Var.mo18978b());
        if (this.f15743d) {
            ((dkf0) this.f15742c).mo11926c(true);
        }
    }

    @Override // p002l.xxl
    /* JADX INFO: renamed from: b */
    public void mo10923b() {
    }
}
