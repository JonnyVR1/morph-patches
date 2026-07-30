package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.livingroom.other.side.LiveSideView;
import p147v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class jvt {
    /* JADX INFO: renamed from: a */
    public static void m143574a(LiveSideView liveSideView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveSideView.f51252a = (VImage) viewGroup.getChildAt(0);
        liveSideView.f51253b = (RecyclerView) viewGroup.getChildAt(1);
    }
}
