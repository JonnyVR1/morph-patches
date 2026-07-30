package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.svip.guide.SvipIntlHeaderView;
import p151v.VImage;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class bud0 implements iam<ytd0> {

    /* JADX INFO: renamed from: a */
    public VImage f78482a;

    /* JADX INFO: renamed from: b */
    public VText f78483b;

    /* JADX INFO: renamed from: c */
    public VRecyclerView f78484c;

    /* JADX INFO: renamed from: d */
    public TextView f78485d;

    /* JADX INFO: renamed from: e */
    public VText f78486e;

    /* JADX INFO: renamed from: f */
    public final PutongAct f78487f;

    /* JADX INFO: renamed from: g */
    public ytd0 f78488g;

    /* JADX INFO: renamed from: h */
    public zzk f78489h;

    public bud0(PutongAct putongAct) {
        this.f78487f = putongAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m106513e(View view) {
        i4g0.m138520r("e_intl_svip_introduction_skip", this.f78487f.pageId());
        wtd0.m207833e().m207846q();
        act().startActivity(uqb0.f180396b0.f170325b.toNewMainAct(act(), null));
        act().m68056e2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m106514f(View view) {
        i4g0.m138520r("e_intl_svip_introduction_learn_more", this.f78487f.pageId());
        wtd0.m207833e().m207846q();
        CoreModule.m30933P().m143405a().mo34322Fe(act());
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f78487f;
    }

    /* JADX INFO: renamed from: c */
    public View m106515c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return cud0.m112667b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(ytd0 ytd0Var) {
        this.f78488g = ytd0Var;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m106515c(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m106517r() {
        this.f78487f.setTransparentStatusBar();
        this.f78487f.setSwipeBackEnable(false);
        this.f78484c.setLayoutManager(new LinearLayoutManager(this.f78487f));
        keh0 keh0Var = new keh0(this.f78487f);
        this.f78489h = new zzk(keh0Var);
        this.f78489h.m222265H((SvipIntlHeaderView) act().inflater().inflate(pec0.f151919K1, (ViewGroup) this.f78484c, false));
        LinearLayout linearLayout = new LinearLayout(this.f78487f);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, jvd.m147011a(this.f78487f, 40.0f)));
        this.f78489h.m222263F(linearLayout);
        this.f78484c.setAdapter(this.f78489h);
        bnl0.m105509E0(this.f78485d, new View.OnClickListener() { // from class: l.ztd0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f206002a.m106513e(view);
            }
        });
        bnl0.m105509E0(this.f78486e, new View.OnClickListener() { // from class: l.aud0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f73488a.m106514f(view);
            }
        });
        keh0Var.m149328G(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.getPrivilegeDataForGP(null));
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
