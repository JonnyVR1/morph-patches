package p149l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.CoreBoxData;
import com.p046p1.mobile.putong.core.data.MarryConfig;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.MarryProfileAct;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public class c2x extends jq2<e2x> {

    /* JADX INFO: renamed from: a */
    public String f78396a;

    /* JADX INFO: renamed from: b */
    public boolean f78397b;

    /* JADX INFO: renamed from: c */
    public MarryProfileAct f78398c;

    /* JADX INFO: renamed from: l.c2x$a */
    public class C16043a implements e30<Bundle> {

        /* JADX INFO: renamed from: l.c2x$a$a */
        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                c2x.this.act().m66873d2();
            }
        }

        public C16043a() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Bundle bundle) {
            xdl0.m208329E0(((e2x) c2x.this.viewModel).f88952d, new a());
        }
    }

    /* JADX INFO: renamed from: l.c2x$b */
    public class C16044b implements e30<User> {
        public C16044b() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(User user) {
            ((e2x) c2x.this.viewModel).mo47449d(user);
        }
    }

    /* JADX INFO: renamed from: l.c2x$c */
    public class C16045c implements w9j<Boolean, C22306c<roj0>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f78402a;

        public C16045c(String str) {
            this.f78402a = str;
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C22306c<roj0> call(Boolean bool) {
            if (bool.booleanValue()) {
                return CoreModule.f17545c.f19642f0.m32902ap(this.f78402a);
            }
            upk0.m194883a("");
            return null;
        }
    }

    public c2x(MarryProfileAct marryProfileAct, mcr mcrVar) {
        super(mcrVar);
        this.f78396a = "";
        this.f78397b = false;
        this.f78398c = marryProfileAct;
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m104937g0(Throwable th) {
    }

    /* JADX INFO: renamed from: m0 */
    public static boolean m104942m0() {
        MarryConfig marryConfigM104943n0 = m104943n0();
        if (marryConfigM104943n0 != null) {
            return marryConfigM104943n0.enable_pay_wall;
        }
        return false;
    }

    /* JADX INFO: renamed from: n0 */
    public static MarryConfig m104943n0() {
        try {
            return (MarryConfig) RemoteConfig.m79298x().m79333v("marry_config", MarryConfig.JSON_ADAPTER);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        Intent intent = act().getIntent();
        this.f78396a = intent.getStringExtra("userId");
        this.f78397b = intent.getBooleanExtra("bindWallet", false);
        CoreModule.f17545c.f19639e0.m169454W9(this.f78396a);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new C16043a());
        if (TextUtils.isEmpty(this.f78396a)) {
            return;
        }
        duringCreated(CoreModule.f17545c.f19639e0.m169410Ka(this.f78396a)).first().subscribe(mkd0.m154956H(new C16044b(), new e30() { // from class: l.x1x
            @Override // p149l.e30
            public final void call(Object obj) {
                c2x.m104937g0((Throwable) obj);
            }
        }));
        if (TextUtils.equals(CoreModule.m29931H().userId(), this.f78396a)) {
            return;
        }
        duringCreated((C22306c) CoreModule.f17545c.f19642f0.m32820Ue(this.f78396a).map(new w9j() { // from class: l.y1x
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreBoxData.box((Conversation) obj);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.z1x
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f201111a.m104945o0((CoreBoxData) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l0 */
    public boolean m104944l0() {
        return this.f78397b;
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m104945o0(CoreBoxData coreBoxData) {
        ((e2x) this.viewModel).m114535j(coreBoxData.box == 0);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m104946p0(String str, roj0 roj0Var) {
        act().progressDismiss();
        CoreModule.m29935P().m94655f().mo36022d8(this.f78398c, str);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m104947q0(Throwable th) {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: r0 */
    public void m104948r0(final String str) {
        ((e2x) this.viewModel).getAct().progress(R$string.f27771R0);
        duringCreated((C22306c) CoreModule.f17545c.f19639e0.m169568za(str).flatMap(new C16045c(str))).subscribe(mkd0.m154956H(new e30() { // from class: l.a2x
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f67301a.m104946p0(str, (roj0) obj);
            }
        }, new e30() { // from class: l.b2x
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f72757a.m104947q0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s0 */
    public void m104949s0() {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (userM169527p9.isBanedOrInactivated() || userM169527p9.isFakeUser() || userM169527p9.isJailed() || userM169527p9.isSwipeJailed()) {
            osi0.m165783g("账号状态异常");
            return;
        }
        if (m104944l0() && m104942m0() && !xma.m210044G3()) {
            CoreModule.f17554l.m94651a().mo33567q6(act(), "p_marriage_home,e_chat_next_pull,click", null);
        } else {
            zvf0.m220399u("e_marriage_chat", "p_marriage_home", new j760("other_user_id", this.f78396a));
            m104948r0(this.f78396a);
        }
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
