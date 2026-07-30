package p153l;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.livingroom.archi.act.LiveAct;
import com.p051p1.mobile.putong.p070ui.splash.SplashProxyAct;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
public class h1j extends q0m {

    /* JADX INFO: renamed from: c */
    public final v120 f107464c;

    /* JADX INFO: renamed from: d */
    public final boolean f107465d;

    public h1j(v120 v120Var, C22421c<Pair<Boolean, Boolean>> c22421c, g8t g8tVar) {
        super(c22421c, g8tVar);
        this.f107464c = v120Var;
        this.f107465d = v120Var instanceof msf0;
    }

    @Override // p153l.q0m
    /* JADX INFO: renamed from: f */
    public void mo108623f() {
        m174727c(Act.foreground()).skip(this.f107465d ? 1 : 0).subscribe(dhw.m115825d(new y20() { // from class: l.f1j
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f96800a.m133348k((Act.C4450r) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i */
    public final void m133346i(v120 v120Var) {
        if (v120Var instanceof msf0) {
            ((msf0) v120Var).mo159783c(false);
        }
        v120Var.mo174618a(true);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m133347j(Boolean bool) {
        if (bool.booleanValue()) {
            m133346i(this.f107464c);
        } else {
            m133349l();
        }
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m133348k(Act.C4450r c4450r) {
        boolean z;
        Boolean boolValueOf;
        AudienceStartData audienceStartData;
        if (c4450r == null) {
            return;
        }
        WeakReference<Activity> weakReference = c4450r.f16062a;
        Activity activity = weakReference != null ? weakReference.get() : null;
        if (!this.f107465d || (!((z = activity instanceof LiveAct)) && !(activity instanceof SplashProxyAct) && activity.getClass() != uqb0.f180397c0.getSignOutJumpAct())) {
            if (m174728d()) {
                m133346i(this.f107464c);
                return;
            } else if (zrv.f205799a.m207643N(activity)) {
                zrv.f205799a.m207658b(activity, new y20() { // from class: l.g1j
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f101760a.m133347j((Boolean) obj);
                    }
                });
                return;
            } else {
                m133349l();
                return;
            }
        }
        if (z) {
            Intent intent = activity.getIntent();
            audienceStartData = NullChecker.m82486a(intent) ? (AudienceStartData) intent.getSerializableExtra(AudienceStartData.LIVE_AUDIENCE_START_DATA) : null;
            boolValueOf = (NullChecker.m82486a(intent) && intent.getBooleanExtra(AudienceStartData.ANCHOR_TAG, false)) ? Boolean.valueOf(!TextUtils.isEmpty(intent.getStringExtra("live_type"))) : null;
        } else {
            boolValueOf = null;
            audienceStartData = null;
        }
        BLiveAbsData bLiveAbsData = audienceStartData != null ? audienceStartData.live : null;
        boolean zM206159b = wft.m206159b(2);
        v120 v120Var = this.f107464c;
        if (zM206159b) {
            ((msf0) v120Var).mo159784d(true, false, bLiveAbsData, boolValueOf);
        } else {
            ((msf0) v120Var).mo159784d(true, true, bLiveAbsData, boolValueOf);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m133349l() {
        if (m174728d() || !m174729e()) {
            return;
        }
        v120 v120Var = this.f107464c;
        v120Var.mo174618a(v120Var.mo174619b());
        if (this.f107465d) {
            ((msf0) this.f107464c).mo159783c(true);
        }
    }

    @Override // p153l.q0m
    /* JADX INFO: renamed from: b */
    public void mo108622b() {
    }
}
