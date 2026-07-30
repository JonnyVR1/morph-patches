package p153l;

import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.newui.immersionvideo.post.imagetovideo.IVVideoComposerActivity;
import p151v.VDraweeView;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class j9m {
    /* JADX INFO: renamed from: a */
    public static void m143947a(IVVideoComposerActivity iVVideoComposerActivity, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        iVVideoComposerActivity.f24895c = (FrameLayout) viewGroup.getChildAt(0);
        iVVideoComposerActivity.f24896d = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        iVVideoComposerActivity.f24897e = (TextureView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        iVVideoComposerActivity.f24898f = (ConstraintLayout) viewGroup.getChildAt(1);
        iVVideoComposerActivity.f24899g = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        iVVideoComposerActivity.f24900h = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        iVVideoComposerActivity.f24901i = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        iVVideoComposerActivity.f24902j = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        iVVideoComposerActivity.f24903k = (VNavigationBar) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m143948b(IVVideoComposerActivity iVVideoComposerActivity, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125893j4, viewGroup, false);
        m143947a(iVVideoComposerActivity, viewInflate);
        return viewInflate;
    }
}
