package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.feed.newui.camera.MusicCenterAct;

/* JADX INFO: loaded from: classes12.dex */
public class cp10 {
    /* JADX INFO: renamed from: a */
    public static void m108047a(MusicCenterAct musicCenterAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        musicCenterAct.f39357c = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        musicCenterAct.f39358d = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        musicCenterAct.f39359e = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        musicCenterAct.f39360f = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m108048b(MusicCenterAct musicCenterAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142166c, viewGroup, false);
        m108047a(musicCenterAct, viewInflate);
        return viewInflate;
    }
}
