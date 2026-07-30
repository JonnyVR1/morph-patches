package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.other.livecover.LiveCoverAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.putong.live.base.data.BLiveAbsRoom;
import com.p1.mobile.putong.live.base.data.BLiveRoom;
import com.p1.mobile.putong.live.base.webview.LiveWebViewAct;
import l.ddv;
import l.xdl0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class em0 {

    /* JADX INFO: renamed from: a */
    public VText f9863a;

    /* JADX INFO: renamed from: b */
    public VText f9864b;

    /* JADX INFO: renamed from: c */
    public Frag f9865c;

    /* JADX INFO: renamed from: d */
    public BLiveRoom f9866d;

    /* JADX INFO: renamed from: e */
    public Dialog f9867e;

    /* JADX INFO: renamed from: c */
    public View m12606c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return fm0.m13301b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d */
    public final Act m12607d() {
        return this.f9865c.act();
    }

    /* JADX INFO: renamed from: e */
    public final void m12608e() {
        this.f9865c.startActivity(LiveWebViewAct.c2(m12607d(), ddv.c));
    }

    /* JADX INFO: renamed from: f */
    public final void m12609f() {
        this.f9865c.startActivityForResult(LiveCoverAct.m9099b2(m12607d(), ((BLiveAbsRoom) this.f9866d).id, "from_anchor_cover_dialog"), 100);
    }

    /* JADX INFO: renamed from: g */
    public final void m12610g() {
        xdl0.E0(this.f9863a, new View.OnClickListener() { // from class: l.cm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8741a.m12612i(view);
            }
        });
        xdl0.E0(this.f9864b, new View.OnClickListener() { // from class: l.dm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9329a.m12613j(view);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final View m12611h() {
        return m12606c(LayoutInflater.from(m12607d()), null);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m12612i(View view) {
        Dialog dialog = this.f9867e;
        if (dialog != null && dialog.isShowing()) {
            this.f9867e.dismiss();
        }
        m12609f();
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m12613j(View view) {
        m12608e();
    }

    /* JADX INFO: renamed from: k */
    public void m12614k(Frag frag, BLiveRoom bLiveRoom) {
        this.f9865c = frag;
        this.f9866d = bLiveRoom;
        this.f9867e = m12607d().dialog().O(m12611h()).u().z0();
        m12610g();
    }
}
