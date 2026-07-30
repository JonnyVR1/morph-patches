package com.appsflyer.internal;

import android.graphics.Color;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.widget.ExpandableListView;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, m88121d2 = {"Lcom/appsflyer/internal/AFb1sSDK;", "", "Lcom/appsflyer/internal/AFa1mSDK;", "values", "<init>", "(Lcom/appsflyer/internal/AFa1mSDK;)V", "", "afInfoLog", "()V", "getMediationNetwork", "Lcom/appsflyer/internal/AFa1mSDK;", "AFAdRevenueData"}, m88122k = 1, m88123mv = {1, 6, 0}, m88125xi = 48)
public final class AFb1sSDK {

    /* JADX INFO: renamed from: getMediationNetwork, reason: from kotlin metadata */
    @NotNull
    private final AFa1mSDK AFAdRevenueData;

    public AFb1sSDK(@NotNull AFa1mSDK aFa1mSDK) {
        aFa1mSDK.getClass();
        this.AFAdRevenueData = aFa1mSDK;
    }

    public final void afInfoLog() throws Throwable {
        try {
            Map map = AFc1gSDK.registerClient;
            Object declaredConstructor = map.get(579502251);
            if (declaredConstructor == null) {
                declaredConstructor = ((Class) AFc1gSDK.getCurrencyIso4217Code(Color.red(0) + 86, ExpandableListView.getPackedPositionType(0L) + 37, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)))).getDeclaredConstructor(null);
                map.put(579502251, declaredConstructor);
            }
            Object objNewInstance = ((Constructor) declaredConstructor).newInstance(null);
            Object[] objArr = {this.AFAdRevenueData};
            Object method = map.get(1221232697);
            if (method == null) {
                method = ((Class) AFc1gSDK.getCurrencyIso4217Code(86 - TextUtils.indexOf("", "", 0, 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 37, (char) View.resolveSize(0, 0))).getMethod("getRevenue", AFa1mSDK.class);
                map.put(1221232697, method);
            }
            ((Method) method).invoke(objNewInstance, objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
