package com.p051p1.mobile.putong.core.p058ui.advertisingcard;

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
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.card.R$string;
import com.p051p1.mobile.putong.core.p058ui.advertisingcard.AdvertisPlayVideoView;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.Callable;
import p137rx.C22421c;
import p151v.VDraweeView;
import p151v.VProgressBar;
import p151v.VTexturePlayer;
import p153l.c7y;
import p153l.cbl0;
import p153l.cdc0;
import p153l.eam;
import p153l.nec0;
import p153l.o1j0;
import p153l.p9r;
import p153l.psd0;
import p153l.qa00;
import p153l.uqb0;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public class AdvertisPlayVideoView extends FrameLayout implements eam {

    /* JADX INFO: renamed from: a */
    public final ImageButton f29226a;

    /* JADX INFO: renamed from: b */
    public final ImageButton f29227b;

    /* JADX INFO: renamed from: c */
    public final VProgressBar f29228c;

    /* JADX INFO: renamed from: d */
    public boolean f29229d;

    /* JADX INFO: renamed from: e */
    public VTexturePlayer f29230e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f29231f;

    /* JADX INFO: renamed from: g */
    public final ImageButton f29232g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC8446d f29233h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.advertisingcard.AdvertisPlayVideoView$a */
    public class C8443a extends ViewOutlineProvider {
        public C8443a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), qa00.f156328o);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.advertisingcard.AdvertisPlayVideoView$b */
    public class C8444b implements VTexturePlayer.InterfaceC22699c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f29235a;

        public C8444b(String str) {
            this.f29235a = str;
        }

        @Override // p151v.VTexturePlayer.InterfaceC22699c
        /* JADX INFO: renamed from: O */
        public void mo37132O() {
        }

        @Override // p151v.VTexturePlayer.InterfaceC22699c
        /* JADX INFO: renamed from: a */
        public void mo37133a() {
        }

        @Override // p151v.VTexturePlayer.InterfaceC22699c
        /* JADX INFO: renamed from: b */
        public void mo37134b(int i, int i2) {
            c7y.m108346e(i, i2, !Network.isConnected(CoreModule.f18263b), this.f29235a, c7y.f80160a);
        }

        @Override // p151v.VTexturePlayer.InterfaceC22699c
        /* JADX INFO: renamed from: c */
        public void mo37135c(long j) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.advertisingcard.AdvertisPlayVideoView$c */
    public class C8445c implements InterfaceC8446d {
        public C8445c() {
        }

        @Override // p151v.VTexturePlayer.InterfaceC22698b
        /* JADX INFO: renamed from: d */
        public void mo37119d() {
        }

        @Override // p151v.VTexturePlayer.InterfaceC22698b
        /* JADX INFO: renamed from: h */
        public void mo37120h() {
            AdvertisPlayVideoView.this.f29228c.setVisibility(0);
        }

        @Override // p151v.VTexturePlayer.InterfaceC22698b
        public void onComplete() {
            AdvertisPlayVideoView.this.m45446m();
        }

        @Override // p151v.VTexturePlayer.InterfaceC22698b
        public void onError(int i, int i2) {
        }

        @Override // p151v.VTexturePlayer.InterfaceC22698b
        public void onPause() {
            AdvertisPlayVideoView.this.m45446m();
        }

        @Override // p151v.VTexturePlayer.InterfaceC22698b
        public void onResume() {
            AdvertisPlayVideoView.this.m45447n();
        }

        @Override // p151v.VTexturePlayer.InterfaceC22698b
        /* JADX INFO: renamed from: y */
        public void mo37130y() {
            AdvertisPlayVideoView.this.m45447n();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.advertisingcard.AdvertisPlayVideoView$d */
    public interface InterfaceC8446d extends VTexturePlayer.InterfaceC22698b {
    }

    public AdvertisPlayVideoView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29229d = false;
        C8445c c8445c = new C8445c();
        this.f29233h = c8445c;
        View viewInflate = p9r.m171370a(context).inflate(nec0.f141639x, (ViewGroup) this, true);
        FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(cdc0.f81146X);
        ImageButton imageButton = (ImageButton) viewInflate.findViewById(cdc0.f81128F);
        this.f29226a = imageButton;
        this.f29231f = (VDraweeView) viewInflate.findViewById(cdc0.f81144V);
        ImageButton imageButton2 = (ImageButton) viewInflate.findViewById(cdc0.f81127E);
        this.f29227b = imageButton2;
        this.f29232g = (ImageButton) viewInflate.findViewById(cdc0.f81158h);
        this.f29228c = (VProgressBar) viewInflate.findViewById(cdc0.f81131I);
        VTexturePlayer vTexturePlayer = new VTexturePlayer(context, c8445c);
        this.f29230e = vTexturePlayer;
        frameLayout.addView(vTexturePlayer, generateDefaultLayoutParams());
        this.f29230e.setIfUseTTDynamicCache(true);
        this.f29230e.m224546k(true);
        this.f29230e.setOutlineProvider(new C8443a());
        this.f29230e.setClipToOutline(true);
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: l.aa0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f69091a.m45442i(view);
            }
        });
        imageButton2.setOnClickListener(new View.OnClickListener() { // from class: l.ba0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f75634a.m45443j(view);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m45435a(Integer num) {
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m45437d(Object obj) {
        if (Network.isConnected(CoreModule.f18263b)) {
            return;
        }
        o1j0.m165640n(R$string.f21011a);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m45440g(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m45442i(View view) {
        this.f29230e.m224553r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m45443j(View view) {
        this.f29230e.f210409t.start();
        this.f29233h.mo37130y();
    }

    /* JADX INFO: renamed from: l */
    private void m45444l() {
        AudioManager audioManager = (AudioManager) CoreModule.f18263b.getSystemService("audio");
        if (NullChecker.m82486a(audioManager)) {
            audioManager.requestAudioFocus(null, 3, 1);
        }
    }

    @Override // p153l.eam
    /* JADX INFO: renamed from: b */
    public void mo37118b(boolean z) {
        VTexturePlayer vTexturePlayer = this.f29230e;
        if (z) {
            vTexturePlayer.m224544i(true);
        } else {
            vTexturePlayer.m224553r();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m45445k(final String str, float f) {
        this.f29230e.setIsInABGroup(true);
        this.f29230e.setOnBufferListener(new C8444b(str));
        this.f29230e.m224558w(null, C22421c.fromCallable(new Callable() { // from class: l.ca0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(cbl0.m108642n().m108651u(str));
            }
        }).compose(psd0.m173592C()), -1.0f);
        this.f29230e.setNetErrorListener(new y20() { // from class: l.da0
            @Override // p153l.y20
            public final void call(Object obj) {
                AdvertisPlayVideoView.m45437d(obj);
            }
        });
        this.f29230e.m224554s(Uri.parse(uqb0.m197266d0(str)), f, str, false, R$string.f21011a, R$string.f21015e);
        cbl0.m108642n().m108649q(str).compose(psd0.m173592C()).subscribe(psd0.m173597H(new y20() { // from class: l.ea0
            @Override // p153l.y20
            public final void call(Object obj) {
                AdvertisPlayVideoView.m45435a((Integer) obj);
            }
        }, new y20() { // from class: l.fa0
            @Override // p153l.y20
            public final void call(Object obj) {
                AdvertisPlayVideoView.m45440g((Throwable) obj);
            }
        }));
        m45444l();
    }

    /* JADX INFO: renamed from: m */
    public void m45446m() {
        this.f29227b.setVisibility(0);
        this.f29226a.setVisibility(4);
        this.f29228c.setVisibility(4);
        this.f29229d = true;
    }

    /* JADX INFO: renamed from: n */
    public void m45447n() {
        this.f29227b.setVisibility(4);
        this.f29226a.setVisibility(0);
        this.f29228c.setVisibility(4);
        this.f29229d = false;
    }

    public AdvertisPlayVideoView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AdvertisPlayVideoView(@NonNull Context context) {
        this(context, null);
    }
}
