package p149l;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u000b\u001a\u00020\n2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m87232d2 = {"Ll/sge0;", "", "<init>", "()V", "Ll/ahs;", "presenter", "Ll/pge0;", "requestInfo", "Ll/e30;", "continueAction", "", "a", "(Ll/ahs;Ll/pge0;Ll/e30;)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class sge0 {

    @NotNull
    public static final sge0 INSTANCE = new sge0();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m184069a(@NotNull ahs<?> presenter, @NotNull pge0 requestInfo, @NotNull e30<pge0> continueAction) {
        presenter.getClass();
        requestInfo.getClass();
        continueAction.getClass();
        if (!cgc0.m106702e(presenter)) {
            continueAction.call(requestInfo);
        } else {
            xfc0.INSTANCE.m208600a("receive_gift_interrupt");
            cgc0.m106701d(presenter, requestInfo, continueAction);
        }
    }
}
