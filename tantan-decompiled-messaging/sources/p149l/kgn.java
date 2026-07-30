package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.data.Banners;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0011\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m87232d2 = {"Ll/kgn;", "Ll/x3w;", "Ll/hgn;", "Landroid/view/View;", "", Banners.TYPE, "Lkotlin/Function1;", "", "onItemClick", "<init>", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "", "viewType", "Landroid/view/ViewGroup;", "container", "dataPosition", "position", "p", "(ILandroid/view/ViewGroup;II)Landroid/view/View;", "convertView", "j", "(Landroid/view/View;II)V", "a", "Lkotlin/jvm/functions/Function1;", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class kgn extends x3w<hgn, View> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Function1<hgn, Unit> onItemClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public kgn(@NotNull List<? extends hgn> list, @NotNull Function1<? super hgn, Unit> function1) {
        super(list, true);
        list.getClass();
        function1.getClass();
        this.onItemClick = function1;
    }

    /* JADX INFO: renamed from: r */
    public static void m145896r(kgn kgnVar, hgn hgnVar, View view) {
        Function1<hgn, Unit> function1 = kgnVar.onItemClick;
        hgnVar.getClass();
        function1.invoke(hgnVar);
    }

    @Override // p149l.x3w
    /* JADX INFO: renamed from: j */
    public void mo67408j(@NotNull View convertView, int dataPosition, int viewType) {
        convertView.getClass();
        final hgn hgnVar = (hgn) this.itemList.get(dataPosition);
        hxs.m133406s("context_common", (VDraweeView) convertView.findViewById(g5c0.f100660C3), hgnVar.iconUrl);
        xdl0.m208329E0(convertView, new View.OnClickListener() { // from class: l.jgn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                kgn.m145896r(this.f117809a, hgnVar, view);
            }
        });
    }

    @Override // p149l.x3w
    @NotNull
    /* JADX INFO: renamed from: p */
    public View mo67409p(int viewType, @NotNull ViewGroup container, int dataPosition, int position) {
        container.getClass();
        View viewInflate = LayoutInflater.from(container.getContext()).inflate(t6c0.f168521t2, container, false);
        viewInflate.getClass();
        return viewInflate;
    }
}
