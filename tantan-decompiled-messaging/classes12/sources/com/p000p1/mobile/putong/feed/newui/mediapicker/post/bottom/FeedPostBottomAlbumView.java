package com.p000p1.mobile.putong.feed.newui.mediapicker.post.bottom;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.Picture;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.feed.newui.mediapicker.NewPostAlbumFrag;
import com.p000p1.mobile.putong.feed.newui.mediapicker.post.C2089a;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerBaseFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p007l.b5c0;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedPostBottomAlbumView extends VFrame {

    /* JADX INFO: renamed from: b */
    public static String f2200b = "MediaPickerFrag";

    /* JADX INFO: renamed from: a */
    public NewPostAlbumFrag f2201a;

    public FeedPostBottomAlbumView(Context context) {
        super(context);
    }

    public int getMaxCount() {
        return this.f2201a.f1951P;
    }

    public String getSelectedFolderPath() {
        return NullChecker.a(((MediaPickerBaseFrag) this.f2201a).z.selectedFolder) ? ((MediaPickerBaseFrag) this.f2201a).z.selectedFolder.b : "";
    }

    public ArrayList<Media> getSelectedImages() {
        return ((MediaPickerBaseFrag) this.f2201a).z.selectedImageMedias;
    }

    public Media getSelectedVideo() {
        return ((MediaPickerBaseFrag) this.f2201a).z.getSelectedVideo();
    }

    /* JADX INFO: renamed from: p */
    public void m3949p(Act act, C2089a c2089a) {
        FragmentManager supportFragmentManager = act.getSupportFragmentManager();
        if (supportFragmentManager.i0(f2200b) != null) {
            NewPostAlbumFrag newPostAlbumFragI0 = supportFragmentManager.i0(f2200b);
            this.f2201a = newPostAlbumFragI0;
            newPostAlbumFragI0.m3544a6(c2089a.f2122d);
        } else {
            this.f2201a = new NewPostAlbumFrag();
            k kVarM = supportFragmentManager.m();
            kVarM.c(b5c0.f6026b, this.f2201a, f2200b);
            kVarM.j();
            this.f2201a.m3544a6(c2089a.f2122d);
        }
    }

    /* JADX INFO: renamed from: s */
    public boolean m3950s() {
        return this.f2201a == null;
    }

    public void setSelectedImages(ArrayList<Media> arrayList) {
        ((MediaPickerBaseFrag) this.f2201a).z.clearAllSelectedMedia();
        ((MediaPickerBaseFrag) this.f2201a).z.addAllSelectedMedia(arrayList);
    }

    /* JADX INFO: renamed from: u */
    public void m3951u(boolean z) {
        this.f2201a.m3537V5(z);
    }

    /* JADX INFO: renamed from: v */
    public void m3952v(ArrayList<Media> arrayList) {
        if (NullChecker.a(this.f2201a)) {
            for (int i = 0; i < arrayList.size(); i++) {
                boolean zIsEmpty = TextUtils.isEmpty(arrayList.get(i).originUrl);
                NewPostAlbumFrag newPostAlbumFrag = this.f2201a;
                if (zIsEmpty) {
                    ((MediaPickerBaseFrag) newPostAlbumFrag).A.put(arrayList.get(i).url, Integer.valueOf(i));
                } else {
                    ((MediaPickerBaseFrag) newPostAlbumFrag).A.put(arrayList.get(i).originUrl, Integer.valueOf(i));
                }
            }
            if (arrayList.size() > 0) {
                Media media = arrayList.get(0);
                if (media instanceof Video) {
                    if (!TextUtils.isEmpty(((Video) arrayList.get(0)).originUrl)) {
                        ((MediaPickerBaseFrag) this.f2201a).z.clearSelectedVideo();
                        ((MediaPickerBaseFrag) this.f2201a).z.addSelectedVideo(arrayList.get(0));
                    }
                } else if (media instanceof Picture) {
                    ((MediaPickerBaseFrag) this.f2201a).z.clearAllSelectedMedia();
                    ((MediaPickerBaseFrag) this.f2201a).z.addAllSelectedMedia(arrayList);
                }
            }
            this.f2201a.m3535U5();
        }
    }

    /* JADX INFO: renamed from: w */
    public void m3953w(String str) {
        if (NullChecker.a(this.f2201a)) {
            this.f2201a.m3546c6(str);
        }
    }

    public FeedPostBottomAlbumView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedPostBottomAlbumView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
