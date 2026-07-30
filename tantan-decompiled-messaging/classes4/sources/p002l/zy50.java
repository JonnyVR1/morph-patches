package p002l;

import com.p1.mobile.putong.core.api.CoreSuggested;
import kotlin.Metadata;
import l.emr;
import l.gr9;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Ll/zy50;", "", "<init>", "()V", "Lcom/p1/mobile/putong/core/api/CoreSuggested$UserInfo;", "otherInfo", "", "c", "(Lcom/p1/mobile/putong/core/api/CoreSuggested$UserInfo;)Z", "a", "b", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class zy50 {

    @NotNull
    public static final zy50 INSTANCE = new zy50();

    /* JADX INFO: renamed from: a */
    public final boolean m27678a(@NotNull CoreSuggested.UserInfo otherInfo) {
        otherInfo.getClass();
        if (!otherInfo.isUserLikeMe() || !gr9.Companion.d()) {
            return false;
        }
        az50.Companion companion = az50.INSTANCE;
        if (!companion.m10137r()) {
            String str = otherInfo.id;
            str.getClass();
            if (!companion.m10128i(str)) {
                return false;
            }
        }
        return companion.m10132m();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m27679b(CoreSuggested.UserInfo otherInfo) {
        if (m27678a(otherInfo) && emr.INSTANCE.a()) {
            return true;
        }
        emr emrVar = emr.INSTANCE;
        String str = otherInfo.id;
        str.getClass();
        return emrVar.f(str);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m27680c(@NotNull CoreSuggested.UserInfo otherInfo) {
        otherInfo.getClass();
        return otherInfo.isUserLikeMe() && m27679b(otherInfo);
    }
}
