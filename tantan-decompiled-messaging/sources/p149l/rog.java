package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.feed.newui.status.display.view.FeedAutoScrollView;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class rog {
    /* JADX INFO: renamed from: a */
    public static void m180241a(FeedAutoScrollView feedAutoScrollView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedAutoScrollView.f42898a = (ConstraintLayout) viewGroup.getChildAt(0);
        feedAutoScrollView.f42899b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedAutoScrollView.f42900c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedAutoScrollView.f42901d = (ConstraintLayout) viewGroup.getChildAt(1);
        feedAutoScrollView.f42902e = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedAutoScrollView.f42903f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
