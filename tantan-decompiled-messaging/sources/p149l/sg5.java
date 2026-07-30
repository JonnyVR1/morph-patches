package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.feed.p060ui.moments.CommentCheckMarkView;
import p147v.VEditText;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class sg5 {
    /* JADX INFO: renamed from: a */
    public static void m184033a(CommentCheckMarkView commentCheckMarkView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        commentCheckMarkView.f43627a = (LinearLayout) viewGroup.getChildAt(0);
        commentCheckMarkView.f43628b = (VEditText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        commentCheckMarkView.f43629c = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        commentCheckMarkView.f43630d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
