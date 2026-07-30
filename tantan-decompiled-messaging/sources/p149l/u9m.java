package p149l;

import android.view.KeyEvent;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Act;
import p147v.VEditText;

/* JADX INFO: loaded from: classes4.dex */
public class u9m extends PopupWindow {

    /* JADX INFO: renamed from: c */
    public static final int f175466c = t100.m186890d(44.0f);

    /* JADX INFO: renamed from: a */
    public final VEditText f175467a;

    /* JADX INFO: renamed from: b */
    public final Act f175468b;

    public u9m(Act act) {
        super(View.inflate(act, l6c0.f126305H0, null), xdl0.m208412y0(), f175466c);
        this.f175468b = act;
        VEditText vEditText = (VEditText) getContentView().findViewById(y4c0.f195956E0);
        this.f175467a = vEditText;
        setFocusable(true);
        setOutsideTouchable(true);
        setTouchable(true);
        vEditText.setImeOptions(6);
        vEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: l.t9m
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return this.f169039a.m192566e(textView, i, keyEvent);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public void m192564c() {
        this.f175467a.clearFocus();
    }

    /* JADX INFO: renamed from: d */
    public CharSequence m192565d() {
        return this.f175467a.getText();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean m192566e(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        if (!isShowing()) {
            return true;
        }
        dismiss();
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m192567f() {
        this.f175467a.setFocusable(true);
        this.f175467a.requestFocus();
        this.f175468b.showInput(this.f175467a, 0);
    }

    /* JADX INFO: renamed from: g */
    public void m192568g(@NonNull View view) {
        if (isShowing()) {
            return;
        }
        ed80.m115791c(this, view, 0, -f175466c, 48);
        this.f175467a.postDelayed(new Runnable() { // from class: l.s9m
            @Override // java.lang.Runnable
            public final void run() {
                this.f163198a.m192567f();
            }
        }, 40L);
    }
}
