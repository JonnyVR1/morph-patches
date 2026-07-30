package p153l;

import com.clevertap.android.sdk.inapp.data.CtCacheType;
import com.facebook.AuthenticationTokenClaims;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J¼\u0001\u0010\u0011\u001a\u00020\r2\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00022/\b\u0002\u0010\u000e\u001a)\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\b¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u00072/\b\u0002\u0010\u000f\u001a)\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\r0\u00072/\b\u0002\u0010\u0010\u001a)\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\r0\u0007H&¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m88121d2 = {"Ll/nji;", "", "", "Lkotlin/Pair;", "", "Lcom/clevertap/android/sdk/inapp/data/CtCacheType;", "urlMeta", "Lkotlin/Function1;", "", "", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "urlStatusMap", "", "completionCallback", "successBlock", "failureBlock", "a", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public interface nji {

    /* JADX INFO: renamed from: l.nji$a */
    @Metadata(m88122k = 3, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class C18883a {
        /* JADX INFO: renamed from: a */
        public static Unit m163421a(Pair pair) {
            pair.getClass();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: b */
        public static Unit m163422b(Pair pair) {
            pair.getClass();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: c */
        public static Unit m163423c(Pair pair) {
            pair.getClass();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: d */
        public static Unit m163424d(Map map) {
            map.getClass();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: e */
        public static Unit m163425e(Pair pair) {
            pair.getClass();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: f */
        public static void m163426f(@NotNull nji njiVar, @NotNull List<? extends Pair<String, ? extends CtCacheType>> list) {
            list.getClass();
            njiVar.mo163420a(list, new Function1() { // from class: l.iji
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return nji.C18883a.m163424d((Map) obj);
                }
            }, new Function1() { // from class: l.jji
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return nji.C18883a.m163421a((Pair) obj);
                }
            }, new Function1() { // from class: l.kji
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return nji.C18883a.m163422b((Pair) obj);
                }
            });
        }

        /* JADX INFO: renamed from: g */
        public static void m163427g(@NotNull nji njiVar, @NotNull List<? extends Pair<String, ? extends CtCacheType>> list, @NotNull Function1<? super Map<String, Boolean>, Unit> function1) {
            list.getClass();
            function1.getClass();
            njiVar.mo163420a(list, function1, new Function1() { // from class: l.lji
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return nji.C18883a.m163423c((Pair) obj);
                }
            }, new Function1() { // from class: l.mji
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return nji.C18883a.m163425e((Pair) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: a */
    void mo163420a(@NotNull List<? extends Pair<String, ? extends CtCacheType>> urlMeta, @NotNull Function1<? super Map<String, Boolean>, Unit> completionCallback, @NotNull Function1<? super Pair<String, ? extends CtCacheType>, Unit> successBlock, @NotNull Function1<? super Pair<String, ? extends CtCacheType>, Unit> failureBlock);
}
