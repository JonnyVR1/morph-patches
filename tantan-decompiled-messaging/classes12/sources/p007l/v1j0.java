package p007l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.data.Links;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.j760;
import l.mkd0;
import l.v9j;
import l.z3g0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class v1j0 extends AbstractC2366e6<TopicMoment> {

    /* JADX INFO: renamed from: f */
    public e30<o6e0<TopicMoment>> f14020f;

    /* JADX INFO: renamed from: g */
    public v9j<c<j760<Links, List<TopicMoment>>>> f14021g;

    /* JADX INFO: renamed from: h */
    public c<j760<Links, List<TopicMoment>>> f14022h;

    /* JADX INFO: renamed from: l.v1j0$a */
    public class C2519a implements c.a<j760<Links, List<TopicMoment>>> {
        public C2519a() {
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

    @Override // p007l.AbstractC2366e6
    /* JADX INFO: renamed from: e */
    public c<j760<Links, List<TopicMoment>>> mo9630e(String str) {
        if (!TextUtils.isEmpty(str)) {
            return FeedModule.f316d.m16619cd(str);
        }
        if (this.f14022h == null && NullChecker.a(this.f14021g)) {
            this.f14022h = (c) this.f14021g.call();
        }
        c<j760<Links, List<TopicMoment>>> cVar = this.f14022h;
        return cVar == null ? m15276m() : cVar;
    }

    @Override // p007l.AbstractC2366e6
    /* JADX INFO: renamed from: k */
    public void mo9636k(o6e0<TopicMoment> o6e0Var) {
        e30<o6e0<TopicMoment>> e30Var = this.f14020f;
        if (e30Var != null) {
            e30Var.call(o6e0Var);
        }
    }

    /* JADX INFO: renamed from: m */
    public c<j760<Links, List<TopicMoment>>> m15276m() {
        return c.create(new C2519a()).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: n */
    public void m15277n(v9j<c<j760<Links, List<TopicMoment>>>> v9jVar) {
        this.f14021g = v9jVar;
    }

    /* JADX INFO: renamed from: o */
    public void m15278o(e30<o6e0<TopicMoment>> e30Var) {
        this.f14020f = e30Var;
    }
}
