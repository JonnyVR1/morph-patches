package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveUserDressUp;
import com.p051p1.mobile.putong.live.base.view.DialogTitleBar;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import java.util.ArrayList;
import java.util.List;
import p151v.VLinear;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public class i7m0 extends LiveMenuDialogHolder<g7m0> {

    /* JADX INFO: renamed from: k */
    public LinearLayout f113267k;

    /* JADX INFO: renamed from: l */
    public DialogTitleBar f113268l;

    /* JADX INFO: renamed from: m */
    public View f113269m;

    /* JADX INFO: renamed from: n */
    public VRecyclerView f113270n;

    /* JADX INFO: renamed from: o */
    public VLinear f113271o;

    /* JADX INFO: renamed from: p */
    public g7m0 f113272p;

    /* JADX INFO: renamed from: q */
    public final LiveBaseAdapter f113273q;

    /* JADX INFO: renamed from: r */
    public final y20<BLiveUserDressUp> f113274r;

    /* JADX INFO: renamed from: l.i7m0$a */
    public class C17662a implements y20<BLiveUserDressUp> {
        public C17662a() {
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [l.oo2] */
        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(BLiveUserDressUp bLiveUserDressUp) {
            w7p0.m205356d(((g7m0) i7m0.this.f48605b).m213810E2(), bLiveUserDressUp);
            z6m0.m218808d(i7m0.this.act(), bLiveUserDressUp, i7m0.this.f113272p);
        }
    }

    public i7m0(g7m0 g7m0Var) {
        super(yec0.f199206p7, g7m0Var.act(), g7m0Var, qag0.m175924e(true));
        this.f113273q = new LiveBaseAdapter();
        this.f113274r = new C17662a();
    }

    /* JADX INFO: renamed from: J */
    private List<d3q<?>> m138968J(List<BLiveUserDressUp> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(new c7m0(list.get(i), this.f113274r));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m138969K(View view) {
        mo73021p();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f113272p.act();
    }

    /* JADX INFO: renamed from: G */
    public final void m138970G(View view) {
        j7m0.m143786a(this, view);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(g7m0 g7m0Var) {
        this.f113272p = g7m0Var;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [l.oo2] */
    /* JADX INFO: renamed from: L */
    public void m138972L(List<BLiveUserDressUp> list, User user) {
        boolean zM147479J = jyb.m147479J(list);
        VLinear vLinear = this.f113271o;
        if (zM147479J) {
            bnl0.m105524M(vLinear, true);
            bnl0.m105524M(this.f113270n, false);
        } else {
            bnl0.m105524M(vLinear, false);
            bnl0.m105524M(this.f113270n, true);
            m138973M(list);
        }
        this.f113268l.m69898f(String.format("%s的装扮", user.isFemale() ? "她" : "他"), n9c0.f140856p1);
        w7p0.m205357e(((g7m0) this.f48605b).m213810E2());
    }

    /* JADX INFO: renamed from: M */
    public void m138973M(List<BLiveUserDressUp> list) {
        this.f113273q.m68555a0(m138968J(list), false);
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f113272p.act();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    public void destroy() {
        if (isShowing()) {
            mo73021p();
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(View view) {
        m138970G(view);
        m73014A(80);
        bnl0.m105524M(this.f113268l, true);
        this.f113268l.setBackListener(new View.OnClickListener() { // from class: l.h7m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f108141a.m138969K(view2);
            }
        });
        this.f113268l.setLeftView(1);
        this.f113270n.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        this.f113270n.setAdapter(this.f113273q);
    }
}
