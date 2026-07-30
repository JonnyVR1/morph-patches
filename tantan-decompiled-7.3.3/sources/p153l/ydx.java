package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.ChatHeatActionData;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.data.UserPrivilege;
import com.p051p1.mobile.putong.core.p058ui.match.C8619b;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashSet;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes3.dex */
public class ydx extends k8x<rex> {

    /* JADX INFO: renamed from: d */
    public ArrayList<String> f198632d;

    /* JADX INFO: renamed from: e */
    public ArrayList<String> f198633e;

    /* JADX INFO: renamed from: f */
    public boolean f198634f;

    /* JADX INFO: renamed from: g */
    public C22507a<uxj0> f198635g;

    public ydx(ner nerVar) {
        super(nerVar);
        this.f198634f = false;
        this.f198635g = C22507a.m222759c(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: H0 */
    public static /* synthetic */ void m215296H0(Conversation conversation) {
        conversation.read = Boolean.TRUE;
        CoreModule.f18264c.f20384f0.m34053mq(conversation);
    }

    /* JADX INFO: renamed from: J0 */
    public static /* synthetic */ void m215298J0(User user) {
        Conversation conversationQuery = CoreModule.f18272k.f115545m.query(user.f56859id);
        conversationQuery.convType = "default";
        CoreModule.f18264c.f20384f0.m34053mq(conversationQuery);
    }

    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ void m215302P0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e1 */
    public /* synthetic */ void m215314e1() {
        m215332v1(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f1 */
    public /* synthetic */ void m215315f1(Bundle bundle) {
        act().setSwipeBackEnable(false);
        toh0.m192059s();
        ((rex) this.viewModel).m181152s0(NullChecker.m82486a(bundle), this.f124420a);
        if (this.f124420a == 43) {
            this.f198634f = true;
            l51.m152888H(act(), new Runnable() { // from class: l.cdx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f81289a.m215314e1();
                }
            }, 1500L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g1 */
    public /* synthetic */ void m215316g1(UserPrivilege userPrivilege) {
        CoreModule.m30930K().pollConversation();
        act().m68056e2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h1 */
    public /* synthetic */ void m215317h1(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            V v2 = this.viewModel;
            ((rex) v2).f162717L.m123509g(((rex) v2).getAct());
        } else if (c4470c == C4470c.f16268j) {
            ((rex) this.viewModel).f162717L.m123509g(null);
        } else if (c4470c == C4470c.f16271m) {
            ((rex) this.viewModel).f162717L.m123504b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i1 */
    public /* synthetic */ void m215318i1() {
        ((rex) this.viewModel).destroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j1 */
    public /* synthetic */ void m215319j1(uxj0 uxj0Var) {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        User userById = CoreModule.m30930K().getUserById(this.f124421b);
        this.f124422c = userById;
        ((rex) this.viewModel).m181138Q0(userM116600p9, userById, this.f124420a, this.f198633e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m1 */
    public /* synthetic */ void m215320m1(Counter counter) {
        if (CoreModule.m30933P().m143405a().mo34492e2()) {
            return;
        }
        final User userById = CoreModule.m30930K().getUserById(this.f124421b);
        yie0.m216087t(act(), userById, new y20() { // from class: l.xdx
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f193652a.m215324l1(userById, (Integer) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t1 */
    private void m215321t1(final String str, boolean z, final boolean z2) {
        final Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(this.f124421b);
        act().postDelayed(new Runnable() { // from class: l.idx
            @Override // java.lang.Runnable
            public final void run() {
                this.f114531a.m215327p1(conversationM33859Xe, str, z2);
            }
        }, z ? 500L : 1L);
        if (z) {
            act().hideInput();
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.bdx
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f76307a.m215315f1((Bundle) obj);
            }
        }, new x20() { // from class: l.mdx
            @Override // p153l.x20
            public final void call() {
                this.f136419a.m215318i1();
            }
        });
        duringCreated(this.f198635g).subscribe(psd0.m173596G(new y20() { // from class: l.qdx
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f156775a.m215319j1((uxj0) obj);
            }
        }));
        int i = this.f124420a;
        if (i != 43) {
            if (i == 45) {
                lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.wdx
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f188646a.m215317h1((C4470c) obj);
                    }
                }));
            }
        } else {
            duringCreated(CoreModule.f18264c.m32486n3().distinctUntilChanged()).filter(new qcj() { // from class: l.rdx
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(!CoreModule.m30933P().m143405a().mo34492e2());
                }
            }).take(1).subscribe(psd0.m173597H(new y20() { // from class: l.sdx
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f167476a.m215320m1((Counter) obj);
                }
            }, new y20() { // from class: l.tdx
                @Override // p153l.y20
                public final void call(Object obj) {
                    ydx.m215302P0((Throwable) obj);
                }
            }));
            if (spl0.m187372X()) {
                duringCreated(CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("limitedTrialSee")).filter(new qcj() { // from class: l.udx
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(joa.m146356F3());
                    }
                }).take(1)).subscribe(psd0.m173596G(new y20() { // from class: l.vdx
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f183687a.m215316g1((UserPrivilege) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: d1 */
    public int m215322d1() {
        return this.f124420a;
    }

    /* JADX INFO: renamed from: k1 */
    public final /* synthetic */ void m215323k1(User user) {
        C8619b.m48821r(act(), user);
        act().m68056e2();
    }

    /* JADX INFO: renamed from: l1 */
    public final /* synthetic */ void m215324l1(final User user, Integer num) {
        l51.m152919y(new Runnable() { // from class: l.ddx
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.f18264c.f20351U.m128074a(new x20() { // from class: l.jdx
                    @Override // p153l.x20
                    public final void call() {
                        ydx.m215298J0(user);
                    }
                });
            }
        });
        f760.INSTANCE.m124356c();
        CoreModule.m30930K().pollConversation();
        l51.m152888H(act(), new Runnable() { // from class: l.edx
            @Override // java.lang.Runnable
            public final void run() {
                this.f93586a.m215323k1(user);
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ void m215325n1(boolean z, uxj0 uxj0Var) {
        if (z) {
            o1j0.m165651y("消息已发送");
        }
        act().m68056e2();
    }

    /* JADX INFO: renamed from: o1 */
    public final /* synthetic */ void m215326o1(Message message, Throwable th) {
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

    /* JADX INFO: renamed from: p1 */
    public final /* synthetic */ void m215327p1(final Conversation conversation, String str, final boolean z) {
        if (NullChecker.m82486a(conversation)) {
            l51.m152919y(new Runnable() { // from class: l.kdx
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f18264c.f20351U.m128074a(new x20() { // from class: l.pdx
                        @Override // p153l.x20
                        public final void call() {
                            ydx.m215296H0(conversation);
                        }
                    });
                }
            });
        }
        final Message message = new Message();
        message.value = str;
        message.messageType = MessageType.get("text");
        CoreModule.f18264c.f20384f0.m33652Fn(this.f124421b, message, null, false, false).flatMap(new qcj() { // from class: l.ldx
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreModule.f18264c.f20384f0.m33653Fo();
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.ndx
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f141554a.m215325n1(z, (uxj0) obj);
            }
        }, new y20() { // from class: l.odx
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f146952a.m215326o1(message, (Throwable) obj);
            }
        }));
    }

    @Override // p153l.k8x
    /* JADX INFO: renamed from: q0 */
    public void mo96040q0(String str, int i, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        super.mo96040q0(str, i, arrayList, arrayList2);
        this.f198632d = arrayList;
        this.f198633e = arrayList2;
    }

    /* JADX INFO: renamed from: q1 */
    public final /* synthetic */ void m215328q1(String str, boolean z) {
        m215321t1(str, z, false);
    }

    /* JADX INFO: renamed from: r1 */
    public final /* synthetic */ void m215329r1() {
        this.f198634f = false;
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ void m215330s1() {
        this.f198634f = false;
    }

    /* JADX INFO: renamed from: u1 */
    public void m215331u1(final String str, final boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!uqb0.f180394Z.m95954K(str)) {
            m215321t1(str, z, false);
            return;
        }
        act().dialog().m21502E0(R$string.f18945Vi).m21499D(R$string.f18885Ti).m21540k0(R$string.f18855Si).m21555t0(R$string.f18915Ui, new Runnable() { // from class: l.fdx
            @Override // java.lang.Runnable
            public final void run() {
                this.f98526a.m215328q1(str, z);
            }
        }).m21567z0();
        HashSet hashSet = new HashSet(MessagesAct.f32483r.get());
        hashSet.add(this.f124421b);
        MessagesAct.f32483r.put(hashSet);
    }

    /* JADX INFO: renamed from: v1 */
    public void m215332v1(boolean z) {
        if (z || !this.f198634f) {
            this.f198634f = true;
            if (Cfor.INSTANCE.m126491b()) {
                C8927c.m54576G0(act(), "p_message,locked_match", null, new x20() { // from class: l.gdx
                    @Override // p153l.x20
                    public final void call() {
                        this.f103749a.m215329r1();
                    }
                });
            } else {
                C8927c.m54565C1(act(), "p_message,locked_match", Privilege.see_who_likes_me, new x20() { // from class: l.hdx
                    @Override // p153l.x20
                    public final void call() {
                        this.f109052a.m215330s1();
                    }
                });
            }
        }
    }
}
