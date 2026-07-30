package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.AuthenticationTokenClaims;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B2\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R=\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\b0\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m88121d2 = {"Ll/iaj;", "Ll/d3q;", "Landroid/view/ViewGroup;", "Ll/laj;", "shareItemData", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "", "clickAction", "<init>", "(Ll/laj;Lkotlin/jvm/functions/Function1;)V", "", "o", "()I", "itemView", "I", "(Landroid/view/ViewGroup;)V", "a", "Ll/laj;", "getShareItemData", "()Ll/laj;", "b", "Lkotlin/jvm/functions/Function1;", "getClickAction", "()Lkotlin/jvm/functions/Function1;", "setClickAction", "(Lkotlin/jvm/functions/Function1;)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class iaj extends d3q<ViewGroup> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final laj shareItemData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public Function1<? super laj, Unit> clickAction;

    public iaj(@NotNull laj lajVar, @NotNull Function1<? super laj, Unit> function1) {
        lajVar.getClass();
        function1.getClass();
        this.shareItemData = lajVar;
        this.clickAction = function1;
    }

    /* JADX INFO: renamed from: H */
    public static Unit m139194H(iaj iajVar, View view) {
        view.getClass();
        iajVar.clickAction.invoke(iajVar.shareItemData);
        return Unit.INSTANCE;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo71749u(@NotNull ViewGroup itemView) {
        itemView.getClass();
        super.mo71749u(itemView);
        bnl0.m105525M0(itemView.findViewById(mdc0.f136340x4), this.shareItemData.getIsOnline());
        izs.m142870u("context_single_room", (SimpleDraweeView) itemView.findViewById(mdc0.f136353z), this.shareItemData.getUserMask().avatar, qa00.m175859d(50.0f), qa00.m175859d(50.0f));
        ((TextView) itemView.findViewById(mdc0.f136047S1)).setText(this.shareItemData.getUserMask().name);
        czq.m113347c(itemView, new Function1() { // from class: l.haj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return iaj.m139194H(this.f108504a, (View) obj);
            }
        });
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f198736D8;
    }
}
