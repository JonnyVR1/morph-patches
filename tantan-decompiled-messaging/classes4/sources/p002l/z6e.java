package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveDownBox;
import l.e30;
import l.ffw;
import l.s7m;
import l.t100;
import l.w9j;
import l.xdl0;
import l.ypv;
import p002l.ho2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class z6e<D extends ho2> extends qj2<D, f7e> implements s7m<z6e> {

    /* JADX INFO: renamed from: j */
    public FrameLayout f23280j;

    /* JADX INFO: renamed from: k */
    public boolean f23281k;

    public z6e(bsm<D> bsmVar) {
        super(bsmVar);
        this.f23281k = false;
    }

    private void init() {
        if (this.f23281k) {
            return;
        }
        this.f23281k = true;
        this.f23280j = new FrameLayout(act());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.bottomMargin = t100.d(56.0f);
        layoutParams.leftMargin = xdl0.y0() / 10;
        layoutParams.rightMargin = xdl0.y0() / 10;
        this.f23280j.setLayoutParams(layoutParams);
        m23501L3(this.f23280j);
    }

    @Override // p002l.qj2
    /* JADX INFO: renamed from: T3 */
    public ViewGroup mo10687T3() {
        return this.f23280j;
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m27104Y3(LongLinkLiveDownBox.LiveAccessChannel liveAccessChannel) {
        liveAccessChannel.toString();
        init();
        z2(l6e.m17016b(a7e.m9445T3(this.f22036e, liveAccessChannel)));
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        FrameLayout frameLayout = this.f23280j;
        if (frameLayout != null) {
            m23505R3(frameLayout);
        }
        super.mo5949n();
        l6e.m17015a();
    }

    /* JADX INFO: renamed from: t */
    public void m27106t() {
        super.t();
        duringCreated(m25547E2().m14596q1().i()).filter(new w9j() { // from class: l.x6e
            public final Object call(Object obj) {
                LongLinkLiveDownBox.LiveAccessChannel liveAccessChannel = (LongLinkLiveDownBox.LiveAccessChannel) obj;
                return Boolean.valueOf(liveAccessChannel != null && liveAccessChannel.getJumpType() == LongLinkLiveDownBox.AccessChannelJumpType.schema);
            }
        }).subscribe(ffw.d(new e30() { // from class: l.y6e
            public final void call(Object obj) {
                this.f22691a.m27104Y3((LongLinkLiveDownBox.LiveAccessChannel) obj);
            }
        }));
        ypv.a.D0();
        m25547E2().m17239o();
    }

    /* JADX INFO: renamed from: X3, reason: merged with bridge method [inline-methods] */
    public void m27105i1(z6e z6eVar) {
    }
}
