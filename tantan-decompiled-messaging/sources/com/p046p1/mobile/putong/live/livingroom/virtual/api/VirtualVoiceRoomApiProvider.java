package com.p046p1.mobile.putong.live.livingroom.virtual.api;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.data.UserId;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveExtraResponse;
import com.p046p1.mobile.putong.live.base.data.BLiveHeatVoiceRoomTask;
import com.p046p1.mobile.putong.live.base.data.BLiveHeatVoiceRoomTaskType;
import com.p046p1.mobile.putong.live.base.data.BLiveLovePlanet;
import com.p046p1.mobile.putong.live.base.data.BLiveLuckyParadiseBottomEntrance;
import com.p046p1.mobile.putong.live.base.data.BLiveOperation;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceAdminPanelCounter;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceLiveAssert;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceLivePush;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceManager;
import com.p046p1.mobile.putong.live.base.data.BLiveVoicePayGuideUser;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoomAsset;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoomClass;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoomLevelDetail;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceSquareButton;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceStarRedPacket;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceVirtualRoomSummary;
import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
import com.p046p1.mobile.putong.live.base.data.SiteWideBroadcastFinder;
import com.p046p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
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
import p133rx.C22306c;
import p149l.cll;
import p149l.mt0;
import p149l.roj0;
import p149l.upv;
import p149l.vwb;
import p149l.w9j;
import p149l.ytr;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\t\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0007j\b\u0012\u0004\u0012\u00020\u0004`\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\nJ%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\nJ5\u0010\u0018\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0007j\b\u0012\u0004\u0012\u00020\u0004`\b0\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\u0011J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001a\u0010\nJ%\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00062\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001e\u0010\u0011J\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b \u0010\nJ\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00062\u0006\u0010\u001c\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\"\u0010\nJ%\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b$\u0010\u0011J-\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0004H\u0007¢\u0006\u0004\b$\u0010\u0015J%\u0010&\u001a\b\u0012\u0004\u0012\u00020#0\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b&\u0010\u0011J\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020#0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b'\u0010\nJ\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b)\u0010\nJ%\u0010+\u001a\b\u0012\u0004\u0012\u00020#0\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u0019H\u0007¢\u0006\u0004\b+\u0010,J%\u0010.\u001a\b\u0012\u0004\u0012\u00020#0\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u0019H\u0007¢\u0006\u0004\b.\u0010,J\u001b\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000/0\u0006H\u0007¢\u0006\u0004\b1\u00102J\u001d\u00104\u001a\b\u0012\u0004\u0012\u0002030\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b4\u0010\nJ+\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050/0\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0004H\u0007¢\u0006\u0004\b6\u0010\u0011J\u001d\u00108\u001a\b\u0012\u0004\u0012\u0002070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b8\u0010\nJ#\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002090/0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b:\u0010\nJ'\u0010<\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u0019H\u0007¢\u0006\u0004\b<\u0010,J%\u0010>\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\u0004H\u0007¢\u0006\u0004\b>\u0010\u0011J#\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0/0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b@\u0010\nJ\u001d\u0010B\u001a\b\u0012\u0004\u0012\u00020A0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\bB\u0010\nJ'\u0010D\u001a\b\u0012\u0004\u0012\u00020A0\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010C\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\bD\u0010\u0011J'\u0010H\u001a\n\u0012\u0004\u0012\u00020G\u0018\u00010\u00062\u0006\u0010E\u001a\u00020\u00042\u0006\u0010F\u001a\u00020\u0004H\u0007¢\u0006\u0004\bH\u0010\u0011J#\u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020G0/0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\bI\u0010\nJ%\u0010L\u001a\b\u0012\u0004\u0012\u00020K0\u00062\u0006\u0010J\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\bL\u0010\u0011J%\u0010M\u001a\b\u0012\u0004\u0012\u00020K0\u00062\u0006\u0010J\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\bM\u0010\u0011J\u001d\u0010O\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010N\u001a\u00020\u0004H\u0007¢\u0006\u0004\bO\u0010\nJ\u001d\u0010Q\u001a\b\u0012\u0004\u0012\u00020P0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\bQ\u0010\nJ-\u0010T\u001a\b\u0012\u0004\u0012\u00020P0\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010R\u001a\u00020\u00042\u0006\u0010S\u001a\u00020\u0004H\u0007¢\u0006\u0004\bT\u0010\u0015J5\u0010W\u001a\b\u0012\u0004\u0012\u00020P0\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010R\u001a\u00020\u00042\u0006\u0010U\u001a\u00020\u00042\u0006\u0010V\u001a\u00020\u0019H\u0007¢\u0006\u0004\bW\u0010XJ5\u0010Z\u001a\b\u0012\u0004\u0012\u00020P0\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010R\u001a\u00020\u00042\u0006\u0010U\u001a\u00020\u00042\u0006\u0010Y\u001a\u00020\u0004H\u0007¢\u0006\u0004\bZ\u0010[J\u001f\u0010]\u001a\n\u0012\u0004\u0012\u00020\\\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b]\u0010\nJ\u001d\u0010_\u001a\b\u0012\u0004\u0012\u00020^0\u00062\u0006\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b_\u0010\nJ%\u0010`\u001a\b\u0012\u0004\u0012\u0002070\u00062\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010U\u001a\u00020\u0004H\u0007¢\u0006\u0004\b`\u0010\u0011J\u001b\u0010b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020a0/0\u0006H\u0007¢\u0006\u0004\bb\u00102J%\u0010d\u001a\b\u0012\u0004\u0012\u00020c0\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010J\u001a\u00020\u0004H\u0007¢\u0006\u0004\bd\u0010\u0011J+\u0010f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010e\u001a\u00020\u00042\u0006\u0010Y\u001a\u00020\u0004¢\u0006\u0004\bf\u0010\u0015J#\u0010g\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010e\u001a\u00020\u0004¢\u0006\u0004\bg\u0010\u0011J#\u0010h\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010e\u001a\u00020\u0004¢\u0006\u0004\bh\u0010\u0011¨\u0006i"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/api/VirtualVoiceRoomApiProvider;", "", "<init>", "()V", "", "roomId", "Lrx/c;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "refreshManager", "(Ljava/lang/String;)Lrx/c;", "", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceManager;", "refreshCurrentManager", "userId", "Ll/roj0;", "deleteManager", "(Ljava/lang/String;Ljava/lang/String;)Lrx/c;", UserId.TYPE, "type", "inviteBecomeManager", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lrx/c;", "deleteRoom", "remind", "messageReminds", "", "getMessageReminds", Oauth2AccessToken.KEY_UID, "liveId", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceLivePush;", BLiveHeatVoiceRoomTaskType.notifyFans, "Lcom/p1/mobile/putong/live/base/data/SiteWideBroadcastFinder;", "notifyBroadcastAll", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceAdminPanelCounter;", "adminCounter", "Lcom/p1/mobile/putong/live/base/data/BLiveExtraResponse;", "requestToSettleRoom", "token", "getUserSettlesStatus", "getVirtualVoiceRoomInfo", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceVirtualRoomSummary;", "getVirtualVoiceRoomSummary", "isPersonal", "setVirtualRoomPersonal", "(Ljava/lang/String;Z)Lrx/c;", "isFreeSettle", "setVirtualRoomFreeSettle", "", "Lcom/p1/mobile/putong/data/User;", "getVirtualVoiceUserMe", "()Lrx/c;", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceRoomLevelDetail;", "getVirtualRoomLevelDetail", "Lcom/p1/mobile/putong/live/base/data/BLiveHeatVoiceRoomTask;", "getVirtualHeatTasks", "Lcom/p1/mobile/putong/live/base/data/BLiveEnvelope;", "createStarRedPacket", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceStarRedPacket;", "getStarRedPacketDetail", "isTop", "setTopChat", "categoryId", "saveRoomCategory", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceRoomClass;", "getRoomCategory", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceRoomAsset;", "getVoiceRoomAsset", "fromUserId", "getVoiceRoomChatTips", "voiceliveid", "liveMode", "Lcom/p1/mobile/putong/live/base/data/BLiveVoice;", "switchLiveMode", "getNewestLiveByRoomId", "anchorId", "Lcom/p1/mobile/putong/live/base/data/BLiveLuckyParadiseBottomEntrance;", "getLuckyParadiseEntranceInfo", "getFunFairEntranceInfo", "voiceLiveId", "clearPopularity", "Lcom/p1/mobile/putong/live/base/data/BLiveLovePlanet;", "getLovePlanetInfo", "lovePlanetId", "stage", "changeStage", "otherUserId", LovePlanetStage.choice, "changePair", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lrx/c;", "action", "stopOrResetGame", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lrx/c;", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceLiveAssert;", "getMyGuild", "Lcom/p1/mobile/putong/live/base/data/BLiveVoicePayGuideUser;", "getApplyMatchUserInfo", "postLike", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceSquareButton;", "getVoiceSquareButtons", "Lcom/p1/mobile/putong/live/base/data/BLiveOperation;", "getVoiceRedPacketData", "inviteId", "operationManagerInvite", "approveManagerInvite", "rejectManagerInvite", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class VirtualVoiceRoomApiProvider {

    @NotNull
    public static final VirtualVoiceRoomApiProvider INSTANCE = new VirtualVoiceRoomApiProvider();

    private VirtualVoiceRoomApiProvider() {
    }

    /* JADX INFO: renamed from: A */
    public static BLiveVoiceRoomAsset m76722A(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope.data.voiceRoomAsset;
    }

    /* JADX INFO: renamed from: B */
    public static BLiveVoiceAdminPanelCounter m76723B(Function1 function1, Object obj) {
        return (BLiveVoiceAdminPanelCounter) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: C */
    public static BLiveVoice m76724C(Function1 function1, Object obj) {
        return (BLiveVoice) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: D */
    public static List m76725D(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: E */
    public static List m76726E(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope.data.starRedPackets;
    }

    /* JADX INFO: renamed from: F */
    public static List m76727F(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: G */
    public static roj0 m76728G(BLiveEnvelope bLiveEnvelope) {
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: H */
    public static BLiveVoiceRoomAsset m76729H(Function1 function1, Object obj) {
        return (BLiveVoiceRoomAsset) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: I */
    public static List m76730I(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope.data.voiceSquareButtons;
    }

    /* JADX INFO: renamed from: J */
    public static BLiveVoiceVirtualRoomSummary m76731J(Function1 function1, Object obj) {
        return (BLiveVoiceVirtualRoomSummary) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: K */
    public static Boolean m76732K(BLiveEnvelope bLiveEnvelope) {
        return Boolean.valueOf(bLiveEnvelope.data.voiceUserMessageRemind.remind);
    }

    /* JADX INFO: renamed from: L */
    public static roj0 m76733L(BLiveEnvelope bLiveEnvelope) {
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: M */
    public static BLiveVoiceLivePush m76734M(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope.data.voiceLivePush;
    }

    /* JADX INFO: renamed from: N */
    public static BLiveLovePlanet m76735N(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope.data.lovePlanet;
    }

    /* JADX INFO: renamed from: O */
    public static roj0 m76736O(Function1 function1, Object obj) {
        return (roj0) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: P */
    public static roj0 m76737P(BLiveEnvelope bLiveEnvelope) {
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: Q */
    public static roj0 m76738Q(Function1 function1, Object obj) {
        return (roj0) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: R */
    public static roj0 m76739R(Function1 function1, Object obj) {
        return (roj0) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: S */
    public static roj0 m76740S(BLiveEnvelope bLiveEnvelope) {
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: T */
    public static ArrayList m76741T(Function1 function1, Object obj) {
        return (ArrayList) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: U */
    public static ArrayList m76742U(BLiveEnvelope bLiveEnvelope) {
        return new ArrayList(vwb.m200303Q(bLiveEnvelope.data.voiceManagers, new w9j() { // from class: l.k0m0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveVoiceManager) obj).userId;
            }
        }));
    }

    /* JADX INFO: renamed from: V */
    public static List m76743V(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: W */
    public static BLiveVoicePayGuideUser m76744W(BLiveEnvelope bLiveEnvelope) {
        bLiveEnvelope.getClass();
        return bLiveEnvelope.data.voicePayGuideUser;
    }

    /* JADX INFO: renamed from: X */
    public static BLiveLuckyParadiseBottomEntrance m76745X(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope.data.luckyParadiseBottomEntrance;
    }

    /* JADX INFO: renamed from: Y */
    public static List m76746Y(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Z */
    public static Boolean m76747Z(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: a0 */
    public static ArrayList m76749a0(Function1 function1, Object obj) {
        return (ArrayList) function1.invoke(obj);
    }

    @JvmStatic
    @NotNull
    public static final C22306c<BLiveVoiceAdminPanelCounter> adminCounter(@NotNull String liveId) {
        liveId.getClass();
        C22306c<BLiveEnvelope> c22306cM194920h = upv.m194920h(cll.m107499l(ytr.m216076e("/voice-lives/" + liveId + "/adminPanelCounter")), "adminCounter");
        final Function1 function1 = new Function1() { // from class: l.b1m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m76752c((BLiveEnvelope) obj);
            }
        };
        C22306c map = c22306cM194920h.map(new w9j() { // from class: l.c1m0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m76723B(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    /* JADX INFO: renamed from: b */
    public static BLiveLovePlanet m76750b(Function1 function1, Object obj) {
        return (BLiveLovePlanet) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: b0 */
    public static List m76751b0(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: c */
    public static BLiveVoiceAdminPanelCounter m76752c(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope.data.voiceAdminPanelCounter;
    }

    /* JADX INFO: renamed from: c0 */
    public static roj0 m76753c0(BLiveEnvelope bLiveEnvelope) {
        return roj0.f160388a;
    }

    @JvmStatic
    @NotNull
    public static final C22306c<BLiveLovePlanet> changePair(@NotNull String roomId, @NotNull String lovePlanetId, @NotNull String otherUserId, boolean choice) {
        roomId.getClass();
        lovePlanetId.getClass();
        otherUserId.getClass();
        cll.C16188a c16188aM107524p = LiveApiBuilder.m67315u(ytr.m216076e("/voice-rooms/" + roomId + "/love-planet/" + (choice ? LovePlanetStage.choice : "unchoice")), new mt0[0]).m107524p();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("lovePlanetID", lovePlanetId);
        jSONObject.put("otherUserID", otherUserId);
        C22306c<BLiveEnvelope> c22306cM194930r = upv.m194930r(c16188aM107524p.m107537d(), "changePair" + roomId, jSONObject.toString());
        final Function1 function1 = new Function1() { // from class: l.b2m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m76785t((BLiveEnvelope) obj);
            }
        };
        C22306c map = c22306cM194930r.map(new w9j() { // from class: l.c2m0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m76765i0(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @JvmStatic
    @NotNull
    public static final C22306c<BLiveLovePlanet> changeStage(@NotNull String roomId, @NotNull String lovePlanetId, @NotNull String stage) throws JSONException {
        roomId.getClass();
        lovePlanetId.getClass();
        stage.getClass();
        cll.C16188a c16188aM107524p = LiveApiBuilder.m67315u(ytr.m216076e("/voice-rooms/" + roomId + "/love-planet/next"), new mt0[0]).m107524p();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("lovePlanetID", lovePlanetId);
        C22306c<BLiveEnvelope> c22306cM194930r = upv.m194930r(c16188aM107524p.m107537d(), "changeLovePlanetStage" + roomId, jSONObject.toString());
        final Function1 function1 = new Function1() { // from class: l.d2m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m76788w((BLiveEnvelope) obj);
            }
        };
        C22306c map = c22306cM194930r.map(new w9j() { // from class: l.f2m0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m76750b(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @JvmStatic
    @NotNull
    public static final C22306c<roj0> clearPopularity(@NotNull String voiceLiveId) throws JSONException {
        voiceLiveId.getClass();
        cll cllVarM107537d = LiveApiBuilder.m67315u(ytr.m216073b("/live/voice-lives/" + voiceLiveId + "/rewardPoint"), new mt0[0]).m107524p().m107537d();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "call");
        C22306c<BLiveEnvelope> c22306cM194913a = upv.m194913a(cllVarM107537d, "rewardPoint" + voiceLiveId, jSONObject.toString());
        final Function1 function1 = new Function1() { // from class: l.p2m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m76737P((BLiveEnvelope) obj);
            }
        };
        C22306c map = c22306cM194913a.map(new w9j() { // from class: l.q2m0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m76739R(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @JvmStatic
    @NotNull
    public static final C22306c<BLiveEnvelope> createStarRedPacket(@NotNull String roomId) {
        roomId.getClass();
        C22306c<BLiveEnvelope> c22306cM194928p = upv.m194928p(cll.m107499l(ytr.m216073b("/live/voice-rooms/" + roomId + "/star-redpackets")), "createStarRedPacket", "");
        c22306cM194928p.getClass();
        return c22306cM194928p;
    }

    /* JADX INFO: renamed from: d */
    public static BLiveLuckyParadiseBottomEntrance m76754d(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope.data.funFairBottomEntrance;
    }

    /* JADX INFO: renamed from: d0 */
    public static BLiveVoice m76755d0(BLiveEnvelope bLiveEnvelope) {
        bLiveEnvelope.getClass();
        return bLiveEnvelope.data.voiceLives.get(0);
    }

    @JvmStatic
    @NotNull
    public static final C22306c<roj0> deleteManager(@NotNull String roomId, @NotNull String userId) {
        roomId.getClass();
        userId.getClass();
        cll cllVarM107537d = cll.m107499l(ytr.m216076e("/voice-rooms/" + roomId + "/managers/" + userId)).m107524p().m107537d();
        StringBuilder sb = new StringBuilder("deleteManager");
        sb.append(userId);
        sb.append(roomId);
        C22306c<BLiveEnvelope> c22306cM194913a = upv.m194913a(cllVarM107537d, sb.toString(), "");
        final Function1 function1 = new Function1() { // from class: l.z0m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m76753c0((BLiveEnvelope) obj);
            }
        };
        C22306c map = c22306cM194913a.map(new w9j() { // from class: l.a1m0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m76736O(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @JvmStatic
    @NotNull
    public static final C22306c<roj0> deleteRoom(@NotNull String roomId) {
        roomId.getClass();
        C22306c<BLiveEnvelope> c22306cM194913a = upv.m194913a(cll.m107499l(ytr.m216073b("/voice-rooms/" + roomId)).m107524p().m107537d(), "deleteRoom" + roomId, "");
        final Function1 function1 = new Function1() { // from class: l.r2m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m76791z((BLiveEnvelope) obj);
            }
        };
        C22306c map = c22306cM194913a.map(new w9j() { // from class: l.s2m0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m76756e(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    /* JADX INFO: renamed from: e */
    public static roj0 m76756e(Function1 function1, Object obj) {
        return (roj0) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e0 */
    public static BLiveLuckyParadiseBottomEntrance m76757e0(Function1 function1, Object obj) {
        return (BLiveLuckyParadiseBottomEntrance) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: f */
    public static BLiveLovePlanet m76758f(Function1 function1, Object obj) {
        return (BLiveLovePlanet) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: f0 */
    public static BLiveLovePlanet m76759f0(Function1 function1, Object obj) {
        return (BLiveLovePlanet) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: g */
    public static List m76760g(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope.data.voiceLives;
    }

    /* JADX INFO: renamed from: g0 */
    public static BLiveOperation m76761g0(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope.data.liveOperation;
    }

    @JvmStatic
    @NotNull
    public static final C22306c<BLiveVoicePayGuideUser> getApplyMatchUserInfo(@NotNull String userId) {
        userId.getClass();
        C22306c<BLiveEnvelope> c22306cM194920h = upv.m194920h(cll.m107499l(ytr.m216076e("/voice-pay-guide-users/" + userId)), "getApplyMatchUserInfo" + userId);
        final Function1 function1 = new Function1() { // from class: l.h1m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m76744W((BLiveEnvelope) obj);
            }
        };
        C22306c map = c22306cM194920h.map(new w9j() { // from class: l.j1m0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m76782r(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @JvmStatic
    @NotNull
    public static final C22306c<BLiveLuckyParadiseBottomEntrance> getFunFairEntranceInfo(@NotNull String anchorId, @NotNull String roomId) {
        anchorId.getClass();
        roomId.getClass();
        cll.C16188a c16188aM107524p = LiveApiBuilder.m67315u(ytr.m216073b("/live-campaigns/lt_funFair/anchors/" + anchorId + "/details/bottomEntrance"), new mt0[0]).m107524p();
        c16188aM107524p.m107536c("roomId", roomId);
        C22306c<BLiveEnvelope> c22306cM194920h = upv.m194920h(c16188aM107524p.m107537d(), "getFunFairEntranceInfo" + roomId);
        final Function1 function1 = new Function1() { // from class: l.u0m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m76754d((BLiveEnvelope) obj);
            }
        };
        C22306c map = c22306cM194920h.map(new w9j() { // from class: l.v0m0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m76784s(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @JvmStatic
    @NotNull
    public static final C22306c<BLiveLovePlanet> getLovePlanetInfo(@NotNull String roomId) {
        roomId.getClass();
        cll cllVarM107537d = LiveApiBuilder.m67315u(ytr.m216076e("/voice-rooms/" + roomId + "/love-planet"), new mt0[0]).m107524p().m107537d();
        StringBuilder sb = new StringBuilder("getLovePlanetInfo");
        sb.append(roomId);
        C22306c<BLiveEnvelope> c22306cM194920h = upv.m194920h(cllVarM107537d, sb.toString());
        final Function1 function1 = new Function1() { // from class: l.e0m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m76774n((BLiveEnvelope) obj);
            }
        };
        C22306c map = c22306cM194920h.map(new w9j() { // from class: l.f0m0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m76758f(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @JvmStatic
    @NotNull
    public static final C22306c<BLiveLuckyParadiseBottomEntrance> getLuckyParadiseEntranceInfo(@NotNull String anchorId, @NotNull String roomId) {
        anchorId.getClass();
        roomId.getClass();
        cll.C16188a c16188aM107524p = LiveApiBuilder.m67315u(ytr.m216073b("/live-campaigns/luckyParadiseV2/anchors/" + anchorId + "/details/bottomEntrance"), new mt0[0]).m107524p();
        c16188aM107524p.m107536c("roomId", roomId);
        C22306c<BLiveEnvelope> c22306cM194920h = upv.m194920h(c16188aM107524p.m107537d(), "getLuckyParadiseEntranceInfo" + roomId);
        final Function1 function1 = new Function1() { // from class: l.x1m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m76745X((BLiveEnvelope) obj);
            }
        };
        C22306c map = c22306cM194920h.map(new w9j() { // from class: l.y1m0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m76757e0(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @JvmStatic
    @NotNull
    public static final C22306c<Boolean> getMessageReminds(@NotNull String roomId) {
        roomId.getClass();
        C22306c<BLiveEnvelope> c22306cM194935w = upv.m194935w(cll.m107499l(ytr.m216076e("/voice-rooms/" + roomId + "/message-reminds")), "getMessageReminds");
        final Function1 function1 = new Function1() { // from class: l.t1m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m76732K((BLiveEnvelope) obj);
            }
        };
        C22306c map = c22306cM194935w.map(new w9j() { // from class: l.e2m0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m76747Z(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @JvmStatic
    @Nullable
    public static final C22306c<BLiveVoiceLiveAssert> getMyGuild(@NotNull String userId) {
        userId.getClass();
        cll cllVarM107499l = cll.m107499l(ytr.m216080i("/" + userId + "/voice-live-assert"));
        StringBuilder sb = new StringBuilder("getMyGuild");
        sb.append(userId);
        C22306c<BLiveEnvelope> c22306cM194920h = upv.m194920h(cllVarM107499l, sb.toString());
        final Function1 function1 = new Function1() { // from class: l.g2m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m76773m0((BLiveEnvelope) obj);
            }
        };
        return c22306cM194920h.map(new w9j() { // from class: l.h2m0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m76778p(function1, obj);
            }
        });
    }

    @JvmStatic
    @NotNull
    public static final C22306c<List<BLiveVoice>> getNewestLiveByRoomId(@NotNull String roomId) {
        roomId.getClass();
        cll cllVarM107537d = LiveApiBuilder.m67315u(ytr.m216073b("/voice-rooms/" + roomId + "/voice-lives"), new mt0[0]).m107524p().m107537d();
        StringBuilder sb = new StringBuilder("getNewestLiveByRoomId");
        sb.append(roomId);
        C22306c<BLiveEnvelope> c22306cM194920h = upv.m194920h(cllVarM107537d, sb.toString());
        final Function1 function1 = new Function1() { // from class: l.d1m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m76760g((BLiveEnvelope) obj);
            }
        };
        C22306c map = c22306cM194920h.map(new w9j() { // from class: l.e1m0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m76727F(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @JvmStatic
    @NotNull
    public static final C22306c<List<BLiveVoiceRoomClass>> getRoomCategory(@NotNull String roomId) {
        roomId.getClass();
        C22306c<BLiveEnvelope> c22306cM194920h = upv.m194920h(LiveApiBuilder.m67315u(ytr.m216073b("/live/voice-room-classes"), new mt0[0]).m107524p().m107536c("roomId", roomId).m107537d(), "getRoomCategory");
        final Function1 function1 = new Function1() { // from class: l.k2m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m76771l0((BLiveEnvelope) obj);
            }
        };
        C22306c map = c22306cM194920h.map(new w9j() { // from class: l.l2m0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m76725D(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @JvmStatic
    @NotNull
    public static final C22306c<List<BLiveVoiceStarRedPacket>> getStarRedPacketDetail(@NotNull String roomId) {
        roomId.getClass();
        C22306c<BLiveEnvelope> c22306cM194935w = upv.m194935w(cll.m107499l(ytr.m216073b("/live/voice-rooms/" + roomId + "/star-redpackets")), "createStarRedPacket");
        final Function1 function1 = new Function1() { // from class: l.v1m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m76726E((BLiveEnvelope) obj);
            }
        };
        C22306c map = c22306cM194935w.map(new w9j() { // from class: l.w1m0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m76746Y(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @JvmStatic
    @NotNull
    public static final C22306c<BLiveExtraResponse> getUserSettlesStatus(@NotNull String roomId, @NotNull String userId) {
        roomId.getClass();
        userId.getClass();
        C22306c<BLiveExtraResponse> c22306cM194923k = upv.m194923k(cll.m107499l(ytr.m216073b("/live/voice-rooms/" + roomId + "/users/" + userId + "/settle")), "getUserSettlesStatus", BLiveExtraResponse.JSON_ADAPTER);
        c22306cM194923k.getClass();
        return c22306cM194923k;
    }

    @JvmStatic
    @NotNull
    public static final C22306c<List<BLiveHeatVoiceRoomTask>> getVirtualHeatTasks(@NotNull String roomId, @NotNull String liveId) {
        roomId.getClass();
        liveId.getClass();
        C22306c<BLiveEnvelope> c22306cM194935w = upv.m194935w(cll.m107499l(ytr.m216076e("/heat-voiceroom-tasks")).m107524p().m107536c("roomId", roomId).m107536c("liveId", liveId).m107537d(), "getVirtualHeatTasks");
        final Function1 function1 = new Function1() { // from class: l.o1m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m76790y((BLiveEnvelope) obj);
            }
        };
        C22306c map = c22306cM194935w.map(new w9j() { // from class: l.p1m0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m76764i(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @JvmStatic
    @NotNull
    public static final C22306c<BLiveVoiceRoomLevelDetail> getVirtualRoomLevelDetail(@NotNull String roomId) {
        roomId.getClass();
        C22306c<BLiveEnvelope> c22306cM194935w = upv.m194935w(cll.m107499l(ytr.m216073b("/live/voice-rooms/" + roomId + "/levelDetail")), "getVirtualRoomLevelDetail");
        final Function1 function1 = new Function1() { // from class: l.i2m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m76787v((BLiveEnvelope) obj);
            }
        };
        C22306c map = c22306cM194935w.map(new w9j() { // from class: l.j2m0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m76768k(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @JvmStatic
    @NotNull
    public static final C22306c<BLiveExtraResponse> getVirtualVoiceRoomInfo(@NotNull String roomId) {
        roomId.getClass();
        C22306c<BLiveExtraResponse> c22306cM194923k = upv.m194923k(cll.m107499l(ytr.m216073b("/live/voice-rooms/" + roomId + "/profile")), "getVirtualVoiceRoomInfo", BLiveExtraResponse.JSON_ADAPTER);
        c22306cM194923k.getClass();
        return c22306cM194923k;
    }

    @JvmStatic
    @NotNull
    public static final C22306c<BLiveVoiceVirtualRoomSummary> getVirtualVoiceRoomSummary(@NotNull String roomId) {
        roomId.getClass();
        C22306c<BLiveEnvelope> c22306cM194935w = upv.m194935w(cll.m107499l(ytr.m216073b("/live/voice-rooms/" + roomId + "/roomSummary")), "getVirtualVoiceRoomSummary");
        final Function1 function1 = new Function1() { // from class: l.k1m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m76763h0((BLiveEnvelope) obj);
            }
        };
        C22306c map = c22306cM194935w.map(new w9j() { // from class: l.l1m0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m76731J(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @JvmStatic
    @NotNull
    public static final C22306c<List<User>> getVirtualVoiceUserMe() {
        C22306c<BLiveEnvelope> c22306cM194935w = upv.m194935w(cll.m107499l(ytr.m216073b("/users/me")), "getVirtualVoiceUserMe");
        final Function1 function1 = new Function1() { // from class: l.o0m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m76781q0((BLiveEnvelope) obj);
            }
        };
        C22306c map = c22306cM194935w.map(new w9j() { // from class: l.p0m0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m76751b0(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @JvmStatic
    @NotNull
    public static final C22306c<BLiveOperation> getVoiceRedPacketData(@NotNull String roomId, @NotNull String anchorId) {
        roomId.getClass();
        anchorId.getClass();
        C22306c<BLiveEnvelope> c22306cM194935w = upv.m194935w(cll.m107499l(ytr.m216073b("/live-operations")).m107524p().m107536c("roomId", roomId).m107536c("anchorId", anchorId).m107536c("roomType", "voice").m107537d(), "getVoiceRedPacketData");
        final Function1 function1 = new Function1() { // from class: l.w0m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m76761g0((BLiveEnvelope) obj);
            }
        };
        C22306c map = c22306cM194935w.map(new w9j() { // from class: l.y0m0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m76783r0(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @JvmStatic
    @NotNull
    public static final C22306c<BLiveVoiceRoomAsset> getVoiceRoomAsset(@NotNull String roomId) {
        roomId.getClass();
        C22306c<BLiveEnvelope> c22306cM194920h = upv.m194920h(LiveApiBuilder.m67315u(ytr.m216076e("/voice-rooms/" + roomId + "/room-asset"), new mt0[0]).m107524p().m107537d(), "getVoiceRoomAsset");
        final Function1 function1 = new Function1() { // from class: l.i0m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m76766j((BLiveEnvelope) obj);
            }
        };
        C22306c map = c22306cM194920h.map(new w9j() { // from class: l.j0m0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m76769k0(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @JvmStatic
    @NotNull
    public static final C22306c<BLiveVoiceRoomAsset> getVoiceRoomChatTips(@NotNull String roomId, @Nullable String fromUserId) {
        roomId.getClass();
        cll.C16188a c16188aM107524p = LiveApiBuilder.m67315u(ytr.m216076e("/voice-rooms/" + roomId + "/chat-tips"), new mt0[0]).m107524p();
        if (!TextUtils.isEmpty(fromUserId)) {
            c16188aM107524p.m107536c("fromUserId", fromUserId);
        }
        C22306c<BLiveEnvelope> c22306cM194920h = upv.m194920h(c16188aM107524p.m107537d(), "getVoiceRoomChatTips");
        final Function1 function1 = new Function1() { // from class: l.l0m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m76722A((BLiveEnvelope) obj);
            }
        };
        C22306c map = c22306cM194920h.map(new w9j() { // from class: l.n0m0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m76729H(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @JvmStatic
    @NotNull
    public static final C22306c<List<BLiveVoiceSquareButton>> getVoiceSquareButtons() {
        C22306c<BLiveEnvelope> c22306cM194935w = upv.m194935w(cll.m107499l(ytr.m216076e("/voiceSquareButtons")), "getVoiceSquareButtons");
        final Function1 function1 = new Function1() { // from class: l.s0m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m76730I((BLiveEnvelope) obj);
            }
        };
        C22306c map = c22306cM194935w.map(new w9j() { // from class: l.t0m0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m76743V(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    /* JADX INFO: renamed from: h */
    public static List m76762h(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope.data.voiceManagers;
    }

    /* JADX INFO: renamed from: h0 */
    public static BLiveVoiceVirtualRoomSummary m76763h0(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope.data.voiceRoomSummary;
    }

    /* JADX INFO: renamed from: i */
    public static List m76764i(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: i0 */
    public static BLiveLovePlanet m76765i0(Function1 function1, Object obj) {
        return (BLiveLovePlanet) function1.invoke(obj);
    }

    @JvmStatic
    @NotNull
    public static final C22306c<roj0> inviteBecomeManager(@NotNull String roomId, @NotNull String userid, @NotNull String type) {
        roomId.getClass();
        userid.getClass();
        type.getClass();
        cll cllVarM107537d = cll.m107499l(ytr.m216076e("/voice-rooms/" + roomId + "/manager-invites")).m107524p().m107537d();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("userId", userid);
            jSONObject.put("type", type);
        } catch (JSONException unused) {
        }
        C22306c<BLiveEnvelope> c22306cM194928p = upv.m194928p(cllVarM107537d, "inviteBecomeManager" + roomId + userid + type, jSONObject.toString());
        final Function1 function1 = new Function1() { // from class: l.m1m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m76740S((BLiveEnvelope) obj);
            }
        };
        C22306c map = c22306cM194928p.map(new w9j() { // from class: l.n1m0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m76776o(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    /* JADX INFO: renamed from: j */
    public static BLiveVoiceRoomAsset m76766j(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope.data.voiceRoomAsset;
    }

    /* JADX INFO: renamed from: j0 */
    public static SiteWideBroadcastFinder m76767j0(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope.data.siteWideBroadcastFinder;
    }

    /* JADX INFO: renamed from: k */
    public static BLiveVoiceRoomLevelDetail m76768k(Function1 function1, Object obj) {
        return (BLiveVoiceRoomLevelDetail) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: k0 */
    public static BLiveVoiceRoomAsset m76769k0(Function1 function1, Object obj) {
        return (BLiveVoiceRoomAsset) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: l */
    public static roj0 m76770l(BLiveEnvelope bLiveEnvelope) {
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: l0 */
    public static List m76771l0(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope.data.voiceRoomClasses;
    }

    /* JADX INFO: renamed from: m */
    public static BLiveVoiceLivePush m76772m(Function1 function1, Object obj) {
        return (BLiveVoiceLivePush) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: m0 */
    public static BLiveVoiceLiveAssert m76773m0(BLiveEnvelope bLiveEnvelope) {
        bLiveEnvelope.getClass();
        return bLiveEnvelope.data.voiceLiveAssert;
    }

    @JvmStatic
    @NotNull
    public static final C22306c<ArrayList<String>> messageReminds(@NotNull String roomId, @NotNull String remind) throws JSONException {
        roomId.getClass();
        remind.getClass();
        String strM216076e = ytr.m216076e("/voice-rooms/" + roomId + "/message-reminds");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("remindType", remind);
        C22306c<BLiveEnvelope> c22306cM194928p = upv.m194928p(cll.m107499l(strM216076e), "messageReminds", jSONObject.toString());
        final Function1 function1 = new Function1() { // from class: l.z1m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m76742U((BLiveEnvelope) obj);
            }
        };
        C22306c map = c22306cM194928p.map(new w9j() { // from class: l.a2m0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m76741T(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    /* JADX INFO: renamed from: n */
    public static BLiveLovePlanet m76774n(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope.data.lovePlanet;
    }

    /* JADX INFO: renamed from: n0 */
    public static roj0 m76775n0(Function1 function1, Object obj) {
        return (roj0) function1.invoke(obj);
    }

    @JvmStatic
    @NotNull
    public static final C22306c<SiteWideBroadcastFinder> notifyBroadcastAll(@NotNull String roomId) {
        roomId.getClass();
        C22306c<BLiveEnvelope> c22306cM194928p = upv.m194928p(cll.m107499l(ytr.m216073b("/voice-rooms/" + roomId + "/siteWideBroadcastFinder")), "siteWideBroadcastFinder", "");
        final Function1 function1 = new Function1() { // from class: l.c0m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m76767j0((BLiveEnvelope) obj);
            }
        };
        C22306c map = c22306cM194928p.map(new w9j() { // from class: l.d0m0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m76779p0(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @JvmStatic
    @NotNull
    public static final C22306c<BLiveVoiceLivePush> notifyFans(@NotNull String uid, @NotNull String liveId) throws JSONException {
        uid.getClass();
        liveId.getClass();
        String strM216073b = ytr.m216073b("/users/" + uid + "/voice-live-push");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "fans");
        jSONObject.put("voiceLiveId", liveId);
        C22306c<BLiveEnvelope> c22306cM194928p = upv.m194928p(cll.m107499l(strM216073b), BLiveHeatVoiceRoomTaskType.notifyFans, jSONObject.toString());
        final Function1 function1 = new Function1() { // from class: l.q1m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m76734M((BLiveEnvelope) obj);
            }
        };
        C22306c map = c22306cM194928p.map(new w9j() { // from class: l.r1m0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m76772m(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    /* JADX INFO: renamed from: o */
    public static roj0 m76776o(Function1 function1, Object obj) {
        return (roj0) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: o0 */
    public static List m76777o0(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: p */
    public static BLiveVoiceLiveAssert m76778p(Function1 function1, Object obj) {
        return (BLiveVoiceLiveAssert) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: p0 */
    public static SiteWideBroadcastFinder m76779p0(Function1 function1, Object obj) {
        return (SiteWideBroadcastFinder) function1.invoke(obj);
    }

    @JvmStatic
    @NotNull
    public static final C22306c<BLiveEnvelope> postLike(@NotNull String userId, @NotNull String otherUserId) {
        userId.getClass();
        otherUserId.getClass();
        cll cllVarM107499l = cll.m107499l(ytr.m216076e("/users/" + userId + "/voiceLike/" + otherUserId + "?scene=payGuide"));
        StringBuilder sb = new StringBuilder("postLike");
        sb.append(userId);
        C22306c<BLiveEnvelope> c22306cM194928p = upv.m194928p(cllVarM107499l, sb.toString(), "");
        c22306cM194928p.getClass();
        return c22306cM194928p;
    }

    /* JADX INFO: renamed from: q */
    public static roj0 m76780q(Function1 function1, Object obj) {
        return (roj0) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: q0 */
    public static List m76781q0(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope.data.users;
    }

    /* JADX INFO: renamed from: r */
    public static BLiveVoicePayGuideUser m76782r(Function1 function1, Object obj) {
        return (BLiveVoicePayGuideUser) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: r0 */
    public static BLiveOperation m76783r0(Function1 function1, Object obj) {
        return (BLiveOperation) function1.invoke(obj);
    }

    @JvmStatic
    @NotNull
    public static final C22306c<List<BLiveVoiceManager>> refreshCurrentManager(@NotNull String roomId) {
        roomId.getClass();
        C22306c<BLiveEnvelope> c22306cM194935w = upv.m194935w(cll.m107499l(ytr.m216076e("/voice-rooms/" + roomId + "/managers")), "refreshRoomManager");
        final Function1 function1 = new Function1() { // from class: l.s1m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m76762h((BLiveEnvelope) obj);
            }
        };
        C22306c map = c22306cM194935w.map(new w9j() { // from class: l.u1m0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m76777o0(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @JvmStatic
    @NotNull
    public static final C22306c<ArrayList<String>> refreshManager(@NotNull String roomId) {
        roomId.getClass();
        C22306c<BLiveEnvelope> c22306cM194935w = upv.m194935w(cll.m107499l(ytr.m216076e("/voice-rooms/" + roomId + "/managers")), "refreshRoomManager");
        final Function1 function1 = new Function1() { // from class: l.f1m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m76786u((BLiveEnvelope) obj);
            }
        };
        C22306c map = c22306cM194935w.map(new w9j() { // from class: l.g1m0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m76749a0(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @JvmStatic
    @NotNull
    public static final C22306c<BLiveExtraResponse> requestToSettleRoom(@NotNull String roomId, @NotNull String userId, @NotNull String token) {
        roomId.getClass();
        userId.getClass();
        token.getClass();
        C22306c<BLiveExtraResponse> c22306cM194929q = upv.m194929q(cll.m107499l(ytr.m216073b("/live/voice-rooms/" + roomId + "/users/" + userId + "/settle")).m107524p().m107536c("token", token).m107537d(), "requestToSettleRoom", BLiveExtraResponse.JSON_ADAPTER, "");
        c22306cM194929q.getClass();
        return c22306cM194929q;
    }

    /* JADX INFO: renamed from: s */
    public static BLiveLuckyParadiseBottomEntrance m76784s(Function1 function1, Object obj) {
        return (BLiveLuckyParadiseBottomEntrance) function1.invoke(obj);
    }

    @JvmStatic
    @NotNull
    public static final C22306c<roj0> saveRoomCategory(@NotNull String roomId, @NotNull String categoryId) throws JSONException {
        roomId.getClass();
        categoryId.getClass();
        cll cllVarM107537d = LiveApiBuilder.m67315u(ytr.m216073b("/live/voice-rooms/" + roomId + "/profile"), new mt0[0]).m107524p().m107536c("field", XHTML.ATTR.CLASS).m107537d();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("classId", categoryId);
        C22306c<BLiveEnvelope> c22306cM194914b = upv.m194914b(cllVarM107537d, "saveRoomCategory" + categoryId, jSONObject.toString());
        final Function1 function1 = new Function1() { // from class: l.g0m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m76733L((BLiveEnvelope) obj);
            }
        };
        C22306c map = c22306cM194914b.map(new w9j() { // from class: l.h0m0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m76780q(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @JvmStatic
    @Nullable
    public static final C22306c<roj0> setTopChat(@NotNull String roomId, boolean isTop) {
        roomId.getClass();
        C22306c<BLiveEnvelope> c22306cM194914b = upv.m194914b(LiveApiBuilder.m67315u(ytr.m216073b("/live-chat/message-cells/" + roomId), new mt0[0]).m107524p().m107536c("action", isTop ? "stick" : "unstick").m107537d(), "message-cells", "");
        final Function1 function1 = new Function1() { // from class: l.x0m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m76728G((BLiveEnvelope) obj);
            }
        };
        return c22306cM194914b.map(new w9j() { // from class: l.i1m0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m76738Q(function1, obj);
            }
        });
    }

    @JvmStatic
    @NotNull
    public static final C22306c<BLiveExtraResponse> setVirtualRoomFreeSettle(@NotNull String roomId, boolean isFreeSettle) {
        roomId.getClass();
        String strM216073b = ytr.m216073b("/live/voice-rooms/" + roomId + "/profile?field=freeSettle");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("freeSettle", isFreeSettle);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        C22306c<BLiveExtraResponse> c22306cM194926n = upv.m194926n(cll.m107499l(strM216073b), "setVirtualRoomFreeSettle", BLiveExtraResponse.JSON_ADAPTER, jSONObject.toString());
        c22306cM194926n.getClass();
        return c22306cM194926n;
    }

    @JvmStatic
    @NotNull
    public static final C22306c<BLiveExtraResponse> setVirtualRoomPersonal(@NotNull String roomId, boolean isPersonal) {
        roomId.getClass();
        String strM216073b = ytr.m216073b("/live/voice-rooms/" + roomId + "/profile?field=isPersonal");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isPersonal", isPersonal);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        C22306c<BLiveExtraResponse> c22306cM194926n = upv.m194926n(cll.m107499l(strM216073b), "setVirtualRoomPersonal", BLiveExtraResponse.JSON_ADAPTER, jSONObject.toString());
        c22306cM194926n.getClass();
        return c22306cM194926n;
    }

    @JvmStatic
    @NotNull
    public static final C22306c<BLiveLovePlanet> stopOrResetGame(@NotNull String roomId, @NotNull String lovePlanetId, @NotNull String otherUserId, @NotNull String action) {
        roomId.getClass();
        lovePlanetId.getClass();
        otherUserId.getClass();
        action.getClass();
        cll.C16188a c16188aM107524p = LiveApiBuilder.m67315u(ytr.m216076e("/voice-rooms/" + roomId + "/love-planet/" + action), new mt0[0]).m107524p();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("lovePlanetID", lovePlanetId);
        jSONObject.put("otherUserID", otherUserId);
        C22306c<BLiveEnvelope> c22306cM194930r = upv.m194930r(c16188aM107524p.m107537d(), "stopOrResetGame" + roomId, jSONObject.toString());
        final Function1 function1 = new Function1() { // from class: l.b0m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m76735N((BLiveEnvelope) obj);
            }
        };
        C22306c map = c22306cM194930r.map(new w9j() { // from class: l.m0m0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m76759f0(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @JvmStatic
    @Nullable
    public static final C22306c<BLiveVoice> switchLiveMode(@NotNull String voiceliveid, @NotNull String liveMode) {
        voiceliveid.getClass();
        liveMode.getClass();
        cll cllVarM107537d = cll.m107499l(ytr.m216073b("/voice-lives/" + voiceliveid + "?type=switchLiveMode&liveMode=" + liveMode)).m107524p().m107537d();
        StringBuilder sb = new StringBuilder("voiceLives");
        sb.append(liveMode);
        C22306c<BLiveEnvelope> c22306cM194925m = upv.m194925m(cllVarM107537d, sb.toString(), "");
        final Function1 function1 = new Function1() { // from class: l.m2m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m76755d0((BLiveEnvelope) obj);
            }
        };
        return c22306cM194925m.map(new w9j() { // from class: l.n2m0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m76724C(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public static BLiveLovePlanet m76785t(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope.data.lovePlanet;
    }

    /* JADX INFO: renamed from: u */
    public static ArrayList m76786u(BLiveEnvelope bLiveEnvelope) {
        return new ArrayList(vwb.m200303Q(bLiveEnvelope.data.voiceManagers, new w9j() { // from class: l.o2m0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveVoiceManager) obj).userId;
            }
        }));
    }

    /* JADX INFO: renamed from: v */
    public static BLiveVoiceRoomLevelDetail m76787v(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope.data.voiceRoomLevelDetail;
    }

    /* JADX INFO: renamed from: w */
    public static BLiveLovePlanet m76788w(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope.data.lovePlanet;
    }

    /* JADX INFO: renamed from: y */
    public static List m76790y(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope.data.heatVoiceRoomTasks;
    }

    /* JADX INFO: renamed from: z */
    public static roj0 m76791z(BLiveEnvelope bLiveEnvelope) {
        return roj0.f160388a;
    }

    @NotNull
    public final C22306c<roj0> approveManagerInvite(@NotNull String roomId, @NotNull String inviteId) {
        roomId.getClass();
        inviteId.getClass();
        return operationManagerInvite(roomId, inviteId, "approve");
    }

    @NotNull
    public final C22306c<roj0> operationManagerInvite(@NotNull String roomId, @NotNull String inviteId, @NotNull String action) {
        roomId.getClass();
        inviteId.getClass();
        action.getClass();
        cll cllVarM107537d = cll.m107499l(ytr.m216076e("/voice-rooms/" + roomId + "/manager-invites/" + inviteId)).m107524p().m107536c("action", action).m107537d();
        StringBuilder sb = new StringBuilder("operationManagerInvite");
        sb.append(inviteId);
        C22306c<BLiveEnvelope> c22306cM194925m = upv.m194925m(cllVarM107537d, sb.toString(), "");
        final Function1 function1 = new Function1() { // from class: l.q0m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceRoomApiProvider.m76770l((BLiveEnvelope) obj);
            }
        };
        C22306c map = c22306cM194925m.map(new w9j() { // from class: l.r0m0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return VirtualVoiceRoomApiProvider.m76775n0(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @NotNull
    public final C22306c<roj0> rejectManagerInvite(@NotNull String roomId, @NotNull String inviteId) {
        roomId.getClass();
        inviteId.getClass();
        return operationManagerInvite(roomId, inviteId, "reject");
    }

    @JvmStatic
    @NotNull
    public static final C22306c<BLiveExtraResponse> requestToSettleRoom(@NotNull String roomId, @NotNull String userId) {
        roomId.getClass();
        userId.getClass();
        C22306c<BLiveExtraResponse> c22306cM194929q = upv.m194929q(cll.m107499l(ytr.m216073b("/live/voice-rooms/" + roomId + "/users/" + userId + "/settle")), "requestToSettleRoom", BLiveExtraResponse.JSON_ADAPTER, "");
        c22306cM194929q.getClass();
        return c22306cM194929q;
    }
}
