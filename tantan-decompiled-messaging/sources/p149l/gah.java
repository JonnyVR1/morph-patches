package p149l;

import android.widget.TextView;

/* JADX INFO: loaded from: classes12.dex */
public abstract class gah implements kwh<TextView> {

    /* JADX INFO: renamed from: a */
    public TextView f101673a;

    /* JADX INFO: renamed from: b */
    public int f101674b;

    @Override // p149l.kwh
    /* JADX INFO: renamed from: b */
    public void mo124941b() {
        m124946h(mo147545a());
    }

    @Override // p149l.kwh
    /* JADX INFO: renamed from: c */
    public void mo124942c(int i) {
        if (i == -1) {
            this.f101674b++;
        } else if (i == -2) {
            this.f101674b--;
        }
        m124946h(this.f101674b);
    }

    @Override // p149l.kwh
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo124943d(TextView textView) {
        this.f101673a = textView;
        mo124941b();
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m124945g() {
        TextView textView = this.f101673a;
        xdl0.m208359W(textView, (-textView.getWidth()) + t100.m186890d(6.0f));
    }

    /* JADX INFO: renamed from: h */
    public final void m124946h(int i) {
        this.f101674b = i;
        TextView textView = this.f101673a;
        if (i <= 0) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        this.f101673a.setText(i > 99 ? "99+" : String.valueOf(i));
        this.f101673a.post(new Runnable() { // from class: l.fah
            @Override // java.lang.Runnable
            public final void run() {
                this.f96602a.m124945g();
            }
        });
    }
}
