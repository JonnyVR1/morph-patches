package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.PhotoPreviewView;
import com.p046p1.mobile.putong.core.p053ui.mediapreview.gesture.CorePhotoDraweeView;
import p147v.VText;
import p147v.fresco.subscaleview.SubsamplingScaleImageView;

/* JADX INFO: loaded from: classes10.dex */
public class mb70 {
    /* JADX INFO: renamed from: a */
    public static void m153863a(PhotoPreviewView photoPreviewView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        photoPreviewView.f28022a = (CorePhotoDraweeView) viewGroup.getChildAt(0);
        photoPreviewView.f28023b = (SubsamplingScaleImageView) viewGroup.getChildAt(1);
        photoPreviewView.f28024c = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        photoPreviewView.f28025d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0);
        photoPreviewView.f28026e = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m153864b(PhotoPreviewView photoPreviewView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f96088xf, viewGroup, true);
        m153863a(photoPreviewView, viewInflate);
        return viewInflate;
    }
}
