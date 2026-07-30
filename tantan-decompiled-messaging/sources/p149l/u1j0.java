package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.newui.mediapicker.post.C11246b;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes12.dex */
public class u1j0 {

    /* JADX INFO: renamed from: a */
    public Act f173021a;

    /* JADX INFO: renamed from: b */
    public C11246b f173022b;

    /* JADX INFO: renamed from: c */
    public String f173023c;

    /* JADX INFO: renamed from: d */
    public List<TopicMoment> f173024d;

    /* JADX INFO: renamed from: e */
    public v1j0 f173025e;

    /* JADX INFO: renamed from: f */
    public C22306c<j760<Links, List<TopicMoment>>> f173026f = C22306c.create(new C20335a()).compose(mkd0.m154951C());

    /* JADX INFO: renamed from: l.u1j0$a */
    public class C20335a implements C22306c.a<j760<Links, List<TopicMoment>>> {
        public C20335a() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(z3g0<? super j760<Links, List<TopicMoment>>> z3g0Var) {
            j760<Links, List<TopicMoment>> j760VarM221515e = FeedModule.f38855d.m209440d8().m221515e();
            if (NullChecker.m81303a(j760VarM221515e)) {
                z3g0Var.onNext(j760VarM221515e);
            } else {
                z3g0Var.onNext(new j760(null, new ArrayList()));
            }
        }
    }

    public u1j0(final Act act, C11246b c11246b) {
        this.f173021a = act;
        this.f173022b = c11246b;
        v1j0 v1j0Var = new v1j0();
        this.f173025e = v1j0Var;
        v1j0Var.m196644o(new e30() { // from class: l.t1j0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f167351a.m191419d(act, (o6e0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public void m191417b(String str) {
        if (TextUtils.equals(this.f173023c, str)) {
            return;
        }
        this.f173023c = str;
        if (!TextUtils.isEmpty(str)) {
            this.f173025e.m114933i(this.f173023c);
            return;
        }
        if (this.f173024d == null) {
            this.f173024d = new ArrayList();
        }
        this.f173022b.m62930y1(this.f173024d);
    }

    /* JADX INFO: renamed from: c */
    public C22306c<j760<Links, List<TopicMoment>>> m191418c() {
        return this.f173026f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m191419d(Act act, o6e0 o6e0Var) {
        if (act.isFinishing() || act.isDestroyed() || !NullChecker.m81303a(o6e0Var) || !TextUtils.equals(this.f173023c, o6e0Var.f142342c)) {
            return;
        }
        m191421f(this.f173023c, (List) o6e0Var.f142341b.f116565b);
    }

    /* JADX INFO: renamed from: e */
    public void m191420e(String str, List<TopicMoment> list) {
        m191421f(str, list);
    }

    /* JADX INFO: renamed from: f */
    public final void m191421f(String str, List<TopicMoment> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (list.size() > 5) {
            arrayList.addAll(list.subList(0, 5));
        } else {
            arrayList.addAll(list);
        }
        TopicMoment topicMomentNew_ = TopicMoment.new_();
        topicMomentNew_.name = this.f173021a.getResources().getString(R$string.f39060g0);
        arrayList.add(0, topicMomentNew_);
        this.f173022b.m62927w1(str, arrayList);
    }

    /* JADX INFO: renamed from: g */
    public void m191422g(List<TopicMoment> list) {
        this.f173024d = list;
    }
}
