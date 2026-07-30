package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoChat;

/* JADX INFO: loaded from: classes9.dex */
public class kd2 extends lbl0 {

    /* JADX INFO: renamed from: a */
    public String f125126a;

    public kd2(String str) {
        this.f125126a = str;
    }

    @Override // p153l.lbl0
    /* JADX INFO: renamed from: a */
    public void mo96996a(final Act act) {
        super.mo96996a(act);
        jwu.m147278z(this.f125126a).subscribe(dhw.m115826e(new y20() { // from class: l.id2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f114465a.m149145m(act, (BLiveVideoChat) obj);
            }
        }, new y20() { // from class: l.jd2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f120104a.m149146n(act, (Throwable) obj);
            }
        }));
    }

    @Override // p153l.lbl0
    /* JADX INFO: renamed from: f */
    public String mo96997f() {
        return "reqCheck";
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m149145m(Act act, BLiveVideoChat bLiveVideoChat) {
        m153583e(act);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m149146n(Act act, Throwable th) {
        m153581c(th);
        it0.m142010D(act);
    }
}
