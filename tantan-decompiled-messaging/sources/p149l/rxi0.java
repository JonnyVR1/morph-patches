package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Item;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct;
import com.p046p1.mobile.putong.core.p053ui.toppicks.C8919a;
import com.p046p1.mobile.putong.core.p053ui.toppicks.TopPicksItemView;
import com.p046p1.mobile.putong.core.p053ui.toppicks.TopPicksUserHeaderView;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VLinear;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001/B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J3\u0010\u0016\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010 \u001a\u00020\u00112\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\"2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\t¢\u0006\u0004\b%\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R$\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u00020*j\b\u0012\u0004\u0012\u00020\u0002`+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u00060"}, m87232d2 = {"Ll/rxi0;", "Ll/dac0;", "Lcom/p1/mobile/putong/data/User;", "Lcom/p1/mobile/putong/core/ui/toppicks/a;", "presenter", "<init>", "(Lcom/p1/mobile/putong/core/ui/toppicks/a;)V", "Landroid/view/ViewGroup;", "parent", "", "itemViewType", "Landroid/view/View;", "D", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "convertView", Item.TYPE, "J", "(Landroid/view/View;Lcom/p1/mobile/putong/data/User;II)V", "M", "(I)Lcom/p1/mobile/putong/data/User;", "getItemViewType", "(I)I", b2s.C_ZONE, "()I", "", "userList", BloodType.f38728O, "(Ljava/util/List;)V", "", "N", "(Lcom/p1/mobile/putong/data/User;)Z", "P", "c", "Lcom/p1/mobile/putong/core/ui/toppicks/a;", "getPresenter", "()Lcom/p1/mobile/putong/core/ui/toppicks/a;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", Constants.INAPP_DATA_TAG, "Ljava/util/ArrayList;", "Companion", "a", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class rxi0 extends dac0<User> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final C8919a presenter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<User> userList;

    public rxi0(@NotNull C8919a c8919a) {
        c8919a.getClass();
        this.presenter = c8919a;
        this.userList = new ArrayList<>();
    }

    /* JADX INFO: renamed from: E */
    public static void m181599E(final rxi0 rxi0Var, final User user, Boolean bool) {
        Act act = rxi0Var.presenter.act();
        zvf0.m220396r("e_intl_instantmatch_btn", act != null ? act.pageId() : null);
        CoreModule.m29935P().m94651a().mo33367Me(rxi0Var.presenter.act(), user, "p_intl_picks_main_page,e_intl_instantmatch_btn,click", new d30() { // from class: l.qxi0
            @Override // p149l.d30
            public final void call() {
                rxi0.m181605L(this.f156846a, user);
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public static void m181600F(rxi0 rxi0Var, User user, final TopPicksItemView topPicksItemView, User user2) {
        if (!xma.m210047L3()) {
            rxi0Var.presenter.m55959D0("p_intl_picks_main_page,e_intl_picks_user_card,click");
            return;
        }
        rxi0Var.presenter.m55958C0(user);
        rxi0Var.presenter.m55957A0(topPicksItemView);
        boolean zM194665L3 = upa.m194665L3();
        C8919a c8919a = rxi0Var.presenter;
        if (zM194665L3) {
            c8919a.getFrag().startActivityForResult(ProfileAct.m50736n2(rxi0Var.presenter.getFrag().act(), user.f56011id, "intl_top_picks", true), 24);
        } else {
            c8919a.getFrag().m20602v4(ProfileAct.m50736n2(rxi0Var.presenter.getFrag().act(), user.f56011id, "intl_top_picks", true), 24, new lf90(topPicksItemView, new e30() { // from class: l.pxi0
                @Override // p149l.e30
                public final void call(Object obj) {
                    rxi0.m181604K(topPicksItemView, (Boolean) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: I */
    public static void m181603I(rxi0 rxi0Var, User user, Boolean bool) {
        rxi0Var.presenter.m55967y0(true, user, true);
    }

    /* JADX INFO: renamed from: K */
    public static final void m181604K(TopPicksItemView topPicksItemView, Boolean bool) {
        VLinear vLinear = topPicksItemView.get_personal_info();
        bool.getClass();
        xdl0.m208345M0(vLinear, bool.booleanValue());
    }

    /* JADX INFO: renamed from: L */
    public static final void m181605L(rxi0 rxi0Var, User user) {
        rxi0Var.presenter.m55968z0(user);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.userList.size() + 1;
    }

    @Override // p149l.dac0
    @Nullable
    /* JADX INFO: renamed from: D */
    public View mo28825D(@Nullable ViewGroup parent, int itemViewType) {
        LayoutInflater layoutInflaterInflater;
        Act act;
        LayoutInflater layoutInflaterInflater2;
        if (itemViewType != 0) {
            if (itemViewType != 1 || (act = this.presenter.act()) == null || (layoutInflaterInflater2 = act.inflater()) == null) {
                return null;
            }
            return layoutInflaterInflater2.inflate(f6c0.f95576T5, parent, false);
        }
        Act act2 = this.presenter.act();
        if (act2 == null || (layoutInflaterInflater = act2.inflater()) == null) {
            return null;
        }
        return layoutInflaterInflater.inflate(f6c0.f95592U5, parent, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo28823A(@Nullable View convertView, @Nullable final User item, int itemViewType, int position) {
        if (itemViewType == 0) {
            convertView.getClass();
            ((TopPicksUserHeaderView) convertView).m55941s();
        } else {
            if (itemViewType != 1) {
                return;
            }
            convertView.getClass();
            final TopPicksItemView topPicksItemView = (TopPicksItemView) convertView;
            if (item != null) {
                topPicksItemView.m55935f(item, new e30() { // from class: l.mxi0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        rxi0.m181600F(this.f136177a, item, topPicksItemView, (User) obj);
                    }
                }, new e30() { // from class: l.nxi0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        rxi0.m181603I(this.f141026a, item, (Boolean) obj);
                    }
                }, new e30() { // from class: l.oxi0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        rxi0.m181599E(this.f146215a, item, (Boolean) obj);
                    }
                });
            }
        }
    }

    @Override // p149l.dac0
    @Nullable
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public User getItem(int position) {
        if (position == 0) {
            return null;
        }
        return this.userList.get(position - 1);
    }

    /* JADX INFO: renamed from: N */
    public final boolean m181608N(@Nullable User item) {
        int iIndexOf = CollectionsKt.contains(this.userList, item) ? CollectionsKt.indexOf((List<? extends User>) this.userList, item) + 1 : -1;
        if (iIndexOf == -1) {
            notifyDataSetChanged();
            return false;
        }
        TypeIntrinsics.m87534a(this.userList).remove(item);
        if (this.userList.size() > 0) {
            notifyItemRemoved(iIndexOf);
        } else {
            notifyDataSetChanged();
        }
        return true;
    }

    /* JADX INFO: renamed from: O */
    public final void m181609O(@NotNull List<? extends User> userList) {
        userList.getClass();
        this.userList.clear();
        this.userList.addAll(userList);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: P */
    public final int m181610P() {
        if (vwb.m200296J(this.userList)) {
            return 0;
        }
        return this.userList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return position == 0 ? 0 : 1;
    }

    @Override // p149l.dac0, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.AbstractC0566d0 holder, int position) {
        holder.getClass();
        super.onBindViewHolder(holder, position);
        holder.setIsRecyclable(false);
    }
}
