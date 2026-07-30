package p002l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.C0200a;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p1.mobile.putong.live.base.view.EmptyView;
import java.util.ArrayList;
import l.d1q;
import l.s7m;
import l.t100;
import l.uep0;
import l.vwb;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class a26 implements s7m<n26> {

    /* JADX INFO: renamed from: a */
    public View f7343a;

    /* JADX INFO: renamed from: b */
    public TextView f7344b;

    /* JADX INFO: renamed from: c */
    public RecyclerView f7345c;

    /* JADX INFO: renamed from: d */
    public EmptyView f7346d;

    /* JADX INFO: renamed from: e */
    public n26 f7347e;

    /* JADX INFO: renamed from: f */
    public C0200a f7348f;

    /* JADX INFO: renamed from: g */
    public LiveBaseAdapter f7349g;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m9276e(View view) {
        m9280d();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m9277C0() {
        return this.f7347e.act();
    }

    @Nullable
    public Act act() {
        return this.f7347e.act();
    }

    /* JADX INFO: renamed from: b */
    public View m9278b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return b26.m10158b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void m9283i1(n26 n26Var) {
        this.f7347e = n26Var;
    }

    /* JADX INFO: renamed from: d */
    public void m9280d() {
        uep0.n(this.f7348f);
    }

    /* JADX INFO: renamed from: f */
    public void m9281f(ArrayList<d1q<?>> arrayList) {
        boolean zJ = vwb.J(arrayList);
        EmptyView emptyView = this.f7346d;
        if (!zJ) {
            xdl0.M(emptyView, false);
            xdl0.M(this.f7345c, true);
            this.f7349g.Z(arrayList);
        } else {
            xdl0.M(emptyView, true);
            xdl0.D0(t100.d(220.0f), new View[]{this.f7346d.a});
            xdl0.C0(this.f7346d.a, t100.d(150.0f));
            this.f7346d.e(R$string.f3135Z0).b(i3c0.f12546K3);
            xdl0.M(this.f7345c, false);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m9282i() {
        if (this.f7348f == null) {
            this.f7348f = new byr(this.f7347e, m9278b(act().inflater(), null));
            this.f7345c.setLayoutManager(new LinearLayoutManager(act(), 1, false));
            LiveBaseAdapter liveBaseAdapter = new LiveBaseAdapter();
            this.f7349g = liveBaseAdapter;
            this.f7345c.setAdapter(liveBaseAdapter);
            this.f7343a.setOnClickListener(new View.OnClickListener() { // from class: l.z16
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f23174a.m9276e(view);
                }
            });
        }
        this.f7348f.show();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void destroy() {
    }
}
