package p153l;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\f"}, m88121d2 = {"Ll/vkm;", "", "", "transcodeStatus", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "a", "I", "()I", "imagepipeline-base_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class vkm {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int transcodeStatus;

    public vkm(int i) {
        this.transcodeStatus = i;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getTranscodeStatus() {
        return this.transcodeStatus;
    }

    @NotNull
    public String toString() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(null, "Status: %d", Arrays.copyOf(new Object[]{Integer.valueOf(this.transcodeStatus)}, 1));
    }
}
