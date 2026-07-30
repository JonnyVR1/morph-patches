package p149l;

import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.PlayerView;
import p147v.VDraweeView;
import p147v.VFrame_ColorFilter;
import p147v.VLinear;
import p147v.VProgressBar;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class i980 {
    /* JADX INFO: renamed from: a */
    public static void m135046a(PlayerView playerView, View view) {
        playerView.f28108a = (TextureView) ((ViewGroup) view).getChildAt(0);
        playerView.f28109b = (VDraweeView) view.findViewById(y4c0.f196137h0);
        ViewGroup viewGroup = (ViewGroup) view;
        playerView.f28110c = (VProgressBar) viewGroup.getChildAt(2);
        playerView.f28111d = (VLinear) viewGroup.getChildAt(3);
        playerView.f28112e = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        playerView.f28113f = (VProgressBar) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        playerView.f28114g = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        playerView.f28115h = (VFrame_ColorFilter) view.findViewById(y4c0.f195949D);
        playerView.f28116i = (ImageView) view.findViewById(y4c0.f196161k3);
        playerView.f28117j = (VProgressBar) view.findViewById(y4c0.f196041S1);
        playerView.f28118k = (ImageView) view.findViewById(y4c0.f196054U2);
        playerView.f28119l = (ImageView) viewGroup.getChildAt(5);
        playerView.f28120m = (VText) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0);
        playerView.f28121n = (TextView) viewGroup.getChildAt(7);
    }

    /* JADX INFO: renamed from: b */
    public static View m135047b(PlayerView playerView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f126394T5, viewGroup, true);
        m135046a(playerView, viewInflate);
        return viewInflate;
    }
}
