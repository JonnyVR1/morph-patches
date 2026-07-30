package com.p000p1.mobile.putong.core.newui.messages.itemview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.newui.view.ODiamondTagLabel;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.c0;
import com.p1.mobile.putong.core.data.ChatMM;
import com.p1.mobile.putong.core.data.ChatRoundsDisplayedExternallyConfig;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserStatus;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import l.e30;
import l.emr;
import l.eqh0;
import l.lb6;
import l.mkd0;
import l.qib0;
import l.t100;
import l.u59;
import l.upa;
import l.vmf0;
import l.vwb;
import l.w0c0;
import l.x2c0;
import l.xdl0;
import l.xma;
import l.xp5;
import org.json.JSONObject;
import p009l.cpl;
import p009l.i0g0;
import p009l.mqi0;
import p009l.pi6;
import p009l.r6n;
import p009l.rd6;
import p009l.ye40;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ConversationItemTitleView extends LinearLayout implements cpl {

    /* JADX INFO: renamed from: a */
    public ConversationItemTitleView f4633a;

    /* JADX INFO: renamed from: b */
    public VText f4634b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f4635c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f4636d;

    /* JADX INFO: renamed from: e */
    public VImage f4637e;

    /* JADX INFO: renamed from: f */
    public VImage f4638f;

    /* JADX INFO: renamed from: g */
    public ODiamondTagLabel f4639g;

    /* JADX INFO: renamed from: h */
    public VImage f4640h;

    /* JADX INFO: renamed from: i */
    public VImage f4641i;

    /* JADX INFO: renamed from: j */
    public VText f4642j;

    /* JADX INFO: renamed from: k */
    public VImage f4643k;

    /* JADX INFO: renamed from: l */
    public VImage f4644l;

    /* JADX INFO: renamed from: m */
    public VText f4645m;

    /* JADX INFO: renamed from: n */
    public pi6 f4646n;

    public ConversationItemTitleView(@NonNull Context context) {
        super(context);
    }

    private void setCloseFriendIcon(pi6 pi6Var) {
        ChatRoundsDisplayedExternallyConfig chatRoundsDisplayedExternallyConfigP = upa.P();
        if (chatRoundsDisplayedExternallyConfigP == null || !chatRoundsDisplayedExternallyConfigP.enabled) {
            xdl0.M(this.f4643k, false);
            return;
        }
        this.f4646n = pi6Var;
        if (NullChecker.a(pi6Var.f18622a) && NullChecker.a(pi6Var.f18622a.additional) && NullChecker.a(pi6Var.f18622a.additional.chatMM)) {
            Conversation conversation = pi6Var.f18622a;
            ChatMM chatMM = conversation.additional.chatMM;
            if (chatMM.partnerSwitch && chatMM.level > 2 && conversation.doubleDefault()) {
                xdl0.M(this.f4643k, true);
                return;
            }
        }
        xdl0.M(this.f4643k, false);
    }

    private void setComplimentTagIcon(pi6 pi6Var) {
        Conversation conversation;
        if (pi6Var == null || (conversation = pi6Var.f18622a) == null) {
            xdl0.M(this.f4644l, false);
        } else {
            xdl0.M(this.f4644l, xp5.s(conversation));
        }
    }

    private void setOldWelcomeGreet(Conversation conversation) {
        xdl0.M(this.f4645m, false);
        this.f4634b.setText("我的招呼");
    }

    @Override // p009l.cpl
    /* JADX INFO: renamed from: A */
    public void mo5088A(pi6 pi6Var) {
        this.f4646n = pi6Var;
        xdl0.M(this.f4645m, false);
    }

    /* JADX INFO: renamed from: B */
    public final void m6634B(View view) {
        lb6.a(this, view);
    }

    @Override // p009l.cpl
    /* JADX INFO: renamed from: G0 */
    public void mo6574G0(pi6 pi6Var) {
        this.f4646n = pi6Var;
        this.f4634b.setText(upa.c0(pi6Var.f18624c));
    }

    @Override // p009l.cpl
    /* JADX INFO: renamed from: J */
    public void mo6556J(pi6 pi6Var) {
        String strString;
        this.f4646n = pi6Var;
        boolean zEquals = TextUtils.equals(((DbObject) pi6Var.f18622a).id, "fake_conversation_anonymous_greeting");
        if (!zEquals && ye40.m25301b()) {
            setOldWelcomeGreet(pi6Var.f18622a);
            return;
        }
        if (zEquals) {
            strString = "聊天室消息";
        } else if (CoreModule.o.d().I5() || CoreModule.P().a().jj()) {
            strString = "我的告白";
        } else {
            strString = upa.I2() ? pi6Var.f18645x.string(R.string.a5) : "";
        }
        if (u59.T()) {
            strString = pi6Var.f18645x.getString(R.string.Kg);
        }
        this.f4634b.setText(strString);
        xdl0.M0(this.f4645m, true);
        if (upa.z()) {
            rd6.m21518k0(this.f4634b, this.f4645m);
        } else {
            this.f4645m.setTextColor(getResources().getColor(w0c0.f0));
        }
        this.f4645m.setText(mqi0.m18538G(pi6Var.f18622a.latestTime));
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ void m6635M0(c0.b bVar) {
        m6639e1();
    }

    @Override // p009l.cpl
    /* JADX INFO: renamed from: P */
    public void mo6576P(pi6 pi6Var) {
        this.f4646n = pi6Var;
        boolean zA = NullChecker.a(Double.valueOf(pi6Var.f18612G));
        VText vText = this.f4645m;
        if (zA) {
            vText.setText(mqi0.m18538G(pi6Var.f18612G));
        } else {
            vText.setText("");
        }
        m6643i1();
    }

    @Override // p009l.cpl
    /* JADX INFO: renamed from: Q0 */
    public void mo6564Q0(pi6 pi6Var) {
        this.f4646n = pi6Var;
        this.f4645m.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        boolean z = upa.l().enabled;
        VText vText = this.f4645m;
        if (z) {
            vText.setText(mqi0.m18538G(pi6Var.f18622a.latestTime));
        } else {
            vText.setText(mqi0.m18538G(pi6Var.f18622a.latestTime));
        }
        if (CoreModule.c.f0.bo(pi6Var.f18623b, pi6Var.f18622a) && TEnum.equals(pi6Var.f18622a.additional.tag.type, "birthday")) {
            xdl0.M(this.f4638f, true);
            this.f4638f.setImageResource(x2c0.ze);
        }
        xdl0.M0(this.f4645m, true);
        long j = 0;
        if (m21567i0(pi6Var.f18622a)) {
            try {
                String str = (String) CoreModule.c.e0.u3.get();
                long jOptLong = (!TextUtils.isEmpty(str) ? new JSONObject(str) : new JSONObject()).optLong(((DbObject) pi6Var.f18622a).id, 0L);
                if (m21561b0(((DbObject) pi6Var.f18622a).id, str) && jOptLong > 0 && mqi0.m18550o() < jOptLong) {
                    HashSet hashSet = (HashSet) CoreModule.c.e0.p3.get();
                    HashSet hashSet2 = (HashSet) CoreModule.c.e0.q3.get();
                    if (hashSet.contains(((DbObject) pi6Var.f18622a).id) && !hashSet2.contains(((DbObject) pi6Var.f18622a).id)) {
                        xdl0.M0(this.f4645m, false);
                    }
                }
            } catch (Exception unused) {
            }
        }
        if (upa.z()) {
            rd6.m21518k0(this.f4634b, this.f4645m);
        } else {
            this.f4645m.setTextColor(getResources().getColor(w0c0.f0));
        }
        xdl0.M(this.f4637e, false);
        setComplimentTagIcon(pi6Var);
        xdl0.M(this.f4636d, xdl0.O0(this.f4644l));
        m6642h1(pi6Var.f18646y, pi6Var.f18622a.convType);
        m6638d1(pi6Var.f18623b);
        if (NullChecker.a(pi6Var.f18622a) && TextUtils.equals(pi6Var.f18622a.convType, "intlSeeChatRequest")) {
            m6636b1(pi6Var.f18623b);
            return;
        }
        if (u59.d0() && NullChecker.a(pi6Var.f18622a) && "lovebuzz".equals(pi6Var.f18622a.convType)) {
            if (NullChecker.a(pi6Var.f18622a.property) && NullChecker.a(pi6Var.f18622a.property.intl_love_buzz)) {
                j = pi6Var.f18622a.property.intl_love_buzz.expire;
            }
            int i = !CoreModule.P().b().zo(pi6Var.f18622a) ? pi6Var.f18606A : 100;
            if (pi6Var.f18623b.unilateralBlock() || i >= 100) {
                CoreModule.l.b().Dj(this.f4645m, Double.valueOf(pi6Var.f18622a.latestTime));
            } else {
                xdl0.M(this.f4645m, true);
                CoreModule.P().b().mf(pi6Var.f18645x, this.f4645m, CoreModule.P().b().Uq(j));
            }
        }
        if (m21568j(pi6Var.f18622a) || m21557Z0(pi6Var.f18622a)) {
            xdl0.M(this.f4645m, false);
        }
        m6640f1(pi6Var);
        m6637c1(pi6Var);
        m6641g1(pi6Var);
        m6643i1();
        mo6569y0();
    }

    @Override // p009l.cpl
    /* JADX INFO: renamed from: U */
    public void mo6577U(@NonNull pi6 pi6Var) {
        this.f4634b.setText("想结婚消息");
        this.f4645m.setText(mqi0.m18538G(pi6Var.f18622a.latestTime));
    }

    @Override // p009l.cpl
    /* JADX INFO: renamed from: X0 */
    public void mo6578X0(pi6 pi6Var) {
        this.f4634b.setText("城市封面 好友申请");
        this.f4645m.setText(mqi0.m18538G(pi6Var.f18622a.latestTime));
    }

    /* JADX INFO: renamed from: b1 */
    public void m6636b1(User user) {
        this.f4634b.setText(user.name);
        if (r6n.m21420i(user.location.updatedTime)) {
            this.f4645m.setText(R.string.ql);
            this.f4645m.setTextColor(Color.parseColor("#00c853"));
            this.f4645m.setTypeface(eqh0.c(3));
            this.f4646n.f18630i = "online";
            xdl0.M0(this.f4645m, true);
            return;
        }
        boolean zM21427j = r6n.m21419f().m21427j(user.location.distance);
        VText vText = this.f4645m;
        if (!zM21427j) {
            xdl0.M0(vText, false);
            this.f4646n.f18630i = "normal";
        } else {
            vText.setText(m21533H0(user.location.distance));
            this.f4645m.setTextColor(Color.parseColor("#f8ae1d"));
            this.f4646n.f18630i = "nearby";
            xdl0.M0(this.f4645m, true);
        }
    }

    /* JADX INFO: renamed from: c1 */
    public final void m6637c1(pi6 pi6Var) {
        if (m21576q(pi6Var)) {
            xdl0.M(this.f4645m, false);
        }
    }

    @Override // p009l.cpl
    /* JADX INFO: renamed from: d */
    public void mo6579d(pi6 pi6Var) {
        this.f4646n = pi6Var;
        this.f4634b.setTextColor(getContext().getResources().getColor(w0c0.P1));
        if (NullChecker.a(pi6Var.f18623b)) {
            this.f4634b.setText(pi6Var.f18623b.name);
        }
        this.f4645m.setText(mqi0.m18538G(pi6Var.f18622a.latestTime));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x006e  */
    @Override // p009l.cpl
    /* JADX INFO: renamed from: d0 */
    public void mo6580d0(pi6 pi6Var) {
        this.f4646n = pi6Var;
        this.f4634b.setTextColor(pi6Var.f18645x.color(w0c0.P1));
        this.f4634b.setText(m21529D0(pi6Var.f18623b.name, pi6Var.f18646y, true));
        String strY7 = CoreModule.c.e0.y7(((DbObject) pi6Var.f18623b).id);
        if (!TextUtils.isEmpty(strY7)) {
            this.f4634b.setText(m21529D0(strY7, pi6Var.f18646y, true));
        } else if (TextUtils.isEmpty(strY7) && upa.t1()) {
            if (NullChecker.a(pi6Var.f18623b)) {
                User user = pi6Var.f18623b;
                if (user.inactivated) {
                    this.f4634b.setText("已注销");
                } else if (user.status.contains(UserStatus.get("RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN"))) {
                    this.f4634b.setText("昵称已重置");
                }
            } else {
                this.f4634b.setText("已注销");
            }
        }
        this.f4634b.requestLayout();
        xdl0.M(this.f4640h, false);
        xdl0.M(this.f4639g, false);
        xdl0.M(this.f4636d, false);
        m6643i1();
    }

    /* JADX INFO: renamed from: d1 */
    public final void m6638d1(User user) {
        boolean zJ = vwb.J(user.profile.extensions.interest.emoji);
        VDraweeView vDraweeView = this.f4635c;
        if (zJ) {
            xdl0.M(vDraweeView, false);
            return;
        }
        xdl0.M(vDraweeView, false);
        qib0.G.L0(this.f4635c, qib0.X.n((String) user.profile.extensions.interest.emoji.get(0)) + ".png");
    }

    @Override // p009l.cpl
    /* JADX INFO: renamed from: e */
    public void mo6568e(pi6 pi6Var) {
        this.f4646n = pi6Var;
        this.f4634b.setText(m21529D0(pi6Var.f18607B.name, pi6Var.f18646y, true));
        xdl0.M0(this.f4645m, true);
        if (upa.z()) {
            rd6.m21518k0(this.f4634b, this.f4645m);
        } else {
            this.f4645m.setTextColor(getResources().getColor(w0c0.f0));
        }
        this.f4645m.setText(mqi0.m18538G(pi6Var.f18622a.latestTime));
        if (pi6Var.f18642u && NullChecker.a(pi6Var.f18644w)) {
            this.f4634b.setText(pi6Var.f18644w.name);
        }
        mo6569y0();
        m6643i1();
    }

    /* JADX INFO: renamed from: e1 */
    public final boolean m6639e1() {
        emr emrVar = emr.INSTANCE;
        String strE = emrVar.e();
        long jM18550o = mqi0.m18550o();
        if ("trialing".equals(strE)) {
            this.f4642j.setBackgroundResource(x2c0.L5);
            this.f4642j.setTextColor(-1);
            long jM3 = CoreModule.c.B2.m3();
            this.f4642j.setText(String.format("%s后失效", jM3 > jM18550o ? CoreModule.c.t1.k(jM3 - jM18550o) : "00:00:00"));
            xdl0.M(this.f4642j, true);
            return false;
        }
        if (!"trialEnd".equals(strE) && !"waiting".equals(strE) && !"expired".equals(strE)) {
            xdl0.M(this.f4642j, false);
            return false;
        }
        long jM4 = CoreModule.c.B2.m3();
        if (jM4 <= 0 && "trialEnd".equals(strE)) {
            jM4 = xma.s3() + (CoreModule.c.Q1.R.F() * 1000);
        }
        this.f4642j.setBackgroundResource(x2c0.K5);
        this.f4642j.setTextColor(CoreModule.b.getResources().getColor(w0c0.E));
        this.f4642j.setText(String.format("%s内可恢复", jM4 > jM18550o ? emrVar.c(jM4 - jM18550o) : "0分钟"));
        xdl0.M(this.f4642j, true);
        return true;
    }

    /* JADX INFO: renamed from: f1 */
    public void m6640f1(@NonNull pi6 pi6Var) {
        if (m21575p0(pi6Var.f18622a)) {
            if (TextUtils.isEmpty(pi6Var.f18622a.property.conversationTag.suggestText) && TextUtils.isEmpty(pi6Var.f18622a.property.conversationTag.emoji)) {
                return;
            }
            Conversation conversation = pi6Var.f18622a;
            if (conversation.unreadMessages <= 0) {
                if (TextUtils.isEmpty(conversation.property.conversationTag.suggestExpireTime) || (!TextUtils.isEmpty(pi6Var.f18622a.property.conversationTag.suggestExpireTime) && mqi0.m18550o() < Long.parseLong(pi6Var.f18622a.property.conversationTag.suggestExpireTime) * 1000)) {
                    xdl0.M(this.f4645m, false);
                }
            }
        }
    }

    /* JADX INFO: renamed from: g1 */
    public final void m6641g1(pi6 pi6Var) {
        if (NullChecker.a(pi6Var) && NullChecker.a(pi6Var.f18622a)) {
            Conversation conversation = pi6Var.f18622a;
            if (conversation.unreadMessages == 0 && vmf0.a(conversation)) {
                xdl0.M(this.f4645m, false);
            }
        }
    }

    @Override // p009l.rd6
    public /* bridge */ /* synthetic */ HashMap getUserLiveLabelHashMap() {
        return super.getUserLiveLabelHashMap();
    }

    @Override // p009l.cpl
    /* JADX INFO: renamed from: h0 */
    public void mo5108h0(pi6 pi6Var) {
        this.f4646n = pi6Var;
        this.f4634b.setTextColor(getContext().getResources().getColor(w0c0.P1));
        this.f4634b.setText(R.string.Ea);
    }

    /* JADX INFO: renamed from: h1 */
    public final void m6642h1(String str, String str2) {
        boolean zEquals = TextUtils.equals("conversation_intl_fake", str2);
        VText vText = this.f4634b;
        if (zEquals) {
            vText.setText(m21529D0(this.f4646n.f18623b.name + " " + i0g0.m16144p(this.f4646n.f18623b.location.distance, true), str, true));
        } else {
            vText.setText(m21529D0(this.f4646n.f18623b.name, str, true));
        }
        String strY7 = CoreModule.c.e0.y7(((DbObject) this.f4646n.f18623b).id);
        if (!TextUtils.isEmpty(strY7)) {
            this.f4634b.setText(m21529D0(strY7, str, true));
            return;
        }
        if (TextUtils.isEmpty(strY7) && upa.t1()) {
            if (NullChecker.a(this.f4646n.f18623b)) {
                User user = this.f4646n.f18623b;
                if (!user.inactivated) {
                    if (user.status.contains(UserStatus.get("RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN"))) {
                        this.f4634b.setText("昵称已重置");
                        return;
                    }
                    return;
                }
            }
            this.f4634b.setText("已注销");
        }
    }

    /* JADX INFO: renamed from: i1 */
    public void m6643i1() {
        pi6 pi6Var = this.f4646n;
        if (pi6Var.f18636o && pi6Var.f18642u && TextUtils.equals(CoreModule.H().userId(), this.f4646n.f18639r)) {
            this.f4634b.setText(CoreModule.c.e0.p9().name);
        }
    }

    @Override // p009l.cpl
    /* JADX INFO: renamed from: m */
    public void mo5114m(pi6 pi6Var) {
        this.f4646n = pi6Var;
        this.f4636d.setVisibility(8);
        xdl0.M(this.f4645m, false);
        this.f4634b.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    @Override // p009l.cpl
    /* JADX INFO: renamed from: m0 */
    public void mo5115m0(pi6 pi6Var) {
        List<Conversation> list = pi6Var.f18621P;
        this.f4634b.setTypeface(Typeface.defaultFromStyle(1));
        this.f4634b.setText(i0g0.m16115N(String.format(Locale.getDefault(), "%s个好友待恢复", Integer.valueOf(list.size())), getResources().getColor(w0c0.I), eqh0.c(3)));
        m6639e1();
        xdl0.M(this.f4637e, false);
        xdl0.M(this.f4645m, false);
        xdl0.M(this.f4636d, true);
        pi6Var.f18625d.c(getContext(), CoreModule.c.t1.n("countdown_item_limited_trial_see" + ((DbObject) pi6Var.f18622a).id)).subscribe(mkd0.G(new e30() { // from class: l.kb6
            public final void call(Object obj) {
                this.f15584a.m6635M0((c0.b) obj);
            }
        }));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6634B(this);
        xdl0.c0(this.f4634b, t100.d(2.0f));
        this.f4634b.setTypeface(Typeface.DEFAULT_BOLD);
        if (upa.z()) {
            rd6.m21518k0(this.f4634b, this.f4645m);
        }
    }

    @Override // p009l.bpl
    public /* bridge */ /* synthetic */ void setPicPercent(float f) {
        super.setPicPercent(f);
    }

    @Override // p009l.cpl
    /* JADX INFO: renamed from: t0 */
    public void mo5123t0(pi6 pi6Var) {
        this.f4646n = pi6Var;
        this.f4636d.setVisibility(8);
        xdl0.M(this.f4642j, false);
        xdl0.M(this.f4638f, false);
        this.f4634b.setTextColor(pi6Var.f18645x.color(w0c0.P1));
        this.f4634b.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        if (pi6Var.f18643v && NullChecker.a(pi6Var.f18623b)) {
            xdl0.M0(this.f4645m, false);
            if (pi6Var.f18623b.isBanedOrInactivated()) {
                return;
            }
            this.f4634b.setText(pi6Var.f18623b.name);
            return;
        }
        if (m21572n0(pi6Var)) {
            HashSet hashSet = (HashSet) CoreModule.c.e0.p3.get();
            HashSet hashSet2 = (HashSet) CoreModule.c.e0.q3.get();
            if (hashSet.contains(((DbObject) pi6Var.f18622a).id) && !hashSet2.contains(((DbObject) pi6Var.f18622a).id)) {
                xdl0.M(this.f4645m, false);
            }
        }
        if (m21557Z0(pi6Var.f18622a)) {
            xdl0.M(this.f4645m, false);
        }
    }

    @Override // p009l.bpl
    /* JADX INFO: renamed from: y0 */
    public void mo6569y0() {
        if (m21555Y(this.f4646n.f18622a)) {
            xdl0.M(this.f4645m, false);
        }
    }

    @Override // p009l.cpl
    /* JADX INFO: renamed from: z0 */
    public void mo5130z0(Conversation conversation, User user, pi6 pi6Var) {
        this.f4646n = pi6Var;
        if (NullChecker.a(pi6Var.f18622a) && pi6Var.f18622a.localEverHasMessage) {
            return;
        }
        this.f4634b.setText(R.string.Mi);
    }

    public ConversationItemTitleView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConversationItemTitleView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
