package p153l;

import android.content.Context;
import android.widget.FrameLayout;
import com.immomo.svgaplayer.SVGAAnimListenerAdapter;
import com.immomo.svgaplayer.bean.InsertImgBean;
import com.immomo.svgaplayer.listener.SVGAClickAreaListener;
import com.immomo.svgaplayer.view.MomoLayUpSVGAImageView;
import com.p051p1.mobile.putong.live.base.data.BLiveEffect;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.giftlayer.LiveGiftExtLayer;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
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
public class pks {

    /* JADX INFO: renamed from: a */
    public MomoLayUpSVGAImageView f152942a;

    /* JADX INFO: renamed from: b */
    public LiveGiftExtLayer f152943b;

    /* JADX INFO: renamed from: l.pks$a */
    public class C19389a extends SVGAAnimListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GiftTrayData f152944a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f152945b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ BLiveEffect f152946c;

        public C19389a(GiftTrayData giftTrayData, boolean z, BLiveEffect bLiveEffect) {
            this.f152944a = giftTrayData;
            this.f152945b = z;
            this.f152946c = bLiveEffect;
        }

        @Override // com.immomo.svgaplayer.SVGAAnimListenerAdapter
        public void loadResError(String str) {
            super.loadResError(str);
            bnl0.m105524M(pks.this.f152942a, false);
            muj.m160223y(this.f152946c, str, this.f152944a);
            rre.m182749u(this.f152944a, false, this.f152945b);
            pks.this.f152943b.m74807a();
        }

        @Override // com.immomo.svgaplayer.SVGAAnimListenerAdapter, com.immomo.svgaplayer.listener.SVGACallback
        public void onFinished() {
            super.onFinished();
            bnl0.m105524M(pks.this.f152942a, false);
            muj.m160222x(this.f152944a);
            pks.this.f152943b.m74807a();
        }

        @Override // com.immomo.svgaplayer.SVGAAnimListenerAdapter, com.immomo.svgaplayer.listener.SVGACallback
        public void onStart() {
            super.onStart();
            bnl0.m105524M(pks.this.f152942a, true);
            muj.m160224z(this.f152944a);
            rre.m182749u(this.f152944a, true, this.f152945b);
        }
    }

    /* JADX INFO: renamed from: l.pks$c */
    public class C19391c extends SVGAAnimListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GiftTrayData f152951a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f152952b;

        public C19391c(GiftTrayData giftTrayData, boolean z) {
            this.f152951a = giftTrayData;
            this.f152952b = z;
        }

        @Override // com.immomo.svgaplayer.SVGAAnimListenerAdapter
        public void loadResError(@NotNull String str) {
            super.loadResError(str);
            bnl0.m105524M(pks.this.f152942a, false);
            pks.this.m172763j();
            muj.m160167J(this.f152951a, str);
            rre.m182748t(this.f152951a, false, this.f152952b);
        }

        @Override // com.immomo.svgaplayer.SVGAAnimListenerAdapter, com.immomo.svgaplayer.listener.SVGACallback
        public void onFinished() {
            super.onFinished();
            bnl0.m105524M(pks.this.f152942a, false);
            pks.this.m172763j();
            muj.m160168K(this.f152951a);
        }

        @Override // com.immomo.svgaplayer.SVGAAnimListenerAdapter, com.immomo.svgaplayer.listener.SVGACallback
        public void onStart() {
            super.onStart();
            bnl0.m105524M(pks.this.f152942a, true);
            muj.m160169L(this.f152951a);
            rre.m182748t(this.f152951a, true, this.f152952b);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m172756c(FrameLayout frameLayout, LiveGiftExtLayer liveGiftExtLayer) {
        this.f152943b = liveGiftExtLayer;
        if (this.f152942a == null) {
            this.f152942a = new MomoLayUpSVGAImageView(frameLayout.getContext());
        }
        if (this.f152942a.getParent() == null) {
            MomoLayUpSVGAImageView momoLayUpSVGAImageView = this.f152942a;
            int i = bnl0.f77544e;
            frameLayout.addView(momoLayUpSVGAImageView, i, i);
            bnl0.m105524M(this.f152942a, false);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m172757d() {
        MomoLayUpSVGAImageView momoLayUpSVGAImageView = this.f152942a;
        if (momoLayUpSVGAImageView != null) {
            bnl0.m105524M(momoLayUpSVGAImageView, false);
        }
        m172763j();
    }

    /* JADX INFO: renamed from: e */
    public void m172758e(FrameLayout frameLayout, LiveGiftExtLayer liveGiftExtLayer, BLiveEffect bLiveEffect, GiftTrayData giftTrayData, boolean z) {
        m172756c(frameLayout, liveGiftExtLayer);
        m172762i(bLiveEffect, giftTrayData, z);
    }

    /* JADX INFO: renamed from: f */
    public void m172759f(FrameLayout frameLayout, LiveGiftExtLayer liveGiftExtLayer, GiftTrayData giftTrayData, boolean z) {
        m172756c(frameLayout, liveGiftExtLayer);
        m172760g(frameLayout.getContext(), giftTrayData, z);
    }

    /* JADX INFO: renamed from: g */
    public final void m172760g(Context context, GiftTrayData giftTrayData, boolean z) {
        muj.m160166I(giftTrayData);
        this.f152942a.clearInsertData();
        InsertImgBean insertImgBean = new InsertImgBean();
        insertImgBean.setKey("HeadisHere");
        insertImgBean.setType(2);
        insertImgBean.setImgUrl(giftTrayData.f50966x);
        this.f152942a.insertBean(insertImgBean);
        this.f152942a.setLayoutType(MomoLayUpSVGAImageView.LayoutType.ALIGN_PARENT_BOTTOM);
        SVGALoader.with(context).from("https://auto.tancdn.com/v1/raw/719775d5-33be-45b7-9d72-3eb7f6dffe9610.so").loadCallback(new C19390b(giftTrayData, z)).downloadOnly();
    }

    /* JADX INFO: renamed from: h */
    public final void m172761h(GiftTrayData giftTrayData, String str, boolean z) {
        this.f152942a.startSVGAAnimWithJson(str, 1, (SVGAClickAreaListener) null, new C19391c(giftTrayData, z));
    }

    /* JADX INFO: renamed from: i */
    public final void m172762i(BLiveEffect bLiveEffect, GiftTrayData giftTrayData, boolean z) {
        JSONObject jSONObject;
        if (this.f152942a == null) {
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
        this.f152942a.startSVGAAnimWithLayJson(jSONObject.toString(), 1, null, new C19389a(giftTrayData, z, bLiveEffect));
        this.f152943b.m74808b(giftTrayData.m75344e());
    }

    /* JADX INFO: renamed from: j */
    public void m172763j() {
    }

    /* JADX INFO: renamed from: l.pks$b */
    public class C19390b implements RequestCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GiftTrayData f152948a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f152949b;

        public C19390b(GiftTrayData giftTrayData, boolean z) {
            this.f152948a = giftTrayData;
            this.f152949b = z;
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onResourceReady(@NotNull ResourceKey resourceKey, @NotNull Resource<?> resource) {
            pks.this.m172761h(this.f152948a, rcu.m180823a(resource), this.f152949b);
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onLoadFailed(@NotNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
        }
    }
}
