package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.DynamicSchemaMsgData;
import com.p046p1.mobile.putong.core.data.LiveSchema;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.data.MessageView;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemMessageBase;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.FemaleVip;
import com.p046p1.mobile.putong.data.Meta;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.PaymentData;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserPrivacySettings;
import com.p046p1.mobile.putong.data.tenum.TEnum;
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
import p147v.AutoVDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class ubq {

    /* JADX INFO: renamed from: a */
    public ViewGroup f175733a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f175734b;

    /* JADX INFO: renamed from: c */
    public AutoVDraweeView f175735c;

    /* JADX INFO: renamed from: d */
    public VText f175736d;

    /* JADX INFO: renamed from: e */
    public VText f175737e;

    /* JADX INFO: renamed from: f */
    public VText f175738f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f175739g;

    /* JADX INFO: renamed from: h */
    public String f175740h;

    /* JADX INFO: renamed from: i */
    public DynamicSchemaMsgData f175741i;

    /* JADX INFO: renamed from: j */
    public String f175742j;

    /* JADX INFO: renamed from: k */
    public Drawable f175743k;

    /* JADX INFO: renamed from: l */
    public Drawable f175744l;

    /* JADX INFO: renamed from: m */
    public boolean f175745m = false;

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m192900b(DynamicSchemaMsgData dynamicSchemaMsgData, String str, String str2) {
        if ("scheme_message_no_handler_found".equals(str2)) {
            lsi0.m151580j(dynamicSchemaMsgData.failRemind);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m192902d(Act act, Throwable th) {
        act.progressDismiss();
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m192903e(Act act, roj0 roj0Var) {
        act.progressDismiss();
        osi0.m165782f(R$string.f21122x5);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m192904f(DynamicSchemaMsgData dynamicSchemaMsgData, String str, String str2) {
        if ("scheme_message_no_handler_found".equals(str2)) {
            lsi0.m151580j(dynamicSchemaMsgData.cancelRemind);
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m192905g(Act act) {
        if (act.isFinishing()) {
            return;
        }
        act.progress(R$string.f20775I2);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m192907i(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            if (coreService.code == 41063) {
                lsi0.m151580j(coreService.metaMessage);
                return;
            }
        }
        lsi0.m151578h(R$string.f20727C2);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m192908j(Runnable runnable, Act act) {
        e51.m114745J(runnable);
        if (act.isFinishing()) {
            return;
        }
        act.progressDismiss();
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m192909k(Act act, Envelope envelope) {
        Meta meta = envelope.meta;
        if (!TextUtils.isEmpty(meta.message) && !"OK".equals(meta.message)) {
            lsi0.m151595y(meta.message);
            return;
        }
        if (((CoreData) envelope.getModuleData(CoreData.class)).liveSchemas == null || vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).liveSchemas)) {
            return;
        }
        LiveSchema liveSchema = ((CoreData) envelope.getModuleData(CoreData.class)).liveSchemas.get(0);
        if (TextUtils.isEmpty(liveSchema.schema)) {
            lsi0.m151578h(R$string.f20727C2);
        } else {
            j2e0.m139446m(act, Uri.parse(liveSchema.schema));
        }
    }

    /* JADX INFO: renamed from: p */
    public static boolean m192910p(Message message) {
        return !TextUtils.isEmpty(message.msgData) && TEnum.equals(message.messageType(), MessageType.setting_event);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m192911q(Message message) {
        return !TextUtils.isEmpty(message.msgData) && TEnum.equals(message.messageType(), MessageType.picture_text_style);
    }

    /* JADX INFO: renamed from: A */
    public final void m192912A(DynamicSchemaMsgData dynamicSchemaMsgData) {
        if (dynamicSchemaMsgData.view == null) {
            return;
        }
        int iM186890d = t100.m186890d(256.0f);
        try {
            m192932z(dynamicSchemaMsgData.view);
            m192931y(dynamicSchemaMsgData.view);
            if (dynamicSchemaMsgData.view.isTextOnly) {
                this.f175736d.setMaxLines(Api.BaseClientBuilder.API_PRIORITY_OTHER);
                this.f175736d.setText(m192921m(dynamicSchemaMsgData.view.text));
                this.f175737e.setText(dynamicSchemaMsgData.view.button);
                xdl0.m208344M(this.f175734b, false);
                ViewGroup.LayoutParams layoutParams = this.f175739g.getLayoutParams();
                layoutParams.width = iM186890d;
                this.f175739g.setLayoutParams(layoutParams);
                return;
            }
            xdl0.m208344M(this.f175734b, true);
            this.f175736d.setText(m192921m(dynamicSchemaMsgData.view.text));
            this.f175737e.setText(dynamicSchemaMsgData.view.button);
            ViewGroup.LayoutParams layoutParams2 = this.f175734b.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams2 = new ViewGroup.LayoutParams(iM186890d, iM186890d);
            }
            if (TextUtils.isEmpty(dynamicSchemaMsgData.view.imageSize)) {
                this.f175736d.setMaxLines(3);
            } else {
                String[] strArrSplit = dynamicSchemaMsgData.view.imageSize.split(BaseSei.f13930X);
                if (strArrSplit.length == 2) {
                    int iM186890d2 = t100.m186890d(Integer.parseInt(strArrSplit[0]));
                    int iM186890d3 = t100.m186890d(Integer.parseInt(strArrSplit[1]));
                    if (iM186890d2 == iM186890d3) {
                        this.f175736d.setMaxLines(3);
                        layoutParams2.height = iM186890d;
                        layoutParams2.width = iM186890d;
                    } else if (iM186890d2 > 0 && iM186890d3 > 0) {
                        int iM186890d4 = (int) (iM186890d / (iM186890d2 / (iM186890d3 + 0.0f)));
                        if (iM186890d4 < t100.m186890d(55.0f)) {
                            iM186890d4 = t100.m186890d(55.0f);
                        } else if (iM186890d4 > iM186890d) {
                            iM186890d4 = iM186890d;
                        }
                        if (NullChecker.m81303a(dynamicSchemaMsgData.schema) && dynamicSchemaMsgData.schema.contains(SchemeKey.monetization)) {
                            this.f175736d.setMaxLines(Api.BaseClientBuilder.API_PRIORITY_OTHER);
                        } else {
                            this.f175736d.setMaxLines(2);
                        }
                        layoutParams2.height = iM186890d4;
                        layoutParams2.width = iM186890d;
                    }
                }
            }
            if (dynamicSchemaMsgData.view.ignoreHeightLimit) {
                this.f175736d.setMaxLines(Api.BaseClientBuilder.API_PRIORITY_OTHER);
            }
            this.f175734b.setLayoutParams(layoutParams2);
            this.f175734b.getHierarchy().m112076w(ftd0.f99177a);
            ViewGroup.LayoutParams layoutParams3 = this.f175739g.getLayoutParams();
            layoutParams3.width = iM186890d;
            this.f175739g.setLayoutParams(layoutParams3);
            this.f175734b.setImageUrl(dynamicSchemaMsgData.view.image);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m192913B(String str, boolean z) {
        final Act act = (Act) xdl0.m208328E(this.f175733a);
        final Runnable runnable = new Runnable() { // from class: l.qbq
            @Override // java.lang.Runnable
            public final void run() {
                ubq.m192905g(act);
            }
        };
        act.duringCreated(CoreModule.f17545c.f19642f0.m33178wp(str, z)).doOnSubscribe(new d30() { // from class: l.rbq
            @Override // p149l.d30
            public final void call() {
                e51.m114743H(act, runnable, 1000L);
            }
        }).doOnUnsubscribe(new d30() { // from class: l.sbq
            @Override // p149l.d30
            public final void call() {
                ubq.m192908j(runnable, act);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.tbq
            @Override // p149l.e30
            public final void call(Object obj) {
                ubq.m192909k(act, (Envelope) obj);
            }
        }, new e30() { // from class: l.kbq
            @Override // p149l.e30
            public final void call(Object obj) {
                ubq.m192907i((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: C */
    public final void m192914C() {
        if (NullChecker.m81303a(this.f175735c)) {
            xdl0.m208344M(this.f175735c, false);
        }
        xdl0.m208344M(this.f175738f, false);
        xdl0.m208344M(this.f175734b, true);
        this.f175733a.setBackground(this.f175743k);
        xdl0.m208327D0(-2, this.f175733a);
        this.f175736d.setMaxLines(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        this.f175736d.setTypeface(Typeface.defaultFromStyle(1));
        xdl0.m208360X(this.f175736d, t100.m186890d(12.0f));
        xdl0.m208358V(this.f175736d, t100.m186890d(16.0f));
        xdl0.m208359W(this.f175736d, t100.m186890d(16.0f));
        this.f175737e.setTypeface(Typeface.defaultFromStyle(1));
        xdl0.m208325C0(this.f175737e, t100.m186890d(42.0f));
        xdl0.m208360X(this.f175737e, t100.m186890d(16.0f));
        xdl0.m208357U(this.f175737e, t100.m186890d(16.0f));
        xdl0.m208358V(this.f175737e, t100.m186890d(16.0f));
        xdl0.m208359W(this.f175737e, t100.m186890d(16.0f));
        this.f175737e.setTextColor(Color.parseColor("#FE7E1D"));
        this.f175737e.setBackground(this.f175744l);
    }

    /* JADX INFO: renamed from: D */
    public void mo192915D(final DynamicSchemaMsgData dynamicSchemaMsgData) {
        xdl0.m208329E0(this.f175737e, new View.OnClickListener() { // from class: l.jbq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f117205a.m192925s(dynamicSchemaMsgData, view);
            }
        });
        xdl0.m208329E0(this.f175738f, new View.OnClickListener() { // from class: l.lbq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f127326a.m192926t(dynamicSchemaMsgData, view);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public final void m192916E(SpannableStringBuilder spannableStringBuilder, URLSpan uRLSpan, String str) {
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
            ahq.m96550h(uri, true);
            spannableStringBuilder.setSpan(bhq.m101909a(uri, true, "", OMSDialogPositon.p_chat_view), spanStart, spanEnd, spanFlags);
        } catch (URISyntaxException e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m192917F(View view, int i, float f) {
        view.getContext();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius(ikf0.m136789c(f));
        view.setBackground(gradientDrawable);
    }

    /* JADX INFO: renamed from: G */
    public final void m192918G(DynamicSchemaMsgData dynamicSchemaMsgData) {
        Uri uri = Uri.parse(dynamicSchemaMsgData.schema);
        if (uri.getScheme().startsWith("tantan")) {
            this.f175742j = null;
            String authority = uri.getAuthority();
            String path = uri.getPath();
            String queryParameter = uri.getQueryParameter("businessType");
            if (TextUtils.equals("vip", authority)) {
                if (TextUtils.equals("/diamond", path)) {
                    if (TextUtils.equals("renew", queryParameter)) {
                        this.f175742j = "expired_oDiamond";
                    } else {
                        this.f175742j = "normal_oDiamond";
                    }
                } else if (TextUtils.equals("/vip/buy", path) || TextUtils.equals("/vip", path)) {
                    if (TextUtils.equals("renew", queryParameter)) {
                        this.f175742j = "expired_vip";
                    } else {
                        this.f175742j = "normal_vip";
                    }
                } else if (TextUtils.equals("/quickchat", path)) {
                    this.f175742j = "quickchat";
                } else if (TextUtils.equals("/see", path)) {
                    this.f175742j = "call2buysee";
                } else if (TextUtils.equals("/partner", path)) {
                    this.f175742j = SummarizedPrivilegesId.supremePartner;
                } else if (TextUtils.equals("/femaleVip", path)) {
                    this.f175742j = FemaleVip.TYPE;
                }
            } else if (TextUtils.equals("svip", authority)) {
                if (TextUtils.equals("/svip/buy", path) || TextUtils.equals("/svip", path)) {
                    if (TextUtils.equals("renew", queryParameter)) {
                        this.f175742j = "expired_svip";
                    } else {
                        this.f175742j = "normal_svip";
                    }
                }
            } else if (TextUtils.equals(SchemeKey.monetization_promotion, authority)) {
                if (TextUtils.equals("/svip/trail", path)) {
                    this.f175742j = "promotion_trial7DSVIP";
                } else if (TextUtils.equals("/vip/trail", path)) {
                    this.f175742j = "viptrial";
                }
            }
            if (NullChecker.m81303a(this.f175742j)) {
                zvf0.m220368A("e_vas_guide_assistant", OMSDialogPositon.p_chat_view, vwb.m200311Y("vas_guide_type", this.f175742j));
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m192919H() {
        String str;
        DynamicSchemaMsgData dynamicSchemaMsgData = this.f175741i;
        if (dynamicSchemaMsgData == null || (str = dynamicSchemaMsgData.extra) == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String strOptString = new JSONObject(this.f175741i.extra).optString(FirebaseAnalytics.Event.SEARCH);
            if ("little-helper-recommend-anchor-live".equals(strOptString) || "little-helper-recommend-anchor-voiceLive".equals(strOptString)) {
                HashMap map = new HashMap();
                Map<String, String> map2 = this.f175741i.eventExtra;
                if (map2 != null) {
                    for (String str2 : map2.keySet()) {
                        map.put(str2, this.f175741i.eventExtra.get(str2));
                    }
                }
                map.put("live_enter_source", PaymentData.FROM_TEAM);
                zvf0.m220403y("little-helper-recommend-anchor-live".equals(strOptString) ? "e_live_room_enter" : "e_live_audio_room_enter", OMSDialogPositon.p_messages_view, map);
            }
        } catch (Exception e) {
            if (e instanceof JSONException) {
                return;
            }
            CrashHelper.m81297d(e, 50);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m192920l(ViewGroup viewGroup, AutoVDraweeView autoVDraweeView, AutoVDraweeView autoVDraweeView2, VText vText, VText vText2, VText vText3, LinearLayout linearLayout) {
        this.f175733a = viewGroup;
        this.f175734b = autoVDraweeView;
        this.f175735c = autoVDraweeView2;
        this.f175736d = vText;
        this.f175737e = vText2;
        this.f175738f = vText3;
        this.f175739g = linearLayout;
        this.f175743k = viewGroup != null ? viewGroup.getBackground() : null;
        this.f175744l = vText2 != null ? vText2.getBackground() : null;
    }

    /* JADX INFO: renamed from: m */
    public final CharSequence m192921m(String str) {
        boolean zM101910b = bhq.m101910b(str);
        VText vText = this.f175736d;
        if (!zM101910b) {
            vText.setMovementMethod(null);
            return str;
        }
        vText.setMovementMethod(LinkMovementMethod.getInstance());
        String strReplaceAll = str.replaceAll(SignParameters.NEW_LINE, "<br/>");
        Spanned spannedFromHtml = Html.fromHtml(strReplaceAll);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannedFromHtml);
        for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannedFromHtml.length(), URLSpan.class)) {
            m192916E(spannableStringBuilder, uRLSpan, strReplaceAll);
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: o */
    public final void m192923o(DynamicSchemaMsgData dynamicSchemaMsgData) {
        if (dynamicSchemaMsgData == null || dynamicSchemaMsgData.view == null) {
            return;
        }
        int iM186890d = t100.m186890d(256.0f);
        this.f175736d.setText(dynamicSchemaMsgData.view.text);
        this.f175737e.setText(dynamicSchemaMsgData.view.button);
        this.f175737e.setTypeface(Typeface.DEFAULT);
        xdl0.m208327D0(iM186890d, this.f175733a);
        xdl0.m208327D0(iM186890d, this.f175734b);
        xdl0.m208327D0(iM186890d, this.f175739g);
        xdl0.m208325C0(this.f175734b, t100.m186890d(180.0f));
        this.f175734b.setImageUrl(dynamicSchemaMsgData.view.image);
        VText vText = this.f175736d;
        int i = t100.f167261j;
        xdl0.m208360X(vText, i);
        xdl0.m208360X(this.f175737e, i);
        xdl0.m208358V(this.f175736d, i);
        xdl0.m208359W(this.f175736d, i);
        xdl0.m208358V(this.f175737e, i);
        xdl0.m208359W(this.f175737e, i);
        this.f175733a.setBackgroundResource(c3c0.f78827p);
        if (!this.f175745m) {
            this.f175745m = true;
            zvf0.m220368A(dynamicSchemaMsgData.eId, OMSDialogPositon.p_chat_view, vwb.m200311Y(dynamicSchemaMsgData.kId, dynamicSchemaMsgData.event));
        }
        if (!NullChecker.m81303a(this.f175735c) || TextUtils.isEmpty(dynamicSchemaMsgData.view.image2)) {
            return;
        }
        xdl0.m208344M(this.f175735c, true);
        this.f175735c.setImageUrl(dynamicSchemaMsgData.view.image2);
    }

    /* JADX INFO: renamed from: r */
    public void mo192924r() {
        DynamicSchemaMsgData dynamicSchemaMsgData;
        DynamicSchemaMsgData dynamicSchemaMsgData2;
        if (!TextUtils.equals(this.f175740h, User.ID_LIVE_SERVICE) || (dynamicSchemaMsgData2 = this.f175741i) == null || dynamicSchemaMsgData2.eventExtra == null) {
            DynamicSchemaMsgData dynamicSchemaMsgData3 = this.f175741i;
            if (dynamicSchemaMsgData3 != null && dynamicSchemaMsgData3.eventExtra != null && !TextUtils.isEmpty(dynamicSchemaMsgData3.eId) && !l4p.m148453c(this.f175741i.schema)) {
                HashMap map = new HashMap();
                for (String str : this.f175741i.eventExtra.keySet()) {
                    map.put(str, this.f175741i.eventExtra.get(str));
                }
                zvf0.m220403y(this.f175741i.eId, OMSDialogPositon.p_chat_view, map);
            }
        } else {
            HashMap map2 = new HashMap();
            for (String str2 : this.f175741i.eventExtra.keySet()) {
                map2.put(str2, this.f175741i.eventExtra.get(str2));
            }
            zvf0.m220403y("e_live_assistant", OMSDialogPositon.p_messages_view, map2);
        }
        m192919H();
        Act act = (Act) xdl0.m208328E(this.f175733a);
        if (act == null || (dynamicSchemaMsgData = this.f175741i) == null) {
            return;
        }
        l4p.m148460j(act, dynamicSchemaMsgData.schema);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m192925s(final DynamicSchemaMsgData dynamicSchemaMsgData, View view) {
        if (TextUtils.equals(this.f175740h, User.ID_LIVE_SERVICE) && dynamicSchemaMsgData != null && dynamicSchemaMsgData.eventExtra != null) {
            HashMap map = new HashMap();
            for (String str : dynamicSchemaMsgData.eventExtra.keySet()) {
                map.put(str, dynamicSchemaMsgData.eventExtra.get(str));
            }
            zvf0.m220397s("e_live_assistant", OMSDialogPositon.p_messages_view, map);
        } else if (dynamicSchemaMsgData != null && dynamicSchemaMsgData.eventExtra != null && !TextUtils.isEmpty(dynamicSchemaMsgData.eId) && !l4p.m148453c(dynamicSchemaMsgData.schema)) {
            HashMap map2 = new HashMap();
            for (String str2 : dynamicSchemaMsgData.eventExtra.keySet()) {
                map2.put(str2, dynamicSchemaMsgData.eventExtra.get(str2));
            }
            zvf0.m220397s(dynamicSchemaMsgData.eId, OMSDialogPositon.p_chat_view, map2);
        }
        if (TextUtils.isEmpty(dynamicSchemaMsgData.schema)) {
            if (TextUtils.isEmpty(dynamicSchemaMsgData.action) || !"personalizedrcmd_recallmsg".equals(dynamicSchemaMsgData.action)) {
                m192913B(dynamicSchemaMsgData.extra, false);
                return;
            } else {
                zvf0.m220396r("e_personalized_recommendation_open", OMSDialogPositon.p_messages_view);
                m192928v();
                return;
            }
        }
        if (!TextUtils.isEmpty(this.f175742j)) {
            zvf0.m220399u("e_vas_guide_assistant", OMSDialogPositon.p_chat_view, vwb.m200311Y("vas_guide_type", this.f175742j));
        }
        Act act = (Act) xdl0.m208328E(this.f175733a);
        if (act != null) {
            l4p.m148459i(act, dynamicSchemaMsgData.schema);
        }
        j2e0.m139447n(xdl0.m208328E(this.f175733a), Uri.parse(dynamicSchemaMsgData.schema), new f30() { // from class: l.nbq
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                ubq.m192900b(dynamicSchemaMsgData, (String) obj, (String) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m192926t(final DynamicSchemaMsgData dynamicSchemaMsgData, View view) {
        if (TextUtils.isEmpty(dynamicSchemaMsgData.cancelSchema)) {
            m192913B(dynamicSchemaMsgData.extra, true);
        } else {
            j2e0.m139447n(xdl0.m208328E(this.f175733a), Uri.parse(dynamicSchemaMsgData.cancelSchema), new f30() { // from class: l.mbq
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    ubq.m192904f(dynamicSchemaMsgData, (String) obj, (String) obj2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: u */
    public List<knb0<String, Runnable, Integer, Void>> m192927u() {
        return null;
    }

    /* JADX INFO: renamed from: v */
    public void m192928v() {
        Settings settings = CoreModule.f17545c.f19639e0.m169520na().settings;
        if (NullChecker.m81303a(settings)) {
            if (settings.personalizeSuggest().booleanValue()) {
                osi0.m165782f(R$string.f21122x5);
                return;
            }
            SettingGroups settingGroups = new SettingGroups();
            UserPrivacySettings userPrivacySettings = new UserPrivacySettings();
            settingGroups.privacy = userPrivacySettings;
            userPrivacySettings.personalizeSuggest = Boolean.TRUE;
            Act act = (Act) xdl0.m208328E(this.f175733a);
            act.progress(act.getString(R$string.f20775I2), true);
            m192929w(act, settingGroups);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m192929w(final Act act, SettingGroups settingGroups) {
        act.duringCreated(CoreModule.f17545c.f19663m0.m31121k8(settingGroups)).subscribe(mkd0.m154956H(new e30() { // from class: l.obq
            @Override // p149l.e30
            public final void call(Object obj) {
                ubq.m192903e(act, (roj0) obj);
            }
        }, new e30() { // from class: l.pbq
            @Override // p149l.e30
            public final void call(Object obj) {
                ubq.m192902d(act, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x */
    public void mo192930x(Message message) {
        this.f175742j = null;
        if (this.f175733a == null) {
            return;
        }
        if (m192911q(message) || m192910p(message) || zbq.m217989R(message)) {
            this.f175740h = message.cid;
            try {
                DynamicSchemaMsgData dynamicSchemaMsgData = DynamicSchemaMsgData.JSON_ADAPTER.parse(message.msgData);
                this.f175741i = dynamicSchemaMsgData;
                if (dynamicSchemaMsgData == null) {
                    return;
                }
                m192914C();
                boolean zEquals = TextUtils.equals(this.f175741i.source, "creation");
                DynamicSchemaMsgData dynamicSchemaMsgData2 = this.f175741i;
                if (zEquals) {
                    m192923o(dynamicSchemaMsgData2);
                } else {
                    m192912A(dynamicSchemaMsgData2);
                    mo192915D(this.f175741i);
                }
                if (TextUtils.isEmpty(this.f175741i.schema)) {
                    return;
                }
                m192918G(this.f175741i);
            } catch (Exception e) {
                CrashHelper.m81296c(e);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m192931y(@NonNull MessageView messageView) {
        try {
            int i = this.f175741i.view.uiStyle;
            VText vText = this.f175737e;
            if (i == 1) {
                xdl0.m208325C0(vText, t100.m186890d(48.0f));
                xdl0.m208360X(this.f175737e, t100.m186890d(12.0f));
                xdl0.m208357U(this.f175737e, t100.m186890d(12.0f));
                xdl0.m208358V(this.f175737e, t100.m186890d(12.0f));
                xdl0.m208359W(this.f175737e, t100.m186890d(12.0f));
                this.f175737e.setTextColor(Color.parseColor("#FFFFFF"));
                m192917F(this.f175737e, Color.parseColor("#FE7E1D"), 10.0f);
                return;
            }
            xdl0.m208325C0(vText, t100.m186890d(42.0f));
            xdl0.m208360X(this.f175737e, t100.m186890d(16.0f));
            xdl0.m208357U(this.f175737e, t100.m186890d(16.0f));
            xdl0.m208358V(this.f175737e, t100.m186890d(16.0f));
            xdl0.m208359W(this.f175737e, t100.m186890d(16.0f));
            this.f175737e.setTextColor(Color.parseColor("#FE7E1D"));
            m192917F(this.f175737e, Color.parseColor("#FFFFFF"), 10.0f);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m192932z(@NonNull MessageView messageView) {
        boolean zIsEmpty = TextUtils.isEmpty(messageView.cancelText);
        VText vText = this.f175738f;
        if (zIsEmpty) {
            xdl0.m208344M(vText, false);
            return;
        }
        xdl0.m208344M(vText, true);
        this.f175738f.setText(messageView.cancelText);
        try {
            int i = this.f175741i.view.uiStyle;
            VText vText2 = this.f175738f;
            if (i == 1) {
                xdl0.m208325C0(vText2, t100.m186890d(48.0f));
                xdl0.m208360X(this.f175738f, t100.m186890d(-4.0f));
                xdl0.m208357U(this.f175738f, t100.m186890d(13.0f));
                xdl0.m208358V(this.f175738f, t100.m186890d(12.0f));
                xdl0.m208359W(this.f175738f, t100.m186890d(12.0f));
                this.f175738f.setTextSize(16.0f);
                this.f175738f.setTypeface(Typeface.defaultFromStyle(1));
                this.f175738f.setTextColor(Color.parseColor("#FE7E1D"));
                m192917F(this.f175738f, Color.parseColor("#FFFFFF"), 10.0f);
                return;
            }
            xdl0.m208325C0(vText2, t100.m186890d(42.0f));
            xdl0.m208360X(this.f175738f, t100.m186890d(-12.0f));
            xdl0.m208357U(this.f175738f, t100.m186890d(8.0f));
            xdl0.m208358V(this.f175738f, t100.m186890d(16.0f));
            xdl0.m208359W(this.f175738f, t100.m186890d(16.0f));
            this.f175738f.setTextSize(14.0f);
            this.f175738f.setTypeface(Typeface.defaultFromStyle(0));
            this.f175738f.setTextColor(Color.parseColor("#27000000"));
            m192917F(this.f175738f, 0, 10.0f);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: n */
    public void m192922n(int i, boolean z, ItemMessageBase itemMessageBase) {
    }
}
