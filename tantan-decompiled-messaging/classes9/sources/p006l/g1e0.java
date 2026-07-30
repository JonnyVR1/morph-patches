package p006l;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.CoreIntlAffiliatePromotions;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.IapAffiliatePromotion;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.purchase.c;
import com.p1.mobile.putong.data.User;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import l.d30;
import l.e30;
import l.f30;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0017¨\u0006\u0019"}, d2 = {"Ll/g1e0;", "Ll/kxd0;", "<init>", "()V", "Ll/w2e0;", "request", "Ll/f30;", "", "errorAction", "Landroid/content/Intent;", "c", "(Ll/w2e0;Ll/f30;)Landroid/content/Intent;", "", "a", "(Ll/w2e0;Ll/f30;)V", "Landroid/net/Uri;", "uri", "", "g", "(Ll/w2e0;Landroid/net/Uri;)J", "hitId", "", "f", "(J)Z", "e", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class g1e0 extends kxd0 {
    /* JADX WARN: Code duplicated, block: B:20:0x003d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x003f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // p006l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo11681a(@NotNull w2e0 request, @Nullable f30<String, String> errorAction) {
        Uri uri;
        request.getClass();
        Act actM26156b = request.m26156b();
        String queryParameter = null;
        Act act = actM26156b instanceof Act ? actM26156b : null;
        if (act == null) {
            return;
        }
        try {
            uri = Uri.parse(request.m26157c());
        } catch (Exception unused) {
            uri = null;
        }
        String str = request.m26160f().get("productType");
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
        long jM15562g = m15562g(request, uri);
        boolean z = jM15562g > 0 && !m15561f(jM15562g);
        boolean z2 = jM15562g > 0 && m15560e(jM15562g);
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1523884742) {
                if (iHashCode != -1191439093) {
                    if (iHashCode == 116765 && str.equals("vip")) {
                        c.O1(act, "p_special_card,deeplink_intl,click", (Privilege) null, (d30) null, (d30) null, false, (User) null, (Object) null, (e30) null, 508, (Object) null);
                        return;
                    }
                } else if (str.equals("ultraPremium")) {
                    c.N0(act, "p_special_card,deeplink_intl,click", (e30) null, (d30) null, (d30) null, (Privilege) null, (String) null, 124, (Object) null);
                    return;
                }
            } else if (str.equals("seeWhoLikedMe")) {
                c.E1(act, "p_special_card,deeplink_intl,click", (Privilege) null, (d30) null, (Object) null, 28, (Object) null);
                return;
            }
        }
        c.D0(act, "p_special_card,deeplink_intl,click", (Privilege) null, (PurchaseType) null, (e30) null, 0, (d30) null, (d30) null, (String) null, (Object) null, z, !z && jM15562g > 0 && z2, 1020, (Object) null);
    }

    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(@NotNull w2e0 request, @NotNull f30<String, String> errorAction) {
        request.getClass();
        errorAction.getClass();
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m15560e(long hitId) {
        IapAffiliatePromotion iapAffiliatePromotionM2151w3 = CoreModule.f1534c.f3685x0.m2151w3(hitId);
        if (iapAffiliatePromotionM2151w3 == null) {
            return false;
        }
        return !CoreIntlAffiliatePromotions.m2074V3(iapAffiliatePromotionM2151w3);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m15561f(long hitId) {
        IapAffiliatePromotion iapAffiliatePromotionM2151w3 = CoreModule.f1534c.f3685x0.m2151w3(hitId);
        if (iapAffiliatePromotionM2151w3 == null) {
            return false;
        }
        return CoreModule.f1534c.f3685x0.m2125f4(iapAffiliatePromotionM2151w3);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x001b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0019 A[DONT_INVERT] */
    /* JADX INFO: renamed from: g */
    public final long m15562g(w2e0 request, Uri uri) {
        String str = request.m26160f().get("hitId");
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
