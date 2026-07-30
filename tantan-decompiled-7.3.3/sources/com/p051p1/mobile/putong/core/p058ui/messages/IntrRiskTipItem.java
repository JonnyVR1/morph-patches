package com.p051p1.mobile.putong.core.p058ui.messages;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageTipsContent;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.messages.IntrRiskTipItem;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import p151v.VLinear;
import p151v.VText;
import p153l.g900;
import p153l.g9c0;
import p153l.i4g0;
import p153l.ibc0;
import p153l.k3d0;
import p153l.n100;
import p153l.psd0;
import p153l.typ;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class IntrRiskTipItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public IntrRiskTipItem f31564a;

    /* JADX INFO: renamed from: b */
    public VLinear f31565b;

    /* JADX INFO: renamed from: c */
    public VText f31566c;

    /* JADX INFO: renamed from: d */
    public MessageTipsContent f31567d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.IntrRiskTipItem$a */
    public class C8638a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ g900 f31568a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Message f31569b;

        public C8638a(g900 g900Var, Message message) {
            this.f31568a = g900Var;
            this.f31569b = message;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            IntrRiskTipItem.this.m49085h(this.f31568a, this.f31569b);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
            textPaint.setColor(k3d0.m148005a(g9c0.f102833w));
        }
    }

    public IntrRiskTipItem(Context context) {
        super(context);
        this.f31567d = null;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m49079b(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public final void m49081d(View view) {
        typ.m193598a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public Act m49082e() {
        if (getContext() instanceof Act) {
            return (Act) getContext();
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final String m49083f() {
        return NullChecker.m82486a(m49082e()) ? m49082e().pageId() : "";
    }

    /* JADX INFO: renamed from: g */
    public void m49084g(g900 g900Var, Message message, n100 n100Var) {
        try {
            this.f31567d = MessageTipsContent.JSON_ADAPTER.parse(new JSONObject(message.localExtraInfo).optString("messageTip"));
        } catch (IOException | JSONException unused) {
        }
        MessageTipsContent messageTipsContent = this.f31567d;
        if (messageTipsContent == null || TextUtils.isEmpty(messageTipsContent.value)) {
            return;
        }
        m49087j(message, this.f31567d, n100Var);
        String strM148007c = k3d0.m148007c(R$string.f21547M0);
        String str = this.f31567d.value + strM148007c;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int iIndexOf = str.indexOf(strM148007c);
        if (iIndexOf >= 0) {
            spannableStringBuilder.setSpan(new C8638a(g900Var, message), iIndexOf, strM148007c.length() + iIndexOf, 33);
        }
        this.f31566c.setText(spannableStringBuilder);
        this.f31565b.setBackground(k3d0.m148006b(ibc0.f114014f1));
        this.f31566c.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX INFO: renamed from: h */
    public final void m49085h(g900 g900Var, final Message message) {
        m49086i();
        message.secondSend = true;
        g900Var.mo68557c(m49082e(), CoreModule.f18264c.f20384f0.m33626Dn(message.cid, message, null)).subscribe(psd0.m173597H(new y20() { // from class: l.ryp
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreModule.f18264c.f20384f0.f20664b0.onNext(message);
            }
        }, new y20() { // from class: l.syp
            @Override // p153l.y20
            public final void call(Object obj) {
                IntrRiskTipItem.m49079b((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i */
    public final void m49086i() {
        if (TextUtils.isEmpty(this.f31567d.statsModuleId)) {
            return;
        }
        String strM49083f = m49083f();
        boolean zIsEmpty = TextUtils.isEmpty(this.f31567d.statsModuleParameter);
        MessageTipsContent messageTipsContent = this.f31567d;
        if (zIsEmpty) {
            i4g0.m138520r(messageTipsContent.statsModuleId, strM49083f);
        } else {
            try {
                i4g0.m138522t(messageTipsContent.statsModuleId, strM49083f, new JSONObject(this.f31567d.statsModuleParameter));
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m49087j(Message message, MessageTipsContent messageTipsContent, n100 n100Var) {
        if (TextUtils.isEmpty(messageTipsContent.statsModuleId) || n100Var.m161054a(message.f56859id)) {
            return;
        }
        n100Var.m161055b(message.f56859id);
        String strM49083f = m49083f();
        boolean zIsEmpty = TextUtils.isEmpty(messageTipsContent.statsModuleParameter);
        String str = messageTipsContent.statsModuleId;
        if (zIsEmpty) {
            i4g0.m138526x(str, strM49083f);
        } else {
            try {
                i4g0.m138528z(str, strM49083f, new JSONObject(messageTipsContent.statsModuleParameter));
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49081d(this);
    }

    public IntrRiskTipItem(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31567d = null;
    }

    public IntrRiskTipItem(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31567d = null;
    }
}
