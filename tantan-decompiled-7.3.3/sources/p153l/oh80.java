package p153l;

import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.PlayerView;
import p151v.VDraweeView;
import p151v.VFrame_ColorFilter;
import p151v.VLinear;
import p151v.VProgressBar;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class oh80 {
    /* JADX INFO: renamed from: a */
    public static void m167692a(PlayerView playerView, View view) {
        playerView.f28956a = (TextureView) ((ViewGroup) view).getChildAt(0);
        playerView.f28957b = (VDraweeView) view.findViewById(edc0.f93372h0);
        ViewGroup viewGroup = (ViewGroup) view;
        playerView.f28958c = (VProgressBar) viewGroup.getChildAt(2);
        playerView.f28959d = (VLinear) viewGroup.getChildAt(3);
        playerView.f28960e = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        playerView.f28961f = (VProgressBar) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        playerView.f28962g = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        playerView.f28963h = (VFrame_ColorFilter) view.findViewById(edc0.f93184D);
        playerView.f28964i = (ImageView) view.findViewById(edc0.f93396k3);
        playerView.f28965j = (VProgressBar) view.findViewById(edc0.f93276S1);
        playerView.f28966k = (ImageView) view.findViewById(edc0.f93289U2);
        playerView.f28967l = (ImageView) viewGroup.getChildAt(5);
        playerView.f28968m = (VText) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0);
        playerView.f28969n = (TextView) viewGroup.getChildAt(7);
    }

    /* JADX INFO: renamed from: b */
    public static View m167693b(PlayerView playerView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(qec0.f156950T5, viewGroup, true);
        m167692a(playerView, viewInflate);
        return viewInflate;
    }
}
