package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.poi.view.FeedPoiCardItemMyTagsView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class znh {
    /* JADX INFO: renamed from: a */
    public static void m11438a(FeedPoiCardItemMyTagsView feedPoiCardItemMyTagsView, View view) {
        feedPoiCardItemMyTagsView.a = (FeedPoiCardItemMyTagsView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedPoiCardItemMyTagsView.b = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        feedPoiCardItemMyTagsView.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        feedPoiCardItemMyTagsView.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
