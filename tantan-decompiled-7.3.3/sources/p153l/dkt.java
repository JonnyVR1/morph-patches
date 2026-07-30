package p153l;

import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.live.livingroom.archi.frag.RoomFrag;
import com.p051p1.mobile.putong.live.livingroom.view.LiveScrollView;

/* JADX INFO: loaded from: classes5.dex */
public class dkt {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static LiveScrollView m116675a(i6t i6tVar) {
        if (i6tVar == null) {
            return null;
        }
        Frag fragM213812H2 = i6tVar.m213812H2();
        if (fragM213812H2 instanceof RoomFrag) {
            return ((RoomFrag) fragM213812H2).f48586A.f162994b;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static long m116676b(float f) {
        long jAbs = (long) (Math.abs(f) / 10.0f);
        if (jAbs <= 200) {
            return 200L;
        }
        if (jAbs >= 300) {
            return 300L;
        }
        return jAbs;
    }
}
