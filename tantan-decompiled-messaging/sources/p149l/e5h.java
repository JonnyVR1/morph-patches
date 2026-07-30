package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class e5h extends AbstractC16769f7<List<User>> {

    /* JADX INFO: renamed from: b */
    public Links f89427b;

    /* JADX INFO: renamed from: c */
    public String f89428c;

    /* JADX INFO: renamed from: d */
    public List<User> f89429d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public Act f89430e;

    /* JADX INFO: renamed from: f */
    public boolean f89431f;

    public e5h(Act act, String str) {
        this.f89428c = str;
        this.f89430e = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m114800m(Throwable th) {
        th.printStackTrace();
        m119702b().mo61985a(th);
    }

    /* JADX INFO: renamed from: h */
    public final List<User> m114801h(List<User> list) {
        final String str = FeedModule.m60222H().me_().f56011id;
        vwb.m200339n(list, new w9j() { // from class: l.d5h
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!str.equals(((User) obj).f56011id));
            }
        });
        return list;
    }

    /* JADX INFO: renamed from: i */
    public String m114802i() {
        Links links = this.f89427b;
        return links == null ? "" : links.next;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m114803j(xaj0 xaj0Var) {
        this.f89427b = (Links) xaj0Var.f191753c;
        this.f89429d.addAll(m114801h((List) xaj0Var.f191752b));
        m119702b().mo61986z0(this.f89429d, (Links) xaj0Var.f191753c);
        this.f89431f = false;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m114804k(Throwable th) {
        th.printStackTrace();
        m119702b().mo61985a(th);
        this.f89431f = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m114805l(xaj0 xaj0Var) {
        this.f89429d.clear();
        this.f89429d.addAll(m114801h((List) xaj0Var.f191752b));
        this.f89427b = (Links) xaj0Var.f191753c;
        m119702b().mo61986z0(this.f89429d, (Links) xaj0Var.f191753c);
    }

    @Override // p149l.qpl
    public void next() {
        String strM114802i = m114802i();
        if (TextUtils.isEmpty(strM114802i) || this.f89431f) {
            return;
        }
        this.f89431f = true;
        this.f89430e.duringCreated(FeedModule.f38855d.m209258D7(this.f89428c, 0, strM114802i)).subscribe(mkd0.m154956H(new e30() { // from class: l.b5h
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f73663a.m114803j((xaj0) obj);
            }
        }, new e30() { // from class: l.c5h
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f79381a.m114804k((Throwable) obj);
            }
        }));
    }

    @Override // p149l.qpl
    public void previous() {
        this.f89430e.duringCreated(FeedModule.f38855d.m209258D7(this.f89428c, 20, null)).subscribe(mkd0.m154956H(new e30() { // from class: l.z4h
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f201600a.m114805l((xaj0) obj);
            }
        }, new e30() { // from class: l.a5h
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f67709a.m114800m((Throwable) obj);
            }
        }));
    }
}
