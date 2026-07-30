package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Item;
import com.p046p1.mobile.putong.core.newui.PlatformQualificationView;
import com.p046p1.mobile.putong.core.p053ui.vip.likers.LikersBigCardItemView;
import com.p046p1.mobile.putong.core.p053ui.vip.likers.mytab.LikersMyTabFrag;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00011B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001f\u001a\u00020\u00112\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010%\u001a\u00020#2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010\u0006R$\u00100\u001a\u0012\u0012\u0004\u0012\u00020\u00020,j\b\u0012\u0004\u0012\u00020\u0002`-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00062"}, m87232d2 = {"Ll/yir;", "Ll/dac0;", "Ll/yir$a;", "Lcom/p1/mobile/putong/core/ui/vip/likers/mytab/LikersMyTabFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/ui/vip/likers/mytab/LikersMyTabFrag;)V", "Landroid/view/ViewGroup;", "parent", "", "itemViewType", "Landroid/view/View;", "D", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "convertView", Item.TYPE, "position", "", "H", "(Landroid/view/View;Ll/yir$a;II)V", RXScreenCaptureService.KEY_INDEX, "e", "(I)V", "getItemViewType", "(I)I", "L", "(I)Ll/yir$a;", b2s.C_ZONE, "()I", "", "users", "M", "(Ljava/util/List;)V", "Lcom/p1/mobile/putong/data/User;", "user", "", "liked", "A1", "(Lcom/p1/mobile/putong/data/User;Z)Z", "c", "Lcom/p1/mobile/putong/core/ui/vip/likers/mytab/LikersMyTabFrag;", "getFrag", "()Lcom/p1/mobile/putong/core/ui/vip/likers/mytab/LikersMyTabFrag;", "setFrag", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", Constants.INAPP_DATA_TAG, "Ljava/util/ArrayList;", "seeList", "a", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class yir extends dac0<InterfaceC21414a> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public LikersMyTabFrag frag;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<InterfaceC21414a> seeList;

    /* JADX INFO: renamed from: l.yir$a */
    @Metadata(m87231d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, m87232d2 = {"Ll/yir$a;", "", "", "getType", "()I", "Lcom/p1/mobile/putong/data/User;", "getUser", "()Lcom/p1/mobile/putong/data/User;", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public interface InterfaceC21414a {
        int getType();

        @Nullable
        /* JADX INFO: renamed from: getUser */
        User getF134233a();
    }

    public yir(@NotNull LikersMyTabFrag likersMyTabFrag) {
        likersMyTabFrag.getClass();
        this.frag = likersMyTabFrag;
        this.seeList = new ArrayList<>();
    }

    /* JADX INFO: renamed from: I */
    public static final void m215013I(yir yirVar, User user, LikersBigCardItemView likersBigCardItemView) {
        yirVar.frag.m56721Q4().m150028A0(user);
        yirVar.frag.m56721Q4().m150036z0(likersBigCardItemView);
        CoreModule.f17554l.m94651a().mo33581rn(user, yirVar.frag);
    }

    /* JADX INFO: renamed from: J */
    public static final void m215014J(User user, yir yirVar) {
        czc0.INSTANCE.m109407b(user);
        yirVar.frag.m56721Q4().m150029E(user, true, true);
    }

    /* JADX INFO: renamed from: K */
    public static final void m215015K(yir yirVar, User user) {
        zvf0.m220396r("e_see_card_greet", OMSDialogPositon.p_navigation_view);
        yirVar.frag.m56721Q4().m150035y0(user, true, true);
    }

    /* JADX INFO: renamed from: A1 */
    public final boolean m215016A1(@NotNull User user, boolean liked) {
        Object obj;
        user.getClass();
        Iterator<T> it = this.seeList.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            InterfaceC21414a interfaceC21414a = (InterfaceC21414a) next;
            if (interfaceC21414a.getType() == 0) {
                User user2 = interfaceC21414a.getF134233a();
                if (Intrinsics.m87488d(user2 != null ? user2.f56011id : null, user.f56011id)) {
                    obj = next;
                    break;
                }
            }
        }
        InterfaceC21414a interfaceC21414a2 = (InterfaceC21414a) obj;
        int iIndexOf = CollectionsKt.indexOf((List<? extends InterfaceC21414a>) this.seeList, interfaceC21414a2);
        if (iIndexOf == -1) {
            return false;
        }
        TypeIntrinsics.m87534a(this.seeList).remove(interfaceC21414a2);
        this.frag.m56718N4().notifyItemRemoved(iIndexOf);
        this.frag.m56718N4().notifyItemRangeChanged(iIndexOf, getItemCount());
        return true;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.seeList.size();
    }

    @Override // p149l.dac0
    @Nullable
    /* JADX INFO: renamed from: D */
    public View mo28825D(@NotNull ViewGroup parent, int itemViewType) {
        parent.getClass();
        if (itemViewType == 0) {
            return LayoutInflater.from(parent.getContext()).inflate(k6c0.f121374e0, parent, false);
        }
        if (itemViewType != 1) {
            return new View(parent.getContext());
        }
        Context context = parent.getContext();
        context.getClass();
        PlatformQualificationView platformQualificationView = new PlatformQualificationView(context, null, 0, 6, null);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.setMargins(0, t100.m186890d(30.0f), 0, t100.m186890d(16.0f));
        platformQualificationView.setLayoutParams(marginLayoutParams);
        return platformQualificationView;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo28823A(@NotNull View convertView, @NotNull InterfaceC21414a item, int itemViewType, int position) {
        convertView.getClass();
        item.getClass();
        if (itemViewType == 0) {
            final LikersBigCardItemView likersBigCardItemView = convertView instanceof LikersBigCardItemView ? (LikersBigCardItemView) convertView : null;
            if (likersBigCardItemView != null) {
                likersBigCardItemView.setNewLikesBadgesText("刚刚喜欢了我");
                final User user = item.getF134233a();
                if (user != null) {
                    Long lastReadTime = this.frag.m56721Q4().getLastReadTime();
                    lastReadTime.getClass();
                    likersBigCardItemView.m56568t(user, lastReadTime.longValue());
                    zvf0.m220368A("e_see_likes_me_card", OMSDialogPositon.p_navigation_view, vwb.m200311Y("see_card_source", CoreModule.f17545c.f19687u0.m30492y5(user) ? "instant_chat" : "see"));
                    likersBigCardItemView.m56566q(new d30() { // from class: l.vir
                        @Override // p149l.d30
                        public final void call() {
                            yir.m215013I(this.f181634a, user, likersBigCardItemView);
                        }
                    }, new d30() { // from class: l.wir
                        @Override // p149l.d30
                        public final void call() {
                            yir.m215014J(user, this);
                        }
                    }, new d30() { // from class: l.xir
                        @Override // p149l.d30
                        public final void call() {
                            yir.m215015K(this.f193151a, user);
                        }
                    });
                }
            }
        }
    }

    @Override // p149l.dac0
    @NotNull
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public InterfaceC21414a getItem(int position) {
        InterfaceC21414a interfaceC21414a = this.seeList.get(position);
        interfaceC21414a.getClass();
        return interfaceC21414a;
    }

    /* JADX INFO: renamed from: M */
    public final void m215019M(@NotNull List<? extends InterfaceC21414a> users) {
        users.getClass();
        this.seeList.clear();
        List<? extends InterfaceC21414a> list = users;
        if (!vwb.m200296J(list)) {
            this.seeList.addAll(list);
        }
        notifyDataSetChanged();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: e */
    public void mo47327e(int i) {
        Links links = this.frag.m56721Q4().getLinks();
        if (links == null || this.seeList.isEmpty() || i != this.seeList.size() - 1 || !NullChecker.m81303a(links.next)) {
            return;
        }
        this.frag.m56721Q4().m150033u0(links);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return this.seeList.get(position).getType();
    }
}
