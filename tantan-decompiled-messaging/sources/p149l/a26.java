package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.base.view.EmptyView;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class a26 implements s7m<n26> {

    /* JADX INFO: renamed from: a */
    public View f67230a;

    /* JADX INFO: renamed from: b */
    public TextView f67231b;

    /* JADX INFO: renamed from: c */
    public RecyclerView f67232c;

    /* JADX INFO: renamed from: d */
    public EmptyView f67233d;

    /* JADX INFO: renamed from: e */
    public n26 f67234e;

    /* JADX INFO: renamed from: f */
    public DialogC12611a f67235f;

    /* JADX INFO: renamed from: g */
    public LiveBaseAdapter f67236g;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m94593e(View view) {
        m94596d();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f67234e.act();
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f67234e.act();
    }

    /* JADX INFO: renamed from: b */
    public View m94594b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return b26.m99899b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(n26 n26Var) {
        this.f67234e = n26Var;
    }

    /* JADX INFO: renamed from: d */
    public void m94596d() {
        uep0.m193327n(this.f67235f);
    }

    /* JADX INFO: renamed from: f */
    public void m94597f(ArrayList<d1q<?>> arrayList) {
        boolean zM200296J = vwb.m200296J(arrayList);
        EmptyView emptyView = this.f67233d;
        if (!zM200296J) {
            xdl0.m208344M(emptyView, false);
            xdl0.m208344M(this.f67232c, true);
            this.f67236g.m67371Z(arrayList);
        } else {
            xdl0.m208344M(emptyView, true);
            xdl0.m208327D0(t100.m186890d(220.0f), this.f67233d.f44653a);
            xdl0.m208325C0(this.f67233d.f44653a, t100.m186890d(150.0f));
            this.f67233d.m68720e(R$string.f47093Z0).m68717b(i3c0.f110761K3);
            xdl0.m208344M(this.f67232c, false);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m94598i() {
        if (this.f67235f == null) {
            this.f67235f = new byr(this.f67234e, m94594b(act().inflater(), null));
            this.f67232c.setLayoutManager(new LinearLayoutManager(act(), 1, false));
            LiveBaseAdapter liveBaseAdapter = new LiveBaseAdapter();
            this.f67236g = liveBaseAdapter;
            this.f67232c.setAdapter(liveBaseAdapter);
            this.f67230a.setOnClickListener(new View.OnClickListener() { // from class: l.z16
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f201049a.m94593e(view);
                }
            });
        }
        this.f67235f.show();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
