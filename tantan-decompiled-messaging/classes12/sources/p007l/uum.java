package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.mediapicker.BottomLineTextView;
import com.p000p1.mobile.putong.feed.newui.mediapicker.CoordinatorLinearLayout;
import com.p000p1.mobile.putong.feed.newui.mediapicker.CoordinatorRecyclerView;
import com.p000p1.mobile.putong.feed.newui.mediapicker.InstaCropperView;
import com.p000p1.mobile.putong.feed.newui.mediapicker.InstaLikePickerAct;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class uum {
    /* JADX INFO: renamed from: a */
    public static void m15139a(InstaLikePickerAct instaLikePickerAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        instaLikePickerAct.f1791l = (CoordinatorLinearLayout) viewGroup.getChildAt(0);
        instaLikePickerAct.f1792m = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        instaLikePickerAct.f1793n = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        instaLikePickerAct.f1794o = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        instaLikePickerAct.f1795p = (InstaCropperView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        instaLikePickerAct.f1796q = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        instaLikePickerAct.f1797r = (CoordinatorRecyclerView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        instaLikePickerAct.f1798s = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        instaLikePickerAct.f1799t = (BottomLineTextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        instaLikePickerAct.f1800u = (BottomLineTextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m15140b(InstaLikePickerAct instaLikePickerAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11157X3, viewGroup, false);
        m15139a(instaLikePickerAct, viewInflate);
        return viewInflate;
    }
}
