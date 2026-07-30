package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.live.base.data.BLiveRoom;
import com.p051p1.mobile.putong.live.base.webview.LiveWebViewAct;
import com.p051p1.mobile.putong.live.livingroom.other.livecover.LiveCoverAct;
import p151v.VText;

/* JADX INFO: loaded from: classes5.dex */
public class am0 {

    /* JADX INFO: renamed from: a */
    public VText f72178a;

    /* JADX INFO: renamed from: b */
    public VText f72179b;

    /* JADX INFO: renamed from: c */
    public Frag f72180c;

    /* JADX INFO: renamed from: d */
    public BLiveRoom f72181d;

    /* JADX INFO: renamed from: e */
    public Dialog f72182e;

    /* JADX INFO: renamed from: c */
    public View m98774c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return bm0.m104952b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d */
    public final Act m98775d() {
        return this.f72180c.act();
    }

    /* JADX INFO: renamed from: e */
    public final void m98776e() {
        this.f72180c.startActivity(LiveWebViewAct.m70066d2(m98775d(), efv.f93846c));
    }

    /* JADX INFO: renamed from: f */
    public final void m98777f() {
        this.f72180c.startActivityForResult(LiveCoverAct.m76649c2(m98775d(), this.f72181d.f45172id, "from_anchor_cover_dialog"), 100);
    }

    /* JADX INFO: renamed from: g */
    public final void m98778g() {
        bnl0.m105509E0(this.f72178a, new View.OnClickListener() { // from class: l.yl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f200511a.m98780i(view);
            }
        });
        bnl0.m105509E0(this.f72179b, new View.OnClickListener() { // from class: l.zl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f204871a.m98781j(view);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final View m98779h() {
        return m98774c(LayoutInflater.from(m98775d()), null);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m98780i(View view) {
        Dialog dialog = this.f72182e;
        if (dialog != null && dialog.isShowing()) {
            this.f72182e.dismiss();
        }
        m98777f();
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m98781j(View view) {
        m98776e();
    }

    /* JADX INFO: renamed from: k */
    public void m98782k(Frag frag, BLiveRoom bLiveRoom) {
        this.f72180c = frag;
        this.f72181d = bLiveRoom;
        this.f72182e = m98775d().dialog().m21518O(m98779h()).m21556u().m21567z0();
        m98778g();
    }
}
