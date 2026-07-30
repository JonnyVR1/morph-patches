package p009l;

import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC0030b;
import com.p000p1.mobile.putong.newui.main.base.TabName;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.ui.poplevel.PopAction;
import com.p1.mobile.android.ui.poplevel.a;
import com.p1.mobile.android.ui.pushbubble.SimplePushBubble;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ActionData;
import com.p1.mobile.putong.core.data.ActionToast;
import com.p1.mobile.putong.core.data.ActionToastStyle;
import com.p1.mobile.putong.core.data.ActionToastStyleButton;
import com.p1.mobile.putong.core.data.SuggesterReason;
import com.p1.mobile.putong.core.ui.poplevel.CorePopLevel;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.c30;
import l.d30;
import l.du2;
import l.e51;
import l.f6c0;
import l.hdb0;
import l.j2e0;
import l.j760;
import l.lva;
import l.pib;
import l.qib0;
import l.t100;
import l.u4c0;
import l.upa;
import l.v930;
import l.vwb;
import l.w2e0;
import l.x2c0;
import l.xdl0;
import l.zvf0;
import v.VDraweeView;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class qug0 {

    /* JADX INFO: renamed from: c */
    public static volatile qug0 f19532c;

    /* JADX INFO: renamed from: a */
    public ActionData f19533a;

    /* JADX INFO: renamed from: b */
    public boolean f19534b;

    /* JADX INFO: renamed from: l.qug0$a */
    public class C1155a implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ActionToastStyle f19535a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ActionData f19536b;

        public C1155a(ActionToastStyle actionToastStyle, ActionData actionData) {
            this.f19535a = actionToastStyle;
            this.f19536b = actionData;
        }

        public void call() {
            if (!NullChecker.a(this.f19535a) || vwb.J(this.f19535a.buttons)) {
                return;
            }
            qug0.this.m21319d("upClose", true, null, this.f19536b);
            zvf0.w("e_friends_online_popup", "p_suggest_users_home_view", new j760[]{vwb.Y("popup_page", qug0.m21315f()), vwb.Y("button_text", ((ActionToastStyleButton) this.f19535a.buttons.get(0)).buttonMessage), vwb.Y("from_female_id", this.f19535a.localReportId), vwb.Y("business", this.f19535a.business), vwb.Y("popup_title", this.f19535a.title), vwb.Y("popup_subtitle", this.f19535a.message), vwb.Y("other_user_id", this.f19535a.localReportId)});
            a.p().o(CorePopLevel.SEE_TOAST.getOnlyName(), PopAction.USER_CLOSE);
        }
    }

    /* JADX INFO: renamed from: l.qug0$b */
    public class C1156b implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ActionToastStyle f19538a;

        public C1156b(ActionToastStyle actionToastStyle) {
            this.f19538a = actionToastStyle;
        }

        public void call() {
            if (vwb.J(this.f19538a.buttons)) {
                return;
            }
            zvf0.A("e_friends_online_popup", "p_suggest_users_home_view", new j760[]{vwb.Y("popup_page", qug0.m21315f()), vwb.Y("button_text", ((ActionToastStyleButton) this.f19538a.buttons.get(0)).buttonMessage), vwb.Y("has_close_button", Boolean.valueOf(this.f19538a.showClose)), vwb.Y("from_female_id", this.f19538a.localReportId), vwb.Y("business", this.f19538a.business), vwb.Y("area_link", this.f19538a.toastLink), vwb.Y("popup_title", this.f19538a.title), vwb.Y("popup_subtitle", this.f19538a.message), vwb.Y("other_user_id", this.f19538a.localReportId)});
            if (upa.x()) {
                return;
            }
            zch0.m25654a().m25664k(true);
        }
    }

    /* JADX INFO: renamed from: l.qug0$c */
    public class C1157c implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ActionData f19540a;

        public C1157c(ActionData actionData) {
            this.f19540a = actionData;
        }

        public void call() {
            qug0.this.m21319d("dismiss", true, null, this.f19540a);
            if (upa.x()) {
                return;
            }
            zch0.m25654a().m25664k(false);
        }
    }

    /* JADX INFO: renamed from: l.qug0$d */
    public class ViewOnClickListenerC1158d implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ActionToastStyle f19542a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0030b f19543b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ActionData f19544c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ SimplePushBubble f19545d;

        public ViewOnClickListenerC1158d(ActionToastStyle actionToastStyle, ViewTreeObserverOnGlobalLayoutListenerC0030b viewTreeObserverOnGlobalLayoutListenerC0030b, ActionData actionData, SimplePushBubble simplePushBubble) {
            this.f19542a = actionToastStyle;
            this.f19543b = viewTreeObserverOnGlobalLayoutListenerC0030b;
            this.f19544c = actionData;
            this.f19545d = simplePushBubble;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!TextUtils.isEmpty(this.f19542a.toastLink) && NullChecker.a(this.f19543b.act())) {
                if (!TextUtils.isEmpty(new w2e0.a(this.f19543b.act(), Uri.parse(this.f19542a.toastLink).toString()).d().d())) {
                    lva.D(this.f19543b.act(), Uri.parse(this.f19542a.toastLink));
                    qug0.this.m21319d("tapPop", true, null, this.f19544c);
                    this.f19545d.I();
                }
                zvf0.u("e_friends_online_popup", "p_suggest_users_home_view", new j760[]{vwb.Y("popup_page", qug0.m21315f()), vwb.Y("button_text", vwb.J(this.f19542a.buttons) ? "" : ((ActionToastStyleButton) this.f19542a.buttons.get(0)).buttonMessage), vwb.Y("area_link", this.f19542a.toastLink), vwb.Y("from_female_id", this.f19542a.localReportId), vwb.Y("business", this.f19542a.business), vwb.Y("popup_title", this.f19542a.title), vwb.Y("popup_subtitle", this.f19542a.message), vwb.Y("other_user_id", this.f19542a.localReportId)});
                a.p().o(CorePopLevel.SEE_TOAST.getOnlyName(), PopAction.OTHER_ACTION);
            }
        }
    }

    /* JADX INFO: renamed from: l.qug0$e */
    public class ViewOnClickListenerC1159e implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0030b f19547a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ActionToastStyleButton f19548b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ActionToastStyle f19549c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ ActionData f19550d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ SimplePushBubble f19551e;

        public ViewOnClickListenerC1159e(ViewTreeObserverOnGlobalLayoutListenerC0030b viewTreeObserverOnGlobalLayoutListenerC0030b, ActionToastStyleButton actionToastStyleButton, ActionToastStyle actionToastStyle, ActionData actionData, SimplePushBubble simplePushBubble) {
            this.f19547a = viewTreeObserverOnGlobalLayoutListenerC0030b;
            this.f19548b = actionToastStyleButton;
            this.f19549c = actionToastStyle;
            this.f19550d = actionData;
            this.f19551e = simplePushBubble;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (NullChecker.a(this.f19547a.act())) {
                lva.D(this.f19547a.act(), Uri.parse(this.f19548b.buttonLink));
                zvf0.u("e_friends_online_button_click", "p_suggest_users_home_view", new j760[]{vwb.Y("popup_page", qug0.m21315f()), vwb.Y("button_text", ((ActionToastStyleButton) this.f19549c.buttons.get(0)).buttonMessage), vwb.Y("has_close_button", Boolean.valueOf(this.f19549c.showClose)), vwb.Y("button_link", new w2e0.a(this.f19547a.act(), Uri.parse(this.f19548b.buttonLink).toString()).d().d()), vwb.Y("business", this.f19549c.business), vwb.Y("other_user_id", this.f19549c.localReportId)});
                a.p().o(CorePopLevel.SEE_TOAST.getOnlyName(), PopAction.OTHER_ACTION);
            }
            qug0.this.m21319d("tapButton", true, null, this.f19550d);
            this.f19551e.I();
        }
    }

    /* JADX INFO: renamed from: l.qug0$f */
    public class ViewOnClickListenerC1160f implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ActionData f19553a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ SimplePushBubble f19554b;

        public ViewOnClickListenerC1160f(ActionData actionData, SimplePushBubble simplePushBubble) {
            this.f19553a = actionData;
            this.f19554b = simplePushBubble;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            qug0.this.m21319d("close", true, null, this.f19553a);
            zvf0.r("e_friends_online_popup_close", "p_suggest_users_home_view");
            this.f19554b.I();
            a.p().o(CorePopLevel.SEE_TOAST.getOnlyName(), PopAction.USER_CLOSE);
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m21315f() {
        if (v930.h() == TabName.Card) {
            return "swipe";
        }
        if (v930.h() == TabName.Live) {
            return "live";
        }
        if (v930.h() == TabName.Moment) {
            return "find";
        }
        if (v930.h() == TabName.Msg) {
            return "message";
        }
        if (v930.h() == TabName.Me) {
            return "my";
        }
        TabName tabNameH = v930.h();
        return tabNameH == null ? "other" : tabNameH.name();
    }

    /* JADX INFO: renamed from: g */
    public static qug0 m21316g() {
        if (f19532c == null) {
            synchronized (qug0.class) {
                try {
                    if (f19532c == null) {
                        f19532c = new qug0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f19532c;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m21317h(List<String> list) {
        if (list.contains("swipe") && v930.h() == TabName.Card) {
            return true;
        }
        if (list.contains("live") && v930.h() == TabName.Live) {
            return true;
        }
        if (list.contains("find") && v930.h() == TabName.Moment) {
            return true;
        }
        if (list.contains("message") && v930.h() == TabName.Msg) {
            return true;
        }
        return list.contains("my") && v930.h() == TabName.Me;
    }

    /* JADX INFO: renamed from: m */
    public static j760<String, String> m21318m(String str) {
        if (str == null) {
            return j760.a("", "");
        }
        return (str.contains("[") && str.contains("]")) ? j760.a(str.substring(str.indexOf(91), str.indexOf(93) + 1), str.substring(str.indexOf(93) + 1)) : j760.a("", str);
    }

    /* JADX INFO: renamed from: d */
    public void m21319d(String str, boolean z, String str2, @NonNull ActionData actionData) {
        du2.a("[See_Toast]", "feed back " + z + " , " + str2 + " , " + actionData.traceId + " , " + this.f19534b);
        if (this.f19534b) {
            return;
        }
        if (z) {
            this.f19534b = true;
        }
        User userMe_ = CoreModule.K().me_();
        pib pibVar = CoreModule.c.e0;
        String str3 = userMe_ == null ? "-1" : ((DbObject) userMe_).id;
        String strM21315f = m21315f();
        ActionToastStyle actionToastStyle = actionData.toastStyle;
        pibVar.f7(str3, str, z, str2, strM21315f, actionToastStyle.business, actionToastStyle.localReportId, actionData.traceId);
    }

    /* JADX INFO: renamed from: e */
    public ActionData m21320e() {
        return this.f19533a;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m21321i(ActionData actionData, SimplePushBubble simplePushBubble) {
        du2.a("[See_Toast]", "start show in after post" + upa.x() + " , " + actionData.traceId);
        if (zch0.m25654a().m25658e()) {
            if (upa.x()) {
                this.f19533a = actionData;
                return;
            } else {
                m21319d(null, false, SuggesterReason.BOTTOM_WINDOW.getReason(), actionData);
                return;
            }
        }
        this.f19534b = false;
        du2.a("[See_Toast]", "start show in manager" + actionData.traceId + " , " + simplePushBubble.hashCode());
        hdb0.c().i(simplePushBubble);
    }

    /* JADX INFO: renamed from: j */
    public void m21322j(ViewTreeObserverOnGlobalLayoutListenerC0030b viewTreeObserverOnGlobalLayoutListenerC0030b) {
        m21323k(viewTreeObserverOnGlobalLayoutListenerC0030b, this.f19533a);
    }

    /* JADX INFO: renamed from: k */
    public void m21323k(ViewTreeObserverOnGlobalLayoutListenerC0030b viewTreeObserverOnGlobalLayoutListenerC0030b, ActionData actionData) {
        ActionToastStyle actionToastStyle;
        final qug0 qug0Var;
        final ActionData actionData2;
        if (actionData == null || viewTreeObserverOnGlobalLayoutListenerC0030b == null || viewTreeObserverOnGlobalLayoutListenerC0030b.act() == null || (actionToastStyle = actionData.toastStyle) == null || TextUtils.isEmpty(actionToastStyle.title)) {
            du2.a("[See_Toast]", "start show toast return by null : ");
            return;
        }
        ActionToastStyle actionToastStyle2 = actionData.toastStyle;
        if (!TextUtils.equals(actionToastStyle2.styleId, "1")) {
            du2.a("[See_Toast]", "start show toast return by style");
            return;
        }
        List list = actionToastStyle2.scenes;
        Act actD = c30.d();
        StringBuilder sb = new StringBuilder("start show toast current id: ");
        sb.append(actionData.traceId);
        sb.append(" act: ");
        sb.append(actD == null ? "null" : actD.getPopLifeName());
        du2.a("[See_Toast]", sb.toString());
        if (NullChecker.a(actD) && !CoreModule.K().isMainPage(actD)) {
            if (upa.x()) {
                this.f19533a = actionData;
                return;
            } else {
                m21319d(null, false, SuggesterReason.NO_HOME.getReason(), actionData);
                return;
            }
        }
        if (vwb.J(list) || !m21317h(list)) {
            if (upa.x()) {
                this.f19533a = actionData;
                return;
            } else {
                m21319d(null, false, SuggesterReason.SENCE.getReason(), actionData);
                return;
            }
        }
        this.f19533a = null;
        View viewInflate = o7r.m19649a(viewTreeObserverOnGlobalLayoutListenerC0030b.act()).inflate(f6c0.ec, (ViewGroup) null);
        VDraweeView vDraweeViewFindViewById = viewInflate.findViewById(u4c0.O);
        VImage vImageFindViewById = viewInflate.findViewById(u4c0.Z8);
        VText vTextFindViewById = viewInflate.findViewById(u4c0.ge);
        VText vTextFindViewById2 = viewInflate.findViewById(u4c0.Zc);
        VLinear vLinearFindViewById = viewInflate.findViewById(u4c0.L0);
        VText vTextFindViewById3 = viewInflate.findViewById(u4c0.q3);
        VText vTextFindViewById4 = viewInflate.findViewById(u4c0.Pd);
        VImage vImageFindViewById2 = viewInflate.findViewById(u4c0.A1);
        final SimplePushBubble simplePushBubbleS = new SimplePushBubble.a(viewTreeObserverOnGlobalLayoutListenerC0030b.act(), viewInflate).B(2).A(upa.x() ? 3 : 2).y(new RelativeLayout.LayoutParams(-1, t100.d(72.0f))).w(actionToastStyle2.showTime).z(CorePopLevel.SEE_TOAST).F(new C1155a(actionToastStyle2, actionData)).s();
        simplePushBubbleS.s(new C1156b(actionToastStyle2));
        simplePushBubbleS.q(new C1157c(actionData));
        xdl0.E0(viewInflate, new ViewOnClickListenerC1158d(actionToastStyle2, viewTreeObserverOnGlobalLayoutListenerC0030b, actionData, simplePushBubbleS));
        if (!TextUtils.isEmpty(actionToastStyle2.mainImg)) {
            qib0.G.N0(vDraweeViewFindViewById, actionToastStyle2.mainImg, false);
        }
        xdl0.M(vImageFindViewById, TextUtils.equals(actionToastStyle2.icons.miniIcon, "online"));
        vTextFindViewById.setTypeface(Typeface.defaultFromStyle(1));
        vTextFindViewById.setText(actionToastStyle2.title);
        vTextFindViewById2.setText(actionToastStyle2.message);
        List list2 = actionToastStyle2.buttons;
        if (vwb.J(list2)) {
            qug0Var = this;
            actionData2 = actionData;
            xdl0.M(vLinearFindViewById, false);
        } else {
            ActionToastStyleButton actionToastStyleButton = (ActionToastStyleButton) list2.get(0);
            xdl0.M(vLinearFindViewById, actionToastStyleButton.showButton);
            qug0Var = this;
            actionData2 = actionData;
            xdl0.E0(vLinearFindViewById, qug0Var.new ViewOnClickListenerC1159e(viewTreeObserverOnGlobalLayoutListenerC0030b, actionToastStyleButton, actionToastStyle2, actionData, simplePushBubbleS));
            j760<String, String> j760VarM21318m = m21318m(actionToastStyleButton.buttonMessage);
            String str = (String) j760VarM21318m.a;
            String str2 = (String) j760VarM21318m.b;
            if (TextUtils.isEmpty(str)) {
                actionToastStyle2 = actionToastStyle2;
                simplePushBubbleS = simplePushBubbleS;
                xdl0.M(vTextFindViewById3, false);
            } else {
                actionToastStyle2 = actionToastStyle2;
                simplePushBubbleS = simplePushBubbleS;
                vTextFindViewById3.setText((CharSequence) j760VarM21318m.a);
                xdl0.M(vTextFindViewById3, true);
            }
            vTextFindViewById4.setText(str2);
            vTextFindViewById4.setTypeface(Typeface.defaultFromStyle(1));
            if (TextUtils.equals(actionToastStyleButton.buttonBackground, "orange")) {
                vLinearFindViewById.setBackground(viewTreeObserverOnGlobalLayoutListenerC0030b.act().getDrawable(x2c0.qn));
                vTextFindViewById4.setTextColor(Color.parseColor("#FFFFFF"));
            } else {
                vLinearFindViewById.setBackground(viewTreeObserverOnGlobalLayoutListenerC0030b.act().getDrawable(x2c0.rn));
                vTextFindViewById4.setTextColor(Color.parseColor("#4D000000"));
            }
        }
        xdl0.M(vImageFindViewById2, actionToastStyle2.showClose);
        xdl0.E0(vImageFindViewById2, qug0Var.new ViewOnClickListenerC1160f(actionData2, simplePushBubbleS));
        du2.a("[See_Toast]", "start show by post" + actionData2.traceId);
        e51.F(viewTreeObserverOnGlobalLayoutListenerC0030b.act(), new Runnable() { // from class: l.pug0
            @Override // java.lang.Runnable
            public final void run() {
                this.f18922a.m21321i(actionData2, simplePushBubbleS);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public void m21324l(final ViewTreeObserverOnGlobalLayoutListenerC0030b viewTreeObserverOnGlobalLayoutListenerC0030b, ActionToast actionToast) {
        if (viewTreeObserverOnGlobalLayoutListenerC0030b == null || TextUtils.isEmpty(actionToast.message)) {
            return;
        }
        String str = actionToast.message;
        String str2 = actionToast.mainImg;
        boolean z = actionToast.loveImg;
        final String str3 = actionToast.option.link;
        View viewInflate = o7r.m19649a(viewTreeObserverOnGlobalLayoutListenerC0030b.act()).inflate(f6c0.dc, (ViewGroup) null);
        if (!TextUtils.isEmpty(str3)) {
            xdl0.E0(viewInflate, new View.OnClickListener() { // from class: l.nug0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    j2e0.m(viewTreeObserverOnGlobalLayoutListenerC0030b.act(), Uri.parse(str3));
                }
            });
        }
        ((TextView) viewInflate.findViewById(u4c0.ge)).setText(str);
        View viewFindViewById = viewInflate.findViewById(u4c0.g6);
        if (!TextUtils.isEmpty(str2) || z) {
            xdl0.M(viewFindViewById, true);
            if (TextUtils.isEmpty(str2)) {
                xdl0.M(viewFindViewById.findViewById(u4c0.nc), false);
            } else {
                qib0.G.N0(viewFindViewById.findViewById(u4c0.O), str2, false);
            }
        } else {
            xdl0.M(viewFindViewById, false);
        }
        final SimplePushBubble simplePushBubbleS = new SimplePushBubble.a(viewTreeObserverOnGlobalLayoutListenerC0030b.act(), viewInflate).w(5000).s();
        simplePushBubbleS.x(CorePopLevel.SUGGEST_SHOW_PUSH);
        e51.H(viewTreeObserverOnGlobalLayoutListenerC0030b.act(), new Runnable() { // from class: l.oug0
            @Override // java.lang.Runnable
            public final void run() {
                hdb0.c().i(simplePushBubbleS);
            }
        }, 400L);
    }
}
