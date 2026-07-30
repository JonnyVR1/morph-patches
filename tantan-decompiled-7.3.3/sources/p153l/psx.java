package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.item.MediaFolderItemView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes13.dex */
public class psx {
    /* JADX INFO: renamed from: a */
    public static void m173698a(MediaFolderItemView mediaFolderItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        mediaFolderItemView.f54879a = (VDraweeView) viewGroup.getChildAt(0);
        mediaFolderItemView.f54880b = (ImageView) viewGroup.getChildAt(1);
        mediaFolderItemView.f54881c = (ImageView) viewGroup.getChildAt(2);
        mediaFolderItemView.f54882d = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        mediaFolderItemView.f54883e = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        mediaFolderItemView.f54884f = viewGroup.getChildAt(4);
    }
}
