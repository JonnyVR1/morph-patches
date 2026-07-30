package com.p051p1.mobile.putong.feed.newui.mediapicker.post.bottom;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.fragment.app.AbstractC0428k;
import androidx.fragment.app.FragmentManager;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.feed.newui.mediapicker.NewPostAlbumFrag;
import com.p051p1.mobile.putong.feed.newui.mediapicker.post.C11408a;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p151v.VFrame;
import p153l.hdc0;

/* JADX INFO: loaded from: classes13.dex */
public class FeedPostBottomAlbumView extends VFrame {

    /* JADX INFO: renamed from: b */
    public static String f41587b = "MediaPickerFrag";

    /* JADX INFO: renamed from: a */
    public NewPostAlbumFrag f41588a;

    public FeedPostBottomAlbumView(Context context) {
        super(context);
    }

    public int getMaxCount() {
        return this.f41588a.f41338P;
    }

    public String getSelectedFolderPath() {
        return NullChecker.m82486a(this.f41588a.f54861z.selectedFolder) ? this.f41588a.f54861z.selectedFolder.f96162b : "";
    }

    public ArrayList<Media> getSelectedImages() {
        return this.f41588a.f54861z.selectedImageMedias;
    }

    public Media getSelectedVideo() {
        return this.f41588a.f54861z.getSelectedVideo();
    }

    /* JADX INFO: renamed from: p */
    public void m64119p(Act act, C11408a c11408a) {
        FragmentManager supportFragmentManager = act.getSupportFragmentManager();
        if (supportFragmentManager.m2558i0(f41587b) != null) {
            NewPostAlbumFrag newPostAlbumFrag = (NewPostAlbumFrag) supportFragmentManager.m2558i0(f41587b);
            this.f41588a = newPostAlbumFrag;
            newPostAlbumFrag.m63725a6(c11408a.f41509d);
        } else {
            this.f41588a = new NewPostAlbumFrag();
            AbstractC0428k abstractC0428kM2568m = supportFragmentManager.m2568m();
            abstractC0428kM2568m.m2805c(hdc0.f108898b, this.f41588a, f41587b);
            abstractC0428kM2568m.mo2709j();
            this.f41588a.m63725a6(c11408a.f41509d);
        }
    }

    /* JADX INFO: renamed from: s */
    public boolean m64120s() {
        return this.f41588a == null;
    }

    public void setSelectedImages(ArrayList<Media> arrayList) {
        this.f41588a.f54861z.clearAllSelectedMedia();
        this.f41588a.f54861z.addAllSelectedMedia(arrayList);
    }

    /* JADX INFO: renamed from: u */
    public void m64121u(boolean z) {
        this.f41588a.m63718V5(z);
    }

    /* JADX INFO: renamed from: v */
    public void m64122v(ArrayList<Media> arrayList) {
        if (NullChecker.m82486a(this.f41588a)) {
            for (int i = 0; i < arrayList.size(); i++) {
                boolean zIsEmpty = TextUtils.isEmpty(arrayList.get(i).originUrl);
                NewPostAlbumFrag newPostAlbumFrag = this.f41588a;
                if (zIsEmpty) {
                    newPostAlbumFrag.f54853A.put(arrayList.get(i).url, Integer.valueOf(i));
                } else {
                    newPostAlbumFrag.f54853A.put(arrayList.get(i).originUrl, Integer.valueOf(i));
                }
            }
            if (arrayList.size() > 0) {
                Media media = arrayList.get(0);
                if (media instanceof Video) {
                    if (!TextUtils.isEmpty(((Video) arrayList.get(0)).originUrl)) {
                        this.f41588a.f54861z.clearSelectedVideo();
                        this.f41588a.f54861z.addSelectedVideo(arrayList.get(0));
                    }
                } else if (media instanceof Picture) {
                    this.f41588a.f54861z.clearAllSelectedMedia();
                    this.f41588a.f54861z.addAllSelectedMedia(arrayList);
                }
            }
            this.f41588a.m63716U5();
        }
    }

    /* JADX INFO: renamed from: w */
    public void m64123w(String str) {
        if (NullChecker.m82486a(this.f41588a)) {
            this.f41588a.m63727c6(str);
        }
    }

    public FeedPostBottomAlbumView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedPostBottomAlbumView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
