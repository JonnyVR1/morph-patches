package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.external.square.search.recent.LiveSearchRecentItemView;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class qkt {
    /* JADX INFO: renamed from: a */
    public static void m175391a(LiveSearchRecentItemView liveSearchRecentItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveSearchRecentItemView.f46232a = (VDraweeView) viewGroup.getChildAt(0);
        liveSearchRecentItemView.f46233b = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        liveSearchRecentItemView.f46234c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
