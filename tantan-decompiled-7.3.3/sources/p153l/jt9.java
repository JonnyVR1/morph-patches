package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.p058ui.messages.meme.CoreMemePhotoPreviewAct;
import com.p051p1.mobile.putong.core.p058ui.messages.meme.CoreMemePhotoZoomAct;
import com.p051p1.mobile.putong.data.Media;
import java.util.ArrayList;
import p151v.VText;
import p151v.fresco.photodraweeview.PhotoDraweeView;

/* JADX INFO: loaded from: classes3.dex */
public class jt9 implements iam<ht9> {

    /* JADX INFO: renamed from: a */
    public PhotoDraweeView f122565a;

    /* JADX INFO: renamed from: b */
    public View f122566b;

    /* JADX INFO: renamed from: c */
    public VText f122567c;

    /* JADX INFO: renamed from: d */
    public ht9 f122568d;

    /* JADX INFO: renamed from: e */
    public CoreMemePhotoPreviewAct f122569e;

    public jt9(CoreMemePhotoPreviewAct coreMemePhotoPreviewAct) {
        this.f122569e = coreMemePhotoPreviewAct;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f122569e;
    }

    /* JADX INFO: renamed from: b */
    public View m146891b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return kt9.m151341b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(ht9 ht9Var) {
        this.f122568d = ht9Var;
    }

    /* JADX INFO: renamed from: d */
    public void m146893d(final ArrayList<Media> arrayList) {
        if (jyb.m147479J(arrayList)) {
            return;
        }
        uqb0.f180374G.m127146i0(this.f122565a, arrayList.get(0).url);
        bnl0.m105509E0(this.f122567c, new View.OnClickListener() { // from class: l.it9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f116808a.m146894e(arrayList, view);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m146894e(ArrayList arrayList, View view) {
        CoreMemePhotoPreviewAct coreMemePhotoPreviewAct = this.f122569e;
        coreMemePhotoPreviewAct.startActivityForResult(CoreMemePhotoZoomAct.m50419Z1(coreMemePhotoPreviewAct, arrayList), 292);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m146891b(layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
