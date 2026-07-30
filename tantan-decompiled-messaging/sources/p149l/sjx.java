package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.item.MediaFolderItemView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes12.dex */
public class sjx {
    /* JADX INFO: renamed from: a */
    public static void m184565a(MediaFolderItemView mediaFolderItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        mediaFolderItemView.f54031a = (VDraweeView) viewGroup.getChildAt(0);
        mediaFolderItemView.f54032b = (ImageView) viewGroup.getChildAt(1);
        mediaFolderItemView.f54033c = (ImageView) viewGroup.getChildAt(2);
        mediaFolderItemView.f54034d = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        mediaFolderItemView.f54035e = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        mediaFolderItemView.f54036f = viewGroup.getChildAt(4);
    }
}
