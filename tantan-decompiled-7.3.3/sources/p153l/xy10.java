package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.feed.newui.camera.MusicListAct;

/* JADX INFO: loaded from: classes13.dex */
public class xy10 {
    /* JADX INFO: renamed from: a */
    public static void m213601a(MusicListAct musicListAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        musicListAct.f40232c = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        musicListAct.f40233d = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        musicListAct.f40234e = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        musicListAct.f40235f = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        musicListAct.f40236g = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m213602b(MusicListAct musicListAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173642d, viewGroup, false);
        m213601a(musicListAct, viewInflate);
        return viewInflate;
    }
}
