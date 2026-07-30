package p009l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.newui.main.NewMainAct;
import com.p000p1.mobile.putong.newui.main.base.TabName;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.ChatHeatActionData;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.IceBreakQuestion;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageType;
import com.p1.mobile.putong.core.data.Sticker;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collection;
import java.util.HashSet;
import l.c30;
import l.ccx;
import l.d30;
import l.e30;
import l.e51;
import l.j2e0;
import l.lsi0;
import l.mkd0;
import l.osi0;
import l.qib0;
import l.roj0;
import l.su4;
import l.v930;
import l.v9b;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class tz00 {

    /* JADX INFO: renamed from: l.tz00$a */
    public class C1210a implements w9j<User, Boolean> {
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(User user) {
            return Boolean.valueOf(NullChecker.a(user));
        }
    }

    /* JADX INFO: renamed from: l.tz00$b */
    public class C1211b implements w9j<roj0, User> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f20917a;

        public C1211b(String str) {
            this.f20917a = str;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public User call(roj0 roj0Var) {
            return CoreModule.c.e0.Pa(this.f20917a);
        }
    }

    /* JADX INFO: renamed from: l.tz00$c */
    public class C1212c implements e30<User> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f20918a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f20919b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f20920c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Runnable f20921d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Runnable f20922e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ String f20923f;

        public C1212c(Act act, String str, boolean z, Runnable runnable, Runnable runnable2, String str2) {
            this.f20918a = act;
            this.f20919b = str;
            this.f20920c = z;
            this.f20921d = runnable;
            this.f20922e = runnable2;
            this.f20923f = str2;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(User user) {
            if (c30.f(this.f20918a)) {
                tz00.m22704j(this.f20918a, user, this.f20919b, this.f20920c, this.f20921d, this.f20922e, this.f20923f);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m22695a(Conversation conversation) {
        Conversation conversationClone = conversation.clone();
        conversationClone.read = Boolean.TRUE;
        CoreModule.c.f0.mq(conversationClone);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m22698d(String str, User user, Message message, Act act, Runnable runnable, Throwable th) {
        if (TextUtils.equals(str, "QuickGreeting")) {
            v9b.b(act, psm.m20628b(user, message));
        } else if (su4.f(th)) {
            su4.e(act, th, ChatHeatActionData.ExclusiveAction.CHECK);
        } else if (TantanException.Client.TantanForbidden.isIllegalContent(th)) {
            CoreModule.c.f0.Of(((DbObject) message).id);
            osi0.f(R.string.J7);
        } else {
            ccx.f(R.string.yh, user.fp().profileSmall());
        }
        if (NullChecker.a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m22700f(String str, User user, Message message, Act act, Runnable runnable, roj0 roj0Var) {
        if (TextUtils.equals(str, "QuickGreeting")) {
            v9b.b(act, psm.m20629c(user, message));
        } else {
            Act actD = c30.d();
            if (!NullChecker.a(actD) || !(actD instanceof NewMainAct) || v930.h() != TabName.Card) {
                lsi0.y("消息已发送");
            }
            if (!j2e0.k()) {
                act.startActivity(NewMainAct.m3761I5(act, null));
            }
        }
        if (NullChecker.a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m22701g(final Act act, final User user, String str, final Runnable runnable, final Runnable runnable2, final String str2, IceBreakQuestion iceBreakQuestion) {
        if (act == null || user == null || TextUtils.isEmpty(str)) {
            return;
        }
        final Conversation conversationXe = CoreModule.c.f0.Xe(((DbObject) user).id);
        if (NullChecker.a(conversationXe)) {
            e51.y(new Runnable() { // from class: l.oz00
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.c.U.a(new d30() { // from class: l.sz00
                        public final void call() {
                            tz00.m22695a(conversation);
                        }
                    });
                }
            });
        }
        final Message message = new Message();
        message.value = str;
        message.messageType = MessageType.get("text");
        act.duringCreated(CoreModule.c.f0.Fn(((DbObject) user).id, message, (Sticker) null, false, false).flatMap(new w9j() { // from class: l.pz00
            public final Object call(Object obj) {
                return CoreModule.c.f0.Fo();
            }
        })).subscribe(mkd0.H(new e30() { // from class: l.qz00
            public final void call(Object obj) {
                tz00.m22700f(str2, user, message, act, runnable, (roj0) obj);
            }
        }, new e30() { // from class: l.rz00
            public final void call(Object obj) {
                tz00.m22698d(str2, user, message, act, runnable2, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h */
    public static void m22702h(Act act, User user, String str, boolean z, Runnable runnable) {
        m22704j(act, user, str, z, runnable, runnable, "");
    }

    /* JADX INFO: renamed from: i */
    public static void m22703i(Act act, User user, String str, boolean z, Runnable runnable, IceBreakQuestion iceBreakQuestion) {
        m22705k(act, user, str, z, runnable, runnable, "", iceBreakQuestion);
    }

    /* JADX INFO: renamed from: j */
    public static void m22704j(Act act, User user, String str, boolean z, Runnable runnable, Runnable runnable2, String str2) {
        m22705k(act, user, str, z, runnable, runnable2, str2, null);
    }

    /* JADX INFO: renamed from: k */
    public static void m22705k(final Act act, final User user, final String str, boolean z, final Runnable runnable, final Runnable runnable2, final String str2, final IceBreakQuestion iceBreakQuestion) {
        if (act == null || user == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (!z || !qib0.Z.K(str)) {
            m22701g(act, user, str, runnable, runnable2, str2, iceBreakQuestion);
            return;
        }
        act.dialog().E0(R.string.zi).D(R.string.xi).k0(R.string.wi).t0(R.string.yi, new Runnable() { // from class: l.nz00
            @Override // java.lang.Runnable
            public final void run() {
                tz00.m22701g(act, user, str, runnable, runnable2, str2, iceBreakQuestion);
            }
        }).z0();
        HashSet hashSet = new HashSet((Collection) MessagesAct.r.get());
        hashSet.add(((DbObject) user).id);
        MessagesAct.r.put(hashSet);
    }

    /* JADX INFO: renamed from: l */
    public static void m22706l(Act act, String str, String str2, boolean z, Runnable runnable) {
        m22707m(act, str, str2, z, runnable, runnable, "");
    }

    /* JADX INFO: renamed from: m */
    public static void m22707m(Act act, String str, String str2, boolean z, Runnable runnable, Runnable runnable2, String str3) {
        if (act == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        act.duringCreated(CoreModule.c.f0.Fo()).map(new C1211b(str)).filter(new C1210a()).subscribe(mkd0.H(new C1212c(act, str2, z, runnable, runnable2, str3), new C1213d()));
    }

    /* JADX INFO: renamed from: l.tz00$d */
    public class C1213d implements e30<Throwable> {
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
        }
    }
}
