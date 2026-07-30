package p009l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.newui.nearby.NearbyFooterView;
import com.p000p1.mobile.putong.core.newui.nearby.NearbyItemView;
import com.p000p1.mobile.putong.core.newui.nearby.NearbyPresenter;
import com.p1.mobile.putong.data.Links;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import l.d30;
import l.dac0;
import l.j760;
import l.k6c0;
import l.vwb;
import l.xdl0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 82\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00029:B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ3\u0010\u0012\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001e\u001a\u00020\u00112\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\tH\u0016¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\u00020\u00112\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0015\u0010(\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020\u0002¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R'\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00020.j\b\u0012\u0004\u0012\u00020\u0002`/8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0018\u00105\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u00104R\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107¨\u0006;"}, d2 = {"Ll/h820;", "Ll/dac0;", "Lcom/p1/mobile/putong/data/User;", "Lcom/p1/mobile/putong/core/newui/nearby/NearbyPresenter;", "presenter", "<init>", "(Lcom/p1/mobile/putong/core/newui/nearby/NearbyPresenter;)V", "Landroid/view/ViewGroup;", "parent", "", "itemViewType", "Landroid/view/View;", "D", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "convertView", "item", "position", "", "G", "(Landroid/view/View;Lcom/p1/mobile/putong/data/User;II)V", "J", "(I)Lcom/p1/mobile/putong/data/User;", "getItemViewType", "(I)I", "C", "()I", "", "userList", "", "hasPrivilege", "M", "(Ljava/util/List;Z)V", "i", "e", "(I)V", "Ll/h820$b;", "listener", "N", "(Ll/h820$b;)V", "user", "L", "(Lcom/p1/mobile/putong/data/User;)Z", "c", "Lcom/p1/mobile/putong/core/newui/nearby/NearbyPresenter;", "getPresenter", "()Lcom/p1/mobile/putong/core/newui/nearby/NearbyPresenter;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "d", "Ljava/util/ArrayList;", "K", "()Ljava/util/ArrayList;", "Ll/h820$b;", "clickListener", "f", "Z", "Companion", "a", "b", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h820 extends dac0<User> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final NearbyPresenter presenter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<User> userList;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public InterfaceC0929b clickListener;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean hasPrivilege;

    /* JADX INFO: renamed from: l.h820$b */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\b¨\u0006\nÀ\u0006\u0003"}, d2 = {"Ll/h820$b;", "", "Lcom/p1/mobile/putong/data/User;", "user", "", "pos", "", "a", "(Lcom/p1/mobile/putong/data/User;I)V", "b", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface InterfaceC0929b {
        /* JADX INFO: renamed from: a */
        void mo15430a(@NotNull User user, int pos);

        /* JADX INFO: renamed from: b */
        void mo15431b(@NotNull User user, int pos);
    }

    public h820(@NotNull NearbyPresenter nearbyPresenter) {
        nearbyPresenter.getClass();
        this.presenter = nearbyPresenter;
        this.userList = new ArrayList<>();
    }

    /* JADX INFO: renamed from: H */
    public static final void m15418H(User user, h820 h820Var, int i, View view) {
        zvf0.u("e_suggest_nearby_card", "p_suggest_nearby", new j760[]{vwb.Y("other_user_id", ((DbObject) user).id)});
        InterfaceC0929b interfaceC0929b = h820Var.clickListener;
        if (interfaceC0929b != null) {
            interfaceC0929b.mo15430a(user, i);
        }
    }

    /* JADX INFO: renamed from: I */
    public static final void m15419I(h820 h820Var, User user, int i) {
        InterfaceC0929b interfaceC0929b = h820Var.clickListener;
        if (interfaceC0929b != null) {
            interfaceC0929b.mo15431b(user, i);
        }
    }

    /* JADX INFO: renamed from: C */
    public int m15421C() {
        return this.userList.size() + (this.hasPrivilege ? 1 : 0);
    }

    @Nullable
    /* JADX INFO: renamed from: D */
    public View m15422D(@Nullable ViewGroup parent, int itemViewType) {
        if (itemViewType == 1) {
            return LayoutInflater.from(this.presenter.act()).inflate(k6c0.R0, parent, false);
        }
        if (itemViewType != 2) {
            return null;
        }
        return LayoutInflater.from(this.presenter.act()).inflate(k6c0.S0, parent, false);
    }

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void m15420A(@Nullable View convertView, @Nullable final User item, int itemViewType, final int position) {
        if (itemViewType != 1) {
            if (itemViewType != 2) {
                return;
            }
            convertView.getClass();
            xdl0.M((NearbyFooterView) convertView, !this.userList.isEmpty());
            return;
        }
        convertView.getClass();
        NearbyItemView nearbyItemView = (NearbyItemView) convertView;
        if (item != null) {
            nearbyItemView.m6885e(item, this.hasPrivilege);
            xdl0.L(convertView, new View.OnClickListener() { // from class: l.f820
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    h820.m15418H(item, this, position, view);
                }
            });
            nearbyItemView.setPairingClickAction(new d30() { // from class: l.g820
                public final void call() {
                    h820.m15419I(this.f13365a, item, position);
                }
            });
        }
    }

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
    public final ArrayList<User> m15425K() {
        return this.userList;
    }

    /* JADX INFO: renamed from: L */
    public final boolean m15426L(@NotNull User user) {
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
    public final void m15427M(@NotNull List<? extends User> userList, boolean hasPrivilege) {
        userList.getClass();
        this.hasPrivilege = hasPrivilege;
        this.userList.clear();
        this.userList.addAll(userList);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: N */
    public final void m15428N(@NotNull InterfaceC0929b listener) {
        listener.getClass();
        this.clickListener = listener;
    }

    /* JADX INFO: renamed from: e */
    public void m15429e(int i) {
        super.e(i);
        if (!this.hasPrivilege || this.userList.isEmpty() || i < this.userList.size() || !NullChecker.a(this.presenter.getLinks())) {
            return;
        }
        Links linksM6909A0 = this.presenter.getLinks();
        linksM6909A0.getClass();
        if (TextUtils.isEmpty(linksM6909A0.next)) {
            return;
        }
        NearbyPresenter nearbyPresenter = this.presenter;
        nearbyPresenter.m6917I0(nearbyPresenter.getLinks(), false);
    }

    public int getItemViewType(int position) {
        return position == this.userList.size() ? 2 : 1;
    }
}
