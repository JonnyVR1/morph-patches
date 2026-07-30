package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.mediapicker.FolderItemView;
import com.p000p1.mobile.putong.core.p001ui.mediapicker.MediaPickerAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.api.api.FacebookApi;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.ui.mediapicker.MediaPickerBaseAct;
import l.f6c0;
import l.iti;
import l.mkd0;
import l.nqh0;
import l.q860;
import l.qib0;
import l.roj0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class nti extends wp1<iti> {

    /* JADX INFO: renamed from: c */
    public int f5965c;

    /* JADX INFO: renamed from: d */
    public nqh0 f5966d;

    /* JADX INFO: renamed from: e */
    public Act f5967e;

    /* JADX INFO: renamed from: f */
    public MediaPickerBaseAct.a f5968f;

    /* JADX INFO: renamed from: g */
    public q860<iti> f5969g = q860.a();

    public nti(int i, nqh0 nqh0Var, Act act, MediaPickerBaseAct.a aVar) {
        this.f5965c = i;
        this.f5966d = nqh0Var;
        this.f5967e = act;
        this.f5968f = aVar;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m6563s(roj0 roj0Var) {
    }

    @Override // p003l.wp1
    /* JADX INFO: renamed from: e */
    public void mo6564e(int i) {
        if (this.f5965c != MediaPickerAct.f513C || !this.f5969g.c() || i >= this.f5969g.a.size() - 3 || i <= 3) {
            return;
        }
        qib0.a0.v(true).subscribe((m250) mkd0.H(new e30() { // from class: l.kti
            @Override // p003l.e30
            public final void call(Object obj) {
                nti.m6563s((roj0) obj);
            }
        }, new e30() { // from class: l.lti
            @Override // p003l.e30
            public final void call(Object obj) {
                FacebookApi.m((Throwable) obj);
            }
        }));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        int i = this.f5965c;
        int i2 = MediaPickerAct.f513C;
        int size = this.f5969g.a.size();
        return i == i2 ? size : size + 1;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        if (this.f5965c == MediaPickerAct.f513C) {
            return this.f5969g.a.get(i);
        }
        if (i == 0) {
            return null;
        }
        return this.f5969g.a.get(i - 1);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // p003l.wp1
    /* JADX INFO: renamed from: m */
    public View mo1006m(ViewGroup viewGroup, int i) {
        return this.f5967e.inflater().inflate(f6c0.Vd, viewGroup, false);
    }

    @Override // p003l.wp1
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void mo1005j(View view, iti itiVar, int i, int i2) {
        FolderItemView folderItemView = (FolderItemView) view;
        if (this.f5965c == MediaPickerAct.f513C) {
            folderItemView.m836c(itiVar, false, itiVar.d, null, this.f5968f);
        } else {
            folderItemView.m836c(itiVar, i2 == 0, this.f5966d.a.a.size(), this.f5966d.a.a.size() > 0 ? (Media) this.f5966d.a.a.get(0) : null, this.f5968f);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m6566w(q860<iti> q860Var) {
        this.f5969g = q860Var;
        notifyDataSetChanged();
    }
}
