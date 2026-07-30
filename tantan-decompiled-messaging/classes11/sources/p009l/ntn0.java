package p009l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.otn0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0012\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001d\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\"\u0010 \u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010\u0015\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R$\u0010\"\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\r\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b!\u0010\u0011¨\u0006#"}, d2 = {"Ll/ntn0;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "a", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/view/View;", "d", "()Landroid/view/View;", "set_empty", "(Landroid/view/View;)V", "_empty", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "f", "()Landroid/widget/TextView;", "set_title", "(Landroid/widget/TextView;)V", "_title", "c", "set_content", "_content", "e", "set_iknowBtn", "_iknowBtn", "setView", "view", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ntn0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public View _empty;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public TextView _title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public TextView _content;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public TextView _iknowBtn;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public View view;

    public ntn0(@NotNull Context context) {
        context.getClass();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        layoutInflaterFrom.getClass();
        this.view = m19522a(layoutInflaterFrom, null);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final View m19522a(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = otn0.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final View getView() {
        return this.view;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final TextView m19524c() {
        TextView textView = this._content;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_content");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final View m19525d() {
        View view = this._empty;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_empty");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final TextView m19526e() {
        TextView textView = this._iknowBtn;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_iknowBtn");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final TextView m19527f() {
        TextView textView = this._title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_title");
        return null;
    }
}
