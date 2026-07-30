package p007l;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import l.xdl0;
import v.VButton;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class xvg extends Dialog {

    /* JADX INFO: renamed from: a */
    public VText f15159a;

    /* JADX INFO: renamed from: b */
    public VText f15160b;

    /* JADX INFO: renamed from: c */
    public VButton f15161c;

    /* JADX INFO: renamed from: d */
    public VButton f15162d;

    /* JADX INFO: renamed from: e */
    public Runnable f15163e;

    /* JADX INFO: renamed from: f */
    public Runnable f15164f;

    /* JADX INFO: renamed from: g */
    public Act f15165g;

    public xvg(@NonNull Context context, int i) {
        super(context, i);
        setContentView(o6c0.f11242k0);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        attributes.gravity = 17;
        getWindow().setAttributes(attributes);
        this.f15159a = findViewById(b5c0.f5971J);
        this.f15160b = findViewById(b5c0.f5968I);
        this.f15161c = findViewById(b5c0.f6066l);
        this.f15162d = findViewById(b5c0.f6069m);
        xdl0.E0(this.f15161c, new View.OnClickListener() { // from class: l.vvg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14311a.m16859e(view);
            }
        });
        xdl0.E0(this.f15162d, new View.OnClickListener() { // from class: l.wvg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14694a.m16860f(view);
            }
        });
        if (context instanceof Act) {
            this.f15165g = (Act) context;
        }
    }

    /* JADX INFO: renamed from: c */
    public xvg m16857c(boolean z) {
        setCancelable(z);
        return this;
    }

    /* JADX INFO: renamed from: d */
    public xvg m16858d(int i) {
        this.f15160b.setText(i);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m16859e(View view) {
        if (NullChecker.a(this.f15163e)) {
            this.f15163e.run();
        }
        dismiss();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m16860f(View view) {
        if (NullChecker.a(this.f15164f)) {
            this.f15164f.run();
        }
        dismiss();
    }

    /* JADX INFO: renamed from: g */
    public xvg m16861g(int i) {
        this.f15161c.setVisibility(0);
        this.f15161c.setText(i);
        this.f15163e = null;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public xvg m16862h(int i, Runnable runnable) {
        this.f15161c.setVisibility(0);
        this.f15161c.setText(i);
        this.f15163e = runnable;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public xvg m16863i(int i, Runnable runnable) {
        this.f15162d.setVisibility(0);
        this.f15162d.setText(i);
        this.f15164f = runnable;
        return this;
    }

    /* JADX INFO: renamed from: j */
    public xvg m16864j(int i) {
        this.f15159a.setText(i);
        this.f15159a.setVisibility(0);
        return this;
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
    }

    public xvg(@NonNull Context context) {
        this(context, a8c0.f5632a);
    }
}
