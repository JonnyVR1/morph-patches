package p003l;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.common.collect.Lists;
import com.p000p1.mobile.putong.core.data.Conversation;
import com.p000p1.mobile.putong.core.data.Greeting;
import com.p000p1.mobile.putong.core.data.Message;
import com.p000p1.mobile.putong.core.data.NotificationStatus;
import com.p000p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p000p1.mobile.putong.core.message.R$string;
import com.p000p1.mobile.putong.core.p001ui.intl.greet.IntlGreetingParam;
import com.p000p1.mobile.putong.core.p001ui.intl.greet.message.IntlItemBreakIceMessage;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.d;
import l.d30;
import l.e30;
import l.jo0;
import l.jq2;
import l.lsi0;
import l.mcr;
import l.mkd0;
import l.q860;
import l.r07;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.yij0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0006\n\u0002\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u000bJ\u000f\u0010\u0017\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0017\u0010\u000bJ)\u0010\u001c\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001e\u0010\u000bJ\u000f\u0010\u001f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001f\u0010\u000bJ\r\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0012¢\u0006\u0004\b#\u0010$J!\u0010'\u001a\u00020\t2\b\u0010%\u001a\u0004\u0018\u00010\r2\b\u0010&\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b'\u0010(J'\u0010.\u001a\u00020 2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020)2\b\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b.\u0010/R$\u00105\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u0010\u0010R\u0016\u00108\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R$\u0010?\u001a\u0002092\u0006\u0010:\u001a\u0002098\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0016\u0010A\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u00107R\u0016\u0010C\u001a\u0004\u0018\u00010\r8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bB\u00103¨\u0006D"}, d2 = {"Ll/gln;", "Ll/dmn;", "Ll/xln;", "Ll/mcr;", "lifecycleProvider", "Lcom/p1/mobile/putong/core/ui/intl/greet/IntlGreetingParam;", "param", "<init>", "(Ll/mcr;Lcom/p1/mobile/putong/core/ui/intl/greet/IntlGreetingParam;)V", "", "U0", "()V", "V0", "", "greetingId", "W0", "(Ljava/lang/String;)V", "", "Lcom/p1/mobile/putong/core/data/Message;", "loaded", "S0", "(Ljava/util/List;)Ljava/util/List;", "j1", "k1", "Lcom/p1/mobile/putong/core/data/Greeting;", Greeting.TYPE, "message", "extraParams", "f1", "(Lcom/p1/mobile/putong/core/data/Greeting;Lcom/p1/mobile/putong/core/data/Message;Ljava/lang/String;)V", "destroy", "a0", "", "c1", "()Z", "g1", "(Lcom/p1/mobile/putong/core/data/Message;)V", "str", "uid", "e1", "(Ljava/lang/String;Ljava/lang/String;)V", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "d1", "(IILandroid/content/Intent;)Z", "g", "Ljava/lang/String;", "getMomentOwnerId", "()Ljava/lang/String;", "setMomentOwnerId", "momentOwnerId", "h", "Z", "isFirstResume", "", "value", "i", "D", "getGreetingCreatedTime", "()D", "greetingCreatedTime", "j", "hadMessage", "f0", "channelByFrom", "message_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
@SourceDebugExtension
public final class gln extends dmn<xln> {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public String momentOwnerId;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public boolean isFirstResume;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public double greetingCreatedTime;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public boolean hadMessage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gln(@Nullable mcr mcrVar, @NotNull IntlGreetingParam intlGreetingParam) {
        super(mcrVar, intlGreetingParam);
        intlGreetingParam.getClass();
        this.isFirstResume = true;
    }

    /* JADX INFO: renamed from: A0 */
    public static void m6721A0(gln glnVar, User user) {
        user.getClass();
        ((xln) ((jq2) glnVar).viewModel).m10930h0(user);
    }

    /* JADX INFO: renamed from: C0 */
    public static Boolean m6722C0(Conversation conversation) {
        conversation.getClass();
        return Boolean.valueOf(!CoreModule.c.f0.uh(((DbObject) conversation).id));
    }

    /* JADX INFO: renamed from: D0 */
    public static void m6723D0(final gln glnVar, q860 q860Var) {
        q860Var.getClass();
        List<? extends Message> list = q860Var.a;
        list.getClass();
        List<Message> listM6736S0 = glnVar.m6736S0(list);
        List<Message> list2 = listM6736S0;
        if (!vwb.J(list2) && TextUtils.equals(listM6736S0.get(0).owner, glnVar.m6177g0().otherUser) && !TextUtils.equals(glnVar.m6177g0().readUntil, ((DbObject) listM6736S0.get(0)).id)) {
            glnVar.m6747j1();
        }
        if (!vwb.J(list2) && NullChecker.a(listM6736S0.get(0)) && listM6736S0.get(0).localCreatedTime - System.nanoTime() < 1000000000) {
            ((xln) ((jq2) glnVar).viewModel).m10926b0();
        }
        if (vwb.J(list2) && !glnVar.hadMessage) {
            c cVarDuringCreated = glnVar.duringCreated(CoreModule.c.e0.Ka(glnVar.m6177g0().otherUser));
            final Function1 function1 = new Function1() { // from class: l.pkn
                public final Object invoke(Object obj) {
                    return gln.m6740X0((User) obj);
                }
            };
            cVarDuringCreated.filter(new w9j() { // from class: l.qkn
                public final Object call(Object obj) {
                    return gln.m6741Y0(function1, obj);
                }
            }).take(1).subscribe(mkd0.H(new e30() { // from class: l.rkn
                public final void call(Object obj) {
                    gln.m6742a1(this.f7185a, (User) obj);
                }
            }, new e30() { // from class: l.skn
                public final void call(Object obj) {
                    gln.m6743b1((Throwable) obj);
                }
            }));
            return;
        }
        glnVar.hadMessage = true;
        IntlItemBreakIceMessage intlItemBreakIceMessageM10909I = ((xln) ((jq2) glnVar).viewModel).getItemBreakIceMessage();
        if (intlItemBreakIceMessageM10909I != null && intlItemBreakIceMessageM10909I.getVisibility() == 0) {
            xdl0.M(intlItemBreakIceMessageM10909I, false);
        }
        xln xlnVar = (xln) ((jq2) glnVar).viewModel;
        List<? extends Message> listQ = Lists.q(listM6736S0);
        listQ.getClass();
        xlnVar.m10929f0(listQ);
    }

    /* JADX INFO: renamed from: G0 */
    public static Boolean m6726G0(User user) {
        return Boolean.valueOf(NullChecker.a(user));
    }

    /* JADX INFO: renamed from: H0 */
    public static void m6727H0(Throwable th) {
    }

    /* JADX INFO: renamed from: I0 */
    public static void m6728I0(Throwable th) {
    }

    /* JADX INFO: renamed from: J0 */
    public static void m6729J0(Throwable th) {
    }

    /* JADX INFO: renamed from: L0 */
    public static c m6730L0(Function1 function1, Object obj) {
        return (c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: N0 */
    public static void m6731N0(gln glnVar, Conversation conversation) {
        conversation.getClass();
        CoreModule.c.r0.J6();
        Act act = glnVar.act();
        if (act != null) {
            act.startActivity(MessagesAct.i2(glnVar.act(), ((DbObject) conversation).id, false, false));
        }
        Act act2 = glnVar.act();
        if (act2 != null) {
            act2.finish();
        }
    }

    /* JADX INFO: renamed from: P0 */
    public static Boolean m6733P0(Message message) {
        message.getClass();
        boolean z = false;
        if (NullChecker.a(message)) {
            String str = ((DbObject) message).id;
            str.getClass();
            if (!d.J(str, "fake_id_", false, 2, (Object) null)) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: Q0 */
    public static void m6734Q0(Greeting greeting) {
        CoreModule.c.r0.n0.onNext(greeting);
    }

    /* JADX INFO: renamed from: R0 */
    public static void m6735R0(Throwable th) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S0 */
    private final List<Message> m6736S0(List<? extends Message> loaded) {
        List<? extends Message> list = loaded;
        return (vwb.J(list) || !vwb.m(list, new w9j() { // from class: l.tkn
            public final Object call(Object obj) {
                return gln.m6733P0((Message) obj);
            }
        })) ? new ArrayList() : loaded;
    }

    /* JADX INFO: renamed from: U0 */
    private final void m6737U0() {
        duringCreated(CoreModule.c.r0.p0).subscribe(mkd0.H(new e30() { // from class: l.mkn
            public final void call(Object obj) {
                gln.m6751m0(this.f6354a, (Greeting) obj);
            }
        }, new e30() { // from class: l.nkn
            public final void call(Object obj) {
                gln.m6728I0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V0 */
    private final void m6738V0() {
        if (m6763c1()) {
            lifecycle().subscribe(mkd0.H(new e30() { // from class: l.kkn
                public final void call(Object obj) {
                    gln.m6752n0(this.f5664a, (com.p1.mobile.android.app.c) obj);
                }
            }, new e30() { // from class: l.lkn
                public final void call(Object obj) {
                    gln.m6760x0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: W0 */
    private final void m6739W0(final String greetingId) {
        if (getParam().getHasCreatedGreeting()) {
            CoreModule.c.r0.E6(greetingId);
        }
        c cVarCompose = c.just(CoreModule.k.c.O(greetingId, m6177g0().clearedUntil).j()).compose(mkd0.Q());
        final Function1 function1 = new Function1() { // from class: l.eln
            public final Object invoke(Object obj) {
                return gln.m6753o0(this.f4313a, greetingId, (List) obj);
            }
        };
        c cVarFlatMap = cVarCompose.flatMap(new w9j() { // from class: l.fln
            public final Object call(Object obj) {
                return gln.m6730L0(function1, obj);
            }
        });
        if (CoreModule.c.f0.uh(greetingId)) {
            cVarFlatMap = CoreModule.c.f0.Un(greetingId, 0.0d);
        }
        duringCreated(cVarFlatMap.observeOn(jo0.a())).subscribe(mkd0.H(new e30() { // from class: l.ekn
            public final void call(Object obj) {
                gln.m6723D0(this.f4309a, (q860) obj);
            }
        }, new e30() { // from class: l.fkn
            public final void call(Object obj) {
                gln.m6750l0((Throwable) obj);
            }
        }));
        c cVarNe = CoreModule.c.f0.Ne(greetingId);
        final Function1 function2 = new Function1() { // from class: l.gkn
            public final Object invoke(Object obj) {
                return gln.m6722C0((Conversation) obj);
            }
        };
        duringCreated(cVarNe.filter(new w9j() { // from class: l.hkn
            public final Object call(Object obj) {
                return gln.m6748k0(function2, obj);
            }
        })).take(1).subscribe(mkd0.H(new e30() { // from class: l.ikn
            public final void call(Object obj) {
                gln.m6731N0(this.f5156a, (Conversation) obj);
            }
        }, new e30() { // from class: l.jkn
            public final void call(Object obj) {
                gln.m6727H0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X0 */
    public static final Boolean m6740X0(User user) {
        return Boolean.valueOf(NullChecker.a(user));
    }

    /* JADX INFO: renamed from: Y0 */
    public static final Boolean m6741Y0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: a1 */
    public static final void m6742a1(gln glnVar, User user) {
        user.getClass();
        ((xln) ((jq2) glnVar).viewModel).m10925Y(user);
    }

    /* JADX INFO: renamed from: f1 */
    private final void m6744f1(final Greeting greeting, Message message, String extraParams) {
        Act act;
        c cVarDuringCreated;
        if (greeting == null || (act = act()) == null || (cVarDuringCreated = act.duringCreated(CoreModule.c.r0.u6(greeting.f63id, greeting.channel, message, extraParams, (d30) null))) == null) {
            return;
        }
        cVarDuringCreated.subscribe(mkd0.H(new e30() { // from class: l.wkn
            public final void call(Object obj) {
                gln.m6745h1(greeting, (Message) obj);
            }
        }, new e30() { // from class: l.xkn
            public final void call(Object obj) {
                gln.m6746i1(this.f8506a, greeting, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h1 */
    public static final void m6745h1(Greeting greeting, Message message) {
        if (CoreModule.N().so()) {
            CoreModule.N().Gm().add(greeting.f63id);
        }
        CoreModule.c.r0.J6();
    }

    /* JADX INFO: renamed from: i1 */
    public static final void m6746i1(gln glnVar, Greeting greeting, Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            int i = ((TantanException.Client.CoreService) th).code;
            if (i == 40042 || i == 40044 || i == 40045) {
                Act act = glnVar.act();
                if (act != null) {
                    lsi0.y(act.getString(R$string.f494P3));
                }
            } else if (i == 40046) {
                CoreModule.c.f0.ap(greeting.otherUser);
            }
        }
        if (th instanceof TantanException.Client.TantanForbidden) {
            TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
            if (!x19.m10619e(tantanForbidden)) {
                x19.m10618d(tantanForbidden);
                return;
            }
            Act act2 = glnVar.act();
            if (act2 != null) {
                o6j0.m8408h("e_intl_message_im_intercept", act2.pageId(), new o6j0.C3390a[0]);
                lsi0.y(act2.getString(R$string.f550W3));
            }
        }
    }

    /* JADX INFO: renamed from: j1 */
    private final void m6747j1() {
        duringCreated(CoreModule.c.r0.A6(m6177g0().f63id, m6177g0().readUntil)).subscribe(mkd0.H(new e30() { // from class: l.ukn
            public final void call(Object obj) {
                gln.m6734Q0((Greeting) obj);
            }
        }, new e30() { // from class: l.vkn
            public final void call(Object obj) {
                gln.m6758t0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k0 */
    public static Boolean m6748k0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: k1 */
    private final void m6749k1() {
        CoreModule.c.r0.N6(NotificationStatus.get("pending"), NotificationStatus.get(NotificationStatus.removed), m6177g0().f63id);
        CoreModule.c.r0.N6(NotificationStatus.get(NotificationStatus.ongoing), NotificationStatus.get(NotificationStatus.removed), m6177g0().f63id);
        for (Integer num : CoreModule.P().i().t3()) {
            num.getClass();
            if (r07.v(num.intValue()) && TextUtils.equals(String.valueOf(num.intValue() - 10000), m6177g0().f63id)) {
                CoreModule.P().i().c3(num.intValue());
                return;
            }
        }
    }

    /* JADX INFO: renamed from: l0 */
    public static void m6750l0(Throwable th) {
    }

    /* JADX INFO: renamed from: m0 */
    public static void m6751m0(gln glnVar, Greeting greeting) {
        greeting.getClass();
        if (TextUtils.equals(greeting.f63id, glnVar.m6177g0().f63id)) {
            glnVar.m6178h0().onNext(greeting);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public static void m6752n0(gln glnVar, com.p1.mobile.android.app.c cVar) {
        cVar.getClass();
        if (cVar == com.p1.mobile.android.app.c.m) {
            ((xln) ((jq2) glnVar).viewModel).m10906F();
        }
    }

    /* JADX INFO: renamed from: o0 */
    public static c m6753o0(gln glnVar, String str, List list) {
        long jLongValue;
        Message message;
        list.getClass();
        double d = 0.0d;
        if (!vwb.J(list) && (message = (Message) list.get(0)) != null) {
            d = message.createdTime;
        }
        glnVar.greetingCreatedTime = d;
        try {
            Long lValueOf = Long.valueOf(glnVar.m6177g0().clearedUntil);
            lValueOf.getClass();
            jLongValue = lValueOf.longValue();
        } catch (NumberFormatException unused) {
            jLongValue = 0;
        }
        return CoreModule.c.r0.A5(str, glnVar.greetingCreatedTime, jLongValue, false, glnVar.getParam().getHasCreatedGreeting());
    }

    /* JADX INFO: renamed from: q0 */
    public static void m6755q0(gln glnVar, Bundle bundle) {
        ((xln) ((jq2) glnVar).viewModel).m10932r();
    }

    /* JADX INFO: renamed from: r0 */
    public static void m6756r0(gln glnVar) {
        ((xln) ((jq2) glnVar).viewModel).m10904C();
    }

    /* JADX INFO: renamed from: s0 */
    public static Boolean m6757s0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: t0 */
    public static void m6758t0(Throwable th) {
        yij0.D(th);
    }

    /* JADX INFO: renamed from: x0 */
    public static void m6760x0(Throwable th) {
    }

    /* JADX INFO: renamed from: y0 */
    public static void m6761y0(gln glnVar, com.p1.mobile.android.app.c cVar) {
        cVar.getClass();
        if (cVar == com.p1.mobile.android.app.c.i) {
            if (!glnVar.isFirstResume) {
                ((xln) ((jq2) glnVar).viewModel).m10924X();
            }
            glnVar.isFirstResume = false;
        }
    }

    @Override // p003l.dmn
    /* JADX INFO: renamed from: a0 */
    public void mo6175a0() {
        super.mo6175a0();
        creates(new e30() { // from class: l.dkn
            public final void call(Object obj) {
                gln.m6755q0(this.f4179a, (Bundle) obj);
            }
        }, new d30() { // from class: l.okn
            public final void call() {
                gln.m6756r0(this.f6674a);
            }
        });
        m6738V0();
        lifecycle().subscribe(mkd0.H(new e30() { // from class: l.ykn
            public final void call(Object obj) {
                gln.m6761y0(this.f9081a, (com.p1.mobile.android.app.c) obj);
            }
        }, new e30() { // from class: l.zkn
            public final void call(Object obj) {
                gln.m6729J0((Throwable) obj);
            }
        }));
        String str = m6177g0().f63id;
        str.getClass();
        m6739W0(str);
        c cVarDuringCreated = duringCreated(CoreModule.c.e0.Ka(m6177g0().otherUser));
        final Function1 function1 = new Function1() { // from class: l.aln
            public final Object invoke(Object obj) {
                return gln.m6726G0((User) obj);
            }
        };
        cVarDuringCreated.filter(new w9j() { // from class: l.bln
            public final Object call(Object obj) {
                return gln.m6757s0(function1, obj);
            }
        }).take(1).subscribe(mkd0.H(new e30() { // from class: l.cln
            public final void call(Object obj) {
                gln.m6721A0(this.f4049a, (User) obj);
            }
        }, new e30() { // from class: l.dln
            public final void call(Object obj) {
                gln.m6735R0((Throwable) obj);
            }
        }));
        m6749k1();
        m6737U0();
    }

    /* JADX INFO: renamed from: c1 */
    public final boolean m6763c1() {
        int i = Build.VERSION.SDK_INT;
        if (i != 26 && i != 28) {
            return false;
        }
        String str = Build.BRAND;
        return d.x("HONOR", str, true) || d.x("HUAWEI", str, true);
    }

    /* JADX INFO: renamed from: d1 */
    public final boolean m6764d1(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode != 16) {
            return false;
        }
        if (resultCode != -1) {
            return true;
        }
        Act act = act();
        if (act != null) {
            act.finish();
        }
        Act act2 = act();
        if (act2 == null) {
            return true;
        }
        act2.overridePendingTransition(0, 0);
        return true;
    }

    @Override // p003l.dmn
    @Nullable
    /* JADX INFO: renamed from: f0 */
    public String mo6176f0() {
        return "";
    }

    /* JADX INFO: renamed from: g1 */
    public final void m6766g1(@NotNull Message message) {
        String str;
        message.getClass();
        ((xln) ((jq2) this).viewModel).getAct().m3515a2(false);
        CoreModule.l.i().h4(((xln) ((jq2) this).viewModel).getAct(), "", "p_kankan_chat_popup", getFrom(), m6177g0().otherUser);
        User userP9 = CoreModule.c.e0.p9();
        if (NullChecker.a(userP9) && (userP9.isJailed() || userP9.isNameFake())) {
            return;
        }
        if (TextUtils.isEmpty(m6177g0().moment.id)) {
            str = "";
        } else {
            if (TextUtils.isEmpty(this.momentOwnerId)) {
                this.momentOwnerId = !TextUtils.equals(m6177g0().actorUserId, CoreModule.H().userId()) ? CoreModule.H().userId() : m6177g0().otherUser;
            }
            str = "?source=moment&moment_id=" + m6177g0().moment.id + "&moment_owner_id=" + this.momentOwnerId;
        }
        m6744f1(m6177g0(), message, str);
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: b1 */
    public static final void m6743b1(Throwable th) {
    }

    /* JADX INFO: renamed from: e1 */
    public final void m6765e1(@Nullable String str, @Nullable String uid) {
    }
}
