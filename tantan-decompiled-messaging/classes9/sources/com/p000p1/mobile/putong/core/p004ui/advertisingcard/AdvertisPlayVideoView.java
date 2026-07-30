package com.p000p1.mobile.putong.core.p004ui.advertisingcard;

import android.content.Context;
import android.graphics.Outline;
import android.media.AudioManager;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.card.R$string;
import com.p000p1.mobile.putong.core.p004ui.advertisingcard.AdvertisPlayVideoView;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.Callable;
import l.e30;
import l.fyx;
import l.lsi0;
import l.mkd0;
import l.o7m;
import l.o7r;
import l.t100;
import l.x1l0;
import p006l.i6c0;
import p006l.qib0;
import p006l.w4c0;
import rx.c;
import v.VDraweeView;
import v.VProgressBar;
import v.VTexturePlayer;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AdvertisPlayVideoView extends FrameLayout implements o7m {

    /* JADX INFO: renamed from: a */
    public final ImageButton f4445a;

    /* JADX INFO: renamed from: b */
    public final ImageButton f4446b;

    /* JADX INFO: renamed from: c */
    public final VProgressBar f4447c;

    /* JADX INFO: renamed from: d */
    public boolean f4448d;

    /* JADX INFO: renamed from: e */
    public VTexturePlayer f4449e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f4450f;

    /* JADX INFO: renamed from: g */
    public final ImageButton f4451g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC0199d f4452h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.advertisingcard.AdvertisPlayVideoView$a */
    public class C0196a extends ViewOutlineProvider {
        public C0196a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), t100.o);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.advertisingcard.AdvertisPlayVideoView$b */
    public class C0197b implements VTexturePlayer.c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f4454a;

        public C0197b(String str) {
            this.f4454a = str;
        }

        /* JADX INFO: renamed from: O */
        public void m7214O() {
        }

        /* JADX INFO: renamed from: a */
        public void m7215a() {
        }

        /* JADX INFO: renamed from: b */
        public void m7216b(int i, int i2) {
            fyx.e(i, i2, !Network.isConnected(CoreModule.f1533b), this.f4454a, fyx.a);
        }

        /* JADX INFO: renamed from: c */
        public void m7217c(long j) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.advertisingcard.AdvertisPlayVideoView$c */
    public class C0198c implements InterfaceC0199d {
        public C0198c() {
        }

        /* JADX INFO: renamed from: d */
        public void m7218d() {
        }

        /* JADX INFO: renamed from: h */
        public void m7219h() {
            AdvertisPlayVideoView.this.f4447c.setVisibility(0);
        }

        public void onComplete() {
            AdvertisPlayVideoView.this.m7212m();
        }

        public void onError(int i, int i2) {
        }

        public void onPause() {
            AdvertisPlayVideoView.this.m7212m();
        }

        public void onResume() {
            AdvertisPlayVideoView.this.m7213n();
        }

        /* JADX INFO: renamed from: y */
        public void m7220y() {
            AdvertisPlayVideoView.this.m7213n();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.advertisingcard.AdvertisPlayVideoView$d */
    public interface InterfaceC0199d extends VTexturePlayer.b {
    }

    public AdvertisPlayVideoView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4448d = false;
        C0198c c0198c = new C0198c();
        this.f4452h = c0198c;
        View viewInflate = o7r.a(context).inflate(i6c0.f14263x, (ViewGroup) this, true);
        FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(w4c0.f24943X);
        ImageButton imageButton = (ImageButton) viewInflate.findViewById(w4c0.f24925F);
        this.f4445a = imageButton;
        this.f4450f = viewInflate.findViewById(w4c0.f24941V);
        ImageButton imageButton2 = (ImageButton) viewInflate.findViewById(w4c0.f24924E);
        this.f4446b = imageButton2;
        this.f4451g = (ImageButton) viewInflate.findViewById(w4c0.f24955h);
        this.f4447c = viewInflate.findViewById(w4c0.f24928I);
        VTexturePlayer vTexturePlayer = new VTexturePlayer(context, c0198c);
        this.f4449e = vTexturePlayer;
        frameLayout.addView((View) vTexturePlayer, (ViewGroup.LayoutParams) generateDefaultLayoutParams());
        this.f4449e.setIfUseTTDynamicCache(true);
        this.f4449e.k(true);
        this.f4449e.setOutlineProvider(new C0196a());
        this.f4449e.setClipToOutline(true);
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: l.ea0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11026a.m7207i(view);
            }
        });
        imageButton2.setOnClickListener(new View.OnClickListener() { // from class: l.fa0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12613a.m7208j(view);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m7200a(Integer num) {
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m7202d(Object obj) {
        if (Network.isConnected(CoreModule.f1533b)) {
            return;
        }
        lsi0.n(R$string.f4258a);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m7205g(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m7207i(View view) {
        this.f4449e.r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m7208j(View view) {
        this.f4449e.t.start();
        this.f4452h.y();
    }

    /* JADX INFO: renamed from: l */
    private void m7209l() {
        AudioManager audioManager = (AudioManager) CoreModule.f1533b.getSystemService("audio");
        if (NullChecker.a(audioManager)) {
            audioManager.requestAudioFocus(null, 3, 1);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m7210b(boolean z) {
        VTexturePlayer vTexturePlayer = this.f4449e;
        if (z) {
            vTexturePlayer.i(true);
        } else {
            vTexturePlayer.r();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m7211k(final String str, float f) {
        this.f4449e.setIsInABGroup(true);
        this.f4449e.setOnBufferListener(new C0197b(str));
        this.f4449e.w((VTexturePlayer.a) null, c.fromCallable(new Callable() { // from class: l.ga0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(x1l0.n().u(str));
            }
        }).compose(mkd0.C()), -1.0f);
        this.f4449e.setNetErrorListener(new e30() { // from class: l.ha0
            public final void call(Object obj) {
                AdvertisPlayVideoView.m7202d(obj);
            }
        });
        this.f4449e.s(Uri.parse(qib0.m22156d0(str)), f, str, false, R$string.f4258a, R$string.f4262e);
        x1l0.n().q(str).compose(mkd0.C()).subscribe(mkd0.H(new e30() { // from class: l.ia0
            public final void call(Object obj) {
                AdvertisPlayVideoView.m7200a((Integer) obj);
            }
        }, new e30() { // from class: l.ja0
            public final void call(Object obj) {
                AdvertisPlayVideoView.m7205g((Throwable) obj);
            }
        }));
        m7209l();
    }

    /* JADX INFO: renamed from: m */
    public void m7212m() {
        this.f4446b.setVisibility(0);
        this.f4445a.setVisibility(4);
        this.f4447c.setVisibility(4);
        this.f4448d = true;
    }

    /* JADX INFO: renamed from: n */
    public void m7213n() {
        this.f4446b.setVisibility(4);
        this.f4445a.setVisibility(0);
        this.f4447c.setVisibility(4);
        this.f4448d = false;
    }

    public AdvertisPlayVideoView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AdvertisPlayVideoView(@NonNull Context context) {
        this(context, null);
    }
}
