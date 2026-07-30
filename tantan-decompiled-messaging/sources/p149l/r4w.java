package p149l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.data.BreakIce;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.ConversationLoveBuzz;
import com.p046p1.mobile.putong.core.data.ConversationProperty;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.manager.LoveBuzzConstants$MATCH;
import com.p046p1.mobile.putong.data.Gender;
import com.p046p1.mobile.putong.data.LetterWrapper;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
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
import p133rx.C22306c;
import p147v.VText;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u000f\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J1\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00060\u00150\u00142\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00060\u00150\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010 \u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001f\u001a\u00020\t¢\u0006\u0004\b \u0010!J\u001f\u0010$\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%JQ\u0010/\u001a\u00020\f2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\t2\u0006\u0010)\u001a\u00020\t2\u0006\u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00062\u001a\u0010.\u001a\u0016\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010-0,¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b1\u0010\bJ\u0017\u00102\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b2\u0010\bJ\u0017\u00103\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b3\u0010\bJ\u0017\u00104\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b4\u0010\bJ\u0017\u00105\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b5\u0010\bJ\u0017\u00106\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b6\u0010\bJ\u0017\u00108\u001a\u00020\u00062\b\u00107\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b:\u0010\bJ\u0017\u0010=\u001a\u00020\u00062\b\u0010<\u001a\u0004\u0018\u00010;¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b?\u0010\bJ\u0017\u0010@\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b@\u0010\bJ\u0017\u0010A\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\bA\u0010\bJ1\u0010H\u001a\u0016\u0012\u0004\u0012\u00020F\u0018\u00010Ej\n\u0012\u0004\u0012\u00020F\u0018\u0001`G2\u0006\u0010B\u001a\u00020\u00162\u0006\u0010D\u001a\u00020C¢\u0006\u0004\bH\u0010IJ)\u0010J\u001a\u0016\u0012\u0004\u0012\u00020F\u0018\u00010Ej\n\u0012\u0004\u0012\u00020F\u0018\u0001`G2\u0006\u0010D\u001a\u00020C¢\u0006\u0004\bJ\u0010KJ\u001d\u0010M\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010L\u001a\u00020\t¢\u0006\u0004\bM\u0010NJ\u001d\u0010O\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010L\u001a\u00020\t¢\u0006\u0004\bO\u0010NJ\u0017\u0010P\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\bP\u0010\b¨\u0006Q"}, m87232d2 = {"Ll/r4w;", "", "<init>", "()V", "Lcom/p1/mobile/putong/core/data/Conversation;", "conv", "", "w", "(Lcom/p1/mobile/putong/core/data/Conversation;)Z", "", Oauth2AccessToken.KEY_UID, BaseSei.MID, "", "K", "(Ljava/lang/String;Ljava/lang/String;)V", "J", BaseSei.f13932Z, "(Ljava/lang/String;)Ljava/lang/String;", BaseSei.f13931Y, "cid", "Lrx/c;", "Ll/j760;", "", "E", "(Lcom/p1/mobile/putong/core/data/Conversation;Ljava/lang/String;)Lrx/c;", "F", "(Ljava/lang/String;)Lrx/c;", "Landroid/content/Context;", "ctx", "Lv/VText;", "timeV", "time", "I", "(Landroid/content/Context;Lv/VText;Ljava/lang/String;)V", "", "convLastTime", "H", "(Lv/VText;D)V", "Ll/mcr;", "lifecycleProvider", "hostId", "convId", "notExpire", "notBlurAvatar", "Ll/g30;", "Lcom/p1/mobile/putong/core/data/Message;", "progress", "L", "(Ll/mcr;Ljava/lang/String;Ljava/lang/String;ZZLl/g30;)V", "r", BLiveStormDanmakuGiftResourceType.f44444l, "o", "q", "p", "u", "userId", b2s.C_ZONE, "(Ljava/lang/String;)Z", "m", "", "expire", Constants.KEY_T, "(Ljava/lang/Long;)Z", BLiveStormDanmakuGiftResourceType.f44446s, "n", ResourceDirection.f38808v, "size", "Lcom/p1/mobile/putong/data/Gender;", "gender", "Ljava/util/ArrayList;", "Lcom/p1/mobile/putong/core/data/BreakIce;", "Lkotlin/collections/ArrayList;", "G", "(ILcom/p1/mobile/putong/data/Gender;)Ljava/util/ArrayList;", BaseSei.f13930X, "(Lcom/p1/mobile/putong/data/Gender;)Ljava/util/ArrayList;", "id", "A", "(Ljava/lang/String;Ljava/lang/String;)Z", "B", "D", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class r4w {

    @NotNull
    public static final r4w INSTANCE = new r4w();

    /* JADX INFO: renamed from: a */
    public static j760 m177835a(User user, j760 j760Var) {
        return new j760(user, j760Var);
    }

    /* JADX INFO: renamed from: b */
    public static j760 m177836b(Function1 function1, Object obj) {
        return (j760) function1.invoke(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static j760 m177837c(j760 j760Var) {
        if (!Intrinsics.m87488d("lovebuzz", j760Var.f116565b)) {
            new j760(0, Boolean.FALSE);
        }
        Integer num = (Integer) j760Var.f116564a;
        num.getClass();
        return ((int) ((((float) num.intValue()) / 10.0f) * 100.0f)) < 100 ? new j760(0, Boolean.FALSE) : new j760(100, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: d */
    public static j760 m177838d(Function1 function1, Object obj) {
        return (j760) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e */
    public static j760 m177839e(String str, Conversation conversation) {
        conversation.getClass();
        r4w r4wVar = INSTANCE;
        if (!r4wVar.m177861o(conversation)) {
            return new j760(Integer.valueOf(conversation.f20374mm), conversation.convType);
        }
        boolean zM177848C = r4wVar.m177848C(str);
        String str2 = conversation.convType;
        return zM177848C ? new j760(0, str2) : new j760(10, str2);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static void m177840f(boolean z, String str, boolean z2, String str2, g30 g30Var, j760 j760Var) {
        j760 j760Var2;
        Message message;
        j760 j760Var3;
        String str3;
        Message message2;
        Message message3;
        Integer num;
        r4w r4wVar = INSTANCE;
        j760 j760Var4 = (j760) j760Var.f116565b;
        boolean z3 = false;
        int iIntValue = (j760Var4 == null || (num = (Integer) j760Var4.f116564a) == null) ? 0 : num.intValue();
        if (iIntValue == 50 && !z && TextUtils.isEmpty(r4wVar.m177872z(str))) {
            j760 j760Var5 = (j760) j760Var.f116565b;
            if (NullChecker.m81303a(j760Var5 != null ? (Message) j760Var5.f116565b : null)) {
                j760 j760Var6 = (j760) j760Var.f116565b;
                r4wVar.m177856K(str, (j760Var6 == null || (message3 = (Message) j760Var6.f116565b) == null) ? null : message3.f56011id);
            } else if (iIntValue == 100) {
                j760Var2 = (j760) j760Var.f116565b;
                if (j760Var2 != null) {
                    message = (Message) j760Var2.f116565b;
                } else {
                    message = null;
                }
                if (NullChecker.m81303a(message)) {
                    j760Var3 = (j760) j760Var.f116565b;
                    if (j760Var3 != null) {
                        str3 = null;
                    } else {
                        str3 = null;
                    }
                    r4wVar.m177855J(str, str3);
                }
            }
            z3 = true;
        } else if (iIntValue == 100 && TextUtils.isEmpty(r4wVar.m177871y(str))) {
            j760Var2 = (j760) j760Var.f116565b;
            if (j760Var2 != null) {
                message = (Message) j760Var2.f116565b;
            } else {
                message = null;
            }
            if (NullChecker.m81303a(message)) {
                j760Var3 = (j760) j760Var.f116565b;
                if (j760Var3 != null || (message2 = (Message) j760Var3.f116565b) == null) {
                    str3 = null;
                } else {
                    str3 = message2.f56011id;
                }
                r4wVar.m177855J(str, str3);
                z3 = true;
            }
        }
        if (z2) {
            h6w h6wVar = h6w.INSTANCE;
            if (h6wVar.m129535g()) {
                h6wVar.m129531c(iIntValue / 10, str2);
            }
        }
        Integer numValueOf = Integer.valueOf(iIntValue);
        Boolean boolValueOf = Boolean.valueOf(z3);
        j760 j760Var7 = (j760) j760Var.f116565b;
        g30Var.mo36055a(numValueOf, boolValueOf, j760Var7 != null ? (Message) j760Var7.f116565b : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public static Integer m177841g(j760 j760Var) {
        return (Integer) j760Var.f116564a;
    }

    /* JADX INFO: renamed from: h */
    public static Integer m177842h(Function1 function1, Object obj) {
        return (Integer) function1.invoke(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public static Boolean m177843i(j760 j760Var) {
        User user = (User) j760Var.f116564a;
        return Boolean.valueOf(user != null ? user.isLoveBuzz() : false);
    }

    /* JADX INFO: renamed from: j */
    public static Boolean m177844j(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: k */
    public static j760 m177845k(Function2 function2, Object obj, Object obj2) {
        return (j760) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: A */
    public final boolean m177846A(@NotNull String cid, @NotNull String id) {
        cid.getClass();
        id.getClass();
        return TextUtils.equals(m177872z(cid), id);
    }

    /* JADX INFO: renamed from: B */
    public final boolean m177847B(@NotNull String cid, @NotNull String id) {
        cid.getClass();
        id.getClass();
        return TextUtils.equals(m177871y(cid), id);
    }

    /* JADX INFO: renamed from: C */
    public final boolean m177848C(@Nullable String userId) {
        if (userId == null) {
            return false;
        }
        hhx hhxVarM140417B0 = j8w.INSTANCE.m140473a().m140417B0();
        return (!Intrinsics.m87488d(hhxVarM140417B0.getUserId(), userId) || hhxVarM140417B0.getMatched() == LoveBuzzConstants$MATCH.PEER_LIKE_ME || hhxVarM140417B0.getMatched() == LoveBuzzConstants$MATCH.MATCHED) ? false : true;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m177849D(@Nullable Conversation conv) {
        ConversationProperty conversationProperty;
        ConversationLoveBuzz conversationLoveBuzz;
        if (conv == null || (conversationProperty = conv.property) == null || (conversationLoveBuzz = conversationProperty.intl_love_buzz) == null) {
            return false;
        }
        return conversationLoveBuzz.notBlur;
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final C22306c<j760<Integer, Boolean>> m177850E(@Nullable Conversation conv, @NotNull String cid) {
        cid.getClass();
        if (m177863q(conv)) {
            return m177851F(cid);
        }
        C22306c<j760<Integer, Boolean>> c22306cJust = C22306c.just(vwb.m200311Y(100, Boolean.TRUE));
        c22306cJust.getClass();
        return c22306cJust;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final C22306c<j760<Integer, Boolean>> m177851F(@Nullable final String cid) {
        C22306c c22306cJust;
        if (NullChecker.m81303a(cid)) {
            C22306c<Conversation> c22306cM32737Ne = CoreModule.f17545c.f19642f0.m32737Ne(cid);
            final Function1 function1 = new Function1() { // from class: l.m4w
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return r4w.m177839e(cid, (Conversation) obj);
                }
            };
            c22306cJust = c22306cM32737Ne.map(new w9j() { // from class: l.n4w
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return r4w.m177838d(function1, obj);
                }
            }).distinctUntilChanged();
        } else {
            c22306cJust = C22306c.just(new j760(0, "default"));
        }
        final Function1 function2 = new Function1() { // from class: l.o4w
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return r4w.m177837c((j760) obj);
            }
        };
        C22306c map = c22306cJust.map(new w9j() { // from class: l.p4w
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return r4w.m177836b(function2, obj);
            }
        });
        final Function1 function3 = new Function1() { // from class: l.q4w
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return r4w.m177841g((j760) obj);
            }
        };
        C22306c<j760<Integer, Boolean>> c22306cDistinctUntilChanged = map.distinctUntilChanged(new w9j() { // from class: l.h4w
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return r4w.m177842h(function3, obj);
            }
        });
        c22306cDistinctUntilChanged.getClass();
        return c22306cDistinctUntilChanged;
    }

    @Nullable
    /* JADX INFO: renamed from: G */
    public final ArrayList<BreakIce> m177852G(int size, @NotNull Gender gender) {
        gender.getClass();
        List<LetterWrapper> listM200497C = CoreModule.f17546d.m200497C(gender, i0g0.m133885y(), true);
        if (vwb.m200296J(listM200497C)) {
            return null;
        }
        listM200497C.getClass();
        List<LetterWrapper> listTake = CollectionsKt.take(CollectionsKt.shuffled(listM200497C), size);
        ArrayList<BreakIce> arrayList = new ArrayList<>();
        for (LetterWrapper letterWrapper : listTake) {
            BreakIce breakIce = new BreakIce();
            breakIce.content = letterWrapper.letter;
            arrayList.add(breakIce);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: H */
    public final void m177853H(@Nullable VText timeV, double convLastTime) {
        if (timeV == null) {
            return;
        }
        timeV.setTextColor(Color.parseColor("#60000000"));
        timeV.setCompoundDrawables(null, null, null, null);
        timeV.setText(mqi0.m155932G(convLastTime));
    }

    /* JADX INFO: renamed from: I */
    public final void m177854I(@Nullable Context ctx, @Nullable VText timeV, @NotNull String time) {
        Resources resources;
        Drawable drawable;
        time.getClass();
        if (timeV == null || !m6w.INSTANCE.m153296a(ctx)) {
            return;
        }
        timeV.setTextColor(Color.parseColor("#ff8817"));
        timeV.setText(time);
        if (NullChecker.m81303a(Integer.valueOf(timeV.getCompoundPaddingLeft()))) {
            timeV.setCompoundDrawablePadding(t100.f167256e);
            if (ctx == null || (resources = ctx.getResources()) == null || (drawable = resources.getDrawable(y2c0.f195528I)) == null) {
                return;
            }
            drawable.setBounds(0, 0, t100.m186890d(12.0f), t100.m186890d(12.0f));
            xdl0.m208383k(timeV, drawable);
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m177855J(String uid, String mid) {
        if (mid != null) {
            new uqd0("LOVE_BUZZ_UNLOCK_100_" + uid + "_" + CoreModule.m29931H().userId(), "").put(mid);
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m177856K(String uid, String mid) {
        if (mid != null) {
            new uqd0("LOVE_BUZZ_UNLOCK_50_" + uid + "_" + CoreModule.m29931H().userId(), "").put(mid);
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m177857L(@NotNull mcr lifecycleProvider, @NotNull final String hostId, @NotNull final String convId, final boolean notExpire, final boolean notBlurAvatar, @NotNull final g30<Integer, Boolean, Message> progress) {
        lifecycleProvider.getClass();
        hostId.getClass();
        convId.getClass();
        progress.getClass();
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(hostId);
        if (NullChecker.m81303a(userM169430Pa) && userM169430Pa.isLoveBuzz() && TextUtils.isEmpty(m177871y(hostId))) {
            C22306c<User> c22306cM169410Ka = CoreModule.f17545c.f19639e0.m169410Ka(hostId);
            C22306c<j760<Integer, Message>> c22306cDistinctUntilChanged = CoreModule.f17545c.f19642f0.m32995in(hostId, convId).distinctUntilChanged();
            final Function2 function2 = new Function2() { // from class: l.g4w
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return r4w.m177835a((User) obj, (j760) obj2);
                }
            };
            C22306c c22306cDuringCreated = lifecycleProvider.duringCreated(mkd0.m154984r(c22306cM169410Ka, c22306cDistinctUntilChanged, new x9j() { // from class: l.i4w
                @Override // p149l.x9j
                public final Object call(Object obj, Object obj2) {
                    return r4w.m177845k(function2, obj, obj2);
                }
            }));
            final Function1 function1 = new Function1() { // from class: l.j4w
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return r4w.m177843i((j760) obj);
                }
            };
            c22306cDuringCreated.filter(new w9j() { // from class: l.k4w
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return r4w.m177844j(function1, obj);
                }
            }).subscribe(mkd0.m154955G(new e30() { // from class: l.l4w
                @Override // p149l.e30
                public final void call(Object obj) {
                    r4w.m177840f(notBlurAvatar, hostId, notExpire, convId, progress, (j760) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: l */
    public final boolean m177858l(@Nullable Conversation conv) {
        return (conv == null || m177869w(conv) || m177866t(Long.valueOf(conv.property.intl_love_buzz.expire)) || conv.f20374mm >= 10) ? false : true;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m177859m(@Nullable Conversation conv) {
        if (conv == null) {
            return false;
        }
        if (TEnum.equals(conv.status, "dismissed")) {
            return true;
        }
        return !m177869w(conv) && conv.f20374mm < 10;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m177860n(@Nullable Conversation conv) {
        return conv != null && Intrinsics.m87488d("lovebuzz", conv.convType);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m177861o(@Nullable Conversation conv) {
        ConversationProperty conversationProperty;
        ConversationLoveBuzz conversationLoveBuzz;
        String str;
        if (conv == null || (conversationProperty = conv.property) == null || (conversationLoveBuzz = conversationProperty.intl_love_buzz) == null || (str = conversationLoveBuzz.biz) == null) {
            return false;
        }
        return TextUtils.equals("voiceBuzz", str) || TextUtils.equals("videoBuzz", str) || TextUtils.equals("memojiBuzz", str);
    }

    /* JADX INFO: renamed from: p */
    public final boolean m177862p(@Nullable Conversation conv) {
        ConversationProperty conversationProperty;
        ConversationLoveBuzz conversationLoveBuzz;
        return (!m177860n(conv) || conv == null || (conversationProperty = conv.property) == null || (conversationLoveBuzz = conversationProperty.intl_love_buzz) == null || !TextUtils.equals("textBuzz", conversationLoveBuzz.biz) || TextUtils.equals(Active.TYPE, conversationLoveBuzz.mode)) ? false : true;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m177863q(@Nullable Conversation conv) {
        ConversationProperty conversationProperty;
        ConversationLoveBuzz conversationLoveBuzz;
        String str;
        if (!m177860n(conv) || conv == null || (conversationProperty = conv.property) == null || (conversationLoveBuzz = conversationProperty.intl_love_buzz) == null || (str = conversationLoveBuzz.biz) == null) {
            return false;
        }
        return TextUtils.equals("textBuzz", str);
    }

    /* JADX INFO: renamed from: r */
    public final boolean m177864r(@Nullable Conversation conv) {
        if (conv == null || m177869w(conv) || conv.f20374mm >= 10) {
            return false;
        }
        return m177866t(Long.valueOf(conv.property.intl_love_buzz.expire)) || conv.f20374mm >= 10;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m177865s(@Nullable Conversation conv) {
        ConversationProperty conversationProperty;
        ConversationLoveBuzz conversationLoveBuzz;
        return m177866t((conv == null || (conversationProperty = conv.property) == null || (conversationLoveBuzz = conversationProperty.intl_love_buzz) == null) ? null : Long.valueOf(conversationLoveBuzz.expire));
    }

    /* JADX INFO: renamed from: t */
    public final boolean m177866t(@Nullable Long expire) {
        return expire == null || expire.longValue() - mqi0.m155944o() > 0;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m177867u(@Nullable Conversation conv) {
        if (conv == null || !INSTANCE.m177862p(conv)) {
            return false;
        }
        return TextUtils.isEmpty(conv.clearedUntil);
    }

    /* JADX INFO: renamed from: v */
    public final boolean m177868v(@Nullable Conversation conv) {
        return conv != null && conv.userMessageCount <= 0 && !conv.localHasMessage && m177862p(conv) && m177865s(conv) && !conv.property.intl_love_buzz.prolonged;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m177869w(Conversation conv) {
        return (Intrinsics.m87488d("lovebuzz", conv.convType) && NullChecker.m81303a(conv.property.intl_love_buzz) && t49.m187151e() && !m177861o(conv)) ? false : true;
    }

    @Nullable
    /* JADX INFO: renamed from: x */
    public final ArrayList<BreakIce> m177870x(@NotNull Gender gender) {
        gender.getClass();
        List<LetterWrapper> listM200497C = CoreModule.f17546d.m200497C(gender, i0g0.m133885y(), true);
        if (vwb.m200296J(listM200497C)) {
            return null;
        }
        listM200497C.getClass();
        List<LetterWrapper> listShuffled = CollectionsKt.shuffled(listM200497C);
        ArrayList<BreakIce> arrayList = new ArrayList<>();
        for (LetterWrapper letterWrapper : listShuffled) {
            BreakIce breakIce = new BreakIce();
            breakIce.content = letterWrapper.letter;
            arrayList.add(breakIce);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: y */
    public final String m177871y(String uid) {
        String str = new uqd0("LOVE_BUZZ_UNLOCK_100_" + uid + "_" + CoreModule.m29931H().userId(), "").get();
        str.getClass();
        return str;
    }

    /* JADX INFO: renamed from: z */
    public final String m177872z(String uid) {
        String str = new uqd0("LOVE_BUZZ_UNLOCK_50_" + uid + "_" + CoreModule.m29931H().userId(), "").get();
        str.getClass();
        return str;
    }
}
