package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.BreakIce;
import com.p051p1.mobile.putong.core.data.ChatHeatActionData;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.IceBreakQuestion;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.data.UserPrivilege;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.oms.OmsDialog;
import com.p051p1.mobile.putong.core.p058ui.match.C8618a;
import com.p051p1.mobile.putong.core.p058ui.match.C8619b;
import com.p051p1.mobile.putong.core.p058ui.match.MatchAct;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.IdBoxed;
import com.p051p1.mobile.putong.data.Link;
import com.p051p1.mobile.putong.data.LinkChannel;
import com.p051p1.mobile.putong.data.LinkIntent;
import com.p051p1.mobile.putong.data.NavigationIntent;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.p070ui.share.ShareHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashSet;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes3.dex */
public class xbx extends k8x<xcx> {

    /* JADX INFO: renamed from: d */
    public ArrayList<String> f193227d;

    /* JADX INFO: renamed from: e */
    public ArrayList<String> f193228e;

    /* JADX INFO: renamed from: f */
    public C22507a<uxj0> f193229f;

    /* JADX INFO: renamed from: g */
    public boolean f193230g;

    /* JADX INFO: renamed from: h */
    public boolean f193231h;

    /* JADX INFO: renamed from: i */
    public IceBreakQuestion f193232i;

    /* JADX INFO: renamed from: j */
    public String f193233j;

    public xbx(ner nerVar) {
        super(nerVar);
        this.f193229f = C22507a.m222759c(uxj0.f181467a);
        this.f193230g = false;
        this.f193231h = true;
        this.f193232i = null;
    }

    /* JADX INFO: renamed from: D0 */
    public static /* synthetic */ void m210008D0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E1 */
    public /* synthetic */ void m210010E1() {
        m210073g2(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H1 */
    public /* synthetic */ void m210014H1() {
        m210072f2(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I1 */
    public /* synthetic */ void m210016I1() {
        m210076j2(true);
    }

    /* JADX INFO: renamed from: L0 */
    public static /* synthetic */ void m210018L0(User user) {
        Conversation conversationQuery = CoreModule.f18272k.f115545m.query(user.f56859id);
        conversationQuery.convType = "default";
        CoreModule.f18264c.f20384f0.m34053mq(conversationQuery);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O1 */
    public /* synthetic */ void m210021O1(uxj0 uxj0Var) {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        User userById = CoreModule.m30930K().getUserById(this.f124421b);
        this.f124422c = userById;
        ((xcx) this.viewModel).m210397U1(userM116600p9, userById, this.f124420a, this.f193228e);
    }

    /* JADX INFO: renamed from: S0 */
    public static /* synthetic */ void m210025S0(Conversation conversation) {
        conversation.read = Boolean.TRUE;
        CoreModule.f18264c.f20384f0.m34053mq(conversation);
    }

    /* JADX INFO: renamed from: U0 */
    public static /* synthetic */ void m210026U0(PurchaseType purchaseType) {
    }

    /* JADX INFO: renamed from: a1 */
    public static /* synthetic */ void m210031a1(Throwable th) {
    }

    /* JADX INFO: renamed from: g1 */
    public static /* synthetic */ void m210037g1(Throwable th) {
    }

    /* JADX INFO: renamed from: o1 */
    public static /* synthetic */ void m210045o1(Throwable th) {
    }

    /* JADX INFO: renamed from: q1 */
    private String m210047q1() {
        if (!(act() instanceof MatchAct)) {
            return "p_intl_instantmatch_no_ultra_view,e_intl_instantmatch_no_ultra_click,click";
        }
        String str = ((MatchAct) act()).f31317e;
        return !TextUtils.isEmpty(str) ? str : "p_intl_instantmatch_no_ultra_view,e_intl_instantmatch_no_ultra_click,click";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v1 */
    public /* synthetic */ void m210048v1() {
        m210074h2(true);
    }

    /* JADX INFO: renamed from: B1 */
    public final /* synthetic */ void m210049B1(User user) {
        C8619b.m48821r(act(), user);
        act().m68056e2();
    }

    /* JADX INFO: renamed from: C1 */
    public final /* synthetic */ void m210050C1(final User user, Integer num) {
        l51.m152919y(new Runnable() { // from class: l.bbx
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.f18264c.f20351U.m128074a(new x20() { // from class: l.obx
                    @Override // p153l.x20
                    public final void call() {
                        xbx.m210018L0(user);
                    }
                });
            }
        });
        f760.INSTANCE.m124356c();
        CoreModule.m30930K().pollConversation();
        l51.m152888H(act(), new Runnable() { // from class: l.cbx
            @Override // java.lang.Runnable
            public final void run() {
                this.f80862a.m210049B1(user);
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: D1 */
    public final /* synthetic */ void m210051D1(Counter counter) {
        if (CoreModule.m30933P().m143405a().mo34492e2()) {
            return;
        }
        final User userById = CoreModule.m30930K().getUserById(this.f124421b);
        yie0.m216087t(act(), userById, new y20() { // from class: l.pax
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f151336a.m210050C1(userById, (Integer) obj);
            }
        });
    }

    /* JADX INFO: renamed from: F1 */
    public final /* synthetic */ void m210052F1(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            V v2 = this.viewModel;
            ((xcx) v2).f193438P0.m123509g(((xcx) v2).getAct());
            ((xcx) this.viewModel).m210411f2();
            ((xcx) this.viewModel).m210416i2();
            return;
        }
        if (c4470c == C4470c.f16268j) {
            ((xcx) this.viewModel).f193438P0.m123509g(null);
        } else if (c4470c == C4470c.f16271m) {
            ((xcx) this.viewModel).f193438P0.m123504b();
        }
    }

    /* JADX INFO: renamed from: J1 */
    public final /* synthetic */ void m210053J1() {
        m210071e2(true);
    }

    /* JADX INFO: renamed from: L1 */
    public final /* synthetic */ void m210054L1(Bundle bundle) {
        act().setSwipeBackEnable(false);
        toh0.m192059s();
        if (this.f124420a == 13 && tx0.m193439o().m193441B()) {
            if (spl0.m187354F()) {
                pk50.m172568j().m172574f().m181664b0(OmsDialog.p_appstore_rating_filter_popup_store.getIdentifier(), 0, true);
            }
            tx0.m193419I(act(), false, 5.0f, "superlike");
        }
        ((xcx) this.viewModel).m210417j1(NullChecker.m82486a(bundle), this.f124420a);
        if (this.f124420a == 40 && yie0.m216071c()) {
            this.f193230g = true;
            l51.m152888H(act(), new Runnable() { // from class: l.tax
                @Override // java.lang.Runnable
                public final void run() {
                    this.f172808a.m210048v1();
                }
            }, 1500L);
            return;
        }
        int i = this.f124420a;
        if (i == 41) {
            this.f193230g = true;
            this.f193231h = act().getIntent().getBooleanExtra("o_diamond_fake_auto_match", true);
            l51.m152888H(act(), new Runnable() { // from class: l.uax
                @Override // java.lang.Runnable
                public final void run() {
                    this.f178244a.m210010E1();
                }
            }, 1500L);
        } else if (i == 50) {
            this.f193230g = true;
            l51.m152888H(act(), new Runnable() { // from class: l.vax
                @Override // java.lang.Runnable
                public final void run() {
                    this.f183176a.m210014H1();
                }
            }, 1500L);
        } else if (i == 43) {
            this.f193230g = true;
            l51.m152888H(act(), new Runnable() { // from class: l.wax
                @Override // java.lang.Runnable
                public final void run() {
                    this.f188172a.m210016I1();
                }
            }, 1500L);
        } else if (i == 49) {
            this.f193230g = true;
            l51.m152888H(act(), new Runnable() { // from class: l.xax
                @Override // java.lang.Runnable
                public final void run() {
                    this.f193091a.m210053J1();
                }
            }, 1500L);
        }
    }

    /* JADX INFO: renamed from: N1 */
    public final /* synthetic */ void m210055N1() {
        ((xcx) this.viewModel).destroy();
    }

    /* JADX INFO: renamed from: P1 */
    public final /* synthetic */ void m210056P1(Counter counter) {
        if (CoreModule.m30933P().m143405a().mo34492e2()) {
            return;
        }
        act().m68056e2();
    }

    /* JADX INFO: renamed from: Q1 */
    public final /* synthetic */ void m210057Q1(boolean z, boolean z2, uxj0 uxj0Var) {
        if (!z) {
            CoreModule.f18264c.f20384f0.f20639S1.m137019l(this.f124422c);
        }
        if (z2) {
            o1j0.m165651y("消息已发送");
        }
        act().m68056e2();
    }

    /* JADX INFO: renamed from: R1 */
    public final /* synthetic */ void m210058R1(Message message, Throwable th) {
        if (rv4.m183256f(th)) {
            rv4.m183255e(act(), th, ChatHeatActionData.ExclusiveAction.CHECK);
        } else if (TantanException.Client.TantanForbidden.isIllegalContent(th)) {
            CoreModule.f18264c.f20384f0.m33753Of(message.f56859id);
            r1j0.m179419f(R$string.f18634L7);
        } else {
            bfx.m104083f(R$string.f18884Th, this.f124422c.m61308fp().profileSmall());
            act().m68056e2();
        }
    }

    /* JADX INFO: renamed from: S1 */
    public final /* synthetic */ void m210059S1(final Conversation conversation, String str, final boolean z) {
        if (NullChecker.m82486a(conversation)) {
            l51.m152919y(new Runnable() { // from class: l.kbx
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f18264c.f20351U.m128074a(new x20() { // from class: l.pbx
                        @Override // p153l.x20
                        public final void call() {
                            xbx.m210025S0(conversation);
                        }
                    });
                }
            });
        }
        final Message message = new Message();
        message.value = str;
        message.messageType = MessageType.get("text");
        final boolean z2 = ((xcx) this.viewModel).f193426J0;
        CoreModule.f18264c.f20384f0.m33652Fn(this.f124421b, message, null, false, false).flatMap(new qcj() { // from class: l.lbx
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreModule.f18264c.f20384f0.m33653Fo();
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.mbx
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f135773a.m210057Q1(z2, z, (uxj0) obj);
            }
        }, new y20() { // from class: l.nbx
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f141275a.m210058R1(message, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T1 */
    public final /* synthetic */ void m210060T1(String str, boolean z) {
        m210068b2(str, z, false);
    }

    /* JADX INFO: renamed from: U1 */
    public final /* synthetic */ void m210061U1(Boolean bool) {
        this.f193230g = false;
    }

    /* JADX INFO: renamed from: V1 */
    public final /* synthetic */ void m210062V1() {
        this.f193230g = false;
    }

    /* JADX INFO: renamed from: W1 */
    public final /* synthetic */ void m210063W1() {
        this.f193230g = false;
    }

    /* JADX INFO: renamed from: X1 */
    public final /* synthetic */ void m210064X1() {
        this.f193230g = false;
    }

    /* JADX INFO: renamed from: Y1 */
    public final /* synthetic */ void m210065Y1() {
        this.f193230g = false;
    }

    /* JADX INFO: renamed from: Z1 */
    public void m210066Z1() {
        if (this.f193227d.size() <= 1) {
            ((xcx) this.viewModel).m210390Q1();
            act().m68056e2();
        } else {
            this.f124421b = this.f193227d.get(1);
            this.f193227d.remove(0);
            this.f193228e.remove(0);
            this.f193229f.m137019l(uxj0.f181467a);
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        int i;
        if (d79.m114685j0() && (i = this.f124420a) != 40 && i != 41) {
            CoreModule.f18264c.f20384f0.m33653Fo();
        }
        creates(new y20() { // from class: l.nax
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f141056a.m210054L1((Bundle) obj);
            }
        }, new x20() { // from class: l.jbx
            @Override // p153l.x20
            public final void call() {
                this.f119999a.m210055N1();
            }
        });
        duringCreated(this.f193229f).subscribe(psd0.m173596G(new y20() { // from class: l.qbx
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f156515a.m210021O1((uxj0) obj);
            }
        }));
        int i2 = this.f124420a;
        if (i2 == 40) {
            duringCreated(CoreModule.f18264c.m32486n3().distinctUntilChanged()).subscribe(psd0.m173597H(new y20() { // from class: l.rbx
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f162044a.m210056P1((Counter) obj);
                }
            }, new y20() { // from class: l.sbx
                @Override // p153l.y20
                public final void call(Object obj) {
                    xbx.m210037g1((Throwable) obj);
                }
            }));
            return;
        }
        if (i2 == 41) {
            duringCreated(CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("oDiamond"))).distinctUntilChanged().subscribe(psd0.m173597H(new y20() { // from class: l.tbx
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f173001a.m210082z1((UserPrivilege) obj);
                }
            }, new y20() { // from class: l.ubx
                @Override // p153l.y20
                public final void call(Object obj) {
                    xbx.m210031a1((Throwable) obj);
                }
            }));
            return;
        }
        if (i2 == 43) {
            duringCreated(CoreModule.f18264c.m32486n3().distinctUntilChanged()).filter(new qcj() { // from class: l.vbx
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(!CoreModule.m30933P().m143405a().mo34492e2());
                }
            }).take(1).subscribe(psd0.m173597H(new y20() { // from class: l.wbx
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f188294a.m210051D1((Counter) obj);
                }
            }, new y20() { // from class: l.oax
                @Override // p153l.y20
                public final void call(Object obj) {
                    xbx.m210045o1((Throwable) obj);
                }
            }));
            return;
        }
        if (i2 == 49) {
            m148777r0();
            return;
        }
        if (i2 == 50) {
            m148778s0();
            return;
        }
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.yax
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f198263a.m210052F1((C4470c) obj);
            }
        }));
        if (gra.m131681f2()) {
            m210079t1();
        }
    }

    /* JADX INFO: renamed from: a2 */
    public void m210067a2(BreakIce breakIce, String str) {
        if (TextUtils.equals(str, this.f193233j)) {
            return;
        }
        this.f193233j = str;
        m210068b2(breakIce.content, false, true);
    }

    /* JADX INFO: renamed from: b2 */
    public final void m210068b2(final String str, boolean z, final boolean z2) {
        final Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(this.f124421b);
        act().postDelayed(new Runnable() { // from class: l.fbx
            @Override // java.lang.Runnable
            public final void run() {
                this.f98165a.m210059S1(conversationM33859Xe, str, z2);
            }
        }, z ? 500L : 1L);
        if (z) {
            act().hideInput();
        }
    }

    /* JADX INFO: renamed from: c2 */
    public void m210069c2(final String str, final boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!uqb0.f180394Z.m95954K(str)) {
            m210068b2(str, z, false);
            return;
        }
        act().dialog().m21502E0(R$string.f18945Vi).m21499D(R$string.f18885Ti).m21540k0(R$string.f18855Si).m21555t0(R$string.f18915Ui, new Runnable() { // from class: l.zax
            @Override // java.lang.Runnable
            public final void run() {
                this.f203601a.m210060T1(str, z);
            }
        }).m21567z0();
        HashSet hashSet = new HashSet(MessagesAct.f32483r.get());
        hashSet.add(CoreModule.f18264c.f20381e0.m116503Pa(this.f124421b).f56859id);
        MessagesAct.f32483r.put(hashSet);
    }

    /* JADX INFO: renamed from: d2 */
    public void m210070d2() {
        Link link = new Link();
        link.intent = LinkIntent.get("matched");
        link.channel = LinkChannel.get("unknown");
        i4g0.m138523u("e_match_share_button", "p_successful_match_view", jyb.m147494Y("share_to", "system"));
        link.resources = jyb.m147507f0(new IdBoxed(this.f124421b, "relationship"));
        new ShareHelper(link).m81202w0(act(), act().string(R$string.f18861So), act().string(R$string.f18891To), jyb.m147507f0(LinkChannel.get("unknown")), true);
    }

    /* JADX INFO: renamed from: e2 */
    public void m210071e2(boolean z) {
        if (z || !this.f193230g) {
            this.f193230g = true;
            CoreModule.m30933P().m143405a().mo34365Lf(act(), "p_intl_premium_match,e_intl_match_sayhi,click", Privilege.see_who_likes_me, new y20() { // from class: l.hbx
                @Override // p153l.y20
                public final void call(Object obj) {
                    xbx.m210026U0((PurchaseType) obj);
                }
            }, new y20() { // from class: l.ibx
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f114259a.m210061U1((Boolean) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: f2 */
    public void m210072f2(boolean z) {
        if (z || !this.f193230g) {
            C8618a.m48771w().m48792o(act(), m210047q1(), new x20() { // from class: l.gbx
                @Override // p153l.x20
                public final void call() {
                    this.f103502a.m210062V1();
                }
            });
        }
    }

    /* JADX INFO: renamed from: g2 */
    public void m210073g2(boolean z) {
        if (z || !this.f193230g) {
            C8619b.m48816l(act(), (TextUtils.equals(((xcx) this.viewModel).getAct().f31317e, "p_chat_greet,odiamond_sayhi") || TextUtils.equals(((xcx) this.viewModel).getAct().f31317e, "p_user_live_room,e_odiamond_sayhi,click") || TextUtils.equals(((xcx) this.viewModel).getAct().f31317e, "p_home,odiamond_sayhi") || TextUtils.equals(((xcx) this.viewModel).getAct().f31317e, "p_album,e_odiamond_sayhi,click") || TextUtils.equals(((xcx) this.viewModel).getAct().f31317e, "p_home_nearby,odiamond_sayhi") || TextUtils.equals(((xcx) this.viewModel).getAct().f31317e, "p_meet,e_odiamond_sayhi,click") || TextUtils.equals(((xcx) this.viewModel).getAct().f31317e, "p_navigation_nearby,odiamond_sayhi") || TextUtils.equals(((xcx) this.viewModel).getAct().f31317e, "p_personalized,odiamond_sayhi") || TextUtils.equals(((xcx) this.viewModel).getAct().f31317e, "p_profile,odiamond_sayhi") || TextUtils.equals(((xcx) this.viewModel).getAct().f31317e, "p_meet_nearby,odiamond_sayhi")) ? ((xcx) this.viewModel).getAct().f31317e : "p_suggest_user_profile_info_view,e_odiamond_sayhi,click", new x20() { // from class: l.dbx
                @Override // p153l.x20
                public final void call() {
                    this.f87716a.m210063W1();
                }
            });
        }
    }

    /* JADX INFO: renamed from: h2 */
    public void m210074h2(boolean z) {
        String str = ((xcx) this.viewModel).getAct().f31317e;
        if (TextUtils.equals(str, "p_meet_see,card_button_pull") || TextUtils.equals(str, "p_meet_see,newlike") || TextUtils.equals(str, "p_popup_see,card_button_pull")) {
            m210075i2(z, str);
            return;
        }
        if ("p_message,nomatch_guide".equals(str)) {
            m210075i2(z, str);
            return;
        }
        if (TextUtils.equals(str, abb0.m96736c("p_navigation,see_module", 1))) {
            m210075i2(z, abb0.m96736c("p_navigation,see_module", z ? 1 : 2));
        } else {
            m210075i2(z, abb0.m96736c("p_navigation_see,card_button_pull", z ? 2 : 3));
        }
    }

    /* JADX INFO: renamed from: i2 */
    public final void m210075i2(boolean z, String str) {
        CoreModule.m30933P().m143405a().mo34623wk(CoreModule.f18264c.f20381e0.m116503Pa(this.f124421b));
        if (z || !this.f193230g) {
            this.f193230g = true;
            CoreModule.m30933P().m143405a().showSeeDialog(act(), new x20() { // from class: l.abx
                @Override // p153l.x20
                public final void call() {
                    this.f69664a.m210064X1();
                }
            }, str);
        }
    }

    /* JADX INFO: renamed from: j2 */
    public void m210076j2(boolean z) {
        if (z || !this.f193230g) {
            this.f193230g = true;
            C8927c.m54565C1(act(), "p_message,locked_match", Privilege.see_who_likes_me, new x20() { // from class: l.ebx
                @Override // p153l.x20
                public final void call() {
                    this.f92993a.m210065Y1();
                }
            });
        }
    }

    @Override // p153l.k8x
    /* JADX INFO: renamed from: q0 */
    public void mo96040q0(String str, int i, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        super.mo96040q0(str, i, arrayList, arrayList2);
        this.f193227d = arrayList;
        this.f193228e = arrayList2;
    }

    /* JADX INFO: renamed from: r1 */
    public int m210077r1() {
        return this.f124420a;
    }

    /* JADX INFO: renamed from: s1 */
    public void m210078s1() {
        act().startActivity(NewMainAct.m40697M5(act(), NavigationIntent.get("cards")));
        act().m68056e2();
    }

    /* JADX INFO: renamed from: t1 */
    public final void m210079t1() {
        duringCreated(CoreModule.f18264c.f20381e0.m116606r7(this.f124421b, "matchPage")).take(1).subscribe(psd0.m173597H(new y20() { // from class: l.qax
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f156435a.m210080u1((Envelope) obj);
            }
        }, new y20() { // from class: l.rax
            @Override // p153l.y20
            public final void call(Object obj) {
                xbx.m210008D0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u1 */
    public final /* synthetic */ void m210080u1(Envelope envelope) {
        if (envelope.meta.code == 200) {
            CoreData coreData = (CoreData) envelope.data.getModuleData(CoreData.class);
            if (!NullChecker.m82486a(coreData) || jyb.m147479J(coreData.iceBreakings)) {
                return;
            }
            ((xcx) this.viewModel).m210393S1(coreData.iceBreakings);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final /* synthetic */ void m210081x1(User user) {
        C8619b.m48821r(act(), user);
        act().m68056e2();
    }

    /* JADX INFO: renamed from: z1 */
    public final /* synthetic */ void m210082z1(UserPrivilege userPrivilege) {
        if (joa.m146357G3() || joa.m146363O3()) {
            if (!this.f193231h) {
                act().m68056e2();
            } else {
                final User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(this.f124421b);
                C8619b.m48827x(act(), userM116503Pa, new x20() { // from class: l.sax
                    @Override // p153l.x20
                    public final void call() {
                        this.f167081a.m210081x1(userM116503Pa);
                    }
                });
            }
        }
    }

    @Override // p153l.k8x, p153l.k3m
    public void destroy() {
    }
}
