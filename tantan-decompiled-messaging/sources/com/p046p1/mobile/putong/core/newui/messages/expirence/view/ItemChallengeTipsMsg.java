package com.p046p1.mobile.putong.core.newui.messages.expirence.view;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.TacitTestProfileCard;
import com.p046p1.mobile.putong.core.newui.messages.expirence.view.ItemChallengeTipsMsg;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import p133rx.C22306c;
import p147v.VText;
import p147v.text.CustomTypefaceSpan;
import p149l.a1c0;
import p149l.e30;
import p149l.eqh0;
import p149l.mkd0;
import p149l.o1q;
import p149l.osi0;
import p149l.qsz;
import p149l.ura;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class ItemChallengeTipsMsg extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VText f25774a;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.expirence.view.ItemChallengeTipsMsg$a */
    public class C8177a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f25775a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f25776b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Message f25777c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ qsz f25778d;

        public C8177a(Act act, String str, Message message, qsz qszVar) {
            this.f25775a = act;
            this.f25776b = str;
            this.f25777c = message;
            this.f25778d = qszVar;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m42369a(Act act, Message message, TacitTestProfileCard tacitTestProfileCard) {
            boolean z = tacitTestProfileCard.userState;
            if (z && tacitTestProfileCard.otherUserState) {
                CoreModule.m29935P().m94651a().mo158364d5(act, "", message.cid, "conversation_plus");
                return;
            }
            if (!z && !TextUtils.isEmpty(tacitTestProfileCard.userStateText)) {
                osi0.m165778b(tacitTestProfileCard.userStateText);
            } else {
                if (tacitTestProfileCard.otherUserState || TextUtils.isEmpty(tacitTestProfileCard.otherUserStateText)) {
                    return;
                }
                osi0.m165778b(tacitTestProfileCard.otherUserStateText);
            }
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m42370b(Throwable th) {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            Act act = this.f25775a;
            C4732c c4732c = CoreModule.f17545c;
            C22306c c22306cDuringCreated = act.duringCreated(c4732c.f19574I1.m174184d3(c4732c.f19639e0.m169527p9().f56011id, this.f25776b));
            final Act act2 = this.f25775a;
            final Message message = this.f25777c;
            c22306cDuringCreated.subscribe(mkd0.m154956H(new e30() { // from class: l.m1q
                @Override // p149l.e30
                public final void call(Object obj) {
                    ItemChallengeTipsMsg.C8177a.m42369a(act2, message, (TacitTestProfileCard) obj);
                }
            }, new e30() { // from class: l.n1q
                @Override // p149l.e30
                public final void call(Object obj) {
                    ItemChallengeTipsMsg.C8177a.m42370b((Throwable) obj);
                }
            }));
            ItemChallengeTipsMsg.this.m42368d(false, this.f25778d);
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
    public final void m42366b(View view) {
        o1q.m162269a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m42367c(Act act, Message message, String str, qsz qszVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("想要了解你更多,邀你测一测～\n");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "开始真相测试");
        spannableStringBuilder.setSpan(new C8177a(act, str, message, qszVar), length, length + 6, 33);
        spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", eqh0.m117752c(3), getResources().getColor(ura.m195053e().m195057d().mo33699I4() ? a1c0.f67156j : a1c0.f67170x)), length, spannableStringBuilder.length(), 33);
        this.f25774a.setText(spannableStringBuilder);
        this.f25774a.setMovementMethod(LinkMovementMethod.getInstance());
        m42368d(true, qszVar);
    }

    /* JADX INFO: renamed from: d */
    public final void m42368d(boolean z, qsz qszVar) {
        if (!z) {
            zvf0.m220396r("e_message_guide", OMSDialogPositon.p_chat_view);
        } else {
            if (qszVar.m176377a("CHALLENGE_TIPS_MV_KEY")) {
                return;
            }
            qszVar.m176378b("CHALLENGE_TIPS_MV_KEY");
            zvf0.m220402x("e_message_guide", OMSDialogPositon.p_chat_view);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m42366b(this);
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f25774a.setTextColor(getResources().getColor(a1c0.f67155i));
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
