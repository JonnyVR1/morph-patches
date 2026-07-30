package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.p058ui.intl.greet.IntlGreetAct;
import com.p051p1.mobile.putong.core.p058ui.intl.greet.head.IntlUserGreetHeadView;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m88121d2 = {"Ll/gon;", "Ll/fon;", "Lcom/p1/mobile/putong/core/ui/intl/greet/head/IntlUserGreetHeadView;", "Lcom/p1/mobile/putong/core/ui/intl/greet/IntlGreetAct;", SocialConstants.PARAM_ACT, "Ll/gnn;", "presenter", OMSTemplateModeType.view, "<init>", "(Lcom/p1/mobile/putong/core/ui/intl/greet/IntlGreetAct;Ll/gnn;Lcom/p1/mobile/putong/core/ui/intl/greet/head/IntlUserGreetHeadView;)V", "c", "Lcom/p1/mobile/putong/core/ui/intl/greet/IntlGreetAct;", "getAct", "()Lcom/p1/mobile/putong/core/ui/intl/greet/IntlGreetAct;", "setAct", "(Lcom/p1/mobile/putong/core/ui/intl/greet/IntlGreetAct;)V", Constants.INAPP_DATA_TAG, "Ll/gnn;", "getPresenter", "()Ll/gnn;", "setPresenter", "(Ll/gnn;)V", "message_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class gon extends fon<IntlUserGreetHeadView> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public IntlGreetAct act;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public gnn presenter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gon(@NotNull IntlGreetAct intlGreetAct, @NotNull gnn gnnVar, @NotNull IntlUserGreetHeadView intlUserGreetHeadView) {
        super(gnnVar, intlUserGreetHeadView);
        intlGreetAct.getClass();
        gnnVar.getClass();
        intlUserGreetHeadView.getClass();
        this.act = intlGreetAct;
        this.presenter = gnnVar;
    }
}
