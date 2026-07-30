package p006l;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p004ui.seepage.likers.FakeLikersItem;
import com.p000p1.mobile.putong.core.p004ui.seepage.likers.mytab.FakeLikersMyTabFrag;
import com.p1.mobile.putong.core.newui.PlatformQualificationView;
import com.p1.mobile.putong.data.User;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import l.czc0;
import l.dac0;
import l.k6c0;
import l.t100;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002/0B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ-\u0010#\u001a\u00020\u00112\u0016\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u00020\u001ej\b\u0012\u0004\u0012\u00020\u0002`\u001f2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010\u0006R$\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u00020\u001ej\b\u0012\u0004\u0012\u00020\u0002`\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00061"}, d2 = {"Ll/xyf;", "Ll/dac0;", "Ll/xyf$a;", "Lcom/p1/mobile/putong/core/ui/seepage/likers/mytab/FakeLikersMyTabFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/ui/seepage/likers/mytab/FakeLikersMyTabFrag;)V", "Landroid/view/ViewGroup;", "parent", "", "itemViewType", "Landroid/view/View;", "D", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "convertView", "item", "position", "", "G", "(Landroid/view/View;Ll/xyf$a;II)V", "getItemViewType", "(I)I", "J", "(I)Ll/xyf$a;", "C", "()I", "Ll/xyf$b;", "clickListener", "L", "(Ll/xyf$b;)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "lists", "", "lastReadTime", "K", "(Ljava/util/ArrayList;J)V", "c", "Lcom/p1/mobile/putong/core/ui/seepage/likers/mytab/FakeLikersMyTabFrag;", "getFrag", "()Lcom/p1/mobile/putong/core/ui/seepage/likers/mytab/FakeLikersMyTabFrag;", "setFrag", "d", "Ljava/util/ArrayList;", "e", "f", "Ll/xyf$b;", "b", "a", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class xyf extends dac0<InterfaceC1455a> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public FakeLikersMyTabFrag frag;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<InterfaceC1455a> lists;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public long lastReadTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public InterfaceC1456b clickListener;

    /* JADX INFO: renamed from: l.xyf$a */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Ll/xyf$a;", "", "", "getType", "()I", "Lcom/p1/mobile/putong/data/User;", "getUser", "()Lcom/p1/mobile/putong/data/User;", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface InterfaceC1455a {
        int getType();

        @Nullable
        /* JADX INFO: renamed from: getUser */
        User getF14903a();
    }

    /* JADX INFO: renamed from: l.xyf$b */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Ll/xyf$b;", "", "Lcom/p1/mobile/putong/data/User;", "user", "", "pos", "", "a", "(Lcom/p1/mobile/putong/data/User;I)V", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface InterfaceC1456b {
        /* JADX INFO: renamed from: a */
        void mo17177a(@NotNull User user, int pos);
    }

    public xyf(@NotNull FakeLikersMyTabFrag fakeLikersMyTabFrag) {
        fakeLikersMyTabFrag.getClass();
        this.frag = fakeLikersMyTabFrag;
        this.lists = new ArrayList<>();
    }

    /* JADX INFO: renamed from: H */
    public static final void m27673H(InterfaceC1455a interfaceC1455a, xyf xyfVar, int i, View view) {
        InterfaceC1456b interfaceC1456b;
        User f14903a = interfaceC1455a.getF14903a();
        if (f14903a == null || (interfaceC1456b = xyfVar.clickListener) == null) {
            return;
        }
        interfaceC1456b.mo17177a(f14903a, i);
    }

    /* JADX INFO: renamed from: I */
    public static final void m27674I(InterfaceC1455a interfaceC1455a, View view, View view2) {
        User f14903a = interfaceC1455a.getF14903a();
        if (f14903a != null) {
            czc0.Companion.b(f14903a);
        }
        view.performClick();
    }

    /* JADX INFO: renamed from: C */
    public int m27676C() {
        return this.lists.size();
    }

    @NotNull
    /* JADX INFO: renamed from: D */
    public View m27677D(@NotNull ViewGroup parent, int itemViewType) {
        parent.getClass();
        if (itemViewType == 0) {
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(k6c0.i, parent, false);
            viewInflate.getClass();
            return viewInflate;
        }
        if (itemViewType != 1) {
            return new View(parent.getContext());
        }
        Context context = parent.getContext();
        context.getClass();
        PlatformQualificationView platformQualificationView = new PlatformQualificationView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.setMargins(0, t100.d(30.0f), 0, t100.d(84.0f));
        platformQualificationView.setLayoutParams(marginLayoutParams);
        return platformQualificationView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void m27675A(@NotNull final View convertView, @NotNull final InterfaceC1455a item, int itemViewType, final int position) {
        convertView.getClass();
        item.getClass();
        if (itemViewType == 0) {
            FakeLikersItem fakeLikersItem = convertView instanceof FakeLikersItem ? (FakeLikersItem) convertView : null;
            if (fakeLikersItem != null) {
                fakeLikersItem.m8333k(item.getF14903a(), this.lastReadTime);
                fakeLikersItem.setNewLikesBadgesText("刚刚喜欢了我");
                xdl0.E0(convertView, new View.OnClickListener() { // from class: l.vyf
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        xyf.m27673H(item, this, position, view);
                    }
                });
                xdl0.E0(((FakeLikersItem) convertView).f5568m, new View.OnClickListener() { // from class: l.wyf
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        xyf.m27674I(item, convertView, view);
                    }
                });
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public InterfaceC1455a getItem(int position) {
        return (InterfaceC1455a) CollectionsKt.getOrNull(this.lists, position);
    }

    /* JADX INFO: renamed from: K */
    public final void m27680K(@NotNull ArrayList<InterfaceC1455a> lists, long lastReadTime) {
        lists.getClass();
        this.lastReadTime = lastReadTime;
        this.lists.clear();
        this.lists.addAll(lists);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: L */
    public final void m27681L(@NotNull InterfaceC1456b clickListener) {
        clickListener.getClass();
        this.clickListener = clickListener;
    }

    public int getItemViewType(int position) {
        InterfaceC1455a interfaceC1455a = (InterfaceC1455a) CollectionsKt.getOrNull(this.lists, position);
        if (interfaceC1455a != null) {
            return interfaceC1455a.getType();
        }
        return -1;
    }
}
