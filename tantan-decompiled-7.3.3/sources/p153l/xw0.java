package p153l;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00060\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011¨\u0006\u0013"}, m88121d2 = {"Ll/xw0;", "Ll/ut2;", "<init>", "()V", "", "c", "Lkotlin/Function0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "b", "(Lkotlin/jvm/functions/Function0;)V", "Lorg/json/JSONArray;", "batch", "", "success", "a", "(Lorg/json/JSONArray;Z)V", "", "Ljava/util/List;", "listeners", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class xw0 implements ut2 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final List<Function0<Unit>> listeners = new ArrayList();

    /* JADX INFO: renamed from: c */
    private final void m213283c() {
        Iterator<T> it = this.listeners.iterator();
        while (it.hasNext()) {
            ((Function0) it.next()).invoke();
        }
    }

    @Override // p153l.ut2
    /* JADX INFO: renamed from: a */
    public void mo100022a(@NotNull JSONArray batch, boolean success) {
        batch.getClass();
        int length = batch.length();
        for (int i = 0; i < length; i++) {
            if (Intrinsics.m88377d(batch.getJSONObject(i).optString(Constants.KEY_EVT_NAME), Constants.APP_LAUNCHED_EVENT) && success) {
                m213283c();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m213284b(@NotNull Function0<Unit> listener) {
        listener.getClass();
        this.listeners.add(listener);
    }
}
