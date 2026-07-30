package p003l;

import android.text.TextUtils;
import android.util.Pair;
import com.p000p1.mobile.putong.core.p001ui.messages.manager.insert.InsertLocalMsgTriggerType;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import l.knb0;
import l.mkd0;
import l.roj0;
import l.ura;
import l.vwb;
import l.y19;
import p014rx.C1099c;
import p014rx.schedulers.Schedulers;
import p014rx.subjects.C1185a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class mtm {

    /* JADX INFO: renamed from: g */
    public static mtm f5759g;

    /* JADX INFO: renamed from: d */
    public c4g0 f5763d;

    /* JADX INFO: renamed from: f */
    public knb0<InsertLocalMsgTriggerType, Conversation, Message, User> f5765f;

    /* JADX INFO: renamed from: a */
    public List<hul> f5760a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public List<knb0<InsertLocalMsgTriggerType, Conversation, Message, User>> f5761b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public C1185a<roj0> f5762c = C1185a.m9969b();

    /* JADX INFO: renamed from: e */
    public AtomicInteger f5764e = new AtomicInteger(0);

    public mtm() {
        m6485o();
        m6480A();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m6470b(List list, hul hulVar, Boolean bool) {
        if (bool.booleanValue()) {
            list.add(hulVar.mo3175a());
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m6475g(List list, hul hulVar, Boolean bool) {
        if (bool.booleanValue()) {
            list.add(hulVar.mo3175a());
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ C1099c m6477i(boolean z, C1185a c1185a, final List list, final hul hulVar, Boolean bool) {
        return z ? c1185a.doOnNext(new e30() { // from class: l.ltm
            @Override // p003l.e30
            public final void call(Object obj) {
                mtm.m6470b(list, hulVar, (Boolean) obj);
            }
        }) : C1099c.just(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: n */
    public static mtm m6478n() {
        if (f5759g == null) {
            synchronized (mtm.class) {
                try {
                    if (f5759g == null) {
                        f5759g = new mtm();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f5759g;
    }

    /* JADX INFO: renamed from: y */
    public static void m6479y() {
        mtm mtmVar = f5759g;
        if (mtmVar != null) {
            mtmVar.m6495z();
        }
        f5759g = null;
    }

    /* JADX INFO: renamed from: A */
    public final void m6480A() {
        this.f5763d = this.f5762c.doOnNext(new e30() { // from class: l.dtm
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f3111a.m6486p((roj0) obj);
            }
        }).observeOn(jo0.m5414a()).map(new w9j() { // from class: l.etm
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return this.f3376a.m6487q((roj0) obj);
            }
        }).observeOn(Schedulers.m9950io()).onBackpressureBuffer(8L).switchMap(new w9j() { // from class: l.ftm
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return this.f3712a.m6488r((Pair) obj);
            }
        }).subscribe((m250) mkd0.H(new e30() { // from class: l.gtm
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f4008a.m6489s((roj0) obj);
            }
        }, new e30() { // from class: l.htm
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f4276a.m6490t((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j */
    public final void m6481j(InsertLocalMsgTriggerType insertLocalMsgTriggerType, Conversation conversation, Message message, User user) {
        if (insertLocalMsgTriggerType == InsertLocalMsgTriggerType.PAGE_INIT) {
            m6494x(((DbObject) conversation).id);
        }
        knb0<InsertLocalMsgTriggerType, Conversation, Message, User> knb0Var = new knb0<>(insertLocalMsgTriggerType, conversation, message, user);
        Object obj = knb0Var.a;
        InsertLocalMsgTriggerType insertLocalMsgTriggerType2 = InsertLocalMsgTriggerType.CONV_MSG_CHANGE;
        if (obj == insertLocalMsgTriggerType2) {
            if (NullChecker.a(this.f5765f) && insertLocalMsgTriggerType == insertLocalMsgTriggerType2) {
                knb0<InsertLocalMsgTriggerType, Conversation, Message, User> knb0Var2 = this.f5765f;
                if (knb0Var2.a == insertLocalMsgTriggerType) {
                    int i = ((Conversation) knb0Var2.b).mm;
                    int i2 = conversation.mm;
                }
            }
            m6493w();
        }
        if (knb0Var.a == InsertLocalMsgTriggerType.PAGE_FINISH) {
            m6494x(((DbObject) conversation).id);
        }
        this.f5761b.add(knb0Var);
        m6484m();
    }

    /* JADX INFO: renamed from: k */
    public void m6482k(Conversation conversation, Message message, User user) {
        m6481j(InsertLocalMsgTriggerType.CONV_MSG_CHANGE, conversation, message, user);
    }

    /* JADX INFO: renamed from: l */
    public final C1099c<roj0> m6483l(knb0<InsertLocalMsgTriggerType, Conversation, Message, User> knb0Var, User user) {
        if (NullChecker.a(knb0Var)) {
            final boolean z = knb0Var.a == InsertLocalMsgTriggerType.PAGE_FINISH;
            ArrayList<hul> arrayList = new ArrayList();
            for (hul hulVar : this.f5760a) {
                if (hulVar.mo3177c((InsertLocalMsgTriggerType) knb0Var.a, (Conversation) knb0Var.b, (Message) knb0Var.c, user)) {
                    arrayList.add(hulVar);
                }
            }
            if (!vwb.J(arrayList)) {
                final ArrayList arrayList2 = new ArrayList();
                C1099c<Boolean> c1099cDoOnNext = null;
                for (final hul hulVar2 : arrayList) {
                    final C1185a<Boolean> c1185aM9969b = C1185a.m9969b();
                    User user2 = user;
                    hulVar2.mo3176b((Conversation) knb0Var.b, (Message) knb0Var.c, (User) knb0Var.d, user2, (InsertLocalMsgTriggerType) knb0Var.a, arrayList2, c1185aM9969b);
                    c1099cDoOnNext = c1099cDoOnNext == null ? c1185aM9969b.doOnNext(new e30() { // from class: l.itm
                        @Override // p003l.e30
                        public final void call(Object obj) {
                            mtm.m6475g(arrayList2, hulVar2, (Boolean) obj);
                        }
                    }) : c1099cDoOnNext.switchMap(new w9j() { // from class: l.jtm
                        @Override // p003l.w9j
                        public final Object call(Object obj) {
                            return mtm.m6477i(z, c1185aM9969b, arrayList2, hulVar2, (Boolean) obj);
                        }
                    });
                    user = user2;
                }
                return c1099cDoOnNext.map(new w9j() { // from class: l.ktm
                    @Override // p003l.w9j
                    public final Object call(Object obj) {
                        return roj0.a;
                    }
                });
            }
        }
        return C1099c.just(roj0.a);
    }

    /* JADX INFO: renamed from: m */
    public final synchronized void m6484m() {
        if (!vwb.J(this.f5761b) && this.f5764e.get() == 0) {
            this.f5762c.onNext(roj0.a);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m6485o() {
        User userNa = CoreModule.c.e0.na();
        if (!IntlCountryCodeController.k()) {
            this.f5760a.add(new buv());
        }
        if (ura.e().d().xh() && !userNa.isNewUserIn24H()) {
            this.f5760a.add(new ytv());
        }
        if (y19.N()) {
            this.f5760a.add(new fuv());
        }
        if (NullChecker.a(y19.h()) && y19.h().enable) {
            this.f5760a.add(new cuv());
        }
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m6486p(roj0 roj0Var) {
        this.f5764e.set(1);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Pair m6487q(roj0 roj0Var) {
        knb0<InsertLocalMsgTriggerType, Conversation, Message, User> knb0VarRemove;
        if (vwb.J(this.f5761b)) {
            knb0VarRemove = null;
        } else {
            knb0VarRemove = this.f5761b.remove(0);
            this.f5765f = knb0VarRemove;
        }
        return Pair.create(knb0VarRemove, CoreModule.c.e0.na());
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ C1099c m6488r(Pair pair) {
        return m6483l((knb0) pair.first, (User) pair.second);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m6489s(roj0 roj0Var) {
        this.f5764e.set(0);
        m6484m();
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m6490t(Throwable th) {
        this.f5764e.set(0);
        m6484m();
    }

    /* JADX INFO: renamed from: u */
    public void m6491u(Conversation conversation) {
        m6481j(InsertLocalMsgTriggerType.PAGE_FINISH, conversation, null, null);
    }

    /* JADX INFO: renamed from: v */
    public void m6492v(Conversation conversation, Message message, User user) {
        m6481j(InsertLocalMsgTriggerType.PAGE_INIT, conversation, message, user);
    }

    /* JADX INFO: renamed from: w */
    public final void m6493w() {
        Iterator<knb0<InsertLocalMsgTriggerType, Conversation, Message, User>> it = this.f5761b.iterator();
        while (it.hasNext()) {
            if (it.next().a == InsertLocalMsgTriggerType.CONV_MSG_CHANGE) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m6494x(String str) {
        Object obj;
        Iterator<knb0<InsertLocalMsgTriggerType, Conversation, Message, User>> it = this.f5761b.iterator();
        while (it.hasNext()) {
            knb0<InsertLocalMsgTriggerType, Conversation, Message, User> next = it.next();
            if (next.a == InsertLocalMsgTriggerType.CONV_MSG_CHANGE) {
                it.remove();
            } else if (TextUtils.equals(str, ((DbObject) ((Conversation) next.b)).id) && ((obj = next.a) == InsertLocalMsgTriggerType.PAGE_FINISH || obj == InsertLocalMsgTriggerType.PAGE_INIT)) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m6495z() {
        mkd0.z(this.f5763d);
    }
}
