package p153l;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0005\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u000e"}, m88121d2 = {"Ll/dkw;", "", "<init>", "()V", "", "a", "Ljava/lang/String;", "getOriginPath", "()Ljava/lang/String;", "c", "(Ljava/lang/String;)V", "originPath", "b", "mkFilePath", "MKCore_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class dkw {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private String originPath;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private String mkFilePath;

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getMkFilePath() {
        return this.mkFilePath;
    }

    /* JADX INFO: renamed from: b */
    public final void m116689b(@Nullable String str) {
        this.mkFilePath = str;
    }

    /* JADX INFO: renamed from: c */
    public final void m116690c(@Nullable String str) {
        this.originPath = str;
    }
}
