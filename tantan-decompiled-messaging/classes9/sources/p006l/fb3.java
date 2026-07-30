package p006l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.vipfrag.VipFrag;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001b\u001a\u00020\u00152\u0016\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0018j\b\u0012\u0004\u0012\u00020\u0011`\u0019¢\u0006\u0004\b\u001b\u0010\u001cR*\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Ll/fb3;", "Ll/vj0;", "Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/VipFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/VipFrag;)V", "", "getCount", "()I", "Landroid/view/View;", "view", "", "any", "", "isViewFromObject", "(Landroid/view/View;Ljava/lang/Object;)Z", "position", "Landroid/view/ViewGroup;", "r", "(I)Landroid/view/ViewGroup;", "container", "", "o", "(Landroid/view/ViewGroup;ILjava/lang/Object;)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "contentViewList", "s", "(Ljava/util/ArrayList;)V", "", "f", "Ljava/util/List;", "getContentViewList", "()Ljava/util/List;", "setContentViewList", "(Ljava/util/List;)V", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class fb3 extends vj0 {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public List<? extends ViewGroup> contentViewList;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb3(@NotNull VipFrag vipFrag) {
        super(vipFrag);
        vipFrag.getClass();
    }

    public int getCount() {
        List<? extends ViewGroup> list = this.contentViewList;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public boolean isViewFromObject(@NotNull View view, @NotNull Object any) {
        view.getClass();
        any.getClass();
        return Intrinsics.d(view, any);
    }

    /* JADX INFO: renamed from: o */
    public void m15298o(@NotNull ViewGroup container, int position, @NotNull Object any) {
        container.getClass();
        any.getClass();
        container.removeView((View) any);
    }

    @Override // p006l.vj0
    @Nullable
    /* JADX INFO: renamed from: r */
    public ViewGroup mo15299r(int position) {
        List<? extends ViewGroup> list = this.contentViewList;
        if (list == null) {
            return null;
        }
        ViewGroup viewGroup = list != null ? list.get(position) : null;
        ku80 ku80Var = viewGroup instanceof ku80 ? (ku80) viewGroup : null;
        if (ku80Var != null) {
            ku80Var.mo10400k(this, getFrag());
        }
        if ((viewGroup != null ? viewGroup.getParent() : null) instanceof ViewGroup) {
            ViewParent parent = viewGroup.getParent();
            parent.getClass();
            ((ViewGroup) parent).removeView(viewGroup);
        }
        return viewGroup;
    }

    /* JADX INFO: renamed from: s */
    public final void m15300s(@NotNull ArrayList<ViewGroup> contentViewList) {
        contentViewList.getClass();
        this.contentViewList = contentViewList;
        notifyDataSetChanged();
    }
}
