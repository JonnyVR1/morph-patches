package p153l;

import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\u001a5\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a1\u0010\u0011\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0015\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m88121d2 = {"Ll/bjq0;", "workNameDao", "Ll/vjq0;", "workTagDao", "Ll/iph0;", "systemIdInfoDao", "", "Ll/mjq0;", "workSpecs", "", Constants.INAPP_DATA_TAG, "(Ll/bjq0;Ll/vjq0;Ll/iph0;Ljava/util/List;)Ljava/lang/String;", "workSpec", AuthenticationTokenClaims.JSON_KEY_NAME, "", "systemId", "tags", "c", "(Ll/mjq0;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Ljava/lang/String;", "a", "Ljava/lang/String;", "TAG", "work-runtime_release"}, m88122k = 2, m88123mv = {1, 8, 0}, m88125xi = 48)
@SourceDebugExtension
public final class s0e {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final String f165677a;

    static {
        String strM178831i = qzv.m178831i("DiagnosticsWrkr");
        strM178831i.getClass();
        f165677a = strM178831i;
    }

    /* JADX INFO: renamed from: c */
    public static final String m183920c(mjq0 mjq0Var, String str, Integer num, String str2) {
        return SignParameters.NEW_LINE + mjq0Var.id + "\t " + mjq0Var.workerClassName + "\t " + num + "\t " + mjq0Var.state.name() + "\t " + str + "\t " + str2 + '\t';
    }

    /* JADX INFO: renamed from: d */
    public static final String m183921d(bjq0 bjq0Var, vjq0 vjq0Var, iph0 iph0Var, List<mjq0> list) {
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        for (mjq0 mjq0Var : list) {
            hph0 hph0VarM141463a = iph0Var.m141463a(tjq0.m191450a(mjq0Var));
            sb.append(m183920c(mjq0Var, CollectionsKt.joinToString$default(bjq0Var.mo104641a(mjq0Var.id), Constants.SEPARATOR_COMMA, null, null, 0, null, null, 62, null), hph0VarM141463a != null ? Integer.valueOf(hph0VarM141463a.systemId) : null, CollectionsKt.joinToString$default(vjq0Var.mo201549c(mjq0Var.id), Constants.SEPARATOR_COMMA, null, null, 0, null, null, 62, null)));
        }
        return sb.toString();
    }
}
