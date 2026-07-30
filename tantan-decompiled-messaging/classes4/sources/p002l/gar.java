package p002l;

import android.view.View;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import l.bgv;
import l.ffx;
import l.fld0;
import l.j7d0;
import l.s410;
import l.x8u;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class gar {
    /* JADX INFO: renamed from: a */
    public static String m13673a(boolean z, long j) {
        if (((bgv) ypv.l(fld0.f)).n()) {
            return String.format(ypv.e.getString(R$string.f3381k6), m13674b(j));
        }
        return String.format(ypv.e.getString(z ? R$string.f2628B7 : R$string.f3054V3), m13674b(j));
    }

    /* JADX INFO: renamed from: b */
    public static String m13674b(long j) {
        return j == 0 ? "0" : x8u.c(j);
    }

    /* JADX INFO: renamed from: c */
    public static String m13675c(boolean z, long j) {
        if (((bgv) ypv.l(fld0.f)).n()) {
            return String.format(ypv.e.getString(R$string.f3381k6), m13674b(j));
        }
        return String.format(ypv.e.getString(z ? R$string.f2628B7 : R$string.f3359j6), m13674b(j));
    }

    /* JADX INFO: renamed from: d */
    public static String m13676d(int i, int i2) {
        return m13674b(i) + " /" + m13674b(i2);
    }

    /* JADX INFO: renamed from: e */
    public static String m13677e(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        return j7d0.b(s410.c.equals(bLiveHourLeaderBoardItem.liveType) ? bLiveHourLeaderBoardItem.liveRole : "", "onlive");
    }

    /* JADX INFO: renamed from: f */
    public static void m13678f(View view) {
        view.measure(ffx.e(), ffx.b(view.getHeight()));
        view.layout(view.getLeft(), view.getTop(), view.getLeft() + view.getMeasuredWidth(), view.getTop() + view.getMeasuredHeight());
    }
}
