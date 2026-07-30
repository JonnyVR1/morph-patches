package p149l;

import android.app.Activity;
import androidx.annotation.Nullable;
import com.google.android.ump.ConsentInformation;

/* JADX INFO: loaded from: classes6.dex */
public final class opx0 implements ConsentInformation {

    /* JADX INFO: renamed from: a */
    public final nhr0 f145060a;

    /* JADX INFO: renamed from: b */
    public final kpy0 f145061b;

    /* JADX INFO: renamed from: c */
    public final ics0 f145062c;

    /* JADX INFO: renamed from: d */
    public final Object f145063d = new Object();

    /* JADX INFO: renamed from: e */
    public final Object f145064e = new Object();

    /* JADX INFO: renamed from: f */
    public boolean f145065f = false;

    /* JADX INFO: renamed from: g */
    public boolean f145066g = false;

    /* JADX INFO: renamed from: h */
    public rw5 f145067h = new rw5.C19803a().m181381a();

    public opx0(nhr0 nhr0Var, kpy0 kpy0Var, ics0 ics0Var) {
        this.f145060a = nhr0Var;
        this.f145061b = kpy0Var;
        this.f145062c = ics0Var;
    }

    @Override // com.google.android.ump.ConsentInformation
    /* JADX INFO: renamed from: a */
    public final void mo15380a(@Nullable Activity activity, rw5 rw5Var, ConsentInformation.InterfaceC2634b interfaceC2634b, ConsentInformation.InterfaceC2633a interfaceC2633a) {
        synchronized (this.f145063d) {
            this.f145065f = true;
        }
        this.f145067h = rw5Var;
        this.f145061b.m146897c(activity, rw5Var, interfaceC2634b, interfaceC2633a);
    }

    @Override // com.google.android.ump.ConsentInformation
    /* JADX INFO: renamed from: b */
    public final boolean mo15381b() {
        if (!this.f145060a.m159454i()) {
            int iM159446a = !m165384c() ? 0 : this.f145060a.m159446a();
            if (iM159446a != 1 && iM159446a != 3) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m165384c() {
        boolean z;
        synchronized (this.f145063d) {
            z = this.f145065f;
        }
        return z;
    }
}
