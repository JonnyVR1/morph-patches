package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Item;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import com.p051p1.mobile.putong.core.p058ui.toppicks.C9082a;
import com.p051p1.mobile.putong.core.p058ui.toppicks.TopPicksItemView;
import com.p051p1.mobile.putong.core.p058ui.toppicks.TopPicksUserHeaderView;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VLinear;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001/B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J3\u0010\u0016\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010 \u001a\u00020\u00112\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\"2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\t¢\u0006\u0004\b%\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R$\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u00020*j\b\u0012\u0004\u0012\u00020\u0002`+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u00060"}, m88121d2 = {"Ll/v6j0;", "Ll/jic0;", "Lcom/p1/mobile/putong/data/User;", "Lcom/p1/mobile/putong/core/ui/toppicks/a;", "presenter", "<init>", "(Lcom/p1/mobile/putong/core/ui/toppicks/a;)V", "Landroid/view/ViewGroup;", "parent", "", "itemViewType", "Landroid/view/View;", "D", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "Landroidx/recyclerview/widget/RecyclerView$e0;", "holder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$e0;I)V", "convertView", Item.TYPE, "J", "(Landroid/view/View;Lcom/p1/mobile/putong/data/User;II)V", "M", "(I)Lcom/p1/mobile/putong/data/User;", "getItemViewType", "(I)I", c4s.C_ZONE, "()I", "", "userList", BloodType.f39576O, "(Ljava/util/List;)V", "", "N", "(Lcom/p1/mobile/putong/data/User;)Z", "P", "c", "Lcom/p1/mobile/putong/core/ui/toppicks/a;", "getPresenter", "()Lcom/p1/mobile/putong/core/ui/toppicks/a;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", Constants.INAPP_DATA_TAG, "Ljava/util/ArrayList;", "Companion", "a", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class v6j0 extends jic0<User> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final C9082a presenter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<User> userList;

    public v6j0(@NotNull C9082a c9082a) {
        c9082a.getClass();
        this.presenter = c9082a;
        this.userList = new ArrayList<>();
    }

    /* JADX INFO: renamed from: E */
    public static void m200064E(final v6j0 v6j0Var, final User user, Boolean bool) {
        Act act = v6j0Var.presenter.act();
        i4g0.m138520r("e_intl_instantmatch_btn", act != null ? act.pageId() : null);
        CoreModule.m30933P().m143405a().mo34370Me(v6j0Var.presenter.act(), user, "p_intl_picks_main_page,e_intl_instantmatch_btn,click", new x20() { // from class: l.u6j0
            @Override // p153l.x20
            public final void call() {
                v6j0.m200070L(this.f177790a, user);
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public static void m200065F(v6j0 v6j0Var, User user, final TopPicksItemView topPicksItemView, User user2) {
        if (!joa.m146361M3()) {
            v6j0Var.presenter.m57142D0("p_intl_picks_main_page,e_intl_picks_user_card,click");
            return;
        }
        v6j0Var.presenter.m57141C0(user);
        v6j0Var.presenter.m57140A0(topPicksItemView);
        boolean zM131596L3 = gra.m131596L3();
        C9082a c9082a = v6j0Var.presenter;
        if (zM131596L3) {
            c9082a.getFrag().startActivityForResult(ProfileAct.m51920o2(v6j0Var.presenter.getFrag().act(), user.f56859id, "intl_top_picks", true), 24);
        } else {
            c9082a.getFrag().m21601v4(ProfileAct.m51920o2(v6j0Var.presenter.getFrag().act(), user.f56859id, "intl_top_picks", true), 24, new pn90(topPicksItemView, new y20() { // from class: l.t6j0
                @Override // p153l.y20
                public final void call(Object obj) {
                    v6j0.m200069K(topPicksItemView, (Boolean) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: I */
    public static void m200068I(v6j0 v6j0Var, User user, Boolean bool) {
        v6j0Var.presenter.m57150y0(true, user, true);
    }

    /* JADX INFO: renamed from: K */
    public static final void m200069K(TopPicksItemView topPicksItemView, Boolean bool) {
        VLinear vLinear = topPicksItemView.get_personal_info();
        bool.getClass();
        bnl0.m105525M0(vLinear, bool.booleanValue());
    }

    /* JADX INFO: renamed from: L */
    public static final void m200070L(v6j0 v6j0Var, User user) {
        v6j0Var.presenter.m57151z0(user);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.userList.size() + 1;
    }

    @Override // p153l.jic0
    @Nullable
    /* JADX INFO: renamed from: D */
    public View mo29824D(@Nullable ViewGroup parent, int itemViewType) {
        LayoutInflater layoutInflaterInflater;
        Act act;
        LayoutInflater layoutInflaterInflater2;
        if (itemViewType != 0) {
            if (itemViewType != 1 || (act = this.presenter.act()) == null || (layoutInflaterInflater2 = act.inflater()) == null) {
                return null;
            }
            return layoutInflaterInflater2.inflate(kec0.f125646U5, parent, false);
        }
        Act act2 = this.presenter.act();
        if (act2 == null || (layoutInflaterInflater = act2.inflater()) == null) {
            return null;
        }
        return layoutInflaterInflater.inflate(kec0.f125662V5, parent, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo29822A(@Nullable View convertView, @Nullable final User item, int itemViewType, int position) {
        if (itemViewType == 0) {
            convertView.getClass();
            ((TopPicksUserHeaderView) convertView).m57124s();
        } else {
            if (itemViewType != 1) {
                return;
            }
            convertView.getClass();
            final TopPicksItemView topPicksItemView = (TopPicksItemView) convertView;
            if (item != null) {
                topPicksItemView.m57118f(item, new y20() { // from class: l.q6j0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        v6j0.m200065F(this.f155819a, item, topPicksItemView, (User) obj);
                    }
                }, new y20() { // from class: l.r6j0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        v6j0.m200068I(this.f161477a, item, (Boolean) obj);
                    }
                }, new y20() { // from class: l.s6j0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        v6j0.m200064E(this.f166580a, item, (Boolean) obj);
                    }
                });
            }
        }
    }

    @Override // p153l.jic0
    @Nullable
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public User getItem(int position) {
        if (position == 0) {
            return null;
        }
        return this.userList.get(position - 1);
    }

    /* JADX INFO: renamed from: N */
    public final boolean m200073N(@Nullable User item) {
        int iIndexOf = CollectionsKt.contains(this.userList, item) ? CollectionsKt.indexOf((List<? extends User>) this.userList, item) + 1 : -1;
        if (iIndexOf == -1) {
            notifyDataSetChanged();
            return false;
        }
        TypeIntrinsics.m88423a(this.userList).remove(item);
        if (this.userList.size() > 0) {
            notifyItemRemoved(iIndexOf);
        } else {
            notifyDataSetChanged();
        }
        return true;
    }

    /* JADX INFO: renamed from: O */
    public final void m200074O(@NotNull List<? extends User> userList) {
        userList.getClass();
        this.userList.clear();
        this.userList.addAll(userList);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: P */
    public final int m200075P() {
        if (jyb.m147479J(this.userList)) {
            return 0;
        }
        return this.userList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return position == 0 ? 0 : 1;
    }

    @Override // p153l.jic0, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.AbstractC0569e0 holder, int position) {
        holder.getClass();
        super.onBindViewHolder(holder, position);
        holder.setIsRecyclable(false);
    }
}
