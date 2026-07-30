package p003l;

import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p1.mobile.putong.core.newui.immersionvideo.post.imagetovideo.IVVideoComposerActivity;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class t6m {
    /* JADX INFO: renamed from: a */
    public static void m9545a(IVVideoComposerActivity iVVideoComposerActivity, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        iVVideoComposerActivity.c = (FrameLayout) viewGroup.getChildAt(0);
        iVVideoComposerActivity.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        iVVideoComposerActivity.e = (TextureView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        iVVideoComposerActivity.f = viewGroup.getChildAt(1);
        iVVideoComposerActivity.g = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        iVVideoComposerActivity.h = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        iVVideoComposerActivity.i = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        iVVideoComposerActivity.j = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        iVVideoComposerActivity.k = viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m9546b(IVVideoComposerActivity iVVideoComposerActivity, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.j4, viewGroup, false);
        m9545a(iVVideoComposerActivity, viewInflate);
        return viewInflate;
    }
}
