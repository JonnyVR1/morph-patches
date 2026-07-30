package p149l;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Act;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e4z extends Dialog {

    /* JADX INFO: renamed from: a */
    public Act f89333a;

    /* JADX INFO: renamed from: b */
    public cwf0 f89334b;

    public e4z(@NonNull Act act) {
        super(act, x7c0.f191342k);
        this.f89333a = act;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m114725a(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        return i == 4;
    }

    /* JADX INFO: renamed from: b */
    public int m114726b() {
        return x7c0.f191337f;
    }

    /* JADX INFO: renamed from: c */
    public abstract int mo114727c();

    /* JADX INFO: renamed from: d */
    public float m114728d() {
        return 0.0f;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        cwf0 cwf0Var = this.f89334b;
        if (cwf0Var != null) {
            i0e.m133796e(cwf0Var);
        }
    }

    /* JADX INFO: renamed from: e */
    public float m114729e() {
        return 0.0f;
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo114730f();

    /* JADX INFO: renamed from: g */
    public final void m114731g() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindow().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        if (m114728d() > 0.0f) {
            attributes.height = (int) (displayMetrics.heightPixels * m114728d());
        }
        if (m114729e() > 0.0f) {
            attributes.width = (int) (displayMetrics.widthPixels * m114729e());
        }
        getWindow().setAttributes(attributes);
        getWindow().setWindowAnimations(m114726b());
        getWindow().setGravity(mo114727c());
        getWindow().setStatusBarColor(getContext().getResources().getColor(a1c0.f67143Y));
    }

    /* JADX INFO: renamed from: h */
    public abstract int mo114732h();

    /* JADX INFO: renamed from: i */
    public boolean m114733i() {
        return false;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(mo114732h());
        m114731g();
        mo114730f();
        if (m114733i()) {
            setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: l.d4z
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    return e4z.m114725a(dialogInterface, i, keyEvent);
                }
            });
        }
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        cwf0 cwf0Var = this.f89334b;
        if (cwf0Var != null) {
            i0e.m133797f(cwf0Var);
        }
    }
}
