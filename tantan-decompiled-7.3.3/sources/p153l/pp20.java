package p153l;

import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.feed.newui.mediapicker.NewAlbumVideoEditAct;
import com.p051p1.mobile.putong.feed.newui.mediapicker.VideoCutDrawView;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
public class pp20 {
    /* JADX INFO: renamed from: a */
    public static void m173176a(NewAlbumVideoEditAct newAlbumVideoEditAct, View view) {
        newAlbumVideoEditAct.f41281c = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        newAlbumVideoEditAct.f41282d = (VNavigationBar) viewGroup.getChildAt(0);
        newAlbumVideoEditAct.f41283e = (TextureView) viewGroup.getChildAt(1);
        newAlbumVideoEditAct.f41284f = (VText) viewGroup.getChildAt(2);
        newAlbumVideoEditAct.f41285g = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        newAlbumVideoEditAct.f41286h = (VideoCutDrawView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m173177b(NewAlbumVideoEditAct newAlbumVideoEditAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173634b5, viewGroup, false);
        m173176a(newAlbumVideoEditAct, viewInflate);
        return viewInflate;
    }
}
