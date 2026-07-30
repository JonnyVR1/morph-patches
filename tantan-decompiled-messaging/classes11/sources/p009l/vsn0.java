package p009l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l.cxq;
import l.d30;
import l.wsn0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J=\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\"\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010-\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u0010%\u001a\u0004\b+\u0010'\"\u0004\b,\u0010)R\"\u00101\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010\u001d\u001a\u0004\b/\u0010\u001f\"\u0004\b0\u0010!R\"\u00105\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u0010%\u001a\u0004\b3\u0010'\"\u0004\b4\u0010)R\"\u00107\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u0010%\u001a\u0004\b2\u0010'\"\u0004\b6\u0010)R$\u00109\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010\u001d\u001a\u0004\b.\u0010\u001f\"\u0004\b8\u0010!¨\u0006:"}, d2 = {"Ll/vsn0;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "c", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "colorRes", "", "k", "(I)V", "", "title", "content", "leftText", "rightText", "Ll/d30;", "leftAction", "rightAction", "j", "(Ljava/lang/String;Ljava/lang/String;IILl/d30;Ll/d30;)V", "a", "Landroid/view/View;", "h", "()Landroid/view/View;", "set_empty", "(Landroid/view/View;)V", "_empty", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "i", "()Landroid/widget/TextView;", "set_title", "(Landroid/widget/TextView;)V", "_title", "g", "set_content", "_content", "d", "get_line", "set_line", "_line", "e", "f", "set_cancel", "_cancel", "set_accept", "_accept", "setView", "view", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
        this.view = m23711c(layoutInflaterFrom, null);
    }

    /* JADX INFO: renamed from: a */
    public static Unit m23709a(d30 d30Var, View view) {
        view.getClass();
        d30Var.call();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static Unit m23710b(d30 d30Var, View view) {
        view.getClass();
        d30Var.call();
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final View m23711c(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = wsn0.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final View getView() {
        return this.view;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final TextView m23713e() {
        TextView textView = this._accept;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_accept");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final TextView m23714f() {
        TextView textView = this._cancel;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_cancel");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final TextView m23715g() {
        TextView textView = this._content;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_content");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final View m23716h() {
        View view = this._empty;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_empty");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final TextView m23717i() {
        TextView textView = this._title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_title");
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final void m23718j(@NotNull String title, @NotNull String content, int leftText, int rightText, @NotNull final d30 leftAction, @NotNull final d30 rightAction) {
        title.getClass();
        content.getClass();
        leftAction.getClass();
        rightAction.getClass();
        m23717i().setText(title);
        m23715g().setText(content);
        m23714f().setText(leftText);
        m23713e().setText(rightText);
        cxq.c(m23714f(), new Function1() { // from class: l.tsn0
            public final Object invoke(Object obj) {
                return vsn0.m23710b(leftAction, (View) obj);
            }
        });
        cxq.c(m23713e(), new Function1() { // from class: l.usn0
            public final Object invoke(Object obj) {
                return vsn0.m23709a(rightAction, (View) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final void m23719k(int colorRes) {
        m23716h().setBackgroundResource(colorRes);
    }
}
