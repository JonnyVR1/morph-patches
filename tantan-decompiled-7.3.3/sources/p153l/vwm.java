package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.p051p1.mobile.putong.feed.newui.mediapicker.BottomLineTextView;
import com.p051p1.mobile.putong.feed.newui.mediapicker.CoordinatorLinearLayout;
import com.p051p1.mobile.putong.feed.newui.mediapicker.CoordinatorRecyclerView;
import com.p051p1.mobile.putong.feed.newui.mediapicker.InstaCropperView;
import com.p051p1.mobile.putong.feed.newui.mediapicker.InstaLikePickerAct;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class vwm {
    /* JADX INFO: renamed from: a */
    public static void m203168a(InstaLikePickerAct instaLikePickerAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        instaLikePickerAct.f41178l = (CoordinatorLinearLayout) viewGroup.getChildAt(0);
        instaLikePickerAct.f41179m = (Toolbar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        instaLikePickerAct.f41180n = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        instaLikePickerAct.f41181o = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        instaLikePickerAct.f41182p = (InstaCropperView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        instaLikePickerAct.f41183q = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        instaLikePickerAct.f41184r = (CoordinatorRecyclerView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        instaLikePickerAct.f41185s = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        instaLikePickerAct.f41186t = (BottomLineTextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        instaLikePickerAct.f41187u = (BottomLineTextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m203169b(InstaLikePickerAct instaLikePickerAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173607X3, viewGroup, false);
        m203168a(instaLikePickerAct, viewInflate);
        return viewInflate;
    }
}
