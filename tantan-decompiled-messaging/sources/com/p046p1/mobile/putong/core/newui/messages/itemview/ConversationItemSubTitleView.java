package com.p046p1.mobile.putong.core.newui.messages.itemview;

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
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.ChatMM;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.ConversationAdditional;
import com.p046p1.mobile.putong.core.data.ConversationType;
import com.p046p1.mobile.putong.core.data.InsertConversationUser;
import com.p046p1.mobile.putong.core.data.InsertConversationsList;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.data.OperationTopicInfo;
import com.p046p1.mobile.putong.core.data.SeeTrialStatusType;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import p147v.VImage;
import p147v.VText;
import p149l.cpl;
import p149l.emr;
import p149l.eoj0;
import p149l.eqh0;
import p149l.f5g0;
import p149l.fzs;
import p149l.hi6;
import p149l.hmb;
import p149l.i0g0;
import p149l.j4m;
import p149l.j760;
import p149l.l2s;
import p149l.mse;
import p149l.pi6;
import p149l.pii0;
import p149l.r6n;
import p149l.rd6;
import p149l.t0g0;
import p149l.t100;
import p149l.tbk;
import p149l.u5n;
import p149l.umf0;
import p149l.upa;
import p149l.vwb;
import p149l.w0c0;
import p149l.w9j;
import p149l.x2c0;
import p149l.xdl0;
import p149l.xma;
import p149l.za6;
import p149l.zb0;
import p149l.zvf0;
import p149l.zz6;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationItemSubTitleView extends LinearLayout implements cpl {

    /* JADX INFO: renamed from: a */
    public ConversationItemSubTitleView f25846a;

    /* JADX INFO: renamed from: b */
    public VImage f25847b;

    /* JADX INFO: renamed from: c */
    public VText f25848c;

    /* JADX INFO: renamed from: d */
    public View f25849d;

    /* JADX INFO: renamed from: e */
    public VText f25850e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f25851f;

    /* JADX INFO: renamed from: g */
    public VText f25852g;

    /* JADX INFO: renamed from: h */
    public VText f25853h;

    /* JADX INFO: renamed from: i */
    public pi6 f25854i;

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
    public static SpannableStringBuilder m42467c1(pi6 pi6Var, int i) {
        int iColor = upa.m194847z() ? pi6.f149083T : pi6Var.f149124x.color(w0c0.f183872o);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (i <= 0) {
            spannableStringBuilder.append(zz6.m221002s0("试用到期", iColor));
            return spannableStringBuilder;
        }
        spannableStringBuilder.append(zz6.m221002s0("试用到期 · ", iColor));
        spannableStringBuilder.append(hi6.m131201f(String.format(Locale.CHINA, "%s条新消息", Integer.valueOf(i)), pi6Var.f149124x.color(w0c0.f183773I)));
        return spannableStringBuilder;
    }

    private fzs getIntlLiveView() {
        if (this.f25851f.getChildCount() > 0 && (this.f25851f.getChildAt(0) instanceof fzs)) {
            return (fzs) this.f25851f.getChildAt(0);
        }
        fzs fzsVarMo67245Uf = CoreModule.m29936Q().mo67245Uf(getContext());
        this.f25851f.removeAllViews();
        this.f25851f.addView(fzsVarMo67245Uf.getView());
        return fzsVarMo67245Uf;
    }

    private void setError(Message message) {
        if (CoreModule.m29935P().m94651a().mo33394Qb() && this.f25854i.f149101a.isLimitedTrialSee(CoreModule.m29931H().userId()) && !xma.m210047L3() && !CoreModule.f17545c.f19639e0.m169527p9().isFemale()) {
            emr emrVar = emr.INSTANCE;
            if (SeeTrialStatusType.trialEnd.equals(emrVar.m117223e()) || "waiting".equals(emrVar.m117223e()) || "expired".equals(emrVar.m117223e())) {
                return;
            }
        }
        Drawable drawable = this.f25854i.f149124x.getResources().getDrawable(x2c0.f189203Bh);
        drawable.setBounds(0, 0, t100.m186890d(13.0f), t100.m186890d(13.0f));
        this.f25850e.setCompoundDrawables(null, null, drawable, null);
        this.f25850e.setCompoundDrawablePadding(t100.m186890d(12.0f));
        if (NullChecker.m81303a(message) && TEnum.equals(message.status(), "failed") && !this.f25854i.f149102b.unilateralBlock()) {
            Drawable drawable2 = this.f25854i.f149124x.getResources().getDrawable(upa.m194847z() ? x2c0.f189423If : x2c0.f189849W7);
            drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
            this.f25850e.setCompoundDrawables(null, null, drawable2, null);
        }
        if (NullChecker.m81303a(this.f25854i.f149101a) && TextUtils.equals(this.f25854i.f149101a.convType, ConversationType.intlSeeChatRequest)) {
            this.f25850e.setCompoundDrawables(null, null, null, null);
            Drawable drawable3 = this.f25854i.f149124x.getResources().getDrawable(x2c0.f190540s1);
            drawable3.setBounds(0, 0, t100.m186890d(10.0f), t100.m186890d(10.0f));
            InsertConversationsList insertConversationsListM221515e = r6n.m178067f().f157954b.m221515e();
            if (NullChecker.m81303a(insertConversationsListM221515e) && NullChecker.m81303a(insertConversationsListM221515e.users)) {
                InsertConversationUser insertConversationUser = (InsertConversationUser) vwb.m200346r(insertConversationsListM221515e.users, new w9j() { // from class: l.ya6
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return this.f197141a.m42474d1((InsertConversationUser) obj);
                    }
                });
                if (NullChecker.m81303a(insertConversationUser) && insertConversationUser.clicked.booleanValue()) {
                    this.f25850e.setCompoundDrawables(null, null, null, null);
                } else {
                    this.f25850e.setCompoundDrawables(null, null, drawable3, null);
                }
            }
        }
    }

    private void setRedDot(Message message) {
        xdl0.m208344M(this.f25852g, false);
    }

    private void setSparkIcon(j760<SpannableStringBuilder, j4m> j760Var) {
        pi6 pi6Var;
        Conversation conversation;
        ConversationAdditional conversationAdditional;
        ChatMM chatMM;
        xdl0.m208344M(this.f25847b, false);
        if (!(j760Var.f116565b instanceof umf0) || (pi6Var = this.f25854i) == null || (conversation = pi6Var.f149101a) == null || (conversationAdditional = conversation.additional) == null || (chatMM = conversationAdditional.chatMM) == null) {
            return;
        }
        int i = chatMM.level;
        if (i == 2) {
            xdl0.m208344M(this.f25847b, true);
            this.f25847b.setBackgroundResource(x2c0.f189909Y5);
            return;
        }
        VImage vImage = this.f25847b;
        if (i <= 2) {
            xdl0.m208344M(vImage, false);
        } else {
            xdl0.m208344M(vImage, true);
            this.f25847b.setBackgroundResource(x2c0.f189940Z5);
        }
    }

    private void setSubtitleContent(Message message) {
        if (CoreModule.m29935P().m94651a().mo33394Qb() && this.f25854i.f149101a.isLimitedTrialSee(CoreModule.m29931H().userId()) && !xma.m210047L3() && !CoreModule.f17545c.f19639e0.m169527p9().isFemale()) {
            emr emrVar = emr.INSTANCE;
            if (SeeTrialStatusType.trialEnd.equals(emrVar.m117223e()) || "waiting".equals(emrVar.m117223e()) || "expired".equals(emrVar.m117223e())) {
                pi6 pi6Var = this.f25854i;
                this.f25850e.setText(m42467c1(pi6Var, pi6Var.f149101a.unreadMessages));
                return;
            }
        }
        j760<SpannableStringBuilder, j4m> j760VarM119499e = f5g0.m119499e(this.f25854i, message);
        SpannableStringBuilder spannableStringBuilderM119497c = j760VarM119499e.f116564a;
        if (TextUtils.isEmpty(spannableStringBuilderM119497c)) {
            spannableStringBuilderM119497c = f5g0.m119497c(this.f25854i);
        }
        if (!TextUtils.equals(this.f25850e.getText(), spannableStringBuilderM119497c)) {
            this.f25850e.setText(m42476f1(eoj0.m117353c(spannableStringBuilderM119497c)));
        }
        setSparkIcon(j760VarM119499e);
    }

    @Override // p149l.cpl
    /* JADX INFO: renamed from: A */
    public void mo40987A(pi6 pi6Var) {
        this.f25854i = pi6Var;
        this.f25850e.setCompoundDrawables(null, null, null, null);
        this.f25850e.setText("");
        xdl0.m208344M(this.f25846a, false);
    }

    /* JADX INFO: renamed from: B */
    public final void m42469B(View view) {
        za6.m217722a(this, view);
    }

    @Override // p149l.cpl
    /* JADX INFO: renamed from: E */
    public void mo42470E(pi6 pi6Var) {
        xdl0.m208344M(this.f25852g, false);
        if (pi6Var == null) {
            this.f25850e.setText("");
            return;
        }
        this.f25854i = pi6Var;
        setSubtitleContent(pi6Var.f149093I);
        m178893I(pi6Var, this.f25852g, false, pi6Var.f149101a.unreadMessages > 0);
    }

    @Override // p149l.cpl
    /* JADX INFO: renamed from: F0 */
    public void mo40988F0(pi6 pi6Var) {
        this.f25854i = pi6Var;
        xdl0.m208344M(this.f25852g, false);
    }

    @Override // p149l.cpl
    /* JADX INFO: renamed from: G0 */
    public void mo42419G0(pi6 pi6Var) {
        this.f25854i = pi6Var;
        this.f25850e.setText(m42471M0("特邀嘉宾", CoreModule.f17545c.f19642f0.f19893R0.get()));
    }

    /* JADX INFO: renamed from: M0 */
    public CharSequence m42471M0(String str, CharSequence charSequence) {
        return zz6.m220997n0(str, charSequence);
    }

    @Override // p149l.bpl
    /* JADX INFO: renamed from: O */
    public boolean mo42472O() {
        return (!NullChecker.m81303a(this.f25850e.getCompoundDrawables()) || this.f25850e.getCompoundDrawables()[2] == null || this.f25850e.getCompoundDrawables()[2] == getContext().getResources().getDrawable(x2c0.f189849W7)) ? false : true;
    }

    @Override // p149l.cpl
    /* JADX INFO: renamed from: P */
    public void mo42421P(pi6 pi6Var) {
        this.f25854i = pi6Var;
        if (!pi6Var.f149121u || !TextUtils.equals(pi6Var.f149118r, CoreModule.m29931H().userId())) {
            int i = pi6Var.f149092H;
            if (i == 0 || pi6Var.f149093I == null) {
                this.f25850e.setText(getContext().getString(R$string.f17667Da, Integer.valueOf(pi6Var.f149098N)));
                this.f25850e.setCompoundDrawables(null, null, null, null);
            } else {
                String strM186865f = t0g0.m186865f(i);
                pii0 pii0Var = new pii0(strM186865f, t100.m186890d(16.0f), t100.m186892f(10), eqh0.m117752c(3), -1, pii0.f149563k, getResources().getColor(w0c0.f183825Z0));
                pii0Var.setBounds(0, 0, t100.m186890d(((strM186865f.length() - 1) * 6) + 16), t100.m186890d(16.0f));
                this.f25850e.setCompoundDrawables(null, null, pii0Var, null);
                this.f25850e.setCompoundDrawablePadding(t100.m186890d(23.0f));
                boolean zM217811h = zb0.m217811h(pi6Var.f149093I.cid);
                VText vText = this.f25850e;
                if (zM217811h) {
                    vText.setText(getContext().getResources().getString(R$string.f17806I));
                } else {
                    vText.setText(pi6Var.f149093I.value);
                }
            }
        }
        m42477g1();
    }

    @Override // p149l.cpl
    /* JADX INFO: renamed from: Q0 */
    public void mo42409Q0(pi6 pi6Var) {
        this.f25854i = pi6Var;
        if (m178914Y(pi6Var.f149101a)) {
            return;
        }
        Message messageM178933p = m178933p(pi6Var);
        if (NullChecker.m81303a(messageM178933p)) {
            OperationTopicInfo operationTopicInfo = messageM178933p.getOperationTopicInfo();
            pi6Var.f149112l = NullChecker.m81303a(operationTopicInfo) ? operationTopicInfo.operationId : "";
        }
        if (NullChecker.m81303a(messageM178933p) && TEnum.equals(messageM178933p.messageType, MessageType.common_tip) && NullChecker.m81303a(messageM178933p.extData) && !TextUtils.isEmpty(messageM178933p.extData.extra) && TextUtils.equals(messageM178933p.extData.extra, "pat") && TextUtils.isEmpty(messageM178933p.extData.extra2) && !CoreModule.f17545c.f19642f0.f19960n2.contains(messageM178933p.f56011id)) {
            CoreModule.f17545c.f19642f0.f19960n2.add(messageM178933p.f56011id);
        }
        if (NullChecker.m81303a(pi6Var.f149102b)) {
            CoreModule.f17545c.f19642f0.f19951k2.remove(pi6Var.f149102b.f56011id);
        }
        setSubtitleContent(messageM178933p);
        m42473b1();
        boolean zMo94463a = u5n.m191873d().mo94463a(pi6Var, messageM178933p);
        xdl0.m208344M(this.f25849d, zMo94463a);
        xdl0.m208344M(this.f25848c, zMo94463a);
        this.f25848c.setText(u5n.m191873d().mo94464b(pi6Var, messageM178933p));
        setRedDot(messageM178933p);
        m42475e1(pi6Var);
        setError(messageM178933p);
        m42477g1();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    @Override // p149l.cpl
    /* JADX INFO: renamed from: X0 */
    public void mo42423X0(pi6 pi6Var) {
        String str;
        xdl0.m208344M(this.f25852g, false);
        if (pi6Var.f149102b.isMe()) {
            this.f25850e.setText("暂无新的好友请求");
            return;
        }
        if (!NullChecker.m81303a(pi6Var.f149093I)) {
            str = "";
        } else if (TEnum.equals(pi6Var.f149093I.messageType, "text") && !TextUtils.isEmpty(pi6Var.f149093I.value)) {
            str = pi6Var.f149093I.value;
        } else if (TEnum.equals(pi6Var.f149093I.messageType, "picture")) {
            str = "[图片]";
        } else {
            str = "";
        }
        this.f25850e.setText(m42471M0(tbk.m187868o(pi6Var.f149102b.name), str));
        zvf0.m220368A("e_city_cover_received_greet", OMSDialogPositon.p_messages_view, vwb.m200311Y("city_c_cell_uid", pi6Var.f149101a.otherUser));
        m178893I(pi6Var, this.f25852g, false, pi6Var.f149101a.unreadMessages > 0);
    }

    /* JADX INFO: renamed from: b1 */
    public final void m42473b1() {
        xdl0.m208344M(this.f25851f, false);
        l2s l2sVarMo102426k = CoreModule.m29936Q().mo67229M6().mo102426k();
        if (!NullChecker.m81303a(l2sVarMo102426k) || !NullChecker.m81303a(this.f25854i.f149101a) || !this.f25854i.f149101a.f56011id.equals(User.ID_TEAM_ACCOUNT)) {
            xdl0.m208344M(this.f25851f, false);
            xdl0.m208344M(this.f25850e, true);
        } else if (upa.m194726a2()) {
            xdl0.m208344M(this.f25850e, false);
            xdl0.m208344M(this.f25851f, true);
            getIntlLiveView().mo70241P(l2sVarMo102426k);
        }
    }

    @Override // p149l.cpl
    /* JADX INFO: renamed from: d */
    public void mo42424d(pi6 pi6Var) {
        this.f25854i = pi6Var;
        xdl0.m208345M0(this.f25846a, true);
        if (pi6Var.f149101a.unreadMessages > 0) {
            Drawable drawable = getResources().getDrawable(x2c0.f190540s1);
            drawable.setBounds(0, 0, t100.m186890d(10.0f), t100.m186890d(10.0f));
            this.f25850e.setCompoundDrawables(null, null, drawable, null);
            this.f25850e.setCompoundDrawablePadding(t100.m186890d(23.0f));
        } else {
            this.f25850e.setCompoundDrawables(null, null, null, null);
            this.f25850e.setCompoundDrawablePadding(t100.m186890d(0.0f));
        }
        Message messageM178933p = m178933p(pi6Var);
        if (NullChecker.m81303a(messageM178933p)) {
            boolean zM217811h = zb0.m217811h(messageM178933p.owner);
            VText vText = this.f25850e;
            if (zM217811h) {
                vText.setText(getContext().getResources().getString(R$string.f17806I));
            } else {
                vText.setText(messageM178933p.value);
            }
        }
    }

    @Override // p149l.cpl
    /* JADX INFO: renamed from: d0 */
    public void mo42425d0(pi6 pi6Var) {
        this.f25854i = pi6Var;
        m42477g1();
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ Boolean m42474d1(InsertConversationUser insertConversationUser) {
        return Boolean.valueOf(TextUtils.equals(insertConversationUser.userId, this.f25854i.f149102b.f56011id));
    }

    /* JADX INFO: renamed from: e1 */
    public final void m42475e1(@NonNull pi6 pi6Var) {
        if (!CoreModule.m29935P().m94651a().mo33394Qb() || !pi6Var.f149101a.isLimitedTrialSee(CoreModule.m29931H().userId()) || xma.m210047L3() || CoreModule.f17545c.f19639e0.m169527p9().isFemale()) {
            return;
        }
        emr emrVar = emr.INSTANCE;
        if (SeeTrialStatusType.trialEnd.equals(emrVar.m117223e()) || "waiting".equals(emrVar.m117223e())) {
            return;
        }
        "expired".equals(emrVar.m117223e());
    }

    /* JADX INFO: renamed from: f1 */
    public CharSequence m42476f1(CharSequence charSequence) {
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
    public void m42477g1() {
        pi6 pi6Var = this.f25854i;
        if (pi6Var.f149115o) {
            boolean z = (!NullChecker.m81303a(pi6Var.f149101a) || TextUtils.isEmpty(this.f25854i.f149116p) || TextUtils.equals("group", this.f25854i.f149101a.convType)) ? false : true;
            xdl0.m208344M(this.f25850e, z);
            xdl0.m208344M(this.f25846a, z);
            if (z) {
                mse.m156129b(this.f25850e, Html.fromHtml(this.f25854i.f149117q).toString(), this.f25854i.f149120t, getContext().getResources().getColor(w0c0.f183773I), true, true);
                for (int i = 0; i < this.f25846a.getChildCount(); i++) {
                    View childAt = this.f25846a.getChildAt(i);
                    if (childAt != this.f25850e) {
                        xdl0.m208344M(childAt, false);
                    }
                }
            }
            boolean z2 = NullChecker.m81303a(this.f25854i.f149101a) && !TextUtils.isEmpty(this.f25854i.f149116p) && TextUtils.equals("group", this.f25854i.f149101a.convType);
            if (z || z2) {
                this.f25850e.setCompoundDrawables(null, null, null, null);
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
        this.f25854i = pi6Var;
        xdl0.m208345M0(this.f25846a, true);
        xdl0.m208344M(this.f25852g, false);
    }

    @Override // p149l.cpl
    /* JADX INFO: renamed from: m0 */
    public void mo41014m0(pi6 pi6Var) {
        this.f25854i = pi6Var;
        int i = 0;
        hmb.m131701M(this.f25852g, false);
        if (!vwb.m200296J(pi6Var.f149100P)) {
            Iterator<Conversation> it = pi6Var.f149100P.iterator();
            while (it.hasNext()) {
                i += it.next().unreadMessages;
            }
        }
        this.f25850e.setText(m42467c1(pi6Var, i));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m42469B(this);
        if (upa.m194847z()) {
            rd6.m178873e0(this.f25850e);
        }
    }

    @Override // p149l.bpl
    /* JADX INFO: renamed from: r */
    public void mo42441r(SimpleDateFormat simpleDateFormat, long j, long j2, long j3) {
        if (j < j2) {
            Date date = new Date();
            date.setTime(j2 - j);
            this.f25850e.setText(String.format(getResources().getString(R$string.f17915Li), simpleDateFormat.format(date)));
        }
    }

    @Override // p149l.bpl
    public /* bridge */ /* synthetic */ void setPicPercent(float f) {
        super.setPicPercent(f);
    }

    @Override // p149l.cpl
    /* JADX INFO: renamed from: t0 */
    public void mo41022t0(pi6 pi6Var) {
        this.f25854i = pi6Var;
        xdl0.m208344M(this.f25851f, false);
        xdl0.m208344M(this.f25850e, true);
        xdl0.m208344M(this.f25852g, false);
        xdl0.m208344M(this.f25853h, false);
        this.f25850e.setTypeface(eqh0.m117752c(2));
        if (!pi6Var.f149122v || !NullChecker.m81303a(pi6Var.f149102b)) {
            xdl0.m208344M(this.f25846a, !m178914Y(pi6Var.f149101a));
            return;
        }
        xdl0.m208344M(this.f25846a, true);
        this.f25850e.setText(i0g0.m133861b0("探探ID: " + pi6Var.f149102b.publicId, vwb.m200324f0(pi6Var.f149102b.publicId), pi6Var.f149124x.color(w0c0.f183773I), eqh0.m117752c(2)));
    }

    @Override // p149l.bpl
    /* JADX INFO: renamed from: y0 */
    public void mo42414y0() {
        if (m178914Y(this.f25854i.f149101a)) {
            xdl0.m208344M(this.f25846a, false);
        }
    }

    public ConversationItemSubTitleView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConversationItemSubTitleView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
