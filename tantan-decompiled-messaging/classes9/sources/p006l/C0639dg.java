package p006l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountMakeUpMenuView;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountMakeupItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.g30;

/* JADX INFO: renamed from: l.dg */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0639dg extends dac0<AccountMakeUpMenuView.MakeupCategory> {

    /* JADX INFO: renamed from: c */
    public Context f10384c;

    /* JADX INFO: renamed from: d */
    public int f10385d = 0;

    /* JADX INFO: renamed from: e */
    public List<AccountMakeUpMenuView.MakeupCategory> f10386e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public g30<AccountMakeUpMenuView.MakeupCategory, Integer, Boolean> f10387f;

    public C0639dg(Context context, int i) {
        this.f10384c = context;
    }

    /* JADX INFO: renamed from: L */
    private void m14025L(int i) {
        int i2 = this.f10385d;
        this.f10385d = i;
        notifyItemChanged(i2, 0);
        notifyItemChanged(this.f10385d, 0);
    }

    /* JADX INFO: renamed from: C */
    public int m14027C() {
        return this.f10386e.size();
    }

    /* JADX INFO: renamed from: D */
    public View m14028D(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(this.f10384c).inflate(c6c0.f9427f, viewGroup, false);
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void m14026A(View view, final AccountMakeUpMenuView.MakeupCategory makeupCategory, int i, final int i2) {
        AccountMakeupItemView accountMakeupItemView = (AccountMakeupItemView) view;
        accountMakeupItemView.m964b(makeupCategory, i2 == this.f10385d);
        accountMakeupItemView.f847a.setOnClickListener(new View.OnClickListener() { // from class: l.cg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f9644a.m14031H(i2, makeupCategory, view2);
            }
        });
    }

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public AccountMakeUpMenuView.MakeupCategory getItem(int i) {
        return this.f10386e.get(i);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m14031H(int i, AccountMakeUpMenuView.MakeupCategory makeupCategory, View view) {
        if (NullChecker.a(this.f10387f)) {
            m14025L(i);
            this.f10387f.a(makeupCategory, Integer.valueOf(i), Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m14032I(g30<AccountMakeUpMenuView.MakeupCategory, Integer, Boolean> g30Var) {
        this.f10387f = g30Var;
    }

    /* JADX INFO: renamed from: J */
    public void m14033J(int i) {
        if (i > this.f10386e.size()) {
            i = 0;
        }
        m14025L(i);
        g30<AccountMakeUpMenuView.MakeupCategory, Integer, Boolean> g30Var = this.f10387f;
        if (g30Var != null) {
            g30Var.a(this.f10386e.get(i), Integer.valueOf(i), Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m14034K(Context context, List<AccountMakeUpMenuView.MakeupCategory> list) {
        this.f10384c = context;
        this.f10386e.clear();
        if (NullChecker.a(list)) {
            this.f10386e.addAll(list);
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: M */
    public void m14035M(int i) {
        this.f10385d = i;
    }
}
