package com.p051p1.mobile.putong.feed.newui.status.display.view;

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
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPlayerView;
import com.p051p1.mobile.putong.feed.newui.status.display.view.FeedStatesMediaView;
import com.tantanapp.common.utils.NullChecker;
import p153l.bnl0;
import p153l.ie80;
import p153l.ikl0;
import p153l.y20;
import p153l.ye80;

/* JADX INFO: loaded from: classes13.dex */
public class FeedStatesMediaView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public boolean f43768a;

    /* JADX INFO: renamed from: b */
    public y20<View> f43769b;

    /* JADX INFO: renamed from: c */
    public boolean f43770c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.display.view.FeedStatesMediaView$a */
    public class C11509a extends ie80.C17711c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ PhotoAlbumPlayerView f43771a;

        public C11509a(PhotoAlbumPlayerView photoAlbumPlayerView) {
            this.f43771a = photoAlbumPlayerView;
        }

        @Override // p153l.ie80.C17711c, p153l.ie80.InterfaceC17710b
        public void onStart() {
            super.onStart();
            this.f43771a.m66599D(true);
        }
    }

    public FeedStatesMediaView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ boolean m66934b(View view, MotionEvent motionEvent) {
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m66935c(Picture picture) {
        PhotoAlbumPlayerView childPlayerView = getChildPlayerView();
        if (NullChecker.m82486a(childPlayerView)) {
            childPlayerView.m66605J();
            childPlayerView.m66603H();
            childPlayerView.setVisibility(8);
        }
        SimpleDraweeView childVDraweeView = getChildVDraweeView();
        if (childVDraweeView == null) {
            childVDraweeView = new SimpleDraweeView(getContext());
            childVDraweeView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            addView(childVDraweeView, getChildCount() - 1);
        }
        bnl0.m105525M0(childVDraweeView, true);
        childVDraweeView.setImageURI(picture.url);
        if (NullChecker.m82486a(this.f43769b)) {
            this.f43769b.call(childVDraweeView);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: d */
    public final void m66936d(Video video) {
        int i;
        int i2;
        SimpleDraweeView childVDraweeView = getChildVDraweeView();
        if (NullChecker.m82486a(childVDraweeView)) {
            childVDraweeView.setVisibility(8);
        }
        setBackgroundColor(0);
        PhotoAlbumPlayerView childPlayerView = getChildPlayerView();
        if (childPlayerView == null) {
            childPlayerView = new PhotoAlbumPlayerView(getContext());
            addView(childPlayerView, getChildCount() - 1);
        }
        bnl0.m105525M0(childPlayerView, true);
        if (this.f43770c) {
            com.p051p1.mobile.putong.feed.newui.camera.momosdk.Video video2 = new com.p051p1.mobile.putong.feed.newui.camera.momosdk.Video(video.url);
            ikl0.m140409a(video2);
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
        childPlayerView.f43512a.setLayoutParams(new RelativeLayout.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams));
        childPlayerView.m66605J();
        childPlayerView.m66603H();
        childPlayerView.f43519h.setVisibility(8);
        childPlayerView.m66604I(video, false);
        childPlayerView.setLoopMode(true);
        childPlayerView.setOnTouchListener(new View.OnTouchListener() { // from class: l.x3i
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return FeedStatesMediaView.m66934b(view, motionEvent);
            }
        });
        childPlayerView.setPlayer(new ye80());
        if (this.f43768a) {
            childPlayerView.m66601F();
        }
        childPlayerView.m66607r(new C11509a(childPlayerView));
        if (NullChecker.m82486a(this.f43769b)) {
            this.f43769b.call(childPlayerView);
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m66937e(Media media) {
        if (media instanceof Video) {
            m66936d((Video) media);
        } else {
            m66935c((Picture) media);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m66938f(final Media media, boolean z) {
        this.f43770c = z;
        post(new Runnable() { // from class: l.w3i
            @Override // java.lang.Runnable
            public final void run() {
                this.f187141a.m66937e(media);
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
            View childAt = getChildAt(i);
            if (childAt instanceof SimpleDraweeView) {
                return (SimpleDraweeView) childAt;
            }
        }
        return null;
    }

    public void setAutoPlay(boolean z) {
        this.f43768a = z;
    }

    public void setSuccessAttachCallback(y20<View> y20Var) {
        this.f43769b = y20Var;
    }

    public FeedStatesMediaView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedStatesMediaView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
