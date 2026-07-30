package p006l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.toppicks.C0355a;
import com.p000p1.mobile.putong.core.p004ui.toppicks.TopPicksItemView;
import com.p000p1.mobile.putong.core.p004ui.toppicks.TopPicksUserHeaderView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.ui.profile.ProfileAct;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.TypeIntrinsics;
import l.d30;
import l.dac0;
import l.e30;
import l.lf90;
import l.vwb;
import l.xdl0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001/B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J3\u0010\u0016\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010 \u001a\u00020\u00112\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\"2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\t¢\u0006\u0004\b%\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R$\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u00020*j\b\u0012\u0004\u0012\u00020\u0002`+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u00060"}, d2 = {"Ll/rxi0;", "Ll/dac0;", "Lcom/p1/mobile/putong/data/User;", "Lcom/p1/mobile/putong/core/ui/toppicks/a;", "presenter", "<init>", "(Lcom/p1/mobile/putong/core/ui/toppicks/a;)V", "Landroid/view/ViewGroup;", "parent", "", "itemViewType", "Landroid/view/View;", "D", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "convertView", "item", "J", "(Landroid/view/View;Lcom/p1/mobile/putong/data/User;II)V", "M", "(I)Lcom/p1/mobile/putong/data/User;", "getItemViewType", "(I)I", "C", "()I", "", "userList", "O", "(Ljava/util/List;)V", "", "N", "(Lcom/p1/mobile/putong/data/User;)Z", "P", "c", "Lcom/p1/mobile/putong/core/ui/toppicks/a;", "getPresenter", "()Lcom/p1/mobile/putong/core/ui/toppicks/a;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "d", "Ljava/util/ArrayList;", "Companion", "a", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class rxi0 extends dac0<User> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final C0355a presenter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<User> userList;

    public rxi0(@NotNull C0355a c0355a) {
        c0355a.getClass();
        this.presenter = c0355a;
        this.userList = new ArrayList<>();
    }

    /* JADX INFO: renamed from: E */
    public static void m23444E(final rxi0 rxi0Var, final User user, Boolean bool) {
        Act act = rxi0Var.presenter.act();
        zvf0.r("e_intl_instantmatch_btn", act != null ? act.pageId() : null);
        CoreModule.m1854P().m11706a().m5304Me(rxi0Var.presenter.act(), user, "p_intl_picks_main_page,e_intl_instantmatch_btn,click", new d30() { // from class: l.qxi0
            public final void call() {
                rxi0.m23450L(this.f20142a, user);
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public static void m23445F(rxi0 rxi0Var, User user, final TopPicksItemView topPicksItemView, User user2) {
        if (!xma.m27355L3()) {
            rxi0Var.presenter.m9364D0("p_intl_picks_main_page,e_intl_picks_user_card,click");
            return;
        }
        rxi0Var.presenter.m9363C0(user);
        rxi0Var.presenter.m9362A0(topPicksItemView);
        boolean zM25363L3 = upa.m25363L3();
        C0355a c0355a = rxi0Var.presenter;
        if (zM25363L3) {
            c0355a.getFrag().startActivityForResult(ProfileAct.n2(rxi0Var.presenter.getFrag().act(), ((DbObject) user).id, "intl_top_picks", true), 24);
        } else {
            c0355a.getFrag().v4(ProfileAct.n2(rxi0Var.presenter.getFrag().act(), ((DbObject) user).id, "intl_top_picks", true), 24, new lf90(topPicksItemView, new e30() { // from class: l.pxi0
                public final void call(Object obj) {
                    rxi0.m23449K(topPicksItemView, (Boolean) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: I */
    public static void m23448I(rxi0 rxi0Var, User user, Boolean bool) {
        rxi0Var.presenter.m9374y0(true, user, true);
    }

    /* JADX INFO: renamed from: K */
    public static final void m23449K(TopPicksItemView topPicksItemView, Boolean bool) {
        VLinear vLinear = topPicksItemView.get_personal_info();
        bool.getClass();
        xdl0.M0(vLinear, bool.booleanValue());
    }

    /* JADX INFO: renamed from: L */
    public static final void m23450L(rxi0 rxi0Var, User user) {
        rxi0Var.presenter.m9375z0(user);
    }

    /* JADX INFO: renamed from: C */
    public int m23452C() {
        return this.userList.size() + 1;
    }

    @Nullable
    /* JADX INFO: renamed from: D */
    public View m23453D(@Nullable ViewGroup parent, int itemViewType) {
        LayoutInflater layoutInflaterInflater;
        Act act;
        LayoutInflater layoutInflaterInflater2;
        if (itemViewType != 0) {
            if (itemViewType != 1 || (act = this.presenter.act()) == null || (layoutInflaterInflater2 = act.inflater()) == null) {
                return null;
            }
            return layoutInflaterInflater2.inflate(f6c0.f11990T5, parent, false);
        }
        Act act2 = this.presenter.act();
        if (act2 == null || (layoutInflaterInflater = act2.inflater()) == null) {
            return null;
        }
        return layoutInflaterInflater.inflate(f6c0.f12006U5, parent, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void m23451A(@Nullable View convertView, @Nullable final User item, int itemViewType, int position) {
        if (itemViewType == 0) {
            convertView.getClass();
            ((TopPicksUserHeaderView) convertView).m9346s();
        } else {
            if (itemViewType != 1) {
                return;
            }
            convertView.getClass();
            final TopPicksItemView topPicksItemView = (TopPicksItemView) convertView;
            if (item != null) {
                topPicksItemView.m9337f(item, new e30() { // from class: l.mxi0
                    public final void call(Object obj) {
                        rxi0.m23445F(this.f17353a, item, topPicksItemView, (User) obj);
                    }
                }, new e30() { // from class: l.nxi0
                    public final void call(Object obj) {
                        rxi0.m23448I(this.f17915a, item, (Boolean) obj);
                    }
                }, new e30() { // from class: l.oxi0
                    public final void call(Object obj) {
                        rxi0.m23444E(this.f18476a, item, (Boolean) obj);
                    }
                });
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public User getItem(int position) {
        if (position == 0) {
            return null;
        }
        return this.userList.get(position - 1);
    }

    /* JADX INFO: renamed from: N */
    public final boolean m23456N(@Nullable User item) {
        int iIndexOf = CollectionsKt.contains(this.userList, item) ? CollectionsKt.indexOf(this.userList, item) + 1 : -1;
        if (iIndexOf == -1) {
            notifyDataSetChanged();
            return false;
        }
        TypeIntrinsics.a(this.userList).remove(item);
        if (this.userList.size() > 0) {
            notifyItemRemoved(iIndexOf);
        } else {
            notifyDataSetChanged();
        }
        return true;
    }

    /* JADX INFO: renamed from: O */
    public final void m23457O(@NotNull List<? extends User> userList) {
        userList.getClass();
        this.userList.clear();
        this.userList.addAll(userList);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: P */
    public final int m23458P() {
        if (vwb.J(this.userList)) {
            return 0;
        }
        return this.userList.size();
    }

    public int getItemViewType(int position) {
        return position == 0 ? 0 : 1;
    }

    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        holder.getClass();
        super.onBindViewHolder(holder, position);
        holder.setIsRecyclable(false);
    }
}
