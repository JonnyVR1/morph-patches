package p153l;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import p151v.VButton;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class mxg extends Dialog {

    /* JADX INFO: renamed from: a */
    public VText f139233a;

    /* JADX INFO: renamed from: b */
    public VText f139234b;

    /* JADX INFO: renamed from: c */
    public VButton f139235c;

    /* JADX INFO: renamed from: d */
    public VButton f139236d;

    /* JADX INFO: renamed from: e */
    public Runnable f139237e;

    /* JADX INFO: renamed from: f */
    public Runnable f139238f;

    /* JADX INFO: renamed from: g */
    public Act f139239g;

    public mxg(@NonNull Context context, int i) {
        super(context, i);
        setContentView(tec0.f173692k0);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        attributes.gravity = 17;
        getWindow().setAttributes(attributes);
        this.f139233a = (VText) findViewById(hdc0.f108843J);
        this.f139234b = (VText) findViewById(hdc0.f108840I);
        this.f139235c = (VButton) findViewById(hdc0.f108938l);
        this.f139236d = (VButton) findViewById(hdc0.f108941m);
        bnl0.m105509E0(this.f139235c, new View.OnClickListener() { // from class: l.kxg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f129204a.m160663e(view);
            }
        });
        bnl0.m105509E0(this.f139236d, new View.OnClickListener() { // from class: l.lxg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f133954a.m160664f(view);
            }
        });
        if (context instanceof Act) {
            this.f139239g = (Act) context;
        }
    }

    /* JADX INFO: renamed from: c */
    public mxg m160661c(boolean z) {
        setCancelable(z);
        return this;
    }

    /* JADX INFO: renamed from: d */
    public mxg m160662d(int i) {
        this.f139234b.setText(i);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m160663e(View view) {
        if (NullChecker.m82486a(this.f139237e)) {
            this.f139237e.run();
        }
        dismiss();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m160664f(View view) {
        if (NullChecker.m82486a(this.f139238f)) {
            this.f139238f.run();
        }
        dismiss();
    }

    /* JADX INFO: renamed from: g */
    public mxg m160665g(int i) {
        this.f139235c.setVisibility(0);
        this.f139235c.setText(i);
        this.f139237e = null;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public mxg m160666h(int i, Runnable runnable) {
        this.f139235c.setVisibility(0);
        this.f139235c.setText(i);
        this.f139237e = runnable;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public mxg m160667i(int i, Runnable runnable) {
        this.f139236d.setVisibility(0);
        this.f139236d.setText(i);
        this.f139238f = runnable;
        return this;
    }

    /* JADX INFO: renamed from: j */
    public mxg m160668j(int i) {
        this.f139233a.setText(i);
        this.f139233a.setVisibility(0);
        return this;
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
    }

    public mxg(@NonNull Context context) {
        this(context, fgc0.f98898a);
    }
}
