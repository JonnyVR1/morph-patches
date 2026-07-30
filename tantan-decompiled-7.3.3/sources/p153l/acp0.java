package p153l;

import android.text.TextUtils;
import android.view.View;
import androidx.annotation.StringRes;
import com.facebook.AuthenticationTokenClaims;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.data.DetectCategoryType;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.LiveDialogAct;
import com.p051p1.mobile.putong.live.base.data.BLiveAnchor;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationClickAction;
import com.p051p1.mobile.putong.live.base.data.BLiveStartPageTemplate;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.BLiveType;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p051p1.mobile.putong.live.livingroom.virtual.preview.VoiceVirtualPreviewPresenter;
import com.p051p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import com.p051p1.mobile.putong.util.AntiSpamHelper;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B!\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0014\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0011\u001a\u00020\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001c\u0010\u0017J\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b#\u0010!J\u0017\u0010%\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\"H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\rH\u0002¢\u0006\u0004\b'\u0010\u0017J\u001f\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u001f2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020(0\u001f2\u0006\u0010$\u001a\u00020\"H\u0002¢\u0006\u0004\b,\u0010-J\u001f\u00101\u001a\u00020\r2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\tH\u0002¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\rH\u0002¢\u0006\u0004\b3\u0010\u0017J\u000f\u00104\u001a\u00020\rH\u0002¢\u0006\u0004\b4\u0010\u0017J\u0017\u00105\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b5\u00106J\u0019\u00108\u001a\u00020\r2\b\b\u0001\u00107\u001a\u00020\u000bH\u0002¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020\r2\u0006\u0010:\u001a\u00020(H\u0002¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\rH\u0016¢\u0006\u0004\b=\u0010\u0017J\u0015\u0010?\u001a\u00020\r2\u0006\u0010>\u001a\u00020\u001d¢\u0006\u0004\b?\u0010@J\u0017\u0010B\u001a\u00020\r2\b\u0010A\u001a\u0004\u0018\u00010(¢\u0006\u0004\bB\u0010<J\u0015\u0010C\u001a\u00020\r2\u0006\u0010$\u001a\u00020\"¢\u0006\u0004\bC\u0010DJ\r\u0010E\u001a\u00020\t¢\u0006\u0004\bE\u0010FJ\r\u0010G\u001a\u00020\r¢\u0006\u0004\bG\u0010\u0017J\u0015\u0010H\u001a\u00020\r2\u0006\u0010$\u001a\u00020\"¢\u0006\u0004\bH\u0010DJ\r\u0010I\u001a\u00020\r¢\u0006\u0004\bI\u0010\u0017J\r\u0010J\u001a\u00020\r¢\u0006\u0004\bJ\u0010\u0017J\u0015\u0010L\u001a\u00020\r2\u0006\u0010K\u001a\u00020\t¢\u0006\u0004\bL\u00106J\u000f\u0010M\u001a\u00020\rH\u0016¢\u0006\u0004\bM\u0010\u0017R\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR8\u0010T\u001a&\u0012\f\u0012\n Q*\u0004\u0018\u00010\u001d0\u001d Q*\u0012\u0012\f\u0012\n Q*\u0004\u0018\u00010\u001d0\u001d\u0018\u00010P0P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR8\u0010V\u001a&\u0012\f\u0012\n Q*\u0004\u0018\u00010\"0\" Q*\u0012\u0012\f\u0012\n Q*\u0004\u0018\u00010\"0\"\u0018\u00010P0P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010SR8\u0010Y\u001a&\u0012\f\u0012\n Q*\u0004\u0018\u00010W0W Q*\u0012\u0012\f\u0012\n Q*\u0004\u0018\u00010W0W\u0018\u00010P0P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010SR\u0014\u0010]\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0018\u0010`\u001a\u0004\u0018\u00010^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010_¨\u0006a"}, m88121d2 = {"Ll/acp0;", "Ll/qct;", "Ll/rwn0;", "Lcom/p1/mobile/putong/live/livingroom/virtual/preview/VoiceVirtualPreviewPresenter;", "previewPresenter", "Ll/dum;", BaseSei.INFO, "<init>", "(Lcom/p1/mobile/putong/live/livingroom/virtual/preview/VoiceVirtualPreviewPresenter;Ll/dum;)V", "", "liveId", "", "type", "", "i5", "(Ljava/lang/String;I)V", "content", "button", "Ll/x20;", "action0", "n5", "(Ljava/lang/String;Ljava/lang/String;Ll/x20;)V", "V4", "()V", "Lcom/p1/mobile/putong/data/User;", "user", "l5", "(Lcom/p1/mobile/putong/data/User;)V", "c5", "", "isRecover", "Lrx/c;", "W4", "(Z)Lrx/c;", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceRoom;", "z5", "room", BLiveOperationClickAction.f45265h5, "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceRoom;)Z", "y5", "Lcom/p1/mobile/putong/live/base/data/BLiveVoice;", "bLiveVoice", "m5", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoice;)Lrx/c;", "k5", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceRoom;)Lrx/c;", "", "throwable", "from", "f5", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "q5", "w5", "Z4", "(Ljava/lang/String;)V", ShareConstants.RES_PATH, "Y4", "(I)V", BLiveType.voiceLive, "b5", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoice;)V", p7f.GPS_DIRECTION_TRUE, "recover", "v5", "(Z)V", "live", "t5", "u5", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceRoom;)V", "d5", "()Ljava/lang/String;", "e5", "s5", "a5", "j5", "roomId", "X4", "n", RXScreenCaptureService.KEY_INDEX, "Lcom/p1/mobile/putong/live/livingroom/virtual/preview/VoiceVirtualPreviewPresenter;", "Lrx/subjects/a;", "kotlin.jvm.PlatformType", "j", "Lrx/subjects/a;", "ongoingLiveBs", "k", "roomBs", "Ll/uxj0;", BLiveStormDanmakuGiftResourceType.f45292l, "selectBs", "Ll/uqo0;", "m", "Ll/uqo0;", "previewInfo", "Ll/kcg0;", "Ll/kcg0;", "controlMessageSub", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class acp0 extends qct<rwn0> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final VoiceVirtualPreviewPresenter<?> previewPresenter;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public final C22507a<Boolean> ongoingLiveBs;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final C22507a<BLiveVoiceRoom> roomBs;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public final C22507a<uxj0> selectBs;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final uqo0 previewInfo;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public kcg0 controlMessageSub;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acp0(@NotNull VoiceVirtualPreviewPresenter<?> voiceVirtualPreviewPresenter, @Nullable dum<?> dumVar) {
        super(dumVar);
        voiceVirtualPreviewPresenter.getClass();
        this.previewPresenter = voiceVirtualPreviewPresenter;
        this.ongoingLiveBs = C22507a.m222758b();
        this.roomBs = C22507a.m222758b();
        this.selectBs = C22507a.m222758b();
        this.previewInfo = new uqo0();
    }

    /* JADX INFO: renamed from: A4 */
    public static C22421c m96876A4(Function1 function1, Object obj) {
        return (C22421c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: B4 */
    public static void m96877B4(acp0 acp0Var, vxj0 vxj0Var) {
        acp0Var.m96952a5();
    }

    /* JADX INFO: renamed from: C4 */
    public static Unit m96878C4(acp0 acp0Var, BLiveVoiceRoom bLiveVoiceRoom) {
        bLiveVoiceRoom.getClass();
        acp0Var.previewInfo.m197375c(bLiveVoiceRoom);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D4 */
    public static C22421c m96879D4(Function1 function1, Object obj) {
        return (C22421c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: E4 */
    public static void m96880E4(acp0 acp0Var, Throwable th) {
        th.getClass();
        acp0Var.m96957f5(th, "addSubscribe");
    }

    /* JADX INFO: renamed from: F4 */
    public static C22421c m96881F4(BLiveVoice bLiveVoice, BLiveVoice bLiveVoice2) {
        return bLiveVoice == BLiveVoice.EMPTY ? C22421c.just(null) : itv.m142093Q(bLiveVoice.f45171id);
    }

    /* JADX INFO: renamed from: G4 */
    public static Unit m96882G4(acp0 acp0Var, BLiveVoice bLiveVoice) {
        bLiveVoice.getClass();
        acp0Var.previewInfo.m197374b(bLiveVoice);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H4 */
    public static C22421c m96883H4(acp0 acp0Var, BLiveStartPageTemplate bLiveStartPageTemplate, BLiveVoiceRoom bLiveVoiceRoom) {
        bLiveVoiceRoom.getClass();
        if (bLiveVoiceRoom == BLiveVoiceRoom.EMPTY_ROOM) {
            return C22421c.just(BLiveVoice.EMPTY);
        }
        BLiveVoice bLiveVoice = acp0Var.previewInfo.f180496a;
        if (bLiveVoice != null) {
            return C22421c.just(bLiveVoice);
        }
        String str = bLiveVoiceRoom.f45172id;
        boolean zM78466m4 = acp0Var.previewPresenter.m78466m4();
        D dM213810E2 = acp0Var.m213810E2();
        dM213810E2.getClass();
        return itv.m142117t(str, zM78466m4, ((rwn0) dM213810E2).f165204a0, bLiveStartPageTemplate.liveMode, bLiveStartPageTemplate.template, bLiveStartPageTemplate.gameType);
    }

    /* JADX INFO: renamed from: J3 */
    public static void m96885J3(acp0 acp0Var, Throwable th) {
        th.getClass();
        acp0Var.m96957f5(th, "prepareUser");
    }

    /* JADX INFO: renamed from: J4 */
    public static Boolean m96886J4(Function2 function2, Object obj, Object obj2) {
        return (Boolean) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: K3 */
    public static void m96887K3(acp0 acp0Var, User user) {
        fhw.m125605a("[live][virtual_voice]", "prepare live success。user is null : " + (user == null));
        acp0Var.m96961l5(user);
        acp0Var.m96954c5();
    }

    /* JADX INFO: renamed from: K4 */
    public static void m96888K4(acp0 acp0Var, Throwable th) {
        th.getClass();
        acp0Var.m96957f5(th, "updateRoom");
    }

    /* JADX INFO: renamed from: L3 */
    public static void m96889L3(acp0 acp0Var, List list) {
        if (list.isEmpty()) {
            LiveDialogAct.m68360h2(acp0Var.act(), "", xau.m209910t(R$string.f48078f6));
            return;
        }
        Object objFirst = CollectionsKt.first((List<? extends Object>) list);
        objFirst.getClass();
        acp0Var.m96953b5((BLiveVoice) objFirst);
    }

    /* JADX INFO: renamed from: L4 */
    public static C22421c m96890L4(Function1 function1, Object obj) {
        return (C22421c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: M3 */
    public static Boolean m96891M3(Boolean bool, uxj0 uxj0Var) {
        return bool;
    }

    /* JADX INFO: renamed from: M4 */
    public static BLiveVoice m96892M4(Throwable th) {
        return BLiveVoice.EMPTY;
    }

    /* JADX INFO: renamed from: N3 */
    public static void m96893N3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: O3 */
    public static C22421c m96895O3(Function1 function1, Object obj) {
        return (C22421c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: P3 */
    public static void m96897P3(acp0 acp0Var, Throwable th) {
        th.getClass();
        acp0Var.m96957f5(th, "createVoiceLive");
    }

    /* JADX INFO: renamed from: P4 */
    public static BLiveVoiceRoom m96898P4(Pair pair) {
        return (BLiveVoiceRoom) pair.getFirst();
    }

    /* JADX INFO: renamed from: Q4 */
    public static BLiveVoiceRoom m96899Q4(Function1 function1, Object obj) {
        return (BLiveVoiceRoom) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: R3 */
    public static Boolean m96900R3(uxj0 uxj0Var) {
        uxj0Var.getClass();
        return Boolean.FALSE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R4 */
    public static Boolean m96901R4(acp0 acp0Var, Boolean bool) {
        D dM213810E2 = acp0Var.m213810E2();
        dM213810E2.getClass();
        return Boolean.valueOf(!((rwn0) dM213810E2).m202193m().m146884j());
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e1  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S4 */
    public static void m96903S4(acp0 acp0Var, LiveControlMessage liveControlMessage) {
        String str;
        rwn0 rwn0Var;
        Act act;
        fhw.m125605a("[live][virtual_voice]", "controlMessageSub:type=" + liveControlMessage.type);
        String str2 = liveControlMessage.type;
        if (str2 != null) {
            switch (str2.hashCode()) {
                case -2140406257:
                    if (!str2.equals("add_manager")) {
                    }
                    D dM213810E2 = acp0Var.m213810E2();
                    dM213810E2.getClass();
                    D dM213810E3 = acp0Var.m213810E2();
                    dM213810E3.getClass();
                    ((rwn0) dM213810E2).mo118370K1(((rwn0) dM213810E3).m202191k());
                    break;
                case -887328209:
                    if (str2.equals("system")) {
                        String str3 = liveControlMessage.content;
                        String strM209910t = xau.m209910t(R$string.f48494y5);
                        strM209910t.getClass();
                        m96931o5(acp0Var, str3, strM209910t, null, 4, null);
                        break;
                    }
                    break;
                case -866625755:
                    if (str2.equals("re_request_room_gift_list")) {
                        muj.m160221w(false);
                        rwn0 rwn0Var2 = (rwn0) acp0Var.m213810E2();
                        if (rwn0Var2 != null) {
                            rwn0Var2.m168445A1(new uxj.C20693a(rwn0Var2.m202194o(), rwn0Var2.m168532l0().f56859id, "live").m198494f(), null);
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
                        rwn0Var = (rwn0) acp0Var.m213810E2();
                        if (rwn0Var != null) {
                            rwn0 rwn0Var3 = (rwn0) acp0Var.m213810E2();
                            rwn0Var.m168518g2(rwn0Var3 != null ? rwn0Var3.mo183435j() : null);
                        }
                        act = acp0Var.act();
                        if (act != null) {
                            act.m68056e2();
                        }
                        LiveDialogAct.m68360h2(acp0Var.act(), "", liveControlMessage.content);
                    }
                    break;
                case 3540994:
                    if (str2.equals("stop")) {
                        acp0Var.m96950Y4(R$string.f48078f6);
                        break;
                    }
                    break;
                case 109757538:
                    if (str2.equals("start")) {
                        String str4 = liveControlMessage.liveId;
                        str4.getClass();
                        acp0Var.m96923i5(str4, 2);
                        acp0Var.m213811F2().BottomZoneEvent.refreshAllButton().m199277p();
                        break;
                    }
                    break;
                case 134762710:
                    if (!str2.equals("force_stop")) {
                    }
                    str = liveControlMessage.content;
                    str.getClass();
                    if (str.length() > 0) {
                        rwn0Var = (rwn0) acp0Var.m213810E2();
                        if (rwn0Var != null) {
                            rwn0 rwn0Var4 = (rwn0) acp0Var.m213810E2();
                            rwn0Var.m168518g2(rwn0Var4 != null ? rwn0Var4.mo183435j() : null);
                        }
                        act = acp0Var.act();
                        if (act != null) {
                            act.m68056e2();
                        }
                        LiveDialogAct.m68360h2(acp0Var.act(), "", liveControlMessage.content);
                    }
                    break;
                case 379400585:
                    if (str2.equals("forbidden_multidevice")) {
                        String strM209910t2 = xau.m209910t(liveControlMessage.isAnchor ? R$string.f47820T5 : R$string.f47778R5);
                        D dM213810E4 = acp0Var.m213810E2();
                        dM213810E4.getClass();
                        D dM213810E5 = acp0Var.m213810E2();
                        dM213810E5.getClass();
                        ((rwn0) dM213810E4).m168518g2(((rwn0) dM213810E5).mo183435j());
                        Act act2 = acp0Var.act();
                        act2.getClass();
                        act2.m68056e2();
                        LiveDialogAct.m68360h2(acp0Var.act(), "", strM209910t2);
                        break;
                    }
                    break;
                case 1075863833:
                    if (str2.equals("delete_manager")) {
                        D dM213810E6 = acp0Var.m213810E2();
                        dM213810E6.getClass();
                        D dM213810E7 = acp0Var.m213810E2();
                        dM213810E7.getClass();
                        ((rwn0) dM213810E6).mo118370K1(((rwn0) dM213810E7).m202191k());
                        break;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: T3 */
    public static void m96904T3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: T4 */
    public static User m96905T4(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: U3 */
    public static C22421c m96906U3(acp0 acp0Var, Boolean bool) {
        bool.getClass();
        return acp0Var.m96969z5(bool.booleanValue());
    }

    /* JADX INFO: renamed from: U4 */
    public static void m96907U4(acp0 acp0Var, User user) {
        acp0Var.m96968y5();
    }

    /* JADX INFO: renamed from: V3 */
    public static Boolean m96908V3(Function2 function2, Object obj, Object obj2) {
        return (Boolean) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: W3 */
    public static C22421c m96909W3(acp0 acp0Var, boolean z, Boolean bool) {
        return acp0Var.m96948W4(z);
    }

    /* JADX INFO: renamed from: X3 */
    public static Boolean m96910X3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Y3 */
    public static void m96911Y3(acp0 acp0Var) {
        Act act = acp0Var.act();
        if (act != null) {
            act.m68056e2();
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public static void m96912Z3(acp0 acp0Var, BLiveAnchor bLiveAnchor) {
        final Act act;
        bLiveAnchor.getClass();
        if (!TEnum.equals(bLiveAnchor.status, "jailed") || (act = acp0Var.act()) == null) {
            return;
        }
        act.dialog().m21503F(xau.m209911u(R$string.f48061eb, pzi0.m174455p(bLiveAnchor.availableTime))).m21495B(false).m21559v0(xau.m209910t(R$string.f48494y5), new Runnable() { // from class: l.vbp0
            @Override // java.lang.Runnable
            public final void run() {
                acp0.m96937r5(act);
            }
        }).m21567z0();
    }

    /* JADX INFO: renamed from: a4 */
    public static void m96913a4(acp0 acp0Var, Throwable th) {
        th.getClass();
        acp0Var.m96957f5(th, "resolveForbidden");
    }

    /* JADX INFO: renamed from: b4 */
    public static C22421c m96914b4(Function1 function1, Object obj) {
        return (C22421c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: c4 */
    public static C22421c m96915c4(Function1 function1, Object obj) {
        return (C22421c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: d4 */
    public static Unit m96916d4(acp0 acp0Var, Pair pair) {
        acp0Var.previewPresenter.m78469r4((BLiveUserMask) pair.getSecond());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e4 */
    public static Unit m96917e4(acp0 acp0Var, User user) {
        acp0Var.previewInfo.m197373a(user);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f4 */
    public static void m96918f4(acp0 acp0Var, Throwable th) {
        th.getClass();
        acp0Var.m96957f5(th, "prepareLive");
    }

    /* JADX INFO: renamed from: g4 */
    public static void m96919g4(acp0 acp0Var, Throwable th) {
        th.getClass();
        acp0Var.m96957f5(th, "autoStartLive");
    }

    /* JADX INFO: renamed from: g5 */
    public static final void m96920g5(x20 x20Var) {
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h4 */
    public static void m96921h4(acp0 acp0Var, int i, ugd0 ugd0Var) {
        D dM213810E2 = acp0Var.m213810E2();
        dM213810E2.getClass();
        ((rwn0) dM213810E2).mo168476S(ugd0Var);
        D dM213810E3 = acp0Var.m213810E2();
        dM213810E3.getClass();
        BLiveVoice bLiveVoiceMo122892l = ((rwn0) dM213810E3).m183409O2().mo122892l();
        bLiveVoiceMo122892l.getClass();
        D dM213810E4 = acp0Var.m213810E2();
        dM213810E4.getClass();
        ((rwn0) dM213810E4).m168488W(bLiveVoiceMo122892l, i);
    }

    /* JADX INFO: renamed from: i4 */
    public static Unit m96922i4(acp0 acp0Var, Boolean bool) {
        Act act = acp0Var.act();
        act.getClass();
        act.progress(R$string.f47951Za, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i5 */
    private final void m96923i5(String liveId, final int type) {
        m213811F2().BottomZoneEvent.refreshAllButton().m199277p();
        duringCreated(VoiceRoomApiProvider.getLiveInfo(liveId)).subscribe(dhw.m115829h(new y20() { // from class: l.kbp0
            @Override // p153l.y20
            public final void call(Object obj) {
                acp0.m96921h4(this.f124971a, type, (ugd0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j4 */
    public static void m96924j4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: k4 */
    public static BLiveVoiceRoom m96925k4(Throwable th) {
        return BLiveVoiceRoom.EMPTY_ROOM;
    }

    /* JADX INFO: renamed from: l4 */
    public static C22421c m96926l4(acp0 acp0Var, BLiveVoiceRoom bLiveVoiceRoom) {
        bLiveVoiceRoom.getClass();
        return acp0Var.m96960k5(bLiveVoiceRoom);
    }

    /* JADX INFO: renamed from: m4 */
    public static void m96927m4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: n4 */
    public static Boolean m96928n4(BLiveVoiceRoom bLiveVoiceRoom, Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: n5 */
    private final void m96929n5(String content, String button, final x20 action0) {
        Act act;
        if (content == null || content.length() == 0 || (act = act()) == null) {
            return;
        }
        act.dialog().m21503F(content).m21495B(false).m21543n0(button, new Runnable() { // from class: l.cbp0
            @Override // java.lang.Runnable
            public final void run() {
                acp0.m96933p5(action0);
            }
        }).m21567z0();
    }

    /* JADX INFO: renamed from: o4 */
    public static void m96930o4(acp0 acp0Var, BLiveEnvelope bLiveEnvelope) {
        ydn0.m215260m(acp0Var);
    }

    /* JADX INFO: renamed from: o5 */
    public static /* synthetic */ void m96931o5(acp0 acp0Var, String str, String str2, x20 x20Var, int i, Object obj) {
        if ((i & 4) != 0) {
            x20Var = null;
        }
        acp0Var.m96929n5(str, str2, x20Var);
    }

    /* JADX INFO: renamed from: p4 */
    public static C22421c m96932p4(BLiveVoice bLiveVoice, BLiveVoiceRoom bLiveVoiceRoom) {
        return itv.m142093Q(bLiveVoice.f45171id);
    }

    /* JADX INFO: renamed from: p5 */
    public static final void m96933p5(x20 x20Var) {
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: q4 */
    public static void m96934q4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: q5 */
    private final void m96935q5() {
        duringCreated(VoiceRoomApiProvider.getAnchorInfo(zrv.f205799a.m207631D0())).subscribe(dhw.m115826e(new y20() { // from class: l.lbp0
            @Override // p153l.y20
            public final void call(Object obj) {
                acp0.m96912Z3(this.f131220a, (BLiveAnchor) obj);
            }
        }, new y20() { // from class: l.mbp0
            @Override // p153l.y20
            public final void call(Object obj) {
                acp0.m96913a4(this.f135741a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r4 */
    public static void m96936r4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: r5 */
    public static final void m96937r5(Act act) {
        Act act2 = act.act();
        act2.getClass();
        act2.m68056e2();
    }

    /* JADX INFO: renamed from: s4 */
    public static Boolean m96938s4(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: t4 */
    public static Pair m96939t4(Function2 function2, Object obj, Object obj2) {
        return (Pair) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: u4 */
    public static C22421c m96940u4(acp0 acp0Var, BLiveVoice bLiveVoice) {
        bLiveVoice.getClass();
        return acp0Var.m96962m5(bLiveVoice);
    }

    /* JADX INFO: renamed from: v4 */
    public static C22421c m96941v4(Function1 function1, Object obj) {
        return (C22421c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: w4 */
    public static Pair m96942w4(BLiveVoiceRoom bLiveVoiceRoom, BLiveUserMask bLiveUserMask) {
        return new Pair(bLiveVoiceRoom, bLiveUserMask);
    }

    /* JADX INFO: renamed from: x4 */
    public static C22421c m96943x4(Function1 function1, Object obj) {
        return (C22421c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: x5 */
    public static final void m96944x5(acp0 acp0Var, View view) {
        acp0Var.m96959j5();
    }

    /* JADX INFO: renamed from: y4 */
    public static C22421c m96945y4(boolean z, acp0 acp0Var, Boolean bool) {
        if (z) {
            return C22421c.just(acp0Var.previewInfo.f180498c);
        }
        String strM78462d4 = acp0Var.previewPresenter.m78462d4();
        BLiveVoiceRoom bLiveVoiceRoom = acp0Var.previewInfo.f180498c;
        if (bLiveVoiceRoom != null && !acp0Var.m96958h5(bLiveVoiceRoom)) {
            return C22421c.just(acp0Var.previewInfo.f180498c);
        }
        BLiveVoiceRoom bLiveVoiceRoom2 = new BLiveVoiceRoom();
        bLiveVoiceRoom2.title = strM78462d4;
        BLiveVoiceRoom bLiveVoiceRoom3 = acp0Var.previewInfo.f180498c;
        if (bLiveVoiceRoom3 == null) {
            return itv.m142118u(bLiveVoiceRoom2);
        }
        bLiveVoiceRoom2.f45172id = bLiveVoiceRoom3.f45172id;
        if (acp0Var.m96958h5(bLiveVoiceRoom3)) {
            bLiveVoiceRoom2.addField("title,topic");
        }
        bLiveVoiceRoom2.addField("backGroundPicId");
        return itv.m142085I(acp0Var.previewInfo.f180498c.f45172id, bLiveVoiceRoom2);
    }

    /* JADX INFO: renamed from: z4 */
    public static Unit m96946z4(acp0 acp0Var, Pair pair) {
        acp0Var.previewInfo.m197375c((BLiveVoiceRoom) pair.getFirst());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        if (m213810E2() == 0) {
            return;
        }
        m96947V4();
        duringCreated(m213811F2().LivePusherEvent.closeLive().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.lap0
            @Override // p153l.y20
            public final void call(Object obj) {
                acp0.m96877B4(this.f130723a, (vxj0) obj);
            }
        }));
        if (vxr.m203876d().m170967B1()) {
            return;
        }
        D dM213810E2 = m213810E2();
        dM213810E2.getClass();
        this.controlMessageSub = ((rwn0) dM213810E2).m168539n1().subscribe(dhw.m115829h(new y20() { // from class: l.wap0
            @Override // p153l.y20
            public final void call(Object obj) {
                acp0.m96903S4(this.f188153a, (LiveControlMessage) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V4 */
    public final void m96947V4() {
        C22507a<BLiveVoiceRoom> c22507a = this.roomBs;
        C22507a<Boolean> c22507a2 = this.ongoingLiveBs;
        final Function2 function2 = new Function2() { // from class: l.xbp0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return acp0.m96928n4((BLiveVoiceRoom) obj, (Boolean) obj2);
            }
        };
        C22421c c22421cZip = C22421c.zip(c22507a, c22507a2, new rcj() { // from class: l.u9p0
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return acp0.m96908V3(function2, obj, obj2);
            }
        });
        C22507a<uxj0> c22507a3 = this.selectBs;
        final Function2 function3 = new Function2() { // from class: l.v9p0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return acp0.m96891M3((Boolean) obj, (uxj0) obj2);
            }
        };
        C22421c<T> c22421cDuringCreated = duringCreated(C22421c.combineLatest(c22421cZip, c22507a3, new rcj() { // from class: l.w9p0
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return acp0.m96886J4(function3, obj, obj2);
            }
        }));
        final Function1 function1 = new Function1() { // from class: l.x9p0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return acp0.m96901R4(this.f192953a, (Boolean) obj);
            }
        };
        C22421c c22421cFilter = c22421cDuringCreated.filter(new qcj() { // from class: l.y9p0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return acp0.m96910X3(function1, obj);
            }
        });
        final Function1 function4 = new Function1() { // from class: l.z9p0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return acp0.m96922i4(this.f203505a, (Boolean) obj);
            }
        };
        C22421c c22421cDoOnNext = c22421cFilter.doOnNext(new y20() { // from class: l.bap0
            @Override // p153l.y20
            public final void call(Object obj) {
                acp0.m96927m4(function4, obj);
            }
        });
        final Function1 function5 = new Function1() { // from class: l.cap0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return acp0.m96906U3(this.f80610a, (Boolean) obj);
            }
        };
        C22421c c22421cFlatMap = c22421cDoOnNext.flatMap(new qcj() { // from class: l.dap0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return acp0.m96895O3(function5, obj);
            }
        });
        final Function1 function6 = new Function1() { // from class: l.ybp0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return acp0.m96926l4(this.f198353a, (BLiveVoiceRoom) obj);
            }
        };
        C22421c c22421cFlatMap2 = c22421cFlatMap.flatMap(new qcj() { // from class: l.zbp0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return acp0.m96943x4(function6, obj);
            }
        });
        final Function1 function7 = new Function1() { // from class: l.q9p0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return acp0.m96940u4(this.f156252a, (BLiveVoice) obj);
            }
        };
        c22421cFlatMap2.flatMap(new qcj() { // from class: l.r9p0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return acp0.m96914b4(function7, obj);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.s9p0
            @Override // p153l.y20
            public final void call(Object obj) {
                acp0.m96887K3(this.f166963a, (User) obj);
            }
        }, new y20() { // from class: l.t9p0
            @Override // p153l.y20
            public final void call(Object obj) {
                acp0.m96880E4(this.f172654a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W4 */
    public final C22421c<Boolean> m96948W4(boolean isRecover) {
        C22421c map;
        if (isRecover) {
            C22421c<Boolean> c22421cJust = C22421c.just(Boolean.TRUE);
            c22421cJust.getClass();
            return c22421cJust;
        }
        BLiveVoiceRoom bLiveVoiceRoom = this.previewInfo.f180498c;
        if (bLiveVoiceRoom == null || !Intrinsics.m88377d(bLiveVoiceRoom.title, this.previewPresenter.m78462d4())) {
            C22421c<uxj0> c22421cM81450b = AntiSpamHelper.m81450b(this.f196919f, this.previewPresenter.m78462d4(), DetectCategoryType.get(DetectCategoryType.voice_room_name), AuthenticationTokenClaims.JSON_KEY_NAME, mo78457R2());
            final Function1 function1 = new Function1() { // from class: l.rbp0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return acp0.m96900R3((uxj0) obj);
                }
            };
            map = c22421cM81450b.map(new qcj() { // from class: l.tbp0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return acp0.m96938s4(function1, obj);
                }
            });
        } else {
            map = C22421c.just(Boolean.FALSE);
        }
        map.getClass();
        return map;
    }

    /* JADX INFO: renamed from: X4 */
    public final void m96949X4(@NotNull String roomId) {
        roomId.getClass();
        duringCreated(VoiceRoomApiProvider.getLatestLive(zrv.f205799a.m207631D0(), roomId)).subscribe(dhw.m115826e(new y20() { // from class: l.p9p0
            @Override // p153l.y20
            public final void call(Object obj) {
                acp0.m96889L3(this.f151175a, (List) obj);
            }
        }, new y20() { // from class: l.aap0
            @Override // p153l.y20
            public final void call(Object obj) {
                acp0.m96919g4(this.f69158a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y4 */
    public final void m96950Y4(@StringRes int res) {
        String strM209910t = xau.m209910t(res);
        strM209910t.getClass();
        m96951Z4(strM209910t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z4 */
    public final void m96951Z4(String content) {
        h0m h0mVar = (h0m) m138856F3(new z310(2600));
        if (h0mVar != null) {
            h0mVar.mo133183b();
        }
        D dM213810E2 = m213810E2();
        dM213810E2.getClass();
        if (((rwn0) dM213810E2).m202196s()) {
            return;
        }
        v9s v9sVar = new v9s(content, false);
        D dM213810E3 = m213810E2();
        dM213810E3.getClass();
        ((rwn0) dM213810E3).mo160116h(v9sVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a5 */
    public final void m96952a5() {
        rwn0 rwn0Var = (rwn0) m213810E2();
        if (rwn0Var == null || !rwn0Var.m202193m().m146880f()) {
            m96967w5();
            return;
        }
        Act act = act();
        if (act != null) {
            act.m68056e2();
        }
    }

    /* JADX INFO: renamed from: b5 */
    public final void m96953b5(final BLiveVoice voiceLive) {
        this.previewInfo.m197374b(voiceLive);
        C22421c<BLiveVoiceRoom> roomInfo = VoiceRoomApiProvider.getRoomInfo(zrv.f205799a.m207631D0());
        C22421c<BLiveUserMask> userMask = VoiceRoomApiProvider.getUserMask(zrv.f205799a.m207631D0());
        final Function2 function2 = new Function2() { // from class: l.eap0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return acp0.m96942w4((BLiveVoiceRoom) obj, (BLiveUserMask) obj2);
            }
        };
        C22421c c22421cZip = C22421c.zip(roomInfo, userMask, new rcj() { // from class: l.jap0
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return acp0.m96939t4(function2, obj, obj2);
            }
        });
        final Function1 function1 = new Function1() { // from class: l.kap0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return acp0.m96946z4(this.f124706a, (Pair) obj);
            }
        };
        C22421c c22421cDoOnNext = c22421cZip.doOnNext(new y20() { // from class: l.map0
            @Override // p153l.y20
            public final void call(Object obj) {
                acp0.m96934q4(function1, obj);
            }
        });
        final Function1 function3 = new Function1() { // from class: l.nap0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return acp0.m96916d4(this.f141036a, (Pair) obj);
            }
        };
        C22421c c22421cDoOnNext2 = c22421cDoOnNext.doOnNext(new y20() { // from class: l.oap0
            @Override // p153l.y20
            public final void call(Object obj) {
                acp0.m96936r4(function3, obj);
            }
        });
        final Function1 function4 = new Function1() { // from class: l.pap0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return acp0.m96898P4((Pair) obj);
            }
        };
        C22421c map = c22421cDoOnNext2.map(new qcj() { // from class: l.qap0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return acp0.m96899Q4(function4, obj);
            }
        });
        final Function1 function5 = new Function1() { // from class: l.rap0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return acp0.m96932p4(voiceLive, (BLiveVoiceRoom) obj);
            }
        };
        C22421c c22421cFlatMap = map.flatMap(new qcj() { // from class: l.sap0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return acp0.m96890L4(function5, obj);
            }
        });
        final Function1 function6 = new Function1() { // from class: l.fap0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return acp0.m96917e4(this.f97999a, (User) obj);
            }
        };
        duringCreated(c22421cFlatMap.doOnNext(new y20() { // from class: l.gap0
            @Override // p153l.y20
            public final void call(Object obj) {
                acp0.m96893N3(function6, obj);
            }
        })).subscribe(dhw.m115826e(new y20() { // from class: l.hap0
            @Override // p153l.y20
            public final void call(Object obj) {
                acp0.m96907U4(this.f108511a, (User) obj);
            }
        }, new y20() { // from class: l.iap0
            @Override // p153l.y20
            public final void call(Object obj) {
                acp0.m96897P3(this.f113612a, (Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c5 */
    public final void m96954c5() {
        String strM207631D0 = zrv.f205799a.m207631D0();
        D dM213810E2 = m213810E2();
        dM213810E2.getClass();
        String strM202194o = ((rwn0) dM213810E2).m202194o();
        D dM213810E3 = m213810E2();
        dM213810E3.getClass();
        String strMo160117o0 = ((rwn0) dM213810E3).mo160117o0();
        D dM213810E4 = m213810E2();
        dM213810E4.getClass();
        duringCreated(VoiceRoomApiProvider.getInRoom(strM202194o, strM207631D0, strMo160117o0, "", ((rwn0) dM213810E4).m202200x())).subscribe(dhw.m115829h(new y20() { // from class: l.ubp0
            @Override // p153l.y20
            public final void call(Object obj) {
                acp0.m96930o4(this.f178338a, (BLiveEnvelope) obj);
            }
        }));
    }

    @NotNull
    /* JADX INFO: renamed from: d5 */
    public final String m96955d5() {
        BLiveVoiceRoom bLiveVoiceRoom = this.previewInfo.f180498c;
        if (bLiveVoiceRoom == null) {
            return "";
        }
        String str = bLiveVoiceRoom.f45172id;
        str.getClass();
        return str;
    }

    /* JADX INFO: renamed from: e5 */
    public final void m96956e5() {
        this.selectBs.m137019l(uxj0.f181467a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x0088  */
    /* JADX INFO: renamed from: f5 */
    public final void m96957f5(Throwable throwable, String from) {
        String strM209910t;
        Act act;
        Act act2 = act();
        act2.getClass();
        act2.progressDismiss();
        if (!(throwable instanceof TantanException.Client.CoreService)) {
            if (throwable instanceof AntiSpamHelper.AntispamException) {
                o1j0.m165651y(throwable.getMessage());
                return;
            } else {
                o1j0.m165634h(R$string.f47502E9);
                return;
            }
        }
        TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) throwable;
        int i = coreService.code;
        final x20 x20Var = null;
        switch (i) {
            case 41000:
            case 41002:
                strM209910t = xau.m209910t(R$string.f48078f6);
                fhw.m125605a("[live][virtual_voice]", "handleError:code=" + i + ";content=" + ((Object) strM209910t) + ":form=" + from);
                if (TextUtils.isEmpty(strM209910t) && (act = act()) != null) {
                    act.dialog().m21503F(strM209910t).m21495B(false).m21559v0(xau.m209910t(R$string.f48494y5), new Runnable() { // from class: l.wbp0
                        @Override // java.lang.Runnable
                        public final void run() {
                            acp0.m96920g5(x20Var);
                        }
                    }).m21567z0();
                    break;
                }
                break;
            case 41005:
                strM209910t = xau.m209910t(R$string.f47561H2);
                fhw.m125605a("[live][virtual_voice]", "handleError:code=" + i + ";content=" + ((Object) strM209910t) + ":form=" + from);
                if (TextUtils.isEmpty(strM209910t)) {
                }
                break;
            case 41008:
            case 41020:
            case 43009:
            case 43014:
            case 43025:
            case 43062:
            case 51013:
                strM209910t = coreService.metaMessage;
                fhw.m125605a("[live][virtual_voice]", "handleError:code=" + i + ";content=" + ((Object) strM209910t) + ":form=" + from);
                if (TextUtils.isEmpty(strM209910t)) {
                }
                break;
            case 41009:
                strM209910t = xau.m209910t(R$string.f47730P);
                fhw.m125605a("[live][virtual_voice]", "handleError:code=" + i + ";content=" + ((Object) strM209910t) + ":form=" + from);
                if (TextUtils.isEmpty(strM209910t)) {
                }
                break;
            case 41010:
                m96935q5();
                break;
            case 41013:
                o1j0.m165634h(R$string.f48502yd);
                strM209910t = "";
                fhw.m125605a("[live][virtual_voice]", "handleError:code=" + i + ";content=" + ((Object) strM209910t) + ":form=" + from);
                if (TextUtils.isEmpty(strM209910t)) {
                }
                break;
            case 41014:
            case 41017:
            case 41018:
                strM209910t = xau.m209910t(R$string.f48466x);
                fhw.m125605a("[live][virtual_voice]", "handleError:code=" + i + ";content=" + ((Object) strM209910t) + ":form=" + from);
                if (TextUtils.isEmpty(strM209910t)) {
                }
                break;
            case 41015:
                strM209910t = xau.m209910t(R$string.f48017cb);
                fhw.m125605a("[live][virtual_voice]", "handleError:code=" + i + ";content=" + ((Object) strM209910t) + ":form=" + from);
                if (TextUtils.isEmpty(strM209910t)) {
                }
                break;
            case 41042:
                Act act3 = act();
                act3.getClass();
                strM209910t = act3.getString(R$string.f47539G2);
                x20Var = new x20() { // from class: l.sbp0
                    @Override // p153l.x20
                    public final void call() {
                        acp0.m96911Y3(this.f167172a);
                    }
                };
                fhw.m125605a("[live][virtual_voice]", "handleError:code=" + i + ";content=" + ((Object) strM209910t) + ":form=" + from);
                if (TextUtils.isEmpty(strM209910t)) {
                }
                break;
            case 43010:
                m96935q5();
                break;
            default:
                strM209910t = "";
                fhw.m125605a("[live][virtual_voice]", "handleError:code=" + i + ";content=" + ((Object) strM209910t) + ":form=" + from);
                if (TextUtils.isEmpty(strM209910t)) {
                }
                break;
        }
    }

    /* JADX INFO: renamed from: h5 */
    public final boolean m96958h5(BLiveVoiceRoom room) {
        return !Intrinsics.m88377d(room.title, this.previewPresenter.m78462d4());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j5 */
    public final void m96959j5() {
        wrv wrvVar = zrv.f205799a;
        if (wrvVar != null) {
            String strM207631D0 = wrvVar.m207631D0();
            String strM96955d5 = m96955d5();
            rwn0 rwn0Var = (rwn0) m213810E2();
            VoiceRoomApiProvider.getOutRoom(strM96955d5, strM207631D0, rwn0Var != null ? rwn0Var.m202200x() : null);
        }
        if (i9o0.m139138i(this)) {
            h0m h0mVar = (h0m) m138856F3(new z310(2600));
            if (h0mVar != null) {
                h0mVar.mo133183b();
            }
            D dM213810E2 = m213810E2();
            dM213810E2.getClass();
            ydn0.m215254g(this, ((rwn0) dM213810E2).m183423Y2(), "voice-close");
        }
        Act act = act();
        if (act != null) {
            act.m68056e2();
        }
    }

    /* JADX INFO: renamed from: k5 */
    public final C22421c<BLiveVoice> m96960k5(BLiveVoiceRoom room) {
        final BLiveStartPageTemplate bLiveStartPageTemplateM78460b4 = this.previewPresenter.m78460b4();
        C22421c c22421cJust = C22421c.just(room);
        final Function1 function1 = new Function1() { // from class: l.dbp0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return acp0.m96883H4(this.f87691a, bLiveStartPageTemplateM78460b4, (BLiveVoiceRoom) obj);
            }
        };
        C22421c<T> c22421cDuringCreated = duringCreated(c22421cJust.flatMap(new qcj() { // from class: l.ebp0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return acp0.m96876A4(function1, obj);
            }
        }));
        final Function1 function2 = new Function1() { // from class: l.fbp0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return acp0.m96882G4(this.f98137a, (BLiveVoice) obj);
            }
        };
        C22421c<BLiveVoice> c22421cOnErrorReturn = c22421cDuringCreated.doOnNext(new y20() { // from class: l.gbp0
            @Override // p153l.y20
            public final void call(Object obj) {
                acp0.m96904T3(function2, obj);
            }
        }).doOnError(new y20() { // from class: l.ibp0
            @Override // p153l.y20
            public final void call(Object obj) {
                acp0.m96918f4(this.f114240a, (Throwable) obj);
            }
        }).onErrorReturn(new qcj() { // from class: l.jbp0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return acp0.m96892M4((Throwable) obj);
            }
        });
        c22421cOnErrorReturn.getClass();
        return c22421cOnErrorReturn;
    }

    /* JADX INFO: renamed from: l5 */
    public final void m96961l5(User user) {
        Act act = act();
        if (act != null) {
            act.progressDismiss();
        }
        if (user != null) {
            this.previewInfo.m197373a(user);
            m96968y5();
        }
    }

    /* JADX INFO: renamed from: m5 */
    public final C22421c<User> m96962m5(final BLiveVoice bLiveVoice) {
        C22421c c22421cJust = C22421c.just(bLiveVoice);
        final Function1 function1 = new Function1() { // from class: l.nbp0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return acp0.m96881F4(bLiveVoice, (BLiveVoice) obj);
            }
        };
        C22421c<User> c22421cOnErrorReturn = duringCreated(c22421cJust.flatMap(new qcj() { // from class: l.obp0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return acp0.m96879D4(function1, obj);
            }
        })).doOnError(new y20() { // from class: l.pbp0
            @Override // p153l.y20
            public final void call(Object obj) {
                acp0.m96885J3(this.f151408a, (Throwable) obj);
            }
        }).onErrorReturn(new qcj() { // from class: l.qbp0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return acp0.m96905T4((Throwable) obj);
            }
        });
        c22421cOnErrorReturn.getClass();
        return c22421cOnErrorReturn;
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        psd0.m173633z(this.controlMessageSub);
    }

    /* JADX INFO: renamed from: s5 */
    public final void m96963s5(@NotNull BLiveVoiceRoom room) {
        room.getClass();
        this.roomBs.m137019l(room);
    }

    /* JADX INFO: renamed from: t5 */
    public final void m96964t5(@Nullable BLiveVoice live) {
        this.previewInfo.m197374b(live);
    }

    /* JADX INFO: renamed from: u5 */
    public final void m96965u5(@NotNull BLiveVoiceRoom room) {
        room.getClass();
        this.previewInfo.m197375c(room);
    }

    /* JADX INFO: renamed from: v5 */
    public final void m96966v5(boolean recover) {
        this.ongoingLiveBs.m137019l(Boolean.valueOf(recover));
    }

    /* JADX INFO: renamed from: w5 */
    public final void m96967w5() {
        Act act = act();
        if (act != null) {
            new th0.C20312a(act.act()).m191151j("确认要离开群聊吗?").m191157p(n9c0.f140855p0).m191159r("确认离开").m191156o(new View.OnClickListener() { // from class: l.hbp0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    acp0.m96944x5(this.f108609a, view);
                }
            }).m191145d(n9c0.f140804X0).m191147f("手滑了").m191142a().m191141g();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y5 */
    public final void m96968y5() {
        rwn0 rwn0Var;
        uqo0 uqo0Var = this.previewInfo;
        if (uqo0Var.f180498c == null || uqo0Var.f180496a == null || uqo0Var.f180497b == null || (rwn0Var = (rwn0) m213810E2()) == null) {
            return;
        }
        rwn0Var.m183409O2().mo122893n(this.previewInfo.f180496a);
        rwn0Var.mo168522i(this.previewInfo.f180498c);
        rwn0Var.m168473R(this.previewInfo.f180497b);
        rwn0Var.m168485V(this.previewInfo.f180496a);
        fhw.m125605a("[live][virtual_voice]", "update room state。is living : " + rwn0Var.m202195r());
    }

    /* JADX INFO: renamed from: z5 */
    public final C22421c<BLiveVoiceRoom> m96969z5(final boolean isRecover) {
        C22421c<T> c22421cDuringCreated = duringCreated(C22421c.just(Boolean.valueOf(isRecover)));
        final Function1 function1 = new Function1() { // from class: l.tap0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return acp0.m96909W3(this.f172754a, isRecover, (Boolean) obj);
            }
        };
        C22421c c22421cSwitchMap = c22421cDuringCreated.switchMap(new qcj() { // from class: l.uap0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return acp0.m96915c4(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: l.vap0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return acp0.m96945y4(isRecover, this, (Boolean) obj);
            }
        };
        C22421c c22421cFlatMap = c22421cSwitchMap.flatMap(new qcj() { // from class: l.xap0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return acp0.m96941v4(function2, obj);
            }
        });
        final Function1 function3 = new Function1() { // from class: l.yap0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return acp0.m96878C4(this.f198231a, (BLiveVoiceRoom) obj);
            }
        };
        C22421c<BLiveVoiceRoom> c22421cOnErrorReturn = c22421cFlatMap.doOnNext(new y20() { // from class: l.zap0
            @Override // p153l.y20
            public final void call(Object obj) {
                acp0.m96924j4(function3, obj);
            }
        }).doOnError(new y20() { // from class: l.abp0
            @Override // p153l.y20
            public final void call(Object obj) {
                acp0.m96888K4(this.f69643a, (Throwable) obj);
            }
        }).onErrorReturn(new qcj() { // from class: l.bbp0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return acp0.m96925k4((Throwable) obj);
            }
        });
        c22421cOnErrorReturn.getClass();
        return c22421cOnErrorReturn;
    }
}
