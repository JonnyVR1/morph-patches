package p002l;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.giftlayer.LiveGiftExtLayer;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.ResourceKey;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.compose.SVGADynamicEntity;
import com.tantan.library.svga.data.cache.Resource;
import com.tantan.library.svga.data.request.RequestCallback;
import com.tantan.library.svga.exception.SVGAException;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class nis {

    /* JADX INFO: renamed from: a */
    public AnimEffectPlayer f16061a;

    /* JADX INFO: renamed from: b */
    public LiveGiftExtLayer f16062b;

    /* JADX INFO: renamed from: l.nis$a */
    public class C0702a extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GiftTrayData f16063a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f16064b;

        public C0702a(GiftTrayData giftTrayData, boolean z) {
            this.f16063a = giftTrayData;
            this.f16064b = z;
        }

        public void onFinished() {
            super.onFinished();
            xdl0.M(nis.this.f16061a, false);
            nis.this.m18804f();
            wrj.m25376K(this.f16063a);
        }

        public void onStart() {
            super.onStart();
            xdl0.M(nis.this.f16061a, true);
            wrj.m25377L(this.f16063a);
            nqe.m18965t(this.f16063a, true, this.f16064b);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m18799a(FrameLayout frameLayout, LiveGiftExtLayer liveGiftExtLayer) {
        this.f16062b = liveGiftExtLayer;
        if (this.f16061a == null) {
            this.f16061a = new AnimEffectPlayer(frameLayout.getContext());
        }
        if (this.f16061a.getParent() == null) {
            AnimEffectPlayer animEffectPlayer = this.f16061a;
            int i = xdl0.e;
            frameLayout.addView((View) animEffectPlayer, i, i);
            xdl0.M(this.f16061a, false);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m18800b() {
        AnimEffectPlayer animEffectPlayer = this.f16061a;
        if (animEffectPlayer != null) {
            xdl0.M(animEffectPlayer, false);
        }
        m18804f();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m18801c(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        return str.startsWith("http://") || str.startsWith("https://");
    }

    /* JADX INFO: renamed from: d */
    public void m18802d(FrameLayout frameLayout, LiveGiftExtLayer liveGiftExtLayer, String str, GiftTrayData giftTrayData, boolean z) {
        m18799a(frameLayout, liveGiftExtLayer);
        m18803e(str, giftTrayData, z);
    }

    /* JADX INFO: renamed from: e */
    public final void m18803e(String str, GiftTrayData giftTrayData, boolean z) {
        wrj.m25374I(giftTrayData);
        SVGADynamicEntity sVGADynamicEntity = new SVGADynamicEntity();
        if (m18801c(giftTrayData.f6160x)) {
            sVGADynamicEntity.setDynamicImage(giftTrayData.f6160x, "HeadisHere");
        }
        SVGALoader.with(this.f16061a.getContext()).from(str).repeatCount(1).dynamic(sVGADynamicEntity).loadCallback(new C0703b(giftTrayData, z)).autoPlay(true).animListener(new C0702a(giftTrayData, z)).into(this.f16061a);
    }

    /* JADX INFO: renamed from: f */
    public void m18804f() {
    }

    /* JADX INFO: renamed from: l.nis$b */
    public class C0703b implements RequestCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GiftTrayData f16066a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f16067b;

        public C0703b(GiftTrayData giftTrayData, boolean z) {
            this.f16066a = giftTrayData;
            this.f16067b = z;
        }

        public void onLoadFailed(@NonNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
            xdl0.M(nis.this.f16061a, false);
            nis.this.m18804f();
            wrj.m25375J(this.f16066a, sVGAException == null ? "" : sVGAException.getMessage());
            nqe.m18965t(this.f16066a, false, this.f16067b);
        }

        public void onResourceReady(@NonNull ResourceKey resourceKey, @NonNull Resource<?> resource) {
        }
    }
}
