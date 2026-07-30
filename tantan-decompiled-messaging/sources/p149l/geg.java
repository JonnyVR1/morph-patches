package p149l;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.base.apibean.FanbaseGroupsBean;
import org.jetbrains.annotations.NotNull;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class geg extends RecyclerView.AbstractC0566d0 {

    /* JADX INFO: renamed from: a */
    public boolean f102243a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f102244b;

    /* JADX INFO: renamed from: c */
    public VText f102245c;

    /* JADX INFO: renamed from: d */
    public VText f102246d;

    /* JADX INFO: renamed from: e */
    public VText f102247e;

    /* JADX INFO: renamed from: f */
    public VLinear f102248f;

    public geg(@NonNull @NotNull View view, boolean z) {
        super(view);
        this.f102243a = z;
        m125781a(view);
    }

    /* JADX INFO: renamed from: a */
    public final void m125781a(View view) {
        this.f102244b = (VDraweeView) view.findViewById(d5c0.f84503p);
        this.f102245c = (VText) view.findViewById(d5c0.f84509r0);
        this.f102246d = (VText) view.findViewById(d5c0.f84448V);
        this.f102248f = (VLinear) view.findViewById(d5c0.f84441R0);
        this.f102247e = (VText) view.findViewById(d5c0.f84418G);
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
    public void m125782b(FanbaseGroupsBean.FansbaseGroupsItem fansbaseGroupsItem) {
        hxs.m133402o("context_livingAct", this.f102244b, fansbaseGroupsItem.getAvatar());
        this.f102245c.setText(fansbaseGroupsItem.getName());
        this.f102245c.setTypeface(null, 1);
        this.f102247e.setText(fansbaseGroupsItem.getDesc());
        this.f102246d.setText(fansbaseGroupsItem.getCategory().getName());
        ((GradientDrawable) this.f102246d.getBackground()).setColor(Color.parseColor(fansbaseGroupsItem.getCategory().getColor()));
        this.f102248f.removeAllViewsInLayout();
        this.f102248f.setVisibility(0);
        if (fansbaseGroupsItem.getTags() == null) {
            return;
        }
        for (FanbaseGroupsBean.TagItemBean tagItemBean : fansbaseGroupsItem.getTags()) {
            boolean z = this.f102243a;
            View view = this.itemView;
            VText vText = (VText) (z ? View.inflate(view.getContext(), q6c0.f152866E, null) : View.inflate(view.getContext(), q6c0.f152865D, null));
            vText.setText(tagItemBean.getName());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.rightMargin = t100.f167256e;
            vText.setLayoutParams(layoutParams);
            this.f102248f.addView(vText);
        }
    }
}
