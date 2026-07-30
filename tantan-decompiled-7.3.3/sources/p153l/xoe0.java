package p153l;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u000b\u001a\u00020\n2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m88121d2 = {"Ll/xoe0;", "", "<init>", "()V", "Ll/bjs;", "presenter", "Ll/uoe0;", "requestInfo", "Ll/y20;", "continueAction", "", "a", "(Ll/bjs;Ll/uoe0;Ll/y20;)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class xoe0 {

    @NotNull
    public static final xoe0 INSTANCE = new xoe0();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m212465a(@NotNull bjs<?> presenter, @NotNull uoe0 requestInfo, @NotNull y20<uoe0> continueAction) {
        presenter.getClass();
        requestInfo.getClass();
        continueAction.getClass();
        if (!joc0.m146433e(presenter)) {
            continueAction.call(requestInfo);
        } else {
            eoc0.INSTANCE.m121738a("receive_gift_interrupt");
            joc0.m146432d(presenter, requestInfo, continueAction);
        }
    }
}
