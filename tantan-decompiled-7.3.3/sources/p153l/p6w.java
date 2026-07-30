package p153l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.data.BreakIce;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.ConversationLoveBuzz;
import com.p051p1.mobile.putong.core.data.ConversationProperty;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.manager.LoveBuzzConstants$MATCH;
import com.p051p1.mobile.putong.data.Gender;
import com.p051p1.mobile.putong.data.LetterWrapper;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u000f\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J1\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00060\u00150\u00142\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00060\u00150\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010 \u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001f\u001a\u00020\t¢\u0006\u0004\b \u0010!J\u001f\u0010$\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%JQ\u0010/\u001a\u00020\f2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\t2\u0006\u0010)\u001a\u00020\t2\u0006\u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00062\u001a\u0010.\u001a\u0016\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010-0,¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b1\u0010\bJ\u0017\u00102\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b2\u0010\bJ\u0017\u00103\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b3\u0010\bJ\u0017\u00104\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b4\u0010\bJ\u0017\u00105\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b5\u0010\bJ\u0017\u00106\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b6\u0010\bJ\u0017\u00108\u001a\u00020\u00062\b\u00107\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b:\u0010\bJ\u0017\u0010=\u001a\u00020\u00062\b\u0010<\u001a\u0004\u0018\u00010;¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b?\u0010\bJ\u0017\u0010@\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b@\u0010\bJ\u0017\u0010A\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\bA\u0010\bJ1\u0010H\u001a\u0016\u0012\u0004\u0012\u00020F\u0018\u00010Ej\n\u0012\u0004\u0012\u00020F\u0018\u0001`G2\u0006\u0010B\u001a\u00020\u00162\u0006\u0010D\u001a\u00020C¢\u0006\u0004\bH\u0010IJ)\u0010J\u001a\u0016\u0012\u0004\u0012\u00020F\u0018\u00010Ej\n\u0012\u0004\u0012\u00020F\u0018\u0001`G2\u0006\u0010D\u001a\u00020C¢\u0006\u0004\bJ\u0010KJ\u001d\u0010M\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010L\u001a\u00020\t¢\u0006\u0004\bM\u0010NJ\u001d\u0010O\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010L\u001a\u00020\t¢\u0006\u0004\bO\u0010NJ\u0017\u0010P\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\bP\u0010\b¨\u0006Q"}, m88121d2 = {"Ll/p6w;", "", "<init>", "()V", "Lcom/p1/mobile/putong/core/data/Conversation;", "conv", "", "w", "(Lcom/p1/mobile/putong/core/data/Conversation;)Z", "", Oauth2AccessToken.KEY_UID, BaseSei.MID, "", "K", "(Ljava/lang/String;Ljava/lang/String;)V", "J", BaseSei.f14626Z, "(Ljava/lang/String;)Ljava/lang/String;", BaseSei.f14625Y, "cid", "Lrx/c;", "Ll/pf60;", "", "E", "(Lcom/p1/mobile/putong/core/data/Conversation;Ljava/lang/String;)Lrx/c;", "F", "(Ljava/lang/String;)Lrx/c;", "Landroid/content/Context;", "ctx", "Lv/VText;", "timeV", "time", "I", "(Landroid/content/Context;Lv/VText;Ljava/lang/String;)V", "", "convLastTime", "H", "(Lv/VText;D)V", "Ll/ner;", "lifecycleProvider", "hostId", "convId", "notExpire", "notBlurAvatar", "Ll/a30;", "Lcom/p1/mobile/putong/core/data/Message;", "progress", "L", "(Ll/ner;Ljava/lang/String;Ljava/lang/String;ZZLl/a30;)V", "r", BLiveStormDanmakuGiftResourceType.f45292l, "o", "q", "p", "u", "userId", c4s.C_ZONE, "(Ljava/lang/String;)Z", "m", "", "expire", Constants.KEY_T, "(Ljava/lang/Long;)Z", BLiveStormDanmakuGiftResourceType.f45294s, "n", ResourceDirection.f39656v, "size", "Lcom/p1/mobile/putong/data/Gender;", "gender", "Ljava/util/ArrayList;", "Lcom/p1/mobile/putong/core/data/BreakIce;", "Lkotlin/collections/ArrayList;", "G", "(ILcom/p1/mobile/putong/data/Gender;)Ljava/util/ArrayList;", BaseSei.f14624X, "(Lcom/p1/mobile/putong/data/Gender;)Ljava/util/ArrayList;", "id", "A", "(Ljava/lang/String;Ljava/lang/String;)Z", "B", "D", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class p6w {

    @NotNull
    public static final p6w INSTANCE = new p6w();

    /* JADX INFO: renamed from: a */
    public static pf60 m171042a(User user, pf60 pf60Var) {
        return new pf60(user, pf60Var);
    }

    /* JADX INFO: renamed from: b */
    public static pf60 m171043b(Function1 function1, Object obj) {
        return (pf60) function1.invoke(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static pf60 m171044c(pf60 pf60Var) {
        if (!Intrinsics.m88377d("lovebuzz", pf60Var.f152157b)) {
            new pf60(0, Boolean.FALSE);
        }
        Integer num = (Integer) pf60Var.f152156a;
        num.getClass();
        return ((int) ((((float) num.intValue()) / 10.0f) * 100.0f)) < 100 ? new pf60(0, Boolean.FALSE) : new pf60(100, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: d */
    public static pf60 m171045d(Function1 function1, Object obj) {
        return (pf60) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e */
    public static pf60 m171046e(String str, Conversation conversation) {
        conversation.getClass();
        p6w p6wVar = INSTANCE;
        if (!p6wVar.m171068o(conversation)) {
            return new pf60(Integer.valueOf(conversation.f21116mm), conversation.convType);
        }
        boolean zM171055C = p6wVar.m171055C(str);
        String str2 = conversation.convType;
        return zM171055C ? new pf60(0, str2) : new pf60(10, str2);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static void m171047f(boolean z, String str, boolean z2, String str2, a30 a30Var, pf60 pf60Var) {
        pf60 pf60Var2;
        Message message;
        pf60 pf60Var3;
        String str3;
        Message message2;
        Message message3;
        Integer num;
        p6w p6wVar = INSTANCE;
        pf60 pf60Var4 = (pf60) pf60Var.f152157b;
        boolean z3 = false;
        int iIntValue = (pf60Var4 == null || (num = (Integer) pf60Var4.f152156a) == null) ? 0 : num.intValue();
        if (iIntValue == 50 && !z && TextUtils.isEmpty(p6wVar.m171079z(str))) {
            pf60 pf60Var5 = (pf60) pf60Var.f152157b;
            if (NullChecker.m82486a(pf60Var5 != null ? (Message) pf60Var5.f152157b : null)) {
                pf60 pf60Var6 = (pf60) pf60Var.f152157b;
                p6wVar.m171063K(str, (pf60Var6 == null || (message3 = (Message) pf60Var6.f152157b) == null) ? null : message3.f56859id);
            } else if (iIntValue == 100) {
                pf60Var2 = (pf60) pf60Var.f152157b;
                if (pf60Var2 != null) {
                    message = (Message) pf60Var2.f152157b;
                } else {
                    message = null;
                }
                if (NullChecker.m82486a(message)) {
                    pf60Var3 = (pf60) pf60Var.f152157b;
                    if (pf60Var3 != null) {
                        str3 = null;
                    } else {
                        str3 = null;
                    }
                    p6wVar.m171062J(str, str3);
                }
            }
            z3 = true;
        } else if (iIntValue == 100 && TextUtils.isEmpty(p6wVar.m171078y(str))) {
            pf60Var2 = (pf60) pf60Var.f152157b;
            if (pf60Var2 != null) {
                message = (Message) pf60Var2.f152157b;
            } else {
                message = null;
            }
            if (NullChecker.m82486a(message)) {
                pf60Var3 = (pf60) pf60Var.f152157b;
                if (pf60Var3 != null || (message2 = (Message) pf60Var3.f152157b) == null) {
                    str3 = null;
                } else {
                    str3 = message2.f56859id;
                }
                p6wVar.m171062J(str, str3);
                z3 = true;
            }
        }
        if (z2) {
            f8w f8wVar = f8w.INSTANCE;
            if (f8wVar.m124571g()) {
                f8wVar.m124567c(iIntValue / 10, str2);
            }
        }
        Integer numValueOf = Integer.valueOf(iIntValue);
        Boolean boolValueOf = Boolean.valueOf(z3);
        pf60 pf60Var7 = (pf60) pf60Var.f152157b;
        a30Var.mo37058a(numValueOf, boolValueOf, pf60Var7 != null ? (Message) pf60Var7.f152157b : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public static Integer m171048g(pf60 pf60Var) {
        return (Integer) pf60Var.f152156a;
    }

    /* JADX INFO: renamed from: h */
    public static Integer m171049h(Function1 function1, Object obj) {
        return (Integer) function1.invoke(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public static Boolean m171050i(pf60 pf60Var) {
        User user = (User) pf60Var.f152156a;
        return Boolean.valueOf(user != null ? user.isLoveBuzz() : false);
    }

    /* JADX INFO: renamed from: j */
    public static Boolean m171051j(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: k */
    public static pf60 m171052k(Function2 function2, Object obj, Object obj2) {
        return (pf60) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: A */
    public final boolean m171053A(@NotNull String cid, @NotNull String id) {
        cid.getClass();
        id.getClass();
        return TextUtils.equals(m171079z(cid), id);
    }

    /* JADX INFO: renamed from: B */
    public final boolean m171054B(@NotNull String cid, @NotNull String id) {
        cid.getClass();
        id.getClass();
        return TextUtils.equals(m171078y(cid), id);
    }

    /* JADX INFO: renamed from: C */
    public final boolean m171055C(@Nullable String userId) {
        if (userId == null) {
            return false;
        }
        eqx eqxVarM134264B0 = haw.INSTANCE.m134320a().m134264B0();
        return (!Intrinsics.m88377d(eqxVarM134264B0.getUserId(), userId) || eqxVarM134264B0.getMatched() == LoveBuzzConstants$MATCH.PEER_LIKE_ME || eqxVarM134264B0.getMatched() == LoveBuzzConstants$MATCH.MATCHED) ? false : true;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m171056D(@Nullable Conversation conv) {
        ConversationProperty conversationProperty;
        ConversationLoveBuzz conversationLoveBuzz;
        if (conv == null || (conversationProperty = conv.property) == null || (conversationLoveBuzz = conversationProperty.intl_love_buzz) == null) {
            return false;
        }
        return conversationLoveBuzz.notBlur;
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final C22421c<pf60<Integer, Boolean>> m171057E(@Nullable Conversation conv, @NotNull String cid) {
        cid.getClass();
        if (m171070q(conv)) {
            return m171058F(cid);
        }
        C22421c<pf60<Integer, Boolean>> c22421cJust = C22421c.just(jyb.m147494Y(100, Boolean.TRUE));
        c22421cJust.getClass();
        return c22421cJust;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final C22421c<pf60<Integer, Boolean>> m171058F(@Nullable final String cid) {
        C22421c c22421cJust;
        if (NullChecker.m82486a(cid)) {
            C22421c<Conversation> c22421cM33740Ne = CoreModule.f18264c.f20384f0.m33740Ne(cid);
            final Function1 function1 = new Function1() { // from class: l.k6w
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return p6w.m171046e(cid, (Conversation) obj);
                }
            };
            c22421cJust = c22421cM33740Ne.map(new qcj() { // from class: l.l6w
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return p6w.m171045d(function1, obj);
                }
            }).distinctUntilChanged();
        } else {
            c22421cJust = C22421c.just(new pf60(0, "default"));
        }
        final Function1 function2 = new Function1() { // from class: l.m6w
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p6w.m171044c((pf60) obj);
            }
        };
        C22421c map = c22421cJust.map(new qcj() { // from class: l.n6w
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return p6w.m171043b(function2, obj);
            }
        });
        final Function1 function3 = new Function1() { // from class: l.o6w
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p6w.m171048g((pf60) obj);
            }
        };
        C22421c<pf60<Integer, Boolean>> c22421cDistinctUntilChanged = map.distinctUntilChanged(new qcj() { // from class: l.f6w
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return p6w.m171049h(function3, obj);
            }
        });
        c22421cDistinctUntilChanged.getClass();
        return c22421cDistinctUntilChanged;
    }

    @Nullable
    /* JADX INFO: renamed from: G */
    public final ArrayList<BreakIce> m171059G(int size, @NotNull Gender gender) {
        gender.getClass();
        List<LetterWrapper> listM217943C = CoreModule.f18265d.m217943C(gender, q8g0.m175820y(), true);
        if (jyb.m147479J(listM217943C)) {
            return null;
        }
        listM217943C.getClass();
        List<LetterWrapper> listTake = CollectionsKt.take(CollectionsKt.shuffled(listM217943C), size);
        ArrayList<BreakIce> arrayList = new ArrayList<>();
        for (LetterWrapper letterWrapper : listTake) {
            BreakIce breakIce = new BreakIce();
            breakIce.content = letterWrapper.letter;
            arrayList.add(breakIce);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: H */
    public final void m171060H(@Nullable VText timeV, double convLastTime) {
        if (timeV == null) {
            return;
        }
        timeV.setTextColor(Color.parseColor("#60000000"));
        timeV.setCompoundDrawables(null, null, null, null);
        timeV.setText(pzi0.m174442G(convLastTime));
    }

    /* JADX INFO: renamed from: I */
    public final void m171061I(@Nullable Context ctx, @Nullable VText timeV, @NotNull String time) {
        Resources resources;
        Drawable drawable;
        time.getClass();
        if (timeV == null || !k8w.INSTANCE.m148752a(ctx)) {
            return;
        }
        timeV.setTextColor(Color.parseColor("#ff8817"));
        timeV.setText(time);
        if (NullChecker.m82486a(Integer.valueOf(timeV.getCompoundPaddingLeft()))) {
            timeV.setCompoundDrawablePadding(qa00.f156318e);
            if (ctx == null || (resources = ctx.getResources()) == null || (drawable = resources.getDrawable(ebc0.f92850I)) == null) {
                return;
            }
            drawable.setBounds(0, 0, qa00.m175859d(12.0f), qa00.m175859d(12.0f));
            bnl0.m105563k(timeV, drawable);
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m171062J(String uid, String mid) {
        if (mid != null) {
            new wyd0("LOVE_BUZZ_UNLOCK_100_" + uid + "_" + CoreModule.m30929H().userId(), "").put(mid);
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m171063K(String uid, String mid) {
        if (mid != null) {
            new wyd0("LOVE_BUZZ_UNLOCK_50_" + uid + "_" + CoreModule.m30929H().userId(), "").put(mid);
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m171064L(@NotNull ner lifecycleProvider, @NotNull final String hostId, @NotNull final String convId, final boolean notExpire, final boolean notBlurAvatar, @NotNull final a30<Integer, Boolean, Message> progress) {
        lifecycleProvider.getClass();
        hostId.getClass();
        convId.getClass();
        progress.getClass();
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(hostId);
        if (NullChecker.m82486a(userM116503Pa) && userM116503Pa.isLoveBuzz() && TextUtils.isEmpty(m171078y(hostId))) {
            C22421c<User> c22421cM116483Ka = CoreModule.f18264c.f20381e0.m116483Ka(hostId);
            C22421c<pf60<Integer, Message>> c22421cDistinctUntilChanged = CoreModule.f18264c.f20384f0.m33998in(hostId, convId).distinctUntilChanged();
            final Function2 function2 = new Function2() { // from class: l.e6w
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return p6w.m171042a((User) obj, (pf60) obj2);
                }
            };
            C22421c c22421cDuringCreated = lifecycleProvider.duringCreated(psd0.m173625r(c22421cM116483Ka, c22421cDistinctUntilChanged, new rcj() { // from class: l.g6w
                @Override // p153l.rcj
                public final Object call(Object obj, Object obj2) {
                    return p6w.m171052k(function2, obj, obj2);
                }
            }));
            final Function1 function1 = new Function1() { // from class: l.h6w
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return p6w.m171050i((pf60) obj);
                }
            };
            c22421cDuringCreated.filter(new qcj() { // from class: l.i6w
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return p6w.m171051j(function1, obj);
                }
            }).subscribe(psd0.m173596G(new y20() { // from class: l.j6w
                @Override // p153l.y20
                public final void call(Object obj) {
                    p6w.m171047f(notBlurAvatar, hostId, notExpire, convId, progress, (pf60) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: l */
    public final boolean m171065l(@Nullable Conversation conv) {
        return (conv == null || m171076w(conv) || m171073t(Long.valueOf(conv.property.intl_love_buzz.expire)) || conv.f21116mm >= 10) ? false : true;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m171066m(@Nullable Conversation conv) {
        if (conv == null) {
            return false;
        }
        if (TEnum.equals(conv.status, "dismissed")) {
            return true;
        }
        return !m171076w(conv) && conv.f21116mm < 10;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m171067n(@Nullable Conversation conv) {
        return conv != null && Intrinsics.m88377d("lovebuzz", conv.convType);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m171068o(@Nullable Conversation conv) {
        ConversationProperty conversationProperty;
        ConversationLoveBuzz conversationLoveBuzz;
        String str;
        if (conv == null || (conversationProperty = conv.property) == null || (conversationLoveBuzz = conversationProperty.intl_love_buzz) == null || (str = conversationLoveBuzz.biz) == null) {
            return false;
        }
        return TextUtils.equals("voiceBuzz", str) || TextUtils.equals("videoBuzz", str) || TextUtils.equals("memojiBuzz", str);
    }

    /* JADX INFO: renamed from: p */
    public final boolean m171069p(@Nullable Conversation conv) {
        ConversationProperty conversationProperty;
        ConversationLoveBuzz conversationLoveBuzz;
        return (!m171067n(conv) || conv == null || (conversationProperty = conv.property) == null || (conversationLoveBuzz = conversationProperty.intl_love_buzz) == null || !TextUtils.equals("textBuzz", conversationLoveBuzz.biz) || TextUtils.equals(Active.TYPE, conversationLoveBuzz.mode)) ? false : true;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m171070q(@Nullable Conversation conv) {
        ConversationProperty conversationProperty;
        ConversationLoveBuzz conversationLoveBuzz;
        String str;
        if (!m171067n(conv) || conv == null || (conversationProperty = conv.property) == null || (conversationLoveBuzz = conversationProperty.intl_love_buzz) == null || (str = conversationLoveBuzz.biz) == null) {
            return false;
        }
        return TextUtils.equals("textBuzz", str);
    }

    /* JADX INFO: renamed from: r */
    public final boolean m171071r(@Nullable Conversation conv) {
        if (conv == null || m171076w(conv) || conv.f21116mm >= 10) {
            return false;
        }
        return m171073t(Long.valueOf(conv.property.intl_love_buzz.expire)) || conv.f21116mm >= 10;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m171072s(@Nullable Conversation conv) {
        ConversationProperty conversationProperty;
        ConversationLoveBuzz conversationLoveBuzz;
        return m171073t((conv == null || (conversationProperty = conv.property) == null || (conversationLoveBuzz = conversationProperty.intl_love_buzz) == null) ? null : Long.valueOf(conversationLoveBuzz.expire));
    }

    /* JADX INFO: renamed from: t */
    public final boolean m171073t(@Nullable Long expire) {
        return expire == null || expire.longValue() - pzi0.m174454o() > 0;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m171074u(@Nullable Conversation conv) {
        if (conv == null || !INSTANCE.m171069p(conv)) {
            return false;
        }
        return TextUtils.isEmpty(conv.clearedUntil);
    }

    /* JADX INFO: renamed from: v */
    public final boolean m171075v(@Nullable Conversation conv) {
        return conv != null && conv.userMessageCount <= 0 && !conv.localHasMessage && m171069p(conv) && m171072s(conv) && !conv.property.intl_love_buzz.prolonged;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m171076w(Conversation conv) {
        return (Intrinsics.m88377d("lovebuzz", conv.convType) && NullChecker.m82486a(conv.property.intl_love_buzz) && c69.m108119e() && !m171068o(conv)) ? false : true;
    }

    @Nullable
    /* JADX INFO: renamed from: x */
    public final ArrayList<BreakIce> m171077x(@NotNull Gender gender) {
        gender.getClass();
        List<LetterWrapper> listM217943C = CoreModule.f18265d.m217943C(gender, q8g0.m175820y(), true);
        if (jyb.m147479J(listM217943C)) {
            return null;
        }
        listM217943C.getClass();
        List<LetterWrapper> listShuffled = CollectionsKt.shuffled(listM217943C);
        ArrayList<BreakIce> arrayList = new ArrayList<>();
        for (LetterWrapper letterWrapper : listShuffled) {
            BreakIce breakIce = new BreakIce();
            breakIce.content = letterWrapper.letter;
            arrayList.add(breakIce);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: y */
    public final String m171078y(String uid) {
        String str = new wyd0("LOVE_BUZZ_UNLOCK_100_" + uid + "_" + CoreModule.m30929H().userId(), "").get();
        str.getClass();
        return str;
    }

    /* JADX INFO: renamed from: z */
    public final String m171079z(String uid) {
        String str = new wyd0("LOVE_BUZZ_UNLOCK_50_" + uid + "_" + CoreModule.m30929H().userId(), "").get();
        str.getClass();
        return str;
    }
}
