package p153l;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.base.apibean.FanbaseGroupsBean;
import org.jetbrains.annotations.NotNull;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class ufg extends RecyclerView.AbstractC0569e0 {

    /* JADX INFO: renamed from: a */
    public boolean f178758a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f178759b;

    /* JADX INFO: renamed from: c */
    public VText f178760c;

    /* JADX INFO: renamed from: d */
    public VText f178761d;

    /* JADX INFO: renamed from: e */
    public VText f178762e;

    /* JADX INFO: renamed from: f */
    public VLinear f178763f;

    public ufg(@NonNull @NotNull View view, boolean z) {
        super(view);
        this.f178758a = z;
        m195840a(view);
    }

    /* JADX INFO: renamed from: a */
    public final void m195840a(View view) {
        this.f178759b = (VDraweeView) view.findViewById(jdc0.f120221p);
        this.f178760c = (VText) view.findViewById(jdc0.f120227r0);
        this.f178761d = (VText) view.findViewById(jdc0.f120166V);
        this.f178763f = (VLinear) view.findViewById(jdc0.f120159R0);
        this.f178762e = (VText) view.findViewById(jdc0.f120136G);
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
    /* JADX INFO: renamed from: b */
    public void m195841b(FanbaseGroupsBean.FansbaseGroupsItem fansbaseGroupsItem) {
        izs.m142864o("context_livingAct", this.f178759b, fansbaseGroupsItem.getAvatar());
        this.f178760c.setText(fansbaseGroupsItem.getName());
        this.f178760c.setTypeface(null, 1);
        this.f178762e.setText(fansbaseGroupsItem.getDesc());
        this.f178761d.setText(fansbaseGroupsItem.getCategory().getName());
        ((GradientDrawable) this.f178761d.getBackground()).setColor(Color.parseColor(fansbaseGroupsItem.getCategory().getColor()));
        this.f178763f.removeAllViewsInLayout();
        this.f178763f.setVisibility(0);
        if (fansbaseGroupsItem.getTags() == null) {
            return;
        }
        for (FanbaseGroupsBean.TagItemBean tagItemBean : fansbaseGroupsItem.getTags()) {
            boolean z = this.f178758a;
            View view = this.itemView;
            VText vText = (VText) (z ? View.inflate(view.getContext(), vec0.f183723E, null) : View.inflate(view.getContext(), vec0.f183722D, null));
            vText.setText(tagItemBean.getName());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.rightMargin = qa00.f156318e;
            vText.setLayoutParams(layoutParams);
            this.f178763f.addView(vText);
        }
    }
}
