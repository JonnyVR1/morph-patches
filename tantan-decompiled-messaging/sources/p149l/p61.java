package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.Meta;
import com.p046p1.mobile.putong.live.base.data.BLiveAuctionAsset;
import com.p046p1.mobile.putong.live.base.data.BLiveAuctionCounter;
import com.p046p1.mobile.putong.live.base.data.BLiveAuctionPlatformLeaderboardInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveAuctionQueueInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveAuctionRelationCard;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
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
import p133rx.C22306c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\nJ-\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u000eJ%\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\nJ5\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\nJ7\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u001b\u0010\u0015J\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00072\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 2\b\b\u0002\u0010\"\u001a\u00020 H\u0007¢\u0006\u0004\b$\u0010%J'\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00170\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b'\u0010\nJ-\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00170\u00072\u0006\u0010(\u001a\u00020\u00042\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020 H\u0007¢\u0006\u0004\b,\u0010-J#\u0010.\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b.\u0010\nJ!\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000/0\u00072\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b1\u0010\u001eJ)\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000/0\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u0004¢\u0006\u0004\b3\u0010\nJ!\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000/0\u00072\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b4\u0010\u001eJ!\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000/0\u00072\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b5\u0010\u001eJ\u001b\u00107\u001a\b\u0012\u0004\u0012\u0002060\u00072\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b7\u0010\u001eJ\u001b\u00108\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b8\u0010\u001eJ)\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0/0\u00072\u0006\u00109\u001a\u00020\u00042\u0006\u0010:\u001a\u00020\u0004¢\u0006\u0004\b<\u0010\n¨\u0006="}, m87232d2 = {"Ll/p61;", "", "<init>", "()V", "", "roomId", "applyId", "Lrx/c;", "Lcom/p1/mobile/putong/live/base/data/BLiveEnvelope;", "M", "(Ljava/lang/String;Ljava/lang/String;)Lrx/c;", "c0", "action", "J", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lrx/c;", "invitedId", "relationType", "N", "d0", "inviteId", "K", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lrx/c;", "userId", "Lcom/p1/mobile/putong/data/Meta;", "Z", "auctionId", "jsonParam", "P", "Lcom/p1/mobile/putong/live/base/data/BLiveAuctionCounter;", "b0", "(Ljava/lang/String;)Lrx/c;", "type", "", IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET, Constants.KEY_LIMIT, "Lcom/p1/mobile/putong/live/base/data/BLiveAuctionPlatformLeaderboardInfo;", j6f.GPS_MEASUREMENT_INTERRUPTED, "(Ljava/lang/String;II)Lrx/c;", "firstApplyId", "a0", "cpId", "", "ttc", "freeCount", "Q", "(Ljava/lang/String;JI)Lrx/c;", "L", "", "Lcom/p1/mobile/putong/live/base/data/BLiveAuctionQueueInfo;", j6f.GPS_DIRECTION_TRUE, "candidateId", BloodType.f38728O, "R", "U", "Lcom/p1/mobile/putong/live/base/data/BLiveAuctionAsset;", j6f.LATITUDE_SOUTH, "X", Oauth2AccessToken.KEY_UID, "source", "Lcom/p1/mobile/putong/live/base/data/BLiveAuctionRelationCard;", "Y", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class p61 {

    @NotNull
    public static final p61 INSTANCE = new p61();

    /* JADX INFO: renamed from: A */
    public static Meta m167521A(BLiveEnvelope bLiveEnvelope) {
        bLiveEnvelope.getClass();
        return bLiveEnvelope.meta;
    }

    /* JADX INFO: renamed from: B */
    public static Meta m167522B(BLiveEnvelope bLiveEnvelope) {
        bLiveEnvelope.getClass();
        return bLiveEnvelope.meta;
    }

    /* JADX INFO: renamed from: C */
    public static List m167523C(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: D */
    public static BLiveAuctionPlatformLeaderboardInfo m167524D(BLiveEnvelope bLiveEnvelope) {
        bLiveEnvelope.getClass();
        return bLiveEnvelope.data.auctionPlatformLeaderboardInfo;
    }

    /* JADX INFO: renamed from: E */
    public static List m167525E(BLiveEnvelope bLiveEnvelope) {
        bLiveEnvelope.getClass();
        return bLiveEnvelope.data.auctionCandidates;
    }

    /* JADX INFO: renamed from: F */
    public static BLiveAuctionPlatformLeaderboardInfo m167526F(Function1 function1, Object obj) {
        return (BLiveAuctionPlatformLeaderboardInfo) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: G */
    public static List m167527G(BLiveEnvelope bLiveEnvelope) {
        bLiveEnvelope.getClass();
        return bLiveEnvelope.data.auctionCandidates;
    }

    /* JADX INFO: renamed from: H */
    public static Meta m167528H(Function1 function1, Object obj) {
        return (Meta) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: I */
    public static List m167529I(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: M */
    public static final C22306c<BLiveEnvelope> m167530M(@NotNull String roomId, @NotNull String applyId) {
        roomId.getClass();
        applyId.getClass();
        return INSTANCE.m167567J(roomId, applyId, "approve");
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: N */
    public static final C22306c<BLiveEnvelope> m167531N(@NotNull String roomId, @NotNull String invitedId, @NotNull String relationType) {
        roomId.getClass();
        invitedId.getClass();
        relationType.getClass();
        return INSTANCE.m167568K(roomId, invitedId, "approve", relationType);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: P */
    public static final C22306c<Meta> m167532P(@NotNull String roomId, @NotNull String auctionId, @NotNull final String action, @Nullable String jsonParam) {
        roomId.getClass();
        auctionId.getClass();
        action.getClass();
        cll cllVarM107537d = cll.m107499l(ytr.m216073b("/live/voice-rooms/" + roomId + "/auctions/" + auctionId + "?action=" + action)).m107524p().m107537d();
        if (jsonParam == null) {
            jsonParam = "";
        }
        C22306c<BLiveEnvelope> c22306cM194925m = upv.m194925m(cllVarM107537d, "dealAuction", jsonParam);
        final Function1 function1 = new Function1() { // from class: l.k51
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p61.m167565y((BLiveEnvelope) obj);
            }
        };
        C22306c<Meta> c22306cDoOnError = c22306cM194925m.map(new w9j() { // from class: l.l51
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return p61.m167543d(function1, obj);
            }
        }).doOnError(new e30() { // from class: l.m51
            @Override // p149l.e30
            public final void call(Object obj) {
                p61.m167556p(action, (Throwable) obj);
            }
        });
        c22306cDoOnError.getClass();
        return c22306cDoOnError;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: Q */
    public static final C22306c<Meta> m167533Q(@NotNull String cpId, long ttc, int freeCount) throws JSONException {
        cpId.getClass();
        String strM216076e = ytr.m216076e("/auction-relation-cards/" + cpId);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ttc", ttc);
        jSONObject.put("freeCount", freeCount);
        jSONObject.put("orderId", String.valueOf(mqi0.m155944o()));
        C22306c<BLiveEnvelope> c22306cM194922j = upv.m194922j(cll.m107499l(strM216076e).m107524p().m107537d(), "dissolveAuctionShip" + cpId, jSONObject.toString());
        final Function1 function1 = new Function1() { // from class: l.g51
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p61.m167551k((BLiveEnvelope) obj);
            }
        };
        C22306c map = c22306cM194922j.map(new w9j() { // from class: l.r51
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return p61.m167552l(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: V */
    public static final C22306c<BLiveAuctionPlatformLeaderboardInfo> m167534V(@NotNull final String type, int offset, int limit) {
        type.getClass();
        cll cllVarM107537d = cll.m107499l(ytr.m216073b("/live/voice/auction-platform-leaderboards?type=" + type + "&offset=" + offset + "&limit=" + limit)).m107524p().m107537d();
        StringBuilder sb = new StringBuilder("getAuctionLeaderboardList");
        sb.append(type);
        sb.append("-");
        sb.append(offset);
        C22306c<BLiveEnvelope> c22306cM194935w = upv.m194935w(cllVarM107537d, sb.toString());
        final Function1 function1 = new Function1() { // from class: l.p51
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p61.m167524D((BLiveEnvelope) obj);
            }
        };
        C22306c<BLiveAuctionPlatformLeaderboardInfo> c22306cDoOnError = c22306cM194935w.map(new w9j() { // from class: l.q51
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return p61.m167526F(function1, obj);
            }
        }).doOnError(new e30() { // from class: l.s51
            @Override // p149l.e30
            public final void call(Object obj) {
                p61.m167537a(type, (Throwable) obj);
            }
        });
        c22306cDoOnError.getClass();
        return c22306cDoOnError;
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ C22306c m167535W(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 20;
        }
        return m167534V(str, i, i2);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: Z */
    public static final C22306c<Meta> m167536Z(@NotNull final String roomId, @NotNull String userId) throws JSONException {
        roomId.getClass();
        userId.getClass();
        cll cllVarM107537d = cll.m107499l(ytr.m216076e("/voice-rooms/" + roomId + "/auction-invites")).m107524p().m107537d();
        final JSONObject jSONObject = new JSONObject();
        jSONObject.put("userId", userId);
        C22306c<BLiveEnvelope> c22306cM194928p = upv.m194928p(cllVarM107537d, "inviteAuction", jSONObject.toString());
        final Function1 function1 = new Function1() { // from class: l.d61
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p61.m167521A((BLiveEnvelope) obj);
            }
        };
        C22306c<Meta> c22306cDoOnError = c22306cM194928p.map(new w9j() { // from class: l.e61
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return p61.m167561u(function1, obj);
            }
        }).doOnError(new e30() { // from class: l.f61
            @Override // p149l.e30
            public final void call(Object obj) {
                p61.m167563w(roomId, jSONObject, (Throwable) obj);
            }
        });
        c22306cDoOnError.getClass();
        return c22306cDoOnError;
    }

    /* JADX INFO: renamed from: a */
    public static void m167537a(String str, Throwable th) {
        th.getMessage();
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a0 */
    public static final C22306c<Meta> m167538a0(@NotNull final String roomId, @Nullable String firstApplyId) throws JSONException {
        roomId.getClass();
        cll cllVarM107537d = cll.m107499l(ytr.m216073b("/live/voice-rooms/" + roomId + "/auction-counter")).m107524p().m107537d();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "read");
        jSONObject.put("counterName", "applyUnreadCount");
        jSONObject.put("readUntilId", firstApplyId);
        C22306c<BLiveEnvelope> c22306cM194928p = upv.m194928p(cllVarM107537d, "notifyAuctionApplyProcessed", jSONObject.toString());
        final Function1 function1 = new Function1() { // from class: l.v51
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p61.m167522B((BLiveEnvelope) obj);
            }
        };
        C22306c<Meta> c22306cDoOnError = c22306cM194928p.map(new w9j() { // from class: l.w51
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return p61.m167528H(function1, obj);
            }
        }).doOnError(new e30() { // from class: l.x51
            @Override // p149l.e30
            public final void call(Object obj) {
                p61.m167548h(roomId, (Throwable) obj);
            }
        });
        c22306cDoOnError.getClass();
        return c22306cDoOnError;
    }

    /* JADX INFO: renamed from: b */
    public static List m167539b(BLiveEnvelope bLiveEnvelope) {
        bLiveEnvelope.getClass();
        return bLiveEnvelope.data.auctionApplies;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b0 */
    public static final C22306c<BLiveAuctionCounter> m167540b0(@NotNull final String roomId) {
        roomId.getClass();
        C22306c<BLiveEnvelope> c22306cM194935w = upv.m194935w(cll.m107499l(ytr.m216073b("/live/voice-rooms/" + roomId + "/auction-counter")).m107524p().m107537d(), "queryUnreadApplyCounter");
        final Function1 function1 = new Function1() { // from class: l.c61
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p61.m167558r((BLiveEnvelope) obj);
            }
        };
        C22306c<BLiveAuctionCounter> c22306cDoOnError = c22306cM194935w.map(new w9j() { // from class: l.i61
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return p61.m167554n(function1, obj);
            }
        }).doOnError(new e30() { // from class: l.j61
            @Override // p149l.e30
            public final void call(Object obj) {
                p61.m167553m(roomId, (Throwable) obj);
            }
        });
        c22306cDoOnError.getClass();
        return c22306cDoOnError;
    }

    /* JADX INFO: renamed from: c */
    public static BLiveAuctionAsset m167541c(BLiveEnvelope bLiveEnvelope) {
        bLiveEnvelope.getClass();
        return bLiveEnvelope.data.voiceLiveAuctionAsset;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: c0 */
    public static final C22306c<BLiveEnvelope> m167542c0(@NotNull String roomId, @NotNull String applyId) {
        roomId.getClass();
        applyId.getClass();
        return INSTANCE.m167567J(roomId, applyId, "reject");
    }

    /* JADX INFO: renamed from: d */
    public static Meta m167543d(Function1 function1, Object obj) {
        return (Meta) function1.invoke(obj);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: d0 */
    public static final C22306c<BLiveEnvelope> m167544d0(@NotNull String roomId, @NotNull String applyId) {
        roomId.getClass();
        applyId.getClass();
        return INSTANCE.m167568K(roomId, applyId, "reject", "");
    }

    /* JADX INFO: renamed from: e */
    public static BLiveEnvelope m167545e(Function1 function1, Object obj) {
        return (BLiveEnvelope) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: f */
    public static Boolean m167546f(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: g */
    public static Boolean m167547g(BLiveEnvelope bLiveEnvelope) {
        return Boolean.valueOf(bLiveEnvelope.data.voiceLiveAuctions.size() > 0);
    }

    /* JADX INFO: renamed from: h */
    public static void m167548h(String str, Throwable th) {
        th.getMessage();
    }

    /* JADX INFO: renamed from: i */
    public static BLiveEnvelope m167549i(BLiveEnvelope bLiveEnvelope) {
        bLiveEnvelope.getClass();
        return bLiveEnvelope;
    }

    /* JADX INFO: renamed from: j */
    public static void m167550j(Throwable th) {
        th.getMessage();
    }

    /* JADX INFO: renamed from: k */
    public static Meta m167551k(BLiveEnvelope bLiveEnvelope) {
        bLiveEnvelope.getClass();
        return bLiveEnvelope.meta;
    }

    /* JADX INFO: renamed from: l */
    public static Meta m167552l(Function1 function1, Object obj) {
        return (Meta) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: m */
    public static void m167553m(String str, Throwable th) {
        th.getMessage();
    }

    /* JADX INFO: renamed from: n */
    public static BLiveAuctionCounter m167554n(Function1 function1, Object obj) {
        return (BLiveAuctionCounter) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: o */
    public static List m167555o(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: p */
    public static void m167556p(String str, Throwable th) {
        th.getMessage();
    }

    /* JADX INFO: renamed from: q */
    public static List m167557q(BLiveEnvelope bLiveEnvelope) {
        bLiveEnvelope.getClass();
        return bLiveEnvelope.data.auctionRelationCards;
    }

    /* JADX INFO: renamed from: r */
    public static BLiveAuctionCounter m167558r(BLiveEnvelope bLiveEnvelope) {
        bLiveEnvelope.getClass();
        return bLiveEnvelope.data.auctionCounter;
    }

    /* JADX INFO: renamed from: s */
    public static List m167559s(BLiveEnvelope bLiveEnvelope) {
        bLiveEnvelope.getClass();
        return bLiveEnvelope.data.auctionInvites;
    }

    /* JADX INFO: renamed from: t */
    public static void m167560t(Throwable th) {
        th.getMessage();
    }

    /* JADX INFO: renamed from: u */
    public static Meta m167561u(Function1 function1, Object obj) {
        return (Meta) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: v */
    public static List m167562v(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: w */
    public static void m167563w(String str, JSONObject jSONObject, Throwable th) {
        Objects.toString(jSONObject);
        th.getMessage();
    }

    /* JADX INFO: renamed from: x */
    public static List m167564x(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: y */
    public static Meta m167565y(BLiveEnvelope bLiveEnvelope) {
        bLiveEnvelope.getClass();
        return bLiveEnvelope.meta;
    }

    /* JADX INFO: renamed from: z */
    public static BLiveAuctionAsset m167566z(Function1 function1, Object obj) {
        return (BLiveAuctionAsset) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: J */
    public final C22306c<BLiveEnvelope> m167567J(String roomId, String applyId, String action) {
        cll cllVarM107537d = cll.m107499l(ytr.m216076e("/voice-rooms/" + roomId + "/auction-applies/" + applyId + "?action=" + action)).m107524p().m107536c("action", action).m107537d();
        StringBuilder sb = new StringBuilder("apply_");
        sb.append(action);
        C22306c<BLiveEnvelope> c22306cM194925m = upv.m194925m(cllVarM107537d, sb.toString(), "");
        c22306cM194925m.getClass();
        return c22306cM194925m;
    }

    /* JADX INFO: renamed from: K */
    public final C22306c<BLiveEnvelope> m167568K(String roomId, String inviteId, String action, String relationType) throws JSONException {
        String string;
        cll cllVarM107537d = cll.m107499l(ytr.m216076e("/voice-rooms/" + roomId + "/auction-invites/" + inviteId + "?action=" + action)).m107524p().m107536c("action", action).m107537d();
        if (relationType.length() > 0) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("relationType", relationType);
            string = jSONObject.toString();
            string.getClass();
        } else {
            string = "";
        }
        C22306c<BLiveEnvelope> c22306cM194925m = upv.m194925m(cllVarM107537d, "apply_" + action, string);
        c22306cM194925m.getClass();
        return c22306cM194925m;
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final C22306c<BLiveEnvelope> m167569L(@NotNull String roomId, @NotNull String relationType) throws JSONException {
        roomId.getClass();
        relationType.getClass();
        cll cllVarM107537d = cll.m107499l(ytr.m216076e("/voice-rooms/" + roomId + "/auction-applies")).m107524p().m107537d();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("userId", ypv.f199493a.m199309D0());
        jSONObject.put("relationType", relationType);
        C22306c<BLiveEnvelope> c22306cM194928p = upv.m194928p(cllVarM107537d, "applyGuest", jSONObject.toString());
        c22306cM194928p.getClass();
        return c22306cM194928p;
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public final C22306c<List<BLiveAuctionQueueInfo>> m167570O(@NotNull String roomId, @NotNull String candidateId) {
        roomId.getClass();
        candidateId.getClass();
        C22306c<BLiveEnvelope> c22306cM194925m = upv.m194925m(cll.m107499l(ytr.m216076e("/voice-rooms/" + roomId + "/auction-candidates/" + candidateId + "?action=cancel")).m107524p().m107537d(), "cancelCandidates", "");
        final Function1 function1 = new Function1() { // from class: l.g61
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p61.m167527G((BLiveEnvelope) obj);
            }
        };
        C22306c map = c22306cM194925m.map(new w9j() { // from class: l.h61
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return p61.m167555o(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final C22306c<List<BLiveAuctionQueueInfo>> m167571R(@NotNull String roomId) {
        roomId.getClass();
        C22306c<BLiveEnvelope> c22306cM194935w = upv.m194935w(cll.m107499l(ytr.m216076e("/voice-rooms/" + roomId + "/auction-applies")).m107524p().m107537d(), "getAuctionApplies");
        final Function1 function1 = new Function1() { // from class: l.y51
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p61.m167539b((BLiveEnvelope) obj);
            }
        };
        C22306c map = c22306cM194935w.map(new w9j() { // from class: l.z51
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return p61.m167523C(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final C22306c<BLiveAuctionAsset> m167572S(@NotNull String roomId) {
        roomId.getClass();
        C22306c<BLiveEnvelope> c22306cM194935w = upv.m194935w(cll.m107499l(ytr.m216073b("/live/voice-rooms/" + roomId + "/auction-asset")).m107524p().m107537d(), "getAuctionAsset");
        final Function1 function1 = new Function1() { // from class: l.k61
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p61.m167541c((BLiveEnvelope) obj);
            }
        };
        C22306c<BLiveAuctionAsset> c22306cDoOnError = c22306cM194935w.map(new w9j() { // from class: l.l61
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return p61.m167566z(function1, obj);
            }
        }).doOnError(new e30() { // from class: l.m61
            @Override // p149l.e30
            public final void call(Object obj) {
                p61.m167560t((Throwable) obj);
            }
        });
        c22306cDoOnError.getClass();
        return c22306cDoOnError;
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final C22306c<List<BLiveAuctionQueueInfo>> m167573T(@NotNull String roomId) {
        roomId.getClass();
        C22306c<BLiveEnvelope> c22306cM194935w = upv.m194935w(cll.m107499l(ytr.m216076e("/voice-rooms/" + roomId + "/auction-candidates")).m107524p().m107537d(), "getAuctionCandidates");
        final Function1 function1 = new Function1() { // from class: l.n51
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p61.m167525E((BLiveEnvelope) obj);
            }
        };
        C22306c map = c22306cM194935w.map(new w9j() { // from class: l.o51
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return p61.m167562v(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public final C22306c<List<BLiveAuctionQueueInfo>> m167574U(@NotNull String roomId) {
        roomId.getClass();
        C22306c<BLiveEnvelope> c22306cM194935w = upv.m194935w(cll.m107499l(ytr.m216076e("/voice-rooms/" + roomId + "/auction-invites")).m107524p().m107537d(), "getAuctionInvites");
        final Function1 function1 = new Function1() { // from class: l.a61
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p61.m167559s((BLiveEnvelope) obj);
            }
        };
        C22306c map = c22306cM194935w.map(new w9j() { // from class: l.b61
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return p61.m167564x(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @NotNull
    /* JADX INFO: renamed from: X */
    public final C22306c<BLiveEnvelope> m167575X(@NotNull String roomId) {
        roomId.getClass();
        C22306c<BLiveEnvelope> c22306cM194935w = upv.m194935w(cll.m107499l(ytr.m216073b("/live/voice-rooms/" + roomId + "/ongoing-auctions")).m107524p().m107537d(), "getAuctionsInRoom");
        final Function1 function1 = new Function1() { // from class: l.n61
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p61.m167547g((BLiveEnvelope) obj);
            }
        };
        C22306c<BLiveEnvelope> c22306cFilter = c22306cM194935w.filter(new w9j() { // from class: l.o61
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return p61.m167546f(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: l.h51
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p61.m167549i((BLiveEnvelope) obj);
            }
        };
        C22306c<BLiveEnvelope> c22306cDoOnError = c22306cFilter.map(new w9j() { // from class: l.i51
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return p61.m167545e(function2, obj);
            }
        }).doOnError(new e30() { // from class: l.j51
            @Override // p149l.e30
            public final void call(Object obj) {
                p61.m167550j((Throwable) obj);
            }
        });
        c22306cDoOnError.getClass();
        return c22306cDoOnError;
    }

    @NotNull
    /* JADX INFO: renamed from: Y */
    public final C22306c<List<BLiveAuctionRelationCard>> m167576Y(@NotNull String uid, @NotNull String source) {
        uid.getClass();
        source.getClass();
        C22306c<BLiveEnvelope> c22306cM194935w = upv.m194935w(cll.m107499l(ytr.m216076e("/users/" + uid + "/auction-relation-cards?source=" + source)).m107524p().m107537d(), "getRelationCards");
        final Function1 function1 = new Function1() { // from class: l.t51
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p61.m167557q((BLiveEnvelope) obj);
            }
        };
        C22306c map = c22306cM194935w.map(new w9j() { // from class: l.u51
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return p61.m167529I(function1, obj);
            }
        });
        map.getClass();
        return map;
    }
}
