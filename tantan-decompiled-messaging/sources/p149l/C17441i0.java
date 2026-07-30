package p149l;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.p033nl.languageid.IdentifiedLanguage;
import com.google.mlkit.p033nl.languageid.LanguageIdentifier;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.AiTranslateResultData;
import com.tantanapp.ijk.media.player.IjkMediaMeta;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;

/* JADX INFO: renamed from: l.i0 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0019B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J5\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\b2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m87232d2 = {"Ll/i0;", "", "<init>", "()V", "", "e", "()Ljava/lang/String;", IjkMediaMeta.IJKM_KEY_LANGUAGE, "Lrx/c;", "", "f", "(Ljava/lang/String;)Lrx/c;", "text", "Ll/i0$a;", "callback", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;Ll/i0$a;)V", "scene", "targetUserId", "", "messageId", "questionId", "Lcom/p1/mobile/putong/data/AiTranslateResultData;", "g", "(Ljava/lang/String;Ljava/lang/String;JJ)Lrx/c;", "a", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class C17441i0 {

    @NotNull
    public static final C17441i0 INSTANCE = new C17441i0();

    /* JADX INFO: renamed from: l.i0$a */
    @Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, m87232d2 = {"Ll/i0$a;", "", "", "sourceText", "", "shouldTranslate", "", "a", "(Ljava/lang/String;Z)V", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo133733a(@NotNull String sourceText, boolean shouldTranslate);
    }

    /* JADX INFO: renamed from: a */
    public static void m133726a(a aVar, String str, Exception exc) {
        exc.getClass();
        aVar.mo133733a(str, false);
    }

    /* JADX INFO: renamed from: b */
    public static Unit m133727b(a aVar, String str, List list) {
        Object next;
        String strM133730e = m133730e();
        list.getClass();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            IdentifiedLanguage identifiedLanguage = (IdentifiedLanguage) next;
            if (!Intrinsics.m87488d(identifiedLanguage.m16880b(), LanguageIdentifier.UNDETERMINED_LANGUAGE_TAG) && !Intrinsics.m87488d(identifiedLanguage.m16880b(), strM133730e) && identifiedLanguage.m16879a() > 0.1f) {
                break;
            }
        }
        aVar.mo133733a(str, ((IdentifiedLanguage) next) != null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public static void m133728c(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m133729d(@NotNull final String text, @NotNull final a callback) {
        text.getClass();
        callback.getClass();
        if (text.length() == 0) {
            callback.mo133733a(text, false);
            return;
        }
        try {
            c500.m105246d(CoreModule.f17544b);
            LanguageIdentifier languageIdentifierM207194a = x6r.m207194a();
            languageIdentifierM207194a.getClass();
            Task<List<IdentifiedLanguage>> taskIdentifyPossibleLanguages = languageIdentifierM207194a.identifyPossibleLanguages(text);
            final Function1 function1 = new Function1() { // from class: l.f0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C17441i0.m133727b(callback, text, (List) obj);
                }
            };
            taskIdentifyPossibleLanguages.mo15367f(new ng50() { // from class: l.g0
                @Override // p149l.ng50
                public final void onSuccess(Object obj) {
                    C17441i0.m133728c(function1, obj);
                }
            }).mo15365d(new yd50() { // from class: l.h0
                @Override // p149l.yd50
                public final void onFailure(Exception exc) {
                    C17441i0.m133726a(callback, text, exc);
                }
            });
        } catch (Exception unused) {
            callback.mo133733a(text, false);
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final String m133730e() {
        return CoreModule.f17545c.f19684t0.m30030o3();
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: f */
    public static final C22306c<Unit> m133731f(@NotNull String language) {
        language.getClass();
        return CoreModule.f17545c.f19684t0.m30033r3(language);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: g */
    public static final C22306c<AiTranslateResultData> m133732g(@NotNull String scene, @NotNull String targetUserId, long messageId, long questionId) {
        scene.getClass();
        targetUserId.getClass();
        return CoreModule.f17545c.f19684t0.m30034s3(scene, targetUserId, messageId, questionId);
    }
}
