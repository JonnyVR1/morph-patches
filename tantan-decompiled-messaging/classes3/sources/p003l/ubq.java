package p003l;

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
import androidx.appcompat.widget.AppCompatTextView;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemMessageBase;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.DynamicSchemaMsgData;
import com.p1.mobile.putong.core.data.LiveSchema;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageView;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.Meta;
import com.p1.mobile.putong.data.SettingGroups;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.UserPrivacySettings;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.ahq;
import l.bhq;
import l.c3c0;
import l.e51;
import l.ftd0;
import l.j2e0;
import l.j760;
import l.knb0;
import l.l4p;
import l.lsi0;
import l.mkd0;
import l.osi0;
import l.roj0;
import l.t100;
import l.vwb;
import l.xdl0;
import l.yij0;
import l.zvf0;
import org.json.JSONException;
import org.json.JSONObject;
import p028v.AutoVDraweeView;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ubq {

    /* JADX INFO: renamed from: a */
    public ViewGroup f7949a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f7950b;

    /* JADX INFO: renamed from: c */
    public AutoVDraweeView f7951c;

    /* JADX INFO: renamed from: d */
    public VText f7952d;

    /* JADX INFO: renamed from: e */
    public VText f7953e;

    /* JADX INFO: renamed from: f */
    public VText f7954f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f7955g;

    /* JADX INFO: renamed from: h */
    public String f7956h;

    /* JADX INFO: renamed from: i */
    public DynamicSchemaMsgData f7957i;

    /* JADX INFO: renamed from: j */
    public String f7958j;

    /* JADX INFO: renamed from: k */
    public Drawable f7959k;

    /* JADX INFO: renamed from: l */
    public Drawable f7960l;

    /* JADX INFO: renamed from: m */
    public boolean f7961m = false;

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m8108b(DynamicSchemaMsgData dynamicSchemaMsgData, String str, String str2) {
        if ("scheme_message_no_handler_found".equals(str2)) {
            lsi0.j(dynamicSchemaMsgData.failRemind);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m8110d(Act act, Throwable th) {
        act.progressDismiss();
        yij0.D(th);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m8111e(Act act, roj0 roj0Var) {
        act.progressDismiss();
        osi0.f(R.string.x5);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m8112f(DynamicSchemaMsgData dynamicSchemaMsgData, String str, String str2) {
        if ("scheme_message_no_handler_found".equals(str2)) {
            lsi0.j(dynamicSchemaMsgData.cancelRemind);
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m8113g(Act act) {
        if (act.isFinishing()) {
            return;
        }
        act.progress(R.string.I2);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m8115i(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            if (coreService.code == 41063) {
                lsi0.j(coreService.metaMessage);
                return;
            }
        }
        lsi0.h(R.string.C2);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m8116j(Runnable runnable, Act act) {
        e51.J(runnable);
        if (act.isFinishing()) {
            return;
        }
        act.progressDismiss();
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m8117k(Act act, Envelope envelope) {
        Meta meta = envelope.meta;
        if (!TextUtils.isEmpty(meta.message) && !"OK".equals(meta.message)) {
            lsi0.y(meta.message);
            return;
        }
        if (envelope.getModuleData(CoreData.class).liveSchemas == null || vwb.J(envelope.getModuleData(CoreData.class).liveSchemas)) {
            return;
        }
        LiveSchema liveSchema = (LiveSchema) envelope.getModuleData(CoreData.class).liveSchemas.get(0);
        if (TextUtils.isEmpty(liveSchema.schema)) {
            lsi0.h(R.string.C2);
        } else {
            j2e0.m(act, Uri.parse(liveSchema.schema));
        }
    }

    /* JADX INFO: renamed from: p */
    public static boolean m8118p(Message message) {
        return !TextUtils.isEmpty(message.msgData) && TEnum.equals(message.messageType(), "setting_event");
    }

    /* JADX INFO: renamed from: q */
    public static boolean m8119q(Message message) {
        return !TextUtils.isEmpty(message.msgData) && TEnum.equals(message.messageType(), "picture_text_style");
    }

    /* JADX INFO: renamed from: A */
    public final void m8120A(DynamicSchemaMsgData dynamicSchemaMsgData) {
        if (dynamicSchemaMsgData.view == null) {
            return;
        }
        int iD = t100.d(256.0f);
        try {
            m8140z(dynamicSchemaMsgData.view);
            m8139y(dynamicSchemaMsgData.view);
            if (dynamicSchemaMsgData.view.isTextOnly) {
                this.f7952d.setMaxLines(Integer.MAX_VALUE);
                this.f7952d.setText(m8129m(dynamicSchemaMsgData.view.text));
                this.f7953e.setText(dynamicSchemaMsgData.view.button);
                xdl0.M(this.f7950b, false);
                ViewGroup.LayoutParams layoutParams = this.f7955g.getLayoutParams();
                layoutParams.width = iD;
                this.f7955g.setLayoutParams(layoutParams);
                return;
            }
            xdl0.M(this.f7950b, true);
            this.f7952d.setText(m8129m(dynamicSchemaMsgData.view.text));
            this.f7953e.setText(dynamicSchemaMsgData.view.button);
            ViewGroup.LayoutParams layoutParams2 = this.f7950b.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams2 = new ViewGroup.LayoutParams(iD, iD);
            }
            if (TextUtils.isEmpty(dynamicSchemaMsgData.view.imageSize)) {
                this.f7952d.setMaxLines(3);
            } else {
                String[] strArrSplit = dynamicSchemaMsgData.view.imageSize.split("x");
                if (strArrSplit.length == 2) {
                    int iD2 = t100.d(Integer.parseInt(strArrSplit[0]));
                    int iD3 = t100.d(Integer.parseInt(strArrSplit[1]));
                    if (iD2 == iD3) {
                        this.f7952d.setMaxLines(3);
                        layoutParams2.height = iD;
                        layoutParams2.width = iD;
                    } else if (iD2 > 0 && iD3 > 0) {
                        int iD4 = (int) (iD / (iD2 / (iD3 + 0.0f)));
                        if (iD4 < t100.d(55.0f)) {
                            iD4 = t100.d(55.0f);
                        } else if (iD4 > iD) {
                            iD4 = iD;
                        }
                        if (NullChecker.a(dynamicSchemaMsgData.schema) && dynamicSchemaMsgData.schema.contains("monetization")) {
                            this.f7952d.setMaxLines(Integer.MAX_VALUE);
                        } else {
                            this.f7952d.setMaxLines(2);
                        }
                        layoutParams2.height = iD4;
                        layoutParams2.width = iD;
                    }
                }
            }
            if (dynamicSchemaMsgData.view.ignoreHeightLimit) {
                this.f7952d.setMaxLines(Integer.MAX_VALUE);
            }
            this.f7950b.setLayoutParams(layoutParams2);
            this.f7950b.getHierarchy().w(ftd0.a);
            ViewGroup.LayoutParams layoutParams3 = this.f7955g.getLayoutParams();
            layoutParams3.width = iD;
            this.f7955g.setLayoutParams(layoutParams3);
            this.f7950b.setImageUrl(dynamicSchemaMsgData.view.image);
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m8121B(String str, boolean z) {
        final Act actE = xdl0.E(this.f7949a);
        final Runnable runnable = new Runnable() { // from class: l.qbq
            @Override // java.lang.Runnable
            public final void run() {
                ubq.m8113g(actE);
            }
        };
        actE.duringCreated(CoreModule.c.f0.wp(str, z)).doOnSubscribe(new d30() { // from class: l.rbq
            @Override // p003l.d30
            public final void call() {
                e51.H(actE, runnable, 1000L);
            }
        }).doOnUnsubscribe(new d30() { // from class: l.sbq
            @Override // p003l.d30
            public final void call() {
                ubq.m8116j(runnable, actE);
            }
        }).subscribe((m250) mkd0.H(new e30() { // from class: l.tbq
            @Override // p003l.e30
            public final void call(Object obj) {
                ubq.m8117k(actE, (Envelope) obj);
            }
        }, new e30() { // from class: l.kbq
            @Override // p003l.e30
            public final void call(Object obj) {
                ubq.m8115i((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: C */
    public final void m8122C() {
        if (NullChecker.a(this.f7951c)) {
            xdl0.M(this.f7951c, false);
        }
        xdl0.M(this.f7954f, false);
        xdl0.M(this.f7950b, true);
        this.f7949a.setBackground(this.f7959k);
        xdl0.D0(-2, new View[]{this.f7949a});
        this.f7952d.setMaxLines(Integer.MAX_VALUE);
        this.f7952d.setTypeface(Typeface.defaultFromStyle(1));
        xdl0.X(this.f7952d, t100.d(12.0f));
        xdl0.V(this.f7952d, t100.d(16.0f));
        xdl0.W(this.f7952d, t100.d(16.0f));
        this.f7953e.setTypeface(Typeface.defaultFromStyle(1));
        xdl0.C0(this.f7953e, t100.d(42.0f));
        xdl0.X(this.f7953e, t100.d(16.0f));
        xdl0.U(this.f7953e, t100.d(16.0f));
        xdl0.V(this.f7953e, t100.d(16.0f));
        xdl0.W(this.f7953e, t100.d(16.0f));
        this.f7953e.setTextColor(Color.parseColor("#FE7E1D"));
        this.f7953e.setBackground(this.f7960l);
    }

    /* JADX INFO: renamed from: D */
    public void mo8123D(final DynamicSchemaMsgData dynamicSchemaMsgData) {
        xdl0.E0(this.f7953e, new View.OnClickListener() { // from class: l.jbq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4611a.m8133s(dynamicSchemaMsgData, view);
            }
        });
        xdl0.E0(this.f7954f, new View.OnClickListener() { // from class: l.lbq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5250a.m8134t(dynamicSchemaMsgData, view);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public final void m8124E(SpannableStringBuilder spannableStringBuilder, URLSpan uRLSpan, String str) {
        int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
        int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
        int spanFlags = spannableStringBuilder.getSpanFlags(uRLSpan);
        String[] strArr = {"Letv", "LeEco"};
        try {
            String url = uRLSpan.getURL();
            if (!TextUtils.isEmpty(url) && url.contains(" ")) {
                url = url.replace(" ", "");
            }
            URI uri = new URI(url);
            if (Arrays.asList(strArr).contains(Build.BRAND)) {
                spannableStringBuilder.removeSpan(uRLSpan);
            }
            ahq.h(uri, true);
            spannableStringBuilder.setSpan(bhq.a(uri, true, "", "p_chat_view"), spanStart, spanEnd, spanFlags);
        } catch (URISyntaxException e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m8125F(View view, int i, float f) {
        view.getContext();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius(ikf0.m5146c(f));
        view.setBackground(gradientDrawable);
    }

    /* JADX INFO: renamed from: G */
    public final void m8126G(DynamicSchemaMsgData dynamicSchemaMsgData) {
        Uri uri = Uri.parse(dynamicSchemaMsgData.schema);
        if (uri.getScheme().startsWith("tantan")) {
            this.f7958j = null;
            String authority = uri.getAuthority();
            String path = uri.getPath();
            String queryParameter = uri.getQueryParameter("businessType");
            if (TextUtils.equals("vip", authority)) {
                if (TextUtils.equals("/diamond", path)) {
                    if (TextUtils.equals("renew", queryParameter)) {
                        this.f7958j = "expired_oDiamond";
                    } else {
                        this.f7958j = "normal_oDiamond";
                    }
                } else if (TextUtils.equals("/vip/buy", path) || TextUtils.equals("/vip", path)) {
                    if (TextUtils.equals("renew", queryParameter)) {
                        this.f7958j = "expired_vip";
                    } else {
                        this.f7958j = "normal_vip";
                    }
                } else if (TextUtils.equals("/quickchat", path)) {
                    this.f7958j = "quickchat";
                } else if (TextUtils.equals("/see", path)) {
                    this.f7958j = "call2buysee";
                } else if (TextUtils.equals("/partner", path)) {
                    this.f7958j = "supremePartner";
                } else if (TextUtils.equals("/femaleVip", path)) {
                    this.f7958j = "femalevip";
                }
            } else if (TextUtils.equals("svip", authority)) {
                if (TextUtils.equals("/svip/buy", path) || TextUtils.equals("/svip", path)) {
                    if (TextUtils.equals("renew", queryParameter)) {
                        this.f7958j = "expired_svip";
                    } else {
                        this.f7958j = "normal_svip";
                    }
                }
            } else if (TextUtils.equals("monetization_promotion", authority)) {
                if (TextUtils.equals("/svip/trail", path)) {
                    this.f7958j = "promotion_trial7DSVIP";
                } else if (TextUtils.equals("/vip/trail", path)) {
                    this.f7958j = "viptrial";
                }
            }
            if (NullChecker.a(this.f7958j)) {
                zvf0.A("e_vas_guide_assistant", "p_chat_view", new j760[]{vwb.Y("vas_guide_type", this.f7958j)});
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m8127H() {
        String str;
        DynamicSchemaMsgData dynamicSchemaMsgData = this.f7957i;
        if (dynamicSchemaMsgData == null || (str = dynamicSchemaMsgData.extra) == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String strOptString = new JSONObject(this.f7957i.extra).optString("search");
            if ("little-helper-recommend-anchor-live".equals(strOptString) || "little-helper-recommend-anchor-voiceLive".equals(strOptString)) {
                HashMap map = new HashMap();
                Map map2 = this.f7957i.eventExtra;
                if (map2 != null) {
                    for (String str2 : map2.keySet()) {
                        map.put(str2, this.f7957i.eventExtra.get(str2));
                    }
                }
                map.put("live_enter_source", "tantan_assistant");
                zvf0.y("little-helper-recommend-anchor-live".equals(strOptString) ? "e_live_room_enter" : "e_live_audio_room_enter", "p_messages_view", map);
            }
        } catch (Exception e) {
            if (e instanceof JSONException) {
                return;
            }
            CrashHelper.d(e, 50);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public void m8128l(ViewGroup viewGroup, AutoVDraweeView autoVDraweeView, AutoVDraweeView autoVDraweeView2, VText vText, VText vText2, VText vText3, LinearLayout linearLayout) {
        this.f7949a = viewGroup;
        this.f7950b = autoVDraweeView;
        this.f7951c = autoVDraweeView2;
        this.f7952d = vText;
        this.f7953e = vText2;
        this.f7954f = vText3;
        this.f7955g = linearLayout;
        this.f7959k = viewGroup != null ? viewGroup.getBackground() : null;
        this.f7960l = vText2 != 0 ? vText2.getBackground() : null;
    }

    /* JADX INFO: renamed from: m */
    public final CharSequence m8129m(String str) {
        boolean zB = bhq.b(str);
        AppCompatTextView appCompatTextView = this.f7952d;
        if (!zB) {
            appCompatTextView.setMovementMethod(null);
            return str;
        }
        appCompatTextView.setMovementMethod(LinkMovementMethod.getInstance());
        String strReplaceAll = str.replaceAll("\n", "<br/>");
        Spanned spannedFromHtml = Html.fromHtml(strReplaceAll);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannedFromHtml);
        for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannedFromHtml.length(), URLSpan.class)) {
            m8124E(spannableStringBuilder, uRLSpan, strReplaceAll);
        }
        return spannableStringBuilder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    public final void m8131o(DynamicSchemaMsgData dynamicSchemaMsgData) {
        if (dynamicSchemaMsgData == null || dynamicSchemaMsgData.view == null) {
            return;
        }
        int iD = t100.d(256.0f);
        this.f7952d.setText(dynamicSchemaMsgData.view.text);
        this.f7953e.setText(dynamicSchemaMsgData.view.button);
        this.f7953e.setTypeface(Typeface.DEFAULT);
        xdl0.D0(iD, new View[]{this.f7949a});
        xdl0.D0(iD, new View[]{this.f7950b});
        xdl0.D0(iD, new View[]{this.f7955g});
        xdl0.C0(this.f7950b, t100.d(180.0f));
        this.f7950b.setImageUrl(dynamicSchemaMsgData.view.image);
        AppCompatTextView appCompatTextView = this.f7952d;
        int i = t100.j;
        xdl0.X(appCompatTextView, i);
        xdl0.X(this.f7953e, i);
        xdl0.V(this.f7952d, i);
        xdl0.W(this.f7952d, i);
        xdl0.V(this.f7953e, i);
        xdl0.W(this.f7953e, i);
        this.f7949a.setBackgroundResource(c3c0.p);
        if (!this.f7961m) {
            this.f7961m = true;
            zvf0.A(dynamicSchemaMsgData.eId, "p_chat_view", new j760[]{vwb.Y(dynamicSchemaMsgData.kId, dynamicSchemaMsgData.event)});
        }
        if (!NullChecker.a(this.f7951c) || TextUtils.isEmpty(dynamicSchemaMsgData.view.image2)) {
            return;
        }
        xdl0.M(this.f7951c, true);
        this.f7951c.setImageUrl(dynamicSchemaMsgData.view.image2);
    }

    /* JADX INFO: renamed from: r */
    public void mo8132r() {
        DynamicSchemaMsgData dynamicSchemaMsgData;
        DynamicSchemaMsgData dynamicSchemaMsgData2;
        if (!TextUtils.equals(this.f7956h, "-11001") || (dynamicSchemaMsgData2 = this.f7957i) == null || dynamicSchemaMsgData2.eventExtra == null) {
            DynamicSchemaMsgData dynamicSchemaMsgData3 = this.f7957i;
            if (dynamicSchemaMsgData3 != null && dynamicSchemaMsgData3.eventExtra != null && !TextUtils.isEmpty(dynamicSchemaMsgData3.eId) && !l4p.c(this.f7957i.schema)) {
                HashMap map = new HashMap();
                for (String str : this.f7957i.eventExtra.keySet()) {
                    map.put(str, this.f7957i.eventExtra.get(str));
                }
                zvf0.y(this.f7957i.eId, "p_chat_view", map);
            }
        } else {
            HashMap map2 = new HashMap();
            for (String str2 : this.f7957i.eventExtra.keySet()) {
                map2.put(str2, this.f7957i.eventExtra.get(str2));
            }
            zvf0.y("e_live_assistant", "p_messages_view", map2);
        }
        m8127H();
        Act actE = xdl0.E(this.f7949a);
        if (actE == null || (dynamicSchemaMsgData = this.f7957i) == null) {
            return;
        }
        l4p.j(actE, dynamicSchemaMsgData.schema);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m8133s(final DynamicSchemaMsgData dynamicSchemaMsgData, View view) {
        if (TextUtils.equals(this.f7956h, "-11001") && dynamicSchemaMsgData != null && dynamicSchemaMsgData.eventExtra != null) {
            HashMap map = new HashMap();
            for (String str : dynamicSchemaMsgData.eventExtra.keySet()) {
                map.put(str, dynamicSchemaMsgData.eventExtra.get(str));
            }
            zvf0.s("e_live_assistant", "p_messages_view", map);
        } else if (dynamicSchemaMsgData != null && dynamicSchemaMsgData.eventExtra != null && !TextUtils.isEmpty(dynamicSchemaMsgData.eId) && !l4p.c(dynamicSchemaMsgData.schema)) {
            HashMap map2 = new HashMap();
            for (String str2 : dynamicSchemaMsgData.eventExtra.keySet()) {
                map2.put(str2, dynamicSchemaMsgData.eventExtra.get(str2));
            }
            zvf0.s(dynamicSchemaMsgData.eId, "p_chat_view", map2);
        }
        if (TextUtils.isEmpty(dynamicSchemaMsgData.schema)) {
            if (TextUtils.isEmpty(dynamicSchemaMsgData.action) || !"personalizedrcmd_recallmsg".equals(dynamicSchemaMsgData.action)) {
                m8121B(dynamicSchemaMsgData.extra, false);
                return;
            } else {
                zvf0.r("e_personalized_recommendation_open", "p_messages_view");
                m8136v();
                return;
            }
        }
        if (!TextUtils.isEmpty(this.f7958j)) {
            zvf0.u("e_vas_guide_assistant", "p_chat_view", new j760[]{vwb.Y("vas_guide_type", this.f7958j)});
        }
        Act actE = xdl0.E(this.f7949a);
        if (actE != null) {
            l4p.i(actE, dynamicSchemaMsgData.schema);
        }
        j2e0.n(xdl0.E(this.f7949a), Uri.parse(dynamicSchemaMsgData.schema), new f30() { // from class: l.nbq
            @Override // p003l.f30
            public final void call(Object obj, Object obj2) {
                ubq.m8108b(dynamicSchemaMsgData, (String) obj, (String) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m8134t(final DynamicSchemaMsgData dynamicSchemaMsgData, View view) {
        if (TextUtils.isEmpty(dynamicSchemaMsgData.cancelSchema)) {
            m8121B(dynamicSchemaMsgData.extra, true);
        } else {
            j2e0.n(xdl0.E(this.f7949a), Uri.parse(dynamicSchemaMsgData.cancelSchema), new f30() { // from class: l.mbq
                @Override // p003l.f30
                public final void call(Object obj, Object obj2) {
                    ubq.m8112f(dynamicSchemaMsgData, (String) obj, (String) obj2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: u */
    public List<knb0<String, Runnable, Integer, Void>> m8135u() {
        return null;
    }

    /* JADX INFO: renamed from: v */
    public void m8136v() {
        Settings settings = CoreModule.c.e0.na().settings;
        if (NullChecker.a(settings)) {
            if (settings.personalizeSuggest().booleanValue()) {
                osi0.f(R.string.x5);
                return;
            }
            SettingGroups settingGroups = new SettingGroups();
            UserPrivacySettings userPrivacySettings = new UserPrivacySettings();
            settingGroups.privacy = userPrivacySettings;
            userPrivacySettings.personalizeSuggest = Boolean.TRUE;
            Act act = (Act) xdl0.E(this.f7949a);
            act.progress(act.getString(R.string.I2), true);
            m8137w(act, settingGroups);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m8137w(final Act act, SettingGroups settingGroups) {
        act.duringCreated(CoreModule.c.m0.k8(settingGroups)).subscribe((m250) mkd0.H(new e30() { // from class: l.obq
            @Override // p003l.e30
            public final void call(Object obj) {
                ubq.m8111e(act, (roj0) obj);
            }
        }, new e30() { // from class: l.pbq
            @Override // p003l.e30
            public final void call(Object obj) {
                ubq.m8110d(act, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x */
    public void mo8138x(Message message) {
        this.f7958j = null;
        if (this.f7949a == null) {
            return;
        }
        if (m8119q(message) || m8118p(message) || zbq.m9391R(message)) {
            this.f7956h = message.cid;
            try {
                DynamicSchemaMsgData dynamicSchemaMsgData = (DynamicSchemaMsgData) DynamicSchemaMsgData.JSON_ADAPTER.parse(message.msgData);
                this.f7957i = dynamicSchemaMsgData;
                if (dynamicSchemaMsgData == null) {
                    return;
                }
                m8122C();
                boolean zEquals = TextUtils.equals(this.f7957i.source, "creation");
                DynamicSchemaMsgData dynamicSchemaMsgData2 = this.f7957i;
                if (zEquals) {
                    m8131o(dynamicSchemaMsgData2);
                } else {
                    m8120A(dynamicSchemaMsgData2);
                    mo8123D(this.f7957i);
                }
                if (TextUtils.isEmpty(this.f7957i.schema)) {
                    return;
                }
                m8126G(this.f7957i);
            } catch (Exception e) {
                CrashHelper.c(e);
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: y */
    public final void m8139y(@NonNull MessageView messageView) {
        try {
            int i = this.f7957i.view.uiStyle;
            AppCompatTextView appCompatTextView = this.f7953e;
            if (i == 1) {
                xdl0.C0(appCompatTextView, t100.d(48.0f));
                xdl0.X(this.f7953e, t100.d(12.0f));
                xdl0.U(this.f7953e, t100.d(12.0f));
                xdl0.V(this.f7953e, t100.d(12.0f));
                xdl0.W(this.f7953e, t100.d(12.0f));
                this.f7953e.setTextColor(Color.parseColor("#FFFFFF"));
                m8125F(this.f7953e, Color.parseColor("#FE7E1D"), 10.0f);
                return;
            }
            xdl0.C0(appCompatTextView, t100.d(42.0f));
            xdl0.X(this.f7953e, t100.d(16.0f));
            xdl0.U(this.f7953e, t100.d(16.0f));
            xdl0.V(this.f7953e, t100.d(16.0f));
            xdl0.W(this.f7953e, t100.d(16.0f));
            this.f7953e.setTextColor(Color.parseColor("#FE7E1D"));
            m8125F(this.f7953e, Color.parseColor("#FFFFFF"), 10.0f);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: z */
    public final void m8140z(@NonNull MessageView messageView) {
        boolean zIsEmpty = TextUtils.isEmpty(messageView.cancelText);
        AppCompatTextView appCompatTextView = this.f7954f;
        if (zIsEmpty) {
            xdl0.M(appCompatTextView, false);
            return;
        }
        xdl0.M(appCompatTextView, true);
        this.f7954f.setText(messageView.cancelText);
        try {
            int i = this.f7957i.view.uiStyle;
            AppCompatTextView appCompatTextView2 = this.f7954f;
            if (i == 1) {
                xdl0.C0(appCompatTextView2, t100.d(48.0f));
                xdl0.X(this.f7954f, t100.d(-4.0f));
                xdl0.U(this.f7954f, t100.d(13.0f));
                xdl0.V(this.f7954f, t100.d(12.0f));
                xdl0.W(this.f7954f, t100.d(12.0f));
                this.f7954f.setTextSize(16.0f);
                this.f7954f.setTypeface(Typeface.defaultFromStyle(1));
                this.f7954f.setTextColor(Color.parseColor("#FE7E1D"));
                m8125F(this.f7954f, Color.parseColor("#FFFFFF"), 10.0f);
                return;
            }
            xdl0.C0(appCompatTextView2, t100.d(42.0f));
            xdl0.X(this.f7954f, t100.d(-12.0f));
            xdl0.U(this.f7954f, t100.d(8.0f));
            xdl0.V(this.f7954f, t100.d(16.0f));
            xdl0.W(this.f7954f, t100.d(16.0f));
            this.f7954f.setTextSize(14.0f);
            this.f7954f.setTypeface(Typeface.defaultFromStyle(0));
            this.f7954f.setTextColor(Color.parseColor("#27000000"));
            m8125F(this.f7954f, 0, 10.0f);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: n */
    public void m8130n(int i, boolean z, ItemMessageBase itemMessageBase) {
    }
}
