package com.momo.xeengine.svgaplayer;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m88121d2 = {"Lcom/momo/xeengine/svgaplayer/ErrorConstant;", "", "()V", "Companion", "gift_player_release"}, m88122k = 1, m88123mv = {1, 1, 15})
public final class ErrorConstant {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String ERROR_MMSVGA_RES_ASSETS_LOAD = "MMSVGA_assets资源加载错误";

    @NotNull
    private static final String ERROR_MMSVGA_RES_REMOTE_LOAD = "MMSVGA_网络资源加载错误";

    @NotNull
    private static final String ERROR_MMSVGA_RES_LOCAL_LOAD = "MMSVGA_本地资源加载错误";

    @NotNull
    private static final String ERROR_MMSVGA_RES_PARSE = "MMSVGA_数据解析错误";

    @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006¨\u0006\r"}, m88121d2 = {"Lcom/momo/xeengine/svgaplayer/ErrorConstant$Companion;", "", "()V", "ERROR_MMSVGA_RES_ASSETS_LOAD", "", "getERROR_MMSVGA_RES_ASSETS_LOAD", "()Ljava/lang/String;", "ERROR_MMSVGA_RES_LOCAL_LOAD", "getERROR_MMSVGA_RES_LOCAL_LOAD", "ERROR_MMSVGA_RES_PARSE", "getERROR_MMSVGA_RES_PARSE", "ERROR_MMSVGA_RES_REMOTE_LOAD", "getERROR_MMSVGA_RES_REMOTE_LOAD", "gift_player_release"}, m88122k = 1, m88123mv = {1, 1, 15})
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final String getERROR_MMSVGA_RES_ASSETS_LOAD() {
            return ErrorConstant.ERROR_MMSVGA_RES_ASSETS_LOAD;
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
