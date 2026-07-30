package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p1.mobile.putong.newui.mediaoperation.cropper.NewAlbumCropperAct;
import l.e6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class uf20 {
    /* JADX INFO: renamed from: a */
    public static void m15090a(NewAlbumCropperAct newAlbumCropperAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        newAlbumCropperAct.c = viewGroup.getChildAt(0);
        newAlbumCropperAct.d = viewGroup.getChildAt(1);
        newAlbumCropperAct.e = (ImageView) viewGroup.getChildAt(2);
        newAlbumCropperAct.f = viewGroup.getChildAt(3);
        newAlbumCropperAct.g = (ImageView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        newAlbumCropperAct.h = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        newAlbumCropperAct.i = (ImageView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m15091b(NewAlbumCropperAct newAlbumCropperAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(e6c0.F, viewGroup, false);
        m15090a(newAlbumCropperAct, viewInflate);
        return viewInflate;
    }
}
