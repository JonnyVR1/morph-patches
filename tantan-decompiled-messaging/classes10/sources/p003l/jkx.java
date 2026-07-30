package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p1.mobile.putong.core.ui.mediapicker.MediaItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class jkx {
    /* JADX INFO: renamed from: a */
    public static void m7426a(MediaItemView mediaItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        mediaItemView.a = viewGroup.getChildAt(0);
        mediaItemView.b = (ImageView) viewGroup.getChildAt(1);
        mediaItemView.c = viewGroup.getChildAt(2);
        mediaItemView.d = viewGroup.getChildAt(3);
        mediaItemView.e = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
    }
}
