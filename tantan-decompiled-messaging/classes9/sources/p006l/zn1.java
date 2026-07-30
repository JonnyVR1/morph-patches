package p006l;

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
import com.facebook.drawee.view.SimpleDraweeView;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.ui.VText_Default_Bold;
import com.p1.mobile.putong.data.User;
import com.tantan.library.svga.ResourceKey;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.data.cache.Resource;
import com.tantan.library.svga.data.request.RequestCallback;
import com.tantan.library.svga.exception.SVGAException;
import com.tantanapp.common.data.DbObject;
import l.ao1;
import l.s7m;
import l.t100;
import l.xdl0;
import v.VButton;
import v.VFrame;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class zn1 implements s7m<wn1> {

    /* JADX INFO: renamed from: a */
    public VImage f28834a;

    /* JADX INFO: renamed from: b */
    public VLinear f28835b;

    /* JADX INFO: renamed from: c */
    public View f28836c;

    /* JADX INFO: renamed from: d */
    public VFrame f28837d;

    /* JADX INFO: renamed from: e */
    public VImage f28838e;

    /* JADX INFO: renamed from: f */
    public SimpleDraweeView f28839f;

    /* JADX INFO: renamed from: g */
    public SVGAnimationView f28840g;

    /* JADX INFO: renamed from: h */
    public VText_Default_Bold f28841h;

    /* JADX INFO: renamed from: i */
    public VText f28842i;

    /* JADX INFO: renamed from: j */
    public View f28843j;

    /* JADX INFO: renamed from: k */
    public VFrame f28844k;

    /* JADX INFO: renamed from: l */
    public VText_Default_Bold f28845l;

    /* JADX INFO: renamed from: m */
    public VImage f28846m;

    /* JADX INFO: renamed from: n */
    public VButton f28847n;

    /* JADX INFO: renamed from: o */
    public Act f28848o;

    /* JADX INFO: renamed from: p */
    public wn1 f28849p;

    public zn1(Act act) {
        this.f28848o = act;
    }

    /* JADX INFO: renamed from: e */
    private void m28745e() {
        this.f28841h.setTextColor(Color.parseColor("#000000"));
        this.f28845l.setBackgroundResource(x2c0.f26394Wg);
        this.f28846m.setImageResource(x2c0.f26678fh);
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m28746C0() {
        return this.f28848o;
    }

    /* JADX INFO: renamed from: c */
    public View m28747c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ao1.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void m28751i1(wn1 wn1Var) {
        this.f28849p = wn1Var;
    }

    /* JADX INFO: renamed from: f */
    public void m28749f() {
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(0L);
        this.f28835b.setLayoutTransition(layoutTransition);
        xdl0.X(this.f28846m, xdl0.F0());
        xdl0.E0(this.f28846m, new View.OnClickListener() { // from class: l.xn1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f27616a.m28750i(view);
            }
        });
        xdl0.E0(this.f28845l, new View.OnClickListener() { // from class: l.yn1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f28305a.m28752j(view);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m28750i(View view) {
        act().finish();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM28747c = m28747c(layoutInflater, viewGroup);
        if (upa.m25545z()) {
            m28745e();
        }
        return viewM28747c;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m28752j(View view) {
        this.f28849p.m26532C0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public void m28753k(rxc0 rxc0Var, int i, int i2) {
        User userClone = CoreModule.f1534c.f3628e0.m21483na().clone();
        qib0.f19782G.m12744L0(this.f28839f, userClone.riskAuditUser(CoreModule.f1534c.f3628e0.m21393Pa("fake_risk_audit_default_" + ((DbObject) userClone).id)).fp().profileMiddle().formatted());
        xdl0.C0(this.f28836c, t100.d((float) rxc0Var.m23379y()));
        this.f28834a.setImageResource(rxc0Var.m23378x());
        this.f28838e.setImageResource(rxc0Var.m23370p());
        if (TextUtils.isEmpty(rxc0Var.m23377w())) {
            this.f28840g.setImageResource(rxc0Var.m23376v());
            this.f28840g.stopAnimation(true);
        } else {
            SVGALoader.with(act()).from(rxc0Var.m23377w()).repeatCount(-1).loadCallback(new C1530a(rxc0Var)).autoPlay(true).into(this.f28840g);
        }
        this.f28841h.setText(rxc0Var.m23375u());
        this.f28842i.setText(rxc0Var.m23374t());
        xdl0.M(this.f28843j, rxc0Var.m23380z());
        View viewM23372r = rxc0Var.m23372r(act());
        this.f28845l.setText(rxc0Var.m23369o());
        this.f28844k.removeAllViews();
        if (viewM23372r == 0) {
            return;
        }
        this.f28844k.addView(viewM23372r, new FrameLayout.LayoutParams(-1, -2));
        if (viewM23372r instanceof g2m) {
            ((g2m) viewM23372r).mo9512L(i, i2);
        }
        if (upa.m25545z()) {
            VImage vImageFindViewById = viewM23372r.findViewById(u4c0.f23278w5);
            VImage vImageFindViewById2 = viewM23372r.findViewById(u4c0.f23312y5);
            VImage vImageFindViewById3 = viewM23372r.findViewById(u4c0.f22470A5);
            VImage vImageFindViewById4 = viewM23372r.findViewById(u4c0.f22487B5);
            VImage vImageFindViewById5 = viewM23372r.findViewById(u4c0.f22504C5);
            if (vImageFindViewById != null) {
                vImageFindViewById.setImageResource(i == 1 ? x2c0.f25786D0 : x2c0.f26037L0);
            }
            if (vImageFindViewById2 != null) {
                vImageFindViewById2.setImageResource(i == 1 ? x2c0.f25818E0 : x2c0.f26068M0);
            }
            if (vImageFindViewById3 != null) {
                vImageFindViewById3.setImageResource(i == 1 ? x2c0.f25850F0 : x2c0.f26099N0);
            }
            if (vImageFindViewById4 != null) {
                vImageFindViewById4.setImageResource(i == 1 ? x2c0.f25882G0 : x2c0.f26130O0);
            }
            if (vImageFindViewById5 != null) {
                vImageFindViewById5.setImageResource(i == 1 ? x2c0.f25913H0 : x2c0.f26161P0);
            }
        }
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: l.zn1$a */
    public class C1530a implements RequestCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ rxc0 f28850a;

        public C1530a(rxc0 rxc0Var) {
            this.f28850a = rxc0Var;
        }

        public void onLoadFailed(@NonNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
            zn1.this.f28840g.setImageResource(this.f28850a.m23376v());
        }

        public void onResourceReady(@NonNull ResourceKey resourceKey, @NonNull Resource<?> resource) {
        }
    }
}
