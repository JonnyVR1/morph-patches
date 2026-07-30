package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.core.newui.immersionvideo.post.imagetovideo.IVPostImagesSelectAct;
import p147v.VButton;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class a6m {
    /* JADX INFO: renamed from: a */
    public static void m95149a(IVPostImagesSelectAct iVPostImagesSelectAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        iVPostImagesSelectAct.f24125c = (FrameLayout) viewGroup.getChildAt(0);
        iVPostImagesSelectAct.f24126d = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        iVPostImagesSelectAct.f24127e = (VNavigationBar) viewGroup.getChildAt(1);
        iVPostImagesSelectAct.f24128f = (VButton) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m95150b(IVPostImagesSelectAct iVPostImagesSelectAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95924o4, viewGroup, false);
        m95149a(iVPostImagesSelectAct, viewInflate);
        return viewInflate;
    }
}
