package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.feed.p065ui.moments.CommentCheckMarkView;
import p151v.VEditText;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class sh5 {
    /* JADX INFO: renamed from: a */
    public static void m185860a(CommentCheckMarkView commentCheckMarkView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        commentCheckMarkView.f44475a = (LinearLayout) viewGroup.getChildAt(0);
        commentCheckMarkView.f44476b = (VEditText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        commentCheckMarkView.f44477c = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        commentCheckMarkView.f44478d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
