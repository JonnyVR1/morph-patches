package p153l;

import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.giftlayer.LiveGiftExtLayer;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.ResourceKey;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.compose.SVGADynamicEntity;
import com.tantan.library.svga.data.cache.Resource;
import com.tantan.library.svga.data.request.RequestCallback;
import com.tantan.library.svga.exception.SVGAException;

/* JADX INFO: loaded from: classes4.dex */
public class oks {

    /* JADX INFO: renamed from: a */
    public AnimEffectPlayer f147774a;

    /* JADX INFO: renamed from: b */
    public LiveGiftExtLayer f147775b;

    /* JADX INFO: renamed from: l.oks$a */
    public class C19157a extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GiftTrayData f147776a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f147777b;

        public C19157a(GiftTrayData giftTrayData, boolean z) {
            this.f147776a = giftTrayData;
            this.f147777b = z;
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
            bnl0.m105524M(oks.this.f147774a, false);
            oks.this.m168050f();
            muj.m160168K(this.f147776a);
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            super.onStart();
            bnl0.m105524M(oks.this.f147774a, true);
            muj.m160169L(this.f147776a);
            rre.m182748t(this.f147776a, true, this.f147777b);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m168045a(FrameLayout frameLayout, LiveGiftExtLayer liveGiftExtLayer) {
        this.f147775b = liveGiftExtLayer;
        if (this.f147774a == null) {
            this.f147774a = new AnimEffectPlayer(frameLayout.getContext());
        }
        if (this.f147774a.getParent() == null) {
            AnimEffectPlayer animEffectPlayer = this.f147774a;
            int i = bnl0.f77544e;
            frameLayout.addView(animEffectPlayer, i, i);
            bnl0.m105524M(this.f147774a, false);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m168046b() {
        AnimEffectPlayer animEffectPlayer = this.f147774a;
        if (animEffectPlayer != null) {
            bnl0.m105524M(animEffectPlayer, false);
        }
        m168050f();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m168047c(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        return str.startsWith("http://") || str.startsWith("https://");
    }

    /* JADX INFO: renamed from: d */
    public void m168048d(FrameLayout frameLayout, LiveGiftExtLayer liveGiftExtLayer, String str, GiftTrayData giftTrayData, boolean z) {
        m168045a(frameLayout, liveGiftExtLayer);
        m168049e(str, giftTrayData, z);
    }

    /* JADX INFO: renamed from: e */
    public final void m168049e(String str, GiftTrayData giftTrayData, boolean z) {
        muj.m160166I(giftTrayData);
        SVGADynamicEntity sVGADynamicEntity = new SVGADynamicEntity();
        if (m168047c(giftTrayData.f50966x)) {
            sVGADynamicEntity.setDynamicImage(giftTrayData.f50966x, "HeadisHere");
        }
        SVGALoader.with(this.f147774a.getContext()).from(str).repeatCount(1).dynamic(sVGADynamicEntity).loadCallback(new C19158b(giftTrayData, z)).autoPlay(true).animListener(new C19157a(giftTrayData, z)).into(this.f147774a);
    }

    /* JADX INFO: renamed from: f */
    public void m168050f() {
    }

    /* JADX INFO: renamed from: l.oks$b */
    public class C19158b implements RequestCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GiftTrayData f147779a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f147780b;

        public C19158b(GiftTrayData giftTrayData, boolean z) {
            this.f147779a = giftTrayData;
            this.f147780b = z;
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onLoadFailed(@NonNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
            bnl0.m105524M(oks.this.f147774a, false);
            oks.this.m168050f();
            muj.m160167J(this.f147779a, sVGAException == null ? "" : sVGAException.getMessage());
            rre.m182748t(this.f147779a, false, this.f147780b);
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onResourceReady(@NonNull ResourceKey resourceKey, @NonNull Resource<?> resource) {
        }
    }
}
