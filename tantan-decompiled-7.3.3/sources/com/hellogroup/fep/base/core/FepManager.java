package com.hellogroup.fep.base.core;

import android.content.Context;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.hellogroup.fep.base.FepLogLevel;
import com.hellogroup.fep.base.FepLogModuleType;
import com.hellogroup.fep.config.core.FepConfigManager;
import com.hellogroup.fep.config.model.FepConfigFetchType;
import com.hellogroup.fep.feppkg.core.FepPackageConfiguration;
import com.hellogroup.fep.feppkg.core.FepPackageManager;
import com.hellogroup.fep.feppkg.internal.core.CheckPolicy;
import com.hellogroup.fep.feppkg.internal.core.FepPackageContext;
import com.hellogroup.fep.feppkg.model.FepPackageStatus;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.sina.weibo.sdk.constant.WBConstants;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.a6k0;
import p153l.bgi;
import p153l.ehi;
import p153l.fgi;
import p153l.hgi;
import p153l.igi;
import p153l.lv0;
import p153l.qhi;
import p153l.rgi;
import p153l.tc60;
import p153l.tgi;
import p153l.tl5;
import p153l.xfi;
import p153l.zgi;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 O2\u00020\u0001:\u0004LPQRB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0012\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\f2\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0018\u001a\u00020\u000f2\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010\u001f\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001f\u0010 J;\u0010\"\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001e\u001a\u00020\u000f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\"\u0010#J-\u0010%\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001e\u001a\u00020\u000f2\b\u0010$\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b%\u0010&J!\u0010(\u001a\u00020'2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b(\u0010)J)\u0010-\u001a\u00020\f2\u001a\u0010,\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00010+0*¢\u0006\u0004\b-\u0010.J+\u00101\u001a\u0004\u0018\u0001002\b\u0010\u001e\u001a\u0004\u0018\u00010\u000f2\b\u0010!\u001a\u0004\u0018\u00010\u000f2\u0006\u0010/\u001a\u00020\u000f¢\u0006\u0004\b1\u00102J#\u00103\u001a\u0004\u0018\u0001002\b\u0010\u001e\u001a\u0004\u0018\u00010\u000f2\b\u0010!\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b3\u00104J;\u00108\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u000f2\b\u0010!\u001a\u0004\u0018\u00010\u000f2\u0006\u00106\u001a\u00020\u000f2\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020\u00062\b\u0010:\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b;\u0010<J!\u0010=\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u000f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020\f2\b\u0010?\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b@\u0010AJ\r\u0010B\u001a\u00020\f¢\u0006\u0004\bB\u0010\u0003J\u0015\u0010E\u001a\u00020\f2\u0006\u0010D\u001a\u00020C¢\u0006\u0004\bE\u0010FJ\u0015\u0010H\u001a\u00020\f2\u0006\u0010D\u001a\u00020G¢\u0006\u0004\bH\u0010IJ\u0015\u0010J\u001a\u00020\f2\u0006\u0010D\u001a\u00020G¢\u0006\u0004\bJ\u0010IR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020C0K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010M¨\u0006S"}, m88121d2 = {"Lcom/hellogroup/fep/base/core/FepManager;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "debugMode", "Ll/fgi;", "configuration", "Ll/qhi;", "providers", "", BaseSei.f14625Y, "(Landroid/content/Context;ZLl/fgi;Ll/qhi;)V", "", Constants.KEY_KEY, "defaultValue", "j", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "Lcom/hellogroup/fep/config/model/FepConfigFetchType;", "type", "f", "(Lcom/hellogroup/fep/config/model/FepConfigFetchType;)V", "url", "Lcom/hellogroup/fep/feppkg/internal/core/CheckPolicy;", "checkPolicy", "Ll/zgi;", BLiveStormDanmakuGiftResourceType.f45292l, "(Ljava/lang/String;Lcom/hellogroup/fep/feppkg/internal/core/CheckPolicy;)Ll/zgi;", "bid", "p", "(Ljava/lang/String;Ljava/lang/String;Lcom/hellogroup/fep/feppkg/internal/core/CheckPolicy;)Ll/zgi;", "baseVersion", "n", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/hellogroup/fep/feppkg/internal/core/CheckPolicy;)Ll/zgi;", "baseVer", "h", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/zgi;", "", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/String;Ljava/lang/String;)J", "", "", "packageConfs", BLiveStormDanmakuGiftResourceType.f45294s, "(Ljava/util/List;)V", "customVer", "Ljava/io/File;", "g", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;", "q", "(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;", "zipPath", WBConstants.AUTH_PARAMS_VERSION, RequestParameters.PREFIX, "r", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z", "offlineInfo", Constants.INAPP_DATA_TAG, "(Ll/zgi;)Z", "w", "(Ljava/lang/String;Ljava/lang/String;)V", "packageInfo", Constants.KEY_T, "(Ll/zgi;)V", "e", "Ll/rgi;", "observer", "u", "(Ll/rgi;)V", "Ll/ehi;", ResourceDirection.f39656v, "(Ll/ehi;)V", BaseSei.f14624X, "Ll/tl5;", "a", "Ll/tl5;", "observerManager", "Companion", "InternalFepConfigObserver", "InternalFepGreyObserver", "InternalFepPackageObserver", "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class FepManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b */
    private static volatile FepManager f11905b;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final tl5<rgi> observerManager;

    @Metadata(m88120d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJQ\u0010\u001a\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u00132\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, m88121d2 = {"Lcom/hellogroup/fep/base/core/FepManager$InternalFepConfigObserver;", "Ll/bgi;", "<init>", "(Lcom/hellogroup/fep/base/core/FepManager;)V", "Lcom/hellogroup/fep/config/core/FepConfigManager;", "manager", "", "isLocalData", "Lcom/hellogroup/fep/config/model/FepConfigFetchType;", "type", "", "b", "(Lcom/hellogroup/fep/config/core/FepConfigManager;ZLcom/hellogroup/fep/config/model/FepConfigFetchType;)V", "Lcom/hellogroup/fep/base/FepLogModuleType;", "moduleType", "Lcom/hellogroup/fep/base/FepLogLevel;", FirebaseAnalytics.Param.LEVEL, "", "message", "", "", "extraInfo", "", "errorCode", "", "throwable", "c", "(Lcom/hellogroup/fep/base/FepLogModuleType;Lcom/hellogroup/fep/base/FepLogLevel;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Throwable;)V", "configType", Constants.KEY_KEY, "value", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public final class InternalFepConfigObserver implements bgi {
        public InternalFepConfigObserver() {
        }

        @Override // p153l.bgi
        /* JADX INFO: renamed from: a */
        public void mo17603a(@NotNull final String configType, @NotNull final String key, @Nullable final Object value) {
            configType.getClass();
            key.getClass();
            FepManager.this.observerManager.m191606b(new Function1<rgi, Unit>() { // from class: com.hellogroup.fep.base.core.FepManager$InternalFepConfigObserver$fepConfigTrackUsage$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull rgi rgiVar) {
                    rgiVar.getClass();
                    rgiVar.mo17603a(configType, key, value);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(rgi rgiVar) {
                    invoke2(rgiVar);
                    return Unit.INSTANCE;
                }
            }, new Function1<Exception, Unit>() { // from class: com.hellogroup.fep.base.core.FepManager$InternalFepConfigObserver$fepConfigTrackUsage$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Exception exc) {
                    invoke2(exc);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Exception exc) {
                    exc.getClass();
                }
            });
        }

        @Override // p153l.bgi
        /* JADX INFO: renamed from: b */
        public void mo17604b(@NotNull final FepConfigManager manager, final boolean isLocalData, @NotNull final FepConfigFetchType type) {
            manager.getClass();
            type.getClass();
            FepManager.this.observerManager.m191606b(new Function1<rgi, Unit>() { // from class: com.hellogroup.fep.base.core.FepManager$InternalFepConfigObserver$fepConfigDidUpdate$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull rgi rgiVar) {
                    rgiVar.getClass();
                    rgiVar.mo17604b(manager, isLocalData, type);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(rgi rgiVar) {
                    invoke2(rgiVar);
                    return Unit.INSTANCE;
                }
            }, new Function1<Exception, Unit>() { // from class: com.hellogroup.fep.base.core.FepManager$InternalFepConfigObserver$fepConfigDidUpdate$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Exception exc) {
                    invoke2(exc);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Exception exc) {
                    exc.getClass();
                }
            });
        }

        @Override // p153l.bgi
        /* JADX INFO: renamed from: c */
        public void mo17605c(@NotNull final FepLogModuleType moduleType, @NotNull final FepLogLevel level, @NotNull final String message, @Nullable final Map<String, ? extends Object> extraInfo, final int errorCode, @Nullable final Throwable throwable) {
            moduleType.getClass();
            level.getClass();
            message.getClass();
            FepManager.this.observerManager.m191606b(new Function1<rgi, Unit>() { // from class: com.hellogroup.fep.base.core.FepManager$InternalFepConfigObserver$fepConfigLog$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull rgi rgiVar) {
                    rgiVar.getClass();
                    rgiVar.mo17605c(moduleType, level, message, extraInfo, errorCode, throwable);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(rgi rgiVar) {
                    invoke2(rgiVar);
                    return Unit.INSTANCE;
                }
            }, new Function1<Exception, Unit>() { // from class: com.hellogroup.fep.base.core.FepManager$InternalFepConfigObserver$fepConfigLog$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Exception exc) {
                    invoke2(exc);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Exception exc) {
                    exc.getClass();
                }
            });
        }
    }

    @Metadata(m88120d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JQ\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m88121d2 = {"Lcom/hellogroup/fep/base/core/FepManager$InternalFepGreyObserver;", "Ll/igi;", "<init>", "(Lcom/hellogroup/fep/base/core/FepManager;)V", "Lcom/hellogroup/fep/base/FepLogModuleType;", "moduleType", "Lcom/hellogroup/fep/base/FepLogLevel;", FirebaseAnalytics.Param.LEVEL, "", "message", "", "", "extraInfo", "", "errorCode", "", "throwable", "", "g", "(Lcom/hellogroup/fep/base/FepLogModuleType;Lcom/hellogroup/fep/base/FepLogLevel;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Throwable;)V", "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public final class InternalFepGreyObserver implements igi {
        public InternalFepGreyObserver() {
        }

        @Override // p153l.igi
        /* JADX INFO: renamed from: g */
        public void mo17606g(@NotNull final FepLogModuleType moduleType, @NotNull final FepLogLevel level, @NotNull final String message, @Nullable final Map<String, ? extends Object> extraInfo, final int errorCode, @Nullable final Throwable throwable) {
            moduleType.getClass();
            level.getClass();
            message.getClass();
            FepManager.this.observerManager.m191606b(new Function1<rgi, Unit>() { // from class: com.hellogroup.fep.base.core.FepManager$InternalFepGreyObserver$greyLog$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull rgi rgiVar) {
                    rgiVar.getClass();
                    rgiVar.mo17606g(moduleType, level, message, extraInfo, errorCode, throwable);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(rgi rgiVar) {
                    invoke2(rgiVar);
                    return Unit.INSTANCE;
                }
            }, new Function1<Exception, Unit>() { // from class: com.hellogroup.fep.base.core.FepManager$InternalFepGreyObserver$greyLog$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Exception exc) {
                    invoke2(exc);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Exception exc) {
                    exc.getClass();
                }
            });
        }
    }

    @Metadata(m88120d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ9\u0010\u0012\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013JQ\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000b2\u0016\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000f2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, m88121d2 = {"Lcom/hellogroup/fep/base/core/FepManager$InternalFepPackageObserver;", "Ll/ehi;", "<init>", "(Lcom/hellogroup/fep/base/core/FepManager;)V", "Ll/zgi;", BaseSei.INFO, "Lcom/hellogroup/fep/feppkg/model/FepPackageStatus;", "newStatus", "", Constants.INAPP_DATA_TAG, "(Ll/zgi;Lcom/hellogroup/fep/feppkg/model/FepPackageStatus;)V", "", "bid", "Ll/tgi;", "checkResult", "", "", "requestData", "e", "(Ljava/lang/String;Ll/tgi;Ljava/util/Map;)V", "Lcom/hellogroup/fep/base/FepLogModuleType;", "moduleType", "Lcom/hellogroup/fep/base/FepLogLevel;", FirebaseAnalytics.Param.LEVEL, "message", "extraInfo", "", "errorCode", "", "throwable", "f", "(Lcom/hellogroup/fep/base/FepLogModuleType;Lcom/hellogroup/fep/base/FepLogLevel;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Throwable;)V", "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public final class InternalFepPackageObserver implements ehi {
        public InternalFepPackageObserver() {
        }

        @Override // p153l.ehi
        /* JADX INFO: renamed from: d */
        public void mo17607d(@NotNull final zgi info, @NotNull final FepPackageStatus newStatus) {
            info.getClass();
            newStatus.getClass();
            FepManager.this.observerManager.m191606b(new Function1<rgi, Unit>() { // from class: com.hellogroup.fep.base.core.FepManager$InternalFepPackageObserver$packageStatusDidChange$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull rgi rgiVar) {
                    rgiVar.getClass();
                    rgiVar.mo17607d(info, newStatus);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(rgi rgiVar) {
                    invoke2(rgiVar);
                    return Unit.INSTANCE;
                }
            }, new Function1<Exception, Unit>() { // from class: com.hellogroup.fep.base.core.FepManager$InternalFepPackageObserver$packageStatusDidChange$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Exception exc) {
                    invoke2(exc);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Exception exc) {
                    exc.getClass();
                }
            });
        }

        @Override // p153l.ehi
        /* JADX INFO: renamed from: e */
        public void mo17608e(@NotNull final String bid, @Nullable final tgi checkResult, @Nullable final Map<String, ? extends Object> requestData) {
            bid.getClass();
            FepManager.this.observerManager.m191606b(new Function1<rgi, Unit>() { // from class: com.hellogroup.fep.base.core.FepManager$InternalFepPackageObserver$packageCheckUpdateResponse$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull rgi rgiVar) {
                    rgiVar.getClass();
                    rgiVar.mo17608e(bid, checkResult, requestData);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(rgi rgiVar) {
                    invoke2(rgiVar);
                    return Unit.INSTANCE;
                }
            }, new Function1<Exception, Unit>() { // from class: com.hellogroup.fep.base.core.FepManager$InternalFepPackageObserver$packageCheckUpdateResponse$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Exception exc) {
                    invoke2(exc);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Exception exc) {
                    exc.getClass();
                }
            });
        }

        @Override // p153l.ehi
        /* JADX INFO: renamed from: f */
        public void mo17609f(@NotNull final FepLogModuleType moduleType, @NotNull final FepLogLevel level, @NotNull final String message, @Nullable final Map<String, ? extends Object> extraInfo, final int errorCode, @Nullable final Throwable throwable) {
            moduleType.getClass();
            level.getClass();
            message.getClass();
            FepManager.this.observerManager.m191606b(new Function1<rgi, Unit>() { // from class: com.hellogroup.fep.base.core.FepManager$InternalFepPackageObserver$packageLog$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull rgi rgiVar) {
                    rgiVar.getClass();
                    rgiVar.mo17609f(moduleType, level, message, extraInfo, errorCode, throwable);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(rgi rgiVar) {
                    invoke2(rgiVar);
                    return Unit.INSTANCE;
                }
            }, new Function1<Exception, Unit>() { // from class: com.hellogroup.fep.base.core.FepManager$InternalFepPackageObserver$packageLog$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Exception exc) {
                    invoke2(exc);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Exception exc) {
                    exc.getClass();
                }
            });
        }
    }

    private FepManager() {
        this.observerManager = new tl5<>();
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ zgi m17580m(FepManager fepManager, String str, CheckPolicy checkPolicy, int i, Object obj) {
        if ((i & 2) != 0) {
            checkPolicy = CheckPolicy.NORMAL;
        }
        return fepManager.m17591l(str, checkPolicy);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ zgi m17581o(FepManager fepManager, String str, String str2, String str3, CheckPolicy checkPolicy, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            checkPolicy = CheckPolicy.NORMAL;
        }
        return fepManager.m17592n(str, str2, str3, checkPolicy);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: z */
    public static final FepManager m17582z() {
        return INSTANCE.m17610a();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m17583d(@Nullable zgi offlineInfo) {
        return FepPackageManager.INSTANCE.m17673a().m17658c(offlineInfo);
    }

    /* JADX INFO: renamed from: e */
    public final void m17584e() {
        FepPackageManager.INSTANCE.m17673a().m17659d();
    }

    /* JADX INFO: renamed from: f */
    public final void m17585f(@NotNull FepConfigFetchType type) {
        type.getClass();
        FepConfigManager.INSTANCE.m17633a().m17627h(type);
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final File m17586g(@Nullable String bid, @Nullable String baseVersion, @NotNull String customVer) {
        File fileM17662j;
        Long lP;
        customVer.getClass();
        File file = null;
        if (bid != null && baseVersion != null && (fileM17662j = FepPackageManager.INSTANCE.m17673a().m17662j(bid, baseVersion)) != null) {
            if (StringsKt.m94329e0(customVer)) {
                fileM17662j = null;
            }
            if (fileM17662j != null && (lP = StringsKt.m94281p(customVer)) != null) {
                long jLongValue = lP.longValue();
                file = new File(fileM17662j, customVer);
                if (file.exists() && file.length() > 0 && file.isDirectory()) {
                    File[] fileArrListFiles = file.listFiles();
                    if ((fileArrListFiles != null ? fileArrListFiles.length : 0) > 0) {
                        FepPackageContext.INSTANCE.m17691r().m17720B(bid, baseVersion, jLongValue);
                    }
                }
            }
        }
        return file;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final zgi m17587h(@NotNull String bid, @Nullable String baseVer, @Nullable String url) {
        bid.getClass();
        return FepPackageManager.INSTANCE.m17673a().m17660h(bid, baseVer, url);
    }

    /* JADX INFO: renamed from: i */
    public final long m17588i(@Nullable String bid, @Nullable String url) {
        return FepPackageManager.INSTANCE.m17673a().m17664l(bid, url);
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public final Object m17589j(@NotNull String key, @Nullable Object defaultValue) {
        key.getClass();
        return FepConfigManager.INSTANCE.m17633a().m17629k(key, defaultValue);
    }

    @JvmOverloads
    @Nullable
    /* JADX INFO: renamed from: k */
    public final zgi m17590k(@NotNull String str) {
        return m17580m(this, str, null, 2, null);
    }

    @JvmOverloads
    @Nullable
    /* JADX INFO: renamed from: l */
    public final zgi m17591l(@NotNull String url, @NotNull CheckPolicy checkPolicy) {
        url.getClass();
        checkPolicy.getClass();
        return FepPackageManager.INSTANCE.m17673a().m17665m(url, checkPolicy);
    }

    @JvmOverloads
    @Nullable
    /* JADX INFO: renamed from: n */
    public final zgi m17592n(@NotNull String bid, @Nullable String baseVersion, @Nullable String url, @NotNull CheckPolicy checkPolicy) {
        bid.getClass();
        checkPolicy.getClass();
        return FepPackageManager.INSTANCE.m17673a().m17666n(bid, baseVersion, url, checkPolicy);
    }

    @JvmOverloads
    @Nullable
    /* JADX INFO: renamed from: p */
    public final zgi m17593p(@Nullable String url, @Nullable String bid, @NotNull CheckPolicy checkPolicy) {
        checkPolicy.getClass();
        Pair<String, String> pairM96330b = a6k0.m96330b(url, bid);
        String first = pairM96330b.getFirst();
        if (first != null) {
            return FepPackageManager.INSTANCE.m17673a().m17666n(first, pairM96330b.getSecond(), url, checkPolicy);
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: q */
    public final File m17594q(@Nullable String bid, @Nullable String baseVersion) {
        return FepPackageManager.INSTANCE.m17673a().m17663k(bid, baseVersion);
    }

    /* JADX INFO: renamed from: r */
    public final boolean m17595r(@NotNull String zipPath, @NotNull String bid, @Nullable String baseVersion, @NotNull String version, @Nullable String prefix) {
        zipPath.getClass();
        bid.getClass();
        version.getClass();
        return FepPackageContext.INSTANCE.m17683j().m104348d(zipPath, bid, baseVersion, version, prefix);
    }

    /* JADX INFO: renamed from: s */
    public final void m17596s(@NotNull List<? extends Map<String, ? extends Object>> packageConfs) {
        packageConfs.getClass();
        FepPackageManager.INSTANCE.m17673a().m17667p(packageConfs);
    }

    /* JADX INFO: renamed from: t */
    public final void m17597t(@Nullable zgi packageInfo) {
        FepPackageManager.INSTANCE.m17673a().m17668q(packageInfo);
    }

    /* JADX INFO: renamed from: u */
    public final void m17598u(@NotNull rgi observer) {
        observer.getClass();
        this.observerManager.m191605a(observer);
    }

    /* JADX INFO: renamed from: v */
    public final void m17599v(@NotNull ehi observer) {
        observer.getClass();
        FepPackageManager.INSTANCE.m17673a().m17669r(observer);
    }

    /* JADX INFO: renamed from: w */
    public final void m17600w(@NotNull String bid, @Nullable String baseVersion) {
        bid.getClass();
        FepPackageManager.INSTANCE.m17673a().m17670s(bid, baseVersion);
    }

    /* JADX INFO: renamed from: x */
    public final void m17601x(@NotNull ehi observer) {
        observer.getClass();
        FepPackageManager.INSTANCE.m17673a().m17671t(observer);
    }

    /* JADX INFO: renamed from: y */
    public final void m17602y(@NotNull Context context, boolean debugMode, @NotNull fgi configuration, @NotNull qhi providers) {
        context.getClass();
        configuration.getClass();
        providers.getClass();
        lv0.m155975e(context.getApplicationContext());
        xfi xfiVar = new xfi(configuration.getBaseConfig(), configuration.getConfigFetchURL());
        C3492a c3492a = new C3492a(providers.getNetwork());
        FepConfigManager.Companion c3494a = FepConfigManager.INSTANCE;
        c3494a.m17633a().m17631p(context, debugMode, xfiVar, c3492a);
        C3493b c3493b = new C3493b();
        hgi.Companion c17451a = hgi.INSTANCE;
        c17451a.m134945a().m134944g(debugMode, c3493b);
        FepPackageConfiguration fepPackageConfiguration = new FepPackageConfiguration(configuration.getBaseConfig(), configuration.getPackageRootPath(), configuration.getPackageCheckUpdateURL(), 0, configuration.m125497c(), 8, null);
        tc60 tc60Var = new tc60(providers.getNetwork(), providers.getUnzip());
        FepPackageManager.Companion c3499a = FepPackageManager.INSTANCE;
        c3499a.m17673a().m17672u(debugMode, fepPackageConfiguration, tc60Var);
        c3494a.m17633a().m17630o(new InternalFepConfigObserver());
        c3499a.m17673a().m17669r(new InternalFepPackageObserver());
        c17451a.m134945a().m134943f(new InternalFepGreyObserver());
    }

    /* JADX INFO: renamed from: com.hellogroup.fep.base.core.FepManager$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Lcom/hellogroup/fep/base/core/FepManager$a;", "", "<init>", "()V", "Lcom/hellogroup/fep/base/core/FepManager;", "a", "()Lcom/hellogroup/fep/base/core/FepManager;", "instance", "Lcom/hellogroup/fep/base/core/FepManager;", "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final FepManager m17610a() {
            FepManager fepManager;
            FepManager fepManager2 = FepManager.f11905b;
            if (fepManager2 != null) {
                return fepManager2;
            }
            synchronized (this) {
                fepManager = FepManager.f11905b;
                if (fepManager == null) {
                    fepManager = new FepManager(null);
                    FepManager.f11905b = fepManager;
                }
            }
            return fepManager;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ FepManager(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
