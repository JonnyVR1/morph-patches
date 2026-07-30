package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.p058ui.mediapreview.MediaPreviewAct;
import p151v.VImage;
import p151v.VPager;

/* JADX INFO: loaded from: classes10.dex */
public class s2y {
    /* JADX INFO: renamed from: a */
    public static void m184157a(MediaPreviewAct mediaPreviewAct, View view) {
        mediaPreviewAct.f31506c = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        mediaPreviewAct.f31507d = (VPager) viewGroup.getChildAt(0);
        mediaPreviewAct.f31508e = (VImage) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m184158b(MediaPreviewAct mediaPreviewAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125819ee, viewGroup, false);
        m184157a(mediaPreviewAct, viewInflate);
        return viewInflate;
    }
}
