package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CoreMomentInfo;
import com.p046p1.mobile.putong.core.data.Greeting;
import com.p046p1.mobile.putong.core.p053ui.greet.C8357a;
import com.p046p1.mobile.putong.core.p053ui.greet.GreetAct;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes10.dex */
public class jak extends hak<fsl> {

    /* JADX INFO: renamed from: c */
    public GreetAct f117096c;

    /* JADX INFO: renamed from: d */
    public C8357a f117097d;

    public jak(GreetAct greetAct, C8357a c8357a, fsl fslVar) {
        super(c8357a, fslVar);
        this.f117097d = c8357a;
        this.f117096c = greetAct;
    }

    @Override // p149l.uak
    /* JADX INFO: renamed from: b */
    public void mo140693b() {
        super.mo140693b();
    }

    @Override // p149l.uak
    /* JADX INFO: renamed from: c */
    public void mo140694c() {
        super.mo140694c();
        if (TextUtils.isEmpty(m140695e().moment.f38759id)) {
            return;
        }
        duringCreated(CoreModule.m29934N().mo60304P9(m140695e().moment.f38759id, CoreMomentInfo.JSON_ADAPTER)).subscribe(mkd0.m154955G(new e30() { // from class: l.iak
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f112311a.m140696f((CoreMomentInfo) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: e */
    public Greeting m140695e() {
        return m192761a().m45889g0();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m140696f(CoreMomentInfo coreMomentInfo) {
        if (NullChecker.m81303a(coreMomentInfo)) {
            this.f117097d.f29443g = coreMomentInfo.owner;
        } else {
            boolean zEquals = TextUtils.equals(CoreModule.m29931H().userId(), m140695e().actorUserId);
            C8357a c8357a = this.f117097d;
            if (zEquals) {
                c8357a.f29443g = m140695e().otherUser;
            } else {
                c8357a.f29443g = CoreModule.m29931H().userId();
            }
        }
        if (TextUtils.isEmpty(m192761a().m45890h0().getStateId())) {
            m140697g(this.f117097d.f29443g, coreMomentInfo);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m140697g(String str, CoreMomentInfo coreMomentInfo) {
        C c = this.f106746b;
        GreetAct greetAct = this.f117096c;
        c.mo40666p(greetAct, str, coreMomentInfo, greetAct.m45583c2().getStateId(), m192761a().getFrom());
    }
}
