package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.core.ui.mediapreview.MediaPreviewAct;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class vtx {
    /* JADX INFO: renamed from: a */
    public static void m10350a(MediaPreviewAct mediaPreviewAct, View view) {
        mediaPreviewAct.c = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        mediaPreviewAct.d = viewGroup.getChildAt(0);
        mediaPreviewAct.e = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m10351b(MediaPreviewAct mediaPreviewAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.Xd, viewGroup, false);
        m10350a(mediaPreviewAct, viewInflate);
        return viewInflate;
    }
}
