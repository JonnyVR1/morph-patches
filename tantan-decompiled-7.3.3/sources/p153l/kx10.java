package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.feed.newui.camera.MusicCenterAct;

/* JADX INFO: loaded from: classes13.dex */
public class kx10 {
    /* JADX INFO: renamed from: a */
    public static void m151777a(MusicCenterAct musicCenterAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        musicCenterAct.f40205c = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        musicCenterAct.f40206d = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        musicCenterAct.f40207e = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        musicCenterAct.f40208f = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m151778b(MusicCenterAct musicCenterAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173635c, viewGroup, false);
        m151777a(musicCenterAct, viewInflate);
        return viewInflate;
    }
}
