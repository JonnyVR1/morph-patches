package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p046p1.mobile.putong.core.p053ui.mediapicker.MediaItemView;
import p147v.VCheckCircle;
import p147v.VDraweeView;
import p147v.VFrame;

/* JADX INFO: loaded from: classes10.dex */
public class jkx {
    /* JADX INFO: renamed from: a */
    public static void m141916a(MediaItemView mediaItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        mediaItemView.f30616a = (VDraweeView) viewGroup.getChildAt(0);
        mediaItemView.f30617b = (ImageView) viewGroup.getChildAt(1);
        mediaItemView.f30618c = viewGroup.getChildAt(2);
        mediaItemView.f30619d = (VFrame) viewGroup.getChildAt(3);
        mediaItemView.f30620e = (VCheckCircle) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
    }
}
