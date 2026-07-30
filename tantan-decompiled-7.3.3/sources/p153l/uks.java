package p153l;

import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.immomo.velib.anim.model.Element;
import com.immomo.velib.player.InterfaceC4139d;
import com.p051p1.mobile.putong.live.base.data.BLiveEffect;
import com.p051p1.mobile.putong.live.base.data.BLiveSpecialEffectResources;
import com.p051p1.mobile.putong.live.base.mmsdk.effect.video.VideoEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.giftlayer.LiveGiftExtLayer;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class uks {

    /* JADX INFO: renamed from: a */
    public VideoEffectPlayer f179451a;

    /* JADX INFO: renamed from: b */
    public LiveGiftExtLayer f179452b;

    /* JADX INFO: renamed from: e */
    public final void m196518e(List<BLiveSpecialEffectResources> list, @Nullable List<Element> list2) {
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

    /* JADX INFO: renamed from: f */
    public final void m196519f(FrameLayout frameLayout, LiveGiftExtLayer liveGiftExtLayer) {
        this.f179452b = liveGiftExtLayer;
        if (this.f179451a == null) {
            VideoEffectPlayer videoEffectPlayer = new VideoEffectPlayer(frameLayout.getContext());
            this.f179451a = videoEffectPlayer;
            videoEffectPlayer.setRenderMode(2);
        }
        if (this.f179451a.getParent() == null) {
            VideoEffectPlayer videoEffectPlayer2 = this.f179451a;
            int i = bnl0.f77544e;
            frameLayout.addView(videoEffectPlayer2, i, i);
            bnl0.m105524M(this.f179451a, false);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m196520g() {
        VideoEffectPlayer videoEffectPlayer = this.f179451a;
        if (videoEffectPlayer != null) {
            bnl0.m105524M(videoEffectPlayer, false);
            this.f179451a.stop();
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m196521h(BLiveEffect bLiveEffect, GiftTrayData giftTrayData, boolean z) {
        muj.m160171N(bLiveEffect, giftTrayData);
        VideoEffectPlayer videoEffectPlayer = this.f179451a;
        if (videoEffectPlayer == null) {
            return;
        }
        videoEffectPlayer.stop();
        bnl0.m105524M(this.f179451a, false);
        this.f179452b.m74807a();
        rre.m182749u(giftTrayData, true, z);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean m196522i(GiftTrayData giftTrayData, boolean z, int i, String str) {
        muj.m160172O(i, str, giftTrayData);
        VideoEffectPlayer videoEffectPlayer = this.f179451a;
        if (videoEffectPlayer == null) {
            return false;
        }
        videoEffectPlayer.stop();
        bnl0.m105524M(this.f179451a, false);
        this.f179452b.m74807a();
        rre.m182749u(giftTrayData, false, z);
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m196523j(final BLiveEffect bLiveEffect, final GiftTrayData giftTrayData, final boolean z, udl0 udl0Var) {
        if (udl0Var == null || this.f179451a == null) {
            muj.m160162E(bLiveEffect, udl0Var, this.f179451a, giftTrayData);
            rre.m182749u(giftTrayData, false, z);
            return;
        }
        if (giftTrayData.f50929K && !jyb.m147479J(udl0Var.m195499b()) && !jyb.m147479J(giftTrayData.f50931M)) {
            m196518e(giftTrayData.f50931M, udl0Var.m195499b());
            muj.m160188c(bLiveEffect, giftTrayData);
        }
        bnl0.m105524M(this.f179451a, true);
        this.f179451a.setVideoEffectConfig(new sdl0.C20024a().m185480c(udl0Var).m185481d(sdl0.f167422j).m185479b(null).m185482e(new gmw()).m185478a());
        this.f179451a.prepare();
        this.f179451a.start();
        muj.m160205k0(bLiveEffect, giftTrayData);
        this.f179451a.setOnPrepareListener(new InterfaceC4139d.d() { // from class: l.rks
            @Override // com.immomo.velib.player.InterfaceC4139d.d
            /* JADX INFO: renamed from: a */
            public final void mo20526a() {
                muj.m160173P(bLiveEffect, giftTrayData);
            }
        });
        this.f179451a.setCompletionListener(new y9m() { // from class: l.sks
            @Override // p153l.y9m
            public final void onCompletion() {
                this.f169324a.m196521h(bLiveEffect, giftTrayData, z);
            }
        });
        this.f179451a.setOnErrorListener(new z9m() { // from class: l.tks
            @Override // p153l.z9m
            public final boolean onError(int i, String str) {
                return this.f174738a.m196522i(giftTrayData, z, i, str);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public void m196524k(FrameLayout frameLayout, LiveGiftExtLayer liveGiftExtLayer, BLiveEffect bLiveEffect, GiftTrayData giftTrayData, boolean z) {
        m196519f(frameLayout, liveGiftExtLayer);
        m196525l(bLiveEffect, giftTrayData, z);
    }

    /* JADX INFO: renamed from: l */
    public final void m196525l(final BLiveEffect bLiveEffect, final GiftTrayData giftTrayData, final boolean z) {
        muj.m160175R(bLiveEffect, giftTrayData);
        this.f179451a.stop();
        ((jfl0) wqe.m207509d("video")).m144689m(bLiveEffect.f45207id, bLiveEffect.hdType, bLiveEffect.zip, bLiveEffect.md5, new jfl0.InterfaceC17940a() { // from class: l.qks
            @Override // p153l.jfl0.InterfaceC17940a
            /* JADX INFO: renamed from: a */
            public final void mo95516a(udl0 udl0Var) {
                this.f158166a.m196523j(bLiveEffect, giftTrayData, z, udl0Var);
            }
        });
        this.f179452b.m74808b(giftTrayData.m75344e());
    }
}
