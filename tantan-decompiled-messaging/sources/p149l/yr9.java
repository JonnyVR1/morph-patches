package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.p053ui.messages.meme.CoreMemePhotoPreviewAct;
import com.p046p1.mobile.putong.core.p053ui.messages.meme.CoreMemePhotoZoomAct;
import com.p046p1.mobile.putong.data.Media;
import java.util.ArrayList;
import p147v.VText;
import p147v.fresco.photodraweeview.PhotoDraweeView;

/* JADX INFO: loaded from: classes3.dex */
public class yr9 implements s7m<wr9> {

    /* JADX INFO: renamed from: a */
    public PhotoDraweeView f199646a;

    /* JADX INFO: renamed from: b */
    public View f199647b;

    /* JADX INFO: renamed from: c */
    public VText f199648c;

    /* JADX INFO: renamed from: d */
    public wr9 f199649d;

    /* JADX INFO: renamed from: e */
    public CoreMemePhotoPreviewAct f199650e;

    public yr9(CoreMemePhotoPreviewAct coreMemePhotoPreviewAct) {
        this.f199650e = coreMemePhotoPreviewAct;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f199650e;
    }

    /* JADX INFO: renamed from: b */
    public View m215830b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return zr9.m219926b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(wr9 wr9Var) {
        this.f199649d = wr9Var;
    }

    /* JADX INFO: renamed from: d */
    public void m215832d(final ArrayList<Media> arrayList) {
        if (vwb.m200296J(arrayList)) {
            return;
        }
        qib0.f154691G.m102363i0(this.f199646a, arrayList.get(0).url);
        xdl0.m208329E0(this.f199648c, new View.OnClickListener() { // from class: l.xr9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f194102a.m215833e(arrayList, view);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m215833e(ArrayList arrayList, View view) {
        CoreMemePhotoPreviewAct coreMemePhotoPreviewAct = this.f199650e;
        coreMemePhotoPreviewAct.startActivityForResult(CoreMemePhotoZoomAct.m49236Y1(coreMemePhotoPreviewAct, arrayList), 292);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m215830b(layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
