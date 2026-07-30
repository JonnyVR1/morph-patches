package com.p046p1.mobile.putong.core.p053ui.advertisingcard;

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
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.card.R$string;
import com.p046p1.mobile.putong.core.p053ui.advertisingcard.AdvertisPlayVideoView;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.Callable;
import p133rx.C22306c;
import p147v.VDraweeView;
import p147v.VProgressBar;
import p147v.VTexturePlayer;
import p149l.e30;
import p149l.fyx;
import p149l.i6c0;
import p149l.lsi0;
import p149l.mkd0;
import p149l.o7m;
import p149l.o7r;
import p149l.qib0;
import p149l.t100;
import p149l.w4c0;
import p149l.x1l0;

/* JADX INFO: loaded from: classes9.dex */
public class AdvertisPlayVideoView extends FrameLayout implements o7m {

    /* JADX INFO: renamed from: a */
    public final ImageButton f28378a;

    /* JADX INFO: renamed from: b */
    public final ImageButton f28379b;

    /* JADX INFO: renamed from: c */
    public final VProgressBar f28380c;

    /* JADX INFO: renamed from: d */
    public boolean f28381d;

    /* JADX INFO: renamed from: e */
    public VTexturePlayer f28382e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f28383f;

    /* JADX INFO: renamed from: g */
    public final ImageButton f28384g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC8283d f28385h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.advertisingcard.AdvertisPlayVideoView$a */
    public class C8280a extends ViewOutlineProvider {
        public C8280a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), t100.f167266o);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.advertisingcard.AdvertisPlayVideoView$b */
    public class C8281b implements VTexturePlayer.InterfaceC22584c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f28387a;

        public C8281b(String str) {
            this.f28387a = str;
        }

        @Override // p147v.VTexturePlayer.InterfaceC22584c
        /* JADX INFO: renamed from: O */
        public void mo36129O() {
        }

        @Override // p147v.VTexturePlayer.InterfaceC22584c
        /* JADX INFO: renamed from: a */
        public void mo36130a() {
        }

        @Override // p147v.VTexturePlayer.InterfaceC22584c
        /* JADX INFO: renamed from: b */
        public void mo36131b(int i, int i2) {
            fyx.m123811e(i, i2, !Network.isConnected(CoreModule.f17544b), this.f28387a, fyx.f99914a);
        }

        @Override // p147v.VTexturePlayer.InterfaceC22584c
        /* JADX INFO: renamed from: c */
        public void mo36132c(long j) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.advertisingcard.AdvertisPlayVideoView$c */
    public class C8282c implements InterfaceC8283d {
        public C8282c() {
        }

        @Override // p147v.VTexturePlayer.InterfaceC22583b
        /* JADX INFO: renamed from: d */
        public void mo36116d() {
        }

        @Override // p147v.VTexturePlayer.InterfaceC22583b
        /* JADX INFO: renamed from: h */
        public void mo36117h() {
            AdvertisPlayVideoView.this.f28380c.setVisibility(0);
        }

        @Override // p147v.VTexturePlayer.InterfaceC22583b
        public void onComplete() {
            AdvertisPlayVideoView.this.m44263m();
        }

        @Override // p147v.VTexturePlayer.InterfaceC22583b
        public void onError(int i, int i2) {
        }

        @Override // p147v.VTexturePlayer.InterfaceC22583b
        public void onPause() {
            AdvertisPlayVideoView.this.m44263m();
        }

        @Override // p147v.VTexturePlayer.InterfaceC22583b
        public void onResume() {
            AdvertisPlayVideoView.this.m44264n();
        }

        @Override // p147v.VTexturePlayer.InterfaceC22583b
        /* JADX INFO: renamed from: y */
        public void mo36127y() {
            AdvertisPlayVideoView.this.m44264n();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.advertisingcard.AdvertisPlayVideoView$d */
    public interface InterfaceC8283d extends VTexturePlayer.InterfaceC22583b {
    }

    public AdvertisPlayVideoView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f28381d = false;
        C8282c c8282c = new C8282c();
        this.f28385h = c8282c;
        View viewInflate = o7r.m163037a(context).inflate(i6c0.f111729x, (ViewGroup) this, true);
        FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(w4c0.f184517X);
        ImageButton imageButton = (ImageButton) viewInflate.findViewById(w4c0.f184499F);
        this.f28378a = imageButton;
        this.f28383f = (VDraweeView) viewInflate.findViewById(w4c0.f184515V);
        ImageButton imageButton2 = (ImageButton) viewInflate.findViewById(w4c0.f184498E);
        this.f28379b = imageButton2;
        this.f28384g = (ImageButton) viewInflate.findViewById(w4c0.f184529h);
        this.f28380c = (VProgressBar) viewInflate.findViewById(w4c0.f184502I);
        VTexturePlayer vTexturePlayer = new VTexturePlayer(context, c8282c);
        this.f28382e = vTexturePlayer;
        frameLayout.addView(vTexturePlayer, generateDefaultLayoutParams());
        this.f28382e.setIfUseTTDynamicCache(true);
        this.f28382e.m223300k(true);
        this.f28382e.setOutlineProvider(new C8280a());
        this.f28382e.setClipToOutline(true);
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: l.ea0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f90163a.m44259i(view);
            }
        });
        imageButton2.setOnClickListener(new View.OnClickListener() { // from class: l.fa0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f96549a.m44260j(view);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m44252a(Integer num) {
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m44254d(Object obj) {
        if (Network.isConnected(CoreModule.f17544b)) {
            return;
        }
        lsi0.m151584n(R$string.f20269a);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m44257g(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m44259i(View view) {
        this.f28382e.m223307r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m44260j(View view) {
        this.f28382e.f209487t.start();
        this.f28385h.mo36127y();
    }

    /* JADX INFO: renamed from: l */
    private void m44261l() {
        AudioManager audioManager = (AudioManager) CoreModule.f17544b.getSystemService("audio");
        if (NullChecker.m81303a(audioManager)) {
            audioManager.requestAudioFocus(null, 3, 1);
        }
    }

    @Override // p149l.o7m
    /* JADX INFO: renamed from: b */
    public void mo36115b(boolean z) {
        VTexturePlayer vTexturePlayer = this.f28382e;
        if (z) {
            vTexturePlayer.m223298i(true);
        } else {
            vTexturePlayer.m223307r();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m44262k(final String str, float f) {
        this.f28382e.setIsInABGroup(true);
        this.f28382e.setOnBufferListener(new C8281b(str));
        this.f28382e.m223312w(null, C22306c.fromCallable(new Callable() { // from class: l.ga0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(x1l0.m206744n().m206753u(str));
            }
        }).compose(mkd0.m154951C()), -1.0f);
        this.f28382e.setNetErrorListener(new e30() { // from class: l.ha0
            @Override // p149l.e30
            public final void call(Object obj) {
                AdvertisPlayVideoView.m44254d(obj);
            }
        });
        this.f28382e.m223308s(Uri.parse(qib0.m174812d0(str)), f, str, false, R$string.f20269a, R$string.f20273e);
        x1l0.m206744n().m206751q(str).compose(mkd0.m154951C()).subscribe(mkd0.m154956H(new e30() { // from class: l.ia0
            @Override // p149l.e30
            public final void call(Object obj) {
                AdvertisPlayVideoView.m44252a((Integer) obj);
            }
        }, new e30() { // from class: l.ja0
            @Override // p149l.e30
            public final void call(Object obj) {
                AdvertisPlayVideoView.m44257g((Throwable) obj);
            }
        }));
        m44261l();
    }

    /* JADX INFO: renamed from: m */
    public void m44263m() {
        this.f28379b.setVisibility(0);
        this.f28378a.setVisibility(4);
        this.f28380c.setVisibility(4);
        this.f28381d = true;
    }

    /* JADX INFO: renamed from: n */
    public void m44264n() {
        this.f28379b.setVisibility(4);
        this.f28378a.setVisibility(0);
        this.f28380c.setVisibility(4);
        this.f28381d = false;
    }

    public AdvertisPlayVideoView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AdvertisPlayVideoView(@NonNull Context context) {
        this(context, null);
    }
}
