package p153l;

import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0013\b\u0007\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m88121d2 = {"Ll/oym;", "Ll/zpf0;", "", "", "format", "<init>", "(Ljava/lang/String;)V", "Companion", "a", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class oym extends zpf0<Integer> {
    public /* synthetic */ oym(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "%02d" : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public oym(@NotNull String str) {
        super(str);
        str.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public oym() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
