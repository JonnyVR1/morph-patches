package p149l;

import android.content.Context;
import android.widget.FrameLayout;
import com.immomo.svgaplayer.SVGAAnimListenerAdapter;
import com.immomo.svgaplayer.bean.InsertImgBean;
import com.immomo.svgaplayer.listener.SVGAClickAreaListener;
import com.immomo.svgaplayer.view.MomoLayUpSVGAImageView;
import com.p046p1.mobile.putong.live.base.data.BLiveEffect;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.giftlayer.LiveGiftExtLayer;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import com.tantan.library.svga.ResourceKey;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.data.cache.Resource;
import com.tantan.library.svga.data.request.RequestCallback;
import com.tantan.library.svga.exception.SVGAException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class ois {

    /* JADX INFO: renamed from: a */
    public MomoLayUpSVGAImageView f144173a;

    /* JADX INFO: renamed from: b */
    public LiveGiftExtLayer f144174b;

    /* JADX INFO: renamed from: l.ois$a */
    public class C18950a extends SVGAAnimListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GiftTrayData f144175a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f144176b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ BLiveEffect f144177c;

        public C18950a(GiftTrayData giftTrayData, boolean z, BLiveEffect bLiveEffect) {
            this.f144175a = giftTrayData;
            this.f144176b = z;
            this.f144177c = bLiveEffect;
        }

        @Override // com.immomo.svgaplayer.SVGAAnimListenerAdapter
        public void loadResError(String str) {
            super.loadResError(str);
            xdl0.m208344M(ois.this.f144173a, false);
            wrj.m205259y(this.f144177c, str, this.f144175a);
            nqe.m160615u(this.f144175a, false, this.f144176b);
            ois.this.f144174b.m73624a();
        }

        @Override // com.immomo.svgaplayer.SVGAAnimListenerAdapter, com.immomo.svgaplayer.listener.SVGACallback
        public void onFinished() {
            super.onFinished();
            xdl0.m208344M(ois.this.f144173a, false);
            wrj.m205258x(this.f144175a);
            ois.this.f144174b.m73624a();
        }

        @Override // com.immomo.svgaplayer.SVGAAnimListenerAdapter, com.immomo.svgaplayer.listener.SVGACallback
        public void onStart() {
            super.onStart();
            xdl0.m208344M(ois.this.f144173a, true);
            wrj.m205260z(this.f144175a);
            nqe.m160615u(this.f144175a, true, this.f144176b);
        }
    }

    /* JADX INFO: renamed from: l.ois$c */
    public class C18952c extends SVGAAnimListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GiftTrayData f144182a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f144183b;

        public C18952c(GiftTrayData giftTrayData, boolean z) {
            this.f144182a = giftTrayData;
            this.f144183b = z;
        }

        @Override // com.immomo.svgaplayer.SVGAAnimListenerAdapter
        public void loadResError(@NotNull String str) {
            super.loadResError(str);
            xdl0.m208344M(ois.this.f144173a, false);
            ois.this.m164565j();
            wrj.m205203J(this.f144182a, str);
            nqe.m160614t(this.f144182a, false, this.f144183b);
        }

        @Override // com.immomo.svgaplayer.SVGAAnimListenerAdapter, com.immomo.svgaplayer.listener.SVGACallback
        public void onFinished() {
            super.onFinished();
            xdl0.m208344M(ois.this.f144173a, false);
            ois.this.m164565j();
            wrj.m205204K(this.f144182a);
        }

        @Override // com.immomo.svgaplayer.SVGAAnimListenerAdapter, com.immomo.svgaplayer.listener.SVGACallback
        public void onStart() {
            super.onStart();
            xdl0.m208344M(ois.this.f144173a, true);
            wrj.m205205L(this.f144182a);
            nqe.m160614t(this.f144182a, true, this.f144183b);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m164558c(FrameLayout frameLayout, LiveGiftExtLayer liveGiftExtLayer) {
        this.f144174b = liveGiftExtLayer;
        if (this.f144173a == null) {
            this.f144173a = new MomoLayUpSVGAImageView(frameLayout.getContext());
        }
        if (this.f144173a.getParent() == null) {
            MomoLayUpSVGAImageView momoLayUpSVGAImageView = this.f144173a;
            int i = xdl0.f192403e;
            frameLayout.addView(momoLayUpSVGAImageView, i, i);
            xdl0.m208344M(this.f144173a, false);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m164559d() {
        MomoLayUpSVGAImageView momoLayUpSVGAImageView = this.f144173a;
        if (momoLayUpSVGAImageView != null) {
            xdl0.m208344M(momoLayUpSVGAImageView, false);
        }
        m164565j();
    }

    /* JADX INFO: renamed from: e */
    public void m164560e(FrameLayout frameLayout, LiveGiftExtLayer liveGiftExtLayer, BLiveEffect bLiveEffect, GiftTrayData giftTrayData, boolean z) {
        m164558c(frameLayout, liveGiftExtLayer);
        m164564i(bLiveEffect, giftTrayData, z);
    }

    /* JADX INFO: renamed from: f */
    public void m164561f(FrameLayout frameLayout, LiveGiftExtLayer liveGiftExtLayer, GiftTrayData giftTrayData, boolean z) {
        m164558c(frameLayout, liveGiftExtLayer);
        m164562g(frameLayout.getContext(), giftTrayData, z);
    }

    /* JADX INFO: renamed from: g */
    public final void m164562g(Context context, GiftTrayData giftTrayData, boolean z) {
        wrj.m205202I(giftTrayData);
        this.f144173a.clearInsertData();
        InsertImgBean insertImgBean = new InsertImgBean();
        insertImgBean.setKey("HeadisHere");
        insertImgBean.setType(2);
        insertImgBean.setImgUrl(giftTrayData.f50118x);
        this.f144173a.insertBean(insertImgBean);
        this.f144173a.setLayoutType(MomoLayUpSVGAImageView.LayoutType.ALIGN_PARENT_BOTTOM);
        SVGALoader.with(context).from("https://auto.tancdn.com/v1/raw/719775d5-33be-45b7-9d72-3eb7f6dffe9610.so").loadCallback(new C18951b(giftTrayData, z)).downloadOnly();
    }

    /* JADX INFO: renamed from: h */
    public final void m164563h(GiftTrayData giftTrayData, String str, boolean z) {
        this.f144173a.startSVGAAnimWithJson(str, 1, (SVGAClickAreaListener) null, new C18952c(giftTrayData, z));
    }

    /* JADX INFO: renamed from: i */
    public final void m164564i(BLiveEffect bLiveEffect, GiftTrayData giftTrayData, boolean z) {
        JSONObject jSONObject;
        if (this.f144173a == null) {
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
        this.f144173a.startSVGAAnimWithLayJson(jSONObject.toString(), 1, null, new C18950a(giftTrayData, z, bLiveEffect));
        this.f144174b.m73625b(giftTrayData.m74161e());
    }

    /* JADX INFO: renamed from: j */
    public void m164565j() {
    }

    /* JADX INFO: renamed from: l.ois$b */
    public class C18951b implements RequestCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GiftTrayData f144179a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f144180b;

        public C18951b(GiftTrayData giftTrayData, boolean z) {
            this.f144179a = giftTrayData;
            this.f144180b = z;
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onResourceReady(@NotNull ResourceKey resourceKey, @NotNull Resource<?> resource) {
            ois.this.m164563h(this.f144179a, qau.m173776a(resource), this.f144180b);
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onLoadFailed(@NotNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
        }
    }
}
