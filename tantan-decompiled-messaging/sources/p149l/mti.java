package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.item.MediaFolderItemView;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.util.MediaWrapper;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class mti extends dac0<iti> {

    /* JADX INFO: renamed from: c */
    public Act f135602c;

    /* JADX INFO: renamed from: d */
    public MediaWrapper f135603d;

    /* JADX INFO: renamed from: e */
    public e30<iti> f135604e;

    /* JADX INFO: renamed from: f */
    public q860<iti> f135605f = q860.m173341a();

    public mti(Act act, MediaWrapper mediaWrapper) {
        this.f135602c = act;
        this.f135603d = mediaWrapper;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f135605f.f153135a.size() + 1;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return this.f135602c.inflater().inflate(e6c0.f89549h, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, final iti itiVar, int i, int i2) {
        MediaFolderItemView mediaFolderItemView = (MediaFolderItemView) view;
        mediaFolderItemView.m79005b();
        mediaFolderItemView.m79006d(itiVar, i2 == 0, this.f135603d);
        mediaFolderItemView.setOnClickListener(new View.OnClickListener() { // from class: l.jti
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f119607a.m156228H(itiVar, view2);
            }
        });
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public iti getItem(int i) {
        if (i == 0) {
            return null;
        }
        return this.f135605f.f153135a.get(i - 1);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m156228H(iti itiVar, View view) {
        if (NullChecker.m81303a(this.f135604e)) {
            this.f135604e.call(itiVar);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m156229I() {
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: J */
    public void m156230J(q860<iti> q860Var) {
        this.f135605f = q860Var;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: K */
    public void m156231K(e30<iti> e30Var) {
        this.f135604e = e30Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }
}
