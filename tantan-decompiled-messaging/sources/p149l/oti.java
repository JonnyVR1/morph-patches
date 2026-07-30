package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p046p1.mobile.putong.core.p053ui.mediapicker.FolderItemView;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class oti {
    /* JADX INFO: renamed from: a */
    public static void m165945a(FolderItemView folderItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        folderItemView.f30610a = (VDraweeView) viewGroup.getChildAt(0);
        folderItemView.f30611b = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        folderItemView.f30612c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        folderItemView.f30613d = (ImageView) viewGroup.getChildAt(2);
    }
}
