package com.p051p1.mobile.putong.core.newui.messages.expirence.view;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.TacitTestProfileCard;
import com.p051p1.mobile.putong.core.newui.messages.expirence.view.ItemChallengeTipsMsg;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import p137rx.C22421c;
import p151v.VText;
import p151v.text.CustomTypefaceSpan;
import p153l.g9c0;
import p153l.gta;
import p153l.i4g0;
import p153l.lyh0;
import p153l.n100;
import p153l.o3q;
import p153l.psd0;
import p153l.r1j0;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class ItemChallengeTipsMsg extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VText f26516a;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.expirence.view.ItemChallengeTipsMsg$a */
    public class C8328a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f26517a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f26518b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Message f26519c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ n100 f26520d;

        public C8328a(Act act, String str, Message message, n100 n100Var) {
            this.f26517a = act;
            this.f26518b = str;
            this.f26519c = message;
            this.f26520d = n100Var;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m43380a(Act act, Message message, TacitTestProfileCard tacitTestProfileCard) {
            boolean z = tacitTestProfileCard.userState;
            if (z && tacitTestProfileCard.otherUserState) {
                CoreModule.m30933P().m143405a().mo180456d5(act, "", message.cid, "conversation_plus");
                return;
            }
            if (!z && !TextUtils.isEmpty(tacitTestProfileCard.userStateText)) {
                r1j0.m179415b(tacitTestProfileCard.userStateText);
            } else {
                if (tacitTestProfileCard.otherUserState || TextUtils.isEmpty(tacitTestProfileCard.otherUserStateText)) {
                    return;
                }
                r1j0.m179415b(tacitTestProfileCard.otherUserStateText);
            }
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m43381b(Throwable th) {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            Act act = this.f26517a;
            C4883c c4883c = CoreModule.f18264c;
            C22421c c22421cDuringCreated = act.duringCreated(c4883c.f20316I1.m195827d3(c4883c.f20381e0.m116600p9().f56859id, this.f26518b));
            final Act act2 = this.f26517a;
            final Message message = this.f26519c;
            c22421cDuringCreated.subscribe(psd0.m173597H(new y20() { // from class: l.m3q
                @Override // p153l.y20
                public final void call(Object obj) {
                    ItemChallengeTipsMsg.C8328a.m43380a(act2, message, (TacitTestProfileCard) obj);
                }
            }, new y20() { // from class: l.n3q
                @Override // p153l.y20
                public final void call(Object obj) {
                    ItemChallengeTipsMsg.C8328a.m43381b((Throwable) obj);
                }
            }));
            ItemChallengeTipsMsg.this.m43379d(false, this.f26520d);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    public ItemChallengeTipsMsg(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m43377b(View view) {
        o3q.m165883a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m43378c(Act act, Message message, String str, n100 n100Var) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("想要了解你更多,邀你测一测～\n");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "开始真相测试");
        spannableStringBuilder.setSpan(new C8328a(act, str, message, n100Var), length, length + 6, 33);
        spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", lyh0.m156283c(3), getResources().getColor(gta.m132210e().m132214d().mo34702I4() ? g9c0.f102820j : g9c0.f102834x)), length, spannableStringBuilder.length(), 33);
        this.f26516a.setText(spannableStringBuilder);
        this.f26516a.setMovementMethod(LinkMovementMethod.getInstance());
        m43379d(true, n100Var);
    }

    /* JADX INFO: renamed from: d */
    public final void m43379d(boolean z, n100 n100Var) {
        if (!z) {
            i4g0.m138520r("e_message_guide", OMSDialogPositon.p_chat_view);
        } else {
            if (n100Var.m161054a("CHALLENGE_TIPS_MV_KEY")) {
                return;
            }
            n100Var.m161055b("CHALLENGE_TIPS_MV_KEY");
            i4g0.m138526x("e_message_guide", OMSDialogPositon.p_chat_view);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m43377b(this);
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f26516a.setTextColor(getResources().getColor(g9c0.f102819i));
        }
    }

    public ItemChallengeTipsMsg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemChallengeTipsMsg(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ItemChallengeTipsMsg(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
