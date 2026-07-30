package p153l;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.p034nl.languageid.IdentifiedLanguage;
import com.google.mlkit.p034nl.languageid.LanguageIdentifier;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.AiTranslateResultData;
import com.tantanapp.ijk.media.player.IjkMediaMeta;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;

/* JADX INFO: renamed from: l.i0 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0019B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J5\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\b2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m88121d2 = {"Ll/i0;", "", "<init>", "()V", "", "e", "()Ljava/lang/String;", IjkMediaMeta.IJKM_KEY_LANGUAGE, "Lrx/c;", "", "f", "(Ljava/lang/String;)Lrx/c;", "text", "Ll/i0$a;", "callback", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;Ll/i0$a;)V", "scene", "targetUserId", "", "messageId", "questionId", "Lcom/p1/mobile/putong/data/AiTranslateResultData;", "g", "(Ljava/lang/String;Ljava/lang/String;JJ)Lrx/c;", "a", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class C17607i0 {

    @NotNull
    public static final C17607i0 INSTANCE = new C17607i0();

    /* JADX INFO: renamed from: l.i0$a */
    @Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, m88121d2 = {"Ll/i0$a;", "", "", "sourceText", "", "shouldTranslate", "", "a", "(Ljava/lang/String;Z)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo137954a(@NotNull String sourceText, boolean shouldTranslate);
    }

    /* JADX INFO: renamed from: a */
    public static void m137947a(a aVar, String str, Exception exc) {
        exc.getClass();
        aVar.mo137954a(str, false);
    }

    /* JADX INFO: renamed from: b */
    public static Unit m137948b(a aVar, String str, List list) {
        Object next;
        String strM137951e = m137951e();
        list.getClass();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            IdentifiedLanguage identifiedLanguage = (IdentifiedLanguage) next;
            if (!Intrinsics.m88377d(identifiedLanguage.m16935b(), LanguageIdentifier.UNDETERMINED_LANGUAGE_TAG) && !Intrinsics.m88377d(identifiedLanguage.m16935b(), strM137951e) && identifiedLanguage.m16934a() > 0.1f) {
                break;
            }
        }
        aVar.mo137954a(str, ((IdentifiedLanguage) next) != null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public static void m137949c(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m137950d(@NotNull final String text, @NotNull final a callback) {
        text.getClass();
        callback.getClass();
        if (text.length() == 0) {
            callback.mo137954a(text, false);
            return;
        }
        try {
            rd00.m180829d(CoreModule.f18263b);
            LanguageIdentifier languageIdentifierM214774a = y8r.m214774a();
            languageIdentifierM214774a.getClass();
            Task<List<IdentifiedLanguage>> taskIdentifyPossibleLanguages = languageIdentifierM214774a.identifyPossibleLanguages(text);
            final Function1 function1 = new Function1() { // from class: l.f0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C17607i0.m137948b(callback, text, (List) obj);
                }
            };
            taskIdentifyPossibleLanguages.mo15421f(new to50() { // from class: l.g0
                @Override // p153l.to50
                public final void onSuccess(Object obj) {
                    C17607i0.m137949c(function1, obj);
                }
            }).mo15419d(new fm50() { // from class: l.h0
                @Override // p153l.fm50
                public final void onFailure(Exception exc) {
                    C17607i0.m137947a(callback, text, exc);
                }
            });
        } catch (Exception unused) {
            callback.mo137954a(text, false);
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final String m137951e() {
        return CoreModule.f18264c.f20426t0.m31028o3();
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: f */
    public static final C22421c<Unit> m137952f(@NotNull String language) {
        language.getClass();
        return CoreModule.f18264c.f20426t0.m31031r3(language);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: g */
    public static final C22421c<AiTranslateResultData> m137953g(@NotNull String scene, @NotNull String targetUserId, long messageId, long questionId) {
        scene.getClass();
        targetUserId.getClass();
        return CoreModule.f18264c.f20426t0.m31032s3(scene, targetUserId, messageId, questionId);
    }
}
