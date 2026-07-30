package p149l;

import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.feed.newui.mediapicker.NewAlbumVideoEditAct;
import com.p046p1.mobile.putong.feed.newui.mediapicker.VideoCutDrawView;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
public class fh20 {
    /* JADX INFO: renamed from: a */
    public static void m121336a(NewAlbumVideoEditAct newAlbumVideoEditAct, View view) {
        newAlbumVideoEditAct.f40433c = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        newAlbumVideoEditAct.f40434d = (VNavigationBar) viewGroup.getChildAt(0);
        newAlbumVideoEditAct.f40435e = (TextureView) viewGroup.getChildAt(1);
        newAlbumVideoEditAct.f40436f = (VText) viewGroup.getChildAt(2);
        newAlbumVideoEditAct.f40437g = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        newAlbumVideoEditAct.f40438h = (VideoCutDrawView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m121337b(NewAlbumVideoEditAct newAlbumVideoEditAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142165b5, viewGroup, false);
        m121336a(newAlbumVideoEditAct, viewInflate);
        return viewInflate;
    }
}
