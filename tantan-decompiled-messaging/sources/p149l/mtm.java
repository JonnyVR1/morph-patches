package p149l;

import android.text.TextUtils;
import android.util.Pair;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.p053ui.messages.manager.insert.InsertLocalMsgTriggerType;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes3.dex */
public class mtm {

    /* JADX INFO: renamed from: g */
    public static mtm f135618g;

    /* JADX INFO: renamed from: d */
    public c4g0 f135622d;

    /* JADX INFO: renamed from: f */
    public knb0<InsertLocalMsgTriggerType, Conversation, Message, User> f135624f;

    /* JADX INFO: renamed from: a */
    public List<hul> f135619a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public List<knb0<InsertLocalMsgTriggerType, Conversation, Message, User>> f135620b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public C22392a<roj0> f135621c = C22392a.m221512b();

    /* JADX INFO: renamed from: e */
    public AtomicInteger f135623e = new AtomicInteger(0);

    public mtm() {
        m156270o();
        m156265A();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m156255b(List list, hul hulVar, Boolean bool) {
        if (bool.booleanValue()) {
            list.add(hulVar.mo103994a());
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m156260g(List list, hul hulVar, Boolean bool) {
        if (bool.booleanValue()) {
            list.add(hulVar.mo103994a());
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ C22306c m156262i(boolean z, C22392a c22392a, final List list, final hul hulVar, Boolean bool) {
        return z ? c22392a.doOnNext(new e30() { // from class: l.ltm
            @Override // p149l.e30
            public final void call(Object obj) {
                mtm.m156255b(list, hulVar, (Boolean) obj);
            }
        }) : C22306c.just(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: n */
    public static mtm m156263n() {
        if (f135618g == null) {
            synchronized (mtm.class) {
                try {
                    if (f135618g == null) {
                        f135618g = new mtm();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f135618g;
    }

    /* JADX INFO: renamed from: y */
    public static void m156264y() {
        mtm mtmVar = f135618g;
        if (mtmVar != null) {
            mtmVar.m156280z();
        }
        f135618g = null;
    }

    /* JADX INFO: renamed from: A */
    public final void m156265A() {
        this.f135622d = this.f135621c.doOnNext(new e30() { // from class: l.dtm
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f87854a.m156271p((roj0) obj);
            }
        }).observeOn(jo0.m142408a()).map(new w9j() { // from class: l.etm
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f93159a.m156272q((roj0) obj);
            }
        }).observeOn(Schedulers.m221493io()).onBackpressureBuffer(8L).switchMap(new w9j() { // from class: l.ftm
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f99223a.m156273r((Pair) obj);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.gtm
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f104324a.m156274s((roj0) obj);
            }
        }, new e30() { // from class: l.htm
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f109401a.m156275t((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j */
    public final void m156266j(InsertLocalMsgTriggerType insertLocalMsgTriggerType, Conversation conversation, Message message, User user) {
        if (insertLocalMsgTriggerType == InsertLocalMsgTriggerType.PAGE_INIT) {
            m156279x(conversation.f56011id);
        }
        knb0<InsertLocalMsgTriggerType, Conversation, Message, User> knb0Var = new knb0<>(insertLocalMsgTriggerType, conversation, message, user);
        InsertLocalMsgTriggerType insertLocalMsgTriggerType2 = knb0Var.f123873a;
        InsertLocalMsgTriggerType insertLocalMsgTriggerType3 = InsertLocalMsgTriggerType.CONV_MSG_CHANGE;
        if (insertLocalMsgTriggerType2 == insertLocalMsgTriggerType3) {
            if (NullChecker.m81303a(this.f135624f) && insertLocalMsgTriggerType == insertLocalMsgTriggerType3) {
                knb0<InsertLocalMsgTriggerType, Conversation, Message, User> knb0Var2 = this.f135624f;
                if (knb0Var2.f123873a == insertLocalMsgTriggerType) {
                    int i = knb0Var2.f123874b.f20374mm;
                    int i2 = conversation.f20374mm;
                }
            }
            m156278w();
        }
        if (knb0Var.f123873a == InsertLocalMsgTriggerType.PAGE_FINISH) {
            m156279x(conversation.f56011id);
        }
        this.f135620b.add(knb0Var);
        m156269m();
    }

    /* JADX INFO: renamed from: k */
    public void m156267k(Conversation conversation, Message message, User user) {
        m156266j(InsertLocalMsgTriggerType.CONV_MSG_CHANGE, conversation, message, user);
    }

    /* JADX INFO: renamed from: l */
    public final C22306c<roj0> m156268l(knb0<InsertLocalMsgTriggerType, Conversation, Message, User> knb0Var, User user) {
        if (NullChecker.m81303a(knb0Var)) {
            final boolean z = knb0Var.f123873a == InsertLocalMsgTriggerType.PAGE_FINISH;
            ArrayList<hul> arrayList = new ArrayList();
            for (hul hulVar : this.f135619a) {
                if (hulVar.mo103996c(knb0Var.f123873a, knb0Var.f123874b, knb0Var.f123875c, user)) {
                    arrayList.add(hulVar);
                }
            }
            if (!vwb.m200296J(arrayList)) {
                final ArrayList arrayList2 = new ArrayList();
                C22306c<Boolean> c22306cDoOnNext = null;
                for (final hul hulVar2 : arrayList) {
                    final C22392a<Boolean> c22392aM221512b = C22392a.m221512b();
                    User user2 = user;
                    hulVar2.mo103995b(knb0Var.f123874b, knb0Var.f123875c, knb0Var.f123876d, user2, knb0Var.f123873a, arrayList2, c22392aM221512b);
                    c22306cDoOnNext = c22306cDoOnNext == null ? c22392aM221512b.doOnNext(new e30() { // from class: l.itm
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            mtm.m156260g(arrayList2, hulVar2, (Boolean) obj);
                        }
                    }) : c22306cDoOnNext.switchMap(new w9j() { // from class: l.jtm
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            return mtm.m156262i(z, c22392aM221512b, arrayList2, hulVar2, (Boolean) obj);
                        }
                    });
                    user = user2;
                }
                return c22306cDoOnNext.map(new w9j() { // from class: l.ktm
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return roj0.f160388a;
                    }
                });
            }
        }
        return C22306c.just(roj0.f160388a);
    }

    /* JADX INFO: renamed from: m */
    public final synchronized void m156269m() {
        if (!vwb.m200296J(this.f135620b) && this.f135623e.get() == 0) {
            this.f135621c.m132487l(roj0.f160388a);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m156270o() {
        User userM169520na = CoreModule.f17545c.f19639e0.m169520na();
        if (!IntlCountryCodeController.m28115k()) {
            this.f135619a.add(new buv());
        }
        if (ura.m195053e().m195057d().mo33947xh() && !userM169520na.isNewUserIn24H()) {
            this.f135619a.add(new ytv());
        }
        if (y19.m212154N()) {
            this.f135619a.add(new fuv());
        }
        if (NullChecker.m81303a(y19.m212173h()) && y19.m212173h().enable) {
            this.f135619a.add(new cuv());
        }
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m156271p(roj0 roj0Var) {
        this.f135623e.set(1);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Pair m156272q(roj0 roj0Var) {
        knb0<InsertLocalMsgTriggerType, Conversation, Message, User> knb0VarRemove;
        if (vwb.m200296J(this.f135620b)) {
            knb0VarRemove = null;
        } else {
            knb0VarRemove = this.f135620b.remove(0);
            this.f135624f = knb0VarRemove;
        }
        return Pair.create(knb0VarRemove, CoreModule.f17545c.f19639e0.m169520na());
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ C22306c m156273r(Pair pair) {
        return m156268l((knb0) pair.first, (User) pair.second);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m156274s(roj0 roj0Var) {
        this.f135623e.set(0);
        m156269m();
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m156275t(Throwable th) {
        this.f135623e.set(0);
        m156269m();
    }

    /* JADX INFO: renamed from: u */
    public void m156276u(Conversation conversation) {
        m156266j(InsertLocalMsgTriggerType.PAGE_FINISH, conversation, null, null);
    }

    /* JADX INFO: renamed from: v */
    public void m156277v(Conversation conversation, Message message, User user) {
        m156266j(InsertLocalMsgTriggerType.PAGE_INIT, conversation, message, user);
    }

    /* JADX INFO: renamed from: w */
    public final void m156278w() {
        Iterator<knb0<InsertLocalMsgTriggerType, Conversation, Message, User>> it = this.f135620b.iterator();
        while (it.hasNext()) {
            if (it.next().f123873a == InsertLocalMsgTriggerType.CONV_MSG_CHANGE) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m156279x(String str) {
        InsertLocalMsgTriggerType insertLocalMsgTriggerType;
        Iterator<knb0<InsertLocalMsgTriggerType, Conversation, Message, User>> it = this.f135620b.iterator();
        while (it.hasNext()) {
            knb0<InsertLocalMsgTriggerType, Conversation, Message, User> next = it.next();
            if (next.f123873a == InsertLocalMsgTriggerType.CONV_MSG_CHANGE) {
                it.remove();
            } else if (TextUtils.equals(str, next.f123874b.f56011id) && ((insertLocalMsgTriggerType = next.f123873a) == InsertLocalMsgTriggerType.PAGE_FINISH || insertLocalMsgTriggerType == InsertLocalMsgTriggerType.PAGE_INIT)) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m156280z() {
        mkd0.m154992z(this.f135622d);
    }
}
