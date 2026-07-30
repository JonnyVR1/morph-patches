package com.immomo.molive.apm.cpu;

import com.clevertap.android.sdk.Constants;
import java.io.File;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import p153l.itb;
import p153l.soh0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u0010\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\t\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u0011\u0010\u0006¨\u0006\u0013"}, m88121d2 = {"Lcom/immomo/molive/apm/cpu/SystemPseudo;", "", "<init>", "()V", "Ll/soh0;", "e", "()Ll/soh0;", "", "a", "Lkotlin/Lazy;", "b", "()Ljava/lang/String;", "mBasePath", "Ljava/io/File;", "c", "()Ljava/io/File;", "mStateFile", Constants.INAPP_DATA_TAG, "sysStatSummary", "apm-tracer_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class SystemPseudo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Lazy mBasePath = LazyKt__LazyJVMKt.m88118b(new Function0<String>() { // from class: com.immomo.molive.apm.cpu.SystemPseudo$mBasePath$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "/proc";
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy mStateFile = LazyKt__LazyJVMKt.m88118b(new Function0<File>() { // from class: com.immomo.molive.apm.cpu.SystemPseudo$mStateFile$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final File invoke() {
            return new File(this.this$0.m19535b(), "stat");
        }
    });

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy sysStatSummary = LazyKt__LazyJVMKt.m88118b(new Function0<soh0>() { // from class: com.immomo.molive.apm.cpu.SystemPseudo$sysStatSummary$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final soh0 invoke() {
            return new soh0();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public final String m19535b() {
        return (String) this.mBasePath.getValue();
    }

    /* JADX INFO: renamed from: c */
    private final File m19536c() {
        return (File) this.mStateFile.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final soh0 m19537d() {
        return (soh0) this.sysStatSummary.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final soh0 m19538e() {
        itb.INSTANCE.m142024d(m19536c(), m19537d());
        return m19537d();
    }
}
