package p007l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.data.Links;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.MomentActivity;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import l.e30;
import l.j760;
import l.mkd0;
import l.vwb;
import l.w9j;
import org.jetbrains.annotations.NotNull;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public abstract class j8h extends AbstractC2383f7<List<MomentActivity>> {

    /* JADX INFO: renamed from: b */
    public List<MomentActivity> f9255b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public Links f9256c;

    /* JADX INFO: renamed from: d */
    public boolean f9257d;

    /* JADX INFO: renamed from: e */
    public Act f9258e;

    public j8h(Act act) {
        this.f9258e = act;
        m11079h();
    }

    /* JADX INFO: renamed from: g */
    public boolean m11078g() {
        return this.f9257d;
    }

    /* JADX INFO: renamed from: h */
    public final void m11079h() {
        if (mo11089r()) {
            this.f9258e.duringCreated(FeedModule.f316d.f14996p0).subscribe(mkd0.G(new e30() { // from class: l.f8h
                public final void call(Object obj) {
                    this.f8026a.m11086o((Moment) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: i */
    public void m11080i() {
        m11081j(false);
    }

    /* JADX INFO: renamed from: j */
    public void m11081j(final boolean z) {
        this.f9258e.duringCreated(mo11082k()).subscribe(mkd0.H(new e30() { // from class: l.g8h
            public final void call(Object obj) {
                this.f8386a.m11087p(z, (j760) obj);
            }
        }, new e30() { // from class: l.h8h
            public final void call(Object obj) {
                this.f8626a.m11088q((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k */
    public abstract c<j760<Links, List<MomentActivity>>> mo11082k();

    /* JADX INFO: renamed from: l */
    public String m11083l() {
        Links links = this.f9256c;
        if (links == null || TextUtils.isEmpty(links.next)) {
            return "";
        }
        return "&" + this.f9256c.next;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public String m11084m() {
        String strM11083l = m11083l();
        StringBuilder sb = new StringBuilder();
        sb.append(m11083l());
        sb.append(TextUtils.isEmpty(strM11083l) ? m11085n() : "");
        return sb.toString();
    }

    /* JADX INFO: renamed from: n */
    public String m11085n() {
        return "&sort=unread";
    }

    @Override // p007l.qpl
    public void next() {
        if (TextUtils.isEmpty(m11083l()) || m11078g()) {
            return;
        }
        m11091t();
        m11080i();
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m11086o(final Moment moment) {
        int iG = vwb.G(this.f9255b, new w9j() { // from class: l.i8h
            public final Object call(Object obj) {
                MomentActivity momentActivity = (MomentActivity) obj;
                return Boolean.valueOf(momentActivity != null && momentActivity.reference.f693id.equals(((DbObject) moment).id));
            }
        });
        if (iG != -1) {
            this.f9255b.remove(iG);
            m10070b().mo2960z0(this.f9255b, this.f9256c);
        }
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m11087p(boolean z, j760 j760Var) {
        if (z) {
            this.f9255b.clear();
        }
        this.f9255b.addAll((Collection) j760Var.b);
        this.f9256c = (Links) j760Var.a;
        m10070b().mo2960z0(this.f9255b, (Links) j760Var.a);
        m11090s();
    }

    @Override // p007l.qpl
    public void previous() {
        this.f9256c = null;
        m11081j(true);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m11088q(Throwable th) {
        th.printStackTrace();
        m10070b().mo2959a(th);
        m11090s();
    }

    /* JADX INFO: renamed from: r */
    public boolean mo11089r() {
        return true;
    }

    /* JADX INFO: renamed from: s */
    public void m11090s() {
        this.f9257d = false;
    }

    /* JADX INFO: renamed from: t */
    public void m11091t() {
        this.f9257d = true;
    }
}
