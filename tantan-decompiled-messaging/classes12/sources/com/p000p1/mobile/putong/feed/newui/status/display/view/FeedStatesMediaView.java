package com.p000p1.mobile.putong.feed.newui.status.display.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p000p1.mobile.putong.data.Dimension;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.Picture;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPlayerView;
import com.p000p1.mobile.putong.feed.newui.status.display.view.FeedStatesMediaView;
import com.tantanapp.common.utils.NullChecker;
import l.c680;
import l.e30;
import l.s680;
import l.xdl0;
import p007l.ebl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedStatesMediaView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public boolean f4381a;

    /* JADX INFO: renamed from: b */
    public e30<View> f4382b;

    /* JADX INFO: renamed from: c */
    public boolean f4383c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.display.view.FeedStatesMediaView$a */
    public class C2190a extends c680.c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ PhotoAlbumPlayerView f4384a;

        public C2190a(PhotoAlbumPlayerView photoAlbumPlayerView) {
            this.f4384a = photoAlbumPlayerView;
        }

        public void onStart() {
            super.onStart();
            this.f4384a.m6535D(true);
        }
    }

    public FeedStatesMediaView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ boolean m6897b(View view, MotionEvent motionEvent) {
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m6898c(Picture picture) {
        PhotoAlbumPlayerView childPlayerView = getChildPlayerView();
        if (NullChecker.a(childPlayerView)) {
            childPlayerView.m6541J();
            childPlayerView.m6539H();
            childPlayerView.setVisibility(8);
        }
        SimpleDraweeView childVDraweeView = getChildVDraweeView();
        if (childVDraweeView == null) {
            childVDraweeView = new SimpleDraweeView(getContext());
            childVDraweeView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            addView((View) childVDraweeView, getChildCount() - 1);
        }
        xdl0.M0(childVDraweeView, true);
        childVDraweeView.setImageURI(picture.url);
        if (NullChecker.a(this.f4382b)) {
            this.f4382b.call(childVDraweeView);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: d */
    public final void m6899d(Video video) {
        int i;
        int i2;
        SimpleDraweeView childVDraweeView = getChildVDraweeView();
        if (NullChecker.a(childVDraweeView)) {
            childVDraweeView.setVisibility(8);
        }
        setBackgroundColor(0);
        PhotoAlbumPlayerView childPlayerView = getChildPlayerView();
        if (childPlayerView == null) {
            childPlayerView = new PhotoAlbumPlayerView(getContext());
            addView(childPlayerView, getChildCount() - 1);
        }
        xdl0.M0(childPlayerView, true);
        if (this.f4383c) {
            com.p000p1.mobile.putong.feed.newui.camera.momosdk.Video video2 = new com.p000p1.mobile.putong.feed.newui.camera.momosdk.Video(video.url);
            ebl0.m9701a(video2);
            i = video2.width;
            i2 = video2.height;
        } else {
            Dimension dimension = video.size;
            i = dimension.width;
            i2 = dimension.height;
        }
        int measuredWidth = getMeasuredWidth();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(measuredWidth, (int) (i2 * (measuredWidth / i)));
        layoutParams.gravity = 17;
        childPlayerView.setLayoutParams(layoutParams);
        childPlayerView.f4125a.setLayoutParams(new RelativeLayout.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams));
        childPlayerView.m6541J();
        childPlayerView.m6539H();
        childPlayerView.f4132h.setVisibility(8);
        childPlayerView.m6540I(video, false);
        childPlayerView.setLoopMode(true);
        childPlayerView.setOnTouchListener(new View.OnTouchListener() { // from class: l.i2i
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return FeedStatesMediaView.m6897b(view, motionEvent);
            }
        });
        childPlayerView.setPlayer(new s680());
        if (this.f4381a) {
            childPlayerView.m6537F();
        }
        childPlayerView.m6543r(new C2190a(childPlayerView));
        if (NullChecker.a(this.f4382b)) {
            this.f4382b.call(childPlayerView);
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m6900e(Media media) {
        if (media instanceof Video) {
            m6899d((Video) media);
        } else {
            m6898c((Picture) media);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m6901f(final Media media, boolean z) {
        this.f4383c = z;
        post(new Runnable() { // from class: l.h2i
            @Override // java.lang.Runnable
            public final void run() {
                this.f8566a.m6900e(media);
            }
        });
    }

    public PhotoAlbumPlayerView getChildPlayerView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof PhotoAlbumPlayerView) {
                return (PhotoAlbumPlayerView) childAt;
            }
        }
        return null;
    }

    public SimpleDraweeView getChildVDraweeView() {
        for (int i = 0; i < getChildCount(); i++) {
            SimpleDraweeView childAt = getChildAt(i);
            if (childAt instanceof SimpleDraweeView) {
                return childAt;
            }
        }
        return null;
    }

    public void setAutoPlay(boolean z) {
        this.f4381a = z;
    }

    public void setSuccessAttachCallback(e30<View> e30Var) {
        this.f4382b = e30Var;
    }

    public FeedStatesMediaView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedStatesMediaView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
