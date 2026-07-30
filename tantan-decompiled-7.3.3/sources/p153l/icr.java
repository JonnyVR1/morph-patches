package p153l;

import android.view.View;
import com.p051p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.p051p1.mobile.putong.live.livingroom.R$string;

/* JADX INFO: loaded from: classes4.dex */
public class icr {
    /* JADX INFO: renamed from: a */
    public static String m139458a(boolean z, long j) {
        if (((civ) zrv.m221194l(htd0.f111524f)).m109970n()) {
            return String.format(zrv.f205803e.getString(R$string.f48187k6), m139459b(j));
        }
        return String.format(zrv.f205803e.getString(z ? R$string.f47434B7 : R$string.f47860V3), m139459b(j));
    }

    /* JADX INFO: renamed from: b */
    public static String m139459b(long j) {
        return j == 0 ? "0" : yau.m214935c(j);
    }

    /* JADX INFO: renamed from: c */
    public static String m139460c(boolean z, long j) {
        if (((civ) zrv.m221194l(htd0.f111524f)).m109970n()) {
            return String.format(zrv.f205803e.getString(R$string.f48187k6), m139459b(j));
        }
        return String.format(zrv.f205803e.getString(z ? R$string.f47434B7 : R$string.f48165j6), m139459b(j));
    }

    /* JADX INFO: renamed from: d */
    public static String m139461d(int i, int i2) {
        return m139459b(i) + " /" + m139459b(i2);
    }

    /* JADX INFO: renamed from: e */
    public static String m139462e(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        return mfd0.m158165b(cd10.f81075c.equals(bLiveHourLeaderBoardItem.liveType) ? bLiveHourLeaderBoardItem.liveRole : "", "onlive");
    }

    /* JADX INFO: renamed from: f */
    public static void m139463f(View view) {
        view.measure(dox.m117367e(), dox.m117364b(view.getHeight()));
        view.layout(view.getLeft(), view.getTop(), view.getLeft() + view.getMeasuredWidth(), view.getTop() + view.getMeasuredHeight());
    }
}
