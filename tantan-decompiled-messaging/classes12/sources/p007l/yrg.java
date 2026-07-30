package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterImageView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.live.LiveTagView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class yrg {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m17194a(xrg xrgVar, View view) {
        xrgVar.f15087a = (FeedCenterImageView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        xrgVar.f15088b = viewGroup.getChildAt(0);
        xrgVar.f15089c = viewGroup.getChildAt(1);
        xrgVar.f15090d = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        xrgVar.f15091e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        xrgVar.f15092f = viewGroup.getChildAt(2);
        xrgVar.f15093g = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        xrgVar.f15094h = (LiveTagView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        xrgVar.f15095i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        xrgVar.f15096j = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2);
        xrgVar.f15097k = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        xrgVar.f15098l = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        xrgVar.f15099m = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        xrgVar.f15100n = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4);
        xrgVar.f15101o = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4)).getChildAt(9);
        xrgVar.f15102p = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4)).getChildAt(10);
        xrgVar.f15103q = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4)).getChildAt(10)).getChildAt(1);
        xrgVar.f15104r = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4)).getChildAt(10)).getChildAt(1)).getChildAt(0);
        xrgVar.f15105s = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4)).getChildAt(10)).getChildAt(1)).getChildAt(1);
        xrgVar.f15106t = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4)).getChildAt(11);
        xrgVar.f15107u = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(5);
        xrgVar.f15108v = viewGroup.getChildAt(3);
    }
}
