package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.messages.meme.CoreMemePhotoZoomAct;
import com.p051p1.mobile.putong.data.Media;
import java.util.ArrayList;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class wt9 implements iam<ut9> {

    /* JADX INFO: renamed from: a */
    public VDraweeView f190723a;

    /* JADX INFO: renamed from: b */
    public View f190724b;

    /* JADX INFO: renamed from: c */
    public VText f190725c;

    /* JADX INFO: renamed from: d */
    public ut9 f190726d;

    /* JADX INFO: renamed from: e */
    public CoreMemePhotoZoomAct f190727e;

    public wt9(CoreMemePhotoZoomAct coreMemePhotoZoomAct) {
        this.f190727e = coreMemePhotoZoomAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m207823e(ArrayList arrayList, View view) {
        i4g0.m138520r("e_add_stickers", this.f190727e.pageId());
        CoreMemePhotoZoomAct coreMemePhotoZoomAct = this.f190727e;
        coreMemePhotoZoomAct.progress(coreMemePhotoZoomAct.getString(R$string.f21801p7));
        this.f190726d.m197976s0((Media) arrayList.get(0));
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f190727e;
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f190727e;
    }

    /* JADX INFO: renamed from: b */
    public View m207824b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return xt9.m213046b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(ut9 ut9Var) {
        this.f190726d = ut9Var;
    }

    /* JADX INFO: renamed from: d */
    public void m207826d(final ArrayList<Media> arrayList) {
        if (jyb.m147479J(arrayList)) {
            return;
        }
        uqb0.f180374G.m127146i0(this.f190723a, arrayList.get(0).url);
        bnl0.m105509E0(this.f190725c, new View.OnClickListener() { // from class: l.vt9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f185700a.m207823e(arrayList, view);
            }
        });
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m207824b(layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
