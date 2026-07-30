package p002l;

import android.view.KeyEvent;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p1.mobile.android.app.Act;
import l.ed80;
import l.l6c0;
import l.t100;
import l.xdl0;
import l.y4c0;
import v.VEditText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class u9m extends PopupWindow {

    /* JADX INFO: renamed from: c */
    public static final int f20558c = t100.d(44.0f);

    /* JADX INFO: renamed from: a */
    public final VEditText f20559a;

    /* JADX INFO: renamed from: b */
    public final Act f20560b;

    public u9m(Act act) {
        super(View.inflate(act, l6c0.H0, null), xdl0.y0(), f20558c);
        this.f20560b = act;
        VEditText vEditTextFindViewById = getContentView().findViewById(y4c0.E0);
        this.f20559a = vEditTextFindViewById;
        setFocusable(true);
        setOutsideTouchable(true);
        setTouchable(true);
        vEditTextFindViewById.setImeOptions(6);
        vEditTextFindViewById.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: l.t9m
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return this.f20140a.m23393e(textView, i, keyEvent);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public void m23391c() {
        this.f20559a.clearFocus();
    }

    /* JADX INFO: renamed from: d */
    public CharSequence m23392d() {
        return this.f20559a.getText();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean m23393e(TextView textView, int i, KeyEvent keyEvent) {
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
    public final /* synthetic */ void m23394f() {
        this.f20559a.setFocusable(true);
        this.f20559a.requestFocus();
        this.f20560b.showInput(this.f20559a, 0);
    }

    /* JADX INFO: renamed from: g */
    public void m23395g(@NonNull View view) {
        if (isShowing()) {
            return;
        }
        ed80.c(this, view, 0, -f20558c, 48);
        this.f20559a.postDelayed(new Runnable() { // from class: l.s9m
            @Override // java.lang.Runnable
            public final void run() {
                this.f18851a.m23394f();
            }
        }, 40L);
    }
}
