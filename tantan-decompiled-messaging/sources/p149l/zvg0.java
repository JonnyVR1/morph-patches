package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR$\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u001ej\b\u0012\u0004\u0012\u00020\u0005`\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, m87232d2 = {"Ll/zvg0;", "Ll/eb2;", "<init>", "()V", "", "Ll/awg0;", "memberItems", "", "q", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "container", "", "position", "", "p", "(Landroid/view/ViewGroup;I)Ljava/lang/Object;", "object", "o", "(Landroid/view/ViewGroup;ILjava/lang/Object;)V", "getCount", "()I", "", "getPageTitle", "(I)Ljava/lang/CharSequence;", "Landroid/view/View;", OMSTemplateModeType.view, "", "isViewFromObject", "(Landroid/view/View;Ljava/lang/Object;)Z", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "e", "Ljava/util/ArrayList;", "pageItem", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class zvg0 extends eb2 {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<awg0> pageItem = new ArrayList<>();

    @Override // p149l.w660
    public int getCount() {
        return this.pageItem.size();
    }

    @Override // p149l.w660
    @Nullable
    public CharSequence getPageTitle(int position) {
        return null;
    }

    @Override // p149l.w660
    public boolean isViewFromObject(@NotNull View view, @NotNull Object object) {
        view.getClass();
        object.getClass();
        return view == object;
    }

    @Override // p149l.eb2
    /* JADX INFO: renamed from: o */
    public void mo39042o(@NotNull ViewGroup container, int position, @Nullable Object object) {
        container.getClass();
        container.removeView((View) object);
    }

    @Override // p149l.eb2
    @Nullable
    /* JADX INFO: renamed from: p */
    public Object mo39043p(@NotNull ViewGroup container, int position) {
        container.getClass();
        View view = this.pageItem.get(position).getCom.p1.mobile.putong.data.OMSTemplateModeType.view java.lang.String();
        container.addView(view);
        return view;
    }

    /* JADX INFO: renamed from: q */
    public final void m220405q(@NotNull List<awg0> memberItems) {
        memberItems.getClass();
        this.pageItem.clear();
        this.pageItem.addAll(memberItems);
        notifyDataSetChanged();
    }
}
