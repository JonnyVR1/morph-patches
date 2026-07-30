package com.appsflyer.internal;

import android.content.Context;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007"}, m87232d2 = {"Lcom/appsflyer/internal/AFb1zSDK;", "", "Landroid/content/Context;", "p0", "", "", "getMonetizationNetwork", "(Landroid/content/Context;)Ljava/util/Map;", "AFa1uSDK"}, m87233k = 1, m87234mv = {1, 6, 0}, m87236xi = 48)
public interface AFb1zSDK {

    /* JADX INFO: renamed from: AFa1uSDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.getMediationNetwork;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFb1zSDK$AFa1uSDK, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion getMediationNetwork = new Companion();

        private Companion() {
        }
    }

    @NotNull
    Map<String, String> getMonetizationNetwork(@NotNull Context p0);
}
