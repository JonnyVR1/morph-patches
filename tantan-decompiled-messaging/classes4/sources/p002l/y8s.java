package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.immomo.velib.anim.model.Element;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.tray.LiveEnterRoomView;
import com.p1.mobile.putong.live.base.data.BLiveEffect;
import com.p1.mobile.putong.live.base.data.BLiveEnterRoom;
import com.p1.mobile.putong.live.base.data.BLiveSpecialEffectResources;
import com.p1.mobile.putong.live.base.mmsdk.effect.video.VideoEffectPlayer;
import java.util.HashMap;
import java.util.List;
import l.d30;
import l.f30;
import l.q4l0;
import l.t100;
import l.uep0;
import l.vwb;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class y8s extends AbstractC0781q4 {

    /* JADX INFO: renamed from: d */
    public VideoEffectPlayer f22744d;

    public <V extends ho2> y8s(k8s k8sVar, LiveEnterRoomView liveEnterRoomView) {
        super(k8sVar, liveEnterRoomView);
    }

    /* JADX INFO: renamed from: g */
    private void m26445g() {
        if (this.f22744d == null) {
            this.f22744d = new VideoEffectPlayer(this.f17799c.getContext());
            xdl0.D0(xdl0.y0(), new View[]{this.f22744d});
            this.f22744d.setRenderMode(2);
            xdl0.M(this.f22744d, false);
        }
        if (this.f22744d.getParent() == null) {
            int iY0 = (xdl0.y0() * 200) / 375;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(xdl0.e, iY0);
            layoutParams.topMargin = ((-iY0) / 2) + t100.d(30.0f);
            this.f17799c.addView((View) this.f22744d, (ViewGroup.LayoutParams) layoutParams);
        }
    }

    @Override // p002l.AbstractC0781q4
    /* JADX INFO: renamed from: a */
    public boolean mo7854a() {
        VideoEffectPlayer videoEffectPlayer = this.f22744d;
        return videoEffectPlayer != null && videoEffectPlayer.isPlaying();
    }

    @Override // p002l.AbstractC0781q4
    /* JADX INFO: renamed from: b */
    public void mo7855b(BLiveEnterRoom bLiveEnterRoom) {
        super.mo7855b(bLiveEnterRoom);
        m26445g();
        m26449j(bLiveEnterRoom);
    }

    @Override // p002l.AbstractC0781q4
    /* JADX INFO: renamed from: c */
    public void mo7856c() {
        super.mo7856c();
        VideoEffectPlayer videoEffectPlayer = this.f22744d;
        if (videoEffectPlayer != null && videoEffectPlayer.isPlaying()) {
            this.f22744d.stop();
        }
        uep0.E(this.f22744d, (View.OnClickListener) null);
        uep0.v(this.f22744d, false);
    }

    /* JADX INFO: renamed from: f */
    public final void m26446f(List<BLiveSpecialEffectResources> list, @Nullable List<Element> list2) {
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

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m26447h(BLiveEnterRoom bLiveEnterRoom, q4l0 q4l0Var, BLiveEffect bLiveEffect) {
        if (vwb.J(q4l0Var.b()) || bLiveEnterRoom == null || vwb.J(bLiveEnterRoom.videoEffectExtras)) {
            return;
        }
        m26446f(bLiveEnterRoom.videoEffectExtras, q4l0Var.b());
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m26448i() {
        k8s<?> k8sVar = this.f17797a;
        if (k8sVar != null) {
            k8sVar.m16561R3();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m26449j(final BLiveEnterRoom bLiveEnterRoom) {
        f6l0.m12964n(this.f22744d, new dqe(bLiveEnterRoom.getMixResId()).m11992n(new f30() { // from class: l.w8s
            public final void call(Object obj, Object obj2) {
                this.f21561a.m26447h(bLiveEnterRoom, (q4l0) obj, (BLiveEffect) obj2);
            }
        }).m11987i(new d30() { // from class: l.x8s
            public final void call() {
                this.f22171a.m26448i();
            }
        }));
    }
}
