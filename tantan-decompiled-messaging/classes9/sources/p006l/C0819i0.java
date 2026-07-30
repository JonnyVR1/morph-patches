package p006l;

import com.google.android.gms.tasks.Task;
import com.google.mlkit.nl.languageid.IdentifiedLanguage;
import com.google.mlkit.nl.languageid.LanguageIdentifier;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.AiTranslateResultData;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l.c500;
import l.ng50;
import l.x6r;
import l.yd50;
import org.jetbrains.annotations.NotNull;
import rx.c;

/* JADX INFO: renamed from: l.i0 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0019B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J5\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\b2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Ll/i0;", "", "<init>", "()V", "", "e", "()Ljava/lang/String;", "language", "Lrx/c;", "", "f", "(Ljava/lang/String;)Lrx/c;", "text", "Ll/i0$a;", "callback", "d", "(Ljava/lang/String;Ll/i0$a;)V", "scene", "targetUserId", "", "messageId", "questionId", "Lcom/p1/mobile/putong/data/AiTranslateResultData;", "g", "(Ljava/lang/String;Ljava/lang/String;JJ)Lrx/c;", "a", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class C0819i0 {

    @NotNull
    public static final C0819i0 INSTANCE = new C0819i0();

    /* JADX INFO: renamed from: l.i0$a */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Ll/i0$a;", "", "", "sourceText", "", "shouldTranslate", "", "a", "(Ljava/lang/String;Z)V", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        /* JADX INFO: renamed from: a */
        void m16412a(@NotNull String sourceText, boolean shouldTranslate);
    }

    /* JADX INFO: renamed from: a */
    public static void m16405a(a aVar, String str, Exception exc) {
        exc.getClass();
        aVar.m16412a(str, false);
    }

    /* JADX INFO: renamed from: b */
    public static Unit m16406b(a aVar, String str, List list) {
        Object next;
        String strM16409e = m16409e();
        list.getClass();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            IdentifiedLanguage identifiedLanguage = (IdentifiedLanguage) next;
            if (!Intrinsics.d(identifiedLanguage.b(), "und") && !Intrinsics.d(identifiedLanguage.b(), strM16409e) && identifiedLanguage.a() > 0.1f) {
                break;
            }
        }
        aVar.m16412a(str, ((IdentifiedLanguage) next) != null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public static void m16407c(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m16408d(@NotNull final String text, @NotNull final a callback) {
        text.getClass();
        callback.getClass();
        if (text.length() == 0) {
            callback.m16412a(text, false);
            return;
        }
        try {
            c500.d(CoreModule.f1533b);
            LanguageIdentifier languageIdentifierA = x6r.a();
            languageIdentifierA.getClass();
            Task taskIdentifyPossibleLanguages = languageIdentifierA.identifyPossibleLanguages(text);
            final Function1 function1 = new Function1() { // from class: l.f0
                public final Object invoke(Object obj) {
                    return C0819i0.m16406b(callback, text, (List) obj);
                }
            };
            taskIdentifyPossibleLanguages.f(new ng50() { // from class: l.g0
                public final void onSuccess(Object obj) {
                    C0819i0.m16407c(function1, obj);
                }
            }).d(new yd50() { // from class: l.h0
                public final void onFailure(Exception exc) {
                    C0819i0.m16405a(callback, text, exc);
                }
            });
        } catch (Exception unused) {
            callback.m16412a(text, false);
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final String m16409e() {
        return CoreModule.f1534c.f3673t0.m1958o3();
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: f */
    public static final c<Unit> m16410f(@NotNull String language) {
        language.getClass();
        return CoreModule.f1534c.f3673t0.m1961r3(language);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: g */
    public static final c<AiTranslateResultData> m16411g(@NotNull String scene, @NotNull String targetUserId, long messageId, long questionId) {
        scene.getClass();
        targetUserId.getClass();
        return CoreModule.f1534c.f3673t0.m1962s3(scene, targetUserId, messageId, questionId);
    }
}
