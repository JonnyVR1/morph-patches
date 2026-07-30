package p153l;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m88121d2 = {"Ll/q95;", "", "Landroid/content/Context;", "context", "", "Ll/o95;", "responses", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "", "isFullResponse", "Lorg/json/JSONObject;", "bodyJson", "", "bodyString", "isUserSwitching", "", "a", "(ZLorg/json/JSONObject;Ljava/lang/String;Z)V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b", "Ljava/util/List;", "getResponses", "()Ljava/util/List;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class q95 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final List<o95> responses;

    /* JADX WARN: Multi-variable type inference failed */
    public q95(@NotNull Context context, @NotNull List<? extends o95> list) {
        context.getClass();
        list.getClass();
        this.context = context;
        this.responses = list;
    }

    /* JADX INFO: renamed from: a */
    public final void m175834a(boolean isFullResponse, @Nullable JSONObject bodyJson, @NotNull String bodyString, boolean isUserSwitching) {
        bodyString.getClass();
        List<o95> list = this.responses;
        if (!isUserSwitching) {
            for (o95 o95Var : list) {
                o95Var.f145495a = isFullResponse;
                o95Var.mo98656a(bodyJson, bodyString, this.context);
            }
            return;
        }
        ArrayList<o95> arrayList = new ArrayList();
        for (Object obj : list) {
            o95 o95Var2 = (o95) obj;
            if (!(o95Var2 instanceof ctm) && !(o95Var2 instanceof v5e) && !(o95Var2 instanceof yhi)) {
                arrayList.add(obj);
            }
        }
        for (o95 o95Var3 : arrayList) {
            o95Var3.f145495a = isFullResponse;
            if (o95Var3 instanceof esm) {
                ((esm) o95Var3).m122386e(bodyJson, bodyString, this.context, true);
            } else {
                o95Var3.mo98656a(bodyJson, bodyString, this.context);
            }
        }
    }
}
