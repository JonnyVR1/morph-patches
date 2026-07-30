package com.p051p1.mobile.putong.core.newui.messages.itemview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.RunnableC4884c0;
import com.p051p1.mobile.putong.core.data.ChatMM;
import com.p051p1.mobile.putong.core.data.ChatRoundsDisplayedExternallyConfig;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.ConversationType;
import com.p051p1.mobile.putong.core.data.SeeTrialStatusType;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserStatus;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.newui.view.ODiamondTagLabel;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.Cfor;
import p153l.bnl0;
import p153l.br5;
import p153l.c9c0;
import p153l.d79;
import p153l.dbc0;
import p153l.evf0;
import p153l.gra;
import p153l.joa;
import p153l.jyb;
import p153l.lyh0;
import p153l.mn40;
import p153l.oc6;
import p153l.orl;
import p153l.psd0;
import p153l.pzi0;
import p153l.q8g0;
import p153l.qa00;
import p153l.r8n;
import p153l.sj6;
import p153l.ue6;
import p153l.uqb0;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationItemTitleView extends LinearLayout implements orl {

    /* JADX INFO: renamed from: a */
    public ConversationItemTitleView f26597a;

    /* JADX INFO: renamed from: b */
    public VText f26598b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f26599c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f26600d;

    /* JADX INFO: renamed from: e */
    public VImage f26601e;

    /* JADX INFO: renamed from: f */
    public VImage f26602f;

    /* JADX INFO: renamed from: g */
    public ODiamondTagLabel f26603g;

    /* JADX INFO: renamed from: h */
    public VImage f26604h;

    /* JADX INFO: renamed from: i */
    public VImage f26605i;

    /* JADX INFO: renamed from: j */
    public VText f26606j;

    /* JADX INFO: renamed from: k */
    public VImage f26607k;

    /* JADX INFO: renamed from: l */
    public VImage f26608l;

    /* JADX INFO: renamed from: m */
    public VText f26609m;

    /* JADX INFO: renamed from: n */
    public sj6 f26610n;

    public ConversationItemTitleView(@NonNull Context context) {
        super(context);
    }

    private void setCloseFriendIcon(sj6 sj6Var) {
        ChatRoundsDisplayedExternallyConfig chatRoundsDisplayedExternallyConfigM131611P = gra.m131611P();
        if (chatRoundsDisplayedExternallyConfigM131611P == null || !chatRoundsDisplayedExternallyConfigM131611P.enabled) {
            bnl0.m105524M(this.f26607k, false);
            return;
        }
        this.f26610n = sj6Var;
        if (NullChecker.m82486a(sj6Var.f168926a) && NullChecker.m82486a(sj6Var.f168926a.additional) && NullChecker.m82486a(sj6Var.f168926a.additional.chatMM)) {
            Conversation conversation = sj6Var.f168926a;
            ChatMM chatMM = conversation.additional.chatMM;
            if (chatMM.partnerSwitch && chatMM.level > 2 && conversation.doubleDefault()) {
                bnl0.m105524M(this.f26607k, true);
                return;
            }
        }
        bnl0.m105524M(this.f26607k, false);
    }

    private void setComplimentTagIcon(sj6 sj6Var) {
        Conversation conversation;
        if (sj6Var == null || (conversation = sj6Var.f168926a) == null) {
            bnl0.m105524M(this.f26608l, false);
        } else {
            bnl0.m105524M(this.f26608l, br5.m106048s(conversation));
        }
    }

    private void setOldWelcomeGreet(Conversation conversation) {
        bnl0.m105524M(this.f26609m, false);
        this.f26598b.setText("我的招呼");
    }

    @Override // p153l.orl
    /* JADX INFO: renamed from: A */
    public void mo41998A(sj6 sj6Var) {
        this.f26610n = sj6Var;
        bnl0.m105524M(this.f26609m, false);
    }

    /* JADX INFO: renamed from: B */
    public final void m43490B(View view) {
        oc6.m167140a(this, view);
    }

    @Override // p153l.orl
    /* JADX INFO: renamed from: G0 */
    public void mo43430G0(sj6 sj6Var) {
        this.f26610n = sj6Var;
        this.f26598b.setText(gra.m131664c0(sj6Var.f168928c));
    }

    @Override // p153l.orl
    /* JADX INFO: renamed from: J */
    public void mo43412J(sj6 sj6Var) {
        String strString;
        this.f26610n = sj6Var;
        boolean zEquals = TextUtils.equals(sj6Var.f168926a.f56859id, "fake_conversation_anonymous_greeting");
        if (!zEquals && mn40.m159114b()) {
            setOldWelcomeGreet(sj6Var.f168926a);
            return;
        }
        if (zEquals) {
            strString = "聊天室消息";
        } else if (CoreModule.f18276o.m132214d().mo34703I5() || CoreModule.m30933P().m143405a().mo34529jj()) {
            strString = "我的告白";
        } else {
            strString = gra.m131580I2() ? sj6Var.f168949x.string(R$string.f19144c5) : "";
        }
        if (d79.m114662U()) {
            strString = sj6Var.f168949x.getString(R$string.f19217eh);
        }
        this.f26598b.setText(strString);
        bnl0.m105525M0(this.f26609m, true);
        if (gra.m131778z()) {
            ue6.m195671k0(this.f26598b, this.f26609m);
        } else {
            this.f26609m.setTextColor(getResources().getColor(c9c0.f80419g0));
        }
        this.f26609m.setText(pzi0.m174442G(sj6Var.f168926a.latestTime));
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ void m43491M0(RunnableC4884c0.b bVar) {
        m43495e1();
    }

    @Override // p153l.orl
    /* JADX INFO: renamed from: P */
    public void mo43432P(sj6 sj6Var) {
        this.f26610n = sj6Var;
        boolean zM82486a = NullChecker.m82486a(Double.valueOf(sj6Var.f168916G));
        VText vText = this.f26609m;
        if (zM82486a) {
            vText.setText(pzi0.m174442G(sj6Var.f168916G));
        } else {
            vText.setText("");
        }
        m43499i1();
    }

    @Override // p153l.orl
    /* JADX INFO: renamed from: Q0 */
    public void mo43420Q0(sj6 sj6Var) {
        this.f26610n = sj6Var;
        this.f26609m.setCompoundDrawables(null, null, null, null);
        boolean z = gra.m131708l().enabled;
        VText vText = this.f26609m;
        if (z) {
            vText.setText(pzi0.m174442G(sj6Var.f168926a.latestTime));
        } else {
            vText.setText(pzi0.m174442G(sj6Var.f168926a.latestTime));
        }
        if (CoreModule.f18264c.f20384f0.m33916bo(sj6Var.f168927b, sj6Var.f168926a) && TEnum.equals(sj6Var.f168926a.additional.tag.type, "birthday")) {
            bnl0.m105524M(this.f26602f, true);
            this.f26602f.setImageResource(dbc0.f87283of);
        }
        bnl0.m105525M0(this.f26609m, true);
        long j = 0;
        if (m195720i0(sj6Var.f168926a)) {
            try {
                String str = CoreModule.f18264c.f20381e0.f89339u3.get();
                long jOptLong = (!TextUtils.isEmpty(str) ? new JSONObject(str) : new JSONObject()).optLong(sj6Var.f168926a.f56859id, 0L);
                if (m195714b0(sj6Var.f168926a.f56859id, str) && jOptLong > 0 && pzi0.m174454o() < jOptLong) {
                    HashSet<String> hashSet = CoreModule.f18264c.f20381e0.f89304p3.get();
                    HashSet<String> hashSet2 = CoreModule.f18264c.f20381e0.f89311q3.get();
                    if (hashSet.contains(sj6Var.f168926a.f56859id) && !hashSet2.contains(sj6Var.f168926a.f56859id)) {
                        bnl0.m105525M0(this.f26609m, false);
                    }
                }
            } catch (Exception unused) {
            }
        }
        if (gra.m131778z()) {
            ue6.m195671k0(this.f26598b, this.f26609m);
        } else {
            this.f26609m.setTextColor(getResources().getColor(c9c0.f80419g0));
        }
        bnl0.m105524M(this.f26601e, false);
        setComplimentTagIcon(sj6Var);
        bnl0.m105524M(this.f26600d, bnl0.m105529O0(this.f26608l));
        m43498h1(sj6Var.f168950y, sj6Var.f168926a.convType);
        m43494d1(sj6Var.f168927b);
        if (NullChecker.m82486a(sj6Var.f168926a) && TextUtils.equals(sj6Var.f168926a.convType, ConversationType.intlSeeChatRequest)) {
            m43492b1(sj6Var.f168927b);
            return;
        }
        if (d79.m114675e0() && NullChecker.m82486a(sj6Var.f168926a) && "lovebuzz".equals(sj6Var.f168926a.convType)) {
            if (NullChecker.m82486a(sj6Var.f168926a.property) && NullChecker.m82486a(sj6Var.f168926a.property.intl_love_buzz)) {
                j = sj6Var.f168926a.property.intl_love_buzz.expire;
            }
            int i = !CoreModule.m30933P().m143406b().mo36136zo(sj6Var.f168926a) ? sj6Var.f168910A : 100;
            if (sj6Var.f168927b.unilateralBlock() || i >= 100) {
                CoreModule.f18273l.m143406b().mo36097Dj(this.f26609m, Double.valueOf(sj6Var.f168926a.latestTime));
            } else {
                bnl0.m105524M(this.f26609m, true);
                CoreModule.m30933P().m143406b().mo36122mf(sj6Var.f168949x, this.f26609m, CoreModule.m30933P().m143406b().mo36105Uq(j));
            }
        }
        if (m195721j(sj6Var.f168926a) || m195710Z0(sj6Var.f168926a)) {
            bnl0.m105524M(this.f26609m, false);
        }
        m43496f1(sj6Var);
        m43493c1(sj6Var);
        m43497g1(sj6Var);
        m43499i1();
        mo43425y0();
    }

    @Override // p153l.orl
    /* JADX INFO: renamed from: U */
    public void mo43433U(@NonNull sj6 sj6Var) {
        this.f26598b.setText("想结婚消息");
        this.f26609m.setText(pzi0.m174442G(sj6Var.f168926a.latestTime));
    }

    @Override // p153l.orl
    /* JADX INFO: renamed from: X0 */
    public void mo43434X0(sj6 sj6Var) {
        this.f26598b.setText("城市封面 好友申请");
        this.f26609m.setText(pzi0.m174442G(sj6Var.f168926a.latestTime));
    }

    /* JADX INFO: renamed from: b1 */
    public void m43492b1(User user) {
        this.f26598b.setText(user.name);
        if (r8n.m180220i(user.location.updatedTime)) {
            this.f26609m.setText(R$string.f18678Ml);
            this.f26609m.setTextColor(Color.parseColor("#00c853"));
            this.f26609m.setTypeface(lyh0.m156283c(3));
            this.f26610n.f168934i = "online";
            bnl0.m105525M0(this.f26609m, true);
            return;
        }
        boolean zM180227j = r8n.m180219f().m180227j(user.location.distance);
        VText vText = this.f26609m;
        if (!zM180227j) {
            bnl0.m105525M0(vText, false);
            this.f26610n.f168934i = "normal";
        } else {
            vText.setText(m195686H0(user.location.distance));
            this.f26609m.setTextColor(Color.parseColor("#f8ae1d"));
            this.f26610n.f168934i = "nearby";
            bnl0.m105525M0(this.f26609m, true);
        }
    }

    /* JADX INFO: renamed from: c1 */
    public final void m43493c1(sj6 sj6Var) {
        if (m195729q(sj6Var)) {
            bnl0.m105524M(this.f26609m, false);
        }
    }

    @Override // p153l.orl
    /* JADX INFO: renamed from: d */
    public void mo43435d(sj6 sj6Var) {
        this.f26610n = sj6Var;
        this.f26598b.setTextColor(getContext().getResources().getColor(c9c0.f80368Q1));
        if (NullChecker.m82486a(sj6Var.f168927b)) {
            this.f26598b.setText(sj6Var.f168927b.name);
        }
        this.f26609m.setText(pzi0.m174442G(sj6Var.f168926a.latestTime));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x006e  */
    @Override // p153l.orl
    /* JADX INFO: renamed from: d0 */
    public void mo43436d0(sj6 sj6Var) {
        this.f26610n = sj6Var;
        this.f26598b.setTextColor(sj6Var.f168949x.color(c9c0.f80368Q1));
        this.f26598b.setText(m195682D0(sj6Var.f168927b.name, sj6Var.f168950y, true));
        String strM116634y7 = CoreModule.f18264c.f20381e0.m116634y7(sj6Var.f168927b.f56859id);
        if (!TextUtils.isEmpty(strM116634y7)) {
            this.f26598b.setText(m195682D0(strM116634y7, sj6Var.f168950y, true));
        } else if (TextUtils.isEmpty(strM116634y7) && gra.m131750t1()) {
            if (NullChecker.m82486a(sj6Var.f168927b)) {
                User user = sj6Var.f168927b;
                if (user.inactivated) {
                    this.f26598b.setText("已注销");
                } else if (user.status.contains(UserStatus.get(UserStatus.RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN))) {
                    this.f26598b.setText("昵称已重置");
                }
            } else {
                this.f26598b.setText("已注销");
            }
        }
        this.f26598b.requestLayout();
        bnl0.m105524M(this.f26604h, false);
        bnl0.m105524M(this.f26603g, false);
        bnl0.m105524M(this.f26600d, false);
        m43499i1();
    }

    /* JADX INFO: renamed from: d1 */
    public final void m43494d1(User user) {
        boolean zM147479J = jyb.m147479J(user.profile.extensions.interest.emoji);
        VDraweeView vDraweeView = this.f26599c;
        if (zM147479J) {
            bnl0.m105524M(vDraweeView, false);
            return;
        }
        bnl0.m105524M(vDraweeView, false);
        uqb0.f180374G.m127115L0(this.f26599c, uqb0.f180392X.m135325n(user.profile.extensions.interest.emoji.get(0)) + ".png");
    }

    @Override // p153l.orl
    /* JADX INFO: renamed from: e */
    public void mo43424e(sj6 sj6Var) {
        this.f26610n = sj6Var;
        this.f26598b.setText(m195682D0(sj6Var.f168911B.name, sj6Var.f168950y, true));
        bnl0.m105525M0(this.f26609m, true);
        if (gra.m131778z()) {
            ue6.m195671k0(this.f26598b, this.f26609m);
        } else {
            this.f26609m.setTextColor(getResources().getColor(c9c0.f80419g0));
        }
        this.f26609m.setText(pzi0.m174442G(sj6Var.f168926a.latestTime));
        if (sj6Var.f168946u && NullChecker.m82486a(sj6Var.f168948w)) {
            this.f26598b.setText(sj6Var.f168948w.name);
        }
        mo43425y0();
        m43499i1();
    }

    /* JADX INFO: renamed from: e1 */
    public final boolean m43495e1() {
        Cfor cfor = Cfor.INSTANCE;
        String strM126494e = cfor.m126494e();
        long jM174454o = pzi0.m174454o();
        if (SeeTrialStatusType.trialing.equals(strM126494e)) {
            this.f26606j.setBackgroundResource(dbc0.f86366M5);
            this.f26606j.setTextColor(-1);
            long jM186424m3 = CoreModule.f18264c.f20296B2.m186424m3();
            this.f26606j.setText(String.format("%s后失效", jM186424m3 > jM174454o ? CoreModule.f18264c.f20427t1.m32510k(jM186424m3 - jM174454o) : "00:00:00"));
            bnl0.m105524M(this.f26606j, true);
            return false;
        }
        if (!SeeTrialStatusType.trialEnd.equals(strM126494e) && !"waiting".equals(strM126494e) && !"expired".equals(strM126494e)) {
            bnl0.m105524M(this.f26606j, false);
            return false;
        }
        long jM186424m4 = CoreModule.f18264c.f20296B2.m186424m3();
        if (jM186424m4 <= 0 && SeeTrialStatusType.trialEnd.equals(strM126494e)) {
            jM186424m4 = joa.m146407t3() + (CoreModule.f18264c.f20340Q1.f20859R.m35755F() * 1000);
        }
        this.f26606j.setBackgroundResource(dbc0.f86334L5);
        this.f26606j.setTextColor(CoreModule.f18263b.getResources().getColor(c9c0.f80330E));
        this.f26606j.setText(String.format("%s内可恢复", jM186424m4 > jM174454o ? cfor.m126492c(jM186424m4 - jM174454o) : "0分钟"));
        bnl0.m105524M(this.f26606j, true);
        return true;
    }

    /* JADX INFO: renamed from: f1 */
    public void m43496f1(@NonNull sj6 sj6Var) {
        if (m195728p0(sj6Var.f168926a)) {
            if (TextUtils.isEmpty(sj6Var.f168926a.property.conversationTag.suggestText) && TextUtils.isEmpty(sj6Var.f168926a.property.conversationTag.emoji)) {
                return;
            }
            Conversation conversation = sj6Var.f168926a;
            if (conversation.unreadMessages <= 0) {
                if (TextUtils.isEmpty(conversation.property.conversationTag.suggestExpireTime) || (!TextUtils.isEmpty(sj6Var.f168926a.property.conversationTag.suggestExpireTime) && pzi0.m174454o() < Long.parseLong(sj6Var.f168926a.property.conversationTag.suggestExpireTime) * 1000)) {
                    bnl0.m105524M(this.f26609m, false);
                }
            }
        }
    }

    /* JADX INFO: renamed from: g1 */
    public final void m43497g1(sj6 sj6Var) {
        if (NullChecker.m82486a(sj6Var) && NullChecker.m82486a(sj6Var.f168926a)) {
            Conversation conversation = sj6Var.f168926a;
            if (conversation.unreadMessages == 0 && evf0.m122800a(conversation)) {
                bnl0.m105524M(this.f26609m, false);
            }
        }
    }

    @Override // p153l.ue6
    public /* bridge */ /* synthetic */ HashMap getUserLiveLabelHashMap() {
        return super.getUserLiveLabelHashMap();
    }

    @Override // p153l.orl
    /* JADX INFO: renamed from: h0 */
    public void mo42018h0(sj6 sj6Var) {
        this.f26610n = sj6Var;
        this.f26598b.setTextColor(getContext().getResources().getColor(c9c0.f80368Q1));
        this.f26598b.setText(R$string.f18757Pa);
    }

    /* JADX INFO: renamed from: h1 */
    public final void m43498h1(String str, String str2) {
        boolean zEquals = TextUtils.equals("conversation_intl_fake", str2);
        VText vText = this.f26598b;
        if (zEquals) {
            vText.setText(m195682D0(this.f26610n.f168927b.name + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + q8g0.m175811p(this.f26610n.f168927b.location.distance, true), str, true));
        } else {
            vText.setText(m195682D0(this.f26610n.f168927b.name, str, true));
        }
        String strM116634y7 = CoreModule.f18264c.f20381e0.m116634y7(this.f26610n.f168927b.f56859id);
        if (!TextUtils.isEmpty(strM116634y7)) {
            this.f26598b.setText(m195682D0(strM116634y7, str, true));
            return;
        }
        if (TextUtils.isEmpty(strM116634y7) && gra.m131750t1()) {
            if (NullChecker.m82486a(this.f26610n.f168927b)) {
                User user = this.f26610n.f168927b;
                if (!user.inactivated) {
                    if (user.status.contains(UserStatus.get(UserStatus.RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN))) {
                        this.f26598b.setText("昵称已重置");
                        return;
                    }
                    return;
                }
            }
            this.f26598b.setText("已注销");
        }
    }

    /* JADX INFO: renamed from: i1 */
    public void m43499i1() {
        sj6 sj6Var = this.f26610n;
        if (sj6Var.f168940o && sj6Var.f168946u && TextUtils.equals(CoreModule.m30929H().userId(), this.f26610n.f168943r)) {
            this.f26598b.setText(CoreModule.f18264c.f20381e0.m116600p9().name);
        }
    }

    @Override // p153l.orl
    /* JADX INFO: renamed from: m */
    public void mo42024m(sj6 sj6Var) {
        this.f26610n = sj6Var;
        this.f26600d.setVisibility(8);
        bnl0.m105524M(this.f26609m, false);
        this.f26598b.setCompoundDrawables(null, null, null, null);
    }

    @Override // p153l.orl
    /* JADX INFO: renamed from: m0 */
    public void mo42025m0(sj6 sj6Var) {
        List<Conversation> list = sj6Var.f168925P;
        this.f26598b.setTypeface(Typeface.defaultFromStyle(1));
        this.f26598b.setText(q8g0.m175782N(String.format(Locale.getDefault(), "%s个好友待恢复", Integer.valueOf(list.size())), getResources().getColor(c9c0.f80342I), lyh0.m156283c(3)));
        m43495e1();
        bnl0.m105524M(this.f26601e, false);
        bnl0.m105524M(this.f26609m, false);
        bnl0.m105524M(this.f26600d, true);
        sj6Var.f168929d.mo68557c((Act) getContext(), CoreModule.f18264c.f20427t1.m32512n("countdown_item_limited_trial_see" + sj6Var.f168926a.f56859id)).subscribe(psd0.m173596G(new y20() { // from class: l.nc6
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f141319a.m43491M0((RunnableC4884c0.b) obj);
            }
        }));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m43490B(this);
        bnl0.m105548c0(this.f26598b, qa00.m175859d(2.0f));
        this.f26598b.setTypeface(Typeface.DEFAULT_BOLD);
        if (gra.m131778z()) {
            ue6.m195671k0(this.f26598b, this.f26609m);
        }
    }

    @Override // p153l.nrl
    public /* bridge */ /* synthetic */ void setPicPercent(float f) {
        super.setPicPercent(f);
    }

    @Override // p153l.orl
    /* JADX INFO: renamed from: t0 */
    public void mo42033t0(sj6 sj6Var) {
        this.f26610n = sj6Var;
        this.f26600d.setVisibility(8);
        bnl0.m105524M(this.f26606j, false);
        bnl0.m105524M(this.f26602f, false);
        this.f26598b.setTextColor(sj6Var.f168949x.color(c9c0.f80368Q1));
        this.f26598b.setCompoundDrawables(null, null, null, null);
        if (sj6Var.f168947v && NullChecker.m82486a(sj6Var.f168927b)) {
            bnl0.m105525M0(this.f26609m, false);
            if (sj6Var.f168927b.isBanedOrInactivated()) {
                return;
            }
            this.f26598b.setText(sj6Var.f168927b.name);
            return;
        }
        if (m195725n0(sj6Var)) {
            HashSet<String> hashSet = CoreModule.f18264c.f20381e0.f89304p3.get();
            HashSet<String> hashSet2 = CoreModule.f18264c.f20381e0.f89311q3.get();
            if (hashSet.contains(sj6Var.f168926a.f56859id) && !hashSet2.contains(sj6Var.f168926a.f56859id)) {
                bnl0.m105524M(this.f26609m, false);
            }
        }
        if (m195710Z0(sj6Var.f168926a)) {
            bnl0.m105524M(this.f26609m, false);
        }
    }

    @Override // p153l.nrl
    /* JADX INFO: renamed from: y0 */
    public void mo43425y0() {
        if (m195708Y(this.f26610n.f168926a)) {
            bnl0.m105524M(this.f26609m, false);
        }
    }

    @Override // p153l.orl
    /* JADX INFO: renamed from: z0 */
    public void mo42039z0(Conversation conversation, User user, sj6 sj6Var) {
        this.f26610n = sj6Var;
        if (NullChecker.m82486a(sj6Var.f168926a) && sj6Var.f168926a.localEverHasMessage) {
            return;
        }
        this.f26598b.setText(R$string.f19342ij);
    }

    public ConversationItemTitleView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConversationItemTitleView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
