package com.p046p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.CoreMomentInfo;
import com.p046p1.mobile.putong.core.p053ui.greet.C8360d;
import com.p046p1.mobile.putong.core.p053ui.vip.widget.LetterRemainingSwitcherView;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.RecommendMessage;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.c4g0;
import p149l.dol;
import p149l.e30;
import p149l.eol;
import p149l.mkd0;
import p149l.o6j0;
import p149l.q860;
import p149l.qib0;
import p149l.t100;
import p149l.vwb;
import p149l.w9j;
import p149l.x2c0;
import p149l.xdl0;
import p149l.yh4;

/* JADX INFO: loaded from: classes11.dex */
public class CardBottomMomentGreetView extends VLinear implements eol {

    /* JADX INFO: renamed from: c */
    public CardBottomBaseInfoView f23543c;

    /* JADX INFO: renamed from: d */
    public VLinear f23544d;

    /* JADX INFO: renamed from: e */
    public CardUserContentView f23545e;

    /* JADX INFO: renamed from: f */
    public VLinear f23546f;

    /* JADX INFO: renamed from: g */
    public VFrame f23547g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f23548h;

    /* JADX INFO: renamed from: i */
    public VImage f23549i;

    /* JADX INFO: renamed from: j */
    public VText f23550j;

    /* JADX INFO: renamed from: k */
    public VText f23551k;

    /* JADX INFO: renamed from: l */
    public LetterRemainingSwitcherView f23552l;

    /* JADX INFO: renamed from: m */
    public VText f23553m;

    /* JADX INFO: renamed from: n */
    public User f23554n;

    /* JADX INFO: renamed from: o */
    public CoreMomentInfo f23555o;

    /* JADX INFO: renamed from: p */
    public c4g0 f23556p;

    public CardBottomMomentGreetView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m38943W(View view) {
        o6j0.m162859c("e_send_message", "p_suggest_users_home_view", o6j0.C18854a.m162878h("is_reply", "0"), o6j0.C18854a.m162878h("moment_id", NullChecker.m81303a(this.f23555o) ? this.f23555o.f56008id : ""), o6j0.C18854a.m162878h("is_input", "0"), o6j0.C18854a.m162878h("is_match", "0"), o6j0.C18854a.m162878h("owner_id", this.f23554n.f56011id), o6j0.C18854a.m162878h("state_id", ""));
        String str = NullChecker.m81303a(this.f23555o) ? this.f23555o.f56008id : "";
        C8360d.a aVar = new C8360d.a(this.f23554n.f56011id, "card");
        aVar.m45917n(str);
        aVar.m45918o("p_home,greet");
        C8360d.m45892a((Act) getContext(), aVar);
    }

    /* JADX INFO: renamed from: V */
    public final void m38944V(View view) {
        yh4.m214786a(this, view);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m38945X(dol dolVar, View view, q860 q860Var) {
        List<T> list = q860Var.f153135a;
        User user = this.f23554n;
        if (user == null || !TextUtils.equals(user.f56011id, dolVar.getUser().f56011id)) {
            o6j0.m162864h("e_send_message", "p_suggest_users_home_view", o6j0.C18854a.m162878h("is_reply", "0"), o6j0.C18854a.m162878h("moment_id", !vwb.m200296J(list) ? ((CoreMomentInfo) list.get(0)).f56008id : ""), o6j0.C18854a.m162878h("is_input", "0"), o6j0.C18854a.m162878h("is_match", "0"), o6j0.C18854a.m162878h("owner_id", dolVar.getUser().f56011id), o6j0.C18854a.m162878h("state_id", ""));
        }
        m38948a0(dolVar.getUser(), list);
        xdl0.m208384k0(view);
    }

    /* JADX INFO: renamed from: Y */
    public void m38946Y(final dol dolVar, final View view, Act act) {
        List<RecommendMessage> listM38949b0 = m38949b0(dolVar.getUserInfo().getRecommendMessage());
        if (vwb.m200296J(listM38949b0)) {
            mkd0.m154992z(this.f23556p);
            if (this.f23554n == null || !TextUtils.equals(dolVar.getUserInfo().f19472id, this.f23554n.f56011id)) {
                CoreModule.m29934N().coreMomentPrevious(dolVar.getUserInfo().f19472id);
            }
            this.f23556p = act.duringCreated(CoreModule.m29934N().coreMomentMoments(dolVar.getUserInfo().f19472id, CoreMomentInfo.JSON_ADAPTER)).subscribe(mkd0.m154955G(new e30() { // from class: l.vh4
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f181468a.m38945X(dolVar, view, (q860) obj);
                }
            }));
            return;
        }
        User user = this.f23554n;
        if (user == null || !TextUtils.equals(user.f56011id, dolVar.getUser().f56011id)) {
            o6j0.m162864h("e_send_message", "p_suggest_users_home_view", o6j0.C18854a.m162878h("is_reply", "1"), o6j0.C18854a.m162878h("moment_id", ""), o6j0.C18854a.m162878h("is_input", "0"), o6j0.C18854a.m162878h("is_match", "0"), o6j0.C18854a.m162878h("owner_id", CoreModule.m29931H().userId()), o6j0.C18854a.m162878h("state_id", ""));
        }
        m38947Z(dolVar.getUser(), listM38949b0);
        this.f23552l.post(new Runnable() { // from class: l.uh4
            @Override // java.lang.Runnable
            public final void run() {
                xdl0.m208384k0(view);
            }
        });
    }

    /* JADX INFO: renamed from: Z */
    public final void m38947Z(User user, List<RecommendMessage> list) {
        this.f23554n = user;
        xdl0.m208344M(this.f23547g, false);
        xdl0.m208344M(this.f23550j, true);
        xdl0.m208344M(this.f23551k, false);
        xdl0.m208344M(this.f23552l, true);
        xdl0.m208344M(this.f23553m, false);
        this.f23550j.setCompoundDrawablesWithIntrinsicBounds(x2c0.f190291k8, 0, 0, 0);
        if (NullChecker.m81303a(user)) {
            boolean zIsFemale = user.isFemale();
            VText vText = this.f23550j;
            if (zIsFemale) {
                vText.setText(CoreModule.f17544b.getString(R$string.f18201V4));
            } else {
                vText.setText(CoreModule.f17544b.getString(R$string.f18261X4));
            }
        }
        this.f23552l.m57726i();
        this.f23552l.setTextList(vwb.m200303Q(list, new w9j() { // from class: l.wh4
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((RecommendMessage) obj).messageValue;
            }
        }));
        this.f23552l.m57724g(500L, true, 150L);
        this.f23552l.m57725h();
    }

    /* JADX INFO: renamed from: a0 */
    public final void m38948a0(User user, List<CoreMomentInfo> list) {
        long j;
        this.f23554n = user;
        xdl0.m208344M(this.f23552l, false);
        xdl0.m208344M(this.f23553m, true);
        this.f23550j.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        String str = user.isFemale() ? "她" : "他";
        if (vwb.m200296J(list)) {
            xdl0.m208344M(this.f23547g, false);
            xdl0.m208344M(this.f23550j, false);
            xdl0.m208344M(this.f23551k, true);
            xdl0.m208370d0(this.f23546f, t100.m186890d(20.0f));
            try {
                j = Long.parseLong(user.f56011id);
            } catch (Exception unused) {
                j = 0;
            }
            long j2 = j % 2;
            VText vText = this.f23551k;
            if (j2 == 0) {
                vText.setText(String.format("%1$s很受欢迎，和%2$s聊一聊兴趣爱好更容易收到回复", str, str));
            } else {
                vText.setText(String.format("跟%1$s认真介绍一下自己，让%2$s更了解你", str, str));
            }
        } else {
            this.f23555o = list.get(0);
            if (vwb.m200296J(list.get(0).media) || !NullChecker.m81303a(list.get(0).media.get(0).cover())) {
                xdl0.m208344M(this.f23547g, false);
                xdl0.m208370d0(this.f23546f, t100.m186890d(20.0f));
            } else {
                Media media = list.get(0).media.get(0);
                xdl0.m208344M(this.f23547g, true);
                xdl0.m208344M(this.f23549i, media instanceof Video);
                qib0.f154691G.m102341Q0(this.f23548h, media.cover().profileSmall());
                xdl0.m208370d0(this.f23546f, t100.m186890d(10.0f));
            }
            xdl0.m208344M(this.f23550j, true);
            boolean zIsFemale = user.isFemale();
            VText vText2 = this.f23550j;
            if (zIsFemale) {
                vText2.setText(R$string.f18171U4);
            } else {
                vText2.setText(R$string.f18231W4);
            }
            this.f23551k.setText(list.get(0).value);
            xdl0.m208344M(this.f23551k, !TextUtils.isEmpty(list.get(0).value));
        }
        this.f23551k.setMaxLines(xdl0.m208349O0(this.f23550j) ? 1 : 2);
        if (xdl0.m208349O0(this.f23550j) && xdl0.m208349O0(this.f23551k)) {
            xdl0.m208360X(this.f23551k, t100.m186890d(5.5f));
        } else {
            xdl0.m208360X(this.f23551k, 0);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final List<RecommendMessage> m38949b0(List<RecommendMessage> list) {
        return vwb.m200339n(list, new w9j() { // from class: l.xh4
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((RecommendMessage) obj).messageType, "text"));
            }
        });
    }

    public CardBottomBaseInfoView getBaseInfoLayout() {
        return this.f23543c;
    }

    @Override // p149l.eol
    public CardUserContentView getUserContentLayout() {
        return this.f23545e;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m38944V(this);
        this.f23552l.setAnimateDirection(false);
        this.f23552l.setTextGravity(19);
        xdl0.m208329E0(this.f23553m, new View.OnClickListener() { // from class: l.th4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f170200a.m38943W(view);
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
