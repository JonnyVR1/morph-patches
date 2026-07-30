package p153l;

import android.content.Context;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.App;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class vc2 {

    /* JADX INFO: renamed from: d */
    public static final Object f183312d = new Object();

    /* JADX INFO: renamed from: e */
    public static vc2 f183313e;

    /* JADX INFO: renamed from: a */
    public int f183314a = -1;

    /* JADX INFO: renamed from: c */
    public List<InterfaceC20805a> f183316c = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final Context f183315b = App.f16088e;

    /* JADX INFO: renamed from: l.vc2$a */
    public interface InterfaceC20805a {
        int getCount();
    }

    /* JADX INFO: renamed from: b */
    public static vc2 m200753b() {
        if (f183313e == null) {
            synchronized (f183312d) {
                try {
                    if (f183313e == null) {
                        f183313e = new vc2();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f183313e;
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m200754c(int i) {
        synchronized (vc2.class) {
            b7f0.m102838a(this.f183315b, i);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m200755d(@NonNull InterfaceC20805a interfaceC20805a) {
        if (this.f183316c.contains(interfaceC20805a)) {
            return;
        }
        this.f183316c.add(interfaceC20805a);
        m200756e();
    }

    /* JADX INFO: renamed from: e */
    public void m200756e() {
        Iterator<InterfaceC20805a> it = this.f183316c.iterator();
        final int i = 0;
        while (it.hasNext()) {
            int count = it.next().getCount();
            if (count < 0) {
                count = 0;
            }
            i += count;
        }
        if (this.f183314a != i) {
            this.f183314a = i;
            i4g0.m138495D("e_app_unread_airbubble", "", jyb.m147494Y("unread_amount", Integer.valueOf(i)));
            l51.m152920z(new Runnable() { // from class: l.uc2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f178400a.m200754c(i);
                }
            }, true);
        }
    }
}
