package com.p046p1.mobile.putong.core.p053ui.visitor.myvisitors;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Item;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.p053ui.visitor.C9049e;
import com.p046p1.mobile.putong.core.p053ui.visitor.myvisitors.MyVisitorsItemView;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Visitor;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.p065ui.headframe.HeaderFrameWrapper;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VText;
import p149l.b3c0;
import p149l.cwf0;
import p149l.d30;
import p149l.dd80;
import p149l.e30;
import p149l.eqh0;
import p149l.i0e;
import p149l.i120;
import p149l.k6c0;
import p149l.lsi0;
import p149l.mkd0;
import p149l.mqi0;
import p149l.o220;
import p149l.o7r;
import p149l.qib0;
import p149l.qlb;
import p149l.r120;
import p149l.roj0;
import p149l.vwb;
import p149l.xdl0;
import p149l.xma;
import p149l.z0c0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ%\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J?\u0010\u001d\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"R\"\u0010)\u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00109\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010=\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u00104\u001a\u0004\b;\u00106\"\u0004\b<\u00108R\"\u0010E\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010D¨\u0006F"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/visitor/myvisitors/MyVisitorsItemView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "Ll/r120;", "adapter", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Ll/i120;", Item.TYPE, BLiveStormDanmakuGiftResourceType.f44444l, "(Ll/r120;Lcom/p1/mobile/android/app/Act;Ll/i120;)V", "Landroid/view/View;", OMSTemplateModeType.view, "k", "(Landroid/view/View;)V", "Lcom/p1/mobile/putong/data/User;", "user", "", "hidden", "Ll/e30;", "success", ResourceDirection.f38808v, "(Ll/r120;Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/data/User;ZLl/e30;)V", "Lcom/p1/mobile/putong/data/Visitor;", Visitor.TYPE, "u", "(Lcom/p1/mobile/putong/data/Visitor;)V", "a", "Lcom/p1/mobile/putong/core/ui/visitor/myvisitors/MyVisitorsItemView;", "get_root", "()Lcom/p1/mobile/putong/core/ui/visitor/myvisitors/MyVisitorsItemView;", "set_root", "(Lcom/p1/mobile/putong/core/ui/visitor/myvisitors/MyVisitorsItemView;)V", "_root", "Lcom/p1/mobile/putong/ui/headframe/HeaderFrameWrapper;", "b", "Lcom/p1/mobile/putong/ui/headframe/HeaderFrameWrapper;", "get_profile", "()Lcom/p1/mobile/putong/ui/headframe/HeaderFrameWrapper;", "set_profile", "(Lcom/p1/mobile/putong/ui/headframe/HeaderFrameWrapper;)V", "_profile", "Lv/VText;", "c", "Lv/VText;", "get_name", "()Lv/VText;", "set_name", "(Lv/VText;)V", "_name", Constants.INAPP_DATA_TAG, "get_desc", "set_desc", "_desc", "Landroid/widget/TextView;", "e", "Landroid/widget/TextView;", "get_action", "()Landroid/widget/TextView;", "set_action", "(Landroid/widget/TextView;)V", "_action", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
    public static void m58042b(Throwable th) {
    }

    /* JADX INFO: renamed from: h */
    public static void m58048h(e30 e30Var, boolean z, roj0 roj0Var) {
        if (e30Var != null) {
            e30Var.call(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: m */
    public static final void m58051m(Act act, Visitor visitor, View view) {
        act.startActivity(CoreModule.m29935P().m94651a().mo33528jr(act, visitor.userId, "moment_visitor", false));
    }

    /* JADX INFO: renamed from: n */
    public static final void m58052n(final Visitor visitor, final User user, final Act act, final MyVisitorsItemView myVisitorsItemView, final r120 r120Var, View view) {
        if (!visitor.hidden) {
            zvf0.m220399u("e_hide_records", "p_my_visitor_isee", vwb.m200311Y("other_user_id", user.f56011id));
            if (!xma.m210043F3()) {
                CoreModule.m29935P().m94651a().mo33618wh(act, "p_navigation_visit,isee", null, null, null, Privilege.visitor_hide_footprint);
                return;
            } else if (xma.m210038A4() <= 0) {
                lsi0.m151595y("本月特权次数已用完");
                return;
            } else {
                myVisitorsItemView.m58062v(r120Var, act, user, true, new e30() { // from class: l.k220
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        MyVisitorsItemView.m58058t(user, visitor, myVisitorsItemView, (Boolean) obj);
                    }
                });
                return;
            }
        }
        zvf0.m220399u("e_recover_records", "p_my_visitor_isee", vwb.m200311Y("other_user_id", user.f56011id));
        if (!CoreModule.f17545c.f19668n2.m175463n4()) {
            myVisitorsItemView.m58062v(r120Var, act, user, false, new e30() { // from class: l.j220
                @Override // p149l.e30
                public final void call(Object obj) {
                    MyVisitorsItemView.m58057s(visitor, myVisitorsItemView, (Boolean) obj);
                }
            });
            return;
        }
        final cwf0 cwf0Var = new cwf0("p_recover_records_confirm", Dialog.class.getName());
        View viewInflate = o7r.m163037a(act).inflate(k6c0.f121347W1, (ViewGroup) null);
        viewInflate.getClass();
        MyVisitorRecoverHideFootPrintView myVisitorRecoverHideFootPrintView = (MyVisitorRecoverHideFootPrintView) viewInflate;
        final dd80 dd80VarM110960O = new dd80.C16336a(act).m110963R(myVisitorRecoverHideFootPrintView).m110961P(false).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.g220
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                MyVisitorsItemView.m58053o(cwf0Var, dialogInterface);
            }
        }).m110960O();
        myVisitorRecoverHideFootPrintView.m58032e(user, new d30() { // from class: l.h220
            @Override // p149l.d30
            public final void call() {
                MyVisitorsItemView.m58054p(dd80VarM110960O, myVisitorsItemView, r120Var, act, user, visitor);
            }
        }, new d30() { // from class: l.i220
            @Override // p149l.d30
            public final void call() {
                MyVisitorsItemView.m58056r(dd80VarM110960O);
            }
        });
        dd80VarM110960O.show();
        i0e.m133797f(cwf0Var);
    }

    /* JADX INFO: renamed from: o */
    public static final void m58053o(cwf0 cwf0Var, DialogInterface dialogInterface) {
        i0e.m133796e(cwf0Var);
    }

    /* JADX INFO: renamed from: p */
    public static final void m58054p(dd80 dd80Var, final MyVisitorsItemView myVisitorsItemView, r120 r120Var, Act act, User user, final Visitor visitor) {
        dd80Var.dismiss();
        CoreModule.f17545c.f19668n2.m175461l4();
        myVisitorsItemView.m58062v(r120Var, act, user, false, new e30() { // from class: l.l220
            @Override // p149l.e30
            public final void call(Object obj) {
                MyVisitorsItemView.m58055q(visitor, myVisitorsItemView, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public static final void m58055q(Visitor visitor, MyVisitorsItemView myVisitorsItemView, Boolean bool) {
        bool.getClass();
        visitor.hidden = bool.booleanValue();
        myVisitorsItemView.m58061u(visitor);
    }

    /* JADX INFO: renamed from: r */
    public static final void m58056r(dd80 dd80Var) {
        dd80Var.dismiss();
    }

    /* JADX INFO: renamed from: s */
    public static final void m58057s(Visitor visitor, MyVisitorsItemView myVisitorsItemView, Boolean bool) {
        bool.getClass();
        visitor.hidden = bool.booleanValue();
        myVisitorsItemView.m58061u(visitor);
    }

    /* JADX INFO: renamed from: t */
    public static final void m58058t(User user, Visitor visitor, MyVisitorsItemView myVisitorsItemView, Boolean bool) {
        lsi0.m151595y("已对" + (user.isFemale() ? "她" : "他") + "隐藏访问足迹");
        bool.getClass();
        visitor.hidden = bool.booleanValue();
        myVisitorsItemView.m58061u(visitor);
    }

    @NotNull
    public final TextView get_action() {
        TextView textView = this._action;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_action");
        return null;
    }

    @NotNull
    public final VText get_desc() {
        VText vText = this._desc;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_desc");
        return null;
    }

    @NotNull
    public final VText get_name() {
        VText vText = this._name;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_name");
        return null;
    }

    @NotNull
    public final HeaderFrameWrapper get_profile() {
        HeaderFrameWrapper headerFrameWrapper = this._profile;
        if (headerFrameWrapper != null) {
            return headerFrameWrapper;
        }
        Intrinsics.m87502r("_profile");
        return null;
    }

    @NotNull
    public final MyVisitorsItemView get_root() {
        MyVisitorsItemView myVisitorsItemView = this._root;
        if (myVisitorsItemView != null) {
            return myVisitorsItemView;
        }
        Intrinsics.m87502r("_root");
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final void m58059k(View view) {
        o220.m162284a(this, view);
    }

    /* JADX INFO: renamed from: l */
    public final void m58060l(@NotNull final r120 adapter, @NotNull final Act act, @NotNull i120 item) {
        adapter.getClass();
        act.getClass();
        item.getClass();
        qlb qlbVar = CoreModule.f17545c.f19668n2;
        Visitor myVisitors = item.getMyVisitors();
        final User userM175432I3 = qlbVar.m175432I3(myVisitors != null ? myVisitors.userId : null);
        if (userM175432I3 == null) {
            get_name().setText("【异常用户】");
            qib0.f154691G.m184725o(get_profile().get_pic());
            get_profile().m79695G0(false);
            get_desc().setText("");
            return;
        }
        get_profile().m79708t0(userM175432I3);
        get_name().setText(userM175432I3.name);
        get_name().setTypeface(eqh0.m117752c(3));
        final Visitor myVisitors2 = item.getMyVisitors();
        if (myVisitors2 != null) {
            m58061u(myVisitors2);
            xdl0.m208342L(get_root(), new View.OnClickListener() { // from class: l.e220
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MyVisitorsItemView.m58051m(act, myVisitors2, view);
                }
            });
            xdl0.m208342L(get_action(), new View.OnClickListener() { // from class: l.f220
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MyVisitorsItemView.m58052n(myVisitors2, userM175432I3, act, this, adapter, view);
                }
            });
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m58059k(this);
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
    public final void m58061u(Visitor visitor) {
        if (visitor.hidden) {
            get_desc().setText("已隐藏足迹");
            get_action().setTextColor(Color.parseColor("#FE7E1D"));
            get_action().setBackgroundResource(b3c0.f72868G5);
            get_action().setText("恢复足迹");
            return;
        }
        String str = "访问" + visitor.visitCount + "次";
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str + "·" + C9049e.INSTANCE.m57976i(mqi0.m155944o(), visitor.lastVisitTime));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(getResources().getColor(z0c0.f200976d)), 0, str.length(), 33);
        get_desc().setText(spannableStringBuilder);
        get_action().setTextColor(Color.parseColor("#FFDEA2"));
        get_action().setBackgroundResource(b3c0.f72861F5);
        get_action().setText("隐藏足迹");
    }

    /* JADX INFO: renamed from: v */
    public final void m58062v(r120 adapter, Act act, User user, final boolean hidden, final e30<Boolean> success) {
        adapter.mo67374c(act, CoreModule.f17545c.f19668n2.m175462m4(user.f56011id, hidden)).subscribe(mkd0.m154956H(new e30() { // from class: l.m220
            @Override // p149l.e30
            public final void call(Object obj) {
                MyVisitorsItemView.m58048h(success, hidden, (roj0) obj);
            }
        }, new e30() { // from class: l.n220
            @Override // p149l.e30
            public final void call(Object obj) {
                MyVisitorsItemView.m58042b((Throwable) obj);
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
