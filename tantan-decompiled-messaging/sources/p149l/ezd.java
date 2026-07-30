package p149l;

import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\u001a5\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a1\u0010\u0011\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0015\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m87232d2 = {"Ll/w9q0;", "workNameDao", "Ll/qaq0;", "workTagDao", "Ll/bhh0;", "systemIdInfoDao", "", "Ll/haq0;", "workSpecs", "", Constants.INAPP_DATA_TAG, "(Ll/w9q0;Ll/qaq0;Ll/bhh0;Ljava/util/List;)Ljava/lang/String;", "workSpec", AuthenticationTokenClaims.JSON_KEY_NAME, "", "systemId", "tags", "c", "(Ll/haq0;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Ljava/lang/String;", "a", "Ljava/lang/String;", "TAG", "work-runtime_release"}, m87233k = 2, m87234mv = {1, 8, 0}, m87236xi = 48)
@SourceDebugExtension
public final class ezd {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final String f93893a;

    static {
        String strM190978i = txv.m190978i("DiagnosticsWrkr");
        strM190978i.getClass();
        f93893a = strM190978i;
    }

    /* JADX INFO: renamed from: c */
    public static final String m118925c(haq0 haq0Var, String str, Integer num, String str2) {
        return SignParameters.NEW_LINE + haq0Var.id + "\t " + haq0Var.workerClassName + "\t " + num + "\t " + haq0Var.state.name() + "\t " + str + "\t " + str2 + '\t';
    }

    /* JADX INFO: renamed from: d */
    public static final String m118926d(w9q0 w9q0Var, qaq0 qaq0Var, bhh0 bhh0Var, List<haq0> list) {
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        for (haq0 haq0Var : list) {
            ahh0 ahh0VarM101837a = bhh0Var.m101837a(oaq0.m163363a(haq0Var));
            sb.append(m118925c(haq0Var, CollectionsKt.joinToString$default(w9q0Var.mo202341a(haq0Var.id), Constants.SEPARATOR_COMMA, null, null, 0, null, null, 62, null), ahh0VarM101837a != null ? Integer.valueOf(ahh0VarM101837a.systemId) : null, CollectionsKt.joinToString$default(qaq0Var.mo173772c(haq0Var.id), Constants.SEPARATOR_COMMA, null, null, 0, null, null, 62, null)));
        }
        return sb.toString();
    }
}
