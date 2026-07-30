package p153l;

import androidx.core.app.NotificationCompat;
import com.facebook.common.memory.PooledByteBuffer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\u000fB\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\r\u001a\u00020\f2\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m88121d2 = {"Ll/bzc0;", "Ll/wk90;", "Ll/fb5;", "Lcom/facebook/common/memory/PooledByteBuffer;", "Ll/n0f;", "inputProducer", "<init>", "(Ll/wk90;)V", "Ll/z06;", "consumer", "Ll/yk90;", "context", "", "b", "(Ll/z06;Ll/yk90;)V", "a", "Ll/wk90;", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class bzc0 implements wk90<fb5<PooledByteBuffer>> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final wk90<n0f> inputProducer;

    /* JADX INFO: renamed from: l.bzc0$a */
    @Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m88121d2 = {"Ll/bzc0$a;", "Ll/pud;", "Ll/n0f;", "Ll/fb5;", "Lcom/facebook/common/memory/PooledByteBuffer;", "Ll/z06;", "consumer", "<init>", "(Ll/bzc0;Ll/z06;)V", "newResult", "", NotificationCompat.CATEGORY_STATUS, "", "p", "(Ll/n0f;I)V", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public final class C16142a extends pud<n0f, fb5<PooledByteBuffer>> {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ bzc0 f79119c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16142a(@NotNull bzc0 bzc0Var, z06<fb5<PooledByteBuffer>> z06Var) {
            super(z06Var);
            z06Var.getClass();
            this.f79119c = bzc0Var;
        }

        @Override // p153l.ji2
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void mo8577h(@Nullable n0f newResult, int status) {
            fb5<PooledByteBuffer> fb5VarM160986t = null;
            try {
                if (n0f.m160957d0(newResult) && newResult != null) {
                    fb5VarM160986t = newResult.m160986t();
                }
                m173861o().mo144954b(fb5VarM160986t, status);
            } finally {
                fb5.m124874v(fb5VarM160986t);
            }
        }
    }

    public bzc0(@NotNull wk90<n0f> wk90Var) {
        wk90Var.getClass();
        this.inputProducer = wk90Var;
    }

    @Override // p153l.wk90
    /* JADX INFO: renamed from: b */
    public void mo8539b(@NotNull z06<fb5<PooledByteBuffer>> consumer, @NotNull yk90 context) {
        consumer.getClass();
        context.getClass();
        this.inputProducer.mo8539b(new C16142a(this, consumer), context);
    }
}
