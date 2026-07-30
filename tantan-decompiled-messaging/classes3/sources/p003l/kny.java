package p003l;

import android.content.Context;
import android.graphics.Color;
import android.os.ResultReceiver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import com.p000p1.mobile.putong.core.p001ui.messages.MessageProfileSettingAct;
import com.p000p1.mobile.putong.core.p001ui.messages.MessagesAct;
import com.p000p1.mobile.putong.core.p001ui.messages.model.view.MessageActionBarLeftLayout;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.ui.view.GradientBgButton;
import com.p1.mobile.putong.data.BubbleInfo;
import com.p1.mobile.putong.data.MatchFrom;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.ui.webview.mk.MkWebViewAct;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;
import l.c3c0;
import l.j760;
import l.juk;
import l.knb0;
import l.o6j0;
import l.qib0;
import l.t100;
import l.xaj0;
import l.xdl0;
import org.eclipse.jetty.servlet.ServletHandler;
import p028v.VIcon;
import p028v.VImage;
import p028v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class kny extends yly<iny> {

    /* JADX INFO: renamed from: b */
    public MessagesAct f4971b;

    /* JADX INFO: renamed from: c */
    public iny f4972c;

    /* JADX INFO: renamed from: d */
    public User f4973d;

    /* JADX INFO: renamed from: e */
    public boolean f4974e = false;

    /* JADX INFO: renamed from: f */
    public boolean f4975f = false;

    /* JADX INFO: renamed from: g */
    public boolean f4976g = false;

    /* JADX INFO: renamed from: h */
    public boolean f4977h;

    public kny(MessagesAct messagesAct) {
        this.f4971b = messagesAct;
    }

    /* JADX INFO: renamed from: A */
    public void m5701A(knb0<User, Boolean, j760<Integer, Boolean>, Conversation> knb0Var) {
        this.f4973d = (User) knb0Var.a;
        Iterator<MessageActionBarLeftLayout> it = this.f9081a.iterator();
        while (it.hasNext()) {
            it.next().m2638l(this.f4971b, this.f4972c, knb0Var);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m5702B(j760<User, j760<Integer, Boolean>> j760Var) {
        Iterator<MessageActionBarLeftLayout> it = this.f9081a.iterator();
        while (it.hasNext()) {
            it.next().m2639m(j760Var, this.f4972c.m5205k0());
        }
    }

    /* JADX INFO: renamed from: C */
    public void m5703C(User user) {
        Iterator<MessageActionBarLeftLayout> it = this.f9081a.iterator();
        while (it.hasNext()) {
            it.next().m2641o(this.f4971b, user);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m5704C0() {
        return this.f4971b;
    }

    /* JADX INFO: renamed from: E */
    public void m5705E(xaj0<User, j760<Integer, Boolean>, Conversation> xaj0Var) {
        Iterator<MessageActionBarLeftLayout> it = this.f9081a.iterator();
        while (it.hasNext()) {
            it.next().m2642p(this.f4971b, xaj0Var, this.f4972c);
        }
    }

    /* JADX INFO: renamed from: F */
    public boolean m5706F(User user) {
        return false;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m5707G(View view) {
        PutongAct putongAct = this.f4971b;
        StringBuilder sb = new StringBuilder();
        sb.append(juk.e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com");
        sb.append("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/dating-report/index.html?speed=true&_bid=1004397&hideNavigationBar=1&hideNotch=1&from=user&receive_report_user_id=");
        sb.append(this.f4971b.f1531f.m4295r3());
        putongAct.startActivity(MkWebViewAct.e2(putongAct, "", sb.toString(), true, true, true, true, (ResultReceiver) null));
    }

    /* JADX INFO: renamed from: H */
    public void m5708H(String str) {
        Iterator<MessageActionBarLeftLayout> it = this.f9081a.iterator();
        while (it.hasNext()) {
            it.next().m2648v(str);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m5709I(BubbleInfo bubbleInfo) {
        if (!this.f4977h) {
            this.f4977h = true;
            o6j0.h("e_other_state", "p_chat_view", new o6j0.a[0]);
        }
        Iterator<MessageActionBarLeftLayout> it = this.f9081a.iterator();
        while (it.hasNext()) {
            it.next().m2649w(bubbleInfo);
        }
    }

    /* JADX INFO: renamed from: J */
    public void m5710J(User user) {
        Iterator<MessageActionBarLeftLayout> it = this.f9081a.iterator();
        while (it.hasNext()) {
            it.next().m2651y(this.f4971b, this.f4972c, user);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m5711K() {
        Iterator<MessageActionBarLeftLayout> it = this.f9081a.iterator();
        while (it.hasNext()) {
            it.next().m2652z(this.f4973d);
        }
    }

    /* JADX INFO: renamed from: L */
    public void m5712L() {
        Iterator<MessageActionBarLeftLayout> it = this.f9081a.iterator();
        while (it.hasNext()) {
            it.next().m2630A(this.f4973d);
        }
    }

    /* JADX INFO: renamed from: M */
    public void m5713M(String str) {
        Iterator<MessageActionBarLeftLayout> it = this.f9081a.iterator();
        while (it.hasNext()) {
            it.next().m2631B(str);
        }
    }

    @Override // p003l.yly
    /* JADX INFO: renamed from: i */
    public void mo3905i() {
        super.mo3905i();
        Iterator<MessageActionBarLeftLayout> it = this.f9081a.iterator();
        while (it.hasNext()) {
            it.next().m2637k(this.f4973d, this.f4972c);
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p003l.yly
    /* JADX INFO: renamed from: j */
    public void mo5715j(GradientBgButton gradientBgButton, @NonNull VImage vImage, User user) {
        if (NullChecker.a(user.localRelationship) && TEnum.equals(user.localRelationship.state, "matched") && user.localRelationship.status.contains(MatchFrom.get("superLiked")) && CoreModule.P().i().G1()) {
            gradientBgButton.setVisibility(0);
            gradientBgButton.setBordersize(t100.d(0.5f));
            gradientBgButton.setEmpty(false);
            gradientBgButton.setButtonColorAngle(0);
            gradientBgButton.setIcon(this.f4971b.drawable(c3c0.F6));
            gradientBgButton.setButtonColorStart(Color.parseColor("#5bb6ff"));
            gradientBgButton.setButtonColorEnd(Color.parseColor("#2fcffc"));
            gradientBgButton.setBackgroundResource(0);
        } else if (NullChecker.a(user.localRelationship) && TEnum.equals(user.localRelationship.state, "matched") && user.localRelationship.status.contains(MatchFrom.get("boosted")) && CoreModule.P().i().G1()) {
            gradientBgButton.setVisibility(0);
            gradientBgButton.setBordersize(t100.d(0.5f));
            gradientBgButton.setEmpty(false);
            gradientBgButton.setButtonColorAngle(0);
            gradientBgButton.setIcon(this.f4971b.drawable(c3c0.c7));
            gradientBgButton.setButtonColorStart(Color.parseColor("#ff8eaf"));
            gradientBgButton.setButtonColorEnd(Color.parseColor("#ea50c0"));
            gradientBgButton.setBackgroundResource(0);
        } else if (CoreModule.P().i().Q4(((DbObject) user).id)) {
            gradientBgButton.setVisibility(0);
            gradientBgButton.setBordersize(t100.d(0.5f));
            gradientBgButton.setEmpty(true);
            gradientBgButton.setButtonColorAngle(0);
            gradientBgButton.setBackgroundResource(c3c0.g6);
        } else if (NullChecker.a(user.localRelationship) && TEnum.equals(user.localRelationship.state, "matched") && user.localRelationship.status.contains(MatchFrom.get("letter"))) {
            gradientBgButton.setVisibility(0);
            gradientBgButton.setBordersize(t100.d(0.5f));
            gradientBgButton.setEmpty(true);
            gradientBgButton.setButtonColorAngle(0);
            gradientBgButton.setBackgroundResource(c3c0.I6);
        } else {
            Relationship relationship = user.localRelationship;
            if ((relationship == null || TEnum.equals(relationship.state, ServletHandler.__DEFAULT_SERVLET) || TEnum.equals(user.localRelationship.state, "unknown_")) && NullChecker.a(user.localFollowship) && TEnum.equals(user.localFollowship.state, "matched")) {
                gradientBgButton.setVisibility(0);
                gradientBgButton.setBordersize(t100.d(0.5f));
                gradientBgButton.setEmpty(false);
                gradientBgButton.setButtonColorAngle(0);
                gradientBgButton.setIcon(this.f4971b.drawable(c3c0.w7));
                gradientBgButton.setButtonColorStart(Color.parseColor("#ff4349"));
                gradientBgButton.setButtonColorEnd(Color.parseColor("#ff7c3e"));
                gradientBgButton.setBackgroundResource(0);
            } else if (!user.isPicVerificationVerified()) {
                gradientBgButton.setBackgroundResource(0);
                gradientBgButton.setEmpty(true);
                gradientBgButton.setVisibility(4);
            } else if (!CoreModule.P().i().G1()) {
                vImage.setVisibility(0);
                gradientBgButton.setVisibility(8);
                qib0.b0.b.showUserVerificationLogo(this.f4971b, user, vImage);
            }
        }
        if (!CoreModule.P().i().G1() || m5706F(user)) {
            return;
        }
        Iterator<MessageActionBarLeftLayout> it = this.f9081a.iterator();
        while (it.hasNext()) {
            it.next().m2640n(this.f4971b, user);
        }
    }

    @Override // p003l.yly
    /* JADX INFO: renamed from: k */
    public void mo5716k(List<View> list, VLinear vLinear) {
        super.mo5716k(list, vLinear);
        if (this.f4971b.m2049C2()) {
            TextView textView = new TextView(this.f4971b);
            textView.setText("举报");
            textView.setGravity(17);
            xdl0.E0(textView, new View.OnClickListener() { // from class: l.jny
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f4691a.m5707G(view);
                }
            });
            textView.setBackgroundResource(c3c0.k3);
            list.add(0, textView);
        }
    }

    @Override // p003l.yly
    /* JADX INFO: renamed from: n */
    public void mo5717n(User user, Conversation conversation) {
        boolean z = (user.isMe() || user.isTeamAccount() || user.onlineMatchLocked() || CoreModule.c.e0.Aa(user)) ? false : true;
        if (z != this.f4974e) {
            this.f4974e = z;
            AppCompatImageView appCompatImageView = (VIcon) this.f4972c.m6497e0().mo2066l().m4309t7().m7942m0().findViewWithTag("voiceCallView");
            if (NullChecker.a(appCompatImageView)) {
                xdl0.M0(appCompatImageView, this.f4974e);
            }
        }
    }

    @Override // p003l.yly
    /* JADX INFO: renamed from: p */
    public void mo3907p() {
        this.f4972c.u0();
    }

    @Override // p003l.yly
    /* JADX INFO: renamed from: q */
    public void mo3908q() {
        act().startActivity(MessageProfileSettingAct.m2006Y1(act(), this.f4972c.m6497e0().mo2066l().m4261k4(this.f4972c.m6497e0().mo2066l().m4295r3()), this.f4972c.m6497e0().mo2066l().m4295r3()));
    }

    @Override // p003l.yly
    /* JADX INFO: renamed from: s */
    public boolean mo5718s(boolean z) {
        if (!CoreModule.P().i().u() || !(this.f4972c.act() instanceof MessagesAct)) {
            return true;
        }
        Conversation conversationM2069u2 = this.f4972c.act().m2069u2();
        if (NullChecker.a(conversationM2069u2) && conversationM2069u2.isHeartbeatConv()) {
            return false;
        }
        return (NullChecker.a(conversationM2069u2) && conversationM2069u2.isSeeUpgradedConv()) ? false : true;
    }

    @Nullable
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public MessagesAct act() {
        return this.f4971b;
    }

    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void m5714i1(iny inyVar) {
        this.f4972c = inyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y */
    public void m5721y(iny inyVar) {
        super.m9197d(inyVar);
        if (inyVar.m6497e0().mo2066l().m4309t7().m7954s0()) {
            Iterator<MessageActionBarLeftLayout> it = this.f9081a.iterator();
            while (it.hasNext()) {
                it.next().m2643q(inyVar);
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public void m5722z() {
        Iterator<MessageActionBarLeftLayout> it = this.f9081a.iterator();
        while (it.hasNext()) {
            it.next().m2635i();
        }
    }

    public void destroy() {
    }
}
