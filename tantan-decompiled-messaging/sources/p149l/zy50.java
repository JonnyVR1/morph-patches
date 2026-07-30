package p149l;

import com.p046p1.mobile.putong.core.api.CoreSuggested;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\b¨\u0006\u000b"}, m87232d2 = {"Ll/zy50;", "", "<init>", "()V", "Lcom/p1/mobile/putong/core/api/CoreSuggested$UserInfo;", "otherInfo", "", "c", "(Lcom/p1/mobile/putong/core/api/CoreSuggested$UserInfo;)Z", "a", "b", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class zy50 {

    @NotNull
    public static final zy50 INSTANCE = new zy50();

    /* JADX INFO: renamed from: a */
    public final boolean m220888a(@NotNull CoreSuggested.UserInfo otherInfo) {
        otherInfo.getClass();
        if (!otherInfo.isUserLikeMe() || !gr9.INSTANCE.m127688d()) {
            return false;
        }
        az50.Companion companion = az50.INSTANCE;
        if (!companion.m99638r()) {
            String str = otherInfo.f19472id;
            str.getClass();
            if (!companion.m99629i(str)) {
                return false;
            }
        }
        return companion.m99633m();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m220889b(CoreSuggested.UserInfo otherInfo) {
        if (m220888a(otherInfo) && emr.INSTANCE.m117219a()) {
            return true;
        }
        emr emrVar = emr.INSTANCE;
        String str = otherInfo.f19472id;
        str.getClass();
        return emrVar.m117224f(str);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m220890c(@NotNull CoreSuggested.UserInfo otherInfo) {
        otherInfo.getClass();
        return otherInfo.isUserLikeMe() && m220889b(otherInfo);
    }
}
