package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.newui.mediapicker.post.C11409b;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes13.dex */
public class yaj0 {

    /* JADX INFO: renamed from: a */
    public Act f198212a;

    /* JADX INFO: renamed from: b */
    public C11409b f198213b;

    /* JADX INFO: renamed from: c */
    public String f198214c;

    /* JADX INFO: renamed from: d */
    public List<TopicMoment> f198215d;

    /* JADX INFO: renamed from: e */
    public zaj0 f198216e;

    /* JADX INFO: renamed from: f */
    public C22421c<pf60<Links, List<TopicMoment>>> f198217f = C22421c.create(new C21554a()).compose(psd0.m173592C());

    /* JADX INFO: renamed from: l.yaj0$a */
    public class C21554a implements C22421c.a<pf60<Links, List<TopicMoment>>> {
        public C21554a() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(gcg0<? super pf60<Links, List<TopicMoment>>> gcg0Var) {
            pf60<Links, List<TopicMoment>> pf60VarM222761e = FeedModule.f39703d.m145681d8().m222761e();
            if (NullChecker.m82486a(pf60VarM222761e)) {
                gcg0Var.onNext(pf60VarM222761e);
            } else {
                gcg0Var.onNext(new pf60(null, new ArrayList()));
            }
        }
    }

    public yaj0(final Act act, C11409b c11409b) {
        this.f198212a = act;
        this.f198213b = c11409b;
        zaj0 zaj0Var = new zaj0();
        this.f198216e = zaj0Var;
        zaj0Var.m219128o(new y20() { // from class: l.xaj0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f193044a.m214892d(act, (tee0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public void m214890b(String str) {
        if (TextUtils.equals(this.f198214c, str)) {
            return;
        }
        this.f198214c = str;
        if (!TextUtils.isEmpty(str)) {
            this.f198216e.m102685i(this.f198214c);
            return;
        }
        if (this.f198215d == null) {
            this.f198215d = new ArrayList();
        }
        this.f198213b.m64113y1(this.f198215d);
    }

    /* JADX INFO: renamed from: c */
    public C22421c<pf60<Links, List<TopicMoment>>> m214891c() {
        return this.f198217f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m214892d(Act act, tee0 tee0Var) {
        if (act.isFinishing() || act.isDestroyed() || !NullChecker.m82486a(tee0Var) || !TextUtils.equals(this.f198214c, tee0Var.f173807c)) {
            return;
        }
        m214894f(this.f198214c, (List) tee0Var.f173806b.f152157b);
    }

    /* JADX INFO: renamed from: e */
    public void m214893e(String str, List<TopicMoment> list) {
        m214894f(str, list);
    }

    /* JADX INFO: renamed from: f */
    public final void m214894f(String str, List<TopicMoment> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (list.size() > 5) {
            arrayList.addAll(list.subList(0, 5));
        } else {
            arrayList.addAll(list);
        }
        TopicMoment topicMomentNew_ = TopicMoment.new_();
        topicMomentNew_.name = this.f198212a.getResources().getString(R$string.f39908g0);
        arrayList.add(0, topicMomentNew_);
        this.f198213b.m64110w1(str, arrayList);
    }

    /* JADX INFO: renamed from: g */
    public void m214895g(List<TopicMoment> list) {
        this.f198215d = list;
    }
}
