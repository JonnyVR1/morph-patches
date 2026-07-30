package p153l;

import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.inapp.evaluation.C1262a;
import com.clevertap.android.sdk.inapp.evaluation.LimitType;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0011\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0013\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, m88121d2 = {"Ll/hor;", "", "Ll/wpm;", "manager", "Ll/wjj0;", "triggerManager", "<init>", "(Ll/wpm;Ll/wjj0;)V", "Lcom/clevertap/android/sdk/inapp/evaluation/a;", Constants.KEY_LIMIT, "", "campaignId", "", "a", "(Lcom/clevertap/android/sdk/inapp/evaluation/a;Ljava/lang/String;)Z", "", "whenLimits", "b", "(Ljava/util/List;Ljava/lang/String;)Z", "c", "Ll/wpm;", "Ll/wjj0;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class hor {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final wpm manager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final wjj0 triggerManager;

    /* JADX INFO: renamed from: l.hor$a */
    @Metadata(m88122k = 3, m88123mv = {2, 0, 0}, m88125xi = 48)
    public /* synthetic */ class C17527a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f110945a;

        static {
            int[] iArr = new int[LimitType.values().length];
            try {
                iArr[LimitType.Session.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LimitType.Seconds.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LimitType.Minutes.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LimitType.Hours.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LimitType.Days.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[LimitType.Weeks.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[LimitType.Ever.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[LimitType.OnEvery.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[LimitType.OnExactly.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f110945a = iArr;
        }
    }

    public hor(@NotNull wpm wpmVar, @NotNull wjj0 wjj0Var) {
        wpmVar.getClass();
        wjj0Var.getClass();
        this.manager = wpmVar;
        this.triggerManager = wjj0Var;
    }

    /* JADX INFO: renamed from: a */
    private final boolean m136452a(C1262a limit, String campaignId) {
        switch (C17527a.f110945a[limit.getLimitType().ordinal()]) {
            case 1:
                return this.manager.m207473h(campaignId) < limit.getCom.clevertap.android.sdk.Constants.KEY_LIMIT java.lang.String();
            case 2:
                return this.manager.m207472g(campaignId, limit.getFrequency()) < limit.getCom.clevertap.android.sdk.Constants.KEY_LIMIT java.lang.String();
            case 3:
                return this.manager.m207471f(campaignId, limit.getFrequency()) < limit.getCom.clevertap.android.sdk.Constants.KEY_LIMIT java.lang.String();
            case 4:
                return this.manager.m207470e(campaignId, limit.getFrequency()) < limit.getCom.clevertap.android.sdk.Constants.KEY_LIMIT java.lang.String();
            case 5:
                return this.manager.m207469d(campaignId, limit.getFrequency()) < limit.getCom.clevertap.android.sdk.Constants.KEY_LIMIT java.lang.String();
            case 6:
                return this.manager.m207475j(campaignId, limit.getFrequency()) < limit.getCom.clevertap.android.sdk.Constants.KEY_LIMIT java.lang.String();
            case 7:
                return this.manager.m207468c(campaignId).size() < limit.getCom.clevertap.android.sdk.Constants.KEY_LIMIT java.lang.String();
            case 8:
                return this.triggerManager.m206686a(campaignId) % limit.getCom.clevertap.android.sdk.Constants.KEY_LIMIT java.lang.String() == 0;
            case 9:
                return this.triggerManager.m206686a(campaignId) == limit.getCom.clevertap.android.sdk.Constants.KEY_LIMIT java.lang.String();
            default:
                nbr.m162172a();
                return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m136453b(@NotNull List<C1262a> whenLimits, @NotNull String campaignId) {
        whenLimits.getClass();
        campaignId.getClass();
        List<C1262a> list = whenLimits;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!m136452a((C1262a) it.next(), campaignId)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m136454c(@NotNull List<C1262a> whenLimits, @NotNull String campaignId) {
        whenLimits.getClass();
        campaignId.getClass();
        while (true) {
            boolean z = false;
            for (C1262a c1262a : whenLimits) {
                if (!z) {
                    if (C17527a.f110945a[c1262a.getLimitType().ordinal()] != 7 || m136452a(c1262a, campaignId)) {
                    }
                }
                z = true;
            }
            return z;
        }
    }
}
