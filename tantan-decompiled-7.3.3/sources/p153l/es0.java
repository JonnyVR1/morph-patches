package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCallAnnouncement;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\f¨\u0006\u000f"}, m88121d2 = {"Ll/es0;", "", "<init>", "()V", "", "roomId", "Lrx/c;", "Lcom/p1/mobile/putong/live/base/data/BLiveMultiCallAnnouncement;", "h", "(Ljava/lang/String;)Lrx/c;", "content", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/String;Ljava/lang/String;)Lrx/c;", "id", "g", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class es0 {

    @NotNull
    public static final es0 INSTANCE = new es0();

    /* JADX INFO: renamed from: a */
    public static BLiveMultiCallAnnouncement m122294a(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope.data.roomAnnouncement;
    }

    /* JADX INFO: renamed from: b */
    public static BLiveMultiCallAnnouncement m122295b(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope.data.roomAnnouncement;
    }

    /* JADX INFO: renamed from: c */
    public static BLiveMultiCallAnnouncement m122296c(Function1 function1, Object obj) {
        return (BLiveMultiCallAnnouncement) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: d */
    public static BLiveMultiCallAnnouncement m122297d(Function1 function1, Object obj) {
        return (BLiveMultiCallAnnouncement) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e */
    public static BLiveMultiCallAnnouncement m122298e(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope.data.roomAnnouncement;
    }

    /* JADX INFO: renamed from: f */
    public static BLiveMultiCallAnnouncement m122299f(Function1 function1, Object obj) {
        return (BLiveMultiCallAnnouncement) function1.invoke(obj);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: h */
    public static final C22421c<BLiveMultiCallAnnouncement> m122300h(@NotNull String roomId) {
        roomId.getClass();
        C22421c<BLiveEnvelope> c22421cM202562w = vrv.m202562w(rnl.m182263l(zvr.m221805e("/rooms/" + roomId + "/announcements")).m182288p().m182301d(), "getAnnouncements");
        final Function1 function1 = new Function1() { // from class: l.as0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return es0.m122295b((BLiveEnvelope) obj);
            }
        };
        C22421c map = c22421cM202562w.map(new qcj() { // from class: l.bs0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return es0.m122299f(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final C22421c<BLiveMultiCallAnnouncement> m122301g(@NotNull String roomId, @NotNull String id) throws JSONException {
        roomId.getClass();
        id.getClass();
        rnl rnlVarM182301d = rnl.m182263l(zvr.m221805e("/rooms/" + roomId + "/announcements/" + id)).m182288p().m182301d();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", "canceled");
        C22421c<BLiveEnvelope> c22421cM202552m = vrv.m202552m(rnlVarM182301d, "cancelAnchorAnnouncements", jSONObject.toString());
        final Function1 function1 = new Function1() { // from class: l.cs0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return es0.m122298e((BLiveEnvelope) obj);
            }
        };
        C22421c map = c22421cM202552m.map(new qcj() { // from class: l.ds0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return es0.m122297d(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final C22421c<BLiveMultiCallAnnouncement> m122302i(@NotNull String roomId, @NotNull String content) throws JSONException {
        roomId.getClass();
        content.getClass();
        rnl rnlVarM182301d = rnl.m182263l(zvr.m221805e("/rooms/" + roomId + "/announcements")).m182288p().m182301d();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("content", content);
        C22421c<BLiveEnvelope> c22421cM202555p = vrv.m202555p(rnlVarM182301d, "postAnchorAnnouncements", jSONObject.toString());
        final Function1 function1 = new Function1() { // from class: l.yr0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return es0.m122294a((BLiveEnvelope) obj);
            }
        };
        C22421c map = c22421cM202555p.map(new qcj() { // from class: l.zr0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return es0.m122296c(function1, obj);
            }
        });
        map.getClass();
        return map;
    }
}
