package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4732c;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\bJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\bJ\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017R\u0014\u0010\u001e\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017R\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, m87232d2 = {"Ll/me7;", "Ll/ax6;", "Lcom/p1/mobile/putong/core/api/c;", "api", "<init>", "(Lcom/p1/mobile/putong/core/api/c;)V", "", "f3", "()V", "g3", "d3", "e3", "", "c3", "()I", "b3", "h3", "", "updateStartMills", "a3", "(Z)V", "Ll/tpd0;", "R", "Ll/tpd0;", "todayMatchCount", j6f.LATITUDE_SOUTH, "todaySwipeCount", j6f.GPS_DIRECTION_TRUE, "currentStartSwipeCount", "U", "currentStartMatchCount", "Ll/zpd0;", j6f.GPS_MEASUREMENT_INTERRUPTED, "Ll/zpd0;", "todaySwipeCountStartMills", "b_core_base"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class me7 extends ax6 {

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @NotNull
    public final tpd0 todayMatchCount;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    @NotNull
    public final tpd0 todaySwipeCount;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @NotNull
    public final tpd0 currentStartSwipeCount;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    @NotNull
    public final tpd0 currentStartMatchCount;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    @NotNull
    public final zpd0 todaySwipeCountStartMills;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me7(@NotNull C4732c c4732c) {
        super(c4732c);
        c4732c.getClass();
        this.todayMatchCount = new tpd0("core_today_match_count_" + CoreModule.m29931H().userId(), 0);
        this.todaySwipeCount = new tpd0("core_today_swipe_count_" + CoreModule.m29931H().userId(), 0);
        this.currentStartSwipeCount = new tpd0("core_start_swipe_count_" + CoreModule.m29931H().userId(), 0);
        this.currentStartMatchCount = new tpd0("core_start_swipe_match_count_" + CoreModule.m29931H().userId(), 0);
        this.todaySwipeCountStartMills = new zpd0("toady_swipe_card_start_mills_" + CoreModule.m29931H().userId(), 0L);
    }

    /* JADX INFO: renamed from: a3 */
    public final void m154141a3(boolean updateStartMills) {
        Long l2 = this.todaySwipeCountStartMills.get();
        l2.getClass();
        if (mqi0.m155929D(l2.longValue())) {
            return;
        }
        if (updateStartMills) {
            this.todaySwipeCountStartMills.put(Long.valueOf(mqi0.m155944o()));
        }
        this.todayMatchCount.put(0);
        this.todaySwipeCount.put(0);
    }

    /* JADX INFO: renamed from: b3 */
    public final int m154142b3() {
        Integer num = this.currentStartMatchCount.get();
        num.getClass();
        return num.intValue();
    }

    /* JADX INFO: renamed from: c3 */
    public final int m154143c3() {
        Integer num = this.currentStartSwipeCount.get();
        num.getClass();
        return num.intValue();
    }

    /* JADX INFO: renamed from: d3 */
    public final void m154144d3() {
        m154141a3(true);
        this.currentStartMatchCount.m189988a(1);
    }

    /* JADX INFO: renamed from: e3 */
    public final void m154145e3() {
        m154141a3(true);
        this.currentStartSwipeCount.m189988a(1);
    }

    /* JADX INFO: renamed from: f3 */
    public final void m154146f3() {
        m154141a3(true);
        this.todayMatchCount.m189988a(1);
    }

    /* JADX INFO: renamed from: g3 */
    public final void m154147g3() {
        m154141a3(true);
        this.todaySwipeCount.m189988a(1);
    }

    /* JADX INFO: renamed from: h3 */
    public final void m154148h3() {
        this.currentStartSwipeCount.put(0);
        this.currentStartMatchCount.put(0);
        m154141a3(false);
    }
}
