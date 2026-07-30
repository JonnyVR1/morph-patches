package p003l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.p001ui.messages.MessagesAct;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.BreakIce;
import com.p1.mobile.putong.core.data.ChatHeatActionData;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageType;
import com.p1.mobile.putong.core.data.Sticker;
import com.p1.mobile.putong.core.newui.main.NewMainAct;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.NavigationIntent;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import l.e51;
import l.jq2;
import l.lsi0;
import l.mcr;
import l.mgh0;
import l.mkd0;
import l.osi0;
import l.qib0;
import l.roj0;
import l.upa;
import l.vwb;
import org.spongycastle.i18n.TextBundle;
import p014rx.C1099c;
import p014rx.subjects.C1185a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class w6x extends l5x<k7x> {

    /* JADX INFO: renamed from: d */
    public ArrayList<String> f8504d;

    /* JADX INFO: renamed from: e */
    public ArrayList<String> f8505e;

    /* JADX INFO: renamed from: f */
    public int f8506f;

    /* JADX INFO: renamed from: g */
    public C1185a<roj0> f8507g;

    /* JADX INFO: renamed from: h */
    public BreakIce f8508h;

    public w6x(mcr mcrVar) {
        super(mcrVar);
        this.f8506f = 2;
        this.f8507g = C1185a.m9970c(roj0.a);
        this.f8508h = null;
    }

    /* JADX INFO: renamed from: H0 */
    public static /* synthetic */ void m8519H0(Conversation conversation) {
        conversation.read = Boolean.TRUE;
        CoreModule.c.f0.mq(conversation);
    }

    /* JADX INFO: renamed from: O0 */
    public static /* synthetic */ void m8524O0(Throwable th) {
        if (th instanceof TantanException.Client.TantanForbidden) {
            TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
            int i = tantanForbidden.code;
            String str = tantanForbidden.message;
            if (i == 40399) {
                osi0.g(str);
                return;
            }
        }
        osi0.g("设置失败，请稍后再试");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public /* synthetic */ void m8527U0(Bundle bundle) {
        act().setSwipeBackEnable(false);
        mgh0.s();
        ((k7x) ((jq2) this).viewModel).m5597b0(NullChecker.a(bundle));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public /* synthetic */ void m8528V0() {
        ((k7x) ((jq2) this).viewModel).destroy();
    }

    /* JADX INFO: renamed from: R0 */
    public BreakIce m8529R0() {
        return this.f8508h;
    }

    /* JADX INFO: renamed from: S0 */
    public void m8530S0() {
        act().startActivity(NewMainAct.I5(act(), NavigationIntent.get("cards")));
        act().finish();
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m8531W0(roj0 roj0Var) {
        User userP9 = CoreModule.c.e0.p9();
        User userPa = CoreModule.c.e0.Pa(this.f5220b);
        this.f5221c = userPa;
        ((k7x) ((jq2) this).viewModel).m5612p0(userP9, userPa, this.f5219a);
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m8532X0(Envelope envelope) {
        if (envelope.meta.code == 200) {
            CoreData moduleData = envelope.data.getModuleData(CoreData.class);
            if (NullChecker.a(moduleData) && !vwb.J(moduleData.iceBreakings)) {
                ((k7x) ((jq2) this).viewModel).m5609m0(moduleData.iceBreakings);
                return;
            }
        }
        m8539e1();
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m8533Y0(Throwable th) {
        m8539e1();
    }

    /* JADX INFO: renamed from: a0 */
    public void m8534a0() {
        creates(new e30() { // from class: l.j6x
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f4579a.m8527U0((Bundle) obj);
            }
        }, new d30() { // from class: l.n6x
            @Override // p003l.d30
            public final void call() {
                this.f5842a.m8528V0();
            }
        });
        duringCreated(this.f8507g).subscribe((m250) mkd0.G(new e30() { // from class: l.o6x
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f6050a.m8531W0((roj0) obj);
            }
        }));
        m8540f1();
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m8535a1(roj0 roj0Var) {
        lsi0.y("消息已发送");
        act().finish();
    }

    /* JADX INFO: renamed from: b1 */
    public final /* synthetic */ void m8536b1(Message message, Throwable th) {
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

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m8538d1(d30 d30Var, roj0 roj0Var) {
        m8540f1();
        d30Var.call();
    }

    /* JADX INFO: renamed from: e1 */
    public final void m8539e1() {
        List<String> listX0 = upa.x0();
        ArrayList arrayList = new ArrayList();
        for (String str : listX0) {
            BreakIce breakIce = new BreakIce();
            breakIce.tipId = String.valueOf(listX0.indexOf(str));
            breakIce.content = str;
            arrayList.add(breakIce);
        }
        ((k7x) ((jq2) this).viewModel).m5609m0(arrayList);
    }

    /* JADX INFO: renamed from: f1 */
    public final void m8540f1() {
        duringCreated(CoreModule.c.e0.p7()).take(1).subscribe((m250) mkd0.H(new e30() { // from class: l.p6x
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f6327a.m8532X0((Envelope) obj);
            }
        }, new e30() { // from class: l.q6x
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f6597a.m8533Y0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g1 */
    public void m8541g1() {
        if (this.f8504d.size() <= 1) {
            act().finish();
            return;
        }
        this.f5220b = this.f8504d.get(1);
        this.f8504d.remove(0);
        this.f8505e.remove(0);
        this.f8507g.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: h1, reason: merged with bridge method [inline-methods] */
    public final void m8537c1(String str) {
        final Conversation conversationXe = CoreModule.c.f0.Xe(this.f5220b);
        if (NullChecker.a(conversationXe)) {
            e51.y(new Runnable() { // from class: l.s6x
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.c.U.a(new d30() { // from class: l.m6x
                        @Override // p003l.d30
                        public final void call() {
                            w6x.m8519H0(conversation);
                        }
                    });
                }
            });
        }
        final Message message = new Message();
        message.value = str;
        message.messageType = MessageType.get(TextBundle.TEXT_ENTRY);
        CoreModule.c.f0.Fn(this.f5220b, message, (Sticker) null, false, false).flatMap(new w9j() { // from class: l.t6x
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return CoreModule.c.f0.Fo();
            }
        }).subscribe((m250) mkd0.H(new e30() { // from class: l.u6x
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f7931a.m8535a1((roj0) obj);
            }
        }, new e30() { // from class: l.v6x
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f8221a.m8536b1(message, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i1 */
    public void m8543i1(final String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!z || !qib0.Z.K(str)) {
            m8537c1(str);
            return;
        }
        act().dialog().E0(R.string.zi).D(R.string.xi).k0(R.string.wi).t0(R.string.yi, new Runnable() { // from class: l.r6x
            @Override // java.lang.Runnable
            public final void run() {
                this.f6799a.m8537c1(str);
            }
        }).z0();
        HashSet hashSet = new HashSet((Collection) MessagesAct.f1526r.get());
        hashSet.add(((DbObject) CoreModule.c.e0.Pa(this.f5220b)).id);
        MessagesAct.f1526r.put(hashSet);
    }

    /* JADX INFO: renamed from: j1 */
    public void m8544j1(String str, final d30 d30Var) {
        C1099c c1099cZ6;
        if (this.f8508h != null || TextUtils.isEmpty(str)) {
            c1099cZ6 = (!NullChecker.a(this.f8508h) || TextUtils.equals(this.f8508h.content, str)) ? null : CoreModule.c.e0.Z6(this.f8508h.tipId, str);
        } else {
            c1099cZ6 = CoreModule.c.e0.W6(str);
        }
        if (c1099cZ6 == null) {
            d30Var.call();
        } else {
            duringCreated(c1099cZ6).subscribe((m250) mkd0.H(new e30() { // from class: l.k6x
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f4809a.m8538d1(d30Var, (roj0) obj);
                }
            }, new e30() { // from class: l.l6x
                @Override // p003l.e30
                public final void call(Object obj) {
                    w6x.m8524O0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: k1 */
    public void m8545k1(BreakIce breakIce) {
        this.f8508h = breakIce;
    }

    @Override // p003l.l5x
    /* JADX INFO: renamed from: q0 */
    public void mo5067q0(String str, int i, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        super.mo5067q0(str, i, arrayList, arrayList2);
        this.f8504d = arrayList;
        this.f8505e = arrayList2;
    }
}
