package p003l;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.p1.mobile.android.app.Act;
import l.cwf0;
import l.i0e;
import l.v7c0;
import l.w0c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public abstract class xwf extends Dialog {

    /* JADX INFO: renamed from: a */
    public Act f8582a;

    /* JADX INFO: renamed from: b */
    public cwf0 f8583b;

    public xwf(@NonNull Act act) {
        super(act, v7c0.u);
        this.f8582a = act;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m10964a(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        return i == 4;
    }

    /* JADX INFO: renamed from: b */
    public int m10965b() {
        return v7c0.b;
    }

    /* JADX INFO: renamed from: c */
    public abstract int mo6858c();

    /* JADX INFO: renamed from: d */
    public float mo6859d() {
        return 0.0f;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        cwf0 cwf0Var = this.f8583b;
        if (cwf0Var != null) {
            i0e.e(cwf0Var);
        }
    }

    /* JADX INFO: renamed from: e */
    public float m10966e() {
        return 0.0f;
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo6860f();

    /* JADX INFO: renamed from: g */
    public void m10967g() {
        getWindow().setNavigationBarColor(getContext().getResources().getColor(w0c0.b2));
        if (Build.VERSION.SDK_INT >= 26) {
            getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() & (-17));
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m10968h() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindow().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        if (mo6859d() > 0.0f) {
            attributes.height = (int) (displayMetrics.heightPixels * mo6859d());
        }
        if (m10966e() > 0.0f) {
            attributes.width = (int) (displayMetrics.widthPixels * m10966e());
        }
        getWindow().setAttributes(attributes);
        getWindow().setWindowAnimations(m10965b());
        getWindow().setGravity(mo6858c());
        getWindow().setStatusBarColor(getContext().getResources().getColor(w0c0.U1));
    }

    /* JADX INFO: renamed from: i */
    public abstract int mo6861i();

    /* JADX INFO: renamed from: j */
    public boolean m10969j() {
        return false;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(mo6861i());
        m10968h();
        mo6860f();
        if (m10969j()) {
            setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: l.wwf
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    return xwf.m10964a(dialogInterface, i, keyEvent);
                }
            });
        }
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        cwf0 cwf0Var = this.f8583b;
        if (cwf0Var != null) {
            i0e.f(cwf0Var);
        }
    }
}
