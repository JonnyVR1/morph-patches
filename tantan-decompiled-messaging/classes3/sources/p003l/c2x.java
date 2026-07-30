package p003l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.MarryProfileAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.CoreBoxData;
import com.p1.mobile.putong.core.data.MarryConfig;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import l.j760;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.osi0;
import l.roj0;
import l.xdl0;
import l.xma;
import l.zvf0;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class c2x extends jq2<e2x> {

    /* JADX INFO: renamed from: a */
    public String f2566a;

    /* JADX INFO: renamed from: b */
    public boolean f2567b;

    /* JADX INFO: renamed from: c */
    public MarryProfileAct f2568c;

    /* JADX INFO: renamed from: l.c2x$a */
    public class C0195a implements e30<Bundle> {

        /* JADX INFO: renamed from: l.c2x$a$a */
        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                c2x.this.act().finish();
            }
        }

        public C0195a() {
        }

        @Override // p003l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Bundle bundle) {
            xdl0.E0(((e2x) ((jq2) c2x.this).viewModel).f3185d, new a());
        }
    }

    /* JADX INFO: renamed from: l.c2x$b */
    public class C0196b implements e30<User> {
        public C0196b() {
        }

        @Override // p003l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(User user) {
            ((e2x) ((jq2) c2x.this).viewModel).mo494d(user);
        }
    }

    /* JADX INFO: renamed from: l.c2x$c */
    public class C0197c implements w9j<Boolean, C1099c<roj0>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f2572a;

        public C0197c(String str) {
            this.f2572a = str;
        }

        @Override // p003l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1099c<roj0> call(Boolean bool) {
            if (bool.booleanValue()) {
                return CoreModule.c.f0.ap(this.f2572a);
            }
            upk0.m8197a("");
            return null;
        }
    }

    public c2x(MarryProfileAct marryProfileAct, mcr mcrVar) {
        super(mcrVar);
        this.f2566a = "";
        this.f2567b = false;
        this.f2568c = marryProfileAct;
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m3224g0(Throwable th) {
    }

    /* JADX INFO: renamed from: m0 */
    public static boolean m3229m0() {
        MarryConfig marryConfigM3230n0 = m3230n0();
        if (marryConfigM3230n0 != null) {
            return marryConfigM3230n0.enable_pay_wall;
        }
        return false;
    }

    /* JADX INFO: renamed from: n0 */
    public static MarryConfig m3230n0() {
        try {
            return (MarryConfig) RemoteConfig.x().v("marry_config", MarryConfig.JSON_ADAPTER);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m3231Z() {
        super.Z();
        Intent intent = act().getIntent();
        this.f2566a = intent.getStringExtra("userId");
        this.f2567b = intent.getBooleanExtra("bindWallet", false);
        CoreModule.c.e0.W9(this.f2566a);
    }

    /* JADX INFO: renamed from: a0 */
    public void m3232a0() {
        super.a0();
        creates(new C0195a());
        if (TextUtils.isEmpty(this.f2566a)) {
            return;
        }
        duringCreated(CoreModule.c.e0.Ka(this.f2566a)).first().subscribe((m250) mkd0.H(new C0196b(), new e30() { // from class: l.x1x
            @Override // p003l.e30
            public final void call(Object obj) {
                c2x.m3224g0((Throwable) obj);
            }
        }));
        if (TextUtils.equals(CoreModule.H().userId(), this.f2566a)) {
            return;
        }
        duringCreated(CoreModule.c.f0.Ue(this.f2566a).map(new w9j() { // from class: l.y1x
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return CoreBoxData.box((Conversation) obj);
            }
        })).subscribe((m250) mkd0.G(new e30() { // from class: l.z1x
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f9186a.m3234o0((CoreBoxData) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l0 */
    public boolean m3233l0() {
        return this.f2567b;
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m3234o0(CoreBoxData coreBoxData) {
        ((e2x) ((jq2) this).viewModel).m3787j(coreBoxData.box == null);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m3235p0(String str, roj0 roj0Var) {
        act().progressDismiss();
        CoreModule.P().f().d8(this.f2568c, str);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m3236q0(Throwable th) {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: r0 */
    public void m3237r0(final String str) {
        ((e2x) ((jq2) this).viewModel).act().progress(R.string.R0);
        duringCreated(CoreModule.c.e0.za(str).flatMap(new C0197c(str))).subscribe((m250) mkd0.H(new e30() { // from class: l.a2x
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f2074a.m3235p0(str, (roj0) obj);
            }
        }, new e30() { // from class: l.b2x
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f2337a.m3236q0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s0 */
    public void m3238s0() {
        User userP9 = CoreModule.c.e0.p9();
        if (userP9.isBanedOrInactivated() || userP9.isFakeUser() || userP9.isJailed() || userP9.isSwipeJailed()) {
            osi0.g("账号状态异常");
            return;
        }
        if (m3233l0() && m3229m0() && !xma.G3()) {
            CoreModule.l.a().q6(act(), "p_marriage_home,e_chat_next_pull,click", (e30) null);
        } else {
            zvf0.u("e_marriage_chat", "p_marriage_home", new j760[]{new j760("other_user_id", this.f2566a)});
            m3237r0(this.f2566a);
        }
    }

    public void destroy() {
    }
}
