package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.FacebookApi;
import com.p046p1.mobile.putong.core.p053ui.mediapicker.FolderItemView;
import com.p046p1.mobile.putong.core.p053ui.mediapicker.MediaPickerAct;
import com.p046p1.mobile.putong.p065ui.mediapicker.MediaPickerBaseAct;

/* JADX INFO: loaded from: classes3.dex */
public class nti extends wp1<iti> {

    /* JADX INFO: renamed from: c */
    public int f140476c;

    /* JADX INFO: renamed from: d */
    public nqh0 f140477d;

    /* JADX INFO: renamed from: e */
    public Act f140478e;

    /* JADX INFO: renamed from: f */
    public MediaPickerBaseAct.InterfaceC13127a f140479f;

    /* JADX INFO: renamed from: g */
    public q860<iti> f140480g = q860.m173341a();

    public nti(int i, nqh0 nqh0Var, Act act, MediaPickerBaseAct.InterfaceC13127a interfaceC13127a) {
        this.f140476c = i;
        this.f140477d = nqh0Var;
        this.f140478e = act;
        this.f140479f = interfaceC13127a;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m161382s(roj0 roj0Var) {
    }

    @Override // p149l.wp1
    /* JADX INFO: renamed from: e */
    public void mo41518e(int i) {
        if (this.f140476c != MediaPickerAct.f30622C || !this.f140480g.m173343c() || i >= this.f140480g.f153135a.size() - 3 || i <= 3) {
            return;
        }
        qib0.f154712a0.m29540v(true).subscribe(mkd0.m154956H(new e30() { // from class: l.kti
            @Override // p149l.e30
            public final void call(Object obj) {
                nti.m161382s((roj0) obj);
            }
        }, new e30() { // from class: l.lti
            @Override // p149l.e30
            public final void call(Object obj) {
                FacebookApi.m29530m((Throwable) obj);
            }
        }));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        int i = this.f140476c;
        int i2 = MediaPickerAct.f30622C;
        int size = this.f140480g.f153135a.size();
        return i == i2 ? size : size + 1;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        if (this.f140476c == MediaPickerAct.f30622C) {
            return this.f140480g.f153135a.get(i);
        }
        if (i == 0) {
            return null;
        }
        return this.f140480g.f153135a.get(i - 1);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // p149l.wp1
    /* JADX INFO: renamed from: m */
    public View mo20403m(ViewGroup viewGroup, int i) {
        return this.f140478e.inflater().inflate(f6c0.f95616Vd, viewGroup, false);
    }

    @Override // p149l.wp1
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void mo20402j(View view, iti itiVar, int i, int i2) {
        FolderItemView folderItemView = (FolderItemView) view;
        if (this.f140476c == MediaPickerAct.f30622C) {
            folderItemView.m47772c(itiVar, false, itiVar.f114887d, null, this.f140479f);
        } else {
            folderItemView.m47772c(itiVar, i2 == 0, this.f140477d.f140066a.f153135a.size(), this.f140477d.f140066a.f153135a.size() > 0 ? this.f140477d.f140066a.f153135a.get(0) : null, this.f140479f);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m161384w(q860<iti> q860Var) {
        this.f140480g = q860Var;
        notifyDataSetChanged();
    }
}
