package p149l;

import android.text.TextUtils;
import android.view.View;
import androidx.annotation.StringRes;
import com.facebook.AuthenticationTokenClaims;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.data.DetectCategoryType;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.LiveDialogAct;
import com.p046p1.mobile.putong.live.base.data.BLiveAnchor;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationClickAction;
import com.p046p1.mobile.putong.live.base.data.BLiveStartPageTemplate;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.BLiveType;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p046p1.mobile.putong.live.livingroom.virtual.preview.VoiceVirtualPreviewPresenter;
import com.p046p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import com.p046p1.mobile.putong.util.AntiSpamHelper;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B!\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0014\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0011\u001a\u00020\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001c\u0010\u0017J\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b#\u0010!J\u0017\u0010%\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\"H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\rH\u0002¢\u0006\u0004\b'\u0010\u0017J\u001f\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u001f2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020(0\u001f2\u0006\u0010$\u001a\u00020\"H\u0002¢\u0006\u0004\b,\u0010-J\u001f\u00101\u001a\u00020\r2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\tH\u0002¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\rH\u0002¢\u0006\u0004\b3\u0010\u0017J\u000f\u00104\u001a\u00020\rH\u0002¢\u0006\u0004\b4\u0010\u0017J\u0017\u00105\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b5\u00106J\u0019\u00108\u001a\u00020\r2\b\b\u0001\u00107\u001a\u00020\u000bH\u0002¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020\r2\u0006\u0010:\u001a\u00020(H\u0002¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\rH\u0016¢\u0006\u0004\b=\u0010\u0017J\u0015\u0010?\u001a\u00020\r2\u0006\u0010>\u001a\u00020\u001d¢\u0006\u0004\b?\u0010@J\u0017\u0010B\u001a\u00020\r2\b\u0010A\u001a\u0004\u0018\u00010(¢\u0006\u0004\bB\u0010<J\u0015\u0010C\u001a\u00020\r2\u0006\u0010$\u001a\u00020\"¢\u0006\u0004\bC\u0010DJ\r\u0010E\u001a\u00020\t¢\u0006\u0004\bE\u0010FJ\r\u0010G\u001a\u00020\r¢\u0006\u0004\bG\u0010\u0017J\u0015\u0010H\u001a\u00020\r2\u0006\u0010$\u001a\u00020\"¢\u0006\u0004\bH\u0010DJ\r\u0010I\u001a\u00020\r¢\u0006\u0004\bI\u0010\u0017J\r\u0010J\u001a\u00020\r¢\u0006\u0004\bJ\u0010\u0017J\u0015\u0010L\u001a\u00020\r2\u0006\u0010K\u001a\u00020\t¢\u0006\u0004\bL\u00106J\u000f\u0010M\u001a\u00020\rH\u0016¢\u0006\u0004\bM\u0010\u0017R\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR8\u0010T\u001a&\u0012\f\u0012\n Q*\u0004\u0018\u00010\u001d0\u001d Q*\u0012\u0012\f\u0012\n Q*\u0004\u0018\u00010\u001d0\u001d\u0018\u00010P0P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR8\u0010V\u001a&\u0012\f\u0012\n Q*\u0004\u0018\u00010\"0\" Q*\u0012\u0012\f\u0012\n Q*\u0004\u0018\u00010\"0\"\u0018\u00010P0P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010SR8\u0010Y\u001a&\u0012\f\u0012\n Q*\u0004\u0018\u00010W0W Q*\u0012\u0012\f\u0012\n Q*\u0004\u0018\u00010W0W\u0018\u00010P0P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010SR\u0014\u0010]\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0018\u0010`\u001a\u0004\u0018\u00010^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010_¨\u0006a"}, m87232d2 = {"Ll/w2p0;", "Ll/pat;", "Ll/nnn0;", "Lcom/p1/mobile/putong/live/livingroom/virtual/preview/VoiceVirtualPreviewPresenter;", "previewPresenter", "Ll/bsm;", BaseSei.INFO, "<init>", "(Lcom/p1/mobile/putong/live/livingroom/virtual/preview/VoiceVirtualPreviewPresenter;Ll/bsm;)V", "", "liveId", "", "type", "", "i5", "(Ljava/lang/String;I)V", "content", "button", "Ll/d30;", "action0", "n5", "(Ljava/lang/String;Ljava/lang/String;Ll/d30;)V", "V4", "()V", "Lcom/p1/mobile/putong/data/User;", "user", "l5", "(Lcom/p1/mobile/putong/data/User;)V", "c5", "", "isRecover", "Lrx/c;", "W4", "(Z)Lrx/c;", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceRoom;", "z5", "room", BLiveOperationClickAction.f44417h5, "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceRoom;)Z", "y5", "Lcom/p1/mobile/putong/live/base/data/BLiveVoice;", "bLiveVoice", "m5", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoice;)Lrx/c;", "k5", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceRoom;)Lrx/c;", "", "throwable", "from", "f5", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "q5", "w5", "Z4", "(Ljava/lang/String;)V", ShareConstants.RES_PATH, "Y4", "(I)V", BLiveType.voiceLive, "b5", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoice;)V", j6f.GPS_DIRECTION_TRUE, "recover", "v5", "(Z)V", "live", "t5", "u5", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceRoom;)V", "d5", "()Ljava/lang/String;", "e5", "s5", "a5", "j5", "roomId", "X4", "n", RXScreenCaptureService.KEY_INDEX, "Lcom/p1/mobile/putong/live/livingroom/virtual/preview/VoiceVirtualPreviewPresenter;", "Lrx/subjects/a;", "kotlin.jvm.PlatformType", "j", "Lrx/subjects/a;", "ongoingLiveBs", "k", "roomBs", "Ll/roj0;", BLiveStormDanmakuGiftResourceType.f44444l, "selectBs", "Ll/qho0;", "m", "Ll/qho0;", "previewInfo", "Ll/c4g0;", "Ll/c4g0;", "controlMessageSub", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class w2p0 extends pat<nnn0> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final VoiceVirtualPreviewPresenter<?> previewPresenter;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public final C22392a<Boolean> ongoingLiveBs;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final C22392a<BLiveVoiceRoom> roomBs;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public final C22392a<roj0> selectBs;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final qho0 previewInfo;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public c4g0 controlMessageSub;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2p0(@NotNull VoiceVirtualPreviewPresenter<?> voiceVirtualPreviewPresenter, @Nullable bsm<?> bsmVar) {
        super(bsmVar);
        voiceVirtualPreviewPresenter.getClass();
        this.previewPresenter = voiceVirtualPreviewPresenter;
        this.ongoingLiveBs = C22392a.m221512b();
        this.roomBs = C22392a.m221512b();
        this.selectBs = C22392a.m221512b();
        this.previewInfo = new qho0();
    }

    /* JADX INFO: renamed from: A4 */
    public static C22306c m201120A4(Function1 function1, Object obj) {
        return (C22306c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: B4 */
    public static void m201121B4(w2p0 w2p0Var, soj0 soj0Var) {
        w2p0Var.m201196a5();
    }

    /* JADX INFO: renamed from: C4 */
    public static Unit m201122C4(w2p0 w2p0Var, BLiveVoiceRoom bLiveVoiceRoom) {
        bLiveVoiceRoom.getClass();
        w2p0Var.previewInfo.m174579c(bLiveVoiceRoom);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D4 */
    public static C22306c m201123D4(Function1 function1, Object obj) {
        return (C22306c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: E4 */
    public static void m201124E4(w2p0 w2p0Var, Throwable th) {
        th.getClass();
        w2p0Var.m201201f5(th, "addSubscribe");
    }

    /* JADX INFO: renamed from: F4 */
    public static C22306c m201125F4(BLiveVoice bLiveVoice, BLiveVoice bLiveVoice2) {
        return bLiveVoice == BLiveVoice.EMPTY ? C22306c.just(null) : hrv.m132734Q(bLiveVoice.f44323id);
    }

    /* JADX INFO: renamed from: G4 */
    public static Unit m201126G4(w2p0 w2p0Var, BLiveVoice bLiveVoice) {
        bLiveVoice.getClass();
        w2p0Var.previewInfo.m174578b(bLiveVoice);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H4 */
    public static C22306c m201127H4(w2p0 w2p0Var, BLiveStartPageTemplate bLiveStartPageTemplate, BLiveVoiceRoom bLiveVoiceRoom) {
        bLiveVoiceRoom.getClass();
        if (bLiveVoiceRoom == BLiveVoiceRoom.EMPTY_ROOM) {
            return C22306c.just(BLiveVoice.EMPTY);
        }
        BLiveVoice bLiveVoice = w2p0Var.previewInfo.f154501a;
        if (bLiveVoice != null) {
            return C22306c.just(bLiveVoice);
        }
        String str = bLiveVoiceRoom.f44324id;
        boolean zM77283m4 = w2p0Var.previewPresenter.m77283m4();
        D dM206027E2 = w2p0Var.m206027E2();
        dM206027E2.getClass();
        return hrv.m132758t(str, zM77283m4, ((nnn0) dM206027E2).f139757a0, bLiveStartPageTemplate.liveMode, bLiveStartPageTemplate.template, bLiveStartPageTemplate.gameType);
    }

    /* JADX INFO: renamed from: J3 */
    public static void m201129J3(w2p0 w2p0Var, Throwable th) {
        th.getClass();
        w2p0Var.m201201f5(th, "prepareUser");
    }

    /* JADX INFO: renamed from: J4 */
    public static Boolean m201130J4(Function2 function2, Object obj, Object obj2) {
        return (Boolean) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: K3 */
    public static void m201131K3(w2p0 w2p0Var, User user) {
        hfw.m130790a("[live][virtual_voice]", "prepare live success。user is null : " + (user == null));
        w2p0Var.m201205l5(user);
        w2p0Var.m201198c5();
    }

    /* JADX INFO: renamed from: K4 */
    public static void m201132K4(w2p0 w2p0Var, Throwable th) {
        th.getClass();
        w2p0Var.m201201f5(th, "updateRoom");
    }

    /* JADX INFO: renamed from: L3 */
    public static void m201133L3(w2p0 w2p0Var, List list) {
        if (list.isEmpty()) {
            LiveDialogAct.m67177g2(w2p0Var.act(), "", w8u.m202217t(R$string.f47230f6));
            return;
        }
        Object objFirst = CollectionsKt.first((List<? extends Object>) list);
        objFirst.getClass();
        w2p0Var.m201197b5((BLiveVoice) objFirst);
    }

    /* JADX INFO: renamed from: L4 */
    public static C22306c m201134L4(Function1 function1, Object obj) {
        return (C22306c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: M3 */
    public static Boolean m201135M3(Boolean bool, roj0 roj0Var) {
        return bool;
    }

    /* JADX INFO: renamed from: M4 */
    public static BLiveVoice m201136M4(Throwable th) {
        return BLiveVoice.EMPTY;
    }

    /* JADX INFO: renamed from: N3 */
    public static void m201137N3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: O3 */
    public static C22306c m201139O3(Function1 function1, Object obj) {
        return (C22306c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: P3 */
    public static void m201141P3(w2p0 w2p0Var, Throwable th) {
        th.getClass();
        w2p0Var.m201201f5(th, "createVoiceLive");
    }

    /* JADX INFO: renamed from: P4 */
    public static BLiveVoiceRoom m201142P4(Pair pair) {
        return (BLiveVoiceRoom) pair.getFirst();
    }

    /* JADX INFO: renamed from: Q4 */
    public static BLiveVoiceRoom m201143Q4(Function1 function1, Object obj) {
        return (BLiveVoiceRoom) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: R3 */
    public static Boolean m201144R3(roj0 roj0Var) {
        roj0Var.getClass();
        return Boolean.FALSE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R4 */
    public static Boolean m201145R4(w2p0 w2p0Var, Boolean bool) {
        D dM206027E2 = w2p0Var.m206027E2();
        dM206027E2.getClass();
        return Boolean.valueOf(!((nnn0) dM206027E2).m149816m().m137803j());
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e1  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S4 */
    public static void m201147S4(w2p0 w2p0Var, LiveControlMessage liveControlMessage) {
        String str;
        nnn0 nnn0Var;
        Act act;
        hfw.m130790a("[live][virtual_voice]", "controlMessageSub:type=" + liveControlMessage.type);
        String str2 = liveControlMessage.type;
        if (str2 != null) {
            switch (str2.hashCode()) {
                case -2140406257:
                    if (!str2.equals("add_manager")) {
                    }
                    D dM206027E2 = w2p0Var.m206027E2();
                    dM206027E2.getClass();
                    D dM206027E3 = w2p0Var.m206027E2();
                    dM206027E3.getClass();
                    ((nnn0) dM206027E2).mo132074K1(((nnn0) dM206027E3).m149814k());
                    break;
                case -887328209:
                    if (str2.equals("system")) {
                        String str3 = liveControlMessage.content;
                        String strM202217t = w8u.m202217t(R$string.f47646y5);
                        strM202217t.getClass();
                        m201175o5(w2p0Var, str3, strM202217t, null, 4, null);
                        break;
                    }
                    break;
                case -866625755:
                    if (str2.equals("re_request_room_gift_list")) {
                        wrj.m205257w(false);
                        nnn0 nnn0Var2 = (nnn0) w2p0Var.m206027E2();
                        if (nnn0Var2 != null) {
                            nnn0Var2.m132055A1(new evj.C16689a(nnn0Var2.m149818o(), nnn0Var2.m132146l0().f56011id, "live").m118277f(), null);
                        }
                        break;
                    }
                    break;
                case 3029746:
                    if (!str2.equals("boot")) {
                    }
                    str = liveControlMessage.content;
                    str.getClass();
                    if (str.length() > 0) {
                        nnn0Var = (nnn0) w2p0Var.m206027E2();
                        if (nnn0Var != null) {
                            nnn0 nnn0Var3 = (nnn0) w2p0Var.m206027E2();
                            nnn0Var.m132132g2(nnn0Var3 != null ? nnn0Var3.mo149813j() : null);
                        }
                        act = w2p0Var.act();
                        if (act != null) {
                            act.m66873d2();
                        }
                        LiveDialogAct.m67177g2(w2p0Var.act(), "", liveControlMessage.content);
                    }
                    break;
                case 3540994:
                    if (str2.equals("stop")) {
                        w2p0Var.m201194Y4(R$string.f47230f6);
                        break;
                    }
                    break;
                case 109757538:
                    if (str2.equals("start")) {
                        String str4 = liveControlMessage.liveId;
                        str4.getClass();
                        w2p0Var.m201167i5(str4, 2);
                        w2p0Var.m206028F2().BottomZoneEvent.refreshAllButton().m172467p();
                        break;
                    }
                    break;
                case 134762710:
                    if (!str2.equals("force_stop")) {
                    }
                    str = liveControlMessage.content;
                    str.getClass();
                    if (str.length() > 0) {
                        nnn0Var = (nnn0) w2p0Var.m206027E2();
                        if (nnn0Var != null) {
                            nnn0 nnn0Var4 = (nnn0) w2p0Var.m206027E2();
                            nnn0Var.m132132g2(nnn0Var4 != null ? nnn0Var4.mo149813j() : null);
                        }
                        act = w2p0Var.act();
                        if (act != null) {
                            act.m66873d2();
                        }
                        LiveDialogAct.m67177g2(w2p0Var.act(), "", liveControlMessage.content);
                    }
                    break;
                case 379400585:
                    if (str2.equals("forbidden_multidevice")) {
                        String strM202217t2 = w8u.m202217t(liveControlMessage.isAnchor ? R$string.f46972T5 : R$string.f46930R5);
                        D dM206027E4 = w2p0Var.m206027E2();
                        dM206027E4.getClass();
                        D dM206027E5 = w2p0Var.m206027E2();
                        dM206027E5.getClass();
                        ((nnn0) dM206027E4).m132132g2(((nnn0) dM206027E5).mo149813j());
                        Act act2 = w2p0Var.act();
                        act2.getClass();
                        act2.m66873d2();
                        LiveDialogAct.m67177g2(w2p0Var.act(), "", strM202217t2);
                        break;
                    }
                    break;
                case 1075863833:
                    if (str2.equals("delete_manager")) {
                        D dM206027E6 = w2p0Var.m206027E2();
                        dM206027E6.getClass();
                        D dM206027E7 = w2p0Var.m206027E2();
                        dM206027E7.getClass();
                        ((nnn0) dM206027E6).mo132074K1(((nnn0) dM206027E7).m149814k());
                        break;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: T3 */
    public static void m201148T3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: T4 */
    public static User m201149T4(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: U3 */
    public static C22306c m201150U3(w2p0 w2p0Var, Boolean bool) {
        bool.getClass();
        return w2p0Var.m201213z5(bool.booleanValue());
    }

    /* JADX INFO: renamed from: U4 */
    public static void m201151U4(w2p0 w2p0Var, User user) {
        w2p0Var.m201212y5();
    }

    /* JADX INFO: renamed from: V3 */
    public static Boolean m201152V3(Function2 function2, Object obj, Object obj2) {
        return (Boolean) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: W3 */
    public static C22306c m201153W3(w2p0 w2p0Var, boolean z, Boolean bool) {
        return w2p0Var.m201192W4(z);
    }

    /* JADX INFO: renamed from: X3 */
    public static Boolean m201154X3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Y3 */
    public static void m201155Y3(w2p0 w2p0Var) {
        Act act = w2p0Var.act();
        if (act != null) {
            act.m66873d2();
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public static void m201156Z3(w2p0 w2p0Var, BLiveAnchor bLiveAnchor) {
        final Act act;
        bLiveAnchor.getClass();
        if (!TEnum.equals(bLiveAnchor.status, "jailed") || (act = w2p0Var.act()) == null) {
            return;
        }
        act.dialog().m20504F(w8u.m202218u(R$string.f47213eb, mqi0.m155945p(bLiveAnchor.availableTime))).m20496B(false).m20560v0(w8u.m202217t(R$string.f47646y5), new Runnable() { // from class: l.r2p0
            @Override // java.lang.Runnable
            public final void run() {
                w2p0.m201181r5(act);
            }
        }).m20568z0();
    }

    /* JADX INFO: renamed from: a4 */
    public static void m201157a4(w2p0 w2p0Var, Throwable th) {
        th.getClass();
        w2p0Var.m201201f5(th, "resolveForbidden");
    }

    /* JADX INFO: renamed from: b4 */
    public static C22306c m201158b4(Function1 function1, Object obj) {
        return (C22306c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: c4 */
    public static C22306c m201159c4(Function1 function1, Object obj) {
        return (C22306c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: d4 */
    public static Unit m201160d4(w2p0 w2p0Var, Pair pair) {
        w2p0Var.previewPresenter.m77286r4((BLiveUserMask) pair.getSecond());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e4 */
    public static Unit m201161e4(w2p0 w2p0Var, User user) {
        w2p0Var.previewInfo.m174577a(user);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f4 */
    public static void m201162f4(w2p0 w2p0Var, Throwable th) {
        th.getClass();
        w2p0Var.m201201f5(th, "prepareLive");
    }

    /* JADX INFO: renamed from: g4 */
    public static void m201163g4(w2p0 w2p0Var, Throwable th) {
        th.getClass();
        w2p0Var.m201201f5(th, "autoStartLive");
    }

    /* JADX INFO: renamed from: g5 */
    public static final void m201164g5(d30 d30Var) {
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h4 */
    public static void m201165h4(w2p0 w2p0Var, int i, r8d0 r8d0Var) {
        D dM206027E2 = w2p0Var.m206027E2();
        dM206027E2.getClass();
        ((nnn0) dM206027E2).mo132090S(r8d0Var);
        D dM206027E3 = w2p0Var.m206027E2();
        dM206027E3.getClass();
        BLiveVoice bLiveVoiceMo165470l = ((nnn0) dM206027E3).m160247O2().mo165470l();
        bLiveVoiceMo165470l.getClass();
        D dM206027E4 = w2p0Var.m206027E2();
        dM206027E4.getClass();
        ((nnn0) dM206027E4).m132102W(bLiveVoiceMo165470l, i);
    }

    /* JADX INFO: renamed from: i4 */
    public static Unit m201166i4(w2p0 w2p0Var, Boolean bool) {
        Act act = w2p0Var.act();
        act.getClass();
        act.progress(R$string.f47103Za, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i5 */
    private final void m201167i5(String liveId, final int type) {
        m206028F2().BottomZoneEvent.refreshAllButton().m172467p();
        duringCreated(VoiceRoomApiProvider.getLiveInfo(liveId)).subscribe(ffw.m121197h(new e30() { // from class: l.g2p0
            @Override // p149l.e30
            public final void call(Object obj) {
                w2p0.m201165h4(this.f100276a, type, (r8d0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j4 */
    public static void m201168j4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: k4 */
    public static BLiveVoiceRoom m201169k4(Throwable th) {
        return BLiveVoiceRoom.EMPTY_ROOM;
    }

    /* JADX INFO: renamed from: l4 */
    public static C22306c m201170l4(w2p0 w2p0Var, BLiveVoiceRoom bLiveVoiceRoom) {
        bLiveVoiceRoom.getClass();
        return w2p0Var.m201204k5(bLiveVoiceRoom);
    }

    /* JADX INFO: renamed from: m4 */
    public static void m201171m4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: n4 */
    public static Boolean m201172n4(BLiveVoiceRoom bLiveVoiceRoom, Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: n5 */
    private final void m201173n5(String content, String button, final d30 action0) {
        Act act;
        if (content == null || content.length() == 0 || (act = act()) == null) {
            return;
        }
        act.dialog().m20504F(content).m20496B(false).m20544n0(button, new Runnable() { // from class: l.y1p0
            @Override // java.lang.Runnable
            public final void run() {
                w2p0.m201177p5(action0);
            }
        }).m20568z0();
    }

    /* JADX INFO: renamed from: o4 */
    public static void m201174o4(w2p0 w2p0Var, BLiveEnvelope bLiveEnvelope) {
        u4n0.m191754m(w2p0Var);
    }

    /* JADX INFO: renamed from: o5 */
    public static /* synthetic */ void m201175o5(w2p0 w2p0Var, String str, String str2, d30 d30Var, int i, Object obj) {
        if ((i & 4) != 0) {
            d30Var = null;
        }
        w2p0Var.m201173n5(str, str2, d30Var);
    }

    /* JADX INFO: renamed from: p4 */
    public static C22306c m201176p4(BLiveVoice bLiveVoice, BLiveVoiceRoom bLiveVoiceRoom) {
        return hrv.m132734Q(bLiveVoice.f44323id);
    }

    /* JADX INFO: renamed from: p5 */
    public static final void m201177p5(d30 d30Var) {
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: q4 */
    public static void m201178q4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: q5 */
    private final void m201179q5() {
        duringCreated(VoiceRoomApiProvider.getAnchorInfo(ypv.f199493a.m199309D0())).subscribe(ffw.m121194e(new e30() { // from class: l.h2p0
            @Override // p149l.e30
            public final void call(Object obj) {
                w2p0.m201156Z3(this.f105547a, (BLiveAnchor) obj);
            }
        }, new e30() { // from class: l.i2p0
            @Override // p149l.e30
            public final void call(Object obj) {
                w2p0.m201157a4(this.f110573a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r4 */
    public static void m201180r4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: r5 */
    public static final void m201181r5(Act act) {
        Act act2 = act.act();
        act2.getClass();
        act2.m66873d2();
    }

    /* JADX INFO: renamed from: s4 */
    public static Boolean m201182s4(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: t4 */
    public static Pair m201183t4(Function2 function2, Object obj, Object obj2) {
        return (Pair) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: u4 */
    public static C22306c m201184u4(w2p0 w2p0Var, BLiveVoice bLiveVoice) {
        bLiveVoice.getClass();
        return w2p0Var.m201206m5(bLiveVoice);
    }

    /* JADX INFO: renamed from: v4 */
    public static C22306c m201185v4(Function1 function1, Object obj) {
        return (C22306c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: w4 */
    public static Pair m201186w4(BLiveVoiceRoom bLiveVoiceRoom, BLiveUserMask bLiveUserMask) {
        return new Pair(bLiveVoiceRoom, bLiveUserMask);
    }

    /* JADX INFO: renamed from: x4 */
    public static C22306c m201187x4(Function1 function1, Object obj) {
        return (C22306c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: x5 */
    public static final void m201188x5(w2p0 w2p0Var, View view) {
        w2p0Var.m201203j5();
    }

    /* JADX INFO: renamed from: y4 */
    public static C22306c m201189y4(boolean z, w2p0 w2p0Var, Boolean bool) {
        if (z) {
            return C22306c.just(w2p0Var.previewInfo.f154503c);
        }
        String strM77279d4 = w2p0Var.previewPresenter.m77279d4();
        BLiveVoiceRoom bLiveVoiceRoom = w2p0Var.previewInfo.f154503c;
        if (bLiveVoiceRoom != null && !w2p0Var.m201202h5(bLiveVoiceRoom)) {
            return C22306c.just(w2p0Var.previewInfo.f154503c);
        }
        BLiveVoiceRoom bLiveVoiceRoom2 = new BLiveVoiceRoom();
        bLiveVoiceRoom2.title = strM77279d4;
        BLiveVoiceRoom bLiveVoiceRoom3 = w2p0Var.previewInfo.f154503c;
        if (bLiveVoiceRoom3 == null) {
            return hrv.m132759u(bLiveVoiceRoom2);
        }
        bLiveVoiceRoom2.f44324id = bLiveVoiceRoom3.f44324id;
        if (w2p0Var.m201202h5(bLiveVoiceRoom3)) {
            bLiveVoiceRoom2.addField("title,topic");
        }
        bLiveVoiceRoom2.addField("backGroundPicId");
        return hrv.m132726I(w2p0Var.previewInfo.f154503c.f44324id, bLiveVoiceRoom2);
    }

    /* JADX INFO: renamed from: z4 */
    public static Unit m201190z4(w2p0 w2p0Var, Pair pair) {
        w2p0Var.previewInfo.m174579c((BLiveVoiceRoom) pair.getFirst());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        if (m206027E2() == 0) {
            return;
        }
        m201191V4();
        duringCreated(m206028F2().LivePusherEvent.closeLive().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.h1p0
            @Override // p149l.e30
            public final void call(Object obj) {
                w2p0.m201121B4(this.f105448a, (soj0) obj);
            }
        }));
        if (uvr.m196087d().m162660B1()) {
            return;
        }
        D dM206027E2 = m206027E2();
        dM206027E2.getClass();
        this.controlMessageSub = ((nnn0) dM206027E2).m132153n1().subscribe(ffw.m121197h(new e30() { // from class: l.s1p0
            @Override // p149l.e30
            public final void call(Object obj) {
                w2p0.m201147S4(this.f161927a, (LiveControlMessage) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V4 */
    public final void m201191V4() {
        C22392a<BLiveVoiceRoom> c22392a = this.roomBs;
        C22392a<Boolean> c22392a2 = this.ongoingLiveBs;
        final Function2 function2 = new Function2() { // from class: l.t2p0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return w2p0.m201172n4((BLiveVoiceRoom) obj, (Boolean) obj2);
            }
        };
        C22306c c22306cZip = C22306c.zip(c22392a, c22392a2, new x9j() { // from class: l.q0p0
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return w2p0.m201152V3(function2, obj, obj2);
            }
        });
        C22392a<roj0> c22392a3 = this.selectBs;
        final Function2 function3 = new Function2() { // from class: l.r0p0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return w2p0.m201135M3((Boolean) obj, (roj0) obj2);
            }
        };
        C22306c<T> c22306cDuringCreated = duringCreated(C22306c.combineLatest(c22306cZip, c22392a3, new x9j() { // from class: l.s0p0
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return w2p0.m201130J4(function3, obj, obj2);
            }
        }));
        final Function1 function1 = new Function1() { // from class: l.t0p0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w2p0.m201145R4(this.f167203a, (Boolean) obj);
            }
        };
        C22306c c22306cFilter = c22306cDuringCreated.filter(new w9j() { // from class: l.u0p0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return w2p0.m201154X3(function1, obj);
            }
        });
        final Function1 function4 = new Function1() { // from class: l.v0p0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w2p0.m201166i4(this.f179135a, (Boolean) obj);
            }
        };
        C22306c c22306cDoOnNext = c22306cFilter.doOnNext(new e30() { // from class: l.x0p0
            @Override // p149l.e30
            public final void call(Object obj) {
                w2p0.m201171m4(function4, obj);
            }
        });
        final Function1 function5 = new Function1() { // from class: l.y0p0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w2p0.m201150U3(this.f195319a, (Boolean) obj);
            }
        };
        C22306c c22306cFlatMap = c22306cDoOnNext.flatMap(new w9j() { // from class: l.z0p0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return w2p0.m201139O3(function5, obj);
            }
        });
        final Function1 function6 = new Function1() { // from class: l.u2p0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w2p0.m201170l4(this.f173508a, (BLiveVoiceRoom) obj);
            }
        };
        C22306c c22306cFlatMap2 = c22306cFlatMap.flatMap(new w9j() { // from class: l.v2p0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return w2p0.m201187x4(function6, obj);
            }
        });
        final Function1 function7 = new Function1() { // from class: l.m0p0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w2p0.m201184u4(this.f130753a, (BLiveVoice) obj);
            }
        };
        c22306cFlatMap2.flatMap(new w9j() { // from class: l.n0p0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return w2p0.m201158b4(function7, obj);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.o0p0
            @Override // p149l.e30
            public final void call(Object obj) {
                w2p0.m201131K3(this.f141356a, (User) obj);
            }
        }, new e30() { // from class: l.p0p0
            @Override // p149l.e30
            public final void call(Object obj) {
                w2p0.m201124E4(this.f146611a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W4 */
    public final C22306c<Boolean> m201192W4(boolean isRecover) {
        C22306c map;
        if (isRecover) {
            C22306c<Boolean> c22306cJust = C22306c.just(Boolean.TRUE);
            c22306cJust.getClass();
            return c22306cJust;
        }
        BLiveVoiceRoom bLiveVoiceRoom = this.previewInfo.f154503c;
        if (bLiveVoiceRoom == null || !Intrinsics.m87488d(bLiveVoiceRoom.title, this.previewPresenter.m77279d4())) {
            C22306c<roj0> c22306cM80267b = AntiSpamHelper.m80267b(this.f188513f, this.previewPresenter.m77279d4(), DetectCategoryType.get(DetectCategoryType.voice_room_name), AuthenticationTokenClaims.JSON_KEY_NAME, mo77274R2());
            final Function1 function1 = new Function1() { // from class: l.n2p0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return w2p0.m201144R3((roj0) obj);
                }
            };
            map = c22306cM80267b.map(new w9j() { // from class: l.p2p0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return w2p0.m201182s4(function1, obj);
                }
            });
        } else {
            map = C22306c.just(Boolean.FALSE);
        }
        map.getClass();
        return map;
    }

    /* JADX INFO: renamed from: X4 */
    public final void m201193X4(@NotNull String roomId) {
        roomId.getClass();
        duringCreated(VoiceRoomApiProvider.getLatestLive(ypv.f199493a.m199309D0(), roomId)).subscribe(ffw.m121194e(new e30() { // from class: l.l0p0
            @Override // p149l.e30
            public final void call(Object obj) {
                w2p0.m201133L3(this.f125556a, (List) obj);
            }
        }, new e30() { // from class: l.w0p0
            @Override // p149l.e30
            public final void call(Object obj) {
                w2p0.m201163g4(this.f183930a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y4 */
    public final void m201194Y4(@StringRes int res) {
        String strM202217t = w8u.m202217t(res);
        strM202217t.getClass();
        m201195Z4(strM202217t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z4 */
    public final void m201195Z4(String content) {
        oxl oxlVar = (oxl) m129297F3(new rv00(2600));
        if (oxlVar != null) {
            oxlVar.mo133472b();
        }
        D dM206027E2 = m206027E2();
        dM206027E2.getClass();
        if (((nnn0) dM206027E2).m149821s()) {
            return;
        }
        u7s u7sVar = new u7s(content, false);
        D dM206027E3 = m206027E2();
        dM206027E3.getClass();
        ((nnn0) dM206027E3).mo149812h(u7sVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a5 */
    public final void m201196a5() {
        nnn0 nnn0Var = (nnn0) m206027E2();
        if (nnn0Var == null || !nnn0Var.m149816m().m137799f()) {
            m201211w5();
            return;
        }
        Act act = act();
        if (act != null) {
            act.m66873d2();
        }
    }

    /* JADX INFO: renamed from: b5 */
    public final void m201197b5(final BLiveVoice voiceLive) {
        this.previewInfo.m174578b(voiceLive);
        C22306c<BLiveVoiceRoom> roomInfo = VoiceRoomApiProvider.getRoomInfo(ypv.f199493a.m199309D0());
        C22306c<BLiveUserMask> userMask = VoiceRoomApiProvider.getUserMask(ypv.f199493a.m199309D0());
        final Function2 function2 = new Function2() { // from class: l.a1p0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return w2p0.m201186w4((BLiveVoiceRoom) obj, (BLiveUserMask) obj2);
            }
        };
        C22306c c22306cZip = C22306c.zip(roomInfo, userMask, new x9j() { // from class: l.f1p0
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return w2p0.m201183t4(function2, obj, obj2);
            }
        });
        final Function1 function1 = new Function1() { // from class: l.g1p0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w2p0.m201190z4(this.f100192a, (Pair) obj);
            }
        };
        C22306c c22306cDoOnNext = c22306cZip.doOnNext(new e30() { // from class: l.i1p0
            @Override // p149l.e30
            public final void call(Object obj) {
                w2p0.m201178q4(function1, obj);
            }
        });
        final Function1 function3 = new Function1() { // from class: l.j1p0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w2p0.m201160d4(this.f115828a, (Pair) obj);
            }
        };
        C22306c c22306cDoOnNext2 = c22306cDoOnNext.doOnNext(new e30() { // from class: l.k1p0
            @Override // p149l.e30
            public final void call(Object obj) {
                w2p0.m201180r4(function3, obj);
            }
        });
        final Function1 function4 = new Function1() { // from class: l.l1p0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w2p0.m201142P4((Pair) obj);
            }
        };
        C22306c map = c22306cDoOnNext2.map(new w9j() { // from class: l.m1p0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return w2p0.m201143Q4(function4, obj);
            }
        });
        final Function1 function5 = new Function1() { // from class: l.n1p0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w2p0.m201176p4(voiceLive, (BLiveVoiceRoom) obj);
            }
        };
        C22306c c22306cFlatMap = map.flatMap(new w9j() { // from class: l.o1p0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return w2p0.m201134L4(function5, obj);
            }
        });
        final Function1 function6 = new Function1() { // from class: l.b1p0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w2p0.m201161e4(this.f72618a, (User) obj);
            }
        };
        duringCreated(c22306cFlatMap.doOnNext(new e30() { // from class: l.c1p0
            @Override // p149l.e30
            public final void call(Object obj) {
                w2p0.m201137N3(function6, obj);
            }
        })).subscribe(ffw.m121194e(new e30() { // from class: l.d1p0
            @Override // p149l.e30
            public final void call(Object obj) {
                w2p0.m201151U4(this.f83286a, (User) obj);
            }
        }, new e30() { // from class: l.e1p0
            @Override // p149l.e30
            public final void call(Object obj) {
                w2p0.m201141P3(this.f88839a, (Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c5 */
    public final void m201198c5() {
        String strM199309D0 = ypv.f199493a.m199309D0();
        D dM206027E2 = m206027E2();
        dM206027E2.getClass();
        String strM149818o = ((nnn0) dM206027E2).m149818o();
        D dM206027E3 = m206027E2();
        dM206027E3.getClass();
        String strMo132155o0 = ((nnn0) dM206027E3).mo132155o0();
        D dM206027E4 = m206027E2();
        dM206027E4.getClass();
        duringCreated(VoiceRoomApiProvider.getInRoom(strM149818o, strM199309D0, strMo132155o0, "", ((nnn0) dM206027E4).m149826x())).subscribe(ffw.m121197h(new e30() { // from class: l.q2p0
            @Override // p149l.e30
            public final void call(Object obj) {
                w2p0.m201174o4(this.f152285a, (BLiveEnvelope) obj);
            }
        }));
    }

    @NotNull
    /* JADX INFO: renamed from: d5 */
    public final String m201199d5() {
        BLiveVoiceRoom bLiveVoiceRoom = this.previewInfo.f154503c;
        if (bLiveVoiceRoom == null) {
            return "";
        }
        String str = bLiveVoiceRoom.f44324id;
        str.getClass();
        return str;
    }

    /* JADX INFO: renamed from: e5 */
    public final void m201200e5() {
        this.selectBs.m132487l(roj0.f160388a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x0088  */
    /* JADX INFO: renamed from: f5 */
    public final void m201201f5(Throwable throwable, String from) {
        String strM202217t;
        Act act;
        Act act2 = act();
        act2.getClass();
        act2.progressDismiss();
        if (!(throwable instanceof TantanException.Client.CoreService)) {
            if (throwable instanceof AntiSpamHelper.AntispamException) {
                lsi0.m151595y(throwable.getMessage());
                return;
            } else {
                lsi0.m151578h(R$string.f46654E9);
                return;
            }
        }
        TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) throwable;
        int i = coreService.code;
        final d30 d30Var = null;
        switch (i) {
            case 41000:
            case 41002:
                strM202217t = w8u.m202217t(R$string.f47230f6);
                hfw.m130790a("[live][virtual_voice]", "handleError:code=" + i + ";content=" + ((Object) strM202217t) + ":form=" + from);
                if (TextUtils.isEmpty(strM202217t) && (act = act()) != null) {
                    act.dialog().m20504F(strM202217t).m20496B(false).m20560v0(w8u.m202217t(R$string.f47646y5), new Runnable() { // from class: l.s2p0
                        @Override // java.lang.Runnable
                        public final void run() {
                            w2p0.m201164g5(d30Var);
                        }
                    }).m20568z0();
                    break;
                }
                break;
            case 41005:
                strM202217t = w8u.m202217t(R$string.f46713H2);
                hfw.m130790a("[live][virtual_voice]", "handleError:code=" + i + ";content=" + ((Object) strM202217t) + ":form=" + from);
                if (TextUtils.isEmpty(strM202217t)) {
                }
                break;
            case 41008:
            case 41020:
            case 43009:
            case 43014:
            case 43025:
            case 43062:
            case 51013:
                strM202217t = coreService.metaMessage;
                hfw.m130790a("[live][virtual_voice]", "handleError:code=" + i + ";content=" + ((Object) strM202217t) + ":form=" + from);
                if (TextUtils.isEmpty(strM202217t)) {
                }
                break;
            case 41009:
                strM202217t = w8u.m202217t(R$string.f46882P);
                hfw.m130790a("[live][virtual_voice]", "handleError:code=" + i + ";content=" + ((Object) strM202217t) + ":form=" + from);
                if (TextUtils.isEmpty(strM202217t)) {
                }
                break;
            case 41010:
                m201179q5();
                break;
            case 41013:
                lsi0.m151578h(R$string.f47654yd);
                strM202217t = "";
                hfw.m130790a("[live][virtual_voice]", "handleError:code=" + i + ";content=" + ((Object) strM202217t) + ":form=" + from);
                if (TextUtils.isEmpty(strM202217t)) {
                }
                break;
            case 41014:
            case 41017:
            case 41018:
                strM202217t = w8u.m202217t(R$string.f47618x);
                hfw.m130790a("[live][virtual_voice]", "handleError:code=" + i + ";content=" + ((Object) strM202217t) + ":form=" + from);
                if (TextUtils.isEmpty(strM202217t)) {
                }
                break;
            case 41015:
                strM202217t = w8u.m202217t(R$string.f47169cb);
                hfw.m130790a("[live][virtual_voice]", "handleError:code=" + i + ";content=" + ((Object) strM202217t) + ":form=" + from);
                if (TextUtils.isEmpty(strM202217t)) {
                }
                break;
            case 41042:
                Act act3 = act();
                act3.getClass();
                strM202217t = act3.getString(R$string.f46691G2);
                d30Var = new d30() { // from class: l.o2p0
                    @Override // p149l.d30
                    public final void call() {
                        w2p0.m201155Y3(this.f141543a);
                    }
                };
                hfw.m130790a("[live][virtual_voice]", "handleError:code=" + i + ";content=" + ((Object) strM202217t) + ":form=" + from);
                if (TextUtils.isEmpty(strM202217t)) {
                }
                break;
            case 43010:
                m201179q5();
                break;
            default:
                strM202217t = "";
                hfw.m130790a("[live][virtual_voice]", "handleError:code=" + i + ";content=" + ((Object) strM202217t) + ":form=" + from);
                if (TextUtils.isEmpty(strM202217t)) {
                }
                break;
        }
    }

    /* JADX INFO: renamed from: h5 */
    public final boolean m201202h5(BLiveVoiceRoom room) {
        return !Intrinsics.m87488d(room.title, this.previewPresenter.m77279d4());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j5 */
    public final void m201203j5() {
        vpv vpvVar = ypv.f199493a;
        if (vpvVar != null) {
            String strM199309D0 = vpvVar.m199309D0();
            String strM201199d5 = m201199d5();
            nnn0 nnn0Var = (nnn0) m206027E2();
            VoiceRoomApiProvider.getOutRoom(strM201199d5, strM199309D0, nnn0Var != null ? nnn0Var.m149826x() : null);
        }
        if (e0o0.m114323i(this)) {
            oxl oxlVar = (oxl) m129297F3(new rv00(2600));
            if (oxlVar != null) {
                oxlVar.mo133472b();
            }
            D dM206027E2 = m206027E2();
            dM206027E2.getClass();
            u4n0.m191748g(this, ((nnn0) dM206027E2).m160261Y2(), "voice-close");
        }
        Act act = act();
        if (act != null) {
            act.m66873d2();
        }
    }

    /* JADX INFO: renamed from: k5 */
    public final C22306c<BLiveVoice> m201204k5(BLiveVoiceRoom room) {
        final BLiveStartPageTemplate bLiveStartPageTemplateM77277b4 = this.previewPresenter.m77277b4();
        C22306c c22306cJust = C22306c.just(room);
        final Function1 function1 = new Function1() { // from class: l.z1p0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w2p0.m201127H4(this.f201088a, bLiveStartPageTemplateM77277b4, (BLiveVoiceRoom) obj);
            }
        };
        C22306c<T> c22306cDuringCreated = duringCreated(c22306cJust.flatMap(new w9j() { // from class: l.a2p0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return w2p0.m201120A4(function1, obj);
            }
        }));
        final Function1 function2 = new Function1() { // from class: l.b2p0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w2p0.m201126G4(this.f72712a, (BLiveVoice) obj);
            }
        };
        C22306c<BLiveVoice> c22306cOnErrorReturn = c22306cDuringCreated.doOnNext(new e30() { // from class: l.c2p0
            @Override // p149l.e30
            public final void call(Object obj) {
                w2p0.m201148T3(function2, obj);
            }
        }).doOnError(new e30() { // from class: l.e2p0
            @Override // p149l.e30
            public final void call(Object obj) {
                w2p0.m201162f4(this.f88937a, (Throwable) obj);
            }
        }).onErrorReturn(new w9j() { // from class: l.f2p0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return w2p0.m201136M4((Throwable) obj);
            }
        });
        c22306cOnErrorReturn.getClass();
        return c22306cOnErrorReturn;
    }

    /* JADX INFO: renamed from: l5 */
    public final void m201205l5(User user) {
        Act act = act();
        if (act != null) {
            act.progressDismiss();
        }
        if (user != null) {
            this.previewInfo.m174577a(user);
            m201212y5();
        }
    }

    /* JADX INFO: renamed from: m5 */
    public final C22306c<User> m201206m5(final BLiveVoice bLiveVoice) {
        C22306c c22306cJust = C22306c.just(bLiveVoice);
        final Function1 function1 = new Function1() { // from class: l.j2p0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w2p0.m201125F4(bLiveVoice, (BLiveVoice) obj);
            }
        };
        C22306c<User> c22306cOnErrorReturn = duringCreated(c22306cJust.flatMap(new w9j() { // from class: l.k2p0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return w2p0.m201123D4(function1, obj);
            }
        })).doOnError(new e30() { // from class: l.l2p0
            @Override // p149l.e30
            public final void call(Object obj) {
                w2p0.m201129J3(this.f125803a, (Throwable) obj);
            }
        }).onErrorReturn(new w9j() { // from class: l.m2p0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return w2p0.m201149T4((Throwable) obj);
            }
        });
        c22306cOnErrorReturn.getClass();
        return c22306cOnErrorReturn;
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        mkd0.m154992z(this.controlMessageSub);
    }

    /* JADX INFO: renamed from: s5 */
    public final void m201207s5(@NotNull BLiveVoiceRoom room) {
        room.getClass();
        this.roomBs.m132487l(room);
    }

    /* JADX INFO: renamed from: t5 */
    public final void m201208t5(@Nullable BLiveVoice live) {
        this.previewInfo.m174578b(live);
    }

    /* JADX INFO: renamed from: u5 */
    public final void m201209u5(@NotNull BLiveVoiceRoom room) {
        room.getClass();
        this.previewInfo.m174579c(room);
    }

    /* JADX INFO: renamed from: v5 */
    public final void m201210v5(boolean recover) {
        this.ongoingLiveBs.m132487l(Boolean.valueOf(recover));
    }

    /* JADX INFO: renamed from: w5 */
    public final void m201211w5() {
        Act act = act();
        if (act != null) {
            new xh0.C21150a(act.act()).m208731j("确认要离开群聊吗?").m208737p(h1c0.f105394p0).m208739r("确认离开").m208736o(new View.OnClickListener() { // from class: l.d2p0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    w2p0.m201188x5(this.f83421a, view);
                }
            }).m208725d(h1c0.f105343X0).m208727f("手滑了").m208722a().m208721g();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y5 */
    public final void m201212y5() {
        nnn0 nnn0Var;
        qho0 qho0Var = this.previewInfo;
        if (qho0Var.f154503c == null || qho0Var.f154501a == null || qho0Var.f154502b == null || (nnn0Var = (nnn0) m206027E2()) == null) {
            return;
        }
        nnn0Var.m160247O2().mo165471n(this.previewInfo.f154501a);
        nnn0Var.mo132136i(this.previewInfo.f154503c);
        nnn0Var.m132087R(this.previewInfo.f154502b);
        nnn0Var.m132099V(this.previewInfo.f154501a);
        hfw.m130790a("[live][virtual_voice]", "update room state。is living : " + nnn0Var.m149820r());
    }

    /* JADX INFO: renamed from: z5 */
    public final C22306c<BLiveVoiceRoom> m201213z5(final boolean isRecover) {
        C22306c<T> c22306cDuringCreated = duringCreated(C22306c.just(Boolean.valueOf(isRecover)));
        final Function1 function1 = new Function1() { // from class: l.p1p0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w2p0.m201153W3(this.f146753a, isRecover, (Boolean) obj);
            }
        };
        C22306c c22306cSwitchMap = c22306cDuringCreated.switchMap(new w9j() { // from class: l.q1p0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return w2p0.m201159c4(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: l.r1p0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w2p0.m201189y4(isRecover, this, (Boolean) obj);
            }
        };
        C22306c c22306cFlatMap = c22306cSwitchMap.flatMap(new w9j() { // from class: l.t1p0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return w2p0.m201185v4(function2, obj);
            }
        });
        final Function1 function3 = new Function1() { // from class: l.u1p0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w2p0.m201122C4(this.f173037a, (BLiveVoiceRoom) obj);
            }
        };
        C22306c<BLiveVoiceRoom> c22306cOnErrorReturn = c22306cFlatMap.doOnNext(new e30() { // from class: l.v1p0
            @Override // p149l.e30
            public final void call(Object obj) {
                w2p0.m201168j4(function3, obj);
            }
        }).doOnError(new e30() { // from class: l.w1p0
            @Override // p149l.e30
            public final void call(Object obj) {
                w2p0.m201132K4(this.f184034a, (Throwable) obj);
            }
        }).onErrorReturn(new w9j() { // from class: l.x1p0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return w2p0.m201169k4((Throwable) obj);
            }
        });
        c22306cOnErrorReturn.getClass();
        return c22306cOnErrorReturn;
    }
}
