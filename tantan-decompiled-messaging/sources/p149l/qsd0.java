package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0003J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0003R\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013¨\u0006\u0015"}, m87232d2 = {"Ll/qsd0;", "", "<init>", "()V", "", "b", "e", Constants.INAPP_DATA_TAG, "", "a", "()Z", "c", "", "I", "INSERT_VIRTUAL_RIGHT_SWIPE_NO_MATCH_COUNT", "Ll/tpd0;", "Ll/tpd0;", "insertVirtual_current_right_Swipe_count", "Ll/zpd0;", "Ll/zpd0;", "insertvirtual_swpieCard_daytime", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class qsd0 {

    @NotNull
    public static final qsd0 INSTANCE = new qsd0();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static int INSERT_VIRTUAL_RIGHT_SWIPE_NO_MATCH_COUNT = 10;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final tpd0 insertVirtual_current_right_Swipe_count = new tpd0("insertVirtual_current_right_Swipe_count" + CoreModule.m29931H().userId(), 0);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final zpd0 insertvirtual_swpieCard_daytime = new zpd0("insertvirtual_swpieCard_daytime" + CoreModule.m29931H().userId(), 0L);

    /* JADX INFO: renamed from: a */
    public final boolean m176227a() {
        if (ogl0.m164242U()) {
            Long l2 = insertvirtual_swpieCard_daytime.get();
            long jM155943n = mqi0.m155943n();
            if (l2 != null && l2.longValue() == jM155943n) {
                Integer num = insertVirtual_current_right_Swipe_count.get();
                int i = INSERT_VIRTUAL_RIGHT_SWIPE_NO_MATCH_COUNT;
                if (num != null && num.intValue() == i && !xma.m210047L3()) {
                    return true;
                }
            }
            return false;
        }
        if (g6a.m124570s()) {
            Long l3 = insertvirtual_swpieCard_daytime.get();
            long jM155943n2 = mqi0.m155943n();
            if (l3 != null && l3.longValue() == jM155943n2) {
                Integer num2 = insertVirtual_current_right_Swipe_count.get();
                int i2 = INSERT_VIRTUAL_RIGHT_SWIPE_NO_MATCH_COUNT;
                if (num2 != null && num2.intValue() == i2 && !xma.m210045H3() && !xma.m210043F3()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final void m176228b() {
        insertvirtual_swpieCard_daytime.put(Long.valueOf(mqi0.m155943n()));
        insertVirtual_current_right_Swipe_count.put(Integer.valueOf(INSERT_VIRTUAL_RIGHT_SWIPE_NO_MATCH_COUNT));
    }

    /* JADX INFO: renamed from: c */
    public final void m176229c() {
        if (m176227a()) {
            CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
            userInfo.f19472id = CoreSuggested.UserInfo.VIRTUAL_CARD;
            userInfo.virtualCardType = VirtualCardType.SayHiADCard;
            userInfo.preSwipedDirection = SwipeDirection.LEFT;
            CoreModule.f17545c.f19663m0.m31154w6(userInfo, 0);
            CoreModule.m29935P().m94654e().mo34978br();
            m176231e();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m176230d() {
        Integer num = 0;
        if (ogl0.m164242U() && xma.m210047L3()) {
            insertVirtual_current_right_Swipe_count.put(num);
            insertvirtual_swpieCard_daytime.put(0L);
            return;
        }
        if (g6a.m124570s() && (xma.m210045H3() || xma.m210043F3())) {
            insertVirtual_current_right_Swipe_count.put(num);
            insertvirtual_swpieCard_daytime.put(0L);
            return;
        }
        tpd0 tpd0Var = insertVirtual_current_right_Swipe_count;
        Integer num2 = tpd0Var.get();
        zpd0 zpd0Var = insertvirtual_swpieCard_daytime;
        if (zpd0Var.get().longValue() < mqi0.m155943n()) {
            zpd0Var.put(Long.valueOf(mqi0.m155943n()));
        } else {
            num = num2;
        }
        tpd0Var.put(Integer.valueOf(num.intValue() + 1));
    }

    /* JADX INFO: renamed from: e */
    public final void m176231e() {
        insertvirtual_swpieCard_daytime.put(Long.valueOf(mqi0.m155943n() + 1));
        tpd0 tpd0Var = insertVirtual_current_right_Swipe_count;
        int i = INSERT_VIRTUAL_RIGHT_SWIPE_NO_MATCH_COUNT + 1;
        INSERT_VIRTUAL_RIGHT_SWIPE_NO_MATCH_COUNT = i;
        tpd0Var.put(Integer.valueOf(i));
    }
}
