package com.p000p1.mobile.putong.core.newui.newmeet.feed.nearby;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.newui.newmeet.feed.nearby.C0372b;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
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

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.newmeet.feed.nearby.b */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 42\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000256B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ3\u0010\u0012\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u001d\u001a\u00020\u00112\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\u0002¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R$\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00020*j\b\u0012\u0004\u0012\u00020\u0002`+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00100\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00102¨\u00067"}, d2 = {"Lcom/p1/mobile/putong/core/newui/newmeet/feed/nearby/b;", "Ll/dac0;", "Lcom/p1/mobile/putong/data/User;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/view/ViewGroup;", "parent", "", "itemViewType", "Landroid/view/View;", "D", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "convertView", "item", "position", "", "G", "(Landroid/view/View;Lcom/p1/mobile/putong/data/User;II)V", "J", "(I)Lcom/p1/mobile/putong/data/User;", "C", "()I", "", "userList", "", "hasPrivilege", "fromMyTab", "L", "(Ljava/util/List;ZZ)V", "Lcom/p1/mobile/putong/core/newui/newmeet/feed/nearby/b$b;", "listener", "M", "(Lcom/p1/mobile/putong/core/newui/newmeet/feed/nearby/b$b;)V", "user", "K", "(Lcom/p1/mobile/putong/data/User;)Z", "c", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "d", "Ljava/util/ArrayList;", "e", "Lcom/p1/mobile/putong/core/newui/newmeet/feed/nearby/b$b;", "clickListener", "f", "Z", "g", "Companion", "a", "b", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class C0372b extends dac0<User> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<User> userList;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public b clickListener;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean hasPrivilege;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public boolean fromMyTab;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.newmeet.feed.nearby.b$b */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\b¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/p1/mobile/putong/core/newui/newmeet/feed/nearby/b$b;", "", "Lcom/p1/mobile/putong/data/User;", "user", "", "pos", "", "a", "(Lcom/p1/mobile/putong/data/User;I)V", "b", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo7083a(@NotNull User user, int pos);

        /* JADX INFO: renamed from: b */
        void mo7084b(@NotNull User user, int pos);
    }

    public C0372b(@NotNull Context context) {
        context.getClass();
        this.context = context;
        this.userList = new ArrayList<>();
    }

    /* JADX INFO: renamed from: H */
    public static final void m7122H(User user, C0372b c0372b, int i, View view) {
        zvf0.u("e_suggest_nearby_card", "p_suggest_nearby", new j760[]{vwb.Y("other_user_id", ((DbObject) user).id)});
        b bVar = c0372b.clickListener;
        if (bVar != null) {
            bVar.mo7083a(user, i);
        }
    }

    /* JADX INFO: renamed from: I */
    public static final void m7123I(C0372b c0372b, User user, int i) {
        b bVar = c0372b.clickListener;
        if (bVar != null) {
            bVar.mo7084b(user, i);
        }
    }

    /* JADX INFO: renamed from: C */
    public int m7125C() {
        return Math.min(this.userList.size(), 4);
    }

    @Nullable
    /* JADX INFO: renamed from: D */
    public View m7126D(@Nullable ViewGroup parent, int itemViewType) {
        return LayoutInflater.from(this.context).inflate(k6c0.o0, parent, false);
    }

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void m7124A(@Nullable View convertView, @Nullable final User item, int itemViewType, final int position) {
        convertView.getClass();
        MeetNearbyUserItemView meetNearbyUserItemView = (MeetNearbyUserItemView) convertView;
        if (item != null) {
            meetNearbyUserItemView.m7105e(item, this.hasPrivilege, this.fromMyTab);
            xdl0.L(convertView, new View.OnClickListener() { // from class: l.o5y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C0372b.m7122H(item, this, position, view);
                }
            });
            meetNearbyUserItemView.setPairingClickAction(new d30() { // from class: l.p5y
                public final void call() {
                    C0372b.m7123I(this.f18400a, item, position);
                }
            });
        }
    }

    @Nullable
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public User getItem(int position) {
        return this.userList.get(position);
    }

    /* JADX INFO: renamed from: K */
    public final boolean m7129K(@NotNull User user) {
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

    /* JADX INFO: renamed from: L */
    public final void m7130L(@NotNull List<? extends User> userList, boolean hasPrivilege, boolean fromMyTab) {
        userList.getClass();
        this.hasPrivilege = hasPrivilege;
        this.userList.clear();
        this.userList.addAll(userList);
        this.fromMyTab = fromMyTab;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: M */
    public final void m7131M(@NotNull b listener) {
        listener.getClass();
        this.clickListener = listener;
    }
}
