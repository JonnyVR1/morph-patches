package p002l;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.immomo.svgaplayer.SVGAAnimListenerAdapter;
import com.immomo.svgaplayer.bean.InsertImgBean;
import com.immomo.svgaplayer.listener.SVGAClickAreaListener;
import com.immomo.svgaplayer.view.MomoLayUpSVGAImageView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.giftlayer.LiveGiftExtLayer;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import com.p1.mobile.putong.live.base.data.BLiveEffect;
import com.tantan.library.svga.ResourceKey;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.data.cache.Resource;
import com.tantan.library.svga.data.request.RequestCallback;
import com.tantan.library.svga.exception.SVGAException;
import l.qau;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ois {

    /* JADX INFO: renamed from: a */
    public MomoLayUpSVGAImageView f16631a;

    /* JADX INFO: renamed from: b */
    public LiveGiftExtLayer f16632b;

    /* JADX INFO: renamed from: l.ois$a */
    public class C0724a extends SVGAAnimListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GiftTrayData f16633a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f16634b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ BLiveEffect f16635c;

        public C0724a(GiftTrayData giftTrayData, boolean z, BLiveEffect bLiveEffect) {
            this.f16633a = giftTrayData;
            this.f16634b = z;
            this.f16635c = bLiveEffect;
        }

        public void loadResError(String str) {
            super.loadResError(str);
            xdl0.M(ois.this.f16631a, false);
            wrj.m25431y(this.f16635c, str, this.f16633a);
            nqe.m18966u(this.f16633a, false, this.f16634b);
            ois.this.f16632b.m7170a();
        }

        public void onFinished() {
            super.onFinished();
            xdl0.M(ois.this.f16631a, false);
            wrj.m25430x(this.f16633a);
            ois.this.f16632b.m7170a();
        }

        public void onStart() {
            super.onStart();
            xdl0.M(ois.this.f16631a, true);
            wrj.m25432z(this.f16633a);
            nqe.m18966u(this.f16633a, true, this.f16634b);
        }
    }

    /* JADX INFO: renamed from: l.ois$c */
    public class C0726c extends SVGAAnimListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GiftTrayData f16640a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f16641b;

        public C0726c(GiftTrayData giftTrayData, boolean z) {
            this.f16640a = giftTrayData;
            this.f16641b = z;
        }

        public void loadResError(@NotNull String str) {
            super.loadResError(str);
            xdl0.M(ois.this.f16631a, false);
            ois.this.m19561j();
            wrj.m25375J(this.f16640a, str);
            nqe.m18965t(this.f16640a, false, this.f16641b);
        }

        public void onFinished() {
            super.onFinished();
            xdl0.M(ois.this.f16631a, false);
            ois.this.m19561j();
            wrj.m25376K(this.f16640a);
        }

        public void onStart() {
            super.onStart();
            xdl0.M(ois.this.f16631a, true);
            wrj.m25377L(this.f16640a);
            nqe.m18965t(this.f16640a, true, this.f16641b);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m19554c(FrameLayout frameLayout, LiveGiftExtLayer liveGiftExtLayer) {
        this.f16632b = liveGiftExtLayer;
        if (this.f16631a == null) {
            this.f16631a = new MomoLayUpSVGAImageView(frameLayout.getContext());
        }
        if (this.f16631a.getParent() == null) {
            MomoLayUpSVGAImageView momoLayUpSVGAImageView = this.f16631a;
            int i = xdl0.e;
            frameLayout.addView((View) momoLayUpSVGAImageView, i, i);
            xdl0.M(this.f16631a, false);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m19555d() {
        MomoLayUpSVGAImageView momoLayUpSVGAImageView = this.f16631a;
        if (momoLayUpSVGAImageView != null) {
            xdl0.M(momoLayUpSVGAImageView, false);
        }
        m19561j();
    }

    /* JADX INFO: renamed from: e */
    public void m19556e(FrameLayout frameLayout, LiveGiftExtLayer liveGiftExtLayer, BLiveEffect bLiveEffect, GiftTrayData giftTrayData, boolean z) {
        m19554c(frameLayout, liveGiftExtLayer);
        m19560i(bLiveEffect, giftTrayData, z);
    }

    /* JADX INFO: renamed from: f */
    public void m19557f(FrameLayout frameLayout, LiveGiftExtLayer liveGiftExtLayer, GiftTrayData giftTrayData, boolean z) {
        m19554c(frameLayout, liveGiftExtLayer);
        m19558g(frameLayout.getContext(), giftTrayData, z);
    }

    /* JADX INFO: renamed from: g */
    public final void m19558g(Context context, GiftTrayData giftTrayData, boolean z) {
        wrj.m25374I(giftTrayData);
        this.f16631a.clearInsertData();
        InsertImgBean insertImgBean = new InsertImgBean();
        insertImgBean.setKey("HeadisHere");
        insertImgBean.setType(2);
        insertImgBean.setImgUrl(giftTrayData.f6160x);
        this.f16631a.insertBean(insertImgBean);
        this.f16631a.setLayoutType(MomoLayUpSVGAImageView.LayoutType.ALIGN_PARENT_BOTTOM);
        SVGALoader.with(context).from("https://auto.tancdn.com/v1/raw/719775d5-33be-45b7-9d72-3eb7f6dffe9610.so").loadCallback(new C0725b(giftTrayData, z)).downloadOnly();
    }

    /* JADX INFO: renamed from: h */
    public final void m19559h(GiftTrayData giftTrayData, String str, boolean z) {
        this.f16631a.startSVGAAnimWithJson(str, 1, (SVGAClickAreaListener) null, new C0726c(giftTrayData, z));
    }

    /* JADX INFO: renamed from: i */
    public final void m19560i(BLiveEffect bLiveEffect, GiftTrayData giftTrayData, boolean z) {
        JSONObject jSONObject;
        if (this.f16631a == null) {
            return;
        }
        wrj.m25378M(bLiveEffect, giftTrayData);
        AbstractC0675m4 abstractC0675m4M22604d = spe.m22604d("svga");
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("templateUrl", abstractC0675m4M22604d.mo11105b(aqe.m10039i().m10044h(bLiveEffect.id)));
            } catch (JSONException unused) {
                wrj.m25366A(bLiveEffect);
            }
        } catch (JSONException unused2) {
            jSONObject = null;
        }
        this.f16631a.startSVGAAnimWithLayJson(jSONObject.toString(), 1, (SVGAClickAreaListener) null, new C0724a(giftTrayData, z, bLiveEffect));
        this.f16632b.m7171b(giftTrayData.m7726e());
    }

    /* JADX INFO: renamed from: j */
    public void m19561j() {
    }

    /* JADX INFO: renamed from: l.ois$b */
    public class C0725b implements RequestCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GiftTrayData f16637a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f16638b;

        public C0725b(GiftTrayData giftTrayData, boolean z) {
            this.f16637a = giftTrayData;
            this.f16638b = z;
        }

        public void onResourceReady(@NotNull ResourceKey resourceKey, @NotNull Resource<?> resource) {
            ois.this.m19559h(this.f16637a, qau.a(resource), this.f16638b);
        }

        public void onLoadFailed(@NotNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
        }
    }
}
