package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.VText_Default_Bold;
import com.p046p1.mobile.putong.data.User;
import com.tantan.library.svga.ResourceKey;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.data.cache.Resource;
import com.tantan.library.svga.data.request.RequestCallback;
import com.tantan.library.svga.exception.SVGAException;
import p147v.VButton;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class zn1 implements s7m<wn1> {

    /* JADX INFO: renamed from: a */
    public VImage f203914a;

    /* JADX INFO: renamed from: b */
    public VLinear f203915b;

    /* JADX INFO: renamed from: c */
    public View f203916c;

    /* JADX INFO: renamed from: d */
    public VFrame f203917d;

    /* JADX INFO: renamed from: e */
    public VImage f203918e;

    /* JADX INFO: renamed from: f */
    public SimpleDraweeView f203919f;

    /* JADX INFO: renamed from: g */
    public SVGAnimationView f203920g;

    /* JADX INFO: renamed from: h */
    public VText_Default_Bold f203921h;

    /* JADX INFO: renamed from: i */
    public VText f203922i;

    /* JADX INFO: renamed from: j */
    public View f203923j;

    /* JADX INFO: renamed from: k */
    public VFrame f203924k;

    /* JADX INFO: renamed from: l */
    public VText_Default_Bold f203925l;

    /* JADX INFO: renamed from: m */
    public VImage f203926m;

    /* JADX INFO: renamed from: n */
    public VButton f203927n;

    /* JADX INFO: renamed from: o */
    public Act f203928o;

    /* JADX INFO: renamed from: p */
    public wn1 f203929p;

    public zn1(Act act) {
        this.f203928o = act;
    }

    /* JADX INFO: renamed from: e */
    private void m219394e() {
        this.f203921h.setTextColor(Color.parseColor(Constants.BLACK));
        this.f203925l.setBackgroundResource(x2c0.f189858Wg);
        this.f203926m.setImageResource(x2c0.f190142fh);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f203928o;
    }

    /* JADX INFO: renamed from: c */
    public View m219395c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ao1.m97840b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(wn1 wn1Var) {
        this.f203929p = wn1Var;
    }

    /* JADX INFO: renamed from: f */
    public void m219397f() {
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(0L);
        this.f203915b.setLayoutTransition(layoutTransition);
        xdl0.m208360X(this.f203926m, xdl0.m208331F0());
        xdl0.m208329E0(this.f203926m, new View.OnClickListener() { // from class: l.xn1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f193637a.m219398i(view);
            }
        });
        xdl0.m208329E0(this.f203925l, new View.OnClickListener() { // from class: l.yn1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f199137a.m219399j(view);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m219398i(View view) {
        getAct().m47815F2();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM219395c = m219395c(layoutInflater, viewGroup);
        if (upa.m194847z()) {
            m219394e();
        }
        return viewM219395c;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m219399j(View view) {
        this.f203929p.m204577C0();
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
    public void m219400k(rxc0 rxc0Var, int i, int i2) {
        User userMo223809clone = CoreModule.f17545c.f19639e0.m169520na().mo223809clone();
        qib0.f154691G.m102331L0(this.f203919f, userMo223809clone.riskAuditUser(CoreModule.f17545c.f19639e0.m169430Pa("fake_risk_audit_default_" + userMo223809clone.f56011id)).m60124fp().profileMiddle().formatted());
        xdl0.m208325C0(this.f203916c, t100.m186890d((float) rxc0Var.m181530y()));
        this.f203914a.setImageResource(rxc0Var.m181529x());
        this.f203918e.setImageResource(rxc0Var.m181521p());
        if (TextUtils.isEmpty(rxc0Var.m181528w())) {
            this.f203920g.setImageResource(rxc0Var.m181527v());
            this.f203920g.stopAnimation(true);
        } else {
            SVGALoader.with(getAct()).from(rxc0Var.m181528w()).repeatCount(-1).loadCallback(new C21737a(rxc0Var)).autoPlay(true).into(this.f203920g);
        }
        this.f203921h.setText(rxc0Var.m181526u());
        this.f203922i.setText(rxc0Var.m181525t());
        xdl0.m208344M(this.f203923j, rxc0Var.m181531z());
        View viewM181523r = rxc0Var.m181523r(getAct());
        this.f203925l.setText(rxc0Var.m181520o());
        this.f203924k.removeAllViews();
        if (viewM181523r == 0) {
            return;
        }
        this.f203924k.addView(viewM181523r, new FrameLayout.LayoutParams(-1, -2));
        if (viewM181523r instanceof g2m) {
            ((g2m) viewM181523r).mo56087L(i, i2);
        }
        if (upa.m194847z()) {
            VImage vImage = (VImage) viewM181523r.findViewById(u4c0.f174530w5);
            VImage vImage2 = (VImage) viewM181523r.findViewById(u4c0.f174564y5);
            VImage vImage3 = (VImage) viewM181523r.findViewById(u4c0.f173722A5);
            VImage vImage4 = (VImage) viewM181523r.findViewById(u4c0.f173739B5);
            VImage vImage5 = (VImage) viewM181523r.findViewById(u4c0.f173756C5);
            if (vImage != null) {
                vImage.setImageResource(i == 1 ? x2c0.f189250D0 : x2c0.f189501L0);
            }
            if (vImage2 != null) {
                vImage2.setImageResource(i == 1 ? x2c0.f189282E0 : x2c0.f189532M0);
            }
            if (vImage3 != null) {
                vImage3.setImageResource(i == 1 ? x2c0.f189314F0 : x2c0.f189563N0);
            }
            if (vImage4 != null) {
                vImage4.setImageResource(i == 1 ? x2c0.f189346G0 : x2c0.f189594O0);
            }
            if (vImage5 != null) {
                vImage5.setImageResource(i == 1 ? x2c0.f189377H0 : x2c0.f189625P0);
            }
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.zn1$a */
    public class C21737a implements RequestCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ rxc0 f203930a;

        public C21737a(rxc0 rxc0Var) {
            this.f203930a = rxc0Var;
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onLoadFailed(@NonNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
            zn1.this.f203920g.setImageResource(this.f203930a.m181527v());
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onResourceReady(@NonNull ResourceKey resourceKey, @NonNull Resource<?> resource) {
        }
    }
}
