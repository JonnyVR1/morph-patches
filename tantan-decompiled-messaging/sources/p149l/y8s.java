package p149l;

import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.immomo.velib.anim.model.Element;
import com.p046p1.mobile.putong.live.base.data.BLiveEffect;
import com.p046p1.mobile.putong.live.base.data.BLiveEnterRoom;
import com.p046p1.mobile.putong.live.base.data.BLiveSpecialEffectResources;
import com.p046p1.mobile.putong.live.base.mmsdk.effect.video.VideoEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.LiveEnterRoomView;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class y8s extends AbstractC19426q4 {

    /* JADX INFO: renamed from: d */
    public VideoEffectPlayer f196877d;

    public <V extends ho2> y8s(k8s k8sVar, LiveEnterRoomView liveEnterRoomView) {
        super(k8sVar, liveEnterRoomView);
    }

    /* JADX INFO: renamed from: g */
    private void m213436g() {
        if (this.f196877d == null) {
            this.f196877d = new VideoEffectPlayer(this.f152530c.getContext());
            xdl0.m208327D0(xdl0.m208412y0(), this.f196877d);
            this.f196877d.setRenderMode(2);
            xdl0.m208344M(this.f196877d, false);
        }
        if (this.f196877d.getParent() == null) {
            int iM208412y0 = (xdl0.m208412y0() * 200) / 375;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(xdl0.f192403e, iM208412y0);
            layoutParams.topMargin = ((-iM208412y0) / 2) + t100.m186890d(30.0f);
            this.f152530c.addView(this.f196877d, layoutParams);
        }
    }

    @Override // p149l.AbstractC19426q4
    /* JADX INFO: renamed from: a */
    public boolean mo74273a() {
        VideoEffectPlayer videoEffectPlayer = this.f196877d;
        return videoEffectPlayer != null && videoEffectPlayer.isPlaying();
    }

    @Override // p149l.AbstractC19426q4
    /* JADX INFO: renamed from: b */
    public void mo74274b(BLiveEnterRoom bLiveEnterRoom) {
        super.mo74274b(bLiveEnterRoom);
        m213436g();
        m213440j(bLiveEnterRoom);
    }

    @Override // p149l.AbstractC19426q4
    /* JADX INFO: renamed from: c */
    public void mo74275c() {
        super.mo74275c();
        VideoEffectPlayer videoEffectPlayer = this.f196877d;
        if (videoEffectPlayer != null && videoEffectPlayer.isPlaying()) {
            this.f196877d.stop();
        }
        uep0.m193310E(this.f196877d, null);
        uep0.m193335v(this.f196877d, false);
    }

    /* JADX INFO: renamed from: f */
    public final void m213437f(List<BLiveSpecialEffectResources> list, @Nullable List<Element> list2) {
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

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m213438h(BLiveEnterRoom bLiveEnterRoom, q4l0 q4l0Var, BLiveEffect bLiveEffect) {
        if (vwb.m200296J(q4l0Var.m172945b()) || bLiveEnterRoom == null || vwb.m200296J(bLiveEnterRoom.videoEffectExtras)) {
            return;
        }
        m213437f(bLiveEnterRoom.videoEffectExtras, q4l0Var.m172945b());
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m213439i() {
        k8s<?> k8sVar = this.f152528a;
        if (k8sVar != null) {
            k8sVar.m144963R3();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m213440j(final BLiveEnterRoom bLiveEnterRoom) {
        f6l0.m119627n(this.f196877d, new dqe(bLiveEnterRoom.getMixResId()).m113020n(new f30() { // from class: l.w8s
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f185248a.m213438h(bLiveEnterRoom, (q4l0) obj, (BLiveEffect) obj2);
            }
        }).m113015i(new d30() { // from class: l.x8s
            @Override // p149l.d30
            public final void call() {
                this.f191543a.m213439i();
            }
        }));
    }
}
