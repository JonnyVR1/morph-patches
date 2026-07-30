package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.Meta;
import com.p051p1.mobile.putong.live.base.data.BLiveAuctionAsset;
import com.p051p1.mobile.putong.live.base.data.BLiveAuctionCounter;
import com.p051p1.mobile.putong.live.base.data.BLiveAuctionPlatformLeaderboardInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveAuctionQueueInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveAuctionRelationCard;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\nJ-\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u000eJ%\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\nJ5\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\nJ7\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u001b\u0010\u0015J\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00072\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 2\b\b\u0002\u0010\"\u001a\u00020 H\u0007¢\u0006\u0004\b$\u0010%J'\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00170\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b'\u0010\nJ-\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00170\u00072\u0006\u0010(\u001a\u00020\u00042\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020 H\u0007¢\u0006\u0004\b,\u0010-J#\u0010.\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b.\u0010\nJ!\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000/0\u00072\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b1\u0010\u001eJ)\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000/0\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u0004¢\u0006\u0004\b3\u0010\nJ!\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000/0\u00072\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b4\u0010\u001eJ!\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000/0\u00072\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b5\u0010\u001eJ\u001b\u00107\u001a\b\u0012\u0004\u0012\u0002060\u00072\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b7\u0010\u001eJ\u001b\u00108\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b8\u0010\u001eJ)\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0/0\u00072\u0006\u00109\u001a\u00020\u00042\u0006\u0010:\u001a\u00020\u0004¢\u0006\u0004\b<\u0010\n¨\u0006="}, m88121d2 = {"Ll/w61;", "", "<init>", "()V", "", "roomId", "applyId", "Lrx/c;", "Lcom/p1/mobile/putong/live/base/data/BLiveEnvelope;", "M", "(Ljava/lang/String;Ljava/lang/String;)Lrx/c;", "c0", "action", "J", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lrx/c;", "invitedId", "relationType", "N", "d0", "inviteId", "K", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lrx/c;", "userId", "Lcom/p1/mobile/putong/data/Meta;", "Z", "auctionId", "jsonParam", "P", "Lcom/p1/mobile/putong/live/base/data/BLiveAuctionCounter;", "b0", "(Ljava/lang/String;)Lrx/c;", "type", "", IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET, Constants.KEY_LIMIT, "Lcom/p1/mobile/putong/live/base/data/BLiveAuctionPlatformLeaderboardInfo;", p7f.GPS_MEASUREMENT_INTERRUPTED, "(Ljava/lang/String;II)Lrx/c;", "firstApplyId", "a0", "cpId", "", "ttc", "freeCount", "Q", "(Ljava/lang/String;JI)Lrx/c;", "L", "", "Lcom/p1/mobile/putong/live/base/data/BLiveAuctionQueueInfo;", p7f.GPS_DIRECTION_TRUE, "candidateId", BloodType.f39576O, "R", "U", "Lcom/p1/mobile/putong/live/base/data/BLiveAuctionAsset;", p7f.LATITUDE_SOUTH, "X", Oauth2AccessToken.KEY_UID, "source", "Lcom/p1/mobile/putong/live/base/data/BLiveAuctionRelationCard;", "Y", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class w61 {

    @NotNull
    public static final w61 INSTANCE = new w61();

    /* JADX INFO: renamed from: A */
    public static Meta m205020A(BLiveEnvelope bLiveEnvelope) {
        bLiveEnvelope.getClass();
        return bLiveEnvelope.meta;
    }

    /* JADX INFO: renamed from: B */
    public static Meta m205021B(BLiveEnvelope bLiveEnvelope) {
        bLiveEnvelope.getClass();
        return bLiveEnvelope.meta;
    }

    /* JADX INFO: renamed from: C */
    public static List m205022C(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: D */
    public static BLiveAuctionPlatformLeaderboardInfo m205023D(BLiveEnvelope bLiveEnvelope) {
        bLiveEnvelope.getClass();
        return bLiveEnvelope.data.auctionPlatformLeaderboardInfo;
    }

    /* JADX INFO: renamed from: E */
    public static List m205024E(BLiveEnvelope bLiveEnvelope) {
        bLiveEnvelope.getClass();
        return bLiveEnvelope.data.auctionCandidates;
    }

    /* JADX INFO: renamed from: F */
    public static BLiveAuctionPlatformLeaderboardInfo m205025F(Function1 function1, Object obj) {
        return (BLiveAuctionPlatformLeaderboardInfo) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: G */
    public static List m205026G(BLiveEnvelope bLiveEnvelope) {
        bLiveEnvelope.getClass();
        return bLiveEnvelope.data.auctionCandidates;
    }

    /* JADX INFO: renamed from: H */
    public static Meta m205027H(Function1 function1, Object obj) {
        return (Meta) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: I */
    public static List m205028I(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: M */
    public static final C22421c<BLiveEnvelope> m205029M(@NotNull String roomId, @NotNull String applyId) {
        roomId.getClass();
        applyId.getClass();
        return INSTANCE.m205066J(roomId, applyId, "approve");
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: N */
    public static final C22421c<BLiveEnvelope> m205030N(@NotNull String roomId, @NotNull String invitedId, @NotNull String relationType) {
        roomId.getClass();
        invitedId.getClass();
        relationType.getClass();
        return INSTANCE.m205067K(roomId, invitedId, "approve", relationType);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: P */
    public static final C22421c<Meta> m205031P(@NotNull String roomId, @NotNull String auctionId, @NotNull final String action, @Nullable String jsonParam) {
        roomId.getClass();
        auctionId.getClass();
        action.getClass();
        rnl rnlVarM182301d = rnl.m182263l(zvr.m221802b("/live/voice-rooms/" + roomId + "/auctions/" + auctionId + "?action=" + action)).m182288p().m182301d();
        if (jsonParam == null) {
            jsonParam = "";
        }
        C22421c<BLiveEnvelope> c22421cM202552m = vrv.m202552m(rnlVarM182301d, "dealAuction", jsonParam);
        final Function1 function1 = new Function1() { // from class: l.r51
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w61.m205064y((BLiveEnvelope) obj);
            }
        };
        C22421c<Meta> c22421cDoOnError = c22421cM202552m.map(new qcj() { // from class: l.s51
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return w61.m205042d(function1, obj);
            }
        }).doOnError(new y20() { // from class: l.t51
            @Override // p153l.y20
            public final void call(Object obj) {
                w61.m205055p(action, (Throwable) obj);
            }
        });
        c22421cDoOnError.getClass();
        return c22421cDoOnError;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: Q */
    public static final C22421c<Meta> m205032Q(@NotNull String cpId, long ttc, int freeCount) throws JSONException {
        cpId.getClass();
        String strM221805e = zvr.m221805e("/auction-relation-cards/" + cpId);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ttc", ttc);
        jSONObject.put("freeCount", freeCount);
        jSONObject.put("orderId", String.valueOf(pzi0.m174454o()));
        C22421c<BLiveEnvelope> c22421cM202549j = vrv.m202549j(rnl.m182263l(strM221805e).m182288p().m182301d(), "dissolveAuctionShip" + cpId, jSONObject.toString());
        final Function1 function1 = new Function1() { // from class: l.n51
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w61.m205050k((BLiveEnvelope) obj);
            }
        };
        C22421c map = c22421cM202549j.map(new qcj() { // from class: l.y51
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return w61.m205051l(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: V */
    public static final C22421c<BLiveAuctionPlatformLeaderboardInfo> m205033V(@NotNull final String type, int offset, int limit) {
        type.getClass();
        rnl rnlVarM182301d = rnl.m182263l(zvr.m221802b("/live/voice/auction-platform-leaderboards?type=" + type + "&offset=" + offset + "&limit=" + limit)).m182288p().m182301d();
        StringBuilder sb = new StringBuilder("getAuctionLeaderboardList");
        sb.append(type);
        sb.append("-");
        sb.append(offset);
        C22421c<BLiveEnvelope> c22421cM202562w = vrv.m202562w(rnlVarM182301d, sb.toString());
        final Function1 function1 = new Function1() { // from class: l.w51
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w61.m205023D((BLiveEnvelope) obj);
            }
        };
        C22421c<BLiveAuctionPlatformLeaderboardInfo> c22421cDoOnError = c22421cM202562w.map(new qcj() { // from class: l.x51
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return w61.m205025F(function1, obj);
            }
        }).doOnError(new y20() { // from class: l.z51
            @Override // p153l.y20
            public final void call(Object obj) {
                w61.m205036a(type, (Throwable) obj);
            }
        });
        c22421cDoOnError.getClass();
        return c22421cDoOnError;
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ C22421c m205034W(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 20;
        }
        return m205033V(str, i, i2);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: Z */
    public static final C22421c<Meta> m205035Z(@NotNull final String roomId, @NotNull String userId) throws JSONException {
        roomId.getClass();
        userId.getClass();
        rnl rnlVarM182301d = rnl.m182263l(zvr.m221805e("/voice-rooms/" + roomId + "/auction-invites")).m182288p().m182301d();
        final JSONObject jSONObject = new JSONObject();
        jSONObject.put("userId", userId);
        C22421c<BLiveEnvelope> c22421cM202555p = vrv.m202555p(rnlVarM182301d, "inviteAuction", jSONObject.toString());
        final Function1 function1 = new Function1() { // from class: l.k61
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w61.m205020A((BLiveEnvelope) obj);
            }
        };
        C22421c<Meta> c22421cDoOnError = c22421cM202555p.map(new qcj() { // from class: l.l61
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return w61.m205060u(function1, obj);
            }
        }).doOnError(new y20() { // from class: l.m61
            @Override // p153l.y20
            public final void call(Object obj) {
                w61.m205062w(roomId, jSONObject, (Throwable) obj);
            }
        });
        c22421cDoOnError.getClass();
        return c22421cDoOnError;
    }

    /* JADX INFO: renamed from: a */
    public static void m205036a(String str, Throwable th) {
        th.getMessage();
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a0 */
    public static final C22421c<Meta> m205037a0(@NotNull final String roomId, @Nullable String firstApplyId) throws JSONException {
        roomId.getClass();
        rnl rnlVarM182301d = rnl.m182263l(zvr.m221802b("/live/voice-rooms/" + roomId + "/auction-counter")).m182288p().m182301d();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "read");
        jSONObject.put("counterName", "applyUnreadCount");
        jSONObject.put("readUntilId", firstApplyId);
        C22421c<BLiveEnvelope> c22421cM202555p = vrv.m202555p(rnlVarM182301d, "notifyAuctionApplyProcessed", jSONObject.toString());
        final Function1 function1 = new Function1() { // from class: l.c61
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w61.m205021B((BLiveEnvelope) obj);
            }
        };
        C22421c<Meta> c22421cDoOnError = c22421cM202555p.map(new qcj() { // from class: l.d61
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return w61.m205027H(function1, obj);
            }
        }).doOnError(new y20() { // from class: l.e61
            @Override // p153l.y20
            public final void call(Object obj) {
                w61.m205047h(roomId, (Throwable) obj);
            }
        });
        c22421cDoOnError.getClass();
        return c22421cDoOnError;
    }

    /* JADX INFO: renamed from: b */
    public static List m205038b(BLiveEnvelope bLiveEnvelope) {
        bLiveEnvelope.getClass();
        return bLiveEnvelope.data.auctionApplies;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b0 */
    public static final C22421c<BLiveAuctionCounter> m205039b0(@NotNull final String roomId) {
        roomId.getClass();
        C22421c<BLiveEnvelope> c22421cM202562w = vrv.m202562w(rnl.m182263l(zvr.m221802b("/live/voice-rooms/" + roomId + "/auction-counter")).m182288p().m182301d(), "queryUnreadApplyCounter");
        final Function1 function1 = new Function1() { // from class: l.j61
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w61.m205057r((BLiveEnvelope) obj);
            }
        };
        C22421c<BLiveAuctionCounter> c22421cDoOnError = c22421cM202562w.map(new qcj() { // from class: l.p61
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return w61.m205053n(function1, obj);
            }
        }).doOnError(new y20() { // from class: l.q61
            @Override // p153l.y20
            public final void call(Object obj) {
                w61.m205052m(roomId, (Throwable) obj);
            }
        });
        c22421cDoOnError.getClass();
        return c22421cDoOnError;
    }

    /* JADX INFO: renamed from: c */
    public static BLiveAuctionAsset m205040c(BLiveEnvelope bLiveEnvelope) {
        bLiveEnvelope.getClass();
        return bLiveEnvelope.data.voiceLiveAuctionAsset;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: c0 */
    public static final C22421c<BLiveEnvelope> m205041c0(@NotNull String roomId, @NotNull String applyId) {
        roomId.getClass();
        applyId.getClass();
        return INSTANCE.m205066J(roomId, applyId, "reject");
    }

    /* JADX INFO: renamed from: d */
    public static Meta m205042d(Function1 function1, Object obj) {
        return (Meta) function1.invoke(obj);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: d0 */
    public static final C22421c<BLiveEnvelope> m205043d0(@NotNull String roomId, @NotNull String applyId) {
        roomId.getClass();
        applyId.getClass();
        return INSTANCE.m205067K(roomId, applyId, "reject", "");
    }

    /* JADX INFO: renamed from: e */
    public static BLiveEnvelope m205044e(Function1 function1, Object obj) {
        return (BLiveEnvelope) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: f */
    public static Boolean m205045f(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: g */
    public static Boolean m205046g(BLiveEnvelope bLiveEnvelope) {
        return Boolean.valueOf(bLiveEnvelope.data.voiceLiveAuctions.size() > 0);
    }

    /* JADX INFO: renamed from: h */
    public static void m205047h(String str, Throwable th) {
        th.getMessage();
    }

    /* JADX INFO: renamed from: i */
    public static BLiveEnvelope m205048i(BLiveEnvelope bLiveEnvelope) {
        bLiveEnvelope.getClass();
        return bLiveEnvelope;
    }

    /* JADX INFO: renamed from: j */
    public static void m205049j(Throwable th) {
        th.getMessage();
    }

    /* JADX INFO: renamed from: k */
    public static Meta m205050k(BLiveEnvelope bLiveEnvelope) {
        bLiveEnvelope.getClass();
        return bLiveEnvelope.meta;
    }

    /* JADX INFO: renamed from: l */
    public static Meta m205051l(Function1 function1, Object obj) {
        return (Meta) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: m */
    public static void m205052m(String str, Throwable th) {
        th.getMessage();
    }

    /* JADX INFO: renamed from: n */
    public static BLiveAuctionCounter m205053n(Function1 function1, Object obj) {
        return (BLiveAuctionCounter) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: o */
    public static List m205054o(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: p */
    public static void m205055p(String str, Throwable th) {
        th.getMessage();
    }

    /* JADX INFO: renamed from: q */
    public static List m205056q(BLiveEnvelope bLiveEnvelope) {
        bLiveEnvelope.getClass();
        return bLiveEnvelope.data.auctionRelationCards;
    }

    /* JADX INFO: renamed from: r */
    public static BLiveAuctionCounter m205057r(BLiveEnvelope bLiveEnvelope) {
        bLiveEnvelope.getClass();
        return bLiveEnvelope.data.auctionCounter;
    }

    /* JADX INFO: renamed from: s */
    public static List m205058s(BLiveEnvelope bLiveEnvelope) {
        bLiveEnvelope.getClass();
        return bLiveEnvelope.data.auctionInvites;
    }

    /* JADX INFO: renamed from: t */
    public static void m205059t(Throwable th) {
        th.getMessage();
    }

    /* JADX INFO: renamed from: u */
    public static Meta m205060u(Function1 function1, Object obj) {
        return (Meta) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: v */
    public static List m205061v(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: w */
    public static void m205062w(String str, JSONObject jSONObject, Throwable th) {
        Objects.toString(jSONObject);
        th.getMessage();
    }

    /* JADX INFO: renamed from: x */
    public static List m205063x(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: y */
    public static Meta m205064y(BLiveEnvelope bLiveEnvelope) {
        bLiveEnvelope.getClass();
        return bLiveEnvelope.meta;
    }

    /* JADX INFO: renamed from: z */
    public static BLiveAuctionAsset m205065z(Function1 function1, Object obj) {
        return (BLiveAuctionAsset) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: J */
    public final C22421c<BLiveEnvelope> m205066J(String roomId, String applyId, String action) {
        rnl rnlVarM182301d = rnl.m182263l(zvr.m221805e("/voice-rooms/" + roomId + "/auction-applies/" + applyId + "?action=" + action)).m182288p().m182300c("action", action).m182301d();
        StringBuilder sb = new StringBuilder("apply_");
        sb.append(action);
        C22421c<BLiveEnvelope> c22421cM202552m = vrv.m202552m(rnlVarM182301d, sb.toString(), "");
        c22421cM202552m.getClass();
        return c22421cM202552m;
    }

    /* JADX INFO: renamed from: K */
    public final C22421c<BLiveEnvelope> m205067K(String roomId, String inviteId, String action, String relationType) throws JSONException {
        String string;
        rnl rnlVarM182301d = rnl.m182263l(zvr.m221805e("/voice-rooms/" + roomId + "/auction-invites/" + inviteId + "?action=" + action)).m182288p().m182300c("action", action).m182301d();
        if (relationType.length() > 0) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("relationType", relationType);
            string = jSONObject.toString();
            string.getClass();
        } else {
            string = "";
        }
        C22421c<BLiveEnvelope> c22421cM202552m = vrv.m202552m(rnlVarM182301d, "apply_" + action, string);
        c22421cM202552m.getClass();
        return c22421cM202552m;
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final C22421c<BLiveEnvelope> m205068L(@NotNull String roomId, @NotNull String relationType) throws JSONException {
        roomId.getClass();
        relationType.getClass();
        rnl rnlVarM182301d = rnl.m182263l(zvr.m221805e("/voice-rooms/" + roomId + "/auction-applies")).m182288p().m182301d();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("userId", zrv.f205799a.m207631D0());
        jSONObject.put("relationType", relationType);
        C22421c<BLiveEnvelope> c22421cM202555p = vrv.m202555p(rnlVarM182301d, "applyGuest", jSONObject.toString());
        c22421cM202555p.getClass();
        return c22421cM202555p;
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public final C22421c<List<BLiveAuctionQueueInfo>> m205069O(@NotNull String roomId, @NotNull String candidateId) {
        roomId.getClass();
        candidateId.getClass();
        C22421c<BLiveEnvelope> c22421cM202552m = vrv.m202552m(rnl.m182263l(zvr.m221805e("/voice-rooms/" + roomId + "/auction-candidates/" + candidateId + "?action=cancel")).m182288p().m182301d(), "cancelCandidates", "");
        final Function1 function1 = new Function1() { // from class: l.n61
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w61.m205026G((BLiveEnvelope) obj);
            }
        };
        C22421c map = c22421cM202552m.map(new qcj() { // from class: l.o61
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return w61.m205054o(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final C22421c<List<BLiveAuctionQueueInfo>> m205070R(@NotNull String roomId) {
        roomId.getClass();
        C22421c<BLiveEnvelope> c22421cM202562w = vrv.m202562w(rnl.m182263l(zvr.m221805e("/voice-rooms/" + roomId + "/auction-applies")).m182288p().m182301d(), "getAuctionApplies");
        final Function1 function1 = new Function1() { // from class: l.f61
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w61.m205038b((BLiveEnvelope) obj);
            }
        };
        C22421c map = c22421cM202562w.map(new qcj() { // from class: l.g61
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return w61.m205022C(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final C22421c<BLiveAuctionAsset> m205071S(@NotNull String roomId) {
        roomId.getClass();
        C22421c<BLiveEnvelope> c22421cM202562w = vrv.m202562w(rnl.m182263l(zvr.m221802b("/live/voice-rooms/" + roomId + "/auction-asset")).m182288p().m182301d(), "getAuctionAsset");
        final Function1 function1 = new Function1() { // from class: l.r61
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w61.m205040c((BLiveEnvelope) obj);
            }
        };
        C22421c<BLiveAuctionAsset> c22421cDoOnError = c22421cM202562w.map(new qcj() { // from class: l.s61
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return w61.m205065z(function1, obj);
            }
        }).doOnError(new y20() { // from class: l.t61
            @Override // p153l.y20
            public final void call(Object obj) {
                w61.m205059t((Throwable) obj);
            }
        });
        c22421cDoOnError.getClass();
        return c22421cDoOnError;
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final C22421c<List<BLiveAuctionQueueInfo>> m205072T(@NotNull String roomId) {
        roomId.getClass();
        C22421c<BLiveEnvelope> c22421cM202562w = vrv.m202562w(rnl.m182263l(zvr.m221805e("/voice-rooms/" + roomId + "/auction-candidates")).m182288p().m182301d(), "getAuctionCandidates");
        final Function1 function1 = new Function1() { // from class: l.u51
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w61.m205024E((BLiveEnvelope) obj);
            }
        };
        C22421c map = c22421cM202562w.map(new qcj() { // from class: l.v51
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return w61.m205061v(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public final C22421c<List<BLiveAuctionQueueInfo>> m205073U(@NotNull String roomId) {
        roomId.getClass();
        C22421c<BLiveEnvelope> c22421cM202562w = vrv.m202562w(rnl.m182263l(zvr.m221805e("/voice-rooms/" + roomId + "/auction-invites")).m182288p().m182301d(), "getAuctionInvites");
        final Function1 function1 = new Function1() { // from class: l.h61
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w61.m205058s((BLiveEnvelope) obj);
            }
        };
        C22421c map = c22421cM202562w.map(new qcj() { // from class: l.i61
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return w61.m205063x(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @NotNull
    /* JADX INFO: renamed from: X */
    public final C22421c<BLiveEnvelope> m205074X(@NotNull String roomId) {
        roomId.getClass();
        C22421c<BLiveEnvelope> c22421cM202562w = vrv.m202562w(rnl.m182263l(zvr.m221802b("/live/voice-rooms/" + roomId + "/ongoing-auctions")).m182288p().m182301d(), "getAuctionsInRoom");
        final Function1 function1 = new Function1() { // from class: l.u61
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w61.m205046g((BLiveEnvelope) obj);
            }
        };
        C22421c<BLiveEnvelope> c22421cFilter = c22421cM202562w.filter(new qcj() { // from class: l.v61
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return w61.m205045f(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: l.o51
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w61.m205048i((BLiveEnvelope) obj);
            }
        };
        C22421c<BLiveEnvelope> c22421cDoOnError = c22421cFilter.map(new qcj() { // from class: l.p51
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return w61.m205044e(function2, obj);
            }
        }).doOnError(new y20() { // from class: l.q51
            @Override // p153l.y20
            public final void call(Object obj) {
                w61.m205049j((Throwable) obj);
            }
        });
        c22421cDoOnError.getClass();
        return c22421cDoOnError;
    }

    @NotNull
    /* JADX INFO: renamed from: Y */
    public final C22421c<List<BLiveAuctionRelationCard>> m205075Y(@NotNull String uid, @NotNull String source) {
        uid.getClass();
        source.getClass();
        C22421c<BLiveEnvelope> c22421cM202562w = vrv.m202562w(rnl.m182263l(zvr.m221805e("/users/" + uid + "/auction-relation-cards?source=" + source)).m182288p().m182301d(), "getRelationCards");
        final Function1 function1 = new Function1() { // from class: l.a61
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w61.m205056q((BLiveEnvelope) obj);
            }
        };
        C22421c map = c22421cM202562w.map(new qcj() { // from class: l.b61
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return w61.m205028I(function1, obj);
            }
        });
        map.getClass();
        return map;
    }
}
