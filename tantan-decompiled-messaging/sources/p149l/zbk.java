package p149l;

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
import com.p046p1.mobile.putong.core.data.GroupAttribute;
import com.p046p1.mobile.putong.core.data.GroupCategory;
import com.p046p1.mobile.putong.core.newui.group.GroupCreateCategoryAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class zbk implements s7m<wbk> {

    /* JADX INFO: renamed from: a */
    public VText f202446a;

    /* JADX INFO: renamed from: b */
    public VLinear f202447b;

    /* JADX INFO: renamed from: c */
    public VImage f202448c;

    /* JADX INFO: renamed from: d */
    public final GroupCreateCategoryAct f202449d;

    /* JADX INFO: renamed from: e */
    public wbk f202450e;

    /* JADX INFO: renamed from: l.zbk$a */
    public static class C21655a {
        /* JADX INFO: renamed from: b */
        public static void m217908b(zbk zbkVar, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            zbkVar.f202446a = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
            zbkVar.f202447b = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
            zbkVar.f202448c = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        }

        /* JADX INFO: renamed from: c */
        public static View m217909c(zbk zbkVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(l6c0.f126481h0, viewGroup, false);
            m217908b(zbkVar, viewInflate);
            return viewInflate;
        }
    }

    public zbk(GroupCreateCategoryAct groupCreateCategoryAct) {
        this.f202449d = groupCreateCategoryAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m217901j(View view) {
        this.f202449d.lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: k */
    private void m217902k(@NonNull List<GroupAttribute> list) {
        GroupAttribute groupAttribute = list.get(0);
        this.f202446a.setText(groupAttribute.creationLimit.value);
        this.f202447b.removeAllViews();
        Iterator<GroupCategory> it = groupAttribute.categories.iterator();
        while (it.hasNext()) {
            m217904f(it.next());
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f202449d;
    }

    /* JADX INFO: renamed from: e */
    public View m217903e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C21655a.m217909c(this, layoutInflater, viewGroup);
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
    public final void m217904f(GroupCategory groupCategory) {
        LinearLayout linearLayout = new LinearLayout(this.f202449d);
        linearLayout.setOrientation(0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        try {
            gradientDrawable.setColor(Color.parseColor(groupCategory.backgroundColor));
        } catch (Exception unused) {
            gradientDrawable.setColor(-526345);
        }
        gradientDrawable.setCornerRadius(xdl0.m208407w(10.0f));
        linearLayout.setBackground(gradientDrawable);
        TextView textView = new TextView(this.f202449d);
        textView.setText(groupCategory.name);
        textView.setTextSize(16.0f);
        try {
            textView.setTextColor(Color.parseColor(groupCategory.textColor));
        } catch (Exception unused2) {
            textView.setTextColor(-14540254);
        }
        textView.setGravity(16);
        textView.setPadding(xdl0.m208407w(16.0f), 0, 0, 0);
        linearLayout.setTag(groupCategory);
        linearLayout.addView(textView, new LinearLayout.LayoutParams(0, -1, 1.0f));
        ImageView imageView = new ImageView(this.f202449d);
        imageView.setPadding(xdl0.m208407w(10.0f), 0, xdl0.m208407w(10.0f), 0);
        imageView.setImageResource(c3c0.f78855s0);
        linearLayout.addView(imageView, new LinearLayout.LayoutParams(xdl0.m208407w(32.0f), xdl0.m208407w(12.0f)));
        linearLayout.setGravity(16);
        final wbk wbkVar = this.f202450e;
        Objects.requireNonNull(wbkVar);
        xdl0.m208329E0(linearLayout, new View.OnClickListener() { // from class: l.ybk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wbkVar.m202574f0(view);
            }
        });
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, xdl0.m208407w(48.0f));
        layoutParams.bottomMargin = xdl0.m208407w(12.0f);
        this.f202447b.addView(linearLayout, layoutParams);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(wbk wbkVar) {
        this.f202450e = wbkVar;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m217903e(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m217906r() {
        if (NullChecker.m81303a(this.f202449d.getSupportActionBar())) {
            this.f202449d.getSupportActionBar().mo134126m();
        }
        xdl0.m208329E0(this.f202448c, new View.OnClickListener() { // from class: l.xbk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f191954a.m217901j(view);
            }
        });
        m217902k(this.f202450e.m202575g0());
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
