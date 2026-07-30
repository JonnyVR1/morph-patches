package p149l;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Act;

/* JADX INFO: loaded from: classes10.dex */
public abstract class xwf extends Dialog {

    /* JADX INFO: renamed from: a */
    public Act f194731a;

    /* JADX INFO: renamed from: b */
    public cwf0 f194732b;

    public xwf(@NonNull Act act) {
        super(act, v7c0.f180374u);
        this.f194731a = act;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m211326a(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        return i == 4;
    }

    /* JADX INFO: renamed from: b */
    public int m211327b() {
        return v7c0.f180355b;
    }

    /* JADX INFO: renamed from: c */
    public abstract int mo128579c();

    /* JADX INFO: renamed from: d */
    public float mo128580d() {
        return 0.0f;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        cwf0 cwf0Var = this.f194732b;
        if (cwf0Var != null) {
            i0e.m133796e(cwf0Var);
        }
    }

    /* JADX INFO: renamed from: e */
    public float m211328e() {
        return 0.0f;
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo128581f();

    /* JADX INFO: renamed from: g */
    public void m211329g() {
        getWindow().setNavigationBarColor(getContext().getResources().getColor(w0c0.f183834b2));
        if (Build.VERSION.SDK_INT >= 26) {
            getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() & (-17));
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m211330h() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindow().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        if (mo128580d() > 0.0f) {
            attributes.height = (int) (displayMetrics.heightPixels * mo128580d());
        }
        if (m211328e() > 0.0f) {
            attributes.width = (int) (displayMetrics.widthPixels * m211328e());
        }
        getWindow().setAttributes(attributes);
        getWindow().setWindowAnimations(m211327b());
        getWindow().setGravity(mo128579c());
        getWindow().setStatusBarColor(getContext().getResources().getColor(w0c0.f183811U1));
    }

    /* JADX INFO: renamed from: i */
    public abstract int mo128582i();

    /* JADX INFO: renamed from: j */
    public boolean m211331j() {
        return false;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(mo128582i());
        m211330h();
        mo128581f();
        if (m211331j()) {
            setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: l.wwf
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    return xwf.m211326a(dialogInterface, i, keyEvent);
                }
            });
        }
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        cwf0 cwf0Var = this.f194732b;
        if (cwf0Var != null) {
            i0e.m133797f(cwf0Var);
        }
    }
}
