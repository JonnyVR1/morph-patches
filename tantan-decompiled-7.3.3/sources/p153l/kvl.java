package p153l;

import java.io.InputStream;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u0004\u0018\u00010\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00002\u0006\u0010\r\u001a\u00020\u0006H&¢\u0006\u0004\b\u000e\u0010\t¨\u0006\u000f"}, m88121d2 = {"Ll/kvl;", "", "Ljava/io/InputStream;", "bodyStream", "a", "(Ljava/io/InputStream;)Ll/kvl;", "", "contentType", "setContentType", "(Ljava/lang/String;)Ll/kvl;", "Ll/jvl;", "build", "()Ll/jvl;", "bodyString", "b", "MKCore_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public interface kvl {
    @Nullable
    /* JADX INFO: renamed from: a */
    kvl mo111520a(@Nullable InputStream bodyStream);

    @Nullable
    /* JADX INFO: renamed from: b */
    kvl mo111521b(@NotNull String bodyString);

    @Nullable
    jvl build();

    @Nullable
    kvl setContentType(@Nullable String contentType);
}
