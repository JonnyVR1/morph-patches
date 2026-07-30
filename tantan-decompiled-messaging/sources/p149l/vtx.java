package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.p053ui.mediapreview.MediaPreviewAct;
import p147v.VImage;
import p147v.VPager;

/* JADX INFO: loaded from: classes10.dex */
public class vtx {
    /* JADX INFO: renamed from: a */
    public static void m200054a(MediaPreviewAct mediaPreviewAct, View view) {
        mediaPreviewAct.f30658c = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        mediaPreviewAct.f30659d = (VPager) viewGroup.getChildAt(0);
        mediaPreviewAct.f30660e = (VImage) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m200055b(MediaPreviewAct mediaPreviewAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95648Xd, viewGroup, false);
        m200054a(mediaPreviewAct, viewInflate);
        return viewInflate;
    }
}
