package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.QAMomentPostBar;

/* JADX INFO: loaded from: classes13.dex */
public class ssb0 {
    /* JADX INFO: renamed from: a */
    public static void m187697a(QAMomentPostBar qAMomentPostBar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        qAMomentPostBar.f42190u = (FrameLayout) viewGroup.getChildAt(0);
        qAMomentPostBar.f42191v = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        qAMomentPostBar.f42192w = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        qAMomentPostBar.f42193x = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        qAMomentPostBar.f42194y = (FrameLayout) viewGroup.getChildAt(1);
        qAMomentPostBar.f42195z = (ProgressBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
    }
}
