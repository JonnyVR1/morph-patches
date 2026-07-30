package p009l;

import com.p000p1.mobile.putong.core.newui.youthvip.YouthVipTabFrag;
import com.p1.mobile.putong.core.CoreModule;
import kotlin.Metadata;
import l.jq2;
import l.mkd0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ll/sfq0;", "Ll/jq2;", "Ll/ufq0;", "Lcom/p1/mobile/putong/core/newui/youthvip/YouthVipTabFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/youthvip/YouthVipTabFrag;)V", "", "a0", "()V", "destroy", "a", "Lcom/p1/mobile/putong/core/newui/youthvip/YouthVipTabFrag;", "getFrag", "()Lcom/p1/mobile/putong/core/newui/youthvip/YouthVipTabFrag;", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class sfq0 extends jq2<ufq0> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final YouthVipTabFrag frag;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sfq0(@NotNull YouthVipTabFrag youthVipTabFrag) {
        super(youthVipTabFrag);
        youthVipTabFrag.getClass();
        this.frag = youthVipTabFrag;
    }

    /* JADX INFO: renamed from: a0 */
    public void m22162a0() {
        duringCreated(CoreModule.c.g2.f3()).subscribe(mkd0.F());
    }

    public void destroy() {
    }
}
