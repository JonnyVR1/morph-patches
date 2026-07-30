package p149l;

import android.graphics.Color;
import android.view.View;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
public class yhh implements czl {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f198344a;

    /* JADX INFO: renamed from: b */
    public Act f198345b;

    /* JADX INFO: renamed from: c */
    public int f198346c;

    /* JADX INFO: renamed from: d */
    public TextView f198347d;

    /* JADX INFO: renamed from: e */
    public int f198348e;

    public yhh(VNavigationBar vNavigationBar, Act act) {
        this.f198344a = vNavigationBar;
        this.f198345b = act;
    }

    @Override // p149l.czl
    /* JADX INFO: renamed from: a */
    public void mo109424a(int i, int i2) {
        m214823h();
        mo109426d(i, i2);
    }

    @Override // p149l.atl
    /* JADX INFO: renamed from: b */
    public void mo98833b(int i) {
        mo109426d(this.f198346c, i + 1);
    }

    @Override // p149l.czl
    /* JADX INFO: renamed from: c */
    public int mo109425c() {
        return this.f198348e;
    }

    @Override // p149l.czl
    /* JADX INFO: renamed from: d */
    public void mo109426d(int i, int i2) {
        m214821f();
        if (i == -1 && i2 == -1) {
            this.f198347d.setText("");
            return;
        }
        m214821f();
        if (i2 == -1) {
            i2 = this.f198348e;
        }
        if (i == -1) {
            i = this.f198346c;
        }
        int iMax = Math.max(1, i2);
        int iMax2 = Math.max(1, i);
        if (iMax2 < iMax) {
            iMax = iMax2;
        }
        this.f198347d.setText(String.format("%d/%d", Integer.valueOf(iMax), Integer.valueOf(iMax2)));
        this.f198346c = iMax2;
        this.f198348e = iMax;
    }

    /* JADX INFO: renamed from: f */
    public final void m214821f() {
        if (this.f198347d != null) {
            return;
        }
        TextView textView = new TextView(this.f198345b);
        this.f198347d = textView;
        textView.setTextSize(15.0f);
        this.f198347d.setTextColor(Color.parseColor("#80000000"));
        this.f198347d.setPadding(0, 0, t100.m186890d(8.0f), 0);
        this.f198344a.setRightIconViews(this.f198347d);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m214822g(View view) {
        this.f198345b.lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: h */
    public void m214823h() {
        this.f198344a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.xhh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f192890a.m214822g(view);
            }
        });
        this.f198344a.setLeftIconResource(f3c0.f94544j);
        this.f198344a.setTitle("对你感兴趣的人");
    }
}
