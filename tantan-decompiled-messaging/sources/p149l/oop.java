package p149l;

import com.p046p1.mobile.putong.live.base.apibean.IntlVoiceLiveActivitiesCellBean;
import com.p046p1.mobile.putong.live.external.intl.view.widgets.IntlVoiceActivitiesInChatView;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes13.dex */
public class oop {

    /* JADX INFO: renamed from: a */
    public IntlVoiceActivitiesInChatView f144899a;

    /* JADX INFO: renamed from: b */
    public c4g0 f144900b;

    /* JADX INFO: renamed from: c */
    public wp1<Object> f144901c;

    /* JADX INFO: renamed from: d */
    public mcr f144902d;

    public oop(IntlVoiceActivitiesInChatView intlVoiceActivitiesInChatView, mcr mcrVar, wp1<Object> wp1Var) {
        this.f144899a = intlVoiceActivitiesInChatView;
        this.f144901c = wp1Var;
        this.f144902d = mcrVar;
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m165276c(AtomicInteger atomicInteger, int i, List list, long j, Long l2) {
        int andIncrement = atomicInteger.getAndIncrement() + 1;
        if (andIncrement >= i) {
            andIncrement = 0;
        }
        atomicInteger.set(andIncrement);
        this.f144899a.m70397j0((IntlVoiceLiveActivitiesCellBean.RelationUser) list.get(andIncrement), true, i, j);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m165277d(Throwable th) {
        this.f144899a.m70396i0();
        mkd0.m154992z(this.f144900b);
    }

    /* JADX INFO: renamed from: e */
    public void m165278e() {
        m165281h();
    }

    /* JADX INFO: renamed from: f */
    public void m165279f() {
        IntlVoiceLiveActivitiesCellBean intlVoiceLiveActivitiesCellBeanM159635q = ((nj3) s9s.m182763m(gld0.f103312b)).m159635q();
        m165281h();
        if (intlVoiceLiveActivitiesCellBeanM159635q == null) {
            this.f144899a.m70396i0();
            return;
        }
        if (vwb.m200296J(intlVoiceLiveActivitiesCellBeanM159635q.getActivities())) {
            this.f144899a.m70396i0();
        } else if (intlVoiceLiveActivitiesCellBeanM159635q.getActivities().size() > 1) {
            m165280g(intlVoiceLiveActivitiesCellBeanM159635q.getActivities(), this.f144901c, this.f144902d, intlVoiceLiveActivitiesCellBeanM159635q.getUpdatedTime());
        } else {
            this.f144899a.m70398k0(intlVoiceLiveActivitiesCellBeanM159635q.getActivities().get(0), intlVoiceLiveActivitiesCellBeanM159635q.getUpdatedTime());
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m165280g(final List<IntlVoiceLiveActivitiesCellBean.RelationUser> list, wp1<Object> wp1Var, mcr mcrVar, final long j) {
        if (vwb.m200296J(list)) {
            mkd0.m154992z(this.f144900b);
            return;
        }
        final AtomicInteger atomicInteger = new AtomicInteger();
        final int size = list.size();
        IntlVoiceLiveActivitiesCellBean.RelationUser relationUser = list.get(0);
        this.f144899a.m70397j0(relationUser, false, size, j);
        mkd0.m154992z(this.f144900b);
        this.f144900b = wp1Var.mo67374c(mcrVar, C22306c.interval(3L, TimeUnit.SECONDS)).observeOn(jo0.m142408a()).subscribe(ffw.m121194e(new e30() { // from class: l.mop
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f134930a.m165276c(atomicInteger, size, list, j, (Long) obj);
            }
        }, new e30() { // from class: l.nop
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f139858a.m165277d((Throwable) obj);
            }
        }));
        this.f144899a.m70388a0(false, relationUser);
    }

    /* JADX INFO: renamed from: h */
    public final void m165281h() {
        mkd0.m154992z(this.f144900b);
    }
}
