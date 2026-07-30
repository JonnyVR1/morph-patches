package p007l;

import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p000p1.mobile.putong.feed.p005ui.PlayerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class h980 {
    /* JADX INFO: renamed from: a */
    public static void m10564a(PlayerView playerView, View view) {
        playerView.f5056a = (TextureView) ((ViewGroup) view).getChildAt(0);
        playerView.f5057b = view.findViewById(b5c0.f5953D);
        ViewGroup viewGroup = (ViewGroup) view;
        playerView.f5058c = viewGroup.getChildAt(2);
        playerView.f5059d = viewGroup.getChildAt(3);
        playerView.f5060e = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        playerView.f5061f = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        playerView.f5062g = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        playerView.f5063h = view.findViewById(b5c0.f6072n);
        playerView.f5064i = (ImageView) view.findViewById(b5c0.f6083q1);
        playerView.f5065j = view.findViewById(b5c0.f5966H0);
    }

    /* JADX INFO: renamed from: b */
    public static View m10565b(PlayerView playerView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11115Q3, viewGroup, true);
        m10564a(playerView, viewInflate);
        return viewInflate;
    }
}
