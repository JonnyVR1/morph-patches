package p153l;

import android.text.TextUtils;
import android.util.Pair;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.p058ui.messages.manager.insert.InsertLocalMsgTriggerType;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes3.dex */
public class nvm {

    /* JADX INFO: renamed from: g */
    public static nvm f143813g;

    /* JADX INFO: renamed from: d */
    public kcg0 f143817d;

    /* JADX INFO: renamed from: f */
    public ovb0<InsertLocalMsgTriggerType, Conversation, Message, User> f143819f;

    /* JADX INFO: renamed from: a */
    public List<vwl> f143814a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public List<ovb0<InsertLocalMsgTriggerType, Conversation, Message, User>> f143815b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public C22507a<uxj0> f143816c = C22507a.m222758b();

    /* JADX INFO: renamed from: e */
    public AtomicInteger f143818e = new AtomicInteger(0);

    public nvm() {
        m164897o();
        m164892A();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m164882b(List list, vwl vwlVar, Boolean bool) {
        if (bool.booleanValue()) {
            list.add(vwlVar.mo112939a());
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m164887g(List list, vwl vwlVar, Boolean bool) {
        if (bool.booleanValue()) {
            list.add(vwlVar.mo112939a());
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ C22421c m164889i(boolean z, C22507a c22507a, final List list, final vwl vwlVar, Boolean bool) {
        return z ? c22507a.doOnNext(new y20() { // from class: l.mvm
            @Override // p153l.y20
            public final void call(Object obj) {
                nvm.m164882b(list, vwlVar, (Boolean) obj);
            }
        }) : C22421c.just(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: n */
    public static nvm m164890n() {
        if (f143813g == null) {
            synchronized (nvm.class) {
                try {
                    if (f143813g == null) {
                        f143813g = new nvm();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f143813g;
    }

    /* JADX INFO: renamed from: y */
    public static void m164891y() {
        nvm nvmVar = f143813g;
        if (nvmVar != null) {
            nvmVar.m164907z();
        }
        f143813g = null;
    }

    /* JADX INFO: renamed from: A */
    public final void m164892A() {
        this.f143817d = this.f143816c.doOnNext(new y20() { // from class: l.evm
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f96009a.m164898p((uxj0) obj);
            }
        }).observeOn(fo0.m126432a()).map(new qcj() { // from class: l.fvm
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f101053a.m164899q((uxj0) obj);
            }
        }).observeOn(Schedulers.m222739io()).onBackpressureBuffer(8L).switchMap(new qcj() { // from class: l.gvm
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f106653a.m164900r((Pair) obj);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.hvm
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f111768a.m164901s((uxj0) obj);
            }
        }, new y20() { // from class: l.ivm
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f117097a.m164902t((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j */
    public final void m164893j(InsertLocalMsgTriggerType insertLocalMsgTriggerType, Conversation conversation, Message message, User user) {
        if (insertLocalMsgTriggerType == InsertLocalMsgTriggerType.PAGE_INIT) {
            m164906x(conversation.f56859id);
        }
        ovb0<InsertLocalMsgTriggerType, Conversation, Message, User> ovb0Var = new ovb0<>(insertLocalMsgTriggerType, conversation, message, user);
        InsertLocalMsgTriggerType insertLocalMsgTriggerType2 = ovb0Var.f149248a;
        InsertLocalMsgTriggerType insertLocalMsgTriggerType3 = InsertLocalMsgTriggerType.CONV_MSG_CHANGE;
        if (insertLocalMsgTriggerType2 == insertLocalMsgTriggerType3) {
            if (NullChecker.m82486a(this.f143819f) && insertLocalMsgTriggerType == insertLocalMsgTriggerType3) {
                ovb0<InsertLocalMsgTriggerType, Conversation, Message, User> ovb0Var2 = this.f143819f;
                if (ovb0Var2.f149248a == insertLocalMsgTriggerType) {
                    int i = ovb0Var2.f149249b.f21116mm;
                    int i2 = conversation.f21116mm;
                }
            }
            m164905w();
        }
        if (ovb0Var.f149248a == InsertLocalMsgTriggerType.PAGE_FINISH) {
            m164906x(conversation.f56859id);
        }
        this.f143815b.add(ovb0Var);
        m164896m();
    }

    /* JADX INFO: renamed from: k */
    public void m164894k(Conversation conversation, Message message, User user) {
        m164893j(InsertLocalMsgTriggerType.CONV_MSG_CHANGE, conversation, message, user);
    }

    /* JADX INFO: renamed from: l */
    public final C22421c<uxj0> m164895l(ovb0<InsertLocalMsgTriggerType, Conversation, Message, User> ovb0Var, User user) {
        if (NullChecker.m82486a(ovb0Var)) {
            final boolean z = ovb0Var.f149248a == InsertLocalMsgTriggerType.PAGE_FINISH;
            ArrayList<vwl> arrayList = new ArrayList();
            for (vwl vwlVar : this.f143814a) {
                if (vwlVar.mo112941c(ovb0Var.f149248a, ovb0Var.f149249b, ovb0Var.f149250c, user)) {
                    arrayList.add(vwlVar);
                }
            }
            if (!jyb.m147479J(arrayList)) {
                final ArrayList arrayList2 = new ArrayList();
                C22421c<Boolean> c22421cDoOnNext = null;
                for (final vwl vwlVar2 : arrayList) {
                    final C22507a<Boolean> c22507aM222758b = C22507a.m222758b();
                    User user2 = user;
                    vwlVar2.mo112940b(ovb0Var.f149249b, ovb0Var.f149250c, ovb0Var.f149251d, user2, ovb0Var.f149248a, arrayList2, c22507aM222758b);
                    c22421cDoOnNext = c22421cDoOnNext == null ? c22507aM222758b.doOnNext(new y20() { // from class: l.jvm
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            nvm.m164887g(arrayList2, vwlVar2, (Boolean) obj);
                        }
                    }) : c22421cDoOnNext.switchMap(new qcj() { // from class: l.kvm
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return nvm.m164889i(z, c22507aM222758b, arrayList2, vwlVar2, (Boolean) obj);
                        }
                    });
                    user = user2;
                }
                return c22421cDoOnNext.map(new qcj() { // from class: l.lvm
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return uxj0.f181467a;
                    }
                });
            }
        }
        return C22421c.just(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: m */
    public final synchronized void m164896m() {
        if (!jyb.m147479J(this.f143815b) && this.f143818e.get() == 0) {
            this.f143816c.m137019l(uxj0.f181467a);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m164897o() {
        User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
        if (!IntlCountryCodeController.m29114k()) {
            this.f143814a.add(new cwv());
        }
        if (gta.m132210e().m132214d().mo34950xh() && !userM116593na.isNewUserIn24H()) {
            this.f143814a.add(new zvv());
        }
        if (h39.m133425N()) {
            this.f143814a.add(new gwv());
        }
        if (NullChecker.m82486a(h39.m133444h()) && h39.m133444h().enable) {
            this.f143814a.add(new dwv());
        }
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m164898p(uxj0 uxj0Var) {
        this.f143818e.set(1);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Pair m164899q(uxj0 uxj0Var) {
        ovb0<InsertLocalMsgTriggerType, Conversation, Message, User> ovb0VarRemove;
        if (jyb.m147479J(this.f143815b)) {
            ovb0VarRemove = null;
        } else {
            ovb0VarRemove = this.f143815b.remove(0);
            this.f143819f = ovb0VarRemove;
        }
        return Pair.create(ovb0VarRemove, CoreModule.f18264c.f20381e0.m116593na());
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ C22421c m164900r(Pair pair) {
        return m164895l((ovb0) pair.first, (User) pair.second);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m164901s(uxj0 uxj0Var) {
        this.f143818e.set(0);
        m164896m();
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m164902t(Throwable th) {
        this.f143818e.set(0);
        m164896m();
    }

    /* JADX INFO: renamed from: u */
    public void m164903u(Conversation conversation) {
        m164893j(InsertLocalMsgTriggerType.PAGE_FINISH, conversation, null, null);
    }

    /* JADX INFO: renamed from: v */
    public void m164904v(Conversation conversation, Message message, User user) {
        m164893j(InsertLocalMsgTriggerType.PAGE_INIT, conversation, message, user);
    }

    /* JADX INFO: renamed from: w */
    public final void m164905w() {
        Iterator<ovb0<InsertLocalMsgTriggerType, Conversation, Message, User>> it = this.f143815b.iterator();
        while (it.hasNext()) {
            if (it.next().f149248a == InsertLocalMsgTriggerType.CONV_MSG_CHANGE) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m164906x(String str) {
        InsertLocalMsgTriggerType insertLocalMsgTriggerType;
        Iterator<ovb0<InsertLocalMsgTriggerType, Conversation, Message, User>> it = this.f143815b.iterator();
        while (it.hasNext()) {
            ovb0<InsertLocalMsgTriggerType, Conversation, Message, User> next = it.next();
            if (next.f149248a == InsertLocalMsgTriggerType.CONV_MSG_CHANGE) {
                it.remove();
            } else if (TextUtils.equals(str, next.f149249b.f56859id) && ((insertLocalMsgTriggerType = next.f149248a) == InsertLocalMsgTriggerType.PAGE_FINISH || insertLocalMsgTriggerType == InsertLocalMsgTriggerType.PAGE_INIT)) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m164907z() {
        psd0.m173633z(this.f143817d);
    }
}
