package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.putong.api.ABManager;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00072\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003¨\u0006\b"}, m88121d2 = {"Ll/rs9;", "Lcom/p1/mobile/putong/api/ABManager$d;", "<init>", "()V", "", "a", "b", "Companion", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class rs9 implements ABManager.InterfaceC4829d {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final boolean m182934c() {
        return INSTANCE.m182941a();
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final boolean m182935d() {
        return INSTANCE.m182942b();
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final boolean m182936e() {
        return INSTANCE.m182943c();
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final boolean m182937f() {
        return INSTANCE.m182944d();
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final boolean m182938g() {
        return INSTANCE.m182945e();
    }

    @JvmStatic
    /* JADX INFO: renamed from: h */
    public static final boolean m182939h() {
        return INSTANCE.m182946f();
    }

    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static final boolean m182940i() {
        return INSTANCE.m182948h();
    }

    /* JADX INFO: renamed from: l.rs9$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u0006J\r\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0006J\u000f\u0010\f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0010R\u0014\u0010\u0016\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0010R\u0014\u0010\u0017\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0010¨\u0006\u0018"}, m88121d2 = {"Ll/rs9$a;", "", "<init>", "()V", "", "f", "()Z", "b", Constants.INAPP_DATA_TAG, "e", "c", "g", "h", "a", "", "REV_BOOST_BLACKGOLD", "Ljava/lang/String;", "ALL_MY_LIKES_SHOW", "REV_SEE_CARD_SAY_HI", "REV_SEECARD_SAYHI_OLD2", "REV_FUJINDEREN_ZAIXIANZHUANQU", "REV_MEET2", "REV_MYVIP_UI", "REV_VISITORS_REFACTOR", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public final boolean m182941a() {
            return false;
        }

        @JvmStatic
        /* JADX INFO: renamed from: b */
        public final boolean m182942b() {
            return false;
        }

        @JvmStatic
        /* JADX INFO: renamed from: c */
        public final boolean m182943c() {
            return false;
        }

        @JvmStatic
        /* JADX INFO: renamed from: d */
        public final boolean m182944d() {
            return TextUtils.equals(AuthenticationTokenClaims.JSON_KEY_EXP, ABManager.m30348i0("REV_seecard_sayhi")) || m182945e();
        }

        @JvmStatic
        /* JADX INFO: renamed from: e */
        public final boolean m182945e() {
            return false;
        }

        @JvmStatic
        /* JADX INFO: renamed from: f */
        public final boolean m182946f() {
            return false;
        }

        /* JADX INFO: renamed from: g */
        public final boolean m182947g() {
            return false;
        }

        @JvmStatic
        /* JADX INFO: renamed from: h */
        public final boolean m182948h() {
            return TextUtils.equals(AuthenticationTokenClaims.JSON_KEY_EXP, ABManager.m30348i0("REV_visitor_code_reform"));
        }

        public Companion() {
        }
    }

    @Override // com.p051p1.mobile.putong.api.ABManager.InterfaceC4829d
    /* JADX INFO: renamed from: a */
    public void mo30391a() {
    }

    @Override // com.p051p1.mobile.putong.api.ABManager.InterfaceC4829d
    /* JADX INFO: renamed from: b */
    public void mo30392b() {
    }
}
