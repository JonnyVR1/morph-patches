package p006l;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.vip.likers.LikersBigCardItemView;
import com.p000p1.mobile.putong.core.p004ui.vip.likers.mytab.LikersMyTabFrag;
import com.p1.mobile.putong.core.newui.PlatformQualificationView;
import com.p1.mobile.putong.data.Links;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import l.czc0;
import l.d30;
import l.dac0;
import l.j760;
import l.k6c0;
import l.t100;
import l.vwb;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00011B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001f\u001a\u00020\u00112\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010%\u001a\u00020#2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010\u0006R$\u00100\u001a\u0012\u0012\u0004\u0012\u00020\u00020,j\b\u0012\u0004\u0012\u00020\u0002`-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00062"}, d2 = {"Ll/yir;", "Ll/dac0;", "Ll/yir$a;", "Lcom/p1/mobile/putong/core/ui/vip/likers/mytab/LikersMyTabFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/ui/vip/likers/mytab/LikersMyTabFrag;)V", "Landroid/view/ViewGroup;", "parent", "", "itemViewType", "Landroid/view/View;", "D", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "convertView", "item", "position", "", "H", "(Landroid/view/View;Ll/yir$a;II)V", "i", "e", "(I)V", "getItemViewType", "(I)I", "L", "(I)Ll/yir$a;", "C", "()I", "", "users", "M", "(Ljava/util/List;)V", "Lcom/p1/mobile/putong/data/User;", "user", "", "liked", "A1", "(Lcom/p1/mobile/putong/data/User;Z)Z", "c", "Lcom/p1/mobile/putong/core/ui/vip/likers/mytab/LikersMyTabFrag;", "getFrag", "()Lcom/p1/mobile/putong/core/ui/vip/likers/mytab/LikersMyTabFrag;", "setFrag", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "d", "Ljava/util/ArrayList;", "seeList", "a", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class yir extends dac0<InterfaceC1486a> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public LikersMyTabFrag frag;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<InterfaceC1486a> seeList;

    /* JADX INFO: renamed from: l.yir$a */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Ll/yir$a;", "", "", "getType", "()I", "Lcom/p1/mobile/putong/data/User;", "getUser", "()Lcom/p1/mobile/putong/data/User;", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface InterfaceC1486a {
        int getType();

        @Nullable
        /* JADX INFO: renamed from: getUser */
        User getF17007a();
    }

    public yir(@NotNull LikersMyTabFrag likersMyTabFrag) {
        likersMyTabFrag.getClass();
        this.frag = likersMyTabFrag;
        this.seeList = new ArrayList<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I */
    public static final void m28259I(yir yirVar, User user, LikersBigCardItemView likersBigCardItemView) {
        yirVar.frag.m10180Q4().m18840A0(user);
        yirVar.frag.m10180Q4().m18850z0(likersBigCardItemView);
        CoreModule.f1543l.m11706a().m5518rn(user, yirVar.frag);
    }

    /* JADX INFO: renamed from: J */
    public static final void m28260J(User user, yir yirVar) {
        czc0.Companion.b(user);
        yirVar.frag.m10180Q4().m18841E(user, true, true);
    }

    /* JADX INFO: renamed from: K */
    public static final void m28261K(yir yirVar, User user) {
        zvf0.r("e_see_card_greet", "p_navigation_view");
        yirVar.frag.m10180Q4().m18849y0(user, true, true);
    }

    /* JADX INFO: renamed from: A1 */
    public final boolean m28263A1(@NotNull User user, boolean liked) {
        Object obj;
        user.getClass();
        Iterator<T> it = this.seeList.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            InterfaceC1486a interfaceC1486a = (InterfaceC1486a) next;
            if (interfaceC1486a.getType() == 0) {
                User f17007a = interfaceC1486a.getF17007a();
                if (Intrinsics.d(f17007a != null ? ((DbObject) f17007a).id : null, ((DbObject) user).id)) {
                    obj = next;
                    break;
                }
            }
        }
        InterfaceC1486a interfaceC1486a2 = (InterfaceC1486a) obj;
        int iIndexOf = CollectionsKt.indexOf(this.seeList, interfaceC1486a2);
        if (iIndexOf == -1) {
            return false;
        }
        TypeIntrinsics.a(this.seeList).remove(interfaceC1486a2);
        this.frag.m10177N4().notifyItemRemoved(iIndexOf);
        this.frag.m10177N4().notifyItemRangeChanged(iIndexOf, getItemCount());
        return true;
    }

    /* JADX INFO: renamed from: C */
    public int m28264C() {
        return this.seeList.size();
    }

    @Nullable
    /* JADX INFO: renamed from: D */
    public View m28265D(@NotNull ViewGroup parent, int itemViewType) {
        parent.getClass();
        if (itemViewType == 0) {
            return LayoutInflater.from(parent.getContext()).inflate(k6c0.e0, parent, false);
        }
        if (itemViewType != 1) {
            return new View(parent.getContext());
        }
        Context context = parent.getContext();
        context.getClass();
        PlatformQualificationView platformQualificationView = new PlatformQualificationView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.setMargins(0, t100.d(30.0f), 0, t100.d(16.0f));
        platformQualificationView.setLayoutParams(marginLayoutParams);
        return platformQualificationView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void m28262A(@NotNull View convertView, @NotNull InterfaceC1486a item, int itemViewType, int position) {
        convertView.getClass();
        item.getClass();
        if (itemViewType == 0) {
            final LikersBigCardItemView likersBigCardItemView = convertView instanceof LikersBigCardItemView ? (LikersBigCardItemView) convertView : null;
            if (likersBigCardItemView != null) {
                likersBigCardItemView.setNewLikesBadgesText("刚刚喜欢了我");
                final User f17007a = item.getF17007a();
                if (f17007a != null) {
                    Long lastReadTime = this.frag.m10180Q4().getLastReadTime();
                    lastReadTime.getClass();
                    likersBigCardItemView.m10010t(f17007a, lastReadTime.longValue());
                    zvf0.A("e_see_likes_me_card", "p_navigation_view", new j760[]{vwb.Y("see_card_source", CoreModule.f1534c.f3676u0.m2420y5(f17007a) ? "instant_chat" : "see")});
                    likersBigCardItemView.m10008q(new d30() { // from class: l.vir
                        public final void call() {
                            yir.m28259I(this.f24339a, f17007a, likersBigCardItemView);
                        }
                    }, new d30() { // from class: l.wir
                        public final void call() {
                            yir.m28260J(f17007a, this);
                        }
                    }, new d30() { // from class: l.xir
                        public final void call() {
                            yir.m28261K(this.f27541a, f17007a);
                        }
                    });
                }
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public InterfaceC1486a getItem(int position) {
        InterfaceC1486a interfaceC1486a = this.seeList.get(position);
        interfaceC1486a.getClass();
        return interfaceC1486a;
    }

    /* JADX INFO: renamed from: M */
    public final void m28268M(@NotNull List<? extends InterfaceC1486a> users) {
        users.getClass();
        this.seeList.clear();
        List<? extends InterfaceC1486a> list = users;
        if (!vwb.J(list)) {
            this.seeList.addAll(list);
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: e */
    public void m28269e(int i) {
        Links links = this.frag.m10180Q4().getLinks();
        if (links == null || this.seeList.isEmpty() || i != this.seeList.size() - 1 || !NullChecker.a(links.next)) {
            return;
        }
        this.frag.m10180Q4().m18847u0(links);
    }

    public int getItemViewType(int position) {
        return this.seeList.get(position).getType();
    }
}
