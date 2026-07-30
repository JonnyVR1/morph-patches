package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.ChatHeatActionData;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.IceBreakQuestion;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashSet;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes11.dex */
public class d810 {

    /* JADX INFO: renamed from: l.d810$a */
    public class C16479a implements qcj<User, Boolean> {
        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(User user) {
            return Boolean.valueOf(NullChecker.m82486a(user));
        }
    }

    /* JADX INFO: renamed from: l.d810$b */
    public class C16480b implements qcj<uxj0, User> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f85566a;

        public C16480b(String str) {
            this.f85566a = str;
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public User call(uxj0 uxj0Var) {
            return CoreModule.f18264c.f20381e0.m116503Pa(this.f85566a);
        }
    }

    /* JADX INFO: renamed from: l.d810$c */
    public class C16481c implements y20<User> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f85567a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f85568b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f85569c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Runnable f85570d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Runnable f85571e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ String f85572f;

        public C16481c(Act act, String str, boolean z, Runnable runnable, Runnable runnable2, String str2) {
            this.f85567a = act;
            this.f85568b = str;
            this.f85569c = z;
            this.f85570d = runnable;
            this.f85571e = runnable2;
            this.f85572f = str2;
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(User user) {
            if (w20.m204491f(this.f85567a)) {
                d810.m114777j(this.f85567a, user, this.f85568b, this.f85569c, this.f85570d, this.f85571e, this.f85572f);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m114768a(Conversation conversation) {
        Conversation conversationMo225055clone = conversation.mo225055clone();
        conversationMo225055clone.read = Boolean.TRUE;
        CoreModule.f18264c.f20384f0.m34053mq(conversationMo225055clone);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m114771d(String str, User user, Message message, Act act, Runnable runnable, Throwable th) {
        if (TextUtils.equals(str, "QuickGreeting")) {
            ibb.m139303b(act, rum.m183204b(user, message));
        } else if (rv4.m183256f(th)) {
            rv4.m183255e(act, th, ChatHeatActionData.ExclusiveAction.CHECK);
        } else if (TantanException.Client.TantanForbidden.isIllegalContent(th)) {
            CoreModule.f18264c.f20384f0.m33753Of(message.f56859id);
            r1j0.m179419f(R$string.f18634L7);
        } else {
            bfx.m104083f(R$string.f18884Th, user.m61308fp().profileSmall());
        }
        if (NullChecker.m82486a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m114773f(String str, User user, Message message, Act act, Runnable runnable, uxj0 uxj0Var) {
        if (TextUtils.equals(str, "QuickGreeting")) {
            ibb.m139303b(act, rum.m183205c(user, message));
        } else {
            Act actM204489d = w20.m204489d();
            if (!NullChecker.m82486a(actM204489d) || !(actM204489d instanceof NewMainAct) || ji30.m144964h() != TabName.Card) {
                o1j0.m165651y("消息已发送");
            }
            if (!nae0.m162081k()) {
                act.startActivity(NewMainAct.m40697M5(act, null));
            }
        }
        if (NullChecker.m82486a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m114774g(final Act act, final User user, String str, final Runnable runnable, final Runnable runnable2, final String str2, IceBreakQuestion iceBreakQuestion) {
        if (act == null || user == null || TextUtils.isEmpty(str)) {
            return;
        }
        final Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(user.f56859id);
        if (NullChecker.m82486a(conversationM33859Xe)) {
            l51.m152919y(new Runnable() { // from class: l.y710
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f18264c.f20351U.m128074a(new x20() { // from class: l.c810
                        @Override // p153l.x20
                        public final void call() {
                            d810.m114768a(conversation);
                        }
                    });
                }
            });
        }
        final Message message = new Message();
        message.value = str;
        message.messageType = MessageType.get("text");
        act.duringCreated((C22421c) CoreModule.f18264c.f20384f0.m33652Fn(user.f56859id, message, null, false, false).flatMap(new qcj() { // from class: l.z710
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreModule.f18264c.f20384f0.m33653Fo();
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.a810
            @Override // p153l.y20
            public final void call(Object obj) {
                d810.m114773f(str2, user, message, act, runnable, (uxj0) obj);
            }
        }, new y20() { // from class: l.b810
            @Override // p153l.y20
            public final void call(Object obj) {
                d810.m114771d(str2, user, message, act, runnable2, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h */
    public static void m114775h(Act act, User user, String str, boolean z, Runnable runnable) {
        m114777j(act, user, str, z, runnable, runnable, "");
    }

    /* JADX INFO: renamed from: i */
    public static void m114776i(Act act, User user, String str, boolean z, Runnable runnable, IceBreakQuestion iceBreakQuestion) {
        m114778k(act, user, str, z, runnable, runnable, "", iceBreakQuestion);
    }

    /* JADX INFO: renamed from: j */
    public static void m114777j(Act act, User user, String str, boolean z, Runnable runnable, Runnable runnable2, String str2) {
        m114778k(act, user, str, z, runnable, runnable2, str2, null);
    }

    /* JADX INFO: renamed from: k */
    public static void m114778k(final Act act, final User user, final String str, boolean z, final Runnable runnable, final Runnable runnable2, final String str2, final IceBreakQuestion iceBreakQuestion) {
        if (act == null || user == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (!z || !uqb0.f180394Z.m95954K(str)) {
            m114774g(act, user, str, runnable, runnable2, str2, iceBreakQuestion);
            return;
        }
        act.dialog().m21502E0(R$string.f18945Vi).m21499D(R$string.f18885Ti).m21540k0(R$string.f18855Si).m21555t0(R$string.f18915Ui, new Runnable() { // from class: l.x710
            @Override // java.lang.Runnable
            public final void run() {
                d810.m114774g(act, user, str, runnable, runnable2, str2, iceBreakQuestion);
            }
        }).m21567z0();
        HashSet hashSet = new HashSet(MessagesAct.f32483r.get());
        hashSet.add(user.f56859id);
        MessagesAct.f32483r.put(hashSet);
    }

    /* JADX INFO: renamed from: l */
    public static void m114779l(Act act, String str, String str2, boolean z, Runnable runnable) {
        m114780m(act, str, str2, z, runnable, runnable, "");
    }

    /* JADX INFO: renamed from: m */
    public static void m114780m(Act act, String str, String str2, boolean z, Runnable runnable, Runnable runnable2, String str3) {
        if (act == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        act.duringCreated(CoreModule.f18264c.f20384f0.m33653Fo()).map(new C16480b(str)).filter(new C16479a()).subscribe(psd0.m173597H(new C16481c(act, str2, z, runnable, runnable2, str3), new C16482d()));
    }

    /* JADX INFO: renamed from: l.d810$d */
    public class C16482d implements y20<Throwable> {
        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
        }
    }
}
