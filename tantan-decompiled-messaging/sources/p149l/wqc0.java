package p149l;

import androidx.core.app.NotificationCompat;
import com.facebook.common.memory.PooledByteBuffer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\u000fB\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\r\u001a\u00020\f2\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m87232d2 = {"Ll/wqc0;", "Ll/sc90;", "Ll/fa5;", "Lcom/facebook/common/memory/PooledByteBuffer;", "Ll/jze;", "inputProducer", "<init>", "(Ll/sc90;)V", "Ll/uz5;", "consumer", "Ll/uc90;", "context", "", "b", "(Ll/uz5;Ll/uc90;)V", "a", "Ll/sc90;", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class wqc0 implements sc90<fa5<PooledByteBuffer>> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final sc90<jze> inputProducer;

    /* JADX INFO: renamed from: l.wqc0$a */
    @Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m87232d2 = {"Ll/wqc0$a;", "Ll/btd;", "Ll/jze;", "Ll/fa5;", "Lcom/facebook/common/memory/PooledByteBuffer;", "Ll/uz5;", "consumer", "<init>", "(Ll/wqc0;Ll/uz5;)V", "newResult", "", NotificationCompat.CATEGORY_STATUS, "", "p", "(Ll/jze;I)V", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public final class C20942a extends btd<jze, fa5<PooledByteBuffer>> {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ wqc0 f187682c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20942a(@NotNull wqc0 wqc0Var, uz5<fa5<PooledByteBuffer>> uz5Var) {
            super(uz5Var);
            uz5Var.getClass();
            this.f187682c = wqc0Var;
        }

        @Override // p149l.ci2
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void mo8523h(@Nullable jze newResult, int status) {
            fa5<PooledByteBuffer> fa5VarM143923t = null;
            try {
                if (jze.m143894c0(newResult) && newResult != null) {
                    fa5VarM143923t = newResult.m143923t();
                }
                m103812o().mo107035b(fa5VarM143923t, status);
            } finally {
                fa5.m120154v(fa5VarM143923t);
            }
        }
    }

    public wqc0(@NotNull sc90<jze> sc90Var) {
        sc90Var.getClass();
        this.inputProducer = sc90Var;
    }

    @Override // p149l.sc90
    /* JADX INFO: renamed from: b */
    public void mo8485b(@NotNull uz5<fa5<PooledByteBuffer>> consumer, @NotNull uc90 context) {
        consumer.getClass();
        context.getClass();
        this.inputProducer.mo8485b(new C20942a(this, consumer), context);
    }
}
