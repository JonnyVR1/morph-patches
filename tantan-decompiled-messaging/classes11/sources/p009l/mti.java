package p009l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.item.MediaFolderItemView;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.util.MediaWrapper;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import l.dac0;
import l.e30;
import l.e6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class mti extends dac0<iti> {

    /* JADX INFO: renamed from: c */
    public Act f17082c;

    /* JADX INFO: renamed from: d */
    public MediaWrapper f17083d;

    /* JADX INFO: renamed from: e */
    public e30<iti> f17084e;

    /* JADX INFO: renamed from: f */
    public q860<iti> f17085f = q860.m20832a();

    public mti(Act act, MediaWrapper mediaWrapper) {
        this.f17082c = act;
        this.f17083d = mediaWrapper;
    }

    /* JADX INFO: renamed from: C */
    public int m18589C() {
        return this.f17085f.f19068a.size() + 1;
    }

    /* JADX INFO: renamed from: D */
    public View m18590D(ViewGroup viewGroup, int i) {
        return this.f17082c.inflater().inflate(e6c0.h, viewGroup, false);
    }

    @Override // 
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo18588A(View view, final iti itiVar, int i, int i2) {
        MediaFolderItemView mediaFolderItemView = (MediaFolderItemView) view;
        mediaFolderItemView.m9313b();
        mediaFolderItemView.m9314d(itiVar, i2 == 0, this.f17083d);
        mediaFolderItemView.setOnClickListener(new View.OnClickListener() { // from class: l.jti
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f15288a.m18593H(itiVar, view2);
            }
        });
    }

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public iti getItem(int i) {
        if (i == 0) {
            return null;
        }
        return this.f17085f.f19068a.get(i - 1);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m18593H(iti itiVar, View view) {
        if (NullChecker.a(this.f17084e)) {
            this.f17084e.call(itiVar);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m18594I() {
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: J */
    public void m18595J(q860<iti> q860Var) {
        this.f17085f = q860Var;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: K */
    public void m18596K(e30<iti> e30Var) {
        this.f17084e = e30Var;
    }

    public long getItemId(int i) {
        return i;
    }
}
