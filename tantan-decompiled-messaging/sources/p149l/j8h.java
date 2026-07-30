package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.MomentActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes12.dex */
public abstract class j8h extends AbstractC16769f7<List<MomentActivity>> {

    /* JADX INFO: renamed from: b */
    public List<MomentActivity> f116716b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public Links f116717c;

    /* JADX INFO: renamed from: d */
    public boolean f116718d;

    /* JADX INFO: renamed from: e */
    public Act f116719e;

    public j8h(Act act) {
        this.f116719e = act;
        m140212h();
    }

    /* JADX INFO: renamed from: g */
    public boolean m140211g() {
        return this.f116718d;
    }

    /* JADX INFO: renamed from: h */
    public final void m140212h() {
        if (mo140222r()) {
            this.f116719e.duringCreated(FeedModule.f38855d.f193061p0).subscribe(mkd0.m154955G(new e30() { // from class: l.f8h
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f96374a.m140219o((Moment) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: i */
    public void m140213i() {
        m140214j(false);
    }

    /* JADX INFO: renamed from: j */
    public void m140214j(final boolean z) {
        this.f116719e.duringCreated(mo140215k()).subscribe(mkd0.m154956H(new e30() { // from class: l.g8h
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f101496a.m140220p(z, (j760) obj);
            }
        }, new e30() { // from class: l.h8h
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f106436a.m140221q((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k */
    public abstract C22306c<j760<Links, List<MomentActivity>>> mo140215k();

    /* JADX INFO: renamed from: l */
    public String m140216l() {
        Links links = this.f116717c;
        if (links == null || TextUtils.isEmpty(links.next)) {
            return "";
        }
        return "&" + this.f116717c.next;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public String m140217m() {
        String strM140216l = m140216l();
        StringBuilder sb = new StringBuilder();
        sb.append(m140216l());
        sb.append(TextUtils.isEmpty(strM140216l) ? m140218n() : "");
        return sb.toString();
    }

    /* JADX INFO: renamed from: n */
    public String m140218n() {
        return "&sort=unread";
    }

    @Override // p149l.qpl
    public void next() {
        if (TextUtils.isEmpty(m140216l()) || m140211g()) {
            return;
        }
        m140224t();
        m140213i();
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m140219o(final Moment moment) {
        int iM200293G = vwb.m200293G(this.f116716b, new w9j() { // from class: l.i8h
            @Override // p149l.w9j
            public final Object call(Object obj) {
                MomentActivity momentActivity = (MomentActivity) obj;
                return Boolean.valueOf(momentActivity != null && momentActivity.reference.f39232id.equals(moment.f56011id));
            }
        });
        if (iM200293G != -1) {
            this.f116716b.remove(iM200293G);
            m119702b().mo61986z0(this.f116716b, this.f116717c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m140220p(boolean z, j760 j760Var) {
        if (z) {
            this.f116716b.clear();
        }
        this.f116716b.addAll((Collection) j760Var.f116565b);
        this.f116717c = (Links) j760Var.f116564a;
        m119702b().mo61986z0(this.f116716b, (Links) j760Var.f116564a);
        m140223s();
    }

    @Override // p149l.qpl
    public void previous() {
        this.f116717c = null;
        m140214j(true);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m140221q(Throwable th) {
        th.printStackTrace();
        m119702b().mo61985a(th);
        m140223s();
    }

    /* JADX INFO: renamed from: r */
    public boolean mo140222r() {
        return true;
    }

    /* JADX INFO: renamed from: s */
    public void m140223s() {
        this.f116718d = false;
    }

    /* JADX INFO: renamed from: t */
    public void m140224t() {
        this.f116718d = true;
    }
}
