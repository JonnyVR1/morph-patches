package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.newui.mediaoperation.preview.item.PhotoPreviewView;
import p151v.fresco.photodraweeview.PhotoDraweeView;
import p151v.fresco.subscaleview.SubsamplingScaleImageView;

/* JADX INFO: loaded from: classes13.dex */
public class rj70 {
    /* JADX INFO: renamed from: a */
    public static void m181689a(PhotoPreviewView photoPreviewView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        photoPreviewView.f54945a = (PhotoDraweeView) viewGroup.getChildAt(0);
        photoPreviewView.f54946b = (SubsamplingScaleImageView) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m181690b(PhotoPreviewView photoPreviewView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(jec0.f120467m, viewGroup, true);
        m181689a(photoPreviewView, viewInflate);
        return viewInflate;
    }
}
