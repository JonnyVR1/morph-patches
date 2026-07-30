package p153l;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J7\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"Ll/pyj0;", "", "Ljava/io/File;", "source", FirebaseAnalytics.Param.DESTINATION, "Lkotlin/Function1;", "", "", "onError", "", "a", "(Ljava/io/File;Ljava/io/File;Lkotlin/jvm/functions/Function1;)Z", "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public interface pyj0 {
    /* JADX INFO: renamed from: a */
    boolean mo130068a(@NotNull File source, @NotNull File destination, @NotNull Function1<? super Throwable, Unit> onError);
}
