package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.R$string;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p046p1.mobile.putong.p065ui.webview.WebViewAct;
import java.util.List;
import p147v.VImage;
import p147v.VLinear;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
public class v8k0 implements s7m<r8k0> {

    /* JADX INFO: renamed from: a */
    public VLinear f180549a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f180550b;

    /* JADX INFO: renamed from: c */
    public RecyclerView f180551c;

    /* JADX INFO: renamed from: d */
    public Act f180552d;

    /* JADX INFO: renamed from: e */
    public r8k0 f180553e;

    /* JADX INFO: renamed from: f */
    public l8k0 f180554f;

    public v8k0(Act act) {
        this.f180552d = act;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f180551c.getContext();
    }

    /* JADX INFO: renamed from: b */
    public View m197465b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return w8k0.m202188b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(r8k0 r8k0Var) {
        this.f180553e = r8k0Var;
    }

    /* JADX INFO: renamed from: d */
    public VImage m197467d() {
        VImage vImage = new VImage(getContext());
        vImage.setScaleType(ImageView.ScaleType.FIT_XY);
        vImage.setImageResource(g3c0.f100386H);
        vImage.setOnClickListener(new View.OnClickListener() { // from class: l.u8k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f175142a.m197468e(view);
            }
        });
        return vImage;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m197468e(View view) {
        Context context = getContext();
        if (context == null) {
            return;
        }
        m197470i(context, context.getString((vdt.m198092b(2) || IntlCountryCodeController.m28123s()) ? R$string.f44142W0 : R$string.f44114I0), ddv.f85663m);
    }

    /* JADX INFO: renamed from: f */
    public void m197469f(List<n8k0> list) {
        if (this.f180554f == null) {
            this.f180554f = new l8k0();
            this.f180551c.setLayoutManager(new LinearLayoutManager(getContext()));
            this.f180551c.setAdapter(this.f180554f);
        }
        this.f180554f.m67371Z(list);
        this.f180550b.setLeftIconAsBack(this.f180552d);
    }

    /* JADX INFO: renamed from: i */
    public final void m197470i(Context context, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) WebViewAct.class);
        intent.putExtra("title", str);
        intent.putExtra("url", str2);
        context.startActivity(intent);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m197465b(layoutInflater, viewGroup);
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
    public void m197471r() {
        VImage vImageM197467d = m197467d();
        this.f180550b.m223589z(vImageM197467d);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) vImageM197467d.getLayoutParams();
        layoutParams.height = xdl0.m208407w(32.0f);
        layoutParams.width = xdl0.m208407w(32.0f);
        layoutParams.rightMargin = xdl0.m208407w(8.0f);
        vImageM197467d.setLayoutParams(layoutParams);
        this.f180550b.setTitle((vdt.m198092b(2) || IntlCountryCodeController.m28123s()) ? R$string.f44146Y0 : R$string.f44116J0);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
