package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.feed.newui.mediapicker.NewAlbumSelectFrameAct;
import com.p000p1.mobile.putong.feed.newui.mediapicker.SelectFrameView;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class tg20 {
    /* JADX INFO: renamed from: a */
    public static void m14532a(NewAlbumSelectFrameAct newAlbumSelectFrameAct, View view) {
        newAlbumSelectFrameAct.f1848c = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        newAlbumSelectFrameAct.f1849d = viewGroup.getChildAt(0);
        newAlbumSelectFrameAct.f1850e = (FrameLayout) viewGroup.getChildAt(1);
        newAlbumSelectFrameAct.f1851f = viewGroup.getChildAt(2);
        newAlbumSelectFrameAct.f1852g = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        newAlbumSelectFrameAct.f1853h = (SelectFrameView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m14533b(NewAlbumSelectFrameAct newAlbumSelectFrameAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11177a5, viewGroup, false);
        m14532a(newAlbumSelectFrameAct, viewInflate);
        return viewInflate;
    }
}
