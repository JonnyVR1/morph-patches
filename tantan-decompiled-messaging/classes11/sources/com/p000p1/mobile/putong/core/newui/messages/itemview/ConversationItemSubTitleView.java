package com.p000p1.mobile.putong.core.newui.messages.itemview;

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
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.ChatMM;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.ConversationAdditional;
import com.p1.mobile.putong.core.data.InsertConversationUser;
import com.p1.mobile.putong.core.data.InsertConversationsList;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.OperationTopicInfo;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import l.emr;
import l.eoj0;
import l.eqh0;
import l.hmb;
import l.j760;
import l.pii0;
import l.t0g0;
import l.t100;
import l.tbk;
import l.upa;
import l.vwb;
import l.w0c0;
import l.w9j;
import l.x2c0;
import l.xdl0;
import l.xma;
import l.za6;
import l.zb0;
import l.zvf0;
import l.zz6;
import p009l.cpl;
import p009l.f5g0;
import p009l.fzs;
import p009l.hi6;
import p009l.i0g0;
import p009l.j4m;
import p009l.l2s;
import p009l.mse;
import p009l.pi6;
import p009l.r6n;
import p009l.rd6;
import p009l.u5n;
import p009l.umf0;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ConversationItemSubTitleView extends LinearLayout implements cpl {

    /* JADX INFO: renamed from: a */
    public ConversationItemSubTitleView f4624a;

    /* JADX INFO: renamed from: b */
    public VImage f4625b;

    /* JADX INFO: renamed from: c */
    public VText f4626c;

    /* JADX INFO: renamed from: d */
    public View f4627d;

    /* JADX INFO: renamed from: e */
    public VText f4628e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f4629f;

    /* JADX INFO: renamed from: g */
    public VText f4630g;

    /* JADX INFO: renamed from: h */
    public VText f4631h;

    /* JADX INFO: renamed from: i */
    public pi6 f4632i;

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
    public static SpannableStringBuilder m6622c1(pi6 pi6Var, int i) {
        int iColor = upa.z() ? pi6.f18604T : pi6Var.f18645x.color(w0c0.o);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (i <= 0) {
            spannableStringBuilder.append(zz6.s0("试用到期", iColor));
            return spannableStringBuilder;
        }
        spannableStringBuilder.append(zz6.s0("试用到期 · ", iColor));
        spannableStringBuilder.append(hi6.m15843f(String.format(Locale.CHINA, "%s条新消息", Integer.valueOf(i)), pi6Var.f18645x.color(w0c0.I)));
        return spannableStringBuilder;
    }

    private fzs getIntlLiveView() {
        if (this.f4629f.getChildCount() > 0 && (this.f4629f.getChildAt(0) instanceof fzs)) {
            return (fzs) this.f4629f.getChildAt(0);
        }
        fzs fzsVarM9030Uf = CoreModule.Q().m9030Uf(getContext());
        this.f4629f.removeAllViews();
        this.f4629f.addView(fzsVarM9030Uf.getView());
        return fzsVarM9030Uf;
    }

    private void setError(Message message) {
        if (CoreModule.P().a().Qb() && this.f4632i.f18622a.isLimitedTrialSee(CoreModule.H().userId()) && !xma.L3() && !CoreModule.c.e0.p9().isFemale()) {
            emr emrVar = emr.INSTANCE;
            if ("trialEnd".equals(emrVar.e()) || "waiting".equals(emrVar.e()) || "expired".equals(emrVar.e())) {
                return;
            }
        }
        Drawable drawable = this.f4632i.f18645x.getResources().getDrawable(x2c0.Bh);
        drawable.setBounds(0, 0, t100.d(13.0f), t100.d(13.0f));
        this.f4628e.setCompoundDrawables((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        this.f4628e.setCompoundDrawablePadding(t100.d(12.0f));
        if (NullChecker.a(message) && TEnum.equals(message.status(), "failed") && !this.f4632i.f18623b.unilateralBlock()) {
            Drawable drawable2 = this.f4632i.f18645x.getResources().getDrawable(upa.z() ? x2c0.If : x2c0.W7);
            drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
            this.f4628e.setCompoundDrawables((Drawable) null, (Drawable) null, drawable2, (Drawable) null);
        }
        if (NullChecker.a(this.f4632i.f18622a) && TextUtils.equals(this.f4632i.f18622a.convType, "intlSeeChatRequest")) {
            this.f4628e.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            Drawable drawable3 = this.f4632i.f18645x.getResources().getDrawable(x2c0.s1);
            drawable3.setBounds(0, 0, t100.d(10.0f), t100.d(10.0f));
            InsertConversationsList insertConversationsList = (InsertConversationsList) r6n.m21419f().f19656b.e();
            if (NullChecker.a(insertConversationsList) && NullChecker.a(insertConversationsList.users)) {
                InsertConversationUser insertConversationUser = (InsertConversationUser) vwb.r(insertConversationsList.users, new w9j() { // from class: l.ya6
                    public final Object call(Object obj) {
                        return this.f22950a.m6629d1((InsertConversationUser) obj);
                    }
                });
                if (NullChecker.a(insertConversationUser) && insertConversationUser.clicked.booleanValue()) {
                    this.f4628e.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                } else {
                    this.f4628e.setCompoundDrawables((Drawable) null, (Drawable) null, drawable3, (Drawable) null);
                }
            }
        }
    }

    private void setRedDot(Message message) {
        xdl0.M(this.f4630g, false);
    }

    private void setSparkIcon(j760<SpannableStringBuilder, j4m> j760Var) {
        pi6 pi6Var;
        Conversation conversation;
        ConversationAdditional conversationAdditional;
        ChatMM chatMM;
        xdl0.M(this.f4625b, false);
        if (!(j760Var.b instanceof umf0) || (pi6Var = this.f4632i) == null || (conversation = pi6Var.f18622a) == null || (conversationAdditional = conversation.additional) == null || (chatMM = conversationAdditional.chatMM) == null) {
            return;
        }
        int i = chatMM.level;
        if (i == 2) {
            xdl0.M(this.f4625b, true);
            this.f4625b.setBackgroundResource(x2c0.Y5);
            return;
        }
        VImage vImage = this.f4625b;
        if (i <= 2) {
            xdl0.M(vImage, false);
        } else {
            xdl0.M(vImage, true);
            this.f4625b.setBackgroundResource(x2c0.Z5);
        }
    }

    private void setSubtitleContent(Message message) {
        if (CoreModule.P().a().Qb() && this.f4632i.f18622a.isLimitedTrialSee(CoreModule.H().userId()) && !xma.L3() && !CoreModule.c.e0.p9().isFemale()) {
            emr emrVar = emr.INSTANCE;
            if ("trialEnd".equals(emrVar.e()) || "waiting".equals(emrVar.e()) || "expired".equals(emrVar.e())) {
                pi6 pi6Var = this.f4632i;
                this.f4628e.setText(m6622c1(pi6Var, pi6Var.f18622a.unreadMessages));
                return;
            }
        }
        j760<SpannableStringBuilder, j4m> j760VarM14266e = f5g0.m14266e(this.f4632i, message);
        CharSequence charSequenceM14264c = (CharSequence) j760VarM14266e.a;
        if (TextUtils.isEmpty(charSequenceM14264c)) {
            charSequenceM14264c = f5g0.m14264c(this.f4632i);
        }
        if (!TextUtils.equals(this.f4628e.getText(), charSequenceM14264c)) {
            this.f4628e.setText(m6631f1(eoj0.c(charSequenceM14264c)));
        }
        setSparkIcon(j760VarM14266e);
    }

    @Override // p009l.cpl
    /* JADX INFO: renamed from: A */
    public void mo5088A(pi6 pi6Var) {
        this.f4632i = pi6Var;
        this.f4628e.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        this.f4628e.setText("");
        xdl0.M(this.f4624a, false);
    }

    /* JADX INFO: renamed from: B */
    public final void m6624B(View view) {
        za6.a(this, view);
    }

    @Override // p009l.cpl
    /* JADX INFO: renamed from: E */
    public void mo6625E(pi6 pi6Var) {
        xdl0.M(this.f4630g, false);
        if (pi6Var == null) {
            this.f4628e.setText("");
            return;
        }
        this.f4632i = pi6Var;
        setSubtitleContent(pi6Var.f18614I);
        m21534I(pi6Var, this.f4630g, false, pi6Var.f18622a.unreadMessages > 0);
    }

    @Override // p009l.cpl
    /* JADX INFO: renamed from: F0 */
    public void mo5089F0(pi6 pi6Var) {
        this.f4632i = pi6Var;
        xdl0.M(this.f4630g, false);
    }

    @Override // p009l.cpl
    /* JADX INFO: renamed from: G0 */
    public void mo6574G0(pi6 pi6Var) {
        this.f4632i = pi6Var;
        this.f4628e.setText(m6626M0("特邀嘉宾", (CharSequence) CoreModule.c.f0.R0.get()));
    }

    /* JADX INFO: renamed from: M0 */
    public CharSequence m6626M0(String str, CharSequence charSequence) {
        return zz6.n0(str, charSequence);
    }

    @Override // p009l.bpl
    /* JADX INFO: renamed from: O */
    public boolean mo6627O() {
        return (!NullChecker.a(this.f4628e.getCompoundDrawables()) || this.f4628e.getCompoundDrawables()[2] == null || this.f4628e.getCompoundDrawables()[2] == getContext().getResources().getDrawable(x2c0.W7)) ? false : true;
    }

    @Override // p009l.cpl
    /* JADX INFO: renamed from: P */
    public void mo6576P(pi6 pi6Var) {
        this.f4632i = pi6Var;
        if (!pi6Var.f18642u || !TextUtils.equals(pi6Var.f18639r, CoreModule.H().userId())) {
            int i = pi6Var.f18613H;
            if (i == 0 || pi6Var.f18614I == null) {
                this.f4628e.setText(getContext().getString(R.string.Da, Integer.valueOf(pi6Var.f18619N)));
                this.f4628e.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            } else {
                String strF = t0g0.f(i);
                pii0 pii0Var = new pii0(strF, t100.d(16.0f), t100.f(10), eqh0.c(3), -1, pii0.k, getResources().getColor(w0c0.Z0));
                pii0Var.setBounds(0, 0, t100.d(((strF.length() - 1) * 6) + 16), t100.d(16.0f));
                this.f4628e.setCompoundDrawables((Drawable) null, (Drawable) null, pii0Var, (Drawable) null);
                this.f4628e.setCompoundDrawablePadding(t100.d(23.0f));
                boolean zH = zb0.h(pi6Var.f18614I.cid);
                VText vText = this.f4628e;
                if (zH) {
                    vText.setText(getContext().getResources().getString(R.string.I));
                } else {
                    vText.setText(pi6Var.f18614I.value);
                }
            }
        }
        m6632g1();
    }

    @Override // p009l.cpl
    /* JADX INFO: renamed from: Q0 */
    public void mo6564Q0(pi6 pi6Var) {
        this.f4632i = pi6Var;
        if (m21555Y(pi6Var.f18622a)) {
            return;
        }
        Message messageM21574p = m21574p(pi6Var);
        if (NullChecker.a(messageM21574p)) {
            OperationTopicInfo operationTopicInfo = messageM21574p.getOperationTopicInfo();
            pi6Var.f18633l = NullChecker.a(operationTopicInfo) ? operationTopicInfo.operationId : "";
        }
        if (NullChecker.a(messageM21574p) && TEnum.equals(messageM21574p.messageType, "common_tip") && NullChecker.a(messageM21574p.extData) && !TextUtils.isEmpty(messageM21574p.extData.extra) && TextUtils.equals(messageM21574p.extData.extra, "pat") && TextUtils.isEmpty(messageM21574p.extData.extra2) && !CoreModule.c.f0.n2.contains(((DbObject) messageM21574p).id)) {
            CoreModule.c.f0.n2.add(((DbObject) messageM21574p).id);
        }
        if (NullChecker.a(pi6Var.f18623b)) {
            CoreModule.c.f0.k2.remove(((DbObject) pi6Var.f18623b).id);
        }
        setSubtitleContent(messageM21574p);
        m6628b1();
        boolean zMo11180a = u5n.m22759d().mo11180a(pi6Var, messageM21574p);
        xdl0.M(this.f4627d, zMo11180a);
        xdl0.M(this.f4626c, zMo11180a);
        this.f4626c.setText(u5n.m22759d().mo11181b(pi6Var, messageM21574p));
        setRedDot(messageM21574p);
        m6630e1(pi6Var);
        setError(messageM21574p);
        m6632g1();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    @Override // p009l.cpl
    /* JADX INFO: renamed from: X0 */
    public void mo6578X0(pi6 pi6Var) {
        String str;
        xdl0.M(this.f4630g, false);
        if (pi6Var.f18623b.isMe()) {
            this.f4628e.setText("暂无新的好友请求");
            return;
        }
        if (!NullChecker.a(pi6Var.f18614I)) {
            str = "";
        } else if (TEnum.equals(pi6Var.f18614I.messageType, "text") && !TextUtils.isEmpty(pi6Var.f18614I.value)) {
            str = pi6Var.f18614I.value;
        } else if (TEnum.equals(pi6Var.f18614I.messageType, "picture")) {
            str = "[图片]";
        } else {
            str = "";
        }
        this.f4628e.setText(m6626M0(tbk.o(pi6Var.f18623b.name), str));
        zvf0.A("e_city_cover_received_greet", "p_messages_view", new j760[]{vwb.Y("city_c_cell_uid", pi6Var.f18622a.otherUser)});
        m21534I(pi6Var, this.f4630g, false, pi6Var.f18622a.unreadMessages > 0);
    }

    /* JADX INFO: renamed from: b1 */
    public final void m6628b1() {
        xdl0.M(this.f4629f, false);
        l2s l2sVarM12092k = CoreModule.Q().m9019M6().m12092k();
        if (!NullChecker.a(l2sVarM12092k) || !NullChecker.a(this.f4632i.f18622a) || !((DbObject) this.f4632i.f18622a).id.equals("-1")) {
            xdl0.M(this.f4629f, false);
            xdl0.M(this.f4628e, true);
        } else if (upa.a2()) {
            xdl0.M(this.f4628e, false);
            xdl0.M(this.f4629f, true);
            getIntlLiveView().m14711P(l2sVarM12092k);
        }
    }

    @Override // p009l.cpl
    /* JADX INFO: renamed from: d */
    public void mo6579d(pi6 pi6Var) {
        this.f4632i = pi6Var;
        xdl0.M0(this.f4624a, true);
        if (pi6Var.f18622a.unreadMessages > 0) {
            Drawable drawable = getResources().getDrawable(x2c0.s1);
            drawable.setBounds(0, 0, t100.d(10.0f), t100.d(10.0f));
            this.f4628e.setCompoundDrawables((Drawable) null, (Drawable) null, drawable, (Drawable) null);
            this.f4628e.setCompoundDrawablePadding(t100.d(23.0f));
        } else {
            this.f4628e.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            this.f4628e.setCompoundDrawablePadding(t100.d(0.0f));
        }
        Message messageM21574p = m21574p(pi6Var);
        if (NullChecker.a(messageM21574p)) {
            boolean zH = zb0.h(messageM21574p.owner);
            VText vText = this.f4628e;
            if (zH) {
                vText.setText(getContext().getResources().getString(R.string.I));
            } else {
                vText.setText(messageM21574p.value);
            }
        }
    }

    @Override // p009l.cpl
    /* JADX INFO: renamed from: d0 */
    public void mo6580d0(pi6 pi6Var) {
        this.f4632i = pi6Var;
        m6632g1();
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ Boolean m6629d1(InsertConversationUser insertConversationUser) {
        return Boolean.valueOf(TextUtils.equals(insertConversationUser.userId, ((DbObject) this.f4632i.f18623b).id));
    }

    /* JADX INFO: renamed from: e1 */
    public final void m6630e1(@NonNull pi6 pi6Var) {
        if (!CoreModule.P().a().Qb() || !pi6Var.f18622a.isLimitedTrialSee(CoreModule.H().userId()) || xma.L3() || CoreModule.c.e0.p9().isFemale()) {
            return;
        }
        emr emrVar = emr.INSTANCE;
        if ("trialEnd".equals(emrVar.e()) || "waiting".equals(emrVar.e())) {
            return;
        }
        "expired".equals(emrVar.e());
    }

    /* JADX INFO: renamed from: f1 */
    public CharSequence m6631f1(CharSequence charSequence) {
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
    public void m6632g1() {
        pi6 pi6Var = this.f4632i;
        if (pi6Var.f18636o) {
            boolean z = (!NullChecker.a(pi6Var.f18622a) || TextUtils.isEmpty(this.f4632i.f18637p) || TextUtils.equals("group", this.f4632i.f18622a.convType)) ? false : true;
            xdl0.M(this.f4628e, z);
            xdl0.M(this.f4624a, z);
            if (z) {
                mse.m18579b(this.f4628e, Html.fromHtml(this.f4632i.f18638q).toString(), this.f4632i.f18641t, getContext().getResources().getColor(w0c0.I), true, true);
                for (int i = 0; i < this.f4624a.getChildCount(); i++) {
                    VText childAt = this.f4624a.getChildAt(i);
                    if (childAt != this.f4628e) {
                        xdl0.M(childAt, false);
                    }
                }
            }
            boolean z2 = NullChecker.a(this.f4632i.f18622a) && !TextUtils.isEmpty(this.f4632i.f18637p) && TextUtils.equals("group", this.f4632i.f18622a.convType);
            if (z || z2) {
                this.f4628e.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
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
        this.f4632i = pi6Var;
        xdl0.M0(this.f4624a, true);
        xdl0.M(this.f4630g, false);
    }

    @Override // p009l.cpl
    /* JADX INFO: renamed from: m0 */
    public void mo5115m0(pi6 pi6Var) {
        this.f4632i = pi6Var;
        int i = 0;
        hmb.M(this.f4630g, false);
        if (!vwb.J(pi6Var.f18621P)) {
            Iterator<Conversation> it = pi6Var.f18621P.iterator();
            while (it.hasNext()) {
                i += it.next().unreadMessages;
            }
        }
        this.f4628e.setText(m6622c1(pi6Var, i));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6624B(this);
        if (upa.z()) {
            rd6.m21514e0(this.f4628e);
        }
    }

    @Override // p009l.bpl
    /* JADX INFO: renamed from: r */
    public void mo6596r(SimpleDateFormat simpleDateFormat, long j, long j2, long j3) {
        if (j < j2) {
            Date date = new Date();
            date.setTime(j2 - j);
            this.f4628e.setText(String.format(getResources().getString(R.string.Li), simpleDateFormat.format(date)));
        }
    }

    @Override // p009l.bpl
    public /* bridge */ /* synthetic */ void setPicPercent(float f) {
        super.setPicPercent(f);
    }

    @Override // p009l.cpl
    /* JADX INFO: renamed from: t0 */
    public void mo5123t0(pi6 pi6Var) {
        this.f4632i = pi6Var;
        xdl0.M(this.f4629f, false);
        xdl0.M(this.f4628e, true);
        xdl0.M(this.f4630g, false);
        xdl0.M(this.f4631h, false);
        this.f4628e.setTypeface(eqh0.c(2));
        if (!pi6Var.f18643v || !NullChecker.a(pi6Var.f18623b)) {
            xdl0.M(this.f4624a, !m21555Y(pi6Var.f18622a));
            return;
        }
        xdl0.M(this.f4624a, true);
        this.f4628e.setText(i0g0.m16129b0("探探ID: " + pi6Var.f18623b.publicId, vwb.f0(new String[]{pi6Var.f18623b.publicId}), pi6Var.f18645x.color(w0c0.I), eqh0.c(2)));
    }

    @Override // p009l.bpl
    /* JADX INFO: renamed from: y0 */
    public void mo6569y0() {
        if (m21555Y(this.f4632i.f18622a)) {
            xdl0.M(this.f4624a, false);
        }
    }

    public ConversationItemSubTitleView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConversationItemSubTitleView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
