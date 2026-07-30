package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.likedusers.LikedUserHeaderView;
import com.p000p1.mobile.putong.core.p001ui.likedusers.LikedUserItemView;
import com.p000p1.mobile.putong.data.Position;
import com.p000p1.mobile.putong.data.Relationship;
import com.p000p1.mobile.putong.data.RelationshipStatus;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p006ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.api.api.Network;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.LikedUser;
import com.p1.mobile.putong.core.member.R;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.dac0;
import l.e30;
import l.e51;
import l.k6c0;
import l.lsi0;
import l.mkd0;
import l.t100;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 82\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00029:B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u000fH\u0016¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020\t2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J-\u0010)\u001a\u00020\t2\u0016\u0010(\u001a\u0012\u0012\u0004\u0012\u00020\u00020&j\b\u0012\u0004\u0012\u00020\u0002`'2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b)\u0010*J\u0015\u0010-\u001a\u00020\"2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\u000f¢\u0006\u0004\b/\u0010\u001eR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u0010\u0006R&\u0010(\u001a\u0012\u0012\u0004\u0012\u00020\u00020&j\b\u0012\u0004\u0012\u00020\u0002`'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u00107¨\u0006;"}, d2 = {"Ll/nfr;", "Ll/dac0;", "Ll/nfr$b;", "Ll/bgr;", "presenter", "<init>", "(Ll/bgr;)V", "Lcom/p1/mobile/putong/core/ui/likedusers/LikedUserItemView;", "itemView", "", "Q", "(Lcom/p1/mobile/putong/core/ui/likedusers/LikedUserItemView;)V", "V", "Landroid/view/ViewGroup;", "parent", "", "itemViewType", "Landroid/view/View;", "D", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "convertView", "item", Position.TYPE, "J", "(Landroid/view/View;Ll/nfr$b;II)V", "getItemViewType", "(I)I", "P", "(I)Ll/nfr$b;", "C", "()I", RXScreenCaptureService.KEY_INDEX, "e", "(I)V", "", "hasPrivilege", "R", "(Z)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "itemList", "T", "(Ljava/util/ArrayList;Z)V", "Lcom/p1/mobile/putong/core/data/LikedUser;", "user", "S", "(Lcom/p1/mobile/putong/core/data/LikedUser;)Z", "U", "c", "Ll/bgr;", "getPresenter", "()Ll/bgr;", "setPresenter", "d", "Ljava/util/ArrayList;", "Z", "Companion", "a", "b", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class nfr extends dac0<InterfaceC2440b> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public bgr presenter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public ArrayList<InterfaceC2440b> itemList;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public boolean hasPrivilege;

    /* JADX INFO: renamed from: l.nfr$b */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Ll/nfr$b;", "", "", "getItemType", "()I", "Lcom/p1/mobile/putong/core/data/LikedUser;", "a", "()Lcom/p1/mobile/putong/core/data/LikedUser;", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface InterfaceC2440b {
        @Nullable
        /* JADX INFO: renamed from: a */
        LikedUser mo9836a();

        int getItemType();
    }

    public nfr(@NotNull bgr bgrVar) {
        bgrVar.getClass();
        this.presenter = bgrVar;
        this.itemList = new ArrayList<>();
    }

    /* JADX INFO: renamed from: K */
    public static final void m12180K(final LikedUserItemView likedUserItemView, final LikedUser likedUser, final nfr nfrVar, final int i, final int i2, final User user) {
        user.getClass();
        if (NullChecker.a(user.localRelationship)) {
            Relationship relationship = user.localRelationship;
            relationship.getClass();
            if (TEnum.equals(relationship.state, "matched")) {
                e51.G(new Runnable() { // from class: l.jfr
                    @Override // java.lang.Runnable
                    public final void run() {
                        nfr.m12181L(this.f9340a, likedUser);
                    }
                });
                return;
            }
        }
        likedUserItemView.m474h(likedUser, user, !nfrVar.hasPrivilege && i >= i2, new e30() { // from class: l.kfr
            public final void call(Object obj) {
                nfr.m12182M(this.f9704a, user, i, i2, likedUserItemView, (LikedUser) obj);
            }
        }, new e30() { // from class: l.lfr
            public final void call(Object obj) {
                nfr.m12184O(this.f10023a, likedUser, user, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: L */
    public static final void m12181L(nfr nfrVar, LikedUser likedUser) {
        nfrVar.presenter.m8881J0(likedUser);
    }

    /* JADX INFO: renamed from: M */
    public static final void m12182M(final nfr nfrVar, User user, int i, int i2, final LikedUserItemView likedUserItemView, LikedUser likedUser) {
        likedUser.getClass();
        if (nfrVar.presenter.m8887t0(user)) {
            return;
        }
        if (!nfrVar.hasPrivilege && i >= i2) {
            nfrVar.presenter.m8882L0("p_navigation,ilike_module");
            return;
        }
        bgr bgrVar = nfrVar.presenter;
        bgrVar.f6321c = likedUser;
        bgrVar.f6320b = likedUserItemView;
        if (TEnum.equals(likedUser.status, RelationshipStatus.superliked) || TEnum.equals(likedUser.status, RelationshipStatus.lettered)) {
            CoreModule.c.Z0.f4(likedUser.id);
        }
        CoreModule.P().a().Xc(nfrVar.presenter.f6319a, likedUser.id, likedUserItemView, new e30() { // from class: l.mfr
            public final void call(Object obj) {
                nfr.m12183N(this.f10457a, likedUserItemView, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public static final void m12183N(nfr nfrVar, LikedUserItemView likedUserItemView, boolean z) {
        if (z) {
            nfrVar.m12186V(likedUserItemView);
        } else {
            nfrVar.m12185Q(likedUserItemView);
        }
    }

    /* JADX INFO: renamed from: O */
    public static final void m12184O(nfr nfrVar, LikedUser likedUser, User user, Boolean bool) {
        bgr bgrVar = nfrVar.presenter;
        bool.getClass();
        bgrVar.m8880I0(bool.booleanValue(), likedUser, user, true);
    }

    /* JADX INFO: renamed from: Q */
    private final void m12185Q(LikedUserItemView itemView) {
        xdl0.M0(itemView.f83b, false);
        xdl0.M(itemView.f92k, false);
    }

    /* JADX INFO: renamed from: V */
    private final void m12186V(LikedUserItemView itemView) {
        xdl0.M0(itemView.f83b, true);
        if (TEnum.equals(itemView.f96o.status, RelationshipStatus.superliked)) {
            xdl0.M(itemView.f92k, true);
        }
    }

    /* JADX INFO: renamed from: C */
    public int m12188C() {
        return this.itemList.size();
    }

    @NotNull
    /* JADX INFO: renamed from: D */
    public View m12189D(@NotNull ViewGroup parent, int itemViewType) {
        LayoutInflater layoutInflaterInflater;
        View viewInflate;
        LayoutInflater layoutInflaterInflater2;
        View viewInflate2;
        parent.getClass();
        if (itemViewType == 0) {
            Act act = this.presenter.act();
            return (act == null || (layoutInflaterInflater = act.inflater()) == null || (viewInflate = layoutInflaterInflater.inflate(k6c0.c0, parent, false)) == null) ? new View(this.presenter.Y()) : viewInflate;
        }
        if (itemViewType != 2) {
            Act act2 = this.presenter.act();
            return (act2 == null || (layoutInflaterInflater2 = act2.inflater()) == null || (viewInflate2 = layoutInflaterInflater2.inflate(k6c0.b0, parent, false)) == null) ? new View(this.presenter.Y()) : viewInflate2;
        }
        View view = new View(this.presenter.Y());
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, 1));
        return view;
    }

    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void m12187A(@NotNull View convertView, @NotNull InterfaceC2440b item, int itemViewType, final int position) {
        convertView.getClass();
        item.getClass();
        if (itemViewType == 0) {
            ((LikedUserHeaderView) convertView).m465b();
            return;
        }
        if (itemViewType != 1) {
            if (itemViewType != 2) {
                return;
            }
            convertView.getLayoutParams().height = t100.d(this.hasPrivilege ? 12.0f : 80.0f);
        } else {
            final LikedUserItemView likedUserItemView = (LikedUserItemView) convertView;
            final LikedUser likedUserMo9836a = item.mo9836a();
            if (likedUserMo9836a != null) {
                final int i = 10;
                c(this.presenter.act(), CoreModule.c.e0.Ka(likedUserMo9836a.id)).subscribe(mkd0.G(new e30() { // from class: l.ifr
                    public final void call(Object obj) {
                        nfr.m12180K(likedUserItemView, likedUserMo9836a, this, position, i, (User) obj);
                    }
                }));
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public InterfaceC2440b getItem(int position) {
        InterfaceC2440b interfaceC2440b = this.itemList.get(position);
        interfaceC2440b.getClass();
        return interfaceC2440b;
    }

    /* JADX INFO: renamed from: R */
    public final void m12192R(boolean hasPrivilege) {
        if (this.hasPrivilege != hasPrivilege) {
            this.hasPrivilege = hasPrivilege;
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: S */
    public final boolean m12193S(@NotNull LikedUser user) {
        Object obj;
        user.getClass();
        Iterator<T> it = this.itemList.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            LikedUser likedUserMo9836a = ((InterfaceC2440b) next).mo9836a();
            if (Intrinsics.d(likedUserMo9836a != null ? likedUserMo9836a.id : null, user.id)) {
                obj = next;
                break;
            }
        }
        InterfaceC2440b interfaceC2440b = (InterfaceC2440b) obj;
        int iIndexOf = interfaceC2440b != null ? this.itemList.indexOf(interfaceC2440b) : -1;
        if (iIndexOf != -1) {
            this.itemList.remove(iIndexOf);
            ArrayList<InterfaceC2440b> arrayList = this.itemList;
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator<T> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (((InterfaceC2440b) it2.next()).getItemType() == 1) {
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
    public final void m12194T(@NotNull ArrayList<InterfaceC2440b> itemList, boolean hasPrivilege) {
        itemList.getClass();
        this.hasPrivilege = hasPrivilege;
        this.itemList.clear();
        this.itemList.addAll(itemList);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: U */
    public final int m12195U() {
        ArrayList<InterfaceC2440b> arrayList = this.itemList;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((InterfaceC2440b) obj).getItemType() == 1) {
                arrayList2.add(obj);
            }
        }
        return arrayList2.size();
    }

    /* JADX INFO: renamed from: e */
    public void m12196e(int i) {
        if (this.itemList.isEmpty() || i != this.itemList.size() - 2) {
            return;
        }
        bgr bgrVar = this.presenter;
        if (bgrVar.f6322d) {
            if (Network.isConnected(bgrVar.act())) {
                this.presenter.m8878G0(false);
            } else {
                lsi0.w(R.string.F);
            }
        }
    }

    public int getItemViewType(int position) {
        return this.itemList.get(position).getItemType();
    }
}
