package p153l;

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.VText_Default_Bold;
import com.p051p1.mobile.putong.data.User;
import com.tantan.library.svga.ResourceKey;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.data.cache.Resource;
import com.tantan.library.svga.data.request.RequestCallback;
import com.tantan.library.svga.exception.SVGAException;
import p151v.VButton;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class go1 implements iam<do1> {

    /* JADX INFO: renamed from: a */
    public VImage f105181a;

    /* JADX INFO: renamed from: b */
    public VLinear f105182b;

    /* JADX INFO: renamed from: c */
    public View f105183c;

    /* JADX INFO: renamed from: d */
    public VFrame f105184d;

    /* JADX INFO: renamed from: e */
    public VImage f105185e;

    /* JADX INFO: renamed from: f */
    public SimpleDraweeView f105186f;

    /* JADX INFO: renamed from: g */
    public SVGAnimationView f105187g;

    /* JADX INFO: renamed from: h */
    public VText_Default_Bold f105188h;

    /* JADX INFO: renamed from: i */
    public VText f105189i;

    /* JADX INFO: renamed from: j */
    public View f105190j;

    /* JADX INFO: renamed from: k */
    public VFrame f105191k;

    /* JADX INFO: renamed from: l */
    public VText_Default_Bold f105192l;

    /* JADX INFO: renamed from: m */
    public VImage f105193m;

    /* JADX INFO: renamed from: n */
    public VButton f105194n;

    /* JADX INFO: renamed from: o */
    public Act f105195o;

    /* JADX INFO: renamed from: p */
    public do1 f105196p;

    public go1(Act act) {
        this.f105195o = act;
    }

    /* JADX INFO: renamed from: e */
    private void m131024e() {
        this.f105188h.setTextColor(Color.parseColor(Constants.BLACK));
        this.f105192l.setBackgroundResource(dbc0.f86314Kh);
        this.f105193m.setImageResource(dbc0.f86602Th);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f105195o;
    }

    /* JADX INFO: renamed from: c */
    public View m131025c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ho1.m136381b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(do1 do1Var) {
        this.f105196p = do1Var;
    }

    /* JADX INFO: renamed from: f */
    public void m131027f() {
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(0L);
        this.f105182b.setLayoutTransition(layoutTransition);
        bnl0.m105540X(this.f105193m, bnl0.m105511F0());
        bnl0.m105509E0(this.f105193m, new View.OnClickListener() { // from class: l.eo1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f94861a.m131028i(view);
            }
        });
        bnl0.m105509E0(this.f105192l, new View.OnClickListener() { // from class: l.fo1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f100001a.m131029j(view);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m131028i(View view) {
        getAct().m48999H2();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM131025c = m131025c(layoutInflater, viewGroup);
        if (gra.m131778z()) {
            m131024e();
        }
        return viewM131025c;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m131029j(View view) {
        this.f105196p.m117111C0();
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    /* JADX INFO: renamed from: k */
    public void m131030k(u5d0 u5d0Var, int i, int i2) {
        User userMo225055clone = CoreModule.f18264c.f20381e0.m116593na().mo225055clone();
        uqb0.f180374G.m127115L0(this.f105186f, userMo225055clone.riskAuditUser(CoreModule.f18264c.f20381e0.m116503Pa("fake_risk_audit_default_" + userMo225055clone.f56859id)).m61308fp().profileMiddle().formatted());
        bnl0.m105505C0(this.f105183c, qa00.m175859d((float) u5d0Var.m194569y()));
        this.f105181a.setImageResource(u5d0Var.m194568x());
        this.f105185e.setImageResource(u5d0Var.m194560p());
        if (TextUtils.isEmpty(u5d0Var.m194567w())) {
            this.f105187g.setImageResource(u5d0Var.m194566v());
            this.f105187g.stopAnimation(true);
        } else {
            SVGALoader.with(getAct()).from(u5d0Var.m194567w()).repeatCount(-1).loadCallback(new C17265a(u5d0Var)).autoPlay(true).into(this.f105187g);
        }
        this.f105188h.setText(u5d0Var.m194565u());
        this.f105189i.setText(u5d0Var.m194564t());
        bnl0.m105524M(this.f105190j, u5d0Var.m194570z());
        View viewM194562r = u5d0Var.m194562r(getAct());
        this.f105192l.setText(u5d0Var.m194559o());
        this.f105191k.removeAllViews();
        if (viewM194562r == 0) {
            return;
        }
        this.f105191k.addView(viewM194562r, new FrameLayout.LayoutParams(-1, -2));
        if (viewM194562r instanceof z4m) {
            ((z4m) viewM194562r).mo57270L(i, i2);
        }
        if (gra.m131778z()) {
            VImage vImage = (VImage) viewM194562r.findViewById(adc0.f70655y5);
            VImage vImage2 = (VImage) viewM194562r.findViewById(adc0.f69810A5);
            VImage vImage3 = (VImage) viewM194562r.findViewById(adc0.f69844C5);
            VImage vImage4 = (VImage) viewM194562r.findViewById(adc0.f69861D5);
            VImage vImage5 = (VImage) viewM194562r.findViewById(adc0.f69878E5);
            if (vImage != null) {
                vImage.setImageResource(i == 1 ? dbc0.f86105E0 : dbc0.f86361M0);
            }
            if (vImage2 != null) {
                vImage2.setImageResource(i == 1 ? dbc0.f86137F0 : dbc0.f86393N0);
            }
            if (vImage3 != null) {
                vImage3.setImageResource(i == 1 ? dbc0.f86169G0 : dbc0.f86425O0);
            }
            if (vImage4 != null) {
                vImage4.setImageResource(i == 1 ? dbc0.f86201H0 : dbc0.f86457P0);
            }
            if (vImage5 != null) {
                vImage5.setImageResource(i == 1 ? dbc0.f86233I0 : dbc0.f86489Q0);
            }
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.go1$a */
    public class C17265a implements RequestCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ u5d0 f105197a;

        public C17265a(u5d0 u5d0Var) {
            this.f105197a = u5d0Var;
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onLoadFailed(@NonNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
            go1.this.f105187g.setImageResource(this.f105197a.m194566v());
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onResourceReady(@NonNull ResourceKey resourceKey, @NonNull Resource<?> resource) {
        }
    }
}
