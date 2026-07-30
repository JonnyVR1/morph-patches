package p153l;

import android.content.DialogInterface;
import android.view.View;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes11.dex */
public class k05 {

    /* JADX INFO: renamed from: j */
    public static volatile k05 f123357j;

    /* JADX INFO: renamed from: a */
    public boolean f123358a = false;

    /* JADX INFO: renamed from: b */
    public C22507a<bkj0<Boolean, Boolean, pf60<Integer, List<String>>>> f123359b = C22507a.m222758b();

    /* JADX INFO: renamed from: c */
    public List<String> f123360c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public List<String> f123361d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public List<String> f123362e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public int f123363f = 0;

    /* JADX INFO: renamed from: g */
    public int f123364g = 10;

    /* JADX INFO: renamed from: h */
    public int f123365h = 10;

    /* JADX INFO: renamed from: i */
    public String f123366i = "已完成";

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m147754c(Act act, View view) {
        i4g0.m138523u("e_newmatch_next_close_pop_close", "p_newmatch_next_close_pop", jyb.m147494Y("have_replied_number", Integer.valueOf(m147755h().m147759e().size())));
        act.m68056e2();
    }

    /* JADX INFO: renamed from: h */
    public static k05 m147755h() {
        if (f123357j == null) {
            synchronized (k05.class) {
                try {
                    if (f123357j == null) {
                        f123357j = new k05();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f123357j;
    }

    /* JADX INFO: renamed from: r */
    public static void m147756r() {
        f123357j = null;
    }

    /* JADX INFO: renamed from: v */
    public static void m147757v(final Act act, int i) {
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_newmatch_next_close_pop", "showChatNewMatchConfirmDlg");
        w1e.m204402f(l4g0VarM204399c);
        new th0.C20312a(act).m191148g(false).m191149h(false).m191151j("还剩" + i + "个新配对未回复，确认要关闭吗").m191159r("取消").m191156o(new View.OnClickListener() { // from class: l.h05
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                i4g0.m138520r("e_newmatch_next_close_pop_cancel", "p_newmatch_next_close_pop");
            }
        }).m191147f("确认").m191144c(new View.OnClickListener() { // from class: l.i05
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k05.m147754c(act, view);
            }
        }).m191154m(new DialogInterface.OnDismissListener() { // from class: l.j05
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        }).m191142a().m191141g();
        CoreModule.f18264c.f20381e0.f89350w0.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: d */
    public void m147758d(String str) {
        m147772t();
        CoreModule.f18264c.f20384f0.m33927cn("", new ArrayList(), CoreModule.m30929H().userId(), str, this.f123365h);
    }

    /* JADX INFO: renamed from: e */
    public List<String> m147759e() {
        return this.f123362e;
    }

    /* JADX INFO: renamed from: f */
    public int m147760f() {
        return this.f123360c.size();
    }

    /* JADX INFO: renamed from: g */
    public String m147761g() {
        return this.f123366i;
    }

    /* JADX INFO: renamed from: i */
    public C22421c<bkj0<Boolean, Boolean, pf60<Integer, List<String>>>> m147762i() {
        return this.f123359b.asObservable().observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: j */
    public List<String> m147763j() {
        return this.f123360c;
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public String m147764k() {
        int size = this.f123361d.size();
        int i = this.f123363f;
        if (size > i) {
            return this.f123361d.get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public boolean m147765l() {
        return this.f123361d.size() > this.f123363f;
    }

    /* JADX INFO: renamed from: m */
    public boolean m147766m() {
        return this.f123358a;
    }

    /* JADX INFO: renamed from: n */
    public boolean m147767n() {
        if (CoreModule.f18264c.f20381e0.f89350w0.get().booleanValue()) {
            return false;
        }
        return !jyb.m147479J(this.f123360c);
    }

    /* JADX INFO: renamed from: o */
    public boolean m147768o() {
        return this.f123361d.size() > 0 && !m147765l() && jyb.m147479J(this.f123360c);
    }

    /* JADX INFO: renamed from: p */
    public void m147769p() {
        m147771s();
        m147774w(true);
    }

    /* JADX INFO: renamed from: q */
    public void m147770q(String str) {
        this.f123360c.remove(str);
        m147774w(true);
    }

    /* JADX INFO: renamed from: s */
    public final void m147771s() {
        this.f123360c = new ArrayList();
        if (jyb.m147479J(this.f123361d) || this.f123363f > this.f123361d.size() - 1) {
            return;
        }
        List<String> list = this.f123360c;
        List<String> list2 = this.f123361d;
        list.addAll(list2.subList(this.f123363f, Math.min(list2.size(), this.f123363f + this.f123364g)));
        this.f123363f += this.f123364g;
    }

    /* JADX INFO: renamed from: t */
    public void m147772t() {
        this.f123360c = new ArrayList();
        this.f123362e.clear();
        this.f123361d.clear();
        this.f123363f = 0;
        m147774w(false);
    }

    /* JADX INFO: renamed from: u */
    public void m147773u(List<String> list) {
        this.f123361d = list;
        m147771s();
        m147774w(false);
    }

    /* JADX INFO: renamed from: w */
    public final void m147774w(boolean z) {
        this.f123359b.m137019l(bkj0.m104818a(Boolean.valueOf(z), Boolean.valueOf(this.f123361d.size() > this.f123363f), pf60.m172085a(Integer.valueOf(this.f123360c.size()), this.f123360c)));
    }
}
