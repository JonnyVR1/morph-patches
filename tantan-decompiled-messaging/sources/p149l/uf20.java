package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p046p1.mobile.android.p048ui.cropiwa.CropIwaView;
import com.p046p1.mobile.putong.newui.mediaoperation.cropper.NewAlbumCropperAct;
import p147v.VLinear;
import p147v.VProgressBar;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class uf20 {
    /* JADX INFO: renamed from: a */
    public static void m193370a(NewAlbumCropperAct newAlbumCropperAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        newAlbumCropperAct.f53984c = (CropIwaView) viewGroup.getChildAt(0);
        newAlbumCropperAct.f53985d = (VProgressBar) viewGroup.getChildAt(1);
        newAlbumCropperAct.f53986e = (ImageView) viewGroup.getChildAt(2);
        newAlbumCropperAct.f53987f = (VLinear) viewGroup.getChildAt(3);
        newAlbumCropperAct.f53988g = (ImageView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        newAlbumCropperAct.f53989h = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        newAlbumCropperAct.f53990i = (ImageView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m193371b(NewAlbumCropperAct newAlbumCropperAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(e6c0.f89524F, viewGroup, false);
        m193370a(newAlbumCropperAct, viewInflate);
        return viewInflate;
    }
}
