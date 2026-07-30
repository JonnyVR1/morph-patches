package p153l;

import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.p053ui.poplevel.C4522a;
import com.p051p1.mobile.android.p053ui.poplevel.PopAction;
import com.p051p1.mobile.android.p053ui.pushbubble.SimplePushBubble;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ActionData;
import com.p051p1.mobile.putong.core.data.ActionToast;
import com.p051p1.mobile.putong.core.data.ActionToastStyle;
import com.p051p1.mobile.putong.core.data.ActionToastStyleButton;
import com.p051p1.mobile.putong.core.data.SuggesterReason;
import com.p051p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC8017b;
import com.p051p1.mobile.putong.core.p058ui.notifications.SysnotifListener;
import com.p051p1.mobile.putong.core.p058ui.poplevel.CorePopLevel;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.entry.LiveVoiceInternalEntryBean;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class y2h0 {

    /* JADX INFO: renamed from: c */
    public static volatile y2h0 f197234c;

    /* JADX INFO: renamed from: a */
    public ActionData f197235a;

    /* JADX INFO: renamed from: b */
    public boolean f197236b;

    /* JADX INFO: renamed from: l.y2h0$a */
    public class C21496a implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ActionToastStyle f197237a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ActionData f197238b;

        public C21496a(ActionToastStyle actionToastStyle, ActionData actionData) {
            this.f197237a = actionToastStyle;
            this.f197238b = actionData;
        }

        @Override // p153l.x20
        public void call() {
            if (!NullChecker.m82486a(this.f197237a) || jyb.m147479J(this.f197237a.buttons)) {
                return;
            }
            y2h0.this.m214083d("upClose", true, null, this.f197238b);
            i4g0.m138525w("e_friends_online_popup", "p_suggest_users_home_view", jyb.m147494Y("popup_page", y2h0.m214079f()), jyb.m147494Y("button_text", this.f197237a.buttons.get(0).buttonMessage), jyb.m147494Y("from_female_id", this.f197237a.localReportId), jyb.m147494Y("business", this.f197237a.business), jyb.m147494Y("popup_title", this.f197237a.title), jyb.m147494Y("popup_subtitle", this.f197237a.message), jyb.m147494Y("other_user_id", this.f197237a.localReportId));
            C4522a.m22099p().m22118o(CorePopLevel.SEE_TOAST.getOnlyName(), PopAction.USER_CLOSE);
        }
    }

    /* JADX INFO: renamed from: l.y2h0$b */
    public class C21497b implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ActionToastStyle f197240a;

        public C21497b(ActionToastStyle actionToastStyle) {
            this.f197240a = actionToastStyle;
        }

        @Override // p153l.x20
        public void call() {
            if (jyb.m147479J(this.f197240a.buttons)) {
                return;
            }
            i4g0.m138492A("e_friends_online_popup", "p_suggest_users_home_view", jyb.m147494Y("popup_page", y2h0.m214079f()), jyb.m147494Y("button_text", this.f197240a.buttons.get(0).buttonMessage), jyb.m147494Y("has_close_button", Boolean.valueOf(this.f197240a.showClose)), jyb.m147494Y("from_female_id", this.f197240a.localReportId), jyb.m147494Y("business", this.f197240a.business), jyb.m147494Y("area_link", this.f197240a.toastLink), jyb.m147494Y("popup_title", this.f197240a.title), jyb.m147494Y("popup_subtitle", this.f197240a.message), jyb.m147494Y("other_user_id", this.f197240a.localReportId));
            if (gra.m131768x()) {
                return;
            }
            hlh0.m135741a().m135751k(true);
        }
    }

    /* JADX INFO: renamed from: l.y2h0$c */
    public class C21498c implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ActionData f197242a;

        public C21498c(ActionData actionData) {
            this.f197242a = actionData;
        }

        @Override // p153l.x20
        public void call() {
            y2h0.this.m214083d(SysnotifListener.ACTION_DISMISS, true, null, this.f197242a);
            if (gra.m131768x()) {
                return;
            }
            hlh0.m135741a().m135751k(false);
        }
    }

    /* JADX INFO: renamed from: l.y2h0$d */
    public class ViewOnClickListenerC21499d implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ActionToastStyle f197244a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC8017b f197245b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ActionData f197246c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ SimplePushBubble f197247d;

        public ViewOnClickListenerC21499d(ActionToastStyle actionToastStyle, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b, ActionData actionData, SimplePushBubble simplePushBubble) {
            this.f197244a = actionToastStyle;
            this.f197245b = viewTreeObserverOnGlobalLayoutListenerC8017b;
            this.f197246c = actionData;
            this.f197247d = simplePushBubble;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!TextUtils.isEmpty(this.f197244a.toastLink) && NullChecker.m82486a(this.f197245b.act())) {
                if (!TextUtils.isEmpty(new abe0.C15681a(this.f197245b.act(), Uri.parse(this.f197244a.toastLink).toString()).m96748d().m96741d())) {
                    xwa.m213304D(this.f197245b.act(), Uri.parse(this.f197244a.toastLink));
                    y2h0.this.m214083d("tapPop", true, null, this.f197246c);
                    this.f197247d.m22134I();
                }
                i4g0.m138523u("e_friends_online_popup", "p_suggest_users_home_view", jyb.m147494Y("popup_page", y2h0.m214079f()), jyb.m147494Y("button_text", jyb.m147479J(this.f197244a.buttons) ? "" : this.f197244a.buttons.get(0).buttonMessage), jyb.m147494Y("area_link", this.f197244a.toastLink), jyb.m147494Y("from_female_id", this.f197244a.localReportId), jyb.m147494Y("business", this.f197244a.business), jyb.m147494Y("popup_title", this.f197244a.title), jyb.m147494Y("popup_subtitle", this.f197244a.message), jyb.m147494Y("other_user_id", this.f197244a.localReportId));
                C4522a.m22099p().m22118o(CorePopLevel.SEE_TOAST.getOnlyName(), PopAction.OTHER_ACTION);
            }
        }
    }

    /* JADX INFO: renamed from: l.y2h0$e */
    public class ViewOnClickListenerC21500e implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC8017b f197249a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ActionToastStyleButton f197250b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ActionToastStyle f197251c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ ActionData f197252d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ SimplePushBubble f197253e;

        public ViewOnClickListenerC21500e(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b, ActionToastStyleButton actionToastStyleButton, ActionToastStyle actionToastStyle, ActionData actionData, SimplePushBubble simplePushBubble) {
            this.f197249a = viewTreeObserverOnGlobalLayoutListenerC8017b;
            this.f197250b = actionToastStyleButton;
            this.f197251c = actionToastStyle;
            this.f197252d = actionData;
            this.f197253e = simplePushBubble;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (NullChecker.m82486a(this.f197249a.act())) {
                xwa.m213304D(this.f197249a.act(), Uri.parse(this.f197250b.buttonLink));
                i4g0.m138523u("e_friends_online_button_click", "p_suggest_users_home_view", jyb.m147494Y("popup_page", y2h0.m214079f()), jyb.m147494Y("button_text", this.f197251c.buttons.get(0).buttonMessage), jyb.m147494Y("has_close_button", Boolean.valueOf(this.f197251c.showClose)), jyb.m147494Y("button_link", new abe0.C15681a(this.f197249a.act(), Uri.parse(this.f197250b.buttonLink).toString()).m96748d().m96741d()), jyb.m147494Y("business", this.f197251c.business), jyb.m147494Y("other_user_id", this.f197251c.localReportId));
                C4522a.m22099p().m22118o(CorePopLevel.SEE_TOAST.getOnlyName(), PopAction.OTHER_ACTION);
            }
            y2h0.this.m214083d("tapButton", true, null, this.f197252d);
            this.f197253e.m22134I();
        }
    }

    /* JADX INFO: renamed from: l.y2h0$f */
    public class ViewOnClickListenerC21501f implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ActionData f197255a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ SimplePushBubble f197256b;

        public ViewOnClickListenerC21501f(ActionData actionData, SimplePushBubble simplePushBubble) {
            this.f197255a = actionData;
            this.f197256b = simplePushBubble;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            y2h0.this.m214083d("close", true, null, this.f197255a);
            i4g0.m138520r("e_friends_online_popup_close", "p_suggest_users_home_view");
            this.f197256b.m22134I();
            C4522a.m22099p().m22118o(CorePopLevel.SEE_TOAST.getOnlyName(), PopAction.USER_CLOSE);
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m214079f() {
        if (ji30.m144964h() == TabName.Card) {
            return "swipe";
        }
        if (ji30.m144964h() == TabName.Live) {
            return "live";
        }
        if (ji30.m144964h() == TabName.Moment) {
            return "find";
        }
        if (ji30.m144964h() == TabName.Msg) {
            return "message";
        }
        if (ji30.m144964h() == TabName.Me) {
            return "my";
        }
        TabName tabNameM144964h = ji30.m144964h();
        return tabNameM144964h == null ? "other" : tabNameM144964h.name();
    }

    /* JADX INFO: renamed from: g */
    public static y2h0 m214080g() {
        if (f197234c == null) {
            synchronized (y2h0.class) {
                try {
                    if (f197234c == null) {
                        f197234c = new y2h0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f197234c;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m214081h(List<String> list) {
        if (list.contains("swipe") && ji30.m144964h() == TabName.Card) {
            return true;
        }
        if (list.contains("live") && ji30.m144964h() == TabName.Live) {
            return true;
        }
        if (list.contains("find") && ji30.m144964h() == TabName.Moment) {
            return true;
        }
        if (list.contains("message") && ji30.m144964h() == TabName.Msg) {
            return true;
        }
        return list.contains("my") && ji30.m144964h() == TabName.Me;
    }

    /* JADX INFO: renamed from: m */
    public static pf60<String, String> m214082m(String str) {
        if (str == null) {
            return pf60.m172085a("", "");
        }
        return (str.contains("[") && str.contains(Constants.AES_SUFFIX)) ? pf60.m172085a(str.substring(str.indexOf(91), str.indexOf(93) + 1), str.substring(str.indexOf(93) + 1)) : pf60.m172085a("", str);
    }

    /* JADX INFO: renamed from: d */
    public void m214083d(String str, boolean z, String str2, @NonNull ActionData actionData) {
        tu2.m192703a("[See_Toast]", "feed back " + z + " , " + str2 + " , " + actionData.traceId + " , " + this.f197236b);
        if (this.f197236b) {
            return;
        }
        if (z) {
            this.f197236b = true;
        }
        User userMe_ = CoreModule.m30930K().me_();
        dkb dkbVar = CoreModule.f18264c.f20381e0;
        String str3 = userMe_ == null ? User.ID_TEAM_ACCOUNT : userMe_.f56859id;
        String strM214079f = m214079f();
        ActionToastStyle actionToastStyle = actionData.toastStyle;
        dkbVar.m116558f7(str3, str, z, str2, strM214079f, actionToastStyle.business, actionToastStyle.localReportId, actionData.traceId);
    }

    /* JADX INFO: renamed from: e */
    public ActionData m214084e() {
        return this.f197235a;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m214085i(ActionData actionData, SimplePushBubble simplePushBubble) {
        tu2.m192703a("[See_Toast]", "start show in after post" + gra.m131768x() + " , " + actionData.traceId);
        if (hlh0.m135741a().m135745e()) {
            if (gra.m131768x()) {
                this.f197235a = actionData;
                return;
            } else {
                m214083d(null, false, SuggesterReason.BOTTOM_WINDOW.getReason(), actionData);
                return;
            }
        }
        this.f197236b = false;
        tu2.m192703a("[See_Toast]", "start show in manager" + actionData.traceId + " , " + simplePushBubble.hashCode());
        llb0.m154703c().m154710i(simplePushBubble);
    }

    /* JADX INFO: renamed from: j */
    public void m214086j(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        m214087k(viewTreeObserverOnGlobalLayoutListenerC8017b, this.f197235a);
    }

    /* JADX INFO: renamed from: k */
    public void m214087k(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b, ActionData actionData) {
        ActionToastStyle actionToastStyle;
        final y2h0 y2h0Var;
        final ActionData actionData2;
        if (actionData == null || viewTreeObserverOnGlobalLayoutListenerC8017b == null || viewTreeObserverOnGlobalLayoutListenerC8017b.act() == null || (actionToastStyle = actionData.toastStyle) == null || TextUtils.isEmpty(actionToastStyle.title)) {
            tu2.m192703a("[See_Toast]", "start show toast return by null : ");
            return;
        }
        ActionToastStyle actionToastStyle2 = actionData.toastStyle;
        if (!TextUtils.equals(actionToastStyle2.styleId, "1")) {
            tu2.m192703a("[See_Toast]", "start show toast return by style");
            return;
        }
        List<String> list = actionToastStyle2.scenes;
        Act actM204489d = w20.m204489d();
        StringBuilder sb = new StringBuilder("start show toast current id: ");
        sb.append(actionData.traceId);
        sb.append(" act: ");
        sb.append(actM204489d == null ? "null" : actM204489d.getPopLifeName());
        tu2.m192703a("[See_Toast]", sb.toString());
        if (NullChecker.m82486a(actM204489d) && !CoreModule.m30930K().isMainPage(actM204489d)) {
            if (gra.m131768x()) {
                this.f197235a = actionData;
                return;
            } else {
                m214083d(null, false, SuggesterReason.NO_HOME.getReason(), actionData);
                return;
            }
        }
        if (jyb.m147479J(list) || !m214081h(list)) {
            if (gra.m131768x()) {
                this.f197235a = actionData;
                return;
            } else {
                m214083d(null, false, SuggesterReason.SENCE.getReason(), actionData);
                return;
            }
        }
        this.f197235a = null;
        View viewInflate = p9r.m171370a(viewTreeObserverOnGlobalLayoutListenerC8017b.act()).inflate(kec0.f125935lc, (ViewGroup) null);
        VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(adc0.f70042O);
        VImage vImage = (VImage) viewInflate.findViewById(adc0.f70269b9);
        VText vText = (VText) viewInflate.findViewById(adc0.f70409je);
        VText vText2 = (VText) viewInflate.findViewById(adc0.f70273bd);
        VLinear vLinear = (VLinear) viewInflate.findViewById(adc0.f69992L0);
        VText vText3 = (VText) viewInflate.findViewById(adc0.f70551s3);
        VText vText4 = (VText) viewInflate.findViewById(adc0.f70124Sd);
        VImage vImage2 = (VImage) viewInflate.findViewById(adc0.f69806A1);
        final SimplePushBubble simplePushBubbleM22168s = new SimplePushBubble.C4523a(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), viewInflate).m22163B(2).m22162A(gra.m131768x() ? 3 : 2).m22174y(new RelativeLayout.LayoutParams(-1, qa00.m175859d(72.0f))).m22172w(actionToastStyle2.showTime).m22175z(CorePopLevel.SEE_TOAST).m22167F(new C21496a(actionToastStyle2, actionData)).m22168s();
        simplePushBubbleM22168s.m146060s(new C21497b(actionToastStyle2));
        simplePushBubbleM22168s.m146058q(new C21498c(actionData));
        bnl0.m105509E0(viewInflate, new ViewOnClickListenerC21499d(actionToastStyle2, viewTreeObserverOnGlobalLayoutListenerC8017b, actionData, simplePushBubbleM22168s));
        if (!TextUtils.isEmpty(actionToastStyle2.mainImg)) {
            uqb0.f180374G.m127119N0(vDraweeView, actionToastStyle2.mainImg, false);
        }
        bnl0.m105524M(vImage, TextUtils.equals(actionToastStyle2.icons.miniIcon, "online"));
        vText.setTypeface(Typeface.defaultFromStyle(1));
        vText.setText(actionToastStyle2.title);
        vText2.setText(actionToastStyle2.message);
        List<ActionToastStyleButton> list2 = actionToastStyle2.buttons;
        if (jyb.m147479J(list2)) {
            y2h0Var = this;
            actionData2 = actionData;
            bnl0.m105524M(vLinear, false);
        } else {
            ActionToastStyleButton actionToastStyleButton = list2.get(0);
            bnl0.m105524M(vLinear, actionToastStyleButton.showButton);
            y2h0Var = this;
            actionData2 = actionData;
            bnl0.m105509E0(vLinear, y2h0Var.new ViewOnClickListenerC21500e(viewTreeObserverOnGlobalLayoutListenerC8017b, actionToastStyleButton, actionToastStyle2, actionData, simplePushBubbleM22168s));
            pf60<String, String> pf60VarM214082m = m214082m(actionToastStyleButton.buttonMessage);
            String str = pf60VarM214082m.f152156a;
            String str2 = pf60VarM214082m.f152157b;
            if (TextUtils.isEmpty(str)) {
                actionToastStyle2 = actionToastStyle2;
                simplePushBubbleM22168s = simplePushBubbleM22168s;
                bnl0.m105524M(vText3, false);
            } else {
                actionToastStyle2 = actionToastStyle2;
                simplePushBubbleM22168s = simplePushBubbleM22168s;
                vText3.setText(pf60VarM214082m.f152156a);
                bnl0.m105524M(vText3, true);
            }
            vText4.setText(str2);
            vText4.setTypeface(Typeface.defaultFromStyle(1));
            if (TextUtils.equals(actionToastStyleButton.buttonBackground, LiveVoiceInternalEntryBean.TYPE_BG_STYLE_ORANGE)) {
                vLinear.setBackground(viewTreeObserverOnGlobalLayoutListenerC8017b.act().getDrawable(dbc0.f86997fo));
                vText4.setTextColor(Color.parseColor("#FFFFFF"));
            } else {
                vLinear.setBackground(viewTreeObserverOnGlobalLayoutListenerC8017b.act().getDrawable(dbc0.f87030go));
                vText4.setTextColor(Color.parseColor("#4D000000"));
            }
        }
        bnl0.m105524M(vImage2, actionToastStyle2.showClose);
        bnl0.m105509E0(vImage2, y2h0Var.new ViewOnClickListenerC21501f(actionData2, simplePushBubbleM22168s));
        tu2.m192703a("[See_Toast]", "start show by post" + actionData2.traceId);
        l51.m152886F(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), new Runnable() { // from class: l.x2h0
            @Override // java.lang.Runnable
            public final void run() {
                this.f192148a.m214085i(actionData2, simplePushBubbleM22168s);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public void m214088l(final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b, ActionToast actionToast) {
        if (viewTreeObserverOnGlobalLayoutListenerC8017b == null || TextUtils.isEmpty(actionToast.message)) {
            return;
        }
        String str = actionToast.message;
        String str2 = actionToast.mainImg;
        boolean z = actionToast.loveImg;
        final String str3 = actionToast.option.link;
        View viewInflate = p9r.m171370a(viewTreeObserverOnGlobalLayoutListenerC8017b.act()).inflate(kec0.f125918kc, (ViewGroup) null);
        if (!TextUtils.isEmpty(str3)) {
            bnl0.m105509E0(viewInflate, new View.OnClickListener() { // from class: l.v2h0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    nae0.m162083m(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), Uri.parse(str3));
                }
            });
        }
        ((TextView) viewInflate.findViewById(adc0.f70409je)).setText(str);
        View viewFindViewById = viewInflate.findViewById(adc0.f70385i6);
        if (!TextUtils.isEmpty(str2) || z) {
            bnl0.m105524M(viewFindViewById, true);
            if (TextUtils.isEmpty(str2)) {
                bnl0.m105524M((VDraweeView) viewFindViewById.findViewById(adc0.f70509pc), false);
            } else {
                uqb0.f180374G.m127119N0((VDraweeView) viewFindViewById.findViewById(adc0.f70042O), str2, false);
            }
        } else {
            bnl0.m105524M(viewFindViewById, false);
        }
        final SimplePushBubble simplePushBubbleM22168s = new SimplePushBubble.C4523a(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), viewInflate).m22172w(5000).m22168s();
        simplePushBubbleM22168s.m126745x(CorePopLevel.SUGGEST_SHOW_PUSH);
        l51.m152888H(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), new Runnable() { // from class: l.w2h0
            @Override // java.lang.Runnable
            public final void run() {
                llb0.m154703c().m154710i(simplePushBubbleM22168s);
            }
        }, 400L);
    }
}
