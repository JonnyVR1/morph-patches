package p153l;

import androidx.annotation.RestrictTo;
import androidx.work.Data;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, m88121d2 = {"Ll/djq0;", "", "", "workSpecId", "Landroidx/work/Data;", "progress", "<init>", "(Ljava/lang/String;Landroidx/work/Data;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Landroidx/work/Data;", "()Landroidx/work/Data;", "work-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class djq0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String workSpecId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Data progress;

    public djq0(@NotNull String str, @NotNull Data data) {
        str.getClass();
        data.getClass();
        this.workSpecId = str;
        this.progress = data;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Data getProgress() {
        return this.progress;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getWorkSpecId() {
        return this.workSpecId;
    }
}
