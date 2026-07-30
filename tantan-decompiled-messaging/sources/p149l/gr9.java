package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.putong.api.ABManager;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00072\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003¨\u0006\b"}, m87232d2 = {"Ll/gr9;", "Lcom/p1/mobile/putong/api/ABManager$d;", "<init>", "()V", "", "a", "b", "Companion", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class gr9 implements ABManager.InterfaceC4678d {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final boolean m127678c() {
        return INSTANCE.m127685a();
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final boolean m127679d() {
        return INSTANCE.m127686b();
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final boolean m127680e() {
        return INSTANCE.m127687c();
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final boolean m127681f() {
        return INSTANCE.m127688d();
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final boolean m127682g() {
        return INSTANCE.m127689e();
    }

    @JvmStatic
    /* JADX INFO: renamed from: h */
    public static final boolean m127683h() {
        return INSTANCE.m127690f();
    }

    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static final boolean m127684i() {
        return INSTANCE.m127692h();
    }

    /* JADX INFO: renamed from: l.gr9$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u0006J\r\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0006J\u000f\u0010\f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0010R\u0014\u0010\u0016\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0010R\u0014\u0010\u0017\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0010¨\u0006\u0018"}, m87232d2 = {"Ll/gr9$a;", "", "<init>", "()V", "", "f", "()Z", "b", Constants.INAPP_DATA_TAG, "e", "c", "g", "h", "a", "", "REV_BOOST_BLACKGOLD", "Ljava/lang/String;", "ALL_MY_LIKES_SHOW", "REV_SEE_CARD_SAY_HI", "REV_SEECARD_SAYHI_OLD2", "REV_FUJINDEREN_ZAIXIANZHUANQU", "REV_MEET2", "REV_MYVIP_UI", "REV_VISITORS_REFACTOR", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public final boolean m127685a() {
            return false;
        }

        @JvmStatic
        /* JADX INFO: renamed from: b */
        public final boolean m127686b() {
            return false;
        }

        @JvmStatic
        /* JADX INFO: renamed from: c */
        public final boolean m127687c() {
            return false;
        }

        @JvmStatic
        /* JADX INFO: renamed from: d */
        public final boolean m127688d() {
            return TextUtils.equals(AuthenticationTokenClaims.JSON_KEY_EXP, ABManager.m29350i0("REV_seecard_sayhi")) || m127689e();
        }

        @JvmStatic
        /* JADX INFO: renamed from: e */
        public final boolean m127689e() {
            return false;
        }

        @JvmStatic
        /* JADX INFO: renamed from: f */
        public final boolean m127690f() {
            return false;
        }

        /* JADX INFO: renamed from: g */
        public final boolean m127691g() {
            return false;
        }

        @JvmStatic
        /* JADX INFO: renamed from: h */
        public final boolean m127692h() {
            return TextUtils.equals(AuthenticationTokenClaims.JSON_KEY_EXP, ABManager.m29350i0("REV_visitor_code_reform"));
        }

        public Companion() {
        }
    }

    @Override // com.p046p1.mobile.putong.api.ABManager.InterfaceC4678d
    /* JADX INFO: renamed from: a */
    public void mo29393a() {
    }

    @Override // com.p046p1.mobile.putong.api.ABManager.InterfaceC4678d
    /* JADX INFO: renamed from: b */
    public void mo29394b() {
    }
}
