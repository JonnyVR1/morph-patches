package p149l;

import android.graphics.Bitmap;
import android.util.Pair;
import com.p046p1.mobile.putong.live.base.data.BLiveEffect;
import com.p046p1.mobile.putong.live.base.data.BLiveEnterRoom;
import com.p046p1.mobile.putong.live.base.vap.mix.C12470c;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.LiveEnterRoomView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.VapPlayerView;
import java.util.Objects;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class v8s extends AbstractC19426q4 {

    /* JADX INFO: renamed from: d */
    public VapPlayerView f180584d;

    public <V extends ho2> v8s(k8s k8sVar, LiveEnterRoomView liveEnterRoomView) {
        super(k8sVar, liveEnterRoomView);
    }

    /* JADX INFO: renamed from: g */
    private void m197508g() {
        if (this.f180584d == null) {
            VapPlayerView vapPlayerView = new VapPlayerView(this.f152530c.getContext());
            this.f180584d = vapPlayerView;
            xdl0.m208344M(vapPlayerView, false);
        }
        if (this.f180584d.getParent() == null) {
            this.f152530c.addView(this.f180584d, xdl0.f192403e, t100.m186890d(100.0f));
        }
    }

    @Override // p149l.AbstractC19426q4
    /* JADX INFO: renamed from: a */
    public boolean mo74273a() {
        VapPlayerView vapPlayerView = this.f180584d;
        return vapPlayerView != null && vapPlayerView.mo68638o();
    }

    @Override // p149l.AbstractC19426q4
    /* JADX INFO: renamed from: b */
    public void mo74274b(BLiveEnterRoom bLiveEnterRoom) {
        super.mo74274b(bLiveEnterRoom);
        m197508g();
        VapPlayerView vapPlayerView = this.f180584d;
        k8s<?> k8sVar = this.f152528a;
        Objects.requireNonNull(k8sVar);
        vapPlayerView.m74251u(new p8s(k8sVar));
        m197513l(bLiveEnterRoom);
    }

    @Override // p149l.AbstractC19426q4
    /* JADX INFO: renamed from: c */
    public void mo74275c() {
        super.mo74275c();
        VapPlayerView vapPlayerView = this.f180584d;
        if (vapPlayerView != null && vapPlayerView.mo68638o()) {
            this.f180584d.mo68641r();
        }
        uep0.m193310E(this.f180584d, null);
        uep0.m193335v(this.f180584d, false);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m197509h(BLiveEnterRoom bLiveEnterRoom, Pair pair, BLiveEffect bLiveEffect) {
        m197511j(bLiveEnterRoom, pair);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m197510i(BLiveEnterRoom bLiveEnterRoom, C12470c c12470c) {
        this.f152528a.m144967Y3(bLiveEnterRoom.uid);
    }

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void m197511j(final BLiveEnterRoom bLiveEnterRoom, final Pair<Bitmap, Bitmap> pair) {
        BLiveEffect bLiveEffectM185363b = spe.m185363b(bLiveEnterRoom.getMixResId(), new e30() { // from class: l.t8s
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f168957a.m197509h(bLiveEnterRoom, pair, (BLiveEffect) obj);
            }
        });
        if (bLiveEffectM185363b == null) {
            return;
        }
        this.f152528a.m144968Z3(this.f180584d);
        this.f180584d.setOnResourceClickListener(new ff50() { // from class: l.u8s
            @Override // p149l.ff50
            /* JADX INFO: renamed from: a */
            public final void mo121109a(C12470c c12470c) {
                this.f175157a.m197510i(bLiveEnterRoom, c12470c);
            }
        });
        this.f180584d.m74252v(bLiveEnterRoom, bLiveEffectM185363b, pair);
    }

    /* JADX INFO: renamed from: l */
    public final void m197513l(final BLiveEnterRoom bLiveEnterRoom) {
        this.f152528a.duringCreated(C22306c.zip(hxs.m133392e("context_livingAct", bLiveEnterRoom.userImage), hxs.m133392e("context_livingAct", bLiveEnterRoom.userGradeIcon), new r8s())).observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.s8s
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f163104a.m197511j(bLiveEnterRoom, (Pair) obj);
            }
        }));
    }
}
