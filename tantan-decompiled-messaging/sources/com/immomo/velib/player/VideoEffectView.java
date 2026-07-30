package com.immomo.velib.player;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.immomo.velib.anim.model.Location;
import com.immomo.velib.anim.model.VideoEffectModel;
import java.util.List;
import p149l.n7m;
import p149l.qek0;
import p149l.zal0;

/* JADX INFO: loaded from: classes7.dex */
public class VideoEffectView extends FrameLayout implements n7m {
    public static final int ALIGN_BOTTOM = 1;
    public static final int CENTER_CROP = 0;
    public static final int FIXED_SIZE = 2;
    private static final int STATE_ERROR = -1;
    private static final int STATE_IDLE = 0;
    private static final int STATE_PLAYBACK_COMPLETED = 5;
    private static final int STATE_PLAYING = 3;
    private static final int STATE_PREPARED = 2;
    private static final int STATE_PREPARING = 1;
    public static final int SURFACE_VIEW = 1;
    public static final int TEXTURE_VIEW = 2;
    private static final int sDefaultVideoHeight = 1280;
    private static final int sDefaultVideoWidth = 720;
    private boolean isLayout;
    private boolean isStartFuncCalled;
    private InterfaceC3988d.b mCompletionListener;
    private C3985a mConfig;
    private int mCurrentState;
    private InterfaceC3989e mEffectView;
    private C3986b mElementProxy;
    private InterfaceC3988d.c mErrorListener;
    private Location mGiftLocation;
    InterfaceC3988d mPlayer;
    private InterfaceC3988d.f mPositionChangedListener;
    private InterfaceC3988d.d mPreparedListener;
    private int mRenderHeight;
    private int mRenderMode;
    private int mRenderWidth;
    private int mScreenWidth;
    private int mSurfaceLayoutMode;
    private int mVideoHeight;
    private int mVideoWidth;
    private int mVisualHeight;
    private int mVisualWidth;

    /* JADX INFO: renamed from: com.immomo.velib.player.VideoEffectView$a */
    public class C3979a implements InterfaceC3988d.e {
        public C3979a() {
        }

        @Override // com.immomo.velib.player.InterfaceC3988d.e
        /* JADX INFO: renamed from: a */
        public void mo19526a(int i, int i2) {
            VideoEffectView.this.onPlayerVideoSizeChanged(i, i2);
        }
    }

    /* JADX INFO: renamed from: com.immomo.velib.player.VideoEffectView$b */
    public class C3980b implements InterfaceC3988d.b {
        public C3980b() {
        }

        @Override // com.immomo.velib.player.InterfaceC3988d.b
        public void onCompletion() {
            VideoEffectView.this.onPlayerCompletion();
        }
    }

    /* JADX INFO: renamed from: com.immomo.velib.player.VideoEffectView$c */
    public class C3981c implements InterfaceC3988d.c {
        public C3981c() {
        }

        @Override // com.immomo.velib.player.InterfaceC3988d.c
        public boolean onError(InterfaceC3988d interfaceC3988d, int i, String str) {
            return VideoEffectView.this.onPlayerError(interfaceC3988d, i, str);
        }
    }

    /* JADX INFO: renamed from: com.immomo.velib.player.VideoEffectView$d */
    public class C3982d implements InterfaceC3988d.f {
        public C3982d() {
        }

        @Override // com.immomo.velib.player.InterfaceC3988d.f
        public void renderPositionChanged(long j) {
            VideoEffectView.this.onPlayerRenderPositionChanged(j);
        }
    }

    /* JADX INFO: renamed from: com.immomo.velib.player.VideoEffectView$e */
    public class C3983e implements InterfaceC3988d.d {
        public C3983e() {
        }

        @Override // com.immomo.velib.player.InterfaceC3988d.d
        /* JADX INFO: renamed from: a */
        public void mo19527a() {
            VideoEffectView.this.mEffectView.mo19524d(VideoEffectView.this.mPlayer);
            VideoEffectView.this.mElementProxy.m19561g(VideoEffectView.this.mConfig, VideoEffectView.this);
        }
    }

    /* JADX INFO: renamed from: com.immomo.velib.player.VideoEffectView$f */
    public class C3984f implements InterfaceC3988d.a {
        public C3984f() {
        }

        @Override // com.immomo.velib.player.InterfaceC3988d.a
        /* JADX INFO: renamed from: a */
        public void mo19528a() {
            VideoEffectView.this.stop();
            if (VideoEffectView.this.mCompletionListener != null) {
                VideoEffectView.this.mCompletionListener.onCompletion();
            }
        }
    }

    public VideoEffectView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mCurrentState = 0;
        this.isStartFuncCalled = false;
        this.isLayout = false;
        this.mSurfaceLayoutMode = 0;
        init();
    }

    private void addStickerElement(List<zal0> list) {
        if (list != null) {
            for (zal0 zal0Var : list) {
                InterfaceC3988d interfaceC3988d = this.mPlayer;
                if (interfaceC3988d != null) {
                    interfaceC3988d.mo19579i(zal0Var);
                }
            }
        }
    }

    private void calculateRenderSize(C3985a c3985a) {
        int i = c3985a.f14162c;
        this.mRenderWidth = i;
        int i2 = c3985a.f14163d;
        this.mRenderHeight = i2;
        if (i == 0 || i2 == 0) {
            VideoEffectModel videoEffectModel = c3985a.f14164e;
            if (videoEffectModel == null || videoEffectModel.getLocation() == null) {
                VideoEffectModel videoEffectModel2 = c3985a.f14164e;
                this.mRenderWidth = (videoEffectModel2 == null || videoEffectModel2.getWidth() == 0) ? sDefaultVideoWidth : videoEffectModel2.getWidth();
                this.mRenderHeight = (videoEffectModel2 == null || videoEffectModel2.getHeight() == 0) ? 1280 : videoEffectModel2.getHeight();
            } else {
                Location location = c3985a.f14164e.getLocation();
                this.mRenderWidth = (int) (this.mScreenWidth * location.getWidth());
                this.mRenderHeight = (int) (this.mVisualWidth / (location.getWh() == 0.0f ? 1.0f : location.getWh()));
            }
        }
    }

    private View getEffectView() {
        return (View) this.mEffectView;
    }

    private void init() {
        setRenderMode(1);
        this.mScreenWidth = qek0.m174217c(getContext());
        this.mElementProxy = new C3986b();
        this.mCurrentState = 0;
    }

    private void layoutAlignBottom(int i, int i2, int i3, int i4) {
        if (this.mVideoWidth == 0 || this.mVideoHeight == 0) {
            this.mVideoWidth = sDefaultVideoWidth;
            this.mVideoHeight = 1280;
        }
        int i5 = i3 - i;
        float f = i5 / this.mVideoWidth;
        int i6 = this.mVideoHeight;
        getEffectView().layout(i, (int) (i2 + (((i6 * f) - i6) * 0.5f)), i5, i4 - i2);
    }

    private void layoutCenterCrop(int i, int i2, int i3, int i4) {
        float f;
        if (this.mVideoWidth == 0 || this.mVideoHeight == 0) {
            this.mVideoWidth = sDefaultVideoWidth;
            this.mVideoHeight = 1280;
        }
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int i7 = this.mVideoWidth;
        int i8 = i7 * i6;
        int i9 = this.mVideoHeight;
        float f2 = 0.0f;
        if (i8 > i5 * i9) {
            float f3 = (i5 - (i7 * (i6 / i9))) * 0.5f;
            f = 0.0f;
            f2 = f3;
        } else {
            f = (i6 - (i9 * (i5 / i7))) * 0.5f;
        }
        getEffectView().layout((int) f2, (int) f, (int) (i5 - f2), (int) (i6 - f));
    }

    private void layoutFixedSize(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        if (this.mVisualWidth == 0 || this.mVisualHeight == 0) {
            this.mVisualWidth = sDefaultVideoWidth;
            this.mVisualHeight = 1280;
        }
        int x = (int) (this.mGiftLocation.getX() * (i3 - i));
        int y = (int) (this.mGiftLocation.getY() * (i4 - i2));
        String anchor = this.mGiftLocation.getAnchor();
        int iHashCode = anchor.hashCode();
        if (iHashCode != -1364013995) {
            if (iHashCode != 3446) {
                if (iHashCode != 3464) {
                    if (iHashCode != 3632) {
                        if (iHashCode == 3650 && anchor.equals("rt")) {
                            i5 = i + x;
                            i7 = i5 - this.mVisualWidth;
                            i8 = i2 + y;
                            i9 = this.mVisualHeight;
                            i6 = i9 + i8;
                        }
                    } else if (anchor.equals("rb")) {
                        i5 = i + x;
                        i7 = i5 - this.mVisualWidth;
                        i6 = y + i2;
                        i8 = i6 - this.mVisualHeight;
                    }
                } else if (anchor.equals("lt")) {
                    i7 = x + i;
                    i8 = i2 + y;
                    i5 = this.mVisualWidth + i7;
                    i9 = this.mVisualHeight;
                    i6 = i9 + i8;
                }
            } else if (anchor.equals("lb")) {
                i7 = x + i;
                i6 = y + i2;
                i8 = i6 - this.mVisualHeight;
                i5 = this.mVisualWidth + i7;
            }
            getEffectView().layout(i7, i8, i5, i6);
        }
        anchor.equals("center");
        int i10 = i + x;
        int i11 = this.mVisualWidth;
        int i12 = i10 - (i11 / 2);
        int i13 = i2 + y;
        int i14 = this.mVisualHeight;
        int i15 = i13 - (i14 / 2);
        i5 = i10 + (i11 / 2);
        i6 = (i14 / 2) + i13;
        i7 = i12;
        i8 = i15;
        getEffectView().layout(i7, i8, i5, i6);
    }

    private void openVideo() {
        C3985a c3985a = this.mConfig;
        if (c3985a == null || c3985a.f14160a == null) {
            return;
        }
        C3987c c3987c = new C3987c(getContext());
        this.mPlayer = c3987c;
        c3987c.mo19583m(this.mConfig);
        this.mPlayer.mo19581k(this.mConfig.f14160a.toString(), this.mConfig.f14161b);
        calculateRenderSize(this.mConfig);
        this.mPlayer.mo19576f(this.mRenderWidth, this.mRenderHeight);
        this.mPlayer.mo19577g(new C3979a());
        this.mPlayer.mo19580j(new C3980b());
        this.mPlayer.mo19582l(new C3981c());
        this.mPlayer.mo19584n(new C3982d());
    }

    private void openVideoAsync() {
        openVideo();
        InterfaceC3988d interfaceC3988d = this.mPlayer;
        if (interfaceC3988d != null) {
            interfaceC3988d.mo19575e(new C3983e());
            this.mPlayer.prepareAsync();
        }
    }

    private void setEffectViewLayoutParams(Location location) {
        ViewGroup.LayoutParams layoutParams = getEffectView().getLayoutParams();
        if (location == null) {
            this.mVideoWidth = sDefaultVideoWidth;
            this.mVideoHeight = 1280;
            layoutParams.width = -1;
            layoutParams.height = -1;
        } else {
            int width = (int) (this.mScreenWidth * location.getWidth());
            this.mVisualWidth = width;
            int wh = (int) (width / (location.getWh() == 0.0f ? 1.0f : location.getWh()));
            this.mVisualHeight = wh;
            layoutParams.width = this.mVisualWidth;
            layoutParams.height = wh;
        }
        getEffectView().setLayoutParams(layoutParams);
    }

    public boolean isPlaying() {
        return this.mCurrentState == 3;
    }

    @Override // p149l.n7m
    public void onEffectElementComplete(List<zal0> list) {
        addStickerElement(list);
        this.mCurrentState = 2;
        if (this.isStartFuncCalled) {
            start();
            return;
        }
        InterfaceC3988d.d dVar = this.mPreparedListener;
        if (dVar != null) {
            dVar.mo19527a();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (z || !this.isLayout) {
            int i5 = this.mSurfaceLayoutMode;
            if (i5 == 1) {
                layoutAlignBottom(i, i2, i3, i4);
            } else if (i5 != 2 || this.mGiftLocation == null) {
                layoutCenterCrop(i, i2, i3, i4);
            } else {
                layoutFixedSize(i, i2, i3, i4);
            }
            this.isLayout = true;
        }
    }

    public void onPlayerCompletion() {
        this.mCurrentState = 5;
        stop();
        InterfaceC3988d.b bVar = this.mCompletionListener;
        if (bVar != null) {
            bVar.onCompletion();
        }
    }

    public boolean onPlayerError(InterfaceC3988d interfaceC3988d, int i, String str) {
        this.mCurrentState = -1;
        stop();
        InterfaceC3988d.c cVar = this.mErrorListener;
        if (cVar == null) {
            return true;
        }
        cVar.onError(interfaceC3988d, i, str);
        return true;
    }

    public void onPlayerRenderPositionChanged(long j) {
        InterfaceC3988d.f fVar = this.mPositionChangedListener;
        if (fVar != null) {
            fVar.renderPositionChanged(j);
        }
    }

    public void onPlayerVideoSizeChanged(int i, int i2) {
        int i3;
        int i4 = this.mVideoWidth;
        if (i4 == 0 || (i3 = this.mVideoHeight) == 0 || i3 != i2 || i4 != i) {
            this.mVideoWidth = i;
            this.mVideoHeight = i2;
            this.isLayout = false;
            requestLayout();
        }
        int i5 = this.mRenderWidth;
        int i6 = this.mRenderHeight;
        if (i5 == 0 || i6 == 0) {
            i5 = this.mVideoWidth;
            i6 = this.mVideoHeight;
        }
        if (i5 <= 0 || i6 <= 0) {
            return;
        }
        this.mEffectView.mo19521a(i5, i6);
    }

    public synchronized void prepare() {
        prepareAsync();
    }

    public synchronized void prepareAsync() {
        if (this.mConfig != null && this.mCurrentState == 0) {
            this.mCurrentState = 1;
            openVideoAsync();
        }
    }

    public void setCompletionListener(InterfaceC3988d.b bVar) {
        this.mCompletionListener = bVar;
    }

    public void setEffectConfig(C3985a c3985a) {
        VideoEffectModel videoEffectModel = c3985a.f14164e;
        if (videoEffectModel != null) {
            if (videoEffectModel.getLocation() != null) {
                setSurfaceLayoutMode(2, videoEffectModel.getLocation());
            } else {
                setSurfaceLayoutMode(0, videoEffectModel.getLocation());
            }
        }
        this.mConfig = c3985a;
    }

    public void setOnErrorListener(InterfaceC3988d.c cVar) {
        this.mErrorListener = cVar;
    }

    public void setOnPreparedListener(InterfaceC3988d.d dVar) {
        this.mPreparedListener = dVar;
    }

    public void setPositionChangedListener(InterfaceC3988d.f fVar) {
        this.mPositionChangedListener = fVar;
    }

    public void setRenderMode(int i) {
        if (this.mRenderMode != i) {
            removeAllViews();
            if (i == 2) {
                this.mEffectView = new EffectTextureView(getContext());
            } else {
                this.mEffectView = new EffectSurfaceView(getContext());
            }
            this.mEffectView.setOnBackgroundListener(new C3984f());
            addView((View) this.mEffectView);
        }
        this.mRenderMode = i;
    }

    public void setSurfaceLayoutMode(int i, Location location) {
        if (this.mSurfaceLayoutMode != i) {
            this.mSurfaceLayoutMode = i;
            this.mGiftLocation = location;
            this.isLayout = false;
            setEffectViewLayoutParams(location);
            return;
        }
        Location location2 = this.mGiftLocation;
        if (location2 == null || location2.equals(location)) {
            return;
        }
        this.mGiftLocation = location;
        this.isLayout = false;
        setEffectViewLayoutParams(location);
    }

    public void start() {
        if (this.mPlayer != null && this.mCurrentState == 2) {
            this.mEffectView.mo19522b();
            this.mCurrentState = 3;
        }
        this.isStartFuncCalled = true;
    }

    public synchronized void stop() {
        try {
            InterfaceC3988d interfaceC3988d = this.mPlayer;
            if (interfaceC3988d != null) {
                interfaceC3988d.mo19573c();
                this.mPlayer.mo19582l(null);
                this.mPlayer.mo19577g(null);
                this.mPlayer.mo19580j(null);
                this.mPlayer.mo19584n(null);
                this.mPlayer.mo19575e(null);
                this.mCurrentState = 0;
                this.isStartFuncCalled = false;
            }
            this.mEffectView.mo19523c();
            this.mPlayer = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public VideoEffectView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VideoEffectView(@NonNull Context context) {
        this(context, null);
    }

    @RequiresApi(api = 21)
    public VideoEffectView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mCurrentState = 0;
        this.isStartFuncCalled = false;
        this.isLayout = false;
        this.mSurfaceLayoutMode = 0;
        init();
    }
}
