package p149l;

import android.view.View;
import androidx.recyclerview.widget.AbstractC0616v;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.live.base.data.BLiveHeatVoiceRoomTask;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import p147v.VRecyclerView;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003J\u001b\u0010\n\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m87232d2 = {"Ll/cyk;", "Ll/j4v;", "<init>", "()V", "", "init", BaseSei.f13931Y, "", "Lcom/p1/mobile/putong/live/base/data/BLiveHeatVoiceRoomTask;", "newData", BaseSei.f13932Z, "(Ljava/util/List;)V", "", "k", "()I", "", "empty", "A", "(Z)V", "Ll/yxk;", BLiveStormDanmakuGiftResourceType.f44444l, "Lkotlin/Lazy;", BaseSei.f13930X, "()Ll/yxk;", "taskAdapter", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class cyk extends j4v {

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final Lazy taskAdapter = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.ayk
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return cyk.m109320v(this.f72295a);
        }
    });

    /* JADX INFO: renamed from: v */
    public static yxk m109320v(cyk cykVar) {
        P p = cykVar.f47706b;
        p.getClass();
        return new yxk((syk) p);
    }

    /* JADX INFO: renamed from: w */
    public static void m109321w(cyk cykVar, View view) {
        cykVar.mo71727j();
    }

    /* JADX INFO: renamed from: A */
    public final void m109322A(boolean empty) {
        xdl0.m208344M(this.f116243i, empty);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder, p149l.vpl
    public void init() {
        super.init();
        m109324y();
        xdl0.m208329E0(this.f116241g, new View.OnClickListener() { // from class: l.byk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cyk.m109321w(this.f77941a, view);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder
    /* JADX INFO: renamed from: k */
    public int mo71728k() {
        return i3c0.f111189v;
    }

    /* JADX INFO: renamed from: x */
    public final yxk m109323x() {
        return (yxk) this.taskAdapter.getValue();
    }

    /* JADX INFO: renamed from: y */
    public final void m109324y() {
        VRecyclerView vRecyclerView = this.f116242h;
        vRecyclerView.setAdapter(m109323x());
        vRecyclerView.setHasFixedSize(true);
        vRecyclerView.setLayoutManager(new LinearLayoutManager(vRecyclerView.getContext(), 1, false));
        RecyclerView.AbstractC0574l itemAnimator = vRecyclerView.getItemAnimator();
        itemAnimator.getClass();
        ((AbstractC0616v) itemAnimator).setSupportsChangeAnimations(false);
    }

    /* JADX INFO: renamed from: z */
    public final void m109325z(@NotNull List<? extends BLiveHeatVoiceRoomTask> newData) {
        newData.getClass();
        m109322A(newData.isEmpty());
        m109323x().m216464G(newData);
    }
}
