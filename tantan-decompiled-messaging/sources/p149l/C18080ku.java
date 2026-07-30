package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.flipboard.bottomsheet.BottomSheetLayout;
import com.google.android.material.tabs.TabLayout;
import p147v.VPager;
import p147v.VProgressBar;
import p147v.VText;

/* JADX INFO: renamed from: l.ku */
/* JADX INFO: loaded from: classes9.dex */
public class C18080ku {
    /* JADX INFO: renamed from: a */
    public static void m147225a(C17860ju c17860ju, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        c17860ju.f119695a = (ViewStub) viewGroup.getChildAt(0);
        c17860ju.f119696b = (TabLayout) viewGroup.getChildAt(1);
        c17860ju.f119697c = (BottomSheetLayout) viewGroup.getChildAt(3);
        c17860ju.f119698d = (VPager) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0);
        c17860ju.f119699e = (VProgressBar) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1);
        c17860ju.f119700f = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(3);
        c17860ju.f119701g = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(3)).getChildAt(0);
        c17860ju.f119702h = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(3)).getChildAt(1);
        c17860ju.f119703i = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(4);
        c17860ju.f119704j = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(4)).getChildAt(0);
        c17860ju.f119705k = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(4)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m147226b(C17860ju c17860ju, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(c6c0.f79464D, viewGroup, false);
        m147225a(c17860ju, viewInflate);
        return viewInflate;
    }
}
