package p006l;

import android.content.Context;
import androidx.annotation.NonNull;
import com.p1.mobile.android.app.App;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.e51;
import l.j760;
import l.uye0;
import l.vwb;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class oc2 {

    /* JADX INFO: renamed from: d */
    public static final Object f18139d = new Object();

    /* JADX INFO: renamed from: e */
    public static oc2 f18140e;

    /* JADX INFO: renamed from: a */
    public int f18141a = -1;

    /* JADX INFO: renamed from: c */
    public List<InterfaceC1082a> f18143c = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final Context f18142b = App.e;

    /* JADX INFO: renamed from: l.oc2$a */
    public interface InterfaceC1082a {
        int getCount();
    }

    /* JADX INFO: renamed from: b */
    public static oc2 m20494b() {
        if (f18140e == null) {
            synchronized (f18139d) {
                try {
                    if (f18140e == null) {
                        f18140e = new oc2();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f18140e;
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m20495c(int i) {
        synchronized (oc2.class) {
            uye0.a(this.f18142b, i);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m20496d(@NonNull InterfaceC1082a interfaceC1082a) {
        if (this.f18143c.contains(interfaceC1082a)) {
            return;
        }
        this.f18143c.add(interfaceC1082a);
        m20497e();
    }

    /* JADX INFO: renamed from: e */
    public void m20497e() {
        Iterator<InterfaceC1082a> it = this.f18143c.iterator();
        final int i = 0;
        while (it.hasNext()) {
            int count = it.next().getCount();
            if (count < 0) {
                count = 0;
            }
            i += count;
        }
        if (this.f18141a != i) {
            this.f18141a = i;
            zvf0.D("e_app_unread_airbubble", "", new j760[]{vwb.Y("unread_amount", Integer.valueOf(i))});
            e51.z(new Runnable() { // from class: l.nc2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17585a.m20495c(i);
                }
            }, true);
        }
    }
}
