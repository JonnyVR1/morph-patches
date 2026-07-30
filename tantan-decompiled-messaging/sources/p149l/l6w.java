package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4752r;
import com.p046p1.mobile.putong.core.data.LoveBuzzData;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.data.UserPrivilege;
import com.p046p1.mobile.putong.core.data.UserPrivilegeContent;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0003¨\u0006\u0018"}, m87232d2 = {"Ll/l6w;", "", "<init>", "()V", "", "e", "()I", "f", "", "type", "", "a", "(Ljava/lang/String;)Z", "g", "(Ljava/lang/String;)I", "h", "isChecked", "", "j", "(Z)V", Constants.INAPP_DATA_TAG, "()Z", "c", RXScreenCaptureService.KEY_INDEX, "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class l6w {

    @NotNull
    public static final l6w INSTANCE = new l6w();

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ boolean m148772b(l6w l6wVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "voiceBuzz";
        }
        return l6wVar.m148773a(str);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m148773a(@NotNull String type) {
        type.getClass();
        int iM148778g = m148778g(type);
        return iM148778g > 0 && CoreModule.f17545c.m31485p3() >= ((long) iM148778g);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m148774c() {
        Boolean bool = new hpd0("buzz_consume_tips_shown" + CoreModule.m29931H().userId(), Boolean.FALSE).get();
        bool.getClass();
        return bool.booleanValue();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m148775d() {
        Boolean bool = new hpd0("buzz_consume_tips_" + CoreModule.m29931H().userId(), Boolean.TRUE).get();
        bool.getClass();
        return bool.booleanValue();
    }

    /* JADX INFO: renamed from: e */
    public final int m148776e() {
        LoveBuzzData loveBuzzDataM140468v0 = j8w.INSTANCE.m140473a().m140468v0();
        if (loveBuzzDataM140468v0 != null) {
            return loveBuzzDataM140468v0.remainingTextBuzz;
        }
        return 0;
    }

    /* JADX INFO: renamed from: f */
    public final int m148777f() {
        UserPrivilegeContent userPrivilegeContent;
        UserPrivilege userPrivilegeM210113w4 = CoreModule.f17545c.f19555C0.m210113w4(SummarizedPrivilegesId.get(SummarizedPrivilegesId.buzzProlong));
        if (userPrivilegeM210113w4 == null || (userPrivilegeContent = userPrivilegeM210113w4.content) == null) {
            return 0;
        }
        return userPrivilegeContent.remaining;
    }

    /* JADX INFO: renamed from: g */
    public final int m148778g(@NotNull String type) {
        type.getClass();
        int iHashCode = type.hashCode();
        if (iHashCode != -1019560155) {
            if (iHashCode != 1332422126) {
                if (iHashCode == 1740758636 && type.equals("memojiBuzz")) {
                    return C4752r.INSTANCE.m34586b();
                }
            } else if (type.equals("videoBuzz")) {
                return C4752r.INSTANCE.m34587c();
            }
        } else if (type.equals("voiceBuzz")) {
            return C4752r.INSTANCE.m34588d();
        }
        return C4752r.INSTANCE.m34585a();
    }

    /* JADX INFO: renamed from: h */
    public final int m148779h(@NotNull String type) {
        type.getClass();
        return CoreModule.f17554l.m94656g().mo34993A6(type);
    }

    /* JADX INFO: renamed from: i */
    public final void m148780i() {
        new hpd0("buzz_consume_tips_shown" + CoreModule.m29931H().userId(), Boolean.FALSE).put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: j */
    public final void m148781j(boolean isChecked) {
        new hpd0("buzz_consume_tips_" + CoreModule.m29931H().userId(), Boolean.TRUE).put(Boolean.valueOf(isChecked));
    }
}
