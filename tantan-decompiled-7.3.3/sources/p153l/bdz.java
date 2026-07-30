package p153l;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Act;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bdz extends Dialog {

    /* JADX INFO: renamed from: a */
    public Act f76320a;

    /* JADX INFO: renamed from: b */
    public l4g0 f76321b;

    public bdz(@NonNull Act act) {
        super(act, cgc0.f81655k);
        this.f76320a = act;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m103665a(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        return i == 4;
    }

    /* JADX INFO: renamed from: b */
    public int m103666b() {
        return cgc0.f81650f;
    }

    /* JADX INFO: renamed from: c */
    public abstract int mo103667c();

    /* JADX INFO: renamed from: d */
    public float m103668d() {
        return 0.0f;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        l4g0 l4g0Var = this.f76321b;
        if (l4g0Var != null) {
            w1e.m204401e(l4g0Var);
        }
    }

    /* JADX INFO: renamed from: e */
    public float m103669e() {
        return 0.0f;
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo103670f();

    /* JADX INFO: renamed from: g */
    public final void m103671g() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindow().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        if (m103668d() > 0.0f) {
            attributes.height = (int) (displayMetrics.heightPixels * m103668d());
        }
        if (m103669e() > 0.0f) {
            attributes.width = (int) (displayMetrics.widthPixels * m103669e());
        }
        getWindow().setAttributes(attributes);
        getWindow().setWindowAnimations(m103666b());
        getWindow().setGravity(mo103667c());
        getWindow().setStatusBarColor(getContext().getResources().getColor(g9c0.f102807Y));
    }

    /* JADX INFO: renamed from: h */
    public abstract int mo103672h();

    /* JADX INFO: renamed from: i */
    public boolean m103673i() {
        return false;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(mo103672h());
        m103671g();
        mo103670f();
        if (m103673i()) {
            setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: l.adz
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    return bdz.m103665a(dialogInterface, i, keyEvent);
                }
            });
        }
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        l4g0 l4g0Var = this.f76321b;
        if (l4g0Var != null) {
            w1e.m204402f(l4g0Var);
        }
    }
}
