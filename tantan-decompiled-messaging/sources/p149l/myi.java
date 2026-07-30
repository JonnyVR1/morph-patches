package p149l;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.livingroom.archi.act.LiveAct;
import com.p046p1.mobile.putong.p065ui.splash.SplashProxyAct;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class myi extends xxl {

    /* JADX INFO: renamed from: c */
    public final nt10 f136313c;

    /* JADX INFO: renamed from: d */
    public final boolean f136314d;

    public myi(nt10 nt10Var, C22306c<Pair<Boolean, Boolean>> c22306c, f6t f6tVar) {
        super(c22306c, f6tVar);
        this.f136313c = nt10Var;
        this.f136314d = nt10Var instanceof dkf0;
    }

    @Override // p149l.xxl
    /* JADX INFO: renamed from: f */
    public void mo105961f() {
        m211508c(Act.foreground()).skip(this.f136314d ? 1 : 0).subscribe(ffw.m121193d(new e30() { // from class: l.kyi
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f125309a.m157085k((Act.C4299r) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i */
    public final void m157083i(nt10 nt10Var) {
        if (nt10Var instanceof dkf0) {
            ((dkf0) nt10Var).mo112219c(false);
        }
        nt10Var.mo160504a(true);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m157084j(Boolean bool) {
        if (bool.booleanValue()) {
            m157083i(this.f136313c);
        } else {
            m157086l();
        }
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m157085k(Act.C4299r c4299r) {
        boolean z;
        Boolean boolValueOf;
        AudienceStartData audienceStartData;
        if (c4299r == null) {
            return;
        }
        WeakReference<Activity> weakReference = c4299r.f15343a;
        Activity activity = weakReference != null ? weakReference.get() : null;
        if (!this.f136314d || (!((z = activity instanceof LiveAct)) && !(activity instanceof SplashProxyAct) && activity.getClass() != qib0.f154714c0.getSignOutJumpAct())) {
            if (m211509d()) {
                m157083i(this.f136313c);
                return;
            } else if (ypv.f199493a.m199321N(activity)) {
                ypv.f199493a.m199336b(activity, new e30() { // from class: l.lyi
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f130571a.m157084j((Boolean) obj);
                    }
                });
                return;
            } else {
                m157086l();
                return;
            }
        }
        if (z) {
            Intent intent = activity.getIntent();
            audienceStartData = NullChecker.m81303a(intent) ? (AudienceStartData) intent.getSerializableExtra(AudienceStartData.LIVE_AUDIENCE_START_DATA) : null;
            boolValueOf = (NullChecker.m81303a(intent) && intent.getBooleanExtra(AudienceStartData.ANCHOR_TAG, false)) ? Boolean.valueOf(!TextUtils.isEmpty(intent.getStringExtra("live_type"))) : null;
        } else {
            boolValueOf = null;
            audienceStartData = null;
        }
        BLiveAbsData bLiveAbsData = audienceStartData != null ? audienceStartData.live : null;
        boolean zM198092b = vdt.m198092b(2);
        nt10 nt10Var = this.f136313c;
        if (zM198092b) {
            ((dkf0) nt10Var).mo112220d(true, false, bLiveAbsData, boolValueOf);
        } else {
            ((dkf0) nt10Var).mo112220d(true, true, bLiveAbsData, boolValueOf);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m157086l() {
        if (m211509d() || !m211510e()) {
            return;
        }
        nt10 nt10Var = this.f136313c;
        nt10Var.mo160504a(nt10Var.mo160800b());
        if (this.f136314d) {
            ((dkf0) this.f136313c).mo112219c(true);
        }
    }

    @Override // p149l.xxl
    /* JADX INFO: renamed from: b */
    public void mo105960b() {
    }
}
