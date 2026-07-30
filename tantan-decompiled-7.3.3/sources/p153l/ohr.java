package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Item;
import com.p051p1.mobile.putong.core.data.LikedUser;
import com.p051p1.mobile.putong.core.member.R$string;
import com.p051p1.mobile.putong.core.p058ui.likedusers.LikedUserHeaderView;
import com.p051p1.mobile.putong.core.p058ui.likedusers.LikedUserItemView;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 82\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00029:B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u000fH\u0016¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020\t2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J-\u0010)\u001a\u00020\t2\u0016\u0010(\u001a\u0012\u0012\u0004\u0012\u00020\u00020&j\b\u0012\u0004\u0012\u00020\u0002`'2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b)\u0010*J\u0015\u0010-\u001a\u00020\"2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\u000f¢\u0006\u0004\b/\u0010\u001eR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u0010\u0006R&\u0010(\u001a\u0012\u0012\u0004\u0012\u00020\u00020&j\b\u0012\u0004\u0012\u00020\u0002`'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u00107¨\u0006;"}, m88121d2 = {"Ll/ohr;", "Ll/jic0;", "Ll/ohr$b;", "Ll/cir;", "presenter", "<init>", "(Ll/cir;)V", "Lcom/p1/mobile/putong/core/ui/likedusers/LikedUserItemView;", "itemView", "", "Q", "(Lcom/p1/mobile/putong/core/ui/likedusers/LikedUserItemView;)V", p7f.GPS_MEASUREMENT_INTERRUPTED, "Landroid/view/ViewGroup;", "parent", "", "itemViewType", "Landroid/view/View;", "D", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "convertView", Item.TYPE, "position", "J", "(Landroid/view/View;Ll/ohr$b;II)V", "getItemViewType", "(I)I", "P", "(I)Ll/ohr$b;", c4s.C_ZONE, "()I", RXScreenCaptureService.KEY_INDEX, "e", "(I)V", "", "hasPrivilege", "R", "(Z)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "itemList", p7f.GPS_DIRECTION_TRUE, "(Ljava/util/ArrayList;Z)V", "Lcom/p1/mobile/putong/core/data/LikedUser;", "user", p7f.LATITUDE_SOUTH, "(Lcom/p1/mobile/putong/core/data/LikedUser;)Z", "U", "c", "Ll/cir;", "getPresenter", "()Ll/cir;", "setPresenter", Constants.INAPP_DATA_TAG, "Ljava/util/ArrayList;", "Z", "Companion", "a", "b", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class ohr extends jic0<InterfaceC19139b> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public cir presenter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public ArrayList<InterfaceC19139b> itemList;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public boolean hasPrivilege;

    /* JADX INFO: renamed from: l.ohr$b */
    @Metadata(m88120d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, m88121d2 = {"Ll/ohr$b;", "", "", "getItemType", "()I", "Lcom/p1/mobile/putong/core/data/LikedUser;", "a", "()Lcom/p1/mobile/putong/core/data/LikedUser;", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public interface InterfaceC19139b {
        @Nullable
        /* JADX INFO: renamed from: a */
        LikedUser mo125711a();

        int getItemType();
    }

    public ohr(@NotNull cir cirVar) {
        cirVar.getClass();
        this.presenter = cirVar;
        this.itemList = new ArrayList<>();
    }

    /* JADX INFO: renamed from: K */
    public static final void m167726K(final LikedUserItemView likedUserItemView, final LikedUser likedUser, final ohr ohrVar, final int i, final int i2, final User user) {
        user.getClass();
        if (NullChecker.m82486a(user.localRelationship)) {
            Relationship relationship = user.localRelationship;
            relationship.getClass();
            if (TEnum.equals(relationship.state, "matched")) {
                l51.m152887G(new Runnable() { // from class: l.khr
                    @Override // java.lang.Runnable
                    public final void run() {
                        ohr.m167727L(this.f126901a, likedUser);
                    }
                });
                return;
            }
        }
        likedUserItemView.m47982h(likedUser, user, !ohrVar.hasPrivilege && i >= i2, new y20() { // from class: l.lhr
            @Override // p153l.y20
            public final void call(Object obj) {
                ohr.m167728M(this.f132129a, user, i, i2, likedUserItemView, (LikedUser) obj);
            }
        }, new y20() { // from class: l.mhr
            @Override // p153l.y20
            public final void call(Object obj) {
                ohr.m167730O(this.f136870a, likedUser, user, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: L */
    public static final void m167727L(ohr ohrVar, LikedUser likedUser) {
        ohrVar.presenter.m109933J0(likedUser);
    }

    /* JADX INFO: renamed from: M */
    public static final void m167728M(final ohr ohrVar, User user, int i, int i2, final LikedUserItemView likedUserItemView, LikedUser likedUser) {
        likedUser.getClass();
        if (ohrVar.presenter.m109937t0(user)) {
            return;
        }
        if (!ohrVar.hasPrivilege && i >= i2) {
            ohrVar.presenter.m109934L0("p_navigation,ilike_module");
            return;
        }
        cir cirVar = ohrVar.presenter;
        cirVar.f81976c = likedUser;
        cirVar.f81975b = likedUserItemView;
        if (TEnum.equals(likedUser.status, "superliked") || TEnum.equals(likedUser.status, "lettered")) {
            CoreModule.f18264c.f20367Z0.m210789f4(likedUser.f21174id);
        }
        CoreModule.m30933P().m143405a().mo34444Xc(ohrVar.presenter.f81974a, likedUser.f21174id, likedUserItemView, new y20() { // from class: l.nhr
            @Override // p153l.y20
            public final void call(Object obj) {
                ohr.m167729N(this.f142052a, likedUserItemView, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public static final void m167729N(ohr ohrVar, LikedUserItemView likedUserItemView, boolean z) {
        if (z) {
            ohrVar.m167732V(likedUserItemView);
        } else {
            ohrVar.m167731Q(likedUserItemView);
        }
    }

    /* JADX INFO: renamed from: O */
    public static final void m167730O(ohr ohrVar, LikedUser likedUser, User user, Boolean bool) {
        cir cirVar = ohrVar.presenter;
        bool.getClass();
        cirVar.m109932I0(bool.booleanValue(), likedUser, user, true);
    }

    /* JADX INFO: renamed from: Q */
    private final void m167731Q(LikedUserItemView itemView) {
        bnl0.m105525M0(itemView.f30822b, false);
        bnl0.m105524M(itemView.f30831k, false);
    }

    /* JADX INFO: renamed from: V */
    private final void m167732V(LikedUserItemView itemView) {
        bnl0.m105525M0(itemView.f30822b, true);
        if (TEnum.equals(itemView.f30835o.status, "superliked")) {
            bnl0.m105524M(itemView.f30831k, true);
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.itemList.size();
    }

    @Override // p153l.jic0
    @NotNull
    /* JADX INFO: renamed from: D */
    public View mo29824D(@NotNull ViewGroup parent, int itemViewType) {
        LayoutInflater layoutInflaterInflater;
        View viewInflate;
        LayoutInflater layoutInflaterInflater2;
        View viewInflate2;
        parent.getClass();
        if (itemViewType == 0) {
            Act act = this.presenter.act();
            return (act == null || (layoutInflaterInflater = act.inflater()) == null || (viewInflate = layoutInflaterInflater.inflate(pec0.f151974c0, parent, false)) == null) ? new View(this.presenter.m99640Y()) : viewInflate;
        }
        if (itemViewType != 2) {
            Act act2 = this.presenter.act();
            return (act2 == null || (layoutInflaterInflater2 = act2.inflater()) == null || (viewInflate2 = layoutInflaterInflater2.inflate(pec0.f151970b0, parent, false)) == null) ? new View(this.presenter.m99640Y()) : viewInflate2;
        }
        View view = new View(this.presenter.m99640Y());
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, 1));
        return view;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo29822A(@NotNull View convertView, @NotNull InterfaceC19139b item, int itemViewType, final int position) {
        convertView.getClass();
        item.getClass();
        if (itemViewType == 0) {
            ((LikedUserHeaderView) convertView).m47973b();
            return;
        }
        if (itemViewType != 1) {
            if (itemViewType != 2) {
                return;
            }
            convertView.getLayoutParams().height = qa00.m175859d(this.hasPrivilege ? 12.0f : 80.0f);
        } else {
            final LikedUserItemView likedUserItemView = (LikedUserItemView) convertView;
            final LikedUser likedUserMo125711a = item.mo125711a();
            if (likedUserMo125711a != null) {
                final int i = 10;
                mo68557c(this.presenter.act(), CoreModule.f18264c.f20381e0.m116483Ka(likedUserMo125711a.f21174id)).subscribe(psd0.m173596G(new y20() { // from class: l.jhr
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        ohr.m167726K(likedUserItemView, likedUserMo125711a, this, position, i, (User) obj);
                    }
                }));
            }
        }
    }

    @Override // p153l.jic0
    @NotNull
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public InterfaceC19139b getItem(int position) {
        InterfaceC19139b interfaceC19139b = this.itemList.get(position);
        interfaceC19139b.getClass();
        return interfaceC19139b;
    }

    /* JADX INFO: renamed from: R */
    public final void m167735R(boolean hasPrivilege) {
        if (this.hasPrivilege != hasPrivilege) {
            this.hasPrivilege = hasPrivilege;
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: S */
    public final boolean m167736S(@NotNull LikedUser user) {
        Object obj;
        user.getClass();
        Iterator<T> it = this.itemList.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            LikedUser likedUserMo125711a = ((InterfaceC19139b) next).mo125711a();
            if (Intrinsics.m88377d(likedUserMo125711a != null ? likedUserMo125711a.f21174id : null, user.f21174id)) {
                obj = next;
                break;
            }
        }
        InterfaceC19139b interfaceC19139b = (InterfaceC19139b) obj;
        int iIndexOf = interfaceC19139b != null ? this.itemList.indexOf(interfaceC19139b) : -1;
        if (iIndexOf != -1) {
            this.itemList.remove(iIndexOf);
            ArrayList<InterfaceC19139b> arrayList = this.itemList;
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator<T> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (((InterfaceC19139b) it2.next()).getItemType() == 1) {
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
    public final void m167737T(@NotNull ArrayList<InterfaceC19139b> itemList, boolean hasPrivilege) {
        itemList.getClass();
        this.hasPrivilege = hasPrivilege;
        this.itemList.clear();
        this.itemList.addAll(itemList);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: U */
    public final int m167738U() {
        ArrayList<InterfaceC19139b> arrayList = this.itemList;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((InterfaceC19139b) obj).getItemType() == 1) {
                arrayList2.add(obj);
            }
        }
        return arrayList2.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: e */
    public void mo48510e(int i) {
        if (this.itemList.isEmpty() || i != this.itemList.size() - 2) {
            return;
        }
        cir cirVar = this.presenter;
        if (cirVar.f81977d) {
            if (Network.isConnected(cirVar.act())) {
                this.presenter.m109930G0(false);
            } else {
                o1j0.m165649w(R$string.f21320F);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return this.itemList.get(position).getItemType();
    }
}
