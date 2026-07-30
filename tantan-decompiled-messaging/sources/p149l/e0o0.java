package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.Owner;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveMember;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\t2\u000e\u0010\r\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\t2\u000e\u0010\r\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\fH\u0007¢\u0006\u0004\b\u0010\u0010\u000fJ'\u0010\u0012\u001a\u00020\t2\u000e\u0010\r\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\f2\u0006\u0010\u0011\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\t2\u000e\u0010\r\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\fH\u0007¢\u0006\u0004\b\u0014\u0010\u000fJ'\u0010\u0015\u001a\u00020\t2\u000e\u0010\r\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\f2\u0006\u0010\u0011\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0015\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\t2\u000e\u0010\r\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\fH\u0007¢\u0006\u0004\b\u0016\u0010\u000fJ'\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00062\u000e\u0010\r\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\fH\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00062\u000e\u0010\r\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\fH\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\t2\u000e\u0010\r\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\fH\u0007¢\u0006\u0004\b!\u0010\u000fJ\u001f\u0010$\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u0011\u001a\u00020\u0006H\u0007¢\u0006\u0004\b$\u0010%J%\u0010&\u001a\u00020\u00062\u000e\u0010\r\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\f2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b&\u0010'¨\u0006("}, m87232d2 = {"Ll/e0o0;", "", "<init>", "()V", "Lcom/p1/mobile/putong/live/base/data/BLiveMember;", "member", "", "e", "(Lcom/p1/mobile/putong/live/base/data/BLiveMember;)Ljava/lang/String;", "", "p", "(Lcom/p1/mobile/putong/live/base/data/BLiveMember;)Z", "Ll/h4t;", "presenter", "h", "(Ll/h4t;)Z", "g", "userId", "j", "(Ll/h4t;Ljava/lang/String;)Z", RXScreenCaptureService.KEY_INDEX, "r", "q", "o", "(Ljava/lang/String;Ll/h4t;)Z", BLiveStormDanmakuGiftResourceType.f44444l, "(Ll/h4t;)Ljava/lang/String;", "identity", "n", "(Ljava/lang/String;)Ljava/lang/String;", "", "m", "(Ljava/lang/String;)I", Constants.INAPP_DATA_TAG, "Ll/nnn0;", "data", "f", "(Ll/nnn0;Ljava/lang/String;)Ljava/lang/String;", "k", "(Ll/h4t;Ljava/lang/String;)Ljava/lang/String;", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class e0o0 {

    @NotNull
    public static final e0o0 INSTANCE = new e0o0();

    /* JADX INFO: renamed from: a */
    public static Boolean m114315a(String str, BLiveVoiceCall bLiveVoiceCall) {
        bLiveVoiceCall.getClass();
        return Boolean.valueOf(Intrinsics.m87488d(str, bLiveVoiceCall.user));
    }

    /* JADX INFO: renamed from: b */
    public static Boolean m114316b(String str, String str2) {
        return Boolean.valueOf(TextUtils.equals(str2, str));
    }

    /* JADX INFO: renamed from: c */
    public static Boolean m114317c(String str, BLiveVoiceCall bLiveVoiceCall) {
        bLiveVoiceCall.getClass();
        return Boolean.valueOf(Intrinsics.m87488d(str, bLiveVoiceCall.user));
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final boolean m114318d(@NotNull h4t<?, ?> presenter) {
        presenter.getClass();
        String strM199309D0 = ypv.f199493a.m199309D0();
        strM199309D0.getClass();
        Object objM129297F3 = presenter.m129297F3(new qul0(strM199309D0));
        objM129297F3.getClass();
        return ((Boolean) objM129297F3).booleanValue();
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final String m114319e(@Nullable BLiveMember member) {
        if (member == null) {
            return "default";
        }
        if (TEnum.equals(member.role, "anchor")) {
            return "anchor";
        }
        return member.isManager ? "manager" : "default";
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: f */
    public static final String m114320f(@NotNull nnn0 data, @NotNull final String userId) {
        data.getClass();
        userId.getClass();
        if (TextUtils.equals(data.m132140j0(), userId)) {
            return "anchor";
        }
        return vwb.m200337m(data.f108769z.m181788n().m221515e(), new w9j() { // from class: l.c0o0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return e0o0.m114316b(userId, (String) obj);
            }
        }) ? "manager" : "default";
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final boolean m114321g(@NotNull h4t<?, ?> presenter) {
        presenter.getClass();
        String strM199309D0 = ypv.f199493a.m199309D0();
        strM199309D0.getClass();
        return m114328o(strM199309D0, presenter);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [l.ho2, l.lh20] */
    @JvmStatic
    /* JADX INFO: renamed from: h */
    public static final boolean m114322h(@NotNull h4t<?, ?> presenter) {
        presenter.getClass();
        String strM199309D0 = ypv.f199493a.m199309D0();
        if (presenter.m206027E2() instanceof nnn0) {
            Object objM206027E2 = presenter.m206027E2();
            objM206027E2.getClass();
            BLiveMember bLiveMemberM201354G = ((nnn0) objM206027E2).m160249P2().m102069r().m201354G(strM199309D0);
            if ((bLiveMemberM201354G != null && bLiveMemberM201354G.isManager) || presenter.m206027E2().mo97490p()) {
                return true;
            }
        }
        return false;
    }

    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static final boolean m114323i(@NotNull h4t<?, ?> presenter) {
        presenter.getClass();
        if (!(presenter.m206027E2() instanceof nnn0)) {
            return false;
        }
        Object objM206027E2 = presenter.m206027E2();
        objM206027E2.getClass();
        return alk0.m97309h(((nnn0) objM206027E2).m160261Y2());
    }

    @JvmStatic
    /* JADX INFO: renamed from: j */
    public static final boolean m114324j(@NotNull h4t<?, ?> presenter, @NotNull String userId) {
        presenter.getClass();
        userId.getClass();
        if (presenter.m206027E2() instanceof nnn0) {
            Object objM206027E2 = presenter.m206027E2();
            objM206027E2.getClass();
            BLiveMember bLiveMemberM201354G = ((nnn0) objM206027E2).m160249P2().m102069r().m201354G(userId);
            if (bLiveMemberM201354G != null && bLiveMemberM201354G.isManager) {
                return true;
            }
        }
        return false;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: l */
    public static final String m114325l(@NotNull h4t<?, ?> presenter) {
        presenter.getClass();
        if (m114321g(presenter)) {
            return "anchor";
        }
        if (m114322h(presenter)) {
            return "manager";
        }
        String strM199309D0 = ypv.f199493a.m199309D0();
        strM199309D0.getClass();
        Object objM129297F3 = presenter.m129297F3(new qul0(strM199309D0));
        objM129297F3.getClass();
        return ((Boolean) objM129297F3).booleanValue() ? "member" : "passerby";
    }

    @JvmStatic
    /* JADX INFO: renamed from: m */
    public static final int m114326m(@NotNull String identity) {
        identity.getClass();
        int iHashCode = identity.hashCode();
        if (iHashCode == 106164915) {
            if (identity.equals(Owner.TYPE)) {
                return i3c0.f111154s0;
            }
            return 0;
        }
        if (iHashCode == 312905843) {
            if (identity.equals("settledMember")) {
                return i3c0.f110685E;
            }
            return 0;
        }
        if (iHashCode == 835260333 && identity.equals("manager")) {
            return i3c0.f111105o;
        }
        return 0;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: n */
    public static final String m114327n(@NotNull String identity) {
        identity.getClass();
        int iHashCode = identity.hashCode();
        if (iHashCode == 106164915) {
            return !identity.equals(Owner.TYPE) ? "" : "群主";
        }
        if (iHashCode != 312905843) {
            return (iHashCode == 835260333 && identity.equals("manager")) ? "管理" : "";
        }
        return !identity.equals("settledMember") ? "" : "成员";
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2] */
    @JvmStatic
    /* JADX INFO: renamed from: o */
    public static final boolean m114328o(@NotNull String userId, @NotNull h4t<?, ?> presenter) {
        userId.getClass();
        presenter.getClass();
        User userM132146l0 = presenter.m206027E2().m132146l0();
        return userM132146l0 != null && TextUtils.equals(userId, userM132146l0.f56011id);
    }

    @JvmStatic
    /* JADX INFO: renamed from: p */
    public static final boolean m114329p(@Nullable BLiveMember member) {
        if (member == null) {
            return false;
        }
        return TEnum.equals(member.role, "anchor") || member.isManager;
    }

    @JvmStatic
    /* JADX INFO: renamed from: q */
    public static final boolean m114330q(@NotNull h4t<?, ?> presenter) {
        presenter.getClass();
        if (presenter.m206027E2() instanceof nnn0) {
            Object objM206027E2 = presenter.m206027E2();
            objM206027E2.getClass();
            List<BLiveVoiceCall> listM102067p = ((nnn0) objM206027E2).m160249P2().m102067p();
            final String strM199309D0 = ypv.f199493a.m199309D0();
            BLiveVoiceCall bLiveVoiceCall = (BLiveVoiceCall) vwb.m200346r(listM102067p, new w9j() { // from class: l.b0o0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return e0o0.m114317c(strM199309D0, (BLiveVoiceCall) obj);
                }
            });
            if (bLiveVoiceCall != null) {
                return alk0.m97309h(bLiveVoiceCall);
            }
        }
        return false;
    }

    @JvmStatic
    /* JADX INFO: renamed from: r */
    public static final boolean m114331r(@NotNull h4t<?, ?> presenter, @NotNull final String userId) {
        presenter.getClass();
        userId.getClass();
        if (presenter.m206027E2() instanceof nnn0) {
            Object objM206027E2 = presenter.m206027E2();
            objM206027E2.getClass();
            BLiveVoiceCall bLiveVoiceCall = (BLiveVoiceCall) vwb.m200346r(((nnn0) objM206027E2).m160249P2().m102067p(), new w9j() { // from class: l.d0o0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return e0o0.m114315a(userId, (BLiveVoiceCall) obj);
                }
            });
            if (bLiveVoiceCall != null) {
                return alk0.m97309h(bLiveVoiceCall);
            }
        }
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final String m114332k(@NotNull h4t<?, ?> presenter, @NotNull String userId) {
        presenter.getClass();
        userId.getClass();
        if (!(presenter.m206027E2() instanceof nnn0)) {
            return "";
        }
        Object objM206027E2 = presenter.m206027E2();
        objM206027E2.getClass();
        return m114319e(((nnn0) objM206027E2).m160249P2().m102069r().m201354G(userId));
    }
}
