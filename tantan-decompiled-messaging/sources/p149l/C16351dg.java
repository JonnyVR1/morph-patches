package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.account.p050ui.camera.view.AccountMakeUpMenuView;
import com.p046p1.mobile.putong.account.p050ui.camera.view.AccountMakeupItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.dg */
/* JADX INFO: loaded from: classes9.dex */
public class C16351dg extends dac0<AccountMakeUpMenuView.MakeupCategory> {

    /* JADX INFO: renamed from: c */
    public Context f85988c;

    /* JADX INFO: renamed from: d */
    public int f85989d = 0;

    /* JADX INFO: renamed from: e */
    public List<AccountMakeUpMenuView.MakeupCategory> f85990e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public g30<AccountMakeUpMenuView.MakeupCategory, Integer, Boolean> f85991f;

    public C16351dg(Context context, int i) {
        this.f85988c = context;
    }

    /* JADX INFO: renamed from: L */
    private void m111532L(int i) {
        int i2 = this.f85989d;
        this.f85989d = i;
        notifyItemChanged(i2, 0);
        notifyItemChanged(this.f85989d, 0);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f85990e.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(this.f85988c).inflate(c6c0.f79497f, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, final AccountMakeUpMenuView.MakeupCategory makeupCategory, int i, final int i2) {
        AccountMakeupItemView accountMakeupItemView = (AccountMakeupItemView) view;
        accountMakeupItemView.m29058b(makeupCategory, i2 == this.f85989d);
        accountMakeupItemView.f16858a.setOnClickListener(new View.OnClickListener() { // from class: l.cg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f80686a.m111535H(i2, makeupCategory, view2);
            }
        });
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public AccountMakeUpMenuView.MakeupCategory getItem(int i) {
        return this.f85990e.get(i);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m111535H(int i, AccountMakeUpMenuView.MakeupCategory makeupCategory, View view) {
        if (NullChecker.m81303a(this.f85991f)) {
            m111532L(i);
            this.f85991f.mo36055a(makeupCategory, Integer.valueOf(i), Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m111536I(g30<AccountMakeUpMenuView.MakeupCategory, Integer, Boolean> g30Var) {
        this.f85991f = g30Var;
    }

    /* JADX INFO: renamed from: J */
    public void m111537J(int i) {
        if (i > this.f85990e.size()) {
            i = 0;
        }
        m111532L(i);
        g30<AccountMakeUpMenuView.MakeupCategory, Integer, Boolean> g30Var = this.f85991f;
        if (g30Var != null) {
            g30Var.mo36055a(this.f85990e.get(i), Integer.valueOf(i), Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m111538K(Context context, List<AccountMakeUpMenuView.MakeupCategory> list) {
        this.f85988c = context;
        this.f85990e.clear();
        if (NullChecker.m81303a(list)) {
            this.f85990e.addAll(list);
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: M */
    public void m111539M(int i) {
        this.f85989d = i;
    }
}
