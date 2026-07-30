package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Item;
import com.p051p1.mobile.putong.core.newui.PlatformQualificationView;
import com.p051p1.mobile.putong.core.p058ui.vip.likers.LikersBigCardItemView;
import com.p051p1.mobile.putong.core.p058ui.vip.likers.mytab.LikersMyTabFrag;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00011B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001f\u001a\u00020\u00112\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010%\u001a\u00020#2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010\u0006R$\u00100\u001a\u0012\u0012\u0004\u0012\u00020\u00020,j\b\u0012\u0004\u0012\u00020\u0002`-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00062"}, m88121d2 = {"Ll/zkr;", "Ll/jic0;", "Ll/zkr$a;", "Lcom/p1/mobile/putong/core/ui/vip/likers/mytab/LikersMyTabFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/ui/vip/likers/mytab/LikersMyTabFrag;)V", "Landroid/view/ViewGroup;", "parent", "", "itemViewType", "Landroid/view/View;", "D", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "convertView", Item.TYPE, "position", "", "H", "(Landroid/view/View;Ll/zkr$a;II)V", RXScreenCaptureService.KEY_INDEX, "e", "(I)V", "getItemViewType", "(I)I", "L", "(I)Ll/zkr$a;", c4s.C_ZONE, "()I", "", "users", "M", "(Ljava/util/List;)V", "Lcom/p1/mobile/putong/data/User;", "user", "", "liked", "A1", "(Lcom/p1/mobile/putong/data/User;Z)Z", "c", "Lcom/p1/mobile/putong/core/ui/vip/likers/mytab/LikersMyTabFrag;", "getFrag", "()Lcom/p1/mobile/putong/core/ui/vip/likers/mytab/LikersMyTabFrag;", "setFrag", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", Constants.INAPP_DATA_TAG, "Ljava/util/ArrayList;", "seeList", "a", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class zkr extends jic0<InterfaceC21831a> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public LikersMyTabFrag frag;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<InterfaceC21831a> seeList;

    /* JADX INFO: renamed from: l.zkr$a */
    @Metadata(m88120d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, m88121d2 = {"Ll/zkr$a;", "", "", "getType", "()I", "Lcom/p1/mobile/putong/data/User;", "getUser", "()Lcom/p1/mobile/putong/data/User;", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public interface InterfaceC21831a {
        int getType();

        @Nullable
        /* JADX INFO: renamed from: getUser */
        User getF142587a();
    }

    public zkr(@NotNull LikersMyTabFrag likersMyTabFrag) {
        likersMyTabFrag.getClass();
        this.frag = likersMyTabFrag;
        this.seeList = new ArrayList<>();
    }

    /* JADX INFO: renamed from: I */
    public static final void m220134I(zkr zkrVar, User user, LikersBigCardItemView likersBigCardItemView) {
        zkrVar.frag.m57904Q4().m158938A0(user);
        zkrVar.frag.m57904Q4().m158946z0(likersBigCardItemView);
        CoreModule.f18273l.m143405a().mo34584rn(user, zkrVar.frag);
    }

    /* JADX INFO: renamed from: J */
    public static final void m220135J(User user, zkr zkrVar) {
        f7d0.INSTANCE.m124436b(user);
        zkrVar.frag.m57904Q4().m158939E(user, true, true);
    }

    /* JADX INFO: renamed from: K */
    public static final void m220136K(zkr zkrVar, User user) {
        i4g0.m138520r("e_see_card_greet", OMSDialogPositon.p_navigation_view);
        zkrVar.frag.m57904Q4().m158945y0(user, true, true);
    }

    /* JADX INFO: renamed from: A1 */
    public final boolean m220137A1(@NotNull User user, boolean liked) {
        Object obj;
        user.getClass();
        Iterator<T> it = this.seeList.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            InterfaceC21831a interfaceC21831a = (InterfaceC21831a) next;
            if (interfaceC21831a.getType() == 0) {
                User user2 = interfaceC21831a.getF142587a();
                if (Intrinsics.m88377d(user2 != null ? user2.f56859id : null, user.f56859id)) {
                    obj = next;
                    break;
                }
            }
        }
        InterfaceC21831a interfaceC21831a2 = (InterfaceC21831a) obj;
        int iIndexOf = CollectionsKt.indexOf((List<? extends InterfaceC21831a>) this.seeList, interfaceC21831a2);
        if (iIndexOf == -1) {
            return false;
        }
        TypeIntrinsics.m88423a(this.seeList).remove(interfaceC21831a2);
        this.frag.m57901N4().notifyItemRemoved(iIndexOf);
        this.frag.m57901N4().notifyItemRangeChanged(iIndexOf, getItemCount());
        return true;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.seeList.size();
    }

    @Override // p153l.jic0
    @Nullable
    /* JADX INFO: renamed from: D */
    public View mo29824D(@NotNull ViewGroup parent, int itemViewType) {
        parent.getClass();
        if (itemViewType == 0) {
            return LayoutInflater.from(parent.getContext()).inflate(pec0.f151982e0, parent, false);
        }
        if (itemViewType != 1) {
            return new View(parent.getContext());
        }
        Context context = parent.getContext();
        context.getClass();
        PlatformQualificationView platformQualificationView = new PlatformQualificationView(context, null, 0, 6, null);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.setMargins(0, qa00.m175859d(30.0f), 0, qa00.m175859d(16.0f));
        platformQualificationView.setLayoutParams(marginLayoutParams);
        return platformQualificationView;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo29822A(@NotNull View convertView, @NotNull InterfaceC21831a item, int itemViewType, int position) {
        convertView.getClass();
        item.getClass();
        if (itemViewType == 0) {
            final LikersBigCardItemView likersBigCardItemView = convertView instanceof LikersBigCardItemView ? (LikersBigCardItemView) convertView : null;
            if (likersBigCardItemView != null) {
                likersBigCardItemView.setNewLikesBadgesText("刚刚喜欢了我");
                final User user = item.getF142587a();
                if (user != null) {
                    Long lastReadTime = this.frag.m57904Q4().getLastReadTime();
                    lastReadTime.getClass();
                    likersBigCardItemView.m57751t(user, lastReadTime.longValue());
                    i4g0.m138492A("e_see_likes_me_card", OMSDialogPositon.p_navigation_view, jyb.m147494Y("see_card_source", CoreModule.f18264c.f20429u0.m31381C5(user) ? "instant_chat" : "see"));
                    likersBigCardItemView.m57749q(new x20() { // from class: l.wkr
                        @Override // p153l.x20
                        public final void call() {
                            zkr.m220134I(this.f189586a, user, likersBigCardItemView);
                        }
                    }, new x20() { // from class: l.xkr
                        @Override // p153l.x20
                        public final void call() {
                            zkr.m220135J(user, this);
                        }
                    }, new x20() { // from class: l.ykr
                        @Override // p153l.x20
                        public final void call() {
                            zkr.m220136K(this.f200437a, user);
                        }
                    });
                }
            }
        }
    }

    @Override // p153l.jic0
    @NotNull
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public InterfaceC21831a getItem(int position) {
        InterfaceC21831a interfaceC21831a = this.seeList.get(position);
        interfaceC21831a.getClass();
        return interfaceC21831a;
    }

    /* JADX INFO: renamed from: M */
    public final void m220140M(@NotNull List<? extends InterfaceC21831a> users) {
        users.getClass();
        this.seeList.clear();
        List<? extends InterfaceC21831a> list = users;
        if (!jyb.m147479J(list)) {
            this.seeList.addAll(list);
        }
        notifyDataSetChanged();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: e */
    public void mo48510e(int i) {
        Links links = this.frag.m57904Q4().getLinks();
        if (links == null || this.seeList.isEmpty() || i != this.seeList.size() - 1 || !NullChecker.m82486a(links.next)) {
            return;
        }
        this.frag.m57904Q4().m158943u0(links);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return this.seeList.get(position).getType();
    }
}
