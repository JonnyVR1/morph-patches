package p149l;

import com.p046p1.mobile.android.app.Act;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m87232d2 = {"Ll/pen;", "Ll/jq2;", "Ll/ren;", "Ll/mcr;", "lifecycleProvider", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Ll/mcr;Lcom/p1/mobile/android/app/Act;)V", "", "destroy", "()V", "Lcom/p1/mobile/android/app/Act;", "e0", "()Lcom/p1/mobile/android/app/Act;", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class pen extends jq2<ren> {

    @NotNull
    private final Act act;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pen(@Nullable mcr mcrVar, @NotNull Act act) {
        super(mcrVar);
        act.getClass();
        this.act = act;
    }

    @NotNull
    /* JADX INFO: renamed from: e0, reason: from getter */
    public final Act getAct() {
        return this.act;
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
