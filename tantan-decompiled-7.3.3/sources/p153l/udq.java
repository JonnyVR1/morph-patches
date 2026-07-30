package p153l;

import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.gms.common.api.Api;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.DynamicSchemaMsgData;
import com.p051p1.mobile.putong.core.data.LiveSchema;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.data.MessageView;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemMessageBase;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.FemaleVip;
import com.p051p1.mobile.putong.data.Meta;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.PaymentData;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserPrivacySettings;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p151v.AutoVDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class udq {

    /* JADX INFO: renamed from: a */
    public ViewGroup f178571a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f178572b;

    /* JADX INFO: renamed from: c */
    public AutoVDraweeView f178573c;

    /* JADX INFO: renamed from: d */
    public VText f178574d;

    /* JADX INFO: renamed from: e */
    public VText f178575e;

    /* JADX INFO: renamed from: f */
    public VText f178576f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f178577g;

    /* JADX INFO: renamed from: h */
    public String f178578h;

    /* JADX INFO: renamed from: i */
    public DynamicSchemaMsgData f178579i;

    /* JADX INFO: renamed from: j */
    public String f178580j;

    /* JADX INFO: renamed from: k */
    public Drawable f178581k;

    /* JADX INFO: renamed from: l */
    public Drawable f178582l;

    /* JADX INFO: renamed from: m */
    public boolean f178583m = false;

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m195524b(DynamicSchemaMsgData dynamicSchemaMsgData, String str, String str2) {
        if ("scheme_message_no_handler_found".equals(str2)) {
            o1j0.m165636j(dynamicSchemaMsgData.failRemind);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m195526d(Act act, Throwable th) {
        act.progressDismiss();
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m195527e(Act act, uxj0 uxj0Var) {
        act.progressDismiss();
        r1j0.m179419f(R$string.f21864x5);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m195528f(DynamicSchemaMsgData dynamicSchemaMsgData, String str, String str2) {
        if ("scheme_message_no_handler_found".equals(str2)) {
            o1j0.m165636j(dynamicSchemaMsgData.cancelRemind);
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m195529g(Act act) {
        if (act.isFinishing()) {
            return;
        }
        act.progress(R$string.f21517I2);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m195531i(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            if (coreService.code == 41063) {
                o1j0.m165636j(coreService.metaMessage);
                return;
            }
        }
        o1j0.m165634h(R$string.f21469C2);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m195532j(Runnable runnable, Act act) {
        l51.m152890J(runnable);
        if (act.isFinishing()) {
            return;
        }
        act.progressDismiss();
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m195533k(Act act, Envelope envelope) {
        Meta meta = envelope.meta;
        if (!TextUtils.isEmpty(meta.message) && !"OK".equals(meta.message)) {
            o1j0.m165651y(meta.message);
            return;
        }
        if (((CoreData) envelope.getModuleData(CoreData.class)).liveSchemas == null || jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).liveSchemas)) {
            return;
        }
        LiveSchema liveSchema = ((CoreData) envelope.getModuleData(CoreData.class)).liveSchemas.get(0);
        if (TextUtils.isEmpty(liveSchema.schema)) {
            o1j0.m165634h(R$string.f21469C2);
        } else {
            nae0.m162083m(act, Uri.parse(liveSchema.schema));
        }
    }

    /* JADX INFO: renamed from: p */
    public static boolean m195534p(Message message) {
        return !TextUtils.isEmpty(message.msgData) && TEnum.equals(message.messageType(), MessageType.setting_event);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m195535q(Message message) {
        return !TextUtils.isEmpty(message.msgData) && TEnum.equals(message.messageType(), MessageType.picture_text_style);
    }

    /* JADX INFO: renamed from: A */
    public final void m195536A(DynamicSchemaMsgData dynamicSchemaMsgData) {
        if (dynamicSchemaMsgData.view == null) {
            return;
        }
        int iM175859d = qa00.m175859d(256.0f);
        try {
            m195556z(dynamicSchemaMsgData.view);
            m195555y(dynamicSchemaMsgData.view);
            if (dynamicSchemaMsgData.view.isTextOnly) {
                this.f178574d.setMaxLines(Api.BaseClientBuilder.API_PRIORITY_OTHER);
                this.f178574d.setText(m195545m(dynamicSchemaMsgData.view.text));
                this.f178575e.setText(dynamicSchemaMsgData.view.button);
                bnl0.m105524M(this.f178572b, false);
                ViewGroup.LayoutParams layoutParams = this.f178577g.getLayoutParams();
                layoutParams.width = iM175859d;
                this.f178577g.setLayoutParams(layoutParams);
                return;
            }
            bnl0.m105524M(this.f178572b, true);
            this.f178574d.setText(m195545m(dynamicSchemaMsgData.view.text));
            this.f178575e.setText(dynamicSchemaMsgData.view.button);
            ViewGroup.LayoutParams layoutParams2 = this.f178572b.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams2 = new ViewGroup.LayoutParams(iM175859d, iM175859d);
            }
            if (TextUtils.isEmpty(dynamicSchemaMsgData.view.imageSize)) {
                this.f178574d.setMaxLines(3);
            } else {
                String[] strArrSplit = dynamicSchemaMsgData.view.imageSize.split(BaseSei.f14624X);
                if (strArrSplit.length == 2) {
                    int iM175859d2 = qa00.m175859d(Integer.parseInt(strArrSplit[0]));
                    int iM175859d3 = qa00.m175859d(Integer.parseInt(strArrSplit[1]));
                    if (iM175859d2 == iM175859d3) {
                        this.f178574d.setMaxLines(3);
                        layoutParams2.height = iM175859d;
                        layoutParams2.width = iM175859d;
                    } else if (iM175859d2 > 0 && iM175859d3 > 0) {
                        int iM175859d4 = (int) (iM175859d / (iM175859d2 / (iM175859d3 + 0.0f)));
                        if (iM175859d4 < qa00.m175859d(55.0f)) {
                            iM175859d4 = qa00.m175859d(55.0f);
                        } else if (iM175859d4 > iM175859d) {
                            iM175859d4 = iM175859d;
                        }
                        if (NullChecker.m82486a(dynamicSchemaMsgData.schema) && dynamicSchemaMsgData.schema.contains(SchemeKey.monetization)) {
                            this.f178574d.setMaxLines(Api.BaseClientBuilder.API_PRIORITY_OTHER);
                        } else {
                            this.f178574d.setMaxLines(2);
                        }
                        layoutParams2.height = iM175859d4;
                        layoutParams2.width = iM175859d;
                    }
                }
            }
            if (dynamicSchemaMsgData.view.ignoreHeightLimit) {
                this.f178574d.setMaxLines(Api.BaseClientBuilder.API_PRIORITY_OTHER);
            }
            this.f178572b.setLayoutParams(layoutParams2);
            this.f178572b.getHierarchy().m207062w(h1e0.f107444a);
            ViewGroup.LayoutParams layoutParams3 = this.f178577g.getLayoutParams();
            layoutParams3.width = iM175859d;
            this.f178577g.setLayoutParams(layoutParams3);
            this.f178572b.setImageUrl(dynamicSchemaMsgData.view.image);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m195537B(String str, boolean z) {
        final Act act = (Act) bnl0.m105508E(this.f178571a);
        final Runnable runnable = new Runnable() { // from class: l.qdq
            @Override // java.lang.Runnable
            public final void run() {
                udq.m195529g(act);
            }
        };
        act.duringCreated(CoreModule.f18264c.f20384f0.m34181wp(str, z)).doOnSubscribe(new x20() { // from class: l.rdq
            @Override // p153l.x20
            public final void call() {
                l51.m152888H(act, runnable, 1000L);
            }
        }).doOnUnsubscribe(new x20() { // from class: l.sdq
            @Override // p153l.x20
            public final void call() {
                udq.m195532j(runnable, act);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.tdq
            @Override // p153l.y20
            public final void call(Object obj) {
                udq.m195533k(act, (Envelope) obj);
            }
        }, new y20() { // from class: l.kdq
            @Override // p153l.y20
            public final void call(Object obj) {
                udq.m195531i((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: C */
    public final void m195538C() {
        if (NullChecker.m82486a(this.f178573c)) {
            bnl0.m105524M(this.f178573c, false);
        }
        bnl0.m105524M(this.f178576f, false);
        bnl0.m105524M(this.f178572b, true);
        this.f178571a.setBackground(this.f178581k);
        bnl0.m105507D0(-2, this.f178571a);
        this.f178574d.setMaxLines(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        this.f178574d.setTypeface(Typeface.defaultFromStyle(1));
        bnl0.m105540X(this.f178574d, qa00.m175859d(12.0f));
        bnl0.m105538V(this.f178574d, qa00.m175859d(16.0f));
        bnl0.m105539W(this.f178574d, qa00.m175859d(16.0f));
        this.f178575e.setTypeface(Typeface.defaultFromStyle(1));
        bnl0.m105505C0(this.f178575e, qa00.m175859d(42.0f));
        bnl0.m105540X(this.f178575e, qa00.m175859d(16.0f));
        bnl0.m105537U(this.f178575e, qa00.m175859d(16.0f));
        bnl0.m105538V(this.f178575e, qa00.m175859d(16.0f));
        bnl0.m105539W(this.f178575e, qa00.m175859d(16.0f));
        this.f178575e.setTextColor(Color.parseColor("#FE7E1D"));
        this.f178575e.setBackground(this.f178582l);
    }

    /* JADX INFO: renamed from: D */
    public void mo195539D(final DynamicSchemaMsgData dynamicSchemaMsgData) {
        bnl0.m105509E0(this.f178575e, new View.OnClickListener() { // from class: l.jdq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f120288a.m195549s(dynamicSchemaMsgData, view);
            }
        });
        bnl0.m105509E0(this.f178576f, new View.OnClickListener() { // from class: l.ldq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f131662a.m195550t(dynamicSchemaMsgData, view);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public final void m195540E(SpannableStringBuilder spannableStringBuilder, URLSpan uRLSpan, String str) {
        int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
        int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
        int spanFlags = spannableStringBuilder.getSpanFlags(uRLSpan);
        String[] strArr = {"Letv", "LeEco"};
        try {
            String url = uRLSpan.getURL();
            if (!TextUtils.isEmpty(url) && url.contains(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR)) {
                url = url.replace(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, "");
            }
            URI uri = new URI(url);
            if (Arrays.asList(strArr).contains(Build.BRAND)) {
                spannableStringBuilder.removeSpan(uRLSpan);
            }
            ajq.m98408h(uri, true);
            spannableStringBuilder.setSpan(bjq.m104638a(uri, true, "", OMSDialogPositon.p_chat_view), spanStart, spanEnd, spanFlags);
        } catch (URISyntaxException e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m195541F(View view, int i, float f) {
        view.getContext();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius(rsf0.m182959c(f));
        view.setBackground(gradientDrawable);
    }

    /* JADX INFO: renamed from: G */
    public final void m195542G(DynamicSchemaMsgData dynamicSchemaMsgData) {
        Uri uri = Uri.parse(dynamicSchemaMsgData.schema);
        if (uri.getScheme().startsWith("tantan")) {
            this.f178580j = null;
            String authority = uri.getAuthority();
            String path = uri.getPath();
            String queryParameter = uri.getQueryParameter("businessType");
            if (TextUtils.equals("vip", authority)) {
                if (TextUtils.equals("/diamond", path)) {
                    if (TextUtils.equals("renew", queryParameter)) {
                        this.f178580j = "expired_oDiamond";
                    } else {
                        this.f178580j = "normal_oDiamond";
                    }
                } else if (TextUtils.equals("/vip/buy", path) || TextUtils.equals("/vip", path)) {
                    if (TextUtils.equals("renew", queryParameter)) {
                        this.f178580j = "expired_vip";
                    } else {
                        this.f178580j = "normal_vip";
                    }
                } else if (TextUtils.equals("/quickchat", path)) {
                    this.f178580j = "quickchat";
                } else if (TextUtils.equals("/see", path)) {
                    this.f178580j = "call2buysee";
                } else if (TextUtils.equals("/partner", path)) {
                    this.f178580j = SummarizedPrivilegesId.supremePartner;
                } else if (TextUtils.equals("/femaleVip", path)) {
                    this.f178580j = FemaleVip.TYPE;
                }
            } else if (TextUtils.equals("svip", authority)) {
                if (TextUtils.equals("/svip/buy", path) || TextUtils.equals("/svip", path)) {
                    if (TextUtils.equals("renew", queryParameter)) {
                        this.f178580j = "expired_svip";
                    } else {
                        this.f178580j = "normal_svip";
                    }
                }
            } else if (TextUtils.equals(SchemeKey.monetization_promotion, authority)) {
                if (TextUtils.equals("/svip/trail", path)) {
                    this.f178580j = "promotion_trial7DSVIP";
                } else if (TextUtils.equals("/vip/trail", path)) {
                    this.f178580j = "viptrial";
                }
            }
            if (NullChecker.m82486a(this.f178580j)) {
                i4g0.m138492A("e_vas_guide_assistant", OMSDialogPositon.p_chat_view, jyb.m147494Y("vas_guide_type", this.f178580j));
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m195543H() {
        String str;
        DynamicSchemaMsgData dynamicSchemaMsgData = this.f178579i;
        if (dynamicSchemaMsgData == null || (str = dynamicSchemaMsgData.extra) == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String strOptString = new JSONObject(this.f178579i.extra).optString(FirebaseAnalytics.Event.SEARCH);
            if ("little-helper-recommend-anchor-live".equals(strOptString) || "little-helper-recommend-anchor-voiceLive".equals(strOptString)) {
                HashMap map = new HashMap();
                Map<String, String> map2 = this.f178579i.eventExtra;
                if (map2 != null) {
                    for (String str2 : map2.keySet()) {
                        map.put(str2, this.f178579i.eventExtra.get(str2));
                    }
                }
                map.put("live_enter_source", PaymentData.FROM_TEAM);
                i4g0.m138527y("little-helper-recommend-anchor-live".equals(strOptString) ? "e_live_room_enter" : "e_live_audio_room_enter", OMSDialogPositon.p_messages_view, map);
            }
        } catch (Exception e) {
            if (e instanceof JSONException) {
                return;
            }
            CrashHelper.m82480d(e, 50);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m195544l(ViewGroup viewGroup, AutoVDraweeView autoVDraweeView, AutoVDraweeView autoVDraweeView2, VText vText, VText vText2, VText vText3, LinearLayout linearLayout) {
        this.f178571a = viewGroup;
        this.f178572b = autoVDraweeView;
        this.f178573c = autoVDraweeView2;
        this.f178574d = vText;
        this.f178575e = vText2;
        this.f178576f = vText3;
        this.f178577g = linearLayout;
        this.f178581k = viewGroup != null ? viewGroup.getBackground() : null;
        this.f178582l = vText2 != null ? vText2.getBackground() : null;
    }

    /* JADX INFO: renamed from: m */
    public final CharSequence m195545m(String str) {
        boolean zM104639b = bjq.m104639b(str);
        VText vText = this.f178574d;
        if (!zM104639b) {
            vText.setMovementMethod(null);
            return str;
        }
        vText.setMovementMethod(LinkMovementMethod.getInstance());
        String strReplaceAll = str.replaceAll(SignParameters.NEW_LINE, "<br/>");
        Spanned spannedFromHtml = Html.fromHtml(strReplaceAll);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannedFromHtml);
        for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannedFromHtml.length(), URLSpan.class)) {
            m195540E(spannableStringBuilder, uRLSpan, strReplaceAll);
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: o */
    public final void m195547o(DynamicSchemaMsgData dynamicSchemaMsgData) {
        if (dynamicSchemaMsgData == null || dynamicSchemaMsgData.view == null) {
            return;
        }
        int iM175859d = qa00.m175859d(256.0f);
        this.f178574d.setText(dynamicSchemaMsgData.view.text);
        this.f178575e.setText(dynamicSchemaMsgData.view.button);
        this.f178575e.setTypeface(Typeface.DEFAULT);
        bnl0.m105507D0(iM175859d, this.f178571a);
        bnl0.m105507D0(iM175859d, this.f178572b);
        bnl0.m105507D0(iM175859d, this.f178577g);
        bnl0.m105505C0(this.f178572b, qa00.m175859d(180.0f));
        this.f178572b.setImageUrl(dynamicSchemaMsgData.view.image);
        VText vText = this.f178574d;
        int i = qa00.f156323j;
        bnl0.m105540X(vText, i);
        bnl0.m105540X(this.f178575e, i);
        bnl0.m105538V(this.f178574d, i);
        bnl0.m105539W(this.f178574d, i);
        bnl0.m105538V(this.f178575e, i);
        bnl0.m105539W(this.f178575e, i);
        this.f178571a.setBackgroundResource(ibc0.f114102p);
        if (!this.f178583m) {
            this.f178583m = true;
            i4g0.m138492A(dynamicSchemaMsgData.eId, OMSDialogPositon.p_chat_view, jyb.m147494Y(dynamicSchemaMsgData.kId, dynamicSchemaMsgData.event));
        }
        if (!NullChecker.m82486a(this.f178573c) || TextUtils.isEmpty(dynamicSchemaMsgData.view.image2)) {
            return;
        }
        bnl0.m105524M(this.f178573c, true);
        this.f178573c.setImageUrl(dynamicSchemaMsgData.view.image2);
    }

    /* JADX INFO: renamed from: r */
    public void mo195548r() {
        DynamicSchemaMsgData dynamicSchemaMsgData;
        DynamicSchemaMsgData dynamicSchemaMsgData2;
        if (!TextUtils.equals(this.f178578h, User.ID_LIVE_SERVICE) || (dynamicSchemaMsgData2 = this.f178579i) == null || dynamicSchemaMsgData2.eventExtra == null) {
            DynamicSchemaMsgData dynamicSchemaMsgData3 = this.f178579i;
            if (dynamicSchemaMsgData3 != null && dynamicSchemaMsgData3.eventExtra != null && !TextUtils.isEmpty(dynamicSchemaMsgData3.eId) && !l6p.m153076c(this.f178579i.schema)) {
                HashMap map = new HashMap();
                for (String str : this.f178579i.eventExtra.keySet()) {
                    map.put(str, this.f178579i.eventExtra.get(str));
                }
                i4g0.m138527y(this.f178579i.eId, OMSDialogPositon.p_chat_view, map);
            }
        } else {
            HashMap map2 = new HashMap();
            for (String str2 : this.f178579i.eventExtra.keySet()) {
                map2.put(str2, this.f178579i.eventExtra.get(str2));
            }
            i4g0.m138527y("e_live_assistant", OMSDialogPositon.p_messages_view, map2);
        }
        m195543H();
        Act act = (Act) bnl0.m105508E(this.f178571a);
        if (act == null || (dynamicSchemaMsgData = this.f178579i) == null) {
            return;
        }
        l6p.m153083j(act, dynamicSchemaMsgData.schema);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m195549s(final DynamicSchemaMsgData dynamicSchemaMsgData, View view) {
        if (TextUtils.equals(this.f178578h, User.ID_LIVE_SERVICE) && dynamicSchemaMsgData != null && dynamicSchemaMsgData.eventExtra != null) {
            HashMap map = new HashMap();
            for (String str : dynamicSchemaMsgData.eventExtra.keySet()) {
                map.put(str, dynamicSchemaMsgData.eventExtra.get(str));
            }
            i4g0.m138521s("e_live_assistant", OMSDialogPositon.p_messages_view, map);
        } else if (dynamicSchemaMsgData != null && dynamicSchemaMsgData.eventExtra != null && !TextUtils.isEmpty(dynamicSchemaMsgData.eId) && !l6p.m153076c(dynamicSchemaMsgData.schema)) {
            HashMap map2 = new HashMap();
            for (String str2 : dynamicSchemaMsgData.eventExtra.keySet()) {
                map2.put(str2, dynamicSchemaMsgData.eventExtra.get(str2));
            }
            i4g0.m138521s(dynamicSchemaMsgData.eId, OMSDialogPositon.p_chat_view, map2);
        }
        if (TextUtils.isEmpty(dynamicSchemaMsgData.schema)) {
            if (TextUtils.isEmpty(dynamicSchemaMsgData.action) || !"personalizedrcmd_recallmsg".equals(dynamicSchemaMsgData.action)) {
                m195537B(dynamicSchemaMsgData.extra, false);
                return;
            } else {
                i4g0.m138520r("e_personalized_recommendation_open", OMSDialogPositon.p_messages_view);
                m195552v();
                return;
            }
        }
        if (!TextUtils.isEmpty(this.f178580j)) {
            i4g0.m138523u("e_vas_guide_assistant", OMSDialogPositon.p_chat_view, jyb.m147494Y("vas_guide_type", this.f178580j));
        }
        Act act = (Act) bnl0.m105508E(this.f178571a);
        if (act != null) {
            l6p.m153082i(act, dynamicSchemaMsgData.schema);
        }
        nae0.m162084n(bnl0.m105508E(this.f178571a), Uri.parse(dynamicSchemaMsgData.schema), new z20() { // from class: l.ndq
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                udq.m195524b(dynamicSchemaMsgData, (String) obj, (String) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m195550t(final DynamicSchemaMsgData dynamicSchemaMsgData, View view) {
        if (TextUtils.isEmpty(dynamicSchemaMsgData.cancelSchema)) {
            m195537B(dynamicSchemaMsgData.extra, true);
        } else {
            nae0.m162084n(bnl0.m105508E(this.f178571a), Uri.parse(dynamicSchemaMsgData.cancelSchema), new z20() { // from class: l.mdq
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    udq.m195528f(dynamicSchemaMsgData, (String) obj, (String) obj2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: u */
    public List<ovb0<String, Runnable, Integer, Void>> m195551u() {
        return null;
    }

    /* JADX INFO: renamed from: v */
    public void m195552v() {
        Settings settings = CoreModule.f18264c.f20381e0.m116593na().settings;
        if (NullChecker.m82486a(settings)) {
            if (settings.personalizeSuggest().booleanValue()) {
                r1j0.m179419f(R$string.f21864x5);
                return;
            }
            SettingGroups settingGroups = new SettingGroups();
            UserPrivacySettings userPrivacySettings = new UserPrivacySettings();
            settingGroups.privacy = userPrivacySettings;
            userPrivacySettings.personalizeSuggest = Boolean.TRUE;
            Act act = (Act) bnl0.m105508E(this.f178571a);
            act.progress(act.getString(R$string.f21517I2), true);
            m195553w(act, settingGroups);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m195553w(final Act act, SettingGroups settingGroups) {
        act.duringCreated(CoreModule.f18264c.f20405m0.m32124k8(settingGroups)).subscribe(psd0.m173597H(new y20() { // from class: l.odq
            @Override // p153l.y20
            public final void call(Object obj) {
                udq.m195527e(act, (uxj0) obj);
            }
        }, new y20() { // from class: l.pdq
            @Override // p153l.y20
            public final void call(Object obj) {
                udq.m195526d(act, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x */
    public void mo195554x(Message message) {
        this.f178580j = null;
        if (this.f178571a == null) {
            return;
        }
        if (m195535q(message) || m195534p(message) || zdq.m219364R(message)) {
            this.f178578h = message.cid;
            try {
                DynamicSchemaMsgData dynamicSchemaMsgData = DynamicSchemaMsgData.JSON_ADAPTER.parse(message.msgData);
                this.f178579i = dynamicSchemaMsgData;
                if (dynamicSchemaMsgData == null) {
                    return;
                }
                m195538C();
                boolean zEquals = TextUtils.equals(this.f178579i.source, "creation");
                DynamicSchemaMsgData dynamicSchemaMsgData2 = this.f178579i;
                if (zEquals) {
                    m195547o(dynamicSchemaMsgData2);
                } else {
                    m195536A(dynamicSchemaMsgData2);
                    mo195539D(this.f178579i);
                }
                if (TextUtils.isEmpty(this.f178579i.schema)) {
                    return;
                }
                m195542G(this.f178579i);
            } catch (Exception e) {
                CrashHelper.m82479c(e);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m195555y(@NonNull MessageView messageView) {
        try {
            int i = this.f178579i.view.uiStyle;
            VText vText = this.f178575e;
            if (i == 1) {
                bnl0.m105505C0(vText, qa00.m175859d(48.0f));
                bnl0.m105540X(this.f178575e, qa00.m175859d(12.0f));
                bnl0.m105537U(this.f178575e, qa00.m175859d(12.0f));
                bnl0.m105538V(this.f178575e, qa00.m175859d(12.0f));
                bnl0.m105539W(this.f178575e, qa00.m175859d(12.0f));
                this.f178575e.setTextColor(Color.parseColor("#FFFFFF"));
                m195541F(this.f178575e, Color.parseColor("#FE7E1D"), 10.0f);
                return;
            }
            bnl0.m105505C0(vText, qa00.m175859d(42.0f));
            bnl0.m105540X(this.f178575e, qa00.m175859d(16.0f));
            bnl0.m105537U(this.f178575e, qa00.m175859d(16.0f));
            bnl0.m105538V(this.f178575e, qa00.m175859d(16.0f));
            bnl0.m105539W(this.f178575e, qa00.m175859d(16.0f));
            this.f178575e.setTextColor(Color.parseColor("#FE7E1D"));
            m195541F(this.f178575e, Color.parseColor("#FFFFFF"), 10.0f);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m195556z(@NonNull MessageView messageView) {
        boolean zIsEmpty = TextUtils.isEmpty(messageView.cancelText);
        VText vText = this.f178576f;
        if (zIsEmpty) {
            bnl0.m105524M(vText, false);
            return;
        }
        bnl0.m105524M(vText, true);
        this.f178576f.setText(messageView.cancelText);
        try {
            int i = this.f178579i.view.uiStyle;
            VText vText2 = this.f178576f;
            if (i == 1) {
                bnl0.m105505C0(vText2, qa00.m175859d(48.0f));
                bnl0.m105540X(this.f178576f, qa00.m175859d(-4.0f));
                bnl0.m105537U(this.f178576f, qa00.m175859d(13.0f));
                bnl0.m105538V(this.f178576f, qa00.m175859d(12.0f));
                bnl0.m105539W(this.f178576f, qa00.m175859d(12.0f));
                this.f178576f.setTextSize(16.0f);
                this.f178576f.setTypeface(Typeface.defaultFromStyle(1));
                this.f178576f.setTextColor(Color.parseColor("#FE7E1D"));
                m195541F(this.f178576f, Color.parseColor("#FFFFFF"), 10.0f);
                return;
            }
            bnl0.m105505C0(vText2, qa00.m175859d(42.0f));
            bnl0.m105540X(this.f178576f, qa00.m175859d(-12.0f));
            bnl0.m105537U(this.f178576f, qa00.m175859d(8.0f));
            bnl0.m105538V(this.f178576f, qa00.m175859d(16.0f));
            bnl0.m105539W(this.f178576f, qa00.m175859d(16.0f));
            this.f178576f.setTextSize(14.0f);
            this.f178576f.setTypeface(Typeface.defaultFromStyle(0));
            this.f178576f.setTextColor(Color.parseColor("#27000000"));
            m195541F(this.f178576f, 0, 10.0f);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: n */
    public void m195546n(int i, boolean z, ItemMessageBase itemMessageBase) {
    }
}
