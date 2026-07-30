package p149l;

import android.content.Context;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.App;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class oc2 {

    /* JADX INFO: renamed from: d */
    public static final Object f143002d = new Object();

    /* JADX INFO: renamed from: e */
    public static oc2 f143003e;

    /* JADX INFO: renamed from: a */
    public int f143004a = -1;

    /* JADX INFO: renamed from: c */
    public List<InterfaceC18891a> f143006c = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final Context f143005b = App.f15369e;

    /* JADX INFO: renamed from: l.oc2$a */
    public interface InterfaceC18891a {
        int getCount();
    }

    /* JADX INFO: renamed from: b */
    public static oc2 m163472b() {
        if (f143003e == null) {
            synchronized (f143002d) {
                try {
                    if (f143003e == null) {
                        f143003e = new oc2();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f143003e;
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m163473c(int i) {
        synchronized (oc2.class) {
            uye0.m196286a(this.f143005b, i);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m163474d(@NonNull InterfaceC18891a interfaceC18891a) {
        if (this.f143006c.contains(interfaceC18891a)) {
            return;
        }
        this.f143006c.add(interfaceC18891a);
        m163475e();
    }

    /* JADX INFO: renamed from: e */
    public void m163475e() {
        Iterator<InterfaceC18891a> it = this.f143006c.iterator();
        final int i = 0;
        while (it.hasNext()) {
            int count = it.next().getCount();
            if (count < 0) {
                count = 0;
            }
            i += count;
        }
        if (this.f143004a != i) {
            this.f143004a = i;
            zvf0.m220371D("e_app_unread_airbubble", "", vwb.m200311Y("unread_amount", Integer.valueOf(i)));
            e51.m114775z(new Runnable() { // from class: l.nc2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f138089a.m163473c(i);
                }
            }, true);
        }
    }
}
