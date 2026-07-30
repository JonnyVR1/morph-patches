package com.p051p1.mobile.putong.core.newui.messages.itemview;

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
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.ConversationType;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserLiveLabel;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.c9c0;
import p153l.ea6;
import p153l.gra;
import p153l.ihk;
import p153l.orl;
import p153l.qte;
import p153l.sj6;
import p153l.ue6;
import p153l.vq8;
import p153l.x20;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationItemGroupSubTitleView extends LinearLayout implements orl {

    /* JADX INFO: renamed from: a */
    public ConversationItemGroupSubTitleView f26557a;

    /* JADX INFO: renamed from: b */
    public VText f26558b;

    /* JADX INFO: renamed from: c */
    public VImage f26559c;

    /* JADX INFO: renamed from: d */
    public View f26560d;

    /* JADX INFO: renamed from: e */
    public VText f26561e;

    /* JADX INFO: renamed from: f */
    public sj6 f26562f;

    public ConversationItemGroupSubTitleView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: B */
    public final void m43418B(View view) {
        ea6.m120036a(this, view);
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ void m43419M0(sj6 sj6Var) {
        if (!sj6Var.f168911B.ownerUserId.equals(CoreModule.m30930K().me_().f56859id) && m195685H(sj6Var, false)) {
            User userNew_ = User.new_();
            userNew_.f56859id = sj6Var.f168911B.ownerUserId;
            sj6Var.f168927b = userNew_;
            m43421b1();
        }
        mo43425y0();
        m43423d1();
    }

    @Override // p153l.orl
    /* JADX INFO: renamed from: Q0 */
    public void mo43420Q0(sj6 sj6Var) {
        this.f26562f = sj6Var;
        if (NullChecker.m82486a(sj6Var.f168926a) && TextUtils.equals(sj6Var.f168926a.convType, ConversationType.intlSeeChatRequest)) {
            return;
        }
        mo43425y0();
        m43423d1();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0052 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0054  */
    /* JADX WARN: Code duplicated, block: B:21:0x005b  */
    /* JADX WARN: Code duplicated, block: B:23:0x006d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0072  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: b1 */
    public final void m43421b1() {
        String strM195694O0;
        boolean z;
        int color;
        SpannableStringBuilder spannableStringBuilder;
        CharSequence text;
        boolean zM131657a2 = gra.m131657a2();
        sj6 sj6Var = this.f26562f;
        if (zM131657a2) {
            UserLiveLabel userLiveLabelM195711a0 = m195711a0(sj6Var, m195705V0(sj6Var.f168930e));
            if (vq8.m202358b() && gra.m131657a2() && TEnum.equals(this.f26562f.f168926a.status, "default") && userLiveLabelM195711a0 != null) {
                strM195694O0 = m195695P0(this.f26562f, userLiveLabelM195711a0);
                if ("onVoice".equals(userLiveLabelM195711a0.liveState)) {
                    z = true;
                }
                if (TextUtils.isEmpty(strM195694O0)) {
                }
                if (z) {
                    color = Color.parseColor("#35D3FF");
                } else if (strM195694O0.equals(getResources().getString(R$string.f19804xh))) {
                    color = Color.parseColor("#ff5eea");
                } else {
                    color = Color.parseColor("#ff5eea");
                }
                spannableStringBuilder = new SpannableStringBuilder();
                SpannableString spannableString = new SpannableString(strM195694O0);
                spannableString.setSpan(new ForegroundColorSpan(color), 0, strM195694O0.length(), 33);
                spannableString.setSpan(new StyleSpan(1), 0, strM195694O0.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
                text = this.f26558b.getText();
                if (!TextUtils.isEmpty(text)) {
                    SpannableString spannableString2 = new SpannableString(" · ");
                    spannableString2.setSpan(new ForegroundColorSpan(color), 0, 3, 33);
                    spannableStringBuilder.append((CharSequence) spannableString2);
                    spannableStringBuilder.append(text);
                }
                this.f26558b.setText(spannableStringBuilder);
            }
            strM195694O0 = "";
        } else {
            strM195694O0 = m195694O0(sj6Var, false, sj6Var.f168930e);
        }
        z = false;
        if (TextUtils.isEmpty(strM195694O0)) {
            if (z) {
                color = Color.parseColor("#35D3FF");
            } else if (strM195694O0.equals(getResources().getString(R$string.f19804xh))) {
                color = Color.parseColor("#ff5eea");
            } else {
                color = Color.parseColor("#ff5eea");
            }
            spannableStringBuilder = new SpannableStringBuilder();
            SpannableString spannableString3 = new SpannableString(strM195694O0);
            spannableString3.setSpan(new ForegroundColorSpan(color), 0, strM195694O0.length(), 33);
            spannableString3.setSpan(new StyleSpan(1), 0, strM195694O0.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString3);
            text = this.f26558b.getText();
            if (!TextUtils.isEmpty(text)) {
                SpannableString spannableString4 = new SpannableString(" · ");
                spannableString4.setSpan(new ForegroundColorSpan(color), 0, 3, 33);
                spannableStringBuilder.append((CharSequence) spannableString4);
                spannableStringBuilder.append(text);
            }
            this.f26558b.setText(spannableStringBuilder);
        }
    }

    /* JADX INFO: renamed from: c1 */
    public final void m43422c1() {
        bnl0.m105524M(this.f26561e, false);
    }

    /* JADX INFO: renamed from: d1 */
    public void m43423d1() {
        sj6 sj6Var = this.f26562f;
        if (sj6Var.f168940o) {
            boolean z = NullChecker.m82486a(sj6Var.f168926a) && !TextUtils.isEmpty(this.f26562f.f168941p) && TextUtils.equals("group", this.f26562f.f168926a.convType);
            bnl0.m105524M(this.f26558b, z);
            bnl0.m105524M(this.f26557a, z);
            if (z) {
                qte.m177919b(this.f26558b, Html.fromHtml(this.f26562f.f168942q).toString(), this.f26562f.f168945t, getContext().getResources().getColor(c9c0.f80342I), true, true);
                for (int i = 0; i < this.f26557a.getChildCount(); i++) {
                    View childAt = this.f26557a.getChildAt(i);
                    if (childAt != this.f26558b) {
                        bnl0.m105524M(childAt, false);
                    }
                }
            }
        }
    }

    @Override // p153l.orl
    /* JADX INFO: renamed from: e */
    public void mo43424e(final sj6 sj6Var) {
        this.f26562f = sj6Var;
        bnl0.m105524M(this.f26559c, sj6Var.f168926a.muted);
        this.f26558b.setText("");
        bnl0.m105524M(this.f26557a, true);
        VText vText = this.f26558b;
        Message messageM195727p = m195727p(sj6Var);
        Conversation conversation = sj6Var.f168926a;
        ihk.m140015h(vText, messageM195727p, conversation, conversation.muted, sj6Var.f168929d, sj6Var.f168949x, sj6Var.f168912C, new x20() { // from class: l.da6
            @Override // p153l.x20
            public final void call() {
                this.f85845a.m43419M0(sj6Var);
            }
        });
        m43422c1();
    }

    @Override // p153l.ue6
    public /* bridge */ /* synthetic */ HashMap getUserLiveLabelHashMap() {
        return super.getUserLiveLabelHashMap();
    }

    @Override // p153l.orl
    /* JADX INFO: renamed from: m */
    public void mo42024m(sj6 sj6Var) {
        this.f26562f = sj6Var;
        bnl0.m105524M(this.f26561e, false);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m43418B(this);
        if (gra.m131778z()) {
            ue6.m195667e0(this.f26558b);
        }
    }

    @Override // p153l.nrl
    public /* bridge */ /* synthetic */ void setPicPercent(float f) {
        super.setPicPercent(f);
    }

    @Override // p153l.nrl
    /* JADX INFO: renamed from: y0 */
    public void mo43425y0() {
        if (m195708Y(this.f26562f.f168926a)) {
            bnl0.m105524M(this.f26557a, false);
        }
    }

    public ConversationItemGroupSubTitleView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConversationItemGroupSubTitleView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
