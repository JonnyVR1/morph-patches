package p153l;

import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p051p1.mobile.putong.newui.mediaoperation.preview.item.PlayerView;
import p151v.VDraweeView;
import p151v.VFrame_ColorFilter;
import p151v.VLinear;
import p151v.VProgressBar;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class mh80 {
    /* JADX INFO: renamed from: a */
    public static void m158413a(PlayerView playerView, View view) {
        playerView.f54956a = (TextureView) ((ViewGroup) view).getChildAt(0);
        playerView.f54957b = (VDraweeView) view.findViewById(ycc0.f198486v);
        ViewGroup viewGroup = (ViewGroup) view;
        playerView.f54958c = (VProgressBar) viewGroup.getChildAt(2);
        playerView.f54959d = (VLinear) viewGroup.getChildAt(3);
        playerView.f54960e = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        playerView.f54961f = (VProgressBar) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        playerView.f54962g = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        playerView.f54963h = (VFrame_ColorFilter) view.findViewById(ycc0.f198470n);
        playerView.f54964i = (ImageView) view.findViewById(ycc0.f198445a0);
        playerView.f54965j = (VProgressBar) view.findViewById(ycc0.f198437T);
    }

    /* JADX INFO: renamed from: b */
    public static View m158414b(PlayerView playerView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(jec0.f120463i, viewGroup, true);
        m158413a(playerView, viewInflate);
        return viewInflate;
    }
}
