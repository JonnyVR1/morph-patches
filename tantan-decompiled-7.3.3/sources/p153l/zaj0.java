package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes13.dex */
public class zaj0 extends AbstractC15937b6<TopicMoment> {

    /* JADX INFO: renamed from: f */
    public y20<tee0<TopicMoment>> f203575f;

    /* JADX INFO: renamed from: g */
    public pcj<C22421c<pf60<Links, List<TopicMoment>>>> f203576g;

    /* JADX INFO: renamed from: h */
    public C22421c<pf60<Links, List<TopicMoment>>> f203577h;

    /* JADX INFO: renamed from: l.zaj0$a */
    public class C21787a implements C22421c.a<pf60<Links, List<TopicMoment>>> {
        public C21787a() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(gcg0<? super pf60<Links, List<TopicMoment>>> gcg0Var) {
            pf60<Links, List<TopicMoment>> pf60VarM222761e = FeedModule.f39703d.m145681d8().m222761e();
            if (NullChecker.m82486a(pf60VarM222761e)) {
                gcg0Var.m137019l(pf60VarM222761e);
            } else {
                gcg0Var.m137019l(new pf60(null, new ArrayList()));
            }
        }
    }

    @Override // p153l.AbstractC15937b6
    /* JADX INFO: renamed from: e */
    public C22421c<pf60<Links, List<TopicMoment>>> mo102681e(String str) {
        if (!TextUtils.isEmpty(str)) {
            return FeedModule.f39703d.m145679cd(str);
        }
        if (this.f203577h == null && NullChecker.m82486a(this.f203576g)) {
            this.f203577h = this.f203576g.call();
        }
        C22421c<pf60<Links, List<TopicMoment>>> c22421c = this.f203577h;
        return c22421c == null ? m219126m() : c22421c;
    }

    @Override // p153l.AbstractC15937b6
    /* JADX INFO: renamed from: k */
    public void mo102687k(tee0<TopicMoment> tee0Var) {
        y20<tee0<TopicMoment>> y20Var = this.f203575f;
        if (y20Var != null) {
            y20Var.call(tee0Var);
        }
    }

    /* JADX INFO: renamed from: m */
    public C22421c<pf60<Links, List<TopicMoment>>> m219126m() {
        return C22421c.create(new C21787a()).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: n */
    public void m219127n(pcj<C22421c<pf60<Links, List<TopicMoment>>>> pcjVar) {
        this.f203576g = pcjVar;
    }

    /* JADX INFO: renamed from: o */
    public void m219128o(y20<tee0<TopicMoment>> y20Var) {
        this.f203575f = y20Var;
    }
}
