package p153l;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.TicklesStatus;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.settings.SetTickleAct;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import p151v.VEditText;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class uue0 implements iam<pue0> {

    /* JADX INFO: renamed from: a */
    public VLinear f181059a;

    /* JADX INFO: renamed from: b */
    public VEditText f181060b;

    /* JADX INFO: renamed from: c */
    public VText f181061c;

    /* JADX INFO: renamed from: d */
    public VEditText f181062d;

    /* JADX INFO: renamed from: e */
    public VText f181063e;

    /* JADX INFO: renamed from: f */
    public SetTickleAct f181064f;

    /* JADX INFO: renamed from: g */
    public pue0 f181065g;

    /* JADX INFO: renamed from: h */
    public View f181066h;

    /* JADX INFO: renamed from: i */
    public MenuItem f181067i;

    public uue0(SetTickleAct setTickleAct) {
        this.f181064f = setTickleAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m198179m(CharSequence charSequence) {
        String string = charSequence.toString();
        if (string.indexOf(SignParameters.NEW_LINE) >= 0) {
            int selectionStart = this.f181060b.getSelectionStart();
            String strM198190s = m198190s(string);
            this.f181060b.setText(strM198190s);
            this.f181060b.setSelection(Math.min(strM198190s.length(), selectionStart - 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m198180n(CharSequence charSequence) {
        String string = charSequence.toString();
        if (string.indexOf(SignParameters.NEW_LINE) >= 0) {
            int selectionStart = this.f181062d.getSelectionStart();
            String strM198190s = m198190s(string);
            this.f181062d.setText(strM198190s);
            this.f181062d.setSelection(Math.min(strM198190s.length(), selectionStart - 1));
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f181064f;
    }

    /* JADX INFO: renamed from: e */
    public View m198181e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return vue0.m202786b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(pue0 pue0Var) {
        this.f181065g = pue0Var;
    }

    /* JADX INFO: renamed from: i */
    public final String m198183i(String str) {
        if (str.length() > 20) {
            return CoreModule.f18263b.getString(R$string.f21619V0);
        }
        if (uqb0.f180394Z.m95954K(str) || uqb0.f180394Z.m95959P(str)) {
            return CoreModule.f18263b.getString(R$string.f21616U5);
        }
        return null;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m198181e(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public final String m198184j(String str) {
        return TextUtils.isEmpty(str) ? str : str.replaceAll("\\s+", MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
    }

    /* JADX INFO: renamed from: k */
    public void m198185k() {
        this.f181064f.hideInput(this.f181060b);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m198186l() {
        return TextUtils.equals("zh", Locale.getDefault().getLanguage()) && TextUtils.equals("CN", Locale.getDefault().getCountry());
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m198187p(View view) {
        String strM198184j = m198184j(this.f181060b.getText().toString().trim());
        String strM198184j2 = m198184j(this.f181062d.getText().toString().trim());
        String strM198183i = m198183i(strM198184j);
        if (!TextUtils.isEmpty(strM198183i)) {
            o1j0.m165651y(strM198183i);
            return;
        }
        String strM198183i2 = m198183i(strM198184j2);
        if (TextUtils.isEmpty(strM198183i2)) {
            this.f181065g.m173878t0(strM198184j, strM198184j2);
        } else {
            o1j0.m165651y(strM198183i2);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m198188q(Menu menu) {
        act().getMenuInflater().inflate(nfc0.f141724d, menu);
        this.f181067i = menu.findItem(edc0.f93477w0);
        View actionView = menu.findItem(edc0.f93477w0).getActionView();
        this.f181066h = actionView;
        VText vText = (VText) actionView.findViewById(edc0.f93409m2);
        bnl0.m105509E0(this.f181066h, new View.OnClickListener() { // from class: l.que0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f159564a.m198187p(view);
            }
        });
        if (this.f181065g.m173873m0()) {
            vText.setTextColor(-14606047);
        } else {
            vText.setTextColor(act().getResources().getColorStateList(g9c0.f102812b0));
        }
        act().pendChangeActionButtonTypeface();
        m198193w();
    }

    /* JADX INFO: renamed from: r */
    public void m198189r() {
        this.f181060b.mo29616h().subscribe(psd0.m173596G(new y20() { // from class: l.rue0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f164916a.m198179m((CharSequence) obj);
            }
        }));
        this.f181062d.mo29616h().subscribe(psd0.m173596G(new y20() { // from class: l.sue0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f170680a.m198180n((CharSequence) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s */
    public final String m198190s(String str) {
        return TextUtils.isEmpty(str) ? str : str.replaceAll(SignParameters.NEW_LINE, "");
    }

    /* JADX INFO: renamed from: u */
    public final void m198191u(VEditText vEditText, String str, TicklesStatus ticklesStatus) {
        vEditText.setText(str);
        if (TextUtils.isEmpty(str) || !TEnum.equals(ticklesStatus, "pending")) {
            vEditText.requestFocus();
            vEditText.setSelection(str.length());
            return;
        }
        vEditText.setTextColor(Color.parseColor("#33000000"));
        vEditText.setFocusable(false);
        vEditText.setCursorVisible(false);
        vEditText.setFocusableInTouchMode(false);
        vEditText.setOnClickListener(new View.OnClickListener() { // from class: l.tue0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r1j0.m179420g(CoreModule.f18263b.getString(R$string.f21770m3));
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public void m198192v() {
        bnl0.m105525M0(this.f181059a, true);
    }

    /* JADX INFO: renamed from: w */
    public void m198193w() {
        if (NullChecker.m82486a(this.f181067i)) {
            this.f181067i.setVisible(this.f181065g.m173872l0());
        }
    }

    /* JADX INFO: renamed from: x */
    public void m198194x(String str, TicklesStatus ticklesStatus, String str2, TicklesStatus ticklesStatus2) {
        m198191u(this.f181062d, str2, ticklesStatus2);
        m198191u(this.f181060b, str, ticklesStatus);
    }

    /* JADX INFO: renamed from: y */
    public void m198195y(String str) {
        String strConcat;
        if (!m198186l() || str.length() <= 5) {
            this.f181061c.setMaxWidth(qa00.m175859d(170.0f));
            strConcat = str;
        } else {
            strConcat = str.substring(0, 5).concat("…");
        }
        this.f181061c.setText(act().getString(R$string.f21611U0, strConcat));
        this.f181063e.setText(act().getString(R$string.f21603T0, str));
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
