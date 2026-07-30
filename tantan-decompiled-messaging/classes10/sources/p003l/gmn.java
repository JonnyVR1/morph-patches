package p003l;

import com.p000p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p000p1.mobile.putong.core.p001ui.intl.greet.IntlGreetAct;
import com.p000p1.mobile.putong.core.p001ui.intl.greet.head.IntlUserGreetHeadView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Ll/gmn;", "Ll/fmn;", "Lcom/p1/mobile/putong/core/ui/intl/greet/head/IntlUserGreetHeadView;", "Lcom/p1/mobile/putong/core/ui/intl/greet/IntlGreetAct;", "act", "Ll/gln;", "presenter", "view", "<init>", "(Lcom/p1/mobile/putong/core/ui/intl/greet/IntlGreetAct;Ll/gln;Lcom/p1/mobile/putong/core/ui/intl/greet/head/IntlUserGreetHeadView;)V", "c", "Lcom/p1/mobile/putong/core/ui/intl/greet/IntlGreetAct;", "getAct", "()Lcom/p1/mobile/putong/core/ui/intl/greet/IntlGreetAct;", "setAct", "(Lcom/p1/mobile/putong/core/ui/intl/greet/IntlGreetAct;)V", "d", "Ll/gln;", "getPresenter", "()Ll/gln;", "setPresenter", "(Ll/gln;)V", "message_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
public final class gmn extends fmn<IntlUserGreetHeadView> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public IntlGreetAct act;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public gln presenter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmn(@NotNull IntlGreetAct intlGreetAct, @NotNull gln glnVar, @NotNull IntlUserGreetHeadView intlUserGreetHeadView) {
        super(glnVar, intlUserGreetHeadView);
        intlGreetAct.getClass();
        glnVar.getClass();
        intlUserGreetHeadView.getClass();
        this.act = intlGreetAct;
        this.presenter = glnVar;
    }
}
