package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.feed.newui.preview.gesture.FeedPhotoDraweeView;
import com.p046p1.mobile.putong.feed.p060ui.FeedPhotoPreviewView;
import p147v.fresco.subscaleview.SubsamplingScaleImageView;

/* JADX INFO: loaded from: classes12.dex */
public class pmh {
    /* JADX INFO: renamed from: a */
    public static void m170332a(FeedPhotoPreviewView feedPhotoPreviewView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedPhotoPreviewView.f43556a = (FeedPhotoDraweeView) viewGroup.getChildAt(0);
        feedPhotoPreviewView.f43557b = (SubsamplingScaleImageView) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m170333b(FeedPhotoPreviewView feedPhotoPreviewView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142090P3, viewGroup, true);
        m170332a(feedPhotoPreviewView, viewInflate);
        return viewInflate;
    }
}
