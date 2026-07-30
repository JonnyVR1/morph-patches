package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceStarRedPacket;
import com.p046p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class duf0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m113687a(Throwable th) {
    }

    /* JADX INFO: renamed from: c */
    public static void m113689c(final h4t<?, ?> h4tVar, final String str, String str2) {
        h4tVar.duringCreated(VirtualVoiceRoomApiProvider.getStarRedPacketDetail(str2)).subscribe(ffw.m121194e(new e30() { // from class: l.buf0
            @Override // p149l.e30
            public final void call(Object obj) {
                duf0.m113690d(h4tVar, str, (List) obj);
            }
        }, new e30() { // from class: l.cuf0
            @Override // p149l.e30
            public final void call(Object obj) {
                duf0.m113687a((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: d */
    public static void m113690d(h4t<?, ?> h4tVar, String str, List<BLiveVoiceStarRedPacket> list) {
        if (vwb.m200296J(list)) {
            h4tVar.m206028F2().SchemeHandleEvent.handleScheme().mo172463j(new x1e0.C21018a(7012).m206701e(str).m206699c());
            return;
        }
        BLiveVoiceStarRedPacket bLiveVoiceStarRedPacket = list.get(0);
        if (TextUtils.equals(bLiveVoiceStarRedPacket.state, "generating") || TextUtils.equals(bLiveVoiceStarRedPacket.state, "ongoing") || TextUtils.equals(bLiveVoiceStarRedPacket.state, "pending")) {
            h4tVar.m206028F2().SchemeHandleEvent.handleScheme().mo172463j(new x1e0.C21018a(7012).m206701e(str).m206699c());
        } else if (TextUtils.equals(bLiveVoiceStarRedPacket.state, "finished")) {
            lsi0.m151595y("红包已领完");
        } else if (TextUtils.equals(bLiveVoiceStarRedPacket.state, "expired")) {
            lsi0.m151595y("红包已过期");
        }
    }
}
