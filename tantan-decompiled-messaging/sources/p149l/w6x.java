package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.BreakIce;
import com.p046p1.mobile.putong.core.data.ChatHeatActionData;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.NavigationIntent;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes3.dex */
public class w6x extends l5x<k7x> {

    /* JADX INFO: renamed from: d */
    public ArrayList<String> f185003d;

    /* JADX INFO: renamed from: e */
    public ArrayList<String> f185004e;

    /* JADX INFO: renamed from: f */
    public int f185005f;

    /* JADX INFO: renamed from: g */
    public C22392a<roj0> f185006g;

    /* JADX INFO: renamed from: h */
    public BreakIce f185007h;

    public w6x(mcr mcrVar) {
        super(mcrVar);
        this.f185005f = 2;
        this.f185006g = C22392a.m221513c(roj0.f160388a);
        this.f185007h = null;
    }

    /* JADX INFO: renamed from: H0 */
    public static /* synthetic */ void m201964H0(Conversation conversation) {
        conversation.read = Boolean.TRUE;
        CoreModule.f17545c.f19642f0.m33050mq(conversation);
    }

    /* JADX INFO: renamed from: O0 */
    public static /* synthetic */ void m201969O0(Throwable th) {
        if (th instanceof TantanException.Client.TantanForbidden) {
            TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
            int i = tantanForbidden.code;
            String str = tantanForbidden.message;
            if (i == 40399) {
                osi0.m165783g(str);
                return;
            }
        }
        osi0.m165783g("设置失败，请稍后再试");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public /* synthetic */ void m201972U0(Bundle bundle) {
        act().setSwipeBackEnable(false);
        mgh0.m154563s();
        ((k7x) this.viewModel).m144760b0(NullChecker.m81303a(bundle));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public /* synthetic */ void m201973V0() {
        ((k7x) this.viewModel).destroy();
    }

    /* JADX INFO: renamed from: R0 */
    public BreakIce m201974R0() {
        return this.f185007h;
    }

    /* JADX INFO: renamed from: S0 */
    public void m201975S0() {
        act().startActivity(NewMainAct.m39685I5(act(), NavigationIntent.get("cards")));
        act().m66873d2();
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m201976W0(roj0 roj0Var) {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(this.f126211b);
        this.f126212c = userM169430Pa;
        ((k7x) this.viewModel).m144774p0(userM169527p9, userM169430Pa, this.f126210a);
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m201977X0(Envelope envelope) {
        if (envelope.meta.code == 200) {
            CoreData coreData = (CoreData) envelope.data.getModuleData(CoreData.class);
            if (NullChecker.m81303a(coreData) && !vwb.m200296J(coreData.iceBreakings)) {
                ((k7x) this.viewModel).m144771m0(coreData.iceBreakings);
                return;
            }
        }
        m201983e1();
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m201978Y0(Throwable th) {
        m201983e1();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.j6x
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f116546a.m201972U0((Bundle) obj);
            }
        }, new d30() { // from class: l.n6x
            @Override // p149l.d30
            public final void call() {
                this.f137457a.m201973V0();
            }
        });
        duringCreated(this.f185006g).subscribe(mkd0.m154955G(new e30() { // from class: l.o6x
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f142431a.m201976W0((roj0) obj);
            }
        }));
        m201984f1();
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m201979a1(roj0 roj0Var) {
        lsi0.m151595y("消息已发送");
        act().m66873d2();
    }

    /* JADX INFO: renamed from: b1 */
    public final /* synthetic */ void m201980b1(Message message, Throwable th) {
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

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m201982d1(d30 d30Var, roj0 roj0Var) {
        m201984f1();
        d30Var.call();
    }

    /* JADX INFO: renamed from: e1 */
    public final void m201983e1() {
        List<String> listM194838x0 = upa.m194838x0();
        ArrayList arrayList = new ArrayList();
        for (String str : listM194838x0) {
            BreakIce breakIce = new BreakIce();
            breakIce.tipId = String.valueOf(listM194838x0.indexOf(str));
            breakIce.content = str;
            arrayList.add(breakIce);
        }
        ((k7x) this.viewModel).m144771m0(arrayList);
    }

    /* JADX INFO: renamed from: f1 */
    public final void m201984f1() {
        duringCreated(CoreModule.f17545c.f19639e0.m169525p7()).take(1).subscribe(mkd0.m154956H(new e30() { // from class: l.p6x
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f147455a.m201977X0((Envelope) obj);
            }
        }, new e30() { // from class: l.q6x
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f152969a.m201978Y0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g1 */
    public void m201985g1() {
        if (this.f185003d.size() <= 1) {
            act().m66873d2();
            return;
        }
        this.f126211b = this.f185003d.get(1);
        this.f185003d.remove(0);
        this.f185004e.remove(0);
        this.f185006g.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: h1, reason: merged with bridge method [inline-methods] */
    public final void m201981c1(String str) {
        final Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(this.f126211b);
        if (NullChecker.m81303a(conversationM32856Xe)) {
            e51.m114774y(new Runnable() { // from class: l.s6x
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f17545c.f19609U.m109085a(new d30() { // from class: l.m6x
                        @Override // p149l.d30
                        public final void call() {
                            w6x.m201964H0(conversation);
                        }
                    });
                }
            });
        }
        final Message message = new Message();
        message.value = str;
        message.messageType = MessageType.get("text");
        CoreModule.f17545c.f19642f0.m32649Fn(this.f126211b, message, null, false, false).flatMap(new w9j() { // from class: l.t6x
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreModule.f17545c.f19642f0.m32650Fo();
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.u6x
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f174893a.m201979a1((roj0) obj);
            }
        }, new e30() { // from class: l.v6x
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f180241a.m201980b1(message, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i1 */
    public void m201987i1(final String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!z || !qib0.f154711Z.m119125K(str)) {
            m201981c1(str);
            return;
        }
        act().dialog().m20503E0(R$string.f19127zi).m20500D(R$string.f19067xi).m20541k0(R$string.f19037wi).m20556t0(R$string.f19097yi, new Runnable() { // from class: l.r6x
            @Override // java.lang.Runnable
            public final void run() {
                this.f157987a.m201981c1(str);
            }
        }).m20568z0();
        HashSet hashSet = new HashSet(MessagesAct.f31635r.get());
        hashSet.add(CoreModule.f17545c.f19639e0.m169430Pa(this.f126211b).f56011id);
        MessagesAct.f31635r.put(hashSet);
    }

    /* JADX INFO: renamed from: j1 */
    public void m201988j1(String str, final d30 d30Var) {
        C22306c<roj0> c22306cM169463Z6;
        if (this.f185007h != null || TextUtils.isEmpty(str)) {
            c22306cM169463Z6 = (!NullChecker.m81303a(this.f185007h) || TextUtils.equals(this.f185007h.content, str)) ? null : CoreModule.f17545c.f19639e0.m169463Z6(this.f185007h.tipId, str);
        } else {
            c22306cM169463Z6 = CoreModule.f17545c.f19639e0.m169451W6(str);
        }
        if (c22306cM169463Z6 == null) {
            d30Var.call();
        } else {
            duringCreated(c22306cM169463Z6).subscribe(mkd0.m154956H(new e30() { // from class: l.k6x
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f121506a.m201982d1(d30Var, (roj0) obj);
                }
            }, new e30() { // from class: l.l6x
                @Override // p149l.e30
                public final void call(Object obj) {
                    w6x.m201969O0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: k1 */
    public void m201989k1(BreakIce breakIce) {
        this.f185007h = breakIce;
    }

    @Override // p149l.l5x
    /* JADX INFO: renamed from: q0 */
    public void mo134431q0(String str, int i, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        super.mo134431q0(str, i, arrayList, arrayList2);
        this.f185003d = arrayList;
        this.f185004e = arrayList2;
    }
}
