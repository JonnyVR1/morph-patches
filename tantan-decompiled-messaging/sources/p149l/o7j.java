package p149l;

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
@Metadata(m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B2\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R=\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\b0\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m87232d2 = {"Ll/o7j;", "Ll/d1q;", "Landroid/view/ViewGroup;", "Ll/r7j;", "shareItemData", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "", "clickAction", "<init>", "(Ll/r7j;Lkotlin/jvm/functions/Function1;)V", "", "o", "()I", "itemView", "I", "(Landroid/view/ViewGroup;)V", "a", "Ll/r7j;", "getShareItemData", "()Ll/r7j;", "b", "Lkotlin/jvm/functions/Function1;", "getClickAction", "()Lkotlin/jvm/functions/Function1;", "setClickAction", "(Lkotlin/jvm/functions/Function1;)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class o7j extends d1q<ViewGroup> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final r7j shareItemData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public Function1<? super r7j, Unit> clickAction;

    public o7j(@NotNull r7j r7jVar, @NotNull Function1<? super r7j, Unit> function1) {
        r7jVar.getClass();
        function1.getClass();
        this.shareItemData = r7jVar;
        this.clickAction = function1;
    }

    /* JADX INFO: renamed from: H */
    public static Unit m162997H(o7j o7jVar, View view) {
        view.getClass();
        o7jVar.clickAction.invoke(o7jVar.shareItemData);
        return Unit.INSTANCE;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo70566u(@NotNull ViewGroup itemView) {
        itemView.getClass();
        super.mo70566u(itemView);
        xdl0.m208345M0(itemView.findViewById(g5c0.f101095x4), this.shareItemData.getIsOnline());
        hxs.m133408u("context_single_room", (SimpleDraweeView) itemView.findViewById(g5c0.f101108z), this.shareItemData.getUserMask().avatar, t100.m186890d(50.0f), t100.m186890d(50.0f));
        ((TextView) itemView.findViewById(g5c0.f100802S1)).setText(this.shareItemData.getUserMask().name);
        cxq.m109105c(itemView, new Function1() { // from class: l.n7j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return o7j.m162997H(this.f137532a, (View) obj);
            }
        });
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168004D8;
    }
}
