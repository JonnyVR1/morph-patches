package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.feed.newui.camera.MusicAggregateAct;

/* JADX INFO: loaded from: classes12.dex */
public class gn10 {
    /* JADX INFO: renamed from: a */
    public static void m127098a(MusicAggregateAct musicAggregateAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        musicAggregateAct.f39323c = (RecyclerView) viewGroup.getChildAt(0);
        musicAggregateAct.f39324d = (RelativeLayout) viewGroup.getChildAt(1);
        musicAggregateAct.f39325e = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        musicAggregateAct.f39326f = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        musicAggregateAct.f39327g = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        musicAggregateAct.f39328h = (FrameLayout) viewGroup.getChildAt(3);
        musicAggregateAct.f39329i = (ImageView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        musicAggregateAct.f39330j = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0);
        musicAggregateAct.f39331k = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(1);
        musicAggregateAct.f39332l = (ImageView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m127099b(MusicAggregateAct musicAggregateAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142159b, viewGroup, false);
        m127098a(musicAggregateAct, viewInflate);
        return viewInflate;
    }
}
