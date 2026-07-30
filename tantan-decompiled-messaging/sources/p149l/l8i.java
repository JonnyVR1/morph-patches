package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.p048ui.label.CommonLabelView;
import com.p046p1.mobile.putong.feed.newui.view.FeedUserSexAndAgeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class l8i {
    /* JADX INFO: renamed from: a */
    public static void m148921a(FeedUserSexAndAgeView feedUserSexAndAgeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedUserSexAndAgeView.f43429a = (VLinear) viewGroup.getChildAt(0);
        feedUserSexAndAgeView.f43430b = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedUserSexAndAgeView.f43431c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedUserSexAndAgeView.f43432d = (CommonLabelView) viewGroup.getChildAt(1);
    }
}
