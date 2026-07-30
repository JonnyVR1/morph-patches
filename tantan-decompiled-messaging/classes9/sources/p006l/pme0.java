package p006l;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.settings.SetTickleAct;
import com.p1.mobile.putong.core.data.TicklesStatus;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import l.a1c0;
import l.e30;
import l.j7c0;
import l.lsi0;
import l.mkd0;
import l.osi0;
import l.qme0;
import l.s7m;
import l.t100;
import l.xdl0;
import l.y4c0;
import v.VEditText;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class pme0 implements s7m<kme0> {

    /* JADX INFO: renamed from: a */
    public VLinear f19199a;

    /* JADX INFO: renamed from: b */
    public VEditText f19200b;

    /* JADX INFO: renamed from: c */
    public VText f19201c;

    /* JADX INFO: renamed from: d */
    public VEditText f19202d;

    /* JADX INFO: renamed from: e */
    public VText f19203e;

    /* JADX INFO: renamed from: f */
    public SetTickleAct f19204f;

    /* JADX INFO: renamed from: g */
    public kme0 f19205g;

    /* JADX INFO: renamed from: h */
    public View f19206h;

    /* JADX INFO: renamed from: i */
    public MenuItem f19207i;

    public pme0(SetTickleAct setTickleAct) {
        this.f19204f = setTickleAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m21596m(CharSequence charSequence) {
        String string = charSequence.toString();
        if (string.indexOf("\n") >= 0) {
            int selectionStart = this.f19200b.getSelectionStart();
            String strM21609s = m21609s(string);
            this.f19200b.setText(strM21609s);
            this.f19200b.setSelection(Math.min(strM21609s.length(), selectionStart - 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m21597n(CharSequence charSequence) {
        String string = charSequence.toString();
        if (string.indexOf("\n") >= 0) {
            int selectionStart = this.f19202d.getSelectionStart();
            String strM21609s = m21609s(string);
            this.f19202d.setText(strM21609s);
            this.f19202d.setSelection(Math.min(strM21609s.length(), selectionStart - 1));
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m21598C0() {
        return this.f19204f;
    }

    /* JADX INFO: renamed from: e */
    public View m21599e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return qme0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void m21602i1(kme0 kme0Var) {
        this.f19205g = kme0Var;
    }

    /* JADX INFO: renamed from: i */
    public final String m21601i(String str) {
        if (str.length() > 20) {
            return CoreModule.f1533b.getString(R.string.V0);
        }
        if (qib0.f19802Z.m14990K(str) || qib0.f19802Z.m14995P(str)) {
            return CoreModule.f1533b.getString(R.string.U5);
        }
        return null;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m21599e(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public final String m21603j(String str) {
        return TextUtils.isEmpty(str) ? str : str.replaceAll("\\s+", " ");
    }

    /* JADX INFO: renamed from: k */
    public void m21604k() {
        this.f19204f.hideInput(this.f19200b);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m21605l() {
        return TextUtils.equals("zh", Locale.getDefault().getLanguage()) && TextUtils.equals("CN", Locale.getDefault().getCountry());
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m21606p(View view) {
        String strM21603j = m21603j(this.f19200b.getText().toString().trim());
        String strM21603j2 = m21603j(this.f19202d.getText().toString().trim());
        String strM21601i = m21601i(strM21603j);
        if (!TextUtils.isEmpty(strM21601i)) {
            lsi0.y(strM21601i);
            return;
        }
        String strM21601i2 = m21601i(strM21603j2);
        if (TextUtils.isEmpty(strM21601i2)) {
            this.f19205g.m18211t0(strM21603j, strM21603j2);
        } else {
            lsi0.y(strM21601i2);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m21607q(Menu menu) {
        act().getMenuInflater().inflate(j7c0.d, menu);
        this.f19207i = menu.findItem(y4c0.w0);
        View actionView = menu.findItem(y4c0.w0).getActionView();
        this.f19206h = actionView;
        VText vTextFindViewById = actionView.findViewById(y4c0.m2);
        xdl0.E0(this.f19206h, new View.OnClickListener() { // from class: l.lme0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16523a.m21606p(view);
            }
        });
        if (this.f19205g.m18206m0()) {
            vTextFindViewById.setTextColor(-14606047);
        } else {
            vTextFindViewById.setTextColor(act().getResources().getColorStateList(a1c0.b0));
        }
        act().pendChangeActionButtonTypeface();
        m21612w();
    }

    /* JADX INFO: renamed from: r */
    public void m21608r() {
        this.f19200b.h().subscribe(mkd0.G(new e30() { // from class: l.mme0
            public final void call(Object obj) {
                this.f17115a.m21596m((CharSequence) obj);
            }
        }));
        this.f19202d.h().subscribe(mkd0.G(new e30() { // from class: l.nme0
            public final void call(Object obj) {
                this.f17748a.m21597n((CharSequence) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s */
    public final String m21609s(String str) {
        return TextUtils.isEmpty(str) ? str : str.replaceAll("\n", "");
    }

    /* JADX INFO: renamed from: u */
    public final void m21610u(VEditText vEditText, String str, TicklesStatus ticklesStatus) {
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
                osi0.g(CoreModule.f1533b.getString(R.string.m3));
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public void m21611v() {
        xdl0.M0(this.f19199a, true);
    }

    /* JADX INFO: renamed from: w */
    public void m21612w() {
        if (NullChecker.a(this.f19207i)) {
            this.f19207i.setVisible(this.f19205g.m18205l0());
        }
    }

    /* JADX INFO: renamed from: x */
    public void m21613x(String str, TicklesStatus ticklesStatus, String str2, TicklesStatus ticklesStatus2) {
        m21610u(this.f19202d, str2, ticklesStatus2);
        m21610u(this.f19200b, str, ticklesStatus);
    }

    /* JADX INFO: renamed from: y */
    public void m21614y(String str) {
        String strConcat;
        if (!m21605l() || str.length() <= 5) {
            this.f19201c.setMaxWidth(t100.d(170.0f));
            strConcat = str;
        } else {
            strConcat = str.substring(0, 5).concat("…");
        }
        this.f19201c.setText(act().getString(R.string.U0, strConcat));
        this.f19203e.setText(act().getString(R.string.T0, str));
    }

    public void destroy() {
    }
}
