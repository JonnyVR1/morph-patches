package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.feed.newui.preview.gesture.FeedPhotoDraweeView;
import com.p000p1.mobile.putong.feed.p005ui.FeedPhotoPreviewView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class pmh {
    /* JADX INFO: renamed from: a */
    public static void m13076a(FeedPhotoPreviewView feedPhotoPreviewView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedPhotoPreviewView.f5017a = (FeedPhotoDraweeView) viewGroup.getChildAt(0);
        feedPhotoPreviewView.f5018b = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m13077b(FeedPhotoPreviewView feedPhotoPreviewView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11109P3, viewGroup, true);
        m13076a(feedPhotoPreviewView, viewInflate);
        return viewInflate;
    }
}
