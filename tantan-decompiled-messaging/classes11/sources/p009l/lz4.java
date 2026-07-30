package p009l;

import android.content.DialogInterface;
import android.view.View;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import java.util.ArrayList;
import java.util.List;
import l.cwf0;
import l.j760;
import l.jo0;
import l.vwb;
import l.xaj0;
import l.xh0;
import l.zvf0;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class lz4 {

    /* JADX INFO: renamed from: j */
    public static volatile lz4 f16452j;

    /* JADX INFO: renamed from: a */
    public boolean f16453a = false;

    /* JADX INFO: renamed from: b */
    public a<xaj0<Boolean, Boolean, j760<Integer, List<String>>>> f16454b = a.b();

    /* JADX INFO: renamed from: c */
    public List<String> f16455c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public List<String> f16456d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public List<String> f16457e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public int f16458f = 0;

    /* JADX INFO: renamed from: g */
    public int f16459g = 10;

    /* JADX INFO: renamed from: h */
    public int f16460h = 10;

    /* JADX INFO: renamed from: i */
    public String f16461i = "已完成";

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m18099c(Act act, View view) {
        zvf0.u("e_newmatch_next_close_pop_close", "p_newmatch_next_close_pop", new j760[]{vwb.Y("have_replied_number", Integer.valueOf(m18100h().m18104e().size()))});
        act.finish();
    }

    /* JADX INFO: renamed from: h */
    public static lz4 m18100h() {
        if (f16452j == null) {
            synchronized (lz4.class) {
                try {
                    if (f16452j == null) {
                        f16452j = new lz4();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f16452j;
    }

    /* JADX INFO: renamed from: r */
    public static void m18101r() {
        f16452j = null;
    }

    /* JADX INFO: renamed from: v */
    public static void m18102v(final Act act, int i) {
        final cwf0 cwf0VarM16062c = i0e.m16062c("p_newmatch_next_close_pop", "showChatNewMatchConfirmDlg");
        i0e.m16065f(cwf0VarM16062c);
        new xh0.a(act).g(false).h(false).j("还剩" + i + "个新配对未回复，确认要关闭吗").r("取消").o(new View.OnClickListener() { // from class: l.iz4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zvf0.r("e_newmatch_next_close_pop_cancel", "p_newmatch_next_close_pop");
            }
        }).f("确认").c(new View.OnClickListener() { // from class: l.jz4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                lz4.m18099c(act, view);
            }
        }).m(new DialogInterface.OnDismissListener() { // from class: l.kz4
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m16064e(cwf0VarM16062c);
            }
        }).a().g();
        CoreModule.c.e0.w0.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: d */
    public void m18103d(String str) {
        m18117t();
        CoreModule.c.f0.cn("", new ArrayList(), CoreModule.H().userId(), str, this.f16460h);
    }

    /* JADX INFO: renamed from: e */
    public List<String> m18104e() {
        return this.f16457e;
    }

    /* JADX INFO: renamed from: f */
    public int m18105f() {
        return this.f16455c.size();
    }

    /* JADX INFO: renamed from: g */
    public String m18106g() {
        return this.f16461i;
    }

    /* JADX INFO: renamed from: i */
    public c<xaj0<Boolean, Boolean, j760<Integer, List<String>>>> m18107i() {
        return this.f16454b.asObservable().observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: j */
    public List<String> m18108j() {
        return this.f16455c;
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public String m18109k() {
        int size = this.f16456d.size();
        int i = this.f16458f;
        if (size > i) {
            return this.f16456d.get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public boolean m18110l() {
        return this.f16456d.size() > this.f16458f;
    }

    /* JADX INFO: renamed from: m */
    public boolean m18111m() {
        return this.f16453a;
    }

    /* JADX INFO: renamed from: n */
    public boolean m18112n() {
        if (((Boolean) CoreModule.c.e0.w0.get()).booleanValue()) {
            return false;
        }
        return !vwb.J(this.f16455c);
    }

    /* JADX INFO: renamed from: o */
    public boolean m18113o() {
        return this.f16456d.size() > 0 && !m18110l() && vwb.J(this.f16455c);
    }

    /* JADX INFO: renamed from: p */
    public void m18114p() {
        m18116s();
        m18119w(true);
    }

    /* JADX INFO: renamed from: q */
    public void m18115q(String str) {
        this.f16455c.remove(str);
        m18119w(true);
    }

    /* JADX INFO: renamed from: s */
    public final void m18116s() {
        this.f16455c = new ArrayList();
        if (vwb.J(this.f16456d) || this.f16458f > this.f16456d.size() - 1) {
            return;
        }
        List<String> list = this.f16455c;
        List<String> list2 = this.f16456d;
        list.addAll(list2.subList(this.f16458f, Math.min(list2.size(), this.f16458f + this.f16459g)));
        this.f16458f += this.f16459g;
    }

    /* JADX INFO: renamed from: t */
    public void m18117t() {
        this.f16455c = new ArrayList();
        this.f16457e.clear();
        this.f16456d.clear();
        this.f16458f = 0;
        m18119w(false);
    }

    /* JADX INFO: renamed from: u */
    public void m18118u(List<String> list) {
        this.f16456d = list;
        m18116s();
        m18119w(false);
    }

    /* JADX INFO: renamed from: w */
    public final void m18119w(boolean z) {
        this.f16454b.onNext(xaj0.a(Boolean.valueOf(z), Boolean.valueOf(this.f16456d.size() > this.f16458f), j760.a(Integer.valueOf(this.f16455c.size()), this.f16455c)));
    }
}
