package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.messages.meme.CoreMemePhotoZoomAct;
import com.p046p1.mobile.putong.data.Media;
import java.util.ArrayList;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class ls9 implements s7m<js9> {

    /* JADX INFO: renamed from: a */
    public VDraweeView f129815a;

    /* JADX INFO: renamed from: b */
    public View f129816b;

    /* JADX INFO: renamed from: c */
    public VText f129817c;

    /* JADX INFO: renamed from: d */
    public js9 f129818d;

    /* JADX INFO: renamed from: e */
    public CoreMemePhotoZoomAct f129819e;

    public ls9(CoreMemePhotoZoomAct coreMemePhotoZoomAct) {
        this.f129819e = coreMemePhotoZoomAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m151517e(ArrayList arrayList, View view) {
        zvf0.m220396r("e_add_stickers", this.f129819e.pageId());
        CoreMemePhotoZoomAct coreMemePhotoZoomAct = this.f129819e;
        coreMemePhotoZoomAct.progress(coreMemePhotoZoomAct.getString(R$string.f21059p7));
        this.f129818d.m143007s0((Media) arrayList.get(0));
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f129819e;
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f129819e;
    }

    /* JADX INFO: renamed from: b */
    public View m151518b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ms9.m156120b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(js9 js9Var) {
        this.f129818d = js9Var;
    }

    /* JADX INFO: renamed from: d */
    public void m151520d(final ArrayList<Media> arrayList) {
        if (vwb.m200296J(arrayList)) {
            return;
        }
        qib0.f154691G.m102363i0(this.f129815a, arrayList.get(0).url);
        xdl0.m208329E0(this.f129817c, new View.OnClickListener() { // from class: l.ks9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f124426a.m151517e(arrayList, view);
            }
        });
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m151518b(layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
