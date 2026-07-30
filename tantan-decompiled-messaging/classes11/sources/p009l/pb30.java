package p009l;

import android.text.TextUtils;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.data.DbLinks;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import l.c4g0;
import l.e30;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.roj0;
import l.vwb;
import l.w9j;
import l.xaj0;
import l.y9j;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class pb30 extends jq2<yb30> {

    /* JADX INFO: renamed from: a */
    public final Set<String> f18445a;

    /* JADX INFO: renamed from: b */
    public final Set<String> f18446b;

    /* JADX INFO: renamed from: c */
    public List<Conversation> f18447c;

    /* JADX INFO: renamed from: d */
    public long f18448d;

    /* JADX INFO: renamed from: e */
    public a<roj0> f18449e;

    /* JADX INFO: renamed from: f */
    public List<Conversation> f18450f;

    /* JADX INFO: renamed from: g */
    public DbLinks f18451g;

    /* JADX INFO: renamed from: h */
    public c4g0 f18452h;

    /* JADX INFO: renamed from: i */
    public String f18453i;

    /* JADX INFO: renamed from: j */
    public double f18454j;

    public pb30(mcr mcrVar) {
        super(mcrVar);
        this.f18445a = new HashSet();
        this.f18446b = new HashSet();
        this.f18447c = new ArrayList();
        this.f18448d = 0L;
        this.f18449e = a.c(roj0.a);
        this.f18450f = new ArrayList();
        this.f18451g = null;
        this.f18453i = "";
        this.f18454j = 0.0d;
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m20107f0(Throwable th) {
    }

    /* JADX INFO: renamed from: a0 */
    public void m20112a0() {
        super.a0();
        duringCreated(mkd0.s(CoreModule.c.f0.fo(), this.f18449e, CoreModule.c.f0.og(), new y9j() { // from class: l.ib30
            /* JADX INFO: renamed from: a */
            public final Object m16314a(Object obj, Object obj2, Object obj3) {
                return new xaj0((q860) obj, (roj0) obj2, (Boolean) obj3);
            }
        }).filter(new w9j() { // from class: l.jb30
            public final Object call(Object obj) {
                return this.f15038a.m20116n0((xaj0) obj);
            }
        })).subscribe(mkd0.H(new e30() { // from class: l.kb30
            public final void call(Object obj) {
                this.f15571a.m20117o0((xaj0) obj);
            }
        }, new e30() { // from class: l.lb30
            public final void call(Object obj) {
                pb30.m20107f0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k0 */
    public void m20113k0() {
        this.f18453i = "";
        this.f18445a.clear();
    }

    /* JADX INFO: renamed from: l0 */
    public void m20114l0(final Conversation conversation) {
        if (!NullChecker.a(vwb.r(this.f18447c, new w9j() { // from class: l.ob30
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((DbObject) ((Conversation) obj)).id, ((DbObject) conversation).id));
            }
        })) && !this.f18446b.contains(((DbObject) conversation).id)) {
            this.f18447c.add(conversation);
            this.f18446b.add(((DbObject) conversation).id);
        }
        if (this.f18447c.size() >= 10 || (!vwb.J(this.f18447c) && mqi0.m18550o() - this.f18448d > 5000)) {
            this.f18448d = mqi0.m18550o();
            CoreModule.c.f0.Vf(new ArrayList(this.f18447c), this.f18446b);
            this.f18447c.clear();
        }
    }

    /* JADX INFO: renamed from: m0 */
    public String m20115m0() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.f18445a) {
            if (TextUtils.isEmpty(sb)) {
                sb.append(str);
            } else {
                sb.append(",");
                sb.append(str);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ Boolean m20116n0(xaj0 xaj0Var) {
        return Boolean.valueOf(vwb.J(this.f18445a) && ((Boolean) xaj0Var.c).booleanValue());
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m20117o0(xaj0 xaj0Var) {
        List<T> list = ((q860) xaj0Var.a).f19068a;
        if (!vwb.J(list)) {
            double d = ((Conversation) list.get(0)).updatedTime;
            if (d > this.f18454j) {
                CoreModule.c.f0.tp();
                this.f18454j = d;
            }
        }
        ((yb30) ((jq2) this).viewModel).m25243L(list, false);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m20118p0(String str, boolean z, q860 q860Var) {
        if (TextUtils.equals(m20115m0(), str)) {
            ArrayList arrayList = new ArrayList();
            for (T t : q860Var.f19068a) {
                Conversation conversationXe = CoreModule.c.f0.Xe(((DbObject) t).id);
                if (NullChecker.a(conversationXe) && conversationXe.localEverHasMessage) {
                    arrayList.add(t);
                }
            }
            if (!vwb.J(arrayList)) {
                q860Var.f19068a.removeAll(arrayList);
            }
            this.f18451g = q860Var.f19069b;
            if (z) {
                this.f18450f.addAll(q860Var.f19068a);
            } else if (NullChecker.a(q860Var.f19068a)) {
                this.f18450f.clear();
                this.f18450f.addAll(q860Var.f19068a);
            } else {
                this.f18450f = new ArrayList();
            }
            ((yb30) ((jq2) this).viewModel).m25243L(this.f18450f, true);
            ((yb30) ((jq2) this).viewModel).m25242K();
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m20119q0(Throwable th) {
        this.f18453i = "";
        yij0.m25382D(th);
    }

    /* JADX INFO: renamed from: r0 */
    public void m20120r0(final boolean z) {
        String str = "";
        if (vwb.J(this.f18445a)) {
            this.f18453i = "";
            this.f18449e.onNext(roj0.a);
            return;
        }
        if (z) {
            DbLinks dbLinks = this.f18451g;
            if (dbLinks == null || TextUtils.isEmpty(dbLinks.links.next)) {
                return;
            }
        } else {
            this.f18451g = null;
            this.f18450f.clear();
        }
        final String strM20115m0 = m20115m0();
        StringBuilder sb = new StringBuilder();
        sb.append(com.p1.mobile.putong.core.api.a.C(strM20115m0));
        if (z) {
            str = "&" + this.f18451g.links.next;
        }
        sb.append(str);
        String string = sb.toString();
        if (TextUtils.equals(this.f18453i, string)) {
            return;
        }
        this.f18453i = string;
        mkd0.z(this.f18452h);
        this.f18452h = duringCreated(CoreModule.c.f0.gg(string)).subscribe(mkd0.H(new e30() { // from class: l.mb30
            public final void call(Object obj) {
                this.f16784a.m20118p0(strM20115m0, z, (q860) obj);
            }
        }, new e30() { // from class: l.nb30
            public final void call(Object obj) {
                this.f17382a.m20119q0((Throwable) obj);
            }
        }));
    }

    public void destroy() {
    }
}
