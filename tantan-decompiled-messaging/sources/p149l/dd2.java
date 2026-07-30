package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoChat;

/* JADX INFO: loaded from: classes13.dex */
public class dd2 extends g2l0 {

    /* JADX INFO: renamed from: a */
    public String f85529a;

    public dd2(String str) {
        this.f85529a = str;
    }

    @Override // p149l.g2l0
    /* JADX INFO: renamed from: a */
    public void mo94566a(final Act act) {
        super.mo94566a(act);
        iuu.m138492z(this.f85529a).subscribe(ffw.m121194e(new e30() { // from class: l.bd2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f74998a.m110889m(act, (BLiveVideoChat) obj);
            }
        }, new e30() { // from class: l.cd2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f80344a.m110890n(act, (Throwable) obj);
            }
        }));
    }

    @Override // p149l.g2l0
    /* JADX INFO: renamed from: f */
    public String mo94567f() {
        return "reqCheck";
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m110889m(Act act, BLiveVideoChat bLiveVideoChat) {
        m124169e(act);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m110890n(Act act, Throwable th) {
        m124167c(th);
        dt0.m113504D(act);
    }
}
