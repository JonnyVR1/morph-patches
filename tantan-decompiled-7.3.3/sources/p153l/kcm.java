package p153l;

import android.view.KeyEvent;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Act;
import p151v.VEditText;

/* JADX INFO: loaded from: classes4.dex */
public class kcm extends PopupWindow {

    /* JADX INFO: renamed from: c */
    public static final int f125075c = qa00.m175859d(44.0f);

    /* JADX INFO: renamed from: a */
    public final VEditText f125076a;

    /* JADX INFO: renamed from: b */
    public final Act f125077b;

    public kcm(Act act) {
        super(View.inflate(act, qec0.f156861H0, null), bnl0.m105592y0(), f125075c);
        this.f125077b = act;
        VEditText vEditText = (VEditText) getContentView().findViewById(edc0.f93191E0);
        this.f125076a = vEditText;
        setFocusable(true);
        setOutsideTouchable(true);
        setTouchable(true);
        vEditText.setImeOptions(6);
        vEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: l.jcm
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return this.f120077a.m149120e(textView, i, keyEvent);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public void m149118c() {
        this.f125076a.clearFocus();
    }

    /* JADX INFO: renamed from: d */
    public CharSequence m149119d() {
        return this.f125076a.getText();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean m149120e(TextView textView, int i, KeyEvent keyEvent) {
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
    public final /* synthetic */ void m149121f() {
        this.f125076a.setFocusable(true);
        this.f125076a.requestFocus();
        this.f125077b.showInput(this.f125076a, 0);
    }

    /* JADX INFO: renamed from: g */
    public void m149122g(@NonNull View view) {
        if (isShowing()) {
            return;
        }
        kl80.m150358c(this, view, 0, -f125075c, 48);
        this.f125076a.postDelayed(new Runnable() { // from class: l.icm
            @Override // java.lang.Runnable
            public final void run() {
                this.f114419a.m149121f();
            }
        }, 40L);
    }
}
