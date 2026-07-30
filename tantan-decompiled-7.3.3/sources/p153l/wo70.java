package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Item;
import com.p051p1.mobile.putong.core.data.PicksTagType;
import com.p051p1.mobile.putong.core.data.PicksUser;
import com.p051p1.mobile.putong.core.p058ui.vip.picks.act.C9132a;
import com.p051p1.mobile.putong.core.p058ui.vip.picks.view.PicksItemView;
import com.p051p1.mobile.putong.core.p058ui.vip.picks.view.header.PicksUserHeaderView;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VRelative;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001+B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ3\u0010\u0012\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001c\u001a\u00020\u00112\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\t¢\u0006\u0004\b!\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R$\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00020&j\b\u0012\u0004\u0012\u00020\u0002`'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006,"}, m88121d2 = {"Ll/wo70;", "Ll/jic0;", "Lcom/p1/mobile/putong/core/data/PicksUser;", "Lcom/p1/mobile/putong/core/ui/vip/picks/act/a;", "presenter", "<init>", "(Lcom/p1/mobile/putong/core/ui/vip/picks/act/a;)V", "Landroid/view/ViewGroup;", "parent", "", "itemViewType", "Landroid/view/View;", "D", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "convertView", Item.TYPE, "position", "", "I", "(Landroid/view/View;Lcom/p1/mobile/putong/core/data/PicksUser;II)V", "M", "(I)Lcom/p1/mobile/putong/core/data/PicksUser;", "getItemViewType", "(I)I", c4s.C_ZONE, "()I", "", "userList", BloodType.f39576O, "(Ljava/util/List;)V", "", "N", "(Lcom/p1/mobile/putong/core/data/PicksUser;)Z", "P", "c", "Lcom/p1/mobile/putong/core/ui/vip/picks/act/a;", "getPresenter", "()Lcom/p1/mobile/putong/core/ui/vip/picks/act/a;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", Constants.INAPP_DATA_TAG, "Ljava/util/ArrayList;", "Companion", "a", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class wo70 extends jic0<PicksUser> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final C9132a presenter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<PicksUser> userList;

    public wo70(@NotNull C9132a c9132a) {
        c9132a.getClass();
        this.presenter = c9132a;
        this.userList = new ArrayList<>();
    }

    /* JADX INFO: renamed from: H */
    public static void m207267H(final wo70 wo70Var, final PicksUser picksUser, final PicksItemView picksItemView, final User user) {
        if (picksUser != null) {
            user.getClass();
            picksItemView.m58004f(picksUser, user, TEnum.equals(picksUser.picksTagType, PicksTagType.masking), new y20() { // from class: l.to70
                @Override // p153l.y20
                public final void call(Object obj) {
                    wo70.m207268J(this.f175364a, picksUser, picksItemView, (User) obj);
                }
            }, new y20() { // from class: l.uo70
                @Override // p153l.y20
                public final void call(Object obj) {
                    wo70.m207270L(this.f180019a, picksUser, user, (Boolean) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: J */
    public static final void m207268J(wo70 wo70Var, PicksUser picksUser, final PicksItemView picksItemView, User user) {
        if (TEnum.equals(picksUser.picksTagType, PicksTagType.masking) || (!joa.m146358H3() && ela.m121122r3() < 1)) {
            wo70Var.presenter.m57973R0(wo70Var.presenter.getFrag().getIsSingleFrag() ? "picks_view_card" : "p_picks_view_membership,e_card,like_swipe");
            return;
        }
        wo70Var.presenter.m57972Q0(picksUser);
        wo70Var.presenter.m57971P0(picksItemView);
        CoreModule.f18273l.m143405a().mo34627wt(wo70Var.presenter.getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), picksUser.f21210id, CoreModule.f18273l.m143405a().mo34300Cc(picksItemView, new y20() { // from class: l.vo70
            @Override // p153l.y20
            public final void call(Object obj) {
                wo70.m207269K(picksItemView, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K */
    public static final void m207269K(PicksItemView picksItemView, Boolean bool) {
        VRelative vRelative = picksItemView.get_personal_info();
        bool.getClass();
        bnl0.m105525M0(vRelative, bool.booleanValue());
    }

    /* JADX INFO: renamed from: L */
    public static final void m207270L(wo70 wo70Var, PicksUser picksUser, User user, Boolean bool) {
        C9132a c9132a = wo70Var.presenter;
        user.getClass();
        c9132a.m57969N0(true, picksUser, user, true);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        if (this.userList.size() == 0) {
            return 0;
        }
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
            return layoutInflaterInflater2.inflate(pec0.f151983e1, parent, false);
        }
        Act act2 = this.presenter.act();
        if (act2 == null || (layoutInflaterInflater = act2.inflater()) == null) {
            return null;
        }
        return layoutInflaterInflater.inflate(pec0.f151987f1, parent, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo29822A(@Nullable View convertView, @Nullable final PicksUser item, int itemViewType, int position) {
        if (itemViewType == 0) {
            convertView.getClass();
            ((PicksUserHeaderView) convertView).m58018b();
        } else {
            if (itemViewType != 1) {
                return;
            }
            convertView.getClass();
            final PicksItemView picksItemView = (PicksItemView) convertView;
            mo68557c(this.presenter.act(), CoreModule.f18264c.f20381e0.m116483Ka(item != null ? item.f21210id : null)).subscribe(psd0.m173596G(new y20() { // from class: l.so70
                @Override // p153l.y20
                public final void call(Object obj) {
                    wo70.m207267H(this.f169851a, item, picksItemView, (User) obj);
                }
            }));
        }
    }

    @Override // p153l.jic0
    @Nullable
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public PicksUser getItem(int position) {
        if (position == 0) {
            return null;
        }
        return this.userList.get(position - 1);
    }

    /* JADX INFO: renamed from: N */
    public final boolean m207273N(@Nullable PicksUser item) {
        int iIndexOf = CollectionsKt.contains(this.userList, item) ? CollectionsKt.indexOf((List<? extends PicksUser>) this.userList, item) + 1 : -1;
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
    public final void m207274O(@NotNull List<? extends PicksUser> userList) {
        userList.getClass();
        this.userList.clear();
        this.userList.addAll(userList);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: P */
    public final int m207275P() {
        if (jyb.m147479J(this.userList)) {
            return 0;
        }
        return this.userList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return position == 0 ? 0 : 1;
    }
}
