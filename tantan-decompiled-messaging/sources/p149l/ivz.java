package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Action;
import com.p046p1.mobile.putong.core.data.ChatHeat;
import com.p046p1.mobile.putong.core.data.ChatMM;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Map;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes4.dex */
public class ivz extends jq2<rp2> {

    /* JADX INFO: renamed from: a */
    public boolean f115208a;

    /* JADX INFO: renamed from: b */
    public boolean f115209b;

    /* JADX INFO: renamed from: c */
    public String f115210c;

    /* JADX INFO: renamed from: d */
    public User f115211d;

    /* JADX INFO: renamed from: e */
    public C22392a<roj0> f115212e;

    /* JADX INFO: renamed from: f */
    public c4g0 f115213f;

    /* JADX INFO: renamed from: l.ivz$a */
    public class C17630a implements w9j<Conversation, ChatMM> {
        public C17630a() {
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ChatMM call(Conversation conversation) {
            return conversation.additional.chatMM;
        }
    }

    /* JADX INFO: renamed from: l.ivz$b */
    public class C17631b implements w9j<Conversation, Boolean> {
        public C17631b() {
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(Conversation conversation) {
            return Boolean.valueOf(NullChecker.m81303a(conversation) && NullChecker.m81303a(conversation.additional) && NullChecker.m81303a(conversation.additional.chatMM));
        }
    }

    /* JADX INFO: renamed from: l.ivz$c */
    public class C17632c implements e30<ChatMM> {
        public C17632c() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(ChatMM chatMM) {
            ((rp2) ivz.this.viewModel).mo49260j();
        }
    }

    public ivz(mcr mcrVar) {
        super(mcrVar);
        this.f115212e = C22392a.m221512b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public /* synthetic */ void m138669I0(Bundle bundle) {
        C22306c<j760<Integer, Boolean>> c22306cDistinctUntilChanged;
        boolean z = false;
        this.f115208a = act().getIntent().getBooleanExtra("is_svip_unmatch", false);
        if (ura.m195053e().m195057d().mo33658B() && hap.m130154c(this.f115210c)) {
            z = true;
        }
        this.f115209b = z;
        C22306c<User> c22306cDistinctUntilChanged2 = CoreModule.f17545c.f19639e0.m169410Ka(this.f115210c).distinctUntilChanged();
        if (ura.m195053e().m195057d().mo33808c()) {
            c22306cDistinctUntilChanged = CoreModule.f17545c.f19642f0.m33048mo(this.f115210c).distinctUntilChanged();
        } else {
            c22306cDistinctUntilChanged = CoreModule.m29935P().m94652b().mo35107Yg() ? CoreModule.m29935P().m94652b().mo35093Da(this.f115210c).distinctUntilChanged() : C22306c.just(new j760(-1, Boolean.FALSE));
        }
        duringCreated(mkd0.m154984r(c22306cDistinctUntilChanged2, c22306cDistinctUntilChanged, new x9j() { // from class: l.xuz
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return j760.m140076a((User) obj, (j760) obj2);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.yuz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f200141a.m138692H0((j760) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public /* synthetic */ void m138670L0(C4319c c4319c) {
        ((rp2) this.viewModel).mo49263p(qib0.f154713b0.f139233d.mo60288Kk(this.f115211d));
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m138674h0(Throwable th) {
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m138679m0() {
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m138680n0() {
    }

    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ void m138682p0(Picture picture, Conversation conversation) {
        if (NullChecker.m81303a(picture)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(picture);
            conversation.localChatBg = arrayList;
        } else {
            conversation.localChatBg = null;
        }
        CoreModule.f17545c.f19642f0.m33050mq(conversation);
    }

    /* JADX INFO: renamed from: A0 */
    public final void m138686A0() {
        if (ura.m195053e().m195057d().mo33667Cn()) {
            duringCreated(C22306c.combineLatest(CoreModule.f17545c.f19642f0.m32820Ue(m138698x0()), CoreModule.f17545c.f19586M1.m215249s3(m138698x0()), CoreModule.f17545c.f19639e0.m169410Ka(m138698x0()), new y9j() { // from class: l.vuz
                @Override // p149l.y9j
                /* JADX INFO: renamed from: a */
                public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                    return new xaj0((Conversation) obj, (ChatHeat) obj2, (User) obj3);
                }
            })).subscribe(mkd0.m154955G(new e30() { // from class: l.wuz
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f188175a.m138691G0((xaj0) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: C0 */
    public boolean m138687C0() {
        return this.f115208a;
    }

    /* JADX INFO: renamed from: D0 */
    public boolean m138688D0() {
        return this.f115209b;
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m138689E0(User user, roj0 roj0Var) {
        ((rp2) this.viewModel).mo49263p(qib0.f154713b0.f139233d.mo60288Kk(user));
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m138690F0(j760 j760Var) {
        ((rp2) this.viewModel).mo49262l(TextUtils.equals((CharSequence) j760Var.f116564a, "heartbeatMatch"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m138691G0(xaj0 xaj0Var) {
        if (((User) xaj0Var.f191753c).isTeamAccount()) {
            return;
        }
        if (NullChecker.m81303a(xaj0Var.f191751a) && TEnum.equals(((Conversation) xaj0Var.f191751a).status, "dismissed")) {
            return;
        }
        if (NullChecker.m81303a(xaj0Var.f191752b)) {
            boolean zMo33432V7 = CoreModule.m29935P().m94651a().mo33432V7(((ChatHeat) xaj0Var.f191752b).degree);
            V v2 = this.viewModel;
            if (!zMo33432V7) {
                ((rp2) v2).mo49322m(false);
                return;
            } else {
                ((rp2) v2).mo49322m(true);
                ((rp2) this.viewModel).mo49321i(((ChatHeat) xaj0Var.f191752b).specialRemind);
                return;
            }
        }
        if (!NullChecker.m81303a(xaj0Var.f191751a)) {
            ((rp2) this.viewModel).mo49322m(false);
            return;
        }
        boolean zMo33432V8 = CoreModule.m29935P().m94651a().mo33432V7(((Conversation) xaj0Var.f191751a).f20374mm);
        V v3 = this.viewModel;
        if (!zMo33432V8) {
            ((rp2) v3).mo49322m(false);
        } else {
            ((rp2) v3).mo49322m(true);
            ((rp2) this.viewModel).mo49321i(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m138692H0(j760 j760Var) {
        F f = j760Var.f116564a;
        this.f115211d = (User) f;
        ((rp2) this.viewModel).mo49259d((User) f, ((Integer) ((j760) j760Var.f116565b).f116564a).intValue());
        this.f115212e.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m138693J0(Map map) {
        ((rp2) this.viewModel).mo49261k(this.f115211d);
    }

    /* JADX INFO: renamed from: N0 */
    public void m138694N0(final Picture picture) {
        if (ura.m195053e().m195057d().mo33875l()) {
            final Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(this.f115210c);
            e51.m114774y(new Runnable() { // from class: l.bvz
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f17545c.f19609U.m109085a(new d30() { // from class: l.tuz
                        @Override // p149l.d30
                        public final void call() {
                            ivz.m138682p0(picture, conversation);
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: renamed from: O0 */
    public void m138695O0() {
        CoreModule.m29935P().m94651a().mo33292Be();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        this.f115210c = act().getIntent().getStringExtra("user_id");
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.cvz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f82723a.m138669I0((Bundle) obj);
            }
        });
        duringCreated(CoreModule.f17545c.f19639e0.m169419N7()).subscribe(mkd0.m154955G(new e30() { // from class: l.dvz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f88132a.m138693J0((Map) obj);
            }
        }));
        m138699y0();
        m138686A0();
        m138700z0();
        duringCreated(lifecycle().filter(new w9j() { // from class: l.evz
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
            }
        })).subscribe(new e30() { // from class: l.fvz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f99487a.m138670L0((C4319c) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t0 */
    public void m138696t0(final User user) {
        String str;
        mkd0.m154992z(this.f115213f);
        this.f115213f = duringCreated(CoreModule.f17545c.f19639e0.f149271T1.asObservable().skip(1)).observeOn(jo0.m142408a()).subscribe(new e30() { // from class: l.suz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f166508a.m138689E0(user, (roj0) obj);
            }
        });
        if (qib0.f154713b0.f139233d.mo60288Kk(user)) {
            CoreModule.m29935P().m94657h().mo43887r8(act(), user, new Runnable() { // from class: l.zuz
                @Override // java.lang.Runnable
                public final void run() {
                    ivz.m138679m0();
                }
            });
            str = Action.remove;
        } else {
            CoreModule.m29935P().m94657h().mo43889xt(act(), user, new Runnable() { // from class: l.avz
                @Override // java.lang.Runnable
                public final void run() {
                    ivz.m138680n0();
                }
            });
            str = "add";
        }
        zvf0.m220399u("e_blacklist", act().pageId(), j760.m140076a("blacklist_management", str));
    }

    /* JADX INFO: renamed from: u0 */
    public boolean m138697u0() {
        if (ura.m195053e().m195057d().mo33942x()) {
            Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(this.f115210c);
            if (NullChecker.m81303a(conversationM32856Xe)) {
                if (TEnum.equals(conversationM32856Xe.status, "dismissed") && NullChecker.m81303a(conversationM32856Xe.additional) && NullChecker.m81303a(conversationM32856Xe.additional.quickChat)) {
                    return conversationM32856Xe.additional.quickChat.avatarBlurred;
                }
                if (CoreModule.f17545c.f19639e0.m169430Pa(this.f115210c).isOnlinePending()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: x0 */
    public String m138698x0() {
        return this.f115210c;
    }

    /* JADX INFO: renamed from: y0 */
    public final void m138699y0() {
        if (ura.m195053e().m195057d().mo33931u()) {
            duringCreated(C22306c.combineLatest(CoreModule.f17545c.f19642f0.m32737Ne(this.f115210c).map(new w9j() { // from class: l.gvz
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Conversation) obj).convType;
                }
            }).distinctUntilChanged(), this.f115212e, new dmz())).subscribe(mkd0.m154955G(new e30() { // from class: l.hvz
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f109709a.m138690F0((j760) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final void m138700z0() {
        if (ura.m195053e().m195057d().mo33773W8()) {
            duringCreated(CoreModule.f17545c.f19642f0.m32820Ue(m138698x0()).filter(new C17631b()).map(new C17630a()).distinctUntilChanged()).subscribe(mkd0.m154956H(new C17632c(), new e30() { // from class: l.uuz
                @Override // p149l.e30
                public final void call(Object obj) {
                    ivz.m138674h0((Throwable) obj);
                }
            }));
        }
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
