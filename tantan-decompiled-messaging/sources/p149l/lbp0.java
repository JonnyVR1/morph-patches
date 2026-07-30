package p149l;

import android.view.View;
import com.immomo.momomediaext.sei.BaseSei;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0004¨\u0006\u0010"}, m87232d2 = {"Ll/lbp0;", "Ll/obv;", "Ll/pbp0;", "<init>", "()V", "", BaseSei.f13931Y, "", "withShadow", "F0", "(Z)V", "", BaseSei.f13930X, "()I", "k", "destroy", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class lbp0 extends obv<pbp0<?>> {
    /* JADX INFO: renamed from: v */
    public static void m149262v(lbp0 lbp0Var, View view) {
        lbp0Var.mo71727j();
    }

    /* JADX INFO: renamed from: w */
    public static void m149263w(lbp0 lbp0Var, View view) {
        ((pbp0) lbp0Var.f47706b).m168246T3();
    }

    /* JADX INFO: renamed from: y */
    private final void m149264y() {
        xdl0.m208344M(this.f142983h, true);
        this.f142983h.m68715f("人气榜单", h1c0.f105395p1);
        this.f142983h.setFAQListener(new View.OnClickListener() { // from class: l.jbp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                lbp0.m149263w(this.f117204a, view);
            }
        });
        this.f142983h.setBackListener(new View.OnClickListener() { // from class: l.kbp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                lbp0.m149262v(this.f122259a, view);
            }
        });
        this.f142983h.setLeftView(1);
        this.f142983h.setRightView(3);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder, p149l.vpl
    /* JADX INFO: renamed from: F0 */
    public void mo71722F0(boolean withShadow) {
        super.mo71722F0(withShadow);
        m149264y();
        mep0.m154301c1(this.f142982g, 0, 0, 0, -t100.m186890d(16.0f), t100.m186890d(16.0f));
        this.f142982g.m77414j0("room", "room");
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder, p149l.s7m
    public void destroy() {
        mo71727j();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder
    /* JADX INFO: renamed from: k */
    public int mo71728k() {
        return i3c0.f111189v;
    }

    /* JADX INFO: renamed from: x */
    public int m149265x() {
        return t100.m186890d(567.0f);
    }
}
