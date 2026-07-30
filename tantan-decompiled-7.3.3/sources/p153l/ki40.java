package p153l;

import android.content.Context;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import p151v.VEditText;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ki40 implements iam<hi40> {

    /* JADX INFO: renamed from: a */
    public VLinear f126961a;

    /* JADX INFO: renamed from: b */
    public VEditText f126962b;

    /* JADX INFO: renamed from: c */
    public VText f126963c;

    /* JADX INFO: renamed from: d */
    public hi40 f126964d;

    /* JADX INFO: renamed from: e */
    public final Act f126965e;

    /* JADX INFO: renamed from: f */
    public final InputFilter f126966f = new rcr(100, new x20() { // from class: l.ii40
        @Override // p153l.x20
        public final void call() {
            o1j0.m165636j(String.format("不能超过%d字符", 50));
        }
    });

    public ki40(Act act) {
        this.f126965e = act;
    }

    /* JADX INFO: renamed from: e */
    private void m149861e() {
        InputMethodManager inputMethodManager = (InputMethodManager) this.f126965e.getSystemService("input_method");
        View viewPeekDecorView = this.f126965e.getWindow().peekDecorView();
        if (viewPeekDecorView != null) {
            inputMethodManager.hideSoftInputFromWindow(viewPeekDecorView.getWindowToken(), 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m149862f(View view) {
        this.f126964d.m135109j0(this.f126962b.getText().toString());
        m149861e();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public View m149863c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return li40.m154296b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(hi40 hi40Var) {
        this.f126964d = hi40Var;
    }

    /* JADX INFO: renamed from: i */
    public void m149865i(String str) {
        this.f126962b.setText(str);
        this.f126962b.setSelection(TextUtils.isEmpty(str) ? 0 : str.length());
        this.f126962b.setHint(String.format("最多输入%d个字符", 50));
        this.f126962b.setFocusable(true);
        this.f126962b.setFocusableInTouchMode(true);
        m149866j(this.f126962b);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (this.f126961a == null) {
            m149863c(layoutInflater, viewGroup);
            this.f126962b.setFilters(new InputFilter[]{this.f126966f});
            this.f126963c.setOnClickListener(new View.OnClickListener() { // from class: l.ji40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f121042a.m149862f(view);
                }
            });
        }
        return this.f126961a;
    }

    /* JADX INFO: renamed from: j */
    public final void m149866j(EditText editText) {
        editText.requestFocus();
        ((InputMethodManager) this.f126965e.getSystemService("input_method")).showSoftInput(editText, 1);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
