package p002l;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.immomo.velib.anim.model.Element;
import com.immomo.velib.player.d;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.giftlayer.LiveGiftExtLayer;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import com.p1.mobile.putong.live.base.data.BLiveEffect;
import com.p1.mobile.putong.live.base.data.BLiveSpecialEffectResources;
import com.p1.mobile.putong.live.base.mmsdk.effect.video.VideoEffectPlayer;
import java.util.HashMap;
import java.util.List;
import l.hjw;
import l.i7m;
import l.j7m;
import l.o4l0;
import l.q4l0;
import l.vwb;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class tis {

    /* JADX INFO: renamed from: a */
    public VideoEffectPlayer f20249a;

    /* JADX INFO: renamed from: b */
    public LiveGiftExtLayer f20250b;

    /* JADX INFO: renamed from: e */
    public final void m22968e(List<BLiveSpecialEffectResources> list, @Nullable List<Element> list2) {
        if (vwb.J(list) || vwb.J(list2)) {
            return;
        }
        HashMap map = new HashMap(list.size());
        for (BLiveSpecialEffectResources bLiveSpecialEffectResources : list) {
            map.put(bLiveSpecialEffectResources.id, bLiveSpecialEffectResources);
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
    public final void m22969f(FrameLayout frameLayout, LiveGiftExtLayer liveGiftExtLayer) {
        this.f20250b = liveGiftExtLayer;
        if (this.f20249a == null) {
            VideoEffectPlayer videoEffectPlayer = new VideoEffectPlayer(frameLayout.getContext());
            this.f20249a = videoEffectPlayer;
            videoEffectPlayer.setRenderMode(2);
        }
        if (this.f20249a.getParent() == null) {
            VideoEffectPlayer videoEffectPlayer2 = this.f20249a;
            int i = xdl0.e;
            frameLayout.addView((View) videoEffectPlayer2, i, i);
            xdl0.M(this.f20249a, false);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m22970g() {
        VideoEffectPlayer videoEffectPlayer = this.f20249a;
        if (videoEffectPlayer != null) {
            xdl0.M(videoEffectPlayer, false);
            this.f20249a.stop();
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m22971h(BLiveEffect bLiveEffect, GiftTrayData giftTrayData, boolean z) {
        wrj.m25379N(bLiveEffect, giftTrayData);
        VideoEffectPlayer videoEffectPlayer = this.f20249a;
        if (videoEffectPlayer == null) {
            return;
        }
        videoEffectPlayer.stop();
        xdl0.M(this.f20249a, false);
        this.f20250b.m7170a();
        nqe.m18966u(giftTrayData, true, z);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean m22972i(GiftTrayData giftTrayData, boolean z, int i, String str) {
        wrj.m25380O(i, str, giftTrayData);
        VideoEffectPlayer videoEffectPlayer = this.f20249a;
        if (videoEffectPlayer == null) {
            return false;
        }
        videoEffectPlayer.stop();
        xdl0.M(this.f20249a, false);
        this.f20250b.m7170a();
        nqe.m18966u(giftTrayData, false, z);
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m22973j(final BLiveEffect bLiveEffect, final GiftTrayData giftTrayData, final boolean z, q4l0 q4l0Var) {
        if (q4l0Var == null || this.f20249a == null) {
            wrj.m25370E(bLiveEffect, q4l0Var, this.f20249a, giftTrayData);
            nqe.m18966u(giftTrayData, false, z);
            return;
        }
        if (giftTrayData.f6123K && !vwb.J(q4l0Var.b()) && !vwb.J(giftTrayData.f6125M)) {
            m22968e(giftTrayData.f6125M, q4l0Var.b());
            wrj.m25396c(bLiveEffect, giftTrayData);
        }
        xdl0.M(this.f20249a, true);
        this.f20249a.setVideoEffectConfig(new o4l0.a().c(q4l0Var).d(o4l0.j).b((List) null).e(new hjw()).a());
        this.f20249a.prepare();
        this.f20249a.start();
        wrj.m25413k0(bLiveEffect, giftTrayData);
        this.f20249a.setOnPrepareListener(new d.d() { // from class: l.qis
            /* JADX INFO: renamed from: a */
            public final void m21290a() {
                wrj.m25381P(bLiveEffect, giftTrayData);
            }
        });
        this.f20249a.setCompletionListener(new i7m() { // from class: l.ris
            public final void onCompletion() {
                this.f18536a.m22971h(bLiveEffect, giftTrayData, z);
            }
        });
        this.f20249a.setOnErrorListener(new j7m() { // from class: l.sis
            public final boolean onError(int i, String str) {
                return this.f19044a.m22972i(giftTrayData, z, i, str);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public void m22974k(FrameLayout frameLayout, LiveGiftExtLayer liveGiftExtLayer, BLiveEffect bLiveEffect, GiftTrayData giftTrayData, boolean z) {
        m22969f(frameLayout, liveGiftExtLayer);
        m22975l(bLiveEffect, giftTrayData, z);
    }

    /* JADX INFO: renamed from: l */
    public final void m22975l(final BLiveEffect bLiveEffect, final GiftTrayData giftTrayData, final boolean z) {
        wrj.m25383R(bLiveEffect, giftTrayData);
        this.f20249a.stop();
        ((f6l0) spe.m22604d("video")).m12965m(bLiveEffect.id, bLiveEffect.hdType, bLiveEffect.zip, bLiveEffect.md5, new f6l0.InterfaceC0557a() { // from class: l.pis
            @Override // p002l.f6l0.InterfaceC0557a
            /* JADX INFO: renamed from: a */
            public final void mo10170a(q4l0 q4l0Var) {
                this.f17408a.m22973j(bLiveEffect, giftTrayData, z, q4l0Var);
            }
        });
        this.f20250b.m7171b(giftTrayData.m7726e());
    }
}
