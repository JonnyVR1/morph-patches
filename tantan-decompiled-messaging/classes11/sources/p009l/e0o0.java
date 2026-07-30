package p009l;

import android.text.TextUtils;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.data.BLiveMember;
import com.p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.sina.weibo.sdk.web.WebPicUploadResult;
import com.tantanapp.common.data.DbObject;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import l.alk0;
import l.h4t;
import l.ho2;
import l.i3c0;
import l.nnn0;
import l.qul0;
import l.vwb;
import l.w9j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\t2\u000e\u0010\r\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\t2\u000e\u0010\r\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\fH\u0007¢\u0006\u0004\b\u0010\u0010\u000fJ'\u0010\u0012\u001a\u00020\t2\u000e\u0010\r\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\f2\u0006\u0010\u0011\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\t2\u000e\u0010\r\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\fH\u0007¢\u0006\u0004\b\u0014\u0010\u000fJ'\u0010\u0015\u001a\u00020\t2\u000e\u0010\r\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\f2\u0006\u0010\u0011\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0015\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\t2\u000e\u0010\r\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\fH\u0007¢\u0006\u0004\b\u0016\u0010\u000fJ'\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00062\u000e\u0010\r\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\fH\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00062\u000e\u0010\r\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\fH\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\t2\u000e\u0010\r\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\fH\u0007¢\u0006\u0004\b!\u0010\u000fJ\u001f\u0010$\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u0011\u001a\u00020\u0006H\u0007¢\u0006\u0004\b$\u0010%J%\u0010&\u001a\u00020\u00062\u000e\u0010\r\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\f2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b&\u0010'¨\u0006("}, d2 = {"Ll/e0o0;", "", "<init>", "()V", "Lcom/p1/mobile/putong/live/base/data/BLiveMember;", "member", "", "e", "(Lcom/p1/mobile/putong/live/base/data/BLiveMember;)Ljava/lang/String;", "", "p", "(Lcom/p1/mobile/putong/live/base/data/BLiveMember;)Z", "Ll/h4t;", "presenter", "h", "(Ll/h4t;)Z", "g", "userId", "j", "(Ll/h4t;Ljava/lang/String;)Z", "i", "r", "q", "o", "(Ljava/lang/String;Ll/h4t;)Z", "l", "(Ll/h4t;)Ljava/lang/String;", "identity", "n", "(Ljava/lang/String;)Ljava/lang/String;", "", "m", "(Ljava/lang/String;)I", "d", "Ll/nnn0;", WebPicUploadResult.RESP_UPLOAD_PIC_PARAM_DATA, "f", "(Ll/nnn0;Ljava/lang/String;)Ljava/lang/String;", "k", "(Ll/h4t;Ljava/lang/String;)Ljava/lang/String;", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e0o0 {

    @NotNull
    public static final e0o0 INSTANCE = new e0o0();

    /* JADX INFO: renamed from: a */
    public static Boolean m13612a(String str, BLiveVoiceCall bLiveVoiceCall) {
        bLiveVoiceCall.getClass();
        return Boolean.valueOf(Intrinsics.d(str, bLiveVoiceCall.user));
    }

    /* JADX INFO: renamed from: b */
    public static Boolean m13613b(String str, String str2) {
        return Boolean.valueOf(TextUtils.equals(str2, str));
    }

    /* JADX INFO: renamed from: c */
    public static Boolean m13614c(String str, BLiveVoiceCall bLiveVoiceCall) {
        bLiveVoiceCall.getClass();
        return Boolean.valueOf(Intrinsics.d(str, bLiveVoiceCall.user));
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final boolean m13615d(@NotNull h4t<?, ?> presenter) {
        presenter.getClass();
        String strM23619D0 = ypv.f23196a.m23619D0();
        strM23619D0.getClass();
        Object objF3 = presenter.F3(new qul0(strM23619D0));
        objF3.getClass();
        return ((Boolean) objF3).booleanValue();
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final String m13616e(@Nullable BLiveMember member) {
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
    public static final String m13617f(@NotNull nnn0 data, @NotNull final String userId) {
        data.getClass();
        userId.getClass();
        if (TextUtils.equals(data.j0(), userId)) {
            return "anchor";
        }
        return vwb.m((Collection) ((ho2) data).z.n().e(), new w9j() { // from class: l.c0o0
            public final Object call(Object obj) {
                return e0o0.m13613b(userId, (String) obj);
            }
        }) ? "manager" : "default";
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final boolean m13618g(@NotNull h4t<?, ?> presenter) {
        presenter.getClass();
        String strM23619D0 = ypv.f23196a.m23619D0();
        strM23619D0.getClass();
        return m13625o(strM23619D0, presenter);
    }

    @JvmStatic
    /* JADX INFO: renamed from: h */
    public static final boolean m13619h(@NotNull h4t<?, ?> presenter) {
        presenter.getClass();
        String strM23619D0 = ypv.f23196a.m23619D0();
        if (presenter.E2() instanceof nnn0) {
            nnn0 nnn0VarE2 = presenter.E2();
            nnn0VarE2.getClass();
            BLiveMember bLiveMemberM23838G = nnn0VarE2.P2().r().m23838G(strM23619D0);
            if ((bLiveMemberM23838G != null && bLiveMemberM23838G.isManager) || presenter.E2().p()) {
                return true;
            }
        }
        return false;
    }

    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static final boolean m13620i(@NotNull h4t<?, ?> presenter) {
        presenter.getClass();
        if (!(presenter.E2() instanceof nnn0)) {
            return false;
        }
        nnn0 nnn0VarE2 = presenter.E2();
        nnn0VarE2.getClass();
        return alk0.h(nnn0VarE2.Y2());
    }

    @JvmStatic
    /* JADX INFO: renamed from: j */
    public static final boolean m13621j(@NotNull h4t<?, ?> presenter, @NotNull String userId) {
        presenter.getClass();
        userId.getClass();
        if (presenter.E2() instanceof nnn0) {
            nnn0 nnn0VarE2 = presenter.E2();
            nnn0VarE2.getClass();
            BLiveMember bLiveMemberM23838G = nnn0VarE2.P2().r().m23838G(userId);
            if (bLiveMemberM23838G != null && bLiveMemberM23838G.isManager) {
                return true;
            }
        }
        return false;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: l */
    public static final String m13622l(@NotNull h4t<?, ?> presenter) {
        presenter.getClass();
        if (m13618g(presenter)) {
            return "anchor";
        }
        if (m13619h(presenter)) {
            return "manager";
        }
        String strM23619D0 = ypv.f23196a.m23619D0();
        strM23619D0.getClass();
        Object objF3 = presenter.F3(new qul0(strM23619D0));
        objF3.getClass();
        return ((Boolean) objF3).booleanValue() ? "member" : "passerby";
    }

    @JvmStatic
    /* JADX INFO: renamed from: m */
    public static final int m13623m(@NotNull String identity) {
        identity.getClass();
        int iHashCode = identity.hashCode();
        if (iHashCode == 106164915) {
            if (identity.equals("owner")) {
                return i3c0.s0;
            }
            return 0;
        }
        if (iHashCode == 312905843) {
            if (identity.equals("settledMember")) {
                return i3c0.E;
            }
            return 0;
        }
        if (iHashCode == 835260333 && identity.equals("manager")) {
            return i3c0.o;
        }
        return 0;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: n */
    public static final String m13624n(@NotNull String identity) {
        identity.getClass();
        int iHashCode = identity.hashCode();
        if (iHashCode == 106164915) {
            return !identity.equals("owner") ? "" : "群主";
        }
        if (iHashCode != 312905843) {
            return (iHashCode == 835260333 && identity.equals("manager")) ? "管理" : "";
        }
        return !identity.equals("settledMember") ? "" : "成员";
    }

    @JvmStatic
    /* JADX INFO: renamed from: o */
    public static final boolean m13625o(@NotNull String userId, @NotNull h4t<?, ?> presenter) {
        userId.getClass();
        presenter.getClass();
        User userL0 = presenter.E2().l0();
        return userL0 != null && TextUtils.equals(userId, ((DbObject) userL0).id);
    }

    @JvmStatic
    /* JADX INFO: renamed from: p */
    public static final boolean m13626p(@Nullable BLiveMember member) {
        if (member == null) {
            return false;
        }
        return TEnum.equals(member.role, "anchor") || member.isManager;
    }

    @JvmStatic
    /* JADX INFO: renamed from: q */
    public static final boolean m13627q(@NotNull h4t<?, ?> presenter) {
        presenter.getClass();
        if (presenter.E2() instanceof nnn0) {
            nnn0 nnn0VarE2 = presenter.E2();
            nnn0VarE2.getClass();
            List listP = nnn0VarE2.P2().p();
            final String strM23619D0 = ypv.f23196a.m23619D0();
            BLiveVoiceCall bLiveVoiceCall = (BLiveVoiceCall) vwb.r(listP, new w9j() { // from class: l.b0o0
                public final Object call(Object obj) {
                    return e0o0.m13614c(strM23619D0, (BLiveVoiceCall) obj);
                }
            });
            if (bLiveVoiceCall != null) {
                return alk0.h(bLiveVoiceCall);
            }
        }
        return false;
    }

    @JvmStatic
    /* JADX INFO: renamed from: r */
    public static final boolean m13628r(@NotNull h4t<?, ?> presenter, @NotNull final String userId) {
        presenter.getClass();
        userId.getClass();
        if (presenter.E2() instanceof nnn0) {
            nnn0 nnn0VarE2 = presenter.E2();
            nnn0VarE2.getClass();
            BLiveVoiceCall bLiveVoiceCall = (BLiveVoiceCall) vwb.r(nnn0VarE2.P2().p(), new w9j() { // from class: l.d0o0
                public final Object call(Object obj) {
                    return e0o0.m13612a(userId, (BLiveVoiceCall) obj);
                }
            });
            if (bLiveVoiceCall != null) {
                return alk0.h(bLiveVoiceCall);
            }
        }
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final String m13629k(@NotNull h4t<?, ?> presenter, @NotNull String userId) {
        presenter.getClass();
        userId.getClass();
        if (!(presenter.E2() instanceof nnn0)) {
            return "";
        }
        nnn0 nnn0VarE2 = presenter.E2();
        nnn0VarE2.getClass();
        return m13616e(nnn0VarE2.P2().r().m23838G(userId));
    }
}
