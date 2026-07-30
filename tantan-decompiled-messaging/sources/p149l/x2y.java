package p149l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.core.data.Item;
import com.p046p1.mobile.putong.core.newui.meet.likers.items.MeetLikersNewLikersView;
import com.p046p1.mobile.putong.core.newui.meet.likers.items.MeetLikersTitleView;
import com.p046p1.mobile.putong.core.newui.meet.likers.items.MeetLikersUserView;
import com.p046p1.mobile.putong.data.DbLinks;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.data.User;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0006\u0018\u0000 :2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001;B\u0019\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J1\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010!\u001a\u00020\u00192\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u001d\u0010'\u001a\u00020#2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b-\u0010\u001a\u001a\u0004\b.\u0010/R\u0018\u00102\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00101R\u0016\u00105\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108¨\u0006<"}, m87232d2 = {"Ll/x2y;", "Ll/dac0;", "Ll/mwl;", "Ll/l4y;", "presenter", "", "seeLastReadTime", "<init>", "(Ll/l4y;J)V", "Landroid/view/ViewGroup;", "parent", "", "itemViewType", "Landroid/view/View;", "D", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "position", "K", "(I)Ll/mwl;", b2s.C_ZONE, "()I", "getItemViewType", "(I)I", "convertView", Item.TYPE, "", "J", "(Landroid/view/View;Ll/mwl;II)V", RXScreenCaptureService.KEY_INDEX, "e", "(I)V", "", "users", "M", "(Ljava/util/List;)V", "", "isNewLikers", "", Oauth2AccessToken.KEY_UID, "L", "(ZLjava/lang/String;)Z", "c", "Ll/l4y;", "getPresenter", "()Ll/l4y;", Constants.INAPP_DATA_TAG, "getSeeLastReadTime", "()J", "Ll/j3y;", "Ll/j3y;", "meetLikersNewLikersAdapter", "f", "Z", "containerNewLikers", "", "g", "Ljava/util/List;", FirebaseAnalytics.Param.ITEMS, "Companion", "a", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class x2y extends dac0<mwl> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h */
    public static final int f190844h = 0;

    /* JADX INFO: renamed from: i */
    public static final int f190845i;

    /* JADX INFO: renamed from: j */
    public static final int f190846j;

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
        int i = f190844h;
        f190845i = i + 1;
        f190846j = i + 2;
    }

    public x2y(@Nullable l4y l4yVar, long j) {
        this.presenter = l4yVar;
        this.seeLastReadTime = j;
    }

    /* JADX INFO: renamed from: E */
    public static void m206883E(x2y x2yVar, User user) {
        l4y l4yVar = x2yVar.presenter;
        if (l4yVar != null) {
            user.getClass();
            l4yVar.m148495E(user, true, true);
        }
    }

    /* JADX INFO: renamed from: F */
    public static Boolean m206884F(String str, mwl mwlVar) {
        return mwlVar instanceof p4y ? Boolean.valueOf(TextUtils.equals(((p4y) mwlVar).getUser().f56011id, str)) : Boolean.FALSE;
    }

    /* JADX INFO: renamed from: G */
    public static Boolean m206885G(mwl mwlVar) {
        return mwlVar instanceof k3y ? Boolean.TRUE : Boolean.FALSE;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.items.size();
    }

    @Override // p149l.dac0
    @NotNull
    /* JADX INFO: renamed from: D */
    public View mo28825D(@NotNull ViewGroup parent, int itemViewType) {
        parent.getClass();
        if (itemViewType == f190846j) {
            View viewInflate = o7r.m163037a(parent.getContext()).inflate(k6c0.f121283B0, parent, false);
            viewInflate.getClass();
            return viewInflate;
        }
        if (itemViewType != f190845i) {
            View viewInflate2 = o7r.m163037a(parent.getContext()).inflate(k6c0.f121286C0, parent, false);
            viewInflate2.getClass();
            return viewInflate2;
        }
        View viewInflate3 = o7r.m163037a(parent.getContext()).inflate(k6c0.f121280A0, parent, false);
        viewInflate3.getClass();
        MeetLikersNewLikersView meetLikersNewLikersView = (MeetLikersNewLikersView) viewInflate3;
        j3y j3yVar = new j3y(this.seeLastReadTime);
        this.meetLikersNewLikersAdapter = j3yVar;
        meetLikersNewLikersView.m40516d(j3yVar);
        return meetLikersNewLikersView;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo28823A(@NotNull View convertView, @Nullable mwl item, int itemViewType, int position) {
        convertView.getClass();
        if (itemViewType == f190846j) {
            MeetLikersTitleView meetLikersTitleView = convertView instanceof MeetLikersTitleView ? (MeetLikersTitleView) convertView : null;
            if (meetLikersTitleView != null) {
                item.getClass();
                meetLikersTitleView.m40520b((m4y) item);
                return;
            }
            return;
        }
        if (itemViewType == f190845i) {
            MeetLikersNewLikersView meetLikersNewLikersView = convertView instanceof MeetLikersNewLikersView ? (MeetLikersNewLikersView) convertView : null;
            if (meetLikersNewLikersView != null) {
                item.getClass();
                meetLikersNewLikersView.m40517e((k3y) item);
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
            meetLikersUserView2.m40527k((p4y) item, new e30() { // from class: l.w2y
                @Override // p149l.e30
                public final void call(Object obj) {
                    x2y.m206883E(this.f184294a, (User) obj);
                }
            });
        }
    }

    @Override // p149l.dac0
    @NotNull
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public mwl getItem(int position) {
        return this.items.get(position);
    }

    /* JADX INFO: renamed from: L */
    public final boolean m206890L(boolean isNewLikers, @NotNull final String uid) {
        uid.getClass();
        if (isNewLikers) {
            j3y j3yVar = this.meetLikersNewLikersAdapter;
            if (j3yVar != null) {
                return j3yVar.m139605I(uid);
            }
            return false;
        }
        int iM200293G = vwb.m200293G(this.items, new w9j() { // from class: l.v2y
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return x2y.m206884F(uid, (mwl) obj);
            }
        });
        if (iM200293G == -1) {
            return false;
        }
        this.items.remove(iM200293G);
        notifyItemRemoved(iM200293G);
        notifyItemRangeChanged(iM200293G, getItemCount());
        return true;
    }

    /* JADX INFO: renamed from: M */
    public final void m206891M(@NotNull List<? extends mwl> users) {
        users.getClass();
        this.items.clear();
        this.items.addAll(users);
        this.containerNewLikers = vwb.m200337m(this.items, new w9j() { // from class: l.u2y
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return x2y.m206885G((mwl) obj);
            }
        });
        notifyDataSetChanged();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: e */
    public void mo47327e(int i) {
        l4y l4yVar;
        Links links;
        DbLinks allLikersLink;
        Links links2;
        super.mo47327e(i);
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
        l4yVar.m148498N0(str);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        mwl item = getItem(position);
        if (item instanceof m4y) {
            return f190846j;
        }
        return item instanceof k3y ? f190845i : f190844h;
    }

    /* JADX INFO: renamed from: l.x2y$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, m87232d2 = {"Ll/x2y$a;", "", "<init>", "()V", "", "TYPE_NEW_LIKERS", "I", "a", "()I", "TYPE_TITLE", "b", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final int m206892a() {
            return x2y.f190845i;
        }

        /* JADX INFO: renamed from: b */
        public final int m206893b() {
            return x2y.f190846j;
        }

        public Companion() {
        }
    }
}
