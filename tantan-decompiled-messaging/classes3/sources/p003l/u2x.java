package p003l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.marry.status.MarryStatusSetAct;
import l.qib0;
import l.s7m;
import l.v2x;
import l.x2c0;
import l.xdl0;
import p028v.VButton;
import p028v.VDraweeView;
import p028v.VImage;
import p028v.VLinear;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class u2x implements s7m<q2x>, View.OnClickListener {

    /* JADX INFO: renamed from: A */
    public MarryStatusSetAct f7879A;

    /* JADX INFO: renamed from: B */
    public VImage[] f7880B;

    /* JADX INFO: renamed from: C */
    public View[] f7881C;

    /* JADX INFO: renamed from: D */
    public boolean f7882D = false;

    /* JADX INFO: renamed from: E */
    public int f7883E = -1;

    /* JADX INFO: renamed from: F */
    public final int f7884F = 7;

    /* JADX INFO: renamed from: a */
    public VDraweeView f7885a;

    /* JADX INFO: renamed from: b */
    public VText f7886b;

    /* JADX INFO: renamed from: c */
    public VLinear f7887c;

    /* JADX INFO: renamed from: d */
    public VText f7888d;

    /* JADX INFO: renamed from: e */
    public VImage f7889e;

    /* JADX INFO: renamed from: f */
    public VLinear f7890f;

    /* JADX INFO: renamed from: g */
    public VText f7891g;

    /* JADX INFO: renamed from: h */
    public VImage f7892h;

    /* JADX INFO: renamed from: i */
    public VLinear f7893i;

    /* JADX INFO: renamed from: j */
    public VText f7894j;

    /* JADX INFO: renamed from: k */
    public VImage f7895k;

    /* JADX INFO: renamed from: l */
    public VLinear f7896l;

    /* JADX INFO: renamed from: m */
    public VText f7897m;

    /* JADX INFO: renamed from: n */
    public VImage f7898n;

    /* JADX INFO: renamed from: o */
    public VLinear f7899o;

    /* JADX INFO: renamed from: p */
    public VText f7900p;

    /* JADX INFO: renamed from: q */
    public VImage f7901q;

    /* JADX INFO: renamed from: r */
    public VLinear f7902r;

    /* JADX INFO: renamed from: s */
    public VImage f7903s;

    /* JADX INFO: renamed from: t */
    public VLinear f7904t;

    /* JADX INFO: renamed from: u */
    public VImage f7905u;

    /* JADX INFO: renamed from: v */
    public VLinear f7906v;

    /* JADX INFO: renamed from: w */
    public VImage f7907w;

    /* JADX INFO: renamed from: x */
    public VButton f7908x;

    /* JADX INFO: renamed from: y */
    public VImage f7909y;

    /* JADX INFO: renamed from: z */
    public q2x f7910z;

    public u2x(MarryStatusSetAct marryStatusSetAct) {
        this.f7879A = marryStatusSetAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m8088j(View view) {
        this.f7882D = !this.f7882D;
        m8097m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m8089k(View view) {
        this.f7879A.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m8090l(View view) {
        int i = this.f7883E;
        if (i >= 0) {
            this.f7910z.m6997i0(i);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m8091C0() {
        return this.f7879A;
    }

    /* JADX INFO: renamed from: d */
    public View m8092d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return v2x.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void m8096i1(q2x q2xVar) {
        this.f7910z = q2xVar;
    }

    /* JADX INFO: renamed from: f */
    public final void m8094f() {
        int i = 0;
        while (true) {
            VImage[] vImageArr = this.f7880B;
            if (i >= vImageArr.length) {
                m8095i();
                return;
            } else {
                vImageArr[i].setImageResource(i == this.f7883E ? x2c0.Ud : x2c0.Td);
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m8095i() {
        this.f7908x.setEnabled(this.f7883E >= 0);
        this.f7908x.setBackgroundResource(this.f7883E >= 0 ? x2c0.S : x2c0.r);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m8092d(layoutInflater, viewGroup);
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
    /* JADX INFO: renamed from: m */
    public final void m8097m() {
        this.f7901q.setRotation(this.f7882D ? 180.0f : 0.0f);
        int i = 4;
        while (true) {
            View[] viewArr = this.f7881C;
            if (i >= viewArr.length) {
                return;
            }
            xdl0.M(viewArr[i], this.f7882D);
            i++;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f7883E = ((Integer) view.getTag()).intValue();
        m8094f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    public void m8098r() {
        qib0.G.L0(this.f7885a, "https://auto.tancdn.com/v1/raw/904432ed-ba77-4288-8865-1411b792009c10.webp");
        this.f7886b.getPaint().setFakeBoldText(true);
        this.f7880B = new VImage[]{this.f7889e, this.f7892h, this.f7895k, this.f7898n, this.f7903s, this.f7905u, this.f7907w};
        this.f7881C = new View[]{this.f7887c, this.f7890f, this.f7893i, this.f7896l, this.f7902r, this.f7904t, this.f7906v};
        for (int i = 0; i < 7; i++) {
            this.f7881C[i].setOnClickListener(this);
            this.f7881C[i].setTag(Integer.valueOf(i));
        }
        xdl0.E0(this.f7899o, new View.OnClickListener() { // from class: l.r2x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6774a.m8088j(view);
            }
        });
        xdl0.E0(this.f7909y, new View.OnClickListener() { // from class: l.s2x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7139a.m8089k(view);
            }
        });
        xdl0.E0(this.f7908x, new View.OnClickListener() { // from class: l.t2x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7405a.m8090l(view);
            }
        });
        m8095i();
        m8094f();
        xdl0.Z(new View[]{this.f7909y});
        this.f7888d.setTypeface(eqh0.m3924c(3), 1);
        this.f7891g.setTypeface(eqh0.m3924c(3), 1);
        this.f7894j.setTypeface(eqh0.m3924c(3), 1);
        this.f7897m.setTypeface(eqh0.m3924c(3), 1);
        this.f7900p.setTypeface(eqh0.m3924c(3), 1);
    }

    public void destroy() {
    }
}
