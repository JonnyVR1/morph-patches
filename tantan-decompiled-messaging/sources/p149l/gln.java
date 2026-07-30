package p149l;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.common.collect.Lists;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.Greeting;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.NotificationStatus;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.intl.greet.IntlGreetingParam;
import com.p046p1.mobile.putong.core.p053ui.intl.greet.message.IntlItemBreakIceMessage;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.data.User;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.C15386d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m87231d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0006\n\u0002\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u000bJ\u000f\u0010\u0017\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0017\u0010\u000bJ)\u0010\u001c\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001e\u0010\u000bJ\u000f\u0010\u001f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001f\u0010\u000bJ\r\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0012¢\u0006\u0004\b#\u0010$J!\u0010'\u001a\u00020\t2\b\u0010%\u001a\u0004\u0018\u00010\r2\b\u0010&\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b'\u0010(J'\u0010.\u001a\u00020 2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020)2\b\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b.\u0010/R$\u00105\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u0010\u0010R\u0016\u00108\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R$\u0010?\u001a\u0002092\u0006\u0010:\u001a\u0002098\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0016\u0010A\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u00107R\u0016\u0010C\u001a\u0004\u0018\u00010\r8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bB\u00103¨\u0006D"}, m87232d2 = {"Ll/gln;", "Ll/dmn;", "Ll/xln;", "Ll/mcr;", "lifecycleProvider", "Lcom/p1/mobile/putong/core/ui/intl/greet/IntlGreetingParam;", "param", "<init>", "(Ll/mcr;Lcom/p1/mobile/putong/core/ui/intl/greet/IntlGreetingParam;)V", "", "U0", "()V", "V0", "", "greetingId", "W0", "(Ljava/lang/String;)V", "", "Lcom/p1/mobile/putong/core/data/Message;", "loaded", "S0", "(Ljava/util/List;)Ljava/util/List;", "j1", "k1", "Lcom/p1/mobile/putong/core/data/Greeting;", "greeting", "message", "extraParams", "f1", "(Lcom/p1/mobile/putong/core/data/Greeting;Lcom/p1/mobile/putong/core/data/Message;Ljava/lang/String;)V", "destroy", "a0", "", "c1", "()Z", "g1", "(Lcom/p1/mobile/putong/core/data/Message;)V", "str", Oauth2AccessToken.KEY_UID, "e1", "(Ljava/lang/String;Ljava/lang/String;)V", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "d1", "(IILandroid/content/Intent;)Z", "g", "Ljava/lang/String;", "getMomentOwnerId", "()Ljava/lang/String;", "setMomentOwnerId", "momentOwnerId", "h", "Z", "isFirstResume", "", "value", RXScreenCaptureService.KEY_INDEX, "D", "getGreetingCreatedTime", "()D", "greetingCreatedTime", "j", "hadMessage", "f0", "channelByFrom", "message_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
    public static void m126824A0(gln glnVar, User user) {
        user.getClass();
        ((xln) glnVar.viewModel).m209951h0(user);
    }

    /* JADX INFO: renamed from: C0 */
    public static Boolean m126825C0(Conversation conversation) {
        conversation.getClass();
        return Boolean.valueOf(!CoreModule.f17545c.f19642f0.m33145uh(conversation.f56011id));
    }

    /* JADX INFO: renamed from: D0 */
    public static void m126826D0(final gln glnVar, q860 q860Var) {
        q860Var.getClass();
        List<T> list = q860Var.f153135a;
        list.getClass();
        List<Message> listM126839S0 = glnVar.m126839S0(list);
        List<Message> list2 = listM126839S0;
        if (!vwb.m200296J(list2) && TextUtils.equals(listM126839S0.get(0).owner, glnVar.m112495g0().otherUser) && !TextUtils.equals(glnVar.m112495g0().readUntil, listM126839S0.get(0).f56011id)) {
            glnVar.m126850j1();
        }
        if (!vwb.m200296J(list2) && NullChecker.m81303a(listM126839S0.get(0)) && listM126839S0.get(0).localCreatedTime - System.nanoTime() < 1000000000) {
            ((xln) glnVar.viewModel).m209947b0();
        }
        if (vwb.m200296J(list2) && !glnVar.hadMessage) {
            C22306c c22306cDuringCreated = glnVar.duringCreated(CoreModule.f17545c.f19639e0.m169410Ka(glnVar.m112495g0().otherUser));
            final Function1 function1 = new Function1() { // from class: l.pkn
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return gln.m126843X0((User) obj);
                }
            };
            c22306cDuringCreated.filter(new w9j() { // from class: l.qkn
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return gln.m126844Y0(function1, obj);
                }
            }).take(1).subscribe(mkd0.m154956H(new e30() { // from class: l.rkn
                @Override // p149l.e30
                public final void call(Object obj) {
                    gln.m126845a1(this.f159874a, (User) obj);
                }
            }, new e30() { // from class: l.skn
                @Override // p149l.e30
                public final void call(Object obj) {
                    gln.m126846b1((Throwable) obj);
                }
            }));
            return;
        }
        glnVar.hadMessage = true;
        IntlItemBreakIceMessage intlItemBreakIceMessageM209930I = ((xln) glnVar.viewModel).getItemBreakIceMessage();
        if (intlItemBreakIceMessageM209930I != null && intlItemBreakIceMessageM209930I.getVisibility() == 0) {
            xdl0.m208344M(intlItemBreakIceMessageM209930I, false);
        }
        xln xlnVar = (xln) glnVar.viewModel;
        List<? extends Message> listM15930q = Lists.m15930q(listM126839S0);
        listM15930q.getClass();
        xlnVar.m209950f0(listM15930q);
    }

    /* JADX INFO: renamed from: G0 */
    public static Boolean m126829G0(User user) {
        return Boolean.valueOf(NullChecker.m81303a(user));
    }

    /* JADX INFO: renamed from: H0 */
    public static void m126830H0(Throwable th) {
    }

    /* JADX INFO: renamed from: I0 */
    public static void m126831I0(Throwable th) {
    }

    /* JADX INFO: renamed from: J0 */
    public static void m126832J0(Throwable th) {
    }

    /* JADX INFO: renamed from: L0 */
    public static C22306c m126833L0(Function1 function1, Object obj) {
        return (C22306c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: N0 */
    public static void m126834N0(gln glnVar, Conversation conversation) {
        conversation.getClass();
        CoreModule.f17545c.f19678r0.m34092J6();
        Act act = glnVar.act();
        if (act != null) {
            act.startActivity(MessagesAct.m48943i2(glnVar.act(), conversation.f56011id, false, false));
        }
        Act act2 = glnVar.act();
        if (act2 != null) {
            act2.lambda$debugItems$19();
        }
    }

    /* JADX INFO: renamed from: P0 */
    public static Boolean m126836P0(Message message) {
        message.getClass();
        boolean z = false;
        if (NullChecker.m81303a(message)) {
            String str = message.f56011id;
            str.getClass();
            if (!C15386d.m93483J(str, "fake_id_", false, 2, null)) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: Q0 */
    public static void m126837Q0(Greeting greeting) {
        CoreModule.f17545c.f19678r0.f20033n0.onNext(greeting);
    }

    /* JADX INFO: renamed from: R0 */
    public static void m126838R0(Throwable th) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S0 */
    private final List<Message> m126839S0(List<? extends Message> loaded) {
        List<? extends Message> list = loaded;
        return (vwb.m200296J(list) || !vwb.m200337m(list, new w9j() { // from class: l.tkn
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return gln.m126836P0((Message) obj);
            }
        })) ? new ArrayList() : loaded;
    }

    /* JADX INFO: renamed from: U0 */
    private final void m126840U0() {
        duringCreated(CoreModule.f17545c.f19678r0.f20035p0).subscribe(mkd0.m154956H(new e30() { // from class: l.mkn
            @Override // p149l.e30
            public final void call(Object obj) {
                gln.m126854m0(this.f134362a, (Greeting) obj);
            }
        }, new e30() { // from class: l.nkn
            @Override // p149l.e30
            public final void call(Object obj) {
                gln.m126831I0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V0 */
    private final void m126841V0() {
        if (m126866c1()) {
            lifecycle().subscribe(mkd0.m154956H(new e30() { // from class: l.kkn
                @Override // p149l.e30
                public final void call(Object obj) {
                    gln.m126855n0(this.f123577a, (C4319c) obj);
                }
            }, new e30() { // from class: l.lkn
                @Override // p149l.e30
                public final void call(Object obj) {
                    gln.m126863x0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: W0 */
    private final void m126842W0(final String greetingId) {
        if (getParam().getHasCreatedGreeting()) {
            CoreModule.f17545c.f19678r0.m34082E6(greetingId);
        }
        C22306c c22306cCompose = C22306c.just(CoreModule.f17553k.f91940c.m206057O(greetingId, m112495g0().clearedUntil).m165617j()).compose(mkd0.m154965Q());
        final Function1 function1 = new Function1() { // from class: l.eln
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return gln.m126856o0(this.f92129a, greetingId, (List) obj);
            }
        };
        C22306c<q860<Message>> c22306cFlatMap = c22306cCompose.flatMap(new w9j() { // from class: l.fln
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return gln.m126833L0(function1, obj);
            }
        });
        if (CoreModule.f17545c.f19642f0.m33145uh(greetingId)) {
            c22306cFlatMap = CoreModule.f17545c.f19642f0.m32829Un(greetingId, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        }
        duringCreated(c22306cFlatMap.observeOn(jo0.m142408a())).subscribe(mkd0.m154956H(new e30() { // from class: l.ekn
            @Override // p149l.e30
            public final void call(Object obj) {
                gln.m126826D0(this.f92000a, (q860) obj);
            }
        }, new e30() { // from class: l.fkn
            @Override // p149l.e30
            public final void call(Object obj) {
                gln.m126853l0((Throwable) obj);
            }
        }));
        C22306c<Conversation> c22306cM32737Ne = CoreModule.f17545c.f19642f0.m32737Ne(greetingId);
        final Function1 function2 = new Function1() { // from class: l.gkn
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return gln.m126825C0((Conversation) obj);
            }
        };
        duringCreated(c22306cM32737Ne.filter(new w9j() { // from class: l.hkn
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return gln.m126851k0(function2, obj);
            }
        })).take(1).subscribe(mkd0.m154956H(new e30() { // from class: l.ikn
            @Override // p149l.e30
            public final void call(Object obj) {
                gln.m126834N0(this.f113692a, (Conversation) obj);
            }
        }, new e30() { // from class: l.jkn
            @Override // p149l.e30
            public final void call(Object obj) {
                gln.m126830H0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X0 */
    public static final Boolean m126843X0(User user) {
        return Boolean.valueOf(NullChecker.m81303a(user));
    }

    /* JADX INFO: renamed from: Y0 */
    public static final Boolean m126844Y0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: a1 */
    public static final void m126845a1(gln glnVar, User user) {
        user.getClass();
        ((xln) glnVar.viewModel).m209946Y(user);
    }

    /* JADX INFO: renamed from: f1 */
    private final void m126847f1(final Greeting greeting, Message message, String extraParams) {
        Act act;
        C22306c c22306cDuringCreated;
        if (greeting == null || (act = act()) == null || (c22306cDuringCreated = act.duringCreated(CoreModule.f17545c.f19678r0.m34149u6(greeting.f20401id, greeting.channel, message, extraParams, null))) == null) {
            return;
        }
        c22306cDuringCreated.subscribe(mkd0.m154956H(new e30() { // from class: l.wkn
            @Override // p149l.e30
            public final void call(Object obj) {
                gln.m126848h1(greeting, (Message) obj);
            }
        }, new e30() { // from class: l.xkn
            @Override // p149l.e30
            public final void call(Object obj) {
                gln.m126849i1(this.f193325a, greeting, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h1 */
    public static final void m126848h1(Greeting greeting, Message message) {
        if (CoreModule.m29934N().mo60389so()) {
            CoreModule.m29934N().mo60278Gm().add(greeting.f20401id);
        }
        CoreModule.f17545c.f19678r0.m34092J6();
    }

    /* JADX INFO: renamed from: i1 */
    public static final void m126849i1(gln glnVar, Greeting greeting, Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            int i = ((TantanException.Client.CoreService) th).code;
            if (i == 40042 || i == 40044 || i == 40045) {
                Act act = glnVar.act();
                if (act != null) {
                    lsi0.m151595y(act.getString(R$string.f20832P3));
                }
            } else if (i == 40046) {
                CoreModule.f17545c.f19642f0.m32902ap(greeting.otherUser);
            }
        }
        if (th instanceof TantanException.Client.TantanForbidden) {
            TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
            if (!x19.m206695e(tantanForbidden)) {
                x19.m206694d(tantanForbidden);
                return;
            }
            Act act2 = glnVar.act();
            if (act2 != null) {
                o6j0.m162864h("e_intl_message_im_intercept", act2.pageId(), new o6j0.C18854a[0]);
                lsi0.m151595y(act2.getString(R$string.f20888W3));
            }
        }
    }

    /* JADX INFO: renamed from: j1 */
    private final void m126850j1() {
        duringCreated(CoreModule.f17545c.f19678r0.m34074A6(m112495g0().f20401id, m112495g0().readUntil)).subscribe(mkd0.m154956H(new e30() { // from class: l.ukn
            @Override // p149l.e30
            public final void call(Object obj) {
                gln.m126837Q0((Greeting) obj);
            }
        }, new e30() { // from class: l.vkn
            @Override // p149l.e30
            public final void call(Object obj) {
                gln.m126861t0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k0 */
    public static Boolean m126851k0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: k1 */
    private final void m126852k1() {
        CoreModule.f17545c.f19678r0.m34100N6(NotificationStatus.get("pending"), NotificationStatus.get("removed"), m112495g0().f20401id);
        CoreModule.f17545c.f19678r0.m34100N6(NotificationStatus.get("ongoing"), NotificationStatus.get("removed"), m112495g0().f20401id);
        for (Integer num : CoreModule.m29935P().m94658i().mo158448t3()) {
            num.getClass();
            if (r07.m177357v(num.intValue()) && TextUtils.equals(String.valueOf(num.intValue() + ShareConstants.ERROR_LOAD_GET_INTENT_FAIL), m112495g0().f20401id)) {
                CoreModule.m29935P().m94658i().mo158357c3(num.intValue());
                return;
            }
        }
    }

    /* JADX INFO: renamed from: l0 */
    public static void m126853l0(Throwable th) {
    }

    /* JADX INFO: renamed from: m0 */
    public static void m126854m0(gln glnVar, Greeting greeting) {
        greeting.getClass();
        if (TextUtils.equals(greeting.f20401id, glnVar.m112495g0().f20401id)) {
            glnVar.m112496h0().onNext(greeting);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public static void m126855n0(gln glnVar, C4319c c4319c) {
        c4319c.getClass();
        if (c4319c == C4319c.f15552m) {
            ((xln) glnVar.viewModel).m209927F();
        }
    }

    /* JADX INFO: renamed from: o0 */
    public static C22306c m126856o0(gln glnVar, String str, List list) {
        long jLongValue;
        Message message;
        list.getClass();
        boolean zM200296J = vwb.m200296J(list);
        double d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        if (!zM200296J && (message = (Message) list.get(0)) != null) {
            d = message.createdTime;
        }
        glnVar.greetingCreatedTime = d;
        try {
            Long lValueOf = Long.valueOf(glnVar.m112495g0().clearedUntil);
            lValueOf.getClass();
            jLongValue = lValueOf.longValue();
        } catch (NumberFormatException unused) {
            jLongValue = 0;
        }
        return CoreModule.f17545c.f19678r0.m34073A5(str, glnVar.greetingCreatedTime, jLongValue, false, glnVar.getParam().getHasCreatedGreeting());
    }

    /* JADX INFO: renamed from: q0 */
    public static void m126858q0(gln glnVar, Bundle bundle) {
        ((xln) glnVar.viewModel).m209952r();
    }

    /* JADX INFO: renamed from: r0 */
    public static void m126859r0(gln glnVar) {
        ((xln) glnVar.viewModel).m209926C();
    }

    /* JADX INFO: renamed from: s0 */
    public static Boolean m126860s0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: t0 */
    public static void m126861t0(Throwable th) {
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: x0 */
    public static void m126863x0(Throwable th) {
    }

    /* JADX INFO: renamed from: y0 */
    public static void m126864y0(gln glnVar, C4319c c4319c) {
        c4319c.getClass();
        if (c4319c == C4319c.f15548i) {
            if (!glnVar.isFirstResume) {
                ((xln) glnVar.viewModel).m209945X();
            }
            glnVar.isFirstResume = false;
        }
    }

    @Override // p149l.dmn, p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.dkn
            @Override // p149l.e30
            public final void call(Object obj) {
                gln.m126858q0(this.f86685a, (Bundle) obj);
            }
        }, new d30() { // from class: l.okn
            @Override // p149l.d30
            public final void call() {
                gln.m126859r0(this.f144453a);
            }
        });
        m126841V0();
        lifecycle().subscribe(mkd0.m154956H(new e30() { // from class: l.ykn
            @Override // p149l.e30
            public final void call(Object obj) {
                gln.m126864y0(this.f198780a, (C4319c) obj);
            }
        }, new e30() { // from class: l.zkn
            @Override // p149l.e30
            public final void call(Object obj) {
                gln.m126832J0((Throwable) obj);
            }
        }));
        String str = m112495g0().f20401id;
        str.getClass();
        m126842W0(str);
        C22306c<T> c22306cDuringCreated = duringCreated(CoreModule.f17545c.f19639e0.m169410Ka(m112495g0().otherUser));
        final Function1 function1 = new Function1() { // from class: l.aln
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return gln.m126829G0((User) obj);
            }
        };
        c22306cDuringCreated.filter(new w9j() { // from class: l.bln
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return gln.m126860s0(function1, obj);
            }
        }).take(1).subscribe(mkd0.m154956H(new e30() { // from class: l.cln
            @Override // p149l.e30
            public final void call(Object obj) {
                gln.m126824A0(this.f81450a, (User) obj);
            }
        }, new e30() { // from class: l.dln
            @Override // p149l.e30
            public final void call(Object obj) {
                gln.m126838R0((Throwable) obj);
            }
        }));
        m126852k1();
        m126840U0();
    }

    /* JADX INFO: renamed from: c1 */
    public final boolean m126866c1() {
        int i = Build.VERSION.SDK_INT;
        if (i != 26 && i != 28) {
            return false;
        }
        String str = Build.BRAND;
        return C15386d.m93490x("HONOR", str, true) || C15386d.m93490x("HUAWEI", str, true);
    }

    /* JADX INFO: renamed from: d1 */
    public final boolean m126867d1(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode != 16) {
            return false;
        }
        if (resultCode != -1) {
            return true;
        }
        Act act = act();
        if (act != null) {
            act.lambda$debugItems$19();
        }
        Act act2 = act();
        if (act2 == null) {
            return true;
        }
        act2.overridePendingTransition(0, 0);
        return true;
    }

    @Override // p149l.dmn
    @Nullable
    /* JADX INFO: renamed from: f0 */
    public String mo112494f0() {
        return "";
    }

    /* JADX INFO: renamed from: g1 */
    public final void m126869g1(@NotNull Message message) {
        String str;
        message.getClass();
        ((xln) this.viewModel).getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().m46150a2(false);
        CoreModule.f17554l.m94658i().mo158388h4(((xln) this.viewModel).getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), "", "p_kankan_chat_popup", getFrom(), m112495g0().otherUser);
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (NullChecker.m81303a(userM169527p9) && (userM169527p9.isJailed() || userM169527p9.isNameFake())) {
            return;
        }
        if (TextUtils.isEmpty(m112495g0().moment.f38759id)) {
            str = "";
        } else {
            if (TextUtils.isEmpty(this.momentOwnerId)) {
                this.momentOwnerId = !TextUtils.equals(m112495g0().actorUserId, CoreModule.m29931H().userId()) ? CoreModule.m29931H().userId() : m112495g0().otherUser;
            }
            str = "?source=moment&moment_id=" + m112495g0().moment.f38759id + "&moment_owner_id=" + this.momentOwnerId;
        }
        m126847f1(m112495g0(), message, str);
    }

    @Override // p149l.q0m
    public void destroy() {
    }

    /* JADX INFO: renamed from: b1 */
    public static final void m126846b1(Throwable th) {
    }

    /* JADX INFO: renamed from: e1 */
    public final void m126868e1(@Nullable String str, @Nullable String uid) {
    }
}
