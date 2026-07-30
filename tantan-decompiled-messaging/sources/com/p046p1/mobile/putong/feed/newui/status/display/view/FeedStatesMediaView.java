package com.p046p1.mobile.putong.feed.newui.status.display.view;

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
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPlayerView;
import com.p046p1.mobile.putong.feed.newui.status.display.view.FeedStatesMediaView;
import com.tantanapp.common.utils.NullChecker;
import p149l.c680;
import p149l.e30;
import p149l.ebl0;
import p149l.s680;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedStatesMediaView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public boolean f42920a;

    /* JADX INFO: renamed from: b */
    public e30<View> f42921b;

    /* JADX INFO: renamed from: c */
    public boolean f42922c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.display.view.FeedStatesMediaView$a */
    public class C11346a extends c680.C16085c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ PhotoAlbumPlayerView f42923a;

        public C11346a(PhotoAlbumPlayerView photoAlbumPlayerView) {
            this.f42923a = photoAlbumPlayerView;
        }

        @Override // p149l.c680.C16085c, p149l.c680.InterfaceC16084b
        public void onStart() {
            super.onStart();
            this.f42923a.m65416D(true);
        }
    }

    public FeedStatesMediaView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ boolean m65751b(View view, MotionEvent motionEvent) {
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m65752c(Picture picture) {
        PhotoAlbumPlayerView childPlayerView = getChildPlayerView();
        if (NullChecker.m81303a(childPlayerView)) {
            childPlayerView.m65422J();
            childPlayerView.m65420H();
            childPlayerView.setVisibility(8);
        }
        SimpleDraweeView childVDraweeView = getChildVDraweeView();
        if (childVDraweeView == null) {
            childVDraweeView = new SimpleDraweeView(getContext());
            childVDraweeView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            addView(childVDraweeView, getChildCount() - 1);
        }
        xdl0.m208345M0(childVDraweeView, true);
        childVDraweeView.setImageURI(picture.url);
        if (NullChecker.m81303a(this.f42921b)) {
            this.f42921b.call(childVDraweeView);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: d */
    public final void m65753d(Video video) {
        int i;
        int i2;
        SimpleDraweeView childVDraweeView = getChildVDraweeView();
        if (NullChecker.m81303a(childVDraweeView)) {
            childVDraweeView.setVisibility(8);
        }
        setBackgroundColor(0);
        PhotoAlbumPlayerView childPlayerView = getChildPlayerView();
        if (childPlayerView == null) {
            childPlayerView = new PhotoAlbumPlayerView(getContext());
            addView(childPlayerView, getChildCount() - 1);
        }
        xdl0.m208345M0(childPlayerView, true);
        if (this.f42922c) {
            com.p046p1.mobile.putong.feed.newui.camera.momosdk.Video video2 = new com.p046p1.mobile.putong.feed.newui.camera.momosdk.Video(video.url);
            ebl0.m115505a(video2);
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
        childPlayerView.f42664a.setLayoutParams(new RelativeLayout.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams));
        childPlayerView.m65422J();
        childPlayerView.m65420H();
        childPlayerView.f42671h.setVisibility(8);
        childPlayerView.m65421I(video, false);
        childPlayerView.setLoopMode(true);
        childPlayerView.setOnTouchListener(new View.OnTouchListener() { // from class: l.i2i
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return FeedStatesMediaView.m65751b(view, motionEvent);
            }
        });
        childPlayerView.setPlayer(new s680());
        if (this.f42920a) {
            childPlayerView.m65418F();
        }
        childPlayerView.m65424r(new C11346a(childPlayerView));
        if (NullChecker.m81303a(this.f42921b)) {
            this.f42921b.call(childPlayerView);
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m65754e(Media media) {
        if (media instanceof Video) {
            m65753d((Video) media);
        } else {
            m65752c((Picture) media);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m65755f(final Media media, boolean z) {
        this.f42922c = z;
        post(new Runnable() { // from class: l.h2i
            @Override // java.lang.Runnable
            public final void run() {
                this.f105533a.m65754e(media);
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
        this.f42920a = z;
    }

    public void setSuccessAttachCallback(e30<View> e30Var) {
        this.f42921b = e30Var;
    }

    public FeedStatesMediaView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedStatesMediaView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
