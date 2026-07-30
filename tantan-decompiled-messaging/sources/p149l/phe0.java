package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.messages.redpacket.SendRedPacketAct;
import com.tantanapp.common.utils.CrashHelper;
import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p147v.VEditText;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class phe0 implements s7m<jhe0> {

    /* JADX INFO: renamed from: a */
    public LinearLayout f148900a;

    /* JADX INFO: renamed from: b */
    public VText f148901b;

    /* JADX INFO: renamed from: c */
    public VText f148902c;

    /* JADX INFO: renamed from: d */
    public VText f148903d;

    /* JADX INFO: renamed from: e */
    public VText f148904e;

    /* JADX INFO: renamed from: f */
    public VText f148905f;

    /* JADX INFO: renamed from: g */
    public VEditText f148906g;

    /* JADX INFO: renamed from: h */
    public VText f148907h;

    /* JADX INFO: renamed from: i */
    public VText f148908i;

    /* JADX INFO: renamed from: j */
    public VText f148909j;

    /* JADX INFO: renamed from: k */
    public VEditText f148910k;

    /* JADX INFO: renamed from: l */
    public VText f148911l;

    /* JADX INFO: renamed from: m */
    public VText f148912m;

    /* JADX INFO: renamed from: n */
    public VText f148913n;

    /* JADX INFO: renamed from: o */
    public VText f148914o;

    /* JADX INFO: renamed from: p */
    public VText f148915p;

    /* JADX INFO: renamed from: q */
    public VText f148916q;

    /* JADX INFO: renamed from: r */
    public jhe0 f148917r;

    /* JADX INFO: renamed from: s */
    public SendRedPacketAct f148918s;

    /* JADX INFO: renamed from: t */
    public boolean f148919t = true;

    /* JADX INFO: renamed from: u */
    public DecimalFormat f148920u = new DecimalFormat("0.00");

    /* JADX INFO: renamed from: l.phe0$c */
    public static class C19213c implements InputFilter {

        /* JADX INFO: renamed from: a */
        public Pattern f148923a = Pattern.compile("([0-9]|\\.)*");

        /* JADX INFO: renamed from: b */
        public Pattern f148924b = Pattern.compile("\\d+(\\.)?(\\d{1,2})?");

        @Override // android.text.InputFilter
        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            String string = charSequence.toString();
            String string2 = spanned.toString();
            if (TextUtils.isEmpty(string)) {
                return (i3 == 0 && string2.indexOf(".") == 1) ? "0" : "";
            }
            Matcher matcher = this.f148923a.matcher(charSequence);
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
            if (this.f148924b.matcher(str).matches()) {
                return Double.parseDouble(str) > 999999.0d ? spanned.subSequence(i3, i4) : string;
            }
            return spanned.subSequence(i3, i4);
        }
    }

    public phe0(SendRedPacketAct sendRedPacketAct) {
        this.f148918s = sendRedPacketAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m168947n(View view) {
        this.f148918s.hideInput();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m168948p(View view) {
        m168961x(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m168949q(View view) {
        m168961x(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m168950s(View view) {
        boolean z = this.f148919t;
        VEditText vEditText = this.f148906g;
        String string = z ? vEditText.getEditableText().toString() : String.valueOf(Double.parseDouble(vEditText.getEditableText().toString()) * ((double) Integer.parseInt(this.f148910k.getEditableText().toString())));
        zvf0.m220399u("e_pay_red_packet", "p_red_packet", vwb.m200311Y("groupchat_id", this.f148917r.m141517q0()), vwb.m200311Y("red_packet_type", this.f148919t ? "luck_red_packet" : "normal_red_packet"), vwb.m200311Y("red_packet_amount", string), vwb.m200311Y("red_packet_quantity", this.f148910k.getEditableText().toString()));
        this.f148918s.hideInput();
        SendRedPacketAct sendRedPacketAct = this.f148918s;
        sendRedPacketAct.progress(sendRedPacketAct.getString(R$string.f20775I2), true);
        this.f148917r.m141515D0(this.f148919t, string, this.f148910k.getEditableText().toString());
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f148918s;
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f148918s;
    }

    /* JADX INFO: renamed from: f */
    public View m168951f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return qhe0.m174536b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: i */
    public void m168952i(Throwable th) {
        act().progressDismiss();
        if (!(th instanceof TantanException.Client.CoreService)) {
            lsi0.m151578h(R$string.f21032m7);
            return;
        }
        int i = ((TantanException.Client.CoreService) th).subCode;
        if (i == 41905) {
            lsi0.m151578h(R$string.f21041n7);
        } else if (i == 41906) {
            w3z.m201403I(this.f148918s);
        } else {
            lsi0.m151578h(R$string.f21032m7);
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m168951f(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m168953j(j760<Integer, String> j760Var) {
        act().progressDismiss();
        if (9000 == j760Var.f116564a.intValue()) {
            lsi0.m151593w(R$string.f21050o7);
            return;
        }
        if ("41905".equals(j760Var.f116565b)) {
            lsi0.m151578h(R$string.f21041n7);
        } else if ("41906".equals(j760Var.f116565b)) {
            w3z.m201403I(this.f148918s);
        } else {
            lsi0.m151578h(R$string.f21032m7);
        }
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(jhe0 jhe0Var) {
        this.f148917r = jhe0Var;
    }

    /* JADX INFO: renamed from: l */
    public void m168955l(boolean z, boolean z2) {
        if (z) {
            VText vText = this.f148904e;
            if (z2) {
                vText.setTextColor(Color.parseColor("#f15645"));
                this.f148906g.setTextColor(Color.parseColor("#f15645"));
                this.f148907h.setTextColor(Color.parseColor("#f15645"));
                return;
            } else {
                vText.setTextColor(Color.parseColor("#212121"));
                this.f148906g.setTextColor(Color.parseColor("#212121"));
                this.f148907h.setTextColor(Color.parseColor("#212121"));
                return;
            }
        }
        VText vText2 = this.f148908i;
        if (z2) {
            vText2.setTextColor(Color.parseColor("#f15645"));
            this.f148910k.setTextColor(Color.parseColor("#f15645"));
            this.f148911l.setTextColor(Color.parseColor("#f15645"));
        } else {
            vText2.setTextColor(Color.parseColor("#212121"));
            this.f148910k.setTextColor(Color.parseColor("#212121"));
            this.f148911l.setTextColor(Color.parseColor("#212121"));
        }
    }

    /* JADX INFO: renamed from: m */
    public void m168956m(String str, String str2) {
        try {
            double d = !TextUtils.isEmpty(str) ? Double.parseDouble(str) : 0.0d;
            int i = !TextUtils.isEmpty(str2) ? Integer.parseInt(str2) : -1;
            m168955l(true, false);
            m168955l(false, false);
            xdl0.m208344M(this.f148903d, false);
            this.f148915p.setEnabled(d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && i > 0);
            if (this.f148919t) {
                if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && i > 0 && d / ((double) i) > 200.0d) {
                    xdl0.m208345M0(this.f148903d, true);
                    this.f148915p.setEnabled(false);
                    this.f148903d.setText(this.f148918s.getString(R$string.f20733D0, "200"));
                    m168955l(false, true);
                    m168955l(true, true);
                } else if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && i > 0 && d / ((double) i) < 0.01d) {
                    xdl0.m208345M0(this.f148903d, true);
                    this.f148915p.setEnabled(false);
                    this.f148903d.setText("单个红包不可低于0.01元");
                    m168955l(false, true);
                    m168955l(true, true);
                }
                if (d > 20000.0d) {
                    xdl0.m208345M0(this.f148903d, true);
                    this.f148915p.setEnabled(false);
                    this.f148903d.setText(R$string.f20725C0);
                    m168955l(true, true);
                    m168955l(false, false);
                }
            } else if (d > 200.0d) {
                xdl0.m208345M0(this.f148903d, true);
                this.f148915p.setEnabled(false);
                this.f148903d.setText(this.f148918s.getString(R$string.f20733D0, "200"));
                m168955l(true, true);
            }
            if (i == 0) {
                xdl0.m208345M0(this.f148903d, true);
                this.f148915p.setEnabled(false);
                this.f148903d.setText(R$string.f20724C);
                m168955l(false, true);
                return;
            }
            if (i > 100) {
                xdl0.m208345M0(this.f148903d, true);
                this.f148915p.setEnabled(false);
                this.f148903d.setText(R$string.f21052p0);
                m168955l(false, true);
            }
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m168957r() {
        m168961x(true);
        xdl0.m208329E0(this.f148900a, new View.OnClickListener() { // from class: l.khe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f123143a.m168947n(view);
            }
        });
        this.f148916q.setText(this.f148918s.getString(R$string.f21093u0, "48"));
        this.f148907h.setText(this.f148918s.getString(R$string.f20781J0, ""));
        this.f148911l.setText(this.f148918s.getString(R$string.f21077s0, ""));
        xdl0.m208329E0(this.f148901b, new View.OnClickListener() { // from class: l.lhe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f128097a.m168948p(view);
            }
        });
        xdl0.m208329E0(this.f148902c, new View.OnClickListener() { // from class: l.mhe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f133813a.m168949q(view);
            }
        });
        this.f148915p.setEnabled(false);
        this.f148906g.setFilters(new InputFilter[]{new C19213c()});
        this.f148906g.addTextChangedListener(new C19211a());
        this.f148910k.addTextChangedListener(new C19212b());
        xdl0.m208329E0(this.f148915p, new View.OnClickListener() { // from class: l.nhe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f138973a.m168950s(view);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m168958u() {
        this.f148917r.m141516p0();
    }

    /* JADX INFO: renamed from: v */
    public void m168959v(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            this.f148914o.setText("0.00");
            return;
        }
        if (!this.f148919t) {
            str = TextUtils.isEmpty(str2) ? "0.00" : String.valueOf(Double.parseDouble(str) * ((double) Integer.parseInt(str2)));
        }
        this.f148914o.setText(this.f148920u.format(Double.parseDouble(str)));
    }

    /* JADX INFO: renamed from: w */
    public void m168960w(int i) {
        xdl0.m208345M0(this.f148912m, true);
        this.f148912m.setText(this.f148918s.getString(R$string.f20757G0, String.valueOf(i)));
    }

    /* JADX INFO: renamed from: x */
    public void m168961x(boolean z) {
        this.f148919t = z;
        m168959v(this.f148906g.getEditableText().toString(), this.f148910k.getEditableText().toString());
        m168956m(this.f148906g.getEditableText().toString(), this.f148910k.getEditableText().toString());
        VText vText = this.f148901b;
        if (z) {
            vText.setBackground(this.f148918s.getDrawable(c3c0.f78789k6));
            this.f148901b.setTextColor(Color.parseColor("#f15645"));
            this.f148902c.setBackgroundColor(-1);
            this.f148902c.setTextColor(Color.parseColor("#212121"));
            this.f148904e.setText(R$string.f20749F0);
            this.f148904e.setCompoundDrawablesWithIntrinsicBounds(this.f148918s.getDrawable(c3c0.f78690Z5), (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        vText.setBackgroundColor(-1);
        this.f148901b.setTextColor(Color.parseColor("#212121"));
        this.f148902c.setBackground(this.f148918s.getDrawable(c3c0.f78789k6));
        this.f148902c.setTextColor(Color.parseColor("#f15645"));
        this.f148904e.setText(R$string.f20717B0);
        this.f148904e.setCompoundDrawables(null, null, null, null);
    }

    /* JADX INFO: renamed from: y */
    public void m168962y() {
        w3z.m201402H(this.f148918s, new Runnable() { // from class: l.ohe0
            @Override // java.lang.Runnable
            public final void run() {
                this.f143973a.m168958u();
            }
        });
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.phe0$a */
    public class C19211a implements TextWatcher {
        public C19211a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (editable.toString().length() > 1 && String.valueOf(editable.toString().charAt(0)).equals("0") && !String.valueOf(editable.toString().charAt(1)).equals(".")) {
                editable = editable.delete(0, 1);
            }
            phe0.this.m168959v(editable.toString(), phe0.this.f148910k.getEditableText().toString());
            phe0.this.m168956m(editable.toString(), phe0.this.f148910k.getEditableText().toString());
            phe0 phe0Var = phe0.this;
            xdl0.m208344M(phe0Var.f148905f, TextUtils.isEmpty(phe0Var.f148906g.getText().toString()));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: l.phe0$b */
    public class C19212b implements TextWatcher {
        public C19212b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (editable.toString().length() > 1 && String.valueOf(editable.toString().charAt(0)).equals("0") && !String.valueOf(editable.toString().charAt(1)).equals(".")) {
                editable = editable.delete(0, 1);
            }
            phe0 phe0Var = phe0.this;
            phe0Var.m168959v(phe0Var.f148906g.getEditableText().toString(), editable.toString());
            phe0 phe0Var2 = phe0.this;
            phe0Var2.m168956m(phe0Var2.f148906g.getEditableText().toString(), editable.toString());
            phe0 phe0Var3 = phe0.this;
            xdl0.m208344M(phe0Var3.f148909j, TextUtils.isEmpty(phe0Var3.f148910k.getText().toString()));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
