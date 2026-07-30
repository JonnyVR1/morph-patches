package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.data.Item;
import com.p051p1.mobile.putong.core.newui.PlatformQualificationView;
import com.p051p1.mobile.putong.core.p058ui.seepage.likers.FakeLikersItem;
import com.p051p1.mobile.putong.core.p058ui.seepage.likers.mytab.FakeLikersMyTabFrag;
import com.p051p1.mobile.putong.data.User;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002/0B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ-\u0010#\u001a\u00020\u00112\u0016\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u00020\u001ej\b\u0012\u0004\u0012\u00020\u0002`\u001f2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010\u0006R$\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u00020\u001ej\b\u0012\u0004\u0012\u00020\u0002`\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00061"}, m88121d2 = {"Ll/l0g;", "Ll/jic0;", "Ll/l0g$a;", "Lcom/p1/mobile/putong/core/ui/seepage/likers/mytab/FakeLikersMyTabFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/ui/seepage/likers/mytab/FakeLikersMyTabFrag;)V", "Landroid/view/ViewGroup;", "parent", "", "itemViewType", "Landroid/view/View;", "D", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "convertView", Item.TYPE, "position", "", "G", "(Landroid/view/View;Ll/l0g$a;II)V", "getItemViewType", "(I)I", "J", "(I)Ll/l0g$a;", c4s.C_ZONE, "()I", "Ll/l0g$b;", "clickListener", "L", "(Ll/l0g$b;)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "lists", "", "lastReadTime", "K", "(Ljava/util/ArrayList;J)V", "c", "Lcom/p1/mobile/putong/core/ui/seepage/likers/mytab/FakeLikersMyTabFrag;", "getFrag", "()Lcom/p1/mobile/putong/core/ui/seepage/likers/mytab/FakeLikersMyTabFrag;", "setFrag", Constants.INAPP_DATA_TAG, "Ljava/util/ArrayList;", "e", "f", "Ll/l0g$b;", "b", "a", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class l0g extends jic0<InterfaceC18327a> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public FakeLikersMyTabFrag frag;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<InterfaceC18327a> lists;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public long lastReadTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public InterfaceC18328b clickListener;

    /* JADX INFO: renamed from: l.l0g$a */
    @Metadata(m88120d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, m88121d2 = {"Ll/l0g$a;", "", "", "getType", "()I", "Lcom/p1/mobile/putong/data/User;", "getUser", "()Lcom/p1/mobile/putong/data/User;", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public interface InterfaceC18327a {
        int getType();

        @Nullable
        /* JADX INFO: renamed from: getUser */
        User getF186593a();
    }

    /* JADX INFO: renamed from: l.l0g$b */
    @Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, m88121d2 = {"Ll/l0g$b;", "", "Lcom/p1/mobile/putong/data/User;", "user", "", Constants.INAPP_POSITION, "", "a", "(Lcom/p1/mobile/putong/data/User;I)V", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public interface InterfaceC18328b {
        /* JADX INFO: renamed from: a */
        void mo152347a(@NotNull User user, int pos);
    }

    public l0g(@NotNull FakeLikersMyTabFrag fakeLikersMyTabFrag) {
        fakeLikersMyTabFrag.getClass();
        this.frag = fakeLikersMyTabFrag;
        this.lists = new ArrayList<>();
    }

    /* JADX INFO: renamed from: H */
    public static final void m152341H(InterfaceC18327a interfaceC18327a, l0g l0gVar, int i, View view) {
        InterfaceC18328b interfaceC18328b;
        User user = interfaceC18327a.getF186593a();
        if (user == null || (interfaceC18328b = l0gVar.clickListener) == null) {
            return;
        }
        interfaceC18328b.mo152347a(user, i);
    }

    /* JADX INFO: renamed from: I */
    public static final void m152342I(InterfaceC18327a interfaceC18327a, View view, View view2) {
        User user = interfaceC18327a.getF186593a();
        if (user != null) {
            f7d0.INSTANCE.m124436b(user);
        }
        view.performClick();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.lists.size();
    }

    @Override // p153l.jic0
    @NotNull
    /* JADX INFO: renamed from: D */
    public View mo29824D(@NotNull ViewGroup parent, int itemViewType) {
        parent.getClass();
        if (itemViewType == 0) {
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(pec0.f151997i, parent, false);
            viewInflate.getClass();
            return viewInflate;
        }
        if (itemViewType != 1) {
            return new View(parent.getContext());
        }
        Context context = parent.getContext();
        context.getClass();
        PlatformQualificationView platformQualificationView = new PlatformQualificationView(context, null, 0, 6, null);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.setMargins(0, qa00.m175859d(30.0f), 0, qa00.m175859d(84.0f));
        platformQualificationView.setLayoutParams(marginLayoutParams);
        return platformQualificationView;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo29822A(@NotNull final View convertView, @NotNull final InterfaceC18327a item, int itemViewType, final int position) {
        convertView.getClass();
        item.getClass();
        if (itemViewType == 0) {
            FakeLikersItem fakeLikersItem = convertView instanceof FakeLikersItem ? (FakeLikersItem) convertView : null;
            if (fakeLikersItem != null) {
                fakeLikersItem.m56151k(item.getF186593a(), this.lastReadTime);
                fakeLikersItem.setNewLikesBadgesText("刚刚喜欢了我");
                bnl0.m105509E0(convertView, new View.OnClickListener() { // from class: l.j0g
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        l0g.m152341H(item, this, position, view);
                    }
                });
                bnl0.m105509E0(((FakeLikersItem) convertView).f36635m, new View.OnClickListener() { // from class: l.k0g
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        l0g.m152342I(item, convertView, view);
                    }
                });
            }
        }
    }

    @Override // p153l.jic0
    @Nullable
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public InterfaceC18327a getItem(int position) {
        return (InterfaceC18327a) CollectionsKt.getOrNull(this.lists, position);
    }

    /* JADX INFO: renamed from: K */
    public final void m152345K(@NotNull ArrayList<InterfaceC18327a> lists, long lastReadTime) {
        lists.getClass();
        this.lastReadTime = lastReadTime;
        this.lists.clear();
        this.lists.addAll(lists);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: L */
    public final void m152346L(@NotNull InterfaceC18328b clickListener) {
        clickListener.getClass();
        this.clickListener = clickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        InterfaceC18327a interfaceC18327a = (InterfaceC18327a) CollectionsKt.getOrNull(this.lists, position);
        if (interfaceC18327a != null) {
            return interfaceC18327a.getType();
        }
        return -1;
    }
}
