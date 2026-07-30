package com.p000p1.mobile.putong.core.api;

import com.google.common.reflect.TypeToken;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.CoreAITranslate;
import com.p1.mobile.putong.data.AiTranslateLanguage;
import com.p1.mobile.putong.data.AiTranslateLanguageBean;
import com.p1.mobile.putong.data.AiTranslateResultBean;
import com.p1.mobile.putong.data.AiTranslateResultData;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.SettingGroups;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.TribeSetting;
import com.p1.mobile.putong.data.User;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import l.hpd0;
import l.ork;
import l.stc0;
import l.uqd0;
import l.utc0;
import l.v9j;
import l.w9j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p006l.ax6;
import p006l.ia20;
import p006l.rb20;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u00102\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0010¢\u0006\u0004\b\u0015\u0010\u0016J7\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0010H\u0002¢\u0006\u0004\b\u001f\u0010\u0016R\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lcom/p1/mobile/putong/core/api/CoreAITranslate;", "Ll/ax6;", "Lcom/p1/mobile/putong/core/api/c;", "core", "<init>", "(Lcom/p1/mobile/putong/core/api/c;)V", "", "p3", "()Z", "", "q3", "()V", "", "o3", "()Ljava/lang/String;", "language", "Lrx/c;", "r3", "(Ljava/lang/String;)Lrx/c;", "", "Lcom/p1/mobile/putong/data/AiTranslateLanguage;", "k3", "()Lrx/c;", "scene", "targetUserId", "", "messageId", "questionId", "Lcom/p1/mobile/putong/data/AiTranslateResultData;", "s3", "(Ljava/lang/String;Ljava/lang/String;JJ)Lrx/c;", "l3", "Ll/uqd0;", "R", "Ll/uqd0;", "translateLanguageList", "Ll/hpd0;", "n3", "()Ll/hpd0;", "guideShown", "b_core_base"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CoreAITranslate extends ax6 {

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @NotNull
    public uqd0 translateLanguageList;

    public CoreAITranslate(@Nullable C0158c c0158c) {
        super(c0158c);
        this.translateLanguageList = new uqd0("translate_language_list", "");
    }

    /* JADX INFO: renamed from: a3 */
    public static AiTranslateResultData m1944a3(Function1 function1, Object obj) {
        return (AiTranslateResultData) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: c3 */
    public static c m1946c3() {
        return ia20.m16569c(new v9j() { // from class: l.gu6
            public final Object call() {
                return CoreAITranslate.m1954m3();
            }
        }, AiTranslateLanguageBean.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: d3 */
    public static List m1947d3(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e3 */
    public static List m1948e3(CoreAITranslate coreAITranslate, AiTranslateLanguageBean aiTranslateLanguageBean) {
        List list = aiTranslateLanguageBean.data.languages;
        list.getClass();
        coreAITranslate.translateLanguageList.put(ork.d(list));
        return list;
    }

    /* JADX INFO: renamed from: f3 */
    public static stc0 m1949f3(JSONObject jSONObject) {
        return C0154a.f3483P.auth().q(C0154a.m3130G("/ai-translate/translate")).l(utc0.create(Network.JSON, jSONObject.toString())).b();
    }

    /* JADX INFO: renamed from: g3 */
    public static stc0 m1950g3(JSONObject jSONObject) {
        return C0154a.f3483P.auth().q(C0154a.m3130G("/ai-translate/language")).l(utc0.create(Network.JSON, jSONObject.toString())).b();
    }

    /* JADX INFO: renamed from: h3 */
    public static AiTranslateResultData m1951h3(AiTranslateResultBean aiTranslateResultBean) {
        aiTranslateResultBean.getClass();
        return aiTranslateResultBean.data;
    }

    /* JADX INFO: renamed from: i3 */
    public static Unit m1952i3(CoreAITranslate coreAITranslate, Envelope envelope) {
        coreAITranslate.f8580Q.f3628e0.m21417W9(CoreModule.m1850H().userId());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j3 */
    public static Unit m1953j3(Function1 function1, Object obj) {
        return (Unit) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: m3 */
    public static final stc0 m1954m3() {
        return C0154a.f3483P.auth().q(C0154a.m3130G("/ai-translate/languages")).f().b();
    }

    @NotNull
    /* JADX INFO: renamed from: k3 */
    public final c<List<AiTranslateLanguage>> m1955k3() {
        try {
            List list = (List) ork.c((String) this.translateLanguageList.get(), new TypeToken<List<? extends AiTranslateLanguage>>() { // from class: com.p1.mobile.putong.core.api.CoreAITranslate$fetchLanguages$languagesCached$1
            }.getType());
            if (list != null && (!list.isEmpty())) {
                m1956l3().subscribe();
                c<List<AiTranslateLanguage>> cVarJust = c.just(list);
                cVarJust.getClass();
                return cVarJust;
            }
        } catch (Exception unused) {
        }
        return m1956l3();
    }

    /* JADX INFO: renamed from: l3 */
    public final c<List<AiTranslateLanguage>> m1956l3() {
        c cVarScheduled = this.f8580Q.scheduled("ai_translate_languages", 0, new v9j() { // from class: l.au6
            public final Object call() {
                return CoreAITranslate.m1946c3();
            }
        });
        final Function1 function1 = new Function1() { // from class: l.bu6
            public final Object invoke(Object obj) {
                return CoreAITranslate.m1948e3(this.f9089a, (AiTranslateLanguageBean) obj);
            }
        };
        c<List<AiTranslateLanguage>> map = cVarScheduled.map(new w9j() { // from class: l.cu6
            public final Object call(Object obj) {
                return CoreAITranslate.m1947d3(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    /* JADX INFO: renamed from: n3 */
    public final hpd0 m1957n3() {
        return new hpd0("ai_translate_guide_shown_" + CoreModule.m1850H().userId(), Boolean.FALSE);
    }

    @NotNull
    /* JADX INFO: renamed from: o3 */
    public final String m1958o3() {
        Settings settings;
        SettingGroups settingGroup;
        TribeSetting tribeSetting;
        User userM21490p9 = this.f8580Q.f3628e0.m21490p9();
        String str = (userM21490p9 == null || (settings = userM21490p9.settings) == null || (settingGroup = settings.getSettingGroup()) == null || (tribeSetting = settingGroup.tttribe) == null) ? null : tribeSetting.transLang;
        if (str != null && str.length() != 0) {
            return str;
        }
        String strM22791f = rb20.m22791f();
        strM22791f.getClass();
        return strM22791f;
    }

    /* JADX INFO: renamed from: p3 */
    public final boolean m1959p3() {
        Object obj = m1957n3().get();
        obj.getClass();
        return ((Boolean) obj).booleanValue();
    }

    /* JADX INFO: renamed from: q3 */
    public final void m1960q3() {
        m1957n3().put(Boolean.TRUE);
    }

    @NotNull
    /* JADX INFO: renamed from: r3 */
    public final c<Unit> m1961r3(@NotNull String language) throws JSONException {
        language.getClass();
        final JSONObject jSONObject = new JSONObject();
        jSONObject.put("language", language);
        c<Envelope> cVarM16567a = ia20.m16567a(new v9j() { // from class: l.hu6
            public final Object call() {
                return CoreAITranslate.m1950g3(jSONObject);
            }
        });
        final Function1 function1 = new Function1() { // from class: l.iu6
            public final Object invoke(Object obj) {
                return CoreAITranslate.m1952i3(this.f14784a, (Envelope) obj);
            }
        };
        c<Unit> cVarNow = now("ai_translate_set_language", cVarM16567a.map(new w9j() { // from class: l.ju6
            public final Object call(Object obj) {
                return CoreAITranslate.m1953j3(function1, obj);
            }
        }));
        cVarNow.getClass();
        return cVarNow;
    }

    @NotNull
    /* JADX INFO: renamed from: s3 */
    public final c<AiTranslateResultData> m1962s3(@Nullable String scene, @Nullable String targetUserId, long messageId, long questionId) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("scene", scene);
            jSONObject.put("target_language", m1958o3());
            jSONObject.put("target_user_id", targetUserId);
            if (messageId > 0) {
                jSONObject.put("message_id", messageId);
            }
            if (questionId > 0) {
                jSONObject.put("question_id", questionId);
            }
        } catch (Exception unused) {
        }
        C0158c c0158c = this.f8580Q;
        c cVarM16569c = ia20.m16569c(new v9j() { // from class: l.du6
            public final Object call() {
                return CoreAITranslate.m1949f3(jSONObject);
            }
        }, AiTranslateResultBean.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.eu6
            public final Object invoke(Object obj) {
                return CoreAITranslate.m1951h3((AiTranslateResultBean) obj);
            }
        };
        c<AiTranslateResultData> cVarNow = c0158c.now("ai_translate", cVarM16569c.map(new w9j() { // from class: l.fu6
            public final Object call(Object obj) {
                return CoreAITranslate.m1944a3(function1, obj);
            }
        }));
        cVarNow.getClass();
        return cVarNow;
    }
}
