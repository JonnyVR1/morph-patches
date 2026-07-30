package com.p000p1.mobile.putong.core.p004ui.visitor.myvisitors;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.visitor.C0485e;
import com.p000p1.mobile.putong.core.p004ui.visitor.myvisitors.MyVisitorsItemView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.Visitor;
import com.p1.mobile.putong.ui.headframe.HeaderFrameWrapper;
import com.tantanapp.common.data.DbObject;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l.b3c0;
import l.cwf0;
import l.d30;
import l.dd80;
import l.e30;
import l.eqh0;
import l.i0e;
import l.j760;
import l.k6c0;
import l.lsi0;
import l.mkd0;
import l.mqi0;
import l.o220;
import l.o7r;
import l.roj0;
import l.vwb;
import l.xdl0;
import l.z0c0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006l.i120;
import p006l.qib0;
import p006l.qlb;
import p006l.r120;
import p006l.xma;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ%\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J?\u0010\u001d\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"R\"\u0010)\u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00109\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010=\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u00104\u001a\u0004\b;\u00106\"\u0004\b<\u00108R\"\u0010E\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010D¨\u0006F"}, d2 = {"Lcom/p1/mobile/putong/core/ui/visitor/myvisitors/MyVisitorsItemView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "Ll/r120;", "adapter", "Lcom/p1/mobile/android/app/Act;", "act", "Ll/i120;", "item", "l", "(Ll/r120;Lcom/p1/mobile/android/app/Act;Ll/i120;)V", "Landroid/view/View;", "view", "k", "(Landroid/view/View;)V", "Lcom/p1/mobile/putong/data/User;", "user", "", "hidden", "Ll/e30;", "success", "v", "(Ll/r120;Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/data/User;ZLl/e30;)V", "Lcom/p1/mobile/putong/data/Visitor;", "visitor", "u", "(Lcom/p1/mobile/putong/data/Visitor;)V", "a", "Lcom/p1/mobile/putong/core/ui/visitor/myvisitors/MyVisitorsItemView;", "get_root", "()Lcom/p1/mobile/putong/core/ui/visitor/myvisitors/MyVisitorsItemView;", "set_root", "(Lcom/p1/mobile/putong/core/ui/visitor/myvisitors/MyVisitorsItemView;)V", "_root", "Lcom/p1/mobile/putong/ui/headframe/HeaderFrameWrapper;", "b", "Lcom/p1/mobile/putong/ui/headframe/HeaderFrameWrapper;", "get_profile", "()Lcom/p1/mobile/putong/ui/headframe/HeaderFrameWrapper;", "set_profile", "(Lcom/p1/mobile/putong/ui/headframe/HeaderFrameWrapper;)V", "_profile", "Lv/VText;", "c", "Lv/VText;", "get_name", "()Lv/VText;", "set_name", "(Lv/VText;)V", "_name", "d", "get_desc", "set_desc", "_desc", "Landroid/widget/TextView;", "e", "Landroid/widget/TextView;", "get_action", "()Landroid/widget/TextView;", "set_action", "(Landroid/widget/TextView;)V", "_action", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MyVisitorsItemView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public MyVisitorsItemView _root;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public HeaderFrameWrapper _profile;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VText _name;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VText _desc;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public TextView _action;

    /* JADX WARN: Illegal instructions before constructor call */
    @JvmOverloads
    public MyVisitorsItemView(@NotNull Context context) {
        context.getClass();
        AttributeSet attributeSet = null;
        this(context, attributeSet, 2, attributeSet);
    }

    /* JADX INFO: renamed from: b */
    public static void m11566b(Throwable th) {
    }

    /* JADX INFO: renamed from: h */
    public static void m11572h(e30 e30Var, boolean z, roj0 roj0Var) {
        if (e30Var != null) {
            e30Var.call(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: m */
    public static final void m11575m(Act act, Visitor visitor, View view) {
        act.startActivity(CoreModule.m1854P().m11706a().m5465jr(act, visitor.userId, "moment_visitor", false));
    }

    /* JADX INFO: renamed from: n */
    public static final void m11576n(final Visitor visitor, final User user, final Act act, final MyVisitorsItemView myVisitorsItemView, final r120 r120Var, View view) {
        if (!visitor.hidden) {
            zvf0.u("e_hide_records", "p_my_visitor_isee", new j760[]{vwb.Y("other_user_id", ((DbObject) user).id)});
            if (!xma.m27351F3()) {
                CoreModule.m1854P().m11706a().m5555wh(act, "p_navigation_visit,isee", null, null, null, Privilege.visitor_hide_footprint);
                return;
            } else if (xma.m27346A4() <= 0) {
                lsi0.y("本月特权次数已用完");
                return;
            } else {
                myVisitorsItemView.m11586v(r120Var, act, user, true, new e30() { // from class: l.k220
                    public final void call(Object obj) {
                        MyVisitorsItemView.m11582t(user, visitor, myVisitorsItemView, (Boolean) obj);
                    }
                });
                return;
            }
        }
        zvf0.u("e_recover_records", "p_my_visitor_isee", new j760[]{vwb.Y("other_user_id", ((DbObject) user).id)});
        if (!CoreModule.f1534c.f3657n2.m22279n4()) {
            myVisitorsItemView.m11586v(r120Var, act, user, false, new e30() { // from class: l.j220
                public final void call(Object obj) {
                    MyVisitorsItemView.m11581s(visitor, myVisitorsItemView, (Boolean) obj);
                }
            });
            return;
        }
        final cwf0 cwf0Var = new cwf0("p_recover_records_confirm", Dialog.class.getName());
        View viewInflate = o7r.a(act).inflate(k6c0.W1, (ViewGroup) null);
        viewInflate.getClass();
        MyVisitorRecoverHideFootPrintView myVisitorRecoverHideFootPrintView = (MyVisitorRecoverHideFootPrintView) viewInflate;
        final dd80 dd80VarO = new dd80.a(act).R(myVisitorRecoverHideFootPrintView).P(false).n0(new DialogInterface.OnDismissListener() { // from class: l.g220
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                MyVisitorsItemView.m11577o(cwf0Var, dialogInterface);
            }
        }).O();
        myVisitorRecoverHideFootPrintView.m11556e(user, new d30() { // from class: l.h220
            public final void call() {
                MyVisitorsItemView.m11578p(dd80VarO, myVisitorsItemView, r120Var, act, user, visitor);
            }
        }, new d30() { // from class: l.i220
            public final void call() {
                MyVisitorsItemView.m11580r(dd80VarO);
            }
        });
        dd80VarO.show();
        i0e.f(cwf0Var);
    }

    /* JADX INFO: renamed from: o */
    public static final void m11577o(cwf0 cwf0Var, DialogInterface dialogInterface) {
        i0e.e(cwf0Var);
    }

    /* JADX INFO: renamed from: p */
    public static final void m11578p(dd80 dd80Var, final MyVisitorsItemView myVisitorsItemView, r120 r120Var, Act act, User user, final Visitor visitor) {
        dd80Var.dismiss();
        CoreModule.f1534c.f3657n2.m22277l4();
        myVisitorsItemView.m11586v(r120Var, act, user, false, new e30() { // from class: l.l220
            public final void call(Object obj) {
                MyVisitorsItemView.m11579q(visitor, myVisitorsItemView, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public static final void m11579q(Visitor visitor, MyVisitorsItemView myVisitorsItemView, Boolean bool) {
        bool.getClass();
        visitor.hidden = bool.booleanValue();
        myVisitorsItemView.m11585u(visitor);
    }

    /* JADX INFO: renamed from: r */
    public static final void m11580r(dd80 dd80Var) {
        dd80Var.dismiss();
    }

    /* JADX INFO: renamed from: s */
    public static final void m11581s(Visitor visitor, MyVisitorsItemView myVisitorsItemView, Boolean bool) {
        bool.getClass();
        visitor.hidden = bool.booleanValue();
        myVisitorsItemView.m11585u(visitor);
    }

    /* JADX INFO: renamed from: t */
    public static final void m11582t(User user, Visitor visitor, MyVisitorsItemView myVisitorsItemView, Boolean bool) {
        lsi0.y("已对" + (user.isFemale() ? "她" : "他") + "隐藏访问足迹");
        bool.getClass();
        visitor.hidden = bool.booleanValue();
        myVisitorsItemView.m11585u(visitor);
    }

    @NotNull
    public final TextView get_action() {
        TextView textView = this._action;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_action");
        return null;
    }

    @NotNull
    public final VText get_desc() {
        VText vText = this._desc;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_desc");
        return null;
    }

    @NotNull
    public final VText get_name() {
        VText vText = this._name;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_name");
        return null;
    }

    @NotNull
    public final HeaderFrameWrapper get_profile() {
        HeaderFrameWrapper headerFrameWrapper = this._profile;
        if (headerFrameWrapper != null) {
            return headerFrameWrapper;
        }
        Intrinsics.r("_profile");
        return null;
    }

    @NotNull
    public final MyVisitorsItemView get_root() {
        MyVisitorsItemView myVisitorsItemView = this._root;
        if (myVisitorsItemView != null) {
            return myVisitorsItemView;
        }
        Intrinsics.r("_root");
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final void m11583k(View view) {
        o220.a(this, view);
    }

    /* JADX INFO: renamed from: l */
    public final void m11584l(@NotNull final r120 adapter, @NotNull final Act act, @NotNull i120 item) {
        adapter.getClass();
        act.getClass();
        item.getClass();
        qlb qlbVar = CoreModule.f1534c.f3657n2;
        Visitor myVisitors = item.getMyVisitors();
        final User userM22248I3 = qlbVar.m22248I3(myVisitors != null ? myVisitors.userId : null);
        if (userM22248I3 == null) {
            get_name().setText("【异常用户】");
            qib0.f19782G.o(get_profile().get_pic());
            get_profile().G0(false);
            get_desc().setText("");
            return;
        }
        get_profile().t0(userM22248I3);
        get_name().setText(userM22248I3.name);
        get_name().setTypeface(eqh0.c(3));
        final Visitor myVisitors2 = item.getMyVisitors();
        if (myVisitors2 != null) {
            m11585u(myVisitors2);
            xdl0.L(get_root(), new View.OnClickListener() { // from class: l.e220
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MyVisitorsItemView.m11575m(act, myVisitors2, view);
                }
            });
            xdl0.L(get_action(), new View.OnClickListener() { // from class: l.f220
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MyVisitorsItemView.m11576n(myVisitors2, userM22248I3, act, this, adapter, view);
                }
            });
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m11583k(this);
    }

    public final void set_action(@NotNull TextView textView) {
        textView.getClass();
        this._action = textView;
    }

    public final void set_desc(@NotNull VText vText) {
        vText.getClass();
        this._desc = vText;
    }

    public final void set_name(@NotNull VText vText) {
        vText.getClass();
        this._name = vText;
    }

    public final void set_profile(@NotNull HeaderFrameWrapper headerFrameWrapper) {
        headerFrameWrapper.getClass();
        this._profile = headerFrameWrapper;
    }

    public final void set_root(@NotNull MyVisitorsItemView myVisitorsItemView) {
        myVisitorsItemView.getClass();
        this._root = myVisitorsItemView;
    }

    /* JADX INFO: renamed from: u */
    public final void m11585u(Visitor visitor) {
        if (visitor.hidden) {
            get_desc().setText("已隐藏足迹");
            get_action().setTextColor(Color.parseColor("#FE7E1D"));
            get_action().setBackgroundResource(b3c0.G5);
            get_action().setText("恢复足迹");
            return;
        }
        String str = "访问" + visitor.visitCount + "次";
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str + "·" + C0485e.INSTANCE.m11494i(mqi0.o(), visitor.lastVisitTime));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(getResources().getColor(z0c0.d)), 0, str.length(), 33);
        get_desc().setText(spannableStringBuilder);
        get_action().setTextColor(Color.parseColor("#FFDEA2"));
        get_action().setBackgroundResource(b3c0.F5);
        get_action().setText("隐藏足迹");
    }

    /* JADX INFO: renamed from: v */
    public final void m11586v(r120 adapter, Act act, User user, final boolean hidden, final e30<Boolean> success) {
        adapter.c(act, CoreModule.f1534c.f3657n2.m22278m4(((DbObject) user).id, hidden)).subscribe(mkd0.H(new e30() { // from class: l.m220
            public final void call(Object obj) {
                MyVisitorsItemView.m11572h(success, hidden, (roj0) obj);
            }
        }, new e30() { // from class: l.n220
            public final void call(Object obj) {
                MyVisitorsItemView.m11566b((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MyVisitorsItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public /* synthetic */ MyVisitorsItemView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
