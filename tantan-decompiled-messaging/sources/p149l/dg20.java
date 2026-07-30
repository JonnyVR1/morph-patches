package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.feed.newui.mediapicker.NewAlbumPreviewNoEditAct;
import p147v.VPager;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
public class dg20 {
    /* JADX INFO: renamed from: a */
    public static void m111605a(NewAlbumPreviewNoEditAct newAlbumPreviewNoEditAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        newAlbumPreviewNoEditAct.f40366c = (VPager) viewGroup.getChildAt(0);
        newAlbumPreviewNoEditAct.f40367d = (VNavigationBar) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m111606b(NewAlbumPreviewNoEditAct newAlbumPreviewNoEditAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142022E1, viewGroup, false);
        m111605a(newAlbumPreviewNoEditAct, viewInflate);
        return viewInflate;
    }
}
