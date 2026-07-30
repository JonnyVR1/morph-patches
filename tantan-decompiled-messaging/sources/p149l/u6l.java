package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.home.HomeErrorNetView;
import p147v.VButton;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class u6l {
    /* JADX INFO: renamed from: a */
    public static void m191982a(HomeErrorNetView homeErrorNetView, View view) {
        homeErrorNetView.f21649a = (HomeErrorNetView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        homeErrorNetView.f21650b = (VImage) viewGroup.getChildAt(0);
        homeErrorNetView.f21651c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        homeErrorNetView.f21652d = (VButton) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
