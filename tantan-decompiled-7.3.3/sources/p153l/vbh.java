package p153l;

import android.widget.TextView;

/* JADX INFO: loaded from: classes13.dex */
public abstract class vbh implements zxh<TextView> {

    /* JADX INFO: renamed from: a */
    public TextView f183250a;

    /* JADX INFO: renamed from: b */
    public int f183251b;

    @Override // p153l.zxh
    /* JADX INFO: renamed from: b */
    public void mo200709b() {
        m200714h(mo121367a());
    }

    @Override // p153l.zxh
    /* JADX INFO: renamed from: c */
    public void mo200710c(int i) {
        if (i == -1) {
            this.f183251b++;
        } else if (i == -2) {
            this.f183251b--;
        }
        m200714h(this.f183251b);
    }

    @Override // p153l.zxh
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo200711d(TextView textView) {
        this.f183250a = textView;
        mo200709b();
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m200713g() {
        TextView textView = this.f183250a;
        bnl0.m105539W(textView, (-textView.getWidth()) + qa00.m175859d(6.0f));
    }

    /* JADX INFO: renamed from: h */
    public final void m200714h(int i) {
        this.f183251b = i;
        TextView textView = this.f183250a;
        if (i <= 0) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        this.f183250a.setText(i > 99 ? "99+" : String.valueOf(i));
        this.f183250a.post(new Runnable() { // from class: l.ubh
            @Override // java.lang.Runnable
            public final void run() {
                this.f178308a.m200713g();
            }
        });
    }
}
