package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.core.newui.immersionvideo.post.imagetovideo.IVPostImagesSelectAct;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class a6m {
    /* JADX INFO: renamed from: a */
    public static void m5294a(IVPostImagesSelectAct iVPostImagesSelectAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        iVPostImagesSelectAct.c = (FrameLayout) viewGroup.getChildAt(0);
        iVPostImagesSelectAct.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        iVPostImagesSelectAct.e = viewGroup.getChildAt(1);
        iVPostImagesSelectAct.f = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m5295b(IVPostImagesSelectAct iVPostImagesSelectAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.o4, viewGroup, false);
        m5294a(iVPostImagesSelectAct, viewInflate);
        return viewInflate;
    }
}
