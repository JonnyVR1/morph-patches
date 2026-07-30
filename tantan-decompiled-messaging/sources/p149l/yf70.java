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
import com.p046p1.mobile.putong.core.member.module.CoreMemberModule;
import com.p046p1.mobile.putong.core.p053ui.vip.picks.view.PicksItemView;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0012\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001a\u001a\u00020\u00112\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\t¢\u0006\u0004\b\u001f\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R$\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00020$j\b\u0012\u0004\u0012\u00020\u0002`%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, m87232d2 = {"Ll/yf70;", "Ll/dac0;", "Lcom/p1/mobile/putong/core/data/PicksUser;", "Ll/me70;", "presenter", "<init>", "(Ll/me70;)V", "Landroid/view/ViewGroup;", "parent", "", "itemViewType", "Landroid/view/View;", "D", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "convertView", Item.TYPE, "position", "", "H", "(Landroid/view/View;Lcom/p1/mobile/putong/core/data/PicksUser;II)V", "K", "(I)Lcom/p1/mobile/putong/core/data/PicksUser;", b2s.C_ZONE, "()I", "", "list", "N", "(Ljava/util/List;)V", "", "M", "(Lcom/p1/mobile/putong/core/data/PicksUser;)Z", "L", "c", "Ll/me70;", "getPresenter", "()Ll/me70;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", Constants.INAPP_DATA_TAG, "Ljava/util/ArrayList;", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class yf70 extends dac0<PicksUser> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final me70 presenter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<PicksUser> list;

    public yf70(@NotNull me70 me70Var) {
        me70Var.getClass();
        this.presenter = me70Var;
        this.list = new ArrayList<>();
    }

    /* JADX INFO: renamed from: E */
    public static void m214482E(final PicksItemView picksItemView, final PicksUser picksUser, final yf70 yf70Var, final User user) {
        user.getClass();
        picksItemView.m56821f(picksUser, user, TEnum.equals(picksUser.picksTagType, PicksTagType.masking), new e30() { // from class: l.wf70
            @Override // p149l.e30
            public final void call(Object obj) {
                yf70.m214485I(this.f186066a, picksUser, picksItemView, (User) obj);
            }
        }, new e30() { // from class: l.xf70
            @Override // p149l.e30
            public final void call(Object obj) {
                yf70.m214486J(this.f192665a, picksUser, user, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: I */
    public static final void m214485I(yf70 yf70Var, PicksUser picksUser, PicksItemView picksItemView, User user) {
        if (TEnum.equals(picksUser.picksTagType, PicksTagType.masking) || (!xma.m210044G3() && sja.m184461r3() < 1)) {
            yf70Var.presenter.m154163s0("picks_module_card");
            return;
        }
        yf70Var.presenter.m154161q0(picksUser);
        yf70Var.presenter.m154160p0(picksItemView);
        CoreMemberModule.m36001F().m132651b().mo35978Ra(picksItemView.get_personal_info(), yf70Var.presenter.act(), picksUser.f20468id, picksItemView);
    }

    /* JADX INFO: renamed from: J */
    public static final void m214486J(yf70 yf70Var, PicksUser picksUser, User user, Boolean bool) {
        me70 me70Var = yf70Var.presenter;
        user.getClass();
        me70Var.m154159o0(true, picksUser, user, true);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        if (this.list.size() > 4) {
            return 4;
        }
        return this.list.size();
    }

    @Override // p149l.dac0
    @Nullable
    /* JADX INFO: renamed from: D */
    public View mo28825D(@Nullable ViewGroup parent, int itemViewType) {
        LayoutInflater layoutInflaterInflater;
        if (parent != null) {
            parent.setClipChildren(false);
        }
        Act act = this.presenter.act();
        if (act == null || (layoutInflaterInflater = act.inflater()) == null) {
            return null;
        }
        return layoutInflaterInflater.inflate(k6c0.f121375e1, parent, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo28823A(@Nullable View convertView, @NotNull final PicksUser item, int itemViewType, int position) {
        item.getClass();
        convertView.getClass();
        final PicksItemView picksItemView = (PicksItemView) convertView;
        mo67374c(this.presenter.act(), CoreModule.f17545c.f19639e0.m169410Ka(item.f20468id)).subscribe(mkd0.m154955G(new e30() { // from class: l.vf70
            @Override // p149l.e30
            public final void call(Object obj) {
                yf70.m214482E(picksItemView, item, this, (User) obj);
            }
        }));
    }

    @Override // p149l.dac0
    @NotNull
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public PicksUser getItem(int position) {
        PicksUser picksUser = this.list.get(position);
        picksUser.getClass();
        return picksUser;
    }

    /* JADX INFO: renamed from: L */
    public final int m214489L() {
        return this.list.size();
    }

    /* JADX INFO: renamed from: M */
    public final boolean m214490M(@Nullable PicksUser item) {
        int iIndexOf = CollectionsKt.contains(this.list, item) ? CollectionsKt.indexOf((List<? extends PicksUser>) this.list, item) + 1 : -1;
        if (iIndexOf == -1) {
            notifyDataSetChanged();
            return false;
        }
        TypeIntrinsics.m87534a(this.list).remove(item);
        if (this.list.size() > 0) {
            notifyItemRemoved(iIndexOf);
        } else {
            notifyDataSetChanged();
        }
        return true;
    }

    /* JADX INFO: renamed from: N */
    public final void m214491N(@NotNull List<? extends PicksUser> list) {
        list.getClass();
        this.list.clear();
        this.list.addAll(list);
        notifyDataSetChanged();
    }
}
