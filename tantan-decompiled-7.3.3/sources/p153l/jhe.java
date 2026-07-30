package p153l;

import androidx.annotation.Nullable;
import com.immomo.velib.anim.model.Element;
import com.momo.xeengine.gift.GiftEntity;
import com.momo.xeengine.gift.GiftPlayer;
import com.momo.xeengine.gift.GiftPlayerListener;
import com.momo.xeengine.gift.SVGAPositionType;
import com.momo.xeengine.gift.SVGAScaleType;
import com.p051p1.mobile.putong.live.base.data.BLiveDynamicEffectExtend;
import com.p051p1.mobile.putong.live.base.data.BLiveEffect;
import com.p051p1.mobile.putong.live.base.data.BLiveSpecialEffectResources;
import com.p051p1.mobile.putong.live.base.data.Priority;
import com.p051p1.mobile.putong.live.base.view.XEGiftView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
public class jhe extends AbstractC18340l4 {
    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m144894l(hre hreVar, x20 x20Var, Throwable th) {
        hreVar.m136818a();
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m144897r(final XEGiftView xEGiftView, final hre hreVar) {
        BLiveEffect bLiveEffectM207507b;
        if (xEGiftView == null || (bLiveEffectM207507b = wqe.m207507b(hreVar.m136824g(), new y20() { // from class: l.che
            @Override // p153l.y20
            public final void call(Object obj) {
                jhe.m144897r(xEGiftView, hreVar);
            }
        })) == null) {
            return;
        }
        jhe jheVar = (jhe) wqe.m207509d("dynamicGift");
        if (jheVar.m144900p(bLiveEffectM207507b, hreVar, new x20() { // from class: l.dhe
            @Override // p153l.x20
            public final void call() {
                jhe.m144897r(xEGiftView, hreVar);
            }
        })) {
            return;
        }
        String strMo144686b = jheVar.mo144686b(bLiveEffectM207507b);
        final GiftEntity giftEntity = new GiftEntity();
        giftEntity.setPath(strMo144686b);
        giftEntity.setPositionType(SVGAPositionType.BOTTOM);
        giftEntity.setScaleType(SVGAScaleType.ASPECT_FIT);
        giftEntity.setId(hreVar.m136824g());
        if (hreVar.m136820c() != null) {
            jyb.m147537z(hreVar.m136820c(), new y20() { // from class: l.ehe
                @Override // p153l.y20
                public final void call(Object obj) {
                    BLiveDynamicEffectExtend bLiveDynamicEffectExtend = (BLiveDynamicEffectExtend) obj;
                    giftEntity.setExtendValues(bLiveDynamicEffectExtend.key, bLiveDynamicEffectExtend.value);
                }
            });
        }
        xEGiftView.m70027j();
        xEGiftView.setTouchEnable(false);
        xEGiftView.setListener(new C17953a(xEGiftView, hreVar));
        bnl0.m105524M(xEGiftView, true);
        if (xEGiftView.isAttachedToWindow()) {
            xEGiftView.m70026i(giftEntity);
        } else {
            xEGiftView.post(new Runnable() { // from class: l.fhe
                @Override // java.lang.Runnable
                public final void run() {
                    xEGiftView.m70026i(giftEntity);
                }
            });
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m144898s(final XEGiftView xEGiftView, final hre hreVar) {
        BLiveEffect bLiveEffectM207507b;
        if (xEGiftView == null || (bLiveEffectM207507b = wqe.m207507b(hreVar.m136824g(), new y20() { // from class: l.bhe
            @Override // p153l.y20
            public final void call(Object obj) {
                jhe.m144897r(xEGiftView, hreVar);
            }
        })) == null) {
            return;
        }
        if (!xEGiftView.m70024g(((jhe) wqe.m207509d("dynamicGift")).mo144686b(bLiveEffectM207507b))) {
            m144897r(xEGiftView, hreVar);
        } else if (hreVar.m136820c() != null) {
            xEGiftView.m70028k(hreVar.m136820c());
        }
    }

    @Override // p153l.AbstractC18340l4
    /* JADX INFO: renamed from: b */
    public String mo144686b(BLiveEffect bLiveEffect) {
        return bLiveEffect == null ? "" : this.f129922a.m204921p(bLiveEffect.f45207id, bLiveEffect.hdType, bLiveEffect.zip);
    }

    @Override // p153l.AbstractC18340l4
    /* JADX INFO: renamed from: d */
    public boolean mo144687d(BLiveEffect bLiveEffect) {
        File fileM204920o = this.f129922a.m204920o(bLiveEffect.f45207id, bLiveEffect.hdType, bLiveEffect.zip);
        if (this.f129922a.m207494v(fileM204920o, bLiveEffect.f45207id)) {
            if (new File(udl0.m195497a(fileM204920o.getAbsolutePath())).exists()) {
                ere.m122146i().m122148e(bLiveEffect.f45207id);
                return true;
            }
            muj.m160219u("effect no config" + bLiveEffect.f45207id);
        }
        return false;
    }

    @Override // p153l.AbstractC18340l4
    /* JADX INFO: renamed from: f */
    public boolean mo144688f(String str, boolean z, w8e w8eVar, e4d0 e4d0Var) {
        BLiveEffect bLiveEffectM152743c = m152743c(str);
        if (bLiveEffectM152743c == null) {
            return false;
        }
        if (this.f129922a.m207494v(this.f129922a.m204920o(bLiveEffectM152743c.f45207id, bLiveEffectM152743c.hdType, bLiveEffectM152743c.zip), str)) {
            ere.m122146i().m122148e(str);
            return true;
        }
        if (z) {
            this.f129922a.m204911f(str, bLiveEffectM152743c.hdType, bLiveEffectM152743c.zip, bLiveEffectM152743c.md5, Priority.get("IMMEDIATE"), w8eVar, e4d0Var);
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public final ArrayList<BLiveDynamicEffectExtend> m144899o(List<BLiveSpecialEffectResources> list, @Nullable List<Element> list2) {
        if (jyb.m147479J(list) || jyb.m147479J(list2)) {
            return null;
        }
        HashMap map = new HashMap();
        for (BLiveSpecialEffectResources bLiveSpecialEffectResources : list) {
            map.put(bLiveSpecialEffectResources.f45286id, bLiveSpecialEffectResources);
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
        if (!jyb.m147479J(arrayList2)) {
            BLiveDynamicEffectExtend bLiveDynamicEffectExtendNew_ = BLiveDynamicEffectExtend.new_();
            bLiveDynamicEffectExtendNew_.key = "user_avatar";
            bLiveDynamicEffectExtendNew_.value = arrayList2;
            arrayList.add(bLiveDynamicEffectExtendNew_);
        }
        if (!jyb.m147479J(arrayList3)) {
            BLiveDynamicEffectExtend bLiveDynamicEffectExtendNew_2 = BLiveDynamicEffectExtend.new_();
            bLiveDynamicEffectExtendNew_2.key = "user_name";
            bLiveDynamicEffectExtendNew_2.value = arrayList3;
            arrayList.add(bLiveDynamicEffectExtendNew_2);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: p */
    public boolean m144900p(BLiveEffect bLiveEffect, final hre hreVar, final x20 x20Var) {
        if (!jyb.m147479J(hreVar.m136820c())) {
            hreVar.m136818a();
            return false;
        }
        if (jyb.m147479J(hreVar.m136821d())) {
            return false;
        }
        C22421c.just(this.f129922a.m204921p(bLiveEffect.f45207id, bLiveEffect.hdType, bLiveEffect.zip)).map(new ghe()).compose(psd0.m173592C()).subscribe(dhw.m115826e(new y20() { // from class: l.hhe
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f109879a.m144901q(hreVar, x20Var, (udl0) obj);
            }
        }, new y20() { // from class: l.ihe
            @Override // p153l.y20
            public final void call(Object obj) {
                jhe.m144894l(hreVar, x20Var, (Throwable) obj);
            }
        }));
        return true;
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m144901q(hre hreVar, x20 x20Var, udl0 udl0Var) {
        if (!jyb.m147479J(udl0Var.m195499b())) {
            hreVar.m136827j(m144899o(hreVar.m136821d(), udl0Var.m195499b()));
        }
        hreVar.m136818a();
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: l.jhe$a */
    public class C17953a implements GiftPlayerListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ XEGiftView f120967a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ hre f120968b;

        public C17953a(XEGiftView xEGiftView, hre hreVar) {
            this.f120967a = xEGiftView;
            this.f120968b = hreVar;
        }

        @Override // com.momo.xeengine.gift.GiftPlayerListener
        public void onGiftPlayCanceled(@NotNull GiftPlayer giftPlayer, @NotNull GiftEntity giftEntity) {
            this.f120967a.setVisibility(8);
            if (this.f120968b.m136822e() != null) {
                this.f120968b.m136822e().call();
            }
        }

        @Override // com.momo.xeengine.gift.GiftPlayerListener
        public void onGiftPlayFailed(@NotNull GiftPlayer giftPlayer, @NotNull GiftEntity giftEntity, int i, @NotNull String str) {
            this.f120967a.stop();
            this.f120967a.setVisibility(8);
            if (this.f120968b.m136822e() != null) {
                this.f120968b.m136822e().call();
            }
        }

        @Override // com.momo.xeengine.gift.GiftPlayerListener
        public void onGiftPlayFinished(@NotNull GiftPlayer giftPlayer, @NotNull GiftEntity giftEntity, @org.jetbrains.annotations.Nullable String str) {
            this.f120967a.setVisibility(8);
            if (this.f120968b.m136819b() != null) {
                this.f120968b.m136819b().call();
            }
        }

        @Override // com.momo.xeengine.gift.GiftPlayerListener
        public void onGiftPrepared(@NotNull GiftPlayer giftPlayer, @NotNull GiftEntity giftEntity) {
        }
    }
}
