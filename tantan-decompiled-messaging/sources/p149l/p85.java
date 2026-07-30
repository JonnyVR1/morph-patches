package p149l;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m87232d2 = {"Ll/p85;", "", "Landroid/content/Context;", "context", "", "Ll/n85;", "responses", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "", "isFullResponse", "Lorg/json/JSONObject;", "bodyJson", "", "bodyString", "isUserSwitching", "", "a", "(ZLorg/json/JSONObject;Ljava/lang/String;Z)V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b", "Ljava/util/List;", "getResponses", "()Ljava/util/List;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class p85 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final List<n85> responses;

    /* JADX WARN: Multi-variable type inference failed */
    public p85(@NotNull Context context, @NotNull List<? extends n85> list) {
        context.getClass();
        list.getClass();
        this.context = context;
        this.responses = list;
    }

    /* JADX INFO: renamed from: a */
    public final void m167790a(boolean isFullResponse, @Nullable JSONObject bodyJson, @NotNull String bodyString, boolean isUserSwitching) {
        bodyString.getClass();
        List<n85> list = this.responses;
        if (!isUserSwitching) {
            for (n85 n85Var : list) {
                n85Var.f137582a = isFullResponse;
                n85Var.mo98525a(bodyJson, bodyString, this.context);
            }
            return;
        }
        ArrayList<n85> arrayList = new ArrayList();
        for (Object obj : list) {
            n85 n85Var2 = (n85) obj;
            if (!(n85Var2 instanceof arm) && !(n85Var2 instanceof h4e) && !(n85Var2 instanceof cfi)) {
                arrayList.add(obj);
            }
        }
        for (n85 n85Var3 : arrayList) {
            n85Var3.f137582a = isFullResponse;
            if (n85Var3 instanceof cqm) {
                ((cqm) n85Var3).m108284e(bodyJson, bodyString, this.context, true);
            } else {
                n85Var3.mo98525a(bodyJson, bodyString, this.context);
            }
        }
    }
}
