package com.p046p1.mobile.putong.core.api;

import com.google.common.reflect.TypeToken;
import com.google.firebase.messaging.Constants;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreAITranslate;
import com.p046p1.mobile.putong.data.AiTranslateLanguage;
import com.p046p1.mobile.putong.data.AiTranslateLanguageBean;
import com.p046p1.mobile.putong.data.AiTranslateResultBean;
import com.p046p1.mobile.putong.data.AiTranslateResultData;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.TribeSetting;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.ijk.media.player.IjkMediaMeta;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;
import p149l.ax6;
import p149l.hpd0;
import p149l.ia20;
import p149l.ork;
import p149l.rb20;
import p149l.stc0;
import p149l.uqd0;
import p149l.utc0;
import p149l.v9j;
import p149l.w9j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u00102\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0010¢\u0006\u0004\b\u0015\u0010\u0016J7\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0010H\u0002¢\u0006\u0004\b\u001f\u0010\u0016R\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, m87232d2 = {"Lcom/p1/mobile/putong/core/api/CoreAITranslate;", "Ll/ax6;", "Lcom/p1/mobile/putong/core/api/c;", "core", "<init>", "(Lcom/p1/mobile/putong/core/api/c;)V", "", "p3", "()Z", "", "q3", "()V", "", "o3", "()Ljava/lang/String;", IjkMediaMeta.IJKM_KEY_LANGUAGE, "Lrx/c;", "r3", "(Ljava/lang/String;)Lrx/c;", "", "Lcom/p1/mobile/putong/data/AiTranslateLanguage;", "k3", "()Lrx/c;", "scene", "targetUserId", "", "messageId", "questionId", "Lcom/p1/mobile/putong/data/AiTranslateResultData;", "s3", "(Ljava/lang/String;Ljava/lang/String;JJ)Lrx/c;", "l3", "Ll/uqd0;", "R", "Ll/uqd0;", "translateLanguageList", "Ll/hpd0;", "n3", "()Ll/hpd0;", "guideShown", "b_core_base"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class CoreAITranslate extends ax6 {

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @NotNull
    public uqd0 translateLanguageList;

    public CoreAITranslate(@Nullable C4732c c4732c) {
        super(c4732c);
        this.translateLanguageList = new uqd0("translate_language_list", "");
    }

    /* JADX INFO: renamed from: a3 */
    public static AiTranslateResultData m30016a3(Function1 function1, Object obj) {
        return (AiTranslateResultData) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: c3 */
    public static C22306c m30018c3() {
        return ia20.m135119c(new v9j() { // from class: l.gu6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return CoreAITranslate.m30026m3();
            }
        }, AiTranslateLanguageBean.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: d3 */
    public static List m30019d3(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e3 */
    public static List m30020e3(CoreAITranslate coreAITranslate, AiTranslateLanguageBean aiTranslateLanguageBean) {
        List<AiTranslateLanguage> list = aiTranslateLanguageBean.data.languages;
        list.getClass();
        coreAITranslate.translateLanguageList.put(ork.m165672d(list));
        return list;
    }

    /* JADX INFO: renamed from: f3 */
    public static stc0 m30021f3(JSONObject jSONObject) {
        return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/ai-translate/translate")).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
    }

    /* JADX INFO: renamed from: g3 */
    public static stc0 m30022g3(JSONObject jSONObject) {
        return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/ai-translate/language")).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
    }

    /* JADX INFO: renamed from: h3 */
    public static AiTranslateResultData m30023h3(AiTranslateResultBean aiTranslateResultBean) {
        aiTranslateResultBean.getClass();
        return aiTranslateResultBean.data;
    }

    /* JADX INFO: renamed from: i3 */
    public static Unit m30024i3(CoreAITranslate coreAITranslate, Envelope envelope) {
        coreAITranslate.f72126Q.f19639e0.m169454W9(CoreModule.m29931H().userId());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j3 */
    public static Unit m30025j3(Function1 function1, Object obj) {
        return (Unit) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: m3 */
    public static final stc0 m30026m3() {
        return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/ai-translate/languages")).m185887f().m185883b();
    }

    @NotNull
    /* JADX INFO: renamed from: k3 */
    public final C22306c<List<AiTranslateLanguage>> m30027k3() {
        try {
            List list = (List) ork.m165671c(this.translateLanguageList.get(), new TypeToken<List<? extends AiTranslateLanguage>>() { // from class: com.p1.mobile.putong.core.api.CoreAITranslate$fetchLanguages$languagesCached$1
            }.getType());
            if (list != null && (!list.isEmpty())) {
                m30028l3().subscribe();
                C22306c<List<AiTranslateLanguage>> c22306cJust = C22306c.just(list);
                c22306cJust.getClass();
                return c22306cJust;
            }
        } catch (Exception unused) {
        }
        return m30028l3();
    }

    /* JADX INFO: renamed from: l3 */
    public final C22306c<List<AiTranslateLanguage>> m30028l3() {
        C22306c c22306cScheduled = this.f72126Q.scheduled("ai_translate_languages", 0, new v9j() { // from class: l.au6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return CoreAITranslate.m30018c3();
            }
        });
        final Function1 function1 = new Function1() { // from class: l.bu6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CoreAITranslate.m30020e3(this.f77284a, (AiTranslateLanguageBean) obj);
            }
        };
        C22306c<List<AiTranslateLanguage>> map = c22306cScheduled.map(new w9j() { // from class: l.cu6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreAITranslate.m30019d3(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    /* JADX INFO: renamed from: n3 */
    public final hpd0 m30029n3() {
        return new hpd0("ai_translate_guide_shown_" + CoreModule.m29931H().userId(), Boolean.FALSE);
    }

    @NotNull
    /* JADX INFO: renamed from: o3 */
    public final String m30030o3() {
        Settings settings;
        SettingGroups settingGroup;
        TribeSetting tribeSetting;
        User userM169527p9 = this.f72126Q.f19639e0.m169527p9();
        String str = (userM169527p9 == null || (settings = userM169527p9.settings) == null || (settingGroup = settings.getSettingGroup()) == null || (tribeSetting = settingGroup.tttribe) == null) ? null : tribeSetting.transLang;
        if (str != null && str.length() != 0) {
            return str;
        }
        String strM178557f = rb20.m178557f();
        strM178557f.getClass();
        return strM178557f;
    }

    /* JADX INFO: renamed from: p3 */
    public final boolean m30031p3() {
        Boolean bool = m30029n3().get();
        bool.getClass();
        return bool.booleanValue();
    }

    /* JADX INFO: renamed from: q3 */
    public final void m30032q3() {
        m30029n3().put(Boolean.TRUE);
    }

    @NotNull
    /* JADX INFO: renamed from: r3 */
    public final C22306c<Unit> m30033r3(@NotNull String language) throws JSONException {
        language.getClass();
        final JSONObject jSONObject = new JSONObject();
        jSONObject.put(IjkMediaMeta.IJKM_KEY_LANGUAGE, language);
        C22306c<Envelope> c22306cM135117a = ia20.m135117a(new v9j() { // from class: l.hu6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return CoreAITranslate.m30022g3(jSONObject);
            }
        });
        final Function1 function1 = new Function1() { // from class: l.iu6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CoreAITranslate.m30024i3(this.f114975a, (Envelope) obj);
            }
        };
        C22306c<Unit> c22306cNow = now("ai_translate_set_language", c22306cM135117a.map(new w9j() { // from class: l.ju6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreAITranslate.m30025j3(function1, obj);
            }
        }));
        c22306cNow.getClass();
        return c22306cNow;
    }

    @NotNull
    /* JADX INFO: renamed from: s3 */
    public final C22306c<AiTranslateResultData> m30034s3(@Nullable String scene, @Nullable String targetUserId, long messageId, long questionId) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("scene", scene);
            jSONObject.put("target_language", m30030o3());
            jSONObject.put("target_user_id", targetUserId);
            if (messageId > 0) {
                jSONObject.put(Constants.MessagePayloadKeys.MSGID_SERVER, messageId);
            }
            if (questionId > 0) {
                jSONObject.put("question_id", questionId);
            }
        } catch (Exception unused) {
        }
        C4732c c4732c = this.f72126Q;
        C22306c c22306cM135119c = ia20.m135119c(new v9j() { // from class: l.du6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return CoreAITranslate.m30021f3(jSONObject);
            }
        }, AiTranslateResultBean.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.eu6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CoreAITranslate.m30023h3((AiTranslateResultBean) obj);
            }
        };
        C22306c<AiTranslateResultData> c22306cNow = c4732c.now("ai_translate", c22306cM135119c.map(new w9j() { // from class: l.fu6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreAITranslate.m30016a3(function1, obj);
            }
        }));
        c22306cNow.getClass();
        return c22306cNow;
    }
}
