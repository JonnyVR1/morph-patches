package p153l;

import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.immomo.velib.anim.model.Element;
import com.p051p1.mobile.putong.live.base.data.BLiveEffect;
import com.p051p1.mobile.putong.live.base.data.BLiveEnterRoom;
import com.p051p1.mobile.putong.live.base.data.BLiveSpecialEffectResources;
import com.p051p1.mobile.putong.live.base.mmsdk.effect.video.VideoEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.LiveEnterRoomView;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class zas extends AbstractC19290p4 {

    /* JADX INFO: renamed from: d */
    public VideoEffectPlayer f203591d;

    public <V extends oo2> zas(las lasVar, LiveEnterRoomView liveEnterRoomView) {
        super(lasVar, liveEnterRoomView);
    }

    /* JADX INFO: renamed from: g */
    private void m219138g() {
        if (this.f203591d == null) {
            this.f203591d = new VideoEffectPlayer(this.f150482c.getContext());
            bnl0.m105507D0(bnl0.m105592y0(), this.f203591d);
            this.f203591d.setRenderMode(2);
            bnl0.m105524M(this.f203591d, false);
        }
        if (this.f203591d.getParent() == null) {
            int iM105592y0 = (bnl0.m105592y0() * 200) / 375;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(bnl0.f77544e, iM105592y0);
            layoutParams.topMargin = ((-iM105592y0) / 2) + qa00.m175859d(30.0f);
            this.f150482c.addView(this.f203591d, layoutParams);
        }
    }

    @Override // p153l.AbstractC19290p4
    /* JADX INFO: renamed from: a */
    public boolean mo75456a() {
        VideoEffectPlayer videoEffectPlayer = this.f203591d;
        return videoEffectPlayer != null && videoEffectPlayer.isPlaying();
    }

    @Override // p153l.AbstractC19290p4
    /* JADX INFO: renamed from: b */
    public void mo75457b(BLiveEnterRoom bLiveEnterRoom) {
        super.mo75457b(bLiveEnterRoom);
        m219138g();
        m219142j(bLiveEnterRoom);
    }

    @Override // p153l.AbstractC19290p4
    /* JADX INFO: renamed from: c */
    public void mo75458c() {
        super.mo75458c();
        VideoEffectPlayer videoEffectPlayer = this.f203591d;
        if (videoEffectPlayer != null && videoEffectPlayer.isPlaying()) {
            this.f203591d.stop();
        }
        ynp0.m216920E(this.f203591d, null);
        ynp0.m216945v(this.f203591d, false);
    }

    /* JADX INFO: renamed from: f */
    public final void m219139f(List<BLiveSpecialEffectResources> list, @Nullable List<Element> list2) {
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

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m219140h(BLiveEnterRoom bLiveEnterRoom, udl0 udl0Var, BLiveEffect bLiveEffect) {
        if (jyb.m147479J(udl0Var.m195499b()) || bLiveEnterRoom == null || jyb.m147479J(bLiveEnterRoom.videoEffectExtras)) {
            return;
        }
        m219139f(bLiveEnterRoom.videoEffectExtras, udl0Var.m195499b());
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m219141i() {
        las<?> lasVar = this.f150480a;
        if (lasVar != null) {
            lasVar.m153533R3();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m219142j(final BLiveEnterRoom bLiveEnterRoom) {
        jfl0.m144685n(this.f203591d, new hre(bLiveEnterRoom.getMixResId()).m136831n(new z20() { // from class: l.xas
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f193071a.m219140h(bLiveEnterRoom, (udl0) obj, (BLiveEffect) obj2);
            }
        }).m136826i(new x20() { // from class: l.yas
            @Override // p153l.x20
            public final void call() {
                this.f198238a.m219141i();
            }
        }));
    }
}
