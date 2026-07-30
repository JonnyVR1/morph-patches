package com.p000p1.mobile.putong.core.p001ui.messages;

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
import com.p000p1.mobile.putong.core.p001ui.messages.IntrRiskTipItem;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageTipsContent;
import com.p1.mobile.putong.core.data.Sticker;
import com.p1.mobile.putong.core.message.R;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import l.a1c0;
import l.c3c0;
import l.hvc0;
import l.mkd0;
import l.twp;
import l.zvf0;
import org.json.JSONException;
import org.json.JSONObject;
import p003l.e30;
import p003l.j000;
import p003l.m250;
import p003l.qsz;
import p028v.VLinear;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class IntrRiskTipItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public IntrRiskTipItem f607a;

    /* JADX INFO: renamed from: b */
    public VLinear f608b;

    /* JADX INFO: renamed from: c */
    public VText f609c;

    /* JADX INFO: renamed from: d */
    public MessageTipsContent f610d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.IntrRiskTipItem$a */
    public class C0058a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ j000 f611a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Message f612b;

        public C0058a(j000 j000Var, Message message) {
            this.f611a = j000Var;
            this.f612b = message;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            IntrRiskTipItem.this.m975h(this.f611a, this.f612b);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
            textPaint.setColor(hvc0.a(a1c0.w));
        }
    }

    public IntrRiskTipItem(Context context) {
        super(context);
        this.f610d = null;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m969b(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public final void m971d(View view) {
        twp.a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public Act m972e() {
        if (getContext() instanceof Act) {
            return getContext();
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final String m973f() {
        return NullChecker.a(m972e()) ? m972e().pageId() : "";
    }

    /* JADX INFO: renamed from: g */
    public void m974g(j000 j000Var, Message message, qsz qszVar) {
        try {
            this.f610d = (MessageTipsContent) MessageTipsContent.JSON_ADAPTER.parse(new JSONObject(message.localExtraInfo).optString("messageTip"));
        } catch (IOException | JSONException unused) {
        }
        MessageTipsContent messageTipsContent = this.f610d;
        if (messageTipsContent == null || TextUtils.isEmpty(messageTipsContent.value)) {
            return;
        }
        m977j(message, this.f610d, qszVar);
        String strC = hvc0.c(R.string.M0);
        String str = this.f610d.value + strC;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int iIndexOf = str.indexOf(strC);
        if (iIndexOf >= 0) {
            spannableStringBuilder.setSpan(new C0058a(j000Var, message), iIndexOf, strC.length() + iIndexOf, 33);
        }
        this.f609c.setText(spannableStringBuilder);
        this.f608b.setBackground(hvc0.b(c3c0.f1));
        this.f609c.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX INFO: renamed from: h */
    public final void m975h(j000 j000Var, final Message message) {
        m976i();
        message.secondSend = true;
        j000Var.c(m972e(), CoreModule.c.f0.Dn(message.cid, message, (Sticker) null)).subscribe((m250) mkd0.H(new e30() { // from class: l.rwp
            @Override // p003l.e30
            public final void call(Object obj) {
                CoreModule.c.f0.b0.onNext(message);
            }
        }, new e30() { // from class: l.swp
            @Override // p003l.e30
            public final void call(Object obj) {
                IntrRiskTipItem.m969b((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i */
    public final void m976i() {
        if (TextUtils.isEmpty(this.f610d.statsModuleId)) {
            return;
        }
        String strM973f = m973f();
        boolean zIsEmpty = TextUtils.isEmpty(this.f610d.statsModuleParameter);
        MessageTipsContent messageTipsContent = this.f610d;
        if (zIsEmpty) {
            zvf0.r(messageTipsContent.statsModuleId, strM973f);
        } else {
            try {
                zvf0.t(messageTipsContent.statsModuleId, strM973f, new JSONObject(this.f610d.statsModuleParameter));
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m977j(Message message, MessageTipsContent messageTipsContent, qsz qszVar) {
        if (TextUtils.isEmpty(messageTipsContent.statsModuleId) || qszVar.m7030a(((DbObject) message).id)) {
            return;
        }
        qszVar.m7031b(((DbObject) message).id);
        String strM973f = m973f();
        boolean zIsEmpty = TextUtils.isEmpty(messageTipsContent.statsModuleParameter);
        String str = messageTipsContent.statsModuleId;
        if (zIsEmpty) {
            zvf0.x(str, strM973f);
        } else {
            try {
                zvf0.z(str, strM973f, new JSONObject(messageTipsContent.statsModuleParameter));
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m971d(this);
    }

    public IntrRiskTipItem(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f610d = null;
    }

    public IntrRiskTipItem(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f610d = null;
    }
}
