package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveActivity;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftMultiCall;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftMultiCallGiftRole;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u000e\u0010\r\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ-\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\t0\u001dj\b\u0012\u0004\u0012\u00020\t`\u001e2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u001bH\u0007¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010!\u001a\u00020\u00122\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b!\u0010\u0014J'\u0010$\u001a\u00020#2\u000e\u0010\r\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\f2\u0006\u0010\"\u001a\u00020\u0012H\u0007¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b&\u0010'¨\u0006("}, m87232d2 = {"Ll/l610;", "", "<init>", "()V", "Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;", "call", "Ll/mnj;", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;)Ll/mnj;", "Ll/mlj;", "e", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;)Ll/mlj;", "Ll/h4t;", "presenter", "Ll/q44;", "f", "(Ll/h4t;)Ll/q44;", BLiveActivity.TYPE_MULTI_CALL, "", "g", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;)Ljava/lang/String;", "Ll/ho2;", "liveData", "multiCallInfo", "Lcom/p1/mobile/putong/live/base/data/BLiveGiftMultiCall;", "b", "(Ll/ho2;Ll/q44;)Lcom/p1/mobile/putong/live/base/data/BLiveGiftMultiCall;", "", "multiCalls", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "a", "(Ljava/util/List;)Ljava/util/ArrayList;", "h", "giftSource", "", RXScreenCaptureService.KEY_INDEX, "(Ll/h4t;Ljava/lang/String;)V", "c", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;)Ll/q44;", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class l610 {

    @NotNull
    public static final l610 INSTANCE = new l610();

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final ArrayList<mlj> m148685a(@NotNull List<? extends BLiveMultiCall> multiCalls) {
        multiCalls.getClass();
        ArrayList<mlj> arrayList = new ArrayList<>();
        Iterator<T> it = multiCalls.iterator();
        while (it.hasNext()) {
            mlj mljVarM148688e = m148688e((BLiveMultiCall) it.next());
            mljVarM148688e.f134440a = false;
            mljVarM148688e.f134441b = null;
            mljVarM148688e.f134442c = false;
            arrayList.add(mljVarM148688e);
        }
        return arrayList;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final BLiveGiftMultiCall m148686b(@NotNull ho2 liveData, @NotNull q44 multiCallInfo) {
        liveData.getClass();
        multiCallInfo.getClass();
        BLiveGiftMultiCall bLiveGiftMultiCallNew_ = BLiveGiftMultiCall.new_();
        bLiveGiftMultiCallNew_.callId = multiCallInfo.f152537a;
        BLiveGiftMultiCallGiftRole bLiveGiftMultiCallGiftRoleNew_ = BLiveGiftMultiCallGiftRole.new_();
        bLiveGiftMultiCallGiftRoleNew_.roomIdRoleIn = liveData.m149818o();
        bLiveGiftMultiCallGiftRoleNew_.liveIdRoleIn = liveData.m149814k();
        bLiveGiftMultiCallNew_.givenGiftRole = bLiveGiftMultiCallGiftRoleNew_;
        BLiveGiftMultiCallGiftRole bLiveGiftMultiCallGiftRoleNew_2 = BLiveGiftMultiCallGiftRole.new_();
        bLiveGiftMultiCallGiftRoleNew_2.position = String.valueOf(multiCallInfo.f152540d);
        bLiveGiftMultiCallGiftRoleNew_2.role = multiCallInfo.f152541e;
        bLiveGiftMultiCallGiftRoleNew_2.roomIdRoleIn = multiCallInfo.f152542f;
        bLiveGiftMultiCallGiftRoleNew_2.liveIdRoleIn = multiCallInfo.f152543g;
        bLiveGiftMultiCallNew_.receiveGiftRole = bLiveGiftMultiCallGiftRoleNew_2;
        return bLiveGiftMultiCallNew_;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final mnj m148687d(@NotNull BLiveMultiCall call) {
        call.getClass();
        mnj mnjVarM155523d = new mnj.C18509a().m155525f(m148688e(call)).m155523d();
        mnjVarM155523d.getClass();
        return mnjVarM155523d;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final mlj m148688e(@NotNull BLiveMultiCall call) {
        call.getClass();
        mlj mljVarM155152a = mlj.m155152a(new i54(call.userId, call.userName, call.userAvatar), INSTANCE.m148693c(call));
        mljVarM155152a.f134446g = m148690g(call);
        return mljVarM155152a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: f */
    public static final q44 m148689f(@NotNull h4t<?, ?> presenter) {
        presenter.getClass();
        String str = presenter.m206027E2().m132146l0().f56011id;
        str.getClass();
        BLiveMultiCall bLiveMultiCallM177970E = r610.m177970E(presenter, str);
        if (bLiveMultiCallM177970E != null) {
            return INSTANCE.m148693c(bLiveMultiCallM177970E);
        }
        return null;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: g */
    public static final String m148690g(@NotNull BLiveMultiCall multiCall) {
        multiCall.getClass();
        String str = multiCall.role;
        if (Intrinsics.m87488d(str, s410.f162238d)) {
            return "multiCallOwner";
        }
        if (Intrinsics.m87488d(str, s410.f162239e)) {
            return "multiCallAnchor";
        }
        return Intrinsics.m87488d(str, s410.f162240f) ? "multiCallAudience" : "";
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: h */
    public static final String m148691h(@Nullable BLiveMultiCall call) {
        return (ve10.m198136j(call) || ve10.m198128b(call)) ? "gift-audience-none-multiCallAnchor" : "gift-audience-none-multiCallAudience";
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r2v0, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.ho2] */
    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static final void m148692i(@NotNull h4t<?, ?> presenter, @NotNull String giftSource) {
        presenter.getClass();
        giftSource.getClass();
        String str = presenter.m206027E2().m132146l0().f56011id;
        str.getClass();
        presenter.m206027E2().m132055A1(new evj.C16689a(presenter.m206027E2().m149818o(), str, giftSource).m118277f(), null);
    }

    /* JADX INFO: renamed from: c */
    public final q44 m148693c(BLiveMultiCall call) {
        q44 q44VarM172922b = q44.m172922b(call.f44400id, m148691h(call), call.position);
        q44VarM172922b.f152542f = call.roomId;
        q44VarM172922b.f152543g = call.liveId;
        q44VarM172922b.f152541e = call.role;
        return q44VarM172922b;
    }
}
