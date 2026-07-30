package p003l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.p001ui.match.C0038a;
import com.p000p1.mobile.putong.core.p001ui.match.C0039b;
import com.p000p1.mobile.putong.core.p001ui.match.MatchAct;
import com.p000p1.mobile.putong.core.p001ui.messages.MessagesAct;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.BreakIce;
import com.p1.mobile.putong.core.data.ChatHeatActionData;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.IceBreakQuestion;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageType;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.Sticker;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.data.UserPrivilege;
import com.p1.mobile.putong.core.newui.main.NewMainAct;
import com.p1.mobile.putong.core.oms.OmsDialog;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.IdBoxed;
import com.p1.mobile.putong.data.Link;
import com.p1.mobile.putong.data.LinkChannel;
import com.p1.mobile.putong.data.LinkIntent;
import com.p1.mobile.putong.data.NavigationIntent;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.ui.share.ShareHelper;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import l.az50;
import l.dyq;
import l.e51;
import l.ic50;
import l.j760;
import l.jq2;
import l.lsi0;
import l.mcr;
import l.mgh0;
import l.mkd0;
import l.mx0;
import l.ogl0;
import l.osi0;
import l.qib0;
import l.roj0;
import l.s7m;
import l.tae0;
import l.u59;
import l.upa;
import l.vwb;
import l.w2b0;
import l.xma;
import l.zvf0;
import org.eclipse.jetty.servlet.ServletHandler;
import org.spongycastle.i18n.TextBundle;
import p014rx.subjects.C1185a;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class y8x extends l5x<y9x> {

    /* JADX INFO: renamed from: d */
    public ArrayList<String> f8939d;

    /* JADX INFO: renamed from: e */
    public ArrayList<String> f8940e;

    /* JADX INFO: renamed from: f */
    public C1185a<roj0> f8941f;

    /* JADX INFO: renamed from: g */
    public boolean f8942g;

    /* JADX INFO: renamed from: h */
    public boolean f8943h;

    /* JADX INFO: renamed from: i */
    public IceBreakQuestion f8944i;

    /* JADX INFO: renamed from: j */
    public String f8945j;

    public y8x(mcr mcrVar) {
        super(mcrVar);
        this.f8941f = C1185a.m9970c(roj0.a);
        this.f8942g = false;
        this.f8943h = true;
        this.f8944i = null;
    }

    /* JADX INFO: renamed from: D0 */
    public static /* synthetic */ void m8935D0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E1 */
    public /* synthetic */ void m8937E1() {
        m9001g2(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H1 */
    public /* synthetic */ void m8941H1() {
        m9000f2(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I1 */
    public /* synthetic */ void m8943I1() {
        m9004j2(true);
    }

    /* JADX INFO: renamed from: L0 */
    public static /* synthetic */ void m8945L0(User user) {
        Conversation conversationQuery = CoreModule.k.m.query(((DbObject) user).id);
        conversationQuery.convType = ServletHandler.__DEFAULT_SERVLET;
        CoreModule.c.f0.mq(conversationQuery);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O1 */
    public /* synthetic */ void m8948O1(roj0 roj0Var) {
        User userP9 = CoreModule.c.e0.p9();
        User userById = CoreModule.K().getUserById(this.f5220b);
        this.f5221c = userById;
        ((y9x) ((jq2) this).viewModel).m9130U1(userP9, userById, this.f5219a, this.f8940e);
    }

    /* JADX INFO: renamed from: S0 */
    public static /* synthetic */ void m8952S0(Conversation conversation) {
        conversation.read = Boolean.TRUE;
        CoreModule.c.f0.mq(conversation);
    }

    /* JADX INFO: renamed from: U0 */
    public static /* synthetic */ void m8953U0(PurchaseType purchaseType) {
    }

    /* JADX INFO: renamed from: a1 */
    public static /* synthetic */ void m8958a1(Throwable th) {
    }

    /* JADX INFO: renamed from: g1 */
    public static /* synthetic */ void m8964g1(Throwable th) {
    }

    /* JADX INFO: renamed from: o1 */
    public static /* synthetic */ void m8972o1(Throwable th) {
    }

    /* JADX INFO: renamed from: q1 */
    private String m8974q1() {
        if (!(act() instanceof MatchAct)) {
            return "p_intl_instantmatch_no_ultra_view,e_intl_instantmatch_no_ultra_click,click";
        }
        String str = act().f360e;
        return !TextUtils.isEmpty(str) ? str : "p_intl_instantmatch_no_ultra_view,e_intl_instantmatch_no_ultra_click,click";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v1 */
    public /* synthetic */ void m8975v1() {
        m9002h2(true);
    }

    /* JADX INFO: renamed from: B1 */
    public final /* synthetic */ void m8976B1(User user) {
        C0039b.m702r(act(), user);
        act().finish();
    }

    /* JADX INFO: renamed from: C1 */
    public final /* synthetic */ void m8977C1(final User user, Integer num) {
        e51.y(new Runnable() { // from class: l.c8x
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.c.U.a(new d30() { // from class: l.p8x
                    @Override // p003l.d30
                    public final void call() {
                        y8x.m8945L0(user);
                    }
                });
            }
        });
        az50.Companion.c();
        CoreModule.K().pollConversation();
        e51.H(act(), new Runnable() { // from class: l.d8x
            @Override // java.lang.Runnable
            public final void run() {
                this.f2912a.m8976B1(user);
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: D1 */
    public final /* synthetic */ void m8978D1(Counter counter) {
        if (CoreModule.P().a().e2()) {
            return;
        }
        final User userById = CoreModule.K().getUserById(this.f5220b);
        tae0.t(act(), userById, new e30() { // from class: l.q7x
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f6601a.m8977C1(userById, (Integer) obj);
            }
        });
    }

    /* JADX INFO: renamed from: F1 */
    public final /* synthetic */ void m8979F1(c cVar) {
        if (cVar == c.i) {
            s7m s7mVar = ((jq2) this).viewModel;
            ((y9x) s7mVar).f8976P0.g(((y9x) s7mVar).act());
            ((y9x) ((jq2) this).viewModel).m9144f2();
            ((y9x) ((jq2) this).viewModel).m9150i2();
            return;
        }
        if (cVar == c.j) {
            ((y9x) ((jq2) this).viewModel).f8976P0.g((dyq) null);
        } else if (cVar == c.m) {
            ((y9x) ((jq2) this).viewModel).f8976P0.b();
        }
    }

    /* JADX INFO: renamed from: J1 */
    public final /* synthetic */ void m8980J1() {
        m8999e2(true);
    }

    /* JADX INFO: renamed from: L1 */
    public final /* synthetic */ void m8981L1(Bundle bundle) {
        act().setSwipeBackEnable(false);
        mgh0.s();
        if (this.f5219a == 13 && mx0.o().B()) {
            if (ogl0.F()) {
                ic50.j().f().b0(OmsDialog.p_appstore_rating_filter_popup_store.getIdentifier(), 0, true);
            }
            mx0.I(act(), false, 5.0f, "superlike");
        }
        ((y9x) ((jq2) this).viewModel).m9151j1(NullChecker.a(bundle), this.f5219a);
        if (this.f5219a == 40 && tae0.c()) {
            this.f8942g = true;
            e51.H(act(), new Runnable() { // from class: l.u7x
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7933a.m8975v1();
                }
            }, 1500L);
            return;
        }
        int i = this.f5219a;
        if (i == 41) {
            this.f8942g = true;
            this.f8943h = act().getIntent().getBooleanExtra("o_diamond_fake_auto_match", true);
            e51.H(act(), new Runnable() { // from class: l.v7x
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8233a.m8937E1();
                }
            }, 1500L);
        } else if (i == 50) {
            this.f8942g = true;
            e51.H(act(), new Runnable() { // from class: l.w7x
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8513a.m8941H1();
                }
            }, 1500L);
        } else if (i == 43) {
            this.f8942g = true;
            e51.H(act(), new Runnable() { // from class: l.x7x
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8741a.m8943I1();
                }
            }, 1500L);
        } else if (i == 49) {
            this.f8942g = true;
            e51.H(act(), new Runnable() { // from class: l.y7x
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8929a.m8980J1();
                }
            }, 1500L);
        }
    }

    /* JADX INFO: renamed from: N1 */
    public final /* synthetic */ void m8982N1() {
        ((y9x) ((jq2) this).viewModel).destroy();
    }

    /* JADX INFO: renamed from: P1 */
    public final /* synthetic */ void m8983P1(Counter counter) {
        if (CoreModule.P().a().e2()) {
            return;
        }
        act().finish();
    }

    /* JADX INFO: renamed from: Q1 */
    public final /* synthetic */ void m8984Q1(boolean z, boolean z2, roj0 roj0Var) {
        if (!z) {
            CoreModule.c.f0.S1.onNext(this.f5221c);
        }
        if (z2) {
            lsi0.y("消息已发送");
        }
        act().finish();
    }

    /* JADX INFO: renamed from: R1 */
    public final /* synthetic */ void m8985R1(Message message, Throwable th) {
        if (su4.m7637f(th)) {
            su4.m7636e(act(), th, ChatHeatActionData.ExclusiveAction.CHECK);
        } else if (TantanException.Client.TantanForbidden.isIllegalContent(th)) {
            CoreModule.c.f0.Of(((DbObject) message).id);
            osi0.f(R.string.J7);
        } else {
            ccx.m3248f(R.string.yh, this.f5221c.fp().profileSmall());
            act().finish();
        }
    }

    /* JADX INFO: renamed from: S1 */
    public final /* synthetic */ void m8986S1(final Conversation conversation, String str, final boolean z) {
        if (NullChecker.a(conversation)) {
            e51.y(new Runnable() { // from class: l.l8x
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.c.U.a(new d30() { // from class: l.q8x
                        @Override // p003l.d30
                        public final void call() {
                            y8x.m8952S0(conversation);
                        }
                    });
                }
            });
        }
        final Message message = new Message();
        message.value = str;
        message.messageType = MessageType.get(TextBundle.TEXT_ENTRY);
        final boolean z2 = ((y9x) ((jq2) this).viewModel).f8964J0;
        CoreModule.c.f0.Fn(this.f5220b, message, (Sticker) null, false, false).flatMap(new w9j() { // from class: l.m8x
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return CoreModule.c.f0.Fo();
            }
        }).subscribe((m250) mkd0.H(new e30() { // from class: l.n8x
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f5846a.m8984Q1(z2, z, (roj0) obj);
            }
        }, new e30() { // from class: l.o8x
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f6062a.m8985R1(message, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T1 */
    public final /* synthetic */ void m8987T1(String str, boolean z) {
        m8996b2(str, z, false);
    }

    /* JADX INFO: renamed from: U1 */
    public final /* synthetic */ void m8988U1(Boolean bool) {
        this.f8942g = false;
    }

    /* JADX INFO: renamed from: V1 */
    public final /* synthetic */ void m8989V1() {
        this.f8942g = false;
    }

    /* JADX INFO: renamed from: W1 */
    public final /* synthetic */ void m8990W1() {
        this.f8942g = false;
    }

    /* JADX INFO: renamed from: X1 */
    public final /* synthetic */ void m8991X1() {
        this.f8942g = false;
    }

    /* JADX INFO: renamed from: Y1 */
    public final /* synthetic */ void m8992Y1() {
        this.f8942g = false;
    }

    /* JADX INFO: renamed from: Z1 */
    public void m8993Z1() {
        if (this.f8939d.size() <= 1) {
            ((y9x) ((jq2) this).viewModel).m9123Q1();
            act().finish();
        } else {
            this.f5220b = this.f8939d.get(1);
            this.f8939d.remove(0);
            this.f8940e.remove(0);
            this.f8941f.onNext(roj0.a);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m8994a0() {
        int i;
        if (u59.f0() && (i = this.f5219a) != 40 && i != 41) {
            CoreModule.c.f0.Fo();
        }
        creates(new e30() { // from class: l.o7x
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f6053a.m8981L1((Bundle) obj);
            }
        }, new d30() { // from class: l.k8x
            @Override // p003l.d30
            public final void call() {
                this.f4865a.m8982N1();
            }
        });
        duringCreated(this.f8941f).subscribe((m250) mkd0.G(new e30() { // from class: l.r8x
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f6804a.m8948O1((roj0) obj);
            }
        }));
        int i2 = this.f5219a;
        if (i2 == 40) {
            duringCreated(CoreModule.c.n3().distinctUntilChanged()).subscribe((m250) mkd0.H(new e30() { // from class: l.s8x
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f7154a.m8983P1((Counter) obj);
                }
            }, new e30() { // from class: l.t8x
                @Override // p003l.e30
                public final void call(Object obj) {
                    y8x.m8964g1((Throwable) obj);
                }
            }));
            return;
        }
        if (i2 == 41) {
            duringCreated(CoreModule.c.C0.u3(SummarizedPrivilegesId.get("oDiamond"))).distinctUntilChanged().subscribe((m250) mkd0.H(new e30() { // from class: l.u8x
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f7938a.m9010z1((UserPrivilege) obj);
                }
            }, new e30() { // from class: l.v8x
                @Override // p003l.e30
                public final void call(Object obj) {
                    y8x.m8958a1((Throwable) obj);
                }
            }));
            return;
        }
        if (i2 == 43) {
            duringCreated(CoreModule.c.n3().distinctUntilChanged()).filter(new w9j() { // from class: l.w8x
                @Override // p003l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(!CoreModule.P().a().e2());
                }
            }).take(1).subscribe((m250) mkd0.H(new e30() { // from class: l.x8x
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f8745a.m8978D1((Counter) obj);
                }
            }, new e30() { // from class: l.p7x
                @Override // p003l.e30
                public final void call(Object obj) {
                    y8x.m8972o1((Throwable) obj);
                }
            }));
            return;
        }
        if (i2 == 49) {
            m5987r0();
            return;
        }
        if (i2 == 50) {
            m5988s0();
            return;
        }
        lifecycle().subscribe((m250) mkd0.G(new e30() { // from class: l.z7x
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f9268a.m8979F1((c) obj);
            }
        }));
        if (upa.f2()) {
            m9007t1();
        }
    }

    /* JADX INFO: renamed from: a2 */
    public void m8995a2(BreakIce breakIce, String str) {
        if (TextUtils.equals(str, this.f8945j)) {
            return;
        }
        this.f8945j = str;
        m8996b2(breakIce.content, false, true);
    }

    /* JADX INFO: renamed from: b2 */
    public final void m8996b2(final String str, boolean z, final boolean z2) {
        final Conversation conversationXe = CoreModule.c.f0.Xe(this.f5220b);
        act().postDelayed(new Runnable() { // from class: l.g8x
            @Override // java.lang.Runnable
            public final void run() {
                this.f3815a.m8986S1(conversationXe, str, z2);
            }
        }, z ? 500L : 1L);
        if (z) {
            act().hideInput();
        }
    }

    /* JADX INFO: renamed from: c2 */
    public void m8997c2(final String str, final boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!qib0.Z.K(str)) {
            m8996b2(str, z, false);
            return;
        }
        act().dialog().E0(R.string.zi).D(R.string.xi).k0(R.string.wi).t0(R.string.yi, new Runnable() { // from class: l.a8x
            @Override // java.lang.Runnable
            public final void run() {
                this.f2090a.m8987T1(str, z);
            }
        }).z0();
        HashSet hashSet = new HashSet((Collection) MessagesAct.f1526r.get());
        hashSet.add(((DbObject) CoreModule.c.e0.Pa(this.f5220b)).id);
        MessagesAct.f1526r.put(hashSet);
    }

    /* JADX INFO: renamed from: d2 */
    public void m8998d2() {
        Link link = new Link();
        link.intent = LinkIntent.get("matched");
        link.channel = LinkChannel.get(IjkMediaMeta.IJKM_VAL_TYPE__UNKNOWN);
        zvf0.u("e_match_share_button", "p_successful_match_view", new j760[]{vwb.Y("share_to", "system")});
        link.resources = vwb.f0(new IdBoxed[]{new IdBoxed(this.f5220b, "relationship")});
        new ShareHelper(link).w0(act(), act().string(R.string.wo), act().string(R.string.xo), vwb.f0(new LinkChannel[]{LinkChannel.get(IjkMediaMeta.IJKM_VAL_TYPE__UNKNOWN)}), true);
    }

    /* JADX INFO: renamed from: e2 */
    public void m8999e2(boolean z) {
        if (z || !this.f8942g) {
            this.f8942g = true;
            CoreModule.P().a().Lf(act(), "p_intl_premium_match,e_intl_match_sayhi,click", Privilege.see_who_likes_me, new e30() { // from class: l.i8x
                @Override // p003l.e30
                public final void call(Object obj) {
                    y8x.m8953U0((PurchaseType) obj);
                }
            }, new e30() { // from class: l.j8x
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f4588a.m8988U1((Boolean) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: f2 */
    public void m9000f2(boolean z) {
        if (z || !this.f8942g) {
            C0038a.m652w().m673o(act(), m8974q1(), new d30() { // from class: l.h8x
                @Override // p003l.d30
                public final void call() {
                    this.f4155a.m8989V1();
                }
            });
        }
    }

    /* JADX INFO: renamed from: g2 */
    public void m9001g2(boolean z) {
        if (z || !this.f8942g) {
            C0039b.m697l(act(), (TextUtils.equals(((y9x) ((jq2) this).viewModel).act().f360e, "p_chat_greet,odiamond_sayhi") || TextUtils.equals(((y9x) ((jq2) this).viewModel).act().f360e, "p_user_live_room,e_odiamond_sayhi,click") || TextUtils.equals(((y9x) ((jq2) this).viewModel).act().f360e, "p_home,odiamond_sayhi") || TextUtils.equals(((y9x) ((jq2) this).viewModel).act().f360e, "p_album,e_odiamond_sayhi,click") || TextUtils.equals(((y9x) ((jq2) this).viewModel).act().f360e, "p_home_nearby,odiamond_sayhi") || TextUtils.equals(((y9x) ((jq2) this).viewModel).act().f360e, "p_meet,e_odiamond_sayhi,click") || TextUtils.equals(((y9x) ((jq2) this).viewModel).act().f360e, "p_navigation_nearby,odiamond_sayhi") || TextUtils.equals(((y9x) ((jq2) this).viewModel).act().f360e, "p_personalized,odiamond_sayhi") || TextUtils.equals(((y9x) ((jq2) this).viewModel).act().f360e, "p_profile,odiamond_sayhi") || TextUtils.equals(((y9x) ((jq2) this).viewModel).act().f360e, "p_meet_nearby,odiamond_sayhi")) ? ((y9x) ((jq2) this).viewModel).act().f360e : "p_suggest_user_profile_info_view,e_odiamond_sayhi,click", new d30() { // from class: l.e8x
                @Override // p003l.d30
                public final void call() {
                    this.f3225a.m8990W1();
                }
            });
        }
    }

    /* JADX INFO: renamed from: h2 */
    public void m9002h2(boolean z) {
        String str = ((y9x) ((jq2) this).viewModel).act().f360e;
        if (TextUtils.equals(str, "p_meet_see,card_button_pull") || TextUtils.equals(str, "p_meet_see,newlike") || TextUtils.equals(str, "p_popup_see,card_button_pull")) {
            m9003i2(z, str);
            return;
        }
        if ("p_message,nomatch_guide".equals(str)) {
            m9003i2(z, str);
            return;
        }
        if (TextUtils.equals(str, w2b0.c("p_navigation,see_module", 1))) {
            m9003i2(z, w2b0.c("p_navigation,see_module", z ? 1 : 2));
        } else {
            m9003i2(z, w2b0.c("p_navigation_see,card_button_pull", z ? 2 : 3));
        }
    }

    /* JADX INFO: renamed from: i2 */
    public final void m9003i2(boolean z, String str) {
        CoreModule.P().a().wk(CoreModule.c.e0.Pa(this.f5220b));
        if (z || !this.f8942g) {
            this.f8942g = true;
            CoreModule.P().a().showSeeDialog(act(), new d30() { // from class: l.b8x
                @Override // p003l.d30
                public final void call() {
                    this.f2354a.m8991X1();
                }
            }, str);
        }
    }

    /* JADX INFO: renamed from: j2 */
    public void m9004j2(boolean z) {
        if (z || !this.f8942g) {
            this.f8942g = true;
            com.p1.mobile.putong.core.ui.purchase.c.C1(act(), "p_message,locked_match", Privilege.see_who_likes_me, new d30() { // from class: l.f8x
                @Override // p003l.d30
                public final void call() {
                    this.f3466a.m8992Y1();
                }
            });
        }
    }

    @Override // p003l.l5x
    /* JADX INFO: renamed from: q0 */
    public void mo5067q0(String str, int i, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        super.mo5067q0(str, i, arrayList, arrayList2);
        this.f8939d = arrayList;
        this.f8940e = arrayList2;
    }

    /* JADX INFO: renamed from: r1 */
    public int m9005r1() {
        return this.f5219a;
    }

    /* JADX INFO: renamed from: s1 */
    public void m9006s1() {
        act().startActivity(NewMainAct.I5(act(), NavigationIntent.get("cards")));
        act().finish();
    }

    /* JADX INFO: renamed from: t1 */
    public final void m9007t1() {
        duringCreated(CoreModule.c.e0.r7(this.f5220b, "matchPage")).take(1).subscribe((m250) mkd0.H(new e30() { // from class: l.r7x
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f6801a.m9008u1((Envelope) obj);
            }
        }, new e30() { // from class: l.s7x
            @Override // p003l.e30
            public final void call(Object obj) {
                y8x.m8935D0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u1 */
    public final /* synthetic */ void m9008u1(Envelope envelope) {
        if (envelope.meta.code == 200) {
            CoreData moduleData = envelope.data.getModuleData(CoreData.class);
            if (!NullChecker.a(moduleData) || vwb.J(moduleData.iceBreakings)) {
                return;
            }
            ((y9x) ((jq2) this).viewModel).m9126S1(moduleData.iceBreakings);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final /* synthetic */ void m9009x1(User user) {
        C0039b.m702r(act(), user);
        act().finish();
    }

    /* JADX INFO: renamed from: z1 */
    public final /* synthetic */ void m9010z1(UserPrivilege userPrivilege) {
        if (xma.F3() || xma.N3()) {
            if (!this.f8943h) {
                act().finish();
            } else {
                final User userPa = CoreModule.c.e0.Pa(this.f5220b);
                C0039b.m708x(act(), userPa, new d30() { // from class: l.t7x
                    @Override // p003l.d30
                    public final void call() {
                        this.f7416a.m9009x1(userPa);
                    }
                });
            }
        }
    }

    @Override // p003l.l5x
    public void destroy() {
    }
}
