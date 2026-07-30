package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveUserDressUp;
import com.p046p1.mobile.putong.live.base.view.DialogTitleBar;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import java.util.ArrayList;
import java.util.List;
import p147v.VLinear;
import p147v.VRecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public class eyl0 extends LiveMenuDialogHolder<cyl0> {

    /* JADX INFO: renamed from: k */
    public LinearLayout f93762k;

    /* JADX INFO: renamed from: l */
    public DialogTitleBar f93763l;

    /* JADX INFO: renamed from: m */
    public View f93764m;

    /* JADX INFO: renamed from: n */
    public VRecyclerView f93765n;

    /* JADX INFO: renamed from: o */
    public VLinear f93766o;

    /* JADX INFO: renamed from: p */
    public cyl0 f93767p;

    /* JADX INFO: renamed from: q */
    public final LiveBaseAdapter f93768q;

    /* JADX INFO: renamed from: r */
    public final e30<BLiveUserDressUp> f93769r;

    /* JADX INFO: renamed from: l.eyl0$a */
    public class C16721a implements e30<BLiveUserDressUp> {
        public C16721a() {
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [l.ho2] */
        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(BLiveUserDressUp bLiveUserDressUp) {
            syo0.m186713d(((cyl0) eyl0.this.f47757b).m206027E2(), bLiveUserDressUp);
            vxl0.m200574d(eyl0.this.act(), bLiveUserDressUp, eyl0.this.f93767p);
        }
    }

    public eyl0(cyl0 cyl0Var) {
        super(t6c0.f168474p7, cyl0Var.act(), cyl0Var, j2g0.m139458e(true));
        this.f93768q = new LiveBaseAdapter();
        this.f93769r = new C16721a();
    }

    /* JADX INFO: renamed from: J */
    private List<d1q<?>> m118774J(List<BLiveUserDressUp> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(new yxl0(list.get(i), this.f93769r));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m118775K(View view) {
        mo71838p();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f93767p.act();
    }

    /* JADX INFO: renamed from: G */
    public final void m118776G(View view) {
        fyl0.m123774a(this, view);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(cyl0 cyl0Var) {
        this.f93767p = cyl0Var;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [l.ho2] */
    /* JADX INFO: renamed from: L */
    public void m118778L(List<BLiveUserDressUp> list, User user) {
        boolean zM200296J = vwb.m200296J(list);
        VLinear vLinear = this.f93766o;
        if (zM200296J) {
            xdl0.m208344M(vLinear, true);
            xdl0.m208344M(this.f93765n, false);
        } else {
            xdl0.m208344M(vLinear, false);
            xdl0.m208344M(this.f93765n, true);
            m118779M(list);
        }
        this.f93763l.m68715f(String.format("%s的装扮", user.isFemale() ? "她" : "他"), h1c0.f105395p1);
        syo0.m186714e(((cyl0) this.f47757b).m206027E2());
    }

    /* JADX INFO: renamed from: M */
    public void m118779M(List<BLiveUserDressUp> list) {
        this.f93768q.m67372a0(m118774J(list), false);
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f93767p.act();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    public void destroy() {
        if (isShowing()) {
            mo71838p();
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(View view) {
        m118776G(view);
        m71831A(80);
        xdl0.m208344M(this.f93763l, true);
        this.f93763l.setBackListener(new View.OnClickListener() { // from class: l.dyl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f88409a.m118775K(view2);
            }
        });
        this.f93763l.setLeftView(1);
        this.f93765n.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        this.f93765n.setAdapter(this.f93768q);
    }
}
