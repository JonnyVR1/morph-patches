package p149l;

import android.app.Dialog;
import com.p046p1.mobile.putong.live_api.api.serviceprovider.api.live.DialogObserver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class j2b0 {

    /* JADX INFO: renamed from: a */
    public List<e1m> f115906a;

    /* JADX INFO: renamed from: b */
    public boolean f115907b;

    /* JADX INFO: renamed from: l.j2b0$a */
    public static final class C17673a {
        private static final j2b0 INSTANCE = new j2b0();
    }

    public j2b0() {
        this.f115906a = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public static j2b0 m139417a() {
        return C17673a.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public boolean m139418b() {
        return this.f115907b;
    }

    /* JADX INFO: renamed from: c */
    public void m139419c(Dialog dialog) {
        DialogObserver.PURCHASE.setDialogShown(false);
        Iterator<e1m> it = this.f115906a.iterator();
        while (it.hasNext()) {
            it.next().mo111053a(dialog);
        }
        this.f115907b = false;
    }

    /* JADX INFO: renamed from: d */
    public void m139420d(Dialog dialog) {
        DialogObserver.PURCHASE.setDialogShown(true);
        Iterator<e1m> it = this.f115906a.iterator();
        while (it.hasNext()) {
            it.next().mo111054b(dialog);
        }
        this.f115907b = true;
    }

    /* JADX INFO: renamed from: e */
    public void m139421e(e1m e1mVar) {
        this.f115906a.add(e1mVar);
    }

    /* JADX INFO: renamed from: f */
    public void m139422f(e1m e1mVar) {
        if (this.f115906a.contains(e1mVar)) {
            this.f115906a.remove(e1mVar);
        }
    }
}
