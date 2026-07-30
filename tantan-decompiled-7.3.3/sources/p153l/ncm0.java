package p153l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveVoicePlayModeItem;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import java.util.ArrayList;
import java.util.List;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public class ncm0 extends LiveMenuDialogHolder<ycm0> {

    /* JADX INFO: renamed from: k */
    public View f141382k;

    /* JADX INFO: renamed from: l */
    public ConstraintLayout f141383l;

    /* JADX INFO: renamed from: m */
    public TextView f141384m;

    /* JADX INFO: renamed from: n */
    public View f141385n;

    /* JADX INFO: renamed from: o */
    public View f141386o;

    /* JADX INFO: renamed from: p */
    public VRecyclerView f141387p;

    /* JADX INFO: renamed from: q */
    public Button f141388q;

    /* JADX INFO: renamed from: r */
    public yhn0 f141389r;

    /* JADX INFO: renamed from: s */
    public LiveBaseAdapter f141390s;

    public ncm0(Act act, @NonNull ycm0 ycm0Var) {
        super(yec0.f199090g8, act, ycm0Var);
        this.f141390s = new LiveBaseAdapter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m162571Q(View view) {
        m162574J(this.f141389r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m162572R(View view) {
        m162578N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m162573S(View view) {
        m162578N();
    }

    /* JADX INFO: renamed from: J */
    public final void m162574J(yhn0 yhn0Var) {
        if (yhn0Var == null) {
            return;
        }
        ((ycm0) this.f48605b).m215165e4(yhn0Var);
        m162578N();
    }

    /* JADX INFO: renamed from: K */
    public final void m162575K(View view) {
        ocm0.m167233a(this, view);
    }

    /* JADX INFO: renamed from: M */
    public final List<yhn0> m162577M(List<BLiveVoicePlayModeItem> list, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        if (!jyb.m147479J(list)) {
            boolean z = false;
            for (int i = 0; i < list.size(); i++) {
                final yhn0 yhn0Var = new yhn0(new xhn0(list.get(i), false, i));
                yhn0Var.mo113881A(new View.OnClickListener() { // from class: l.mcm0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f135825a.m162580P(yhn0Var, view);
                    }
                });
                arrayList.add(yhn0Var);
                if (TextUtils.isEmpty(str2)) {
                    if (TextUtils.equals(list.get(i).template, str)) {
                        yhn0Var.f199979a.m211074c(true);
                        this.f141389r = yhn0Var;
                        z = true;
                    }
                } else if (TextUtils.equals(list.get(i).type, str2) && TextUtils.equals(list.get(i).template, str)) {
                    yhn0Var.f199979a.m211074c(true);
                    this.f141389r = yhn0Var;
                    z = true;
                }
            }
            if (!z) {
                this.f141389r = (yhn0) arrayList.get(0);
                ((yhn0) arrayList.get(0)).f199979a.m211074c(true);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: N */
    public void m162578N() {
        this.f141389r = null;
        this.f141390s.m68538J().clear();
        mo73021p();
    }

    /* JADX INFO: renamed from: O */
    public final void m162579O(yhn0 yhn0Var) {
        yhn0 yhn0Var2 = this.f141389r;
        if (yhn0Var2 == null) {
            this.f141389r = yhn0Var;
            yhn0Var.f199979a.m211074c(true);
            this.f141390s.m68543O(yhn0Var);
        } else {
            if (yhn0Var2 == yhn0Var) {
                return;
            }
            yhn0Var2.f199979a.m211074c(false);
            this.f141390s.m68543O(this.f141389r);
            yhn0Var.f199979a.m211074c(true);
            this.f141390s.m68543O(yhn0Var);
            this.f141389r = yhn0Var;
        }
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m162580P(yhn0 yhn0Var, View view) {
        m162579O(yhn0Var);
    }

    /* JADX INFO: renamed from: T */
    public void m162581T(List<BLiveVoicePlayModeItem> list, String str, String str2) {
        this.f141387p.setLayoutManager(new GridLayoutManager(((ycm0) this.f48605b).m113230C0(), 4));
        this.f141387p.setAdapter(this.f141390s);
        this.f141390s.m68554Z(m162577M(list, str, str2));
        this.f141390s.notifyDataSetChanged();
        bnl0.m105505C0(this.f141387p, qa00.m175859d(((list.size() / 4) + (list.size() % 4 == 0 ? 0 : 1)) * 100));
    }

    /* JADX INFO: renamed from: U */
    public void m162582U(List<BLiveVoicePlayModeItem> list, String str, String str2) {
        m73017E();
        m162581T(list, str, str2);
        bnl0.m105509E0(this.f141388q, new View.OnClickListener() { // from class: l.jcm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f120078a.m162571Q(view);
            }
        });
        bnl0.m105509E0(this.f141382k, new View.OnClickListener() { // from class: l.kcm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f125078a.m162572R(view);
            }
        });
        bnl0.m105509E0(this.f141385n, new View.OnClickListener() { // from class: l.lcm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f131368a.m162573S(view);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(View view) {
        super.mo73019m(view);
        m162575K(view);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(ycm0 ycm0Var) {
    }
}
