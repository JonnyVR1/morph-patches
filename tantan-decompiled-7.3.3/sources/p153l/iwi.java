package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.item.MediaFolderItemView;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.util.MediaWrapper;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes10.dex */
public class iwi extends jic0<ewi> {

    /* JADX INFO: renamed from: c */
    public Act f117270c;

    /* JADX INFO: renamed from: d */
    public MediaWrapper f117271d;

    /* JADX INFO: renamed from: e */
    public y20<ewi> f117272e;

    /* JADX INFO: renamed from: f */
    public vg60<ewi> f117273f = vg60.m201219a();

    public iwi(Act act, MediaWrapper mediaWrapper) {
        this.f117270c = act;
        this.f117271d = mediaWrapper;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f117273f.f184001a.size() + 1;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return this.f117270c.inflater().inflate(jec0.f120462h, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, final ewi ewiVar, int i, int i2) {
        MediaFolderItemView mediaFolderItemView = (MediaFolderItemView) view;
        mediaFolderItemView.m80188b();
        mediaFolderItemView.m80189d(ewiVar, i2 == 0, this.f117271d);
        mediaFolderItemView.setOnClickListener(new View.OnClickListener() { // from class: l.fwi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f101167a.m142380H(ewiVar, view2);
            }
        });
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public ewi getItem(int i) {
        if (i == 0) {
            return null;
        }
        return this.f117273f.f184001a.get(i - 1);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m142380H(ewi ewiVar, View view) {
        if (NullChecker.m82486a(this.f117272e)) {
            this.f117272e.call(ewiVar);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m142381I() {
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: J */
    public void m142382J(vg60<ewi> vg60Var) {
        this.f117273f = vg60Var;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: K */
    public void m142383K(y20<ewi> y20Var) {
        this.f117272e = y20Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }
}
