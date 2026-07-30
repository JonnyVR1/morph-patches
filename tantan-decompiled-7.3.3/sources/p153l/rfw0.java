package p153l;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class rfw0 implements ufw0 {

    /* JADX INFO: renamed from: f */
    public static final rfw0 f162880f = new rfw0(new vfw0());

    /* JADX INFO: renamed from: a */
    public final sgw0 f162881a = new sgw0();

    /* JADX INFO: renamed from: b */
    public Date f162882b;

    /* JADX INFO: renamed from: c */
    public boolean f162883c;

    /* JADX INFO: renamed from: d */
    public final vfw0 f162884d;

    /* JADX INFO: renamed from: e */
    public boolean f162885e;

    public rfw0(vfw0 vfw0Var) {
        this.f162884d = vfw0Var;
    }

    /* JADX INFO: renamed from: b */
    public static rfw0 m181309b() {
        return f162880f;
    }

    @Override // p153l.ufw0
    /* JADX INFO: renamed from: a */
    public final void mo120811a(boolean z) {
        if (!this.f162885e && z) {
            Date date = new Date();
            Date date2 = this.f162882b;
            if (date2 == null || date.after(date2)) {
                this.f162882b = date;
                if (this.f162883c) {
                    Iterator it = tfw0.m190995a().m190996b().iterator();
                    while (it.hasNext()) {
                        ((kfw0) it.next()).m149627g().m149768e(m181310c());
                    }
                }
            }
        }
        this.f162885e = z;
    }

    /* JADX INFO: renamed from: c */
    public final Date m181310c() {
        Date date = this.f162882b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m181311d(@NonNull Context context) {
        if (this.f162883c) {
            return;
        }
        this.f162884d.m201191d(context);
        this.f162884d.m201192e(this);
        this.f162884d.m201193f();
        this.f162885e = this.f162884d.f183983b;
        this.f162883c = true;
    }
}
