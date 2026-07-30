package p028v.bottombar;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.LayoutRes;
import androidx.appcompat.widget.AppCompatTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import l.b6c0;
import l.biq;
import l.k0g0;
import l.l6j;
import l.p4c0;
import l.t0c0;
import l.t100;
import l.u2c0;
import l.xdl0;
import p028v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VBottomBarOldItem extends VBottomBarDefaultItem {

    /* JADX INFO: renamed from: h */
    public VDraweeView f13166h;

    /* JADX INFO: renamed from: i */
    public VBottomBarRippleView f13167i;

    /* JADX INFO: renamed from: j */
    public RelativeLayout f13168j;

    /* JADX INFO: renamed from: k */
    public RelativeLayout f13169k;

    /* JADX INFO: renamed from: l */
    public FrameLayout f13170l;

    /* JADX INFO: renamed from: m */
    public boolean f13171m;

    public VBottomBarOldItem(Context context) {
        super(context);
        mo11867c();
    }

    @Override // p028v.bottombar.VBottomBarDefaultItem
    /* JADX INFO: renamed from: b */
    public void mo11866b() {
        int i;
        int i2;
        super.mo11866b();
        C1387a c1387a = this.f13153a;
        if (c1387a == null) {
            return;
        }
        C1387a.a aVar = c1387a.f13198i;
        if (aVar == null || (i = aVar.f13201c) == 0 || (i2 = aVar.f13202d) == 0) {
            this.f13167i.m11880g(c1387a.f13192c, c1387a.f13194e);
        } else {
            this.f13167i.m11880g(i, i2);
        }
        if (k0g0.b(c1387a.f13197h)) {
            return;
        }
        xdl0.M0(this.f13166h, true);
        this.f13166h.getHierarchy().E(new ColorDrawable(getContext().getResources().getColor(t0c0.s)));
        this.f13166h.setImageURI(c1387a.f13197h);
        this.f13167i.setRippleListener(new VBottomBarRippleView.InterfaceC1385b() { // from class: l.dfk0
            @Override // p028v.bottombar.VBottomBarRippleView.InterfaceC1385b
            /* JADX INFO: renamed from: a */
            public final void mo3555a(float f, float f2) {
                this.f2958a.m11875h(f, f2);
            }
        });
    }

    @Override // p028v.bottombar.VBottomBarDefaultItem
    /* JADX INFO: renamed from: c */
    public void mo11867c() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(b6c0.d, (ViewGroup) this, true);
        if (viewInflate.getLayoutParams() == null) {
            viewInflate.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        }
        setClipChildren(false);
        setClipToPadding(false);
        this.f13166h = (VDraweeView) viewInflate.findViewById(p4c0.l0);
        this.f13167i = (VBottomBarRippleView) viewInflate.findViewById(p4c0.H0);
        this.f13170l = (FrameLayout) findViewById(p4c0.K);
        this.f13169k = (RelativeLayout) findViewById(p4c0.m0);
        this.f13168j = (RelativeLayout) findViewById(p4c0.I0);
        super.mo11867c();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p028v.bottombar.VBottomBarDefaultItem
    /* JADX INFO: renamed from: d */
    public void mo11868d(boolean z, boolean z2) {
        if (z) {
            VBottomBarRippleView vBottomBarRippleView = this.f13167i;
            if (z2) {
                vBottomBarRippleView.m11882i();
            } else {
                vBottomBarRippleView.m11878d();
            }
            this.f13154b.setTextColor(getResources().getColor(t0c0.t));
            this.f13154b.setTypeface((Typeface) null, 1);
        } else {
            this.f13167i.m11879f();
            boolean z3 = this.f13159g;
            AppCompatTextView appCompatTextView = this.f13154b;
            if (z3) {
                appCompatTextView.setTextColor(getResources().getColor(t0c0.v));
            } else {
                appCompatTextView.setTextColor(getResources().getColor(t0c0.o));
            }
            this.f13154b.setTypeface((Typeface) null, 0);
        }
        SimpleDraweeView simpleDraweeView = this.f13166h;
        if (simpleDraweeView == null || !this.f13171m) {
            return;
        }
        simpleDraweeView.setAlpha(isSelected() ? 1.0f : 0.5f);
    }

    /* JADX INFO: renamed from: f */
    public void m11873f(@LayoutRes int i) {
        if (this.f13169k.getChildCount() > 0) {
            this.f13169k.removeAllViews();
        }
        View.inflate(getContext(), i, this.f13169k);
        this.f13169k.setVisibility(0);
    }

    /* JADX INFO: renamed from: g */
    public void m11874g(SimpleDraweeView simpleDraweeView, String str, int i, int i2) {
        simpleDraweeView.setController(l6j.g().E(simpleDraweeView.getController()).C(ImageRequestBuilder.y(Uri.parse(str)).K(new biq(i, i2)).a()).c());
    }

    @Override // p028v.bottombar.VBottomBarDefaultItem
    public View getIconView() {
        return this.f13167i;
    }

    public VDraweeView getPicture() {
        return this.f13166h;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m11875h(float f, float f2) {
        this.f13166h.setScaleX(f2);
        this.f13166h.setScaleY(f2);
    }

    /* JADX INFO: renamed from: i */
    public void m11876i(String str, boolean z) {
        if (k0g0.b(str)) {
            return;
        }
        xdl0.M0(this.f13166h, true);
        VDraweeView vDraweeView = this.f13166h;
        if (z) {
            m11874g(vDraweeView, str, 2, 30);
        } else {
            vDraweeView.setImageURI(str);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m11877j() {
        xdl0.U(this.f13168j, t100.d(13.0f));
        setBackgroundResource(u2c0.f);
        xdl0.V(this.f13170l, t100.d(17.0f));
        this.f13171m = true;
    }

    @Override // p028v.bottombar.VBottomBarDefaultItem
    public void setDarkMode(boolean z) {
        super.setDarkMode(z);
        this.f13167i.setDarkMode(z);
        mo11868d(isSelected(), false);
    }

    public VBottomBarOldItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo11867c();
    }

    public VBottomBarOldItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo11867c();
    }
}
