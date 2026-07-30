package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.feed.newui.preview.gesture.FeedPhotoDraweeView;
import com.p051p1.mobile.putong.feed.p065ui.FeedPhotoPreviewView;
import p151v.fresco.subscaleview.SubsamplingScaleImageView;

/* JADX INFO: loaded from: classes13.dex */
public class eoh {
    /* JADX INFO: renamed from: a */
    public static void m121748a(FeedPhotoPreviewView feedPhotoPreviewView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedPhotoPreviewView.f44404a = (FeedPhotoDraweeView) viewGroup.getChildAt(0);
        feedPhotoPreviewView.f44405b = (SubsamplingScaleImageView) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m121749b(FeedPhotoPreviewView feedPhotoPreviewView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173559P3, viewGroup, true);
        m121748a(feedPhotoPreviewView, viewInflate);
        return viewInflate;
    }
}
