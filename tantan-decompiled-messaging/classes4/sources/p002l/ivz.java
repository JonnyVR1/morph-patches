package p002l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.p001ui.notifications.SysnotifListener;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ChatHeat;
import com.p1.mobile.putong.core.data.ChatMM;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Map;
import l.c4g0;
import l.d30;
import l.e30;
import l.e51;
import l.hap;
import l.j760;
import l.jo0;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.qib0;
import l.roj0;
import l.rp2;
import l.ura;
import l.w9j;
import l.x9j;
import l.xaj0;
import l.y9j;
import l.zvf0;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ivz extends jq2<rp2> {

    /* JADX INFO: renamed from: a */
    public boolean f13443a;

    /* JADX INFO: renamed from: b */
    public boolean f13444b;

    /* JADX INFO: renamed from: c */
    public String f13445c;

    /* JADX INFO: renamed from: d */
    public User f13446d;

    /* JADX INFO: renamed from: e */
    public a<roj0> f13447e;

    /* JADX INFO: renamed from: f */
    public c4g0 f13448f;

    /* JADX INFO: renamed from: l.ivz$a */
    public class C0621a implements w9j<Conversation, ChatMM> {
        public C0621a() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ChatMM call(Conversation conversation) {
            return conversation.additional.chatMM;
        }
    }

    /* JADX INFO: renamed from: l.ivz$b */
    public class C0622b implements w9j<Conversation, Boolean> {
        public C0622b() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(Conversation conversation) {
            return Boolean.valueOf(NullChecker.a(conversation) && NullChecker.a(conversation.additional) && NullChecker.a(conversation.additional.chatMM));
        }
    }

    /* JADX INFO: renamed from: l.ivz$c */
    public class C0623c implements e30<ChatMM> {
        public C0623c() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(ChatMM chatMM) {
            ((jq2) ivz.this).viewModel.j();
        }
    }

    public ivz(mcr mcrVar) {
        super(mcrVar);
        this.f13447e = a.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public /* synthetic */ void m15433I0(Bundle bundle) {
        c cVarDistinctUntilChanged;
        boolean z = false;
        this.f13443a = act().getIntent().getBooleanExtra("is_svip_unmatch", false);
        if (ura.e().d().B() && hap.c(this.f13445c)) {
            z = true;
        }
        this.f13444b = z;
        c cVarDistinctUntilChanged2 = CoreModule.c.e0.Ka(this.f13445c).distinctUntilChanged();
        if (ura.e().d().c()) {
            cVarDistinctUntilChanged = CoreModule.c.f0.mo(this.f13445c).distinctUntilChanged();
        } else {
            cVarDistinctUntilChanged = CoreModule.P().b().Yg() ? CoreModule.P().b().Da(this.f13445c).distinctUntilChanged() : c.just(new j760(-1, Boolean.FALSE));
        }
        duringCreated(mkd0.r(cVarDistinctUntilChanged2, cVarDistinctUntilChanged, new x9j() { // from class: l.xuz
            public final Object call(Object obj, Object obj2) {
                return j760.a((User) obj, (j760) obj2);
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.yuz
            public final void call(Object obj) {
                this.f23110a.m15456H0((j760) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public /* synthetic */ void m15434L0(com.p1.mobile.android.app.c cVar) {
        ((jq2) this).viewModel.p(qib0.b0.d.Kk(this.f13446d));
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m15438h0(Throwable th) {
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m15443m0() {
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m15444n0() {
    }

    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ void m15446p0(Picture picture, Conversation conversation) {
        if (NullChecker.a(picture)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(picture);
            conversation.localChatBg = arrayList;
        } else {
            conversation.localChatBg = null;
        }
        CoreModule.c.f0.mq(conversation);
    }

    /* JADX INFO: renamed from: A0 */
    public final void m15450A0() {
        if (ura.e().d().Cn()) {
            duringCreated(c.combineLatest(CoreModule.c.f0.Ue(m15464x0()), CoreModule.c.M1.s3(m15464x0()), CoreModule.c.e0.Ka(m15464x0()), new y9j() { // from class: l.vuz
                /* JADX INFO: renamed from: a */
                public final Object m24174a(Object obj, Object obj2, Object obj3) {
                    return new xaj0((Conversation) obj, (ChatHeat) obj2, (User) obj3);
                }
            })).subscribe(mkd0.G(new e30() { // from class: l.wuz
                public final void call(Object obj) {
                    this.f21996a.m15455G0((xaj0) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: C0 */
    public boolean m15451C0() {
        return this.f13443a;
    }

    /* JADX INFO: renamed from: D0 */
    public boolean m15452D0() {
        return this.f13444b;
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m15453E0(User user, roj0 roj0Var) {
        ((jq2) this).viewModel.p(qib0.b0.d.Kk(user));
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m15454F0(j760 j760Var) {
        ((jq2) this).viewModel.l(TextUtils.equals((CharSequence) j760Var.a, "heartbeatMatch"));
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m15455G0(xaj0 xaj0Var) {
        if (((User) xaj0Var.c).isTeamAccount()) {
            return;
        }
        if (NullChecker.a(xaj0Var.a) && TEnum.equals(((Conversation) xaj0Var.a).status, "dismissed")) {
            return;
        }
        if (NullChecker.a(xaj0Var.b)) {
            boolean zV7 = CoreModule.P().a().V7(((ChatHeat) xaj0Var.b).degree);
            rp2 rp2Var = ((jq2) this).viewModel;
            if (!zV7) {
                rp2Var.m(false);
                return;
            } else {
                rp2Var.m(true);
                ((jq2) this).viewModel.i(((ChatHeat) xaj0Var.b).specialRemind);
                return;
            }
        }
        if (!NullChecker.a(xaj0Var.a)) {
            ((jq2) this).viewModel.m(false);
            return;
        }
        boolean zV8 = CoreModule.P().a().V7(((Conversation) xaj0Var.a).mm);
        rp2 rp2Var2 = ((jq2) this).viewModel;
        if (!zV8) {
            rp2Var2.m(false);
        } else {
            rp2Var2.m(true);
            ((jq2) this).viewModel.i(false);
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m15456H0(j760 j760Var) {
        Object obj = j760Var.a;
        this.f13446d = (User) obj;
        ((jq2) this).viewModel.d((User) obj, ((Integer) ((j760) j760Var.b).a).intValue());
        this.f13447e.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m15457J0(Map map) {
        ((jq2) this).viewModel.k(this.f13446d);
    }

    /* JADX INFO: renamed from: N0 */
    public void m15458N0(final Picture picture) {
        if (ura.e().d().l()) {
            final Conversation conversationXe = CoreModule.c.f0.Xe(this.f13445c);
            e51.y(new Runnable() { // from class: l.bvz
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.c.U.a(new d30() { // from class: l.tuz
                        public final void call() {
                            ivz.m15446p0(picture, conversation);
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: renamed from: O0 */
    public void m15459O0() {
        CoreModule.P().a().Be();
    }

    /* JADX INFO: renamed from: Z */
    public void m15460Z() {
        super.Z();
        this.f13445c = act().getIntent().getStringExtra(SysnotifListener.KEY_USER_ID);
    }

    /* JADX INFO: renamed from: a0 */
    public void m15461a0() {
        creates(new e30() { // from class: l.cvz
            public final void call(Object obj) {
                this.f8955a.m15433I0((Bundle) obj);
            }
        });
        duringCreated(CoreModule.c.e0.N7()).subscribe(mkd0.G(new e30() { // from class: l.dvz
            public final void call(Object obj) {
                this.f9457a.m15457J0((Map) obj);
            }
        }));
        m15465y0();
        m15450A0();
        m15466z0();
        duringCreated(lifecycle().filter(new w9j() { // from class: l.evz
            public final Object call(Object obj) {
                return Boolean.valueOf(((com.p1.mobile.android.app.c) obj) == com.p1.mobile.android.app.c.i);
            }
        })).subscribe(new e30() { // from class: l.fvz
            public final void call(Object obj) {
                this.f10657a.m15434L0((com.p1.mobile.android.app.c) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t0 */
    public void m15462t0(final User user) {
        String str;
        mkd0.z(this.f13448f);
        this.f13448f = duringCreated(CoreModule.c.e0.T1.asObservable().skip(1)).observeOn(jo0.a()).subscribe(new e30() { // from class: l.suz
            public final void call(Object obj) {
                this.f19298a.m15453E0(user, (roj0) obj);
            }
        });
        if (qib0.b0.d.Kk(user)) {
            CoreModule.P().h().r8(act(), user, new Runnable() { // from class: l.zuz
                @Override // java.lang.Runnable
                public final void run() {
                    ivz.m15443m0();
                }
            });
            str = "remove";
        } else {
            CoreModule.P().h().xt(act(), user, new Runnable() { // from class: l.avz
                @Override // java.lang.Runnable
                public final void run() {
                    ivz.m15444n0();
                }
            });
            str = "add";
        }
        zvf0.u("e_blacklist", act().pageId(), new j760[]{j760.a("blacklist_management", str)});
    }

    /* JADX INFO: renamed from: u0 */
    public boolean m15463u0() {
        if (ura.e().d().x()) {
            Conversation conversationXe = CoreModule.c.f0.Xe(this.f13445c);
            if (NullChecker.a(conversationXe)) {
                if (TEnum.equals(conversationXe.status, "dismissed") && NullChecker.a(conversationXe.additional) && NullChecker.a(conversationXe.additional.quickChat)) {
                    return conversationXe.additional.quickChat.avatarBlurred;
                }
                if (CoreModule.c.e0.Pa(this.f13445c).isOnlinePending()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: x0 */
    public String m15464x0() {
        return this.f13445c;
    }

    /* JADX INFO: renamed from: y0 */
    public final void m15465y0() {
        if (ura.e().d().u()) {
            duringCreated(c.combineLatest(CoreModule.c.f0.Ne(this.f13445c).map(new w9j() { // from class: l.gvz
                public final Object call(Object obj) {
                    return ((Conversation) obj).convType;
                }
            }).distinctUntilChanged(), this.f13447e, new dmz())).subscribe(mkd0.G(new e30() { // from class: l.hvz
                public final void call(Object obj) {
                    this.f12304a.m15454F0((j760) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final void m15466z0() {
        if (ura.e().d().W8()) {
            duringCreated(CoreModule.c.f0.Ue(m15464x0()).filter(new C0622b()).map(new C0621a()).distinctUntilChanged()).subscribe(mkd0.H(new C0623c(), new e30() { // from class: l.uuz
                public final void call(Object obj) {
                    ivz.m15438h0((Throwable) obj);
                }
            }));
        }
    }

    public void destroy() {
    }
}
