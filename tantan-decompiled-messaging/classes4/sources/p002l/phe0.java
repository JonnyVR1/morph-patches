package p002l;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.messages.redpacket.SendRedPacketAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.core.PutongCoreMvpAct;
import com.p1.mobile.putong.core.message.R;
import com.tantanapp.common.utils.CrashHelper;
import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l.c3c0;
import l.j760;
import l.lsi0;
import l.qhe0;
import l.s7m;
import l.vwb;
import l.w3z;
import l.xdl0;
import l.zvf0;
import v.VEditText;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class phe0 implements s7m<jhe0> {

    /* JADX INFO: renamed from: a */
    public LinearLayout f17343a;

    /* JADX INFO: renamed from: b */
    public VText f17344b;

    /* JADX INFO: renamed from: c */
    public VText f17345c;

    /* JADX INFO: renamed from: d */
    public VText f17346d;

    /* JADX INFO: renamed from: e */
    public VText f17347e;

    /* JADX INFO: renamed from: f */
    public VText f17348f;

    /* JADX INFO: renamed from: g */
    public VEditText f17349g;

    /* JADX INFO: renamed from: h */
    public VText f17350h;

    /* JADX INFO: renamed from: i */
    public VText f17351i;

    /* JADX INFO: renamed from: j */
    public VText f17352j;

    /* JADX INFO: renamed from: k */
    public VEditText f17353k;

    /* JADX INFO: renamed from: l */
    public VText f17354l;

    /* JADX INFO: renamed from: m */
    public VText f17355m;

    /* JADX INFO: renamed from: n */
    public VText f17356n;

    /* JADX INFO: renamed from: o */
    public VText f17357o;

    /* JADX INFO: renamed from: p */
    public VText f17358p;

    /* JADX INFO: renamed from: q */
    public VText f17359q;

    /* JADX INFO: renamed from: r */
    public jhe0 f17360r;

    /* JADX INFO: renamed from: s */
    public SendRedPacketAct f17361s;

    /* JADX INFO: renamed from: t */
    public boolean f17362t = true;

    /* JADX INFO: renamed from: u */
    public DecimalFormat f17363u = new DecimalFormat("0.00");

    /* JADX INFO: renamed from: l.phe0$c */
    public static class C0748c implements InputFilter {

        /* JADX INFO: renamed from: a */
        public Pattern f17366a = Pattern.compile("([0-9]|\\.)*");

        /* JADX INFO: renamed from: b */
        public Pattern f17367b = Pattern.compile("\\d+(\\.)?(\\d{1,2})?");

        @Override // android.text.InputFilter
        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            String string = charSequence.toString();
            String string2 = spanned.toString();
            if (TextUtils.isEmpty(string)) {
                return (i3 == 0 && string2.indexOf(".") == 1) ? "0" : "";
            }
            Matcher matcher = this.f17366a.matcher(charSequence);
            if (string2.contains(".")) {
                if (!matcher.matches() || ".".contentEquals(charSequence)) {
                    return "";
                }
                int iIndexOf = string2.indexOf(".");
                if (string2.trim().length() - iIndexOf > 2 && i3 > iIndexOf) {
                    return "";
                }
            } else {
                if (!matcher.matches()) {
                    return "";
                }
                if (".".contentEquals(charSequence) && i3 == 0) {
                    return "0.";
                }
            }
            String str = string2.substring(0, i3) + string + string2.substring(i4);
            if (this.f17367b.matcher(str).matches()) {
                return Double.parseDouble(str) > 999999.0d ? spanned.subSequence(i3, i4) : string;
            }
            return spanned.subSequence(i3, i4);
        }
    }

    public phe0(SendRedPacketAct sendRedPacketAct) {
        this.f17361s = sendRedPacketAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m20296n(View view) {
        this.f17361s.hideInput();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m20297p(View view) {
        m20312x(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m20298q(View view) {
        m20312x(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
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
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m20299s(View view) {
        boolean z = this.f17362t;
        VEditText vEditText = this.f17349g;
        String string = z ? vEditText.getEditableText().toString() : String.valueOf(Double.parseDouble(vEditText.getEditableText().toString()) * ((double) Integer.parseInt(this.f17353k.getEditableText().toString())));
        zvf0.u("e_pay_red_packet", "p_red_packet", new j760[]{vwb.Y("groupchat_id", this.f17360r.m15933q0()), vwb.Y("red_packet_type", this.f17362t ? "luck_red_packet" : "normal_red_packet"), vwb.Y("red_packet_amount", string), vwb.Y("red_packet_quantity", this.f17353k.getEditableText().toString())});
        this.f17361s.hideInput();
        PutongCoreMvpAct putongCoreMvpAct = this.f17361s;
        putongCoreMvpAct.progress(putongCoreMvpAct.getString(R.string.I2), true);
        this.f17360r.m15930D0(this.f17362t, string, this.f17353k.getEditableText().toString());
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m20300C0() {
        return this.f17361s;
    }

    @Nullable
    public Act act() {
        return this.f17361s;
    }

    /* JADX INFO: renamed from: f */
    public View m20301f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return qhe0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: i */
    public void m20302i(Throwable th) {
        act().progressDismiss();
        if (!(th instanceof TantanException.Client.CoreService)) {
            lsi0.h(R.string.m7);
            return;
        }
        int i = ((TantanException.Client.CoreService) th).subCode;
        if (i == 41905) {
            lsi0.h(R.string.n7);
        } else if (i == 41906) {
            w3z.I(this.f17361s);
        } else {
            lsi0.h(R.string.m7);
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m20301f(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m20304j(j760<Integer, String> j760Var) {
        act().progressDismiss();
        if (9000 == ((Integer) j760Var.a).intValue()) {
            lsi0.w(R.string.o7);
            return;
        }
        if ("41905".equals(j760Var.b)) {
            lsi0.h(R.string.n7);
        } else if ("41906".equals(j760Var.b)) {
            w3z.I(this.f17361s);
        } else {
            lsi0.h(R.string.m7);
        }
    }

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void m20303i1(jhe0 jhe0Var) {
        this.f17360r = jhe0Var;
    }

    /* JADX INFO: renamed from: l */
    public void m20306l(boolean z, boolean z2) {
        if (z) {
            VText vText = this.f17347e;
            if (z2) {
                vText.setTextColor(Color.parseColor("#f15645"));
                this.f17349g.setTextColor(Color.parseColor("#f15645"));
                this.f17350h.setTextColor(Color.parseColor("#f15645"));
                return;
            } else {
                vText.setTextColor(Color.parseColor("#212121"));
                this.f17349g.setTextColor(Color.parseColor("#212121"));
                this.f17350h.setTextColor(Color.parseColor("#212121"));
                return;
            }
        }
        VText vText2 = this.f17351i;
        if (z2) {
            vText2.setTextColor(Color.parseColor("#f15645"));
            this.f17353k.setTextColor(Color.parseColor("#f15645"));
            this.f17354l.setTextColor(Color.parseColor("#f15645"));
        } else {
            vText2.setTextColor(Color.parseColor("#212121"));
            this.f17353k.setTextColor(Color.parseColor("#212121"));
            this.f17354l.setTextColor(Color.parseColor("#212121"));
        }
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
    public void m20307m(String str, String str2) {
        try {
            double d = !TextUtils.isEmpty(str) ? Double.parseDouble(str) : 0.0d;
            int i = !TextUtils.isEmpty(str2) ? Integer.parseInt(str2) : -1;
            m20306l(true, false);
            m20306l(false, false);
            xdl0.M(this.f17346d, false);
            this.f17358p.setEnabled(d > 0.0d && i > 0);
            if (this.f17362t) {
                if (d > 0.0d && i > 0 && d / ((double) i) > 200.0d) {
                    xdl0.M0(this.f17346d, true);
                    this.f17358p.setEnabled(false);
                    this.f17346d.setText(this.f17361s.getString(R.string.D0, "200"));
                    m20306l(false, true);
                    m20306l(true, true);
                } else if (d > 0.0d && i > 0 && d / ((double) i) < 0.01d) {
                    xdl0.M0(this.f17346d, true);
                    this.f17358p.setEnabled(false);
                    this.f17346d.setText("单个红包不可低于0.01元");
                    m20306l(false, true);
                    m20306l(true, true);
                }
                if (d > 20000.0d) {
                    xdl0.M0(this.f17346d, true);
                    this.f17358p.setEnabled(false);
                    this.f17346d.setText(R.string.C0);
                    m20306l(true, true);
                    m20306l(false, false);
                }
            } else if (d > 200.0d) {
                xdl0.M0(this.f17346d, true);
                this.f17358p.setEnabled(false);
                this.f17346d.setText(this.f17361s.getString(R.string.D0, "200"));
                m20306l(true, true);
            }
            if (i == 0) {
                xdl0.M0(this.f17346d, true);
                this.f17358p.setEnabled(false);
                this.f17346d.setText(R.string.C);
                m20306l(false, true);
                return;
            }
            if (i > 100) {
                xdl0.M0(this.f17346d, true);
                this.f17358p.setEnabled(false);
                this.f17346d.setText(R.string.p0);
                m20306l(false, true);
            }
        } catch (Exception e) {
            CrashHelper.c(e);
        }
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
    /* JADX INFO: renamed from: r */
    public void m20308r() {
        m20312x(true);
        xdl0.E0(this.f17343a, new View.OnClickListener() { // from class: l.khe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14329a.m20296n(view);
            }
        });
        this.f17359q.setText(this.f17361s.getString(R.string.u0, "48"));
        this.f17350h.setText(this.f17361s.getString(R.string.J0, ""));
        this.f17354l.setText(this.f17361s.getString(R.string.s0, ""));
        xdl0.E0(this.f17344b, new View.OnClickListener() { // from class: l.lhe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14874a.m20297p(view);
            }
        });
        xdl0.E0(this.f17345c, new View.OnClickListener() { // from class: l.mhe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15385a.m20298q(view);
            }
        });
        this.f17358p.setEnabled(false);
        this.f17349g.setFilters(new InputFilter[]{new C0748c()});
        this.f17349g.addTextChangedListener(new C0746a());
        this.f17353k.addTextChangedListener(new C0747b());
        xdl0.E0(this.f17358p, new View.OnClickListener() { // from class: l.nhe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16034a.m20299s(view);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m20309u() {
        this.f17360r.m15932p0();
    }

    /* JADX INFO: renamed from: v */
    public void m20310v(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            this.f17357o.setText("0.00");
            return;
        }
        if (!this.f17362t) {
            str = TextUtils.isEmpty(str2) ? "0.00" : String.valueOf(Double.parseDouble(str) * ((double) Integer.parseInt(str2)));
        }
        this.f17357o.setText(this.f17363u.format(Double.parseDouble(str)));
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
    /* JADX INFO: renamed from: w */
    public void m20311w(int i) {
        xdl0.M0(this.f17355m, true);
        this.f17355m.setText(this.f17361s.getString(R.string.G0, String.valueOf(i)));
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
    /* JADX INFO: renamed from: x */
    public void m20312x(boolean z) {
        this.f17362t = z;
        m20310v(this.f17349g.getEditableText().toString(), this.f17353k.getEditableText().toString());
        m20307m(this.f17349g.getEditableText().toString(), this.f17353k.getEditableText().toString());
        VText vText = this.f17344b;
        if (z) {
            vText.setBackground(this.f17361s.getDrawable(c3c0.k6));
            this.f17344b.setTextColor(Color.parseColor("#f15645"));
            this.f17345c.setBackgroundColor(-1);
            this.f17345c.setTextColor(Color.parseColor("#212121"));
            this.f17347e.setText(R.string.F0);
            this.f17347e.setCompoundDrawablesWithIntrinsicBounds(this.f17361s.getDrawable(c3c0.Z5), (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        vText.setBackgroundColor(-1);
        this.f17344b.setTextColor(Color.parseColor("#212121"));
        this.f17345c.setBackground(this.f17361s.getDrawable(c3c0.k6));
        this.f17345c.setTextColor(Color.parseColor("#f15645"));
        this.f17347e.setText(R.string.B0);
        this.f17347e.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    /* JADX INFO: renamed from: y */
    public void m20313y() {
        w3z.H(this.f17361s, new Runnable() { // from class: l.ohe0
            @Override // java.lang.Runnable
            public final void run() {
                this.f16598a.m20309u();
            }
        });
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: l.phe0$a */
    public class C0746a implements TextWatcher {
        public C0746a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (editable.toString().length() > 1 && String.valueOf(editable.toString().charAt(0)).equals("0") && !String.valueOf(editable.toString().charAt(1)).equals(".")) {
                editable = editable.delete(0, 1);
            }
            phe0.this.m20310v(editable.toString(), phe0.this.f17353k.getEditableText().toString());
            phe0.this.m20307m(editable.toString(), phe0.this.f17353k.getEditableText().toString());
            phe0 phe0Var = phe0.this;
            xdl0.M(phe0Var.f17348f, TextUtils.isEmpty(phe0Var.f17349g.getText().toString()));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: l.phe0$b */
    public class C0747b implements TextWatcher {
        public C0747b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (editable.toString().length() > 1 && String.valueOf(editable.toString().charAt(0)).equals("0") && !String.valueOf(editable.toString().charAt(1)).equals(".")) {
                editable = editable.delete(0, 1);
            }
            phe0 phe0Var = phe0.this;
            phe0Var.m20310v(phe0Var.f17349g.getEditableText().toString(), editable.toString());
            phe0 phe0Var2 = phe0.this;
            phe0Var2.m20307m(phe0Var2.f17349g.getEditableText().toString(), editable.toString());
            phe0 phe0Var3 = phe0.this;
            xdl0.M(phe0Var3.f17352j, TextUtils.isEmpty(phe0Var3.f17353k.getText().toString()));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
