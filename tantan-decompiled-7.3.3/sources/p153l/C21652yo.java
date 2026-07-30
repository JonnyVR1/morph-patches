package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.account.p055ui.mediapicker.AccountMediaPickerBaseAct;
import com.p051p1.mobile.putong.account.p055ui.mediapicker.impl.AccountFolderItemView;
import com.p051p1.mobile.putong.account.p055ui.mediapicker.impl.AccountMediaPickerAct;
import com.p051p1.mobile.putong.api.api.FacebookApi;

/* JADX INFO: renamed from: l.yo */
/* JADX INFO: loaded from: classes9.dex */
public class C21652yo extends dq1<ewi> {

    /* JADX INFO: renamed from: c */
    public int f200935c;

    /* JADX INFO: renamed from: d */
    public uyh0 f200936d;

    /* JADX INFO: renamed from: e */
    public Act f200937e;

    /* JADX INFO: renamed from: f */
    public AccountMediaPickerBaseAct.InterfaceC4822a f200938f;

    /* JADX INFO: renamed from: g */
    public vg60<ewi> f200939g = vg60.m201219a();

    public C21652yo(int i, uyh0 uyh0Var, Act act, AccountMediaPickerBaseAct.InterfaceC4822a interfaceC4822a) {
        this.f200935c = i;
        this.f200936d = uyh0Var;
        this.f200937e = act;
        this.f200938f = interfaceC4822a;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m216960p(uxj0 uxj0Var) {
    }

    @Override // p153l.dq1
    /* JADX INFO: renamed from: e */
    public void mo42529e(int i) {
        if (this.f200935c != AccountMediaPickerAct.f17731B || !this.f200939g.m201221c() || i >= this.f200939g.f184001a.size() - 3 || i <= 3) {
            return;
        }
        uqb0.f180395a0.m30538v(true).subscribe(psd0.m173597H(new y20() { // from class: l.wo
            @Override // p153l.y20
            public final void call(Object obj) {
                C21652yo.m216960p((uxj0) obj);
            }
        }, new y20() { // from class: l.xo
            @Override // p153l.y20
            public final void call(Object obj) {
                FacebookApi.m30528m((Throwable) obj);
            }
        }));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        int i = this.f200935c;
        int i2 = AccountMediaPickerAct.f17731B;
        int size = this.f200939g.f184001a.size();
        return i == i2 ? size : size + 1;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        if (this.f200935c == AccountMediaPickerAct.f17731B) {
            return this.f200939g.f184001a.get(i);
        }
        if (i == 0) {
            return null;
        }
        return this.f200939g.f184001a.get(i - 1);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // p153l.dq1
    /* JADX INFO: renamed from: m */
    public View mo21402m(ViewGroup viewGroup, int i) {
        return this.f200937e.inflater().inflate(hec0.f109081I, viewGroup, false);
    }

    @Override // p153l.dq1
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void mo21401j(View view, ewi ewiVar, int i, int i2) {
        AccountFolderItemView accountFolderItemView = (AccountFolderItemView) view;
        if (this.f200935c == AccountMediaPickerAct.f17731B) {
            accountFolderItemView.m30169c(ewiVar, false, ewiVar.f96164d, null, this.f200938f);
        } else {
            accountFolderItemView.m30169c(ewiVar, i2 == 0, this.f200936d.f181617a.f184001a.size(), this.f200936d.f181617a.f184001a.size() > 0 ? this.f200936d.f181617a.f184001a.get(0) : null, this.f200938f);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m216963w(vg60<ewi> vg60Var) {
        this.f200939g = vg60Var;
        notifyDataSetChanged();
    }
}
