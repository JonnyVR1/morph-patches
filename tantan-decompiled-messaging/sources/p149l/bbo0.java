package p149l;

import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.data.Meta;
import com.p046p1.mobile.putong.data.OMSTemplateType;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveChatReport;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct;
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
import p133rx.C22306c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 72\u00020\u0001:\u0001-B\u0007¢\u0006\u0004\b\u0002\u0010\u0003Jg\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0003J'\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u000b2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJY\u0010\"\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\"\u0010#J!\u0010&\u001a\u00020\u00152\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00152\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00103\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0011\u00106\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00068"}, m87232d2 = {"Ll/bbo0;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "isCallUser", "Ll/mqv;", "Lcom/p1/mobile/putong/data/User;", "livingUser", "", "liveId", "roomId", "", "messageId", "isCurrentAnchor", MessageType.feedback, "", "roomType", "liveMode", "", "p", "(Lcom/p1/mobile/android/app/Act;ZLl/mqv;Ljava/lang/String;Ljava/lang/String;JZLjava/lang/String;ILjava/lang/String;)V", "j", "isAnchor", "id", "q", "(Lcom/p1/mobile/android/app/Act;ZLjava/lang/String;)V", BLiveStormDanmakuGiftResourceType.f44444l, "(Ll/mqv;)Ljava/lang/String;", "userId", "type", "fakeId", "k", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJZLjava/lang/String;Ljava/lang/String;I)V", "Lcom/p1/mobile/putong/data/Meta;", "meta", "o", "(Lcom/p1/mobile/putong/data/Meta;Ljava/lang/String;)V", "", "throwable", "n", "(Ljava/lang/Throwable;)V", "Lcom/p1/mobile/android/app/Dialog;", "a", "Lcom/p1/mobile/android/app/Dialog;", OMSTemplateType.dialog, "Ll/c4g0;", "b", "Ll/c4g0;", "subscription", "m", "()Z", "isShowing", "Companion", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class bbo0 {

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final List<j760<Integer, String>> f74863c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final List<j760<Integer, String>> f74864d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public Dialog dialog;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public c4g0 subscription;

    static {
        ArrayList arrayListM200324f0 = vwb.m200324f0(vwb.m200311Y(13, ypv.f199497e.getString(R$string.f47388mb)), vwb.m200311Y(14, ypv.f199497e.getString(R$string.f47410nb)), vwb.m200311Y(8, ypv.f199497e.getString(R$string.f46651E6)));
        arrayListM200324f0.getClass();
        f74863c = arrayListM200324f0;
        ArrayList arrayListM200324f1 = vwb.m200324f0(vwb.m200311Y(13, ypv.f199497e.getString(R$string.f47388mb)), vwb.m200311Y(14, ypv.f199497e.getString(R$string.f47410nb)));
        arrayListM200324f1.getClass();
        f74864d = arrayListM200324f1;
    }

    /* JADX INFO: renamed from: a */
    public static void m100995a(Throwable th) {
    }

    /* JADX INFO: renamed from: b */
    public static void m100996b(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: c */
    public static void m100997c(bbo0 bbo0Var, BLiveEnvelope bLiveEnvelope) {
        Dialog dialog = bbo0Var.dialog;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static void m100998d(List list, mqv mqvVar, bbo0 bbo0Var, String str, String str2, long j, boolean z, String str3, int i, Act act, Dialog dialog, View view, int i2, CharSequence charSequence) {
        Integer num = (Integer) ((j760) list.get(i2)).f116564a;
        if (num == null || num.intValue() != 8) {
            String str4 = mqvVar.m156005h().f56011id;
            str4.getClass();
            F f = ((j760) list.get(i2)).f116564a;
            f.getClass();
            bbo0Var.m101005k(str, str2, str4, ((Number) f).intValue(), j, z, str3, bbo0Var.m101006l(mqvVar), i);
            return;
        }
        User user = (User) mqvVar.f135304a;
        if (user != null) {
            String str5 = user.f56011id;
            str5.getClass();
            bbo0Var.m101011q(act, z, str5);
        }
    }

    /* JADX INFO: renamed from: e */
    public static Unit m100999e(bbo0 bbo0Var, String str, BLiveEnvelope bLiveEnvelope) {
        bLiveEnvelope.getClass();
        bbo0Var.m101009o(bLiveEnvelope.meta, str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public static void m101000f(bbo0 bbo0Var, Throwable th) {
        th.getClass();
        bbo0Var.m101008n(th);
    }

    /* JADX INFO: renamed from: g */
    public static void m101001g(bbo0 bbo0Var, DialogInterface dialogInterface) {
        mkd0.m154992z(bbo0Var.subscription);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public static boolean m101002h(j760 j760Var) {
        j760Var.getClass();
        Integer num = (Integer) j760Var.f116564a;
        return num != null && num.intValue() == 13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public static String m101003i(j760 j760Var) {
        j760Var.getClass();
        return (String) j760Var.f116565b;
    }

    /* JADX INFO: renamed from: j */
    public final void m101004j() {
        Dialog dialog = this.dialog;
        if (dialog != null) {
            dialog.getClass();
            dialog.dismiss();
        }
        mkd0.m154992z(this.subscription);
    }

    /* JADX INFO: renamed from: k */
    public final void m101005k(String liveId, String roomId, String userId, int type, long messageId, boolean isAnchor, final String feedback, String fakeId, int roomType) {
        BLiveChatReport bLiveChatReport = new BLiveChatReport();
        bLiveChatReport.liveId = liveId;
        roomId.getClass();
        bLiveChatReport.roomId = roomId;
        bLiveChatReport.seq = messageId;
        bLiveChatReport.type = type;
        bLiveChatReport.reportedUserId = userId;
        bLiveChatReport.fakeId = fakeId;
        bLiveChatReport.roomType = roomType;
        mkd0.m154992z(this.subscription);
        C22306c<BLiveEnvelope> c22306cM71412a7 = isAnchor ? LivingNormalApiProvider.m71412a7(bLiveChatReport) : LivingNormalApiProvider.m71402Z6(bLiveChatReport, userId);
        final Function1 function1 = new Function1() { // from class: l.wao0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return bbo0.m100999e(this.f185492a, feedback, (BLiveEnvelope) obj);
            }
        };
        this.subscription = c22306cM71412a7.doOnNext(new e30() { // from class: l.xao0
            @Override // p149l.e30
            public final void call(Object obj) {
                bbo0.m100996b(function1, obj);
            }
        }).doOnError(new e30() { // from class: l.yao0
            @Override // p149l.e30
            public final void call(Object obj) {
                bbo0.m101000f(this.f197230a, (Throwable) obj);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.zao0
            @Override // p149l.e30
            public final void call(Object obj) {
                bbo0.m100997c(this.f202384a, (BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.abo0
            @Override // p149l.e30
            public final void call(Object obj) {
                bbo0.m100995a((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l */
    public final String m101006l(mqv<User> livingUser) {
        xvl xvlVarM156004g = livingUser.m156004g();
        if (!(xvlVarM156004g instanceof d1t)) {
            return "";
        }
        String strM109679b = ((d1t) xvlVarM156004g).m109679b();
        strM109679b.getClass();
        return strM109679b;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m101007m() {
        Dialog dialog = this.dialog;
        if (dialog == null) {
            return false;
        }
        dialog.getClass();
        return dialog.isShowing();
    }

    /* JADX INFO: renamed from: n */
    public final void m101008n(Throwable throwable) {
        lsi0.m151595y(ypv.f199497e.getString(R$string.f46720H9));
        Dialog dialog = this.dialog;
        if (dialog != null) {
            dialog.getClass();
            dialog.dismiss();
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m101009o(Meta meta, String feedback) {
        if (meta == null) {
            m101008n(new NullPointerException("Meta is Null"));
            return;
        }
        int i = meta.code;
        if (200 <= i && i < 300) {
            lsi0.m151595y(feedback);
        } else {
            if (400 > i || i >= 600) {
                return;
            }
            lsi0.m151595y(ypv.f199497e.getString(R$string.f46720H9));
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m101010p(@NotNull final Act act, boolean isCallUser, @NotNull final mqv<User> livingUser, @NotNull final String liveId, @Nullable final String roomId, final long messageId, final boolean isCurrentAnchor, @NotNull final String feedback, final int roomType, @NotNull String liveMode) {
        act.getClass();
        livingUser.getClass();
        liveId.getClass();
        feedback.getClass();
        liveMode.getClass();
        if (TextUtils.isEmpty(roomId)) {
            return;
        }
        final ArrayList arrayList = isCallUser ? new ArrayList(f74863c) : new ArrayList(f74864d);
        if (x4s.m207014d(liveMode)) {
            CollectionsKt.removeAll((List) arrayList, new Function1() { // from class: l.sao0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(bbo0.m101002h((j760) obj));
                }
            });
        }
        this.dialog = act.dialog().m20535e0(vwb.m200303Q(arrayList, new w9j() { // from class: l.tao0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return bbo0.m101003i((j760) obj);
            }
        })).m20537g0(new Dialog.InterfaceC4311g() { // from class: l.uao0
            @Override // com.p046p1.mobile.android.app.Dialog.InterfaceC4311g
            /* JADX INFO: renamed from: a */
            public final void mo20569a(Dialog dialog, View view, int i, CharSequence charSequence) {
                bbo0.m100998d(arrayList, livingUser, this, liveId, roomId, messageId, isCurrentAnchor, feedback, roomType, act, dialog, view, i, charSequence);
            }
        }).m20496B(true).m20549q(false).m20526V(new DialogInterface.OnDismissListener() { // from class: l.vao0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                bbo0.m101001g(this.f180773a, dialogInterface);
            }
        }).m20568z0();
    }

    /* JADX INFO: renamed from: q */
    public final void m101011q(Act act, boolean isAnchor, String id) {
        String str;
        if (isAnchor) {
            str = ddv.f85673w;
            str.getClass();
        } else {
            str = ddv.f85673w + "?userId=" + id;
        }
        Intent intent = new Intent(act, (Class<?>) MkWebViewAct.class);
        intent.putExtra("url", str);
        intent.putExtra("title", ypv.f199497e.getString(R$string.f47126ac));
        intent.putExtra("hideNavigationBar", true);
        act.startActivity(intent);
        m101004j();
    }
}
