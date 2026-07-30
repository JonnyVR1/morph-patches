package p007l;

import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.feed.newui.mediapicker.NewAlbumVideoEditAct;
import com.p000p1.mobile.putong.feed.newui.mediapicker.VideoCutDrawView;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class fh20 {
    /* JADX INFO: renamed from: a */
    public static void m10112a(NewAlbumVideoEditAct newAlbumVideoEditAct, View view) {
        newAlbumVideoEditAct.f1894c = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        newAlbumVideoEditAct.f1895d = viewGroup.getChildAt(0);
        newAlbumVideoEditAct.f1896e = (TextureView) viewGroup.getChildAt(1);
        newAlbumVideoEditAct.f1897f = viewGroup.getChildAt(2);
        newAlbumVideoEditAct.f1898g = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        newAlbumVideoEditAct.f1899h = (VideoCutDrawView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m10113b(NewAlbumVideoEditAct newAlbumVideoEditAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11184b5, viewGroup, false);
        m10112a(newAlbumVideoEditAct, viewInflate);
        return viewInflate;
    }
}
