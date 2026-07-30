package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p051p1.mobile.putong.core.p058ui.mediapicker.MediaItemView;
import p151v.VCheckCircle;
import p151v.VDraweeView;
import p151v.VFrame;

/* JADX INFO: loaded from: classes10.dex */
public class gtx {
    /* JADX INFO: renamed from: a */
    public static void m132259a(MediaItemView mediaItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        mediaItemView.f31464a = (VDraweeView) viewGroup.getChildAt(0);
        mediaItemView.f31465b = (ImageView) viewGroup.getChildAt(1);
        mediaItemView.f31466c = viewGroup.getChildAt(2);
        mediaItemView.f31467d = (VFrame) viewGroup.getChildAt(3);
        mediaItemView.f31468e = (VCheckCircle) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
    }
}
