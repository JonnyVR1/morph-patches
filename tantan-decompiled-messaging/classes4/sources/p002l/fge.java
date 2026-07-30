package p002l;

import androidx.annotation.Nullable;
import com.immomo.velib.anim.model.Element;
import com.momo.xeengine.gift.GiftEntity;
import com.momo.xeengine.gift.GiftPlayer;
import com.momo.xeengine.gift.GiftPlayerListener;
import com.momo.xeengine.gift.SVGAPositionType;
import com.momo.xeengine.gift.SVGAScaleType;
import com.p1.mobile.putong.live.base.data.BLiveDynamicEffectExtend;
import com.p1.mobile.putong.live.base.data.BLiveEffect;
import com.p1.mobile.putong.live.base.data.BLiveSpecialEffectResources;
import com.p1.mobile.putong.live.base.data.Priority;
import com.p1.mobile.putong.live.base.view.XEGiftView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import l.d30;
import l.e30;
import l.ffw;
import l.mkd0;
import l.q4l0;
import l.vwb;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class fge extends AbstractC0675m4 {
    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m13163l(dqe dqeVar, d30 d30Var, Throwable th) {
        dqeVar.m11979a();
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m13166r(final XEGiftView xEGiftView, final dqe dqeVar) {
        BLiveEffect bLiveEffectM22602b;
        if (xEGiftView == null || (bLiveEffectM22602b = spe.m22602b(dqeVar.m11985g(), new e30() { // from class: l.yfe
            public final void call(Object obj) {
                fge.m13166r(xEGiftView, dqeVar);
            }
        })) == null) {
            return;
        }
        fge fgeVar = (fge) spe.m22604d("dynamicGift");
        if (fgeVar.m13169p(bLiveEffectM22602b, dqeVar, new d30() { // from class: l.zfe
            public final void call() {
                fge.m13166r(xEGiftView, dqeVar);
            }
        })) {
            return;
        }
        String strMo11105b = fgeVar.mo11105b(bLiveEffectM22602b);
        final GiftEntity giftEntity = new GiftEntity();
        giftEntity.setPath(strMo11105b);
        giftEntity.setPositionType(SVGAPositionType.BOTTOM);
        giftEntity.setScaleType(SVGAScaleType.ASPECT_FIT);
        giftEntity.setId(dqeVar.m11985g());
        if (dqeVar.m11981c() != null) {
            vwb.z(dqeVar.m11981c(), new e30() { // from class: l.age
                public final void call(Object obj) {
                    BLiveDynamicEffectExtend bLiveDynamicEffectExtend = (BLiveDynamicEffectExtend) obj;
                    giftEntity.setExtendValues(bLiveDynamicEffectExtend.key, bLiveDynamicEffectExtend.value);
                }
            });
        }
        xEGiftView.j();
        xEGiftView.setTouchEnable(false);
        xEGiftView.setListener(new C0565a(xEGiftView, dqeVar));
        xdl0.M(xEGiftView, true);
        if (xEGiftView.isAttachedToWindow()) {
            xEGiftView.i(giftEntity);
        } else {
            xEGiftView.post(new Runnable() { // from class: l.bge
                @Override // java.lang.Runnable
                public final void run() {
                    xEGiftView.i(giftEntity);
                }
            });
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m13167s(final XEGiftView xEGiftView, final dqe dqeVar) {
        BLiveEffect bLiveEffectM22602b;
        if (xEGiftView == null || (bLiveEffectM22602b = spe.m22602b(dqeVar.m11985g(), new e30() { // from class: l.xfe
            public final void call(Object obj) {
                fge.m13166r(xEGiftView, dqeVar);
            }
        })) == null) {
            return;
        }
        if (!xEGiftView.g(((fge) spe.m22604d("dynamicGift")).mo11105b(bLiveEffectM22602b))) {
            m13166r(xEGiftView, dqeVar);
        } else if (dqeVar.m11981c() != null) {
            xEGiftView.k(dqeVar.m11981c());
        }
    }

    @Override // p002l.AbstractC0675m4
    /* JADX INFO: renamed from: b */
    public String mo11105b(BLiveEffect bLiveEffect) {
        return bLiveEffect == null ? "" : this.f15228a.m27091p(bLiveEffect.id, bLiveEffect.hdType, bLiveEffect.zip);
    }

    @Override // p002l.AbstractC0675m4
    /* JADX INFO: renamed from: d */
    public boolean mo11106d(BLiveEffect bLiveEffect) {
        File fileM27090o = this.f15228a.m27090o(bLiveEffect.id, bLiveEffect.hdType, bLiveEffect.zip);
        if (this.f15228a.m21933v(fileM27090o, bLiveEffect.id)) {
            if (new File(q4l0.a(fileM27090o.getAbsolutePath())).exists()) {
                aqe.m10039i().m10041e(bLiveEffect.id);
                return true;
            }
            wrj.m25427u("effect no config" + bLiveEffect.id);
        }
        return false;
    }

    @Override // p002l.AbstractC0675m4
    /* JADX INFO: renamed from: f */
    public boolean mo11107f(String str, boolean z, h7e h7eVar, bwc0 bwc0Var) {
        BLiveEffect bLiveEffectM17694c = m17694c(str);
        if (bLiveEffectM17694c == null) {
            return false;
        }
        if (this.f15228a.m21933v(this.f15228a.m27090o(bLiveEffectM17694c.id, bLiveEffectM17694c.hdType, bLiveEffectM17694c.zip), str)) {
            aqe.m10039i().m10041e(str);
            return true;
        }
        if (z) {
            this.f15228a.m27083f(str, bLiveEffectM17694c.hdType, bLiveEffectM17694c.zip, bLiveEffectM17694c.md5, Priority.get("IMMEDIATE"), h7eVar, bwc0Var);
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public final ArrayList<BLiveDynamicEffectExtend> m13168o(List<BLiveSpecialEffectResources> list, @Nullable List<Element> list2) {
        if (vwb.J(list) || vwb.J(list2)) {
            return null;
        }
        HashMap map = new HashMap();
        for (BLiveSpecialEffectResources bLiveSpecialEffectResources : list) {
            map.put(bLiveSpecialEffectResources.id, bLiveSpecialEffectResources);
        }
        ArrayList<BLiveDynamicEffectExtend> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator<Element> it = list2.iterator();
        while (it.hasNext()) {
            String id = it.next().getId();
            if (id != null) {
                BLiveSpecialEffectResources bLiveSpecialEffectResources2 = (BLiveSpecialEffectResources) map.get(id);
                if (map.containsKey(id) && bLiveSpecialEffectResources2 != null) {
                    if (bLiveSpecialEffectResources2.typeIsImageUrl()) {
                        arrayList2.add(bLiveSpecialEffectResources2.value);
                    } else if (bLiveSpecialEffectResources2.typeIsText()) {
                        arrayList3.add(bLiveSpecialEffectResources2.value);
                    }
                }
            }
        }
        if (!vwb.J(arrayList2)) {
            BLiveDynamicEffectExtend bLiveDynamicEffectExtendNew_ = BLiveDynamicEffectExtend.new_();
            bLiveDynamicEffectExtendNew_.key = "user_avatar";
            bLiveDynamicEffectExtendNew_.value = arrayList2;
            arrayList.add(bLiveDynamicEffectExtendNew_);
        }
        if (!vwb.J(arrayList3)) {
            BLiveDynamicEffectExtend bLiveDynamicEffectExtendNew_2 = BLiveDynamicEffectExtend.new_();
            bLiveDynamicEffectExtendNew_2.key = "user_name";
            bLiveDynamicEffectExtendNew_2.value = arrayList3;
            arrayList.add(bLiveDynamicEffectExtendNew_2);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: p */
    public boolean m13169p(BLiveEffect bLiveEffect, final dqe dqeVar, final d30 d30Var) {
        if (!vwb.J(dqeVar.m11981c())) {
            dqeVar.m11979a();
            return false;
        }
        if (vwb.J(dqeVar.m11982d())) {
            return false;
        }
        c.just(this.f15228a.m27091p(bLiveEffect.id, bLiveEffect.hdType, bLiveEffect.zip)).map(new cge()).compose(mkd0.C()).subscribe(ffw.e(new e30() { // from class: l.dge
            public final void call(Object obj) {
                this.f9215a.m13170q(dqeVar, d30Var, (q4l0) obj);
            }
        }, new e30() { // from class: l.ege
            public final void call(Object obj) {
                fge.m13163l(dqeVar, d30Var, (Throwable) obj);
            }
        }));
        return true;
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m13170q(dqe dqeVar, d30 d30Var, q4l0 q4l0Var) {
        if (!vwb.J(q4l0Var.b())) {
            dqeVar.m11988j(m13168o(dqeVar.m11982d(), q4l0Var.b()));
        }
        dqeVar.m11979a();
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: l.fge$a */
    public class C0565a implements GiftPlayerListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ XEGiftView f10332a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ dqe f10333b;

        public C0565a(XEGiftView xEGiftView, dqe dqeVar) {
            this.f10332a = xEGiftView;
            this.f10333b = dqeVar;
        }

        public void onGiftPlayCanceled(@NotNull GiftPlayer giftPlayer, @NotNull GiftEntity giftEntity) {
            this.f10332a.setVisibility(8);
            if (this.f10333b.m11983e() != null) {
                this.f10333b.m11983e().call();
            }
        }

        public void onGiftPlayFailed(@NotNull GiftPlayer giftPlayer, @NotNull GiftEntity giftEntity, int i, @NotNull String str) {
            this.f10332a.stop();
            this.f10332a.setVisibility(8);
            if (this.f10333b.m11983e() != null) {
                this.f10333b.m11983e().call();
            }
        }

        public void onGiftPlayFinished(@NotNull GiftPlayer giftPlayer, @NotNull GiftEntity giftEntity, @org.jetbrains.annotations.Nullable String str) {
            this.f10332a.setVisibility(8);
            if (this.f10333b.m11980b() != null) {
                this.f10333b.m11980b().call();
            }
        }

        public void onGiftPrepared(@NotNull GiftPlayer giftPlayer, @NotNull GiftEntity giftEntity) {
        }
    }
}
