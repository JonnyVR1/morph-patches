package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.live.base.data.BLiveRoom;
import com.p046p1.mobile.putong.live.base.webview.LiveWebViewAct;
import com.p046p1.mobile.putong.live.livingroom.other.livecover.LiveCoverAct;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class em0 {

    /* JADX INFO: renamed from: a */
    public VText f92153a;

    /* JADX INFO: renamed from: b */
    public VText f92154b;

    /* JADX INFO: renamed from: c */
    public Frag f92155c;

    /* JADX INFO: renamed from: d */
    public BLiveRoom f92156d;

    /* JADX INFO: renamed from: e */
    public Dialog f92157e;

    /* JADX INFO: renamed from: c */
    public View m117163c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return fm0.m122105b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d */
    public final Act m117164d() {
        return this.f92155c.act();
    }

    /* JADX INFO: renamed from: e */
    public final void m117165e() {
        this.f92155c.startActivity(LiveWebViewAct.m68883c2(m117164d(), ddv.f85653c));
    }

    /* JADX INFO: renamed from: f */
    public final void m117166f() {
        this.f92155c.startActivityForResult(LiveCoverAct.m75466b2(m117164d(), this.f92156d.f44324id, "from_anchor_cover_dialog"), 100);
    }

    /* JADX INFO: renamed from: g */
    public final void m117167g() {
        xdl0.m208329E0(this.f92153a, new View.OnClickListener() { // from class: l.cm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f81485a.m117169i(view);
            }
        });
        xdl0.m208329E0(this.f92154b, new View.OnClickListener() { // from class: l.dm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f86889a.m117170j(view);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final View m117168h() {
        return m117163c(LayoutInflater.from(m117164d()), null);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m117169i(View view) {
        Dialog dialog = this.f92157e;
        if (dialog != null && dialog.isShowing()) {
            this.f92157e.dismiss();
        }
        m117166f();
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m117170j(View view) {
        m117165e();
    }

    /* JADX INFO: renamed from: k */
    public void m117171k(Frag frag, BLiveRoom bLiveRoom) {
        this.f92155c = frag;
        this.f92156d = bLiveRoom;
        this.f92157e = m117164d().dialog().m20519O(m117168h()).m20557u().m20568z0();
        m117167g();
    }
}
