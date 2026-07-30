package p153l;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.p058ui.messages.MessageProfileSettingAct;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.messages.model.view.MessageActionBarLeftLayout;
import com.p051p1.mobile.putong.core.p058ui.view.GradientBgButton;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.MatchFrom;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;
import p151v.VIcon;
import p151v.VImage;
import p151v.VLinear;

/* JADX INFO: loaded from: classes4.dex */
public class hwy extends vuy<fwy> {

    /* JADX INFO: renamed from: b */
    public MessagesAct f111944b;

    /* JADX INFO: renamed from: c */
    public fwy f111945c;

    /* JADX INFO: renamed from: d */
    public User f111946d;

    /* JADX INFO: renamed from: e */
    public boolean f111947e = false;

    /* JADX INFO: renamed from: f */
    public boolean f111948f = false;

    /* JADX INFO: renamed from: g */
    public boolean f111949g = false;

    /* JADX INFO: renamed from: h */
    public boolean f111950h;

    public hwy(MessagesAct messagesAct) {
        this.f111944b = messagesAct;
    }

    /* JADX INFO: renamed from: A */
    public void m137523A(ovb0<User, Boolean, pf60<Integer, Boolean>, Conversation> ovb0Var) {
        this.f111946d = ovb0Var.f149248a;
        Iterator<MessageActionBarLeftLayout> it = this.f185872a.iterator();
        while (it.hasNext()) {
            it.next().m50674l(this.f111944b, this.f111945c, ovb0Var);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m137524B(pf60<User, pf60<Integer, Boolean>> pf60Var) {
        Iterator<MessageActionBarLeftLayout> it = this.f185872a.iterator();
        while (it.hasNext()) {
            it.next().m50675m(pf60Var, this.f111945c.mo127908k0());
        }
    }

    /* JADX INFO: renamed from: C */
    public void m137525C(User user) {
        Iterator<MessageActionBarLeftLayout> it = this.f185872a.iterator();
        while (it.hasNext()) {
            it.next().m50677o(this.f111944b, user);
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f111944b;
    }

    /* JADX INFO: renamed from: E */
    public void m137526E(bkj0<User, pf60<Integer, Boolean>, Conversation> bkj0Var) {
        Iterator<MessageActionBarLeftLayout> it = this.f185872a.iterator();
        while (it.hasNext()) {
            it.next().m50678p(this.f111944b, bkj0Var, this.f111945c);
        }
    }

    /* JADX INFO: renamed from: F */
    public boolean m137527F(User user) {
        return false;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m137528G(View view) {
        MessagesAct messagesAct = this.f111944b;
        StringBuilder sb = new StringBuilder();
        sb.append(zwk.m221905e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com");
        sb.append("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/dating-report/index.html?speed=true&_bid=1004397&hideNavigationBar=1&hideNotch=1&from=user&receive_report_user_id=");
        sb.append(this.f111944b.f32488f.mo111034r3());
        messagesAct.startActivity(MkWebViewAct.m81423g2(messagesAct, "", sb.toString(), true, true, true, true, null));
    }

    /* JADX INFO: renamed from: H */
    public void m137529H(String str) {
        Iterator<MessageActionBarLeftLayout> it = this.f185872a.iterator();
        while (it.hasNext()) {
            it.next().m50684v(str);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m137530I(BubbleInfo bubbleInfo) {
        if (!this.f111950h) {
            this.f111950h = true;
            sfj0.m185601h("e_other_state", OMSDialogPositon.p_chat_view, new sfj0.C20032a[0]);
        }
        Iterator<MessageActionBarLeftLayout> it = this.f185872a.iterator();
        while (it.hasNext()) {
            it.next().m50685w(bubbleInfo);
        }
    }

    /* JADX INFO: renamed from: J */
    public void m137531J(User user) {
        Iterator<MessageActionBarLeftLayout> it = this.f185872a.iterator();
        while (it.hasNext()) {
            it.next().m50687y(this.f111944b, this.f111945c, user);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m137532K() {
        Iterator<MessageActionBarLeftLayout> it = this.f185872a.iterator();
        while (it.hasNext()) {
            it.next().m50688z(this.f111946d);
        }
    }

    /* JADX INFO: renamed from: L */
    public void m137533L() {
        Iterator<MessageActionBarLeftLayout> it = this.f185872a.iterator();
        while (it.hasNext()) {
            it.next().m50666A(this.f111946d);
        }
    }

    /* JADX INFO: renamed from: M */
    public void m137534M(String str) {
        Iterator<MessageActionBarLeftLayout> it = this.f185872a.iterator();
        while (it.hasNext()) {
            it.next().m50667B(str);
        }
    }

    @Override // p153l.vuy
    /* JADX INFO: renamed from: i */
    public void mo106630i() {
        super.mo106630i();
        Iterator<MessageActionBarLeftLayout> it = this.f185872a.iterator();
        while (it.hasNext()) {
            it.next().m50673k(this.f111946d, this.f111945c);
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p153l.vuy
    /* JADX INFO: renamed from: j */
    public void mo137535j(GradientBgButton gradientBgButton, @NonNull VImage vImage, User user) {
        if (NullChecker.m82486a(user.localRelationship) && TEnum.equals(user.localRelationship.state, "matched") && user.localRelationship.status.contains(MatchFrom.get(MatchFrom.superLiked)) && CoreModule.m30933P().m143412i().mo180325G1()) {
            gradientBgButton.setVisibility(0);
            gradientBgButton.setBordersize(qa00.m175859d(0.5f));
            gradientBgButton.setEmpty(false);
            gradientBgButton.setButtonColorAngle(0);
            gradientBgButton.setIcon(this.f111944b.drawable(ibc0.f113794F6));
            gradientBgButton.setButtonColorStart(Color.parseColor("#5bb6ff"));
            gradientBgButton.setButtonColorEnd(Color.parseColor("#2fcffc"));
            gradientBgButton.setBackgroundResource(0);
        } else if (NullChecker.m82486a(user.localRelationship) && TEnum.equals(user.localRelationship.state, "matched") && user.localRelationship.status.contains(MatchFrom.get("boosted")) && CoreModule.m30933P().m143412i().mo180325G1()) {
            gradientBgButton.setVisibility(0);
            gradientBgButton.setBordersize(qa00.m175859d(0.5f));
            gradientBgButton.setEmpty(false);
            gradientBgButton.setButtonColorAngle(0);
            gradientBgButton.setIcon(this.f111944b.drawable(ibc0.f113993c7));
            gradientBgButton.setButtonColorStart(Color.parseColor("#ff8eaf"));
            gradientBgButton.setButtonColorEnd(Color.parseColor("#ea50c0"));
            gradientBgButton.setBackgroundResource(0);
        } else if (CoreModule.m30933P().m143412i().mo180383Q4(user.f56859id)) {
            gradientBgButton.setVisibility(0);
            gradientBgButton.setBordersize(qa00.m175859d(0.5f));
            gradientBgButton.setEmpty(true);
            gradientBgButton.setButtonColorAngle(0);
            gradientBgButton.setBackgroundResource(ibc0.f114028g6);
        } else if (NullChecker.m82486a(user.localRelationship) && TEnum.equals(user.localRelationship.state, "matched") && user.localRelationship.status.contains(MatchFrom.get("letter"))) {
            gradientBgButton.setVisibility(0);
            gradientBgButton.setBordersize(qa00.m175859d(0.5f));
            gradientBgButton.setEmpty(true);
            gradientBgButton.setButtonColorAngle(0);
            gradientBgButton.setBackgroundResource(ibc0.f113821I6);
        } else {
            Relationship relationship = user.localRelationship;
            if ((relationship == null || TEnum.equals(relationship.state, "default") || TEnum.equals(user.localRelationship.state, "unknown_")) && NullChecker.m82486a(user.localFollowship) && TEnum.equals(user.localFollowship.state, "matched")) {
                gradientBgButton.setVisibility(0);
                gradientBgButton.setBordersize(qa00.m175859d(0.5f));
                gradientBgButton.setEmpty(false);
                gradientBgButton.setButtonColorAngle(0);
                gradientBgButton.setIcon(this.f111944b.drawable(ibc0.f114173w7));
                gradientBgButton.setButtonColorStart(Color.parseColor("#ff4349"));
                gradientBgButton.setButtonColorEnd(Color.parseColor("#ff7c3e"));
                gradientBgButton.setBackgroundResource(0);
            } else if (!user.isPicVerificationVerified()) {
                gradientBgButton.setBackgroundResource(0);
                gradientBgButton.setEmpty(true);
                gradientBgButton.setVisibility(4);
            } else if (!CoreModule.m30933P().m143412i().mo180325G1()) {
                vImage.setVisibility(0);
                gradientBgButton.setVisibility(8);
                uqb0.f180396b0.f170325b.showUserVerificationLogo(this.f111944b, user, vImage);
            }
        }
        if (!CoreModule.m30933P().m143412i().mo180325G1() || m137527F(user)) {
            return;
        }
        Iterator<MessageActionBarLeftLayout> it = this.f185872a.iterator();
        while (it.hasNext()) {
            it.next().m50676n(this.f111944b, user);
        }
    }

    @Override // p153l.vuy
    /* JADX INFO: renamed from: k */
    public void mo137536k(List<View> list, VLinear vLinear) {
        super.mo137536k(list, vLinear);
        if (this.f111944b.m50141D2()) {
            TextView textView = new TextView(this.f111944b);
            textView.setText("举报");
            textView.setGravity(17);
            bnl0.m105509E0(textView, new View.OnClickListener() { // from class: l.gwy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f106874a.m137528G(view);
                }
            });
            textView.setBackgroundResource(ibc0.f114061k3);
            list.add(0, textView);
        }
    }

    @Override // p153l.vuy
    /* JADX INFO: renamed from: n */
    public void mo137537n(User user, Conversation conversation) {
        boolean z = (user.isMe() || user.isTeamAccount() || user.onlineMatchLocked() || CoreModule.f18264c.f20381e0.m116443Aa(user)) ? false : true;
        if (z != this.f111947e) {
            this.f111947e = z;
            VIcon vIcon = (VIcon) this.f111945c.m143372e0().mo50158l().m111048t7().m178960m0().findViewWithTag("voiceCallView");
            if (NullChecker.m82486a(vIcon)) {
                bnl0.m105525M0(vIcon, this.f111947e);
            }
        }
    }

    @Override // p153l.vuy
    /* JADX INFO: renamed from: p */
    public void mo106631p() {
        this.f111945c.m183231u0();
    }

    @Override // p153l.vuy
    /* JADX INFO: renamed from: q */
    public void mo106632q() {
        getAct().startActivity(MessageProfileSettingAct.m50099Z1(getAct(), this.f111945c.m143372e0().mo50158l().m111000k4(this.f111945c.m143372e0().mo50158l().mo111034r3()), this.f111945c.m143372e0().mo50158l().mo111034r3()));
    }

    @Override // p153l.vuy
    /* JADX INFO: renamed from: s */
    public boolean mo137538s(boolean z) {
        if (!CoreModule.m30933P().m143412i().mo180542u() || !(this.f111945c.act() instanceof MessagesAct)) {
            return true;
        }
        Conversation conversationM50161v2 = ((MessagesAct) this.f111945c.act()).m50161v2();
        if (NullChecker.m82486a(conversationM50161v2) && conversationM50161v2.isHeartbeatConv()) {
            return false;
        }
        return (NullChecker.m82486a(conversationM50161v2) && conversationM50161v2.isSeeUpgradedConv()) ? false : true;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public MessagesAct getAct() {
        return this.f111944b;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(fwy fwyVar) {
        this.f111945c = fwyVar;
    }

    /* JADX INFO: renamed from: y */
    public void m137541y(fwy fwyVar) {
        super.m202976d(fwyVar);
        if (fwyVar.m143372e0().mo50158l().m111048t7().m178973s0()) {
            Iterator<MessageActionBarLeftLayout> it = this.f185872a.iterator();
            while (it.hasNext()) {
                it.next().m50679q(fwyVar);
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public void m137542z() {
        Iterator<MessageActionBarLeftLayout> it = this.f185872a.iterator();
        while (it.hasNext()) {
            it.next().m50671i();
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
