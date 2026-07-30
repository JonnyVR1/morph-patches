package p153l;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Act;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lyf extends Dialog {

    /* JADX INFO: renamed from: a */
    public Act f134054a;

    /* JADX INFO: renamed from: b */
    public l4g0 f134055b;

    public lyf(@NonNull Act act) {
        super(act, agc0.f71135u);
        this.f134054a = act;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m156271a(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        return i == 4;
    }

    /* JADX INFO: renamed from: b */
    public int m156272b() {
        return agc0.f71116b;
    }

    /* JADX INFO: renamed from: c */
    public abstract int mo156273c();

    /* JADX INFO: renamed from: d */
    public float mo156274d() {
        return 0.0f;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        l4g0 l4g0Var = this.f134055b;
        if (l4g0Var != null) {
            w1e.m204401e(l4g0Var);
        }
    }

    /* JADX INFO: renamed from: e */
    public float m156275e() {
        return 0.0f;
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo156276f();

    /* JADX INFO: renamed from: g */
    public void m156277g() {
        getWindow().setNavigationBarColor(getContext().getResources().getColor(c9c0.f80407c2));
        if (Build.VERSION.SDK_INT >= 26) {
            getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() & (-17));
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m156278h() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindow().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        if (mo156274d() > 0.0f) {
            attributes.height = (int) (displayMetrics.heightPixels * mo156274d());
        }
        if (m156275e() > 0.0f) {
            attributes.width = (int) (displayMetrics.widthPixels * m156275e());
        }
        getWindow().setAttributes(attributes);
        getWindow().setWindowAnimations(m156272b());
        getWindow().setGravity(mo156273c());
        getWindow().setStatusBarColor(getContext().getResources().getColor(c9c0.f80383V1));
    }

    /* JADX INFO: renamed from: i */
    public abstract int mo156279i();

    /* JADX INFO: renamed from: j */
    public boolean m156280j() {
        return false;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(mo156279i());
        m156278h();
        mo156276f();
        if (m156280j()) {
            setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: l.kyf
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    return lyf.m156271a(dialogInterface, i, keyEvent);
                }
            });
        }
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        l4g0 l4g0Var = this.f134055b;
        if (l4g0Var != null) {
            w1e.m204402f(l4g0Var);
        }
    }
}
