package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCallAnnouncement;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\f¨\u0006\u000f"}, m87232d2 = {"Ll/zr0;", "", "<init>", "()V", "", "roomId", "Lrx/c;", "Lcom/p1/mobile/putong/live/base/data/BLiveMultiCallAnnouncement;", "h", "(Ljava/lang/String;)Lrx/c;", "content", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/String;Ljava/lang/String;)Lrx/c;", "id", "g", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class zr0 {

    @NotNull
    public static final zr0 INSTANCE = new zr0();

    /* JADX INFO: renamed from: a */
    public static BLiveMultiCallAnnouncement m219915a(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope.data.roomAnnouncement;
    }

    /* JADX INFO: renamed from: b */
    public static BLiveMultiCallAnnouncement m219916b(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope.data.roomAnnouncement;
    }

    /* JADX INFO: renamed from: c */
    public static BLiveMultiCallAnnouncement m219917c(Function1 function1, Object obj) {
        return (BLiveMultiCallAnnouncement) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: d */
    public static BLiveMultiCallAnnouncement m219918d(Function1 function1, Object obj) {
        return (BLiveMultiCallAnnouncement) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e */
    public static BLiveMultiCallAnnouncement m219919e(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope.data.roomAnnouncement;
    }

    /* JADX INFO: renamed from: f */
    public static BLiveMultiCallAnnouncement m219920f(Function1 function1, Object obj) {
        return (BLiveMultiCallAnnouncement) function1.invoke(obj);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: h */
    public static final C22306c<BLiveMultiCallAnnouncement> m219921h(@NotNull String roomId) {
        roomId.getClass();
        C22306c<BLiveEnvelope> c22306cM194935w = upv.m194935w(cll.m107499l(ytr.m216076e("/rooms/" + roomId + "/announcements")).m107524p().m107537d(), "getAnnouncements");
        final Function1 function1 = new Function1() { // from class: l.vr0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return zr0.m219916b((BLiveEnvelope) obj);
            }
        };
        C22306c map = c22306cM194935w.map(new w9j() { // from class: l.wr0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return zr0.m219920f(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final C22306c<BLiveMultiCallAnnouncement> m219922g(@NotNull String roomId, @NotNull String id) throws JSONException {
        roomId.getClass();
        id.getClass();
        cll cllVarM107537d = cll.m107499l(ytr.m216076e("/rooms/" + roomId + "/announcements/" + id)).m107524p().m107537d();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", "canceled");
        C22306c<BLiveEnvelope> c22306cM194925m = upv.m194925m(cllVarM107537d, "cancelAnchorAnnouncements", jSONObject.toString());
        final Function1 function1 = new Function1() { // from class: l.xr0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return zr0.m219919e((BLiveEnvelope) obj);
            }
        };
        C22306c map = c22306cM194925m.map(new w9j() { // from class: l.yr0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return zr0.m219918d(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final C22306c<BLiveMultiCallAnnouncement> m219923i(@NotNull String roomId, @NotNull String content) throws JSONException {
        roomId.getClass();
        content.getClass();
        cll cllVarM107537d = cll.m107499l(ytr.m216076e("/rooms/" + roomId + "/announcements")).m107524p().m107537d();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("content", content);
        C22306c<BLiveEnvelope> c22306cM194928p = upv.m194928p(cllVarM107537d, "postAnchorAnnouncements", jSONObject.toString());
        final Function1 function1 = new Function1() { // from class: l.tr0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return zr0.m219915a((BLiveEnvelope) obj);
            }
        };
        C22306c map = c22306cM194928p.map(new w9j() { // from class: l.ur0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return zr0.m219917c(function1, obj);
            }
        });
        map.getClass();
        return map;
    }
}
