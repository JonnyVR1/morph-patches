package com.immomo.svgaplayer;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87230bv = {1, 0, 2}, m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m87232d2 = {"Lcom/immomo/svgaplayer/ErrorConstant;", "", "()V", "Companion", "svgalibrary_release"}, m87233k = 1, m87234mv = {1, 1, 10})
public final class ErrorConstant {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String ERROR_MMSVGA_JSON = "MMSVGA_json解析错误";

    @NotNull
    private static final String ERROR_MMSVGA_RESURL = "MMSVGA_资源地址错误";

    @NotNull
    private static final String ERROR_MMSVGA_RES_ASSETS_LOAD = "MMSVGA_assets资源加载错误";

    @NotNull
    private static final String ERROR_MMSVGA_RES_REMOTE_LOAD = "MMSVGA_网络资源加载错误";

    @NotNull
    private static final String ERROR_MMSVGA_RES_LOCAL_LOAD = "MMSVGA_本地资源加载错误";

    @NotNull
    private static final String ERROR_MMSVGA_RES_PARSE = "MMSVGA_数据解析错误";

    @NotNull
    private static final String ERROR_MMSVGA_RES_FUN = "MMSVGA_反射调用错误";

    @Metadata(m87230bv = {1, 0, 2}, m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006¨\u0006\u0013"}, m87232d2 = {"Lcom/immomo/svgaplayer/ErrorConstant$Companion;", "", "()V", "ERROR_MMSVGA_JSON", "", "getERROR_MMSVGA_JSON", "()Ljava/lang/String;", "ERROR_MMSVGA_RESURL", "getERROR_MMSVGA_RESURL", "ERROR_MMSVGA_RES_ASSETS_LOAD", "getERROR_MMSVGA_RES_ASSETS_LOAD", "ERROR_MMSVGA_RES_FUN", "getERROR_MMSVGA_RES_FUN", "ERROR_MMSVGA_RES_LOCAL_LOAD", "getERROR_MMSVGA_RES_LOCAL_LOAD", "ERROR_MMSVGA_RES_PARSE", "getERROR_MMSVGA_RES_PARSE", "ERROR_MMSVGA_RES_REMOTE_LOAD", "getERROR_MMSVGA_RES_REMOTE_LOAD", "svgalibrary_release"}, m87233k = 1, m87234mv = {1, 1, 10})
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final String getERROR_MMSVGA_JSON() {
            return ErrorConstant.ERROR_MMSVGA_JSON;
        }

        @NotNull
        public final String getERROR_MMSVGA_RESURL() {
            return ErrorConstant.ERROR_MMSVGA_RESURL;
        }

        @NotNull
        public final String getERROR_MMSVGA_RES_ASSETS_LOAD() {
            return ErrorConstant.ERROR_MMSVGA_RES_ASSETS_LOAD;
        }

        @NotNull
        public final String getERROR_MMSVGA_RES_FUN() {
            return ErrorConstant.ERROR_MMSVGA_RES_FUN;
        }

        @NotNull
        public final String getERROR_MMSVGA_RES_LOCAL_LOAD() {
            return ErrorConstant.ERROR_MMSVGA_RES_LOCAL_LOAD;
        }

        @NotNull
        public final String getERROR_MMSVGA_RES_PARSE() {
            return ErrorConstant.ERROR_MMSVGA_RES_PARSE;
        }

        @NotNull
        public final String getERROR_MMSVGA_RES_REMOTE_LOAD() {
            return ErrorConstant.ERROR_MMSVGA_RES_REMOTE_LOAD;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
