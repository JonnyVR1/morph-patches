package p153l;

import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.p070ui.webview.WebViewAct;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ipe extends tya0 {

    /* JADX INFO: renamed from: y */
    public tm90 f116271y;

    public ipe(@NonNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
        this.f116271y = new tm90();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public /* synthetic */ void m141451a0(View view) {
        mo53983O().act().startActivity(WebViewAct.m81347a2(mo53983O().act(), App.f16088e.getString(R$string.f18399Dk), zwk.m221907g()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public /* synthetic */ void m141452b0(View view) {
        mo53983O().act().startActivity(WebViewAct.m81347a2(mo53983O().act(), App.f16088e.getString(R$string.f18306Ak), zwk.m221911k()));
    }

    @Override // p153l.tya0, p153l.on2
    /* JADX INFO: renamed from: j */
    public void mo53911j(View view) {
        super.mo53911j(view);
        VText vText = this.f116271y.f174897b;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f116271y.f174898c.setTypeface(typeface);
        this.f116271y.f174899d.setTypeface(typeface);
        bnl0.m105509E0(this.f116271y.f174901f, new View.OnClickListener() { // from class: l.gpe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f105460a.m141451a0(view2);
            }
        });
        bnl0.m105509E0(this.f116271y.f174902g, new View.OnClickListener() { // from class: l.hpe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f111019a.m141452b0(view2);
            }
        });
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: k */
    public boolean mo53568k() {
        return false;
    }

    @Override // p153l.tya0, p153l.on2
    /* JADX INFO: renamed from: l */
    public boolean mo53912l() {
        return mo53983O().mo52302m0();
    }

    @Override // p153l.tya0, p153l.on2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo53913s(ViewGroup viewGroup) {
        View viewM191723a = this.f116271y.m191723a(mo53983O().mo146493H2(), viewGroup);
        tm90 tm90Var = this.f116271y;
        this.f176651u = tm90Var.f174896a;
        this.f176653w = tm90Var.f174898c;
        this.f176654x = tm90Var.f174899d;
        return viewM191723a;
    }
}
