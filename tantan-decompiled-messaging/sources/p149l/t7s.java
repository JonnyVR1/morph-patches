package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.base.view.LiveEmptyView;

/* JADX INFO: loaded from: classes13.dex */
public class t7s {
    /* JADX INFO: renamed from: a */
    public static void m187500a(LiveEmptyView liveEmptyView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveEmptyView.f44656a = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        liveEmptyView.f44657b = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
