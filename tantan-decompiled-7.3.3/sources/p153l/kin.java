package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.data.Banners;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0011\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m88121d2 = {"Ll/kin;", "Ll/v5w;", "Ll/hin;", "Landroid/view/View;", "", Banners.TYPE, "Lkotlin/Function1;", "", "onItemClick", "<init>", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "", "viewType", "Landroid/view/ViewGroup;", "container", "dataPosition", "position", "p", "(ILandroid/view/ViewGroup;II)Landroid/view/View;", "convertView", "j", "(Landroid/view/View;II)V", "a", "Lkotlin/jvm/functions/Function1;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class kin extends v5w<hin, View> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Function1<hin, Unit> onItemClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public kin(@NotNull List<? extends hin> list, @NotNull Function1<? super hin, Unit> function1) {
        super(list, true);
        list.getClass();
        function1.getClass();
        this.onItemClick = function1;
    }

    /* JADX INFO: renamed from: r */
    public static void m149920r(kin kinVar, hin hinVar, View view) {
        Function1<hin, Unit> function1 = kinVar.onItemClick;
        hinVar.getClass();
        function1.invoke(hinVar);
    }

    @Override // p153l.v5w
    /* JADX INFO: renamed from: j */
    public void mo68591j(@NotNull View convertView, int dataPosition, int viewType) {
        convertView.getClass();
        final hin hinVar = (hin) this.itemList.get(dataPosition);
        izs.m142868s("context_common", (VDraweeView) convertView.findViewById(mdc0.f135905C3), hinVar.iconUrl);
        bnl0.m105509E0(convertView, new View.OnClickListener() { // from class: l.jin
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                kin.m149920r(this.f121105a, hinVar, view);
            }
        });
    }

    @Override // p153l.v5w
    @NotNull
    /* JADX INFO: renamed from: p */
    public View mo68592p(int viewType, @NotNull ViewGroup container, int dataPosition, int position) {
        container.getClass();
        View viewInflate = LayoutInflater.from(container.getContext()).inflate(yec0.f199253t2, container, false);
        viewInflate.getClass();
        return viewInflate;
    }
}
