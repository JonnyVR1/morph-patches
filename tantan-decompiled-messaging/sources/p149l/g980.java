package p149l;

import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p046p1.mobile.putong.newui.mediaoperation.preview.item.PlayerView;
import p147v.VDraweeView;
import p147v.VFrame_ColorFilter;
import p147v.VLinear;
import p147v.VProgressBar;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class g980 {
    /* JADX INFO: renamed from: a */
    public static void m124779a(PlayerView playerView, View view) {
        playerView.f54108a = (TextureView) ((ViewGroup) view).getChildAt(0);
        playerView.f54109b = (VDraweeView) view.findViewById(s4c0.f162365v);
        ViewGroup viewGroup = (ViewGroup) view;
        playerView.f54110c = (VProgressBar) viewGroup.getChildAt(2);
        playerView.f54111d = (VLinear) viewGroup.getChildAt(3);
        playerView.f54112e = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        playerView.f54113f = (VProgressBar) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        playerView.f54114g = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        playerView.f54115h = (VFrame_ColorFilter) view.findViewById(s4c0.f162349n);
        playerView.f54116i = (ImageView) view.findViewById(s4c0.f162324a0);
        playerView.f54117j = (VProgressBar) view.findViewById(s4c0.f162316T);
    }

    /* JADX INFO: renamed from: b */
    public static View m124780b(PlayerView playerView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(e6c0.f89550i, viewGroup, true);
        m124779a(playerView, viewInflate);
        return viewInflate;
    }
}
