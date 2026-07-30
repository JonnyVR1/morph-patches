package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.core.p001ui.home.member.likeme.LikeMeFilterView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ycr {
    /* JADX INFO: renamed from: a */
    public static void m11169a(LikeMeFilterView likeMeFilterView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        likeMeFilterView._linear = (LinearLayout) viewGroup.getChildAt(0);
        likeMeFilterView._match_filter = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        likeMeFilterView._match_filter_match_text = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        likeMeFilterView._match_filter_match_dot = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        likeMeFilterView._nearby_filter = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        likeMeFilterView._online_filter = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        likeMeFilterView._pop_filter = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        likeMeFilterView._verified_filter = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        likeMeFilterView._real_avatar_filter = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        likeMeFilterView._info_rich_filter = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m11170b(LikeMeFilterView likeMeFilterView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f5514Y, viewGroup, true);
        m11169a(likeMeFilterView, viewInflate);
        return viewInflate;
    }
}
