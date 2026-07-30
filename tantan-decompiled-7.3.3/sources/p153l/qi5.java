package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.feed.p065ui.moments.CommentView;
import p151v.VDraweeView;
import p151v.VFrame_Anim;
import p151v.VImage;
import p151v.VProgressBar;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class qi5 {
    /* JADX INFO: renamed from: a */
    public static void m176661a(CommentView commentView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        commentView.f44481a = (FrameLayout) viewGroup.getChildAt(0);
        commentView.f44482b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        commentView.f44483c = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        commentView.f44484d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        commentView.f44485e = (VFrame_Anim) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        commentView.f44486f = (VProgressBar) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        commentView.f44487g = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1);
        commentView.f44488h = viewGroup.getChildAt(1);
        commentView.f44489i = (FrameLayout) viewGroup.getChildAt(2);
        commentView.f44490j = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        commentView.f44491k = (LinearLayout) viewGroup.getChildAt(3);
        commentView.f44492l = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        commentView.f44493m = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
    }
}
