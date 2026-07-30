package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.putong.live.external.intl.livesquare.fragments.mainSubTab.IntlLiveSquareMainSubFrag;
import com.p046p1.mobile.putong.live.external.view.widgets.NoSaveStateViewPager;

/* JADX INFO: loaded from: classes13.dex */
public class t4o {
    /* JADX INFO: renamed from: a */
    public static void m187220a(IntlLiveSquareMainSubFrag intlLiveSquareMainSubFrag, View view) {
        intlLiveSquareMainSubFrag.f45677z = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        intlLiveSquareMainSubFrag.f45668A = (TabLayout) viewGroup.getChildAt(0);
        intlLiveSquareMainSubFrag.f45669B = (FrameLayout) viewGroup.getChildAt(1);
        intlLiveSquareMainSubFrag.f45670C = (NoSaveStateViewPager) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m187221b(IntlLiveSquareMainSubFrag intlLiveSquareMainSubFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(s6c0.f162740d0, viewGroup, false);
        m187220a(intlLiveSquareMainSubFrag, viewInflate);
        return viewInflate;
    }
}
