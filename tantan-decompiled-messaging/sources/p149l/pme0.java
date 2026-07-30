package p149l;

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
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.TicklesStatus;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.settings.SetTickleAct;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import p147v.VEditText;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class pme0 implements s7m<kme0> {

    /* JADX INFO: renamed from: a */
    public VLinear f150207a;

    /* JADX INFO: renamed from: b */
    public VEditText f150208b;

    /* JADX INFO: renamed from: c */
    public VText f150209c;

    /* JADX INFO: renamed from: d */
    public VEditText f150210d;

    /* JADX INFO: renamed from: e */
    public VText f150211e;

    /* JADX INFO: renamed from: f */
    public SetTickleAct f150212f;

    /* JADX INFO: renamed from: g */
    public kme0 f150213g;

    /* JADX INFO: renamed from: h */
    public View f150214h;

    /* JADX INFO: renamed from: i */
    public MenuItem f150215i;

    public pme0(SetTickleAct setTickleAct) {
        this.f150212f = setTickleAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m170306m(CharSequence charSequence) {
        String string = charSequence.toString();
        if (string.indexOf(SignParameters.NEW_LINE) >= 0) {
            int selectionStart = this.f150208b.getSelectionStart();
            String strM170317s = m170317s(string);
            this.f150208b.setText(strM170317s);
            this.f150208b.setSelection(Math.min(strM170317s.length(), selectionStart - 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m170307n(CharSequence charSequence) {
        String string = charSequence.toString();
        if (string.indexOf(SignParameters.NEW_LINE) >= 0) {
            int selectionStart = this.f150210d.getSelectionStart();
            String strM170317s = m170317s(string);
            this.f150210d.setText(strM170317s);
            this.f150210d.setSelection(Math.min(strM170317s.length(), selectionStart - 1));
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f150212f;
    }

    /* JADX INFO: renamed from: e */
    public View m170308e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return qme0.m175566b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(kme0 kme0Var) {
        this.f150213g = kme0Var;
    }

    /* JADX INFO: renamed from: i */
    public final String m170310i(String str) {
        if (str.length() > 20) {
            return CoreModule.f17544b.getString(R$string.f20877V0);
        }
        if (qib0.f154711Z.m119125K(str) || qib0.f154711Z.m119130P(str)) {
            return CoreModule.f17544b.getString(R$string.f20874U5);
        }
        return null;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m170308e(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public final String m170311j(String str) {
        return TextUtils.isEmpty(str) ? str : str.replaceAll("\\s+", MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
    }

    /* JADX INFO: renamed from: k */
    public void m170312k() {
        this.f150212f.hideInput(this.f150208b);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m170313l() {
        return TextUtils.equals("zh", Locale.getDefault().getLanguage()) && TextUtils.equals("CN", Locale.getDefault().getCountry());
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m170314p(View view) {
        String strM170311j = m170311j(this.f150208b.getText().toString().trim());
        String strM170311j2 = m170311j(this.f150210d.getText().toString().trim());
        String strM170310i = m170310i(strM170311j);
        if (!TextUtils.isEmpty(strM170310i)) {
            lsi0.m151595y(strM170310i);
            return;
        }
        String strM170310i2 = m170310i(strM170311j2);
        if (TextUtils.isEmpty(strM170310i2)) {
            this.f150213g.m146527t0(strM170311j, strM170311j2);
        } else {
            lsi0.m151595y(strM170310i2);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m170315q(Menu menu) {
        act().getMenuInflater().inflate(j7c0.f116588d, menu);
        this.f150215i = menu.findItem(y4c0.f196242w0);
        View actionView = menu.findItem(y4c0.f196242w0).getActionView();
        this.f150214h = actionView;
        VText vText = (VText) actionView.findViewById(y4c0.f196174m2);
        xdl0.m208329E0(this.f150214h, new View.OnClickListener() { // from class: l.lme0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f128784a.m170314p(view);
            }
        });
        if (this.f150213g.m146522m0()) {
            vText.setTextColor(-14606047);
        } else {
            vText.setTextColor(act().getResources().getColorStateList(a1c0.f67148b0));
        }
        act().pendChangeActionButtonTypeface();
        m170320w();
    }

    /* JADX INFO: renamed from: r */
    public void m170316r() {
        this.f150208b.mo28617h().subscribe(mkd0.m154955G(new e30() { // from class: l.mme0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f134619a.m170306m((CharSequence) obj);
            }
        }));
        this.f150210d.mo28617h().subscribe(mkd0.m154955G(new e30() { // from class: l.nme0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f139626a.m170307n((CharSequence) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s */
    public final String m170317s(String str) {
        return TextUtils.isEmpty(str) ? str : str.replaceAll(SignParameters.NEW_LINE, "");
    }

    /* JADX INFO: renamed from: u */
    public final void m170318u(VEditText vEditText, String str, TicklesStatus ticklesStatus) {
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
        vEditText.setOnClickListener(new View.OnClickListener() { // from class: l.ome0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                osi0.m165783g(CoreModule.f17544b.getString(R$string.f21028m3));
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public void m170319v() {
        xdl0.m208345M0(this.f150207a, true);
    }

    /* JADX INFO: renamed from: w */
    public void m170320w() {
        if (NullChecker.m81303a(this.f150215i)) {
            this.f150215i.setVisible(this.f150213g.m146521l0());
        }
    }

    /* JADX INFO: renamed from: x */
    public void m170321x(String str, TicklesStatus ticklesStatus, String str2, TicklesStatus ticklesStatus2) {
        m170318u(this.f150210d, str2, ticklesStatus2);
        m170318u(this.f150208b, str, ticklesStatus);
    }

    /* JADX INFO: renamed from: y */
    public void m170322y(String str) {
        String strConcat;
        if (!m170313l() || str.length() <= 5) {
            this.f150209c.setMaxWidth(t100.m186890d(170.0f));
            strConcat = str;
        } else {
            strConcat = str.substring(0, 5).concat("…");
        }
        this.f150209c.setText(act().getString(R$string.f20869U0, strConcat));
        this.f150211e.setText(act().getString(R$string.f20861T0, str));
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
