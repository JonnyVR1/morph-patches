package p007l;

import android.widget.TextView;
import l.t100;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public abstract class gah implements kwh<TextView> {

    /* JADX INFO: renamed from: a */
    public TextView f8409a;

    /* JADX INFO: renamed from: b */
    public int f8410b;

    @Override // p007l.kwh
    /* JADX INFO: renamed from: b */
    public void mo10430b() {
        m10435h(mo11530a());
    }

    @Override // p007l.kwh
    /* JADX INFO: renamed from: c */
    public void mo10431c(int i) {
        if (i == -1) {
            this.f8410b++;
        } else if (i == -2) {
            this.f8410b--;
        }
        m10435h(this.f8410b);
    }

    @Override // p007l.kwh
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo10432d(TextView textView) {
        this.f8409a = textView;
        mo10430b();
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m10434g() {
        TextView textView = this.f8409a;
        xdl0.W(textView, (-textView.getWidth()) + t100.d(6.0f));
    }

    /* JADX INFO: renamed from: h */
    public final void m10435h(int i) {
        this.f8410b = i;
        TextView textView = this.f8409a;
        if (i <= 0) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        this.f8409a.setText(i > 99 ? "99+" : String.valueOf(i));
        this.f8409a.post(new Runnable() { // from class: l.fah
            @Override // java.lang.Runnable
            public final void run() {
                this.f8055a.m10434g();
            }
        });
    }
}
