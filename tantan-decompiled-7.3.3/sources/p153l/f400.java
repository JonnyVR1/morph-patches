package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Action;
import com.p051p1.mobile.putong.core.data.ChatHeat;
import com.p051p1.mobile.putong.core.data.ChatMM;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Map;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes4.dex */
public class f400 extends ar2<iq2> {

    /* JADX INFO: renamed from: a */
    public boolean f97021a;

    /* JADX INFO: renamed from: b */
    public boolean f97022b;

    /* JADX INFO: renamed from: c */
    public String f97023c;

    /* JADX INFO: renamed from: d */
    public User f97024d;

    /* JADX INFO: renamed from: e */
    public C22507a<uxj0> f97025e;

    /* JADX INFO: renamed from: f */
    public kcg0 f97026f;

    /* JADX INFO: renamed from: l.f400$a */
    public class C16885a implements qcj<Conversation, ChatMM> {
        public C16885a() {
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ChatMM call(Conversation conversation) {
            return conversation.additional.chatMM;
        }
    }

    /* JADX INFO: renamed from: l.f400$b */
    public class C16886b implements qcj<Conversation, Boolean> {
        public C16886b() {
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(Conversation conversation) {
            return Boolean.valueOf(NullChecker.m82486a(conversation) && NullChecker.m82486a(conversation.additional) && NullChecker.m82486a(conversation.additional.chatMM));
        }
    }

    /* JADX INFO: renamed from: l.f400$c */
    public class C16887c implements y20<ChatMM> {
        public C16887c() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(ChatMM chatMM) {
            ((iq2) f400.this.viewModel).mo50443j();
        }
    }

    public f400(ner nerVar) {
        super(nerVar);
        this.f97025e = C22507a.m222758b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public /* synthetic */ void m123823I0(Bundle bundle) {
        C22421c<pf60<Integer, Boolean>> c22421cDistinctUntilChanged;
        boolean z = false;
        this.f97021a = act().getIntent().getBooleanExtra("is_svip_unmatch", false);
        if (gta.m132210e().m132214d().mo34661B() && hcp.m134490c(this.f97023c)) {
            z = true;
        }
        this.f97022b = z;
        C22421c<User> c22421cDistinctUntilChanged2 = CoreModule.f18264c.f20381e0.m116483Ka(this.f97023c).distinctUntilChanged();
        if (gta.m132210e().m132214d().mo34811c()) {
            c22421cDistinctUntilChanged = CoreModule.f18264c.f20384f0.m34051mo(this.f97023c).distinctUntilChanged();
        } else {
            c22421cDistinctUntilChanged = CoreModule.m30933P().m143406b().mo36110Yg() ? CoreModule.m30933P().m143406b().mo36096Da(this.f97023c).distinctUntilChanged() : C22421c.just(new pf60(-1, Boolean.FALSE));
        }
        duringCreated(psd0.m173625r(c22421cDistinctUntilChanged2, c22421cDistinctUntilChanged, new rcj() { // from class: l.u300
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return pf60.m172085a((User) obj, (pf60) obj2);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.v300
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f182138a.m123846H0((pf60) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public /* synthetic */ void m123824L0(C4470c c4470c) {
        ((iq2) this.viewModel).mo50446p(uqb0.f180396b0.f170327d.mo61472Kk(this.f97024d));
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m123828h0(Throwable th) {
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m123833m0() {
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m123834n0() {
    }

    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ void m123836p0(Picture picture, Conversation conversation) {
        if (NullChecker.m82486a(picture)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(picture);
            conversation.localChatBg = arrayList;
        } else {
            conversation.localChatBg = null;
        }
        CoreModule.f18264c.f20384f0.m34053mq(conversation);
    }

    /* JADX INFO: renamed from: A0 */
    public final void m123840A0() {
        if (gta.m132210e().m132214d().mo34670Cn()) {
            duringCreated(C22421c.combineLatest(CoreModule.f18264c.f20384f0.m33823Ue(m123852x0()), CoreModule.f18264c.f20328M1.m111474s3(m123852x0()), CoreModule.f18264c.f20381e0.m116483Ka(m123852x0()), new scj() { // from class: l.s300
                @Override // p153l.scj
                /* JADX INFO: renamed from: a */
                public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                    return new bkj0((Conversation) obj, (ChatHeat) obj2, (User) obj3);
                }
            })).subscribe(psd0.m173596G(new y20() { // from class: l.t300
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f171846a.m123845G0((bkj0) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: C0 */
    public boolean m123841C0() {
        return this.f97021a;
    }

    /* JADX INFO: renamed from: D0 */
    public boolean m123842D0() {
        return this.f97022b;
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m123843E0(User user, uxj0 uxj0Var) {
        ((iq2) this.viewModel).mo50446p(uqb0.f180396b0.f170327d.mo61472Kk(user));
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m123844F0(pf60 pf60Var) {
        ((iq2) this.viewModel).mo50445l(TextUtils.equals((CharSequence) pf60Var.f152156a, "heartbeatMatch"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m123845G0(bkj0 bkj0Var) {
        if (((User) bkj0Var.f77083c).isTeamAccount()) {
            return;
        }
        if (NullChecker.m82486a(bkj0Var.f77081a) && TEnum.equals(((Conversation) bkj0Var.f77081a).status, "dismissed")) {
            return;
        }
        if (NullChecker.m82486a(bkj0Var.f77082b)) {
            boolean zMo34435V7 = CoreModule.m30933P().m143405a().mo34435V7(((ChatHeat) bkj0Var.f77082b).degree);
            V v2 = this.viewModel;
            if (!zMo34435V7) {
                ((iq2) v2).mo50505m(false);
                return;
            } else {
                ((iq2) v2).mo50505m(true);
                ((iq2) this.viewModel).mo50504i(((ChatHeat) bkj0Var.f77082b).specialRemind);
                return;
            }
        }
        if (!NullChecker.m82486a(bkj0Var.f77081a)) {
            ((iq2) this.viewModel).mo50505m(false);
            return;
        }
        boolean zMo34435V8 = CoreModule.m30933P().m143405a().mo34435V7(((Conversation) bkj0Var.f77081a).f21116mm);
        V v3 = this.viewModel;
        if (!zMo34435V8) {
            ((iq2) v3).mo50505m(false);
        } else {
            ((iq2) v3).mo50505m(true);
            ((iq2) this.viewModel).mo50504i(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m123846H0(pf60 pf60Var) {
        F f = pf60Var.f152156a;
        this.f97024d = (User) f;
        ((iq2) this.viewModel).mo50442d((User) f, ((Integer) ((pf60) pf60Var.f152157b).f152156a).intValue());
        this.f97025e.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m123847J0(Map map) {
        ((iq2) this.viewModel).mo50444k(this.f97024d);
    }

    /* JADX INFO: renamed from: N0 */
    public void m123848N0(final Picture picture) {
        if (gta.m132210e().m132214d().mo34878l()) {
            final Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(this.f97023c);
            l51.m152919y(new Runnable() { // from class: l.y300
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f18264c.f20351U.m128074a(new x20() { // from class: l.q300
                        @Override // p153l.x20
                        public final void call() {
                            f400.m123836p0(picture, conversation);
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: renamed from: O0 */
    public void m123849O0() {
        CoreModule.m30933P().m143405a().mo34295Be();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        this.f97023c = act().getIntent().getStringExtra("user_id");
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.z300
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f202774a.m123823I0((Bundle) obj);
            }
        });
        duringCreated(CoreModule.f18264c.f20381e0.m116492N7()).subscribe(psd0.m173596G(new y20() { // from class: l.a400
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f68344a.m123847J0((Map) obj);
            }
        }));
        m123853y0();
        m123840A0();
        m123854z0();
        duringCreated(lifecycle().filter(new qcj() { // from class: l.b400
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
            }
        })).subscribe(new y20() { // from class: l.c400
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f79658a.m123824L0((C4470c) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t0 */
    public void m123850t0(final User user) {
        String str;
        psd0.m173633z(this.f97026f);
        this.f97026f = duringCreated(CoreModule.f18264c.f20381e0.f89128T1.asObservable().skip(1)).observeOn(fo0.m126432a()).subscribe(new y20() { // from class: l.p300
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f150350a.m123843E0(user, (uxj0) obj);
            }
        });
        if (uqb0.f180396b0.f170327d.mo61472Kk(user)) {
            CoreModule.m30933P().m143411h().mo45073r8(act(), user, new Runnable() { // from class: l.w300
                @Override // java.lang.Runnable
                public final void run() {
                    f400.m123833m0();
                }
            });
            str = Action.remove;
        } else {
            CoreModule.m30933P().m143411h().mo45075xt(act(), user, new Runnable() { // from class: l.x300
                @Override // java.lang.Runnable
                public final void run() {
                    f400.m123834n0();
                }
            });
            str = "add";
        }
        i4g0.m138523u("e_blacklist", act().pageId(), pf60.m172085a("blacklist_management", str));
    }

    /* JADX INFO: renamed from: u0 */
    public boolean m123851u0() {
        if (gta.m132210e().m132214d().mo34945x()) {
            Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(this.f97023c);
            if (NullChecker.m82486a(conversationM33859Xe)) {
                if (TEnum.equals(conversationM33859Xe.status, "dismissed") && NullChecker.m82486a(conversationM33859Xe.additional) && NullChecker.m82486a(conversationM33859Xe.additional.quickChat)) {
                    return conversationM33859Xe.additional.quickChat.avatarBlurred;
                }
                if (CoreModule.f18264c.f20381e0.m116503Pa(this.f97023c).isOnlinePending()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: x0 */
    public String m123852x0() {
        return this.f97023c;
    }

    /* JADX INFO: renamed from: y0 */
    public final void m123853y0() {
        if (gta.m132210e().m132214d().mo34934u()) {
            duringCreated(C22421c.combineLatest(CoreModule.f18264c.f20384f0.m33740Ne(this.f97023c).map(new qcj() { // from class: l.d400
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((Conversation) obj).convType;
                }
            }).distinctUntilChanged(), this.f97025e, new avz())).subscribe(psd0.m173596G(new y20() { // from class: l.e400
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f92023a.m123844F0((pf60) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final void m123854z0() {
        if (gta.m132210e().m132214d().mo34776W8()) {
            duringCreated(CoreModule.f18264c.f20384f0.m33823Ue(m123852x0()).filter(new C16886b()).map(new C16885a()).distinctUntilChanged()).subscribe(psd0.m173597H(new C16887c(), new y20() { // from class: l.r300
                @Override // p153l.y20
                public final void call(Object obj) {
                    f400.m123828h0((Throwable) obj);
                }
            }));
        }
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
