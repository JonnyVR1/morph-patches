package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Item;
import com.p046p1.mobile.putong.core.data.PicksTagType;
import com.p046p1.mobile.putong.core.data.PicksUser;
import com.p046p1.mobile.putong.core.p053ui.vip.picks.act.C8969a;
import com.p046p1.mobile.putong.core.p053ui.vip.picks.view.PicksItemView;
import com.p046p1.mobile.putong.core.p053ui.vip.picks.view.header.PicksUserHeaderView;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VRelative;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001+B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ3\u0010\u0012\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001c\u001a\u00020\u00112\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\t¢\u0006\u0004\b!\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R$\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00020&j\b\u0012\u0004\u0012\u00020\u0002`'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006,"}, m87232d2 = {"Ll/qg70;", "Ll/dac0;", "Lcom/p1/mobile/putong/core/data/PicksUser;", "Lcom/p1/mobile/putong/core/ui/vip/picks/act/a;", "presenter", "<init>", "(Lcom/p1/mobile/putong/core/ui/vip/picks/act/a;)V", "Landroid/view/ViewGroup;", "parent", "", "itemViewType", "Landroid/view/View;", "D", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "convertView", Item.TYPE, "position", "", "I", "(Landroid/view/View;Lcom/p1/mobile/putong/core/data/PicksUser;II)V", "M", "(I)Lcom/p1/mobile/putong/core/data/PicksUser;", "getItemViewType", "(I)I", b2s.C_ZONE, "()I", "", "userList", BloodType.f38728O, "(Ljava/util/List;)V", "", "N", "(Lcom/p1/mobile/putong/core/data/PicksUser;)Z", "P", "c", "Lcom/p1/mobile/putong/core/ui/vip/picks/act/a;", "getPresenter", "()Lcom/p1/mobile/putong/core/ui/vip/picks/act/a;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", Constants.INAPP_DATA_TAG, "Ljava/util/ArrayList;", "Companion", "a", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class qg70 extends dac0<PicksUser> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final C8969a presenter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<PicksUser> userList;

    public qg70(@NotNull C8969a c8969a) {
        c8969a.getClass();
        this.presenter = c8969a;
        this.userList = new ArrayList<>();
    }

    /* JADX INFO: renamed from: H */
    public static void m174387H(final qg70 qg70Var, final PicksUser picksUser, final PicksItemView picksItemView, final User user) {
        if (picksUser != null) {
            user.getClass();
            picksItemView.m56821f(picksUser, user, TEnum.equals(picksUser.picksTagType, PicksTagType.masking), new e30() { // from class: l.ng70
                @Override // p149l.e30
                public final void call(Object obj) {
                    qg70.m174388J(this.f138843a, picksUser, picksItemView, (User) obj);
                }
            }, new e30() { // from class: l.og70
                @Override // p149l.e30
                public final void call(Object obj) {
                    qg70.m174390L(this.f143825a, picksUser, user, (Boolean) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: J */
    public static final void m174388J(qg70 qg70Var, PicksUser picksUser, final PicksItemView picksItemView, User user) {
        if (TEnum.equals(picksUser.picksTagType, PicksTagType.masking) || (!xma.m210044G3() && sja.m184461r3() < 1)) {
            qg70Var.presenter.m56790R0(qg70Var.presenter.getFrag().getIsSingleFrag() ? "picks_view_card" : "p_picks_view_membership,e_card,like_swipe");
            return;
        }
        qg70Var.presenter.m56789Q0(picksUser);
        qg70Var.presenter.m56788P0(picksItemView);
        CoreModule.f17554l.m94651a().mo33624wt(qg70Var.presenter.getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), picksUser.f20468id, CoreModule.f17554l.m94651a().mo33297Cc(picksItemView, new e30() { // from class: l.pg70
            @Override // p149l.e30
            public final void call(Object obj) {
                qg70.m174389K(picksItemView, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K */
    public static final void m174389K(PicksItemView picksItemView, Boolean bool) {
        VRelative vRelative = picksItemView.get_personal_info();
        bool.getClass();
        xdl0.m208345M0(vRelative, bool.booleanValue());
    }

    /* JADX INFO: renamed from: L */
    public static final void m174390L(qg70 qg70Var, PicksUser picksUser, User user, Boolean bool) {
        C8969a c8969a = qg70Var.presenter;
        user.getClass();
        c8969a.m56786N0(true, picksUser, user, true);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        if (this.userList.size() == 0) {
            return 0;
        }
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
            return layoutInflaterInflater2.inflate(k6c0.f121375e1, parent, false);
        }
        Act act2 = this.presenter.act();
        if (act2 == null || (layoutInflaterInflater = act2.inflater()) == null) {
            return null;
        }
        return layoutInflaterInflater.inflate(k6c0.f121379f1, parent, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo28823A(@Nullable View convertView, @Nullable final PicksUser item, int itemViewType, int position) {
        if (itemViewType == 0) {
            convertView.getClass();
            ((PicksUserHeaderView) convertView).m56835b();
        } else {
            if (itemViewType != 1) {
                return;
            }
            convertView.getClass();
            final PicksItemView picksItemView = (PicksItemView) convertView;
            mo67374c(this.presenter.act(), CoreModule.f17545c.f19639e0.m169410Ka(item != null ? item.f20468id : null)).subscribe(mkd0.m154955G(new e30() { // from class: l.mg70
                @Override // p149l.e30
                public final void call(Object obj) {
                    qg70.m174387H(this.f133658a, item, picksItemView, (User) obj);
                }
            }));
        }
    }

    @Override // p149l.dac0
    @Nullable
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public PicksUser getItem(int position) {
        if (position == 0) {
            return null;
        }
        return this.userList.get(position - 1);
    }

    /* JADX INFO: renamed from: N */
    public final boolean m174393N(@Nullable PicksUser item) {
        int iIndexOf = CollectionsKt.contains(this.userList, item) ? CollectionsKt.indexOf((List<? extends PicksUser>) this.userList, item) + 1 : -1;
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
    public final void m174394O(@NotNull List<? extends PicksUser> userList) {
        userList.getClass();
        this.userList.clear();
        this.userList.addAll(userList);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: P */
    public final int m174395P() {
        if (vwb.m200296J(this.userList)) {
            return 0;
        }
        return this.userList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return position == 0 ? 0 : 1;
    }
}
