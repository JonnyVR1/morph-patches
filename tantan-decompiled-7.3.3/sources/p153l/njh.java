package p153l;

import android.graphics.Color;
import android.view.View;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
public class njh implements x1m {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f142293a;

    /* JADX INFO: renamed from: b */
    public Act f142294b;

    /* JADX INFO: renamed from: c */
    public int f142295c;

    /* JADX INFO: renamed from: d */
    public TextView f142296d;

    /* JADX INFO: renamed from: e */
    public int f142297e;

    public njh(VNavigationBar vNavigationBar, Act act) {
        this.f142293a = vNavigationBar;
        this.f142294b = act;
    }

    @Override // p153l.x1m
    /* JADX INFO: renamed from: a */
    public void mo163413a(int i, int i2) {
        m163419h();
        mo163416d(i, i2);
    }

    @Override // p153l.ovl
    /* JADX INFO: renamed from: b */
    public void mo163414b(int i) {
        mo163416d(this.f142295c, i + 1);
    }

    @Override // p153l.x1m
    /* JADX INFO: renamed from: c */
    public int mo163415c() {
        return this.f142297e;
    }

    @Override // p153l.x1m
    /* JADX INFO: renamed from: d */
    public void mo163416d(int i, int i2) {
        m163417f();
        if (i == -1 && i2 == -1) {
            this.f142296d.setText("");
            return;
        }
        m163417f();
        if (i2 == -1) {
            i2 = this.f142297e;
        }
        if (i == -1) {
            i = this.f142295c;
        }
        int iMax = Math.max(1, i2);
        int iMax2 = Math.max(1, i);
        if (iMax2 < iMax) {
            iMax = iMax2;
        }
        this.f142296d.setText(String.format("%d/%d", Integer.valueOf(iMax), Integer.valueOf(iMax2)));
        this.f142295c = iMax2;
        this.f142297e = iMax;
    }

    /* JADX INFO: renamed from: f */
    public final void m163417f() {
        if (this.f142296d != null) {
            return;
        }
        TextView textView = new TextView(this.f142294b);
        this.f142296d = textView;
        textView.setTextSize(15.0f);
        this.f142296d.setTextColor(Color.parseColor("#80000000"));
        this.f142296d.setPadding(0, 0, qa00.m175859d(8.0f), 0);
        this.f142293a.setRightIconViews(this.f142296d);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m163418g(View view) {
        this.f142294b.lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: h */
    public void m163419h() {
        this.f142293a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.mjh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f137075a.m163418g(view);
            }
        });
        this.f142293a.setLeftIconResource(lbc0.f131062j);
        this.f142293a.setTitle("对你感兴趣的人");
    }
}
