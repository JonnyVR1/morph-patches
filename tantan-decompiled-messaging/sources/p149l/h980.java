package p149l;

import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p046p1.mobile.putong.feed.p060ui.PlayerView;
import p147v.AutoVDraweeView;
import p147v.VFrame_ColorFilter;
import p147v.VLinear;
import p147v.VProgressBar;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class h980 {
    /* JADX INFO: renamed from: a */
    public static void m129949a(PlayerView playerView, View view) {
        playerView.f43595a = (TextureView) ((ViewGroup) view).getChildAt(0);
        playerView.f43596b = (AutoVDraweeView) view.findViewById(b5c0.f73472D);
        ViewGroup viewGroup = (ViewGroup) view;
        playerView.f43597c = (VProgressBar) viewGroup.getChildAt(2);
        playerView.f43598d = (VLinear) viewGroup.getChildAt(3);
        playerView.f43599e = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        playerView.f43600f = (VProgressBar) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        playerView.f43601g = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        playerView.f43602h = (VFrame_ColorFilter) view.findViewById(b5c0.f73591n);
        playerView.f43603i = (ImageView) view.findViewById(b5c0.f73602q1);
        playerView.f43604j = (VProgressBar) view.findViewById(b5c0.f73485H0);
    }

    /* JADX INFO: renamed from: b */
    public static View m129950b(PlayerView playerView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142096Q3, viewGroup, true);
        m129949a(playerView, viewInflate);
        return viewInflate;
    }
}
