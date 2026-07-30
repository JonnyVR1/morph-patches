package p153l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p051p1.mobile.putong.core.data.Item;
import com.p051p1.mobile.putong.core.newui.nearby.NearbyFooterView;
import com.p051p1.mobile.putong.core.newui.onlinezone.OnlineZoneItemView;
import com.p051p1.mobile.putong.core.newui.onlinezone.OnlineZonePresenter;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.data.User;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 82\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00029:B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ3\u0010\u0012\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001e\u001a\u00020\u00112\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\tH\u0016¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\u00020\u00112\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0015\u0010(\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020\u0002¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R'\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00020.j\b\u0012\u0004\u0012\u00020\u0002`/8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0018\u00105\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u00104R\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107¨\u0006;"}, m88121d2 = {"Ll/iq50;", "Ll/jic0;", "Lcom/p1/mobile/putong/data/User;", "Lcom/p1/mobile/putong/core/newui/onlinezone/OnlineZonePresenter;", "presenter", "<init>", "(Lcom/p1/mobile/putong/core/newui/onlinezone/OnlineZonePresenter;)V", "Landroid/view/ViewGroup;", "parent", "", "itemViewType", "Landroid/view/View;", "D", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "convertView", Item.TYPE, "position", "", "G", "(Landroid/view/View;Lcom/p1/mobile/putong/data/User;II)V", "J", "(I)Lcom/p1/mobile/putong/data/User;", "getItemViewType", "(I)I", c4s.C_ZONE, "()I", "", "userList", "", "hasPrivilege", "M", "(Ljava/util/List;Z)V", RXScreenCaptureService.KEY_INDEX, "e", "(I)V", "Ll/iq50$b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "N", "(Ll/iq50$b;)V", "user", "L", "(Lcom/p1/mobile/putong/data/User;)Z", "c", "Lcom/p1/mobile/putong/core/newui/onlinezone/OnlineZonePresenter;", "getPresenter", "()Lcom/p1/mobile/putong/core/newui/onlinezone/OnlineZonePresenter;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", Constants.INAPP_DATA_TAG, "Ljava/util/ArrayList;", "K", "()Ljava/util/ArrayList;", "Ll/iq50$b;", "clickListener", "f", "Z", "Companion", "a", "b", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class iq50 extends jic0<User> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final OnlineZonePresenter presenter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<User> userList;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public InterfaceC17773b clickListener;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean hasPrivilege;

    /* JADX INFO: renamed from: l.iq50$b */
    @Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\b¨\u0006\nÀ\u0006\u0003"}, m88121d2 = {"Ll/iq50$b;", "", "Lcom/p1/mobile/putong/data/User;", "user", "", Constants.INAPP_POSITION, "", "a", "(Lcom/p1/mobile/putong/data/User;I)V", "b", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public interface InterfaceC17773b {
        /* JADX INFO: renamed from: a */
        void mo106866a(@NotNull User user, int pos);

        /* JADX INFO: renamed from: b */
        void mo106867b(@NotNull User user, int pos);
    }

    public iq50(@NotNull OnlineZonePresenter onlineZonePresenter) {
        onlineZonePresenter.getClass();
        this.presenter = onlineZonePresenter;
        this.userList = new ArrayList<>();
    }

    /* JADX INFO: renamed from: H */
    public static final void m141651H(iq50 iq50Var, User user, int i, View view) {
        InterfaceC17773b interfaceC17773b = iq50Var.clickListener;
        if (interfaceC17773b != null) {
            interfaceC17773b.mo106866a(user, i);
        }
    }

    /* JADX INFO: renamed from: I */
    public static final void m141652I(iq50 iq50Var, User user, int i) {
        InterfaceC17773b interfaceC17773b = iq50Var.clickListener;
        if (interfaceC17773b != null) {
            interfaceC17773b.mo106867b(user, i);
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.userList.size() + (this.hasPrivilege ? 1 : 0);
    }

    @Override // p153l.jic0
    @Nullable
    /* JADX INFO: renamed from: D */
    public View mo29824D(@Nullable ViewGroup parent, int itemViewType) {
        if (itemViewType == 1) {
            return LayoutInflater.from(this.presenter.act()).inflate(pec0.f151963Z0, parent, false);
        }
        if (itemViewType != 2) {
            return null;
        }
        return LayoutInflater.from(this.presenter.act()).inflate(pec0.f151942S0, parent, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo29822A(@Nullable View convertView, @Nullable final User item, int itemViewType, final int position) {
        if (itemViewType != 1) {
            if (itemViewType != 2) {
                return;
            }
            convertView.getClass();
            bnl0.m105524M((NearbyFooterView) convertView, !this.userList.isEmpty());
            return;
        }
        convertView.getClass();
        OnlineZoneItemView onlineZoneItemView = (OnlineZoneItemView) convertView;
        if (item != null) {
            onlineZoneItemView.m44068d(item, this.hasPrivilege);
            bnl0.m105522L(convertView, new View.OnClickListener() { // from class: l.gq50
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    iq50.m141651H(this.f105651a, item, position, view);
                }
            });
            onlineZoneItemView.setSuperLikeClickAction(new x20() { // from class: l.hq50
                @Override // p153l.x20
                public final void call() {
                    iq50.m141652I(this.f111088a, item, position);
                }
            });
        }
    }

    @Override // p153l.jic0
    @Nullable
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public User getItem(int position) {
        if (position == this.userList.size()) {
            return null;
        }
        return this.userList.get(position);
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final ArrayList<User> m141655K() {
        return this.userList;
    }

    /* JADX INFO: renamed from: L */
    public final boolean m141656L(@NotNull User user) {
        user.getClass();
        int iIndexOf = this.userList.indexOf(user);
        if (iIndexOf == -1) {
            return false;
        }
        this.userList.remove(user);
        notifyItemRemoved(iIndexOf);
        notifyItemRangeChanged(iIndexOf, getItemCount());
        return true;
    }

    /* JADX INFO: renamed from: M */
    public final void m141657M(@NotNull List<? extends User> userList, boolean hasPrivilege) {
        userList.getClass();
        this.hasPrivilege = hasPrivilege;
        this.userList.clear();
        this.userList.addAll(userList);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: N */
    public final void m141658N(@NotNull InterfaceC17773b listener) {
        listener.getClass();
        this.clickListener = listener;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: e */
    public void mo48510e(int i) {
        super.mo48510e(i);
        if (!this.hasPrivilege || this.userList.isEmpty() || i < this.userList.size() || !NullChecker.m82486a(this.presenter.getLinks())) {
            return;
        }
        Links links = this.presenter.getLinks();
        links.getClass();
        if (TextUtils.isEmpty(links.next)) {
            return;
        }
        OnlineZonePresenter onlineZonePresenter = this.presenter;
        onlineZonePresenter.m44109U0(onlineZonePresenter.getLinks(), false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return position == this.userList.size() ? 2 : 1;
    }
}
