package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4903r;
import com.p051p1.mobile.putong.core.data.LoveBuzzData;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.data.UserPrivilege;
import com.p051p1.mobile.putong.core.data.UserPrivilegeContent;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0003¨\u0006\u0018"}, m88121d2 = {"Ll/j8w;", "", "<init>", "()V", "", "e", "()I", "f", "", "type", "", "a", "(Ljava/lang/String;)Z", "g", "(Ljava/lang/String;)I", "h", "isChecked", "", "j", "(Z)V", Constants.INAPP_DATA_TAG, "()Z", "c", RXScreenCaptureService.KEY_INDEX, "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class j8w {

    @NotNull
    public static final j8w INSTANCE = new j8w();

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ boolean m143903b(j8w j8wVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "voiceBuzz";
        }
        return j8wVar.m143904a(str);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m143904a(@NotNull String type) {
        type.getClass();
        int iM143909g = m143909g(type);
        return iM143909g > 0 && CoreModule.f18264c.m32488p3() >= ((long) iM143909g);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m143905c() {
        Boolean bool = new jxd0("buzz_consume_tips_shown" + CoreModule.m30929H().userId(), Boolean.FALSE).get();
        bool.getClass();
        return bool.booleanValue();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m143906d() {
        Boolean bool = new jxd0("buzz_consume_tips_" + CoreModule.m30929H().userId(), Boolean.TRUE).get();
        bool.getClass();
        return bool.booleanValue();
    }

    /* JADX INFO: renamed from: e */
    public final int m143907e() {
        LoveBuzzData loveBuzzDataM134315v0 = haw.INSTANCE.m134320a().m134315v0();
        if (loveBuzzDataM134315v0 != null) {
            return loveBuzzDataM134315v0.remainingTextBuzz;
        }
        return 0;
    }

    /* JADX INFO: renamed from: f */
    public final int m143908f() {
        UserPrivilegeContent userPrivilegeContent;
        UserPrivilege userPrivilegeM146426x4 = CoreModule.f18264c.f20297C0.m146426x4(SummarizedPrivilegesId.get(SummarizedPrivilegesId.buzzProlong));
        if (userPrivilegeM146426x4 == null || (userPrivilegeContent = userPrivilegeM146426x4.content) == null) {
            return 0;
        }
        return userPrivilegeContent.remaining;
    }

    /* JADX INFO: renamed from: g */
    public final int m143909g(@NotNull String type) {
        type.getClass();
        int iHashCode = type.hashCode();
        if (iHashCode != -1019560155) {
            if (iHashCode != 1332422126) {
                if (iHashCode == 1740758636 && type.equals("memojiBuzz")) {
                    return C4903r.INSTANCE.m35589b();
                }
            } else if (type.equals("videoBuzz")) {
                return C4903r.INSTANCE.m35590c();
            }
        } else if (type.equals("voiceBuzz")) {
            return C4903r.INSTANCE.m35591d();
        }
        return C4903r.INSTANCE.m35588a();
    }

    /* JADX INFO: renamed from: h */
    public final int m143910h(@NotNull String type) {
        type.getClass();
        return CoreModule.f18273l.m143410g().mo35996A6(type);
    }

    /* JADX INFO: renamed from: i */
    public final void m143911i() {
        new jxd0("buzz_consume_tips_shown" + CoreModule.m30929H().userId(), Boolean.FALSE).put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: j */
    public final void m143912j(boolean isChecked) {
        new jxd0("buzz_consume_tips_" + CoreModule.m30929H().userId(), Boolean.TRUE).put(Boolean.valueOf(isChecked));
    }
}
