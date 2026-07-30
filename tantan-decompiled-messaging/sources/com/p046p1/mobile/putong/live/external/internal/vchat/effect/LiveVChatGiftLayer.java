package com.p046p1.mobile.putong.live.external.internal.vchat.effect;

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
import com.immomo.velib.player.InterfaceC3988d;
import com.p046p1.mobile.putong.live.base.data.BLiveEffect;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftExtraDrawInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveSpecialEffectResources;
import com.p046p1.mobile.putong.live.base.mmsdk.effect.video.VideoEffectPlayer;
import com.p046p1.mobile.putong.live.base.view.XEGiftView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
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
import p149l.AbstractC18387m4;
import p149l.aqe;
import p149l.bwc0;
import p149l.dqe;
import p149l.f6l0;
import p149l.fge;
import p149l.fld0;
import p149l.gmk0;
import p149l.hjw;
import p149l.i7e;
import p149l.i7m;
import p149l.idv;
import p149l.j7m;
import p149l.nqe;
import p149l.o4l0;
import p149l.q4l0;
import p149l.qau;
import p149l.s7m;
import p149l.sku;
import p149l.spe;
import p149l.uvr;
import p149l.vwb;
import p149l.wrj;
import p149l.xdl0;
import p149l.ypv;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVChatGiftLayer extends FrameLayout implements s7m<gmk0> {

    /* JADX INFO: renamed from: a */
    public LiveVChatGiftLayer f45084a;

    /* JADX INFO: renamed from: b */
    public MomoLayUpSVGAImageView f45085b;

    /* JADX INFO: renamed from: c */
    public VideoEffectPlayer f45086c;

    /* JADX INFO: renamed from: d */
    public XEGiftView f45087d;

    /* JADX INFO: renamed from: e */
    public gmk0 f45088e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.effect.LiveVChatGiftLayer$a */
    public class C12507a extends i7e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GiftTrayData f45089a;

        public C12507a(GiftTrayData giftTrayData) {
            this.f45089a = giftTrayData;
        }

        @Override // p149l.i7e, p149l.h7e
        public void onFailed(String str) {
            GiftTrayData giftTrayData = this.f45089a;
            nqe.m160600f(bwc0.m104149b(giftTrayData, giftTrayData.m74169v(), LiveVChatGiftLayer.this.f45088e.m218414N2()));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.effect.LiveVChatGiftLayer$b */
    public class C12508b extends SVGAAnimListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GiftTrayData f45091a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BLiveEffect f45092b;

        public C12508b(GiftTrayData giftTrayData, BLiveEffect bLiveEffect) {
            this.f45091a = giftTrayData;
            this.f45092b = bLiveEffect;
        }

        @Override // com.immomo.svgaplayer.SVGAAnimListenerAdapter
        public void loadResError(String str) {
            super.loadResError(str);
            xdl0.m208344M(LiveVChatGiftLayer.this.f45085b, false);
            wrj.m205259y(this.f45092b, str, this.f45091a);
            nqe.m160615u(this.f45091a, false, LiveVChatGiftLayer.this.f45088e.m218414N2());
        }

        @Override // com.immomo.svgaplayer.SVGAAnimListenerAdapter, com.immomo.svgaplayer.listener.SVGACallback
        public void onFinished() {
            super.onFinished();
            xdl0.m208344M(LiveVChatGiftLayer.this.f45085b, false);
            wrj.m205258x(this.f45091a);
        }

        @Override // com.immomo.svgaplayer.SVGAAnimListenerAdapter, com.immomo.svgaplayer.listener.SVGACallback
        public void onStart() {
            super.onStart();
            xdl0.m208344M(LiveVChatGiftLayer.this.f45085b, true);
            wrj.m205260z(this.f45091a);
            nqe.m160615u(this.f45091a, true, LiveVChatGiftLayer.this.f45088e.m218414N2());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.effect.LiveVChatGiftLayer$c */
    public class C12509c implements RequestCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GiftTrayData f45094a;

        public C12509c(GiftTrayData giftTrayData) {
            this.f45094a = giftTrayData;
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onLoadFailed(@NotNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onResourceReady(@NotNull ResourceKey resourceKey, @NotNull Resource<?> resource) {
            LiveVChatGiftLayer.this.m69270u(this.f45094a, qau.m173776a(resource));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.effect.LiveVChatGiftLayer$d */
    public class C12510d extends SVGAAnimListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GiftTrayData f45096a;

        public C12510d(GiftTrayData giftTrayData) {
            this.f45096a = giftTrayData;
        }

        @Override // com.immomo.svgaplayer.SVGAAnimListenerAdapter
        public void loadResError(@NotNull String str) {
            super.loadResError(str);
            xdl0.m208344M(LiveVChatGiftLayer.this.f45085b, false);
            wrj.m205203J(this.f45096a, str);
            nqe.m160614t(this.f45096a, false, LiveVChatGiftLayer.this.f45088e.m218414N2());
        }

        @Override // com.immomo.svgaplayer.SVGAAnimListenerAdapter, com.immomo.svgaplayer.listener.SVGACallback
        public void onFinished() {
            super.onFinished();
            xdl0.m208344M(LiveVChatGiftLayer.this.f45085b, false);
            wrj.m205204K(this.f45096a);
        }

        @Override // com.immomo.svgaplayer.SVGAAnimListenerAdapter, com.immomo.svgaplayer.listener.SVGACallback
        public void onStart() {
            super.onStart();
            xdl0.m208344M(LiveVChatGiftLayer.this.f45085b, true);
            wrj.m205205L(this.f45096a);
            nqe.m160614t(this.f45096a, true, LiveVChatGiftLayer.this.f45088e.m218414N2());
        }
    }

    public LiveVChatGiftLayer(@NonNull Context context) {
        super(context);
    }

    @Override // p149l.s7m
    @androidx.annotation.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p149l.s7m
    public void destroy() {
        m69274y();
    }

    /* JADX INFO: renamed from: i */
    public final void m69261i(View view) {
        sku.m184618a(this, view);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final void m69262j(List<BLiveSpecialEffectResources> list, @androidx.annotation.Nullable List<Element> list2) {
        if (vwb.m200296J(list) || vwb.m200296J(list2)) {
            return;
        }
        HashMap map = new HashMap(list.size());
        for (BLiveSpecialEffectResources bLiveSpecialEffectResources : list) {
            map.put(bLiveSpecialEffectResources.f44438id, bLiveSpecialEffectResources);
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

    @Override // p149l.s7m
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(gmk0 gmk0Var) {
        this.f45088e = gmk0Var;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m69264l(BLiveEffect bLiveEffect, GiftTrayData giftTrayData) {
        wrj.m205207N(bLiveEffect, giftTrayData);
        if (this.f45088e == null) {
            return;
        }
        this.f45086c.stop();
        this.f45086c.setVisibility(8);
        nqe.m160615u(giftTrayData, true, this.f45088e.m218414N2());
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ boolean m69265m(GiftTrayData giftTrayData, int i, String str) {
        wrj.m205208O(i, str, giftTrayData);
        if (this.f45088e == null) {
            return false;
        }
        this.f45086c.stop();
        this.f45086c.setVisibility(8);
        nqe.m160615u(giftTrayData, false, this.f45088e.m218414N2());
        return false;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m69266n(final BLiveEffect bLiveEffect, final GiftTrayData giftTrayData, boolean z, q4l0 q4l0Var) {
        if (q4l0Var == null || this.f45086c == null) {
            wrj.m205198E(bLiveEffect, q4l0Var, this.f45086c, giftTrayData);
            nqe.m160615u(giftTrayData, false, this.f45088e.m218414N2());
            return;
        }
        if (z && !vwb.m200296J(q4l0Var.m172945b()) && NullChecker.m81303a(giftTrayData.f50076F) && !vwb.m200296J(giftTrayData.f50076F.videoEffectExtras)) {
            m69262j(giftTrayData.f50076F.videoEffectExtras, q4l0Var.m172945b());
            wrj.m205224c(bLiveEffect, giftTrayData);
        } else if (giftTrayData.f50081K && !vwb.m200296J(q4l0Var.m172945b()) && !vwb.m200296J(giftTrayData.f50083M)) {
            m69262j(giftTrayData.f50083M, q4l0Var.m172945b());
            wrj.m205224c(bLiveEffect, giftTrayData);
        }
        xdl0.m208344M(this.f45086c, true);
        this.f45086c.setVideoEffectConfig(new o4l0.C18841a().m162604c(q4l0Var).m162605d(o4l0.f141782j).m162603b(null).m162606e(new hjw()).m162602a());
        this.f45086c.prepare();
        this.f45086c.start();
        wrj.m205241k0(bLiveEffect, giftTrayData);
        this.f45086c.setOnPrepareListener(new InterfaceC3988d.d() { // from class: l.pku
            @Override // com.immomo.velib.player.InterfaceC3988d.d
            /* JADX INFO: renamed from: a */
            public final void mo19527a() {
                wrj.m205209P(bLiveEffect, giftTrayData);
            }
        });
        this.f45086c.setCompletionListener(new i7m() { // from class: l.qku
            @Override // p149l.i7m
            public final void onCompletion() {
                this.f155167a.m69264l(bLiveEffect, giftTrayData);
            }
        });
        this.f45086c.setOnErrorListener(new j7m() { // from class: l.rku
            @Override // p149l.j7m
            public final boolean onError(int i, String str) {
                return this.f159883a.m69265m(giftTrayData, i, str);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m69261i(this);
        this.f45086c.setRenderMode(2);
    }

    /* JADX INFO: renamed from: p */
    public final void m69267p(BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo) {
    }

    /* JADX INFO: renamed from: q */
    public void m69268q(GiftTrayData giftTrayData) {
        wrj.m205200G(giftTrayData);
        if (((idv) ypv.m215673l(fld0.f98147b)).m135634f()) {
            wrj.m205256v(giftTrayData);
            nqe.m160612r(giftTrayData, this.f45088e.m218414N2());
            return;
        }
        if (giftTrayData.m74165r()) {
            m69267p(giftTrayData.f50077G);
            return;
        }
        boolean z = NullChecker.m81303a(giftTrayData.f50076F) && giftTrayData.f50076F.enterVersion == 1;
        BLiveEffect bLiveEffectM98266h = aqe.m98261i().m98266h(z ? giftTrayData.f50085O : giftTrayData.f50119y);
        boolean zM127031W2 = this.f45088e.m127031W2(bLiveEffectM98266h, new C12507a(giftTrayData));
        nqe.m160591E(this.f45088e.m218414N2(), z ? giftTrayData.f50085O : giftTrayData.f50119y, !zM127031W2);
        if (!zM127031W2) {
            m69269s(giftTrayData);
            return;
        }
        if (uvr.m196087d().m162666E1() && ("svga".equals(bLiveEffectM98266h.type) || "video".equals(bLiveEffectM98266h.type))) {
            m69273x(bLiveEffectM98266h, giftTrayData);
            return;
        }
        if ("svga".equals(bLiveEffectM98266h.type)) {
            m69271v(bLiveEffectM98266h, giftTrayData);
        } else if ("video".equals(bLiveEffectM98266h.type)) {
            m69272w(bLiveEffectM98266h, giftTrayData, z);
        } else {
            "game".equals(bLiveEffectM98266h.type);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m69269s(GiftTrayData giftTrayData) {
        wrj.m205202I(giftTrayData);
        this.f45085b.clearInsertData();
        InsertImgBean insertImgBean = new InsertImgBean();
        insertImgBean.setKey("HeadisHere");
        insertImgBean.setType(2);
        insertImgBean.setImgUrl(giftTrayData.f50118x);
        this.f45085b.insertBean(insertImgBean);
        this.f45085b.setLayoutType(MomoLayUpSVGAImageView.LayoutType.ALIGN_PARENT_BOTTOM);
        SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/719775d5-33be-45b7-9d72-3eb7f6dffe9610.so").loadCallback(new C12509c(giftTrayData)).downloadOnly();
    }

    /* JADX INFO: renamed from: u */
    public final void m69270u(GiftTrayData giftTrayData, String str) {
        this.f45085b.startSVGAAnimWithJson(str, 1, (SVGAClickAreaListener) null, new C12510d(giftTrayData));
    }

    /* JADX INFO: renamed from: v */
    public final void m69271v(BLiveEffect bLiveEffect, GiftTrayData giftTrayData) {
        JSONObject jSONObject;
        if (this.f45085b == null) {
            return;
        }
        wrj.m205206M(bLiveEffect, giftTrayData);
        AbstractC18387m4 abstractC18387m4M185365d = spe.m185365d("svga");
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("templateUrl", abstractC18387m4M185365d.mo107443b(aqe.m98261i().m98266h(bLiveEffect.f44359id)));
            } catch (JSONException unused) {
                wrj.m205194A(bLiveEffect);
            }
        } catch (JSONException unused2) {
            jSONObject = null;
        }
        this.f45085b.startSVGAAnimWithLayJson(jSONObject.toString(), 1, null, new C12508b(giftTrayData, bLiveEffect));
    }

    /* JADX INFO: renamed from: w */
    public final void m69272w(final BLiveEffect bLiveEffect, final GiftTrayData giftTrayData, final boolean z) {
        wrj.m205211R(bLiveEffect, giftTrayData);
        this.f45086c.stop();
        ((f6l0) spe.m185365d("video")).m119628m(bLiveEffect.f44359id, bLiveEffect.hdType, bLiveEffect.zip, bLiveEffect.md5, new f6l0.InterfaceC16768a() { // from class: l.oku
            @Override // p149l.f6l0.InterfaceC16768a
            /* JADX INFO: renamed from: a */
            public final void mo100430a(q4l0 q4l0Var) {
                this.f144461a.m69266n(bLiveEffect, giftTrayData, z, q4l0Var);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public final void m69273x(BLiveEffect bLiveEffect, GiftTrayData giftTrayData) {
        wrj.m205211R(bLiveEffect, giftTrayData);
        fge.m121214r(this.f45087d, new dqe(bLiveEffect.f44359id).m113017k(giftTrayData.f50083M));
    }

    /* JADX INFO: renamed from: y */
    public void m69274y() {
        VideoEffectPlayer videoEffectPlayer = this.f45086c;
        if (videoEffectPlayer != null) {
            videoEffectPlayer.stop();
            xdl0.m208344M(this.f45086c, false);
        }
        MomoLayUpSVGAImageView momoLayUpSVGAImageView = this.f45085b;
        if (momoLayUpSVGAImageView != null) {
            momoLayUpSVGAImageView.stopAnimation(true);
            xdl0.m208344M(this.f45085b, false);
        }
        XEGiftView xEGiftView = this.f45087d;
        if (xEGiftView != null) {
            xEGiftView.m68844j();
            xdl0.m208344M(this.f45087d, false);
        }
    }

    /* JADX INFO: renamed from: z */
    public void m69275z() {
        VideoEffectPlayer videoEffectPlayer = this.f45086c;
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
