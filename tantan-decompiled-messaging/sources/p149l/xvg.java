package p149l;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import p147v.VButton;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class xvg extends Dialog {

    /* JADX INFO: renamed from: a */
    public VText f194632a;

    /* JADX INFO: renamed from: b */
    public VText f194633b;

    /* JADX INFO: renamed from: c */
    public VButton f194634c;

    /* JADX INFO: renamed from: d */
    public VButton f194635d;

    /* JADX INFO: renamed from: e */
    public Runnable f194636e;

    /* JADX INFO: renamed from: f */
    public Runnable f194637f;

    /* JADX INFO: renamed from: g */
    public Act f194638g;

    public xvg(@NonNull Context context, int i) {
        super(context, i);
        setContentView(o6c0.f142223k0);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        attributes.gravity = 17;
        getWindow().setAttributes(attributes);
        this.f194632a = (VText) findViewById(b5c0.f73490J);
        this.f194633b = (VText) findViewById(b5c0.f73487I);
        this.f194634c = (VButton) findViewById(b5c0.f73585l);
        this.f194635d = (VButton) findViewById(b5c0.f73588m);
        xdl0.m208329E0(this.f194634c, new View.OnClickListener() { // from class: l.vvg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f183227a.m211286e(view);
            }
        });
        xdl0.m208329E0(this.f194635d, new View.OnClickListener() { // from class: l.wvg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f188251a.m211287f(view);
            }
        });
        if (context instanceof Act) {
            this.f194638g = (Act) context;
        }
    }

    /* JADX INFO: renamed from: c */
    public xvg m211284c(boolean z) {
        setCancelable(z);
        return this;
    }

    /* JADX INFO: renamed from: d */
    public xvg m211285d(int i) {
        this.f194633b.setText(i);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m211286e(View view) {
        if (NullChecker.m81303a(this.f194636e)) {
            this.f194636e.run();
        }
        dismiss();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m211287f(View view) {
        if (NullChecker.m81303a(this.f194637f)) {
            this.f194637f.run();
        }
        dismiss();
    }

    /* JADX INFO: renamed from: g */
    public xvg m211288g(int i) {
        this.f194634c.setVisibility(0);
        this.f194634c.setText(i);
        this.f194636e = null;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public xvg m211289h(int i, Runnable runnable) {
        this.f194634c.setVisibility(0);
        this.f194634c.setText(i);
        this.f194636e = runnable;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public xvg m211290i(int i, Runnable runnable) {
        this.f194635d.setVisibility(0);
        this.f194635d.setText(i);
        this.f194637f = runnable;
        return this;
    }

    /* JADX INFO: renamed from: j */
    public xvg m211291j(int i) {
        this.f194632a.setText(i);
        this.f194632a.setVisibility(0);
        return this;
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
    }

    public xvg(@NonNull Context context) {
        this(context, a8c0.f68012a);
    }
}
