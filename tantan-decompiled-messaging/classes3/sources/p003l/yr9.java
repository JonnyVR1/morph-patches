package p003l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.messages.meme.CoreMemePhotoPreviewAct;
import com.p000p1.mobile.putong.core.p001ui.messages.meme.CoreMemePhotoZoomAct;
import com.p1.mobile.putong.core.PutongCoreMvpAct;
import com.p1.mobile.putong.data.Media;
import java.util.ArrayList;
import l.qib0;
import l.s7m;
import l.vwb;
import l.xdl0;
import l.zr9;
import p028v.VText;
import p028v.fresco.photodraweeview.PhotoDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class yr9 implements s7m<wr9> {

    /* JADX INFO: renamed from: a */
    public PhotoDraweeView f9120a;

    /* JADX INFO: renamed from: b */
    public View f9121b;

    /* JADX INFO: renamed from: c */
    public VText f9122c;

    /* JADX INFO: renamed from: d */
    public wr9 f9123d;

    /* JADX INFO: renamed from: e */
    public CoreMemePhotoPreviewAct f9124e;

    public yr9(CoreMemePhotoPreviewAct coreMemePhotoPreviewAct) {
        this.f9124e = coreMemePhotoPreviewAct;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m9220C0() {
        return this.f9124e;
    }

    /* JADX INFO: renamed from: b */
    public View m9221b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return zr9.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void m9225i1(wr9 wr9Var) {
        this.f9123d = wr9Var;
    }

    /* JADX INFO: renamed from: d */
    public void m9223d(final ArrayList<Media> arrayList) {
        if (vwb.J(arrayList)) {
            return;
        }
        qib0.G.i0(this.f9120a, arrayList.get(0).url);
        xdl0.E0(this.f9122c, new View.OnClickListener() { // from class: l.xr9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8821a.m9224e(arrayList, view);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m9224e(ArrayList arrayList, View view) {
        PutongCoreMvpAct putongCoreMvpAct = this.f9124e;
        putongCoreMvpAct.startActivityForResult(CoreMemePhotoZoomAct.m2357Y1(putongCoreMvpAct, arrayList), 292);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m9221b(layoutInflater, viewGroup);
    }

    public void destroy() {
    }
}
