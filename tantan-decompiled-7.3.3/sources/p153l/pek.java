package p153l;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.data.GroupAttribute;
import com.p051p1.mobile.putong.core.data.GroupCategory;
import com.p051p1.mobile.putong.core.newui.group.GroupCreateCategoryAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class pek implements iam<mek> {

    /* JADX INFO: renamed from: a */
    public VText f152099a;

    /* JADX INFO: renamed from: b */
    public VLinear f152100b;

    /* JADX INFO: renamed from: c */
    public VImage f152101c;

    /* JADX INFO: renamed from: d */
    public final GroupCreateCategoryAct f152102d;

    /* JADX INFO: renamed from: e */
    public mek f152103e;

    /* JADX INFO: renamed from: l.pek$a */
    public static class C19358a {
        /* JADX INFO: renamed from: b */
        public static void m172047b(pek pekVar, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            pekVar.f152099a = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
            pekVar.f152100b = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
            pekVar.f152101c = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        }

        /* JADX INFO: renamed from: c */
        public static View m172048c(pek pekVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(qec0.f157037h0, viewGroup, false);
            m172047b(pekVar, viewInflate);
            return viewInflate;
        }
    }

    public pek(GroupCreateCategoryAct groupCreateCategoryAct) {
        this.f152102d = groupCreateCategoryAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m172040j(View view) {
        this.f152102d.lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: k */
    private void m172041k(@NonNull List<GroupAttribute> list) {
        GroupAttribute groupAttribute = list.get(0);
        this.f152099a.setText(groupAttribute.creationLimit.value);
        this.f152100b.removeAllViews();
        Iterator<GroupCategory> it = groupAttribute.categories.iterator();
        while (it.hasNext()) {
            m172043f(it.next());
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f152102d;
    }

    /* JADX INFO: renamed from: e */
    public View m172042e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C19358a.m172048c(this, layoutInflater, viewGroup);
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
    /* JADX INFO: renamed from: f */
    public final void m172043f(GroupCategory groupCategory) {
        LinearLayout linearLayout = new LinearLayout(this.f152102d);
        linearLayout.setOrientation(0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        try {
            gradientDrawable.setColor(Color.parseColor(groupCategory.backgroundColor));
        } catch (Exception unused) {
            gradientDrawable.setColor(-526345);
        }
        gradientDrawable.setCornerRadius(bnl0.m105587w(10.0f));
        linearLayout.setBackground(gradientDrawable);
        TextView textView = new TextView(this.f152102d);
        textView.setText(groupCategory.name);
        textView.setTextSize(16.0f);
        try {
            textView.setTextColor(Color.parseColor(groupCategory.textColor));
        } catch (Exception unused2) {
            textView.setTextColor(-14540254);
        }
        textView.setGravity(16);
        textView.setPadding(bnl0.m105587w(16.0f), 0, 0, 0);
        linearLayout.setTag(groupCategory);
        linearLayout.addView(textView, new LinearLayout.LayoutParams(0, -1, 1.0f));
        ImageView imageView = new ImageView(this.f152102d);
        imageView.setPadding(bnl0.m105587w(10.0f), 0, bnl0.m105587w(10.0f), 0);
        imageView.setImageResource(ibc0.f114130s0);
        linearLayout.addView(imageView, new LinearLayout.LayoutParams(bnl0.m105587w(32.0f), bnl0.m105587w(12.0f)));
        linearLayout.setGravity(16);
        final mek mekVar = this.f152103e;
        Objects.requireNonNull(mekVar);
        bnl0.m105509E0(linearLayout, new View.OnClickListener() { // from class: l.oek
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mekVar.m158032f0(view);
            }
        });
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, bnl0.m105587w(48.0f));
        layoutParams.bottomMargin = bnl0.m105587w(12.0f);
        this.f152100b.addView(linearLayout, layoutParams);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(mek mekVar) {
        this.f152103e = mekVar;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m172042e(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m172045r() {
        if (NullChecker.m82486a(this.f152102d.getSupportActionBar())) {
            this.f152102d.getSupportActionBar().mo102186m();
        }
        bnl0.m105509E0(this.f152101c, new View.OnClickListener() { // from class: l.nek
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f141662a.m172040j(view);
            }
        });
        m172041k(this.f152103e.m158033g0());
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
