package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.C0607k;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.PlatformQualificationView;
import com.p051p1.mobile.putong.core.p058ui.seepage.likers.mytab.FakeLikersMyTabFrag;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0010J\u0015\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\tJ\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010 \u001a\u00020\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\"\u0010\u0018R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010\u0006R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00106\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010>\u001a\u0002078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010F\u001a\u00020?8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010N\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0018\u0010T\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010W\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010Y\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010VR\u0016\u0010Z\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010V¨\u0006["}, m88121d2 = {"Ll/w0g;", "Ll/iam;", "Ll/t0g;", "Lcom/p1/mobile/putong/core/ui/seepage/likers/mytab/FakeLikersMyTabFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/ui/seepage/likers/mytab/FakeLikersMyTabFrag;)V", "", "r", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "c", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "k", "(Ll/t0g;)V", "inflateView", "", "isShow", "u", "(Z)V", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "", "Lcom/p1/mobile/putong/data/User;", "users", BLiveStormDanmakuGiftResourceType.f45294s, "(Ljava/util/List;)V", ResourceDirection.f39656v, "a", "Lcom/p1/mobile/putong/core/ui/seepage/likers/mytab/FakeLikersMyTabFrag;", BLiveStormDanmakuGiftResourceType.f45292l, "()Lcom/p1/mobile/putong/core/ui/seepage/likers/mytab/FakeLikersMyTabFrag;", "setFrag", "Lv/VRecyclerView;", "b", "Lv/VRecyclerView;", "q", "()Lv/VRecyclerView;", "set_list", "(Lv/VRecyclerView;)V", "_list", "Landroidx/core/widget/NestedScrollView;", "Landroidx/core/widget/NestedScrollView;", "m", "()Landroidx/core/widget/NestedScrollView;", "set_empty", "(Landroidx/core/widget/NestedScrollView;)V", "_empty", "Landroid/widget/TextView;", Constants.INAPP_DATA_TAG, "Landroid/widget/TextView;", "n", "()Landroid/widget/TextView;", "set_empty_text", "(Landroid/widget/TextView;)V", "_empty_text", "Lcom/p1/mobile/putong/core/newui/PlatformQualificationView;", "e", "Lcom/p1/mobile/putong/core/newui/PlatformQualificationView;", "get_platform_qualification", "()Lcom/p1/mobile/putong/core/newui/PlatformQualificationView;", "set_platform_qualification", "(Lcom/p1/mobile/putong/core/newui/PlatformQualificationView;)V", "_platform_qualification", "Landroid/widget/Button;", "f", "Landroid/widget/Button;", "p", "()Landroid/widget/Button;", "set_get_privilege", "(Landroid/widget/Button;)V", "_get_privilege", "g", "Ll/t0g;", "Landroidx/recyclerview/widget/k;", "h", "Landroidx/recyclerview/widget/k;", "itemTouchHelper", RXScreenCaptureService.KEY_INDEX, "Z", "isCollapsed", "j", "isShowScrollDlg", "isShowIngScrollDlg", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class w0g implements iam<t0g> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public FakeLikersMyTabFrag frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VRecyclerView _list;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public NestedScrollView _empty;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public TextView _empty_text;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public PlatformQualificationView _platform_qualification;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public Button _get_privilege;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public t0g presenter;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public C0607k itemTouchHelper;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean isCollapsed;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public boolean isShowScrollDlg;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public boolean isShowIngScrollDlg;

    /* JADX INFO: renamed from: l.w0g$a */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m88121d2 = {"l/w0g$a", "Landroidx/recyclerview/widget/GridLayoutManager$c;", "", "position", "f", "(I)I", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C20967a extends GridLayoutManager.AbstractC0554c {
        public C20967a() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0554c
        /* JADX INFO: renamed from: f */
        public int mo3330f(int position) {
            int itemViewType = w0g.this.getFrag().m56166N4().getItemViewType(position);
            return (itemViewType == 0 || itemViewType != 1) ? 1 : 2;
        }
    }

    /* JADX INFO: renamed from: l.w0g$b */
    @Metadata(m88120d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"l/w0g$b", "Ll/l0g$b;", "Lcom/p1/mobile/putong/data/User;", "user", "", Constants.INAPP_POSITION, "", "a", "(Lcom/p1/mobile/putong/data/User;I)V", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C20968b implements l0g.InterfaceC18328b {
        public C20968b() {
        }

        @Override // p153l.l0g.InterfaceC18328b
        /* JADX INFO: renamed from: a */
        public void mo152347a(User user, int pos) {
            user.getClass();
            t0g t0gVar = w0g.this.presenter;
            if (t0gVar != null) {
                t0gVar.m188735n0(user);
            }
        }
    }

    /* JADX INFO: renamed from: l.w0g$c */
    @Metadata(m88120d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m88121d2 = {"l/w0g$c", "Landroidx/recyclerview/widget/RecyclerView$t;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "dx", "dy", "", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C20969c extends RecyclerView.AbstractC0584t {
        public C20969c() {
        }

        /* JADX INFO: renamed from: a */
        public static void m204180a(w0g w0gVar) {
            w0gVar.isShowIngScrollDlg = false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
            t0g t0gVar;
            recyclerView.getClass();
            super.onScrolled(recyclerView, dx, dy);
            if (w0g.this.isShowScrollDlg || recyclerView.computeVerticalScrollOffset() <= qa00.m175859d(600.0f)) {
                if (!zrc0.m221154a(recyclerView) || !zrc0.m221155b(recyclerView) || w0g.this.isShowIngScrollDlg || (t0gVar = w0g.this.presenter) == null) {
                    return;
                }
                t0g.m188732p0(t0gVar, "p_navigation,see_module", null, 2, null);
                return;
            }
            w0g.this.isShowScrollDlg = true;
            w0g.this.isShowIngScrollDlg = true;
            t0g t0gVar2 = w0g.this.presenter;
            if (t0gVar2 != null) {
                final w0g w0gVar = w0g.this;
                t0gVar2.m188736o0("p_navigation,see_module", new x20() { // from class: l.x0g
                    @Override // p153l.x20
                    public final void call() {
                        w0g.C20969c.m204180a(w0gVar);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: l.w0g$d */
    @Metadata(m88120d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m88121d2 = {"l/w0g$d", "Ll/l0g$a;", "", "getType", "()I", "Lcom/p1/mobile/putong/data/User;", "getUser", "()Lcom/p1/mobile/putong/data/User;", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C20970d implements l0g.InterfaceC18327a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ User f186593a;

        public C20970d(User user) {
            this.f186593a = user;
        }

        @Override // p153l.l0g.InterfaceC18327a
        public int getType() {
            return 0;
        }

        @Override // p153l.l0g.InterfaceC18327a
        /* JADX INFO: renamed from: getUser, reason: from getter */
        public User getF186593a() {
            return this.f186593a;
        }
    }

    /* JADX INFO: renamed from: l.w0g$e */
    @Metadata(m88120d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m88121d2 = {"l/w0g$e", "Ll/l0g$a;", "", "getType", "()I", "Lcom/p1/mobile/putong/data/User;", "getUser", "()Lcom/p1/mobile/putong/data/User;", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C20971e implements l0g.InterfaceC18327a {
        @Override // p153l.l0g.InterfaceC18327a
        public int getType() {
            return 1;
        }

        @Override // p153l.l0g.InterfaceC18327a
        /* JADX INFO: renamed from: getUser */
        public User getF186593a() {
            return null;
        }
    }

    public w0g(@NotNull FakeLikersMyTabFrag fakeLikersMyTabFrag) {
        fakeLikersMyTabFrag.getClass();
        this.frag = fakeLikersMyTabFrag;
    }

    /* JADX INFO: renamed from: a */
    public static void m204162a(w0g w0gVar, View view, User user, int i, boolean z, int i2) {
        t0g t0gVar;
        l0g l0gVarM56166N4 = w0gVar.frag.m56166N4();
        if (l0gVarM56166N4 != null) {
            l0gVarM56166N4.notifyDataSetChanged();
        }
        if (i == 2 || i == 4 || !z || (t0gVar = w0gVar.presenter) == null) {
            return;
        }
        user.getClass();
        t0gVar.m188735n0(user);
    }

    /* JADX INFO: renamed from: b */
    public static void m204163b(w0g w0gVar, View view) {
        t0g t0gVar = w0gVar.presenter;
        if (t0gVar != null) {
            t0g.m188732p0(t0gVar, "p_navigation,see_module", null, 2, null);
        }
    }

    /* JADX INFO: renamed from: r */
    private final void m204169r() {
        m204178u(true);
        m204174n().setText("去滑卡获取喜欢和配对");
        bnl0.m105509E0(m204175p(), new View.OnClickListener() { // from class: l.u0g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w0g.m204163b(this.f176882a, view);
            }
        });
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        gridLayoutManager.m3327v(new C20967a());
        m204176q().setLayoutManager(gridLayoutManager);
        m204176q().setAdapter(this.frag.m56166N4());
        l0g l0gVarM56166N4 = this.frag.m56166N4();
        if (l0gVarM56166N4 != null) {
            l0gVarM56166N4.m152346L(new C20968b());
        }
        if (e7d0.INSTANCE.m119702c()) {
            m204176q().setOnScrollListener(new C20969c());
        }
        C0607k c0607k = new C0607k(new b0g(new b0g.InterfaceC15881a() { // from class: l.v0g
            @Override // p153l.b0g.InterfaceC15881a
            /* JADX INFO: renamed from: a */
            public final void mo101304a(View view, User user, int i, boolean z, int i2) {
                w0g.m204162a(this.f181857a, view, user, i, z, i2);
            }
        }));
        c0607k.m3751g(m204176q());
        this.itemTouchHelper = c0607k;
        m204179v(this.isCollapsed);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.frag.getContext();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final View m204170c(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM213847b = y0g.m213847b(this, inflater, parent);
        viewM213847b.getClass();
        return viewM213847b;
    }

    @Override // p153l.iam
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM204170c = m204170c(inflater, parent);
        m204169r();
        return viewM204170c;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@NotNull t0g presenter) {
        presenter.getClass();
        this.presenter = presenter;
    }

    @NotNull
    /* JADX INFO: renamed from: l, reason: from getter */
    public final FakeLikersMyTabFrag getFrag() {
        return this.frag;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final NestedScrollView m204173m() {
        NestedScrollView nestedScrollView = this._empty;
        if (nestedScrollView != null) {
            return nestedScrollView;
        }
        Intrinsics.m88391r("_empty");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final TextView m204174n() {
        TextView textView = this._empty_text;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_empty_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final Button m204175p() {
        Button button = this._get_privilege;
        if (button != null) {
            return button;
        }
        Intrinsics.m88391r("_get_privilege");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final VRecyclerView m204176q() {
        VRecyclerView vRecyclerView = this._list;
        if (vRecyclerView != null) {
            return vRecyclerView;
        }
        Intrinsics.m88391r("_list");
        return null;
    }

    /* JADX INFO: renamed from: s */
    public final void m204177s(@NotNull List<? extends User> users) {
        users.getClass();
        ArrayList<l0g.InterfaceC18327a> arrayList = new ArrayList<>();
        List<? extends User> list = users;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C20970d((User) it.next()));
        }
        arrayList.addAll(arrayList2);
        arrayList.add(new C20971e());
        l0g l0gVarM56166N4 = this.frag.m56166N4();
        if (l0gVarM56166N4 != null) {
            Long l2 = CoreModule.f18264c.f20429u0.f19997m0.get();
            l2.getClass();
            l0gVarM56166N4.m152345K(arrayList, l2.longValue());
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m204178u(boolean isShow) {
        bnl0.m105524M(m204173m(), isShow);
        bnl0.m105524M(m204176q(), !isShow);
    }

    /* JADX INFO: renamed from: v */
    public final void m204179v(boolean isShow) {
        if (this._get_privilege != null) {
            bnl0.m105524M(m204175p(), isShow);
            this.isShowScrollDlg = false;
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
