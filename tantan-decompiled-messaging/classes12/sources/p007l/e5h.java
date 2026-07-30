package p007l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.data.Links;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.mkd0;
import l.vwb;
import l.w9j;
import l.xaj0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class e5h extends AbstractC2383f7<List<User>> {

    /* JADX INFO: renamed from: b */
    public Links f7217b;

    /* JADX INFO: renamed from: c */
    public String f7218c;

    /* JADX INFO: renamed from: d */
    public List<User> f7219d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public Act f7220e;

    /* JADX INFO: renamed from: f */
    public boolean f7221f;

    public e5h(Act act, String str) {
        this.f7218c = str;
        this.f7220e = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m9620m(Throwable th) {
        th.printStackTrace();
        m10070b().mo2959a(th);
    }

    /* JADX INFO: renamed from: h */
    public final List<User> m9621h(List<User> list) {
        final String str = ((DbObject) FeedModule.m1140H().me_()).id;
        vwb.n(list, new w9j() { // from class: l.d5h
            public final Object call(Object obj) {
                return Boolean.valueOf(!str.equals(((DbObject) ((User) obj)).id));
            }
        });
        return list;
    }

    /* JADX INFO: renamed from: i */
    public String m9622i() {
        Links links = this.f7217b;
        return links == null ? "" : links.next;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m9623j(xaj0 xaj0Var) {
        this.f7217b = (Links) xaj0Var.c;
        this.f7219d.addAll(m9621h((List) xaj0Var.b));
        m10070b().mo2960z0(this.f7219d, (Links) xaj0Var.c);
        this.f7221f = false;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m9624k(Throwable th) {
        th.printStackTrace();
        m10070b().mo2959a(th);
        this.f7221f = false;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m9625l(xaj0 xaj0Var) {
        this.f7219d.clear();
        this.f7219d.addAll(m9621h((List) xaj0Var.b));
        this.f7217b = (Links) xaj0Var.c;
        m10070b().mo2960z0(this.f7219d, (Links) xaj0Var.c);
    }

    @Override // p007l.qpl
    public void next() {
        String strM9622i = m9622i();
        if (TextUtils.isEmpty(strM9622i) || this.f7221f) {
            return;
        }
        this.f7221f = true;
        this.f7220e.duringCreated(FeedModule.f316d.m16439D7(this.f7218c, 0, strM9622i)).subscribe(mkd0.H(new e30() { // from class: l.b5h
            public final void call(Object obj) {
                this.f6111a.m9623j((xaj0) obj);
            }
        }, new e30() { // from class: l.c5h
            public final void call(Object obj) {
                this.f6541a.m9624k((Throwable) obj);
            }
        }));
    }

    @Override // p007l.qpl
    public void previous() {
        this.f7220e.duringCreated(FeedModule.f316d.m16439D7(this.f7218c, 20, null)).subscribe(mkd0.H(new e30() { // from class: l.z4h
            public final void call(Object obj) {
                this.f15592a.m9625l((xaj0) obj);
            }
        }, new e30() { // from class: l.a5h
            public final void call(Object obj) {
                this.f5587a.m9620m((Throwable) obj);
            }
        }));
    }
}
