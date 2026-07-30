package p149l;

import androidx.annotation.Nullable;
import com.immomo.velib.anim.model.Element;
import com.momo.xeengine.gift.GiftEntity;
import com.momo.xeengine.gift.GiftPlayer;
import com.momo.xeengine.gift.GiftPlayerListener;
import com.momo.xeengine.gift.SVGAPositionType;
import com.momo.xeengine.gift.SVGAScaleType;
import com.p046p1.mobile.putong.live.base.data.BLiveDynamicEffectExtend;
import com.p046p1.mobile.putong.live.base.data.BLiveEffect;
import com.p046p1.mobile.putong.live.base.data.BLiveSpecialEffectResources;
import com.p046p1.mobile.putong.live.base.data.Priority;
import com.p046p1.mobile.putong.live.base.view.XEGiftView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class fge extends AbstractC18387m4 {
    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m121211l(dqe dqeVar, d30 d30Var, Throwable th) {
        dqeVar.m113007a();
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m121214r(final XEGiftView xEGiftView, final dqe dqeVar) {
        BLiveEffect bLiveEffectM185363b;
        if (xEGiftView == null || (bLiveEffectM185363b = spe.m185363b(dqeVar.m113013g(), new e30() { // from class: l.yfe
            @Override // p149l.e30
            public final void call(Object obj) {
                fge.m121214r(xEGiftView, dqeVar);
            }
        })) == null) {
            return;
        }
        fge fgeVar = (fge) spe.m185365d("dynamicGift");
        if (fgeVar.m121217p(bLiveEffectM185363b, dqeVar, new d30() { // from class: l.zfe
            @Override // p149l.d30
            public final void call() {
                fge.m121214r(xEGiftView, dqeVar);
            }
        })) {
            return;
        }
        String strMo107443b = fgeVar.mo107443b(bLiveEffectM185363b);
        final GiftEntity giftEntity = new GiftEntity();
        giftEntity.setPath(strMo107443b);
        giftEntity.setPositionType(SVGAPositionType.BOTTOM);
        giftEntity.setScaleType(SVGAScaleType.ASPECT_FIT);
        giftEntity.setId(dqeVar.m113013g());
        if (dqeVar.m113009c() != null) {
            vwb.m200354z(dqeVar.m113009c(), new e30() { // from class: l.age
                @Override // p149l.e30
                public final void call(Object obj) {
                    BLiveDynamicEffectExtend bLiveDynamicEffectExtend = (BLiveDynamicEffectExtend) obj;
                    giftEntity.setExtendValues(bLiveDynamicEffectExtend.key, bLiveDynamicEffectExtend.value);
                }
            });
        }
        xEGiftView.m68844j();
        xEGiftView.setTouchEnable(false);
        xEGiftView.setListener(new C16819a(xEGiftView, dqeVar));
        xdl0.m208344M(xEGiftView, true);
        if (xEGiftView.isAttachedToWindow()) {
            xEGiftView.m68843i(giftEntity);
        } else {
            xEGiftView.post(new Runnable() { // from class: l.bge
                @Override // java.lang.Runnable
                public final void run() {
                    xEGiftView.m68843i(giftEntity);
                }
            });
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m121215s(final XEGiftView xEGiftView, final dqe dqeVar) {
        BLiveEffect bLiveEffectM185363b;
        if (xEGiftView == null || (bLiveEffectM185363b = spe.m185363b(dqeVar.m113013g(), new e30() { // from class: l.xfe
            @Override // p149l.e30
            public final void call(Object obj) {
                fge.m121214r(xEGiftView, dqeVar);
            }
        })) == null) {
            return;
        }
        if (!xEGiftView.m68841g(((fge) spe.m185365d("dynamicGift")).mo107443b(bLiveEffectM185363b))) {
            m121214r(xEGiftView, dqeVar);
        } else if (dqeVar.m113009c() != null) {
            xEGiftView.m68845k(dqeVar.m113009c());
        }
    }

    @Override // p149l.AbstractC18387m4
    /* JADX INFO: renamed from: b */
    public String mo107443b(BLiveEffect bLiveEffect) {
        return bLiveEffect == null ? "" : this.f131211a.m217259p(bLiveEffect.f44359id, bLiveEffect.hdType, bLiveEffect.zip);
    }

    @Override // p149l.AbstractC18387m4
    /* JADX INFO: renamed from: d */
    public boolean mo107444d(BLiveEffect bLiveEffect) {
        File fileM217258o = this.f131211a.m217258o(bLiveEffect.f44359id, bLiveEffect.hdType, bLiveEffect.zip);
        if (this.f131211a.m179253v(fileM217258o, bLiveEffect.f44359id)) {
            if (new File(q4l0.m172943a(fileM217258o.getAbsolutePath())).exists()) {
                aqe.m98261i().m98263e(bLiveEffect.f44359id);
                return true;
            }
            wrj.m205255u("effect no config" + bLiveEffect.f44359id);
        }
        return false;
    }

    @Override // p149l.AbstractC18387m4
    /* JADX INFO: renamed from: f */
    public boolean mo107445f(String str, boolean z, h7e h7eVar, bwc0 bwc0Var) {
        BLiveEffect bLiveEffectM152981c = m152981c(str);
        if (bLiveEffectM152981c == null) {
            return false;
        }
        if (this.f131211a.m179253v(this.f131211a.m217258o(bLiveEffectM152981c.f44359id, bLiveEffectM152981c.hdType, bLiveEffectM152981c.zip), str)) {
            aqe.m98261i().m98263e(str);
            return true;
        }
        if (z) {
            this.f131211a.m217251f(str, bLiveEffectM152981c.hdType, bLiveEffectM152981c.zip, bLiveEffectM152981c.md5, Priority.get("IMMEDIATE"), h7eVar, bwc0Var);
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public final ArrayList<BLiveDynamicEffectExtend> m121216o(List<BLiveSpecialEffectResources> list, @Nullable List<Element> list2) {
        if (vwb.m200296J(list) || vwb.m200296J(list2)) {
            return null;
        }
        HashMap map = new HashMap();
        for (BLiveSpecialEffectResources bLiveSpecialEffectResources : list) {
            map.put(bLiveSpecialEffectResources.f44438id, bLiveSpecialEffectResources);
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
        if (!vwb.m200296J(arrayList2)) {
            BLiveDynamicEffectExtend bLiveDynamicEffectExtendNew_ = BLiveDynamicEffectExtend.new_();
            bLiveDynamicEffectExtendNew_.key = "user_avatar";
            bLiveDynamicEffectExtendNew_.value = arrayList2;
            arrayList.add(bLiveDynamicEffectExtendNew_);
        }
        if (!vwb.m200296J(arrayList3)) {
            BLiveDynamicEffectExtend bLiveDynamicEffectExtendNew_2 = BLiveDynamicEffectExtend.new_();
            bLiveDynamicEffectExtendNew_2.key = "user_name";
            bLiveDynamicEffectExtendNew_2.value = arrayList3;
            arrayList.add(bLiveDynamicEffectExtendNew_2);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: p */
    public boolean m121217p(BLiveEffect bLiveEffect, final dqe dqeVar, final d30 d30Var) {
        if (!vwb.m200296J(dqeVar.m113009c())) {
            dqeVar.m113007a();
            return false;
        }
        if (vwb.m200296J(dqeVar.m113010d())) {
            return false;
        }
        C22306c.just(this.f131211a.m217259p(bLiveEffect.f44359id, bLiveEffect.hdType, bLiveEffect.zip)).map(new cge()).compose(mkd0.m154951C()).subscribe(ffw.m121194e(new e30() { // from class: l.dge
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f86073a.m121218q(dqeVar, d30Var, (q4l0) obj);
            }
        }, new e30() { // from class: l.ege
            @Override // p149l.e30
            public final void call(Object obj) {
                fge.m121211l(dqeVar, d30Var, (Throwable) obj);
            }
        }));
        return true;
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m121218q(dqe dqeVar, d30 d30Var, q4l0 q4l0Var) {
        if (!vwb.m200296J(q4l0Var.m172945b())) {
            dqeVar.m113016j(m121216o(dqeVar.m113010d(), q4l0Var.m172945b()));
        }
        dqeVar.m113007a();
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: l.fge$a */
    public class C16819a implements GiftPlayerListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ XEGiftView f97354a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ dqe f97355b;

        public C16819a(XEGiftView xEGiftView, dqe dqeVar) {
            this.f97354a = xEGiftView;
            this.f97355b = dqeVar;
        }

        @Override // com.momo.xeengine.gift.GiftPlayerListener
        public void onGiftPlayCanceled(@NotNull GiftPlayer giftPlayer, @NotNull GiftEntity giftEntity) {
            this.f97354a.setVisibility(8);
            if (this.f97355b.m113011e() != null) {
                this.f97355b.m113011e().call();
            }
        }

        @Override // com.momo.xeengine.gift.GiftPlayerListener
        public void onGiftPlayFailed(@NotNull GiftPlayer giftPlayer, @NotNull GiftEntity giftEntity, int i, @NotNull String str) {
            this.f97354a.stop();
            this.f97354a.setVisibility(8);
            if (this.f97355b.m113011e() != null) {
                this.f97355b.m113011e().call();
            }
        }

        @Override // com.momo.xeengine.gift.GiftPlayerListener
        public void onGiftPlayFinished(@NotNull GiftPlayer giftPlayer, @NotNull GiftEntity giftEntity, @org.jetbrains.annotations.Nullable String str) {
            this.f97354a.setVisibility(8);
            if (this.f97355b.m113008b() != null) {
                this.f97355b.m113008b().call();
            }
        }

        @Override // com.momo.xeengine.gift.GiftPlayerListener
        public void onGiftPrepared(@NotNull GiftPlayer giftPlayer, @NotNull GiftEntity giftEntity) {
        }
    }
}
