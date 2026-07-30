package com.clevertap.android.sdk.inapp.images.cleanup;

import com.clevertap.android.sdk.inapp.images.FileResourceProvider;
import com.facebook.AuthenticationTokenClaims;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C15531f;
import kotlinx.coroutines.InterfaceC15593o;
import org.jetbrains.annotations.NotNull;
import p153l.dyb;
import p153l.mii;
import p153l.q5e;
import p153l.xh3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ@\u0010\u0012\u001a\u00020\u00102\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m88121d2 = {"Lcom/clevertap/android/sdk/inapp/images/cleanup/FileCleanupStrategyCoroutine;", "Ll/mii;", "Lkotlin/Function0;", "Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", "fileResourceProvider", "Ll/q5e;", "dispatchers", "<init>", "(Lkotlin/jvm/functions/Function0;Ll/q5e;)V", "", "", "urls", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "url", "", "successBlock", "a", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/jvm/functions/Function0;", "b", "()Lkotlin/jvm/functions/Function0;", "Ll/q5e;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Lkotlinx/coroutines/o;", "c", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "jobs", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class FileCleanupStrategyCoroutine implements mii {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Function0<FileResourceProvider> fileResourceProvider;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final q5e dispatchers;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final ConcurrentLinkedQueue<InterfaceC15593o> jobs;

    @JvmOverloads
    public FileCleanupStrategyCoroutine(@NotNull Function0<FileResourceProvider> function0, @NotNull q5e q5eVar) {
        function0.getClass();
        q5eVar.getClass();
        this.fileResourceProvider = function0;
        this.dispatchers = q5eVar;
        this.jobs = new ConcurrentLinkedQueue<>();
    }

    @Override // p153l.mii
    /* JADX INFO: renamed from: a */
    public void mo6558a(@NotNull List<String> urls, @NotNull Function1<? super String, Unit> successBlock) {
        urls.getClass();
        successBlock.getClass();
        this.jobs.add(xh3.m210980d(C15531f.m94947a(this.dispatchers.mo118662a()), null, null, new FileCleanupStrategyCoroutine$clearFileAssets$job$1(urls, this, successBlock, null), 3, null));
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public Function0<FileResourceProvider> m6559b() {
        return this.fileResourceProvider;
    }

    public /* synthetic */ FileCleanupStrategyCoroutine(Function0 function0, q5e q5eVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, (i & 2) != 0 ? new dyb() : q5eVar);
    }
}
