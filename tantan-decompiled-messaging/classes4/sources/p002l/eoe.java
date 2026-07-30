package p002l;

import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.ui.webview.WebViewAct;
import l.juk;
import l.mcr;
import l.xdl0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class eoe extends pqa0 {

    /* JADX INFO: renamed from: y */
    public pe90 f9896y;

    public eoe(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
        this.f9896y = new pe90();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public /* synthetic */ void m12626a0(View view) {
        mo3351O().act().startActivity(WebViewAct.Z1(mo3351O().act(), App.e.getString(R.string.hk), juk.g()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public /* synthetic */ void m12627b0(View view) {
        mo3351O().act().startActivity(WebViewAct.Z1(mo3351O().act(), App.e.getString(R.string.ek), juk.k()));
    }

    @Override // p002l.pqa0, p002l.hn2
    /* JADX INFO: renamed from: j */
    public void mo3279j(View view) {
        super.mo3279j(view);
        VText vText = this.f9896y.f17214b;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f9896y.f17215c.setTypeface(typeface);
        this.f9896y.f17216d.setTypeface(typeface);
        xdl0.E0(this.f9896y.f17218f, new View.OnClickListener() { // from class: l.coe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f8844a.m12626a0(view2);
            }
        });
        xdl0.E0(this.f9896y.f17219g, new View.OnClickListener() { // from class: l.doe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f9374a.m12627b0(view2);
            }
        });
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: k */
    public boolean mo2919k() {
        return false;
    }

    @Override // p002l.pqa0, p002l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo3280l() {
        return mo3351O().mo1570m0();
    }

    @Override // p002l.pqa0, p002l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo3281s(ViewGroup viewGroup) {
        View viewM20190a = this.f9896y.m20190a(mo3351O().mo9267H2(), viewGroup);
        pe90 pe90Var = this.f9896y;
        this.f17613u = pe90Var.f17213a;
        this.f17615w = pe90Var.f17215c;
        this.f17616x = pe90Var.f17216d;
        return viewM20190a;
    }
}
