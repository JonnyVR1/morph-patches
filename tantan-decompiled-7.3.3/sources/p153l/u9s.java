package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.base.view.LiveEmptyView;

/* JADX INFO: loaded from: classes13.dex */
public class u9s {
    /* JADX INFO: renamed from: a */
    public static void m195111a(LiveEmptyView liveEmptyView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveEmptyView.f45504a = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        liveEmptyView.f45505b = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
