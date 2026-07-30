package p003l;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.p000p1.mobile.putong.core.data.Greeting;
import com.p000p1.mobile.putong.core.data.GreetingHotLevelInfo;
import com.p000p1.mobile.putong.core.data.GreetingPermission;
import com.p000p1.mobile.putong.core.data.HotLevel;
import com.p000p1.mobile.putong.core.data.IceBreakingContent;
import com.p000p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p000p1.mobile.putong.core.message.R$string;
import com.p000p1.mobile.putong.core.p001ui.intl.greet.IntlGreetAct;
import com.p000p1.mobile.putong.core.p001ui.intl.greet.IntlGreetingParam;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import l.cwf0;
import l.dd80;
import l.e30;
import l.i0e;
import l.mkd0;
import l.w9j;
import l.wwb;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001cB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0003J\r\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0003J\u001f\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Ll/nmn;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", "context", "Ll/nmn$a;", "builder", "", "source", "", "g", "(Lcom/p1/mobile/android/app/Act;Ll/nmn$a;Ljava/lang/String;)V", "Landroid/content/Context;", "Lcom/p1/mobile/putong/core/data/Greeting;", Greeting.TYPE, "from", "l", "(Landroid/content/Context;Lcom/p1/mobile/putong/core/data/Greeting;Ljava/lang/String;)V", "n", "m", "act", "k", "(Lcom/p1/mobile/android/app/Act;Ll/nmn$a;)V", "Landroid/content/Intent;", "j", "(Landroid/content/Context;Ll/nmn$a;)Landroid/content/Intent;", "Ll/cwf0;", "a", "Ll/cwf0;", "pageHelper", "message_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
public final class nmn {

    @NotNull
    public static final nmn INSTANCE = new nmn();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final cwf0 pageHelper;

    static {
        cwf0 cwf0VarC = i0e.c("p_intl_ilike_im_overheat_popup", nmn.class.getName());
        cwf0VarC.getClass();
        pageHelper = cwf0VarC;
    }

    /* JADX INFO: renamed from: c */
    public static Boolean m8348c(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: d */
    public static Boolean m8349d(GreetingHotLevelInfo greetingHotLevelInfo) {
        return Boolean.valueOf(NullChecker.a(greetingHotLevelInfo));
    }

    /* JADX INFO: renamed from: e */
    public static void m8350e(C3386a c3386a, Act act, GreetingHotLevelInfo greetingHotLevelInfo) {
        GreetingPermission greetingPermission;
        greetingHotLevelInfo.getClass();
        Greeting greeting = null;
        if (wwb.a(greetingHotLevelInfo.greetingPermissions)) {
            greetingPermission = null;
        } else {
            List<GreetingPermission> list = greetingHotLevelInfo.greetingPermissions;
            list.getClass();
            greetingPermission = list.get(0);
        }
        if (NullChecker.a(greetingPermission)) {
            greetingPermission.getClass();
            if (!greetingPermission.enable) {
                return;
            }
        }
        if (!wwb.a(greetingHotLevelInfo.greetings)) {
            List<Greeting> list2 = greetingHotLevelInfo.greetings;
            list2.getClass();
            greeting = list2.get(0);
        }
        if (NullChecker.a(greeting)) {
            c3386a.m8364e(greeting);
            INSTANCE.m8357k(act, c3386a);
            return;
        }
        if (wwb.a(greetingHotLevelInfo.hotLevels)) {
            return;
        }
        List<HotLevel> list3 = greetingHotLevelInfo.hotLevels;
        list3.getClass();
        HotLevel hotLevel = list3.get(0);
        if (NullChecker.a(hotLevel)) {
            c3386a.m8363d(hotLevel.level);
            if (hotLevel.level >= 2) {
                new dd80.a(act).x0(R$string.f566Y3, new Object[0]).s0(R$string.f558X3, new Object[0]).a0(R$string.f668k, new Runnable() { // from class: l.lmn
                    @Override // java.lang.Runnable
                    public final void run() {
                        nmn.m8353h();
                    }
                }).P(false).n0(new DialogInterface.OnDismissListener() { // from class: l.mmn
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        nmn.m8354i(dialogInterface);
                    }
                }).r0();
                INSTANCE.m8359n();
            } else {
                c3386a.m8365f(false);
                INSTANCE.m8357k(act, c3386a);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m8351f(Throwable th) {
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final void m8352g(@NotNull final Act context, @NotNull final C3386a builder, @Nullable String source) {
        context.getClass();
        builder.getClass();
        if (NullChecker.a(context)) {
            c cVarDuringCreated = context.duringCreated(CoreModule.c.r0.q5(builder.getOtherId(), false, source));
            final Function1 function1 = new Function1() { // from class: l.hmn
                public final Object invoke(Object obj) {
                    return nmn.m8349d((GreetingHotLevelInfo) obj);
                }
            };
            cVarDuringCreated.filter(new w9j() { // from class: l.imn
                public final Object call(Object obj) {
                    return nmn.m8348c(function1, obj);
                }
            }).subscribe(mkd0.H(new e30() { // from class: l.jmn
                public final void call(Object obj) {
                    nmn.m8350e(builder, context, (GreetingHotLevelInfo) obj);
                }
            }, new e30() { // from class: l.kmn
                public final void call(Object obj) {
                    nmn.m8351f((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m8354i(DialogInterface dialogInterface) {
        INSTANCE.m8358m();
    }

    @JvmStatic
    /* JADX INFO: renamed from: l */
    public static final void m8355l(@NotNull Context context, @NotNull Greeting greeting, @NotNull String from) {
        context.getClass();
        greeting.getClass();
        from.getClass();
        context.startActivity(INSTANCE.m8356j(context, new C3386a(greeting, from)));
    }

    /* JADX INFO: renamed from: j */
    public final Intent m8356j(Context context, C3386a builder) {
        Intent intent = new Intent(context, (Class<?>) IntlGreetAct.class);
        builder.m8360a(intent);
        return intent;
    }

    /* JADX INFO: renamed from: k */
    public final void m8357k(Act act, C3386a builder) {
        if (NullChecker.a(act)) {
            act.startActivityForResult(m8356j(act, builder), 17);
            if (CoreModule.N().Ui(builder.getFrom())) {
                act.overridePendingTransition(szb0.f7494e, 0);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m8358m() {
        cwf0 cwf0Var = pageHelper;
        if (cwf0Var != null) {
            cwf0Var.k();
            cwf0Var.j();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m8359n() {
        cwf0 cwf0Var = pageHelper;
        if (cwf0Var != null) {
            cwf0Var.i();
            cwf0Var.l();
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m8353h() {
    }

    /* JADX INFO: renamed from: l.nmn$a */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R$\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010 \u001a\u0004\b\u001f\u0010\"\"\u0004\b%\u0010$R\"\u0010(\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010 \u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$R$\u0010/\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u0010\u0016\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010;\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006<"}, d2 = {"Ll/nmn$a;", "", "Lcom/p1/mobile/putong/core/data/Greeting;", Greeting.TYPE, "", "from", "<init>", "(Lcom/p1/mobile/putong/core/data/Greeting;Ljava/lang/String;)V", "otherId", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/content/Intent;", "intent", "", "a", "(Landroid/content/Intent;)V", "e", "(Lcom/p1/mobile/putong/core/data/Greeting;)Ll/nmn$a;", "", "hasCreated", "f", "(Z)Ll/nmn$a;", "", "hotLevel", "d", "(I)Ll/nmn$a;", "Lcom/p1/mobile/putong/core/data/Greeting;", "getGreetInfo", "()Lcom/p1/mobile/putong/core/data/Greeting;", "setGreetInfo", "(Lcom/p1/mobile/putong/core/data/Greeting;)V", "greetInfo", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "setOtherId", "(Ljava/lang/String;)V", "setFrom", "getPreSendMsg", "setPreSendMsg", "preSendMsg", "Lcom/p1/mobile/putong/core/data/IceBreakingContent;", "Lcom/p1/mobile/putong/core/data/IceBreakingContent;", "getIceBreakingContent", "()Lcom/p1/mobile/putong/core/data/IceBreakingContent;", "setIceBreakingContent", "(Lcom/p1/mobile/putong/core/data/IceBreakingContent;)V", "iceBreakingContent", "I", "getHotLevel", "()I", "setHotLevel", "(I)V", "g", "Z", "getHasCreatedGreeting", "()Z", "setHasCreatedGreeting", "(Z)V", "hasCreatedGreeting", "message_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
    public static final class C3386a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public Greeting greetInfo;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public String otherId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public String from;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public String preSendMsg;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @Nullable
        public IceBreakingContent iceBreakingContent;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public int hotLevel;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public boolean hasCreatedGreeting;

        public C3386a(@NotNull String str, @NotNull String str2) {
            str.getClass();
            str2.getClass();
            this.preSendMsg = "";
            this.hasCreatedGreeting = true;
            Greeting greetingNew_ = Greeting.new_();
            greetingNew_.otherUser = str;
            greetingNew_.f63id = str;
            greetingNew_.actorUserId = CoreModule.H().userId();
            this.from = str2;
            this.greetInfo = greetingNew_;
            this.otherId = str;
        }

        /* JADX INFO: renamed from: a */
        public final void m8360a(@NotNull Intent intent) {
            intent.getClass();
            if (!NullChecker.a(this.greetInfo)) {
                CrashHelper.c(new NullPointerException("greetact_greetInfo_null,from:" + this.from));
            }
            IntlGreetingParam intlGreetingParam = new IntlGreetingParam();
            intlGreetingParam.setGreetInfo(this.greetInfo);
            intlGreetingParam.setFrom(this.from);
            intlGreetingParam.setPreSendMsg(this.preSendMsg);
            intlGreetingParam.setIceBreakingContent(this.iceBreakingContent);
            intlGreetingParam.setHotLevel(this.hotLevel);
            intlGreetingParam.setHasCreatedGreeting(this.hasCreatedGreeting);
            intent.putExtra("greet_param", intlGreetingParam);
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getFrom() {
            return this.from;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getOtherId() {
            return this.otherId;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final C3386a m8363d(int hotLevel) {
            this.hotLevel = hotLevel;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final C3386a m8364e(@Nullable Greeting greeting) {
            this.greetInfo = greeting;
            greeting.getClass();
            String str = greeting.f63id;
            str.getClass();
            this.otherId = str;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public final C3386a m8365f(boolean hasCreated) {
            this.hasCreatedGreeting = hasCreated;
            return this;
        }

        public C3386a(@NotNull Greeting greeting, @NotNull String str) {
            greeting.getClass();
            str.getClass();
            this.preSendMsg = "";
            this.hasCreatedGreeting = true;
            this.greetInfo = greeting;
            String str2 = greeting.f63id;
            str2.getClass();
            this.otherId = str2;
            this.from = str;
        }
    }
}
