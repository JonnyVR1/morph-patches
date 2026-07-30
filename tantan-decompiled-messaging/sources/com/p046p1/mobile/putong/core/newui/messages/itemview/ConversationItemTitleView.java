package com.p046p1.mobile.putong.core.newui.messages.itemview;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.RunnableC4733c0;
import com.p046p1.mobile.putong.core.data.ChatMM;
import com.p046p1.mobile.putong.core.data.ChatRoundsDisplayedExternallyConfig;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.ConversationType;
import com.p046p1.mobile.putong.core.data.SeeTrialStatusType;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserStatus;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.newui.view.ODiamondTagLabel;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.cpl;
import p149l.e30;
import p149l.emr;
import p149l.eqh0;
import p149l.i0g0;
import p149l.lb6;
import p149l.mkd0;
import p149l.mqi0;
import p149l.pi6;
import p149l.qib0;
import p149l.r6n;
import p149l.rd6;
import p149l.t100;
import p149l.u59;
import p149l.upa;
import p149l.vmf0;
import p149l.vwb;
import p149l.w0c0;
import p149l.x2c0;
import p149l.xdl0;
import p149l.xma;
import p149l.xp5;
import p149l.ye40;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationItemTitleView extends LinearLayout implements cpl {

    /* JADX INFO: renamed from: a */
    public ConversationItemTitleView f25855a;

    /* JADX INFO: renamed from: b */
    public VText f25856b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f25857c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f25858d;

    /* JADX INFO: renamed from: e */
    public VImage f25859e;

    /* JADX INFO: renamed from: f */
    public VImage f25860f;

    /* JADX INFO: renamed from: g */
    public ODiamondTagLabel f25861g;

    /* JADX INFO: renamed from: h */
    public VImage f25862h;

    /* JADX INFO: renamed from: i */
    public VImage f25863i;

    /* JADX INFO: renamed from: j */
    public VText f25864j;

    /* JADX INFO: renamed from: k */
    public VImage f25865k;

    /* JADX INFO: renamed from: l */
    public VImage f25866l;

    /* JADX INFO: renamed from: m */
    public VText f25867m;

    /* JADX INFO: renamed from: n */
    public pi6 f25868n;

    public ConversationItemTitleView(@NonNull Context context) {
        super(context);
    }

    private void setCloseFriendIcon(pi6 pi6Var) {
        ChatRoundsDisplayedExternallyConfig chatRoundsDisplayedExternallyConfigM194680P = upa.m194680P();
        if (chatRoundsDisplayedExternallyConfigM194680P == null || !chatRoundsDisplayedExternallyConfigM194680P.enabled) {
            xdl0.m208344M(this.f25865k, false);
            return;
        }
        this.f25868n = pi6Var;
        if (NullChecker.m81303a(pi6Var.f149101a) && NullChecker.m81303a(pi6Var.f149101a.additional) && NullChecker.m81303a(pi6Var.f149101a.additional.chatMM)) {
            Conversation conversation = pi6Var.f149101a;
            ChatMM chatMM = conversation.additional.chatMM;
            if (chatMM.partnerSwitch && chatMM.level > 2 && conversation.doubleDefault()) {
                xdl0.m208344M(this.f25865k, true);
                return;
            }
        }
        xdl0.m208344M(this.f25865k, false);
    }

    private void setComplimentTagIcon(pi6 pi6Var) {
        Conversation conversation;
        if (pi6Var == null || (conversation = pi6Var.f149101a) == null) {
            xdl0.m208344M(this.f25866l, false);
        } else {
            xdl0.m208344M(this.f25866l, xp5.m210479s(conversation));
        }
    }

    private void setOldWelcomeGreet(Conversation conversation) {
        xdl0.m208344M(this.f25867m, false);
        this.f25856b.setText("我的招呼");
    }

    @Override // p149l.cpl
    /* JADX INFO: renamed from: A */
    public void mo40987A(pi6 pi6Var) {
        this.f25868n = pi6Var;
        xdl0.m208344M(this.f25867m, false);
    }

    /* JADX INFO: renamed from: B */
    public final void m42479B(View view) {
        lb6.m149213a(this, view);
    }

    @Override // p149l.cpl
    /* JADX INFO: renamed from: G0 */
    public void mo42419G0(pi6 pi6Var) {
        this.f25868n = pi6Var;
        this.f25856b.setText(upa.m194733c0(pi6Var.f149103c));
    }

    @Override // p149l.cpl
    /* JADX INFO: renamed from: J */
    public void mo42401J(pi6 pi6Var) {
        String strString;
        this.f25868n = pi6Var;
        boolean zEquals = TextUtils.equals(pi6Var.f149101a.f56011id, "fake_conversation_anonymous_greeting");
        if (!zEquals && ye40.m214334b()) {
            setOldWelcomeGreet(pi6Var.f149101a);
            return;
        }
        if (zEquals) {
            strString = "聊天室消息";
        } else if (CoreModule.f17557o.m195057d().mo33700I5() || CoreModule.m29935P().m94651a().mo33526jj()) {
            strString = "我的告白";
        } else {
            strString = upa.m194649I2() ? pi6Var.f149124x.string(R$string.f18352a5) : "";
        }
        if (u59.m191811T()) {
            strString = pi6Var.f149124x.getString(R$string.f17883Kg);
        }
        this.f25856b.setText(strString);
        xdl0.m208345M0(this.f25867m, true);
        if (upa.m194847z()) {
            rd6.m178877k0(this.f25856b, this.f25867m);
        } else {
            this.f25867m.setTextColor(getResources().getColor(w0c0.f183846f0));
        }
        this.f25867m.setText(mqi0.m155932G(pi6Var.f149101a.latestTime));
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ void m42480M0(RunnableC4733c0.b bVar) {
        m42484e1();
    }

    @Override // p149l.cpl
    /* JADX INFO: renamed from: P */
    public void mo42421P(pi6 pi6Var) {
        this.f25868n = pi6Var;
        boolean zM81303a = NullChecker.m81303a(Double.valueOf(pi6Var.f149091G));
        VText vText = this.f25867m;
        if (zM81303a) {
            vText.setText(mqi0.m155932G(pi6Var.f149091G));
        } else {
            vText.setText("");
        }
        m42488i1();
    }

    @Override // p149l.cpl
    /* JADX INFO: renamed from: Q0 */
    public void mo42409Q0(pi6 pi6Var) {
        this.f25868n = pi6Var;
        this.f25867m.setCompoundDrawables(null, null, null, null);
        boolean z = upa.m194777l().enabled;
        VText vText = this.f25867m;
        if (z) {
            vText.setText(mqi0.m155932G(pi6Var.f149101a.latestTime));
        } else {
            vText.setText(mqi0.m155932G(pi6Var.f149101a.latestTime));
        }
        if (CoreModule.f17545c.f19642f0.m32913bo(pi6Var.f149102b, pi6Var.f149101a) && TEnum.equals(pi6Var.f149101a.additional.tag.type, "birthday")) {
            xdl0.m208344M(this.f25860f, true);
            this.f25860f.setImageResource(x2c0.f190777ze);
        }
        xdl0.m208345M0(this.f25867m, true);
        long j = 0;
        if (m178926i0(pi6Var.f149101a)) {
            try {
                String str = CoreModule.f17545c.f19639e0.f149482u3.get();
                long jOptLong = (!TextUtils.isEmpty(str) ? new JSONObject(str) : new JSONObject()).optLong(pi6Var.f149101a.f56011id, 0L);
                if (m178920b0(pi6Var.f149101a.f56011id, str) && jOptLong > 0 && mqi0.m155944o() < jOptLong) {
                    HashSet<String> hashSet = CoreModule.f17545c.f19639e0.f149447p3.get();
                    HashSet<String> hashSet2 = CoreModule.f17545c.f19639e0.f149454q3.get();
                    if (hashSet.contains(pi6Var.f149101a.f56011id) && !hashSet2.contains(pi6Var.f149101a.f56011id)) {
                        xdl0.m208345M0(this.f25867m, false);
                    }
                }
            } catch (Exception unused) {
            }
        }
        if (upa.m194847z()) {
            rd6.m178877k0(this.f25856b, this.f25867m);
        } else {
            this.f25867m.setTextColor(getResources().getColor(w0c0.f183846f0));
        }
        xdl0.m208344M(this.f25859e, false);
        setComplimentTagIcon(pi6Var);
        xdl0.m208344M(this.f25858d, xdl0.m208349O0(this.f25866l));
        m42487h1(pi6Var.f149125y, pi6Var.f149101a.convType);
        m42483d1(pi6Var.f149102b);
        if (NullChecker.m81303a(pi6Var.f149101a) && TextUtils.equals(pi6Var.f149101a.convType, ConversationType.intlSeeChatRequest)) {
            m42481b1(pi6Var.f149102b);
            return;
        }
        if (u59.m191823d0() && NullChecker.m81303a(pi6Var.f149101a) && "lovebuzz".equals(pi6Var.f149101a.convType)) {
            if (NullChecker.m81303a(pi6Var.f149101a.property) && NullChecker.m81303a(pi6Var.f149101a.property.intl_love_buzz)) {
                j = pi6Var.f149101a.property.intl_love_buzz.expire;
            }
            int i = !CoreModule.m29935P().m94652b().mo35133zo(pi6Var.f149101a) ? pi6Var.f149085A : 100;
            if (pi6Var.f149102b.unilateralBlock() || i >= 100) {
                CoreModule.f17554l.m94652b().mo35094Dj(this.f25867m, Double.valueOf(pi6Var.f149101a.latestTime));
            } else {
                xdl0.m208344M(this.f25867m, true);
                CoreModule.m29935P().m94652b().mo35119mf(pi6Var.f149124x, this.f25867m, CoreModule.m29935P().m94652b().mo35102Uq(j));
            }
        }
        if (m178927j(pi6Var.f149101a) || m178916Z0(pi6Var.f149101a)) {
            xdl0.m208344M(this.f25867m, false);
        }
        m42485f1(pi6Var);
        m42482c1(pi6Var);
        m42486g1(pi6Var);
        m42488i1();
        mo42414y0();
    }

    @Override // p149l.cpl
    /* JADX INFO: renamed from: U */
    public void mo42422U(@NonNull pi6 pi6Var) {
        this.f25856b.setText("想结婚消息");
        this.f25867m.setText(mqi0.m155932G(pi6Var.f149101a.latestTime));
    }

    @Override // p149l.cpl
    /* JADX INFO: renamed from: X0 */
    public void mo42423X0(pi6 pi6Var) {
        this.f25856b.setText("城市封面 好友申请");
        this.f25867m.setText(mqi0.m155932G(pi6Var.f149101a.latestTime));
    }

    /* JADX INFO: renamed from: b1 */
    public void m42481b1(User user) {
        this.f25856b.setText(user.name);
        if (r6n.m178068i(user.location.updatedTime)) {
            this.f25867m.setText(R$string.f18860ql);
            this.f25867m.setTextColor(Color.parseColor("#00c853"));
            this.f25867m.setTypeface(eqh0.m117752c(3));
            this.f25868n.f149109i = "online";
            xdl0.m208345M0(this.f25867m, true);
            return;
        }
        boolean zM178075j = r6n.m178067f().m178075j(user.location.distance);
        VText vText = this.f25867m;
        if (!zM178075j) {
            xdl0.m208345M0(vText, false);
            this.f25868n.f149109i = "normal";
        } else {
            vText.setText(m178892H0(user.location.distance));
            this.f25867m.setTextColor(Color.parseColor("#f8ae1d"));
            this.f25868n.f149109i = "nearby";
            xdl0.m208345M0(this.f25867m, true);
        }
    }

    /* JADX INFO: renamed from: c1 */
    public final void m42482c1(pi6 pi6Var) {
        if (m178935q(pi6Var)) {
            xdl0.m208344M(this.f25867m, false);
        }
    }

    @Override // p149l.cpl
    /* JADX INFO: renamed from: d */
    public void mo42424d(pi6 pi6Var) {
        this.f25868n = pi6Var;
        this.f25856b.setTextColor(getContext().getResources().getColor(w0c0.f183796P1));
        if (NullChecker.m81303a(pi6Var.f149102b)) {
            this.f25856b.setText(pi6Var.f149102b.name);
        }
        this.f25867m.setText(mqi0.m155932G(pi6Var.f149101a.latestTime));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x006e  */
    @Override // p149l.cpl
    /* JADX INFO: renamed from: d0 */
    public void mo42425d0(pi6 pi6Var) {
        this.f25868n = pi6Var;
        this.f25856b.setTextColor(pi6Var.f149124x.color(w0c0.f183796P1));
        this.f25856b.setText(m178888D0(pi6Var.f149102b.name, pi6Var.f149125y, true));
        String strM169561y7 = CoreModule.f17545c.f19639e0.m169561y7(pi6Var.f149102b.f56011id);
        if (!TextUtils.isEmpty(strM169561y7)) {
            this.f25856b.setText(m178888D0(strM169561y7, pi6Var.f149125y, true));
        } else if (TextUtils.isEmpty(strM169561y7) && upa.m194819t1()) {
            if (NullChecker.m81303a(pi6Var.f149102b)) {
                User user = pi6Var.f149102b;
                if (user.inactivated) {
                    this.f25856b.setText("已注销");
                } else if (user.status.contains(UserStatus.get(UserStatus.RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN))) {
                    this.f25856b.setText("昵称已重置");
                }
            } else {
                this.f25856b.setText("已注销");
            }
        }
        this.f25856b.requestLayout();
        xdl0.m208344M(this.f25862h, false);
        xdl0.m208344M(this.f25861g, false);
        xdl0.m208344M(this.f25858d, false);
        m42488i1();
    }

    /* JADX INFO: renamed from: d1 */
    public final void m42483d1(User user) {
        boolean zM200296J = vwb.m200296J(user.profile.extensions.interest.emoji);
        VDraweeView vDraweeView = this.f25857c;
        if (zM200296J) {
            xdl0.m208344M(vDraweeView, false);
            return;
        }
        xdl0.m208344M(vDraweeView, false);
        qib0.f154691G.m102331L0(this.f25857c, qib0.f154709X.m126254n(user.profile.extensions.interest.emoji.get(0)) + ".png");
    }

    @Override // p149l.cpl
    /* JADX INFO: renamed from: e */
    public void mo42413e(pi6 pi6Var) {
        this.f25868n = pi6Var;
        this.f25856b.setText(m178888D0(pi6Var.f149086B.name, pi6Var.f149125y, true));
        xdl0.m208345M0(this.f25867m, true);
        if (upa.m194847z()) {
            rd6.m178877k0(this.f25856b, this.f25867m);
        } else {
            this.f25867m.setTextColor(getResources().getColor(w0c0.f183846f0));
        }
        this.f25867m.setText(mqi0.m155932G(pi6Var.f149101a.latestTime));
        if (pi6Var.f149121u && NullChecker.m81303a(pi6Var.f149123w)) {
            this.f25856b.setText(pi6Var.f149123w.name);
        }
        mo42414y0();
        m42488i1();
    }

    /* JADX INFO: renamed from: e1 */
    public final boolean m42484e1() {
        emr emrVar = emr.INSTANCE;
        String strM117223e = emrVar.m117223e();
        long jM155944o = mqi0.m155944o();
        if (SeeTrialStatusType.trialing.equals(strM117223e)) {
            this.f25864j.setBackgroundResource(x2c0.f189506L5);
            this.f25864j.setTextColor(-1);
            long jM141776m3 = CoreModule.f17545c.f19554B2.m141776m3();
            this.f25864j.setText(String.format("%s后失效", jM141776m3 > jM155944o ? CoreModule.f17545c.f19685t1.m31507k(jM141776m3 - jM155944o) : "00:00:00"));
            xdl0.m208344M(this.f25864j, true);
            return false;
        }
        if (!SeeTrialStatusType.trialEnd.equals(strM117223e) && !"waiting".equals(strM117223e) && !"expired".equals(strM117223e)) {
            xdl0.m208344M(this.f25864j, false);
            return false;
        }
        long jM141776m4 = CoreModule.f17545c.f19554B2.m141776m3();
        if (jM141776m4 <= 0 && SeeTrialStatusType.trialEnd.equals(strM117223e)) {
            jM141776m4 = xma.m210092s3() + (CoreModule.f17545c.f19598Q1.f20117R.m34752F() * 1000);
        }
        this.f25864j.setBackgroundResource(x2c0.f189475K5);
        this.f25864j.setTextColor(CoreModule.f17544b.getResources().getColor(w0c0.f183761E));
        this.f25864j.setText(String.format("%s内可恢复", jM141776m4 > jM155944o ? emrVar.m117221c(jM141776m4 - jM155944o) : "0分钟"));
        xdl0.m208344M(this.f25864j, true);
        return true;
    }

    /* JADX INFO: renamed from: f1 */
    public void m42485f1(@NonNull pi6 pi6Var) {
        if (m178934p0(pi6Var.f149101a)) {
            if (TextUtils.isEmpty(pi6Var.f149101a.property.conversationTag.suggestText) && TextUtils.isEmpty(pi6Var.f149101a.property.conversationTag.emoji)) {
                return;
            }
            Conversation conversation = pi6Var.f149101a;
            if (conversation.unreadMessages <= 0) {
                if (TextUtils.isEmpty(conversation.property.conversationTag.suggestExpireTime) || (!TextUtils.isEmpty(pi6Var.f149101a.property.conversationTag.suggestExpireTime) && mqi0.m155944o() < Long.parseLong(pi6Var.f149101a.property.conversationTag.suggestExpireTime) * 1000)) {
                    xdl0.m208344M(this.f25867m, false);
                }
            }
        }
    }

    /* JADX INFO: renamed from: g1 */
    public final void m42486g1(pi6 pi6Var) {
        if (NullChecker.m81303a(pi6Var) && NullChecker.m81303a(pi6Var.f149101a)) {
            Conversation conversation = pi6Var.f149101a;
            if (conversation.unreadMessages == 0 && vmf0.m198948a(conversation)) {
                xdl0.m208344M(this.f25867m, false);
            }
        }
    }

    @Override // p149l.rd6
    public /* bridge */ /* synthetic */ HashMap getUserLiveLabelHashMap() {
        return super.getUserLiveLabelHashMap();
    }

    @Override // p149l.cpl
    /* JADX INFO: renamed from: h0 */
    public void mo41007h0(pi6 pi6Var) {
        this.f25868n = pi6Var;
        this.f25856b.setTextColor(getContext().getResources().getColor(w0c0.f183796P1));
        this.f25856b.setText(R$string.f17697Ea);
    }

    /* JADX INFO: renamed from: h1 */
    public final void m42487h1(String str, String str2) {
        boolean zEquals = TextUtils.equals("conversation_intl_fake", str2);
        VText vText = this.f25856b;
        if (zEquals) {
            vText.setText(m178888D0(this.f25868n.f149102b.name + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + i0g0.m133876p(this.f25868n.f149102b.location.distance, true), str, true));
        } else {
            vText.setText(m178888D0(this.f25868n.f149102b.name, str, true));
        }
        String strM169561y7 = CoreModule.f17545c.f19639e0.m169561y7(this.f25868n.f149102b.f56011id);
        if (!TextUtils.isEmpty(strM169561y7)) {
            this.f25856b.setText(m178888D0(strM169561y7, str, true));
            return;
        }
        if (TextUtils.isEmpty(strM169561y7) && upa.m194819t1()) {
            if (NullChecker.m81303a(this.f25868n.f149102b)) {
                User user = this.f25868n.f149102b;
                if (!user.inactivated) {
                    if (user.status.contains(UserStatus.get(UserStatus.RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN))) {
                        this.f25856b.setText("昵称已重置");
                        return;
                    }
                    return;
                }
            }
            this.f25856b.setText("已注销");
        }
    }

    /* JADX INFO: renamed from: i1 */
    public void m42488i1() {
        pi6 pi6Var = this.f25868n;
        if (pi6Var.f149115o && pi6Var.f149121u && TextUtils.equals(CoreModule.m29931H().userId(), this.f25868n.f149118r)) {
            this.f25856b.setText(CoreModule.f17545c.f19639e0.m169527p9().name);
        }
    }

    @Override // p149l.cpl
    /* JADX INFO: renamed from: m */
    public void mo41013m(pi6 pi6Var) {
        this.f25868n = pi6Var;
        this.f25858d.setVisibility(8);
        xdl0.m208344M(this.f25867m, false);
        this.f25856b.setCompoundDrawables(null, null, null, null);
    }

    @Override // p149l.cpl
    /* JADX INFO: renamed from: m0 */
    public void mo41014m0(pi6 pi6Var) {
        List<Conversation> list = pi6Var.f149100P;
        this.f25856b.setTypeface(Typeface.defaultFromStyle(1));
        this.f25856b.setText(i0g0.m133847N(String.format(Locale.getDefault(), "%s个好友待恢复", Integer.valueOf(list.size())), getResources().getColor(w0c0.f183773I), eqh0.m117752c(3)));
        m42484e1();
        xdl0.m208344M(this.f25859e, false);
        xdl0.m208344M(this.f25867m, false);
        xdl0.m208344M(this.f25858d, true);
        pi6Var.f149104d.mo67374c((Act) getContext(), CoreModule.f17545c.f19685t1.m31509n("countdown_item_limited_trial_see" + pi6Var.f149101a.f56011id)).subscribe(mkd0.m154955G(new e30() { // from class: l.kb6
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f122215a.m42480M0((RunnableC4733c0.b) obj);
            }
        }));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m42479B(this);
        xdl0.m208368c0(this.f25856b, t100.m186890d(2.0f));
        this.f25856b.setTypeface(Typeface.DEFAULT_BOLD);
        if (upa.m194847z()) {
            rd6.m178877k0(this.f25856b, this.f25867m);
        }
    }

    @Override // p149l.bpl
    public /* bridge */ /* synthetic */ void setPicPercent(float f) {
        super.setPicPercent(f);
    }

    @Override // p149l.cpl
    /* JADX INFO: renamed from: t0 */
    public void mo41022t0(pi6 pi6Var) {
        this.f25868n = pi6Var;
        this.f25858d.setVisibility(8);
        xdl0.m208344M(this.f25864j, false);
        xdl0.m208344M(this.f25860f, false);
        this.f25856b.setTextColor(pi6Var.f149124x.color(w0c0.f183796P1));
        this.f25856b.setCompoundDrawables(null, null, null, null);
        if (pi6Var.f149122v && NullChecker.m81303a(pi6Var.f149102b)) {
            xdl0.m208345M0(this.f25867m, false);
            if (pi6Var.f149102b.isBanedOrInactivated()) {
                return;
            }
            this.f25856b.setText(pi6Var.f149102b.name);
            return;
        }
        if (m178931n0(pi6Var)) {
            HashSet<String> hashSet = CoreModule.f17545c.f19639e0.f149447p3.get();
            HashSet<String> hashSet2 = CoreModule.f17545c.f19639e0.f149454q3.get();
            if (hashSet.contains(pi6Var.f149101a.f56011id) && !hashSet2.contains(pi6Var.f149101a.f56011id)) {
                xdl0.m208344M(this.f25867m, false);
            }
        }
        if (m178916Z0(pi6Var.f149101a)) {
            xdl0.m208344M(this.f25867m, false);
        }
    }

    @Override // p149l.bpl
    /* JADX INFO: renamed from: y0 */
    public void mo42414y0() {
        if (m178914Y(this.f25868n.f149101a)) {
            xdl0.m208344M(this.f25867m, false);
        }
    }

    @Override // p149l.cpl
    /* JADX INFO: renamed from: z0 */
    public void mo41028z0(Conversation conversation, User user, pi6 pi6Var) {
        this.f25868n = pi6Var;
        if (NullChecker.m81303a(pi6Var.f149101a) && pi6Var.f149101a.localEverHasMessage) {
            return;
        }
        this.f25856b.setText(R$string.f17945Mi);
    }

    public ConversationItemTitleView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConversationItemTitleView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
