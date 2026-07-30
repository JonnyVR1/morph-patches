package p153l;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreIntlAffiliatePromotions;
import com.p051p1.mobile.putong.core.data.IapAffiliatePromotion;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0017¨\u0006\u0019"}, m88121d2 = {"Ll/k9e0;", "Ll/o5e0;", "<init>", "()V", "Ll/abe0;", SocialConstants.TYPE_REQUEST, "Ll/z20;", "", "errorAction", "Landroid/content/Intent;", "c", "(Ll/abe0;Ll/z20;)Landroid/content/Intent;", "", "a", "(Ll/abe0;Ll/z20;)V", "Landroid/net/Uri;", "uri", "", "g", "(Ll/abe0;Landroid/net/Uri;)J", "hitId", "", "f", "(J)Z", "e", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class k9e0 extends o5e0 {
    /* JADX WARN: Code duplicated, block: B:20:0x003d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x003f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // p153l.o5e0
    /* JADX INFO: renamed from: a */
    public void mo95798a(@NotNull abe0 request, @Nullable z20<String, String> errorAction) {
        Uri uri;
        request.getClass();
        Context contextM96739b = request.m96739b();
        String queryParameter = null;
        Act act = contextM96739b instanceof Act ? (Act) contextM96739b : null;
        if (act == null) {
            return;
        }
        try {
            uri = Uri.parse(request.m96740c());
        } catch (Exception unused) {
            uri = null;
        }
        String str = request.m96743f().get("productType");
        if (str == null) {
            if (uri != null) {
                try {
                    queryParameter = uri.getQueryParameter("productType");
                } catch (Exception unused2) {
                }
            }
            str = queryParameter;
        } else {
            if (TextUtils.isEmpty(str)) {
                str = null;
            }
            if (str == null) {
                if (uri != null) {
                    queryParameter = uri.getQueryParameter("productType");
                }
                str = queryParameter;
            }
        }
        long jM148868g = m148868g(request, uri);
        boolean z = jM148868g > 0 && !m148867f(jM148868g);
        boolean z2 = jM148868g > 0 && m148866e(jM148868g);
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1523884742) {
                if (iHashCode != -1191439093) {
                    if (iHashCode == 116765 && str.equals("vip")) {
                        C8927c.m54601O1(act, "p_special_card,deeplink_intl,click", null, null, null, false, null, null, null, 508, null);
                        return;
                    }
                } else if (str.equals(SummarizedPrivilegesId.ultraPremium)) {
                    C8927c.m54597N0(act, "p_special_card,deeplink_intl,click", null, null, null, null, null, 124, null);
                    return;
                }
            } else if (str.equals("seeWhoLikedMe")) {
                C8927c.m54571E1(act, "p_special_card,deeplink_intl,click", null, null, null, 28, null);
                return;
            }
        }
        C8927c.m54567D0(act, "p_special_card,deeplink_intl,click", null, null, null, 0, null, null, null, null, z, !z && jM148868g > 0 && z2, 1020, null);
    }

    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(@NotNull abe0 request, @NotNull z20<String, String> errorAction) {
        request.getClass();
        errorAction.getClass();
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m148866e(long hitId) {
        IapAffiliatePromotion iapAffiliatePromotionM31221w3 = CoreModule.f18264c.f20438x0.m31221w3(hitId);
        if (iapAffiliatePromotionM31221w3 == null) {
            return false;
        }
        return !CoreIntlAffiliatePromotions.m31144V3(iapAffiliatePromotionM31221w3);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m148867f(long hitId) {
        IapAffiliatePromotion iapAffiliatePromotionM31221w3 = CoreModule.f18264c.f20438x0.m31221w3(hitId);
        if (iapAffiliatePromotionM31221w3 == null) {
            return false;
        }
        return CoreModule.f18264c.f20438x0.m31195f4(iapAffiliatePromotionM31221w3);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x001b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0019 A[DONT_INVERT] */
    /* JADX INFO: renamed from: g */
    public final long m148868g(abe0 request, Uri uri) {
        String str = request.m96743f().get("hitId");
        String queryParameter = null;
        if (str == null) {
            if (uri != null) {
                try {
                    queryParameter = uri.getQueryParameter("hitId");
                } catch (Exception unused) {
                }
            }
            str = queryParameter;
        } else {
            if (TextUtils.isEmpty(str)) {
                str = null;
            }
            if (str == null) {
                if (uri != null) {
                    queryParameter = uri.getQueryParameter("hitId");
                }
                str = queryParameter;
            }
        }
        if (str == null) {
            return 0L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused2) {
            return 0L;
        }
    }
}
