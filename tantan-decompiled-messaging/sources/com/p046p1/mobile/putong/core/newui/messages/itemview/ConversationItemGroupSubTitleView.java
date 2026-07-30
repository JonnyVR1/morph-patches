package com.p046p1.mobile.putong.core.newui.messages.itemview;

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
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.ConversationType;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserLiveLabel;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import p147v.VImage;
import p147v.VText;
import p149l.cpl;
import p149l.d30;
import p149l.mse;
import p149l.pi6;
import p149l.qp8;
import p149l.rd6;
import p149l.sek;
import p149l.upa;
import p149l.w0c0;
import p149l.xdl0;
import p149l.z86;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationItemGroupSubTitleView extends LinearLayout implements cpl {

    /* JADX INFO: renamed from: a */
    public ConversationItemGroupSubTitleView f25815a;

    /* JADX INFO: renamed from: b */
    public VText f25816b;

    /* JADX INFO: renamed from: c */
    public VImage f25817c;

    /* JADX INFO: renamed from: d */
    public View f25818d;

    /* JADX INFO: renamed from: e */
    public VText f25819e;

    /* JADX INFO: renamed from: f */
    public pi6 f25820f;

    public ConversationItemGroupSubTitleView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: B */
    public final void m42407B(View view) {
        z86.m217579a(this, view);
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ void m42408M0(pi6 pi6Var) {
        if (!pi6Var.f149086B.ownerUserId.equals(CoreModule.m29932K().me_().f56011id) && m178891H(pi6Var, false)) {
            User userNew_ = User.new_();
            userNew_.f56011id = pi6Var.f149086B.ownerUserId;
            pi6Var.f149102b = userNew_;
            m42410b1();
        }
        mo42414y0();
        m42412d1();
    }

    @Override // p149l.cpl
    /* JADX INFO: renamed from: Q0 */
    public void mo42409Q0(pi6 pi6Var) {
        this.f25820f = pi6Var;
        if (NullChecker.m81303a(pi6Var.f149101a) && TextUtils.equals(pi6Var.f149101a.convType, ConversationType.intlSeeChatRequest)) {
            return;
        }
        mo42414y0();
        m42412d1();
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
    public final void m42410b1() {
        String strM178900O0;
        boolean z;
        int color;
        SpannableStringBuilder spannableStringBuilder;
        CharSequence text;
        boolean zM194726a2 = upa.m194726a2();
        pi6 pi6Var = this.f25820f;
        if (zM194726a2) {
            UserLiveLabel userLiveLabelM178917a0 = m178917a0(pi6Var, m178911V0(pi6Var.f149105e));
            if (qp8.m175817b() && upa.m194726a2() && TEnum.equals(this.f25820f.f149101a.status, "default") && userLiveLabelM178917a0 != null) {
                strM178900O0 = m178901P0(this.f25820f, userLiveLabelM178917a0);
                if ("onVoice".equals(userLiveLabelM178917a0.liveState)) {
                    z = true;
                }
                if (TextUtils.isEmpty(strM178900O0)) {
                }
                if (z) {
                    color = Color.parseColor("#35D3FF");
                } else if (strM178900O0.equals(getResources().getString(R$string.f18426ch))) {
                    color = Color.parseColor("#ff5eea");
                } else {
                    color = Color.parseColor("#ff5eea");
                }
                spannableStringBuilder = new SpannableStringBuilder();
                SpannableString spannableString = new SpannableString(strM178900O0);
                spannableString.setSpan(new ForegroundColorSpan(color), 0, strM178900O0.length(), 33);
                spannableString.setSpan(new StyleSpan(1), 0, strM178900O0.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
                text = this.f25816b.getText();
                if (!TextUtils.isEmpty(text)) {
                    SpannableString spannableString2 = new SpannableString(" · ");
                    spannableString2.setSpan(new ForegroundColorSpan(color), 0, 3, 33);
                    spannableStringBuilder.append((CharSequence) spannableString2);
                    spannableStringBuilder.append(text);
                }
                this.f25816b.setText(spannableStringBuilder);
            }
            strM178900O0 = "";
        } else {
            strM178900O0 = m178900O0(pi6Var, false, pi6Var.f149105e);
        }
        z = false;
        if (TextUtils.isEmpty(strM178900O0)) {
            if (z) {
                color = Color.parseColor("#35D3FF");
            } else if (strM178900O0.equals(getResources().getString(R$string.f18426ch))) {
                color = Color.parseColor("#ff5eea");
            } else {
                color = Color.parseColor("#ff5eea");
            }
            spannableStringBuilder = new SpannableStringBuilder();
            SpannableString spannableString3 = new SpannableString(strM178900O0);
            spannableString3.setSpan(new ForegroundColorSpan(color), 0, strM178900O0.length(), 33);
            spannableString3.setSpan(new StyleSpan(1), 0, strM178900O0.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString3);
            text = this.f25816b.getText();
            if (!TextUtils.isEmpty(text)) {
                SpannableString spannableString4 = new SpannableString(" · ");
                spannableString4.setSpan(new ForegroundColorSpan(color), 0, 3, 33);
                spannableStringBuilder.append((CharSequence) spannableString4);
                spannableStringBuilder.append(text);
            }
            this.f25816b.setText(spannableStringBuilder);
        }
    }

    /* JADX INFO: renamed from: c1 */
    public final void m42411c1() {
        xdl0.m208344M(this.f25819e, false);
    }

    /* JADX INFO: renamed from: d1 */
    public void m42412d1() {
        pi6 pi6Var = this.f25820f;
        if (pi6Var.f149115o) {
            boolean z = NullChecker.m81303a(pi6Var.f149101a) && !TextUtils.isEmpty(this.f25820f.f149116p) && TextUtils.equals("group", this.f25820f.f149101a.convType);
            xdl0.m208344M(this.f25816b, z);
            xdl0.m208344M(this.f25815a, z);
            if (z) {
                mse.m156129b(this.f25816b, Html.fromHtml(this.f25820f.f149117q).toString(), this.f25820f.f149120t, getContext().getResources().getColor(w0c0.f183773I), true, true);
                for (int i = 0; i < this.f25815a.getChildCount(); i++) {
                    View childAt = this.f25815a.getChildAt(i);
                    if (childAt != this.f25816b) {
                        xdl0.m208344M(childAt, false);
                    }
                }
            }
        }
    }

    @Override // p149l.cpl
    /* JADX INFO: renamed from: e */
    public void mo42413e(final pi6 pi6Var) {
        this.f25820f = pi6Var;
        xdl0.m208344M(this.f25817c, pi6Var.f149101a.muted);
        this.f25816b.setText("");
        xdl0.m208344M(this.f25815a, true);
        VText vText = this.f25816b;
        Message messageM178933p = m178933p(pi6Var);
        Conversation conversation = pi6Var.f149101a;
        sek.m183670h(vText, messageM178933p, conversation, conversation.muted, pi6Var.f149104d, pi6Var.f149124x, pi6Var.f149087C, new d30() { // from class: l.y86
            @Override // p149l.d30
            public final void call() {
                this.f196778a.m42408M0(pi6Var);
            }
        });
        m42411c1();
    }

    @Override // p149l.rd6
    public /* bridge */ /* synthetic */ HashMap getUserLiveLabelHashMap() {
        return super.getUserLiveLabelHashMap();
    }

    @Override // p149l.cpl
    /* JADX INFO: renamed from: m */
    public void mo41013m(pi6 pi6Var) {
        this.f25820f = pi6Var;
        xdl0.m208344M(this.f25819e, false);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m42407B(this);
        if (upa.m194847z()) {
            rd6.m178873e0(this.f25816b);
        }
    }

    @Override // p149l.bpl
    public /* bridge */ /* synthetic */ void setPicPercent(float f) {
        super.setPicPercent(f);
    }

    @Override // p149l.bpl
    /* JADX INFO: renamed from: y0 */
    public void mo42414y0() {
        if (m178914Y(this.f25820f.f149101a)) {
            xdl0.m208344M(this.f25815a, false);
        }
    }

    public ConversationItemGroupSubTitleView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConversationItemGroupSubTitleView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
