package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.p048ui.poplevel.C4371a;
import com.p046p1.mobile.android.p048ui.poplevel.PopAction;
import com.p046p1.mobile.android.p048ui.pushbubble.SimplePushBubble;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ActionData;
import com.p046p1.mobile.putong.core.data.ActionToast;
import com.p046p1.mobile.putong.core.data.ActionToastStyle;
import com.p046p1.mobile.putong.core.data.ActionToastStyleButton;
import com.p046p1.mobile.putong.core.data.SuggesterReason;
import com.p046p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC7866b;
import com.p046p1.mobile.putong.core.p053ui.notifications.SysnotifListener;
import com.p046p1.mobile.putong.core.p053ui.poplevel.CorePopLevel;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.entry.LiveVoiceInternalEntryBean;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class qug0 {

    /* JADX INFO: renamed from: c */
    public static volatile qug0 f156484c;

    /* JADX INFO: renamed from: a */
    public ActionData f156485a;

    /* JADX INFO: renamed from: b */
    public boolean f156486b;

    /* JADX INFO: renamed from: l.qug0$a */
    public class C19583a implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ActionToastStyle f156487a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ActionData f156488b;

        public C19583a(ActionToastStyle actionToastStyle, ActionData actionData) {
            this.f156487a = actionToastStyle;
            this.f156488b = actionData;
        }

        @Override // p149l.d30
        public void call() {
            if (!NullChecker.m81303a(this.f156487a) || vwb.m200296J(this.f156487a.buttons)) {
                return;
            }
            qug0.this.m176613d("upClose", true, null, this.f156488b);
            zvf0.m220401w("e_friends_online_popup", "p_suggest_users_home_view", vwb.m200311Y("popup_page", qug0.m176609f()), vwb.m200311Y("button_text", this.f156487a.buttons.get(0).buttonMessage), vwb.m200311Y("from_female_id", this.f156487a.localReportId), vwb.m200311Y("business", this.f156487a.business), vwb.m200311Y("popup_title", this.f156487a.title), vwb.m200311Y("popup_subtitle", this.f156487a.message), vwb.m200311Y("other_user_id", this.f156487a.localReportId));
            C4371a.m21100p().m21119o(CorePopLevel.SEE_TOAST.getOnlyName(), PopAction.USER_CLOSE);
        }
    }

    /* JADX INFO: renamed from: l.qug0$b */
    public class C19584b implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ActionToastStyle f156490a;

        public C19584b(ActionToastStyle actionToastStyle) {
            this.f156490a = actionToastStyle;
        }

        @Override // p149l.d30
        public void call() {
            if (vwb.m200296J(this.f156490a.buttons)) {
                return;
            }
            zvf0.m220368A("e_friends_online_popup", "p_suggest_users_home_view", vwb.m200311Y("popup_page", qug0.m176609f()), vwb.m200311Y("button_text", this.f156490a.buttons.get(0).buttonMessage), vwb.m200311Y("has_close_button", Boolean.valueOf(this.f156490a.showClose)), vwb.m200311Y("from_female_id", this.f156490a.localReportId), vwb.m200311Y("business", this.f156490a.business), vwb.m200311Y("area_link", this.f156490a.toastLink), vwb.m200311Y("popup_title", this.f156490a.title), vwb.m200311Y("popup_subtitle", this.f156490a.message), vwb.m200311Y("other_user_id", this.f156490a.localReportId));
            if (upa.m194837x()) {
                return;
            }
            zch0.m218024a().m218034k(true);
        }
    }

    /* JADX INFO: renamed from: l.qug0$c */
    public class C19585c implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ActionData f156492a;

        public C19585c(ActionData actionData) {
            this.f156492a = actionData;
        }

        @Override // p149l.d30
        public void call() {
            qug0.this.m176613d(SysnotifListener.ACTION_DISMISS, true, null, this.f156492a);
            if (upa.m194837x()) {
                return;
            }
            zch0.m218024a().m218034k(false);
        }
    }

    /* JADX INFO: renamed from: l.qug0$d */
    public class ViewOnClickListenerC19586d implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ActionToastStyle f156494a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC7866b f156495b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ActionData f156496c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ SimplePushBubble f156497d;

        public ViewOnClickListenerC19586d(ActionToastStyle actionToastStyle, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b, ActionData actionData, SimplePushBubble simplePushBubble) {
            this.f156494a = actionToastStyle;
            this.f156495b = viewTreeObserverOnGlobalLayoutListenerC7866b;
            this.f156496c = actionData;
            this.f156497d = simplePushBubble;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!TextUtils.isEmpty(this.f156494a.toastLink) && NullChecker.m81303a(this.f156495b.act())) {
                if (!TextUtils.isEmpty(new w2e0.C20787a(this.f156495b.act(), Uri.parse(this.f156494a.toastLink).toString()).m201103d().m201096d())) {
                    lva.m151843D(this.f156495b.act(), Uri.parse(this.f156494a.toastLink));
                    qug0.this.m176613d("tapPop", true, null, this.f156496c);
                    this.f156497d.m21135I();
                }
                zvf0.m220399u("e_friends_online_popup", "p_suggest_users_home_view", vwb.m200311Y("popup_page", qug0.m176609f()), vwb.m200311Y("button_text", vwb.m200296J(this.f156494a.buttons) ? "" : this.f156494a.buttons.get(0).buttonMessage), vwb.m200311Y("area_link", this.f156494a.toastLink), vwb.m200311Y("from_female_id", this.f156494a.localReportId), vwb.m200311Y("business", this.f156494a.business), vwb.m200311Y("popup_title", this.f156494a.title), vwb.m200311Y("popup_subtitle", this.f156494a.message), vwb.m200311Y("other_user_id", this.f156494a.localReportId));
                C4371a.m21100p().m21119o(CorePopLevel.SEE_TOAST.getOnlyName(), PopAction.OTHER_ACTION);
            }
        }
    }

    /* JADX INFO: renamed from: l.qug0$e */
    public class ViewOnClickListenerC19587e implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC7866b f156499a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ActionToastStyleButton f156500b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ActionToastStyle f156501c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ ActionData f156502d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ SimplePushBubble f156503e;

        public ViewOnClickListenerC19587e(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b, ActionToastStyleButton actionToastStyleButton, ActionToastStyle actionToastStyle, ActionData actionData, SimplePushBubble simplePushBubble) {
            this.f156499a = viewTreeObserverOnGlobalLayoutListenerC7866b;
            this.f156500b = actionToastStyleButton;
            this.f156501c = actionToastStyle;
            this.f156502d = actionData;
            this.f156503e = simplePushBubble;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (NullChecker.m81303a(this.f156499a.act())) {
                lva.m151843D(this.f156499a.act(), Uri.parse(this.f156500b.buttonLink));
                zvf0.m220399u("e_friends_online_button_click", "p_suggest_users_home_view", vwb.m200311Y("popup_page", qug0.m176609f()), vwb.m200311Y("button_text", this.f156501c.buttons.get(0).buttonMessage), vwb.m200311Y("has_close_button", Boolean.valueOf(this.f156501c.showClose)), vwb.m200311Y("button_link", new w2e0.C20787a(this.f156499a.act(), Uri.parse(this.f156500b.buttonLink).toString()).m201103d().m201096d()), vwb.m200311Y("business", this.f156501c.business), vwb.m200311Y("other_user_id", this.f156501c.localReportId));
                C4371a.m21100p().m21119o(CorePopLevel.SEE_TOAST.getOnlyName(), PopAction.OTHER_ACTION);
            }
            qug0.this.m176613d("tapButton", true, null, this.f156502d);
            this.f156503e.m21135I();
        }
    }

    /* JADX INFO: renamed from: l.qug0$f */
    public class ViewOnClickListenerC19588f implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ActionData f156505a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ SimplePushBubble f156506b;

        public ViewOnClickListenerC19588f(ActionData actionData, SimplePushBubble simplePushBubble) {
            this.f156505a = actionData;
            this.f156506b = simplePushBubble;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            qug0.this.m176613d("close", true, null, this.f156505a);
            zvf0.m220396r("e_friends_online_popup_close", "p_suggest_users_home_view");
            this.f156506b.m21135I();
            C4371a.m21100p().m21119o(CorePopLevel.SEE_TOAST.getOnlyName(), PopAction.USER_CLOSE);
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m176609f() {
        if (v930.m197534h() == TabName.Card) {
            return "swipe";
        }
        if (v930.m197534h() == TabName.Live) {
            return "live";
        }
        if (v930.m197534h() == TabName.Moment) {
            return "find";
        }
        if (v930.m197534h() == TabName.Msg) {
            return "message";
        }
        if (v930.m197534h() == TabName.Me) {
            return "my";
        }
        TabName tabNameM197534h = v930.m197534h();
        return tabNameM197534h == null ? "other" : tabNameM197534h.name();
    }

    /* JADX INFO: renamed from: g */
    public static qug0 m176610g() {
        if (f156484c == null) {
            synchronized (qug0.class) {
                try {
                    if (f156484c == null) {
                        f156484c = new qug0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f156484c;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m176611h(List<String> list) {
        if (list.contains("swipe") && v930.m197534h() == TabName.Card) {
            return true;
        }
        if (list.contains("live") && v930.m197534h() == TabName.Live) {
            return true;
        }
        if (list.contains("find") && v930.m197534h() == TabName.Moment) {
            return true;
        }
        if (list.contains("message") && v930.m197534h() == TabName.Msg) {
            return true;
        }
        return list.contains("my") && v930.m197534h() == TabName.Me;
    }

    /* JADX INFO: renamed from: m */
    public static j760<String, String> m176612m(String str) {
        if (str == null) {
            return j760.m140076a("", "");
        }
        return (str.contains("[") && str.contains(Constants.AES_SUFFIX)) ? j760.m140076a(str.substring(str.indexOf(91), str.indexOf(93) + 1), str.substring(str.indexOf(93) + 1)) : j760.m140076a("", str);
    }

    /* JADX INFO: renamed from: d */
    public void m176613d(String str, boolean z, String str2, @NonNull ActionData actionData) {
        du2.m113670a("[See_Toast]", "feed back " + z + " , " + str2 + " , " + actionData.traceId + " , " + this.f156486b);
        if (this.f156486b) {
            return;
        }
        if (z) {
            this.f156486b = true;
        }
        User userMe_ = CoreModule.m29932K().me_();
        pib pibVar = CoreModule.f17545c.f19639e0;
        String str3 = userMe_ == null ? User.ID_TEAM_ACCOUNT : userMe_.f56011id;
        String strM176609f = m176609f();
        ActionToastStyle actionToastStyle = actionData.toastStyle;
        pibVar.m169485f7(str3, str, z, str2, strM176609f, actionToastStyle.business, actionToastStyle.localReportId, actionData.traceId);
    }

    /* JADX INFO: renamed from: e */
    public ActionData m176614e() {
        return this.f156485a;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m176615i(ActionData actionData, SimplePushBubble simplePushBubble) {
        du2.m113670a("[See_Toast]", "start show in after post" + upa.m194837x() + " , " + actionData.traceId);
        if (zch0.m218024a().m218028e()) {
            if (upa.m194837x()) {
                this.f156485a = actionData;
                return;
            } else {
                m176613d(null, false, SuggesterReason.BOTTOM_WINDOW.getReason(), actionData);
                return;
            }
        }
        this.f156486b = false;
        du2.m113670a("[See_Toast]", "start show in manager" + actionData.traceId + " , " + simplePushBubble.hashCode());
        hdb0.m130575c().m130582i(simplePushBubble);
    }

    /* JADX INFO: renamed from: j */
    public void m176616j(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        m176617k(viewTreeObserverOnGlobalLayoutListenerC7866b, this.f156485a);
    }

    /* JADX INFO: renamed from: k */
    public void m176617k(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b, ActionData actionData) {
        ActionToastStyle actionToastStyle;
        final qug0 qug0Var;
        final ActionData actionData2;
        if (actionData == null || viewTreeObserverOnGlobalLayoutListenerC7866b == null || viewTreeObserverOnGlobalLayoutListenerC7866b.act() == null || (actionToastStyle = actionData.toastStyle) == null || TextUtils.isEmpty(actionToastStyle.title)) {
            du2.m113670a("[See_Toast]", "start show toast return by null : ");
            return;
        }
        ActionToastStyle actionToastStyle2 = actionData.toastStyle;
        if (!TextUtils.equals(actionToastStyle2.styleId, "1")) {
            du2.m113670a("[See_Toast]", "start show toast return by style");
            return;
        }
        List<String> list = actionToastStyle2.scenes;
        Act actM104962d = c30.m104962d();
        StringBuilder sb = new StringBuilder("start show toast current id: ");
        sb.append(actionData.traceId);
        sb.append(" act: ");
        sb.append(actM104962d == null ? "null" : actM104962d.getPopLifeName());
        du2.m113670a("[See_Toast]", sb.toString());
        if (NullChecker.m81303a(actM104962d) && !CoreModule.m29932K().isMainPage(actM104962d)) {
            if (upa.m194837x()) {
                this.f156485a = actionData;
                return;
            } else {
                m176613d(null, false, SuggesterReason.NO_HOME.getReason(), actionData);
                return;
            }
        }
        if (vwb.m200296J(list) || !m176611h(list)) {
            if (upa.m194837x()) {
                this.f156485a = actionData;
                return;
            } else {
                m176613d(null, false, SuggesterReason.SENCE.getReason(), actionData);
                return;
            }
        }
        this.f156485a = null;
        View viewInflate = o7r.m163037a(viewTreeObserverOnGlobalLayoutListenerC7866b.act()).inflate(f6c0.f95763ec, (ViewGroup) null);
        VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(u4c0.f173954O);
        VImage vImage = (VImage) viewInflate.findViewById(u4c0.f174144Z8);
        VText vText = (VText) viewInflate.findViewById(u4c0.f174268ge);
        VText vText2 = (VText) viewInflate.findViewById(u4c0.f174148Zc);
        VLinear vLinear = (VLinear) viewInflate.findViewById(u4c0.f173904L0);
        VText vText3 = (VText) viewInflate.findViewById(u4c0.f174426q3);
        VText vText4 = (VText) viewInflate.findViewById(u4c0.f173985Pd);
        VImage vImage2 = (VImage) viewInflate.findViewById(u4c0.f173718A1);
        final SimplePushBubble simplePushBubbleM21169s = new SimplePushBubble.C4372a(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), viewInflate).m21164B(2).m21163A(upa.m194837x() ? 3 : 2).m21175y(new RelativeLayout.LayoutParams(-1, t100.m186890d(72.0f))).m21173w(actionToastStyle2.showTime).m21176z(CorePopLevel.SEE_TOAST).m21168F(new C19583a(actionToastStyle2, actionData)).m21169s();
        simplePushBubbleM21169s.m120965s(new C19584b(actionToastStyle2));
        simplePushBubbleM21169s.m120963q(new C19585c(actionData));
        xdl0.m208329E0(viewInflate, new ViewOnClickListenerC19586d(actionToastStyle2, viewTreeObserverOnGlobalLayoutListenerC7866b, actionData, simplePushBubbleM21169s));
        if (!TextUtils.isEmpty(actionToastStyle2.mainImg)) {
            qib0.f154691G.m102335N0(vDraweeView, actionToastStyle2.mainImg, false);
        }
        xdl0.m208344M(vImage, TextUtils.equals(actionToastStyle2.icons.miniIcon, "online"));
        vText.setTypeface(Typeface.defaultFromStyle(1));
        vText.setText(actionToastStyle2.title);
        vText2.setText(actionToastStyle2.message);
        List<ActionToastStyleButton> list2 = actionToastStyle2.buttons;
        if (vwb.m200296J(list2)) {
            qug0Var = this;
            actionData2 = actionData;
            xdl0.m208344M(vLinear, false);
        } else {
            ActionToastStyleButton actionToastStyleButton = list2.get(0);
            xdl0.m208344M(vLinear, actionToastStyleButton.showButton);
            qug0Var = this;
            actionData2 = actionData;
            xdl0.m208329E0(vLinear, qug0Var.new ViewOnClickListenerC19587e(viewTreeObserverOnGlobalLayoutListenerC7866b, actionToastStyleButton, actionToastStyle2, actionData, simplePushBubbleM21169s));
            j760<String, String> j760VarM176612m = m176612m(actionToastStyleButton.buttonMessage);
            String str = j760VarM176612m.f116564a;
            String str2 = j760VarM176612m.f116565b;
            if (TextUtils.isEmpty(str)) {
                actionToastStyle2 = actionToastStyle2;
                simplePushBubbleM21169s = simplePushBubbleM21169s;
                xdl0.m208344M(vText3, false);
            } else {
                actionToastStyle2 = actionToastStyle2;
                simplePushBubbleM21169s = simplePushBubbleM21169s;
                vText3.setText(j760VarM176612m.f116564a);
                xdl0.m208344M(vText3, true);
            }
            vText4.setText(str2);
            vText4.setTypeface(Typeface.defaultFromStyle(1));
            if (TextUtils.equals(actionToastStyleButton.buttonBackground, LiveVoiceInternalEntryBean.TYPE_BG_STYLE_ORANGE)) {
                vLinear.setBackground(viewTreeObserverOnGlobalLayoutListenerC7866b.act().getDrawable(x2c0.f190498qn));
                vText4.setTextColor(Color.parseColor("#FFFFFF"));
            } else {
                vLinear.setBackground(viewTreeObserverOnGlobalLayoutListenerC7866b.act().getDrawable(x2c0.f190530rn));
                vText4.setTextColor(Color.parseColor("#4D000000"));
            }
        }
        xdl0.m208344M(vImage2, actionToastStyle2.showClose);
        xdl0.m208329E0(vImage2, qug0Var.new ViewOnClickListenerC19588f(actionData2, simplePushBubbleM21169s));
        du2.m113670a("[See_Toast]", "start show by post" + actionData2.traceId);
        e51.m114741F(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), new Runnable() { // from class: l.pug0
            @Override // java.lang.Runnable
            public final void run() {
                this.f151290a.m176615i(actionData2, simplePushBubbleM21169s);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public void m176618l(final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b, ActionToast actionToast) {
        if (viewTreeObserverOnGlobalLayoutListenerC7866b == null || TextUtils.isEmpty(actionToast.message)) {
            return;
        }
        String str = actionToast.message;
        String str2 = actionToast.mainImg;
        boolean z = actionToast.loveImg;
        final String str3 = actionToast.option.link;
        View viewInflate = o7r.m163037a(viewTreeObserverOnGlobalLayoutListenerC7866b.act()).inflate(f6c0.f95746dc, (ViewGroup) null);
        if (!TextUtils.isEmpty(str3)) {
            xdl0.m208329E0(viewInflate, new View.OnClickListener() { // from class: l.nug0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    j2e0.m139446m(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), Uri.parse(str3));
                }
            });
        }
        ((TextView) viewInflate.findViewById(u4c0.f174268ge)).setText(str);
        View viewFindViewById = viewInflate.findViewById(u4c0.f174260g6);
        if (!TextUtils.isEmpty(str2) || z) {
            xdl0.m208344M(viewFindViewById, true);
            if (TextUtils.isEmpty(str2)) {
                xdl0.m208344M((VDraweeView) viewFindViewById.findViewById(u4c0.f174384nc), false);
            } else {
                qib0.f154691G.m102335N0((VDraweeView) viewFindViewById.findViewById(u4c0.f173954O), str2, false);
            }
        } else {
            xdl0.m208344M(viewFindViewById, false);
        }
        final SimplePushBubble simplePushBubbleM21169s = new SimplePushBubble.C4372a(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), viewInflate).m21173w(5000).m21169s();
        simplePushBubbleM21169s.m96808x(CorePopLevel.SUGGEST_SHOW_PUSH);
        e51.m114743H(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), new Runnable() { // from class: l.oug0
            @Override // java.lang.Runnable
            public final void run() {
                hdb0.m130575c().m130582i(simplePushBubbleM21169s);
            }
        }, 400L);
    }
}
