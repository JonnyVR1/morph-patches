package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p051p1.mobile.putong.core.p058ui.mediapicker.FolderItemView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class kwi {
    /* JADX INFO: renamed from: a */
    public static void m151700a(FolderItemView folderItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        folderItemView.f31458a = (VDraweeView) viewGroup.getChildAt(0);
        folderItemView.f31459b = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        folderItemView.f31460c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        folderItemView.f31461d = (ImageView) viewGroup.getChildAt(2);
    }
}
