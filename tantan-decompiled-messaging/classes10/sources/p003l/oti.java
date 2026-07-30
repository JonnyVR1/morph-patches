package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p1.mobile.putong.core.ui.mediapicker.FolderItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class oti {
    /* JADX INFO: renamed from: a */
    public static void m8595a(FolderItemView folderItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        folderItemView.a = viewGroup.getChildAt(0);
        folderItemView.b = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        folderItemView.c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        folderItemView.d = (ImageView) viewGroup.getChildAt(2);
    }
}
