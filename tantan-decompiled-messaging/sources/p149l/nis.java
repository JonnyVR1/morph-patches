package p149l;

import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.giftlayer.LiveGiftExtLayer;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.ResourceKey;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.compose.SVGADynamicEntity;
import com.tantan.library.svga.data.cache.Resource;
import com.tantan.library.svga.data.request.RequestCallback;
import com.tantan.library.svga.exception.SVGAException;

/* JADX INFO: loaded from: classes4.dex */
public class nis {

    /* JADX INFO: renamed from: a */
    public AnimEffectPlayer f139135a;

    /* JADX INFO: renamed from: b */
    public LiveGiftExtLayer f139136b;

    /* JADX INFO: renamed from: l.nis$a */
    public class C18700a extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GiftTrayData f139137a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f139138b;

        public C18700a(GiftTrayData giftTrayData, boolean z) {
            this.f139137a = giftTrayData;
            this.f139138b = z;
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
            xdl0.m208344M(nis.this.f139135a, false);
            nis.this.m159559f();
            wrj.m205204K(this.f139137a);
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            super.onStart();
            xdl0.m208344M(nis.this.f139135a, true);
            wrj.m205205L(this.f139137a);
            nqe.m160614t(this.f139137a, true, this.f139138b);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m159554a(FrameLayout frameLayout, LiveGiftExtLayer liveGiftExtLayer) {
        this.f139136b = liveGiftExtLayer;
        if (this.f139135a == null) {
            this.f139135a = new AnimEffectPlayer(frameLayout.getContext());
        }
        if (this.f139135a.getParent() == null) {
            AnimEffectPlayer animEffectPlayer = this.f139135a;
            int i = xdl0.f192403e;
            frameLayout.addView(animEffectPlayer, i, i);
            xdl0.m208344M(this.f139135a, false);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m159555b() {
        AnimEffectPlayer animEffectPlayer = this.f139135a;
        if (animEffectPlayer != null) {
            xdl0.m208344M(animEffectPlayer, false);
        }
        m159559f();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m159556c(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        return str.startsWith("http://") || str.startsWith("https://");
    }

    /* JADX INFO: renamed from: d */
    public void m159557d(FrameLayout frameLayout, LiveGiftExtLayer liveGiftExtLayer, String str, GiftTrayData giftTrayData, boolean z) {
        m159554a(frameLayout, liveGiftExtLayer);
        m159558e(str, giftTrayData, z);
    }

    /* JADX INFO: renamed from: e */
    public final void m159558e(String str, GiftTrayData giftTrayData, boolean z) {
        wrj.m205202I(giftTrayData);
        SVGADynamicEntity sVGADynamicEntity = new SVGADynamicEntity();
        if (m159556c(giftTrayData.f50118x)) {
            sVGADynamicEntity.setDynamicImage(giftTrayData.f50118x, "HeadisHere");
        }
        SVGALoader.with(this.f139135a.getContext()).from(str).repeatCount(1).dynamic(sVGADynamicEntity).loadCallback(new C18701b(giftTrayData, z)).autoPlay(true).animListener(new C18700a(giftTrayData, z)).into(this.f139135a);
    }

    /* JADX INFO: renamed from: f */
    public void m159559f() {
    }

    /* JADX INFO: renamed from: l.nis$b */
    public class C18701b implements RequestCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GiftTrayData f139140a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f139141b;

        public C18701b(GiftTrayData giftTrayData, boolean z) {
            this.f139140a = giftTrayData;
            this.f139141b = z;
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onLoadFailed(@NonNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
            xdl0.m208344M(nis.this.f139135a, false);
            nis.this.m159559f();
            wrj.m205203J(this.f139140a, sVGAException == null ? "" : sVGAException.getMessage());
            nqe.m160614t(this.f139140a, false, this.f139141b);
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onResourceReady(@NonNull ResourceKey resourceKey, @NonNull Resource<?> resource) {
        }
    }
}
