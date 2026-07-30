package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.core.newui.immersionvideo.post.imagetovideo.IVPostImagesSelectAct;
import p151v.VButton;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class q8m {
    /* JADX INFO: renamed from: a */
    public static void m175822a(IVPostImagesSelectAct iVPostImagesSelectAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        iVPostImagesSelectAct.f24867c = (FrameLayout) viewGroup.getChildAt(0);
        iVPostImagesSelectAct.f24868d = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        iVPostImagesSelectAct.f24869e = (VNavigationBar) viewGroup.getChildAt(1);
        iVPostImagesSelectAct.f24870f = (VButton) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m175823b(IVPostImagesSelectAct iVPostImagesSelectAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125978o4, viewGroup, false);
        m175822a(iVPostImagesSelectAct, viewInflate);
        return viewInflate;
    }
}
