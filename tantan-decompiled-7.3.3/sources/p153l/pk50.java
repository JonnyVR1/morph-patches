package p153l;

import androidx.annotation.DrawableRes;
import com.p051p1.mobile.putong.data.OMSAdCardInfo;
import com.p051p1.mobile.putong.data.OMSData;
import com.p051p1.mobile.putong.data.OMSDialogInfo;
import com.p051p1.mobile.putong.data.OMSSlotsInfo;
import com.p051p1.mobile.putong.data.OMSThemeInfo;
import com.p051p1.mobile.putong.data.SwipeExcites;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes10.dex */
public class pk50 {

    /* JADX INFO: renamed from: h */
    public static pk50 f152791h;

    /* JADX INFO: renamed from: a */
    public dj50 f152792a;

    /* JADX INFO: renamed from: b */
    public C22507a<OMSData> f152793b;

    /* JADX INFO: renamed from: c */
    public sj50 f152794c;

    /* JADX INFO: renamed from: d */
    public dxv f152795d;

    /* JADX INFO: renamed from: e */
    public HashMap<String, fl50> f152796e = new HashMap<>();

    /* JADX INFO: renamed from: f */
    public rj50 f152797f;

    /* JADX INFO: renamed from: g */
    public th50 f152798g;

    /* JADX INFO: renamed from: j */
    public static pk50 m172568j() {
        if (f152791h == null) {
            synchronized (pk50.class) {
                try {
                    if (f152791h == null) {
                        f152791h = new pk50();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f152791h;
    }

    /* JADX INFO: renamed from: a */
    public void m172569a() {
        if (this.f152796e.size() > 0) {
            uk50.m196472f().m196475c();
            Iterator<Map.Entry<String, fl50>> it = this.f152796e.entrySet().iterator();
            while (it.hasNext()) {
                fl50 value = it.next().getValue();
                if (value != null) {
                    this.f152795d.m118574c(value.mo30925c());
                    if (this.f152792a.m116050L()) {
                        this.f152792a.m116052N(value.mo30926d());
                    }
                    if (this.f152792a.m116049K()) {
                        this.f152792a.m116051M(value.mo30927e());
                    }
                    this.f152794c.m186057c(value.mo30924b());
                    uk50.m196472f().m196482k(value.mo30923a());
                }
            }
        }
        this.f152792a.m116046H(uqb0.f180362A);
    }

    /* JADX INFO: renamed from: b */
    public void m172570b() {
        m172587t();
        this.f152793b = C22507a.m222758b();
        this.f152798g = new th50();
        this.f152797f = new rj50();
        this.f152792a = new dj50();
        this.f152794c = new sj50();
        this.f152795d = new dxv();
    }

    /* JADX INFO: renamed from: c */
    public dj50 m172571c() {
        return this.f152792a;
    }

    /* JADX INFO: renamed from: d */
    public OMSData m172572d() {
        return this.f152798g.m191220z().m159276m();
    }

    /* JADX INFO: renamed from: e */
    public OMSData m172573e() {
        return this.f152798g.m191220z().m159277n();
    }

    /* JADX INFO: renamed from: f */
    public rj50 m172574f() {
        return this.f152797f;
    }

    /* JADX INFO: renamed from: g */
    public sj50 m172575g() {
        return this.f152794c;
    }

    /* JADX INFO: renamed from: h */
    public List<OMSAdCardInfo> m172576h() {
        if (this.f152798g.m191220z().m159276m() == null) {
            return null;
        }
        return this.f152798g.m191220z().m159276m().cards;
    }

    /* JADX INFO: renamed from: i */
    public List<OMSDialogInfo> m172577i() {
        if (this.f152798g.m191220z().m159276m() == null) {
            return null;
        }
        return this.f152798g.m191220z().m159276m().dialogs;
    }

    /* JADX INFO: renamed from: k */
    public List<OMSSlotsInfo> m172578k() {
        if (this.f152798g.m191220z().m159276m() == null) {
            return null;
        }
        return this.f152798g.m191220z().m159276m().slots;
    }

    /* JADX INFO: renamed from: l */
    public List<SwipeExcites> m172579l() {
        if (this.f152798g.m191220z().m159276m() == null) {
            return null;
        }
        return this.f152798g.m191220z().m159276m().swipeExcites;
    }

    /* JADX INFO: renamed from: m */
    public List<OMSThemeInfo> m172580m() {
        if (this.f152798g.m191220z().m159276m() == null) {
            return null;
        }
        return this.f152798g.m191220z().m159276m().themes;
    }

    /* JADX INFO: renamed from: n */
    public th50 m172581n() {
        return this.f152798g;
    }

    /* JADX INFO: renamed from: o */
    public dxv m172582o() {
        return this.f152795d;
    }

    /* JADX INFO: renamed from: p */
    public void m172583p(boolean z) {
        this.f152798g.m191220z().m191225F(z);
    }

    /* JADX INFO: renamed from: q */
    public void m172584q(String str, fl50 fl50Var) {
        if (this.f152796e.containsKey(str)) {
            azk0.m101074a("the module name is already exits");
        } else {
            this.f152796e.put(str, fl50Var);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m172585r(String str, @DrawableRes int i) {
        if (NullChecker.m82486a(this.f152794c)) {
            this.f152794c.m186058d(str, i);
        }
    }

    /* JADX INFO: renamed from: s */
    public C22507a<OMSData> m172586s() {
        return this.f152793b;
    }

    /* JADX INFO: renamed from: t */
    public void m172587t() {
        C22507a<OMSData> c22507a = this.f152793b;
        if (c22507a != null) {
            c22507a.onCompleted();
            this.f152793b = null;
        }
    }

    /* JADX INFO: renamed from: u */
    public void m172588u(OMSData oMSData) {
        this.f152798g.m191220z().m159273A(oMSData);
    }
}
