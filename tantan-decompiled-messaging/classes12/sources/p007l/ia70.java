package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.feed.newui.preview.gesture.FeedPhotoDraweeView;
import com.p000p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPhotoPreviewView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ia70 {
    /* JADX INFO: renamed from: a */
    public static void m10846a(PhotoAlbumPhotoPreviewView photoAlbumPhotoPreviewView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        photoAlbumPhotoPreviewView.f4117a = (FeedPhotoDraweeView) viewGroup.getChildAt(0);
        photoAlbumPhotoPreviewView.f4118b = viewGroup.getChildAt(1);
        photoAlbumPhotoPreviewView.f4119c = viewGroup.getChildAt(2);
        photoAlbumPhotoPreviewView.f4120d = viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m10847b(PhotoAlbumPhotoPreviewView photoAlbumPhotoPreviewView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11223h2, viewGroup, true);
        m10846a(photoAlbumPhotoPreviewView, viewInflate);
        return viewInflate;
    }
}
