package com.p046p1.mobile.putong.core.newui.newmeet.feed.nearby;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p046p1.mobile.putong.core.data.Item;
import com.p046p1.mobile.putong.core.newui.newmeet.feed.nearby.C8208b;
import com.p046p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.b2s;
import p149l.d30;
import p149l.dac0;
import p149l.k6c0;
import p149l.vwb;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.newmeet.feed.nearby.b */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 42\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000256B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ3\u0010\u0012\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u001d\u001a\u00020\u00112\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\u0002¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R$\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00020*j\b\u0012\u0004\u0012\u00020\u0002`+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00100\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00102¨\u00067"}, m87232d2 = {"Lcom/p1/mobile/putong/core/newui/newmeet/feed/nearby/b;", "Ll/dac0;", "Lcom/p1/mobile/putong/data/User;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/view/ViewGroup;", "parent", "", "itemViewType", "Landroid/view/View;", "D", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "convertView", Item.TYPE, "position", "", "G", "(Landroid/view/View;Lcom/p1/mobile/putong/data/User;II)V", "J", "(I)Lcom/p1/mobile/putong/data/User;", b2s.C_ZONE, "()I", "", "userList", "", "hasPrivilege", "fromMyTab", "L", "(Ljava/util/List;ZZ)V", "Lcom/p1/mobile/putong/core/newui/newmeet/feed/nearby/b$b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "M", "(Lcom/p1/mobile/putong/core/newui/newmeet/feed/nearby/b$b;)V", "user", "K", "(Lcom/p1/mobile/putong/data/User;)Z", "c", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", Constants.INAPP_DATA_TAG, "Ljava/util/ArrayList;", "e", "Lcom/p1/mobile/putong/core/newui/newmeet/feed/nearby/b$b;", "clickListener", "f", "Z", "g", "Companion", "a", "b", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class C8208b extends dac0<User> {

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
    @Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\b¨\u0006\nÀ\u0006\u0003"}, m87232d2 = {"Lcom/p1/mobile/putong/core/newui/newmeet/feed/nearby/b$b;", "", "Lcom/p1/mobile/putong/data/User;", "user", "", Constants.INAPP_POSITION, "", "a", "(Lcom/p1/mobile/putong/data/User;I)V", "b", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo42901a(@NotNull User user, int pos);

        /* JADX INFO: renamed from: b */
        void mo42902b(@NotNull User user, int pos);
    }

    public C8208b(@NotNull Context context) {
        context.getClass();
        this.context = context;
        this.userList = new ArrayList<>();
    }

    /* JADX INFO: renamed from: H */
    public static final void m42930H(User user, C8208b c8208b, int i, View view) {
        zvf0.m220399u("e_suggest_nearby_card", "p_suggest_nearby", vwb.m200311Y("other_user_id", user.f56011id));
        b bVar = c8208b.clickListener;
        if (bVar != null) {
            bVar.mo42901a(user, i);
        }
    }

    /* JADX INFO: renamed from: I */
    public static final void m42931I(C8208b c8208b, User user, int i) {
        b bVar = c8208b.clickListener;
        if (bVar != null) {
            bVar.mo42902b(user, i);
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return Math.min(this.userList.size(), 4);
    }

    @Override // p149l.dac0
    @Nullable
    /* JADX INFO: renamed from: D */
    public View mo28825D(@Nullable ViewGroup parent, int itemViewType) {
        return LayoutInflater.from(this.context).inflate(k6c0.f121414o0, parent, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo28823A(@Nullable View convertView, @Nullable final User item, int itemViewType, final int position) {
        convertView.getClass();
        MeetNearbyUserItemView meetNearbyUserItemView = (MeetNearbyUserItemView) convertView;
        if (item != null) {
            meetNearbyUserItemView.m42923e(item, this.hasPrivilege, this.fromMyTab);
            xdl0.m208342L(convertView, new View.OnClickListener() { // from class: l.o5y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C8208b.m42930H(item, this, position, view);
                }
            });
            meetNearbyUserItemView.setPairingClickAction(new d30() { // from class: l.p5y
                @Override // p149l.d30
                public final void call() {
                    C8208b.m42931I(this.f147344a, item, position);
                }
            });
        }
    }

    @Override // p149l.dac0
    @Nullable
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public User getItem(int position) {
        return this.userList.get(position);
    }

    /* JADX INFO: renamed from: K */
    public final boolean m42934K(@NotNull User user) {
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
    public final void m42935L(@NotNull List<? extends User> userList, boolean hasPrivilege, boolean fromMyTab) {
        userList.getClass();
        this.hasPrivilege = hasPrivilege;
        this.userList.clear();
        this.userList.addAll(userList);
        this.fromMyTab = fromMyTab;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: M */
    public final void m42936M(@NotNull b listener) {
        listener.getClass();
        this.clickListener = listener;
    }
}
