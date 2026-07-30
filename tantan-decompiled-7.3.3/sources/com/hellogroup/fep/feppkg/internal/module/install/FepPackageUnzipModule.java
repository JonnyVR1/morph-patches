package com.hellogroup.fep.feppkg.internal.module.install;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.hellogroup.common.file.FileUtil;
import com.hellogroup.fep.feppkg.internal.core.FepPackageContext;
import java.io.File;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.pgi;
import p153l.xgi;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"Lcom/hellogroup/fep/feppkg/internal/module/install/FepPackageUnzipModule;", "", "<init>", "()V", "", "zipPath", FirebaseAnalytics.Param.DESTINATION, "", "recordData", "", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Z", "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class FepPackageUnzipModule {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final boolean m17699a(@NotNull String zipPath, @NotNull String destination, @NotNull Map<String, String> recordData) {
        Object objM225066constructorimpl;
        zipPath.getClass();
        destination.getClass();
        recordData.getClass();
        File file = new File(zipPath);
        if (!file.exists()) {
            pgi.m172234d(FepPackageContext.INSTANCE.m17685l(), -3005, "Zip file not found: " + zipPath, null, MapsKt.toMutableMap(MapsKt.plus(recordData, TuplesKt.m88129a("path", zipPath))), 4, null);
            return false;
        }
        File file2 = new File(destination);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        if (!file2.exists() || !file2.isDirectory()) {
            pgi.m172234d(FepPackageContext.INSTANCE.m17685l(), -3005, "Cannot create destination directory: " + destination, null, recordData, 4, null);
            return false;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = null;
        FepPackageContext fepPackageContext = FepPackageContext.INSTANCE;
        if (fepPackageContext.m17690q().getUnzip().mo130068a(file, file2, new Function1<Throwable, Unit>() { // from class: com.hellogroup.fep.feppkg.internal.module.install.FepPackageUnzipModule$unzip$success$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Throwable th) {
                objectRef.element = th;
            }
        })) {
            pgi.m172235f(fepPackageContext.m17685l(), "Unzip success: " + zipPath + " -> " + destination, null, 0, 6, null);
            return true;
        }
        FileUtil.m17527k(file2);
        pgi pgiVarM17685l = fepPackageContext.m17685l();
        StringBuilder sb = new StringBuilder("Unzip failed finally: ");
        Throwable th = (Throwable) objectRef.element;
        sb.append(th != null ? th.getMessage() : null);
        String string = sb.toString();
        Throwable th2 = (Throwable) objectRef.element;
        Map mutableMap = MapsKt.toMutableMap(MapsKt.plus(recordData, TuplesKt.m88129a("path", zipPath)));
        StringBuilder sb2 = new StringBuilder("error-zipFile=");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM225066constructorimpl = Result.m225066constructorimpl(Long.valueOf(file.length()));
        } catch (Throwable th3) {
            Result.Companion companion2 = Result.INSTANCE;
            objM225066constructorimpl = Result.m225066constructorimpl(ResultKt.m88127a(th3));
        }
        sb2.append((Long) (Result.m225072isFailureimpl(objM225066constructorimpl) ? null : objM225066constructorimpl));
        pgiVarM17685l.m172241c(-3005, string, th2, xgi.m210888a(mutableMap, sb2.toString()));
        return false;
    }
}
