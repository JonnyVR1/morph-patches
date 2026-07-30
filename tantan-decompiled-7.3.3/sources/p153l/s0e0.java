package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0003J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0003R\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013¨\u0006\u0015"}, m88121d2 = {"Ll/s0e0;", "", "<init>", "()V", "", "b", "e", Constants.INAPP_DATA_TAG, "", "a", "()Z", "c", "", "I", "INSERT_VIRTUAL_RIGHT_SWIPE_NO_MATCH_COUNT", "Ll/vxd0;", "Ll/vxd0;", "insertVirtual_current_right_Swipe_count", "Ll/byd0;", "Ll/byd0;", "insertvirtual_swpieCard_daytime", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class s0e0 {

    @NotNull
    public static final s0e0 INSTANCE = new s0e0();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static int INSERT_VIRTUAL_RIGHT_SWIPE_NO_MATCH_COUNT = 10;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final vxd0 insertVirtual_current_right_Swipe_count = new vxd0("insertVirtual_current_right_Swipe_count" + CoreModule.m30929H().userId(), 0);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final byd0 insertvirtual_swpieCard_daytime = new byd0("insertvirtual_swpieCard_daytime" + CoreModule.m30929H().userId(), 0L);

    /* JADX INFO: renamed from: a */
    public final boolean m183922a() {
        if (spl0.m187369U()) {
            Long l2 = insertvirtual_swpieCard_daytime.get();
            long jM174453n = pzi0.m174453n();
            if (l2 != null && l2.longValue() == jM174453n) {
                Integer num = insertVirtual_current_right_Swipe_count.get();
                int i = INSERT_VIRTUAL_RIGHT_SWIPE_NO_MATCH_COUNT;
                if (num != null && num.intValue() == i && !joa.m146361M3()) {
                    return true;
                }
            }
            return false;
        }
        if (s7a.m184990s()) {
            Long l3 = insertvirtual_swpieCard_daytime.get();
            long jM174453n2 = pzi0.m174453n();
            if (l3 != null && l3.longValue() == jM174453n2) {
                Integer num2 = insertVirtual_current_right_Swipe_count.get();
                int i2 = INSERT_VIRTUAL_RIGHT_SWIPE_NO_MATCH_COUNT;
                if (num2 != null && num2.intValue() == i2 && !joa.m146359I3() && !joa.m146357G3()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final void m183923b() {
        insertvirtual_swpieCard_daytime.put(Long.valueOf(pzi0.m174453n()));
        insertVirtual_current_right_Swipe_count.put(Integer.valueOf(INSERT_VIRTUAL_RIGHT_SWIPE_NO_MATCH_COUNT));
    }

    /* JADX INFO: renamed from: c */
    public final void m183924c() {
        if (m183922a()) {
            CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
            userInfo.f20214id = CoreSuggested.UserInfo.VIRTUAL_CARD;
            userInfo.virtualCardType = VirtualCardType.SayHiADCard;
            userInfo.preSwipedDirection = SwipeDirection.LEFT;
            CoreModule.f18264c.f20405m0.m32157w6(userInfo, 0);
            CoreModule.m30933P().m143408e().mo35981br();
            m183926e();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m183925d() {
        Integer num = 0;
        if (spl0.m187369U() && joa.m146361M3()) {
            insertVirtual_current_right_Swipe_count.put(num);
            insertvirtual_swpieCard_daytime.put(0L);
            return;
        }
        if (s7a.m184990s() && (joa.m146359I3() || joa.m146357G3())) {
            insertVirtual_current_right_Swipe_count.put(num);
            insertvirtual_swpieCard_daytime.put(0L);
            return;
        }
        vxd0 vxd0Var = insertVirtual_current_right_Swipe_count;
        Integer num2 = vxd0Var.get();
        byd0 byd0Var = insertvirtual_swpieCard_daytime;
        if (byd0Var.get().longValue() < pzi0.m174453n()) {
            byd0Var.put(Long.valueOf(pzi0.m174453n()));
        } else {
            num = num2;
        }
        vxd0Var.put(Integer.valueOf(num.intValue() + 1));
    }

    /* JADX INFO: renamed from: e */
    public final void m183926e() {
        insertvirtual_swpieCard_daytime.put(Long.valueOf(pzi0.m174453n() + 1));
        vxd0 vxd0Var = insertVirtual_current_right_Swipe_count;
        int i = INSERT_VIRTUAL_RIGHT_SWIPE_NO_MATCH_COUNT + 1;
        INSERT_VIRTUAL_RIGHT_SWIPE_NO_MATCH_COUNT = i;
        vxd0Var.put(Integer.valueOf(i));
    }
}
