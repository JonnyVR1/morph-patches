package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CoreMomentInfo;
import com.p051p1.mobile.putong.core.data.Greeting;
import com.p051p1.mobile.putong.core.p058ui.greet.C8520a;
import com.p051p1.mobile.putong.core.p058ui.greet.GreetAct;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes3.dex */
public class adk extends yck<tul> {

    /* JADX INFO: renamed from: c */
    public GreetAct f70695c;

    /* JADX INFO: renamed from: d */
    public C8520a f70696d;

    public adk(GreetAct greetAct, C8520a c8520a, tul tulVar) {
        super(c8520a, tulVar);
        this.f70696d = c8520a;
        this.f70695c = greetAct;
    }

    @Override // p153l.ldk
    /* JADX INFO: renamed from: b */
    public void mo97077b() {
        super.mo97077b();
    }

    @Override // p153l.ldk
    /* JADX INFO: renamed from: c */
    public void mo97078c() {
        super.mo97078c();
        if (TextUtils.isEmpty(m97079e().moment.f39607id)) {
            return;
        }
        duringCreated(CoreModule.m30932N().mo61488P9(m97079e().moment.f39607id, CoreMomentInfo.JSON_ADAPTER)).subscribe(psd0.m173596G(new y20() { // from class: l.zck
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f203798a.m97080f((CoreMomentInfo) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: e */
    public Greeting m97079e() {
        return m153781a().m47072g0();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m97080f(CoreMomentInfo coreMomentInfo) {
        if (NullChecker.m82486a(coreMomentInfo)) {
            this.f70696d.f30291g = coreMomentInfo.owner;
        } else {
            boolean zEquals = TextUtils.equals(CoreModule.m30929H().userId(), m97079e().actorUserId);
            C8520a c8520a = this.f70696d;
            if (zEquals) {
                c8520a.f30291g = m97079e().otherUser;
            } else {
                c8520a.f30291g = CoreModule.m30929H().userId();
            }
        }
        if (TextUtils.isEmpty(m153781a().m47073h0().getStateId())) {
            m97081g(this.f70696d.f30291g, coreMomentInfo);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m97081g(String str, CoreMomentInfo coreMomentInfo) {
        C c = this.f198521b;
        GreetAct greetAct = this.f70695c;
        c.mo41677p(greetAct, str, coreMomentInfo, greetAct.m46766d2().getStateId(), m153781a().getFrom());
    }
}
