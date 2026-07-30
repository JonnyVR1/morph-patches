package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.feed.p005ui.moments.CommentView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class qh5 {
    /* JADX INFO: renamed from: a */
    public static void m13557a(CommentView commentView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        commentView.f5094a = (FrameLayout) viewGroup.getChildAt(0);
        commentView.f5095b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        commentView.f5096c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        commentView.f5097d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        commentView.f5098e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        commentView.f5099f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        commentView.f5100g = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1);
        commentView.f5101h = viewGroup.getChildAt(1);
        commentView.f5102i = (FrameLayout) viewGroup.getChildAt(2);
        commentView.f5103j = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        commentView.f5104k = (LinearLayout) viewGroup.getChildAt(3);
        commentView.f5105l = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        commentView.f5106m = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
    }
}
