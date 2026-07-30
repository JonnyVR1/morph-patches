package p003l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.data.CoreMomentInfo;
import com.p000p1.mobile.putong.core.data.Greeting;
import com.p000p1.mobile.putong.core.p001ui.greet.C3132a;
import com.p000p1.mobile.putong.core.p001ui.greet.GreetAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.mkd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class jak extends hak<fsl> {

    /* JADX INFO: renamed from: c */
    public GreetAct f5291c;

    /* JADX INFO: renamed from: d */
    public C3132a f5292d;

    public jak(GreetAct greetAct, C3132a c3132a, fsl fslVar) {
        super(c3132a, fslVar);
        this.f5292d = c3132a;
        this.f5291c = greetAct;
    }

    @Override // p003l.uak
    /* JADX INFO: renamed from: b */
    public void mo7384b() {
        super.mo7384b();
    }

    @Override // p003l.uak
    /* JADX INFO: renamed from: c */
    public void mo7385c() {
        super.mo7385c();
        if (TextUtils.isEmpty(m7386e().moment.id)) {
            return;
        }
        duringCreated(CoreModule.N().P9(m7386e().moment.id, CoreMomentInfo.JSON_ADAPTER)).subscribe(mkd0.G(new e30() { // from class: l.iak
            public final void call(Object obj) {
                this.f5108a.m7387f((CoreMomentInfo) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: e */
    public Greeting m7386e() {
        return m9710a().m3235g0();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m7387f(CoreMomentInfo coreMomentInfo) {
        if (NullChecker.a(coreMomentInfo)) {
            this.f5292d.f1837g = coreMomentInfo.owner;
        } else {
            boolean zEquals = TextUtils.equals(CoreModule.H().userId(), m7386e().actorUserId);
            C3132a c3132a = this.f5292d;
            if (zEquals) {
                c3132a.f1837g = m7386e().otherUser;
            } else {
                c3132a.f1837g = CoreModule.H().userId();
            }
        }
        if (TextUtils.isEmpty(m9710a().m3236h0().getStateId())) {
            m7388g(this.f5292d.f1837g, coreMomentInfo);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m7388g(String str, CoreMomentInfo coreMomentInfo) {
        C c = this.f4856b;
        Act act = this.f5291c;
        c.mo3287p(act, str, coreMomentInfo, act.m2919c2().getStateId(), m9710a().getFrom());
    }
}
