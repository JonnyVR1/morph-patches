package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.os.Build;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.util.AttributeSet;
import android.util.Patterns;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageTipsContent;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.StudentVerificationStatus;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import p151v.VText;
import p153l.ajq;
import p153l.bjq;
import p153l.bnl0;
import p153l.erq;
import p153l.g900;
import p153l.hxj0;
import p153l.ibc0;
import p153l.jyb;
import p153l.l51;
import p153l.ovb0;
import p153l.oze;
import p153l.qa00;
import p153l.tye;

/* JADX INFO: loaded from: classes3.dex */
public class ItemText extends VText implements InterfaceC8682a {

    /* JADX INFO: renamed from: j */
    public static Pattern f32364j;

    /* JADX INFO: renamed from: k */
    public static Pattern f32365k;

    /* JADX INFO: renamed from: l */
    public static Pattern f32366l;

    /* JADX INFO: renamed from: m */
    public static final Pattern f32367m;

    /* JADX INFO: renamed from: i */
    public boolean f32368i;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemText$a */
    public class C8675a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f32369a;

        public C8675a(String str) {
            this.f32369a = str;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            erq.m122257b(ItemText.this.getContext(), this.f32369a);
        }
    }

    static {
        String[] strArr = bjq.f77005a;
        f32364j = Pattern.compile(strArr[0]);
        f32365k = Pattern.compile(strArr[1]);
        f32366l = Pattern.compile(strArr[2]);
        f32367m = Pattern.compile("<a href = \"tantan://msgReport.*\">.*</a>");
    }

    public ItemText(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: F */
    public static void m49905F(SpannableStringBuilder spannableStringBuilder, URLSpan uRLSpan, Message message) {
        boolean z;
        int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
        int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
        int spanFlags = spannableStringBuilder.getSpanFlags(uRLSpan);
        String[] strArr = {"Letv", "LeEco"};
        try {
            String url = uRLSpan.getURL();
            String str = "";
            if (!TextUtils.isEmpty(url) && url.contains(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR)) {
                url = url.replace(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, "");
            }
            URI uri = new URI(url);
            if (Arrays.asList(strArr).contains(Build.BRAND)) {
                spannableStringBuilder.removeSpan(uRLSpan);
            }
            MessageTipsContent messageTipsContentM129476N = g900.m129476N(message);
            if (User.ID_TEAM_ACCOUNT.equals(message.owner) || User.ID_LIVE_SERVICE.equals(message.owner)) {
                str = NullChecker.m82486a(message.extData) ? message.extData.extra : "";
                z = true;
                ajq.m98408h(uri, true);
            } else {
                z = false;
                if (NullChecker.m82486a(messageTipsContentM129476N) && !TextUtils.isEmpty(messageTipsContentM129476N.statsModuleId)) {
                    str = messageTipsContentM129476N.statsModuleId;
                    if (!TextUtils.isEmpty(messageTipsContentM129476N.statsModuleParameter) && m49909t(messageTipsContentM129476N.value)) {
                        str = str + "statsModuleParameter" + messageTipsContentM129476N.statsModuleParameter;
                    }
                }
            }
            spannableStringBuilder.setSpan(bjq.m104638a(uri, z, str, OMSDialogPositon.p_chat_view), spanStart, spanEnd, spanFlags);
        } catch (URISyntaxException e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: p */
    public static CharSequence m49908p(String str, Message message) {
        Spanned spannedFromHtml = Html.fromHtml(str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannedFromHtml);
        for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannedFromHtml.length(), URLSpan.class)) {
            m49905F(spannableStringBuilder, uRLSpan, message);
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: t */
    public static boolean m49909t(String str) {
        return !jyb.m147535x(jyb.m147499b0(f32367m.matcher(str))).isEmpty();
    }

    /* JADX INFO: renamed from: A */
    public void mo43399A(Message message) {
        if (TEnum.equals(message.messageType(), "unknown_")) {
            m49910D(getContext().getResources().getString(R$string.f21865x6), message);
        } else {
            m49910D(message.value, message);
        }
    }

    /* JADX INFO: renamed from: D */
    public void m49910D(String str, Message message) {
        m49911E(str, null, message);
    }

    /* JADX INFO: renamed from: E */
    public void m49911E(String str, InterfaceC8682a.a aVar, Message message) {
        if (str.length() == 1) {
            setGravity(17);
        } else {
            setGravity(0);
        }
        mo49311G(str, aVar, message);
    }

    /* JADX INFO: renamed from: G */
    public void mo49311G(String str, InterfaceC8682a.a aVar, Message message) {
        if (CoreModule.m30933P().m143412i().mo180325G1()) {
            setLargeEmojiForceDisabled(true);
        }
        MessageTipsContent messageTipsContentM129476N = g900.m129476N(message);
        if (TextUtils.isEmpty(str)) {
            setMovementMethod(null);
            setText(str);
            return;
        }
        if (User.isTeamAccount(message.owner) && m49915u(str)) {
            StudentVerificationStatus verificationStatus = getVerificationStatus();
            if (CoreModule.m30933P().m143412i().mo180518p1() && NullChecker.m82486a(verificationStatus)) {
                setMovementMethod(LinkMovementMethod.getInstance());
            } else {
                setMovementMethod(null);
            }
            setText(m49908p(str.replaceAll(SignParameters.NEW_LINE, "<br/>"), message));
            setLongClickCallBack(aVar);
            return;
        }
        if ((User.isTeamAccount(message.owner) || (NullChecker.m82486a(messageTipsContentM129476N) && !TextUtils.isEmpty(messageTipsContentM129476N.value))) && bjq.m104639b(str)) {
            setText(m49908p(str.replaceAll(SignParameters.NEW_LINE, "<br/>"), message));
            setMovementMethod(LinkMovementMethod.getInstance());
            setLongClickCallBack(aVar);
        } else {
            setMovementMethod(null);
            setText(str);
            m49914s();
            m49913r(str, aVar);
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        return jyb.m147507f0(jyb.m147495Z(getContext().getString(R$string.f21676c), new Runnable() { // from class: l.ghq
            @Override // java.lang.Runnable
            public final void run() {
                this.f104138a.m49916w();
            }
        }, Integer.valueOf(ibc0.f114176x1), null));
    }

    public StudentVerificationStatus getVerificationStatus() {
        if (NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116600p9()) && NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116600p9().settings) && NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116600p9().settings.verification) && NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116600p9().settings.verification.studies)) {
            return CoreModule.f18264c.f20381e0.m116600p9().settings.verification.studies.status;
        }
        return null;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1 || !this.f32368i) {
            return super.onTouchEvent(motionEvent);
        }
        this.f32368i = false;
        return true;
    }

    /* JADX INFO: renamed from: q */
    public SpannableStringBuilder m49912q(SpannableStringBuilder spannableStringBuilder) {
        String string = spannableStringBuilder.toString();
        int iIndexOf = string.indexOf(91);
        int iLastIndexOf = string.lastIndexOf(91);
        boolean z = iIndexOf == iLastIndexOf && iLastIndexOf == 0;
        int iIndexOf2 = string.indexOf(93);
        int iLastIndexOf2 = string.lastIndexOf(93);
        boolean z2 = iIndexOf2 == iLastIndexOf2 && iLastIndexOf2 == string.length() - 1;
        if (!z || !z2) {
            return tye.m193573e(spannableStringBuilder, tye.f176661c);
        }
        if (oze.f149871i.contains(string.substring(1, string.length() - 1))) {
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(tye.f176660b), 0, string.indexOf(93) + 1, 33);
            setBackgroundResource(ibc0.f113885P7);
            bnl0.m105554f0(this, qa00.f156322i);
            bnl0.m105550d0(this, 0);
            bnl0.m105552e0(this, 0);
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: r */
    public void m49913r(String str, InterfaceC8682a.a aVar) {
        if (Patterns.WEB_URL.matcher(str).matches() || m49918z()) {
            setLongClickCallBack(aVar);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m49914s() {
        CharSequence text = getText();
        if (text instanceof Spannable) {
            Spannable spannable = (Spannable) text;
            URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, text.length(), URLSpan.class);
            if (!NullChecker.m82486a(uRLSpanArr) || uRLSpanArr.length <= 0) {
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
            spannableStringBuilder.clearSpans();
            for (URLSpan uRLSpan : uRLSpanArr) {
                String url = uRLSpan.getURL();
                if (url.indexOf("http://") == 0 || url.indexOf("https://") == 0) {
                    spannableStringBuilder.setSpan(new C8675a(url), spannable.getSpanStart(uRLSpan), spannable.getSpanEnd(uRLSpan), 34);
                }
            }
            setText(m49912q(spannableStringBuilder));
        }
    }

    public void setLongClickCallBack(final InterfaceC8682a.a aVar) {
        if (aVar == null) {
            setOnClickListener(null);
        } else {
            setOnLongClickListener(new View.OnLongClickListener() { // from class: l.fhq
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return this.f99098a.m49917x(aVar, view);
                }
            });
        }
    }

    @Override // p151v.VText, android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(hxj0.m137614c(charSequence), bufferType);
    }

    /* JADX INFO: renamed from: u */
    public boolean m49915u(String str) {
        return !jyb.m147535x(jyb.m147499b0(f32364j.matcher(str)), jyb.m147499b0(f32365k.matcher(str)), jyb.m147499b0(f32366l.matcher(str))).isEmpty();
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m49916w() {
        l51.m152911q(getText().toString());
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean m49917x(InterfaceC8682a.a aVar, View view) {
        aVar.mo49534a();
        this.f32368i = true;
        return true;
    }

    /* JADX INFO: renamed from: y */
    public void mo49313y(Message message, InterfaceC8682a.a aVar) {
        if (TEnum.equals(message.messageType(), "unknown_")) {
            m49911E(getContext().getResources().getString(R$string.f21865x6), aVar, message);
        } else {
            m49911E(message.value, aVar, message);
        }
    }

    /* JADX INFO: renamed from: z */
    public final boolean m49918z() {
        if (getText() instanceof Spanned) {
            Spanned spanned = (Spanned) getText();
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(0, getText().length(), ClickableSpan.class);
            if (NullChecker.m82486a(clickableSpanArr) && clickableSpanArr.length > 0) {
                return true;
            }
            URLSpan[] uRLSpanArr = (URLSpan[]) spanned.getSpans(0, getText().length(), URLSpan.class);
            if (NullChecker.m82486a(uRLSpanArr) && uRLSpanArr.length > 0) {
                return true;
            }
        }
        return false;
    }

    public ItemText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
