package p149l;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Greeting;
import com.p046p1.mobile.putong.core.data.GreetingHotLevelInfo;
import com.p046p1.mobile.putong.core.data.GreetingPermission;
import com.p046p1.mobile.putong.core.data.HotLevel;
import com.p046p1.mobile.putong.core.data.IceBreakingContent;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.intl.greet.IntlGreetAct;
import com.p046p1.mobile.putong.core.p053ui.intl.greet.IntlGreetingParam;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m87231d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001cB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0003J\r\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0003J\u001f\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m87232d2 = {"Ll/nmn;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", "context", "Ll/nmn$a;", "builder", "", "source", "", "g", "(Lcom/p1/mobile/android/app/Act;Ll/nmn$a;Ljava/lang/String;)V", "Landroid/content/Context;", "Lcom/p1/mobile/putong/core/data/Greeting;", "greeting", "from", BLiveStormDanmakuGiftResourceType.f44444l, "(Landroid/content/Context;Lcom/p1/mobile/putong/core/data/Greeting;Ljava/lang/String;)V", "n", "m", SocialConstants.PARAM_ACT, "k", "(Lcom/p1/mobile/android/app/Act;Ll/nmn$a;)V", "Landroid/content/Intent;", "j", "(Landroid/content/Context;Ll/nmn$a;)Landroid/content/Intent;", "Ll/cwf0;", "a", "Ll/cwf0;", "pageHelper", "message_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class nmn {

    @NotNull
    public static final nmn INSTANCE = new nmn();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final cwf0 pageHelper;

    static {
        cwf0 cwf0VarM133794c = i0e.m133794c("p_intl_ilike_im_overheat_popup", nmn.class.getName());
        cwf0VarM133794c.getClass();
        pageHelper = cwf0VarM133794c;
    }

    /* JADX INFO: renamed from: c */
    public static Boolean m160119c(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: d */
    public static Boolean m160120d(GreetingHotLevelInfo greetingHotLevelInfo) {
        return Boolean.valueOf(NullChecker.m81303a(greetingHotLevelInfo));
    }

    /* JADX INFO: renamed from: e */
    public static void m160121e(C18733a c18733a, Act act, GreetingHotLevelInfo greetingHotLevelInfo) {
        GreetingPermission greetingPermission;
        greetingHotLevelInfo.getClass();
        Greeting greeting = null;
        if (wwb.m205852a(greetingHotLevelInfo.greetingPermissions)) {
            greetingPermission = null;
        } else {
            List<GreetingPermission> list = greetingHotLevelInfo.greetingPermissions;
            list.getClass();
            greetingPermission = list.get(0);
        }
        if (NullChecker.m81303a(greetingPermission)) {
            greetingPermission.getClass();
            if (!greetingPermission.enable) {
                return;
            }
        }
        if (!wwb.m205852a(greetingHotLevelInfo.greetings)) {
            List<Greeting> list2 = greetingHotLevelInfo.greetings;
            list2.getClass();
            greeting = list2.get(0);
        }
        if (NullChecker.m81303a(greeting)) {
            c18733a.m160135e(greeting);
            INSTANCE.m160128k(act, c18733a);
            return;
        }
        if (wwb.m205852a(greetingHotLevelInfo.hotLevels)) {
            return;
        }
        List<HotLevel> list3 = greetingHotLevelInfo.hotLevels;
        list3.getClass();
        HotLevel hotLevel = list3.get(0);
        if (NullChecker.m81303a(hotLevel)) {
            c18733a.m160134d(hotLevel.level);
            if (hotLevel.level >= 2) {
                new dd80.C16336a(act).m110995x0(R$string.f20904Y3, new Object[0]).m110990s0(R$string.f20896X3, new Object[0]).m110972a0(R$string.f21006k, new Runnable() { // from class: l.lmn
                    @Override // java.lang.Runnable
                    public final void run() {
                        nmn.m160124h();
                    }
                }).m110961P(false).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.mmn
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        nmn.m160125i(dialogInterface);
                    }
                }).m110989r0();
                INSTANCE.m160130n();
            } else {
                c18733a.m160136f(false);
                INSTANCE.m160128k(act, c18733a);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m160122f(Throwable th) {
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final void m160123g(@NotNull final Act context, @NotNull final C18733a builder, @Nullable String source) {
        context.getClass();
        builder.getClass();
        if (NullChecker.m81303a(context)) {
            C22306c c22306cDuringCreated = context.duringCreated(CoreModule.f17545c.f19678r0.m34140q5(builder.getOtherId(), false, source));
            final Function1 function1 = new Function1() { // from class: l.hmn
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return nmn.m160120d((GreetingHotLevelInfo) obj);
                }
            };
            c22306cDuringCreated.filter(new w9j() { // from class: l.imn
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return nmn.m160119c(function1, obj);
                }
            }).subscribe(mkd0.m154956H(new e30() { // from class: l.jmn
                @Override // p149l.e30
                public final void call(Object obj) {
                    nmn.m160121e(builder, context, (GreetingHotLevelInfo) obj);
                }
            }, new e30() { // from class: l.kmn
                @Override // p149l.e30
                public final void call(Object obj) {
                    nmn.m160122f((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m160125i(DialogInterface dialogInterface) {
        INSTANCE.m160129m();
    }

    @JvmStatic
    /* JADX INFO: renamed from: l */
    public static final void m160126l(@NotNull Context context, @NotNull Greeting greeting, @NotNull String from) {
        context.getClass();
        greeting.getClass();
        from.getClass();
        context.startActivity(INSTANCE.m160127j(context, new C18733a(greeting, from)));
    }

    /* JADX INFO: renamed from: j */
    public final Intent m160127j(Context context, C18733a builder) {
        Intent intent = new Intent(context, (Class<?>) IntlGreetAct.class);
        builder.m160131a(intent);
        return intent;
    }

    /* JADX INFO: renamed from: k */
    public final void m160128k(Act act, C18733a builder) {
        if (NullChecker.m81303a(act)) {
            act.startActivityForResult(m160127j(act, builder), 17);
            if (CoreModule.m29934N().mo60324Ui(builder.getFrom())) {
                act.overridePendingTransition(szb0.f167030e, 0);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m160129m() {
        cwf0 cwf0Var = pageHelper;
        if (cwf0Var != null) {
            cwf0Var.m109035k();
            cwf0Var.m109034j();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m160130n() {
        cwf0 cwf0Var = pageHelper;
        if (cwf0Var != null) {
            cwf0Var.m109033i();
            cwf0Var.m109036l();
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m160124h() {
    }

    /* JADX INFO: renamed from: l.nmn$a */
    @Metadata(m87231d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R$\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010 \u001a\u0004\b\u001f\u0010\"\"\u0004\b%\u0010$R\"\u0010(\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010 \u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$R$\u0010/\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u0010\u0016\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010;\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006<"}, m87232d2 = {"Ll/nmn$a;", "", "Lcom/p1/mobile/putong/core/data/Greeting;", "greeting", "", "from", "<init>", "(Lcom/p1/mobile/putong/core/data/Greeting;Ljava/lang/String;)V", "otherId", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/content/Intent;", "intent", "", "a", "(Landroid/content/Intent;)V", "e", "(Lcom/p1/mobile/putong/core/data/Greeting;)Ll/nmn$a;", "", "hasCreated", "f", "(Z)Ll/nmn$a;", "", "hotLevel", Constants.INAPP_DATA_TAG, "(I)Ll/nmn$a;", "Lcom/p1/mobile/putong/core/data/Greeting;", "getGreetInfo", "()Lcom/p1/mobile/putong/core/data/Greeting;", "setGreetInfo", "(Lcom/p1/mobile/putong/core/data/Greeting;)V", "greetInfo", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "setOtherId", "(Ljava/lang/String;)V", "setFrom", "getPreSendMsg", "setPreSendMsg", "preSendMsg", "Lcom/p1/mobile/putong/core/data/IceBreakingContent;", "Lcom/p1/mobile/putong/core/data/IceBreakingContent;", "getIceBreakingContent", "()Lcom/p1/mobile/putong/core/data/IceBreakingContent;", "setIceBreakingContent", "(Lcom/p1/mobile/putong/core/data/IceBreakingContent;)V", "iceBreakingContent", "I", "getHotLevel", "()I", "setHotLevel", "(I)V", "g", "Z", "getHasCreatedGreeting", "()Z", "setHasCreatedGreeting", "(Z)V", "hasCreatedGreeting", "message_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C18733a {

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

        public C18733a(@NotNull String str, @NotNull String str2) {
            str.getClass();
            str2.getClass();
            this.preSendMsg = "";
            this.hasCreatedGreeting = true;
            Greeting greetingNew_ = Greeting.new_();
            greetingNew_.otherUser = str;
            greetingNew_.f20401id = str;
            greetingNew_.actorUserId = CoreModule.m29931H().userId();
            this.from = str2;
            this.greetInfo = greetingNew_;
            this.otherId = str;
        }

        /* JADX INFO: renamed from: a */
        public final void m160131a(@NotNull Intent intent) {
            intent.getClass();
            if (!NullChecker.m81303a(this.greetInfo)) {
                CrashHelper.m81296c(new NullPointerException("greetact_greetInfo_null,from:" + this.from));
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
        public final C18733a m160134d(int hotLevel) {
            this.hotLevel = hotLevel;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final C18733a m160135e(@Nullable Greeting greeting) {
            this.greetInfo = greeting;
            greeting.getClass();
            String str = greeting.f20401id;
            str.getClass();
            this.otherId = str;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public final C18733a m160136f(boolean hasCreated) {
            this.hasCreatedGreeting = hasCreated;
            return this;
        }

        public C18733a(@NotNull Greeting greeting, @NotNull String str) {
            greeting.getClass();
            str.getClass();
            this.preSendMsg = "";
            this.hasCreatedGreeting = true;
            this.greetInfo = greeting;
            String str2 = greeting.f20401id;
            str2.getClass();
            this.otherId = str2;
            this.from = str;
        }
    }
}
