package p002l;

import android.content.Context;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.Act;
import l.d30;
import l.lsi0;
import l.par;
import l.s7m;
import l.x940;
import v.VEditText;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class w940 implements s7m<t940> {

    /* JADX INFO: renamed from: a */
    public VLinear f21564a;

    /* JADX INFO: renamed from: b */
    public VEditText f21565b;

    /* JADX INFO: renamed from: c */
    public VText f21566c;

    /* JADX INFO: renamed from: d */
    public t940 f21567d;

    /* JADX INFO: renamed from: e */
    public final Act f21568e;

    /* JADX INFO: renamed from: f */
    public final InputFilter f21569f = new par(100, new d30() { // from class: l.u940
        public final void call() {
            lsi0.j(String.format("不能超过%d字符", 50));
        }
    });

    public w940(Act act) {
        this.f21568e = act;
    }

    /* JADX INFO: renamed from: e */
    private void m24431e() {
        InputMethodManager inputMethodManager = (InputMethodManager) this.f21568e.getSystemService("input_method");
        View viewPeekDecorView = this.f21568e.getWindow().peekDecorView();
        if (viewPeekDecorView != null) {
            inputMethodManager.hideSoftInputFromWindow(viewPeekDecorView.getWindowToken(), 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m24432f(View view) {
        this.f21567d.m22816j0(this.f21565b.getText().toString());
        m24431e();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m24433C0() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public View m24434c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return x940.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void m24437i1(t940 t940Var) {
        this.f21567d = t940Var;
    }

    /* JADX INFO: renamed from: i */
    public void m24436i(String str) {
        this.f21565b.setText(str);
        this.f21565b.setSelection(TextUtils.isEmpty(str) ? 0 : str.length());
        this.f21565b.setHint(String.format("最多输入%d个字符", 50));
        this.f21565b.setFocusable(true);
        this.f21565b.setFocusableInTouchMode(true);
        m24438j(this.f21565b);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (this.f21564a == null) {
            m24434c(layoutInflater, viewGroup);
            this.f21565b.setFilters(new InputFilter[]{this.f21569f});
            this.f21566c.setOnClickListener(new View.OnClickListener() { // from class: l.v940
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f21038a.m24432f(view);
                }
            });
        }
        return this.f21564a;
    }

    /* JADX INFO: renamed from: j */
    public final void m24438j(EditText editText) {
        editText.requestFocus();
        ((InputMethodManager) this.f21568e.getSystemService("input_method")).showSoftInput(editText, 1);
    }

    public void destroy() {
    }
}
