package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.base.view.EmptyView;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class tzp implements iam<rzp> {

    /* JADX INFO: renamed from: a */
    public View f176788a;

    /* JADX INFO: renamed from: b */
    public TextView f176789b;

    /* JADX INFO: renamed from: c */
    public RecyclerView f176790c;

    /* JADX INFO: renamed from: d */
    public EmptyView f176791d;

    /* JADX INFO: renamed from: e */
    public rzp f176792e;

    /* JADX INFO: renamed from: f */
    public DialogC12774a f176793f;

    /* JADX INFO: renamed from: g */
    public LiveBaseAdapter f176794g;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m193687f(View view) {
        this.f176793f.dismiss();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f176792e.act();
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f176792e.act();
    }

    /* JADX INFO: renamed from: b */
    public View m193688b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return uzp.m198851b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(rzp rzpVar) {
        this.f176792e = rzpVar;
    }

    /* JADX INFO: renamed from: d */
    public void m193690d() {
        ynp0.m216937n(this.f176793f);
    }

    /* JADX INFO: renamed from: e */
    public List<d3q<?>> m193691e() {
        return this.f176794g.m68538J();
    }

    /* JADX INFO: renamed from: i */
    public void m193692i(List<d3q<?>> list) {
        if (jyb.m147479J(list)) {
            bnl0.m105524M(this.f176791d, true);
            bnl0.m105524M(this.f176790c, false);
            this.f176791d.m69900b(obc0.f146204U4).m69903e(R$string.f48248n1);
        } else {
            this.f176794g.m68554Z(list);
            bnl0.m105524M(this.f176791d, false);
            bnl0.m105524M(this.f176790c, true);
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m193693j() {
        if (this.f176793f == null) {
            this.f176793f = new c0s(this.f176792e, m193688b(act().inflater(), null));
            this.f176790c.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
            LiveBaseAdapter liveBaseAdapter = new LiveBaseAdapter();
            this.f176794g = liveBaseAdapter;
            this.f176790c.setAdapter(liveBaseAdapter);
            this.f176788a.setOnClickListener(new View.OnClickListener() { // from class: l.szp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f171410a.m193687f(view);
                }
            });
        }
        this.f176793f.show();
    }

    /* JADX INFO: renamed from: k */
    public void m193694k(hzp hzpVar) {
        this.f176794g.m68543O(hzpVar);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
