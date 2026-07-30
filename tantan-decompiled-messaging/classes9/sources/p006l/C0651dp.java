package p006l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.account.p002ui.mediapicker.AccountMediaPickerBaseAct;
import com.p000p1.mobile.putong.account.p002ui.mediapicker.impl.AccountFolderItemView;
import com.p000p1.mobile.putong.account.p002ui.mediapicker.impl.AccountMediaPickerAct;
import com.p000p1.mobile.putong.api.api.FacebookApi;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.Media;
import l.e30;
import l.iti;
import l.mkd0;
import l.nqh0;
import l.q860;
import l.roj0;
import l.wp1;

/* JADX INFO: renamed from: l.dp */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0651dp extends wp1<iti> {

    /* JADX INFO: renamed from: c */
    public int f10499c;

    /* JADX INFO: renamed from: d */
    public nqh0 f10500d;

    /* JADX INFO: renamed from: e */
    public Act f10501e;

    /* JADX INFO: renamed from: f */
    public AccountMediaPickerBaseAct.InterfaceC0097a f10502f;

    /* JADX INFO: renamed from: g */
    public q860<iti> f10503g = q860.a();

    public C0651dp(int i, nqh0 nqh0Var, Act act, AccountMediaPickerBaseAct.InterfaceC0097a interfaceC0097a) {
        this.f10499c = i;
        this.f10500d = nqh0Var;
        this.f10501e = act;
        this.f10502f = interfaceC0097a;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m14166p(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: e */
    public void m14168e(int i) {
        if (this.f10499c != AccountMediaPickerAct.f1001B || !this.f10503g.c() || i >= this.f10503g.a.size() - 3 || i <= 3) {
            return;
        }
        qib0.f19803a0.m1446v(true).subscribe(mkd0.H(new e30() { // from class: l.bp
            public final void call(Object obj) {
                C0651dp.m14166p((roj0) obj);
            }
        }, new e30() { // from class: l.cp
            public final void call(Object obj) {
                FacebookApi.m1436m((Throwable) obj);
            }
        }));
    }

    public int getCount() {
        int i = this.f10499c;
        int i2 = AccountMediaPickerAct.f1001B;
        int size = this.f10503g.a.size();
        return i == i2 ? size : size + 1;
    }

    public Object getItem(int i) {
        if (this.f10499c == AccountMediaPickerAct.f1001B) {
            return this.f10503g.a.get(i);
        }
        if (i == 0) {
            return null;
        }
        return this.f10503g.a.get(i - 1);
    }

    public long getItemId(int i) {
        return i;
    }

    /* JADX INFO: renamed from: m */
    public View m14170m(ViewGroup viewGroup, int i) {
        return this.f10501e.inflater().inflate(c6c0.f9399I, viewGroup, false);
    }

    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void m14169j(View view, iti itiVar, int i, int i2) {
        AccountFolderItemView accountFolderItemView = (AccountFolderItemView) view;
        if (this.f10499c == AccountMediaPickerAct.f1001B) {
            accountFolderItemView.m1077c(itiVar, false, itiVar.d, null, this.f10502f);
        } else {
            accountFolderItemView.m1077c(itiVar, i2 == 0, this.f10500d.a.a.size(), this.f10500d.a.a.size() > 0 ? (Media) this.f10500d.a.a.get(0) : null, this.f10502f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w */
    public void m14172w(q860<iti> q860Var) {
        this.f10503g = q860Var;
        notifyDataSetChanged();
    }
}
