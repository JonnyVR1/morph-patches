package p153l;

import android.app.Dialog;
import com.p051p1.mobile.putong.live_api.api.serviceprovider.api.live.DialogObserver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class nab0 {

    /* JADX INFO: renamed from: a */
    public List<x3m> f140997a;

    /* JADX INFO: renamed from: b */
    public boolean f140998b;

    /* JADX INFO: renamed from: l.nab0$a */
    public static final class C18831a {
        private static final nab0 INSTANCE = new nab0();
    }

    public nab0() {
        this.f140997a = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public static nab0 m162061a() {
        return C18831a.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public boolean m162062b() {
        return this.f140998b;
    }

    /* JADX INFO: renamed from: c */
    public void m162063c(Dialog dialog) {
        DialogObserver.PURCHASE.setDialogShown(false);
        Iterator<x3m> it = this.f140997a.iterator();
        while (it.hasNext()) {
            it.next().mo108624a(dialog);
        }
        this.f140998b = false;
    }

    /* JADX INFO: renamed from: d */
    public void m162064d(Dialog dialog) {
        DialogObserver.PURCHASE.setDialogShown(true);
        Iterator<x3m> it = this.f140997a.iterator();
        while (it.hasNext()) {
            it.next().mo108625b(dialog);
        }
        this.f140998b = true;
    }

    /* JADX INFO: renamed from: e */
    public void m162065e(x3m x3mVar) {
        this.f140997a.add(x3mVar);
    }

    /* JADX INFO: renamed from: f */
    public void m162066f(x3m x3mVar) {
        if (this.f140997a.contains(x3mVar)) {
            this.f140997a.remove(x3mVar);
        }
    }
}
