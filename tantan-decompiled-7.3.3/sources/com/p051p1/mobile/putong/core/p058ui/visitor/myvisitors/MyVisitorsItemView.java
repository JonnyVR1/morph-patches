package com.p051p1.mobile.putong.core.p058ui.visitor.myvisitors;

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
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Item;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.p058ui.visitor.C9212e;
import com.p051p1.mobile.putong.core.p058ui.visitor.myvisitors.MyVisitorsItemView;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Visitor;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.p070ui.headframe.HeaderFrameWrapper;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VText;
import p153l.bnl0;
import p153l.enb;
import p153l.f9c0;
import p153l.gbc0;
import p153l.i4g0;
import p153l.jl80;
import p153l.joa;
import p153l.jyb;
import p153l.l4g0;
import p153l.lyh0;
import p153l.o1j0;
import p153l.p9r;
import p153l.pec0;
import p153l.psd0;
import p153l.pzi0;
import p153l.q920;
import p153l.uqb0;
import p153l.uxj0;
import p153l.w1e;
import p153l.wa20;
import p153l.x20;
import p153l.y20;
import p153l.z920;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ%\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J?\u0010\u001d\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"R\"\u0010)\u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00109\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010=\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u00104\u001a\u0004\b;\u00106\"\u0004\b<\u00108R\"\u0010E\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010D¨\u0006F"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/visitor/myvisitors/MyVisitorsItemView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "Ll/z920;", "adapter", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Ll/q920;", Item.TYPE, BLiveStormDanmakuGiftResourceType.f45292l, "(Ll/z920;Lcom/p1/mobile/android/app/Act;Ll/q920;)V", "Landroid/view/View;", OMSTemplateModeType.view, "k", "(Landroid/view/View;)V", "Lcom/p1/mobile/putong/data/User;", "user", "", "hidden", "Ll/y20;", "success", ResourceDirection.f39656v, "(Ll/z920;Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/data/User;ZLl/y20;)V", "Lcom/p1/mobile/putong/data/Visitor;", Visitor.TYPE, "u", "(Lcom/p1/mobile/putong/data/Visitor;)V", "a", "Lcom/p1/mobile/putong/core/ui/visitor/myvisitors/MyVisitorsItemView;", "get_root", "()Lcom/p1/mobile/putong/core/ui/visitor/myvisitors/MyVisitorsItemView;", "set_root", "(Lcom/p1/mobile/putong/core/ui/visitor/myvisitors/MyVisitorsItemView;)V", "_root", "Lcom/p1/mobile/putong/ui/headframe/HeaderFrameWrapper;", "b", "Lcom/p1/mobile/putong/ui/headframe/HeaderFrameWrapper;", "get_profile", "()Lcom/p1/mobile/putong/ui/headframe/HeaderFrameWrapper;", "set_profile", "(Lcom/p1/mobile/putong/ui/headframe/HeaderFrameWrapper;)V", "_profile", "Lv/VText;", "c", "Lv/VText;", "get_name", "()Lv/VText;", "set_name", "(Lv/VText;)V", "_name", Constants.INAPP_DATA_TAG, "get_desc", "set_desc", "_desc", "Landroid/widget/TextView;", "e", "Landroid/widget/TextView;", "get_action", "()Landroid/widget/TextView;", "set_action", "(Landroid/widget/TextView;)V", "_action", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public MyVisitorsItemView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    /* JADX INFO: renamed from: b */
    public static void m59225b(Throwable th) {
    }

    /* JADX INFO: renamed from: h */
    public static void m59231h(y20 y20Var, boolean z, uxj0 uxj0Var) {
        if (y20Var != null) {
            y20Var.call(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: m */
    public static final void m59234m(Act act, Visitor visitor, View view) {
        act.startActivity(CoreModule.m30933P().m143405a().mo34531jr(act, visitor.userId, "moment_visitor", false));
    }

    /* JADX INFO: renamed from: n */
    public static final void m59235n(final Visitor visitor, final User user, final Act act, final MyVisitorsItemView myVisitorsItemView, final z920 z920Var, View view) {
        if (!visitor.hidden) {
            i4g0.m138523u("e_hide_records", "p_my_visitor_isee", jyb.m147494Y("other_user_id", user.f56859id));
            if (!joa.m146357G3()) {
                CoreModule.m30933P().m143405a().mo34621wh(act, "p_navigation_visit,isee", null, null, null, Privilege.visitor_hide_footprint);
                return;
            } else if (joa.m146352B4() <= 0) {
                o1j0.m165651y("本月特权次数已用完");
                return;
            } else {
                myVisitorsItemView.m59245v(z920Var, act, user, true, new y20() { // from class: l.sa20
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        MyVisitorsItemView.m59241t(user, visitor, myVisitorsItemView, (Boolean) obj);
                    }
                });
                return;
            }
        }
        i4g0.m138523u("e_recover_records", "p_my_visitor_isee", jyb.m147494Y("other_user_id", user.f56859id));
        if (!CoreModule.f18264c.f20410n2.m121494n4()) {
            myVisitorsItemView.m59245v(z920Var, act, user, false, new y20() { // from class: l.ra20
                @Override // p153l.y20
                public final void call(Object obj) {
                    MyVisitorsItemView.m59240s(visitor, myVisitorsItemView, (Boolean) obj);
                }
            });
            return;
        }
        final l4g0 l4g0Var = new l4g0("p_recover_records_confirm", Dialog.class.getName());
        View viewInflate = p9r.m171370a(act).inflate(pec0.f151955W1, (ViewGroup) null);
        viewInflate.getClass();
        MyVisitorRecoverHideFootPrintView myVisitorRecoverHideFootPrintView = (MyVisitorRecoverHideFootPrintView) viewInflate;
        final jl80 jl80VarM146020O = new jl80.C17971a(act).m146023R(myVisitorRecoverHideFootPrintView).m146021P(false).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.oa20
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                MyVisitorsItemView.m59236o(l4g0Var, dialogInterface);
            }
        }).m146020O();
        myVisitorRecoverHideFootPrintView.m59215e(user, new x20() { // from class: l.pa20
            @Override // p153l.x20
            public final void call() {
                MyVisitorsItemView.m59237p(jl80VarM146020O, myVisitorsItemView, z920Var, act, user, visitor);
            }
        }, new x20() { // from class: l.qa20
            @Override // p153l.x20
            public final void call() {
                MyVisitorsItemView.m59239r(jl80VarM146020O);
            }
        });
        jl80VarM146020O.show();
        w1e.m204402f(l4g0Var);
    }

    /* JADX INFO: renamed from: o */
    public static final void m59236o(l4g0 l4g0Var, DialogInterface dialogInterface) {
        w1e.m204401e(l4g0Var);
    }

    /* JADX INFO: renamed from: p */
    public static final void m59237p(jl80 jl80Var, final MyVisitorsItemView myVisitorsItemView, z920 z920Var, Act act, User user, final Visitor visitor) {
        jl80Var.dismiss();
        CoreModule.f18264c.f20410n2.m121492l4();
        myVisitorsItemView.m59245v(z920Var, act, user, false, new y20() { // from class: l.ta20
            @Override // p153l.y20
            public final void call(Object obj) {
                MyVisitorsItemView.m59238q(visitor, myVisitorsItemView, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public static final void m59238q(Visitor visitor, MyVisitorsItemView myVisitorsItemView, Boolean bool) {
        bool.getClass();
        visitor.hidden = bool.booleanValue();
        myVisitorsItemView.m59244u(visitor);
    }

    /* JADX INFO: renamed from: r */
    public static final void m59239r(jl80 jl80Var) {
        jl80Var.dismiss();
    }

    /* JADX INFO: renamed from: s */
    public static final void m59240s(Visitor visitor, MyVisitorsItemView myVisitorsItemView, Boolean bool) {
        bool.getClass();
        visitor.hidden = bool.booleanValue();
        myVisitorsItemView.m59244u(visitor);
    }

    /* JADX INFO: renamed from: t */
    public static final void m59241t(User user, Visitor visitor, MyVisitorsItemView myVisitorsItemView, Boolean bool) {
        o1j0.m165651y("已对" + (user.isFemale() ? "她" : "他") + "隐藏访问足迹");
        bool.getClass();
        visitor.hidden = bool.booleanValue();
        myVisitorsItemView.m59244u(visitor);
    }

    @NotNull
    public final TextView get_action() {
        TextView textView = this._action;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_action");
        return null;
    }

    @NotNull
    public final VText get_desc() {
        VText vText = this._desc;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_desc");
        return null;
    }

    @NotNull
    public final VText get_name() {
        VText vText = this._name;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_name");
        return null;
    }

    @NotNull
    public final HeaderFrameWrapper get_profile() {
        HeaderFrameWrapper headerFrameWrapper = this._profile;
        if (headerFrameWrapper != null) {
            return headerFrameWrapper;
        }
        Intrinsics.m88391r("_profile");
        return null;
    }

    @NotNull
    public final MyVisitorsItemView get_root() {
        MyVisitorsItemView myVisitorsItemView = this._root;
        if (myVisitorsItemView != null) {
            return myVisitorsItemView;
        }
        Intrinsics.m88391r("_root");
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final void m59242k(View view) {
        wa20.m205633a(this, view);
    }

    /* JADX INFO: renamed from: l */
    public final void m59243l(@NotNull final z920 adapter, @NotNull final Act act, @NotNull q920 item) {
        adapter.getClass();
        act.getClass();
        item.getClass();
        enb enbVar = CoreModule.f18264c.f20410n2;
        Visitor myVisitors = item.getMyVisitors();
        final User userM121463I3 = enbVar.m121463I3(myVisitors != null ? myVisitors.userId : null);
        if (userM121463I3 == null) {
            get_name().setText("【异常用户】");
            uqb0.f180374G.m98798o(get_profile().get_pic());
            get_profile().m80878G0(false);
            get_desc().setText("");
            return;
        }
        get_profile().m80891t0(userM121463I3);
        get_name().setText(userM121463I3.name);
        get_name().setTypeface(lyh0.m156283c(3));
        final Visitor myVisitors2 = item.getMyVisitors();
        if (myVisitors2 != null) {
            m59244u(myVisitors2);
            bnl0.m105522L(get_root(), new View.OnClickListener() { // from class: l.ma20
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MyVisitorsItemView.m59234m(act, myVisitors2, view);
                }
            });
            bnl0.m105522L(get_action(), new View.OnClickListener() { // from class: l.na20
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MyVisitorsItemView.m59235n(myVisitors2, userM121463I3, act, this, adapter, view);
                }
            });
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m59242k(this);
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
    public final void m59244u(Visitor visitor) {
        if (visitor.hidden) {
            get_desc().setText("已隐藏足迹");
            get_action().setTextColor(Color.parseColor("#FE7E1D"));
            get_action().setBackgroundResource(gbc0.f103119G5);
            get_action().setText("恢复足迹");
            return;
        }
        String str = "访问" + visitor.visitCount + "次";
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str + "·" + C9212e.INSTANCE.m59159i(pzi0.m174454o(), visitor.lastVisitTime));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(getResources().getColor(f9c0.f97859d)), 0, str.length(), 33);
        get_desc().setText(spannableStringBuilder);
        get_action().setTextColor(Color.parseColor("#FFDEA2"));
        get_action().setBackgroundResource(gbc0.f103112F5);
        get_action().setText("隐藏足迹");
    }

    /* JADX INFO: renamed from: v */
    public final void m59245v(z920 adapter, Act act, User user, final boolean hidden, final y20<Boolean> success) {
        adapter.mo68557c(act, CoreModule.f18264c.f20410n2.m121493m4(user.f56859id, hidden)).subscribe(psd0.m173597H(new y20() { // from class: l.ua20
            @Override // p153l.y20
            public final void call(Object obj) {
                MyVisitorsItemView.m59231h(success, hidden, (uxj0) obj);
            }
        }, new y20() { // from class: l.va20
            @Override // p153l.y20
            public final void call(Object obj) {
                MyVisitorsItemView.m59225b((Throwable) obj);
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
