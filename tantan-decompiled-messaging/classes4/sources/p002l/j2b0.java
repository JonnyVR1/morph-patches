package p002l;

import android.app.Dialog;
import com.p1.mobile.putong.live_api.api.serviceprovider.api.live.DialogObserver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.e1m;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class j2b0 {

    /* JADX INFO: renamed from: a */
    public List<e1m> f13531a;

    /* JADX INFO: renamed from: b */
    public boolean f13532b;

    /* JADX INFO: renamed from: l.j2b0$a */
    public static final class C0626a {
        private static final j2b0 INSTANCE = new j2b0();
    }

    public j2b0() {
        this.f13531a = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public static j2b0 m15568a() {
        return C0626a.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public boolean m15569b() {
        return this.f13532b;
    }

    /* JADX INFO: renamed from: c */
    public void m15570c(Dialog dialog) {
        DialogObserver.PURCHASE.setDialogShown(false);
        Iterator<e1m> it = this.f13531a.iterator();
        while (it.hasNext()) {
            it.next().a(dialog);
        }
        this.f13532b = false;
    }

    /* JADX INFO: renamed from: d */
    public void m15571d(Dialog dialog) {
        DialogObserver.PURCHASE.setDialogShown(true);
        Iterator<e1m> it = this.f13531a.iterator();
        while (it.hasNext()) {
            it.next().b(dialog);
        }
        this.f13532b = true;
    }

    /* JADX INFO: renamed from: e */
    public void m15572e(e1m e1mVar) {
        this.f13531a.add(e1mVar);
    }

    /* JADX INFO: renamed from: f */
    public void m15573f(e1m e1mVar) {
        if (this.f13531a.contains(e1mVar)) {
            this.f13531a.remove(e1mVar);
        }
    }
}
