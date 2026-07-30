package p153l;

import com.immomo.svgaplayer.adapter.SVGAThreadAdapter;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m88121d2 = {"Ll/rtd0;", "Lcom/immomo/svgaplayer/adapter/SVGAThreadAdapter;", "Ll/std0;", "svgaUtil", "<init>", "(Ll/std0;)V", "", "o", "", "cancelTaskByTag", "(Ljava/lang/Object;)V", "Ljava/lang/Runnable;", "runnable", "executeTaskByTag", "(Ljava/lang/Object;Ljava/lang/Runnable;)V", "a", "Ll/std0;", "base_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class rtd0 implements SVGAThreadAdapter {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final std0 svgaUtil;

    public rtd0(@NotNull std0 std0Var) {
        std0Var.getClass();
        this.svgaUtil = std0Var;
    }

    /* JADX INFO: renamed from: a */
    public static void m183110a(Runnable runnable, rtd0 rtd0Var, Object obj) {
        runnable.run();
        rtd0Var.svgaUtil.m187861b().remove(obj);
    }

    @Override // com.immomo.svgaplayer.adapter.SVGAThreadAdapter
    public void cancelTaskByTag(@NotNull Object o) {
        o.getClass();
        Runnable runnableRemove = this.svgaUtil.m187861b().remove(o);
        if (runnableRemove != null) {
            this.svgaUtil.m187862c().remove(runnableRemove);
        }
    }

    @Override // com.immomo.svgaplayer.adapter.SVGAThreadAdapter
    public void executeTaskByTag(@NotNull final Object o, @NotNull final Runnable runnable) {
        o.getClass();
        runnable.getClass();
        this.svgaUtil.m187861b().put(o, runnable);
        this.svgaUtil.getExecutorService().execute(new Runnable() { // from class: l.qtd0
            @Override // java.lang.Runnable
            public final void run() {
                rtd0.m183110a(runnable, this, o);
            }
        });
    }
}
