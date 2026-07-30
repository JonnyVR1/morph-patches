package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.ChatHeatActionData;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.IceBreakQuestion;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashSet;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
public class tz00 {

    /* JADX INFO: renamed from: l.tz00$a */
    public class C20316a implements w9j<User, Boolean> {
        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(User user) {
            return Boolean.valueOf(NullChecker.m81303a(user));
        }
    }

    /* JADX INFO: renamed from: l.tz00$b */
    public class C20317b implements w9j<roj0, User> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f172675a;

        public C20317b(String str) {
            this.f172675a = str;
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public User call(roj0 roj0Var) {
            return CoreModule.f17545c.f19639e0.m169430Pa(this.f172675a);
        }
    }

    /* JADX INFO: renamed from: l.tz00$c */
    public class C20318c implements e30<User> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f172676a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f172677b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f172678c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Runnable f172679d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Runnable f172680e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ String f172681f;

        public C20318c(Act act, String str, boolean z, Runnable runnable, Runnable runnable2, String str2) {
            this.f172676a = act;
            this.f172677b = str;
            this.f172678c = z;
            this.f172679d = runnable;
            this.f172680e = runnable2;
            this.f172681f = str2;
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(User user) {
            if (c30.m104964f(this.f172676a)) {
                tz00.m191128j(this.f172676a, user, this.f172677b, this.f172678c, this.f172679d, this.f172680e, this.f172681f);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m191119a(Conversation conversation) {
        Conversation conversationMo223809clone = conversation.mo223809clone();
        conversationMo223809clone.read = Boolean.TRUE;
        CoreModule.f17545c.f19642f0.m33050mq(conversationMo223809clone);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m191122d(String str, User user, Message message, Act act, Runnable runnable, Throwable th) {
        if (TextUtils.equals(str, "QuickGreeting")) {
            v9b.m197548b(act, psm.m171182b(user, message));
        } else if (su4.m185996f(th)) {
            su4.m185995e(act, th, ChatHeatActionData.ExclusiveAction.CHECK);
        } else if (TantanException.Client.TantanForbidden.isIllegalContent(th)) {
            CoreModule.f17545c.f19642f0.m32750Of(message.f56011id);
            osi0.m165782f(R$string.f17844J7);
        } else {
            ccx.m106209f(R$string.f19096yh, user.m60124fp().profileSmall());
        }
        if (NullChecker.m81303a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m191124f(String str, User user, Message message, Act act, Runnable runnable, roj0 roj0Var) {
        if (TextUtils.equals(str, "QuickGreeting")) {
            v9b.m197548b(act, psm.m171183c(user, message));
        } else {
            Act actM104962d = c30.m104962d();
            if (!NullChecker.m81303a(actM104962d) || !(actM104962d instanceof NewMainAct) || v930.m197534h() != TabName.Card) {
                lsi0.m151595y("消息已发送");
            }
            if (!j2e0.m139444k()) {
                act.startActivity(NewMainAct.m39685I5(act, null));
            }
        }
        if (NullChecker.m81303a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m191125g(final Act act, final User user, String str, final Runnable runnable, final Runnable runnable2, final String str2, IceBreakQuestion iceBreakQuestion) {
        if (act == null || user == null || TextUtils.isEmpty(str)) {
            return;
        }
        final Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(user.f56011id);
        if (NullChecker.m81303a(conversationM32856Xe)) {
            e51.m114774y(new Runnable() { // from class: l.oz00
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f17545c.f19609U.m109085a(new d30() { // from class: l.sz00
                        @Override // p149l.d30
                        public final void call() {
                            tz00.m191119a(conversation);
                        }
                    });
                }
            });
        }
        final Message message = new Message();
        message.value = str;
        message.messageType = MessageType.get("text");
        act.duringCreated((C22306c) CoreModule.f17545c.f19642f0.m32649Fn(user.f56011id, message, null, false, false).flatMap(new w9j() { // from class: l.pz00
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreModule.f17545c.f19642f0.m32650Fo();
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.qz00
            @Override // p149l.e30
            public final void call(Object obj) {
                tz00.m191124f(str2, user, message, act, runnable, (roj0) obj);
            }
        }, new e30() { // from class: l.rz00
            @Override // p149l.e30
            public final void call(Object obj) {
                tz00.m191122d(str2, user, message, act, runnable2, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h */
    public static void m191126h(Act act, User user, String str, boolean z, Runnable runnable) {
        m191128j(act, user, str, z, runnable, runnable, "");
    }

    /* JADX INFO: renamed from: i */
    public static void m191127i(Act act, User user, String str, boolean z, Runnable runnable, IceBreakQuestion iceBreakQuestion) {
        m191129k(act, user, str, z, runnable, runnable, "", iceBreakQuestion);
    }

    /* JADX INFO: renamed from: j */
    public static void m191128j(Act act, User user, String str, boolean z, Runnable runnable, Runnable runnable2, String str2) {
        m191129k(act, user, str, z, runnable, runnable2, str2, null);
    }

    /* JADX INFO: renamed from: k */
    public static void m191129k(final Act act, final User user, final String str, boolean z, final Runnable runnable, final Runnable runnable2, final String str2, final IceBreakQuestion iceBreakQuestion) {
        if (act == null || user == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (!z || !qib0.f154711Z.m119125K(str)) {
            m191125g(act, user, str, runnable, runnable2, str2, iceBreakQuestion);
            return;
        }
        act.dialog().m20503E0(R$string.f19127zi).m20500D(R$string.f19067xi).m20541k0(R$string.f19037wi).m20556t0(R$string.f19097yi, new Runnable() { // from class: l.nz00
            @Override // java.lang.Runnable
            public final void run() {
                tz00.m191125g(act, user, str, runnable, runnable2, str2, iceBreakQuestion);
            }
        }).m20568z0();
        HashSet hashSet = new HashSet(MessagesAct.f31635r.get());
        hashSet.add(user.f56011id);
        MessagesAct.f31635r.put(hashSet);
    }

    /* JADX INFO: renamed from: l */
    public static void m191130l(Act act, String str, String str2, boolean z, Runnable runnable) {
        m191131m(act, str, str2, z, runnable, runnable, "");
    }

    /* JADX INFO: renamed from: m */
    public static void m191131m(Act act, String str, String str2, boolean z, Runnable runnable, Runnable runnable2, String str3) {
        if (act == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        act.duringCreated(CoreModule.f17545c.f19642f0.m32650Fo()).map(new C20317b(str)).filter(new C20316a()).subscribe(mkd0.m154956H(new C20318c(act, str2, z, runnable, runnable2, str3), new C20319d()));
    }

    /* JADX INFO: renamed from: l.tz00$d */
    public class C20319d implements e30<Throwable> {
        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
        }
    }
}
