package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.FacebookApi;
import com.p051p1.mobile.putong.core.p058ui.mediapicker.FolderItemView;
import com.p051p1.mobile.putong.core.p058ui.mediapicker.MediaPickerAct;
import com.p051p1.mobile.putong.p070ui.mediapicker.MediaPickerBaseAct;

/* JADX INFO: loaded from: classes3.dex */
public class jwi extends dq1<ewi> {

    /* JADX INFO: renamed from: c */
    public int f122931c;

    /* JADX INFO: renamed from: d */
    public uyh0 f122932d;

    /* JADX INFO: renamed from: e */
    public Act f122933e;

    /* JADX INFO: renamed from: f */
    public MediaPickerBaseAct.InterfaceC13290a f122934f;

    /* JADX INFO: renamed from: g */
    public vg60<ewi> f122935g = vg60.m201219a();

    public jwi(int i, uyh0 uyh0Var, Act act, MediaPickerBaseAct.InterfaceC13290a interfaceC13290a) {
        this.f122931c = i;
        this.f122932d = uyh0Var;
        this.f122933e = act;
        this.f122934f = interfaceC13290a;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m147164s(uxj0 uxj0Var) {
    }

    @Override // p153l.dq1
    /* JADX INFO: renamed from: e */
    public void mo42529e(int i) {
        if (this.f122931c != MediaPickerAct.f31470C || !this.f122935g.m201221c() || i >= this.f122935g.f184001a.size() - 3 || i <= 3) {
            return;
        }
        uqb0.f180395a0.m30538v(true).subscribe(psd0.m173597H(new y20() { // from class: l.gwi
            @Override // p153l.y20
            public final void call(Object obj) {
                jwi.m147164s((uxj0) obj);
            }
        }, new y20() { // from class: l.hwi
            @Override // p153l.y20
            public final void call(Object obj) {
                FacebookApi.m30528m((Throwable) obj);
            }
        }));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        int i = this.f122931c;
        int i2 = MediaPickerAct.f31470C;
        int size = this.f122935g.f184001a.size();
        return i == i2 ? size : size + 1;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        if (this.f122931c == MediaPickerAct.f31470C) {
            return this.f122935g.f184001a.get(i);
        }
        if (i == 0) {
            return null;
        }
        return this.f122935g.f184001a.get(i - 1);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // p153l.dq1
    /* JADX INFO: renamed from: m */
    public View mo21402m(ViewGroup viewGroup, int i) {
        return this.f122933e.inflater().inflate(kec0.f125785ce, viewGroup, false);
    }

    @Override // p153l.dq1
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void mo21401j(View view, ewi ewiVar, int i, int i2) {
        FolderItemView folderItemView = (FolderItemView) view;
        if (this.f122931c == MediaPickerAct.f31470C) {
            folderItemView.m48955c(ewiVar, false, ewiVar.f96164d, null, this.f122934f);
        } else {
            folderItemView.m48955c(ewiVar, i2 == 0, this.f122932d.f181617a.f184001a.size(), this.f122932d.f181617a.f184001a.size() > 0 ? this.f122932d.f181617a.f184001a.get(0) : null, this.f122934f);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m147166w(vg60<ewi> vg60Var) {
        this.f122935g = vg60Var;
        notifyDataSetChanged();
    }
}
