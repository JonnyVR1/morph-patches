package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.ChatHeatActionData;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.data.UserPrivilege;
import com.p046p1.mobile.putong.core.p053ui.match.C8456b;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashSet;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes3.dex */
public class zax extends l5x<sbx> {

    /* JADX INFO: renamed from: d */
    public ArrayList<String> f202406d;

    /* JADX INFO: renamed from: e */
    public ArrayList<String> f202407e;

    /* JADX INFO: renamed from: f */
    public boolean f202408f;

    /* JADX INFO: renamed from: g */
    public C22392a<roj0> f202409g;

    public zax(mcr mcrVar) {
        super(mcrVar);
        this.f202408f = false;
        this.f202409g = C22392a.m221513c(roj0.f160388a);
    }

    /* JADX INFO: renamed from: H0 */
    public static /* synthetic */ void m217763H0(Conversation conversation) {
        conversation.read = Boolean.TRUE;
        CoreModule.f17545c.f19642f0.m33050mq(conversation);
    }

    /* JADX INFO: renamed from: J0 */
    public static /* synthetic */ void m217765J0(User user) {
        Conversation conversationQuery = CoreModule.f17553k.f91950m.query(user.f56011id);
        conversationQuery.convType = "default";
        CoreModule.f17545c.f19642f0.m33050mq(conversationQuery);
    }

    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ void m217769P0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e1 */
    public /* synthetic */ void m217781e1() {
        m217799v1(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f1 */
    public /* synthetic */ void m217782f1(Bundle bundle) {
        act().setSwipeBackEnable(false);
        mgh0.m154563s();
        ((sbx) this.viewModel).m183354s0(NullChecker.m81303a(bundle), this.f126210a);
        if (this.f126210a == 43) {
            this.f202408f = true;
            e51.m114743H(act(), new Runnable() { // from class: l.dax
                @Override // java.lang.Runnable
                public final void run() {
                    this.f85273a.m217781e1();
                }
            }, 1500L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g1 */
    public /* synthetic */ void m217783g1(UserPrivilege userPrivilege) {
        CoreModule.m29932K().pollConversation();
        act().m66873d2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h1 */
    public /* synthetic */ void m217784h1(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            V v2 = this.viewModel;
            ((sbx) v2).f163650L.m123794g(((sbx) v2).getAct());
        } else if (c4319c == C4319c.f15549j) {
            ((sbx) this.viewModel).f163650L.m123794g(null);
        } else if (c4319c == C4319c.f15552m) {
            ((sbx) this.viewModel).f163650L.m123789b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i1 */
    public /* synthetic */ void m217785i1() {
        ((sbx) this.viewModel).destroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j1 */
    public /* synthetic */ void m217786j1(roj0 roj0Var) {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        User userById = CoreModule.m29932K().getUserById(this.f126211b);
        this.f126212c = userById;
        ((sbx) this.viewModel).m183340Q0(userM169527p9, userById, this.f126210a, this.f202407e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m1 */
    public /* synthetic */ void m217787m1(Counter counter) {
        if (CoreModule.m29935P().m94651a().mo33489e2()) {
            return;
        }
        final User userById = CoreModule.m29932K().getUserById(this.f126211b);
        tae0.m187716t(act(), userById, new e30() { // from class: l.yax
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f197265a.m217791l1(userById, (Integer) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t1 */
    private void m217788t1(final String str, boolean z, final boolean z2) {
        final Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(this.f126211b);
        act().postDelayed(new Runnable() { // from class: l.jax
            @Override // java.lang.Runnable
            public final void run() {
                this.f117135a.m217794p1(conversationM32856Xe, str, z2);
            }
        }, z ? 500L : 1L);
        if (z) {
            act().hideInput();
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.cax
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f80082a.m217782f1((Bundle) obj);
            }
        }, new d30() { // from class: l.nax
            @Override // p149l.d30
            public final void call() {
                this.f137984a.m217785i1();
            }
        });
        duringCreated(this.f202409g).subscribe(mkd0.m154955G(new e30() { // from class: l.rax
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f158568a.m217786j1((roj0) obj);
            }
        }));
        int i = this.f126210a;
        if (i != 43) {
            if (i == 45) {
                lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.xax
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f191850a.m217784h1((C4319c) obj);
                    }
                }));
            }
        } else {
            duringCreated(CoreModule.f17545c.m31483n3().distinctUntilChanged()).filter(new w9j() { // from class: l.sax
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(!CoreModule.m29935P().m94651a().mo33489e2());
                }
            }).take(1).subscribe(mkd0.m154956H(new e30() { // from class: l.tax
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f169190a.m217787m1((Counter) obj);
                }
            }, new e30() { // from class: l.uax
                @Override // p149l.e30
                public final void call(Object obj) {
                    zax.m217769P0((Throwable) obj);
                }
            }));
            if (ogl0.m164245X()) {
                duringCreated(CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("limitedTrialSee")).filter(new w9j() { // from class: l.vax
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(xma.m210042E3());
                    }
                }).take(1)).subscribe(mkd0.m154955G(new e30() { // from class: l.wax
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f185516a.m217783g1((UserPrivilege) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: d1 */
    public int m217789d1() {
        return this.f126210a;
    }

    /* JADX INFO: renamed from: k1 */
    public final /* synthetic */ void m217790k1(User user) {
        C8456b.m47638r(act(), user);
        act().m66873d2();
    }

    /* JADX INFO: renamed from: l1 */
    public final /* synthetic */ void m217791l1(final User user, Integer num) {
        e51.m114774y(new Runnable() { // from class: l.eax
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.f17545c.f19609U.m109085a(new d30() { // from class: l.kax
                    @Override // p149l.d30
                    public final void call() {
                        zax.m217765J0(user);
                    }
                });
            }
        });
        az50.INSTANCE.m99623c();
        CoreModule.m29932K().pollConversation();
        e51.m114743H(act(), new Runnable() { // from class: l.fax
            @Override // java.lang.Runnable
            public final void run() {
                this.f96670a.m217790k1(user);
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ void m217792n1(boolean z, roj0 roj0Var) {
        if (z) {
            lsi0.m151595y("消息已发送");
        }
        act().m66873d2();
    }

    /* JADX INFO: renamed from: o1 */
    public final /* synthetic */ void m217793o1(Message message, Throwable th) {
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

    /* JADX INFO: renamed from: p1 */
    public final /* synthetic */ void m217794p1(final Conversation conversation, String str, final boolean z) {
        if (NullChecker.m81303a(conversation)) {
            e51.m114774y(new Runnable() { // from class: l.lax
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f17545c.f19609U.m109085a(new d30() { // from class: l.qax
                        @Override // p149l.d30
                        public final void call() {
                            zax.m217763H0(conversation);
                        }
                    });
                }
            });
        }
        final Message message = new Message();
        message.value = str;
        message.messageType = MessageType.get("text");
        CoreModule.f17545c.f19642f0.m32649Fn(this.f126211b, message, null, false, false).flatMap(new w9j() { // from class: l.max
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreModule.f17545c.f19642f0.m32650Fo();
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.oax
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f142869a.m217792n1(z, (roj0) obj);
            }
        }, new e30() { // from class: l.pax
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f148015a.m217793o1(message, (Throwable) obj);
            }
        }));
    }

    @Override // p149l.l5x
    /* JADX INFO: renamed from: q0 */
    public void mo134431q0(String str, int i, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        super.mo134431q0(str, i, arrayList, arrayList2);
        this.f202406d = arrayList;
        this.f202407e = arrayList2;
    }

    /* JADX INFO: renamed from: q1 */
    public final /* synthetic */ void m217795q1(String str, boolean z) {
        m217788t1(str, z, false);
    }

    /* JADX INFO: renamed from: r1 */
    public final /* synthetic */ void m217796r1() {
        this.f202408f = false;
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ void m217797s1() {
        this.f202408f = false;
    }

    /* JADX INFO: renamed from: u1 */
    public void m217798u1(final String str, final boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!qib0.f154711Z.m119125K(str)) {
            m217788t1(str, z, false);
            return;
        }
        act().dialog().m20503E0(R$string.f19127zi).m20500D(R$string.f19067xi).m20541k0(R$string.f19037wi).m20556t0(R$string.f19097yi, new Runnable() { // from class: l.gax
            @Override // java.lang.Runnable
            public final void run() {
                this.f101719a.m217795q1(str, z);
            }
        }).m20568z0();
        HashSet hashSet = new HashSet(MessagesAct.f31635r.get());
        hashSet.add(this.f126211b);
        MessagesAct.f31635r.put(hashSet);
    }

    /* JADX INFO: renamed from: v1 */
    public void m217799v1(boolean z) {
        if (z || !this.f202408f) {
            this.f202408f = true;
            if (emr.INSTANCE.m117220b()) {
                C8764c.m53393G0(act(), "p_message,locked_match", null, new d30() { // from class: l.hax
                    @Override // p149l.d30
                    public final void call() {
                        this.f106856a.m217796r1();
                    }
                });
            } else {
                C8764c.m53382C1(act(), "p_message,locked_match", Privilege.see_who_likes_me, new d30() { // from class: l.iax
                    @Override // p149l.d30
                    public final void call() {
                        this.f112330a.m217797s1();
                    }
                });
            }
        }
    }
}
