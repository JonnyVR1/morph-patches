package p153l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.CoreBoxData;
import com.p051p1.mobile.putong.core.data.MarryConfig;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.MarryProfileAct;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public class b5x extends ar2<d5x> {

    /* JADX INFO: renamed from: a */
    public String f75105a;

    /* JADX INFO: renamed from: b */
    public boolean f75106b;

    /* JADX INFO: renamed from: c */
    public MarryProfileAct f75107c;

    /* JADX INFO: renamed from: l.b5x$a */
    public class C15934a implements y20<Bundle> {

        /* JADX INFO: renamed from: l.b5x$a$a */
        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                b5x.this.act().m68056e2();
            }
        }

        public C15934a() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Bundle bundle) {
            bnl0.m105509E0(((d5x) b5x.this.viewModel).f85210d, new a());
        }
    }

    /* JADX INFO: renamed from: l.b5x$b */
    public class C15935b implements y20<User> {
        public C15935b() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(User user) {
            ((d5x) b5x.this.viewModel).mo48632d(user);
        }
    }

    /* JADX INFO: renamed from: l.b5x$c */
    public class C15936c implements qcj<Boolean, C22421c<uxj0>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f75111a;

        public C15936c(String str) {
            this.f75111a = str;
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C22421c<uxj0> call(Boolean bool) {
            if (bool.booleanValue()) {
                return CoreModule.f18264c.f20384f0.m33905ap(this.f75111a);
            }
            azk0.m101074a("");
            return null;
        }
    }

    public b5x(MarryProfileAct marryProfileAct, ner nerVar) {
        super(nerVar);
        this.f75105a = "";
        this.f75106b = false;
        this.f75107c = marryProfileAct;
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m102651g0(Throwable th) {
    }

    /* JADX INFO: renamed from: m0 */
    public static boolean m102656m0() {
        MarryConfig marryConfigM102657n0 = m102657n0();
        if (marryConfigM102657n0 != null) {
            return marryConfigM102657n0.enable_pay_wall;
        }
        return false;
    }

    /* JADX INFO: renamed from: n0 */
    public static MarryConfig m102657n0() {
        try {
            return (MarryConfig) RemoteConfig.m80481x().m80516v("marry_config", MarryConfig.JSON_ADAPTER);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        Intent intent = act().getIntent();
        this.f75105a = intent.getStringExtra("userId");
        this.f75106b = intent.getBooleanExtra("bindWallet", false);
        CoreModule.f18264c.f20381e0.m116527W9(this.f75105a);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new C15934a());
        if (TextUtils.isEmpty(this.f75105a)) {
            return;
        }
        duringCreated(CoreModule.f18264c.f20381e0.m116483Ka(this.f75105a)).first().subscribe(psd0.m173597H(new C15935b(), new y20() { // from class: l.w4x
            @Override // p153l.y20
            public final void call(Object obj) {
                b5x.m102651g0((Throwable) obj);
            }
        }));
        if (TextUtils.equals(CoreModule.m30929H().userId(), this.f75105a)) {
            return;
        }
        duringCreated((C22421c) CoreModule.f18264c.f20384f0.m33823Ue(this.f75105a).map(new qcj() { // from class: l.x4x
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreBoxData.box((Conversation) obj);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.y4x
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f197521a.m102659o0((CoreBoxData) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l0 */
    public boolean m102658l0() {
        return this.f75106b;
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m102659o0(CoreBoxData coreBoxData) {
        ((d5x) this.viewModel).m114340j(coreBoxData.box == 0);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m102660p0(String str, uxj0 uxj0Var) {
        act().progressDismiss();
        CoreModule.m30933P().m143409f().mo37025d8(this.f75107c, str);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m102661q0(Throwable th) {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: r0 */
    public void m102662r0(final String str) {
        ((d5x) this.viewModel).getAct().progress(R$string.f28619R0);
        duringCreated((C22421c) CoreModule.f18264c.f20381e0.m116641za(str).flatMap(new C15936c(str))).subscribe(psd0.m173597H(new y20() { // from class: l.z4x
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f202987a.m102660p0(str, (uxj0) obj);
            }
        }, new y20() { // from class: l.a5x
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f68648a.m102661q0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s0 */
    public void m102663s0() {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (userM116600p9.isBanedOrInactivated() || userM116600p9.isFakeUser() || userM116600p9.isJailed() || userM116600p9.isSwipeJailed()) {
            r1j0.m179420g("账号状态异常");
            return;
        }
        if (m102658l0() && m102656m0() && !joa.m146358H3()) {
            CoreModule.f18273l.m143405a().mo34570q6(act(), "p_marriage_home,e_chat_next_pull,click", null);
        } else {
            i4g0.m138523u("e_marriage_chat", "p_marriage_home", new pf60("other_user_id", this.f75105a));
            m102662r0(this.f75105a);
        }
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
