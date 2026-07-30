package p007l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.data.Links;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.newui.mediapicker.post.C2090b;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.j760;
import l.mkd0;
import l.vwb;
import l.z3g0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class u1j0 {

    /* JADX INFO: renamed from: a */
    public Act f13494a;

    /* JADX INFO: renamed from: b */
    public C2090b f13495b;

    /* JADX INFO: renamed from: c */
    public String f13496c;

    /* JADX INFO: renamed from: d */
    public List<TopicMoment> f13497d;

    /* JADX INFO: renamed from: e */
    public v1j0 f13498e;

    /* JADX INFO: renamed from: f */
    public c<j760<Links, List<TopicMoment>>> f13499f = c.create(new C2503a()).compose(mkd0.C());

    /* JADX INFO: renamed from: l.u1j0$a */
    public class C2503a implements c.a<j760<Links, List<TopicMoment>>> {
        public C2503a() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(z3g0<? super j760<Links, List<TopicMoment>>> z3g0Var) {
            j760 j760Var = (j760) FeedModule.f316d.m16621d8().e();
            if (NullChecker.a(j760Var)) {
                z3g0Var.onNext(j760Var);
            } else {
                z3g0Var.onNext(new j760((Object) null, new ArrayList()));
            }
        }
    }

    public u1j0(final Act act, C2090b c2090b) {
        this.f13494a = act;
        this.f13495b = c2090b;
        v1j0 v1j0Var = new v1j0();
        this.f13498e = v1j0Var;
        v1j0Var.m15278o(new e30() { // from class: l.t1j0
            public final void call(Object obj) {
                this.f13159a.m14709d(act, (o6e0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public void m14707b(String str) {
        if (TextUtils.equals(this.f13496c, str)) {
            return;
        }
        this.f13496c = str;
        if (!TextUtils.isEmpty(str)) {
            this.f13498e.m9634i(this.f13496c);
            return;
        }
        if (this.f13497d == null) {
            this.f13497d = new ArrayList();
        }
        this.f13495b.m3939y1(this.f13497d);
    }

    /* JADX INFO: renamed from: c */
    public c<j760<Links, List<TopicMoment>>> m14708c() {
        return this.f13499f;
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m14709d(Act act, o6e0 o6e0Var) {
        if (act.isFinishing() || act.isDestroyed() || !NullChecker.a(o6e0Var) || !TextUtils.equals(this.f13496c, o6e0Var.f11355c)) {
            return;
        }
        m14711f(this.f13496c, (List) o6e0Var.f11354b.b);
    }

    /* JADX INFO: renamed from: e */
    public void m14710e(String str, List<TopicMoment> list) {
        m14711f(str, list);
    }

    /* JADX INFO: renamed from: f */
    public final void m14711f(String str, List<TopicMoment> list) {
        if (vwb.J(list)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (list.size() > 5) {
            arrayList.addAll(list.subList(0, 5));
        } else {
            arrayList.addAll(list);
        }
        TopicMoment topicMomentNew_ = TopicMoment.new_();
        topicMomentNew_.name = this.f13494a.getResources().getString(R$string.f521g0);
        arrayList.add(0, topicMomentNew_);
        this.f13495b.m3936w1(str, arrayList);
    }

    /* JADX INFO: renamed from: g */
    public void m14712g(List<TopicMoment> list) {
        this.f13497d = list;
    }
}
