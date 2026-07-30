package p153l;

import android.graphics.Bitmap;
import android.util.Pair;
import com.p051p1.mobile.putong.live.base.data.BLiveEffect;
import com.p051p1.mobile.putong.live.base.data.BLiveEnterRoom;
import com.p051p1.mobile.putong.live.base.vap.mix.C12633c;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.LiveEnterRoomView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.VapPlayerView;
import java.util.Objects;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes4.dex */
public class was extends AbstractC19290p4 {

    /* JADX INFO: renamed from: d */
    public VapPlayerView f188164d;

    public <V extends oo2> was(las lasVar, LiveEnterRoomView liveEnterRoomView) {
        super(lasVar, liveEnterRoomView);
    }

    /* JADX INFO: renamed from: g */
    private void m205675g() {
        if (this.f188164d == null) {
            VapPlayerView vapPlayerView = new VapPlayerView(this.f150482c.getContext());
            this.f188164d = vapPlayerView;
            bnl0.m105524M(vapPlayerView, false);
        }
        if (this.f188164d.getParent() == null) {
            this.f150482c.addView(this.f188164d, bnl0.f77544e, qa00.m175859d(100.0f));
        }
    }

    @Override // p153l.AbstractC19290p4
    /* JADX INFO: renamed from: a */
    public boolean mo75456a() {
        VapPlayerView vapPlayerView = this.f188164d;
        return vapPlayerView != null && vapPlayerView.mo69821o();
    }

    @Override // p153l.AbstractC19290p4
    /* JADX INFO: renamed from: b */
    public void mo75457b(BLiveEnterRoom bLiveEnterRoom) {
        super.mo75457b(bLiveEnterRoom);
        m205675g();
        VapPlayerView vapPlayerView = this.f188164d;
        las<?> lasVar = this.f150480a;
        Objects.requireNonNull(lasVar);
        vapPlayerView.m75434u(new qas(lasVar));
        m205680l(bLiveEnterRoom);
    }

    @Override // p153l.AbstractC19290p4
    /* JADX INFO: renamed from: c */
    public void mo75458c() {
        super.mo75458c();
        VapPlayerView vapPlayerView = this.f188164d;
        if (vapPlayerView != null && vapPlayerView.mo69821o()) {
            this.f188164d.mo69824r();
        }
        ynp0.m216920E(this.f188164d, null);
        ynp0.m216945v(this.f188164d, false);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m205676h(BLiveEnterRoom bLiveEnterRoom, Pair pair, BLiveEffect bLiveEffect) {
        m205678j(bLiveEnterRoom, pair);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m205677i(BLiveEnterRoom bLiveEnterRoom, C12633c c12633c) {
        this.f150480a.m153537Y3(bLiveEnterRoom.uid);
    }

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void m205678j(final BLiveEnterRoom bLiveEnterRoom, final Pair<Bitmap, Bitmap> pair) {
        BLiveEffect bLiveEffectM207507b = wqe.m207507b(bLiveEnterRoom.getMixResId(), new y20() { // from class: l.uas
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f178228a.m205676h(bLiveEnterRoom, pair, (BLiveEffect) obj);
            }
        });
        if (bLiveEffectM207507b == null) {
            return;
        }
        this.f150480a.m153538Z3(this.f188164d);
        this.f188164d.setOnResourceClickListener(new ln50() { // from class: l.vas
            @Override // p153l.ln50
            /* JADX INFO: renamed from: a */
            public final void mo154963a(C12633c c12633c) {
                this.f183163a.m205677i(bLiveEnterRoom, c12633c);
            }
        });
        this.f188164d.m75435v(bLiveEnterRoom, bLiveEffectM207507b, pair);
    }

    /* JADX INFO: renamed from: l */
    public final void m205680l(final BLiveEnterRoom bLiveEnterRoom) {
        this.f150480a.duringCreated(C22421c.zip(izs.m142854e("context_livingAct", bLiveEnterRoom.userImage), izs.m142854e("context_livingAct", bLiveEnterRoom.userGradeIcon), new sas())).observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.tas
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f172798a.m205678j(bLiveEnterRoom, (Pair) obj);
            }
        }));
    }
}
