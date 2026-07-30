package p153l;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.R$string;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p051p1.mobile.putong.p070ui.webview.WebViewAct;
import java.util.List;
import p151v.VImage;
import p151v.VLinear;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class bik0 implements iam<xhk0> {

    /* JADX INFO: renamed from: a */
    public VLinear f76888a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f76889b;

    /* JADX INFO: renamed from: c */
    public RecyclerView f76890c;

    /* JADX INFO: renamed from: d */
    public Act f76891d;

    /* JADX INFO: renamed from: e */
    public xhk0 f76892e;

    /* JADX INFO: renamed from: f */
    public rhk0 f76893f;

    public bik0(Act act) {
        this.f76891d = act;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f76890c.getContext();
    }

    /* JADX INFO: renamed from: b */
    public View m104481b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return cik0.m109904b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(xhk0 xhk0Var) {
        this.f76892e = xhk0Var;
    }

    /* JADX INFO: renamed from: d */
    public VImage m104483d() {
        VImage vImage = new VImage(getContext());
        vImage.setScaleType(ImageView.ScaleType.FIT_XY);
        vImage.setImageResource(mbc0.f135648H);
        vImage.setOnClickListener(new View.OnClickListener() { // from class: l.aik0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f71543a.m104484e(view);
            }
        });
        return vImage;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m104484e(View view) {
        Context context = getContext();
        if (context == null) {
            return;
        }
        m104486i(context, context.getString((wft.m206159b(2) || IntlCountryCodeController.m29122s()) ? R$string.f44990W0 : R$string.f44962I0), efv.f93856m);
    }

    /* JADX INFO: renamed from: f */
    public void m104485f(List<thk0> list) {
        if (this.f76893f == null) {
            this.f76893f = new rhk0();
            this.f76890c.setLayoutManager(new LinearLayoutManager(getContext()));
            this.f76890c.setAdapter(this.f76893f);
        }
        this.f76893f.m68554Z(list);
        this.f76889b.setLeftIconAsBack(this.f76891d);
    }

    /* JADX INFO: renamed from: i */
    public final void m104486i(Context context, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) WebViewAct.class);
        intent.putExtra("title", str);
        intent.putExtra("url", str2);
        context.startActivity(intent);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m104481b(layoutInflater, viewGroup);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: r */
    public void m104487r() {
        VImage vImageM104483d = m104483d();
        this.f76889b.m224835z(vImageM104483d);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) vImageM104483d.getLayoutParams();
        layoutParams.height = bnl0.m105587w(32.0f);
        layoutParams.width = bnl0.m105587w(32.0f);
        layoutParams.rightMargin = bnl0.m105587w(8.0f);
        vImageM104483d.setLayoutParams(layoutParams);
        this.f76889b.setTitle((wft.m206159b(2) || IntlCountryCodeController.m29122s()) ? R$string.f44994Y0 : R$string.f44964J0);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
