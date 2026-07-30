package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.feed.p060ui.moments.CommentView;
import p147v.VDraweeView;
import p147v.VFrame_Anim;
import p147v.VImage;
import p147v.VProgressBar;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class qh5 {
    /* JADX INFO: renamed from: a */
    public static void m174509a(CommentView commentView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        commentView.f43633a = (FrameLayout) viewGroup.getChildAt(0);
        commentView.f43634b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        commentView.f43635c = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        commentView.f43636d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        commentView.f43637e = (VFrame_Anim) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        commentView.f43638f = (VProgressBar) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        commentView.f43639g = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1);
        commentView.f43640h = viewGroup.getChildAt(1);
        commentView.f43641i = (FrameLayout) viewGroup.getChildAt(2);
        commentView.f43642j = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        commentView.f43643k = (LinearLayout) viewGroup.getChildAt(3);
        commentView.f43644l = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        commentView.f43645m = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
    }
}
