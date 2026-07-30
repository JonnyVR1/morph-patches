package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.account.p050ui.mediapicker.AccountMediaPickerBaseAct;
import com.p046p1.mobile.putong.account.p050ui.mediapicker.impl.AccountFolderItemView;
import com.p046p1.mobile.putong.account.p050ui.mediapicker.impl.AccountMediaPickerAct;
import com.p046p1.mobile.putong.api.api.FacebookApi;

/* JADX INFO: renamed from: l.dp */
/* JADX INFO: loaded from: classes9.dex */
public class C16420dp extends wp1<iti> {

    /* JADX INFO: renamed from: c */
    public int f87215c;

    /* JADX INFO: renamed from: d */
    public nqh0 f87216d;

    /* JADX INFO: renamed from: e */
    public Act f87217e;

    /* JADX INFO: renamed from: f */
    public AccountMediaPickerBaseAct.InterfaceC4671a f87218f;

    /* JADX INFO: renamed from: g */
    public q860<iti> f87219g = q860.m173341a();

    public C16420dp(int i, nqh0 nqh0Var, Act act, AccountMediaPickerBaseAct.InterfaceC4671a interfaceC4671a) {
        this.f87215c = i;
        this.f87216d = nqh0Var;
        this.f87217e = act;
        this.f87218f = interfaceC4671a;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m112840p(roj0 roj0Var) {
    }

    @Override // p149l.wp1
    /* JADX INFO: renamed from: e */
    public void mo41518e(int i) {
        if (this.f87215c != AccountMediaPickerAct.f17012B || !this.f87219g.m173343c() || i >= this.f87219g.f153135a.size() - 3 || i <= 3) {
            return;
        }
        qib0.f154712a0.m29540v(true).subscribe(mkd0.m154956H(new e30() { // from class: l.bp
            @Override // p149l.e30
            public final void call(Object obj) {
                C16420dp.m112840p((roj0) obj);
            }
        }, new e30() { // from class: l.cp
            @Override // p149l.e30
            public final void call(Object obj) {
                FacebookApi.m29530m((Throwable) obj);
            }
        }));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        int i = this.f87215c;
        int i2 = AccountMediaPickerAct.f17012B;
        int size = this.f87219g.f153135a.size();
        return i == i2 ? size : size + 1;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        if (this.f87215c == AccountMediaPickerAct.f17012B) {
            return this.f87219g.f153135a.get(i);
        }
        if (i == 0) {
            return null;
        }
        return this.f87219g.f153135a.get(i - 1);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // p149l.wp1
    /* JADX INFO: renamed from: m */
    public View mo20403m(ViewGroup viewGroup, int i) {
        return this.f87217e.inflater().inflate(c6c0.f79469I, viewGroup, false);
    }

    @Override // p149l.wp1
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void mo20402j(View view, iti itiVar, int i, int i2) {
        AccountFolderItemView accountFolderItemView = (AccountFolderItemView) view;
        if (this.f87215c == AccountMediaPickerAct.f17012B) {
            accountFolderItemView.m29171c(itiVar, false, itiVar.f114887d, null, this.f87218f);
        } else {
            accountFolderItemView.m29171c(itiVar, i2 == 0, this.f87216d.f140066a.f153135a.size(), this.f87216d.f140066a.f153135a.size() > 0 ? this.f87216d.f140066a.f153135a.get(0) : null, this.f87218f);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m112843w(q860<iti> q860Var) {
        this.f87219g = q860Var;
        notifyDataSetChanged();
    }
}
