package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.putong.live.external.intl.livesquare.fragments.mainSubTab.IntlLiveSquareMainSubFrag;
import com.p051p1.mobile.putong.live.external.view.widgets.NoSaveStateViewPager;

/* JADX INFO: loaded from: classes9.dex */
public class t6o {
    /* JADX INFO: renamed from: a */
    public static void m189541a(IntlLiveSquareMainSubFrag intlLiveSquareMainSubFrag, View view) {
        intlLiveSquareMainSubFrag.f46525z = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        intlLiveSquareMainSubFrag.f46516A = (TabLayout) viewGroup.getChildAt(0);
        intlLiveSquareMainSubFrag.f46517B = (FrameLayout) viewGroup.getChildAt(1);
        intlLiveSquareMainSubFrag.f46518C = (NoSaveStateViewPager) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m189542b(IntlLiveSquareMainSubFrag intlLiveSquareMainSubFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(xec0.f193854d0, viewGroup, false);
        m189541a(intlLiveSquareMainSubFrag, viewInflate);
        return viewInflate;
    }
}
