package com.p051p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.CoreMomentInfo;
import com.p051p1.mobile.putong.core.p058ui.greet.C8523d;
import com.p051p1.mobile.putong.core.p058ui.vip.widget.LetterRemainingSwitcherView;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.RecommendMessage;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.dbc0;
import p153l.jyb;
import p153l.kcg0;
import p153l.oql;
import p153l.pql;
import p153l.psd0;
import p153l.qa00;
import p153l.qcj;
import p153l.sfj0;
import p153l.uqb0;
import p153l.vg60;
import p153l.xi4;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class CardBottomMomentGreetView extends VLinear implements pql {

    /* JADX INFO: renamed from: c */
    public CardBottomBaseInfoView f24285c;

    /* JADX INFO: renamed from: d */
    public VLinear f24286d;

    /* JADX INFO: renamed from: e */
    public CardUserContentView f24287e;

    /* JADX INFO: renamed from: f */
    public VLinear f24288f;

    /* JADX INFO: renamed from: g */
    public VFrame f24289g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f24290h;

    /* JADX INFO: renamed from: i */
    public VImage f24291i;

    /* JADX INFO: renamed from: j */
    public VText f24292j;

    /* JADX INFO: renamed from: k */
    public VText f24293k;

    /* JADX INFO: renamed from: l */
    public LetterRemainingSwitcherView f24294l;

    /* JADX INFO: renamed from: m */
    public VText f24295m;

    /* JADX INFO: renamed from: n */
    public User f24296n;

    /* JADX INFO: renamed from: o */
    public CoreMomentInfo f24297o;

    /* JADX INFO: renamed from: p */
    public kcg0 f24298p;

    public CardBottomMomentGreetView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m39946W(View view) {
        sfj0.m185596c("e_send_message", "p_suggest_users_home_view", sfj0.C20032a.m185615h("is_reply", "0"), sfj0.C20032a.m185615h("moment_id", NullChecker.m82486a(this.f24297o) ? this.f24297o.f56856id : ""), sfj0.C20032a.m185615h("is_input", "0"), sfj0.C20032a.m185615h("is_match", "0"), sfj0.C20032a.m185615h("owner_id", this.f24296n.f56859id), sfj0.C20032a.m185615h("state_id", ""));
        String str = NullChecker.m82486a(this.f24297o) ? this.f24297o.f56856id : "";
        C8523d.a aVar = new C8523d.a(this.f24296n.f56859id, "card");
        aVar.m47100n(str);
        aVar.m47101o("p_home,greet");
        C8523d.m47075a((Act) getContext(), aVar);
    }

    /* JADX INFO: renamed from: V */
    public final void m39947V(View view) {
        xi4.m211095a(this, view);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m39948X(oql oqlVar, View view, vg60 vg60Var) {
        List<T> list = vg60Var.f184001a;
        User user = this.f24296n;
        if (user == null || !TextUtils.equals(user.f56859id, oqlVar.getUser().f56859id)) {
            sfj0.m185601h("e_send_message", "p_suggest_users_home_view", sfj0.C20032a.m185615h("is_reply", "0"), sfj0.C20032a.m185615h("moment_id", !jyb.m147479J(list) ? ((CoreMomentInfo) list.get(0)).f56856id : ""), sfj0.C20032a.m185615h("is_input", "0"), sfj0.C20032a.m185615h("is_match", "0"), sfj0.C20032a.m185615h("owner_id", oqlVar.getUser().f56859id), sfj0.C20032a.m185615h("state_id", ""));
        }
        m39951a0(oqlVar.getUser(), list);
        bnl0.m105564k0(view);
    }

    /* JADX INFO: renamed from: Y */
    public void m39949Y(final oql oqlVar, final View view, Act act) {
        List<RecommendMessage> listM39952b0 = m39952b0(oqlVar.getUserInfo().getRecommendMessage());
        if (jyb.m147479J(listM39952b0)) {
            psd0.m173633z(this.f24298p);
            if (this.f24296n == null || !TextUtils.equals(oqlVar.getUserInfo().f20214id, this.f24296n.f56859id)) {
                CoreModule.m30932N().coreMomentPrevious(oqlVar.getUserInfo().f20214id);
            }
            this.f24298p = act.duringCreated(CoreModule.m30932N().coreMomentMoments(oqlVar.getUserInfo().f20214id, CoreMomentInfo.JSON_ADAPTER)).subscribe(psd0.m173596G(new y20() { // from class: l.ui4
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f179076a.m39948X(oqlVar, view, (vg60) obj);
                }
            }));
            return;
        }
        User user = this.f24296n;
        if (user == null || !TextUtils.equals(user.f56859id, oqlVar.getUser().f56859id)) {
            sfj0.m185601h("e_send_message", "p_suggest_users_home_view", sfj0.C20032a.m185615h("is_reply", "1"), sfj0.C20032a.m185615h("moment_id", ""), sfj0.C20032a.m185615h("is_input", "0"), sfj0.C20032a.m185615h("is_match", "0"), sfj0.C20032a.m185615h("owner_id", CoreModule.m30929H().userId()), sfj0.C20032a.m185615h("state_id", ""));
        }
        m39950Z(oqlVar.getUser(), listM39952b0);
        this.f24294l.post(new Runnable() { // from class: l.ti4
            @Override // java.lang.Runnable
            public final void run() {
                bnl0.m105564k0(view);
            }
        });
    }

    /* JADX INFO: renamed from: Z */
    public final void m39950Z(User user, List<RecommendMessage> list) {
        this.f24296n = user;
        bnl0.m105524M(this.f24289g, false);
        bnl0.m105524M(this.f24292j, true);
        bnl0.m105524M(this.f24293k, false);
        bnl0.m105524M(this.f24294l, true);
        bnl0.m105524M(this.f24295m, false);
        this.f24292j.setCompoundDrawablesWithIntrinsicBounds(dbc0.f87177l8, 0, 0, 0);
        if (NullChecker.m82486a(user)) {
            boolean zIsFemale = user.isFemale();
            VText vText = this.f24292j;
            if (zIsFemale) {
                vText.setText(CoreModule.f18263b.getString(R$string.f18991X4));
            } else {
                vText.setText(CoreModule.f18263b.getString(R$string.f19051Z4));
            }
        }
        this.f24294l.m58909i();
        this.f24294l.setTextList(jyb.m147486Q(list, new qcj() { // from class: l.vi4
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((RecommendMessage) obj).messageValue;
            }
        }));
        this.f24294l.m58907g(500L, true, 150L);
        this.f24294l.m58908h();
    }

    /* JADX INFO: renamed from: a0 */
    public final void m39951a0(User user, List<CoreMomentInfo> list) {
        long j;
        this.f24296n = user;
        bnl0.m105524M(this.f24294l, false);
        bnl0.m105524M(this.f24295m, true);
        this.f24292j.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        String str = user.isFemale() ? "她" : "他";
        if (jyb.m147479J(list)) {
            bnl0.m105524M(this.f24289g, false);
            bnl0.m105524M(this.f24292j, false);
            bnl0.m105524M(this.f24293k, true);
            bnl0.m105550d0(this.f24288f, qa00.m175859d(20.0f));
            try {
                j = Long.parseLong(user.f56859id);
            } catch (Exception unused) {
                j = 0;
            }
            long j2 = j % 2;
            VText vText = this.f24293k;
            if (j2 == 0) {
                vText.setText(String.format("%1$s很受欢迎，和%2$s聊一聊兴趣爱好更容易收到回复", str, str));
            } else {
                vText.setText(String.format("跟%1$s认真介绍一下自己，让%2$s更了解你", str, str));
            }
        } else {
            this.f24297o = list.get(0);
            if (jyb.m147479J(list.get(0).media) || !NullChecker.m82486a(list.get(0).media.get(0).cover())) {
                bnl0.m105524M(this.f24289g, false);
                bnl0.m105550d0(this.f24288f, qa00.m175859d(20.0f));
            } else {
                Media media = list.get(0).media.get(0);
                bnl0.m105524M(this.f24289g, true);
                bnl0.m105524M(this.f24291i, media instanceof Video);
                uqb0.f180374G.m127125Q0(this.f24290h, media.cover().profileSmall());
                bnl0.m105550d0(this.f24288f, qa00.m175859d(10.0f));
            }
            bnl0.m105524M(this.f24292j, true);
            boolean zIsFemale = user.isFemale();
            VText vText2 = this.f24292j;
            if (zIsFemale) {
                vText2.setText(R$string.f18961W4);
            } else {
                vText2.setText(R$string.f19021Y4);
            }
            this.f24293k.setText(list.get(0).value);
            bnl0.m105524M(this.f24293k, !TextUtils.isEmpty(list.get(0).value));
        }
        this.f24293k.setMaxLines(bnl0.m105529O0(this.f24292j) ? 1 : 2);
        if (bnl0.m105529O0(this.f24292j) && bnl0.m105529O0(this.f24293k)) {
            bnl0.m105540X(this.f24293k, qa00.m175859d(5.5f));
        } else {
            bnl0.m105540X(this.f24293k, 0);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final List<RecommendMessage> m39952b0(List<RecommendMessage> list) {
        return jyb.m147522n(list, new qcj() { // from class: l.wi4
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((RecommendMessage) obj).messageType, "text"));
            }
        });
    }

    public CardBottomBaseInfoView getBaseInfoLayout() {
        return this.f24285c;
    }

    @Override // p153l.pql
    public CardUserContentView getUserContentLayout() {
        return this.f24287e;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39947V(this);
        this.f24294l.setAnimateDirection(false);
        this.f24294l.setTextGravity(19);
        bnl0.m105509E0(this.f24295m, new View.OnClickListener() { // from class: l.si4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f168793a.m39946W(view);
            }
        });
    }

    public CardBottomMomentGreetView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardBottomMomentGreetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
