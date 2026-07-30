package p149l;

import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.newui.immersionvideo.post.imagetovideo.IVVideoComposerActivity;
import p147v.VDraweeView;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class t6m {
    /* JADX INFO: renamed from: a */
    public static void m187384a(IVVideoComposerActivity iVVideoComposerActivity, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        iVVideoComposerActivity.f24153c = (FrameLayout) viewGroup.getChildAt(0);
        iVVideoComposerActivity.f24154d = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        iVVideoComposerActivity.f24155e = (TextureView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        iVVideoComposerActivity.f24156f = (ConstraintLayout) viewGroup.getChildAt(1);
        iVVideoComposerActivity.f24157g = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        iVVideoComposerActivity.f24158h = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        iVVideoComposerActivity.f24159i = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        iVVideoComposerActivity.f24160j = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        iVVideoComposerActivity.f24161k = (VNavigationBar) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m187385b(IVVideoComposerActivity iVVideoComposerActivity, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95839j4, viewGroup, false);
        m187384a(iVVideoComposerActivity, viewInflate);
        return viewInflate;
    }
}
