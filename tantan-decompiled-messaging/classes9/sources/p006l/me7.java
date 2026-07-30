package p006l;

import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0158c;
import kotlin.Metadata;
import l.mqi0;
import l.tpd0;
import l.zpd0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\bJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\bJ\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017R\u0014\u0010\u001e\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017R\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Ll/me7;", "Ll/ax6;", "Lcom/p1/mobile/putong/core/api/c;", "api", "<init>", "(Lcom/p1/mobile/putong/core/api/c;)V", "", "f3", "()V", "g3", "d3", "e3", "", "c3", "()I", "b3", "h3", "", "updateStartMills", "a3", "(Z)V", "Ll/tpd0;", "R", "Ll/tpd0;", "todayMatchCount", "S", "todaySwipeCount", "T", "currentStartSwipeCount", "U", "currentStartMatchCount", "Ll/zpd0;", "V", "Ll/zpd0;", "todaySwipeCountStartMills", "b_core_base"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    public me7(@NotNull C0158c c0158c) {
        super(c0158c);
        c0158c.getClass();
        this.todayMatchCount = new tpd0("core_today_match_count_" + CoreModule.m1850H().userId(), 0);
        this.todaySwipeCount = new tpd0("core_today_swipe_count_" + CoreModule.m1850H().userId(), 0);
        this.currentStartSwipeCount = new tpd0("core_start_swipe_count_" + CoreModule.m1850H().userId(), 0);
        this.currentStartMatchCount = new tpd0("core_start_swipe_match_count_" + CoreModule.m1850H().userId(), 0);
        this.todaySwipeCountStartMills = new zpd0("toady_swipe_card_start_mills_" + CoreModule.m1850H().userId(), 0L);
    }

    /* JADX INFO: renamed from: a3 */
    public final void m19223a3(boolean updateStartMills) {
        Object obj = this.todaySwipeCountStartMills.get();
        obj.getClass();
        if (mqi0.D(((Number) obj).longValue())) {
            return;
        }
        if (updateStartMills) {
            this.todaySwipeCountStartMills.put(Long.valueOf(mqi0.o()));
        }
        this.todayMatchCount.put(0);
        this.todaySwipeCount.put(0);
    }

    /* JADX INFO: renamed from: b3 */
    public final int m19224b3() {
        Object obj = this.currentStartMatchCount.get();
        obj.getClass();
        return ((Number) obj).intValue();
    }

    /* JADX INFO: renamed from: c3 */
    public final int m19225c3() {
        Object obj = this.currentStartSwipeCount.get();
        obj.getClass();
        return ((Number) obj).intValue();
    }

    /* JADX INFO: renamed from: d3 */
    public final void m19226d3() {
        m19223a3(true);
        this.currentStartMatchCount.a(1);
    }

    /* JADX INFO: renamed from: e3 */
    public final void m19227e3() {
        m19223a3(true);
        this.currentStartSwipeCount.a(1);
    }

    /* JADX INFO: renamed from: f3 */
    public final void m19228f3() {
        m19223a3(true);
        this.todayMatchCount.a(1);
    }

    /* JADX INFO: renamed from: g3 */
    public final void m19229g3() {
        m19223a3(true);
        this.todaySwipeCount.a(1);
    }

    /* JADX INFO: renamed from: h3 */
    public final void m19230h3() {
        this.currentStartSwipeCount.put(0);
        this.currentStartMatchCount.put(0);
        m19223a3(false);
    }
}
