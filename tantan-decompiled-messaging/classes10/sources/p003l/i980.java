package p003l;

import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.PlayerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class i980 {
    /* JADX INFO: renamed from: a */
    public static void m7139a(PlayerView playerView, View view) {
        playerView.a = (TextureView) ((ViewGroup) view).getChildAt(0);
        playerView.b = view.findViewById(y4c0.f8854h0);
        ViewGroup viewGroup = (ViewGroup) view;
        playerView.c = viewGroup.getChildAt(2);
        playerView.d = viewGroup.getChildAt(3);
        playerView.e = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        playerView.f = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        playerView.g = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        playerView.h = view.findViewById(y4c0.f8666D);
        playerView.i = (ImageView) view.findViewById(y4c0.f8878k3);
        playerView.j = view.findViewById(y4c0.f8758S1);
        playerView.k = (ImageView) view.findViewById(y4c0.f8771U2);
        playerView.l = (ImageView) viewGroup.getChildAt(5);
        playerView.m = ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0);
        playerView.n = (TextView) viewGroup.getChildAt(7);
    }

    /* JADX INFO: renamed from: b */
    public static View m7140b(PlayerView playerView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f5903T5, viewGroup, true);
        m7139a(playerView, viewInflate);
        return viewInflate;
    }
}
