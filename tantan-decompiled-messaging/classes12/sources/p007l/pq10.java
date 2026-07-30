package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.camera.MusicListAct;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class pq10 {
    /* JADX INFO: renamed from: a */
    public static void m13197a(MusicListAct musicListAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        musicListAct.f845c = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        musicListAct.f846d = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        musicListAct.f847e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        musicListAct.f848f = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        musicListAct.f849g = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m13198b(MusicListAct musicListAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11192d, viewGroup, false);
        m13197a(musicListAct, viewInflate);
        return viewInflate;
    }
}
