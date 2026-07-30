package p009l;

import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.data.VirtualCardType;
import kotlin.Metadata;
import l.g6a;
import l.ogl0;
import l.tpd0;
import l.xma;
import l.zpd0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0003J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0003R\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013¨\u0006\u0015"}, d2 = {"Ll/qsd0;", "", "<init>", "()V", "", "b", "e", "d", "", "a", "()Z", "c", "", "I", "INSERT_VIRTUAL_RIGHT_SWIPE_NO_MATCH_COUNT", "Ll/tpd0;", "Ll/tpd0;", "insertVirtual_current_right_Swipe_count", "Ll/zpd0;", "Ll/zpd0;", "insertvirtual_swpieCard_daytime", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class qsd0 {

    @NotNull
    public static final qsd0 INSTANCE = new qsd0();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static int INSERT_VIRTUAL_RIGHT_SWIPE_NO_MATCH_COUNT = 10;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final tpd0 insertVirtual_current_right_Swipe_count = new tpd0("insertVirtual_current_right_Swipe_count" + CoreModule.H().userId(), 0);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final zpd0 insertvirtual_swpieCard_daytime = new zpd0("insertvirtual_swpieCard_daytime" + CoreModule.H().userId(), 0L);

    /* JADX INFO: renamed from: a */
    public final boolean m21235a() {
        if (ogl0.U()) {
            Long l2 = (Long) insertvirtual_swpieCard_daytime.get();
            long jM18549n = mqi0.m18549n();
            if (l2 != null && l2.longValue() == jM18549n) {
                Integer num = (Integer) insertVirtual_current_right_Swipe_count.get();
                int i = INSERT_VIRTUAL_RIGHT_SWIPE_NO_MATCH_COUNT;
                if (num != null && num.intValue() == i && !xma.L3()) {
                    return true;
                }
            }
            return false;
        }
        if (g6a.s()) {
            Long l3 = (Long) insertvirtual_swpieCard_daytime.get();
            long jM18549n2 = mqi0.m18549n();
            if (l3 != null && l3.longValue() == jM18549n2) {
                Integer num2 = (Integer) insertVirtual_current_right_Swipe_count.get();
                int i2 = INSERT_VIRTUAL_RIGHT_SWIPE_NO_MATCH_COUNT;
                if (num2 != null && num2.intValue() == i2 && !xma.H3() && !xma.F3()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final void m21236b() {
        insertvirtual_swpieCard_daytime.put(Long.valueOf(mqi0.m18549n()));
        insertVirtual_current_right_Swipe_count.put(Integer.valueOf(INSERT_VIRTUAL_RIGHT_SWIPE_NO_MATCH_COUNT));
    }

    /* JADX INFO: renamed from: c */
    public final void m21237c() {
        if (m21235a()) {
            CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
            userInfo.id = "VirtualCard";
            userInfo.virtualCardType = VirtualCardType.SayHiADCard;
            userInfo.preSwipedDirection = SwipeDirection.LEFT;
            CoreModule.c.m0.w6(userInfo, 0);
            CoreModule.P().e().br();
            m21239e();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m21238d() {
        Integer num = 0;
        if (ogl0.U() && xma.L3()) {
            insertVirtual_current_right_Swipe_count.put(num);
            insertvirtual_swpieCard_daytime.put(0L);
            return;
        }
        if (g6a.s() && (xma.H3() || xma.F3())) {
            insertVirtual_current_right_Swipe_count.put(num);
            insertvirtual_swpieCard_daytime.put(0L);
            return;
        }
        tpd0 tpd0Var = insertVirtual_current_right_Swipe_count;
        Integer num2 = (Integer) tpd0Var.get();
        zpd0 zpd0Var = insertvirtual_swpieCard_daytime;
        if (((Number) zpd0Var.get()).longValue() < mqi0.m18549n()) {
            zpd0Var.put(Long.valueOf(mqi0.m18549n()));
        } else {
            num = num2;
        }
        tpd0Var.put(Integer.valueOf(num.intValue() + 1));
    }

    /* JADX INFO: renamed from: e */
    public final void m21239e() {
        insertvirtual_swpieCard_daytime.put(Long.valueOf(mqi0.m18549n() + 1));
        tpd0 tpd0Var = insertVirtual_current_right_Swipe_count;
        int i = INSERT_VIRTUAL_RIGHT_SWIPE_NO_MATCH_COUNT + 1;
        INSERT_VIRTUAL_RIGHT_SWIPE_NO_MATCH_COUNT = i;
        tpd0Var.put(Integer.valueOf(i));
    }
}
