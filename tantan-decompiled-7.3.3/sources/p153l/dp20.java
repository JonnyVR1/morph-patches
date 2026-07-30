package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.feed.newui.mediapicker.NewAlbumSelectFrameAct;
import com.p051p1.mobile.putong.feed.newui.mediapicker.SelectFrameView;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
public class dp20 {
    /* JADX INFO: renamed from: a */
    public static void m117370a(NewAlbumSelectFrameAct newAlbumSelectFrameAct, View view) {
        newAlbumSelectFrameAct.f41235c = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        newAlbumSelectFrameAct.f41236d = (VNavigationBar) viewGroup.getChildAt(0);
        newAlbumSelectFrameAct.f41237e = (FrameLayout) viewGroup.getChildAt(1);
        newAlbumSelectFrameAct.f41238f = (VText) viewGroup.getChildAt(2);
        newAlbumSelectFrameAct.f41239g = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        newAlbumSelectFrameAct.f41240h = (SelectFrameView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m117371b(NewAlbumSelectFrameAct newAlbumSelectFrameAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173627a5, viewGroup, false);
        m117370a(newAlbumSelectFrameAct, viewInflate);
        return viewInflate;
    }
}
