package p149l;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class l6w0 implements o6w0 {

    /* JADX INFO: renamed from: f */
    public static final l6w0 f126674f = new l6w0(new p6w0());

    /* JADX INFO: renamed from: a */
    public final m7w0 f126675a = new m7w0();

    /* JADX INFO: renamed from: b */
    public Date f126676b;

    /* JADX INFO: renamed from: c */
    public boolean f126677c;

    /* JADX INFO: renamed from: d */
    public final p6w0 f126678d;

    /* JADX INFO: renamed from: e */
    public boolean f126679e;

    public l6w0(p6w0 p6w0Var) {
        this.f126678d = p6w0Var;
    }

    /* JADX INFO: renamed from: b */
    public static l6w0 m148782b() {
        return f126674f;
    }

    @Override // p149l.o6w0
    /* JADX INFO: renamed from: a */
    public final void mo148783a(boolean z) {
        if (!this.f126679e && z) {
            Date date = new Date();
            Date date2 = this.f126676b;
            if (date2 == null || date.after(date2)) {
                this.f126676b = date;
                if (this.f126677c) {
                    Iterator it = n6w0.m158096a().m158097b().iterator();
                    while (it.hasNext()) {
                        ((e6w0) it.next()).m115115g().m115220e(m148784c());
                    }
                }
            }
        }
        this.f126679e = z;
    }

    /* JADX INFO: renamed from: c */
    public final Date m148784c() {
        Date date = this.f126676b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m148785d(@NonNull Context context) {
        if (this.f126677c) {
            return;
        }
        this.f126678d.m167694d(context);
        this.f126678d.m167695e(this);
        this.f126678d.m167696f();
        this.f126679e = this.f126678d.f147453b;
        this.f126677c = true;
    }
}
