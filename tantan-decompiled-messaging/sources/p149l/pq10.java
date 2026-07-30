package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.feed.newui.camera.MusicListAct;

/* JADX INFO: loaded from: classes12.dex */
public class pq10 {
    /* JADX INFO: renamed from: a */
    public static void m170874a(MusicListAct musicListAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        musicListAct.f39384c = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        musicListAct.f39385d = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        musicListAct.f39386e = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        musicListAct.f39387f = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        musicListAct.f39388g = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m170875b(MusicListAct musicListAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142173d, viewGroup, false);
        m170874a(musicListAct, viewInflate);
        return viewInflate;
    }
}
