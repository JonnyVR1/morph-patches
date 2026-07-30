package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.feed.newui.mediapicker.NewAlbumPreviewNoEditAct;
import p151v.VPager;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
public class no20 {
    /* JADX INFO: renamed from: a */
    public static void m164022a(NewAlbumPreviewNoEditAct newAlbumPreviewNoEditAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        newAlbumPreviewNoEditAct.f41214c = (VPager) viewGroup.getChildAt(0);
        newAlbumPreviewNoEditAct.f41215d = (VNavigationBar) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m164023b(NewAlbumPreviewNoEditAct newAlbumPreviewNoEditAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173491E1, viewGroup, false);
        m164022a(newAlbumPreviewNoEditAct, viewInflate);
        return viewInflate;
    }
}
