package p153l;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.putong.common.R$string;
import com.p051p1.mobile.putong.data.IntlPurpose;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u0003R,\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u00158\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m88121d2 = {"Ll/lhn;", "", "<init>", "()V", "", "id", "Ll/lhn$a;", "a", "(Ljava/lang/String;)Ll/lhn$a;", "", "e", "()Z", "", Constants.INAPP_DATA_TAG, "Lrx/subjects/b;", "Lrx/subjects/b;", "b", "()Lrx/subjects/b;", "setIntlFriendEditRedDotRefreshObs", "(Lrx/subjects/b;)V", "intlFriendEditRedDotRefreshObs", "", "Ljava/util/List;", "c", "()Ljava/util/List;", "intlFriendPurposeList", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class lhn {

    @NotNull
    public static final lhn INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public static C22508b<Unit> intlFriendEditRedDotRefreshObs;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final List<C18395a> intlFriendPurposeList;

    static {
        lhn lhnVar = new lhn();
        INSTANCE = lhnVar;
        intlFriendEditRedDotRefreshObs = C22508b.m222767b();
        intlFriendPurposeList = new ArrayList();
        lhnVar.m154233d();
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final C18395a m154230a(@NotNull String id) {
        Object next;
        id.getClass();
        Iterator<T> it = intlFriendPurposeList.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.m88377d(((C18395a) next).getId(), id)) {
                return (C18395a) next;
            }
        }
        next = null;
        return (C18395a) next;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final C22508b<Unit> m154231b() {
        return intlFriendEditRedDotRefreshObs;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final List<C18395a> m154232c() {
        return intlFriendPurposeList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public final void m154233d() {
        List<C18395a> list = intlFriendPurposeList;
        list.add(new C18395a(IntlPurpose.long_term_partner, R$string.f18205q0, cbc0.f80808z, cbc0.f80720A, false, cbc0.f80726D, 16, null));
        Object[] objArr = 0 == true ? 1 : 0;
        list.add(new C18395a(IntlPurpose.long_but_short, R$string.f18200p0, cbc0.f80722B, objArr, false, cbc0.f80724C, 24, null));
        list.add(new C18395a(IntlPurpose.short_term_fun, R$string.f18220t0, cbc0.f80740K, cbc0.f80742L, false, cbc0.f80744M, 16, null));
        Object[] objArr2 = 0 == true ? 1 : 0;
        list.add(new C18395a(IntlPurpose.short_but_long, R$string.f18215s0, cbc0.f80745N, objArr2, false, cbc0.f80746O, 24, null));
        list.add(new C18395a(IntlPurpose.new_friends, R$string.f18195o0, cbc0.f80728E, cbc0.f80730F, false, cbc0.f80732G, 16, null));
        list.add(new C18395a(IntlPurpose.not_sure_yet, R$string.f18210r0, cbc0.f80734H, cbc0.f80736I, false, cbc0.f80738J, 16, null));
    }

    /* JADX INFO: renamed from: e */
    public final boolean m154234e() {
        return !uqb0.f180396b0.f170325b.mo31678Ba().get().booleanValue() && uqb0.f180415t <= 3675000;
    }

    /* JADX INFO: renamed from: l.lhn$a */
    @Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0003\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0017\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0014\u0010\u0010R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001a\u0010\u0010¨\u0006 "}, m88121d2 = {"Ll/lhn$a;", "", "", "id", "", AuthenticationTokenClaims.JSON_KEY_NAME, "icon", "bigIcon", "", "isSelected", "profileIcon", "<init>", "(Ljava/lang/String;IIIZI)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "I", Constants.INAPP_DATA_TAG, "e", "Z", "f", "()Z", "g", "(Z)V", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final /* data */ class C18395a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final String id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final int name;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public final int icon;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public final int bigIcon;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public boolean isSelected;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public final int profileIcon;

        public C18395a(@NotNull String str, @StringRes int i, @DrawableRes int i2, @DrawableRes int i3, boolean z, @DrawableRes int i4) {
            str.getClass();
            this.id = str;
            this.name = i;
            this.icon = i2;
            this.bigIcon = i3;
            this.isSelected = z;
            this.profileIcon = i4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getBigIcon() {
            return this.bigIcon;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getIcon() {
            return this.icon;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getProfileIcon() {
            return this.profileIcon;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C18395a)) {
                return false;
            }
            C18395a c18395a = (C18395a) other;
            return Intrinsics.m88377d(this.id, c18395a.id) && this.name == c18395a.name && this.icon == c18395a.icon && this.bigIcon == c18395a.bigIcon && this.isSelected == c18395a.isSelected && this.profileIcon == c18395a.profileIcon;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        /* JADX INFO: renamed from: g */
        public final void m154241g(boolean z) {
            this.isSelected = z;
        }

        public int hashCode() {
            return (((((((((this.id.hashCode() * 31) + Integer.hashCode(this.name)) * 31) + Integer.hashCode(this.icon)) * 31) + Integer.hashCode(this.bigIcon)) * 31) + Boolean.hashCode(this.isSelected)) * 31) + Integer.hashCode(this.profileIcon);
        }

        @NotNull
        public String toString() {
            return "IntlFriendPurposeConfig(id=" + this.id + ", name=" + this.name + ", icon=" + this.icon + ", bigIcon=" + this.bigIcon + ", isSelected=" + this.isSelected + ", profileIcon=" + this.profileIcon + ")";
        }

        public /* synthetic */ C18395a(String str, int i, int i2, int i3, boolean z, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, i2, (i5 & 8) != 0 ? i2 : i3, (i5 & 16) != 0 ? false : z, (i5 & 32) != 0 ? i2 : i4);
        }
    }
}
