package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.account.p055ui.camera.view.AccountMakeUpMenuView;
import com.p051p1.mobile.putong.account.p055ui.camera.view.AccountMakeupItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.yf */
/* JADX INFO: loaded from: classes9.dex */
public class C21567yf extends jic0<AccountMakeUpMenuView.MakeupCategory> {

    /* JADX INFO: renamed from: c */
    public Context f199434c;

    /* JADX INFO: renamed from: d */
    public int f199435d = 0;

    /* JADX INFO: renamed from: e */
    public List<AccountMakeUpMenuView.MakeupCategory> f199436e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public a30<AccountMakeUpMenuView.MakeupCategory, Integer, Boolean> f199437f;

    public C21567yf(Context context, int i) {
        this.f199434c = context;
    }

    /* JADX INFO: renamed from: L */
    private void m215482L(int i) {
        int i2 = this.f199435d;
        this.f199435d = i;
        notifyItemChanged(i2, 0);
        notifyItemChanged(this.f199435d, 0);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f199436e.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(this.f199434c).inflate(hec0.f109109f, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, final AccountMakeUpMenuView.MakeupCategory makeupCategory, int i, final int i2) {
        AccountMakeupItemView accountMakeupItemView = (AccountMakeupItemView) view;
        accountMakeupItemView.m30057b(makeupCategory, i2 == this.f199435d);
        accountMakeupItemView.f17577a.setOnClickListener(new View.OnClickListener() { // from class: l.xf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f193993a.m215485H(i2, makeupCategory, view2);
            }
        });
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public AccountMakeUpMenuView.MakeupCategory getItem(int i) {
        return this.f199436e.get(i);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m215485H(int i, AccountMakeUpMenuView.MakeupCategory makeupCategory, View view) {
        if (NullChecker.m82486a(this.f199437f)) {
            m215482L(i);
            this.f199437f.mo37058a(makeupCategory, Integer.valueOf(i), Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m215486I(a30<AccountMakeUpMenuView.MakeupCategory, Integer, Boolean> a30Var) {
        this.f199437f = a30Var;
    }

    /* JADX INFO: renamed from: J */
    public void m215487J(int i) {
        if (i > this.f199436e.size()) {
            i = 0;
        }
        m215482L(i);
        a30<AccountMakeUpMenuView.MakeupCategory, Integer, Boolean> a30Var = this.f199437f;
        if (a30Var != null) {
            a30Var.mo37058a(this.f199436e.get(i), Integer.valueOf(i), Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m215488K(Context context, List<AccountMakeUpMenuView.MakeupCategory> list) {
        this.f199434c = context;
        this.f199436e.clear();
        if (NullChecker.m82486a(list)) {
            this.f199436e.addAll(list);
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: M */
    public void m215489M(int i) {
        this.f199435d = i;
    }
}
