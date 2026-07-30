package p149l;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B@\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R=\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR(\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006*"}, m87232d2 = {"Ll/t7j;", "Ll/d1q;", "Landroid/widget/FrameLayout;", "Ll/r7j;", "shareItemData", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "isSelected", "", "clickChangeAction", "Lkotlin/Function0;", "canSelectedMoreAction", "<init>", "(Ll/r7j;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "", "o", "()I", "itemView", "J", "(Landroid/widget/FrameLayout;)V", "a", "Ll/r7j;", "I", "()Ll/r7j;", "b", "Lkotlin/jvm/functions/Function1;", "getClickChangeAction", "()Lkotlin/jvm/functions/Function1;", "setClickChangeAction", "(Lkotlin/jvm/functions/Function1;)V", "c", "Lkotlin/jvm/functions/Function0;", "getCanSelectedMoreAction", "()Lkotlin/jvm/functions/Function0;", "setCanSelectedMoreAction", "(Lkotlin/jvm/functions/Function0;)V", "Landroid/widget/ImageView;", Constants.INAPP_DATA_TAG, "Landroid/widget/ImageView;", "selectedView", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class t7j extends d1q<FrameLayout> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final r7j shareItemData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public Function1<? super Boolean, Unit> clickChangeAction;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public Function0<Boolean> canSelectedMoreAction;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public ImageView selectedView;

    public t7j(@NotNull r7j r7jVar, @NotNull Function1<? super Boolean, Unit> function1, @NotNull Function0<Boolean> function0) {
        r7jVar.getClass();
        function1.getClass();
        function0.getClass();
        this.shareItemData = r7jVar;
        this.clickChangeAction = function1;
        this.canSelectedMoreAction = function0;
    }

    /* JADX INFO: renamed from: H */
    public static void m187464H(t7j t7jVar, View view) {
        ImageView imageView = t7jVar.selectedView;
        ImageView imageView2 = null;
        if (imageView == null) {
            Intrinsics.m87502r("selectedView");
            imageView = null;
        }
        if (imageView.isSelected() || t7jVar.canSelectedMoreAction.invoke().booleanValue()) {
            ImageView imageView3 = t7jVar.selectedView;
            if (imageView3 == null) {
                Intrinsics.m87502r("selectedView");
                imageView3 = null;
            }
            ImageView imageView4 = t7jVar.selectedView;
            if (imageView4 == null) {
                Intrinsics.m87502r("selectedView");
                imageView4 = null;
            }
            imageView3.setSelected(!imageView4.isSelected());
            r7j r7jVar = t7jVar.shareItemData;
            ImageView imageView5 = t7jVar.selectedView;
            if (imageView5 == null) {
                Intrinsics.m87502r("selectedView");
                imageView5 = null;
            }
            r7jVar.m178145d(imageView5.isSelected());
            Function1<? super Boolean, Unit> function1 = t7jVar.clickChangeAction;
            ImageView imageView6 = t7jVar.selectedView;
            if (imageView6 == null) {
                Intrinsics.m87502r("selectedView");
            } else {
                imageView2 = imageView6;
            }
            function1.invoke(Boolean.valueOf(imageView2.isSelected()));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: I, reason: from getter */
    public final r7j getShareItemData() {
        return this.shareItemData;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo70566u(@NotNull FrameLayout itemView) {
        itemView.getClass();
        super.mo70566u(itemView);
        xdl0.m208345M0(itemView.findViewById(g5c0.f101095x4), this.shareItemData.getIsOnline());
        hxs.m133408u("context_single_room", (SimpleDraweeView) itemView.findViewById(g5c0.f101108z), this.shareItemData.getUserMask().avatar, t100.m186890d(55.0f), t100.m186890d(55.0f));
        View viewFindViewById = itemView.findViewById(g5c0.f100689F5);
        viewFindViewById.getClass();
        ImageView imageView = (ImageView) viewFindViewById;
        this.selectedView = imageView;
        ImageView imageView2 = null;
        if (imageView == null) {
            Intrinsics.m87502r("selectedView");
            imageView = null;
        }
        imageView.setSelected(this.shareItemData.getIsSelected());
        ((TextView) itemView.findViewById(g5c0.f100802S1)).setText(this.shareItemData.getUserMask().name);
        ImageView imageView3 = this.selectedView;
        if (imageView3 == null) {
            Intrinsics.m87502r("selectedView");
        } else {
            imageView2 = imageView3;
        }
        xdl0.m208329E0(imageView2, new View.OnClickListener() { // from class: l.s7j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                t7j.m187464H(this.f162916a, view);
            }
        });
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168028F8;
    }
}
