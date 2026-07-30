package p007l;

import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p1.mobile.putong.newui.mediaoperation.preview.item.PlayerView;
import l.e6c0;
import l.s4c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class g980 {
    /* JADX INFO: renamed from: a */
    public static void m10427a(PlayerView playerView, View view) {
        playerView.a = (TextureView) ((ViewGroup) view).getChildAt(0);
        playerView.b = view.findViewById(s4c0.v);
        ViewGroup viewGroup = (ViewGroup) view;
        playerView.c = viewGroup.getChildAt(2);
        playerView.d = viewGroup.getChildAt(3);
        playerView.e = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        playerView.f = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        playerView.g = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        playerView.h = view.findViewById(s4c0.n);
        playerView.i = (ImageView) view.findViewById(s4c0.a0);
        playerView.j = view.findViewById(s4c0.T);
    }

    /* JADX INFO: renamed from: b */
    public static View m10428b(PlayerView playerView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(e6c0.i, viewGroup, true);
        m10427a(playerView, viewInflate);
        return viewInflate;
    }
}
