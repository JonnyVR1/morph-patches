package p153l;

import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.google.android.exoplayer2.PlaybackException;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.live.base.data.BLiveActivity;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCallSwitchToLeadRoleInvite;
import com.p051p1.mobile.putong.live.base.data.BLivePush;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.tantan.live.eventbus.LiveEventBus;
import com.tantan.live.eventbus.LiveEventBus.MultiCallEvent;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p153l.oo2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003B!\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\u000fJ+\u0010\u001b\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00190\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\rH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\rH\u0016¢\u0006\u0004\b\"\u0010!J\r\u0010#\u001a\u00020\r¢\u0006\u0004\b#\u0010!J\r\u0010$\u001a\u00020\r¢\u0006\u0004\b$\u0010!J\r\u0010%\u001a\u00020\r¢\u0006\u0004\b%\u0010!J\u0017\u0010'\u001a\u00020\r2\b\u0010&\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b'\u0010\u001fJ\u0017\u0010)\u001a\u00020\r2\b\u0010(\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b)\u0010\u000fJ\u0015\u0010+\u001a\u00020\r2\u0006\u0010*\u001a\u00020\u0014¢\u0006\u0004\b+\u0010\u001fJ\r\u0010,\u001a\u00020\r¢\u0006\u0004\b,\u0010!J1\u0010.\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010-\u001a\u00020\u0014¢\u0006\u0004\b.\u0010/J\u0015\u00100\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b0\u0010\u000fJ\u0015\u00101\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b1\u0010\u000fJ\u0015\u00102\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b2\u0010\u000fJ\u0015\u00103\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b3\u0010\u000fJ\u000f\u00104\u001a\u00020\rH\u0016¢\u0006\u0004\b4\u0010!J\u000f\u00105\u001a\u00020\u0004H\u0016¢\u0006\u0004\b5\u00106R\u001b\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00078\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0018\u0010=\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R$\u0010E\u001a\u0004\u0018\u00010>8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR$\u0010L\u001a\u0004\u0018\u00010F8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010K¨\u0006M"}, m88121d2 = {"Ll/zk10;", "Ll/oo2;", "D", "Ll/hj2;", "Ll/yj10;", "Ll/dum;", BaseSei.INFO, "Ll/td10;", "coreModule", "<init>", "(Ll/dum;Ll/td10;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;", "call", "", "J4", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;)V", "", "calls", "u4", "(Ljava/util/List;)Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;", "", "v4", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;)Ljava/lang/String;", "x4", "Landroid/util/Pair;", "", "type", "y4", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;Landroid/util/Pair;)V", "callId", "H4", "(Ljava/lang/String;)V", "F4", "()V", Constants.KEY_T, "C4", "K4", "L4", "userId", "D4", BLiveActivity.TYPE_MULTI_CALL, "G4", "id", "z4", "t4", "operationType", "E4", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;Landroid/util/Pair;Ljava/lang/String;)V", "A4", "p4", "I4", "s4", "n", "w4", "()Ll/yj10;", "k", "Ll/td10;", "getCoreModule", "()Ll/td10;", BLiveStormDanmakuGiftResourceType.f45292l, "Ljava/lang/String;", "operationUser", "Ll/z1o0;", "m", "Ll/z1o0;", "getAffirmView", "()Ll/z1o0;", "setAffirmView", "(Ll/z1o0;)V", "affirmView", "Ll/g4s;", "Ll/g4s;", "getAffirmDialog", "()Ll/g4s;", "setAffirmDialog", "(Ll/g4s;)V", "affirmDialog", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class zk10<D extends oo2> extends hj2<D, yj10> {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final td10<?> coreModule;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public String operationUser;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public z1o0 affirmView;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public g4s affirmDialog;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zk10(@NotNull dum<D> dumVar, @NotNull td10<?> td10Var) {
        super(dumVar);
        dumVar.getClass();
        td10Var.getClass();
        this.coreModule = td10Var;
    }

    /* JADX INFO: renamed from: B4 */
    public static final void m219998B4(zk10 zk10Var, BLiveMultiCall bLiveMultiCall, View view) {
        String str = bLiveMultiCall.f45248id;
        str.getClass();
        zk10Var.m220035H4(str);
    }

    /* JADX INFO: renamed from: M4 */
    public static final void m219999M4(zk10 zk10Var, BLiveMultiCall bLiveMultiCall) {
        ((yj10) zk10Var.viewModel).mo72910j();
        td10<?> td10Var = zk10Var.coreModule;
        if (td10Var instanceof jn10) {
            ((jn10) td10Var).m146213F4();
            ((jn10) zk10Var.coreModule).m190606x4(bLiveMultiCall);
        }
    }

    /* JADX INFO: renamed from: N4 */
    public static final void m220000N4(Throwable th) {
        th.getClass();
        bf10.m103834j(th);
    }

    /* JADX INFO: renamed from: O3 */
    public static BLiveMultiCall m220001O3(zk10 zk10Var, le10 le10Var) {
        le10Var.getClass();
        List<BLiveMultiCall> listM153854v = le10Var.m153854v();
        listM153854v.getClass();
        return zk10Var.m220043u4(listM153854v);
    }

    /* JADX INFO: renamed from: P3 */
    public static Boolean m220002P3(zk10 zk10Var, BLiveMultiCall bLiveMultiCall) {
        return Boolean.valueOf(NullChecker.m82486a(bLiveMultiCall) && ((yj10) zk10Var.viewModel).isShowing());
    }

    /* JADX INFO: renamed from: R3 */
    public static Boolean m220003R3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: S3 */
    public static void m220004S3(Throwable th) {
        th.getClass();
        bf10.m103834j(th);
    }

    /* JADX INFO: renamed from: T3 */
    public static void m220005T3(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            o1j0.m165651y(((TantanException.Client.CoreService) th).metaMessage);
        }
    }

    /* JADX INFO: renamed from: V3 */
    public static void m220007V3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: X3 */
    public static void m220009X3(zk10 zk10Var, v7t v7tVar) {
        yj10 yj10Var = (yj10) zk10Var.viewModel;
        if (yj10Var != null) {
            yj10Var.m216373L();
        }
        yj10 yj10Var2 = (yj10) zk10Var.viewModel;
        if (yj10Var2 != null) {
            yj10Var2.mo72910j();
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public static void m220010Y3(BLiveMultiCall bLiveMultiCall, BLiveMultiCall bLiveMultiCall2) {
        if (fn10.m126342j(bLiveMultiCall)) {
            return;
        }
        int i = R$string.f47843U7;
        String str = bLiveMultiCall.userName;
        str.getClass();
        o1j0.m165651y(xau.m209911u(i, bf10.m103846x(str, 0, 2, null)));
    }

    /* JADX INFO: renamed from: Z3 */
    public static Unit m220011Z3(final zk10 zk10Var) {
        BLiveMultiCall bLiveMultiCallM190587e4 = zk10Var.coreModule.m190587e4();
        if (bLiveMultiCallM190587e4 != null) {
            if (fp10.INSTANCE.m126519f(bLiveMultiCallM190587e4)) {
                zk10Var.duringCreated(LivingNormalApiProvider.m72514R7(bLiveMultiCallM190587e4.f45248id)).subscribe(dhw.m115826e(new y20() { // from class: l.nk10
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        zk10.m219999M4(this.f142423a, (BLiveMultiCall) obj);
                    }
                }, new y20() { // from class: l.ok10
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        zk10.m220000N4((Throwable) obj);
                    }
                }));
            } else {
                bnl0.m105524M(((yj10) zk10Var.viewModel).f187800p, false);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a4 */
    public static void m220012a4(zk10 zk10Var, BLiveMultiCall bLiveMultiCall) {
        yj10 yj10Var = (yj10) zk10Var.viewModel;
        bLiveMultiCall.getClass();
        yj10Var.m216379S(bLiveMultiCall, zk10Var.m220044v4(bLiveMultiCall), zk10Var.coreModule.m190584b4().m153852t());
    }

    /* JADX INFO: renamed from: c4 */
    public static void m220014c4(BLiveMultiCall bLiveMultiCall) {
    }

    /* JADX INFO: renamed from: e4 */
    public static void m220016e4(zk10 zk10Var, Integer num) {
        List<BLiveMultiCall> listM153854v = zk10Var.coreModule.m190584b4().m153854v();
        listM153854v.getClass();
        BLiveMultiCall bLiveMultiCallM220043u4 = zk10Var.m220043u4(listM153854v);
        if (bLiveMultiCallM220043u4 != null) {
            yj10 yj10Var = (yj10) zk10Var.viewModel;
            String strM220044v4 = zk10Var.m220044v4(bLiveMultiCallM220043u4);
            num.getClass();
            yj10Var.m216381U(bLiveMultiCallM220043u4, strM220044v4, num.intValue());
        }
    }

    /* JADX INFO: renamed from: f4 */
    public static void m220017f4(BLiveMultiCall bLiveMultiCall) {
    }

    /* JADX INFO: renamed from: g4 */
    public static void m220018g4(BLivePush bLivePush) {
        o1j0.m165651y(bLivePush.resultMessage);
    }

    /* JADX INFO: renamed from: h4 */
    public static void m220019h4(BLiveMultiCall bLiveMultiCall, BLiveMultiCallSwitchToLeadRoleInvite bLiveMultiCallSwitchToLeadRoleInvite) {
        int i = R$string.f47413A8;
        String str = bLiveMultiCall.userName;
        str.getClass();
        o1j0.m165651y(xau.m209911u(i, bf10.m103846x(str, 0, 2, null)));
    }

    /* JADX INFO: renamed from: i4 */
    public static void m220020i4(BLiveMultiCall bLiveMultiCall) {
    }

    /* JADX INFO: renamed from: j4 */
    public static BLiveMultiCall m220021j4(Function1 function1, Object obj) {
        return (BLiveMultiCall) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: l4 */
    public static void m220023l4(zk10 zk10Var, BLiveMultiCall bLiveMultiCall) {
        bLiveMultiCall.getClass();
        zk10Var.m220037J4(bLiveMultiCall);
    }

    /* JADX INFO: renamed from: m4 */
    public static Boolean m220024m4(zk10 zk10Var, BLiveMultiCall bLiveMultiCall) {
        bLiveMultiCall.getClass();
        return Boolean.valueOf(Intrinsics.m88377d(bLiveMultiCall.userId, zk10Var.operationUser));
    }

    /* JADX INFO: renamed from: n4 */
    public static Unit m220025n4(zk10 zk10Var, BLiveMultiCall bLiveMultiCall) {
        yj10 yj10Var = (yj10) zk10Var.viewModel;
        if (yj10Var != null) {
            yj10Var.mo72910j();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o4 */
    public static void m220026o4(zk10 zk10Var, BLiveMultiCall bLiveMultiCall) {
        bLiveMultiCall.getClass();
        zk10Var.coreModule.m190606x4(bLiveMultiCall);
        zk10Var.m220046x4(bLiveMultiCall);
    }

    /* JADX INFO: renamed from: q4 */
    public static final void m220027q4(zk10 zk10Var) {
        g4s g4sVar = zk10Var.affirmDialog;
        if (g4sVar != null) {
            g4sVar.dismiss();
        }
    }

    /* JADX INFO: renamed from: r4 */
    public static final void m220028r4(zk10 zk10Var) {
        g4s g4sVar = zk10Var.affirmDialog;
        if (g4sVar != null) {
            g4sVar.dismiss();
        }
        zk10Var.m220033F4();
    }

    /* JADX INFO: renamed from: A4 */
    public final void m220029A4(@NotNull final BLiveMultiCall call) {
        call.getClass();
        Act act = act();
        if (act != null) {
            new th0.C20312a(act).m191151j(xau.m209911u(R$string.f47472D1, call.userName)).m191158q(R$string.f48271o2).m191156o(new View.OnClickListener() { // from class: l.ek10
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    zk10.m219998B4(this.f94338a, call, view);
                }
            }).m191146e(R$string.f47690N1).m191148g(false).m191149h(false).m191142a().m191141g();
        }
    }

    /* JADX INFO: renamed from: C4 */
    public final void m220030C4() {
        ((yj10) this.viewModel).mo72910j();
        m213811F2().BottomEvent.showDialog().mo199273j(BLiveButtonType.get("beauty"));
    }

    /* JADX INFO: renamed from: D4 */
    public final void m220031D4(@Nullable String userId) {
        ((yj10) this.viewModel).mo72910j();
        BLiveMultiCall bLiveMultiCallM190587e4 = this.coreModule.m190587e4();
        m213811F2().OpenUserCardDialogEvent.show().mo199273j(UserCardData.builder(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED).userId(userId).setFromIdentity(csq.m112229c(bLiveMultiCallM190587e4)).setTo(csq.m112229c(this.coreModule.m190584b4().m153851s(userId))).setScene(BLiveActivity.TYPE_MULTI_CALL).setSource("live").setMultiCall(bLiveMultiCallM190587e4).trackFrom("liveRoom").build());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E4 */
    public final void m220032E4(@NotNull BLiveMultiCall call, @NotNull Pair<String, Boolean> type, @NotNull String operationType) {
        call.getClass();
        type.getClass();
        operationType.getClass();
        String str = call.f45248id;
        str.getClass();
        ir10.m141746a("control Voice type=" + type.first + ",isMute=" + type.second);
        if (!TextUtils.isEmpty(operationType)) {
            jr10.m146657d(this, operationType, call);
        }
        duringCreated(((Boolean) type.second).booleanValue() ? LivingNormalApiProvider.m72541U7(str) : LivingNormalApiProvider.m72765t6(str)).subscribe(dhw.m115829h(new y20() { // from class: l.ck10
            @Override // p153l.y20
            public final void call(Object obj) {
                zk10.m220026o4(this.f82254a, (BLiveMultiCall) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: F4 */
    public final void m220033F4() {
        duringCreated(LivingNormalApiProvider.m72568X7()).subscribe(dhw.m115826e(new y20() { // from class: l.lk10
            @Override // p153l.y20
            public final void call(Object obj) {
                zk10.m220018g4((BLivePush) obj);
            }
        }, new y20() { // from class: l.mk10
            @Override // p153l.y20
            public final void call(Object obj) {
                zk10.m220005T3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: G4 */
    public final void m220034G4(@Nullable BLiveMultiCall multiCall) {
        ((yj10) this.viewModel).mo72910j();
        multiCall.getClass();
        jr10.m146657d(this, "sent_gift", multiCall);
        m213811F2().GiftDialogEventGroup.openGiftDialogEvent().mo199273j(new lx50().m156159i(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED).m156158h(new cqj.C16337a().m111925f(ve10.m201025e(multiCall)).m111923d()).m156160j(ve10.m201027g(multiCall)));
    }

    /* JADX INFO: renamed from: H4 */
    public final void m220035H4(String callId) {
        duringCreated(LivingNormalApiProvider.m72666i6(callId)).subscribe(dhw.m115826e(new y20() { // from class: l.pk10
            @Override // p153l.y20
            public final void call(Object obj) {
                zk10.m220014c4((BLiveMultiCall) obj);
            }
        }, new y20() { // from class: l.qk10
            @Override // p153l.y20
            public final void call(Object obj) {
                zk10.m220004S3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: I4 */
    public final void m220036I4(@NotNull final BLiveMultiCall call) {
        call.getClass();
        if (fn10.m126342j(call)) {
            duringCreated(LivingNormalApiProvider.m72505Q7(call.f45248id)).subscribe(dhw.m115826e(new y20() { // from class: l.fk10
                @Override // p153l.y20
                public final void call(Object obj) {
                    zk10.m220020i4((BLiveMultiCall) obj);
                }
            }, new z2e0()));
        } else {
            duringCreated(LivingNormalApiProvider.m72648g6(call.ownerUserId, this.coreModule.m190587e4().f45248id, call.userId, call.f45248id)).subscribe(dhw.m115826e(new y20() { // from class: l.gk10
                @Override // p153l.y20
                public final void call(Object obj) {
                    zk10.m220019h4(call, (BLiveMultiCallSwitchToLeadRoleInvite) obj);
                }
            }, new z2e0()));
        }
    }

    /* JADX INFO: renamed from: J4 */
    public final void m220037J4(BLiveMultiCall call) {
        this.operationUser = call.userId;
        m135319L3();
        ((yj10) this.viewModel).m216376P(call, m220044v4(call), this.coreModule.m190584b4().m153852t());
        mo135321N3();
    }

    /* JADX INFO: renamed from: K4 */
    public final void m220038K4() {
        ((szl) m138856F3(new c210(4400))).mo101587f();
    }

    /* JADX INFO: renamed from: L4 */
    public final void m220039L4() {
        vb10 vb10Var = vb10.INSTANCE;
        String str = cd10.f81081i;
        str.getClass();
        vb10Var.m200665o(this, str, new Function0() { // from class: l.yk10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return zk10.m220011Z3(this.f200367a);
            }
        });
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        g4s g4sVar = this.affirmDialog;
        if (g4sVar == null || !g4sVar.isShowing()) {
            return;
        }
        g4sVar.dismiss();
    }

    /* JADX INFO: renamed from: p4 */
    public final void m220040p4(@NotNull BLiveMultiCall call) {
        call.getClass();
        Act act = act();
        if (act != null) {
            if (this.affirmView == null) {
                this.affirmView = new z1o0(act);
                z1o0 z1o0Var = this.affirmView;
                z1o0Var.getClass();
                g4s g4sVar = new g4s(this, z1o0Var.getCom.p1.mobile.putong.data.OMSTemplateModeType.view java.lang.String());
                this.affirmDialog = g4sVar;
                g4sVar.setCancelable(false);
                g4s g4sVar2 = this.affirmDialog;
                g4sVar2.getClass();
                g4sVar2.setCanceledOnTouchOutside(false);
                z1o0 z1o0Var2 = this.affirmView;
                z1o0Var2.getClass();
                z1o0Var2.m218363k(n9c0.f140783N);
            }
            z1o0 z1o0Var3 = this.affirmView;
            if (z1o0Var3 != null) {
                String strM209910t = xau.m209910t(R$string.f47759Q7);
                strM209910t.getClass();
                String strM209911u = xau.m209911u(R$string.f47780R7, Long.valueOf(call.pushRemainCount));
                strM209911u.getClass();
                z1o0Var3.m218362j(strM209910t, strM209911u, R$string.f47690N1, R$string.f48271o2, new x20() { // from class: l.ak10
                    @Override // p153l.x20
                    public final void call() {
                        zk10.m220027q4(this.f71950a);
                    }
                }, new x20() { // from class: l.bk10
                    @Override // p153l.x20
                    public final void call() {
                        zk10.m220028r4(this.f77036a);
                    }
                });
            }
            g4s g4sVar3 = this.affirmDialog;
            if (g4sVar3 != null) {
                g4sVar3.show();
            }
        }
    }

    /* JADX INFO: renamed from: s4 */
    public final void m220041s4(@NotNull final BLiveMultiCall call) {
        call.getClass();
        duringCreated(LivingNormalApiProvider.m72546V3(call.f45248id)).subscribe(dhw.m115829h(new y20() { // from class: l.dk10
            @Override // p153l.y20
            public final void call(Object obj) {
                zk10.m220010Y3(call, (BLiveMultiCall) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m138863h3(m213811F2().MultiCallEvent.openCallingOperateDialog(), new y20() { // from class: l.zj10
            @Override // p153l.y20
            public final void call(Object obj) {
                zk10.m220023l4(this.f204639a, (BLiveMultiCall) obj);
            }
        });
        C22421c<le10> c22421cM190585c4 = this.coreModule.m190585c4();
        final Function1 function1 = new Function1() { // from class: l.kk10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return zk10.m220001O3(this.f127161a, (le10) obj);
            }
        };
        C22421c<R> map = c22421cM190585c4.map(new qcj() { // from class: l.rk10
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return zk10.m220021j4(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: l.sk10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return zk10.m220002P3(this.f169226a, (BLiveMultiCall) obj);
            }
        };
        duringCreated(map.filter(new qcj() { // from class: l.tk10
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return zk10.m220003R3(function2, obj);
            }
        })).subscribe(dhw.m115829h(new y20() { // from class: l.uk10
            @Override // p153l.y20
            public final void call(Object obj) {
                zk10.m220012a4(this.f179355a, (BLiveMultiCall) obj);
            }
        }));
        duringCreated(LivingNormalApiProvider.m72611c5(this)).subscribe(dhw.m115829h(new y20() { // from class: l.vk10
            @Override // p153l.y20
            public final void call(Object obj) {
                zk10.m220009X3(this.f184455a, (v7t) obj);
            }
        }));
        LiveEventBus liveEventBusM213811F2 = m213811F2();
        liveEventBusM213811F2.getClass();
        m138863h3(liveEventBusM213811F2.new MultiCallEvent().deputyCountChange(), new y20() { // from class: l.wk10
            @Override // p153l.y20
            public final void call(Object obj) {
                zk10.m220016e4(this.f189522a, (Integer) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t4 */
    public final void m220042t4() {
        m213811F2().MultiCallEvent.prepareCloseMultiCall().mo199273j(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: u4 */
    public final BLiveMultiCall m220043u4(List<? extends BLiveMultiCall> calls) {
        return (BLiveMultiCall) jyb.m147529r(calls, new qcj() { // from class: l.xk10
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return zk10.m220024m4(this.f194704a, (BLiveMultiCall) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v4 */
    public final String m220044v4(BLiveMultiCall call) {
        return bf10.m103797C(this.coreModule.m190587e4(), TextUtils.equals(call.ownerRoomId, m213810E2().m202194o()));
    }

    @Override // p153l.hj2
    @NotNull
    /* JADX INFO: renamed from: w4, reason: merged with bridge method [inline-methods] */
    public yj10 mo76862K3() {
        Act act = this.f196918e.f90815a;
        act.getClass();
        return new yj10(act);
    }

    /* JADX INFO: renamed from: x4 */
    public final void m220046x4(BLiveMultiCall call) {
        String strM220044v4 = m220044v4(call);
        ((yj10) this.viewModel).m216379S(call, strM220044v4, this.coreModule.m190584b4().m153852t());
        Pair<String, Boolean> pairM103800F = bf10.m103800F(call, strM220044v4);
        if (pairM103800F == null) {
            return;
        }
        m220047y4(call, pairM103800F);
        if (fn10.m126344l((String) pairM103800F.first) || fn10.m126336d((String) pairM103800F.first)) {
            xzl xzlVar = (xzl) m138856F3(new r410(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED));
            String str = call.userId;
            str.getClass();
            int i = Integer.parseInt(str);
            Object obj = pairM103800F.second;
            obj.getClass();
            xzlVar.mo170518Y(i, ((Boolean) obj).booleanValue());
            p910 p910Var = (p910) ((h0m) m138856F3(new z310(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED))).mo133182a().m73074T0(p910.class);
            String str2 = call.userId;
            Object obj2 = pairM103800F.second;
            obj2.getClass();
            p910Var.m171315L1(str2, ((Boolean) obj2).booleanValue());
            return;
        }
        if (fn10.m126337e((String) pairM103800F.first)) {
            xzl xzlVar2 = (xzl) m138856F3(new r410(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED));
            Object obj3 = pairM103800F.second;
            obj3.getClass();
            xzlVar2.mo170540p(((Boolean) obj3).booleanValue());
            return;
        }
        if (fn10.m126340h((String) pairM103800F.first)) {
            xzl xzlVar3 = (xzl) m138856F3(new r410(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED));
            Object obj4 = pairM103800F.second;
            obj4.getClass();
            xzlVar3.mo170536n(((Boolean) obj4).booleanValue());
        }
    }

    /* JADX INFO: renamed from: y4 */
    public final void m220047y4(BLiveMultiCall call, Pair<String, Boolean> type) {
        String strM209911u;
        if (fn10.m126345m((String) type.first)) {
            strM209911u = xau.m209911u(((Boolean) type.second).booleanValue() ? R$string.f47992b8 : R$string.f47928Y8, call.userName);
        } else if (fn10.m126337e((String) type.first) || fn10.m126344l((String) type.first) || fn10.m126336d((String) type.first)) {
            strM209911u = xau.m209911u(((Boolean) type.second).booleanValue() ? R$string.f47970a8 : R$string.f47907X8, call.userName);
        } else if (fn10.m126340h((String) type.first)) {
            strM209911u = xau.m209911u(((Boolean) type.second).booleanValue() ? R$string.f48036d8 : R$string.f47949Z8, call.userName);
        } else {
            strM209911u = "";
        }
        if (TextUtils.isEmpty(strM209911u)) {
            return;
        }
        o1j0.m165651y(strM209911u);
    }

    /* JADX INFO: renamed from: z4 */
    public final void m220048z4(@NotNull String id) {
        id.getClass();
        C22421c<T> c22421cDuringCreated = duringCreated(LivingNormalApiProvider.m72630e6(id, "anchor-close-multi"));
        final Function1 function1 = new Function1() { // from class: l.hk10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return zk10.m220025n4(this.f110362a, (BLiveMultiCall) obj);
            }
        };
        c22421cDuringCreated.doOnNext(new y20() { // from class: l.ik10
            @Override // p153l.y20
            public final void call(Object obj) {
                zk10.m220007V3(function1, obj);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.jk10
            @Override // p153l.y20
            public final void call(Object obj) {
                zk10.m220017f4((BLiveMultiCall) obj);
            }
        }));
    }
}
