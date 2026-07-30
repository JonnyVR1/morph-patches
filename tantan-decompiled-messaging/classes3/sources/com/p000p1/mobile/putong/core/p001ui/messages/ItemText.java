package com.p000p1.mobile.putong.core.p001ui.messages;

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
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageTipsContent;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.StudentVerificationStatus;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import l.ahq;
import l.bhq;
import l.c3c0;
import l.e51;
import l.epq;
import l.knb0;
import l.t100;
import l.vwb;
import l.xdl0;
import p003l.eoj0;
import p003l.j000;
import p003l.kye;
import p003l.pxe;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemText extends VText implements InterfaceC0102a {

    /* JADX INFO: renamed from: j */
    public static Pattern f1407j;

    /* JADX INFO: renamed from: k */
    public static Pattern f1408k;

    /* JADX INFO: renamed from: l */
    public static Pattern f1409l;

    /* JADX INFO: renamed from: m */
    public static final Pattern f1410m;

    /* JADX INFO: renamed from: i */
    public boolean f1411i;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemText$a */
    public class C0095a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f1412a;

        public C0095a(String str) {
            this.f1412a = str;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            epq.b(ItemText.this.getContext(), this.f1412a);
        }
    }

    static {
        String[] strArr = bhq.a;
        f1407j = Pattern.compile(strArr[0]);
        f1408k = Pattern.compile(strArr[1]);
        f1409l = Pattern.compile(strArr[2]);
        f1410m = Pattern.compile("<a href = \"tantan://msgReport.*\">.*</a>");
    }

    public ItemText(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: F */
    public static void m1806F(SpannableStringBuilder spannableStringBuilder, URLSpan uRLSpan, Message message) {
        boolean z;
        int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
        int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
        int spanFlags = spannableStringBuilder.getSpanFlags(uRLSpan);
        String[] strArr = {"Letv", "LeEco"};
        try {
            String url = uRLSpan.getURL();
            String str = "";
            if (!TextUtils.isEmpty(url) && url.contains(" ")) {
                url = url.replace(" ", "");
            }
            URI uri = new URI(url);
            if (Arrays.asList(strArr).contains(Build.BRAND)) {
                spannableStringBuilder.removeSpan(uRLSpan);
            }
            MessageTipsContent messageTipsContentM5264N = j000.m5264N(message);
            if ("-1".equals(message.owner) || "-11001".equals(message.owner)) {
                str = NullChecker.a(message.extData) ? message.extData.extra : "";
                z = true;
                ahq.h(uri, true);
            } else {
                z = false;
                if (NullChecker.a(messageTipsContentM5264N) && !TextUtils.isEmpty(messageTipsContentM5264N.statsModuleId)) {
                    str = messageTipsContentM5264N.statsModuleId;
                    if (!TextUtils.isEmpty(messageTipsContentM5264N.statsModuleParameter) && m1810t(messageTipsContentM5264N.value)) {
                        str = str + "statsModuleParameter" + messageTipsContentM5264N.statsModuleParameter;
                    }
                }
            }
            spannableStringBuilder.setSpan(bhq.a(uri, z, str, "p_chat_view"), spanStart, spanEnd, spanFlags);
        } catch (URISyntaxException e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: p */
    public static CharSequence m1809p(String str, Message message) {
        Spanned spannedFromHtml = Html.fromHtml(str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannedFromHtml);
        for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannedFromHtml.length(), URLSpan.class)) {
            m1806F(spannableStringBuilder, uRLSpan, message);
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: t */
    public static boolean m1810t(String str) {
        return !vwb.x(new List[]{vwb.b0(f1410m.matcher(str))}).isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A */
    public void mo1056A(Message message) {
        if (TEnum.equals(message.messageType(), "unknown_")) {
            m1811D(getContext().getResources().getString(R.string.x6), message);
        } else {
            m1811D(message.value, message);
        }
    }

    /* JADX INFO: renamed from: D */
    public void m1811D(String str, Message message) {
        m1812E(str, null, message);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E */
    public void m1812E(String str, InterfaceC0102a.a aVar, Message message) {
        if (str.length() == 1) {
            setGravity(17);
        } else {
            setGravity(0);
        }
        mo1208G(str, aVar, message);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G */
    public void mo1208G(String str, InterfaceC0102a.a aVar, Message message) {
        if (CoreModule.P().i().G1()) {
            setLargeEmojiForceDisabled(true);
        }
        MessageTipsContent messageTipsContentM5264N = j000.m5264N(message);
        if (TextUtils.isEmpty(str)) {
            setMovementMethod(null);
            setText(str);
            return;
        }
        if (User.isTeamAccount(message.owner) && m1816u(str)) {
            StudentVerificationStatus verificationStatus = getVerificationStatus();
            if (CoreModule.P().i().p1() && NullChecker.a(verificationStatus)) {
                setMovementMethod(LinkMovementMethod.getInstance());
            } else {
                setMovementMethod(null);
            }
            setText(m1809p(str.replaceAll("\n", "<br/>"), message));
            setLongClickCallBack(aVar);
            return;
        }
        if ((User.isTeamAccount(message.owner) || (NullChecker.a(messageTipsContentM5264N) && !TextUtils.isEmpty(messageTipsContentM5264N.value))) && bhq.b(str)) {
            setText(m1809p(str.replaceAll("\n", "<br/>"), message));
            setMovementMethod(LinkMovementMethod.getInstance());
            setLongClickCallBack(aVar);
        } else {
            setMovementMethod(null);
            setText(str);
            m1815s();
            m1814r(str, aVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo1057J() {
        return vwb.f0(new knb0[]{vwb.Z(getContext().getString(R.string.c), new Runnable() { // from class: l.gfq
            @Override // java.lang.Runnable
            public final void run() {
                this.f3863a.m1817w();
            }
        }, Integer.valueOf(c3c0.x1), (Object) null)});
    }

    public StudentVerificationStatus getVerificationStatus() {
        if (NullChecker.a(CoreModule.c.e0.p9()) && NullChecker.a(CoreModule.c.e0.p9().settings) && NullChecker.a(CoreModule.c.e0.p9().settings.verification) && NullChecker.a(CoreModule.c.e0.p9().settings.verification.studies)) {
            return CoreModule.c.e0.p9().settings.verification.studies.status;
        }
        return null;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: m */
    public void mo1062m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1 || !this.f1411i) {
            return super/*android.view.View*/.onTouchEvent(motionEvent);
        }
        this.f1411i = false;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public SpannableStringBuilder m1813q(SpannableStringBuilder spannableStringBuilder) {
        String string = spannableStringBuilder.toString();
        int iIndexOf = string.indexOf(91);
        int iLastIndexOf = string.lastIndexOf(91);
        boolean z = iIndexOf == iLastIndexOf && iLastIndexOf == 0;
        int iIndexOf2 = string.indexOf(93);
        int iLastIndexOf2 = string.lastIndexOf(93);
        boolean z2 = iIndexOf2 == iLastIndexOf2 && iLastIndexOf2 == string.length() - 1;
        if (!z || !z2) {
            return pxe.m6949e(spannableStringBuilder, pxe.f6542c);
        }
        if (kye.f5132i.contains(string.substring(1, string.length() - 1))) {
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(pxe.f6541b), 0, string.indexOf(93) + 1, 33);
            setBackgroundResource(c3c0.P7);
            xdl0.f0(this, t100.i);
            xdl0.d0(this, 0);
            xdl0.e0(this, 0);
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: r */
    public void m1814r(String str, InterfaceC0102a.a aVar) {
        if (Patterns.WEB_URL.matcher(str).matches() || m1819z()) {
            setLongClickCallBack(aVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s */
    public void m1815s() {
        CharSequence text = getText();
        if (text instanceof Spannable) {
            Spannable spannable = (Spannable) text;
            URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, text.length(), URLSpan.class);
            if (!NullChecker.a(uRLSpanArr) || uRLSpanArr.length <= 0) {
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
            spannableStringBuilder.clearSpans();
            for (URLSpan uRLSpan : uRLSpanArr) {
                String url = uRLSpan.getURL();
                if (url.indexOf("http://") == 0 || url.indexOf("https://") == 0) {
                    spannableStringBuilder.setSpan(new C0095a(url), spannable.getSpanStart(uRLSpan), spannable.getSpanEnd(uRLSpan), 34);
                }
            }
            setText(m1813q(spannableStringBuilder));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setLongClickCallBack(final InterfaceC0102a.a aVar) {
        if (aVar == null) {
            setOnClickListener(null);
        } else {
            setOnLongClickListener(new View.OnLongClickListener() { // from class: l.ffq
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return this.f3599a.m1818x(aVar, view);
                }
            });
        }
    }

    @Override // p028v.VText
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(eoj0.m3914c(charSequence), bufferType);
    }

    /* JADX INFO: renamed from: u */
    public boolean m1816u(String str) {
        return !vwb.x(new List[]{vwb.b0(f1407j.matcher(str)), vwb.b0(f1408k.matcher(str)), vwb.b0(f1409l.matcher(str))}).isEmpty();
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m1817w() {
        e51.q(getText().toString());
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean m1818x(InterfaceC0102a.a aVar, View view) {
        aVar.mo1435a();
        this.f1411i = true;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y */
    public void mo1210y(Message message, InterfaceC0102a.a aVar) {
        if (TEnum.equals(message.messageType(), "unknown_")) {
            m1812E(getContext().getResources().getString(R.string.x6), aVar, message);
        } else {
            m1812E(message.value, aVar, message);
        }
    }

    /* JADX INFO: renamed from: z */
    public final boolean m1819z() {
        if (getText() instanceof Spanned) {
            Spanned spanned = (Spanned) getText();
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(0, getText().length(), ClickableSpan.class);
            if (NullChecker.a(clickableSpanArr) && clickableSpanArr.length > 0) {
                return true;
            }
            URLSpan[] uRLSpanArr = (URLSpan[]) spanned.getSpans(0, getText().length(), URLSpan.class);
            if (NullChecker.a(uRLSpanArr) && uRLSpanArr.length > 0) {
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
