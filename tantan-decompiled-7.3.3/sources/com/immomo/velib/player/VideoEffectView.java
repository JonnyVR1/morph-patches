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
import p153l.dam;
import p153l.dkl0;
import p153l.wnk0;

/* JADX INFO: loaded from: classes7.dex */
public class VideoEffectView extends FrameLayout implements dam {
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
    private InterfaceC4139d.b mCompletionListener;
    private C4136a mConfig;
    private int mCurrentState;
    private InterfaceC4140e mEffectView;
    private C4137b mElementProxy;
    private InterfaceC4139d.c mErrorListener;
    private Location mGiftLocation;
    InterfaceC4139d mPlayer;
    private InterfaceC4139d.f mPositionChangedListener;
    private InterfaceC4139d.d mPreparedListener;
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
    public class C4130a implements InterfaceC4139d.e {
        public C4130a() {
        }

        @Override // com.immomo.velib.player.InterfaceC4139d.e
        /* JADX INFO: renamed from: a */
        public void mo20525a(int i, int i2) {
            VideoEffectView.this.onPlayerVideoSizeChanged(i, i2);
        }
    }

    /* JADX INFO: renamed from: com.immomo.velib.player.VideoEffectView$b */
    public class C4131b implements InterfaceC4139d.b {
        public C4131b() {
        }

        @Override // com.immomo.velib.player.InterfaceC4139d.b
        public void onCompletion() {
            VideoEffectView.this.onPlayerCompletion();
        }
    }

    /* JADX INFO: renamed from: com.immomo.velib.player.VideoEffectView$c */
    public class C4132c implements InterfaceC4139d.c {
        public C4132c() {
        }

        @Override // com.immomo.velib.player.InterfaceC4139d.c
        public boolean onError(InterfaceC4139d interfaceC4139d, int i, String str) {
            return VideoEffectView.this.onPlayerError(interfaceC4139d, i, str);
        }
    }

    /* JADX INFO: renamed from: com.immomo.velib.player.VideoEffectView$d */
    public class C4133d implements InterfaceC4139d.f {
        public C4133d() {
        }

        @Override // com.immomo.velib.player.InterfaceC4139d.f
        public void renderPositionChanged(long j) {
            VideoEffectView.this.onPlayerRenderPositionChanged(j);
        }
    }

    /* JADX INFO: renamed from: com.immomo.velib.player.VideoEffectView$e */
    public class C4134e implements InterfaceC4139d.d {
        public C4134e() {
        }

        @Override // com.immomo.velib.player.InterfaceC4139d.d
        /* JADX INFO: renamed from: a */
        public void mo20526a() {
            VideoEffectView.this.mEffectView.mo20523d(VideoEffectView.this.mPlayer);
            VideoEffectView.this.mElementProxy.m20560g(VideoEffectView.this.mConfig, VideoEffectView.this);
        }
    }

    /* JADX INFO: renamed from: com.immomo.velib.player.VideoEffectView$f */
    public class C4135f implements InterfaceC4139d.a {
        public C4135f() {
        }

        @Override // com.immomo.velib.player.InterfaceC4139d.a
        /* JADX INFO: renamed from: a */
        public void mo20527a() {
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

    private void addStickerElement(List<dkl0> list) {
        if (list != null) {
            for (dkl0 dkl0Var : list) {
                InterfaceC4139d interfaceC4139d = this.mPlayer;
                if (interfaceC4139d != null) {
                    interfaceC4139d.mo20578i(dkl0Var);
                }
            }
        }
    }

    private void calculateRenderSize(C4136a c4136a) {
        int i = c4136a.f14881c;
        this.mRenderWidth = i;
        int i2 = c4136a.f14882d;
        this.mRenderHeight = i2;
        if (i == 0 || i2 == 0) {
            VideoEffectModel videoEffectModel = c4136a.f14883e;
            if (videoEffectModel == null || videoEffectModel.getLocation() == null) {
                VideoEffectModel videoEffectModel2 = c4136a.f14883e;
                this.mRenderWidth = (videoEffectModel2 == null || videoEffectModel2.getWidth() == 0) ? sDefaultVideoWidth : videoEffectModel2.getWidth();
                this.mRenderHeight = (videoEffectModel2 == null || videoEffectModel2.getHeight() == 0) ? 1280 : videoEffectModel2.getHeight();
            } else {
                Location location = c4136a.f14883e.getLocation();
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
        this.mScreenWidth = wnk0.m207215c(getContext());
        this.mElementProxy = new C4137b();
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
        C4136a c4136a = this.mConfig;
        if (c4136a == null || c4136a.f14879a == null) {
            return;
        }
        C4138c c4138c = new C4138c(getContext());
        this.mPlayer = c4138c;
        c4138c.mo20582m(this.mConfig);
        this.mPlayer.mo20580k(this.mConfig.f14879a.toString(), this.mConfig.f14880b);
        calculateRenderSize(this.mConfig);
        this.mPlayer.mo20575f(this.mRenderWidth, this.mRenderHeight);
        this.mPlayer.mo20576g(new C4130a());
        this.mPlayer.mo20579j(new C4131b());
        this.mPlayer.mo20581l(new C4132c());
        this.mPlayer.mo20583n(new C4133d());
    }

    private void openVideoAsync() {
        openVideo();
        InterfaceC4139d interfaceC4139d = this.mPlayer;
        if (interfaceC4139d != null) {
            interfaceC4139d.mo20574e(new C4134e());
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

    @Override // p153l.dam
    public void onEffectElementComplete(List<dkl0> list) {
        addStickerElement(list);
        this.mCurrentState = 2;
        if (this.isStartFuncCalled) {
            start();
            return;
        }
        InterfaceC4139d.d dVar = this.mPreparedListener;
        if (dVar != null) {
            dVar.mo20526a();
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
        InterfaceC4139d.b bVar = this.mCompletionListener;
        if (bVar != null) {
            bVar.onCompletion();
        }
    }

    public boolean onPlayerError(InterfaceC4139d interfaceC4139d, int i, String str) {
        this.mCurrentState = -1;
        stop();
        InterfaceC4139d.c cVar = this.mErrorListener;
        if (cVar == null) {
            return true;
        }
        cVar.onError(interfaceC4139d, i, str);
        return true;
    }

    public void onPlayerRenderPositionChanged(long j) {
        InterfaceC4139d.f fVar = this.mPositionChangedListener;
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
        this.mEffectView.mo20520a(i5, i6);
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

    public void setCompletionListener(InterfaceC4139d.b bVar) {
        this.mCompletionListener = bVar;
    }

    public void setEffectConfig(C4136a c4136a) {
        VideoEffectModel videoEffectModel = c4136a.f14883e;
        if (videoEffectModel != null) {
            if (videoEffectModel.getLocation() != null) {
                setSurfaceLayoutMode(2, videoEffectModel.getLocation());
            } else {
                setSurfaceLayoutMode(0, videoEffectModel.getLocation());
            }
        }
        this.mConfig = c4136a;
    }

    public void setOnErrorListener(InterfaceC4139d.c cVar) {
        this.mErrorListener = cVar;
    }

    public void setOnPreparedListener(InterfaceC4139d.d dVar) {
        this.mPreparedListener = dVar;
    }

    public void setPositionChangedListener(InterfaceC4139d.f fVar) {
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
            this.mEffectView.setOnBackgroundListener(new C4135f());
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
            this.mEffectView.mo20521b();
            this.mCurrentState = 3;
        }
        this.isStartFuncCalled = true;
    }

    public synchronized void stop() {
        try {
            InterfaceC4139d interfaceC4139d = this.mPlayer;
            if (interfaceC4139d != null) {
                interfaceC4139d.mo20572c();
                this.mPlayer.mo20581l(null);
                this.mPlayer.mo20576g(null);
                this.mPlayer.mo20579j(null);
                this.mPlayer.mo20583n(null);
                this.mPlayer.mo20574e(null);
                this.mCurrentState = 0;
                this.isStartFuncCalled = false;
            }
            this.mEffectView.mo20522c();
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
