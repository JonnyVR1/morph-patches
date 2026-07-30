package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.PhotoPreviewView;
import com.p051p1.mobile.putong.core.p058ui.mediapreview.gesture.CorePhotoDraweeView;
import p151v.VText;
import p151v.fresco.subscaleview.SubsamplingScaleImageView;

/* JADX INFO: loaded from: classes10.dex */
public class sj70 {
    /* JADX INFO: renamed from: a */
    public static void m186062a(PhotoPreviewView photoPreviewView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        photoPreviewView.f28870a = (CorePhotoDraweeView) viewGroup.getChildAt(0);
        photoPreviewView.f28871b = (SubsamplingScaleImageView) viewGroup.getChildAt(1);
        photoPreviewView.f28872c = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        photoPreviewView.f28873d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0);
        photoPreviewView.f28874e = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m186063b(PhotoPreviewView photoPreviewView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125399Ef, viewGroup, true);
        m186062a(photoPreviewView, viewInflate);
        return viewInflate;
    }
}
