package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.external.square.search.recent.LiveSearchRecentItemView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class rmt {
    /* JADX INFO: renamed from: a */
    public static void m182108a(LiveSearchRecentItemView liveSearchRecentItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveSearchRecentItemView.f47080a = (VDraweeView) viewGroup.getChildAt(0);
        liveSearchRecentItemView.f47081b = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        liveSearchRecentItemView.f47082c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
