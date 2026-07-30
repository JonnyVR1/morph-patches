package p149l;

import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.p065ui.webview.WebViewAct;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class eoe extends pqa0 {

    /* JADX INFO: renamed from: y */
    public pe90 f92439y;

    public eoe(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
        this.f92439y = new pe90();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public /* synthetic */ void m117335a0(View view) {
        mo52800O().act().startActivity(WebViewAct.m80164Z1(mo52800O().act(), App.f15369e.getString(R$string.f18583hk), juk.m143325g()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public /* synthetic */ void m117336b0(View view) {
        mo52800O().act().startActivity(WebViewAct.m80164Z1(mo52800O().act(), App.f15369e.getString(R$string.f18490ek), juk.m143329k()));
    }

    @Override // p149l.pqa0, p149l.hn2
    /* JADX INFO: renamed from: j */
    public void mo52728j(View view) {
        super.mo52728j(view);
        VText vText = this.f92439y.f148408b;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f92439y.f148409c.setTypeface(typeface);
        this.f92439y.f148410d.setTypeface(typeface);
        xdl0.m208329E0(this.f92439y.f148412f, new View.OnClickListener() { // from class: l.coe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f81834a.m117335a0(view2);
            }
        });
        xdl0.m208329E0(this.f92439y.f148413g, new View.OnClickListener() { // from class: l.doe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f87164a.m117336b0(view2);
            }
        });
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: k */
    public boolean mo52385k() {
        return false;
    }

    @Override // p149l.pqa0, p149l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo52729l() {
        return mo52800O().mo51119m0();
    }

    @Override // p149l.pqa0, p149l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo52730s(ViewGroup viewGroup) {
        View viewM168504a = this.f92439y.m168504a(mo52800O().mo94568H2(), viewGroup);
        pe90 pe90Var = this.f92439y;
        this.f150776u = pe90Var.f148407a;
        this.f150778w = pe90Var.f148409c;
        this.f150779x = pe90Var.f148410d;
        return viewM168504a;
    }
}
