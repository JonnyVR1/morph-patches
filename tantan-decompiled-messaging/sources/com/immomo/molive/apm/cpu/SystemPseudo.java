package com.immomo.molive.apm.cpu;

import com.clevertap.android.sdk.Constants;
import java.io.File;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import p149l.lgh0;
import p149l.urb;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u0010\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\t\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u0011\u0010\u0006¨\u0006\u0013"}, m87232d2 = {"Lcom/immomo/molive/apm/cpu/SystemPseudo;", "", "<init>", "()V", "Ll/lgh0;", "e", "()Ll/lgh0;", "", "a", "Lkotlin/Lazy;", "b", "()Ljava/lang/String;", "mBasePath", "Ljava/io/File;", "c", "()Ljava/io/File;", "mStateFile", Constants.INAPP_DATA_TAG, "sysStatSummary", "apm-tracer_release"}, m87233k = 1, m87234mv = {1, 4, 0})
public final class SystemPseudo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Lazy mBasePath = LazyKt__LazyJVMKt.m87229b(new Function0<String>() { // from class: com.immomo.molive.apm.cpu.SystemPseudo$mBasePath$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "/proc";
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy mStateFile = LazyKt__LazyJVMKt.m87229b(new Function0<File>() { // from class: com.immomo.molive.apm.cpu.SystemPseudo$mStateFile$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final File invoke() {
            return new File(this.this$0.m18555b(), "stat");
        }
    });

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy sysStatSummary = LazyKt__LazyJVMKt.m87229b(new Function0<lgh0>() { // from class: com.immomo.molive.apm.cpu.SystemPseudo$sysStatSummary$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final lgh0 invoke() {
            return new lgh0();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public final String m18555b() {
        return (String) this.mBasePath.getValue();
    }

    /* JADX INFO: renamed from: c */
    private final File m18556c() {
        return (File) this.mStateFile.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final lgh0 m18557d() {
        return (lgh0) this.sysStatSummary.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final lgh0 m18558e() {
        urb.INSTANCE.m195063d(m18556c(), m18557d());
        return m18557d();
    }
}
