package p153l;

import android.content.Context;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.vipfrag.VipFrag;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.vipfrag.view.bottom.BottomContentCoverView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m88121d2 = {"Ll/rj0;", "Ll/lb2;", "Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/VipFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/VipFrag;)V", "", "position", "Landroid/view/ViewGroup;", "r", "(I)Landroid/view/ViewGroup;", "container", "", "p", "(Landroid/view/ViewGroup;I)Ljava/lang/Object;", "e", "Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/VipFrag;", "q", "()Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/VipFrag;", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public abstract class rj0 extends lb2 {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final VipFrag frag;

    public rj0(@NotNull VipFrag vipFrag) {
        vipFrag.getClass();
        this.frag = vipFrag;
    }

    @Override // p153l.lb2
    @NotNull
    /* JADX INFO: renamed from: p */
    public final Object mo40046p(@NotNull ViewGroup container, int position) {
        container.getClass();
        Context contextRequireContext = this.frag.requireContext();
        contextRequireContext.getClass();
        BottomContentCoverView bottomContentCoverView = new BottomContentCoverView(contextRequireContext, null, 0, 6, null);
        ViewGroup viewGroupMo181626r = mo181626r(position);
        if (viewGroupMo181626r == null) {
            return bottomContentCoverView;
        }
        bottomContentCoverView.addView(viewGroupMo181626r, 0, new ViewGroup.LayoutParams(-1, -1));
        container.addView(bottomContentCoverView);
        return bottomContentCoverView;
    }

    @NotNull
    /* JADX INFO: renamed from: q, reason: from getter */
    public final VipFrag getFrag() {
        return this.frag;
    }

    @Nullable
    /* JADX INFO: renamed from: r */
    public abstract ViewGroup mo181626r(int position);
}
