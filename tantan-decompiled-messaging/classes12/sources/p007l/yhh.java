package p007l;

import android.graphics.Color;
import android.view.View;
import android.widget.TextView;
import com.p1.mobile.android.app.Act;
import l.t100;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class yhh implements czl {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f15432a;

    /* JADX INFO: renamed from: b */
    public Act f15433b;

    /* JADX INFO: renamed from: c */
    public int f15434c;

    /* JADX INFO: renamed from: d */
    public TextView f15435d;

    /* JADX INFO: renamed from: e */
    public int f15436e;

    public yhh(VNavigationBar vNavigationBar, Act act) {
        this.f15432a = vNavigationBar;
        this.f15433b = act;
    }

    @Override // p007l.czl
    /* JADX INFO: renamed from: a */
    public void mo9265a(int i, int i2) {
        m17133h();
        mo9267d(i, i2);
    }

    @Override // p007l.atl
    /* JADX INFO: renamed from: b */
    public void mo8595b(int i) {
        mo9267d(this.f15434c, i + 1);
    }

    @Override // p007l.czl
    /* JADX INFO: renamed from: c */
    public int mo9266c() {
        return this.f15436e;
    }

    @Override // p007l.czl
    /* JADX INFO: renamed from: d */
    public void mo9267d(int i, int i2) {
        m17131f();
        if (i == -1 && i2 == -1) {
            this.f15435d.setText("");
            return;
        }
        m17131f();
        if (i2 == -1) {
            i2 = this.f15436e;
        }
        if (i == -1) {
            i = this.f15434c;
        }
        int iMax = Math.max(1, i2);
        int iMax2 = Math.max(1, i);
        if (iMax2 < iMax) {
            iMax = iMax2;
        }
        this.f15435d.setText(String.format("%d/%d", Integer.valueOf(iMax), Integer.valueOf(iMax2)));
        this.f15434c = iMax2;
        this.f15436e = iMax;
    }

    /* JADX INFO: renamed from: f */
    public final void m17131f() {
        if (this.f15435d != null) {
            return;
        }
        TextView textView = new TextView(this.f15433b);
        this.f15435d = textView;
        textView.setTextSize(15.0f);
        this.f15435d.setTextColor(Color.parseColor("#80000000"));
        this.f15435d.setPadding(0, 0, t100.d(8.0f), 0);
        this.f15432a.setRightIconViews(new View[]{this.f15435d});
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m17132g(View view) {
        this.f15433b.finish();
    }

    /* JADX INFO: renamed from: h */
    public void m17133h() {
        this.f15432a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.xhh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14905a.m17132g(view);
            }
        });
        this.f15432a.setLeftIconResource(f3c0.f7827j);
        this.f15432a.setTitle("对你感兴趣的人");
    }
}
