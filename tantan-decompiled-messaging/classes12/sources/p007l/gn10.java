package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.camera.MusicAggregateAct;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class gn10 {
    /* JADX INFO: renamed from: a */
    public static void m10491a(MusicAggregateAct musicAggregateAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        musicAggregateAct.f784c = viewGroup.getChildAt(0);
        musicAggregateAct.f785d = (RelativeLayout) viewGroup.getChildAt(1);
        musicAggregateAct.f786e = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        musicAggregateAct.f787f = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        musicAggregateAct.f788g = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        musicAggregateAct.f789h = (FrameLayout) viewGroup.getChildAt(3);
        musicAggregateAct.f790i = (ImageView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        musicAggregateAct.f791j = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0);
        musicAggregateAct.f792k = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(1);
        musicAggregateAct.f793l = (ImageView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m10492b(MusicAggregateAct musicAggregateAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11178b, viewGroup, false);
        m10491a(musicAggregateAct, viewInflate);
        return viewInflate;
    }
}
