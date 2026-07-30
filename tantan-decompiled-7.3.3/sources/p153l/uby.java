package p153l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.core.data.Item;
import com.p051p1.mobile.putong.core.newui.meet.likers.items.MeetLikersNewLikersView;
import com.p051p1.mobile.putong.core.newui.meet.likers.items.MeetLikersTitleView;
import com.p051p1.mobile.putong.core.newui.meet.likers.items.MeetLikersUserView;
import com.p051p1.mobile.putong.data.DbLinks;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.data.User;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0006\u0018\u0000 :2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001;B\u0019\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J1\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010!\u001a\u00020\u00192\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u001d\u0010'\u001a\u00020#2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b-\u0010\u001a\u001a\u0004\b.\u0010/R\u0018\u00102\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00101R\u0016\u00105\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108¨\u0006<"}, m88121d2 = {"Ll/uby;", "Ll/jic0;", "Ll/ezl;", "Ll/idy;", "presenter", "", "seeLastReadTime", "<init>", "(Ll/idy;J)V", "Landroid/view/ViewGroup;", "parent", "", "itemViewType", "Landroid/view/View;", "D", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "position", "K", "(I)Ll/ezl;", c4s.C_ZONE, "()I", "getItemViewType", "(I)I", "convertView", Item.TYPE, "", "J", "(Landroid/view/View;Ll/ezl;II)V", RXScreenCaptureService.KEY_INDEX, "e", "(I)V", "", "users", "M", "(Ljava/util/List;)V", "", "isNewLikers", "", Oauth2AccessToken.KEY_UID, "L", "(ZLjava/lang/String;)Z", "c", "Ll/idy;", "getPresenter", "()Ll/idy;", Constants.INAPP_DATA_TAG, "getSeeLastReadTime", "()J", "Ll/gcy;", "Ll/gcy;", "meetLikersNewLikersAdapter", "f", "Z", "containerNewLikers", "", "g", "Ljava/util/List;", FirebaseAnalytics.Param.ITEMS, "Companion", "a", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class uby extends jic0<ezl> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h */
    public static final int f178363h = 0;

    /* JADX INFO: renamed from: i */
    public static final int f178364i;

    /* JADX INFO: renamed from: j */
    public static final int f178365j;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final idy presenter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final long seeLastReadTime;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public gcy meetLikersNewLikersAdapter;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean containerNewLikers;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final List<ezl> items = new ArrayList();

    static {
        int i = f178363h;
        f178364i = i + 1;
        f178365j = i + 2;
    }

    public uby(@Nullable idy idyVar, long j) {
        this.presenter = idyVar;
        this.seeLastReadTime = j;
    }

    /* JADX INFO: renamed from: E */
    public static void m195338E(uby ubyVar, User user) {
        idy idyVar = ubyVar.presenter;
        if (idyVar != null) {
            user.getClass();
            idyVar.m139575E(user, true, true);
        }
    }

    /* JADX INFO: renamed from: F */
    public static Boolean m195339F(String str, ezl ezlVar) {
        return ezlVar instanceof mdy ? Boolean.valueOf(TextUtils.equals(((mdy) ezlVar).getUser().f56859id, str)) : Boolean.FALSE;
    }

    /* JADX INFO: renamed from: G */
    public static Boolean m195340G(ezl ezlVar) {
        return ezlVar instanceof hcy ? Boolean.TRUE : Boolean.FALSE;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.items.size();
    }

    @Override // p153l.jic0
    @NotNull
    /* JADX INFO: renamed from: D */
    public View mo29824D(@NotNull ViewGroup parent, int itemViewType) {
        parent.getClass();
        if (itemViewType == f178365j) {
            View viewInflate = p9r.m171370a(parent.getContext()).inflate(pec0.f151891B0, parent, false);
            viewInflate.getClass();
            return viewInflate;
        }
        if (itemViewType != f178364i) {
            View viewInflate2 = p9r.m171370a(parent.getContext()).inflate(pec0.f151894C0, parent, false);
            viewInflate2.getClass();
            return viewInflate2;
        }
        View viewInflate3 = p9r.m171370a(parent.getContext()).inflate(pec0.f151888A0, parent, false);
        viewInflate3.getClass();
        MeetLikersNewLikersView meetLikersNewLikersView = (MeetLikersNewLikersView) viewInflate3;
        gcy gcyVar = new gcy(this.seeLastReadTime);
        this.meetLikersNewLikersAdapter = gcyVar;
        meetLikersNewLikersView.m41527d(gcyVar);
        return meetLikersNewLikersView;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo29822A(@NotNull View convertView, @Nullable ezl item, int itemViewType, int position) {
        convertView.getClass();
        if (itemViewType == f178365j) {
            MeetLikersTitleView meetLikersTitleView = convertView instanceof MeetLikersTitleView ? (MeetLikersTitleView) convertView : null;
            if (meetLikersTitleView != null) {
                item.getClass();
                meetLikersTitleView.m41531b((jdy) item);
                return;
            }
            return;
        }
        if (itemViewType == f178364i) {
            MeetLikersNewLikersView meetLikersNewLikersView = convertView instanceof MeetLikersNewLikersView ? (MeetLikersNewLikersView) convertView : null;
            if (meetLikersNewLikersView != null) {
                item.getClass();
                meetLikersNewLikersView.m41528e((hcy) item);
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
            meetLikersUserView2.m41538k((mdy) item, new y20() { // from class: l.tby
                @Override // p153l.y20
                public final void call(Object obj) {
                    uby.m195338E(this.f173002a, (User) obj);
                }
            });
        }
    }

    @Override // p153l.jic0
    @NotNull
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public ezl getItem(int position) {
        return this.items.get(position);
    }

    /* JADX INFO: renamed from: L */
    public final boolean m195345L(boolean isNewLikers, @NotNull final String uid) {
        uid.getClass();
        if (isNewLikers) {
            gcy gcyVar = this.meetLikersNewLikersAdapter;
            if (gcyVar != null) {
                return gcyVar.m129912I(uid);
            }
            return false;
        }
        int iM147476G = jyb.m147476G(this.items, new qcj() { // from class: l.sby
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uby.m195339F(uid, (ezl) obj);
            }
        });
        if (iM147476G == -1) {
            return false;
        }
        this.items.remove(iM147476G);
        notifyItemRemoved(iM147476G);
        notifyItemRangeChanged(iM147476G, getItemCount());
        return true;
    }

    /* JADX INFO: renamed from: M */
    public final void m195346M(@NotNull List<? extends ezl> users) {
        users.getClass();
        this.items.clear();
        this.items.addAll(users);
        this.containerNewLikers = jyb.m147520m(this.items, new qcj() { // from class: l.rby
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uby.m195340G((ezl) obj);
            }
        });
        notifyDataSetChanged();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: e */
    public void mo48510e(int i) {
        idy idyVar;
        Links links;
        DbLinks allLikersLink;
        Links links2;
        super.mo48510e(i);
        if (this.items.isEmpty() || i < this.items.size() - 2) {
            return;
        }
        idy idyVar2 = this.presenter;
        String str = null;
        if (TextUtils.isEmpty((idyVar2 == null || (allLikersLink = idyVar2.getAllLikersLink()) == null || (links2 = allLikersLink.links) == null) ? null : links2.next) || (idyVar = this.presenter) == null) {
            return;
        }
        DbLinks allLikersLink2 = idyVar.getAllLikersLink();
        if (allLikersLink2 != null && (links = allLikersLink2.links) != null) {
            str = links.next;
        }
        idyVar.m139578N0(str);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        ezl item = getItem(position);
        if (item instanceof jdy) {
            return f178365j;
        }
        return item instanceof hcy ? f178364i : f178363h;
    }

    /* JADX INFO: renamed from: l.uby$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, m88121d2 = {"Ll/uby$a;", "", "<init>", "()V", "", "TYPE_NEW_LIKERS", "I", "a", "()I", "TYPE_TITLE", "b", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final int m195347a() {
            return uby.f178364i;
        }

        /* JADX INFO: renamed from: b */
        public final int m195348b() {
            return uby.f178365j;
        }

        public Companion() {
        }
    }
}
