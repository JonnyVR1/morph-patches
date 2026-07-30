package p149l;

import android.view.View;
import com.p046p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.p046p1.mobile.putong.live.livingroom.R$string;

/* JADX INFO: loaded from: classes4.dex */
public class gar {
    /* JADX INFO: renamed from: a */
    public static String m125007a(boolean z, long j) {
        if (((bgv) ypv.m215673l(fld0.f98151f)).m101734n()) {
            return String.format(ypv.f199497e.getString(R$string.f47339k6), m125008b(j));
        }
        return String.format(ypv.f199497e.getString(z ? R$string.f46586B7 : R$string.f47012V3), m125008b(j));
    }

    /* JADX INFO: renamed from: b */
    public static String m125008b(long j) {
        return j == 0 ? "0" : x8u.m207433c(j);
    }

    /* JADX INFO: renamed from: c */
    public static String m125009c(boolean z, long j) {
        if (((bgv) ypv.m215673l(fld0.f98151f)).m101734n()) {
            return String.format(ypv.f199497e.getString(R$string.f47339k6), m125008b(j));
        }
        return String.format(ypv.f199497e.getString(z ? R$string.f46586B7 : R$string.f47317j6), m125008b(j));
    }

    /* JADX INFO: renamed from: d */
    public static String m125010d(int i, int i2) {
        return m125008b(i) + " /" + m125008b(i2);
    }

    /* JADX INFO: renamed from: e */
    public static String m125011e(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        return j7d0.m140091b(s410.f162237c.equals(bLiveHourLeaderBoardItem.liveType) ? bLiveHourLeaderBoardItem.liveRole : "", "onlive");
    }

    /* JADX INFO: renamed from: f */
    public static void m125012f(View view) {
        view.measure(ffx.m121202e(), ffx.m121199b(view.getHeight()));
        view.layout(view.getLeft(), view.getTop(), view.getLeft() + view.getMeasuredWidth(), view.getTop() + view.getMeasuredHeight());
    }
}
