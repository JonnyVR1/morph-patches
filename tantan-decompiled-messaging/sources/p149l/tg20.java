package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.feed.newui.mediapicker.NewAlbumSelectFrameAct;
import com.p046p1.mobile.putong.feed.newui.mediapicker.SelectFrameView;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
public class tg20 {
    /* JADX INFO: renamed from: a */
    public static void m188799a(NewAlbumSelectFrameAct newAlbumSelectFrameAct, View view) {
        newAlbumSelectFrameAct.f40387c = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        newAlbumSelectFrameAct.f40388d = (VNavigationBar) viewGroup.getChildAt(0);
        newAlbumSelectFrameAct.f40389e = (FrameLayout) viewGroup.getChildAt(1);
        newAlbumSelectFrameAct.f40390f = (VText) viewGroup.getChildAt(2);
        newAlbumSelectFrameAct.f40391g = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        newAlbumSelectFrameAct.f40392h = (SelectFrameView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m188800b(NewAlbumSelectFrameAct newAlbumSelectFrameAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142158a5, viewGroup, false);
        m188799a(newAlbumSelectFrameAct, viewInflate);
        return viewInflate;
    }
}
