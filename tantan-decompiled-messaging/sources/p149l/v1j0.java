package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes12.dex */
public class v1j0 extends AbstractC16545e6<TopicMoment> {

    /* JADX INFO: renamed from: f */
    public e30<o6e0<TopicMoment>> f179257f;

    /* JADX INFO: renamed from: g */
    public v9j<C22306c<j760<Links, List<TopicMoment>>>> f179258g;

    /* JADX INFO: renamed from: h */
    public C22306c<j760<Links, List<TopicMoment>>> f179259h;

    /* JADX INFO: renamed from: l.v1j0$a */
    public class C20559a implements C22306c.a<j760<Links, List<TopicMoment>>> {
        public C20559a() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(z3g0<? super j760<Links, List<TopicMoment>>> z3g0Var) {
            j760<Links, List<TopicMoment>> j760VarM221515e = FeedModule.f38855d.m209440d8().m221515e();
            if (NullChecker.m81303a(j760VarM221515e)) {
                z3g0Var.m132487l(j760VarM221515e);
            } else {
                z3g0Var.m132487l(new j760(null, new ArrayList()));
            }
        }
    }

    @Override // p149l.AbstractC16545e6
    /* JADX INFO: renamed from: e */
    public C22306c<j760<Links, List<TopicMoment>>> mo114929e(String str) {
        if (!TextUtils.isEmpty(str)) {
            return FeedModule.f38855d.m209438cd(str);
        }
        if (this.f179259h == null && NullChecker.m81303a(this.f179258g)) {
            this.f179259h = this.f179258g.call();
        }
        C22306c<j760<Links, List<TopicMoment>>> c22306c = this.f179259h;
        return c22306c == null ? m196642m() : c22306c;
    }

    @Override // p149l.AbstractC16545e6
    /* JADX INFO: renamed from: k */
    public void mo114935k(o6e0<TopicMoment> o6e0Var) {
        e30<o6e0<TopicMoment>> e30Var = this.f179257f;
        if (e30Var != null) {
            e30Var.call(o6e0Var);
        }
    }

    /* JADX INFO: renamed from: m */
    public C22306c<j760<Links, List<TopicMoment>>> m196642m() {
        return C22306c.create(new C20559a()).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: n */
    public void m196643n(v9j<C22306c<j760<Links, List<TopicMoment>>>> v9jVar) {
        this.f179258g = v9jVar;
    }

    /* JADX INFO: renamed from: o */
    public void m196644o(e30<o6e0<TopicMoment>> e30Var) {
        this.f179257f = e30Var;
    }
}
