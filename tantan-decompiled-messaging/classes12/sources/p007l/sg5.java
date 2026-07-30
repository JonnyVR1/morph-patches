package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.feed.p005ui.moments.CommentCheckMarkView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class sg5 {
    /* JADX INFO: renamed from: a */
    public static void m14223a(CommentCheckMarkView commentCheckMarkView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        commentCheckMarkView.f5088a = (LinearLayout) viewGroup.getChildAt(0);
        commentCheckMarkView.f5089b = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        commentCheckMarkView.f5090c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        commentCheckMarkView.f5091d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
