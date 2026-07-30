package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.MomentPostBar;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class mq00 {
    /* JADX INFO: renamed from: a */
    public static void m159450a(MomentPostBar momentPostBar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        momentPostBar.f41861a = (VText) viewGroup.getChildAt(0);
        momentPostBar.f41862b = (VDraweeView) viewGroup.getChildAt(1);
        momentPostBar.f41863c = (TextView) viewGroup.getChildAt(2);
        momentPostBar.f41864d = (ImageView) viewGroup.getChildAt(3);
        momentPostBar.f41865e = (ImageView) viewGroup.getChildAt(4);
        momentPostBar.f41866f = (ProgressBar) viewGroup.getChildAt(5);
    }
}
