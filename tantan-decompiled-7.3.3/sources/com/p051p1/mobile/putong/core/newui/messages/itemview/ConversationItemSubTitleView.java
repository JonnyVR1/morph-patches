package com.p051p1.mobile.putong.core.newui.messages.itemview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.ChatMM;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.ConversationAdditional;
import com.p051p1.mobile.putong.core.data.ConversationType;
import com.p051p1.mobile.putong.core.data.InsertConversationUser;
import com.p051p1.mobile.putong.core.data.InsertConversationsList;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.data.OperationTopicInfo;
import com.p051p1.mobile.putong.core.data.SeeTrialStatusType;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import p151v.VImage;
import p151v.VText;
import p153l.Cfor;
import p153l.a9g0;
import p153l.bnl0;
import p153l.c17;
import p153l.c9c0;
import p153l.cc6;
import p153l.dbc0;
import p153l.dvf0;
import p153l.g1t;
import p153l.gra;
import p153l.hxj0;
import p153l.i4g0;
import p153l.jek;
import p153l.joa;
import p153l.jyb;
import p153l.kj6;
import p153l.lyh0;
import p153l.m4s;
import p153l.ndg0;
import p153l.orl;
import p153l.pf60;
import p153l.pri0;
import p153l.q8g0;
import p153l.qa00;
import p153l.qcj;
import p153l.qte;
import p153l.r8n;
import p153l.sj6;
import p153l.u7n;
import p153l.ue6;
import p153l.vb0;
import p153l.vnb;
import p153l.z6m;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationItemSubTitleView extends LinearLayout implements orl {

    /* JADX INFO: renamed from: a */
    public ConversationItemSubTitleView f26588a;

    /* JADX INFO: renamed from: b */
    public VImage f26589b;

    /* JADX INFO: renamed from: c */
    public VText f26590c;

    /* JADX INFO: renamed from: d */
    public View f26591d;

    /* JADX INFO: renamed from: e */
    public VText f26592e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f26593f;

    /* JADX INFO: renamed from: g */
    public VText f26594g;

    /* JADX INFO: renamed from: h */
    public VText f26595h;

    /* JADX INFO: renamed from: i */
    public sj6 f26596i;

    public class NoUnderlineSpan extends URLSpan {
        public NoUnderlineSpan(String str) {
            super(str);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    public ConversationItemSubTitleView(@NonNull Context context) {
        super(context);
    }

    @NonNull
    /* JADX INFO: renamed from: c1 */
    public static SpannableStringBuilder m43478c1(sj6 sj6Var, int i) {
        int iColor = gra.m131778z() ? sj6.f168908T : sj6Var.f168949x.color(c9c0.f80442o);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (i <= 0) {
            spannableStringBuilder.append(c17.m107526s0("试用到期", iColor));
            return spannableStringBuilder;
        }
        spannableStringBuilder.append(c17.m107526s0("试用到期 · ", iColor));
        spannableStringBuilder.append(kj6.m150010f(String.format(Locale.CHINA, "%s条新消息", Integer.valueOf(i)), sj6Var.f168949x.color(c9c0.f80342I)));
        return spannableStringBuilder;
    }

    private g1t getIntlLiveView() {
        if (this.f26593f.getChildCount() > 0 && (this.f26593f.getChildAt(0) instanceof g1t)) {
            return (g1t) this.f26593f.getChildAt(0);
        }
        g1t g1tVarMo68428Uf = CoreModule.m30934Q().mo68428Uf(getContext());
        this.f26593f.removeAllViews();
        this.f26593f.addView(g1tVarMo68428Uf.getView());
        return g1tVarMo68428Uf;
    }

    private void setError(Message message) {
        if (CoreModule.m30933P().m143405a().mo34397Qb() && this.f26596i.f168926a.isLimitedTrialSee(CoreModule.m30929H().userId()) && !joa.m146361M3() && !CoreModule.f18264c.f20381e0.m116600p9().isFemale()) {
            Cfor cfor = Cfor.INSTANCE;
            if (SeeTrialStatusType.trialEnd.equals(cfor.m126494e()) || "waiting".equals(cfor.m126494e()) || "expired".equals(cfor.m126494e())) {
                return;
            }
        }
        Drawable drawable = this.f26596i.f168949x.getResources().getDrawable(dbc0.f87319pi);
        drawable.setBounds(0, 0, qa00.m175859d(13.0f), qa00.m175859d(13.0f));
        this.f26592e.setCompoundDrawables(null, null, drawable, null);
        this.f26592e.setCompoundDrawablePadding(qa00.m175859d(12.0f));
        if (NullChecker.m82486a(message) && TEnum.equals(message.status(), "failed") && !this.f26596i.f168927b.unilateralBlock()) {
            Drawable drawable2 = this.f26596i.f168949x.getResources().getDrawable(gra.m131778z() ? dbc0.f87546wg : dbc0.f86720X7);
            drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
            this.f26592e.setCompoundDrawables(null, null, drawable2, null);
        }
        if (NullChecker.m82486a(this.f26596i.f168926a) && TextUtils.equals(this.f26596i.f168926a.convType, ConversationType.intlSeeChatRequest)) {
            this.f26592e.setCompoundDrawables(null, null, null, null);
            Drawable drawable3 = this.f26596i.f168949x.getResources().getDrawable(dbc0.f87434t1);
            drawable3.setBounds(0, 0, qa00.m175859d(10.0f), qa00.m175859d(10.0f));
            InsertConversationsList insertConversationsListM222761e = r8n.m180219f().f161728b.m222761e();
            if (NullChecker.m82486a(insertConversationsListM222761e) && NullChecker.m82486a(insertConversationsListM222761e.users)) {
                InsertConversationUser insertConversationUser = (InsertConversationUser) jyb.m147529r(insertConversationsListM222761e.users, new qcj() { // from class: l.bc6
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return this.f76102a.m43485d1((InsertConversationUser) obj);
                    }
                });
                if (NullChecker.m82486a(insertConversationUser) && insertConversationUser.clicked.booleanValue()) {
                    this.f26592e.setCompoundDrawables(null, null, null, null);
                } else {
                    this.f26592e.setCompoundDrawables(null, null, drawable3, null);
                }
            }
        }
    }

    private void setRedDot(Message message) {
        bnl0.m105524M(this.f26594g, false);
    }

    private void setSparkIcon(pf60<SpannableStringBuilder, z6m> pf60Var) {
        sj6 sj6Var;
        Conversation conversation;
        ConversationAdditional conversationAdditional;
        ChatMM chatMM;
        bnl0.m105524M(this.f26589b, false);
        if (!(pf60Var.f152157b instanceof dvf0) || (sj6Var = this.f26596i) == null || (conversation = sj6Var.f168926a) == null || (conversationAdditional = conversation.additional) == null || (chatMM = conversationAdditional.chatMM) == null) {
            return;
        }
        int i = chatMM.level;
        if (i == 2) {
            bnl0.m105524M(this.f26589b, true);
            this.f26589b.setBackgroundResource(dbc0.f86782Z5);
            return;
        }
        VImage vImage = this.f26589b;
        if (i <= 2) {
            bnl0.m105524M(vImage, false);
        } else {
            bnl0.m105524M(vImage, true);
            this.f26589b.setBackgroundResource(dbc0.f86815a6);
        }
    }

    private void setSubtitleContent(Message message) throws IOException {
        if (CoreModule.m30933P().m143405a().mo34397Qb() && this.f26596i.f168926a.isLimitedTrialSee(CoreModule.m30929H().userId()) && !joa.m146361M3() && !CoreModule.f18264c.f20381e0.m116600p9().isFemale()) {
            Cfor cfor = Cfor.INSTANCE;
            if (SeeTrialStatusType.trialEnd.equals(cfor.m126494e()) || "waiting".equals(cfor.m126494e()) || "expired".equals(cfor.m126494e())) {
                sj6 sj6Var = this.f26596i;
                this.f26592e.setText(m43478c1(sj6Var, sj6Var.f168926a.unreadMessages));
                return;
            }
        }
        pf60<SpannableStringBuilder, z6m> pf60VarM162709e = ndg0.m162709e(this.f26596i, message);
        SpannableStringBuilder spannableStringBuilderM162707c = pf60VarM162709e.f152156a;
        if (TextUtils.isEmpty(spannableStringBuilderM162707c)) {
            spannableStringBuilderM162707c = ndg0.m162707c(this.f26596i);
        }
        if (!TextUtils.equals(this.f26592e.getText(), spannableStringBuilderM162707c)) {
            this.f26592e.setText(m43487f1(hxj0.m137614c(spannableStringBuilderM162707c)));
        }
        setSparkIcon(pf60VarM162709e);
    }

    @Override // p153l.orl
    /* JADX INFO: renamed from: A */
    public void mo41998A(sj6 sj6Var) {
        this.f26596i = sj6Var;
        this.f26592e.setCompoundDrawables(null, null, null, null);
        this.f26592e.setText("");
        bnl0.m105524M(this.f26588a, false);
    }

    /* JADX INFO: renamed from: B */
    public final void m43480B(View view) {
        cc6.m108702a(this, view);
    }

    @Override // p153l.orl
    /* JADX INFO: renamed from: E */
    public void mo43481E(sj6 sj6Var) throws IOException {
        bnl0.m105524M(this.f26594g, false);
        if (sj6Var == null) {
            this.f26592e.setText("");
            return;
        }
        this.f26596i = sj6Var;
        setSubtitleContent(sj6Var.f168918I);
        m195687I(sj6Var, this.f26594g, false, sj6Var.f168926a.unreadMessages > 0);
    }

    @Override // p153l.orl
    /* JADX INFO: renamed from: F0 */
    public void mo41999F0(sj6 sj6Var) {
        this.f26596i = sj6Var;
        bnl0.m105524M(this.f26594g, false);
    }

    @Override // p153l.orl
    /* JADX INFO: renamed from: G0 */
    public void mo43430G0(sj6 sj6Var) {
        this.f26596i = sj6Var;
        this.f26592e.setText(m43482M0("特邀嘉宾", CoreModule.f18264c.f20384f0.f20635R0.get()));
    }

    /* JADX INFO: renamed from: M0 */
    public CharSequence m43482M0(String str, CharSequence charSequence) {
        return c17.m107521n0(str, charSequence);
    }

    @Override // p153l.nrl
    /* JADX INFO: renamed from: O */
    public boolean mo43483O() {
        return (!NullChecker.m82486a(this.f26592e.getCompoundDrawables()) || this.f26592e.getCompoundDrawables()[2] == null || this.f26592e.getCompoundDrawables()[2] == getContext().getResources().getDrawable(dbc0.f86720X7)) ? false : true;
    }

    @Override // p153l.orl
    /* JADX INFO: renamed from: P */
    public void mo43432P(sj6 sj6Var) {
        this.f26596i = sj6Var;
        if (!sj6Var.f168946u || !TextUtils.equals(sj6Var.f168943r, CoreModule.m30929H().userId())) {
            int i = sj6Var.f168917H;
            if (i == 0 || sj6Var.f168918I == null) {
                this.f26592e.setText(getContext().getString(R$string.f18727Oa, Integer.valueOf(sj6Var.f168923N)));
                this.f26592e.setCompoundDrawables(null, null, null, null);
            } else {
                String strM96571f = a9g0.m96571f(i);
                pri0 pri0Var = new pri0(strM96571f, qa00.m175859d(16.0f), qa00.m175861f(10), lyh0.m156283c(3), -1, pri0.f153792k, getResources().getColor(c9c0.f80398a1));
                pri0Var.setBounds(0, 0, qa00.m175859d(((strM96571f.length() - 1) * 6) + 16), qa00.m175859d(16.0f));
                this.f26592e.setCompoundDrawables(null, null, pri0Var, null);
                this.f26592e.setCompoundDrawablePadding(qa00.m175859d(23.0f));
                boolean zM200646h = vb0.m200646h(sj6Var.f168918I.cid);
                VText vText = this.f26592e;
                if (zM200646h) {
                    vText.setText(getContext().getResources().getString(R$string.f18533I));
                } else {
                    vText.setText(sj6Var.f168918I.value);
                }
            }
        }
        m43488g1();
    }

    @Override // p153l.orl
    /* JADX INFO: renamed from: Q0 */
    public void mo43420Q0(sj6 sj6Var) throws IOException {
        this.f26596i = sj6Var;
        if (m195708Y(sj6Var.f168926a)) {
            return;
        }
        Message messageM195727p = m195727p(sj6Var);
        if (NullChecker.m82486a(messageM195727p)) {
            OperationTopicInfo operationTopicInfo = messageM195727p.getOperationTopicInfo();
            sj6Var.f168937l = NullChecker.m82486a(operationTopicInfo) ? operationTopicInfo.operationId : "";
        }
        if (NullChecker.m82486a(messageM195727p) && TEnum.equals(messageM195727p.messageType, MessageType.common_tip) && NullChecker.m82486a(messageM195727p.extData) && !TextUtils.isEmpty(messageM195727p.extData.extra) && TextUtils.equals(messageM195727p.extData.extra, "pat") && TextUtils.isEmpty(messageM195727p.extData.extra2) && !CoreModule.f18264c.f20384f0.f20702n2.contains(messageM195727p.f56859id)) {
            CoreModule.f18264c.f20384f0.f20702n2.add(messageM195727p.f56859id);
        }
        if (NullChecker.m82486a(sj6Var.f168927b)) {
            CoreModule.f18264c.f20384f0.f20693k2.remove(sj6Var.f168927b.f56859id);
        }
        setSubtitleContent(messageM195727p);
        m43484b1();
        boolean zMo95724a = u7n.m194877d().mo95724a(sj6Var, messageM195727p);
        bnl0.m105524M(this.f26591d, zMo95724a);
        bnl0.m105524M(this.f26590c, zMo95724a);
        this.f26590c.setText(u7n.m194877d().mo95725b(sj6Var, messageM195727p));
        setRedDot(messageM195727p);
        m43486e1(sj6Var);
        setError(messageM195727p);
        m43488g1();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    @Override // p153l.orl
    /* JADX INFO: renamed from: X0 */
    public void mo43434X0(sj6 sj6Var) {
        String str;
        bnl0.m105524M(this.f26594g, false);
        if (sj6Var.f168927b.isMe()) {
            this.f26592e.setText("暂无新的好友请求");
            return;
        }
        if (!NullChecker.m82486a(sj6Var.f168918I)) {
            str = "";
        } else if (TEnum.equals(sj6Var.f168918I.messageType, "text") && !TextUtils.isEmpty(sj6Var.f168918I.value)) {
            str = sj6Var.f168918I.value;
        } else if (TEnum.equals(sj6Var.f168918I.messageType, "picture")) {
            str = "[图片]";
        } else {
            str = "";
        }
        this.f26592e.setText(m43482M0(jek.m144583o(sj6Var.f168927b.name), str));
        i4g0.m138492A("e_city_cover_received_greet", OMSDialogPositon.p_messages_view, jyb.m147494Y("city_c_cell_uid", sj6Var.f168926a.otherUser));
        m195687I(sj6Var, this.f26594g, false, sj6Var.f168926a.unreadMessages > 0);
    }

    /* JADX INFO: renamed from: b1 */
    public final void m43484b1() {
        bnl0.m105524M(this.f26593f, false);
        m4s m4sVarMo127340k = CoreModule.m30934Q().mo68412M6().mo127340k();
        if (!NullChecker.m82486a(m4sVarMo127340k) || !NullChecker.m82486a(this.f26596i.f168926a) || !this.f26596i.f168926a.f56859id.equals(User.ID_TEAM_ACCOUNT)) {
            bnl0.m105524M(this.f26593f, false);
            bnl0.m105524M(this.f26592e, true);
        } else if (gra.m131657a2()) {
            bnl0.m105524M(this.f26592e, false);
            bnl0.m105524M(this.f26593f, true);
            getIntlLiveView().mo71424P(m4sVarMo127340k);
        }
    }

    @Override // p153l.orl
    /* JADX INFO: renamed from: d */
    public void mo43435d(sj6 sj6Var) {
        this.f26596i = sj6Var;
        bnl0.m105525M0(this.f26588a, true);
        if (sj6Var.f168926a.unreadMessages > 0) {
            Drawable drawable = getResources().getDrawable(dbc0.f87434t1);
            drawable.setBounds(0, 0, qa00.m175859d(10.0f), qa00.m175859d(10.0f));
            this.f26592e.setCompoundDrawables(null, null, drawable, null);
            this.f26592e.setCompoundDrawablePadding(qa00.m175859d(23.0f));
        } else {
            this.f26592e.setCompoundDrawables(null, null, null, null);
            this.f26592e.setCompoundDrawablePadding(qa00.m175859d(0.0f));
        }
        Message messageM195727p = m195727p(sj6Var);
        if (NullChecker.m82486a(messageM195727p)) {
            boolean zM200646h = vb0.m200646h(messageM195727p.owner);
            VText vText = this.f26592e;
            if (zM200646h) {
                vText.setText(getContext().getResources().getString(R$string.f18533I));
            } else {
                vText.setText(messageM195727p.value);
            }
        }
    }

    @Override // p153l.orl
    /* JADX INFO: renamed from: d0 */
    public void mo43436d0(sj6 sj6Var) {
        this.f26596i = sj6Var;
        m43488g1();
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ Boolean m43485d1(InsertConversationUser insertConversationUser) {
        return Boolean.valueOf(TextUtils.equals(insertConversationUser.userId, this.f26596i.f168927b.f56859id));
    }

    /* JADX INFO: renamed from: e1 */
    public final void m43486e1(@NonNull sj6 sj6Var) {
        if (!CoreModule.m30933P().m143405a().mo34397Qb() || !sj6Var.f168926a.isLimitedTrialSee(CoreModule.m30929H().userId()) || joa.m146361M3() || CoreModule.f18264c.f20381e0.m116600p9().isFemale()) {
            return;
        }
        Cfor cfor = Cfor.INSTANCE;
        if (SeeTrialStatusType.trialEnd.equals(cfor.m126494e()) || "waiting".equals(cfor.m126494e())) {
            return;
        }
        "expired".equals(cfor.m126494e());
    }

    /* JADX INFO: renamed from: f1 */
    public CharSequence m43487f1(CharSequence charSequence) {
        SpannableString spannableString = new SpannableString(charSequence);
        try {
            URLSpan[] uRLSpanArr = (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class);
            if (uRLSpanArr.length > 0) {
                for (URLSpan uRLSpan : uRLSpanArr) {
                    int spanStart = spannableString.getSpanStart(uRLSpan);
                    int spanEnd = spannableString.getSpanEnd(uRLSpan);
                    spannableString.removeSpan(uRLSpan);
                    spannableString.setSpan(new NoUnderlineSpan(uRLSpan.getURL()), spanStart, spanEnd, 0);
                }
            }
        } catch (Exception unused) {
        }
        return spannableString;
    }

    /* JADX INFO: renamed from: g1 */
    public void m43488g1() {
        sj6 sj6Var = this.f26596i;
        if (sj6Var.f168940o) {
            boolean z = (!NullChecker.m82486a(sj6Var.f168926a) || TextUtils.isEmpty(this.f26596i.f168941p) || TextUtils.equals("group", this.f26596i.f168926a.convType)) ? false : true;
            bnl0.m105524M(this.f26592e, z);
            bnl0.m105524M(this.f26588a, z);
            if (z) {
                qte.m177919b(this.f26592e, Html.fromHtml(this.f26596i.f168942q).toString(), this.f26596i.f168945t, getContext().getResources().getColor(c9c0.f80342I), true, true);
                for (int i = 0; i < this.f26588a.getChildCount(); i++) {
                    View childAt = this.f26588a.getChildAt(i);
                    if (childAt != this.f26592e) {
                        bnl0.m105524M(childAt, false);
                    }
                }
            }
            boolean z2 = NullChecker.m82486a(this.f26596i.f168926a) && !TextUtils.isEmpty(this.f26596i.f168941p) && TextUtils.equals("group", this.f26596i.f168926a.convType);
            if (z || z2) {
                this.f26592e.setCompoundDrawables(null, null, null, null);
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
        this.f26596i = sj6Var;
        bnl0.m105525M0(this.f26588a, true);
        bnl0.m105524M(this.f26594g, false);
    }

    @Override // p153l.orl
    /* JADX INFO: renamed from: m0 */
    public void mo42025m0(sj6 sj6Var) {
        this.f26596i = sj6Var;
        int i = 0;
        vnb.m201946M(this.f26594g, false);
        if (!jyb.m147479J(sj6Var.f168925P)) {
            Iterator<Conversation> it = sj6Var.f168925P.iterator();
            while (it.hasNext()) {
                i += it.next().unreadMessages;
            }
        }
        this.f26592e.setText(m43478c1(sj6Var, i));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m43480B(this);
        if (gra.m131778z()) {
            ue6.m195667e0(this.f26592e);
        }
    }

    @Override // p153l.nrl
    /* JADX INFO: renamed from: r */
    public void mo43452r(SimpleDateFormat simpleDateFormat, long j, long j2, long j3) {
        if (j < j2) {
            Date date = new Date();
            date.setTime(j2 - j);
            this.f26592e.setText(String.format(getResources().getString(R$string.f19312hj), simpleDateFormat.format(date)));
        }
    }

    @Override // p153l.nrl
    public /* bridge */ /* synthetic */ void setPicPercent(float f) {
        super.setPicPercent(f);
    }

    @Override // p153l.orl
    /* JADX INFO: renamed from: t0 */
    public void mo42033t0(sj6 sj6Var) {
        this.f26596i = sj6Var;
        bnl0.m105524M(this.f26593f, false);
        bnl0.m105524M(this.f26592e, true);
        bnl0.m105524M(this.f26594g, false);
        bnl0.m105524M(this.f26595h, false);
        this.f26592e.setTypeface(lyh0.m156283c(2));
        if (!sj6Var.f168947v || !NullChecker.m82486a(sj6Var.f168927b)) {
            bnl0.m105524M(this.f26588a, !m195708Y(sj6Var.f168926a));
            return;
        }
        bnl0.m105524M(this.f26588a, true);
        this.f26592e.setText(q8g0.m175796b0("探探ID: " + sj6Var.f168927b.publicId, jyb.m147507f0(sj6Var.f168927b.publicId), sj6Var.f168949x.color(c9c0.f80342I), lyh0.m156283c(2)));
    }

    @Override // p153l.nrl
    /* JADX INFO: renamed from: y0 */
    public void mo43425y0() {
        if (m195708Y(this.f26596i.f168926a)) {
            bnl0.m105524M(this.f26588a, false);
        }
    }

    public ConversationItemSubTitleView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConversationItemSubTitleView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
