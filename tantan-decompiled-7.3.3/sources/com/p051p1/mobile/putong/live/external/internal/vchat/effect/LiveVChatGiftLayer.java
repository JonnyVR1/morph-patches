package com.p051p1.mobile.putong.live.external.internal.vchat.effect;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.immomo.svgaplayer.SVGAAnimListenerAdapter;
import com.immomo.svgaplayer.bean.InsertImgBean;
import com.immomo.svgaplayer.listener.SVGAClickAreaListener;
import com.immomo.svgaplayer.view.MomoLayUpSVGAImageView;
import com.immomo.velib.anim.model.Element;
import com.immomo.velib.player.InterfaceC4139d;
import com.p051p1.mobile.putong.live.base.data.BLiveEffect;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftExtraDrawInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveSpecialEffectResources;
import com.p051p1.mobile.putong.live.base.mmsdk.effect.video.VideoEffectPlayer;
import com.p051p1.mobile.putong.live.base.view.XEGiftView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import com.tantan.library.svga.ResourceKey;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.data.cache.Resource;
import com.tantan.library.svga.data.request.RequestCallback;
import com.tantan.library.svga.exception.SVGAException;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.AbstractC18340l4;
import p153l.bnl0;
import p153l.e4d0;
import p153l.ere;
import p153l.gmw;
import p153l.hre;
import p153l.htd0;
import p153l.iam;
import p153l.jfl0;
import p153l.jfv;
import p153l.jhe;
import p153l.jyb;
import p153l.muj;
import p153l.mvk0;
import p153l.rcu;
import p153l.rre;
import p153l.sdl0;
import p153l.tmu;
import p153l.udl0;
import p153l.vxr;
import p153l.wqe;
import p153l.x8e;
import p153l.y9m;
import p153l.z9m;
import p153l.zrv;

/* JADX INFO: loaded from: classes9.dex */
public class LiveVChatGiftLayer extends FrameLayout implements iam<mvk0> {

    /* JADX INFO: renamed from: a */
    public LiveVChatGiftLayer f45932a;

    /* JADX INFO: renamed from: b */
    public MomoLayUpSVGAImageView f45933b;

    /* JADX INFO: renamed from: c */
    public VideoEffectPlayer f45934c;

    /* JADX INFO: renamed from: d */
    public XEGiftView f45935d;

    /* JADX INFO: renamed from: e */
    public mvk0 f45936e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.effect.LiveVChatGiftLayer$a */
    public class C12670a extends x8e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GiftTrayData f45937a;

        public C12670a(GiftTrayData giftTrayData) {
            this.f45937a = giftTrayData;
        }

        @Override // p153l.x8e, p153l.w8e
        public void onFailed(String str) {
            GiftTrayData giftTrayData = this.f45937a;
            rre.m182734f(e4d0.m119410b(giftTrayData, giftTrayData.m75352v(), LiveVChatGiftLayer.this.f45936e.m97931N2()));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.effect.LiveVChatGiftLayer$b */
    public class C12671b extends SVGAAnimListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GiftTrayData f45939a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BLiveEffect f45940b;

        public C12671b(GiftTrayData giftTrayData, BLiveEffect bLiveEffect) {
            this.f45939a = giftTrayData;
            this.f45940b = bLiveEffect;
        }

        @Override // com.immomo.svgaplayer.SVGAAnimListenerAdapter
        public void loadResError(String str) {
            super.loadResError(str);
            bnl0.m105524M(LiveVChatGiftLayer.this.f45933b, false);
            muj.m160223y(this.f45940b, str, this.f45939a);
            rre.m182749u(this.f45939a, false, LiveVChatGiftLayer.this.f45936e.m97931N2());
        }

        @Override // com.immomo.svgaplayer.SVGAAnimListenerAdapter, com.immomo.svgaplayer.listener.SVGACallback
        public void onFinished() {
            super.onFinished();
            bnl0.m105524M(LiveVChatGiftLayer.this.f45933b, false);
            muj.m160222x(this.f45939a);
        }

        @Override // com.immomo.svgaplayer.SVGAAnimListenerAdapter, com.immomo.svgaplayer.listener.SVGACallback
        public void onStart() {
            super.onStart();
            bnl0.m105524M(LiveVChatGiftLayer.this.f45933b, true);
            muj.m160224z(this.f45939a);
            rre.m182749u(this.f45939a, true, LiveVChatGiftLayer.this.f45936e.m97931N2());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.effect.LiveVChatGiftLayer$c */
    public class C12672c implements RequestCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GiftTrayData f45942a;

        public C12672c(GiftTrayData giftTrayData) {
            this.f45942a = giftTrayData;
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onLoadFailed(@NotNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onResourceReady(@NotNull ResourceKey resourceKey, @NotNull Resource<?> resource) {
            LiveVChatGiftLayer.this.m70453u(this.f45942a, rcu.m180823a(resource));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.effect.LiveVChatGiftLayer$d */
    public class C12673d extends SVGAAnimListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GiftTrayData f45944a;

        public C12673d(GiftTrayData giftTrayData) {
            this.f45944a = giftTrayData;
        }

        @Override // com.immomo.svgaplayer.SVGAAnimListenerAdapter
        public void loadResError(@NotNull String str) {
            super.loadResError(str);
            bnl0.m105524M(LiveVChatGiftLayer.this.f45933b, false);
            muj.m160167J(this.f45944a, str);
            rre.m182748t(this.f45944a, false, LiveVChatGiftLayer.this.f45936e.m97931N2());
        }

        @Override // com.immomo.svgaplayer.SVGAAnimListenerAdapter, com.immomo.svgaplayer.listener.SVGACallback
        public void onFinished() {
            super.onFinished();
            bnl0.m105524M(LiveVChatGiftLayer.this.f45933b, false);
            muj.m160168K(this.f45944a);
        }

        @Override // com.immomo.svgaplayer.SVGAAnimListenerAdapter, com.immomo.svgaplayer.listener.SVGACallback
        public void onStart() {
            super.onStart();
            bnl0.m105524M(LiveVChatGiftLayer.this.f45933b, true);
            muj.m160169L(this.f45944a);
            rre.m182748t(this.f45944a, true, LiveVChatGiftLayer.this.f45936e.m97931N2());
        }
    }

    public LiveVChatGiftLayer(@NonNull Context context) {
        super(context);
    }

    @Override // p153l.iam
    @androidx.annotation.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
        m70457y();
    }

    /* JADX INFO: renamed from: i */
    public final void m70444i(View view) {
        tmu.m191858a(this, view);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final void m70445j(List<BLiveSpecialEffectResources> list, @androidx.annotation.Nullable List<Element> list2) {
        if (jyb.m147479J(list) || jyb.m147479J(list2)) {
            return;
        }
        HashMap map = new HashMap(list.size());
        for (BLiveSpecialEffectResources bLiveSpecialEffectResources : list) {
            map.put(bLiveSpecialEffectResources.f45286id, bLiveSpecialEffectResources);
        }
        for (Element element : list2) {
            String id = element.getId();
            BLiveSpecialEffectResources bLiveSpecialEffectResources2 = (BLiveSpecialEffectResources) map.get(id);
            if (map.containsKey(id) && bLiveSpecialEffectResources2 != null) {
                if (bLiveSpecialEffectResources2.typeIsImageUrl()) {
                    element.setUrl(bLiveSpecialEffectResources2.value);
                } else if (bLiveSpecialEffectResources2.typeIsText()) {
                    element.setText(bLiveSpecialEffectResources2.value);
                }
            }
        }
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(mvk0 mvk0Var) {
        this.f45936e = mvk0Var;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m70447l(BLiveEffect bLiveEffect, GiftTrayData giftTrayData) {
        muj.m160171N(bLiveEffect, giftTrayData);
        if (this.f45936e == null) {
            return;
        }
        this.f45934c.stop();
        this.f45934c.setVisibility(8);
        rre.m182749u(giftTrayData, true, this.f45936e.m97931N2());
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ boolean m70448m(GiftTrayData giftTrayData, int i, String str) {
        muj.m160172O(i, str, giftTrayData);
        if (this.f45936e == null) {
            return false;
        }
        this.f45934c.stop();
        this.f45934c.setVisibility(8);
        rre.m182749u(giftTrayData, false, this.f45936e.m97931N2());
        return false;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m70449n(final BLiveEffect bLiveEffect, final GiftTrayData giftTrayData, boolean z, udl0 udl0Var) {
        if (udl0Var == null || this.f45934c == null) {
            muj.m160162E(bLiveEffect, udl0Var, this.f45934c, giftTrayData);
            rre.m182749u(giftTrayData, false, this.f45936e.m97931N2());
            return;
        }
        if (z && !jyb.m147479J(udl0Var.m195499b()) && NullChecker.m82486a(giftTrayData.f50924F) && !jyb.m147479J(giftTrayData.f50924F.videoEffectExtras)) {
            m70445j(giftTrayData.f50924F.videoEffectExtras, udl0Var.m195499b());
            muj.m160188c(bLiveEffect, giftTrayData);
        } else if (giftTrayData.f50929K && !jyb.m147479J(udl0Var.m195499b()) && !jyb.m147479J(giftTrayData.f50931M)) {
            m70445j(giftTrayData.f50931M, udl0Var.m195499b());
            muj.m160188c(bLiveEffect, giftTrayData);
        }
        bnl0.m105524M(this.f45934c, true);
        this.f45934c.setVideoEffectConfig(new sdl0.C20024a().m185480c(udl0Var).m185481d(sdl0.f167422j).m185479b(null).m185482e(new gmw()).m185478a());
        this.f45934c.prepare();
        this.f45934c.start();
        muj.m160205k0(bLiveEffect, giftTrayData);
        this.f45934c.setOnPrepareListener(new InterfaceC4139d.d() { // from class: l.qmu
            @Override // com.immomo.velib.player.InterfaceC4139d.d
            /* JADX INFO: renamed from: a */
            public final void mo20526a() {
                muj.m160173P(bLiveEffect, giftTrayData);
            }
        });
        this.f45934c.setCompletionListener(new y9m() { // from class: l.rmu
            @Override // p153l.y9m
            public final void onCompletion() {
                this.f163932a.m70447l(bLiveEffect, giftTrayData);
            }
        });
        this.f45934c.setOnErrorListener(new z9m() { // from class: l.smu
            @Override // p153l.z9m
            public final boolean onError(int i, String str) {
                return this.f169613a.m70448m(giftTrayData, i, str);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70444i(this);
        this.f45934c.setRenderMode(2);
    }

    /* JADX INFO: renamed from: p */
    public final void m70450p(BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo) {
    }

    /* JADX INFO: renamed from: q */
    public void m70451q(GiftTrayData giftTrayData) {
        muj.m160164G(giftTrayData);
        if (((jfv) zrv.m221194l(htd0.f111520b)).m144719f()) {
            muj.m160220v(giftTrayData);
            rre.m182746r(giftTrayData, this.f45936e.m97931N2());
            return;
        }
        if (giftTrayData.m75348r()) {
            m70450p(giftTrayData.f50925G);
            return;
        }
        boolean z = NullChecker.m82486a(giftTrayData.f50924F) && giftTrayData.f50924F.enterVersion == 1;
        BLiveEffect bLiveEffectM122151h = ere.m122146i().m122151h(z ? giftTrayData.f50933O : giftTrayData.f50967y);
        boolean zM160278W2 = this.f45936e.m160278W2(bLiveEffectM122151h, new C12670a(giftTrayData));
        rre.m182725E(this.f45936e.m97931N2(), z ? giftTrayData.f50933O : giftTrayData.f50967y, !zM160278W2);
        if (!zM160278W2) {
            m70452s(giftTrayData);
            return;
        }
        if (vxr.m203876d().m170973E1() && ("svga".equals(bLiveEffectM122151h.type) || "video".equals(bLiveEffectM122151h.type))) {
            m70456x(bLiveEffectM122151h, giftTrayData);
            return;
        }
        if ("svga".equals(bLiveEffectM122151h.type)) {
            m70454v(bLiveEffectM122151h, giftTrayData);
        } else if ("video".equals(bLiveEffectM122151h.type)) {
            m70455w(bLiveEffectM122151h, giftTrayData, z);
        } else {
            "game".equals(bLiveEffectM122151h.type);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m70452s(GiftTrayData giftTrayData) {
        muj.m160166I(giftTrayData);
        this.f45933b.clearInsertData();
        InsertImgBean insertImgBean = new InsertImgBean();
        insertImgBean.setKey("HeadisHere");
        insertImgBean.setType(2);
        insertImgBean.setImgUrl(giftTrayData.f50966x);
        this.f45933b.insertBean(insertImgBean);
        this.f45933b.setLayoutType(MomoLayUpSVGAImageView.LayoutType.ALIGN_PARENT_BOTTOM);
        SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/719775d5-33be-45b7-9d72-3eb7f6dffe9610.so").loadCallback(new C12672c(giftTrayData)).downloadOnly();
    }

    /* JADX INFO: renamed from: u */
    public final void m70453u(GiftTrayData giftTrayData, String str) {
        this.f45933b.startSVGAAnimWithJson(str, 1, (SVGAClickAreaListener) null, new C12673d(giftTrayData));
    }

    /* JADX INFO: renamed from: v */
    public final void m70454v(BLiveEffect bLiveEffect, GiftTrayData giftTrayData) {
        JSONObject jSONObject;
        if (this.f45933b == null) {
            return;
        }
        muj.m160170M(bLiveEffect, giftTrayData);
        AbstractC18340l4 abstractC18340l4M207509d = wqe.m207509d("svga");
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("templateUrl", abstractC18340l4M207509d.mo144686b(ere.m122146i().m122151h(bLiveEffect.f45207id)));
            } catch (JSONException unused) {
                muj.m160158A(bLiveEffect);
            }
        } catch (JSONException unused2) {
            jSONObject = null;
        }
        this.f45933b.startSVGAAnimWithLayJson(jSONObject.toString(), 1, null, new C12671b(giftTrayData, bLiveEffect));
    }

    /* JADX INFO: renamed from: w */
    public final void m70455w(final BLiveEffect bLiveEffect, final GiftTrayData giftTrayData, final boolean z) {
        muj.m160175R(bLiveEffect, giftTrayData);
        this.f45934c.stop();
        ((jfl0) wqe.m207509d("video")).m144689m(bLiveEffect.f45207id, bLiveEffect.hdType, bLiveEffect.zip, bLiveEffect.md5, new jfl0.InterfaceC17940a() { // from class: l.pmu
            @Override // p153l.jfl0.InterfaceC17940a
            /* JADX INFO: renamed from: a */
            public final void mo95516a(udl0 udl0Var) {
                this.f153230a.m70449n(bLiveEffect, giftTrayData, z, udl0Var);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public final void m70456x(BLiveEffect bLiveEffect, GiftTrayData giftTrayData) {
        muj.m160175R(bLiveEffect, giftTrayData);
        jhe.m144897r(this.f45935d, new hre(bLiveEffect.f45207id).m136828k(giftTrayData.f50931M));
    }

    /* JADX INFO: renamed from: y */
    public void m70457y() {
        VideoEffectPlayer videoEffectPlayer = this.f45934c;
        if (videoEffectPlayer != null) {
            videoEffectPlayer.stop();
            bnl0.m105524M(this.f45934c, false);
        }
        MomoLayUpSVGAImageView momoLayUpSVGAImageView = this.f45933b;
        if (momoLayUpSVGAImageView != null) {
            momoLayUpSVGAImageView.stopAnimation(true);
            bnl0.m105524M(this.f45933b, false);
        }
        XEGiftView xEGiftView = this.f45935d;
        if (xEGiftView != null) {
            xEGiftView.m70027j();
            bnl0.m105524M(this.f45935d, false);
        }
    }

    /* JADX INFO: renamed from: z */
    public void m70458z() {
        VideoEffectPlayer videoEffectPlayer = this.f45934c;
        if (videoEffectPlayer != null) {
            videoEffectPlayer.stop();
        }
    }

    public LiveVChatGiftLayer(@NonNull Context context, @androidx.annotation.Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVChatGiftLayer(@NonNull Context context, @androidx.annotation.Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
