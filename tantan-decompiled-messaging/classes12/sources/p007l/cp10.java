package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.camera.MusicCenterAct;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class cp10 {
    /* JADX INFO: renamed from: a */
    public static void m9209a(MusicCenterAct musicCenterAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        musicCenterAct.f818c = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        musicCenterAct.f819d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        musicCenterAct.f820e = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        musicCenterAct.f821f = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m9210b(MusicCenterAct musicCenterAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11185c, viewGroup, false);
        m9209a(musicCenterAct, viewInflate);
        return viewInflate;
    }
}
