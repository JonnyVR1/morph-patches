package com.p046p1.mobile.putong.core.p053ui.messages;

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
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageTipsContent;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.StudentVerificationStatus;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import p147v.VText;
import p149l.ahq;
import p149l.bhq;
import p149l.c3c0;
import p149l.e51;
import p149l.eoj0;
import p149l.epq;
import p149l.j000;
import p149l.knb0;
import p149l.kye;
import p149l.pxe;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemText extends VText implements InterfaceC8519a {

    /* JADX INFO: renamed from: j */
    public static Pattern f31516j;

    /* JADX INFO: renamed from: k */
    public static Pattern f31517k;

    /* JADX INFO: renamed from: l */
    public static Pattern f31518l;

    /* JADX INFO: renamed from: m */
    public static final Pattern f31519m;

    /* JADX INFO: renamed from: i */
    public boolean f31520i;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemText$a */
    public class C8512a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f31521a;

        public C8512a(String str) {
            this.f31521a = str;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            epq.m117671b(ItemText.this.getContext(), this.f31521a);
        }
    }

    static {
        String[] strArr = bhq.f75645a;
        f31516j = Pattern.compile(strArr[0]);
        f31517k = Pattern.compile(strArr[1]);
        f31518l = Pattern.compile(strArr[2]);
        f31519m = Pattern.compile("<a href = \"tantan://msgReport.*\">.*</a>");
    }

    public ItemText(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: F */
    public static void m48722F(SpannableStringBuilder spannableStringBuilder, URLSpan uRLSpan, Message message) {
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
            MessageTipsContent messageTipsContentM139089N = j000.m139089N(message);
            if (User.ID_TEAM_ACCOUNT.equals(message.owner) || User.ID_LIVE_SERVICE.equals(message.owner)) {
                str = NullChecker.m81303a(message.extData) ? message.extData.extra : "";
                z = true;
                ahq.m96550h(uri, true);
            } else {
                z = false;
                if (NullChecker.m81303a(messageTipsContentM139089N) && !TextUtils.isEmpty(messageTipsContentM139089N.statsModuleId)) {
                    str = messageTipsContentM139089N.statsModuleId;
                    if (!TextUtils.isEmpty(messageTipsContentM139089N.statsModuleParameter) && m48726t(messageTipsContentM139089N.value)) {
                        str = str + "statsModuleParameter" + messageTipsContentM139089N.statsModuleParameter;
                    }
                }
            }
            spannableStringBuilder.setSpan(bhq.m101909a(uri, z, str, OMSDialogPositon.p_chat_view), spanStart, spanEnd, spanFlags);
        } catch (URISyntaxException e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: p */
    public static CharSequence m48725p(String str, Message message) {
        Spanned spannedFromHtml = Html.fromHtml(str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannedFromHtml);
        for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannedFromHtml.length(), URLSpan.class)) {
            m48722F(spannableStringBuilder, uRLSpan, message);
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: t */
    public static boolean m48726t(String str) {
        return !vwb.m200352x(vwb.m200316b0(f31519m.matcher(str))).isEmpty();
    }

    /* JADX INFO: renamed from: A */
    public void mo42388A(Message message) {
        if (TEnum.equals(message.messageType(), "unknown_")) {
            m48727D(getContext().getResources().getString(R$string.f21123x6), message);
        } else {
            m48727D(message.value, message);
        }
    }

    /* JADX INFO: renamed from: D */
    public void m48727D(String str, Message message) {
        m48728E(str, null, message);
    }

    /* JADX INFO: renamed from: E */
    public void m48728E(String str, InterfaceC8519a.a aVar, Message message) {
        if (str.length() == 1) {
            setGravity(17);
        } else {
            setGravity(0);
        }
        mo48128G(str, aVar, message);
    }

    /* JADX INFO: renamed from: G */
    public void mo48128G(String str, InterfaceC8519a.a aVar, Message message) {
        if (CoreModule.m29935P().m94658i().mo158233G1()) {
            setLargeEmojiForceDisabled(true);
        }
        MessageTipsContent messageTipsContentM139089N = j000.m139089N(message);
        if (TextUtils.isEmpty(str)) {
            setMovementMethod(null);
            setText(str);
            return;
        }
        if (User.isTeamAccount(message.owner) && m48732u(str)) {
            StudentVerificationStatus verificationStatus = getVerificationStatus();
            if (CoreModule.m29935P().m94658i().mo158426p1() && NullChecker.m81303a(verificationStatus)) {
                setMovementMethod(LinkMovementMethod.getInstance());
            } else {
                setMovementMethod(null);
            }
            setText(m48725p(str.replaceAll(SignParameters.NEW_LINE, "<br/>"), message));
            setLongClickCallBack(aVar);
            return;
        }
        if ((User.isTeamAccount(message.owner) || (NullChecker.m81303a(messageTipsContentM139089N) && !TextUtils.isEmpty(messageTipsContentM139089N.value))) && bhq.m101910b(str)) {
            setText(m48725p(str.replaceAll(SignParameters.NEW_LINE, "<br/>"), message));
            setMovementMethod(LinkMovementMethod.getInstance());
            setLongClickCallBack(aVar);
        } else {
            setMovementMethod(null);
            setText(str);
            m48731s();
            m48730r(str, aVar);
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        return vwb.m200324f0(vwb.m200312Z(getContext().getString(R$string.f20934c), new Runnable() { // from class: l.gfq
            @Override // java.lang.Runnable
            public final void run() {
                this.f102425a.m48733w();
            }
        }, Integer.valueOf(c3c0.f78901x1), null));
    }

    public StudentVerificationStatus getVerificationStatus() {
        if (NullChecker.m81303a(CoreModule.f17545c.f19639e0.m169527p9()) && NullChecker.m81303a(CoreModule.f17545c.f19639e0.m169527p9().settings) && NullChecker.m81303a(CoreModule.f17545c.f19639e0.m169527p9().settings.verification) && NullChecker.m81303a(CoreModule.f17545c.f19639e0.m169527p9().settings.verification.studies)) {
            return CoreModule.f17545c.f19639e0.m169527p9().settings.verification.studies.status;
        }
        return null;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1 || !this.f31520i) {
            return super.onTouchEvent(motionEvent);
        }
        this.f31520i = false;
        return true;
    }

    /* JADX INFO: renamed from: q */
    public SpannableStringBuilder m48729q(SpannableStringBuilder spannableStringBuilder) {
        String string = spannableStringBuilder.toString();
        int iIndexOf = string.indexOf(91);
        int iLastIndexOf = string.lastIndexOf(91);
        boolean z = iIndexOf == iLastIndexOf && iLastIndexOf == 0;
        int iIndexOf2 = string.indexOf(93);
        int iLastIndexOf2 = string.lastIndexOf(93);
        boolean z2 = iIndexOf2 == iLastIndexOf2 && iLastIndexOf2 == string.length() - 1;
        if (!z || !z2) {
            return pxe.m171836e(spannableStringBuilder, pxe.f151668c);
        }
        if (kye.f125284i.contains(string.substring(1, string.length() - 1))) {
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(pxe.f151667b), 0, string.indexOf(93) + 1, 33);
            setBackgroundResource(c3c0.f78610P7);
            xdl0.m208374f0(this, t100.f167260i);
            xdl0.m208370d0(this, 0);
            xdl0.m208372e0(this, 0);
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: r */
    public void m48730r(String str, InterfaceC8519a.a aVar) {
        if (Patterns.WEB_URL.matcher(str).matches() || m48735z()) {
            setLongClickCallBack(aVar);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m48731s() {
        CharSequence text = getText();
        if (text instanceof Spannable) {
            Spannable spannable = (Spannable) text;
            URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, text.length(), URLSpan.class);
            if (!NullChecker.m81303a(uRLSpanArr) || uRLSpanArr.length <= 0) {
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
            spannableStringBuilder.clearSpans();
            for (URLSpan uRLSpan : uRLSpanArr) {
                String url = uRLSpan.getURL();
                if (url.indexOf("http://") == 0 || url.indexOf("https://") == 0) {
                    spannableStringBuilder.setSpan(new C8512a(url), spannable.getSpanStart(uRLSpan), spannable.getSpanEnd(uRLSpan), 34);
                }
            }
            setText(m48729q(spannableStringBuilder));
        }
    }

    public void setLongClickCallBack(final InterfaceC8519a.a aVar) {
        if (aVar == null) {
            setOnClickListener(null);
        } else {
            setOnLongClickListener(new View.OnLongClickListener() { // from class: l.ffq
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return this.f97287a.m48734x(aVar, view);
                }
            });
        }
    }

    @Override // p147v.VText, android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(eoj0.m117353c(charSequence), bufferType);
    }

    /* JADX INFO: renamed from: u */
    public boolean m48732u(String str) {
        return !vwb.m200352x(vwb.m200316b0(f31516j.matcher(str)), vwb.m200316b0(f31517k.matcher(str)), vwb.m200316b0(f31518l.matcher(str))).isEmpty();
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m48733w() {
        e51.m114766q(getText().toString());
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean m48734x(InterfaceC8519a.a aVar, View view) {
        aVar.mo48351a();
        this.f31520i = true;
        return true;
    }

    /* JADX INFO: renamed from: y */
    public void mo48130y(Message message, InterfaceC8519a.a aVar) {
        if (TEnum.equals(message.messageType(), "unknown_")) {
            m48728E(getContext().getResources().getString(R$string.f21123x6), aVar, message);
        } else {
            m48728E(message.value, aVar, message);
        }
    }

    /* JADX INFO: renamed from: z */
    public final boolean m48735z() {
        if (getText() instanceof Spanned) {
            Spanned spanned = (Spanned) getText();
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(0, getText().length(), ClickableSpan.class);
            if (NullChecker.m81303a(clickableSpanArr) && clickableSpanArr.length > 0) {
                return true;
            }
            URLSpan[] uRLSpanArr = (URLSpan[]) spanned.getSpans(0, getText().length(), URLSpan.class);
            if (NullChecker.m81303a(uRLSpanArr) && uRLSpanArr.length > 0) {
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
