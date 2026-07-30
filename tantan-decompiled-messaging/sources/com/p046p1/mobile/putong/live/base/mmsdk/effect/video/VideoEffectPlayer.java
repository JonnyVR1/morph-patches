package com.p046p1.mobile.putong.live.base.mmsdk.effect.video;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.immomo.velib.player.InterfaceC3988d;
import com.immomo.velib.player.VideoEffectView;
import p149l.i7m;
import p149l.j7m;
import p149l.o4l0;

/* JADX INFO: loaded from: classes13.dex */
public class VideoEffectPlayer extends VideoEffectView {

    public enum RenderMode {
        SURFACE_VIEW,
        TEXTURE_VIEW
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.mmsdk.effect.video.VideoEffectPlayer$a */
    public class C12453a implements InterfaceC3988d.b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ i7m f44524a;

        public C12453a(i7m i7mVar) {
            this.f44524a = i7mVar;
        }

        @Override // com.immomo.velib.player.InterfaceC3988d.b
        public void onCompletion() {
            this.f44524a.onCompletion();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.mmsdk.effect.video.VideoEffectPlayer$b */
    public class C12454b implements InterfaceC3988d.c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ j7m f44526a;

        public C12454b(j7m j7mVar) {
            this.f44526a = j7mVar;
        }

        @Override // com.immomo.velib.player.InterfaceC3988d.c
        public boolean onError(InterfaceC3988d interfaceC3988d, int i, String str) {
            return this.f44526a.onError(i, str);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.mmsdk.effect.video.VideoEffectPlayer$c */
    public class C12455c implements InterfaceC3988d.d {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC3988d.d f44528a;

        public C12455c(InterfaceC3988d.d dVar) {
            this.f44528a = dVar;
        }

        @Override // com.immomo.velib.player.InterfaceC3988d.d
        /* JADX INFO: renamed from: a */
        public void mo19527a() {
            this.f44528a.mo19527a();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.mmsdk.effect.video.VideoEffectPlayer$d */
    public static /* synthetic */ class C12456d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f44530a;

        static {
            int[] iArr = new int[RenderMode.values().length];
            f44530a = iArr;
            try {
                iArr[RenderMode.SURFACE_VIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44530a[RenderMode.TEXTURE_VIEW.ordinal()] = 2;
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

    public void setCompletionListener(i7m i7mVar) {
        if (i7mVar == null) {
            super.setCompletionListener((InterfaceC3988d.b) null);
        } else {
            super.setCompletionListener(new C12453a(i7mVar));
        }
    }

    public void setOnErrorListener(j7m j7mVar) {
        if (j7mVar == null) {
            super.setOnErrorListener((InterfaceC3988d.c) null);
        } else {
            super.setOnErrorListener(new C12454b(j7mVar));
        }
    }

    public void setOnPrepareListener(InterfaceC3988d.d dVar) {
        if (dVar == null) {
            super.setOnPreparedListener(null);
        } else {
            super.setOnPreparedListener(new C12455c(dVar));
        }
    }

    public void setRenderMode(RenderMode renderMode) {
        int i = C12456d.f44530a[renderMode.ordinal()];
        int i2 = 1;
        if (i != 1 && i == 2) {
            i2 = 2;
        }
        super.setRenderMode(i2);
    }

    public void setVideoEffectConfig(o4l0 o4l0Var) {
        setEffectConfig(o4l0Var == null ? null : o4l0Var.m162601c());
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
