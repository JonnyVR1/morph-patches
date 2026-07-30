package p149l;

import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.live.livingroom.archi.frag.RoomFrag;
import com.p046p1.mobile.putong.live.livingroom.view.LiveScrollView;

/* JADX INFO: loaded from: classes5.dex */
public class cit {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static LiveScrollView m107098a(h4t h4tVar) {
        if (h4tVar == null) {
            return null;
        }
        Frag fragM206029H2 = h4tVar.m206029H2();
        if (fragM206029H2 instanceof RoomFrag) {
            return ((RoomFrag) fragM206029H2).f47738A.f142612b;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static long m107099b(float f) {
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
