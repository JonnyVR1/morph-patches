package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveActivity;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftMultiCall;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftMultiCallGiftRole;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
@Metadata(m88120d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u000e\u0010\r\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ-\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\t0\u001dj\b\u0012\u0004\u0012\u00020\t`\u001e2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u001bH\u0007¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010!\u001a\u00020\u00122\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b!\u0010\u0014J'\u0010$\u001a\u00020#2\u000e\u0010\r\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\f2\u0006\u0010\"\u001a\u00020\u0012H\u0007¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b&\u0010'¨\u0006("}, m88121d2 = {"Ll/ve10;", "", "<init>", "()V", "Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;", "call", "Ll/cqj;", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;)Ll/cqj;", "Ll/coj;", "e", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;)Ll/coj;", "Ll/i6t;", "presenter", "Ll/p54;", "f", "(Ll/i6t;)Ll/p54;", BLiveActivity.TYPE_MULTI_CALL, "", "g", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;)Ljava/lang/String;", "Ll/oo2;", "liveData", "multiCallInfo", "Lcom/p1/mobile/putong/live/base/data/BLiveGiftMultiCall;", "b", "(Ll/oo2;Ll/p54;)Lcom/p1/mobile/putong/live/base/data/BLiveGiftMultiCall;", "", "multiCalls", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "a", "(Ljava/util/List;)Ljava/util/ArrayList;", "h", "giftSource", "", RXScreenCaptureService.KEY_INDEX, "(Ll/i6t;Ljava/lang/String;)V", "c", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;)Ll/p54;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class ve10 {

    @NotNull
    public static final ve10 INSTANCE = new ve10();

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final ArrayList<coj> m201022a(@NotNull List<? extends BLiveMultiCall> multiCalls) {
        multiCalls.getClass();
        ArrayList<coj> arrayList = new ArrayList<>();
        Iterator<T> it = multiCalls.iterator();
        while (it.hasNext()) {
            coj cojVarM201025e = m201025e((BLiveMultiCall) it.next());
            cojVarM201025e.f82885a = false;
            cojVarM201025e.f82886b = null;
            cojVarM201025e.f82887c = false;
            arrayList.add(cojVarM201025e);
        }
        return arrayList;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final BLiveGiftMultiCall m201023b(@NotNull oo2 liveData, @NotNull p54 multiCallInfo) {
        liveData.getClass();
        multiCallInfo.getClass();
        BLiveGiftMultiCall bLiveGiftMultiCallNew_ = BLiveGiftMultiCall.new_();
        bLiveGiftMultiCallNew_.callId = multiCallInfo.f150592a;
        BLiveGiftMultiCallGiftRole bLiveGiftMultiCallGiftRoleNew_ = BLiveGiftMultiCallGiftRole.new_();
        bLiveGiftMultiCallGiftRoleNew_.roomIdRoleIn = liveData.m202194o();
        bLiveGiftMultiCallGiftRoleNew_.liveIdRoleIn = liveData.m202191k();
        bLiveGiftMultiCallNew_.givenGiftRole = bLiveGiftMultiCallGiftRoleNew_;
        BLiveGiftMultiCallGiftRole bLiveGiftMultiCallGiftRoleNew_2 = BLiveGiftMultiCallGiftRole.new_();
        bLiveGiftMultiCallGiftRoleNew_2.position = String.valueOf(multiCallInfo.f150595d);
        bLiveGiftMultiCallGiftRoleNew_2.role = multiCallInfo.f150596e;
        bLiveGiftMultiCallGiftRoleNew_2.roomIdRoleIn = multiCallInfo.f150597f;
        bLiveGiftMultiCallGiftRoleNew_2.liveIdRoleIn = multiCallInfo.f150598g;
        bLiveGiftMultiCallNew_.receiveGiftRole = bLiveGiftMultiCallGiftRoleNew_2;
        return bLiveGiftMultiCallNew_;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final cqj m201024d(@NotNull BLiveMultiCall call) {
        call.getClass();
        cqj cqjVarM111923d = new cqj.C16337a().m111925f(m201025e(call)).m111923d();
        cqjVarM111923d.getClass();
        return cqjVarM111923d;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final coj m201025e(@NotNull BLiveMultiCall call) {
        call.getClass();
        coj cojVarM111659a = coj.m111659a(new h64(call.userId, call.userName, call.userAvatar), INSTANCE.m201030c(call));
        cojVarM111659a.f82891g = m201027g(call);
        return cojVarM111659a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: f */
    public static final p54 m201026f(@NotNull i6t<?, ?> presenter) {
        presenter.getClass();
        String str = presenter.m213810E2().m168532l0().f56859id;
        str.getClass();
        BLiveMultiCall bLiveMultiCallM103799E = bf10.m103799E(presenter, str);
        if (bLiveMultiCallM103799E != null) {
            return INSTANCE.m201030c(bLiveMultiCallM103799E);
        }
        return null;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: g */
    public static final String m201027g(@NotNull BLiveMultiCall multiCall) {
        multiCall.getClass();
        String str = multiCall.role;
        if (Intrinsics.m88377d(str, cd10.f81076d)) {
            return "multiCallOwner";
        }
        if (Intrinsics.m88377d(str, cd10.f81077e)) {
            return "multiCallAnchor";
        }
        return Intrinsics.m88377d(str, cd10.f81078f) ? "multiCallAudience" : "";
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: h */
    public static final String m201028h(@Nullable BLiveMultiCall call) {
        return (fn10.m126342j(call) || fn10.m126334b(call)) ? "gift-audience-none-multiCallAnchor" : "gift-audience-none-multiCallAudience";
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r2v0, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.oo2] */
    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static final void m201029i(@NotNull i6t<?, ?> presenter, @NotNull String giftSource) {
        presenter.getClass();
        giftSource.getClass();
        String str = presenter.m213810E2().m168532l0().f56859id;
        str.getClass();
        presenter.m213810E2().m168445A1(new uxj.C20693a(presenter.m213810E2().m202194o(), str, giftSource).m198494f(), null);
    }

    /* JADX INFO: renamed from: c */
    public final p54 m201030c(BLiveMultiCall call) {
        p54 p54VarM170592b = p54.m170592b(call.f45248id, m201028h(call), call.position);
        p54VarM170592b.f150597f = call.roomId;
        p54VarM170592b.f150598g = call.liveId;
        p54VarM170592b.f150596e = call.role;
        return p54VarM170592b;
    }
}
