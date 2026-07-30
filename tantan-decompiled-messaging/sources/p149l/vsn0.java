package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J=\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\"\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010-\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u0010%\u001a\u0004\b+\u0010'\"\u0004\b,\u0010)R\"\u00101\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010\u001d\u001a\u0004\b/\u0010\u001f\"\u0004\b0\u0010!R\"\u00105\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u0010%\u001a\u0004\b3\u0010'\"\u0004\b4\u0010)R\"\u00107\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u0010%\u001a\u0004\b2\u0010'\"\u0004\b6\u0010)R$\u00109\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010\u001d\u001a\u0004\b.\u0010\u001f\"\u0004\b8\u0010!¨\u0006:"}, m87232d2 = {"Ll/vsn0;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "c", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "colorRes", "", "k", "(I)V", "", "title", "content", "leftText", "rightText", "Ll/d30;", "leftAction", "rightAction", "j", "(Ljava/lang/String;Ljava/lang/String;IILl/d30;Ll/d30;)V", "a", "Landroid/view/View;", "h", "()Landroid/view/View;", "set_empty", "(Landroid/view/View;)V", "_empty", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", RXScreenCaptureService.KEY_INDEX, "()Landroid/widget/TextView;", "set_title", "(Landroid/widget/TextView;)V", "_title", "g", "set_content", "_content", Constants.INAPP_DATA_TAG, "get_line", "set_line", "_line", "e", "f", "set_cancel", "_cancel", "set_accept", "_accept", "setView", OMSTemplateModeType.view, "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class vsn0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public View _empty;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public TextView _title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public TextView _content;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public View _line;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public TextView _cancel;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public TextView _accept;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public View view;

    public vsn0(@NotNull Context context) {
        context.getClass();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        layoutInflaterFrom.getClass();
        this.view = m199882c(layoutInflaterFrom, null);
    }

    /* JADX INFO: renamed from: a */
    public static Unit m199880a(d30 d30Var, View view) {
        view.getClass();
        d30Var.call();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static Unit m199881b(d30 d30Var, View view) {
        view.getClass();
        d30Var.call();
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final View m199882c(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM205522b = wsn0.m205522b(this, inflater, parent);
        viewM205522b.getClass();
        return viewM205522b;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final View getView() {
        return this.view;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final TextView m199884e() {
        TextView textView = this._accept;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_accept");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final TextView m199885f() {
        TextView textView = this._cancel;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_cancel");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final TextView m199886g() {
        TextView textView = this._content;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_content");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final View m199887h() {
        View view = this._empty;
        if (view != null) {
            return view;
        }
        Intrinsics.m87502r("_empty");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final TextView m199888i() {
        TextView textView = this._title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_title");
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final void m199889j(@NotNull String title, @NotNull String content, int leftText, int rightText, @NotNull final d30 leftAction, @NotNull final d30 rightAction) {
        title.getClass();
        content.getClass();
        leftAction.getClass();
        rightAction.getClass();
        m199888i().setText(title);
        m199886g().setText(content);
        m199885f().setText(leftText);
        m199884e().setText(rightText);
        cxq.m109105c(m199885f(), new Function1() { // from class: l.tsn0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return vsn0.m199881b(leftAction, (View) obj);
            }
        });
        cxq.m109105c(m199884e(), new Function1() { // from class: l.usn0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return vsn0.m199880a(rightAction, (View) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final void m199890k(int colorRes) {
        m199887h().setBackgroundResource(colorRes);
    }
}
