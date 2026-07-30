package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.p053ui.home.member.likeme.LikeMeFilterView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ycr {
    /* JADX INFO: renamed from: a */
    public static void m214203a(LikeMeFilterView likeMeFilterView, View view) {
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
    public static View m214204b(LikeMeFilterView likeMeFilterView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f121351Y, viewGroup, true);
        m214203a(likeMeFilterView, viewInflate);
        return viewInflate;
    }
}
