package p009l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.newui.meet.likers.items.MeetLikersNewLikersView;
import com.p000p1.mobile.putong.core.newui.meet.likers.items.MeetLikersTitleView;
import com.p000p1.mobile.putong.core.newui.meet.likers.items.MeetLikersUserView;
import com.p1.mobile.putong.data.DbLinks;
import com.p1.mobile.putong.data.Links;
import com.p1.mobile.putong.data.User;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l.dac0;
import l.e30;
import l.k6c0;
import l.vwb;
import l.w9j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0006\u0018\u0000 :2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001;B\u0019\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J1\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010!\u001a\u00020\u00192\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u001d\u0010'\u001a\u00020#2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b-\u0010\u001a\u001a\u0004\b.\u0010/R\u0018\u00102\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00101R\u0016\u00105\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108¨\u0006<"}, d2 = {"Ll/x2y;", "Ll/dac0;", "Ll/mwl;", "Ll/l4y;", "presenter", "", "seeLastReadTime", "<init>", "(Ll/l4y;J)V", "Landroid/view/ViewGroup;", "parent", "", "itemViewType", "Landroid/view/View;", "D", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "position", "K", "(I)Ll/mwl;", "C", "()I", "getItemViewType", "(I)I", "convertView", "item", "", "J", "(Landroid/view/View;Ll/mwl;II)V", "i", "e", "(I)V", "", "users", "M", "(Ljava/util/List;)V", "", "isNewLikers", "", Oauth2AccessToken.KEY_UID, "L", "(ZLjava/lang/String;)Z", "c", "Ll/l4y;", "getPresenter", "()Ll/l4y;", "d", "getSeeLastReadTime", "()J", "Ll/j3y;", "Ll/j3y;", "meetLikersNewLikersAdapter", "f", "Z", "containerNewLikers", "", "g", "Ljava/util/List;", "items", "Companion", "a", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class x2y extends dac0<mwl> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h */
    public static final int f22412h = 0;

    /* JADX INFO: renamed from: i */
    public static final int f22413i;

    /* JADX INFO: renamed from: j */
    public static final int f22414j;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final l4y presenter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final long seeLastReadTime;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public j3y meetLikersNewLikersAdapter;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean containerNewLikers;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final List<mwl> items = new ArrayList();

    static {
        int i = f22412h;
        f22413i = i + 1;
        f22414j = i + 2;
    }

    public x2y(@Nullable l4y l4yVar, long j) {
        this.presenter = l4yVar;
        this.seeLastReadTime = j;
    }

    /* JADX INFO: renamed from: E */
    public static void m24681E(x2y x2yVar, User user) {
        l4y l4yVar = x2yVar.presenter;
        if (l4yVar != null) {
            user.getClass();
            l4yVar.m17684E(user, true, true);
        }
    }

    /* JADX INFO: renamed from: F */
    public static Boolean m24682F(String str, mwl mwlVar) {
        return mwlVar instanceof p4y ? Boolean.valueOf(TextUtils.equals(((DbObject) ((p4y) mwlVar).getUser()).id, str)) : Boolean.FALSE;
    }

    /* JADX INFO: renamed from: G */
    public static Boolean m24683G(mwl mwlVar) {
        return mwlVar instanceof k3y ? Boolean.TRUE : Boolean.FALSE;
    }

    /* JADX INFO: renamed from: C */
    public int m24687C() {
        return this.items.size();
    }

    @NotNull
    /* JADX INFO: renamed from: D */
    public View m24688D(@NotNull ViewGroup parent, int itemViewType) {
        parent.getClass();
        if (itemViewType == f22414j) {
            View viewInflate = o7r.m19649a(parent.getContext()).inflate(k6c0.B0, parent, false);
            viewInflate.getClass();
            return viewInflate;
        }
        if (itemViewType != f22413i) {
            View viewInflate2 = o7r.m19649a(parent.getContext()).inflate(k6c0.C0, parent, false);
            viewInflate2.getClass();
            return viewInflate2;
        }
        View viewInflate3 = o7r.m19649a(parent.getContext()).inflate(k6c0.A0, parent, false);
        viewInflate3.getClass();
        MeetLikersNewLikersView meetLikersNewLikersView = (MeetLikersNewLikersView) viewInflate3;
        j3y j3yVar = new j3y(this.seeLastReadTime);
        this.meetLikersNewLikersAdapter = j3yVar;
        meetLikersNewLikersView.m4607d(j3yVar);
        return meetLikersNewLikersView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void m24686A(@NotNull View convertView, @Nullable mwl item, int itemViewType, int position) {
        convertView.getClass();
        if (itemViewType == f22414j) {
            MeetLikersTitleView meetLikersTitleView = convertView instanceof MeetLikersTitleView ? (MeetLikersTitleView) convertView : null;
            if (meetLikersTitleView != null) {
                item.getClass();
                meetLikersTitleView.m4611b((m4y) item);
                return;
            }
            return;
        }
        if (itemViewType == f22413i) {
            MeetLikersNewLikersView meetLikersNewLikersView = convertView instanceof MeetLikersNewLikersView ? (MeetLikersNewLikersView) convertView : null;
            if (meetLikersNewLikersView != null) {
                item.getClass();
                meetLikersNewLikersView.m4608e((k3y) item);
                return;
            }
            return;
        }
        int i = this.containerNewLikers ? position - 2 : position - 1;
        boolean z = convertView instanceof MeetLikersUserView;
        MeetLikersUserView meetLikersUserView = z ? (MeetLikersUserView) convertView : null;
        if (meetLikersUserView != null) {
            meetLikersUserView.setUserPosition(i);
        }
        MeetLikersUserView meetLikersUserView2 = z ? (MeetLikersUserView) convertView : null;
        if (meetLikersUserView2 != null) {
            item.getClass();
            meetLikersUserView2.m4618k((p4y) item, new e30() { // from class: l.w2y
                public final void call(Object obj) {
                    x2y.m24681E(this.f21862a, (User) obj);
                }
            });
        }
    }

    @NotNull
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public mwl getItem(int position) {
        return this.items.get(position);
    }

    /* JADX INFO: renamed from: L */
    public final boolean m24691L(boolean isNewLikers, @NotNull final String uid) {
        uid.getClass();
        if (isNewLikers) {
            j3y j3yVar = this.meetLikersNewLikersAdapter;
            if (j3yVar != null) {
                return j3yVar.m16866I(uid);
            }
            return false;
        }
        int iG = vwb.G(this.items, new w9j() { // from class: l.v2y
            public final Object call(Object obj) {
                return x2y.m24682F(uid, (mwl) obj);
            }
        });
        if (iG == -1) {
            return false;
        }
        this.items.remove(iG);
        notifyItemRemoved(iG);
        notifyItemRangeChanged(iG, getItemCount());
        return true;
    }

    /* JADX INFO: renamed from: M */
    public final void m24692M(@NotNull List<? extends mwl> users) {
        users.getClass();
        this.items.clear();
        this.items.addAll(users);
        this.containerNewLikers = vwb.m(this.items, new w9j() { // from class: l.u2y
            public final Object call(Object obj) {
                return x2y.m24683G((mwl) obj);
            }
        });
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: e */
    public void m24693e(int i) {
        l4y l4yVar;
        Links links;
        DbLinks allLikersLink;
        Links links2;
        super.e(i);
        if (this.items.isEmpty() || i < this.items.size() - 2) {
            return;
        }
        l4y l4yVar2 = this.presenter;
        String str = null;
        if (TextUtils.isEmpty((l4yVar2 == null || (allLikersLink = l4yVar2.getAllLikersLink()) == null || (links2 = allLikersLink.links) == null) ? null : links2.next) || (l4yVar = this.presenter) == null) {
            return;
        }
        DbLinks allLikersLink2 = l4yVar.getAllLikersLink();
        if (allLikersLink2 != null && (links = allLikersLink2.links) != null) {
            str = links.next;
        }
        l4yVar.m17687N0(str);
    }

    public int getItemViewType(int position) {
        mwl item = getItem(position);
        if (item instanceof m4y) {
            return f22414j;
        }
        return item instanceof k3y ? f22413i : f22412h;
    }

    /* JADX INFO: renamed from: l.x2y$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Ll/x2y$a;", "", "<init>", "()V", "", "TYPE_NEW_LIKERS", "I", "a", "()I", "TYPE_TITLE", "b", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final int m24694a() {
            return x2y.f22413i;
        }

        /* JADX INFO: renamed from: b */
        public final int m24695b() {
            return x2y.f22414j;
        }

        public Companion() {
        }
    }
}
