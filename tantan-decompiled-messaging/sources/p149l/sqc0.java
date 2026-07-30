package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Objects;
import com.google.mlkit.common.sdkinternal.ModelType;
import com.google.mlkit.common.sdkinternal.model.BaseModel;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public abstract class sqc0 {

    /* JADX INFO: renamed from: d */
    public static final Map f165975d = new EnumMap(BaseModel.class);

    /* JADX INFO: renamed from: e */
    @NonNull
    @VisibleForTesting
    public static final Map f165976e = new EnumMap(BaseModel.class);

    /* JADX INFO: renamed from: a */
    @Nullable
    public final String f165977a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final BaseModel f165978b;

    /* JADX INFO: renamed from: c */
    public final ModelType f165979c;

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sqc0)) {
            return false;
        }
        sqc0 sqc0Var = (sqc0) obj;
        return Objects.equal(this.f165977a, sqc0Var.f165977a) && Objects.equal(this.f165978b, sqc0Var.f165978b) && Objects.equal(this.f165979c, sqc0Var.f165979c);
    }

    public int hashCode() {
        return Objects.hashCode(this.f165977a, this.f165978b, this.f165979c);
    }

    @NonNull
    public String toString() {
        nhy0 nhy0VarM154922a = mjy0.m154922a("RemoteModel");
        nhy0VarM154922a.m159483a("modelName", this.f165977a);
        nhy0VarM154922a.m159483a("baseModel", this.f165978b);
        nhy0VarM154922a.m159483a("modelType", this.f165979c);
        return nhy0VarM154922a.toString();
    }
}
