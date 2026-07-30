package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.item.MediaFolderItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class sjx {
    /* JADX INFO: renamed from: a */
    public static void m14226a(MediaFolderItemView mediaFolderItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        mediaFolderItemView.a = viewGroup.getChildAt(0);
        mediaFolderItemView.b = (ImageView) viewGroup.getChildAt(1);
        mediaFolderItemView.c = (ImageView) viewGroup.getChildAt(2);
        mediaFolderItemView.d = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        mediaFolderItemView.e = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        mediaFolderItemView.f = viewGroup.getChildAt(4);
    }
}
