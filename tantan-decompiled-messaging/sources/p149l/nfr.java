package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Item;
import com.p046p1.mobile.putong.core.data.LikedUser;
import com.p046p1.mobile.putong.core.member.R$string;
import com.p046p1.mobile.putong.core.p053ui.likedusers.LikedUserHeaderView;
import com.p046p1.mobile.putong.core.p053ui.likedusers.LikedUserItemView;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m87231d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 82\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00029:B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u000fH\u0016¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020\t2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J-\u0010)\u001a\u00020\t2\u0016\u0010(\u001a\u0012\u0012\u0004\u0012\u00020\u00020&j\b\u0012\u0004\u0012\u00020\u0002`'2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b)\u0010*J\u0015\u0010-\u001a\u00020\"2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\u000f¢\u0006\u0004\b/\u0010\u001eR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u0010\u0006R&\u0010(\u001a\u0012\u0012\u0004\u0012\u00020\u00020&j\b\u0012\u0004\u0012\u00020\u0002`'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u00107¨\u0006;"}, m87232d2 = {"Ll/nfr;", "Ll/dac0;", "Ll/nfr$b;", "Ll/bgr;", "presenter", "<init>", "(Ll/bgr;)V", "Lcom/p1/mobile/putong/core/ui/likedusers/LikedUserItemView;", "itemView", "", "Q", "(Lcom/p1/mobile/putong/core/ui/likedusers/LikedUserItemView;)V", j6f.GPS_MEASUREMENT_INTERRUPTED, "Landroid/view/ViewGroup;", "parent", "", "itemViewType", "Landroid/view/View;", "D", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "convertView", Item.TYPE, "position", "J", "(Landroid/view/View;Ll/nfr$b;II)V", "getItemViewType", "(I)I", "P", "(I)Ll/nfr$b;", b2s.C_ZONE, "()I", RXScreenCaptureService.KEY_INDEX, "e", "(I)V", "", "hasPrivilege", "R", "(Z)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "itemList", j6f.GPS_DIRECTION_TRUE, "(Ljava/util/ArrayList;Z)V", "Lcom/p1/mobile/putong/core/data/LikedUser;", "user", j6f.LATITUDE_SOUTH, "(Lcom/p1/mobile/putong/core/data/LikedUser;)Z", "U", "c", "Ll/bgr;", "getPresenter", "()Ll/bgr;", "setPresenter", Constants.INAPP_DATA_TAG, "Ljava/util/ArrayList;", "Z", "Companion", "a", "b", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class nfr extends dac0<InterfaceC18690b> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public bgr presenter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public ArrayList<InterfaceC18690b> itemList;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public boolean hasPrivilege;

    /* JADX INFO: renamed from: l.nfr$b */
    @Metadata(m87231d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, m87232d2 = {"Ll/nfr$b;", "", "", "getItemType", "()I", "Lcom/p1/mobile/putong/core/data/LikedUser;", "a", "()Lcom/p1/mobile/putong/core/data/LikedUser;", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public interface InterfaceC18690b {
        @Nullable
        /* JADX INFO: renamed from: a */
        LikedUser mo116316a();

        int getItemType();
    }

    public nfr(@NotNull bgr bgrVar) {
        bgrVar.getClass();
        this.presenter = bgrVar;
        this.itemList = new ArrayList<>();
    }

    /* JADX INFO: renamed from: K */
    public static final void m159265K(final LikedUserItemView likedUserItemView, final LikedUser likedUser, final nfr nfrVar, final int i, final int i2, final User user) {
        user.getClass();
        if (NullChecker.m81303a(user.localRelationship)) {
            Relationship relationship = user.localRelationship;
            relationship.getClass();
            if (TEnum.equals(relationship.state, "matched")) {
                e51.m114742G(new Runnable() { // from class: l.jfr
                    @Override // java.lang.Runnable
                    public final void run() {
                        nfr.m159266L(this.f117684a, likedUser);
                    }
                });
                return;
            }
        }
        likedUserItemView.m46799h(likedUser, user, !nfrVar.hasPrivilege && i >= i2, new e30() { // from class: l.kfr
            @Override // p149l.e30
            public final void call(Object obj) {
                nfr.m159267M(this.f122960a, user, i, i2, likedUserItemView, (LikedUser) obj);
            }
        }, new e30() { // from class: l.lfr
            @Override // p149l.e30
            public final void call(Object obj) {
                nfr.m159269O(this.f127917a, likedUser, user, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: L */
    public static final void m159266L(nfr nfrVar, LikedUser likedUser) {
        nfrVar.presenter.m101703J0(likedUser);
    }

    /* JADX INFO: renamed from: M */
    public static final void m159267M(final nfr nfrVar, User user, int i, int i2, final LikedUserItemView likedUserItemView, LikedUser likedUser) {
        likedUser.getClass();
        if (nfrVar.presenter.m101707t0(user)) {
            return;
        }
        if (!nfrVar.hasPrivilege && i >= i2) {
            nfrVar.presenter.m101704L0("p_navigation,ilike_module");
            return;
        }
        bgr bgrVar = nfrVar.presenter;
        bgrVar.f75487c = likedUser;
        bgrVar.f75486b = likedUserItemView;
        if (TEnum.equals(likedUser.status, "superliked") || TEnum.equals(likedUser.status, "lettered")) {
            CoreModule.f17545c.f19625Z0.m163931f4(likedUser.f20432id);
        }
        CoreModule.m29935P().m94651a().mo33441Xc(nfrVar.presenter.f75485a, likedUser.f20432id, likedUserItemView, new e30() { // from class: l.mfr
            @Override // p149l.e30
            public final void call(Object obj) {
                nfr.m159268N(this.f133615a, likedUserItemView, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public static final void m159268N(nfr nfrVar, LikedUserItemView likedUserItemView, boolean z) {
        if (z) {
            nfrVar.m159271V(likedUserItemView);
        } else {
            nfrVar.m159270Q(likedUserItemView);
        }
    }

    /* JADX INFO: renamed from: O */
    public static final void m159269O(nfr nfrVar, LikedUser likedUser, User user, Boolean bool) {
        bgr bgrVar = nfrVar.presenter;
        bool.getClass();
        bgrVar.m101702I0(bool.booleanValue(), likedUser, user, true);
    }

    /* JADX INFO: renamed from: Q */
    private final void m159270Q(LikedUserItemView itemView) {
        xdl0.m208345M0(itemView.f29974b, false);
        xdl0.m208344M(itemView.f29983k, false);
    }

    /* JADX INFO: renamed from: V */
    private final void m159271V(LikedUserItemView itemView) {
        xdl0.m208345M0(itemView.f29974b, true);
        if (TEnum.equals(itemView.f29987o.status, "superliked")) {
            xdl0.m208344M(itemView.f29983k, true);
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.itemList.size();
    }

    @Override // p149l.dac0
    @NotNull
    /* JADX INFO: renamed from: D */
    public View mo28825D(@NotNull ViewGroup parent, int itemViewType) {
        LayoutInflater layoutInflaterInflater;
        View viewInflate;
        LayoutInflater layoutInflaterInflater2;
        View viewInflate2;
        parent.getClass();
        if (itemViewType == 0) {
            Act act = this.presenter.act();
            return (act == null || (layoutInflaterInflater = act.inflater()) == null || (viewInflate = layoutInflaterInflater.inflate(k6c0.f121366c0, parent, false)) == null) ? new View(this.presenter.m142773Y()) : viewInflate;
        }
        if (itemViewType != 2) {
            Act act2 = this.presenter.act();
            return (act2 == null || (layoutInflaterInflater2 = act2.inflater()) == null || (viewInflate2 = layoutInflaterInflater2.inflate(k6c0.f121362b0, parent, false)) == null) ? new View(this.presenter.m142773Y()) : viewInflate2;
        }
        View view = new View(this.presenter.m142773Y());
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, 1));
        return view;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo28823A(@NotNull View convertView, @NotNull InterfaceC18690b item, int itemViewType, final int position) {
        convertView.getClass();
        item.getClass();
        if (itemViewType == 0) {
            ((LikedUserHeaderView) convertView).m46790b();
            return;
        }
        if (itemViewType != 1) {
            if (itemViewType != 2) {
                return;
            }
            convertView.getLayoutParams().height = t100.m186890d(this.hasPrivilege ? 12.0f : 80.0f);
        } else {
            final LikedUserItemView likedUserItemView = (LikedUserItemView) convertView;
            final LikedUser likedUserMo116316a = item.mo116316a();
            if (likedUserMo116316a != null) {
                final int i = 10;
                mo67374c(this.presenter.act(), CoreModule.f17545c.f19639e0.m169410Ka(likedUserMo116316a.f20432id)).subscribe(mkd0.m154955G(new e30() { // from class: l.ifr
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        nfr.m159265K(likedUserItemView, likedUserMo116316a, this, position, i, (User) obj);
                    }
                }));
            }
        }
    }

    @Override // p149l.dac0
    @NotNull
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public InterfaceC18690b getItem(int position) {
        InterfaceC18690b interfaceC18690b = this.itemList.get(position);
        interfaceC18690b.getClass();
        return interfaceC18690b;
    }

    /* JADX INFO: renamed from: R */
    public final void m159274R(boolean hasPrivilege) {
        if (this.hasPrivilege != hasPrivilege) {
            this.hasPrivilege = hasPrivilege;
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: S */
    public final boolean m159275S(@NotNull LikedUser user) {
        Object obj;
        user.getClass();
        Iterator<T> it = this.itemList.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            LikedUser likedUserMo116316a = ((InterfaceC18690b) next).mo116316a();
            if (Intrinsics.m87488d(likedUserMo116316a != null ? likedUserMo116316a.f20432id : null, user.f20432id)) {
                obj = next;
                break;
            }
        }
        InterfaceC18690b interfaceC18690b = (InterfaceC18690b) obj;
        int iIndexOf = interfaceC18690b != null ? this.itemList.indexOf(interfaceC18690b) : -1;
        if (iIndexOf != -1) {
            this.itemList.remove(iIndexOf);
            ArrayList<InterfaceC18690b> arrayList = this.itemList;
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator<T> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (((InterfaceC18690b) it2.next()).getItemType() == 1) {
                        notifyItemRemoved(iIndexOf);
                    }
                }
                notifyDataSetChanged();
            } else {
                notifyDataSetChanged();
            }
        }
        return iIndexOf != -1;
    }

    /* JADX INFO: renamed from: T */
    public final void m159276T(@NotNull ArrayList<InterfaceC18690b> itemList, boolean hasPrivilege) {
        itemList.getClass();
        this.hasPrivilege = hasPrivilege;
        this.itemList.clear();
        this.itemList.addAll(itemList);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: U */
    public final int m159277U() {
        ArrayList<InterfaceC18690b> arrayList = this.itemList;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((InterfaceC18690b) obj).getItemType() == 1) {
                arrayList2.add(obj);
            }
        }
        return arrayList2.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: e */
    public void mo47327e(int i) {
        if (this.itemList.isEmpty() || i != this.itemList.size() - 2) {
            return;
        }
        bgr bgrVar = this.presenter;
        if (bgrVar.f75488d) {
            if (Network.isConnected(bgrVar.act())) {
                this.presenter.m101700G0(false);
            } else {
                lsi0.m151593w(R$string.f20578F);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return this.itemList.get(position).getItemType();
    }
}
