package p149l;

import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.immomo.velib.anim.model.Element;
import com.immomo.velib.player.InterfaceC3988d;
import com.p046p1.mobile.putong.live.base.data.BLiveEffect;
import com.p046p1.mobile.putong.live.base.data.BLiveSpecialEffectResources;
import com.p046p1.mobile.putong.live.base.mmsdk.effect.video.VideoEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.giftlayer.LiveGiftExtLayer;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class tis {

    /* JADX INFO: renamed from: a */
    public VideoEffectPlayer f170610a;

    /* JADX INFO: renamed from: b */
    public LiveGiftExtLayer f170611b;

    /* JADX INFO: renamed from: e */
    public final void m189223e(List<BLiveSpecialEffectResources> list, @Nullable List<Element> list2) {
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

    /* JADX INFO: renamed from: f */
    public final void m189224f(FrameLayout frameLayout, LiveGiftExtLayer liveGiftExtLayer) {
        this.f170611b = liveGiftExtLayer;
        if (this.f170610a == null) {
            VideoEffectPlayer videoEffectPlayer = new VideoEffectPlayer(frameLayout.getContext());
            this.f170610a = videoEffectPlayer;
            videoEffectPlayer.setRenderMode(2);
        }
        if (this.f170610a.getParent() == null) {
            VideoEffectPlayer videoEffectPlayer2 = this.f170610a;
            int i = xdl0.f192403e;
            frameLayout.addView(videoEffectPlayer2, i, i);
            xdl0.m208344M(this.f170610a, false);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m189225g() {
        VideoEffectPlayer videoEffectPlayer = this.f170610a;
        if (videoEffectPlayer != null) {
            xdl0.m208344M(videoEffectPlayer, false);
            this.f170610a.stop();
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m189226h(BLiveEffect bLiveEffect, GiftTrayData giftTrayData, boolean z) {
        wrj.m205207N(bLiveEffect, giftTrayData);
        VideoEffectPlayer videoEffectPlayer = this.f170610a;
        if (videoEffectPlayer == null) {
            return;
        }
        videoEffectPlayer.stop();
        xdl0.m208344M(this.f170610a, false);
        this.f170611b.m73624a();
        nqe.m160615u(giftTrayData, true, z);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean m189227i(GiftTrayData giftTrayData, boolean z, int i, String str) {
        wrj.m205208O(i, str, giftTrayData);
        VideoEffectPlayer videoEffectPlayer = this.f170610a;
        if (videoEffectPlayer == null) {
            return false;
        }
        videoEffectPlayer.stop();
        xdl0.m208344M(this.f170610a, false);
        this.f170611b.m73624a();
        nqe.m160615u(giftTrayData, false, z);
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m189228j(final BLiveEffect bLiveEffect, final GiftTrayData giftTrayData, final boolean z, q4l0 q4l0Var) {
        if (q4l0Var == null || this.f170610a == null) {
            wrj.m205198E(bLiveEffect, q4l0Var, this.f170610a, giftTrayData);
            nqe.m160615u(giftTrayData, false, z);
            return;
        }
        if (giftTrayData.f50081K && !vwb.m200296J(q4l0Var.m172945b()) && !vwb.m200296J(giftTrayData.f50083M)) {
            m189223e(giftTrayData.f50083M, q4l0Var.m172945b());
            wrj.m205224c(bLiveEffect, giftTrayData);
        }
        xdl0.m208344M(this.f170610a, true);
        this.f170610a.setVideoEffectConfig(new o4l0.C18841a().m162604c(q4l0Var).m162605d(o4l0.f141782j).m162603b(null).m162606e(new hjw()).m162602a());
        this.f170610a.prepare();
        this.f170610a.start();
        wrj.m205241k0(bLiveEffect, giftTrayData);
        this.f170610a.setOnPrepareListener(new InterfaceC3988d.d() { // from class: l.qis
            @Override // com.immomo.velib.player.InterfaceC3988d.d
            /* JADX INFO: renamed from: a */
            public final void mo19527a() {
                wrj.m205209P(bLiveEffect, giftTrayData);
            }
        });
        this.f170610a.setCompletionListener(new i7m() { // from class: l.ris
            @Override // p149l.i7m
            public final void onCompletion() {
                this.f159589a.m189226h(bLiveEffect, giftTrayData, z);
            }
        });
        this.f170610a.setOnErrorListener(new j7m() { // from class: l.sis
            @Override // p149l.j7m
            public final boolean onError(int i, String str) {
                return this.f164738a.m189227i(giftTrayData, z, i, str);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public void m189229k(FrameLayout frameLayout, LiveGiftExtLayer liveGiftExtLayer, BLiveEffect bLiveEffect, GiftTrayData giftTrayData, boolean z) {
        m189224f(frameLayout, liveGiftExtLayer);
        m189230l(bLiveEffect, giftTrayData, z);
    }

    /* JADX INFO: renamed from: l */
    public final void m189230l(final BLiveEffect bLiveEffect, final GiftTrayData giftTrayData, final boolean z) {
        wrj.m205211R(bLiveEffect, giftTrayData);
        this.f170610a.stop();
        ((f6l0) spe.m185365d("video")).m119628m(bLiveEffect.f44359id, bLiveEffect.hdType, bLiveEffect.zip, bLiveEffect.md5, new f6l0.InterfaceC16768a() { // from class: l.pis
            @Override // p149l.f6l0.InterfaceC16768a
            /* JADX INFO: renamed from: a */
            public final void mo100430a(q4l0 q4l0Var) {
                this.f149680a.m189228j(bLiveEffect, giftTrayData, z, q4l0Var);
            }
        });
        this.f170611b.m73625b(giftTrayData.m74161e());
    }
}
