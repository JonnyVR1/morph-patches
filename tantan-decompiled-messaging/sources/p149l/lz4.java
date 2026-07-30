package p149l;

import android.content.DialogInterface;
import android.view.View;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import java.util.ArrayList;
import java.util.List;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes11.dex */
public class lz4 {

    /* JADX INFO: renamed from: j */
    public static volatile lz4 f130623j;

    /* JADX INFO: renamed from: a */
    public boolean f130624a = false;

    /* JADX INFO: renamed from: b */
    public C22392a<xaj0<Boolean, Boolean, j760<Integer, List<String>>>> f130625b = C22392a.m221512b();

    /* JADX INFO: renamed from: c */
    public List<String> f130626c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public List<String> f130627d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public List<String> f130628e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public int f130629f = 0;

    /* JADX INFO: renamed from: g */
    public int f130630g = 10;

    /* JADX INFO: renamed from: h */
    public int f130631h = 10;

    /* JADX INFO: renamed from: i */
    public String f130632i = "已完成";

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m152318c(Act act, View view) {
        zvf0.m220399u("e_newmatch_next_close_pop_close", "p_newmatch_next_close_pop", vwb.m200311Y("have_replied_number", Integer.valueOf(m152319h().m152323e().size())));
        act.m66873d2();
    }

    /* JADX INFO: renamed from: h */
    public static lz4 m152319h() {
        if (f130623j == null) {
            synchronized (lz4.class) {
                try {
                    if (f130623j == null) {
                        f130623j = new lz4();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f130623j;
    }

    /* JADX INFO: renamed from: r */
    public static void m152320r() {
        f130623j = null;
    }

    /* JADX INFO: renamed from: v */
    public static void m152321v(final Act act, int i) {
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_newmatch_next_close_pop", "showChatNewMatchConfirmDlg");
        i0e.m133797f(cwf0VarM133794c);
        new xh0.C21150a(act).m208728g(false).m208729h(false).m208731j("还剩" + i + "个新配对未回复，确认要关闭吗").m208739r("取消").m208736o(new View.OnClickListener() { // from class: l.iz4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zvf0.m220396r("e_newmatch_next_close_pop_cancel", "p_newmatch_next_close_pop");
            }
        }).m208727f("确认").m208724c(new View.OnClickListener() { // from class: l.jz4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                lz4.m152318c(act, view);
            }
        }).m208734m(new DialogInterface.OnDismissListener() { // from class: l.kz4
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        }).m208722a().m208721g();
        CoreModule.f17545c.f19639e0.f149493w0.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: d */
    public void m152322d(String str) {
        m152336t();
        CoreModule.f17545c.f19642f0.m32924cn("", new ArrayList(), CoreModule.m29931H().userId(), str, this.f130631h);
    }

    /* JADX INFO: renamed from: e */
    public List<String> m152323e() {
        return this.f130628e;
    }

    /* JADX INFO: renamed from: f */
    public int m152324f() {
        return this.f130626c.size();
    }

    /* JADX INFO: renamed from: g */
    public String m152325g() {
        return this.f130632i;
    }

    /* JADX INFO: renamed from: i */
    public C22306c<xaj0<Boolean, Boolean, j760<Integer, List<String>>>> m152326i() {
        return this.f130625b.asObservable().observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: j */
    public List<String> m152327j() {
        return this.f130626c;
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public String m152328k() {
        int size = this.f130627d.size();
        int i = this.f130629f;
        if (size > i) {
            return this.f130627d.get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public boolean m152329l() {
        return this.f130627d.size() > this.f130629f;
    }

    /* JADX INFO: renamed from: m */
    public boolean m152330m() {
        return this.f130624a;
    }

    /* JADX INFO: renamed from: n */
    public boolean m152331n() {
        if (CoreModule.f17545c.f19639e0.f149493w0.get().booleanValue()) {
            return false;
        }
        return !vwb.m200296J(this.f130626c);
    }

    /* JADX INFO: renamed from: o */
    public boolean m152332o() {
        return this.f130627d.size() > 0 && !m152329l() && vwb.m200296J(this.f130626c);
    }

    /* JADX INFO: renamed from: p */
    public void m152333p() {
        m152335s();
        m152338w(true);
    }

    /* JADX INFO: renamed from: q */
    public void m152334q(String str) {
        this.f130626c.remove(str);
        m152338w(true);
    }

    /* JADX INFO: renamed from: s */
    public final void m152335s() {
        this.f130626c = new ArrayList();
        if (vwb.m200296J(this.f130627d) || this.f130629f > this.f130627d.size() - 1) {
            return;
        }
        List<String> list = this.f130626c;
        List<String> list2 = this.f130627d;
        list.addAll(list2.subList(this.f130629f, Math.min(list2.size(), this.f130629f + this.f130630g)));
        this.f130629f += this.f130630g;
    }

    /* JADX INFO: renamed from: t */
    public void m152336t() {
        this.f130626c = new ArrayList();
        this.f130628e.clear();
        this.f130627d.clear();
        this.f130629f = 0;
        m152338w(false);
    }

    /* JADX INFO: renamed from: u */
    public void m152337u(List<String> list) {
        this.f130627d = list;
        m152335s();
        m152338w(false);
    }

    /* JADX INFO: renamed from: w */
    public final void m152338w(boolean z) {
        this.f130625b.m132487l(xaj0.m207578a(Boolean.valueOf(z), Boolean.valueOf(this.f130627d.size() > this.f130629f), j760.m140076a(Integer.valueOf(this.f130626c.size()), this.f130626c)));
    }
}
