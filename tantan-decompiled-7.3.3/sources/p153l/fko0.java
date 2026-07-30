package p153l;

import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.data.Meta;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveChatReport;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 72\u00020\u0001:\u0001-B\u0007¢\u0006\u0004\b\u0002\u0010\u0003Jg\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0003J'\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u000b2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJY\u0010\"\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\"\u0010#J!\u0010&\u001a\u00020\u00152\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00152\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00103\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0011\u00106\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00068"}, m88121d2 = {"Ll/fko0;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "isCallUser", "Ll/nsv;", "Lcom/p1/mobile/putong/data/User;", "livingUser", "", "liveId", "roomId", "", "messageId", "isCurrentAnchor", MessageType.feedback, "", "roomType", "liveMode", "", "p", "(Lcom/p1/mobile/android/app/Act;ZLl/nsv;Ljava/lang/String;Ljava/lang/String;JZLjava/lang/String;ILjava/lang/String;)V", "j", "isAnchor", "id", "q", "(Lcom/p1/mobile/android/app/Act;ZLjava/lang/String;)V", BLiveStormDanmakuGiftResourceType.f45292l, "(Ll/nsv;)Ljava/lang/String;", "userId", "type", "fakeId", "k", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJZLjava/lang/String;Ljava/lang/String;I)V", "Lcom/p1/mobile/putong/data/Meta;", "meta", "o", "(Lcom/p1/mobile/putong/data/Meta;Ljava/lang/String;)V", "", "throwable", "n", "(Ljava/lang/Throwable;)V", "Lcom/p1/mobile/android/app/Dialog;", "a", "Lcom/p1/mobile/android/app/Dialog;", OMSTemplateType.dialog, "Ll/kcg0;", "b", "Ll/kcg0;", "subscription", "m", "()Z", "isShowing", "Companion", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class fko0 {

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final List<pf60<Integer, String>> f99544c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final List<pf60<Integer, String>> f99545d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public Dialog dialog;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public kcg0 subscription;

    static {
        ArrayList arrayListM147507f0 = jyb.m147507f0(jyb.m147494Y(13, zrv.f205803e.getString(R$string.f48236mb)), jyb.m147494Y(14, zrv.f205803e.getString(R$string.f48258nb)), jyb.m147494Y(8, zrv.f205803e.getString(R$string.f47499E6)));
        arrayListM147507f0.getClass();
        f99544c = arrayListM147507f0;
        ArrayList arrayListM147507f1 = jyb.m147507f0(jyb.m147494Y(13, zrv.f205803e.getString(R$string.f48236mb)), jyb.m147494Y(14, zrv.f205803e.getString(R$string.f48258nb)));
        arrayListM147507f1.getClass();
        f99545d = arrayListM147507f1;
    }

    /* JADX INFO: renamed from: a */
    public static void m126037a(Throwable th) {
    }

    /* JADX INFO: renamed from: b */
    public static void m126038b(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: c */
    public static void m126039c(fko0 fko0Var, BLiveEnvelope bLiveEnvelope) {
        Dialog dialog = fko0Var.dialog;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static void m126040d(List list, nsv nsvVar, fko0 fko0Var, String str, String str2, long j, boolean z, String str3, int i, Act act, Dialog dialog, View view, int i2, CharSequence charSequence) {
        Integer num = (Integer) ((pf60) list.get(i2)).f152156a;
        if (num == null || num.intValue() != 8) {
            String str4 = nsvVar.m164643h().f56859id;
            str4.getClass();
            F f = ((pf60) list.get(i2)).f152156a;
            f.getClass();
            fko0Var.m126047k(str, str2, str4, ((Number) f).intValue(), j, z, str3, fko0Var.m126048l(nsvVar), i);
            return;
        }
        User user = (User) nsvVar.f143542a;
        if (user != null) {
            String str5 = user.f56859id;
            str5.getClass();
            fko0Var.m126053q(act, z, str5);
        }
    }

    /* JADX INFO: renamed from: e */
    public static Unit m126041e(fko0 fko0Var, String str, BLiveEnvelope bLiveEnvelope) {
        bLiveEnvelope.getClass();
        fko0Var.m126051o(bLiveEnvelope.meta, str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public static void m126042f(fko0 fko0Var, Throwable th) {
        th.getClass();
        fko0Var.m126050n(th);
    }

    /* JADX INFO: renamed from: g */
    public static void m126043g(fko0 fko0Var, DialogInterface dialogInterface) {
        psd0.m173633z(fko0Var.subscription);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public static boolean m126044h(pf60 pf60Var) {
        pf60Var.getClass();
        Integer num = (Integer) pf60Var.f152156a;
        return num != null && num.intValue() == 13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public static String m126045i(pf60 pf60Var) {
        pf60Var.getClass();
        return (String) pf60Var.f152157b;
    }

    /* JADX INFO: renamed from: j */
    public final void m126046j() {
        Dialog dialog = this.dialog;
        if (dialog != null) {
            dialog.getClass();
            dialog.dismiss();
        }
        psd0.m173633z(this.subscription);
    }

    /* JADX INFO: renamed from: k */
    public final void m126047k(String liveId, String roomId, String userId, int type, long messageId, boolean isAnchor, final String feedback, String fakeId, int roomType) {
        BLiveChatReport bLiveChatReport = new BLiveChatReport();
        bLiveChatReport.liveId = liveId;
        roomId.getClass();
        bLiveChatReport.roomId = roomId;
        bLiveChatReport.seq = messageId;
        bLiveChatReport.type = type;
        bLiveChatReport.reportedUserId = userId;
        bLiveChatReport.fakeId = fakeId;
        bLiveChatReport.roomType = roomType;
        psd0.m173633z(this.subscription);
        C22421c<BLiveEnvelope> c22421cM72595a7 = isAnchor ? LivingNormalApiProvider.m72595a7(bLiveChatReport) : LivingNormalApiProvider.m72585Z6(bLiveChatReport, userId);
        final Function1 function1 = new Function1() { // from class: l.ako0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return fko0.m126041e(this.f72025a, feedback, (BLiveEnvelope) obj);
            }
        };
        this.subscription = c22421cM72595a7.doOnNext(new y20() { // from class: l.bko0
            @Override // p153l.y20
            public final void call(Object obj) {
                fko0.m126038b(function1, obj);
            }
        }).doOnError(new y20() { // from class: l.cko0
            @Override // p153l.y20
            public final void call(Object obj) {
                fko0.m126042f(this.f82305a, (Throwable) obj);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.dko0
            @Override // p153l.y20
            public final void call(Object obj) {
                fko0.m126039c(this.f89423a, (BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.eko0
            @Override // p153l.y20
            public final void call(Object obj) {
                fko0.m126037a((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l */
    public final String m126048l(nsv<User> livingUser) {
        pyl pylVarM164642g = livingUser.m164642g();
        if (!(pylVarM164642g instanceof e3t)) {
            return "";
        }
        String strM119320b = ((e3t) pylVarM164642g).m119320b();
        strM119320b.getClass();
        return strM119320b;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m126049m() {
        Dialog dialog = this.dialog;
        if (dialog == null) {
            return false;
        }
        dialog.getClass();
        return dialog.isShowing();
    }

    /* JADX INFO: renamed from: n */
    public final void m126050n(Throwable throwable) {
        o1j0.m165651y(zrv.f205803e.getString(R$string.f47568H9));
        Dialog dialog = this.dialog;
        if (dialog != null) {
            dialog.getClass();
            dialog.dismiss();
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m126051o(Meta meta, String feedback) {
        if (meta == null) {
            m126050n(new NullPointerException("Meta is Null"));
            return;
        }
        int i = meta.code;
        if (200 <= i && i < 300) {
            o1j0.m165651y(feedback);
        } else {
            if (400 > i || i >= 600) {
                return;
            }
            o1j0.m165651y(zrv.f205803e.getString(R$string.f47568H9));
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m126052p(@NotNull final Act act, boolean isCallUser, @NotNull final nsv<User> livingUser, @NotNull final String liveId, @Nullable final String roomId, final long messageId, final boolean isCurrentAnchor, @NotNull final String feedback, final int roomType, @NotNull String liveMode) {
        act.getClass();
        livingUser.getClass();
        liveId.getClass();
        feedback.getClass();
        liveMode.getClass();
        if (TextUtils.isEmpty(roomId)) {
            return;
        }
        final ArrayList arrayList = isCallUser ? new ArrayList(f99544c) : new ArrayList(f99545d);
        if (y6s.m214496d(liveMode)) {
            CollectionsKt.removeAll((List) arrayList, new Function1() { // from class: l.wjo0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(fko0.m126044h((pf60) obj));
                }
            });
        }
        this.dialog = act.dialog().m21534e0(jyb.m147486Q(arrayList, new qcj() { // from class: l.xjo0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return fko0.m126045i((pf60) obj);
            }
        })).m21536g0(new Dialog.InterfaceC4462g() { // from class: l.yjo0
            @Override // com.p051p1.mobile.android.app.Dialog.InterfaceC4462g
            /* JADX INFO: renamed from: a */
            public final void mo21568a(Dialog dialog, View view, int i, CharSequence charSequence) {
                fko0.m126040d(arrayList, livingUser, this, liveId, roomId, messageId, isCurrentAnchor, feedback, roomType, act, dialog, view, i, charSequence);
            }
        }).m21495B(true).m21548q(false).m21525V(new DialogInterface.OnDismissListener() { // from class: l.zjo0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                fko0.m126043g(this.f204692a, dialogInterface);
            }
        }).m21567z0();
    }

    /* JADX INFO: renamed from: q */
    public final void m126053q(Act act, boolean isAnchor, String id) {
        String str;
        if (isAnchor) {
            str = efv.f93866w;
            str.getClass();
        } else {
            str = efv.f93866w + "?userId=" + id;
        }
        Intent intent = new Intent(act, (Class<?>) MkWebViewAct.class);
        intent.putExtra("url", str);
        intent.putExtra("title", zrv.f205803e.getString(R$string.f47974ac));
        intent.putExtra("hideNavigationBar", true);
        act.startActivity(intent);
        m126046j();
    }
}
