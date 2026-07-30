package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.profile.newme.revamp.common.MeTabIapType;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eR&\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\u0011\u0012\u0004\b\u0014\u0010\u0003\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, m88121d2 = {"Ll/gix;", "", "<init>", "()V", "Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/common/MeTabIapType;", "type", "", "f", "(Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/common/MeTabIapType;)I", "a", "", "e", "(Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/common/MeTabIapType;)Z", "c", "()Z", Constants.INAPP_DATA_TAG, "", "Ljava/util/List;", "b", "()Ljava/util/List;", "getDisplayOrder$annotations", "displayOrder", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class gix {

    @NotNull
    public static final gix INSTANCE = new gix();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final List<MeTabIapType> displayOrder = CollectionsKt.listOf((Object[]) new MeTabIapType[]{MeTabIapType.BOOST, MeTabIapType.SUPER_LIKE, MeTabIapType.COMPLIMENT, MeTabIapType.INSTANT_MATCH});

    /* JADX INFO: renamed from: l.gix$a */
    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final /* synthetic */ class C17218a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f104533a;

        static {
            int[] iArr = new int[MeTabIapType.values().length];
            try {
                iArr[MeTabIapType.BOOST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MeTabIapType.SUPER_LIKE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MeTabIapType.COMPLIMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MeTabIapType.INSTANT_MATCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f104533a = iArr;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final int m130387a(@NotNull MeTabIapType type) {
        type.getClass();
        int i = C17218a.f104533a[type.ordinal()];
        if (i != 1) {
            return i != 2 ? m130391f(type) : a5i0.m96175v0();
        }
        return CoreModule.f18273l.m143405a().mo34378Nf();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final List<MeTabIapType> m130388b() {
        return displayOrder;
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final boolean m130389c() {
        return (INSTANCE.m130392d() || d79.m114660S()) ? false : true;
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final boolean m130390e(@NotNull MeTabIapType type) {
        type.getClass();
        return (type == MeTabIapType.BOOST || type == MeTabIapType.SUPER_LIKE) && INSTANCE.m130392d();
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final int m130391f(@NotNull MeTabIapType type) {
        type.getClass();
        int i = C17218a.f104533a[type.ordinal()];
        if (i == 1) {
            return a5i0.m96122W();
        }
        if (i == 2) {
            return a5i0.m96181x0();
        }
        if (i == 3) {
            return joa.m146399m3();
        }
        if (i == 4) {
            return joa.m146405r3();
        }
        nbr.m162172a();
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m130392d() {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        return NullChecker.m82486a(userM116600p9) && userM116600p9.isUltraPremium() && !joa.m146396k4();
    }
}
