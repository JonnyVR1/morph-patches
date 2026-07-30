package p149l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveVoicePlayModeItem;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import java.util.ArrayList;
import java.util.List;
import p147v.VRecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public class j3m0 extends LiveMenuDialogHolder<u3m0> {

    /* JADX INFO: renamed from: k */
    public View f116087k;

    /* JADX INFO: renamed from: l */
    public ConstraintLayout f116088l;

    /* JADX INFO: renamed from: m */
    public TextView f116089m;

    /* JADX INFO: renamed from: n */
    public View f116090n;

    /* JADX INFO: renamed from: o */
    public View f116091o;

    /* JADX INFO: renamed from: p */
    public VRecyclerView f116092p;

    /* JADX INFO: renamed from: q */
    public Button f116093q;

    /* JADX INFO: renamed from: r */
    public u8n0 f116094r;

    /* JADX INFO: renamed from: s */
    public LiveBaseAdapter f116095s;

    public j3m0(Act act, @NonNull u3m0 u3m0Var) {
        super(t6c0.f168358g8, act, u3m0Var);
        this.f116095s = new LiveBaseAdapter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m139583Q(View view) {
        m139586J(this.f116094r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m139584R(View view) {
        m139590N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m139585S(View view) {
        m139590N();
    }

    /* JADX INFO: renamed from: J */
    public final void m139586J(u8n0 u8n0Var) {
        if (u8n0Var == null) {
            return;
        }
        ((u3m0) this.f47757b).m191602e4(u8n0Var);
        m139590N();
    }

    /* JADX INFO: renamed from: K */
    public final void m139587K(View view) {
        k3m0.m144412a(this, view);
    }

    /* JADX INFO: renamed from: M */
    public final List<u8n0> m139589M(List<BLiveVoicePlayModeItem> list, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        if (!vwb.m200296J(list)) {
            boolean z = false;
            for (int i = 0; i < list.size(); i++) {
                final u8n0 u8n0Var = new u8n0(new t8n0(list.get(i), false, i));
                u8n0Var.mo109662A(new View.OnClickListener() { // from class: l.i3m0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f111346a.m139592P(u8n0Var, view);
                    }
                });
                arrayList.add(u8n0Var);
                if (TextUtils.isEmpty(str2)) {
                    if (TextUtils.equals(list.get(i).template, str)) {
                        u8n0Var.f175146a.m187559c(true);
                        this.f116094r = u8n0Var;
                        z = true;
                    }
                } else if (TextUtils.equals(list.get(i).type, str2) && TextUtils.equals(list.get(i).template, str)) {
                    u8n0Var.f175146a.m187559c(true);
                    this.f116094r = u8n0Var;
                    z = true;
                }
            }
            if (!z) {
                this.f116094r = (u8n0) arrayList.get(0);
                ((u8n0) arrayList.get(0)).f175146a.m187559c(true);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: N */
    public void m139590N() {
        this.f116094r = null;
        this.f116095s.m67355J().clear();
        mo71838p();
    }

    /* JADX INFO: renamed from: O */
    public final void m139591O(u8n0 u8n0Var) {
        u8n0 u8n0Var2 = this.f116094r;
        if (u8n0Var2 == null) {
            this.f116094r = u8n0Var;
            u8n0Var.f175146a.m187559c(true);
            this.f116095s.m67360O(u8n0Var);
        } else {
            if (u8n0Var2 == u8n0Var) {
                return;
            }
            u8n0Var2.f175146a.m187559c(false);
            this.f116095s.m67360O(this.f116094r);
            u8n0Var.f175146a.m187559c(true);
            this.f116095s.m67360O(u8n0Var);
            this.f116094r = u8n0Var;
        }
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m139592P(u8n0 u8n0Var, View view) {
        m139591O(u8n0Var);
    }

    /* JADX INFO: renamed from: T */
    public void m139593T(List<BLiveVoicePlayModeItem> list, String str, String str2) {
        this.f116092p.setLayoutManager(new GridLayoutManager(((u3m0) this.f47757b).m104249C0(), 4));
        this.f116092p.setAdapter(this.f116095s);
        this.f116095s.m67371Z(m139589M(list, str, str2));
        this.f116095s.notifyDataSetChanged();
        xdl0.m208325C0(this.f116092p, t100.m186890d(((list.size() / 4) + (list.size() % 4 == 0 ? 0 : 1)) * 100));
    }

    /* JADX INFO: renamed from: U */
    public void m139594U(List<BLiveVoicePlayModeItem> list, String str, String str2) {
        m71834E();
        m139593T(list, str, str2);
        xdl0.m208329E0(this.f116093q, new View.OnClickListener() { // from class: l.f3m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f94698a.m139583Q(view);
            }
        });
        xdl0.m208329E0(this.f116087k, new View.OnClickListener() { // from class: l.g3m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f100483a.m139584R(view);
            }
        });
        xdl0.m208329E0(this.f116090n, new View.OnClickListener() { // from class: l.h3m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f105749a.m139585S(view);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(View view) {
        super.mo71836m(view);
        m139587K(view);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(u3m0 u3m0Var) {
    }
}
