package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p051p1.mobile.android.p053ui.cropiwa.CropIwaView;
import com.p051p1.mobile.putong.newui.mediaoperation.cropper.NewAlbumCropperAct;
import p151v.VLinear;
import p151v.VProgressBar;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class eo20 {
    /* JADX INFO: renamed from: a */
    public static void m121717a(NewAlbumCropperAct newAlbumCropperAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        newAlbumCropperAct.f54832c = (CropIwaView) viewGroup.getChildAt(0);
        newAlbumCropperAct.f54833d = (VProgressBar) viewGroup.getChildAt(1);
        newAlbumCropperAct.f54834e = (ImageView) viewGroup.getChildAt(2);
        newAlbumCropperAct.f54835f = (VLinear) viewGroup.getChildAt(3);
        newAlbumCropperAct.f54836g = (ImageView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        newAlbumCropperAct.f54837h = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        newAlbumCropperAct.f54838i = (ImageView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m121718b(NewAlbumCropperAct newAlbumCropperAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(jec0.f120437F, viewGroup, false);
        m121717a(newAlbumCropperAct, viewInflate);
        return viewInflate;
    }
}
