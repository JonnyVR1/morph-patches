package p153l;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.common.collect.Lists;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.Greeting;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.NotificationStatus;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.intl.greet.IntlGreetingParam;
import com.p051p1.mobile.putong.core.p058ui.intl.greet.message.IntlItemBreakIceMessage;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.data.User;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.C15493d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0006\n\u0002\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u000bJ\u000f\u0010\u0017\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0017\u0010\u000bJ)\u0010\u001c\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001e\u0010\u000bJ\u000f\u0010\u001f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001f\u0010\u000bJ\r\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0012¢\u0006\u0004\b#\u0010$J!\u0010'\u001a\u00020\t2\b\u0010%\u001a\u0004\u0018\u00010\r2\b\u0010&\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b'\u0010(J'\u0010.\u001a\u00020 2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020)2\b\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b.\u0010/R$\u00105\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u0010\u0010R\u0016\u00108\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R$\u0010?\u001a\u0002092\u0006\u0010:\u001a\u0002098\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0016\u0010A\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u00107R\u0016\u0010C\u001a\u0004\u0018\u00010\r8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bB\u00103¨\u0006D"}, m88121d2 = {"Ll/gnn;", "Ll/don;", "Ll/xnn;", "Ll/ner;", "lifecycleProvider", "Lcom/p1/mobile/putong/core/ui/intl/greet/IntlGreetingParam;", "param", "<init>", "(Ll/ner;Lcom/p1/mobile/putong/core/ui/intl/greet/IntlGreetingParam;)V", "", "U0", "()V", "V0", "", "greetingId", "W0", "(Ljava/lang/String;)V", "", "Lcom/p1/mobile/putong/core/data/Message;", "loaded", "S0", "(Ljava/util/List;)Ljava/util/List;", "j1", "k1", "Lcom/p1/mobile/putong/core/data/Greeting;", "greeting", "message", "extraParams", "f1", "(Lcom/p1/mobile/putong/core/data/Greeting;Lcom/p1/mobile/putong/core/data/Message;Ljava/lang/String;)V", "destroy", "a0", "", "c1", "()Z", "g1", "(Lcom/p1/mobile/putong/core/data/Message;)V", "str", Oauth2AccessToken.KEY_UID, "e1", "(Ljava/lang/String;Ljava/lang/String;)V", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "d1", "(IILandroid/content/Intent;)Z", "g", "Ljava/lang/String;", "getMomentOwnerId", "()Ljava/lang/String;", "setMomentOwnerId", "momentOwnerId", "h", "Z", "isFirstResume", "", "value", RXScreenCaptureService.KEY_INDEX, "D", "getGreetingCreatedTime", "()D", "greetingCreatedTime", "j", "hadMessage", "f0", "channelByFrom", "message_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class gnn extends don<xnn> {

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
    public gnn(@Nullable ner nerVar, @NotNull IntlGreetingParam intlGreetingParam) {
        super(nerVar, intlGreetingParam);
        intlGreetingParam.getClass();
        this.isFirstResume = true;
    }

    /* JADX INFO: renamed from: A0 */
    public static void m130853A0(gnn gnnVar, User user) {
        user.getClass();
        ((xnn) gnnVar.viewModel).m212278h0(user);
    }

    /* JADX INFO: renamed from: C0 */
    public static Boolean m130854C0(Conversation conversation) {
        conversation.getClass();
        return Boolean.valueOf(!CoreModule.f18264c.f20384f0.m34148uh(conversation.f56859id));
    }

    /* JADX INFO: renamed from: D0 */
    public static void m130855D0(final gnn gnnVar, vg60 vg60Var) {
        vg60Var.getClass();
        List<T> list = vg60Var.f184001a;
        list.getClass();
        List<Message> listM130868S0 = gnnVar.m130868S0(list);
        List<Message> list2 = listM130868S0;
        if (!jyb.m147479J(list2) && TextUtils.equals(listM130868S0.get(0).owner, gnnVar.m117335g0().otherUser) && !TextUtils.equals(gnnVar.m117335g0().readUntil, listM130868S0.get(0).f56859id)) {
            gnnVar.m130879j1();
        }
        if (!jyb.m147479J(list2) && NullChecker.m82486a(listM130868S0.get(0)) && listM130868S0.get(0).localCreatedTime - System.nanoTime() < 1000000000) {
            ((xnn) gnnVar.viewModel).m212274b0();
        }
        if (jyb.m147479J(list2) && !gnnVar.hadMessage) {
            C22421c c22421cDuringCreated = gnnVar.duringCreated(CoreModule.f18264c.f20381e0.m116483Ka(gnnVar.m117335g0().otherUser));
            final Function1 function1 = new Function1() { // from class: l.pmn
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return gnn.m130872X0((User) obj);
                }
            };
            c22421cDuringCreated.filter(new qcj() { // from class: l.qmn
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return gnn.m130873Y0(function1, obj);
                }
            }).take(1).subscribe(psd0.m173597H(new y20() { // from class: l.rmn
                @Override // p153l.y20
                public final void call(Object obj) {
                    gnn.m130874a1(this.f163892a, (User) obj);
                }
            }, new y20() { // from class: l.smn
                @Override // p153l.y20
                public final void call(Object obj) {
                    gnn.m130875b1((Throwable) obj);
                }
            }));
            return;
        }
        gnnVar.hadMessage = true;
        IntlItemBreakIceMessage intlItemBreakIceMessageM212257I = ((xnn) gnnVar.viewModel).getItemBreakIceMessage();
        if (intlItemBreakIceMessageM212257I != null && intlItemBreakIceMessageM212257I.getVisibility() == 0) {
            bnl0.m105524M(intlItemBreakIceMessageM212257I, false);
        }
        xnn xnnVar = (xnn) gnnVar.viewModel;
        List<? extends Message> listM15984q = Lists.m15984q(listM130868S0);
        listM15984q.getClass();
        xnnVar.m212277f0(listM15984q);
    }

    /* JADX INFO: renamed from: G0 */
    public static Boolean m130858G0(User user) {
        return Boolean.valueOf(NullChecker.m82486a(user));
    }

    /* JADX INFO: renamed from: H0 */
    public static void m130859H0(Throwable th) {
    }

    /* JADX INFO: renamed from: I0 */
    public static void m130860I0(Throwable th) {
    }

    /* JADX INFO: renamed from: J0 */
    public static void m130861J0(Throwable th) {
    }

    /* JADX INFO: renamed from: L0 */
    public static C22421c m130862L0(Function1 function1, Object obj) {
        return (C22421c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: N0 */
    public static void m130863N0(gnn gnnVar, Conversation conversation) {
        conversation.getClass();
        CoreModule.f18264c.f20420r0.m35095J6();
        Act act = gnnVar.act();
        if (act != null) {
            act.startActivity(MessagesAct.m50126k2(gnnVar.act(), conversation.f56859id, false, false));
        }
        Act act2 = gnnVar.act();
        if (act2 != null) {
            act2.lambda$debugItems$19();
        }
    }

    /* JADX INFO: renamed from: P0 */
    public static Boolean m130865P0(Message message) {
        message.getClass();
        boolean z = false;
        if (NullChecker.m82486a(message)) {
            String str = message.f56859id;
            str.getClass();
            if (!C15493d.m94374J(str, "fake_id_", false, 2, null)) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: Q0 */
    public static void m130866Q0(Greeting greeting) {
        CoreModule.f18264c.f20420r0.f20775n0.onNext(greeting);
    }

    /* JADX INFO: renamed from: R0 */
    public static void m130867R0(Throwable th) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S0 */
    private final List<Message> m130868S0(List<? extends Message> loaded) {
        List<? extends Message> list = loaded;
        return (jyb.m147479J(list) || !jyb.m147520m(list, new qcj() { // from class: l.tmn
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return gnn.m130865P0((Message) obj);
            }
        })) ? new ArrayList() : loaded;
    }

    /* JADX INFO: renamed from: U0 */
    private final void m130869U0() {
        duringCreated(CoreModule.f18264c.f20420r0.f20777p0).subscribe(psd0.m173597H(new y20() { // from class: l.mmn
            @Override // p153l.y20
            public final void call(Object obj) {
                gnn.m130883m0(this.f137622a, (Greeting) obj);
            }
        }, new y20() { // from class: l.nmn
            @Override // p153l.y20
            public final void call(Object obj) {
                gnn.m130860I0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V0 */
    private final void m130870V0() {
        if (m130895c1()) {
            lifecycle().subscribe(psd0.m173597H(new y20() { // from class: l.kmn
                @Override // p153l.y20
                public final void call(Object obj) {
                    gnn.m130884n0(this.f127522a, (C4470c) obj);
                }
            }, new y20() { // from class: l.lmn
                @Override // p153l.y20
                public final void call(Object obj) {
                    gnn.m130892x0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: W0 */
    private final void m130871W0(final String greetingId) {
        if (getParam().getHasCreatedGreeting()) {
            CoreModule.f18264c.f20420r0.m35085E6(greetingId);
        }
        C22421c c22421cCompose = C22421c.just(CoreModule.f18272k.f115535c.m189453O(greetingId, m117335g0().clearedUntil).m208674j()).compose(psd0.m173606Q());
        final Function1 function1 = new Function1() { // from class: l.enn
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return gnn.m130885o0(this.f94797a, greetingId, (List) obj);
            }
        };
        C22421c<vg60<Message>> c22421cFlatMap = c22421cCompose.flatMap(new qcj() { // from class: l.fnn
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return gnn.m130862L0(function1, obj);
            }
        });
        if (CoreModule.f18264c.f20384f0.m34148uh(greetingId)) {
            c22421cFlatMap = CoreModule.f18264c.f20384f0.m33832Un(greetingId, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        }
        duringCreated(c22421cFlatMap.observeOn(fo0.m126432a())).subscribe(psd0.m173597H(new y20() { // from class: l.emn
            @Override // p153l.y20
            public final void call(Object obj) {
                gnn.m130855D0(this.f94674a, (vg60) obj);
            }
        }, new y20() { // from class: l.fmn
            @Override // p153l.y20
            public final void call(Object obj) {
                gnn.m130882l0((Throwable) obj);
            }
        }));
        C22421c<Conversation> c22421cM33740Ne = CoreModule.f18264c.f20384f0.m33740Ne(greetingId);
        final Function1 function2 = new Function1() { // from class: l.gmn
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return gnn.m130854C0((Conversation) obj);
            }
        };
        duringCreated(c22421cM33740Ne.filter(new qcj() { // from class: l.hmn
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return gnn.m130880k0(function2, obj);
            }
        })).take(1).subscribe(psd0.m173597H(new y20() { // from class: l.imn
            @Override // p153l.y20
            public final void call(Object obj) {
                gnn.m130863N0(this.f115796a, (Conversation) obj);
            }
        }, new y20() { // from class: l.jmn
            @Override // p153l.y20
            public final void call(Object obj) {
                gnn.m130859H0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X0 */
    public static final Boolean m130872X0(User user) {
        return Boolean.valueOf(NullChecker.m82486a(user));
    }

    /* JADX INFO: renamed from: Y0 */
    public static final Boolean m130873Y0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: a1 */
    public static final void m130874a1(gnn gnnVar, User user) {
        user.getClass();
        ((xnn) gnnVar.viewModel).m212273Y(user);
    }

    /* JADX INFO: renamed from: f1 */
    private final void m130876f1(final Greeting greeting, Message message, String extraParams) {
        Act act;
        C22421c c22421cDuringCreated;
        if (greeting == null || (act = act()) == null || (c22421cDuringCreated = act.duringCreated(CoreModule.f18264c.f20420r0.m35152u6(greeting.f21143id, greeting.channel, message, extraParams, null))) == null) {
            return;
        }
        c22421cDuringCreated.subscribe(psd0.m173597H(new y20() { // from class: l.wmn
            @Override // p153l.y20
            public final void call(Object obj) {
                gnn.m130877h1(greeting, (Message) obj);
            }
        }, new y20() { // from class: l.xmn
            @Override // p153l.y20
            public final void call(Object obj) {
                gnn.m130878i1(this.f195105a, greeting, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h1 */
    public static final void m130877h1(Greeting greeting, Message message) {
        if (CoreModule.m30932N().mo61573so()) {
            CoreModule.m30932N().mo61462Gm().add(greeting.f21143id);
        }
        CoreModule.f18264c.f20420r0.m35095J6();
    }

    /* JADX INFO: renamed from: i1 */
    public static final void m130878i1(gnn gnnVar, Greeting greeting, Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            int i = ((TantanException.Client.CoreService) th).code;
            if (i == 40042 || i == 40044 || i == 40045) {
                Act act = gnnVar.act();
                if (act != null) {
                    o1j0.m165651y(act.getString(R$string.f21574P3));
                }
            } else if (i == 40046) {
                CoreModule.f18264c.f20384f0.m33905ap(greeting.otherUser);
            }
        }
        if (th instanceof TantanException.Client.TantanForbidden) {
            TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
            if (!g39.m128719e(tantanForbidden)) {
                g39.m128718d(tantanForbidden);
                return;
            }
            Act act2 = gnnVar.act();
            if (act2 != null) {
                sfj0.m185601h("e_intl_message_im_intercept", act2.pageId(), new sfj0.C20032a[0]);
                o1j0.m165651y(act2.getString(R$string.f21630W3));
            }
        }
    }

    /* JADX INFO: renamed from: j1 */
    private final void m130879j1() {
        duringCreated(CoreModule.f18264c.f20420r0.m35077A6(m117335g0().f21143id, m117335g0().readUntil)).subscribe(psd0.m173597H(new y20() { // from class: l.umn
            @Override // p153l.y20
            public final void call(Object obj) {
                gnn.m130866Q0((Greeting) obj);
            }
        }, new y20() { // from class: l.vmn
            @Override // p153l.y20
            public final void call(Object obj) {
                gnn.m130890t0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k0 */
    public static Boolean m130880k0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: k1 */
    private final void m130881k1() {
        CoreModule.f18264c.f20420r0.m35103N6(NotificationStatus.get("pending"), NotificationStatus.get("removed"), m117335g0().f21143id);
        CoreModule.f18264c.f20420r0.m35103N6(NotificationStatus.get("ongoing"), NotificationStatus.get("removed"), m117335g0().f21143id);
        for (Integer num : CoreModule.m30933P().m143412i().mo180540t3()) {
            num.getClass();
            if (u17.m193926v(num.intValue()) && TextUtils.equals(String.valueOf(num.intValue() + ShareConstants.ERROR_LOAD_GET_INTENT_FAIL), m117335g0().f21143id)) {
                CoreModule.m30933P().m143412i().mo180449c3(num.intValue());
                return;
            }
        }
    }

    /* JADX INFO: renamed from: l0 */
    public static void m130882l0(Throwable th) {
    }

    /* JADX INFO: renamed from: m0 */
    public static void m130883m0(gnn gnnVar, Greeting greeting) {
        greeting.getClass();
        if (TextUtils.equals(greeting.f21143id, gnnVar.m117335g0().f21143id)) {
            gnnVar.m117336h0().onNext(greeting);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public static void m130884n0(gnn gnnVar, C4470c c4470c) {
        c4470c.getClass();
        if (c4470c == C4470c.f16271m) {
            ((xnn) gnnVar.viewModel).m212254F();
        }
    }

    /* JADX INFO: renamed from: o0 */
    public static C22421c m130885o0(gnn gnnVar, String str, List list) {
        long jLongValue;
        Message message;
        list.getClass();
        boolean zM147479J = jyb.m147479J(list);
        double d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        if (!zM147479J && (message = (Message) list.get(0)) != null) {
            d = message.createdTime;
        }
        gnnVar.greetingCreatedTime = d;
        try {
            Long lValueOf = Long.valueOf(gnnVar.m117335g0().clearedUntil);
            lValueOf.getClass();
            jLongValue = lValueOf.longValue();
        } catch (NumberFormatException unused) {
            jLongValue = 0;
        }
        return CoreModule.f18264c.f20420r0.m35076A5(str, gnnVar.greetingCreatedTime, jLongValue, false, gnnVar.getParam().getHasCreatedGreeting());
    }

    /* JADX INFO: renamed from: q0 */
    public static void m130887q0(gnn gnnVar, Bundle bundle) {
        ((xnn) gnnVar.viewModel).m212279r();
    }

    /* JADX INFO: renamed from: r0 */
    public static void m130888r0(gnn gnnVar) {
        ((xnn) gnnVar.viewModel).m212253C();
    }

    /* JADX INFO: renamed from: s0 */
    public static Boolean m130889s0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: t0 */
    public static void m130890t0(Throwable th) {
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: x0 */
    public static void m130892x0(Throwable th) {
    }

    /* JADX INFO: renamed from: y0 */
    public static void m130893y0(gnn gnnVar, C4470c c4470c) {
        c4470c.getClass();
        if (c4470c == C4470c.f16267i) {
            if (!gnnVar.isFirstResume) {
                ((xnn) gnnVar.viewModel).m212272X();
            }
            gnnVar.isFirstResume = false;
        }
    }

    @Override // p153l.don, p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.dmn
            @Override // p153l.y20
            public final void call(Object obj) {
                gnn.m130887q0(this.f89713a, (Bundle) obj);
            }
        }, new x20() { // from class: l.omn
            @Override // p153l.x20
            public final void call() {
                gnn.m130888r0(this.f147979a);
            }
        });
        m130870V0();
        lifecycle().subscribe(psd0.m173597H(new y20() { // from class: l.ymn
            @Override // p153l.y20
            public final void call(Object obj) {
                gnn.m130893y0(this.f200683a, (C4470c) obj);
            }
        }, new y20() { // from class: l.zmn
            @Override // p153l.y20
            public final void call(Object obj) {
                gnn.m130861J0((Throwable) obj);
            }
        }));
        String str = m117335g0().f21143id;
        str.getClass();
        m130871W0(str);
        C22421c<T> c22421cDuringCreated = duringCreated(CoreModule.f18264c.f20381e0.m116483Ka(m117335g0().otherUser));
        final Function1 function1 = new Function1() { // from class: l.ann
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return gnn.m130858G0((User) obj);
            }
        };
        c22421cDuringCreated.filter(new qcj() { // from class: l.bnn
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return gnn.m130889s0(function1, obj);
            }
        }).take(1).subscribe(psd0.m173597H(new y20() { // from class: l.cnn
            @Override // p153l.y20
            public final void call(Object obj) {
                gnn.m130853A0(this.f82736a, (User) obj);
            }
        }, new y20() { // from class: l.dnn
            @Override // p153l.y20
            public final void call(Object obj) {
                gnn.m130867R0((Throwable) obj);
            }
        }));
        m130881k1();
        m130869U0();
    }

    /* JADX INFO: renamed from: c1 */
    public final boolean m130895c1() {
        int i = Build.VERSION.SDK_INT;
        if (i != 26 && i != 28) {
            return false;
        }
        String str = Build.BRAND;
        return C15493d.m94381x("HONOR", str, true) || C15493d.m94381x("HUAWEI", str, true);
    }

    /* JADX INFO: renamed from: d1 */
    public final boolean m130896d1(int requestCode, int resultCode, @Nullable Intent data) {
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

    @Override // p153l.don
    @Nullable
    /* JADX INFO: renamed from: f0 */
    public String mo117334f0() {
        return "";
    }

    /* JADX INFO: renamed from: g1 */
    public final void m130898g1(@NotNull Message message) {
        String str;
        message.getClass();
        ((xnn) this.viewModel).getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().m47333b2(false);
        CoreModule.f18273l.m143412i().mo180480h4(((xnn) this.viewModel).getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), "", "p_kankan_chat_popup", getFrom(), m117335g0().otherUser);
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (NullChecker.m82486a(userM116600p9) && (userM116600p9.isJailed() || userM116600p9.isNameFake())) {
            return;
        }
        if (TextUtils.isEmpty(m117335g0().moment.f39607id)) {
            str = "";
        } else {
            if (TextUtils.isEmpty(this.momentOwnerId)) {
                this.momentOwnerId = !TextUtils.equals(m117335g0().actorUserId, CoreModule.m30929H().userId()) ? CoreModule.m30929H().userId() : m117335g0().otherUser;
            }
            str = "?source=moment&moment_id=" + m117335g0().moment.f39607id + "&moment_owner_id=" + this.momentOwnerId;
        }
        m130876f1(m117335g0(), message, str);
    }

    @Override // p153l.k3m
    public void destroy() {
    }

    /* JADX INFO: renamed from: b1 */
    public static final void m130875b1(Throwable th) {
    }

    /* JADX INFO: renamed from: e1 */
    public final void m130897e1(@Nullable String str, @Nullable String uid) {
    }
}
