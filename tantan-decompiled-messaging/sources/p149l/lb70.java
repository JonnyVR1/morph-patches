package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.newui.mediaoperation.preview.item.PhotoPreviewView;
import p147v.fresco.photodraweeview.PhotoDraweeView;
import p147v.fresco.subscaleview.SubsamplingScaleImageView;

/* JADX INFO: loaded from: classes12.dex */
public class lb70 {
    /* JADX INFO: renamed from: a */
    public static void m149215a(PhotoPreviewView photoPreviewView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        photoPreviewView.f54097a = (PhotoDraweeView) viewGroup.getChildAt(0);
        photoPreviewView.f54098b = (SubsamplingScaleImageView) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m149216b(PhotoPreviewView photoPreviewView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(e6c0.f89554m, viewGroup, true);
        m149215a(photoPreviewView, viewInflate);
        return viewInflate;
    }
}
