package p153l;

import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p051p1.mobile.putong.feed.p065ui.PlayerView;
import p151v.AutoVDraweeView;
import p151v.VFrame_ColorFilter;
import p151v.VLinear;
import p151v.VProgressBar;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class nh80 {
    /* JADX INFO: renamed from: a */
    public static void m163071a(PlayerView playerView, View view) {
        playerView.f44443a = (TextureView) ((ViewGroup) view).getChildAt(0);
        playerView.f44444b = (AutoVDraweeView) view.findViewById(hdc0.f108825D);
        ViewGroup viewGroup = (ViewGroup) view;
        playerView.f44445c = (VProgressBar) viewGroup.getChildAt(2);
        playerView.f44446d = (VLinear) viewGroup.getChildAt(3);
        playerView.f44447e = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        playerView.f44448f = (VProgressBar) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        playerView.f44449g = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        playerView.f44450h = (VFrame_ColorFilter) view.findViewById(hdc0.f108944n);
        playerView.f44451i = (ImageView) view.findViewById(hdc0.f108955q1);
        playerView.f44452j = (VProgressBar) view.findViewById(hdc0.f108838H0);
    }

    /* JADX INFO: renamed from: b */
    public static View m163072b(PlayerView playerView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173565Q3, viewGroup, true);
        m163071a(playerView, viewInflate);
        return viewInflate;
    }
}
