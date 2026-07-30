package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.feed.newui.camera.MusicAggregateAct;

/* JADX INFO: loaded from: classes13.dex */
public class ov10 {
    /* JADX INFO: renamed from: a */
    public static void m169410a(MusicAggregateAct musicAggregateAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        musicAggregateAct.f40171c = (RecyclerView) viewGroup.getChildAt(0);
        musicAggregateAct.f40172d = (RelativeLayout) viewGroup.getChildAt(1);
        musicAggregateAct.f40173e = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        musicAggregateAct.f40174f = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        musicAggregateAct.f40175g = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        musicAggregateAct.f40176h = (FrameLayout) viewGroup.getChildAt(3);
        musicAggregateAct.f40177i = (ImageView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        musicAggregateAct.f40178j = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0);
        musicAggregateAct.f40179k = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(1);
        musicAggregateAct.f40180l = (ImageView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m169411b(MusicAggregateAct musicAggregateAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173628b, viewGroup, false);
        m169410a(musicAggregateAct, viewInflate);
        return viewInflate;
    }
}
