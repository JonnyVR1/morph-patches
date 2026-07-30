package p153l;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.C0607k;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.member.R$string;
import com.p051p1.mobile.putong.core.newui.meet.likers.MeetLikersFrag;
import com.p051p1.mobile.putong.core.newui.meet.likers.items.MeetLikersUserView;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0012\u0010\rJ\u000f\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001f\u001a\u00020\u000f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c¢\u0006\u0004\b\u001f\u0010 J\r\u0010\"\u001a\u00020!¢\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u000fH\u0002¢\u0006\u0004\b(\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\"\u00103\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\f\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010;\u001a\u0002048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010C\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010K\u001a\u00020D8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010R\u001a\u00020L8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010W\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010X¨\u0006Y"}, m88121d2 = {"Ll/wdy;", "Ll/iam;", "Ll/idy;", "Lcom/p1/mobile/putong/core/newui/meet/likers/MeetLikersFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/meet/likers/MeetLikersFrag;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "b", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "", "f", "(Ll/idy;)V", "inflateView", "destroy", "()V", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "", "seeLastReadTime", "p", "(J)V", "", "Ll/ezl;", "users", BLiveStormDanmakuGiftResourceType.f45294s, "(Ljava/util/List;)V", "Ll/uby;", RXScreenCaptureService.KEY_INDEX, "()Ll/uby;", "", "hasSeePrivilege", "u", "(Z)V", "q", "a", "Lcom/p1/mobile/putong/core/newui/meet/likers/MeetLikersFrag;", "getFrag", "()Lcom/p1/mobile/putong/core/newui/meet/likers/MeetLikersFrag;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "n", "()Landroidx/recyclerview/widget/RecyclerView;", "set_recycler", "(Landroidx/recyclerview/widget/RecyclerView;)V", "_recycler", "Landroid/widget/LinearLayout;", "c", "Landroid/widget/LinearLayout;", "j", "()Landroid/widget/LinearLayout;", "set_empty", "(Landroid/widget/LinearLayout;)V", "_empty", "Lv/VImage;", Constants.INAPP_DATA_TAG, "Lv/VImage;", "k", "()Lv/VImage;", "set_empty_image", "(Lv/VImage;)V", "_empty_image", "Lv/VText;", "e", "Lv/VText;", BLiveStormDanmakuGiftResourceType.f45292l, "()Lv/VText;", "set_empty_tip", "(Lv/VText;)V", "_empty_tip", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "m", "()Landroid/widget/TextView;", "set_get_privilege", "(Landroid/widget/TextView;)V", "_get_privilege", "g", "Ll/idy;", "h", "Ll/uby;", "meetLikersAdapter", "Z", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public class wdy implements iam<idy> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final MeetLikersFrag frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public RecyclerView _recycler;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public LinearLayout _empty;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VImage _empty_image;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VText _empty_tip;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public TextView _get_privilege;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public idy presenter;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public uby meetLikersAdapter;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean hasSeePrivilege;

    /* JADX INFO: renamed from: l.wdy$a */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m88121d2 = {"l/wdy$a", "Landroidx/recyclerview/widget/GridLayoutManager$c;", "", "position", "f", "(I)I", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C21086a extends GridLayoutManager.AbstractC0554c {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ GridLayoutManager f188657b;

        public C21086a(GridLayoutManager gridLayoutManager) {
            this.f188657b = gridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0554c
        /* JADX INFO: renamed from: f */
        public int mo3330f(int position) {
            uby ubyVar = wdy.this.meetLikersAdapter;
            if (ubyVar == null) {
                Intrinsics.m88391r("meetLikersAdapter");
                ubyVar = null;
            }
            int itemViewType = ubyVar.getItemViewType(position);
            uby.Companion companion = uby.INSTANCE;
            if (itemViewType == companion.m195347a() || itemViewType == companion.m195348b()) {
                return this.f188657b.m3318m();
            }
            return 1;
        }
    }

    /* JADX INFO: renamed from: l.wdy$b */
    @Metadata(m88120d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m88121d2 = {"l/wdy$b", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", OMSTemplateModeType.view, "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$a0;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$a0;)V", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C21087b extends RecyclerView.AbstractC0578n {
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C0561a0 state) {
            outRect.getClass();
            view.getClass();
            parent.getClass();
            state.getClass();
            if (view instanceof MeetLikersUserView) {
                int iM193530c = txq.m193530c(4);
                MeetLikersUserView meetLikersUserView = (MeetLikersUserView) view;
                outRect.left = meetLikersUserView.m41537j() ? iM193530c * 2 : iM193530c;
                outRect.right = meetLikersUserView.m41537j() ? iM193530c : iM193530c * 2;
                outRect.bottom = iM193530c * 2;
            }
        }
    }

    /* JADX INFO: renamed from: l.wdy$c */
    @Metadata(m88120d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m88121d2 = {"l/wdy$c", "Landroidx/recyclerview/widget/RecyclerView$t;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "a", "(Landroidx/recyclerview/widget/RecyclerView;)Z", "", "dx", "dy", "", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C21088c extends RecyclerView.AbstractC0584t {
        public C21088c() {
        }

        /* JADX INFO: renamed from: a */
        private final boolean m205988a(RecyclerView recyclerView) {
            return recyclerView != null && recyclerView.computeVerticalScrollRange() > bnl0.m105588w0() && recyclerView.computeVerticalScrollExtent() + recyclerView.computeVerticalScrollOffset() >= recyclerView.computeVerticalScrollRange();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
            recyclerView.getClass();
            super.onScrolled(recyclerView, dx, dy);
            if (CoreModule.m30933P().m143410g().mo36014Fs() || !m205988a(recyclerView)) {
                return;
            }
            CoreModule.m30933P().m143405a().mo34625wr(wdy.this.getAct(), "p_meet_see,card_button_pull", Privilege.see_who_likes_me);
        }
    }

    /* JADX INFO: renamed from: l.wdy$d */
    @Metadata(m88120d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m88121d2 = {"l/wdy$d", "Ll/ldy$a;", "Lcom/p1/mobile/putong/data/User;", "clickedUser", "", "liked", "superLike", "fromButton", "", "p", "(Lcom/p1/mobile/putong/data/User;ZZZ)V", "o", "(Z)V", "n", "()Z", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C21089d implements ldy.InterfaceC18380a {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ RecyclerView f188660b;

        public C21089d(RecyclerView recyclerView) {
            this.f188660b = recyclerView;
        }

        @Override // p153l.ldy.InterfaceC18380a
        /* JADX INFO: renamed from: n */
        public boolean mo153823n() {
            return !wdy.this.hasSeePrivilege;
        }

        @Override // p153l.ldy.InterfaceC18380a
        /* JADX INFO: renamed from: o */
        public void mo153824o(boolean liked) {
            RecyclerView.Adapter adapter = this.f188660b.getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
            }
        }

        @Override // p153l.ldy.InterfaceC18380a
        /* JADX INFO: renamed from: p */
        public void mo153825p(User clickedUser, boolean liked, boolean superLike, boolean fromButton) {
            clickedUser.getClass();
            idy idyVar = wdy.this.presenter;
            if (idyVar != null) {
                idyVar.m139575E(clickedUser, liked, fromButton);
            }
        }
    }

    public wdy(@NotNull MeetLikersFrag meetLikersFrag) {
        meetLikersFrag.getClass();
        this.frag = meetLikersFrag;
        this.hasSeePrivilege = !CoreModule.f18273l.m143405a().mo34492e2();
    }

    /* JADX INFO: renamed from: a */
    public static void m205972a(wdy wdyVar, View view) {
        CoreModule.m30933P().m143405a().mo34625wr(wdyVar.getAct(), "p_meet_see,card_button_pull", Privilege.see_who_likes_me);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.frag.act();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final View m205976b(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM210495b = xdy.m210495b(this, inflater, parent);
        viewM210495b.getClass();
        return viewM210495b;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@Nullable idy presenter) {
        this.presenter = presenter;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final uby m205978i() {
        uby ubyVar = this.meetLikersAdapter;
        if (ubyVar != null) {
            return ubyVar;
        }
        Intrinsics.m88391r("meetLikersAdapter");
        return null;
    }

    @Override // p153l.iam
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m205976b(inflater, parent);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final LinearLayout m205979j() {
        LinearLayout linearLayout = this._empty;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m88391r("_empty");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final VImage m205980k() {
        VImage vImage = this._empty_image;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_empty_image");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final VText m205981l() {
        VText vText = this._empty_tip;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_empty_tip");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final TextView m205982m() {
        TextView textView = this._get_privilege;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_get_privilege");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final RecyclerView m205983n() {
        RecyclerView recyclerView = this._recycler;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.m88391r("_recycler");
        return null;
    }

    /* JADX INFO: renamed from: p */
    public final void m205984p(long seeLastReadTime) {
        RecyclerView recyclerViewM205983n = m205983n();
        this.meetLikersAdapter = new uby(this.presenter, seeLastReadTime);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.frag.act(), 2);
        gridLayoutManager.m3327v(new C21086a(gridLayoutManager));
        recyclerViewM205983n.setLayoutManager(gridLayoutManager);
        recyclerViewM205983n.addItemDecoration(new C21087b());
        uby ubyVar = this.meetLikersAdapter;
        if (ubyVar == null) {
            Intrinsics.m88391r("meetLikersAdapter");
            ubyVar = null;
        }
        recyclerViewM205983n.setAdapter(ubyVar);
        new C0607k(new ldy(new C21089d(recyclerViewM205983n))).m3751g(recyclerViewM205983n);
        recyclerViewM205983n.addOnScrollListener(new C21088c());
        m205982m().setText("解锁所有喜欢我的人");
        bnl0.m105509E0(m205982m(), new View.OnClickListener() { // from class: l.vdy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wdy.m205972a(this.f183688a, view);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public final void m205985q() {
        m205980k().setImageResource(gbc0.f103308g6);
        m205981l().setTextSize(14.0f);
        m205981l().setTextColor(Color.parseColor("#42000000"));
        VText vTextM205981l = m205981l();
        Act act = getAct();
        vTextM205981l.setText(act != null ? act.string(R$string.f21383e1) : null);
    }

    /* JADX INFO: renamed from: s */
    public final void m205986s(@NotNull List<? extends ezl> users) {
        users.getClass();
        if (users.isEmpty()) {
            bnl0.m105524M(m205983n(), false);
            bnl0.m105524M(m205979j(), true);
            m205985q();
            return;
        }
        bnl0.m105524M(m205983n(), true);
        bnl0.m105524M(m205979j(), false);
        uby ubyVar = this.meetLikersAdapter;
        if (ubyVar == null) {
            Intrinsics.m88391r("meetLikersAdapter");
            ubyVar = null;
        }
        ubyVar.m195346M(users);
    }

    /* JADX INFO: renamed from: u */
    public final void m205987u(boolean hasSeePrivilege) {
        this.hasSeePrivilege = hasSeePrivilege;
        bnl0.m105524M(m205982m(), !hasSeePrivilege);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
