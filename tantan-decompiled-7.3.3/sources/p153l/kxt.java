package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.livingroom.other.side.LiveSideView;
import p151v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class kxt {
    /* JADX INFO: renamed from: a */
    public static void m151892a(LiveSideView liveSideView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveSideView.f52100a = (VImage) viewGroup.getChildAt(0);
        liveSideView.f52101b = (RecyclerView) viewGroup.getChildAt(1);
    }
}
