package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.feed.newui.mediapicker.NewAlbumPreviewNoEditAct;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class dg20 {
    /* JADX INFO: renamed from: a */
    public static void m9368a(NewAlbumPreviewNoEditAct newAlbumPreviewNoEditAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        newAlbumPreviewNoEditAct.f1827c = viewGroup.getChildAt(0);
        newAlbumPreviewNoEditAct.f1828d = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m9369b(NewAlbumPreviewNoEditAct newAlbumPreviewNoEditAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11041E1, viewGroup, false);
        m9368a(newAlbumPreviewNoEditAct, viewInflate);
        return viewInflate;
    }
}
