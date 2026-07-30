package p009l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tantanapp.common.data.DbObject;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import l.atn0;
import l.e30;
import l.j760;
import l.t100;
import l.vwb;
import l.w9j;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJI\u0010\u0017\u001a\u00020\u00162\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0012\b\u0002\u0010\u0011\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0014H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J;\u0010\u0019\u001a\u00020\u00162\u0012\b\u0002\u0010\u0011\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010!\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010,\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b*\u0010\u001e\"\u0004\b+\u0010 R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u00106\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010\u001c\u001a\u0004\b.\u0010\u001e\"\u0004\b5\u0010 ¨\u00067"}, d2 = {"Ll/zsn0;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "c", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "Ll/gzo0;", "items", "Ll/wjm0;", "presenter", "", "userId", "Ll/e30;", "action1", "", "h", "(Ljava/util/List;Ll/wjm0;Ljava/lang/String;Ll/e30;)V", "j", "(Ll/wjm0;Ljava/lang/String;Ljava/util/List;)V", "a", "Landroid/view/View;", "f", "()Landroid/view/View;", "set_empty", "(Landroid/view/View;)V", "_empty", "Lv/VLinear;", "b", "Lv/VLinear;", "g", "()Lv/VLinear;", "set_funcList", "(Lv/VLinear;)V", "_funcList", "get_line", "set_line", "_line", "Landroid/widget/TextView;", "d", "Landroid/widget/TextView;", "e", "()Landroid/widget/TextView;", "set_cancel", "(Landroid/widget/TextView;)V", "_cancel", "setView", "view", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class zsn0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public View _empty;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VLinear _funcList;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public View _line;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public TextView _cancel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public View view;

    public zsn0(@NotNull Context context) {
        context.getClass();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        layoutInflaterFrom.getClass();
        this.view = m25949c(layoutInflaterFrom, null);
    }

    /* JADX INFO: renamed from: b */
    public static Boolean m25947b(gzo0 gzo0Var) {
        return Boolean.valueOf(Intrinsics.d(gzo0Var.getKey(), "sayHello"));
    }

    /* JADX INFO: renamed from: i */
    public static final void m25948i(e30 e30Var, Ref.ObjectRef objectRef, View view) {
        e30Var.call(objectRef.element);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final View m25949c(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = atn0.b(this, inflater, parent);
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
    public final TextView m25951e() {
        TextView textView = this._cancel;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_cancel");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final View m25952f() {
        View view = this._empty;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_empty");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final VLinear m25953g() {
        VLinear vLinear = this._funcList;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_funcList");
        return null;
    }

    @SuppressLint({"ResourceAsColor"})
    /* JADX INFO: renamed from: h */
    public final void m25954h(@NotNull List<gzo0> items, @Nullable wjm0<?, ?> presenter, @Nullable String userId, @NotNull final e30<String> action1) {
        items.getClass();
        action1.getClass();
        m25953g().removeAllViews();
        for (gzo0 gzo0Var : items) {
            View view = this.view;
            view.getClass();
            TextView textView = new TextView(view.getContext());
            textView.setLayoutParams(new ViewGroup.LayoutParams(-1, t100.E));
            textView.setEnabled(gzo0Var.getEnable());
            textView.setGravity(1);
            textView.setText(gzo0Var.getText());
            textView.setTextSize(16.0f);
            textView.setTextColor(Color.parseColor(gzo0Var.getEnable() ? "#ccffffff" : "#33ffffff"));
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = gzo0Var.getKey();
            textView.setOnClickListener(new View.OnClickListener() { // from class: l.xsn0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    zsn0.m25948i(action1, objectRef, view2);
                }
            });
            m25953g().addView(textView);
        }
        if (presenter != null) {
            m25955j(presenter, userId, items);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m25955j(wjm0<?, ?> presenter, String userId, List<gzo0> items) {
        if (presenter == null || ((gzo0) vwb.r(items, new w9j() { // from class: l.ysn0
            public final Object call(Object obj) {
                return zsn0.m25947b((gzo0) obj);
            }
        })) == null) {
            return;
        }
        zvf0.A("e_audio_greeting", "p_audio_profile", new j760[]{j760.a("anchorId", ((DbObject) presenter.E2().l0()).id), j760.a("liveId", presenter.E2().k()), j760.a("receiver_user_id", userId)});
    }
}
