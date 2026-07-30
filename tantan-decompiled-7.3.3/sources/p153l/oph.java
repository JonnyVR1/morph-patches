package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.poi.view.FeedPoiCardItemMyTagsView;
import com.p051p1.mobile.putong.core.p058ui.profile.views.FlowTagsView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class oph {
    /* JADX INFO: renamed from: a */
    public static void m168674a(FeedPoiCardItemMyTagsView feedPoiCardItemMyTagsView, View view) {
        feedPoiCardItemMyTagsView.f27141a = (FeedPoiCardItemMyTagsView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedPoiCardItemMyTagsView.f27142b = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        feedPoiCardItemMyTagsView.f27143c = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        feedPoiCardItemMyTagsView.f27144d = (FlowTagsView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
