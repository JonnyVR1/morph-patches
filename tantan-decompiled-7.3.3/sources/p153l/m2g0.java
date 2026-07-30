package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceStarRedPacket;
import com.p051p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class m2g0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m156834a(Throwable th) {
    }

    /* JADX INFO: renamed from: c */
    public static void m156836c(final i6t<?, ?> i6tVar, final String str, String str2) {
        i6tVar.duringCreated(VirtualVoiceRoomApiProvider.getStarRedPacketDetail(str2)).subscribe(dhw.m115826e(new y20() { // from class: l.k2g0
            @Override // p153l.y20
            public final void call(Object obj) {
                m2g0.m156837d(i6tVar, str, (List) obj);
            }
        }, new y20() { // from class: l.l2g0
            @Override // p153l.y20
            public final void call(Object obj) {
                m2g0.m156834a((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: d */
    public static void m156837d(i6t<?, ?> i6tVar, String str, List<BLiveVoiceStarRedPacket> list) {
        if (jyb.m147479J(list)) {
            i6tVar.m213811F2().SchemeHandleEvent.handleScheme().mo199273j(new bae0.C15953a(7012).m103154e(str).m103152c());
            return;
        }
        BLiveVoiceStarRedPacket bLiveVoiceStarRedPacket = list.get(0);
        if (TextUtils.equals(bLiveVoiceStarRedPacket.state, "generating") || TextUtils.equals(bLiveVoiceStarRedPacket.state, "ongoing") || TextUtils.equals(bLiveVoiceStarRedPacket.state, "pending")) {
            i6tVar.m213811F2().SchemeHandleEvent.handleScheme().mo199273j(new bae0.C15953a(7012).m103154e(str).m103152c());
        } else if (TextUtils.equals(bLiveVoiceStarRedPacket.state, "finished")) {
            o1j0.m165651y("红包已领完");
        } else if (TextUtils.equals(bLiveVoiceStarRedPacket.state, "expired")) {
            o1j0.m165651y("红包已过期");
        }
    }
}
