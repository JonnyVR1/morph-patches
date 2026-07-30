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
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class f36 implements iam<s36> {

    /* JADX INFO: renamed from: a */
    public View f96949a;

    /* JADX INFO: renamed from: b */
    public TextView f96950b;

    /* JADX INFO: renamed from: c */
    public RecyclerView f96951c;

    /* JADX INFO: renamed from: d */
    public EmptyView f96952d;

    /* JADX INFO: renamed from: e */
    public s36 f96953e;

    /* JADX INFO: renamed from: f */
    public DialogC12774a f96954f;

    /* JADX INFO: renamed from: g */
    public LiveBaseAdapter f96955g;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m123709e(View view) {
        m123712d();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f96953e.act();
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f96953e.act();
    }

    /* JADX INFO: renamed from: b */
    public View m123710b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return g36.m128713b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(s36 s36Var) {
        this.f96953e = s36Var;
    }

    /* JADX INFO: renamed from: d */
    public void m123712d() {
        ynp0.m216937n(this.f96954f);
    }

    /* JADX INFO: renamed from: f */
    public void m123713f(ArrayList<d3q<?>> arrayList) {
        boolean zM147479J = jyb.m147479J(arrayList);
        EmptyView emptyView = this.f96952d;
        if (!zM147479J) {
            bnl0.m105524M(emptyView, false);
            bnl0.m105524M(this.f96951c, true);
            this.f96955g.m68554Z(arrayList);
        } else {
            bnl0.m105524M(emptyView, true);
            bnl0.m105507D0(qa00.m175859d(220.0f), this.f96952d.f45501a);
            bnl0.m105505C0(this.f96952d.f45501a, qa00.m175859d(150.0f));
            this.f96952d.m69903e(R$string.f47941Z0).m69900b(obc0.f146089K3);
            bnl0.m105524M(this.f96951c, false);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m123714i() {
        if (this.f96954f == null) {
            this.f96954f = new c0s(this.f96953e, m123710b(act().inflater(), null));
            this.f96951c.setLayoutManager(new LinearLayoutManager(act(), 1, false));
            LiveBaseAdapter liveBaseAdapter = new LiveBaseAdapter();
            this.f96955g = liveBaseAdapter;
            this.f96951c.setAdapter(liveBaseAdapter);
            this.f96949a.setOnClickListener(new View.OnClickListener() { // from class: l.e36
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f91929a.m123709e(view);
                }
            });
        }
        this.f96954f.show();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
