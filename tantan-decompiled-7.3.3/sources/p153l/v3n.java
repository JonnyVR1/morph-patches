package p153l;

import android.content.Context;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.VipNewUiFrag;
import com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.view.bottom.IntlBottomContentCoverView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m88121d2 = {"Ll/v3n;", "Ll/lb2;", "Lcom/p1/mobile/putong/core/ui/vip/privilegeNewUi/VipNewUiFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/ui/vip/privilegeNewUi/VipNewUiFrag;)V", "", "position", "Landroid/view/ViewGroup;", "r", "(I)Landroid/view/ViewGroup;", "container", "", "p", "(Landroid/view/ViewGroup;I)Ljava/lang/Object;", "e", "Lcom/p1/mobile/putong/core/ui/vip/privilegeNewUi/VipNewUiFrag;", "q", "()Lcom/p1/mobile/putong/core/ui/vip/privilegeNewUi/VipNewUiFrag;", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public abstract class v3n extends lb2 {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final VipNewUiFrag frag;

    public v3n(@NotNull VipNewUiFrag vipNewUiFrag) {
        vipNewUiFrag.getClass();
        this.frag = vipNewUiFrag;
    }

    @Override // p153l.lb2
    @NotNull
    /* JADX INFO: renamed from: p */
    public final Object mo40046p(@NotNull ViewGroup container, int position) {
        container.getClass();
        Context contextRequireContext = this.frag.requireContext();
        contextRequireContext.getClass();
        IntlBottomContentCoverView intlBottomContentCoverView = new IntlBottomContentCoverView(contextRequireContext, null, 0, 6, null);
        ViewGroup viewGroupMo108066r = mo108066r(position);
        if (viewGroupMo108066r == null) {
            return intlBottomContentCoverView;
        }
        intlBottomContentCoverView.addView(viewGroupMo108066r, 0, new ViewGroup.LayoutParams(-1, -1));
        container.addView(intlBottomContentCoverView);
        return intlBottomContentCoverView;
    }

    @NotNull
    /* JADX INFO: renamed from: q, reason: from getter */
    public final VipNewUiFrag getFrag() {
        return this.frag;
    }

    @Nullable
    /* JADX INFO: renamed from: r */
    public abstract ViewGroup mo108066r(int position);
}
