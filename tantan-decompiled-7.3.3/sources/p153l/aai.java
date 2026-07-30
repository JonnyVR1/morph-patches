package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.p053ui.label.CommonLabelView;
import com.p051p1.mobile.putong.feed.newui.view.FeedUserSexAndAgeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class aai {
    /* JADX INFO: renamed from: a */
    public static void m96644a(FeedUserSexAndAgeView feedUserSexAndAgeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedUserSexAndAgeView.f44277a = (VLinear) viewGroup.getChildAt(0);
        feedUserSexAndAgeView.f44278b = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedUserSexAndAgeView.f44279c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedUserSexAndAgeView.f44280d = (CommonLabelView) viewGroup.getChildAt(1);
    }
}
