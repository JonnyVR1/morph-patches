package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveDownBox;
import p149l.ho2;

/* JADX INFO: loaded from: classes4.dex */
public class z6e<D extends ho2> extends qj2<D, f7e> implements s7m<z6e> {

    /* JADX INFO: renamed from: j */
    public FrameLayout f201908j;

    /* JADX INFO: renamed from: k */
    public boolean f201909k;

    public z6e(bsm<D> bsmVar) {
        super(bsmVar);
        this.f201909k = false;
    }

    private void init() {
        if (this.f201909k) {
            return;
        }
        this.f201909k = true;
        this.f201908j = new FrameLayout(act());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.bottomMargin = t100.m186890d(56.0f);
        layoutParams.leftMargin = xdl0.m208412y0() / 10;
        layoutParams.rightMargin = xdl0.m208412y0() / 10;
        this.f201908j.setLayoutParams(layoutParams);
        m193995L3(this.f201908j);
    }

    @Override // p149l.qj2
    /* JADX INFO: renamed from: T3 */
    public ViewGroup mo104532T3() {
        return this.f201908j;
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m217393Y3(LongLinkLiveDownBox.LiveAccessChannel liveAccessChannel) {
        liveAccessChannel.toString();
        init();
        m144512z2(l6e.m148716b(a7e.m95285T3(this.f188512e, liveAccessChannel)));
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        FrameLayout frameLayout = this.f201908j;
        if (frameLayout != null) {
            m193999R3(frameLayout);
        }
        super.mo69117n();
        l6e.m148715a();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206027E2().m132160q1().m189110i()).filter(new w9j() { // from class: l.x6e
            @Override // p149l.w9j
            public final Object call(Object obj) {
                LongLinkLiveDownBox.LiveAccessChannel liveAccessChannel = (LongLinkLiveDownBox.LiveAccessChannel) obj;
                return Boolean.valueOf(liveAccessChannel != null && liveAccessChannel.getJumpType() == LongLinkLiveDownBox.AccessChannelJumpType.schema);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.y6e
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f196545a.m217393Y3((LongLinkLiveDownBox.LiveAccessChannel) obj);
            }
        }));
        ypv.f199493a.m199309D0();
        m206027E2().m149818o();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: X3, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(z6e z6eVar) {
    }
}
