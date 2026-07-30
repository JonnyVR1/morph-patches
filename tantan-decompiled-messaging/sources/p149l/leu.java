package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveCommonConfig;
import com.p046p1.mobile.putong.live.external.internal.vchat.view.LiveVChatCalledView;
import com.p046p1.mobile.putong.live.external.internal.vchat.view.LiveVChatCallingView;

/* JADX INFO: loaded from: classes13.dex */
public class leu extends cfu {

    /* JADX INFO: renamed from: h */
    public final peu f127752h;

    /* JADX INFO: renamed from: i */
    public Runnable f127753i;

    public leu(jlu jluVar, LiveVChatCalledView liveVChatCalledView, LiveVChatCallingView liveVChatCallingView) {
        super(jluVar, liveVChatCalledView);
        this.f127753i = new Runnable() { // from class: l.keu
            @Override // java.lang.Runnable
            public final void run() {
                this.f122870a.m149598a3();
            }
        };
        this.f127752h = (peu) m144512z2(new peu(jluVar, liveVChatCallingView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z2 */
    public void m149597Z2(String str) {
        if (this.f127752h.m168557e3(m218409H2().m203901A())) {
            this.f127752h.m168554b3(str);
            return;
        }
        if (slk0.m184830f(m218409H2().m203901A())) {
            ((LiveVChatCalledView) this.viewModel).m69715v(m218409H2().m203901A());
            m149601d3(m218409H2().m203901A().userId, m218409H2().m203901A().anchorId);
            this.f80664g.m109938d();
            m149599b3();
        } else {
            this.f80664g.m109940f();
            m149600c3();
        }
        if (slk0.m184826b(m218409H2().m203901A())) {
            ((LiveVChatCalledView) this.viewModel).m69714u(false);
        }
        if (slk0.m184825a(m218409H2().m203901A()) || slk0.m184831g(m218409H2().m203901A())) {
            ((LiveVChatCalledView) this.viewModel).m69706j(slk0.m184831g(m218409H2().m203901A()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a3 */
    public /* synthetic */ void m149598a3() {
        if (Act.isAppVisible()) {
            m218409H2().m203919S(slk0.f165247m);
        }
    }

    @Override // p149l.cfu, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m104250o2(m218409H2().m203948z(), false).distinctUntilChanged().subscribe(new e30() { // from class: l.jeu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f117606a.m149597Z2((String) obj);
            }
        });
    }

    @Override // p149l.cfu
    /* JADX INFO: renamed from: T2 */
    public void mo106601T2() {
        this.f80664g.m109940f();
        if (TextUtils.isEmpty(m218409H2().m203939p())) {
            return;
        }
        aru.m98553b();
        m218409H2().m203919S(slk0.f165235a);
    }

    @Override // p149l.cfu
    /* JADX INFO: renamed from: V2 */
    public void mo106602V2() {
        String str;
        this.f80664g.m109940f();
        if (slk0.m184830f(m218409H2().m203901A())) {
            str = slk0.f165243i;
            aru.m98554c();
        } else {
            str = slk0.f165239e;
        }
        m218409H2().m203919S(str);
    }

    /* JADX INFO: renamed from: b3 */
    public final void m149599b3() {
        m149600c3();
        BLiveCommonConfig bLiveCommonConfig = m218409H2().f187005j;
        gkh0.m126627j("videoChat", "prepareAutoAnswer:" + bLiveCommonConfig.toJson());
        if (!bLiveCommonConfig.f44350on || bLiveCommonConfig.autoAnswerSeconds <= 0) {
            return;
        }
        e51.m114743H(act(), this.f127753i, bLiveCommonConfig.autoAnswerSeconds * 1000);
    }

    /* JADX INFO: renamed from: c3 */
    public final void m149600c3() {
        e51.m114745J(this.f127753i);
    }

    /* JADX INFO: renamed from: d3 */
    public void m149601d3(String str, String str2) {
        if (this.f80663f != null) {
            return;
        }
        cwf0 cwf0Var = new cwf0(aru.f71353g, "LiveVChatDialingModule");
        this.f80663f = cwf0Var;
        cwf0Var.m109040p(j760.m140076a("sender_id", str), j760.m140076a("receiver_id", str2));
        this.f80663f.m109033i();
        this.f80663f.m109036l();
    }
}
