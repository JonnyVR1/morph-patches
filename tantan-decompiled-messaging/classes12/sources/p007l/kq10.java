package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.camera.MusicItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class kq10 {
    /* JADX INFO: renamed from: a */
    public static void m11512a(MusicItemView musicItemView, View view) {
        musicItemView.f828a = (MusicItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        musicItemView.f829b = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        musicItemView.f830c = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        musicItemView.f831d = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        musicItemView.f832e = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        musicItemView.f833f = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        musicItemView.f834g = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        musicItemView.f835h = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        musicItemView.f836i = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        musicItemView.f837j = (TextView) viewGroup.getChildAt(1);
    }
}
