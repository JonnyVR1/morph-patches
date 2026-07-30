package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.poi.view.FeedPoiCardItemMyTagsView;
import com.p046p1.mobile.putong.core.p053ui.profile.views.FlowTagsView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class znh {
    /* JADX INFO: renamed from: a */
    public static void m219448a(FeedPoiCardItemMyTagsView feedPoiCardItemMyTagsView, View view) {
        feedPoiCardItemMyTagsView.f26399a = (FeedPoiCardItemMyTagsView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedPoiCardItemMyTagsView.f26400b = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        feedPoiCardItemMyTagsView.f26401c = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        feedPoiCardItemMyTagsView.f26402d = (FlowTagsView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
