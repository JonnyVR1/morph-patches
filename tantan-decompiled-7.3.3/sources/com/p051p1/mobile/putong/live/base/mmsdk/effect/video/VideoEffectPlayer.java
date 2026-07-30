package com.p051p1.mobile.putong.live.base.mmsdk.effect.video;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.immomo.velib.player.InterfaceC4139d;
import com.immomo.velib.player.VideoEffectView;
import p153l.sdl0;
import p153l.y9m;
import p153l.z9m;

/* JADX INFO: loaded from: classes13.dex */
public class VideoEffectPlayer extends VideoEffectView {

    public enum RenderMode {
        SURFACE_VIEW,
        TEXTURE_VIEW
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.mmsdk.effect.video.VideoEffectPlayer$a */
    public class C12616a implements InterfaceC4139d.b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ y9m f45372a;

        public C12616a(y9m y9mVar) {
            this.f45372a = y9mVar;
        }

        @Override // com.immomo.velib.player.InterfaceC4139d.b
        public void onCompletion() {
            this.f45372a.onCompletion();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.mmsdk.effect.video.VideoEffectPlayer$b */
    public class C12617b implements InterfaceC4139d.c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ z9m f45374a;

        public C12617b(z9m z9mVar) {
            this.f45374a = z9mVar;
        }

        @Override // com.immomo.velib.player.InterfaceC4139d.c
        public boolean onError(InterfaceC4139d interfaceC4139d, int i, String str) {
            return this.f45374a.onError(i, str);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.mmsdk.effect.video.VideoEffectPlayer$c */
    public class C12618c implements InterfaceC4139d.d {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC4139d.d f45376a;

        public C12618c(InterfaceC4139d.d dVar) {
            this.f45376a = dVar;
        }

        @Override // com.immomo.velib.player.InterfaceC4139d.d
        /* JADX INFO: renamed from: a */
        public void mo20526a() {
            this.f45376a.mo20526a();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.mmsdk.effect.video.VideoEffectPlayer$d */
    public static /* synthetic */ class C12619d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f45378a;

        static {
            int[] iArr = new int[RenderMode.values().length];
            f45378a = iArr;
            try {
                iArr[RenderMode.SURFACE_VIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45378a[RenderMode.TEXTURE_VIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public VideoEffectPlayer(@NonNull Context context) {
        super(context);
    }

    @Override // com.immomo.velib.player.VideoEffectView
    public void prepare() {
        super.prepare();
    }

    public void setCompletionListener(y9m y9mVar) {
        if (y9mVar == null) {
            super.setCompletionListener((InterfaceC4139d.b) null);
        } else {
            super.setCompletionListener(new C12616a(y9mVar));
        }
    }

    public void setOnErrorListener(z9m z9mVar) {
        if (z9mVar == null) {
            super.setOnErrorListener((InterfaceC4139d.c) null);
        } else {
            super.setOnErrorListener(new C12617b(z9mVar));
        }
    }

    public void setOnPrepareListener(InterfaceC4139d.d dVar) {
        if (dVar == null) {
            super.setOnPreparedListener(null);
        } else {
            super.setOnPreparedListener(new C12618c(dVar));
        }
    }

    public void setRenderMode(RenderMode renderMode) {
        int i = C12619d.f45378a[renderMode.ordinal()];
        int i2 = 1;
        if (i != 1 && i == 2) {
            i2 = 2;
        }
        super.setRenderMode(i2);
    }

    public void setVideoEffectConfig(sdl0 sdl0Var) {
        setEffectConfig(sdl0Var == null ? null : sdl0Var.m185477c());
    }

    @Override // com.immomo.velib.player.VideoEffectView
    public void start() {
        super.start();
    }

    @Override // com.immomo.velib.player.VideoEffectView
    public void stop() {
        super.stop();
    }

    public VideoEffectPlayer(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VideoEffectPlayer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public VideoEffectPlayer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
