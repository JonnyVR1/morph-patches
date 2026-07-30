package p153l;

import androidx.annotation.RestrictTo;
import com.vivo.push.PushClientConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, m88121d2 = {"Ll/xum;", "", "<init>", "()V", "", PushClientConstants.TAG_CLASS_NAME, "Ll/wum;", "a", "(Ljava/lang/String;)Ll/wum;", "b", "work-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public abstract class xum {
    @Nullable
    /* JADX INFO: renamed from: a */
    public abstract wum mo127294a(@NotNull String className);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    /* JADX INFO: renamed from: b */
    public final wum m213160b(@NotNull String className) {
        className.getClass();
        wum wumVarMo127294a = mo127294a(className);
        return wumVarMo127294a == null ? yum.m217442a(className) : wumVarMo127294a;
    }
}
