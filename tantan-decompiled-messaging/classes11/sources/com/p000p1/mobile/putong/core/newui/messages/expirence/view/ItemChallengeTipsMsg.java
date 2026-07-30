package com.p000p1.mobile.putong.core.newui.messages.expirence.view;

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
import com.p000p1.mobile.putong.core.newui.messages.expirence.view.ItemChallengeTipsMsg;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.c;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.TacitTestProfileCard;
import com.tantanapp.common.data.DbObject;
import l.a1c0;
import l.e30;
import l.eqh0;
import l.mkd0;
import l.o1q;
import l.osi0;
import l.qsz;
import l.ura;
import l.zvf0;
import v.VText;
import v.text.CustomTypefaceSpan;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ItemChallengeTipsMsg extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VText f4552a;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.expirence.view.ItemChallengeTipsMsg$a */
    public class C0341a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f4553a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f4554b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Message f4555c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ qsz f4556d;

        public C0341a(Act act, String str, Message message, qsz qszVar) {
            this.f4553a = act;
            this.f4554b = str;
            this.f4555c = message;
            this.f4556d = qszVar;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m6524a(Act act, Message message, TacitTestProfileCard tacitTestProfileCard) {
            boolean z = tacitTestProfileCard.userState;
            if (z && tacitTestProfileCard.otherUserState) {
                CoreModule.P().a().d5(act, "", message.cid, "conversation_plus");
                return;
            }
            if (!z && !TextUtils.isEmpty(tacitTestProfileCard.userStateText)) {
                osi0.b(tacitTestProfileCard.userStateText);
            } else {
                if (tacitTestProfileCard.otherUserState || TextUtils.isEmpty(tacitTestProfileCard.otherUserStateText)) {
                    return;
                }
                osi0.b(tacitTestProfileCard.otherUserStateText);
            }
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m6525b(Throwable th) {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            Act act = this.f4553a;
            c cVar = CoreModule.c;
            rx.c cVarDuringCreated = act.duringCreated(cVar.I1.d3(((DbObject) cVar.e0.p9()).id, this.f4554b));
            final Act act2 = this.f4553a;
            final Message message = this.f4555c;
            cVarDuringCreated.subscribe(mkd0.H(new e30() { // from class: l.m1q
                public final void call(Object obj) {
                    ItemChallengeTipsMsg.C0341a.m6524a(act2, message, (TacitTestProfileCard) obj);
                }
            }, new e30() { // from class: l.n1q
                public final void call(Object obj) {
                    ItemChallengeTipsMsg.C0341a.m6525b((Throwable) obj);
                }
            }));
            ItemChallengeTipsMsg.this.m6523d(false, this.f4556d);
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
    public final void m6521b(View view) {
        o1q.a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m6522c(Act act, Message message, String str, qsz qszVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("想要了解你更多,邀你测一测～\n");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "开始真相测试");
        spannableStringBuilder.setSpan(new C0341a(act, str, message, qszVar), length, length + 6, 33);
        spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", eqh0.c(3), getResources().getColor(ura.e().d().I4() ? a1c0.j : a1c0.x)), length, spannableStringBuilder.length(), 33);
        this.f4552a.setText(spannableStringBuilder);
        this.f4552a.setMovementMethod(LinkMovementMethod.getInstance());
        m6523d(true, qszVar);
    }

    /* JADX INFO: renamed from: d */
    public final void m6523d(boolean z, qsz qszVar) {
        if (!z) {
            zvf0.r("e_message_guide", "p_chat_view");
        } else {
            if (qszVar.a("CHALLENGE_TIPS_MV_KEY")) {
                return;
            }
            qszVar.b("CHALLENGE_TIPS_MV_KEY");
            zvf0.x("e_message_guide", "p_chat_view");
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6521b(this);
        if (ura.e().d().I4()) {
            this.f4552a.setTextColor(getResources().getColor(a1c0.i));
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
