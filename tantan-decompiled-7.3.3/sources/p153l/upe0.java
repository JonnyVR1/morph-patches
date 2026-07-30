package p153l;

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
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.messages.redpacket.SendRedPacketAct;
import com.tantanapp.common.utils.CrashHelper;
import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p151v.VEditText;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class upe0 implements iam<ope0> {

    /* JADX INFO: renamed from: a */
    public LinearLayout f180246a;

    /* JADX INFO: renamed from: b */
    public VText f180247b;

    /* JADX INFO: renamed from: c */
    public VText f180248c;

    /* JADX INFO: renamed from: d */
    public VText f180249d;

    /* JADX INFO: renamed from: e */
    public VText f180250e;

    /* JADX INFO: renamed from: f */
    public VText f180251f;

    /* JADX INFO: renamed from: g */
    public VEditText f180252g;

    /* JADX INFO: renamed from: h */
    public VText f180253h;

    /* JADX INFO: renamed from: i */
    public VText f180254i;

    /* JADX INFO: renamed from: j */
    public VText f180255j;

    /* JADX INFO: renamed from: k */
    public VEditText f180256k;

    /* JADX INFO: renamed from: l */
    public VText f180257l;

    /* JADX INFO: renamed from: m */
    public VText f180258m;

    /* JADX INFO: renamed from: n */
    public VText f180259n;

    /* JADX INFO: renamed from: o */
    public VText f180260o;

    /* JADX INFO: renamed from: p */
    public VText f180261p;

    /* JADX INFO: renamed from: q */
    public VText f180262q;

    /* JADX INFO: renamed from: r */
    public ope0 f180263r;

    /* JADX INFO: renamed from: s */
    public SendRedPacketAct f180264s;

    /* JADX INFO: renamed from: t */
    public boolean f180265t = true;

    /* JADX INFO: renamed from: u */
    public DecimalFormat f180266u = new DecimalFormat("0.00");

    /* JADX INFO: renamed from: l.upe0$c */
    public static class C20615c implements InputFilter {

        /* JADX INFO: renamed from: a */
        public Pattern f180269a = Pattern.compile("([0-9]|\\.)*");

        /* JADX INFO: renamed from: b */
        public Pattern f180270b = Pattern.compile("\\d+(\\.)?(\\d{1,2})?");

        @Override // android.text.InputFilter
        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            String string = charSequence.toString();
            String string2 = spanned.toString();
            if (TextUtils.isEmpty(string)) {
                return (i3 == 0 && string2.indexOf(".") == 1) ? "0" : "";
            }
            Matcher matcher = this.f180269a.matcher(charSequence);
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
            if (this.f180270b.matcher(str).matches()) {
                return Double.parseDouble(str) > 999999.0d ? spanned.subSequence(i3, i4) : string;
            }
            return spanned.subSequence(i3, i4);
        }
    }

    public upe0(SendRedPacketAct sendRedPacketAct) {
        this.f180264s = sendRedPacketAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m197072n(View view) {
        this.f180264s.hideInput();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m197073p(View view) {
        m197086x(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m197074q(View view) {
        m197086x(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m197075s(View view) {
        boolean z = this.f180265t;
        VEditText vEditText = this.f180252g;
        String string = z ? vEditText.getEditableText().toString() : String.valueOf(Double.parseDouble(vEditText.getEditableText().toString()) * ((double) Integer.parseInt(this.f180256k.getEditableText().toString())));
        i4g0.m138523u("e_pay_red_packet", "p_red_packet", jyb.m147494Y("groupchat_id", this.f180263r.m168667q0()), jyb.m147494Y("red_packet_type", this.f180265t ? "luck_red_packet" : "normal_red_packet"), jyb.m147494Y("red_packet_amount", string), jyb.m147494Y("red_packet_quantity", this.f180256k.getEditableText().toString()));
        this.f180264s.hideInput();
        SendRedPacketAct sendRedPacketAct = this.f180264s;
        sendRedPacketAct.progress(sendRedPacketAct.getString(R$string.f21517I2), true);
        this.f180263r.m168665D0(this.f180265t, string, this.f180256k.getEditableText().toString());
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f180264s;
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f180264s;
    }

    /* JADX INFO: renamed from: f */
    public View m197076f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return vpe0.m202231b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: i */
    public void m197077i(Throwable th) {
        act().progressDismiss();
        if (!(th instanceof TantanException.Client.CoreService)) {
            o1j0.m165634h(R$string.f21774m7);
            return;
        }
        int i = ((TantanException.Client.CoreService) th).subCode;
        if (i == 41905) {
            o1j0.m165634h(R$string.f21783n7);
        } else if (i == 41906) {
            tcz.m190531I(this.f180264s);
        } else {
            o1j0.m165634h(R$string.f21774m7);
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m197076f(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m197078j(pf60<Integer, String> pf60Var) {
        act().progressDismiss();
        if (9000 == pf60Var.f152156a.intValue()) {
            o1j0.m165649w(R$string.f21792o7);
            return;
        }
        if ("41905".equals(pf60Var.f152157b)) {
            o1j0.m165634h(R$string.f21783n7);
        } else if ("41906".equals(pf60Var.f152157b)) {
            tcz.m190531I(this.f180264s);
        } else {
            o1j0.m165634h(R$string.f21774m7);
        }
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(ope0 ope0Var) {
        this.f180263r = ope0Var;
    }

    /* JADX INFO: renamed from: l */
    public void m197080l(boolean z, boolean z2) {
        if (z) {
            VText vText = this.f180250e;
            if (z2) {
                vText.setTextColor(Color.parseColor("#f15645"));
                this.f180252g.setTextColor(Color.parseColor("#f15645"));
                this.f180253h.setTextColor(Color.parseColor("#f15645"));
                return;
            } else {
                vText.setTextColor(Color.parseColor("#212121"));
                this.f180252g.setTextColor(Color.parseColor("#212121"));
                this.f180253h.setTextColor(Color.parseColor("#212121"));
                return;
            }
        }
        VText vText2 = this.f180254i;
        if (z2) {
            vText2.setTextColor(Color.parseColor("#f15645"));
            this.f180256k.setTextColor(Color.parseColor("#f15645"));
            this.f180257l.setTextColor(Color.parseColor("#f15645"));
        } else {
            vText2.setTextColor(Color.parseColor("#212121"));
            this.f180256k.setTextColor(Color.parseColor("#212121"));
            this.f180257l.setTextColor(Color.parseColor("#212121"));
        }
    }

    /* JADX INFO: renamed from: m */
    public void m197081m(String str, String str2) {
        try {
            double d = !TextUtils.isEmpty(str) ? Double.parseDouble(str) : 0.0d;
            int i = !TextUtils.isEmpty(str2) ? Integer.parseInt(str2) : -1;
            m197080l(true, false);
            m197080l(false, false);
            bnl0.m105524M(this.f180249d, false);
            this.f180261p.setEnabled(d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && i > 0);
            if (this.f180265t) {
                if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && i > 0 && d / ((double) i) > 200.0d) {
                    bnl0.m105525M0(this.f180249d, true);
                    this.f180261p.setEnabled(false);
                    this.f180249d.setText(this.f180264s.getString(R$string.f21475D0, "200"));
                    m197080l(false, true);
                    m197080l(true, true);
                } else if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && i > 0 && d / ((double) i) < 0.01d) {
                    bnl0.m105525M0(this.f180249d, true);
                    this.f180261p.setEnabled(false);
                    this.f180249d.setText("单个红包不可低于0.01元");
                    m197080l(false, true);
                    m197080l(true, true);
                }
                if (d > 20000.0d) {
                    bnl0.m105525M0(this.f180249d, true);
                    this.f180261p.setEnabled(false);
                    this.f180249d.setText(R$string.f21467C0);
                    m197080l(true, true);
                    m197080l(false, false);
                }
            } else if (d > 200.0d) {
                bnl0.m105525M0(this.f180249d, true);
                this.f180261p.setEnabled(false);
                this.f180249d.setText(this.f180264s.getString(R$string.f21475D0, "200"));
                m197080l(true, true);
            }
            if (i == 0) {
                bnl0.m105525M0(this.f180249d, true);
                this.f180261p.setEnabled(false);
                this.f180249d.setText(R$string.f21466C);
                m197080l(false, true);
                return;
            }
            if (i > 100) {
                bnl0.m105525M0(this.f180249d, true);
                this.f180261p.setEnabled(false);
                this.f180249d.setText(R$string.f21794p0);
                m197080l(false, true);
            }
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m197082r() {
        m197086x(true);
        bnl0.m105509E0(this.f180246a, new View.OnClickListener() { // from class: l.ppe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f153530a.m197072n(view);
            }
        });
        this.f180262q.setText(this.f180264s.getString(R$string.f21835u0, "48"));
        this.f180253h.setText(this.f180264s.getString(R$string.f21523J0, ""));
        this.f180257l.setText(this.f180264s.getString(R$string.f21819s0, ""));
        bnl0.m105509E0(this.f180247b, new View.OnClickListener() { // from class: l.qpe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f158868a.m197073p(view);
            }
        });
        bnl0.m105509E0(this.f180248c, new View.OnClickListener() { // from class: l.rpe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f164361a.m197074q(view);
            }
        });
        this.f180261p.setEnabled(false);
        this.f180252g.setFilters(new InputFilter[]{new C20615c()});
        this.f180252g.addTextChangedListener(new C20613a());
        this.f180256k.addTextChangedListener(new C20614b());
        bnl0.m105509E0(this.f180261p, new View.OnClickListener() { // from class: l.spe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f170037a.m197075s(view);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m197083u() {
        this.f180263r.m168666p0();
    }

    /* JADX INFO: renamed from: v */
    public void m197084v(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            this.f180260o.setText("0.00");
            return;
        }
        if (!this.f180265t) {
            str = TextUtils.isEmpty(str2) ? "0.00" : String.valueOf(Double.parseDouble(str) * ((double) Integer.parseInt(str2)));
        }
        this.f180260o.setText(this.f180266u.format(Double.parseDouble(str)));
    }

    /* JADX INFO: renamed from: w */
    public void m197085w(int i) {
        bnl0.m105525M0(this.f180258m, true);
        this.f180258m.setText(this.f180264s.getString(R$string.f21499G0, String.valueOf(i)));
    }

    /* JADX INFO: renamed from: x */
    public void m197086x(boolean z) {
        this.f180265t = z;
        m197084v(this.f180252g.getEditableText().toString(), this.f180256k.getEditableText().toString());
        m197081m(this.f180252g.getEditableText().toString(), this.f180256k.getEditableText().toString());
        VText vText = this.f180247b;
        if (z) {
            vText.setBackground(this.f180264s.getDrawable(ibc0.f114064k6));
            this.f180247b.setTextColor(Color.parseColor("#f15645"));
            this.f180248c.setBackgroundColor(-1);
            this.f180248c.setTextColor(Color.parseColor("#212121"));
            this.f180250e.setText(R$string.f21491F0);
            this.f180250e.setCompoundDrawablesWithIntrinsicBounds(this.f180264s.getDrawable(ibc0.f113965Z5), (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        vText.setBackgroundColor(-1);
        this.f180247b.setTextColor(Color.parseColor("#212121"));
        this.f180248c.setBackground(this.f180264s.getDrawable(ibc0.f114064k6));
        this.f180248c.setTextColor(Color.parseColor("#f15645"));
        this.f180250e.setText(R$string.f21459B0);
        this.f180250e.setCompoundDrawables(null, null, null, null);
    }

    /* JADX INFO: renamed from: y */
    public void m197087y() {
        tcz.m190530H(this.f180264s, new Runnable() { // from class: l.tpe0
            @Override // java.lang.Runnable
            public final void run() {
                this.f175593a.m197083u();
            }
        });
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.upe0$a */
    public class C20613a implements TextWatcher {
        public C20613a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (editable.toString().length() > 1 && String.valueOf(editable.toString().charAt(0)).equals("0") && !String.valueOf(editable.toString().charAt(1)).equals(".")) {
                editable = editable.delete(0, 1);
            }
            upe0.this.m197084v(editable.toString(), upe0.this.f180256k.getEditableText().toString());
            upe0.this.m197081m(editable.toString(), upe0.this.f180256k.getEditableText().toString());
            upe0 upe0Var = upe0.this;
            bnl0.m105524M(upe0Var.f180251f, TextUtils.isEmpty(upe0Var.f180252g.getText().toString()));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: l.upe0$b */
    public class C20614b implements TextWatcher {
        public C20614b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (editable.toString().length() > 1 && String.valueOf(editable.toString().charAt(0)).equals("0") && !String.valueOf(editable.toString().charAt(1)).equals(".")) {
                editable = editable.delete(0, 1);
            }
            upe0 upe0Var = upe0.this;
            upe0Var.m197084v(upe0Var.f180252g.getEditableText().toString(), editable.toString());
            upe0 upe0Var2 = upe0.this;
            upe0Var2.m197081m(upe0Var2.f180252g.getEditableText().toString(), editable.toString());
            upe0 upe0Var3 = upe0.this;
            bnl0.m105524M(upe0Var3.f180255j, TextUtils.isEmpty(upe0Var3.f180256k.getText().toString()));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
