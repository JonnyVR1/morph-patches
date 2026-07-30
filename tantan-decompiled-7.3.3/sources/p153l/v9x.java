package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.BreakIce;
import com.p051p1.mobile.putong.core.data.ChatHeatActionData;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.NavigationIntent;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes3.dex */
public class v9x extends k8x<jax> {

    /* JADX INFO: renamed from: d */
    public ArrayList<String> f183050d;

    /* JADX INFO: renamed from: e */
    public ArrayList<String> f183051e;

    /* JADX INFO: renamed from: f */
    public int f183052f;

    /* JADX INFO: renamed from: g */
    public C22507a<uxj0> f183053g;

    /* JADX INFO: renamed from: h */
    public BreakIce f183054h;

    public v9x(ner nerVar) {
        super(nerVar);
        this.f183052f = 2;
        this.f183053g = C22507a.m222759c(uxj0.f181467a);
        this.f183054h = null;
    }

    /* JADX INFO: renamed from: H0 */
    public static /* synthetic */ void m200469H0(Conversation conversation) {
        conversation.read = Boolean.TRUE;
        CoreModule.f18264c.f20384f0.m34053mq(conversation);
    }

    /* JADX INFO: renamed from: O0 */
    public static /* synthetic */ void m200474O0(Throwable th) {
        if (th instanceof TantanException.Client.TantanForbidden) {
            TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
            int i = tantanForbidden.code;
            String str = tantanForbidden.message;
            if (i == 40399) {
                r1j0.m179420g(str);
                return;
            }
        }
        r1j0.m179420g("设置失败，请稍后再试");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public /* synthetic */ void m200477U0(Bundle bundle) {
        act().setSwipeBackEnable(false);
        toh0.m192059s();
        ((jax) this.viewModel).m144134b0(NullChecker.m82486a(bundle));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public /* synthetic */ void m200478V0() {
        ((jax) this.viewModel).destroy();
    }

    /* JADX INFO: renamed from: R0 */
    public BreakIce m200479R0() {
        return this.f183054h;
    }

    /* JADX INFO: renamed from: S0 */
    public void m200480S0() {
        act().startActivity(NewMainAct.m40697M5(act(), NavigationIntent.get("cards")));
        act().m68056e2();
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m200481W0(uxj0 uxj0Var) {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(this.f124421b);
        this.f124422c = userM116503Pa;
        ((jax) this.viewModel).m144148p0(userM116600p9, userM116503Pa, this.f124420a);
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m200482X0(Envelope envelope) {
        if (envelope.meta.code == 200) {
            CoreData coreData = (CoreData) envelope.data.getModuleData(CoreData.class);
            if (NullChecker.m82486a(coreData) && !jyb.m147479J(coreData.iceBreakings)) {
                ((jax) this.viewModel).m144145m0(coreData.iceBreakings);
                return;
            }
        }
        m200488e1();
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m200483Y0(Throwable th) {
        m200488e1();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.i9x
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f113523a.m200477U0((Bundle) obj);
            }
        }, new x20() { // from class: l.m9x
            @Override // p153l.x20
            public final void call() {
                this.f135446a.m200478V0();
            }
        });
        duringCreated(this.f183053g).subscribe(psd0.m173596G(new y20() { // from class: l.n9x
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f140962a.m200481W0((uxj0) obj);
            }
        }));
        m200489f1();
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m200484a1(uxj0 uxj0Var) {
        o1j0.m165651y("消息已发送");
        act().m68056e2();
    }

    /* JADX INFO: renamed from: b1 */
    public final /* synthetic */ void m200485b1(Message message, Throwable th) {
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

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m200487d1(x20 x20Var, uxj0 uxj0Var) {
        m200489f1();
        x20Var.call();
    }

    /* JADX INFO: renamed from: e1 */
    public final void m200488e1() {
        List<String> listM131769x0 = gra.m131769x0();
        ArrayList arrayList = new ArrayList();
        for (String str : listM131769x0) {
            BreakIce breakIce = new BreakIce();
            breakIce.tipId = String.valueOf(listM131769x0.indexOf(str));
            breakIce.content = str;
            arrayList.add(breakIce);
        }
        ((jax) this.viewModel).m144145m0(arrayList);
    }

    /* JADX INFO: renamed from: f1 */
    public final void m200489f1() {
        duringCreated(CoreModule.f18264c.f20381e0.m116598p7()).take(1).subscribe(psd0.m173597H(new y20() { // from class: l.o9x
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f145647a.m200482X0((Envelope) obj);
            }
        }, new y20() { // from class: l.p9x
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f151190a.m200483Y0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g1 */
    public void m200490g1() {
        if (this.f183050d.size() <= 1) {
            act().m68056e2();
            return;
        }
        this.f124421b = this.f183050d.get(1);
        this.f183050d.remove(0);
        this.f183051e.remove(0);
        this.f183053g.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: h1, reason: merged with bridge method [inline-methods] */
    public final void m200486c1(String str) {
        final Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(this.f124421b);
        if (NullChecker.m82486a(conversationM33859Xe)) {
            l51.m152919y(new Runnable() { // from class: l.r9x
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f18264c.f20351U.m128074a(new x20() { // from class: l.l9x
                        @Override // p153l.x20
                        public final void call() {
                            v9x.m200469H0(conversation);
                        }
                    });
                }
            });
        }
        final Message message = new Message();
        message.value = str;
        message.messageType = MessageType.get("text");
        CoreModule.f18264c.f20384f0.m33652Fn(this.f124421b, message, null, false, false).flatMap(new qcj() { // from class: l.s9x
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreModule.f18264c.f20384f0.m33653Fo();
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.t9x
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f172678a.m200484a1((uxj0) obj);
            }
        }, new y20() { // from class: l.u9x
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f178161a.m200485b1(message, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i1 */
    public void m200492i1(final String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!z || !uqb0.f180394Z.m95954K(str)) {
            m200486c1(str);
            return;
        }
        act().dialog().m21502E0(R$string.f18945Vi).m21499D(R$string.f18885Ti).m21540k0(R$string.f18855Si).m21555t0(R$string.f18915Ui, new Runnable() { // from class: l.q9x
            @Override // java.lang.Runnable
            public final void run() {
                this.f156272a.m200486c1(str);
            }
        }).m21567z0();
        HashSet hashSet = new HashSet(MessagesAct.f32483r.get());
        hashSet.add(CoreModule.f18264c.f20381e0.m116503Pa(this.f124421b).f56859id);
        MessagesAct.f32483r.put(hashSet);
    }

    /* JADX INFO: renamed from: j1 */
    public void m200493j1(String str, final x20 x20Var) {
        C22421c<uxj0> c22421cM116536Z6;
        if (this.f183054h != null || TextUtils.isEmpty(str)) {
            c22421cM116536Z6 = (!NullChecker.m82486a(this.f183054h) || TextUtils.equals(this.f183054h.content, str)) ? null : CoreModule.f18264c.f20381e0.m116536Z6(this.f183054h.tipId, str);
        } else {
            c22421cM116536Z6 = CoreModule.f18264c.f20381e0.m116524W6(str);
        }
        if (c22421cM116536Z6 == null) {
            x20Var.call();
        } else {
            duringCreated(c22421cM116536Z6).subscribe(psd0.m173597H(new y20() { // from class: l.j9x
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f118913a.m200487d1(x20Var, (uxj0) obj);
                }
            }, new y20() { // from class: l.k9x
                @Override // p153l.y20
                public final void call(Object obj) {
                    v9x.m200474O0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: k1 */
    public void m200494k1(BreakIce breakIce) {
        this.f183054h = breakIce;
    }

    @Override // p153l.k8x
    /* JADX INFO: renamed from: q0 */
    public void mo96040q0(String str, int i, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        super.mo96040q0(str, i, arrayList, arrayList2);
        this.f183050d = arrayList;
        this.f183051e = arrayList2;
    }
}
