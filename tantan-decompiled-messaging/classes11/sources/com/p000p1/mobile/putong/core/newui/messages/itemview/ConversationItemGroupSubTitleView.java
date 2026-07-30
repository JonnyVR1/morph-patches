package com.p000p1.mobile.putong.core.newui.messages.itemview;

import android.content.Context;
import android.graphics.Color;
import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserLiveLabel;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import l.d30;
import l.qp8;
import l.sek;
import l.upa;
import l.w0c0;
import l.xdl0;
import l.z86;
import p009l.cpl;
import p009l.mse;
import p009l.pi6;
import p009l.rd6;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ConversationItemGroupSubTitleView extends LinearLayout implements cpl {

    /* JADX INFO: renamed from: a */
    public ConversationItemGroupSubTitleView f4593a;

    /* JADX INFO: renamed from: b */
    public VText f4594b;

    /* JADX INFO: renamed from: c */
    public VImage f4595c;

    /* JADX INFO: renamed from: d */
    public View f4596d;

    /* JADX INFO: renamed from: e */
    public VText f4597e;

    /* JADX INFO: renamed from: f */
    public pi6 f4598f;

    public ConversationItemGroupSubTitleView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: B */
    public final void m6562B(View view) {
        z86.a(this, view);
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ void m6563M0(pi6 pi6Var) {
        if (!pi6Var.f18607B.ownerUserId.equals(((DbObject) CoreModule.K().me_()).id) && m21532H(pi6Var, false)) {
            User userNew_ = User.new_();
            ((DbObject) userNew_).id = pi6Var.f18607B.ownerUserId;
            pi6Var.f18623b = userNew_;
            m6565b1();
        }
        mo6569y0();
        m6567d1();
    }

    @Override // p009l.cpl
    /* JADX INFO: renamed from: Q0 */
    public void mo6564Q0(pi6 pi6Var) {
        this.f4598f = pi6Var;
        if (NullChecker.a(pi6Var.f18622a) && TextUtils.equals(pi6Var.f18622a.convType, "intlSeeChatRequest")) {
            return;
        }
        mo6569y0();
        m6567d1();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0052 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0054  */
    /* JADX WARN: Code duplicated, block: B:21:0x005b  */
    /* JADX WARN: Code duplicated, block: B:23:0x006d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0072  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b1 */
    public final void m6565b1() {
        String strM21541O0;
        boolean z;
        int color;
        SpannableStringBuilder spannableStringBuilder;
        CharSequence text;
        boolean zA2 = upa.a2();
        pi6 pi6Var = this.f4598f;
        if (zA2) {
            UserLiveLabel userLiveLabelM21558a0 = m21558a0(pi6Var, m21552V0(pi6Var.f18626e));
            if (qp8.b() && upa.a2() && TEnum.equals(this.f4598f.f18622a.status, "default") && userLiveLabelM21558a0 != null) {
                strM21541O0 = m21542P0(this.f4598f, userLiveLabelM21558a0);
                if ("onVoice".equals(userLiveLabelM21558a0.liveState)) {
                    z = true;
                }
                if (TextUtils.isEmpty(strM21541O0)) {
                }
                if (z) {
                    color = Color.parseColor("#35D3FF");
                } else if (strM21541O0.equals(getResources().getString(R.string.ch))) {
                    color = Color.parseColor("#ff5eea");
                } else {
                    color = Color.parseColor("#ff5eea");
                }
                spannableStringBuilder = new SpannableStringBuilder();
                SpannableString spannableString = new SpannableString(strM21541O0);
                spannableString.setSpan(new ForegroundColorSpan(color), 0, strM21541O0.length(), 33);
                spannableString.setSpan(new StyleSpan(1), 0, strM21541O0.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
                text = this.f4594b.getText();
                if (!TextUtils.isEmpty(text)) {
                    SpannableString spannableString2 = new SpannableString(" · ");
                    spannableString2.setSpan(new ForegroundColorSpan(color), 0, 3, 33);
                    spannableStringBuilder.append((CharSequence) spannableString2);
                    spannableStringBuilder.append(text);
                }
                this.f4594b.setText(spannableStringBuilder);
            }
            strM21541O0 = "";
        } else {
            strM21541O0 = m21541O0(pi6Var, false, pi6Var.f18626e);
        }
        z = false;
        if (TextUtils.isEmpty(strM21541O0)) {
            if (z) {
                color = Color.parseColor("#35D3FF");
            } else if (strM21541O0.equals(getResources().getString(R.string.ch))) {
                color = Color.parseColor("#ff5eea");
            } else {
                color = Color.parseColor("#ff5eea");
            }
            spannableStringBuilder = new SpannableStringBuilder();
            SpannableString spannableString3 = new SpannableString(strM21541O0);
            spannableString3.setSpan(new ForegroundColorSpan(color), 0, strM21541O0.length(), 33);
            spannableString3.setSpan(new StyleSpan(1), 0, strM21541O0.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString3);
            text = this.f4594b.getText();
            if (!TextUtils.isEmpty(text)) {
                SpannableString spannableString4 = new SpannableString(" · ");
                spannableString4.setSpan(new ForegroundColorSpan(color), 0, 3, 33);
                spannableStringBuilder.append((CharSequence) spannableString4);
                spannableStringBuilder.append(text);
            }
            this.f4594b.setText(spannableStringBuilder);
        }
    }

    /* JADX INFO: renamed from: c1 */
    public final void m6566c1() {
        xdl0.M(this.f4597e, false);
    }

    /* JADX INFO: renamed from: d1 */
    public void m6567d1() {
        pi6 pi6Var = this.f4598f;
        if (pi6Var.f18636o) {
            boolean z = NullChecker.a(pi6Var.f18622a) && !TextUtils.isEmpty(this.f4598f.f18637p) && TextUtils.equals("group", this.f4598f.f18622a.convType);
            xdl0.M(this.f4594b, z);
            xdl0.M(this.f4593a, z);
            if (z) {
                mse.m18579b(this.f4594b, Html.fromHtml(this.f4598f.f18638q).toString(), this.f4598f.f18641t, getContext().getResources().getColor(w0c0.I), true, true);
                for (int i = 0; i < this.f4593a.getChildCount(); i++) {
                    VText childAt = this.f4593a.getChildAt(i);
                    if (childAt != this.f4594b) {
                        xdl0.M(childAt, false);
                    }
                }
            }
        }
    }

    @Override // p009l.cpl
    /* JADX INFO: renamed from: e */
    public void mo6568e(final pi6 pi6Var) {
        this.f4598f = pi6Var;
        xdl0.M(this.f4595c, pi6Var.f18622a.muted);
        this.f4594b.setText("");
        xdl0.M(this.f4593a, true);
        VText vText = this.f4594b;
        Message messageM21574p = m21574p(pi6Var);
        Conversation conversation = pi6Var.f18622a;
        sek.h(vText, messageM21574p, conversation, conversation.muted, pi6Var.f18625d, pi6Var.f18645x, pi6Var.f18608C, new d30() { // from class: l.y86
            public final void call() {
                this.f22930a.m6563M0(pi6Var);
            }
        });
        m6566c1();
    }

    @Override // p009l.rd6
    public /* bridge */ /* synthetic */ HashMap getUserLiveLabelHashMap() {
        return super.getUserLiveLabelHashMap();
    }

    @Override // p009l.cpl
    /* JADX INFO: renamed from: m */
    public void mo5114m(pi6 pi6Var) {
        this.f4598f = pi6Var;
        xdl0.M(this.f4597e, false);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6562B(this);
        if (upa.z()) {
            rd6.m21514e0(this.f4594b);
        }
    }

    @Override // p009l.bpl
    public /* bridge */ /* synthetic */ void setPicPercent(float f) {
        super.setPicPercent(f);
    }

    @Override // p009l.bpl
    /* JADX INFO: renamed from: y0 */
    public void mo6569y0() {
        if (m21555Y(this.f4598f.f18622a)) {
            xdl0.M(this.f4593a, false);
        }
    }

    public ConversationItemGroupSubTitleView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConversationItemGroupSubTitleView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
