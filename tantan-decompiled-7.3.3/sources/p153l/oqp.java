package p153l;

import com.p051p1.mobile.putong.live.base.apibean.IntlVoiceLiveActivitiesCellBean;
import com.p051p1.mobile.putong.live.external.intl.view.widgets.IntlVoiceActivitiesInChatView;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class oqp {

    /* JADX INFO: renamed from: a */
    public IntlVoiceActivitiesInChatView f148608a;

    /* JADX INFO: renamed from: b */
    public kcg0 f148609b;

    /* JADX INFO: renamed from: c */
    public dq1<Object> f148610c;

    /* JADX INFO: renamed from: d */
    public ner f148611d;

    public oqp(IntlVoiceActivitiesInChatView intlVoiceActivitiesInChatView, ner nerVar, dq1<Object> dq1Var) {
        this.f148608a = intlVoiceActivitiesInChatView;
        this.f148610c = dq1Var;
        this.f148611d = nerVar;
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m168824c(AtomicInteger atomicInteger, int i, List list, long j, Long l2) {
        int andIncrement = atomicInteger.getAndIncrement() + 1;
        if (andIncrement >= i) {
            andIncrement = 0;
        }
        atomicInteger.set(andIncrement);
        this.f148608a.m71580j0((IntlVoiceLiveActivitiesCellBean.RelationUser) list.get(andIncrement), true, i, j);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m168825d(Throwable th) {
        this.f148608a.m71579i0();
        psd0.m173633z(this.f148609b);
    }

    /* JADX INFO: renamed from: e */
    public void m168826e() {
        m168829h();
    }

    /* JADX INFO: renamed from: f */
    public void m168827f() {
        IntlVoiceLiveActivitiesCellBean intlVoiceLiveActivitiesCellBeanM125966q = ((fk3) tbs.m190077m(itd0.f116820b)).m125966q();
        m168829h();
        if (intlVoiceLiveActivitiesCellBeanM125966q == null) {
            this.f148608a.m71579i0();
            return;
        }
        if (jyb.m147479J(intlVoiceLiveActivitiesCellBeanM125966q.getActivities())) {
            this.f148608a.m71579i0();
        } else if (intlVoiceLiveActivitiesCellBeanM125966q.getActivities().size() > 1) {
            m168828g(intlVoiceLiveActivitiesCellBeanM125966q.getActivities(), this.f148610c, this.f148611d, intlVoiceLiveActivitiesCellBeanM125966q.getUpdatedTime());
        } else {
            this.f148608a.m71581k0(intlVoiceLiveActivitiesCellBeanM125966q.getActivities().get(0), intlVoiceLiveActivitiesCellBeanM125966q.getUpdatedTime());
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m168828g(final List<IntlVoiceLiveActivitiesCellBean.RelationUser> list, dq1<Object> dq1Var, ner nerVar, final long j) {
        if (jyb.m147479J(list)) {
            psd0.m173633z(this.f148609b);
            return;
        }
        final AtomicInteger atomicInteger = new AtomicInteger();
        final int size = list.size();
        IntlVoiceLiveActivitiesCellBean.RelationUser relationUser = list.get(0);
        this.f148608a.m71580j0(relationUser, false, size, j);
        psd0.m173633z(this.f148609b);
        this.f148609b = dq1Var.mo68557c(nerVar, C22421c.interval(3L, TimeUnit.SECONDS)).observeOn(fo0.m126432a()).subscribe(dhw.m115826e(new y20() { // from class: l.mqp
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f138119a.m168824c(atomicInteger, size, list, j, (Long) obj);
            }
        }, new y20() { // from class: l.nqp
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f143250a.m168825d((Throwable) obj);
            }
        }));
        this.f148608a.m71571a0(false, relationUser);
    }

    /* JADX INFO: renamed from: h */
    public final void m168829h() {
        psd0.m173633z(this.f148609b);
    }
}
