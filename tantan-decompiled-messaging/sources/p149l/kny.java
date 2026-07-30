package p149l;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.p053ui.messages.MessageProfileSettingAct;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.messages.model.view.MessageActionBarLeftLayout;
import com.p046p1.mobile.putong.core.p053ui.view.GradientBgButton;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.MatchFrom;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;
import p147v.VIcon;
import p147v.VImage;
import p147v.VLinear;

/* JADX INFO: loaded from: classes3.dex */
public class kny extends yly<iny> {

    /* JADX INFO: renamed from: b */
    public MessagesAct f123931b;

    /* JADX INFO: renamed from: c */
    public iny f123932c;

    /* JADX INFO: renamed from: d */
    public User f123933d;

    /* JADX INFO: renamed from: e */
    public boolean f123934e = false;

    /* JADX INFO: renamed from: f */
    public boolean f123935f = false;

    /* JADX INFO: renamed from: g */
    public boolean f123936g = false;

    /* JADX INFO: renamed from: h */
    public boolean f123937h;

    public kny(MessagesAct messagesAct) {
        this.f123931b = messagesAct;
    }

    /* JADX INFO: renamed from: A */
    public void m146620A(knb0<User, Boolean, j760<Integer, Boolean>, Conversation> knb0Var) {
        this.f123933d = knb0Var.f123873a;
        Iterator<MessageActionBarLeftLayout> it = this.f198950a.iterator();
        while (it.hasNext()) {
            it.next().m49491l(this.f123931b, this.f123932c, knb0Var);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m146621B(j760<User, j760<Integer, Boolean>> j760Var) {
        Iterator<MessageActionBarLeftLayout> it = this.f198950a.iterator();
        while (it.hasNext()) {
            it.next().m49492m(j760Var, this.f123932c.mo137233k0());
        }
    }

    /* JADX INFO: renamed from: C */
    public void m146622C(User user) {
        Iterator<MessageActionBarLeftLayout> it = this.f198950a.iterator();
        while (it.hasNext()) {
            it.next().m49494o(this.f123931b, user);
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f123931b;
    }

    /* JADX INFO: renamed from: E */
    public void m146623E(xaj0<User, j760<Integer, Boolean>, Conversation> xaj0Var) {
        Iterator<MessageActionBarLeftLayout> it = this.f198950a.iterator();
        while (it.hasNext()) {
            it.next().m49495p(this.f123931b, xaj0Var, this.f123932c);
        }
    }

    /* JADX INFO: renamed from: F */
    public boolean m146624F(User user) {
        return false;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m146625G(View view) {
        MessagesAct messagesAct = this.f123931b;
        StringBuilder sb = new StringBuilder();
        sb.append(juk.m143323e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com");
        sb.append("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/dating-report/index.html?speed=true&_bid=1004397&hideNavigationBar=1&hideNotch=1&from=user&receive_report_user_id=");
        sb.append(this.f123931b.f31640f.mo120828r3());
        messagesAct.startActivity(MkWebViewAct.m80240e2(messagesAct, "", sb.toString(), true, true, true, true, null));
    }

    /* JADX INFO: renamed from: H */
    public void m146626H(String str) {
        Iterator<MessageActionBarLeftLayout> it = this.f198950a.iterator();
        while (it.hasNext()) {
            it.next().m49501v(str);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m146627I(BubbleInfo bubbleInfo) {
        if (!this.f123937h) {
            this.f123937h = true;
            o6j0.m162864h("e_other_state", OMSDialogPositon.p_chat_view, new o6j0.C18854a[0]);
        }
        Iterator<MessageActionBarLeftLayout> it = this.f198950a.iterator();
        while (it.hasNext()) {
            it.next().m49502w(bubbleInfo);
        }
    }

    /* JADX INFO: renamed from: J */
    public void m146628J(User user) {
        Iterator<MessageActionBarLeftLayout> it = this.f198950a.iterator();
        while (it.hasNext()) {
            it.next().m49504y(this.f123931b, this.f123932c, user);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m146629K() {
        Iterator<MessageActionBarLeftLayout> it = this.f198950a.iterator();
        while (it.hasNext()) {
            it.next().m49505z(this.f123933d);
        }
    }

    /* JADX INFO: renamed from: L */
    public void m146630L() {
        Iterator<MessageActionBarLeftLayout> it = this.f198950a.iterator();
        while (it.hasNext()) {
            it.next().m49483A(this.f123933d);
        }
    }

    /* JADX INFO: renamed from: M */
    public void m146631M(String str) {
        Iterator<MessageActionBarLeftLayout> it = this.f198950a.iterator();
        while (it.hasNext()) {
            it.next().m49484B(str);
        }
    }

    @Override // p149l.yly
    /* JADX INFO: renamed from: i */
    public void mo117244i() {
        super.mo117244i();
        Iterator<MessageActionBarLeftLayout> it = this.f198950a.iterator();
        while (it.hasNext()) {
            it.next().m49490k(this.f123933d, this.f123932c);
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p149l.yly
    /* JADX INFO: renamed from: j */
    public void mo146632j(GradientBgButton gradientBgButton, @NonNull VImage vImage, User user) {
        if (NullChecker.m81303a(user.localRelationship) && TEnum.equals(user.localRelationship.state, "matched") && user.localRelationship.status.contains(MatchFrom.get(MatchFrom.superLiked)) && CoreModule.m29935P().m94658i().mo158233G1()) {
            gradientBgButton.setVisibility(0);
            gradientBgButton.setBordersize(t100.m186890d(0.5f));
            gradientBgButton.setEmpty(false);
            gradientBgButton.setButtonColorAngle(0);
            gradientBgButton.setIcon(this.f123931b.drawable(c3c0.f78519F6));
            gradientBgButton.setButtonColorStart(Color.parseColor("#5bb6ff"));
            gradientBgButton.setButtonColorEnd(Color.parseColor("#2fcffc"));
            gradientBgButton.setBackgroundResource(0);
        } else if (NullChecker.m81303a(user.localRelationship) && TEnum.equals(user.localRelationship.state, "matched") && user.localRelationship.status.contains(MatchFrom.get("boosted")) && CoreModule.m29935P().m94658i().mo158233G1()) {
            gradientBgButton.setVisibility(0);
            gradientBgButton.setBordersize(t100.m186890d(0.5f));
            gradientBgButton.setEmpty(false);
            gradientBgButton.setButtonColorAngle(0);
            gradientBgButton.setIcon(this.f123931b.drawable(c3c0.f78718c7));
            gradientBgButton.setButtonColorStart(Color.parseColor("#ff8eaf"));
            gradientBgButton.setButtonColorEnd(Color.parseColor("#ea50c0"));
            gradientBgButton.setBackgroundResource(0);
        } else if (CoreModule.m29935P().m94658i().mo158291Q4(user.f56011id)) {
            gradientBgButton.setVisibility(0);
            gradientBgButton.setBordersize(t100.m186890d(0.5f));
            gradientBgButton.setEmpty(true);
            gradientBgButton.setButtonColorAngle(0);
            gradientBgButton.setBackgroundResource(c3c0.f78753g6);
        } else if (NullChecker.m81303a(user.localRelationship) && TEnum.equals(user.localRelationship.state, "matched") && user.localRelationship.status.contains(MatchFrom.get("letter"))) {
            gradientBgButton.setVisibility(0);
            gradientBgButton.setBordersize(t100.m186890d(0.5f));
            gradientBgButton.setEmpty(true);
            gradientBgButton.setButtonColorAngle(0);
            gradientBgButton.setBackgroundResource(c3c0.f78546I6);
        } else {
            Relationship relationship = user.localRelationship;
            if ((relationship == null || TEnum.equals(relationship.state, "default") || TEnum.equals(user.localRelationship.state, "unknown_")) && NullChecker.m81303a(user.localFollowship) && TEnum.equals(user.localFollowship.state, "matched")) {
                gradientBgButton.setVisibility(0);
                gradientBgButton.setBordersize(t100.m186890d(0.5f));
                gradientBgButton.setEmpty(false);
                gradientBgButton.setButtonColorAngle(0);
                gradientBgButton.setIcon(this.f123931b.drawable(c3c0.f78898w7));
                gradientBgButton.setButtonColorStart(Color.parseColor("#ff4349"));
                gradientBgButton.setButtonColorEnd(Color.parseColor("#ff7c3e"));
                gradientBgButton.setBackgroundResource(0);
            } else if (!user.isPicVerificationVerified()) {
                gradientBgButton.setBackgroundResource(0);
                gradientBgButton.setEmpty(true);
                gradientBgButton.setVisibility(4);
            } else if (!CoreModule.m29935P().m94658i().mo158233G1()) {
                vImage.setVisibility(0);
                gradientBgButton.setVisibility(8);
                qib0.f154713b0.f139231b.showUserVerificationLogo(this.f123931b, user, vImage);
            }
        }
        if (!CoreModule.m29935P().m94658i().mo158233G1() || m146624F(user)) {
            return;
        }
        Iterator<MessageActionBarLeftLayout> it = this.f198950a.iterator();
        while (it.hasNext()) {
            it.next().m49493n(this.f123931b, user);
        }
    }

    @Override // p149l.yly
    /* JADX INFO: renamed from: k */
    public void mo146633k(List<View> list, VLinear vLinear) {
        super.mo146633k(list, vLinear);
        if (this.f123931b.m48957C2()) {
            TextView textView = new TextView(this.f123931b);
            textView.setText("举报");
            textView.setGravity(17);
            xdl0.m208329E0(textView, new View.OnClickListener() { // from class: l.jny
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f118901a.m146625G(view);
                }
            });
            textView.setBackgroundResource(c3c0.f78786k3);
            list.add(0, textView);
        }
    }

    @Override // p149l.yly
    /* JADX INFO: renamed from: n */
    public void mo146634n(User user, Conversation conversation) {
        boolean z = (user.isMe() || user.isTeamAccount() || user.onlineMatchLocked() || CoreModule.f17545c.f19639e0.m169370Aa(user)) ? false : true;
        if (z != this.f123934e) {
            this.f123934e = z;
            VIcon vIcon = (VIcon) this.f123932c.m156455e0().mo48974l().m120842t7().m190316m0().findViewWithTag("voiceCallView");
            if (NullChecker.m81303a(vIcon)) {
                xdl0.m208345M0(vIcon, this.f123934e);
            }
        }
    }

    @Override // p149l.yly
    /* JADX INFO: renamed from: p */
    public void mo117245p() {
        this.f123932c.m194282u0();
    }

    @Override // p149l.yly
    /* JADX INFO: renamed from: q */
    public void mo117246q() {
        getAct().startActivity(MessageProfileSettingAct.m48916Y1(getAct(), this.f123932c.m156455e0().mo48974l().m120794k4(this.f123932c.m156455e0().mo48974l().mo120828r3()), this.f123932c.m156455e0().mo48974l().mo120828r3()));
    }

    @Override // p149l.yly
    /* JADX INFO: renamed from: s */
    public boolean mo146635s(boolean z) {
        if (!CoreModule.m29935P().m94658i().mo158450u() || !(this.f123932c.act() instanceof MessagesAct)) {
            return true;
        }
        Conversation conversationM48977u2 = ((MessagesAct) this.f123932c.act()).m48977u2();
        if (NullChecker.m81303a(conversationM48977u2) && conversationM48977u2.isHeartbeatConv()) {
            return false;
        }
        return (NullChecker.m81303a(conversationM48977u2) && conversationM48977u2.isSeeUpgradedConv()) ? false : true;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public MessagesAct getAct() {
        return this.f123931b;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(iny inyVar) {
        this.f123932c = inyVar;
    }

    /* JADX INFO: renamed from: y */
    public void m146638y(iny inyVar) {
        super.m215318d(inyVar);
        if (inyVar.m156455e0().mo48974l().m120842t7().m190328s0()) {
            Iterator<MessageActionBarLeftLayout> it = this.f198950a.iterator();
            while (it.hasNext()) {
                it.next().m49496q(inyVar);
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public void m146639z() {
        Iterator<MessageActionBarLeftLayout> it = this.f198950a.iterator();
        while (it.hasNext()) {
            it.next().m49488i();
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
