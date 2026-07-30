package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.p058ui.home.member.likeme.LikeMeFilterView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class zer {
    /* JADX INFO: renamed from: a */
    public static void m219503a(LikeMeFilterView likeMeFilterView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        likeMeFilterView._linear = (LinearLayout) viewGroup.getChildAt(0);
        likeMeFilterView._match_filter = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        likeMeFilterView._match_filter_match_text = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        likeMeFilterView._match_filter_match_dot = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        likeMeFilterView._nearby_filter = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        likeMeFilterView._online_filter = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        likeMeFilterView._pop_filter = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        likeMeFilterView._verified_filter = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        likeMeFilterView._real_avatar_filter = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        likeMeFilterView._info_rich_filter = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m219504b(LikeMeFilterView likeMeFilterView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(pec0.f151959Y, viewGroup, true);
        m219503a(likeMeFilterView, viewInflate);
        return viewInflate;
    }
}
