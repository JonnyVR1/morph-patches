package p153l;

import android.view.View;
import androidx.recyclerview.widget.AbstractC0618v;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.live.base.data.BLiveHeatVoiceRoomTask;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003J\u001b\u0010\n\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m88121d2 = {"Ll/s0l;", "Ll/k6v;", "<init>", "()V", "", "init", BaseSei.f14625Y, "", "Lcom/p1/mobile/putong/live/base/data/BLiveHeatVoiceRoomTask;", "newData", BaseSei.f14626Z, "(Ljava/util/List;)V", "", "k", "()I", "", "empty", "A", "(Z)V", "Ll/o0l;", BLiveStormDanmakuGiftResourceType.f45292l, "Lkotlin/Lazy;", BaseSei.f14624X, "()Ll/o0l;", "taskAdapter", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class s0l extends k6v {

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final Lazy taskAdapter = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.q0l
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return s0l.m183961v(this.f155060a);
        }
    });

    /* JADX INFO: renamed from: v */
    public static o0l m183961v(s0l s0lVar) {
        P p = s0lVar.f48554b;
        p.getClass();
        return new o0l((i1l) p);
    }

    /* JADX INFO: renamed from: w */
    public static void m183962w(s0l s0lVar, View view) {
        s0lVar.mo72910j();
    }

    /* JADX INFO: renamed from: A */
    public final void m183963A(boolean empty) {
        bnl0.m105524M(this.f124215i, empty);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder, p153l.isl
    public void init() {
        super.init();
        m183965y();
        bnl0.m105509E0(this.f124213g, new View.OnClickListener() { // from class: l.r0l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                s0l.m183962w(this.f160655a, view);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder
    /* JADX INFO: renamed from: k */
    public int mo72911k() {
        return obc0.f146517v;
    }

    /* JADX INFO: renamed from: x */
    public final o0l m183964x() {
        return (o0l) this.taskAdapter.getValue();
    }

    /* JADX INFO: renamed from: y */
    public final void m183965y() {
        VRecyclerView vRecyclerView = this.f124214h;
        vRecyclerView.setAdapter(m183964x());
        vRecyclerView.setHasFixedSize(true);
        vRecyclerView.setLayoutManager(new LinearLayoutManager(vRecyclerView.getContext(), 1, false));
        RecyclerView.AbstractC0576l itemAnimator = vRecyclerView.getItemAnimator();
        itemAnimator.getClass();
        ((AbstractC0618v) itemAnimator).setSupportsChangeAnimations(false);
    }

    /* JADX INFO: renamed from: z */
    public final void m183966z(@NotNull List<? extends BLiveHeatVoiceRoomTask> newData) {
        newData.getClass();
        m183963A(newData.isEmpty());
        m183964x().m165542G(newData);
    }
}
