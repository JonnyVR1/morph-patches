package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.p046p1.mobile.putong.feed.newui.mediapicker.BottomLineTextView;
import com.p046p1.mobile.putong.feed.newui.mediapicker.CoordinatorLinearLayout;
import com.p046p1.mobile.putong.feed.newui.mediapicker.CoordinatorRecyclerView;
import com.p046p1.mobile.putong.feed.newui.mediapicker.InstaCropperView;
import com.p046p1.mobile.putong.feed.newui.mediapicker.InstaLikePickerAct;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class uum {
    /* JADX INFO: renamed from: a */
    public static void m195381a(InstaLikePickerAct instaLikePickerAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        instaLikePickerAct.f40330l = (CoordinatorLinearLayout) viewGroup.getChildAt(0);
        instaLikePickerAct.f40331m = (Toolbar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        instaLikePickerAct.f40332n = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        instaLikePickerAct.f40333o = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        instaLikePickerAct.f40334p = (InstaCropperView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        instaLikePickerAct.f40335q = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        instaLikePickerAct.f40336r = (CoordinatorRecyclerView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        instaLikePickerAct.f40337s = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        instaLikePickerAct.f40338t = (BottomLineTextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        instaLikePickerAct.f40339u = (BottomLineTextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m195382b(InstaLikePickerAct instaLikePickerAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142138X3, viewGroup, false);
        m195381a(instaLikePickerAct, viewInflate);
        return viewInflate;
    }
}
