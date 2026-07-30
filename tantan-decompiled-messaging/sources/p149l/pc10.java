package p149l;

import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.google.android.exoplayer2.PlaybackException;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.live.base.data.BLiveActivity;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCallSwitchToLeadRoleInvite;
import com.p046p1.mobile.putong.live.base.data.BLivePush;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
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
import p133rx.C22306c;
import p149l.ho2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003B!\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\u000fJ+\u0010\u001b\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00190\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\rH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\rH\u0016¢\u0006\u0004\b\"\u0010!J\r\u0010#\u001a\u00020\r¢\u0006\u0004\b#\u0010!J\r\u0010$\u001a\u00020\r¢\u0006\u0004\b$\u0010!J\r\u0010%\u001a\u00020\r¢\u0006\u0004\b%\u0010!J\u0017\u0010'\u001a\u00020\r2\b\u0010&\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b'\u0010\u001fJ\u0017\u0010)\u001a\u00020\r2\b\u0010(\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b)\u0010\u000fJ\u0015\u0010+\u001a\u00020\r2\u0006\u0010*\u001a\u00020\u0014¢\u0006\u0004\b+\u0010\u001fJ\r\u0010,\u001a\u00020\r¢\u0006\u0004\b,\u0010!J1\u0010.\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010-\u001a\u00020\u0014¢\u0006\u0004\b.\u0010/J\u0015\u00100\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b0\u0010\u000fJ\u0015\u00101\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b1\u0010\u000fJ\u0015\u00102\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b2\u0010\u000fJ\u0015\u00103\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b3\u0010\u000fJ\u000f\u00104\u001a\u00020\rH\u0016¢\u0006\u0004\b4\u0010!J\u000f\u00105\u001a\u00020\u0004H\u0016¢\u0006\u0004\b5\u00106R\u001b\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00078\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0018\u0010=\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R$\u0010E\u001a\u0004\u0018\u00010>8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR$\u0010L\u001a\u0004\u0018\u00010F8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010K¨\u0006M"}, m87232d2 = {"Ll/pc10;", "Ll/ho2;", "D", "Ll/zi2;", "Ll/ob10;", "Ll/bsm;", BaseSei.INFO, "Ll/j510;", "coreModule", "<init>", "(Ll/bsm;Ll/j510;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;", "call", "", "J4", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;)V", "", "calls", "u4", "(Ljava/util/List;)Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;", "", "v4", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;)Ljava/lang/String;", "x4", "Landroid/util/Pair;", "", "type", "y4", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;Landroid/util/Pair;)V", "callId", "H4", "(Ljava/lang/String;)V", "F4", "()V", Constants.KEY_T, "C4", "K4", "L4", "userId", "D4", BLiveActivity.TYPE_MULTI_CALL, "G4", "id", "z4", "t4", "operationType", "E4", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;Landroid/util/Pair;Ljava/lang/String;)V", "A4", "p4", "I4", "s4", "n", "w4", "()Ll/ob10;", "k", "Ll/j510;", "getCoreModule", "()Ll/j510;", BLiveStormDanmakuGiftResourceType.f44444l, "Ljava/lang/String;", "operationUser", "Ll/vsn0;", "m", "Ll/vsn0;", "getAffirmView", "()Ll/vsn0;", "setAffirmView", "(Ll/vsn0;)V", "affirmView", "Ll/f2s;", "Ll/f2s;", "getAffirmDialog", "()Ll/f2s;", "setAffirmDialog", "(Ll/f2s;)V", "affirmDialog", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class pc10<D extends ho2> extends zi2<D, ob10> {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final j510<?> coreModule;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public String operationUser;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public vsn0 affirmView;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public f2s affirmDialog;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pc10(@NotNull bsm<D> bsmVar, @NotNull j510<?> j510Var) {
        super(bsmVar);
        bsmVar.getClass();
        j510Var.getClass();
        this.coreModule = j510Var;
    }

    /* JADX INFO: renamed from: B4 */
    public static final void m168255B4(pc10 pc10Var, BLiveMultiCall bLiveMultiCall, View view) {
        String str = bLiveMultiCall.f44400id;
        str.getClass();
        pc10Var.m168292H4(str);
    }

    /* JADX INFO: renamed from: M4 */
    public static final void m168256M4(pc10 pc10Var, BLiveMultiCall bLiveMultiCall) {
        ((ob10) pc10Var.viewModel).mo71727j();
        j510<?> j510Var = pc10Var.coreModule;
        if (j510Var instanceof ze10) {
            ((ze10) j510Var).m218267F4();
            ((ze10) pc10Var.coreModule).m139822x4(bLiveMultiCall);
        }
    }

    /* JADX INFO: renamed from: N4 */
    public static final void m168257N4(Throwable th) {
        th.getClass();
        r610.m178005j(th);
    }

    /* JADX INFO: renamed from: O3 */
    public static BLiveMultiCall m168258O3(pc10 pc10Var, b610 b610Var) {
        b610Var.getClass();
        List<BLiveMultiCall> listM100376v = b610Var.m100376v();
        listM100376v.getClass();
        return pc10Var.m168300u4(listM100376v);
    }

    /* JADX INFO: renamed from: P3 */
    public static Boolean m168259P3(pc10 pc10Var, BLiveMultiCall bLiveMultiCall) {
        return Boolean.valueOf(NullChecker.m81303a(bLiveMultiCall) && ((ob10) pc10Var.viewModel).isShowing());
    }

    /* JADX INFO: renamed from: R3 */
    public static Boolean m168260R3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: S3 */
    public static void m168261S3(Throwable th) {
        th.getClass();
        r610.m178005j(th);
    }

    /* JADX INFO: renamed from: T3 */
    public static void m168262T3(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            lsi0.m151595y(((TantanException.Client.CoreService) th).metaMessage);
        }
    }

    /* JADX INFO: renamed from: V3 */
    public static void m168264V3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: X3 */
    public static void m168266X3(pc10 pc10Var, u5t u5tVar) {
        ob10 ob10Var = (ob10) pc10Var.viewModel;
        if (ob10Var != null) {
            ob10Var.m163399L();
        }
        ob10 ob10Var2 = (ob10) pc10Var.viewModel;
        if (ob10Var2 != null) {
            ob10Var2.mo71727j();
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public static void m168267Y3(BLiveMultiCall bLiveMultiCall, BLiveMultiCall bLiveMultiCall2) {
        if (ve10.m198136j(bLiveMultiCall)) {
            return;
        }
        int i = R$string.f46995U7;
        String str = bLiveMultiCall.userName;
        str.getClass();
        lsi0.m151595y(w8u.m202218u(i, r610.m178017x(str, 0, 2, null)));
    }

    /* JADX INFO: renamed from: Z3 */
    public static Unit m168268Z3(final pc10 pc10Var) {
        BLiveMultiCall bLiveMultiCallM139803e4 = pc10Var.coreModule.m139803e4();
        if (bLiveMultiCallM139803e4 != null) {
            if (vg10.INSTANCE.m198314f(bLiveMultiCallM139803e4)) {
                pc10Var.duringCreated(LivingNormalApiProvider.m71331R7(bLiveMultiCallM139803e4.f44400id)).subscribe(ffw.m121194e(new e30() { // from class: l.dc10
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        pc10.m168256M4(this.f85361a, (BLiveMultiCall) obj);
                    }
                }, new e30() { // from class: l.ec10
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        pc10.m168257N4((Throwable) obj);
                    }
                }));
            } else {
                xdl0.m208344M(((ob10) pc10Var.viewModel).f180123p, false);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a4 */
    public static void m168269a4(pc10 pc10Var, BLiveMultiCall bLiveMultiCall) {
        ob10 ob10Var = (ob10) pc10Var.viewModel;
        bLiveMultiCall.getClass();
        ob10Var.m163405S(bLiveMultiCall, pc10Var.m168301v4(bLiveMultiCall), pc10Var.coreModule.m139800b4().m100374t());
    }

    /* JADX INFO: renamed from: c4 */
    public static void m168271c4(BLiveMultiCall bLiveMultiCall) {
    }

    /* JADX INFO: renamed from: e4 */
    public static void m168273e4(pc10 pc10Var, Integer num) {
        List<BLiveMultiCall> listM100376v = pc10Var.coreModule.m139800b4().m100376v();
        listM100376v.getClass();
        BLiveMultiCall bLiveMultiCallM168300u4 = pc10Var.m168300u4(listM100376v);
        if (bLiveMultiCallM168300u4 != null) {
            ob10 ob10Var = (ob10) pc10Var.viewModel;
            String strM168301v4 = pc10Var.m168301v4(bLiveMultiCallM168300u4);
            num.getClass();
            ob10Var.m163407U(bLiveMultiCallM168300u4, strM168301v4, num.intValue());
        }
    }

    /* JADX INFO: renamed from: f4 */
    public static void m168274f4(BLiveMultiCall bLiveMultiCall) {
    }

    /* JADX INFO: renamed from: g4 */
    public static void m168275g4(BLivePush bLivePush) {
        lsi0.m151595y(bLivePush.resultMessage);
    }

    /* JADX INFO: renamed from: h4 */
    public static void m168276h4(BLiveMultiCall bLiveMultiCall, BLiveMultiCallSwitchToLeadRoleInvite bLiveMultiCallSwitchToLeadRoleInvite) {
        int i = R$string.f46565A8;
        String str = bLiveMultiCall.userName;
        str.getClass();
        lsi0.m151595y(w8u.m202218u(i, r610.m178017x(str, 0, 2, null)));
    }

    /* JADX INFO: renamed from: i4 */
    public static void m168277i4(BLiveMultiCall bLiveMultiCall) {
    }

    /* JADX INFO: renamed from: j4 */
    public static BLiveMultiCall m168278j4(Function1 function1, Object obj) {
        return (BLiveMultiCall) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: l4 */
    public static void m168280l4(pc10 pc10Var, BLiveMultiCall bLiveMultiCall) {
        bLiveMultiCall.getClass();
        pc10Var.m168294J4(bLiveMultiCall);
    }

    /* JADX INFO: renamed from: m4 */
    public static Boolean m168281m4(pc10 pc10Var, BLiveMultiCall bLiveMultiCall) {
        bLiveMultiCall.getClass();
        return Boolean.valueOf(Intrinsics.m87488d(bLiveMultiCall.userId, pc10Var.operationUser));
    }

    /* JADX INFO: renamed from: n4 */
    public static Unit m168282n4(pc10 pc10Var, BLiveMultiCall bLiveMultiCall) {
        ob10 ob10Var = (ob10) pc10Var.viewModel;
        if (ob10Var != null) {
            ob10Var.mo71727j();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o4 */
    public static void m168283o4(pc10 pc10Var, BLiveMultiCall bLiveMultiCall) {
        bLiveMultiCall.getClass();
        pc10Var.coreModule.m139822x4(bLiveMultiCall);
        pc10Var.m168303x4(bLiveMultiCall);
    }

    /* JADX INFO: renamed from: q4 */
    public static final void m168284q4(pc10 pc10Var) {
        f2s f2sVar = pc10Var.affirmDialog;
        if (f2sVar != null) {
            f2sVar.dismiss();
        }
    }

    /* JADX INFO: renamed from: r4 */
    public static final void m168285r4(pc10 pc10Var) {
        f2s f2sVar = pc10Var.affirmDialog;
        if (f2sVar != null) {
            f2sVar.dismiss();
        }
        pc10Var.m168290F4();
    }

    /* JADX INFO: renamed from: A4 */
    public final void m168286A4(@NotNull final BLiveMultiCall call) {
        call.getClass();
        Act act = act();
        if (act != null) {
            new xh0.C21150a(act).m208731j(w8u.m202218u(R$string.f46624D1, call.userName)).m208738q(R$string.f47423o2).m208736o(new View.OnClickListener() { // from class: l.ub10
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    pc10.m168255B4(this.f175670a, call, view);
                }
            }).m208726e(R$string.f46842N1).m208728g(false).m208729h(false).m208722a().m208721g();
        }
    }

    /* JADX INFO: renamed from: C4 */
    public final void m168287C4() {
        ((ob10) this.viewModel).mo71727j();
        m206028F2().BottomEvent.showDialog().mo172463j(BLiveButtonType.get("beauty"));
    }

    /* JADX INFO: renamed from: D4 */
    public final void m168288D4(@Nullable String userId) {
        ((ob10) this.viewModel).mo71727j();
        BLiveMultiCall bLiveMultiCallM139803e4 = this.coreModule.m139803e4();
        m206028F2().OpenUserCardDialogEvent.show().mo172463j(UserCardData.builder(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED).userId(userId).setFromIdentity(bqq.m103388c(bLiveMultiCallM139803e4)).setTo(bqq.m103388c(this.coreModule.m139800b4().m100373s(userId))).setScene(BLiveActivity.TYPE_MULTI_CALL).setSource("live").setMultiCall(bLiveMultiCallM139803e4).trackFrom("liveRoom").build());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E4 */
    public final void m168289E4(@NotNull BLiveMultiCall call, @NotNull Pair<String, Boolean> type, @NotNull String operationType) {
        call.getClass();
        type.getClass();
        operationType.getClass();
        String str = call.f44400id;
        str.getClass();
        yi10.m214879a("control Voice type=" + type.first + ",isMute=" + type.second);
        if (!TextUtils.isEmpty(operationType)) {
            zi10.m218893d(this, operationType, call);
        }
        duringCreated(((Boolean) type.second).booleanValue() ? LivingNormalApiProvider.m71358U7(str) : LivingNormalApiProvider.m71582t6(str)).subscribe(ffw.m121197h(new e30() { // from class: l.sb10
            @Override // p149l.e30
            public final void call(Object obj) {
                pc10.m168283o4(this.f163493a, (BLiveMultiCall) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: F4 */
    public final void m168290F4() {
        duringCreated(LivingNormalApiProvider.m71385X7()).subscribe(ffw.m121194e(new e30() { // from class: l.bc10
            @Override // p149l.e30
            public final void call(Object obj) {
                pc10.m168275g4((BLivePush) obj);
            }
        }, new e30() { // from class: l.cc10
            @Override // p149l.e30
            public final void call(Object obj) {
                pc10.m168262T3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: G4 */
    public final void m168291G4(@Nullable BLiveMultiCall multiCall) {
        ((ob10) this.viewModel).mo71727j();
        multiCall.getClass();
        zi10.m218893d(this, "sent_gift", multiCall);
        m206028F2().GiftDialogEventGroup.openGiftDialogEvent().mo172463j(new fp50().m122565i(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED).m122564h(new mnj.C18509a().m155525f(l610.m148688e(multiCall)).m155523d()).m122566j(l610.m148690g(multiCall)));
    }

    /* JADX INFO: renamed from: H4 */
    public final void m168292H4(String callId) {
        duringCreated(LivingNormalApiProvider.m71483i6(callId)).subscribe(ffw.m121194e(new e30() { // from class: l.fc10
            @Override // p149l.e30
            public final void call(Object obj) {
                pc10.m168271c4((BLiveMultiCall) obj);
            }
        }, new e30() { // from class: l.gc10
            @Override // p149l.e30
            public final void call(Object obj) {
                pc10.m168261S3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: I4 */
    public final void m168293I4(@NotNull final BLiveMultiCall call) {
        call.getClass();
        if (ve10.m198136j(call)) {
            duringCreated(LivingNormalApiProvider.m71322Q7(call.f44400id)).subscribe(ffw.m121194e(new e30() { // from class: l.vb10
                @Override // p149l.e30
                public final void call(Object obj) {
                    pc10.m168277i4((BLiveMultiCall) obj);
                }
            }, new vud0()));
        } else {
            duringCreated(LivingNormalApiProvider.m71465g6(call.ownerUserId, this.coreModule.m139803e4().f44400id, call.userId, call.f44400id)).subscribe(ffw.m121194e(new e30() { // from class: l.wb10
                @Override // p149l.e30
                public final void call(Object obj) {
                    pc10.m168276h4(call, (BLiveMultiCallSwitchToLeadRoleInvite) obj);
                }
            }, new vud0()));
        }
    }

    /* JADX INFO: renamed from: J4 */
    public final void m168294J4(BLiveMultiCall call) {
        this.operationUser = call.userId;
        m218910L3();
        ((ob10) this.viewModel).m163402P(call, m168301v4(call), this.coreModule.m139800b4().m100374t());
        mo168244N3();
    }

    /* JADX INFO: renamed from: K4 */
    public final void m168295K4() {
        ((zwl) m129297F3(new tt00(4400))).mo185824f();
    }

    /* JADX INFO: renamed from: L4 */
    public final void m168296L4() {
        l310 l310Var = l310.INSTANCE;
        String str = s410.f162243i;
        str.getClass();
        l310Var.m148350o(this, str, new Function0() { // from class: l.oc10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return pc10.m168268Z3(this.f143001a);
            }
        });
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        f2s f2sVar = this.affirmDialog;
        if (f2sVar == null || !f2sVar.isShowing()) {
            return;
        }
        f2sVar.dismiss();
    }

    /* JADX INFO: renamed from: p4 */
    public final void m168297p4(@NotNull BLiveMultiCall call) {
        call.getClass();
        Act act = act();
        if (act != null) {
            if (this.affirmView == null) {
                this.affirmView = new vsn0(act);
                vsn0 vsn0Var = this.affirmView;
                vsn0Var.getClass();
                f2s f2sVar = new f2s(this, vsn0Var.getCom.p1.mobile.putong.data.OMSTemplateModeType.view java.lang.String());
                this.affirmDialog = f2sVar;
                f2sVar.setCancelable(false);
                f2s f2sVar2 = this.affirmDialog;
                f2sVar2.getClass();
                f2sVar2.setCanceledOnTouchOutside(false);
                vsn0 vsn0Var2 = this.affirmView;
                vsn0Var2.getClass();
                vsn0Var2.m199890k(h1c0.f105322N);
            }
            vsn0 vsn0Var3 = this.affirmView;
            if (vsn0Var3 != null) {
                String strM202217t = w8u.m202217t(R$string.f46911Q7);
                strM202217t.getClass();
                String strM202218u = w8u.m202218u(R$string.f46932R7, Long.valueOf(call.pushRemainCount));
                strM202218u.getClass();
                vsn0Var3.m199889j(strM202217t, strM202218u, R$string.f46842N1, R$string.f47423o2, new d30() { // from class: l.qb10
                    @Override // p149l.d30
                    public final void call() {
                        pc10.m168284q4(this.f153613a);
                    }
                }, new d30() { // from class: l.rb10
                    @Override // p149l.d30
                    public final void call() {
                        pc10.m168285r4(this.f158574a);
                    }
                });
            }
            f2s f2sVar3 = this.affirmDialog;
            if (f2sVar3 != null) {
                f2sVar3.show();
            }
        }
    }

    /* JADX INFO: renamed from: s4 */
    public final void m168298s4(@NotNull final BLiveMultiCall call) {
        call.getClass();
        duringCreated(LivingNormalApiProvider.m71363V3(call.f44400id)).subscribe(ffw.m121197h(new e30() { // from class: l.tb10
            @Override // p149l.e30
            public final void call(Object obj) {
                pc10.m168267Y3(call, (BLiveMultiCall) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m129304h3(m206028F2().MultiCallEvent.openCallingOperateDialog(), new e30() { // from class: l.pb10
            @Override // p149l.e30
            public final void call(Object obj) {
                pc10.m168280l4(this.f148032a, (BLiveMultiCall) obj);
            }
        });
        C22306c<b610> c22306cM139801c4 = this.coreModule.m139801c4();
        final Function1 function1 = new Function1() { // from class: l.ac10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return pc10.m168258O3(this.f68761a, (b610) obj);
            }
        };
        C22306c<R> map = c22306cM139801c4.map(new w9j() { // from class: l.hc10
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return pc10.m168278j4(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: l.ic10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return pc10.m168259P3(this.f112418a, (BLiveMultiCall) obj);
            }
        };
        duringCreated(map.filter(new w9j() { // from class: l.jc10
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return pc10.m168260R3(function2, obj);
            }
        })).subscribe(ffw.m121197h(new e30() { // from class: l.kc10
            @Override // p149l.e30
            public final void call(Object obj) {
                pc10.m168269a4(this.f122284a, (BLiveMultiCall) obj);
            }
        }));
        duringCreated(LivingNormalApiProvider.m71428c5(this)).subscribe(ffw.m121197h(new e30() { // from class: l.lc10
            @Override // p149l.e30
            public final void call(Object obj) {
                pc10.m168266X3(this.f127369a, (u5t) obj);
            }
        }));
        LiveEventBus liveEventBusM206028F2 = m206028F2();
        liveEventBusM206028F2.getClass();
        m129304h3(liveEventBusM206028F2.new MultiCallEvent().deputyCountChange(), new e30() { // from class: l.mc10
            @Override // p149l.e30
            public final void call(Object obj) {
                pc10.m168273e4(this.f133080a, (Integer) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t4 */
    public final void m168299t4() {
        m206028F2().MultiCallEvent.prepareCloseMultiCall().mo172463j(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: u4 */
    public final BLiveMultiCall m168300u4(List<? extends BLiveMultiCall> calls) {
        return (BLiveMultiCall) vwb.m200346r(calls, new w9j() { // from class: l.nc10
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return pc10.m168281m4(this.f138088a, (BLiveMultiCall) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v4 */
    public final String m168301v4(BLiveMultiCall call) {
        return r610.m177968C(this.coreModule.m139803e4(), TextUtils.equals(call.ownerRoomId, m206027E2().m149818o()));
    }

    @Override // p149l.zi2
    @NotNull
    /* JADX INFO: renamed from: w4, reason: merged with bridge method [inline-methods] */
    public ob10 mo75679K3() {
        Act act = this.f188512e.f77095a;
        act.getClass();
        return new ob10(act);
    }

    /* JADX INFO: renamed from: x4 */
    public final void m168303x4(BLiveMultiCall call) {
        String strM168301v4 = m168301v4(call);
        ((ob10) this.viewModel).m163405S(call, strM168301v4, this.coreModule.m139800b4().m100374t());
        Pair<String, Boolean> pairM177971F = r610.m177971F(call, strM168301v4);
        if (pairM177971F == null) {
            return;
        }
        m168304y4(call, pairM177971F);
        if (ve10.m198138l((String) pairM177971F.first) || ve10.m198130d((String) pairM177971F.first)) {
            exl exlVar = (exl) m129297F3(new jw00(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED));
            String str = call.userId;
            str.getClass();
            int i = Integer.parseInt(str);
            Object obj = pairM177971F.second;
            obj.getClass();
            exlVar.mo118676Y(i, ((Boolean) obj).booleanValue());
            f110 f110Var = (f110) ((oxl) m129297F3(new rv00(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED))).mo133471a().m71891T0(f110.class);
            String str2 = call.userId;
            Object obj2 = pairM177971F.second;
            obj2.getClass();
            f110Var.m119090L1(str2, ((Boolean) obj2).booleanValue());
            return;
        }
        if (ve10.m198131e((String) pairM177971F.first)) {
            exl exlVar2 = (exl) m129297F3(new jw00(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED));
            Object obj3 = pairM177971F.second;
            obj3.getClass();
            exlVar2.mo118681p(((Boolean) obj3).booleanValue());
            return;
        }
        if (ve10.m198134h((String) pairM177971F.first)) {
            exl exlVar3 = (exl) m129297F3(new jw00(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED));
            Object obj4 = pairM177971F.second;
            obj4.getClass();
            exlVar3.mo118679n(((Boolean) obj4).booleanValue());
        }
    }

    /* JADX INFO: renamed from: y4 */
    public final void m168304y4(BLiveMultiCall call, Pair<String, Boolean> type) {
        String strM202218u;
        if (ve10.m198139m((String) type.first)) {
            strM202218u = w8u.m202218u(((Boolean) type.second).booleanValue() ? R$string.f47144b8 : R$string.f47080Y8, call.userName);
        } else if (ve10.m198131e((String) type.first) || ve10.m198138l((String) type.first) || ve10.m198130d((String) type.first)) {
            strM202218u = w8u.m202218u(((Boolean) type.second).booleanValue() ? R$string.f47122a8 : R$string.f47059X8, call.userName);
        } else if (ve10.m198134h((String) type.first)) {
            strM202218u = w8u.m202218u(((Boolean) type.second).booleanValue() ? R$string.f47188d8 : R$string.f47101Z8, call.userName);
        } else {
            strM202218u = "";
        }
        if (TextUtils.isEmpty(strM202218u)) {
            return;
        }
        lsi0.m151595y(strM202218u);
    }

    /* JADX INFO: renamed from: z4 */
    public final void m168305z4(@NotNull String id) {
        id.getClass();
        C22306c<T> c22306cDuringCreated = duringCreated(LivingNormalApiProvider.m71447e6(id, "anchor-close-multi"));
        final Function1 function1 = new Function1() { // from class: l.xb10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return pc10.m168282n4(this.f191861a, (BLiveMultiCall) obj);
            }
        };
        c22306cDuringCreated.doOnNext(new e30() { // from class: l.yb10
            @Override // p149l.e30
            public final void call(Object obj) {
                pc10.m168264V3(function1, obj);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.zb10
            @Override // p149l.e30
            public final void call(Object obj) {
                pc10.m168274f4((BLiveMultiCall) obj);
            }
        }));
    }
}
