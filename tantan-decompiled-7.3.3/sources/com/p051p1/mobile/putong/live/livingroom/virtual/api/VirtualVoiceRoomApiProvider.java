package com.p051p1.mobile.putong.live.livingroom.virtual.api;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.data.UserId;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveExtraResponse;
import com.p051p1.mobile.putong.live.base.data.BLiveHeatVoiceRoomTask;
import com.p051p1.mobile.putong.live.base.data.BLiveHeatVoiceRoomTaskType;
import com.p051p1.mobile.putong.live.base.data.BLiveLovePlanet;
import com.p051p1.mobile.putong.live.base.data.BLiveLuckyParadiseBottomEntrance;
import com.p051p1.mobile.putong.live.base.data.BLiveOperation;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceAdminPanelCounter;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceLiveAssert;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceLivePush;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceManager;
import com.p051p1.mobile.putong.live.base.data.BLiveVoicePayGuideUser;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoomAsset;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoomClass;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoomLevelDetail;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceSquareButton;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceStarRedPacket;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceVirtualRoomSummary;
import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
import com.p051p1.mobile.putong.live.base.data.SiteWideBroadcastFinder;
import com.p051p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import org.seamless.xhtml.XHTML;
import p137rx.C22421c;
import p153l.jyb;
import p153l.qcj;
import p153l.rnl;
import p153l.st0;
import p153l.uxj0;
import p153l.vrv;
import p153l.zvr;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\t\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0007j\b\u0012\u0004\u0012\u00020\u0004`\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\nJ%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\nJ5\u0010\u0018\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0007j\b\u0012\u0004\u0012\u00020\u0004`\b0\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\u0011J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001a\u0010\nJ%\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00062\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001e\u0010\u0011J\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b \u0010\nJ\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00062\u0006\u0010\u001c\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\"\u0010\nJ%\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b$\u0010\u0011J-\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0004H\u0007¢\u0006\u0004\b$\u0010\u0015J%\u0010&\u001a\b\u0012\u0004\u0012\u00020#0\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b&\u0010\u0011J\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020#0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b'\u0010\nJ\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b)\u0010\nJ%\u0010+\u001a\b\u0012\u0004\u0012\u00020#0\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u0019H\u0007¢\u0006\u0004\b+\u0010,J%\u0010.\u001a\b\u0012\u0004\u0012\u00020#0\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u0019H\u0007¢\u0006\u0004\b.\u0010,J\u001b\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000/0\u0006H\u0007¢\u0006\u0004\b1\u00102J\u001d\u00104\u001a\b\u0012\u0004\u0012\u0002030\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b4\u0010\nJ+\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050/0\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0004H\u0007¢\u0006\u0004\b6\u0010\u0011J\u001d\u00108\u001a\b\u0012\u0004\u0012\u0002070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b8\u0010\nJ#\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002090/0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b:\u0010\nJ'\u0010<\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u0019H\u0007¢\u0006\u0004\b<\u0010,J%\u0010>\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\u0004H\u0007¢\u0006\u0004\b>\u0010\u0011J#\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0/0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b@\u0010\nJ\u001d\u0010B\u001a\b\u0012\u0004\u0012\u00020A0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\bB\u0010\nJ'\u0010D\u001a\b\u0012\u0004\u0012\u00020A0\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010C\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\bD\u0010\u0011J'\u0010H\u001a\n\u0012\u0004\u0012\u00020G\u0018\u00010\u00062\u0006\u0010E\u001a\u00020\u00042\u0006\u0010F\u001a\u00020\u0004H\u0007¢\u0006\u0004\bH\u0010\u0011J#\u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020G0/0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\bI\u0010\nJ%\u0010L\u001a\b\u0012\u0004\u0012\u00020K0\u00062\u0006\u0010J\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\bL\u0010\u0011J%\u0010M\u001a\b\u0012\u0004\u0012\u00020K0\u00062\u0006\u0010J\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\bM\u0010\u0011J\u001d\u0010O\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010N\u001a\u00020\u0004H\u0007¢\u0006\u0004\bO\u0010\nJ\u001d\u0010Q\u001a\b\u0012\u0004\u0012\u00020P0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\bQ\u0010\nJ-\u0010T\u001a\b\u0012\u0004\u0012\u00020P0\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010R\u001a\u00020\u00042\u0006\u0010S\u001a\u00020\u0004H\u0007¢\u0006\u0004\bT\u0010\u0015J5\u0010W\u001a\b\u0012\u0004\u0012\u00020P0\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010R\u001a\u00020\u00042\u0006\u0010U\u001a\u00020\u00042\u0006\u0010V\u001a\u00020\u0019H\u0007¢\u0006\u0004\bW\u0010XJ5\u0010Z\u001a\b\u0012\u0004\u0012\u00020P0\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010R\u001a\u00020\u00042\u0006\u0010U\u001a\u00020\u00042\u0006\u0010Y\u001a\u00020\u0004H\u0007¢\u0006\u0004\bZ\u0010[J\u001f\u0010]\u001a\n\u0012\u0004\u0012\u00020\\\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b]\u0010\nJ\u001d\u0010_\u001a\b\u0012\u0004\u0012\u00020^0\u00062\u0006\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b_\u0010\nJ%\u0010`\u001a\b\u0012\u0004\u0012\u0002070\u00062\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010U\u001a\u00020\u0004H\u0007¢\u0006\u0004\b`\u0010\u0011J\u001b\u0010b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020a0/0\u0006H\u0007¢\u0006\u0004\bb\u00102J%\u0010d\u001a\b\u0012\u0004\u0012\u00020c0\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010J\u001a\u00020\u0004H\u0007¢\u0006\u0004\bd\u0010\u0011J+\u0010f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010e\u001a\u00020\u00042\u0006\u0010Y\u001a\u00020\u0004¢\u0006\u0004\bf\u0010\u0015J#\u0010g\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010e\u001a\u00020\u0004¢\u0006\u0004\bg\u0010\u0011J#\u0010h\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010e\u001a\u00020\u0004¢\u0006\u0004\bh\u0010\u0011¨\u0006i"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/api/VirtualVoiceRoomApiProvider;", "", "<init>", "()V", "", "roomId", "Lrx/c;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "refreshManager", "(Ljava/lang/String;)Lrx/c;", "", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceManager;", "refreshCurrentManager", "userId", "Ll/uxj0;", "deleteManager", "(Ljava/lang/String;Ljava/lang/String;)Lrx/c;", UserId.TYPE, "type", "inviteBecomeManager", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lrx/c;", "deleteRoom", "remind", "messageReminds", "", "getMessageReminds", Oauth2AccessToken.KEY_UID, "liveId", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceLivePush;", BLiveHeatVoiceRoomTaskType.notifyFans, "Lcom/p1/mobile/putong/live/base/data/SiteWideBroadcastFinder;", "notifyBroadcastAll", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceAdminPanelCounter;", "adminCounter", "Lcom/p1/mobile/putong/live/base/data/BLiveExtraResponse;", "requestToSettleRoom", "token", "getUserSettlesStatus", "getVirtualVoiceRoomInfo", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceVirtualRoomSummary;", "getVirtualVoiceRoomSummary", "isPersonal", "setVirtualRoomPersonal", "(Ljava/lang/String;Z)Lrx/c;", "isFreeSettle", "setVirtualRoomFreeSettle", "", "Lcom/p1/mobile/putong/data/User;", "getVirtualVoiceUserMe", "()Lrx/c;", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceRoomLevelDetail;", "getVirtualRoomLevelDetail", "Lcom/p1/mobile/putong/live/base/data/BLiveHeatVoiceRoomTask;", "getVirtualHeatTasks", "Lcom/p1/mobile/putong/live/base/data/BLiveEnvelope;", "createStarRedPacket", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceStarRedPacket;", "getStarRedPacketDetail", "isTop", "setTopChat", "categoryId", "saveRoomCategory", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceRoomClass;", "getRoomCategory", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceRoomAsset;", "getVoiceRoomAsset", "fromUserId", "getVoiceRoomChatTips", "voiceliveid", "liveMode", "Lcom/p1/mobile/putong/live/base/data/BLiveVoice;", "switchLiveMode", "getNewestLiveByRoomId", "anchorId", "Lcom/p1/mobile/putong/live/base/data/BLiveLuckyParadiseBottomEntrance;", "getLuckyParadiseEntranceInfo", "getFunFairEntranceInfo", "voiceLiveId", "clearPopularity", "Lcom/p1/mobile/putong/live/base/data/BLiveLovePlanet;", "getLovePlanetInfo", "lovePlanetId", "stage", "changeStage", "otherUserId", LovePlanetStage.choice, "changePair", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lrx/c;", "action", "stopOrResetGame", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lrx/c;", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceLiveAssert;", "getMyGuild", "Lcom/p1/mobile/putong/live/base/data/BLiveVoicePayGuideUser;", "getApplyMatchUserInfo", "postLike", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceSquareButton;", "getVoiceSquareButtons", "Lcom/p1/mobile/putong/live/base/data/BLiveOperation;", "getVoiceRedPacketData", "inviteId", "operationManagerInvite", "approveManagerInvite", "rejectManagerInvite", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class VirtualVoiceRoomApiProvider {

    @NotNull
    public static final VirtualVoiceRoomApiProvider INSTANCE = new VirtualVoiceRoomApiProvider();

    private VirtualVoiceRoomApiProvider() {
    }

    /* JADX INFO: renamed from: A */
    public static BLiveVoiceRoomAsset m77905A(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope.data.voiceRoomAsset;
    }

    /* JADX INFO: renamed from: B */
    public static BLiveVoiceAdminPanelCounter m77906B(Function1 function1, Object obj) {
        return (BLiveVoiceAdminPanelCounter) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: C */
    public static BLiveVoice m77907C(Function1 function1, Object obj) {
        return (BLiveVoice) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: D */
    public static List m77908D(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: E */
    public static List m77909E(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope.data.starRedPackets;
    }

    /* JADX INFO: renamed from: F */
    public static List m77910F(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: G */
    public static uxj0 m77911G(BLiveEnvelope bLiveEnvelope) {
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: H */
    public static BLiveVoiceRoomAsset m77912H(Function1 function1, Object obj) {
        return (BLiveVoiceRoomAsset) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: I */
    public static List m77913I(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope.data.voiceSquareButtons;
    }

    /* JADX INFO: renamed from: J */
    public static BLiveVoiceVirtualRoomSummary m77914J(Function1 function1, Object obj) {
        return (BLiveVoiceVirtualRoomSummary) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: K */
    public static Boolean m77915K(BLiveEnvelope bLiveEnvelope) {
        return Boolean.valueOf(bLiveEnvelope.data.voiceUserMessageRemind.remind);
    }

    /* JADX INFO: renamed from: L */
    public static uxj0 m77916L(BLiveEnvelope bLiveEnvelope) {
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: M */
    public static BLiveVoiceLivePush m77917M(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope.data.voiceLivePush;
    }

    /* JADX INFO: renamed from: N */
    public static BLiveLovePlanet m77918N(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope.data.lovePlanet;
    }

    /* JADX INFO: renamed from: O */
    public static uxj0 m77919O(Function1 function1, Object obj) {
        return (uxj0) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: P */
    public static uxj0 m77920P(BLiveEnvelope bLiveEnvelope) {
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: Q */
    public static uxj0 m77921Q(Function1 function1, Object obj) {
        return (uxj0) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: R */
    public static uxj0 m77922R(Function1 function1, Object obj) {
        return (uxj0) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: S */
    public static uxj0 m77923S(BLiveEnvelope bLiveEnvelope) {
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: T */
    public static ArrayList m77924T(Function1 function1, Object obj) {
        return (ArrayList) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: U */
    public static ArrayList m77925U(BLiveEnvelope bLiveEnvelope) {
        return new ArrayList(jyb.m147486Q(bLiveEnvelope.data.voiceManagers, new qcj() { // from class: l.o9m0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveVoiceManager) obj).userId;
            }
        }));
    }

    /* JADX INFO: renamed from: V */
    public static List m77926V(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: W */
    public static BLiveVoicePayGuideUser m77927W(BLiveEnvelope bLiveEnvelope) {
        bLiveEnvelope.getClass();
        return bLiveEnvelope.data.voicePayGuideUser;
    }

    /* JADX INFO: renamed from: X */
    public static BLiveLuckyParadiseBottomEntrance m77928X(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope.data.luckyParadiseBottomEntrance;
    }

    /* JADX INFO: renamed from: Y */
    public static List m77929Y(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Z */
    public static Boolean m77930Z(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: a0 */
    public static ArrayList m77932a0(Function1 function1, Object obj) {
        return (ArrayList) function1.invoke(obj);
    }

    @JvmStatic
    @NotNull
    public static final C22421c<BLiveVoiceAdminPanelCounter> adminCounter(@NotNull String liveId) {
        liveId.getClass();
        C22421c<BLiveEnvelope> c22421cM202547h = vrv.m202547h(rnl.m182263l(zvr.m221805e("/voice-lives/" + liveId + "/adminPanelCounter")), "adminCounter");
        final Function1 function1 = new Function1() { // from class: l.fam0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m77935c((BLiveEnvelope) obj);
            }
        };
        C22421c map = c22421cM202547h.map(new qcj() { // from class: l.gam0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m77906B(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    /* JADX INFO: renamed from: b */
    public static BLiveLovePlanet m77933b(Function1 function1, Object obj) {
        return (BLiveLovePlanet) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: b0 */
    public static List m77934b0(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: c */
    public static BLiveVoiceAdminPanelCounter m77935c(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope.data.voiceAdminPanelCounter;
    }

    /* JADX INFO: renamed from: c0 */
    public static uxj0 m77936c0(BLiveEnvelope bLiveEnvelope) {
        return uxj0.f181467a;
    }

    @JvmStatic
    @NotNull
    public static final C22421c<BLiveLovePlanet> changePair(@NotNull String roomId, @NotNull String lovePlanetId, @NotNull String otherUserId, boolean choice) {
        roomId.getClass();
        lovePlanetId.getClass();
        otherUserId.getClass();
        rnl.C19886a c19886aM182288p = LiveApiBuilder.m68498u(zvr.m221805e("/voice-rooms/" + roomId + "/love-planet/" + (choice ? LovePlanetStage.choice : "unchoice")), new st0[0]).m182288p();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("lovePlanetID", lovePlanetId);
        jSONObject.put("otherUserID", otherUserId);
        C22421c<BLiveEnvelope> c22421cM202557r = vrv.m202557r(c19886aM182288p.m182301d(), "changePair" + roomId, jSONObject.toString());
        final Function1 function1 = new Function1() { // from class: l.fbm0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m77968t((BLiveEnvelope) obj);
            }
        };
        C22421c map = c22421cM202557r.map(new qcj() { // from class: l.gbm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m77948i0(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @JvmStatic
    @NotNull
    public static final C22421c<BLiveLovePlanet> changeStage(@NotNull String roomId, @NotNull String lovePlanetId, @NotNull String stage) throws JSONException {
        roomId.getClass();
        lovePlanetId.getClass();
        stage.getClass();
        rnl.C19886a c19886aM182288p = LiveApiBuilder.m68498u(zvr.m221805e("/voice-rooms/" + roomId + "/love-planet/next"), new st0[0]).m182288p();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("lovePlanetID", lovePlanetId);
        C22421c<BLiveEnvelope> c22421cM202557r = vrv.m202557r(c19886aM182288p.m182301d(), "changeLovePlanetStage" + roomId, jSONObject.toString());
        final Function1 function1 = new Function1() { // from class: l.hbm0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m77971w((BLiveEnvelope) obj);
            }
        };
        C22421c map = c22421cM202557r.map(new qcj() { // from class: l.jbm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m77933b(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @JvmStatic
    @NotNull
    public static final C22421c<uxj0> clearPopularity(@NotNull String voiceLiveId) throws JSONException {
        voiceLiveId.getClass();
        rnl rnlVarM182301d = LiveApiBuilder.m68498u(zvr.m221802b("/live/voice-lives/" + voiceLiveId + "/rewardPoint"), new st0[0]).m182288p().m182301d();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "call");
        C22421c<BLiveEnvelope> c22421cM202540a = vrv.m202540a(rnlVarM182301d, "rewardPoint" + voiceLiveId, jSONObject.toString());
        final Function1 function1 = new Function1() { // from class: l.tbm0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m77920P((BLiveEnvelope) obj);
            }
        };
        C22421c map = c22421cM202540a.map(new qcj() { // from class: l.ubm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m77922R(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @JvmStatic
    @NotNull
    public static final C22421c<BLiveEnvelope> createStarRedPacket(@NotNull String roomId) {
        roomId.getClass();
        C22421c<BLiveEnvelope> c22421cM202555p = vrv.m202555p(rnl.m182263l(zvr.m221802b("/live/voice-rooms/" + roomId + "/star-redpackets")), "createStarRedPacket", "");
        c22421cM202555p.getClass();
        return c22421cM202555p;
    }

    /* JADX INFO: renamed from: d */
    public static BLiveLuckyParadiseBottomEntrance m77937d(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope.data.funFairBottomEntrance;
    }

    /* JADX INFO: renamed from: d0 */
    public static BLiveVoice m77938d0(BLiveEnvelope bLiveEnvelope) {
        bLiveEnvelope.getClass();
        return bLiveEnvelope.data.voiceLives.get(0);
    }

    @JvmStatic
    @NotNull
    public static final C22421c<uxj0> deleteManager(@NotNull String roomId, @NotNull String userId) {
        roomId.getClass();
        userId.getClass();
        rnl rnlVarM182301d = rnl.m182263l(zvr.m221805e("/voice-rooms/" + roomId + "/managers/" + userId)).m182288p().m182301d();
        StringBuilder sb = new StringBuilder("deleteManager");
        sb.append(userId);
        sb.append(roomId);
        C22421c<BLiveEnvelope> c22421cM202540a = vrv.m202540a(rnlVarM182301d, sb.toString(), "");
        final Function1 function1 = new Function1() { // from class: l.dam0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m77936c0((BLiveEnvelope) obj);
            }
        };
        C22421c map = c22421cM202540a.map(new qcj() { // from class: l.eam0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m77919O(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @JvmStatic
    @NotNull
    public static final C22421c<uxj0> deleteRoom(@NotNull String roomId) {
        roomId.getClass();
        C22421c<BLiveEnvelope> c22421cM202540a = vrv.m202540a(rnl.m182263l(zvr.m221802b("/voice-rooms/" + roomId)).m182288p().m182301d(), "deleteRoom" + roomId, "");
        final Function1 function1 = new Function1() { // from class: l.vbm0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m77974z((BLiveEnvelope) obj);
            }
        };
        C22421c map = c22421cM202540a.map(new qcj() { // from class: l.wbm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m77939e(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    /* JADX INFO: renamed from: e */
    public static uxj0 m77939e(Function1 function1, Object obj) {
        return (uxj0) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e0 */
    public static BLiveLuckyParadiseBottomEntrance m77940e0(Function1 function1, Object obj) {
        return (BLiveLuckyParadiseBottomEntrance) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: f */
    public static BLiveLovePlanet m77941f(Function1 function1, Object obj) {
        return (BLiveLovePlanet) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: f0 */
    public static BLiveLovePlanet m77942f0(Function1 function1, Object obj) {
        return (BLiveLovePlanet) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: g */
    public static List m77943g(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope.data.voiceLives;
    }

    /* JADX INFO: renamed from: g0 */
    public static BLiveOperation m77944g0(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope.data.liveOperation;
    }

    @JvmStatic
    @NotNull
    public static final C22421c<BLiveVoicePayGuideUser> getApplyMatchUserInfo(@NotNull String userId) {
        userId.getClass();
        C22421c<BLiveEnvelope> c22421cM202547h = vrv.m202547h(rnl.m182263l(zvr.m221805e("/voice-pay-guide-users/" + userId)), "getApplyMatchUserInfo" + userId);
        final Function1 function1 = new Function1() { // from class: l.lam0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m77927W((BLiveEnvelope) obj);
            }
        };
        C22421c map = c22421cM202547h.map(new qcj() { // from class: l.nam0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m77965r(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @JvmStatic
    @NotNull
    public static final C22421c<BLiveLuckyParadiseBottomEntrance> getFunFairEntranceInfo(@NotNull String anchorId, @NotNull String roomId) {
        anchorId.getClass();
        roomId.getClass();
        rnl.C19886a c19886aM182288p = LiveApiBuilder.m68498u(zvr.m221802b("/live-campaigns/lt_funFair/anchors/" + anchorId + "/details/bottomEntrance"), new st0[0]).m182288p();
        c19886aM182288p.m182300c("roomId", roomId);
        C22421c<BLiveEnvelope> c22421cM202547h = vrv.m202547h(c19886aM182288p.m182301d(), "getFunFairEntranceInfo" + roomId);
        final Function1 function1 = new Function1() { // from class: l.y9m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m77937d((BLiveEnvelope) obj);
            }
        };
        C22421c map = c22421cM202547h.map(new qcj() { // from class: l.z9m0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m77967s(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @JvmStatic
    @NotNull
    public static final C22421c<BLiveLovePlanet> getLovePlanetInfo(@NotNull String roomId) {
        roomId.getClass();
        rnl rnlVarM182301d = LiveApiBuilder.m68498u(zvr.m221805e("/voice-rooms/" + roomId + "/love-planet"), new st0[0]).m182288p().m182301d();
        StringBuilder sb = new StringBuilder("getLovePlanetInfo");
        sb.append(roomId);
        C22421c<BLiveEnvelope> c22421cM202547h = vrv.m202547h(rnlVarM182301d, sb.toString());
        final Function1 function1 = new Function1() { // from class: l.i9m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m77957n((BLiveEnvelope) obj);
            }
        };
        C22421c map = c22421cM202547h.map(new qcj() { // from class: l.j9m0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m77941f(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @JvmStatic
    @NotNull
    public static final C22421c<BLiveLuckyParadiseBottomEntrance> getLuckyParadiseEntranceInfo(@NotNull String anchorId, @NotNull String roomId) {
        anchorId.getClass();
        roomId.getClass();
        rnl.C19886a c19886aM182288p = LiveApiBuilder.m68498u(zvr.m221802b("/live-campaigns/luckyParadiseV2/anchors/" + anchorId + "/details/bottomEntrance"), new st0[0]).m182288p();
        c19886aM182288p.m182300c("roomId", roomId);
        C22421c<BLiveEnvelope> c22421cM202547h = vrv.m202547h(c19886aM182288p.m182301d(), "getLuckyParadiseEntranceInfo" + roomId);
        final Function1 function1 = new Function1() { // from class: l.bbm0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m77928X((BLiveEnvelope) obj);
            }
        };
        C22421c map = c22421cM202547h.map(new qcj() { // from class: l.cbm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m77940e0(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @JvmStatic
    @NotNull
    public static final C22421c<Boolean> getMessageReminds(@NotNull String roomId) {
        roomId.getClass();
        C22421c<BLiveEnvelope> c22421cM202562w = vrv.m202562w(rnl.m182263l(zvr.m221805e("/voice-rooms/" + roomId + "/message-reminds")), "getMessageReminds");
        final Function1 function1 = new Function1() { // from class: l.xam0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m77915K((BLiveEnvelope) obj);
            }
        };
        C22421c map = c22421cM202562w.map(new qcj() { // from class: l.ibm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m77930Z(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @JvmStatic
    @Nullable
    public static final C22421c<BLiveVoiceLiveAssert> getMyGuild(@NotNull String userId) {
        userId.getClass();
        rnl rnlVarM182263l = rnl.m182263l(zvr.m221809i("/" + userId + "/voice-live-assert"));
        StringBuilder sb = new StringBuilder("getMyGuild");
        sb.append(userId);
        C22421c<BLiveEnvelope> c22421cM202547h = vrv.m202547h(rnlVarM182263l, sb.toString());
        final Function1 function1 = new Function1() { // from class: l.kbm0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m77956m0((BLiveEnvelope) obj);
            }
        };
        return c22421cM202547h.map(new qcj() { // from class: l.lbm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m77961p(function1, obj);
            }
        });
    }

    @JvmStatic
    @NotNull
    public static final C22421c<List<BLiveVoice>> getNewestLiveByRoomId(@NotNull String roomId) {
        roomId.getClass();
        rnl rnlVarM182301d = LiveApiBuilder.m68498u(zvr.m221802b("/voice-rooms/" + roomId + "/voice-lives"), new st0[0]).m182288p().m182301d();
        StringBuilder sb = new StringBuilder("getNewestLiveByRoomId");
        sb.append(roomId);
        C22421c<BLiveEnvelope> c22421cM202547h = vrv.m202547h(rnlVarM182301d, sb.toString());
        final Function1 function1 = new Function1() { // from class: l.ham0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m77943g((BLiveEnvelope) obj);
            }
        };
        C22421c map = c22421cM202547h.map(new qcj() { // from class: l.iam0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m77910F(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @JvmStatic
    @NotNull
    public static final C22421c<List<BLiveVoiceRoomClass>> getRoomCategory(@NotNull String roomId) {
        roomId.getClass();
        C22421c<BLiveEnvelope> c22421cM202547h = vrv.m202547h(LiveApiBuilder.m68498u(zvr.m221802b("/live/voice-room-classes"), new st0[0]).m182288p().m182300c("roomId", roomId).m182301d(), "getRoomCategory");
        final Function1 function1 = new Function1() { // from class: l.obm0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m77954l0((BLiveEnvelope) obj);
            }
        };
        C22421c map = c22421cM202547h.map(new qcj() { // from class: l.pbm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m77908D(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @JvmStatic
    @NotNull
    public static final C22421c<List<BLiveVoiceStarRedPacket>> getStarRedPacketDetail(@NotNull String roomId) {
        roomId.getClass();
        C22421c<BLiveEnvelope> c22421cM202562w = vrv.m202562w(rnl.m182263l(zvr.m221802b("/live/voice-rooms/" + roomId + "/star-redpackets")), "createStarRedPacket");
        final Function1 function1 = new Function1() { // from class: l.zam0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m77909E((BLiveEnvelope) obj);
            }
        };
        C22421c map = c22421cM202562w.map(new qcj() { // from class: l.abm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m77929Y(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @JvmStatic
    @NotNull
    public static final C22421c<BLiveExtraResponse> getUserSettlesStatus(@NotNull String roomId, @NotNull String userId) {
        roomId.getClass();
        userId.getClass();
        C22421c<BLiveExtraResponse> c22421cM202550k = vrv.m202550k(rnl.m182263l(zvr.m221802b("/live/voice-rooms/" + roomId + "/users/" + userId + "/settle")), "getUserSettlesStatus", BLiveExtraResponse.JSON_ADAPTER);
        c22421cM202550k.getClass();
        return c22421cM202550k;
    }

    @JvmStatic
    @NotNull
    public static final C22421c<List<BLiveHeatVoiceRoomTask>> getVirtualHeatTasks(@NotNull String roomId, @NotNull String liveId) {
        roomId.getClass();
        liveId.getClass();
        C22421c<BLiveEnvelope> c22421cM202562w = vrv.m202562w(rnl.m182263l(zvr.m221805e("/heat-voiceroom-tasks")).m182288p().m182300c("roomId", roomId).m182300c("liveId", liveId).m182301d(), "getVirtualHeatTasks");
        final Function1 function1 = new Function1() { // from class: l.sam0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m77973y((BLiveEnvelope) obj);
            }
        };
        C22421c map = c22421cM202562w.map(new qcj() { // from class: l.tam0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m77947i(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @JvmStatic
    @NotNull
    public static final C22421c<BLiveVoiceRoomLevelDetail> getVirtualRoomLevelDetail(@NotNull String roomId) {
        roomId.getClass();
        C22421c<BLiveEnvelope> c22421cM202562w = vrv.m202562w(rnl.m182263l(zvr.m221802b("/live/voice-rooms/" + roomId + "/levelDetail")), "getVirtualRoomLevelDetail");
        final Function1 function1 = new Function1() { // from class: l.mbm0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m77970v((BLiveEnvelope) obj);
            }
        };
        C22421c map = c22421cM202562w.map(new qcj() { // from class: l.nbm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m77951k(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @JvmStatic
    @NotNull
    public static final C22421c<BLiveExtraResponse> getVirtualVoiceRoomInfo(@NotNull String roomId) {
        roomId.getClass();
        C22421c<BLiveExtraResponse> c22421cM202550k = vrv.m202550k(rnl.m182263l(zvr.m221802b("/live/voice-rooms/" + roomId + "/profile")), "getVirtualVoiceRoomInfo", BLiveExtraResponse.JSON_ADAPTER);
        c22421cM202550k.getClass();
        return c22421cM202550k;
    }

    @JvmStatic
    @NotNull
    public static final C22421c<BLiveVoiceVirtualRoomSummary> getVirtualVoiceRoomSummary(@NotNull String roomId) {
        roomId.getClass();
        C22421c<BLiveEnvelope> c22421cM202562w = vrv.m202562w(rnl.m182263l(zvr.m221802b("/live/voice-rooms/" + roomId + "/roomSummary")), "getVirtualVoiceRoomSummary");
        final Function1 function1 = new Function1() { // from class: l.oam0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m77946h0((BLiveEnvelope) obj);
            }
        };
        C22421c map = c22421cM202562w.map(new qcj() { // from class: l.pam0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m77914J(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @JvmStatic
    @NotNull
    public static final C22421c<List<User>> getVirtualVoiceUserMe() {
        C22421c<BLiveEnvelope> c22421cM202562w = vrv.m202562w(rnl.m182263l(zvr.m221802b("/users/me")), "getVirtualVoiceUserMe");
        final Function1 function1 = new Function1() { // from class: l.s9m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m77964q0((BLiveEnvelope) obj);
            }
        };
        C22421c map = c22421cM202562w.map(new qcj() { // from class: l.t9m0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m77934b0(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @JvmStatic
    @NotNull
    public static final C22421c<BLiveOperation> getVoiceRedPacketData(@NotNull String roomId, @NotNull String anchorId) {
        roomId.getClass();
        anchorId.getClass();
        C22421c<BLiveEnvelope> c22421cM202562w = vrv.m202562w(rnl.m182263l(zvr.m221802b("/live-operations")).m182288p().m182300c("roomId", roomId).m182300c("anchorId", anchorId).m182300c("roomType", "voice").m182301d(), "getVoiceRedPacketData");
        final Function1 function1 = new Function1() { // from class: l.aam0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m77944g0((BLiveEnvelope) obj);
            }
        };
        C22421c map = c22421cM202562w.map(new qcj() { // from class: l.cam0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m77966r0(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @JvmStatic
    @NotNull
    public static final C22421c<BLiveVoiceRoomAsset> getVoiceRoomAsset(@NotNull String roomId) {
        roomId.getClass();
        C22421c<BLiveEnvelope> c22421cM202547h = vrv.m202547h(LiveApiBuilder.m68498u(zvr.m221805e("/voice-rooms/" + roomId + "/room-asset"), new st0[0]).m182288p().m182301d(), "getVoiceRoomAsset");
        final Function1 function1 = new Function1() { // from class: l.m9m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m77949j((BLiveEnvelope) obj);
            }
        };
        C22421c map = c22421cM202547h.map(new qcj() { // from class: l.n9m0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m77952k0(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @JvmStatic
    @NotNull
    public static final C22421c<BLiveVoiceRoomAsset> getVoiceRoomChatTips(@NotNull String roomId, @Nullable String fromUserId) {
        roomId.getClass();
        rnl.C19886a c19886aM182288p = LiveApiBuilder.m68498u(zvr.m221805e("/voice-rooms/" + roomId + "/chat-tips"), new st0[0]).m182288p();
        if (!TextUtils.isEmpty(fromUserId)) {
            c19886aM182288p.m182300c("fromUserId", fromUserId);
        }
        C22421c<BLiveEnvelope> c22421cM202547h = vrv.m202547h(c19886aM182288p.m182301d(), "getVoiceRoomChatTips");
        final Function1 function1 = new Function1() { // from class: l.p9m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m77905A((BLiveEnvelope) obj);
            }
        };
        C22421c map = c22421cM202547h.map(new qcj() { // from class: l.r9m0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m77912H(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @JvmStatic
    @NotNull
    public static final C22421c<List<BLiveVoiceSquareButton>> getVoiceSquareButtons() {
        C22421c<BLiveEnvelope> c22421cM202562w = vrv.m202562w(rnl.m182263l(zvr.m221805e("/voiceSquareButtons")), "getVoiceSquareButtons");
        final Function1 function1 = new Function1() { // from class: l.w9m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m77913I((BLiveEnvelope) obj);
            }
        };
        C22421c map = c22421cM202562w.map(new qcj() { // from class: l.x9m0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m77926V(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    /* JADX INFO: renamed from: h */
    public static List m77945h(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope.data.voiceManagers;
    }

    /* JADX INFO: renamed from: h0 */
    public static BLiveVoiceVirtualRoomSummary m77946h0(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope.data.voiceRoomSummary;
    }

    /* JADX INFO: renamed from: i */
    public static List m77947i(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: i0 */
    public static BLiveLovePlanet m77948i0(Function1 function1, Object obj) {
        return (BLiveLovePlanet) function1.invoke(obj);
    }

    @JvmStatic
    @NotNull
    public static final C22421c<uxj0> inviteBecomeManager(@NotNull String roomId, @NotNull String userid, @NotNull String type) {
        roomId.getClass();
        userid.getClass();
        type.getClass();
        rnl rnlVarM182301d = rnl.m182263l(zvr.m221805e("/voice-rooms/" + roomId + "/manager-invites")).m182288p().m182301d();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("userId", userid);
            jSONObject.put("type", type);
        } catch (JSONException unused) {
        }
        C22421c<BLiveEnvelope> c22421cM202555p = vrv.m202555p(rnlVarM182301d, "inviteBecomeManager" + roomId + userid + type, jSONObject.toString());
        final Function1 function1 = new Function1() { // from class: l.qam0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m77923S((BLiveEnvelope) obj);
            }
        };
        C22421c map = c22421cM202555p.map(new qcj() { // from class: l.ram0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m77959o(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    /* JADX INFO: renamed from: j */
    public static BLiveVoiceRoomAsset m77949j(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope.data.voiceRoomAsset;
    }

    /* JADX INFO: renamed from: j0 */
    public static SiteWideBroadcastFinder m77950j0(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope.data.siteWideBroadcastFinder;
    }

    /* JADX INFO: renamed from: k */
    public static BLiveVoiceRoomLevelDetail m77951k(Function1 function1, Object obj) {
        return (BLiveVoiceRoomLevelDetail) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: k0 */
    public static BLiveVoiceRoomAsset m77952k0(Function1 function1, Object obj) {
        return (BLiveVoiceRoomAsset) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: l */
    public static uxj0 m77953l(BLiveEnvelope bLiveEnvelope) {
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: l0 */
    public static List m77954l0(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope.data.voiceRoomClasses;
    }

    /* JADX INFO: renamed from: m */
    public static BLiveVoiceLivePush m77955m(Function1 function1, Object obj) {
        return (BLiveVoiceLivePush) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: m0 */
    public static BLiveVoiceLiveAssert m77956m0(BLiveEnvelope bLiveEnvelope) {
        bLiveEnvelope.getClass();
        return bLiveEnvelope.data.voiceLiveAssert;
    }

    @JvmStatic
    @NotNull
    public static final C22421c<ArrayList<String>> messageReminds(@NotNull String roomId, @NotNull String remind) throws JSONException {
        roomId.getClass();
        remind.getClass();
        String strM221805e = zvr.m221805e("/voice-rooms/" + roomId + "/message-reminds");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("remindType", remind);
        C22421c<BLiveEnvelope> c22421cM202555p = vrv.m202555p(rnl.m182263l(strM221805e), "messageReminds", jSONObject.toString());
        final Function1 function1 = new Function1() { // from class: l.dbm0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m77925U((BLiveEnvelope) obj);
            }
        };
        C22421c map = c22421cM202555p.map(new qcj() { // from class: l.ebm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m77924T(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    /* JADX INFO: renamed from: n */
    public static BLiveLovePlanet m77957n(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope.data.lovePlanet;
    }

    /* JADX INFO: renamed from: n0 */
    public static uxj0 m77958n0(Function1 function1, Object obj) {
        return (uxj0) function1.invoke(obj);
    }

    @JvmStatic
    @NotNull
    public static final C22421c<SiteWideBroadcastFinder> notifyBroadcastAll(@NotNull String roomId) {
        roomId.getClass();
        C22421c<BLiveEnvelope> c22421cM202555p = vrv.m202555p(rnl.m182263l(zvr.m221802b("/voice-rooms/" + roomId + "/siteWideBroadcastFinder")), "siteWideBroadcastFinder", "");
        final Function1 function1 = new Function1() { // from class: l.g9m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m77950j0((BLiveEnvelope) obj);
            }
        };
        C22421c map = c22421cM202555p.map(new qcj() { // from class: l.h9m0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m77962p0(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @JvmStatic
    @NotNull
    public static final C22421c<BLiveVoiceLivePush> notifyFans(@NotNull String uid, @NotNull String liveId) throws JSONException {
        uid.getClass();
        liveId.getClass();
        String strM221802b = zvr.m221802b("/users/" + uid + "/voice-live-push");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "fans");
        jSONObject.put("voiceLiveId", liveId);
        C22421c<BLiveEnvelope> c22421cM202555p = vrv.m202555p(rnl.m182263l(strM221802b), BLiveHeatVoiceRoomTaskType.notifyFans, jSONObject.toString());
        final Function1 function1 = new Function1() { // from class: l.uam0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m77917M((BLiveEnvelope) obj);
            }
        };
        C22421c map = c22421cM202555p.map(new qcj() { // from class: l.vam0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m77955m(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    /* JADX INFO: renamed from: o */
    public static uxj0 m77959o(Function1 function1, Object obj) {
        return (uxj0) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: o0 */
    public static List m77960o0(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: p */
    public static BLiveVoiceLiveAssert m77961p(Function1 function1, Object obj) {
        return (BLiveVoiceLiveAssert) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: p0 */
    public static SiteWideBroadcastFinder m77962p0(Function1 function1, Object obj) {
        return (SiteWideBroadcastFinder) function1.invoke(obj);
    }

    @JvmStatic
    @NotNull
    public static final C22421c<BLiveEnvelope> postLike(@NotNull String userId, @NotNull String otherUserId) {
        userId.getClass();
        otherUserId.getClass();
        rnl rnlVarM182263l = rnl.m182263l(zvr.m221805e("/users/" + userId + "/voiceLike/" + otherUserId + "?scene=payGuide"));
        StringBuilder sb = new StringBuilder("postLike");
        sb.append(userId);
        C22421c<BLiveEnvelope> c22421cM202555p = vrv.m202555p(rnlVarM182263l, sb.toString(), "");
        c22421cM202555p.getClass();
        return c22421cM202555p;
    }

    /* JADX INFO: renamed from: q */
    public static uxj0 m77963q(Function1 function1, Object obj) {
        return (uxj0) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: q0 */
    public static List m77964q0(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope.data.users;
    }

    /* JADX INFO: renamed from: r */
    public static BLiveVoicePayGuideUser m77965r(Function1 function1, Object obj) {
        return (BLiveVoicePayGuideUser) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: r0 */
    public static BLiveOperation m77966r0(Function1 function1, Object obj) {
        return (BLiveOperation) function1.invoke(obj);
    }

    @JvmStatic
    @NotNull
    public static final C22421c<List<BLiveVoiceManager>> refreshCurrentManager(@NotNull String roomId) {
        roomId.getClass();
        C22421c<BLiveEnvelope> c22421cM202562w = vrv.m202562w(rnl.m182263l(zvr.m221805e("/voice-rooms/" + roomId + "/managers")), "refreshRoomManager");
        final Function1 function1 = new Function1() { // from class: l.wam0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m77945h((BLiveEnvelope) obj);
            }
        };
        C22421c map = c22421cM202562w.map(new qcj() { // from class: l.yam0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m77960o0(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @JvmStatic
    @NotNull
    public static final C22421c<ArrayList<String>> refreshManager(@NotNull String roomId) {
        roomId.getClass();
        C22421c<BLiveEnvelope> c22421cM202562w = vrv.m202562w(rnl.m182263l(zvr.m221805e("/voice-rooms/" + roomId + "/managers")), "refreshRoomManager");
        final Function1 function1 = new Function1() { // from class: l.jam0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m77969u((BLiveEnvelope) obj);
            }
        };
        C22421c map = c22421cM202562w.map(new qcj() { // from class: l.kam0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m77932a0(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @JvmStatic
    @NotNull
    public static final C22421c<BLiveExtraResponse> requestToSettleRoom(@NotNull String roomId, @NotNull String userId, @NotNull String token) {
        roomId.getClass();
        userId.getClass();
        token.getClass();
        C22421c<BLiveExtraResponse> c22421cM202556q = vrv.m202556q(rnl.m182263l(zvr.m221802b("/live/voice-rooms/" + roomId + "/users/" + userId + "/settle")).m182288p().m182300c("token", token).m182301d(), "requestToSettleRoom", BLiveExtraResponse.JSON_ADAPTER, "");
        c22421cM202556q.getClass();
        return c22421cM202556q;
    }

    /* JADX INFO: renamed from: s */
    public static BLiveLuckyParadiseBottomEntrance m77967s(Function1 function1, Object obj) {
        return (BLiveLuckyParadiseBottomEntrance) function1.invoke(obj);
    }

    @JvmStatic
    @NotNull
    public static final C22421c<uxj0> saveRoomCategory(@NotNull String roomId, @NotNull String categoryId) throws JSONException {
        roomId.getClass();
        categoryId.getClass();
        rnl rnlVarM182301d = LiveApiBuilder.m68498u(zvr.m221802b("/live/voice-rooms/" + roomId + "/profile"), new st0[0]).m182288p().m182300c("field", XHTML.ATTR.CLASS).m182301d();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("classId", categoryId);
        C22421c<BLiveEnvelope> c22421cM202541b = vrv.m202541b(rnlVarM182301d, "saveRoomCategory" + categoryId, jSONObject.toString());
        final Function1 function1 = new Function1() { // from class: l.k9m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m77916L((BLiveEnvelope) obj);
            }
        };
        C22421c map = c22421cM202541b.map(new qcj() { // from class: l.l9m0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m77963q(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @JvmStatic
    @Nullable
    public static final C22421c<uxj0> setTopChat(@NotNull String roomId, boolean isTop) {
        roomId.getClass();
        C22421c<BLiveEnvelope> c22421cM202541b = vrv.m202541b(LiveApiBuilder.m68498u(zvr.m221802b("/live-chat/message-cells/" + roomId), new st0[0]).m182288p().m182300c("action", isTop ? "stick" : "unstick").m182301d(), "message-cells", "");
        final Function1 function1 = new Function1() { // from class: l.bam0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m77911G((BLiveEnvelope) obj);
            }
        };
        return c22421cM202541b.map(new qcj() { // from class: l.mam0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m77921Q(function1, obj);
            }
        });
    }

    @JvmStatic
    @NotNull
    public static final C22421c<BLiveExtraResponse> setVirtualRoomFreeSettle(@NotNull String roomId, boolean isFreeSettle) {
        roomId.getClass();
        String strM221802b = zvr.m221802b("/live/voice-rooms/" + roomId + "/profile?field=freeSettle");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("freeSettle", isFreeSettle);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        C22421c<BLiveExtraResponse> c22421cM202553n = vrv.m202553n(rnl.m182263l(strM221802b), "setVirtualRoomFreeSettle", BLiveExtraResponse.JSON_ADAPTER, jSONObject.toString());
        c22421cM202553n.getClass();
        return c22421cM202553n;
    }

    @JvmStatic
    @NotNull
    public static final C22421c<BLiveExtraResponse> setVirtualRoomPersonal(@NotNull String roomId, boolean isPersonal) {
        roomId.getClass();
        String strM221802b = zvr.m221802b("/live/voice-rooms/" + roomId + "/profile?field=isPersonal");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isPersonal", isPersonal);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        C22421c<BLiveExtraResponse> c22421cM202553n = vrv.m202553n(rnl.m182263l(strM221802b), "setVirtualRoomPersonal", BLiveExtraResponse.JSON_ADAPTER, jSONObject.toString());
        c22421cM202553n.getClass();
        return c22421cM202553n;
    }

    @JvmStatic
    @NotNull
    public static final C22421c<BLiveLovePlanet> stopOrResetGame(@NotNull String roomId, @NotNull String lovePlanetId, @NotNull String otherUserId, @NotNull String action) {
        roomId.getClass();
        lovePlanetId.getClass();
        otherUserId.getClass();
        action.getClass();
        rnl.C19886a c19886aM182288p = LiveApiBuilder.m68498u(zvr.m221805e("/voice-rooms/" + roomId + "/love-planet/" + action), new st0[0]).m182288p();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("lovePlanetID", lovePlanetId);
        jSONObject.put("otherUserID", otherUserId);
        C22421c<BLiveEnvelope> c22421cM202557r = vrv.m202557r(c19886aM182288p.m182301d(), "stopOrResetGame" + roomId, jSONObject.toString());
        final Function1 function1 = new Function1() { // from class: l.f9m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m77918N((BLiveEnvelope) obj);
            }
        };
        C22421c map = c22421cM202557r.map(new qcj() { // from class: l.q9m0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m77942f0(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @JvmStatic
    @Nullable
    public static final C22421c<BLiveVoice> switchLiveMode(@NotNull String voiceliveid, @NotNull String liveMode) {
        voiceliveid.getClass();
        liveMode.getClass();
        rnl rnlVarM182301d = rnl.m182263l(zvr.m221802b("/voice-lives/" + voiceliveid + "?type=switchLiveMode&liveMode=" + liveMode)).m182288p().m182301d();
        StringBuilder sb = new StringBuilder("voiceLives");
        sb.append(liveMode);
        C22421c<BLiveEnvelope> c22421cM202552m = vrv.m202552m(rnlVarM182301d, sb.toString(), "");
        final Function1 function1 = new Function1() { // from class: l.qbm0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m77938d0((BLiveEnvelope) obj);
            }
        };
        return c22421cM202552m.map(new qcj() { // from class: l.rbm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m77907C(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public static BLiveLovePlanet m77968t(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope.data.lovePlanet;
    }

    /* JADX INFO: renamed from: u */
    public static ArrayList m77969u(BLiveEnvelope bLiveEnvelope) {
        return new ArrayList(jyb.m147486Q(bLiveEnvelope.data.voiceManagers, new qcj() { // from class: l.sbm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveVoiceManager) obj).userId;
            }
        }));
    }

    /* JADX INFO: renamed from: v */
    public static BLiveVoiceRoomLevelDetail m77970v(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope.data.voiceRoomLevelDetail;
    }

    /* JADX INFO: renamed from: w */
    public static BLiveLovePlanet m77971w(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope.data.lovePlanet;
    }

    /* JADX INFO: renamed from: y */
    public static List m77973y(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope.data.heatVoiceRoomTasks;
    }

    /* JADX INFO: renamed from: z */
    public static uxj0 m77974z(BLiveEnvelope bLiveEnvelope) {
        return uxj0.f181467a;
    }

    @NotNull
    public final C22421c<uxj0> approveManagerInvite(@NotNull String roomId, @NotNull String inviteId) {
        roomId.getClass();
        inviteId.getClass();
        return operationManagerInvite(roomId, inviteId, "approve");
    }

    @NotNull
    public final C22421c<uxj0> operationManagerInvite(@NotNull String roomId, @NotNull String inviteId, @NotNull String action) {
        roomId.getClass();
        inviteId.getClass();
        action.getClass();
        rnl rnlVarM182301d = rnl.m182263l(zvr.m221805e("/voice-rooms/" + roomId + "/manager-invites/" + inviteId)).m182288p().m182300c("action", action).m182301d();
        StringBuilder sb = new StringBuilder("operationManagerInvite");
        sb.append(inviteId);
        C22421c<BLiveEnvelope> c22421cM202552m = vrv.m202552m(rnlVarM182301d, sb.toString(), "");
        final Function1 function1 = new Function1() { // from class: l.u9m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m77953l((BLiveEnvelope) obj);
            }
        };
        C22421c map = c22421cM202552m.map(new qcj() { // from class: l.v9m0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m77958n0(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @NotNull
    public final C22421c<uxj0> rejectManagerInvite(@NotNull String roomId, @NotNull String inviteId) {
        roomId.getClass();
        inviteId.getClass();
        return operationManagerInvite(roomId, inviteId, "reject");
    }

    @JvmStatic
    @NotNull
    public static final C22421c<BLiveExtraResponse> requestToSettleRoom(@NotNull String roomId, @NotNull String userId) {
        roomId.getClass();
        userId.getClass();
        C22421c<BLiveExtraResponse> c22421cM202556q = vrv.m202556q(rnl.m182263l(zvr.m221802b("/live/voice-rooms/" + roomId + "/users/" + userId + "/settle")), "requestToSettleRoom", BLiveExtraResponse.JSON_ADAPTER, "");
        c22421cM202556q.getClass();
        return c22421cM202556q;
    }
}
