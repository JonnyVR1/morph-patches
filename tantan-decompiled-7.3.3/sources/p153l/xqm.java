package p153l;

import com.clevertap.android.sdk.Constants;
import java.io.File;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n0\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0017R*\u0010\u0019\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001f¨\u0006#"}, m88121d2 = {"Ll/xqm;", "Ll/epy;", "", "Ll/spy;", Constants.KEY_CONFIG, "Ll/axl;", "logger", "<init>", "(Ll/spy;Ll/axl;)V", "Ll/ssm;", "Lkotlin/Pair;", "Ljava/io/File;", "b", "()Ll/ssm;", "Ll/a5e;", "a", "()Ll/a5e;", "", "c", "()I", "Ll/spy;", "getConfig$clevertap_core_release", "()Ll/spy;", "Ll/axl;", "Ll/ssm;", "gifInMemory", Constants.INAPP_DATA_TAG, "Ll/a5e;", "gifDiskMemory", "", "e", "Ljava/lang/Object;", "inMemoryLock", "f", "diskMemoryLock", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class xqm implements epy<byte[]> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final spy config;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final axl logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private ssm<Pair<byte[], File>> gifInMemory;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private a5e gifDiskMemory;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Object inMemoryLock;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Object diskMemoryLock;

    public xqm(@NotNull spy spyVar, @Nullable axl axlVar) {
        spyVar.getClass();
        this.config = spyVar;
        this.logger = axlVar;
        this.inMemoryLock = new Object();
        this.diskMemoryLock = new Object();
    }

    @Override // p153l.epy
    @NotNull
    /* JADX INFO: renamed from: a */
    public a5e mo104626a() {
        if (this.gifDiskMemory == null) {
            synchronized (this.diskMemoryLock) {
                try {
                    if (this.gifDiskMemory == null) {
                        this.gifDiskMemory = new a5e(this.config.getDiskDirectory(), (int) this.config.getMaxDiskSizeKB(), this.logger, null, 8, null);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        a5e a5eVar = this.gifDiskMemory;
        a5eVar.getClass();
        return a5eVar;
    }

    @Override // p153l.epy
    @NotNull
    /* JADX INFO: renamed from: b */
    public ssm<Pair<byte[], File>> mo104627b() {
        if (this.gifInMemory == null) {
            synchronized (this.inMemoryLock) {
                try {
                    if (this.gifInMemory == null) {
                        this.gifInMemory = new ssm<>(m212736c(), null, 2, null);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        ssm<Pair<byte[], File>> ssmVar = this.gifInMemory;
        ssmVar.getClass();
        return ssmVar;
    }

    /* JADX INFO: renamed from: c */
    public int m212736c() {
        int iMax = (int) Math.max(this.config.getOptimistic(), this.config.getMinInMemorySizeKB());
        axl axlVar = this.logger;
        if (axlVar != null) {
            axlVar.verbose(" Gif cache:: max-mem/1024 = " + this.config.getOptimistic() + ", minCacheSize = " + this.config.getMinInMemorySizeKB() + ", selected = " + iMax);
        }
        return iMax;
    }
}
