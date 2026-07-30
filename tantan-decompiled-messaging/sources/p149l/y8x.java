package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.BreakIce;
import com.p046p1.mobile.putong.core.data.ChatHeatActionData;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.IceBreakQuestion;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.data.UserPrivilege;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.oms.OmsDialog;
import com.p046p1.mobile.putong.core.p053ui.match.C8455a;
import com.p046p1.mobile.putong.core.p053ui.match.C8456b;
import com.p046p1.mobile.putong.core.p053ui.match.MatchAct;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.IdBoxed;
import com.p046p1.mobile.putong.data.Link;
import com.p046p1.mobile.putong.data.LinkChannel;
import com.p046p1.mobile.putong.data.LinkIntent;
import com.p046p1.mobile.putong.data.NavigationIntent;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.p065ui.share.ShareHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashSet;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes3.dex */
public class y8x extends l5x<y9x> {

    /* JADX INFO: renamed from: d */
    public ArrayList<String> f196891d;

    /* JADX INFO: renamed from: e */
    public ArrayList<String> f196892e;

    /* JADX INFO: renamed from: f */
    public C22392a<roj0> f196893f;

    /* JADX INFO: renamed from: g */
    public boolean f196894g;

    /* JADX INFO: renamed from: h */
    public boolean f196895h;

    /* JADX INFO: renamed from: i */
    public IceBreakQuestion f196896i;

    /* JADX INFO: renamed from: j */
    public String f196897j;

    public y8x(mcr mcrVar) {
        super(mcrVar);
        this.f196893f = C22392a.m221513c(roj0.f160388a);
        this.f196894g = false;
        this.f196895h = true;
        this.f196896i = null;
    }

    /* JADX INFO: renamed from: D0 */
    public static /* synthetic */ void m213442D0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E1 */
    public /* synthetic */ void m213444E1() {
        m213507g2(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H1 */
    public /* synthetic */ void m213448H1() {
        m213506f2(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I1 */
    public /* synthetic */ void m213450I1() {
        m213510j2(true);
    }

    /* JADX INFO: renamed from: L0 */
    public static /* synthetic */ void m213452L0(User user) {
        Conversation conversationQuery = CoreModule.f17553k.f91950m.query(user.f56011id);
        conversationQuery.convType = "default";
        CoreModule.f17545c.f19642f0.m33050mq(conversationQuery);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O1 */
    public /* synthetic */ void m213455O1(roj0 roj0Var) {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        User userById = CoreModule.m29932K().getUserById(this.f126211b);
        this.f126212c = userById;
        ((y9x) this.viewModel).m213670U1(userM169527p9, userById, this.f126210a, this.f196892e);
    }

    /* JADX INFO: renamed from: S0 */
    public static /* synthetic */ void m213459S0(Conversation conversation) {
        conversation.read = Boolean.TRUE;
        CoreModule.f17545c.f19642f0.m33050mq(conversation);
    }

    /* JADX INFO: renamed from: U0 */
    public static /* synthetic */ void m213460U0(PurchaseType purchaseType) {
    }

    /* JADX INFO: renamed from: a1 */
    public static /* synthetic */ void m213465a1(Throwable th) {
    }

    /* JADX INFO: renamed from: g1 */
    public static /* synthetic */ void m213471g1(Throwable th) {
    }

    /* JADX INFO: renamed from: o1 */
    public static /* synthetic */ void m213479o1(Throwable th) {
    }

    /* JADX INFO: renamed from: q1 */
    private String m213481q1() {
        if (!(act() instanceof MatchAct)) {
            return "p_intl_instantmatch_no_ultra_view,e_intl_instantmatch_no_ultra_click,click";
        }
        String str = ((MatchAct) act()).f30469e;
        return !TextUtils.isEmpty(str) ? str : "p_intl_instantmatch_no_ultra_view,e_intl_instantmatch_no_ultra_click,click";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v1 */
    public /* synthetic */ void m213482v1() {
        m213508h2(true);
    }

    /* JADX INFO: renamed from: B1 */
    public final /* synthetic */ void m213483B1(User user) {
        C8456b.m47638r(act(), user);
        act().m66873d2();
    }

    /* JADX INFO: renamed from: C1 */
    public final /* synthetic */ void m213484C1(final User user, Integer num) {
        e51.m114774y(new Runnable() { // from class: l.c8x
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.f17545c.f19609U.m109085a(new d30() { // from class: l.p8x
                    @Override // p149l.d30
                    public final void call() {
                        y8x.m213452L0(user);
                    }
                });
            }
        });
        az50.INSTANCE.m99623c();
        CoreModule.m29932K().pollConversation();
        e51.m114743H(act(), new Runnable() { // from class: l.d8x
            @Override // java.lang.Runnable
            public final void run() {
                this.f84911a.m213483B1(user);
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: D1 */
    public final /* synthetic */ void m213485D1(Counter counter) {
        if (CoreModule.m29935P().m94651a().mo33489e2()) {
            return;
        }
        final User userById = CoreModule.m29932K().getUserById(this.f126211b);
        tae0.m187716t(act(), userById, new e30() { // from class: l.q7x
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f153090a.m213484C1(userById, (Integer) obj);
            }
        });
    }

    /* JADX INFO: renamed from: F1 */
    public final /* synthetic */ void m213486F1(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            V v2 = this.viewModel;
            ((y9x) v2).f197028P0.m123794g(((y9x) v2).getAct());
            ((y9x) this.viewModel).m213684f2();
            ((y9x) this.viewModel).m213689i2();
            return;
        }
        if (c4319c == C4319c.f15549j) {
            ((y9x) this.viewModel).f197028P0.m123794g(null);
        } else if (c4319c == C4319c.f15552m) {
            ((y9x) this.viewModel).f197028P0.m123789b();
        }
    }

    /* JADX INFO: renamed from: J1 */
    public final /* synthetic */ void m213487J1() {
        m213505e2(true);
    }

    /* JADX INFO: renamed from: L1 */
    public final /* synthetic */ void m213488L1(Bundle bundle) {
        act().setSwipeBackEnable(false);
        mgh0.m154563s();
        if (this.f126210a == 13 && mx0.m156802o().m156804B()) {
            if (ogl0.m164227F()) {
                ic50.m135327j().m135333f().m145241b0(OmsDialog.p_appstore_rating_filter_popup_store.getIdentifier(), 0, true);
            }
            mx0.m156782I(act(), false, 5.0f, "superlike");
        }
        ((y9x) this.viewModel).m213690j1(NullChecker.m81303a(bundle), this.f126210a);
        if (this.f126210a == 40 && tae0.m187700c()) {
            this.f196894g = true;
            e51.m114743H(act(), new Runnable() { // from class: l.u7x
                @Override // java.lang.Runnable
                public final void run() {
                    this.f175083a.m213482v1();
                }
            }, 1500L);
            return;
        }
        int i = this.f126210a;
        if (i == 41) {
            this.f196894g = true;
            this.f196895h = act().getIntent().getBooleanExtra("o_diamond_fake_auto_match", true);
            e51.m114743H(act(), new Runnable() { // from class: l.v7x
                @Override // java.lang.Runnable
                public final void run() {
                    this.f180430a.m213444E1();
                }
            }, 1500L);
        } else if (i == 50) {
            this.f196894g = true;
            e51.m114743H(act(), new Runnable() { // from class: l.w7x
                @Override // java.lang.Runnable
                public final void run() {
                    this.f185117a.m213448H1();
                }
            }, 1500L);
        } else if (i == 43) {
            this.f196894g = true;
            e51.m114743H(act(), new Runnable() { // from class: l.x7x
                @Override // java.lang.Runnable
                public final void run() {
                    this.f191388a.m213450I1();
                }
            }, 1500L);
        } else if (i == 49) {
            this.f196894g = true;
            e51.m114743H(act(), new Runnable() { // from class: l.y7x
                @Override // java.lang.Runnable
                public final void run() {
                    this.f196748a.m213487J1();
                }
            }, 1500L);
        }
    }

    /* JADX INFO: renamed from: N1 */
    public final /* synthetic */ void m213489N1() {
        ((y9x) this.viewModel).destroy();
    }

    /* JADX INFO: renamed from: P1 */
    public final /* synthetic */ void m213490P1(Counter counter) {
        if (CoreModule.m29935P().m94651a().mo33489e2()) {
            return;
        }
        act().m66873d2();
    }

    /* JADX INFO: renamed from: Q1 */
    public final /* synthetic */ void m213491Q1(boolean z, boolean z2, roj0 roj0Var) {
        if (!z) {
            CoreModule.f17545c.f19642f0.f19897S1.m132487l(this.f126212c);
        }
        if (z2) {
            lsi0.m151595y("消息已发送");
        }
        act().m66873d2();
    }

    /* JADX INFO: renamed from: R1 */
    public final /* synthetic */ void m213492R1(Message message, Throwable th) {
        if (su4.m185996f(th)) {
            su4.m185995e(act(), th, ChatHeatActionData.ExclusiveAction.CHECK);
        } else if (TantanException.Client.TantanForbidden.isIllegalContent(th)) {
            CoreModule.f17545c.f19642f0.m32750Of(message.f56011id);
            osi0.m165782f(R$string.f17844J7);
        } else {
            ccx.m106209f(R$string.f19096yh, this.f126212c.m60124fp().profileSmall());
            act().m66873d2();
        }
    }

    /* JADX INFO: renamed from: S1 */
    public final /* synthetic */ void m213493S1(final Conversation conversation, String str, final boolean z) {
        if (NullChecker.m81303a(conversation)) {
            e51.m114774y(new Runnable() { // from class: l.l8x
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f17545c.f19609U.m109085a(new d30() { // from class: l.q8x
                        @Override // p149l.d30
                        public final void call() {
                            y8x.m213459S0(conversation);
                        }
                    });
                }
            });
        }
        final Message message = new Message();
        message.value = str;
        message.messageType = MessageType.get("text");
        final boolean z2 = ((y9x) this.viewModel).f197016J0;
        CoreModule.f17545c.f19642f0.m32649Fn(this.f126211b, message, null, false, false).flatMap(new w9j() { // from class: l.m8x
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreModule.f17545c.f19642f0.m32650Fo();
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.n8x
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f137699a.m213491Q1(z2, z, (roj0) obj);
            }
        }, new e30() { // from class: l.o8x
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f142681a.m213492R1(message, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T1 */
    public final /* synthetic */ void m213494T1(String str, boolean z) {
        m213502b2(str, z, false);
    }

    /* JADX INFO: renamed from: U1 */
    public final /* synthetic */ void m213495U1(Boolean bool) {
        this.f196894g = false;
    }

    /* JADX INFO: renamed from: V1 */
    public final /* synthetic */ void m213496V1() {
        this.f196894g = false;
    }

    /* JADX INFO: renamed from: W1 */
    public final /* synthetic */ void m213497W1() {
        this.f196894g = false;
    }

    /* JADX INFO: renamed from: X1 */
    public final /* synthetic */ void m213498X1() {
        this.f196894g = false;
    }

    /* JADX INFO: renamed from: Y1 */
    public final /* synthetic */ void m213499Y1() {
        this.f196894g = false;
    }

    /* JADX INFO: renamed from: Z1 */
    public void m213500Z1() {
        if (this.f196891d.size() <= 1) {
            ((y9x) this.viewModel).m213663Q1();
            act().m66873d2();
        } else {
            this.f126211b = this.f196891d.get(1);
            this.f196891d.remove(0);
            this.f196892e.remove(0);
            this.f196893f.m132487l(roj0.f160388a);
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        int i;
        if (u59.m191827f0() && (i = this.f126210a) != 40 && i != 41) {
            CoreModule.f17545c.f19642f0.m32650Fo();
        }
        creates(new e30() { // from class: l.o7x
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f142548a.m213488L1((Bundle) obj);
            }
        }, new d30() { // from class: l.k8x
            @Override // p149l.d30
            public final void call() {
                this.f121875a.m213489N1();
            }
        });
        duringCreated(this.f196893f).subscribe(mkd0.m154955G(new e30() { // from class: l.r8x
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f158263a.m213455O1((roj0) obj);
            }
        }));
        int i2 = this.f126210a;
        if (i2 == 40) {
            duringCreated(CoreModule.f17545c.m31483n3().distinctUntilChanged()).subscribe(mkd0.m154956H(new e30() { // from class: l.s8x
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f163118a.m213490P1((Counter) obj);
                }
            }, new e30() { // from class: l.t8x
                @Override // p149l.e30
                public final void call(Object obj) {
                    y8x.m213471g1((Throwable) obj);
                }
            }));
            return;
        }
        if (i2 == 41) {
            duringCreated(CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("oDiamond"))).distinctUntilChanged().subscribe(mkd0.m154956H(new e30() { // from class: l.u8x
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f175174a.m213516z1((UserPrivilege) obj);
                }
            }, new e30() { // from class: l.v8x
                @Override // p149l.e30
                public final void call(Object obj) {
                    y8x.m213465a1((Throwable) obj);
                }
            }));
            return;
        }
        if (i2 == 43) {
            duringCreated(CoreModule.f17545c.m31483n3().distinctUntilChanged()).filter(new w9j() { // from class: l.w8x
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(!CoreModule.m29935P().m94651a().mo33489e2());
                }
            }).take(1).subscribe(mkd0.m154956H(new e30() { // from class: l.x8x
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f191563a.m213485D1((Counter) obj);
                }
            }, new e30() { // from class: l.p7x
                @Override // p149l.e30
                public final void call(Object obj) {
                    y8x.m213479o1((Throwable) obj);
                }
            }));
            return;
        }
        if (i2 == 49) {
            m148673r0();
            return;
        }
        if (i2 == 50) {
            m148674s0();
            return;
        }
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.z7x
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f202081a.m213486F1((C4319c) obj);
            }
        }));
        if (upa.m194750f2()) {
            m213513t1();
        }
    }

    /* JADX INFO: renamed from: a2 */
    public void m213501a2(BreakIce breakIce, String str) {
        if (TextUtils.equals(str, this.f196897j)) {
            return;
        }
        this.f196897j = str;
        m213502b2(breakIce.content, false, true);
    }

    /* JADX INFO: renamed from: b2 */
    public final void m213502b2(final String str, boolean z, final boolean z2) {
        final Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(this.f126211b);
        act().postDelayed(new Runnable() { // from class: l.g8x
            @Override // java.lang.Runnable
            public final void run() {
                this.f101523a.m213493S1(conversationM32856Xe, str, z2);
            }
        }, z ? 500L : 1L);
        if (z) {
            act().hideInput();
        }
    }

    /* JADX INFO: renamed from: c2 */
    public void m213503c2(final String str, final boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!qib0.f154711Z.m119125K(str)) {
            m213502b2(str, z, false);
            return;
        }
        act().dialog().m20503E0(R$string.f19127zi).m20500D(R$string.f19067xi).m20541k0(R$string.f19037wi).m20556t0(R$string.f19097yi, new Runnable() { // from class: l.a8x
            @Override // java.lang.Runnable
            public final void run() {
                this.f68096a.m213494T1(str, z);
            }
        }).m20568z0();
        HashSet hashSet = new HashSet(MessagesAct.f31635r.get());
        hashSet.add(CoreModule.f17545c.f19639e0.m169430Pa(this.f126211b).f56011id);
        MessagesAct.f31635r.put(hashSet);
    }

    /* JADX INFO: renamed from: d2 */
    public void m213504d2() {
        Link link = new Link();
        link.intent = LinkIntent.get("matched");
        link.channel = LinkChannel.get("unknown");
        zvf0.m220399u("e_match_share_button", "p_successful_match_view", vwb.m200311Y("share_to", "system"));
        link.resources = vwb.m200324f0(new IdBoxed(this.f126211b, "relationship"));
        new ShareHelper(link).m80019w0(act(), act().string(R$string.f19043wo), act().string(R$string.f19073xo), vwb.m200324f0(LinkChannel.get("unknown")), true);
    }

    /* JADX INFO: renamed from: e2 */
    public void m213505e2(boolean z) {
        if (z || !this.f196894g) {
            this.f196894g = true;
            CoreModule.m29935P().m94651a().mo33362Lf(act(), "p_intl_premium_match,e_intl_match_sayhi,click", Privilege.see_who_likes_me, new e30() { // from class: l.i8x
                @Override // p149l.e30
                public final void call(Object obj) {
                    y8x.m213460U0((PurchaseType) obj);
                }
            }, new e30() { // from class: l.j8x
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f116821a.m213495U1((Boolean) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: f2 */
    public void m213506f2(boolean z) {
        if (z || !this.f196894g) {
            C8455a.m47588w().m47609o(act(), m213481q1(), new d30() { // from class: l.h8x
                @Override // p149l.d30
                public final void call() {
                    this.f106482a.m213496V1();
                }
            });
        }
    }

    /* JADX INFO: renamed from: g2 */
    public void m213507g2(boolean z) {
        if (z || !this.f196894g) {
            C8456b.m47633l(act(), (TextUtils.equals(((y9x) this.viewModel).getAct().f30469e, "p_chat_greet,odiamond_sayhi") || TextUtils.equals(((y9x) this.viewModel).getAct().f30469e, "p_user_live_room,e_odiamond_sayhi,click") || TextUtils.equals(((y9x) this.viewModel).getAct().f30469e, "p_home,odiamond_sayhi") || TextUtils.equals(((y9x) this.viewModel).getAct().f30469e, "p_album,e_odiamond_sayhi,click") || TextUtils.equals(((y9x) this.viewModel).getAct().f30469e, "p_home_nearby,odiamond_sayhi") || TextUtils.equals(((y9x) this.viewModel).getAct().f30469e, "p_meet,e_odiamond_sayhi,click") || TextUtils.equals(((y9x) this.viewModel).getAct().f30469e, "p_navigation_nearby,odiamond_sayhi") || TextUtils.equals(((y9x) this.viewModel).getAct().f30469e, "p_personalized,odiamond_sayhi") || TextUtils.equals(((y9x) this.viewModel).getAct().f30469e, "p_profile,odiamond_sayhi") || TextUtils.equals(((y9x) this.viewModel).getAct().f30469e, "p_meet_nearby,odiamond_sayhi")) ? ((y9x) this.viewModel).getAct().f30469e : "p_suggest_user_profile_info_view,e_odiamond_sayhi,click", new d30() { // from class: l.e8x
                @Override // p149l.d30
                public final void call() {
                    this.f89891a.m213497W1();
                }
            });
        }
    }

    /* JADX INFO: renamed from: h2 */
    public void m213508h2(boolean z) {
        String str = ((y9x) this.viewModel).getAct().f30469e;
        if (TextUtils.equals(str, "p_meet_see,card_button_pull") || TextUtils.equals(str, "p_meet_see,newlike") || TextUtils.equals(str, "p_popup_see,card_button_pull")) {
            m213509i2(z, str);
            return;
        }
        if ("p_message,nomatch_guide".equals(str)) {
            m213509i2(z, str);
            return;
        }
        if (TextUtils.equals(str, w2b0.m201089c("p_navigation,see_module", 1))) {
            m213509i2(z, w2b0.m201089c("p_navigation,see_module", z ? 1 : 2));
        } else {
            m213509i2(z, w2b0.m201089c("p_navigation_see,card_button_pull", z ? 2 : 3));
        }
    }

    /* JADX INFO: renamed from: i2 */
    public final void m213509i2(boolean z, String str) {
        CoreModule.m29935P().m94651a().mo33620wk(CoreModule.f17545c.f19639e0.m169430Pa(this.f126211b));
        if (z || !this.f196894g) {
            this.f196894g = true;
            CoreModule.m29935P().m94651a().showSeeDialog(act(), new d30() { // from class: l.b8x
                @Override // p149l.d30
                public final void call() {
                    this.f74185a.m213498X1();
                }
            }, str);
        }
    }

    /* JADX INFO: renamed from: j2 */
    public void m213510j2(boolean z) {
        if (z || !this.f196894g) {
            this.f196894g = true;
            C8764c.m53382C1(act(), "p_message,locked_match", Privilege.see_who_likes_me, new d30() { // from class: l.f8x
                @Override // p149l.d30
                public final void call() {
                    this.f96431a.m213499Y1();
                }
            });
        }
    }

    @Override // p149l.l5x
    /* JADX INFO: renamed from: q0 */
    public void mo134431q0(String str, int i, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        super.mo134431q0(str, i, arrayList, arrayList2);
        this.f196891d = arrayList;
        this.f196892e = arrayList2;
    }

    /* JADX INFO: renamed from: r1 */
    public int m213511r1() {
        return this.f126210a;
    }

    /* JADX INFO: renamed from: s1 */
    public void m213512s1() {
        act().startActivity(NewMainAct.m39685I5(act(), NavigationIntent.get("cards")));
        act().m66873d2();
    }

    /* JADX INFO: renamed from: t1 */
    public final void m213513t1() {
        duringCreated(CoreModule.f17545c.f19639e0.m169533r7(this.f126211b, "matchPage")).take(1).subscribe(mkd0.m154956H(new e30() { // from class: l.r7x
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f158101a.m213514u1((Envelope) obj);
            }
        }, new e30() { // from class: l.s7x
            @Override // p149l.e30
            public final void call(Object obj) {
                y8x.m213442D0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u1 */
    public final /* synthetic */ void m213514u1(Envelope envelope) {
        if (envelope.meta.code == 200) {
            CoreData coreData = (CoreData) envelope.data.getModuleData(CoreData.class);
            if (!NullChecker.m81303a(coreData) || vwb.m200296J(coreData.iceBreakings)) {
                return;
            }
            ((y9x) this.viewModel).m213666S1(coreData.iceBreakings);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final /* synthetic */ void m213515x1(User user) {
        C8456b.m47638r(act(), user);
        act().m66873d2();
    }

    /* JADX INFO: renamed from: z1 */
    public final /* synthetic */ void m213516z1(UserPrivilege userPrivilege) {
        if (xma.m210043F3() || xma.m210049N3()) {
            if (!this.f196895h) {
                act().m66873d2();
            } else {
                final User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(this.f126211b);
                C8456b.m47644x(act(), userM169430Pa, new d30() { // from class: l.t7x
                    @Override // p149l.d30
                    public final void call() {
                        this.f168789a.m213515x1(userM169430Pa);
                    }
                });
            }
        }
    }

    @Override // p149l.l5x, p149l.q0m
    public void destroy() {
    }
}
