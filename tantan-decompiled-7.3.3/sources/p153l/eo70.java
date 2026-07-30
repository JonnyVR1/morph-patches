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
import com.p051p1.mobile.putong.core.member.module.CoreMemberModule;
import com.p051p1.mobile.putong.core.p058ui.vip.picks.view.PicksItemView;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0012\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001a\u001a\u00020\u00112\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\t¢\u0006\u0004\b\u001f\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R$\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00020$j\b\u0012\u0004\u0012\u00020\u0002`%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, m88121d2 = {"Ll/eo70;", "Ll/jic0;", "Lcom/p1/mobile/putong/core/data/PicksUser;", "Ll/sm70;", "presenter", "<init>", "(Ll/sm70;)V", "Landroid/view/ViewGroup;", "parent", "", "itemViewType", "Landroid/view/View;", "D", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "convertView", Item.TYPE, "position", "", "H", "(Landroid/view/View;Lcom/p1/mobile/putong/core/data/PicksUser;II)V", "K", "(I)Lcom/p1/mobile/putong/core/data/PicksUser;", c4s.C_ZONE, "()I", "", "list", "N", "(Ljava/util/List;)V", "", "M", "(Lcom/p1/mobile/putong/core/data/PicksUser;)Z", "L", "c", "Ll/sm70;", "getPresenter", "()Ll/sm70;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", Constants.INAPP_DATA_TAG, "Ljava/util/ArrayList;", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class eo70 extends jic0<PicksUser> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final sm70 presenter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<PicksUser> list;

    public eo70(@NotNull sm70 sm70Var) {
        sm70Var.getClass();
        this.presenter = sm70Var;
        this.list = new ArrayList<>();
    }

    /* JADX INFO: renamed from: E */
    public static void m121727E(final PicksItemView picksItemView, final PicksUser picksUser, final eo70 eo70Var, final User user) {
        user.getClass();
        picksItemView.m58004f(picksUser, user, TEnum.equals(picksUser.picksTagType, PicksTagType.masking), new y20() { // from class: l.co70
            @Override // p153l.y20
            public final void call(Object obj) {
                eo70.m121730I(this.f82817a, picksUser, picksItemView, (User) obj);
            }
        }, new y20() { // from class: l.do70
            @Override // p153l.y20
            public final void call(Object obj) {
                eo70.m121731J(this.f89895a, picksUser, user, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: I */
    public static final void m121730I(eo70 eo70Var, PicksUser picksUser, PicksItemView picksItemView, User user) {
        if (TEnum.equals(picksUser.picksTagType, PicksTagType.masking) || (!joa.m146358H3() && ela.m121122r3() < 1)) {
            eo70Var.presenter.m186774s0("picks_module_card");
            return;
        }
        eo70Var.presenter.m186772q0(picksUser);
        eo70Var.presenter.m186771p0(picksItemView);
        CoreMemberModule.m37004F().m187693b().mo36981Ra(picksItemView.get_personal_info(), eo70Var.presenter.act(), picksUser.f21210id, picksItemView);
    }

    /* JADX INFO: renamed from: J */
    public static final void m121731J(eo70 eo70Var, PicksUser picksUser, User user, Boolean bool) {
        sm70 sm70Var = eo70Var.presenter;
        user.getClass();
        sm70Var.m186770o0(true, picksUser, user, true);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        if (this.list.size() > 4) {
            return 4;
        }
        return this.list.size();
    }

    @Override // p153l.jic0
    @Nullable
    /* JADX INFO: renamed from: D */
    public View mo29824D(@Nullable ViewGroup parent, int itemViewType) {
        LayoutInflater layoutInflaterInflater;
        if (parent != null) {
            parent.setClipChildren(false);
        }
        Act act = this.presenter.act();
        if (act == null || (layoutInflaterInflater = act.inflater()) == null) {
            return null;
        }
        return layoutInflaterInflater.inflate(pec0.f151983e1, parent, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo29822A(@Nullable View convertView, @NotNull final PicksUser item, int itemViewType, int position) {
        item.getClass();
        convertView.getClass();
        final PicksItemView picksItemView = (PicksItemView) convertView;
        mo68557c(this.presenter.act(), CoreModule.f18264c.f20381e0.m116483Ka(item.f21210id)).subscribe(psd0.m173596G(new y20() { // from class: l.bo70
            @Override // p153l.y20
            public final void call(Object obj) {
                eo70.m121727E(picksItemView, item, this, (User) obj);
            }
        }));
    }

    @Override // p153l.jic0
    @NotNull
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public PicksUser getItem(int position) {
        PicksUser picksUser = this.list.get(position);
        picksUser.getClass();
        return picksUser;
    }

    /* JADX INFO: renamed from: L */
    public final int m121734L() {
        return this.list.size();
    }

    /* JADX INFO: renamed from: M */
    public final boolean m121735M(@Nullable PicksUser item) {
        int iIndexOf = CollectionsKt.contains(this.list, item) ? CollectionsKt.indexOf((List<? extends PicksUser>) this.list, item) + 1 : -1;
        if (iIndexOf == -1) {
            notifyDataSetChanged();
            return false;
        }
        TypeIntrinsics.m88423a(this.list).remove(item);
        if (this.list.size() > 0) {
            notifyItemRemoved(iIndexOf);
        } else {
            notifyDataSetChanged();
        }
        return true;
    }

    /* JADX INFO: renamed from: N */
    public final void m121736N(@NotNull List<? extends PicksUser> list) {
        list.getClass();
        this.list.clear();
        this.list.addAll(list);
        notifyDataSetChanged();
    }
}
