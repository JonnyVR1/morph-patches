package p003l;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.p1.mobile.android.app.Act;
import l.a1c0;
import l.cwf0;
import l.i0e;
import l.x7c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class e4z extends Dialog {

    /* JADX INFO: renamed from: a */
    public Act f3203a;

    /* JADX INFO: renamed from: b */
    public cwf0 f3204b;

    public e4z(@NonNull Act act) {
        super(act, x7c0.k);
        this.f3203a = act;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m3788a(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        return i == 4;
    }

    /* JADX INFO: renamed from: b */
    public int m3789b() {
        return x7c0.f;
    }

    /* JADX INFO: renamed from: c */
    public abstract int mo3790c();

    /* JADX INFO: renamed from: d */
    public float m3791d() {
        return 0.0f;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        cwf0 cwf0Var = this.f3204b;
        if (cwf0Var != null) {
            i0e.e(cwf0Var);
        }
    }

    /* JADX INFO: renamed from: e */
    public float m3792e() {
        return 0.0f;
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo3793f();

    /* JADX INFO: renamed from: g */
    public final void m3794g() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindow().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        if (m3791d() > 0.0f) {
            attributes.height = (int) (displayMetrics.heightPixels * m3791d());
        }
        if (m3792e() > 0.0f) {
            attributes.width = (int) (displayMetrics.widthPixels * m3792e());
        }
        getWindow().setAttributes(attributes);
        getWindow().setWindowAnimations(m3789b());
        getWindow().setGravity(mo3790c());
        getWindow().setStatusBarColor(getContext().getResources().getColor(a1c0.Y));
    }

    /* JADX INFO: renamed from: h */
    public abstract int mo3795h();

    /* JADX INFO: renamed from: i */
    public boolean m3796i() {
        return false;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(mo3795h());
        m3794g();
        mo3793f();
        if (m3796i()) {
            setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: l.d4z
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    return e4z.m3788a(dialogInterface, i, keyEvent);
                }
            });
        }
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        cwf0 cwf0Var = this.f3204b;
        if (cwf0Var != null) {
            i0e.f(cwf0Var);
        }
    }
}
