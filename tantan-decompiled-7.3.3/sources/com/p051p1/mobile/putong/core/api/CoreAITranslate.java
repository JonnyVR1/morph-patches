package com.p051p1.mobile.putong.core.api;

import com.google.common.reflect.TypeToken;
import com.google.firebase.messaging.Constants;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreAITranslate;
import com.p051p1.mobile.putong.data.AiTranslateLanguage;
import com.p051p1.mobile.putong.data.AiTranslateLanguageBean;
import com.p051p1.mobile.putong.data.AiTranslateResultBean;
import com.p051p1.mobile.putong.data.AiTranslateResultData;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.TribeSetting;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.ijk.media.player.IjkMediaMeta;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;
import p153l.ak20;
import p153l.dy6;
import p153l.euk;
import p153l.jxd0;
import p153l.pcj;
import p153l.qcj;
import p153l.qi20;
import p153l.wyd0;
import p153l.x1d0;
import p153l.z1d0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u00102\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0010¢\u0006\u0004\b\u0015\u0010\u0016J7\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0010H\u0002¢\u0006\u0004\b\u001f\u0010\u0016R\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, m88121d2 = {"Lcom/p1/mobile/putong/core/api/CoreAITranslate;", "Ll/dy6;", "Lcom/p1/mobile/putong/core/api/c;", "core", "<init>", "(Lcom/p1/mobile/putong/core/api/c;)V", "", "p3", "()Z", "", "q3", "()V", "", "o3", "()Ljava/lang/String;", IjkMediaMeta.IJKM_KEY_LANGUAGE, "Lrx/c;", "r3", "(Ljava/lang/String;)Lrx/c;", "", "Lcom/p1/mobile/putong/data/AiTranslateLanguage;", "k3", "()Lrx/c;", "scene", "targetUserId", "", "messageId", "questionId", "Lcom/p1/mobile/putong/data/AiTranslateResultData;", "s3", "(Ljava/lang/String;Ljava/lang/String;JJ)Lrx/c;", "l3", "Ll/wyd0;", "R", "Ll/wyd0;", "translateLanguageList", "Ll/jxd0;", "n3", "()Ll/jxd0;", "guideShown", "b_core_base"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class CoreAITranslate extends dy6 {

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @NotNull
    public wyd0 translateLanguageList;

    public CoreAITranslate(@Nullable C4883c c4883c) {
        super(c4883c);
        this.translateLanguageList = new wyd0("translate_language_list", "");
    }

    /* JADX INFO: renamed from: a3 */
    public static AiTranslateResultData m31014a3(Function1 function1, Object obj) {
        return (AiTranslateResultData) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: c3 */
    public static C22421c m31016c3() {
        return qi20.m176656c(new pcj() { // from class: l.jv6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return CoreAITranslate.m31024m3();
            }
        }, AiTranslateLanguageBean.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: d3 */
    public static List m31017d3(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e3 */
    public static List m31018e3(CoreAITranslate coreAITranslate, AiTranslateLanguageBean aiTranslateLanguageBean) {
        List<AiTranslateLanguage> list = aiTranslateLanguageBean.data.languages;
        list.getClass();
        coreAITranslate.translateLanguageList.put(euk.m122578d(list));
        return list;
    }

    /* JADX INFO: renamed from: f3 */
    public static x1d0 m31019f3(JSONObject jSONObject) {
        return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/ai-translate/translate")).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
    }

    /* JADX INFO: renamed from: g3 */
    public static x1d0 m31020g3(JSONObject jSONObject) {
        return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/ai-translate/language")).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
    }

    /* JADX INFO: renamed from: h3 */
    public static AiTranslateResultData m31021h3(AiTranslateResultBean aiTranslateResultBean) {
        aiTranslateResultBean.getClass();
        return aiTranslateResultBean.data;
    }

    /* JADX INFO: renamed from: i3 */
    public static Unit m31022i3(CoreAITranslate coreAITranslate, Envelope envelope) {
        coreAITranslate.f91137Q.f20381e0.m116527W9(CoreModule.m30929H().userId());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j3 */
    public static Unit m31023j3(Function1 function1, Object obj) {
        return (Unit) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: m3 */
    public static final x1d0 m31024m3() {
        return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/ai-translate/languages")).m209032f().m209028b();
    }

    @NotNull
    /* JADX INFO: renamed from: k3 */
    public final C22421c<List<AiTranslateLanguage>> m31025k3() {
        try {
            List list = (List) euk.m122577c(this.translateLanguageList.get(), new TypeToken<List<? extends AiTranslateLanguage>>() { // from class: com.p1.mobile.putong.core.api.CoreAITranslate$fetchLanguages$languagesCached$1
            }.getType());
            if (list != null && (!list.isEmpty())) {
                m31026l3().subscribe();
                C22421c<List<AiTranslateLanguage>> c22421cJust = C22421c.just(list);
                c22421cJust.getClass();
                return c22421cJust;
            }
        } catch (Exception unused) {
        }
        return m31026l3();
    }

    /* JADX INFO: renamed from: l3 */
    public final C22421c<List<AiTranslateLanguage>> m31026l3() {
        C22421c c22421cScheduled = this.f91137Q.scheduled("ai_translate_languages", 0, new pcj() { // from class: l.dv6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return CoreAITranslate.m31016c3();
            }
        });
        final Function1 function1 = new Function1() { // from class: l.ev6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CoreAITranslate.m31018e3(this.f95988a, (AiTranslateLanguageBean) obj);
            }
        };
        C22421c<List<AiTranslateLanguage>> map = c22421cScheduled.map(new qcj() { // from class: l.fv6
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreAITranslate.m31017d3(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    /* JADX INFO: renamed from: n3 */
    public final jxd0 m31027n3() {
        return new jxd0("ai_translate_guide_shown_" + CoreModule.m30929H().userId(), Boolean.FALSE);
    }

    @NotNull
    /* JADX INFO: renamed from: o3 */
    public final String m31028o3() {
        Settings settings;
        SettingGroups settingGroup;
        TribeSetting tribeSetting;
        User userM116600p9 = this.f91137Q.f20381e0.m116600p9();
        String str = (userM116600p9 == null || (settings = userM116600p9.settings) == null || (settingGroup = settings.getSettingGroup()) == null || (tribeSetting = settingGroup.tttribe) == null) ? null : tribeSetting.transLang;
        if (str != null && str.length() != 0) {
            return str;
        }
        String strM98546f = ak20.m98546f();
        strM98546f.getClass();
        return strM98546f;
    }

    /* JADX INFO: renamed from: p3 */
    public final boolean m31029p3() {
        Boolean bool = m31027n3().get();
        bool.getClass();
        return bool.booleanValue();
    }

    /* JADX INFO: renamed from: q3 */
    public final void m31030q3() {
        m31027n3().put(Boolean.TRUE);
    }

    @NotNull
    /* JADX INFO: renamed from: r3 */
    public final C22421c<Unit> m31031r3(@NotNull String language) throws JSONException {
        language.getClass();
        final JSONObject jSONObject = new JSONObject();
        jSONObject.put(IjkMediaMeta.IJKM_KEY_LANGUAGE, language);
        C22421c<Envelope> c22421cM176654a = qi20.m176654a(new pcj() { // from class: l.kv6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return CoreAITranslate.m31020g3(jSONObject);
            }
        });
        final Function1 function1 = new Function1() { // from class: l.lv6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CoreAITranslate.m31022i3(this.f133685a, (Envelope) obj);
            }
        };
        C22421c<Unit> c22421cNow = now("ai_translate_set_language", c22421cM176654a.map(new qcj() { // from class: l.mv6
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreAITranslate.m31023j3(function1, obj);
            }
        }));
        c22421cNow.getClass();
        return c22421cNow;
    }

    @NotNull
    /* JADX INFO: renamed from: s3 */
    public final C22421c<AiTranslateResultData> m31032s3(@Nullable String scene, @Nullable String targetUserId, long messageId, long questionId) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("scene", scene);
            jSONObject.put("target_language", m31028o3());
            jSONObject.put("target_user_id", targetUserId);
            if (messageId > 0) {
                jSONObject.put(Constants.MessagePayloadKeys.MSGID_SERVER, messageId);
            }
            if (questionId > 0) {
                jSONObject.put("question_id", questionId);
            }
        } catch (Exception unused) {
        }
        C4883c c4883c = this.f91137Q;
        C22421c c22421cM176656c = qi20.m176656c(new pcj() { // from class: l.gv6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return CoreAITranslate.m31019f3(jSONObject);
            }
        }, AiTranslateResultBean.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.hv6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CoreAITranslate.m31021h3((AiTranslateResultBean) obj);
            }
        };
        C22421c<AiTranslateResultData> c22421cNow = c4883c.now("ai_translate", c22421cM176656c.map(new qcj() { // from class: l.iv6
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreAITranslate.m31014a3(function1, obj);
            }
        }));
        c22421cNow.getClass();
        return c22421cNow;
    }
}
