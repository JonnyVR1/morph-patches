package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageTipsContent;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.messages.IntrRiskTipItem;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import p147v.VLinear;
import p147v.VText;
import p149l.a1c0;
import p149l.c3c0;
import p149l.e30;
import p149l.hvc0;
import p149l.j000;
import p149l.mkd0;
import p149l.qsz;
import p149l.twp;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class IntrRiskTipItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public IntrRiskTipItem f30716a;

    /* JADX INFO: renamed from: b */
    public VLinear f30717b;

    /* JADX INFO: renamed from: c */
    public VText f30718c;

    /* JADX INFO: renamed from: d */
    public MessageTipsContent f30719d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.IntrRiskTipItem$a */
    public class C8475a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ j000 f30720a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Message f30721b;

        public C8475a(j000 j000Var, Message message) {
            this.f30720a = j000Var;
            this.f30721b = message;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            IntrRiskTipItem.this.m47902h(this.f30720a, this.f30721b);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
            textPaint.setColor(hvc0.m133154a(a1c0.f67169w));
        }
    }

    public IntrRiskTipItem(Context context) {
        super(context);
        this.f30719d = null;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m47896b(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public final void m47898d(View view) {
        twp.m190868a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public Act m47899e() {
        if (getContext() instanceof Act) {
            return (Act) getContext();
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final String m47900f() {
        return NullChecker.m81303a(m47899e()) ? m47899e().pageId() : "";
    }

    /* JADX INFO: renamed from: g */
    public void m47901g(j000 j000Var, Message message, qsz qszVar) {
        try {
            this.f30719d = MessageTipsContent.JSON_ADAPTER.parse(new JSONObject(message.localExtraInfo).optString("messageTip"));
        } catch (IOException | JSONException unused) {
        }
        MessageTipsContent messageTipsContent = this.f30719d;
        if (messageTipsContent == null || TextUtils.isEmpty(messageTipsContent.value)) {
            return;
        }
        m47904j(message, this.f30719d, qszVar);
        String strM133156c = hvc0.m133156c(R$string.f20805M0);
        String str = this.f30719d.value + strM133156c;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int iIndexOf = str.indexOf(strM133156c);
        if (iIndexOf >= 0) {
            spannableStringBuilder.setSpan(new C8475a(j000Var, message), iIndexOf, strM133156c.length() + iIndexOf, 33);
        }
        this.f30718c.setText(spannableStringBuilder);
        this.f30717b.setBackground(hvc0.m133155b(c3c0.f78739f1));
        this.f30718c.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX INFO: renamed from: h */
    public final void m47902h(j000 j000Var, final Message message) {
        m47903i();
        message.secondSend = true;
        j000Var.mo67374c(m47899e(), CoreModule.f17545c.f19642f0.m32623Dn(message.cid, message, null)).subscribe(mkd0.m154956H(new e30() { // from class: l.rwp
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreModule.f17545c.f19642f0.f19922b0.onNext(message);
            }
        }, new e30() { // from class: l.swp
            @Override // p149l.e30
            public final void call(Object obj) {
                IntrRiskTipItem.m47896b((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i */
    public final void m47903i() {
        if (TextUtils.isEmpty(this.f30719d.statsModuleId)) {
            return;
        }
        String strM47900f = m47900f();
        boolean zIsEmpty = TextUtils.isEmpty(this.f30719d.statsModuleParameter);
        MessageTipsContent messageTipsContent = this.f30719d;
        if (zIsEmpty) {
            zvf0.m220396r(messageTipsContent.statsModuleId, strM47900f);
        } else {
            try {
                zvf0.m220398t(messageTipsContent.statsModuleId, strM47900f, new JSONObject(this.f30719d.statsModuleParameter));
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m47904j(Message message, MessageTipsContent messageTipsContent, qsz qszVar) {
        if (TextUtils.isEmpty(messageTipsContent.statsModuleId) || qszVar.m176377a(message.f56011id)) {
            return;
        }
        qszVar.m176378b(message.f56011id);
        String strM47900f = m47900f();
        boolean zIsEmpty = TextUtils.isEmpty(messageTipsContent.statsModuleParameter);
        String str = messageTipsContent.statsModuleId;
        if (zIsEmpty) {
            zvf0.m220402x(str, strM47900f);
        } else {
            try {
                zvf0.m220404z(str, strM47900f, new JSONObject(messageTipsContent.statsModuleParameter));
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m47898d(this);
    }

    public IntrRiskTipItem(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30719d = null;
    }

    public IntrRiskTipItem(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30719d = null;
    }
}
