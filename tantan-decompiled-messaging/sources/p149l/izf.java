package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.C0605k;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.PlatformQualificationView;
import com.p046p1.mobile.putong.core.p053ui.seepage.likers.mytab.FakeLikersMyTabFrag;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VRecyclerView;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0010J\u0015\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\tJ\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010 \u001a\u00020\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\"\u0010\u0018R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010\u0006R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00106\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010>\u001a\u0002078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010F\u001a\u00020?8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010N\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0018\u0010T\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010W\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010Y\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010VR\u0016\u0010Z\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010V¨\u0006["}, m87232d2 = {"Ll/izf;", "Ll/s7m;", "Ll/fzf;", "Lcom/p1/mobile/putong/core/ui/seepage/likers/mytab/FakeLikersMyTabFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/ui/seepage/likers/mytab/FakeLikersMyTabFrag;)V", "", "r", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "c", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "k", "(Ll/fzf;)V", "inflateView", "", "isShow", "u", "(Z)V", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "", "Lcom/p1/mobile/putong/data/User;", "users", BLiveStormDanmakuGiftResourceType.f44446s, "(Ljava/util/List;)V", ResourceDirection.f38808v, "a", "Lcom/p1/mobile/putong/core/ui/seepage/likers/mytab/FakeLikersMyTabFrag;", BLiveStormDanmakuGiftResourceType.f44444l, "()Lcom/p1/mobile/putong/core/ui/seepage/likers/mytab/FakeLikersMyTabFrag;", "setFrag", "Lv/VRecyclerView;", "b", "Lv/VRecyclerView;", "q", "()Lv/VRecyclerView;", "set_list", "(Lv/VRecyclerView;)V", "_list", "Landroidx/core/widget/NestedScrollView;", "Landroidx/core/widget/NestedScrollView;", "m", "()Landroidx/core/widget/NestedScrollView;", "set_empty", "(Landroidx/core/widget/NestedScrollView;)V", "_empty", "Landroid/widget/TextView;", Constants.INAPP_DATA_TAG, "Landroid/widget/TextView;", "n", "()Landroid/widget/TextView;", "set_empty_text", "(Landroid/widget/TextView;)V", "_empty_text", "Lcom/p1/mobile/putong/core/newui/PlatformQualificationView;", "e", "Lcom/p1/mobile/putong/core/newui/PlatformQualificationView;", "get_platform_qualification", "()Lcom/p1/mobile/putong/core/newui/PlatformQualificationView;", "set_platform_qualification", "(Lcom/p1/mobile/putong/core/newui/PlatformQualificationView;)V", "_platform_qualification", "Landroid/widget/Button;", "f", "Landroid/widget/Button;", "p", "()Landroid/widget/Button;", "set_get_privilege", "(Landroid/widget/Button;)V", "_get_privilege", "g", "Ll/fzf;", "Landroidx/recyclerview/widget/k;", "h", "Landroidx/recyclerview/widget/k;", "itemTouchHelper", RXScreenCaptureService.KEY_INDEX, "Z", "isCollapsed", "j", "isShowScrollDlg", "isShowIngScrollDlg", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class izf implements s7m<fzf> {

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
    public fzf presenter;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public C0605k itemTouchHelper;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean isCollapsed;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public boolean isShowScrollDlg;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public boolean isShowIngScrollDlg;

    /* JADX INFO: renamed from: l.izf$a */
    @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m87232d2 = {"l/izf$a", "Landroidx/recyclerview/widget/GridLayoutManager$c;", "", "position", "f", "(I)I", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C17651a extends GridLayoutManager.AbstractC0553c {
        public C17651a() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0553c
        /* JADX INFO: renamed from: f */
        public int mo3329f(int position) {
            int itemViewType = izf.this.getFrag().m54983N4().getItemViewType(position);
            return (itemViewType == 0 || itemViewType != 1) ? 1 : 2;
        }
    }

    /* JADX INFO: renamed from: l.izf$b */
    @Metadata(m87231d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"l/izf$b", "Ll/xyf$b;", "Lcom/p1/mobile/putong/data/User;", "user", "", Constants.INAPP_POSITION, "", "a", "(Lcom/p1/mobile/putong/data/User;I)V", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C17652b implements xyf.InterfaceC21262b {
        public C17652b() {
        }

        @Override // p149l.xyf.InterfaceC21262b
        /* JADX INFO: renamed from: a */
        public void mo139062a(User user, int pos) {
            user.getClass();
            fzf fzfVar = izf.this.presenter;
            if (fzfVar != null) {
                fzfVar.m123839n0(user);
            }
        }
    }

    /* JADX INFO: renamed from: l.izf$c */
    @Metadata(m87231d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m87232d2 = {"l/izf$c", "Landroidx/recyclerview/widget/RecyclerView$t;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "dx", "dy", "", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C17653c extends RecyclerView.AbstractC0582t {
        public C17653c() {
        }

        /* JADX INFO: renamed from: a */
        public static void m139063a(izf izfVar) {
            izfVar.isShowIngScrollDlg = false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
            fzf fzfVar;
            recyclerView.getClass();
            super.onScrolled(recyclerView, dx, dy);
            if (izf.this.isShowScrollDlg || recyclerView.computeVerticalScrollOffset() <= t100.m186890d(600.0f)) {
                if (!sjc0.m184481a(recyclerView) || !sjc0.m184482b(recyclerView) || izf.this.isShowIngScrollDlg || (fzfVar = izf.this.presenter) == null) {
                    return;
                }
                fzf.m123836p0(fzfVar, "p_navigation,see_module", null, 2, null);
                return;
            }
            izf.this.isShowScrollDlg = true;
            izf.this.isShowIngScrollDlg = true;
            fzf fzfVar2 = izf.this.presenter;
            if (fzfVar2 != null) {
                final izf izfVar = izf.this;
                fzfVar2.m123840o0("p_navigation,see_module", new d30() { // from class: l.jzf
                    @Override // p149l.d30
                    public final void call() {
                        izf.C17653c.m139063a(izfVar);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: l.izf$d */
    @Metadata(m87231d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m87232d2 = {"l/izf$d", "Ll/xyf$a;", "", "getType", "()I", "Lcom/p1/mobile/putong/data/User;", "getUser", "()Lcom/p1/mobile/putong/data/User;", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C17654d implements xyf.InterfaceC21261a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ User f115569a;

        public C17654d(User user) {
            this.f115569a = user;
        }

        @Override // p149l.xyf.InterfaceC21261a
        public int getType() {
            return 0;
        }

        @Override // p149l.xyf.InterfaceC21261a
        /* JADX INFO: renamed from: getUser, reason: from getter */
        public User getF115569a() {
            return this.f115569a;
        }
    }

    /* JADX INFO: renamed from: l.izf$e */
    @Metadata(m87231d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m87232d2 = {"l/izf$e", "Ll/xyf$a;", "", "getType", "()I", "Lcom/p1/mobile/putong/data/User;", "getUser", "()Lcom/p1/mobile/putong/data/User;", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C17655e implements xyf.InterfaceC21261a {
        @Override // p149l.xyf.InterfaceC21261a
        public int getType() {
            return 1;
        }

        @Override // p149l.xyf.InterfaceC21261a
        /* JADX INFO: renamed from: getUser */
        public User getF115569a() {
            return null;
        }
    }

    public izf(@NotNull FakeLikersMyTabFrag fakeLikersMyTabFrag) {
        fakeLikersMyTabFrag.getClass();
        this.frag = fakeLikersMyTabFrag;
    }

    /* JADX INFO: renamed from: a */
    public static void m139044a(izf izfVar, View view, User user, int i, boolean z, int i2) {
        fzf fzfVar;
        xyf xyfVarM54983N4 = izfVar.frag.m54983N4();
        if (xyfVarM54983N4 != null) {
            xyfVarM54983N4.notifyDataSetChanged();
        }
        if (i == 2 || i == 4 || !z || (fzfVar = izfVar.presenter) == null) {
            return;
        }
        user.getClass();
        fzfVar.m123839n0(user);
    }

    /* JADX INFO: renamed from: b */
    public static void m139045b(izf izfVar, View view) {
        fzf fzfVar = izfVar.presenter;
        if (fzfVar != null) {
            fzf.m123836p0(fzfVar, "p_navigation,see_module", null, 2, null);
        }
    }

    /* JADX INFO: renamed from: r */
    private final void m139051r() {
        m139060u(true);
        m139056n().setText("去滑卡获取喜欢和配对");
        xdl0.m208329E0(m139057p(), new View.OnClickListener() { // from class: l.gzf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                izf.m139045b(this.f105132a, view);
            }
        });
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        gridLayoutManager.m3326v(new C17651a());
        m139058q().setLayoutManager(gridLayoutManager);
        m139058q().setAdapter(this.frag.m54983N4());
        xyf xyfVarM54983N4 = this.frag.m54983N4();
        if (xyfVarM54983N4 != null) {
            xyfVarM54983N4.m211768L(new C17652b());
        }
        if (bzc0.INSTANCE.m104571c()) {
            m139058q().setOnScrollListener(new C17653c());
        }
        C0605k c0605k = new C0605k(new nyf(new nyf.InterfaceC18801a() { // from class: l.hzf
            @Override // p149l.nyf.InterfaceC18801a
            /* JADX INFO: renamed from: a */
            public final void mo119038a(View view, User user, int i, boolean z, int i2) {
                izf.m139044a(this.f110194a, view, user, i, z, i2);
            }
        }));
        c0605k.m3750g(m139058q());
        this.itemTouchHelper = c0605k;
        m139061v(this.isCollapsed);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.frag.getContext();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final View m139052c(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM147950b = kzf.m147950b(this, inflater, parent);
        viewM147950b.getClass();
        return viewM147950b;
    }

    @Override // p149l.s7m
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM139052c = m139052c(inflater, parent);
        m139051r();
        return viewM139052c;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(@NotNull fzf presenter) {
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
    public final NestedScrollView m139055m() {
        NestedScrollView nestedScrollView = this._empty;
        if (nestedScrollView != null) {
            return nestedScrollView;
        }
        Intrinsics.m87502r("_empty");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final TextView m139056n() {
        TextView textView = this._empty_text;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_empty_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final Button m139057p() {
        Button button = this._get_privilege;
        if (button != null) {
            return button;
        }
        Intrinsics.m87502r("_get_privilege");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final VRecyclerView m139058q() {
        VRecyclerView vRecyclerView = this._list;
        if (vRecyclerView != null) {
            return vRecyclerView;
        }
        Intrinsics.m87502r("_list");
        return null;
    }

    /* JADX INFO: renamed from: s */
    public final void m139059s(@NotNull List<? extends User> users) {
        users.getClass();
        ArrayList<xyf.InterfaceC21261a> arrayList = new ArrayList<>();
        List<? extends User> list = users;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C17654d((User) it.next()));
        }
        arrayList.addAll(arrayList2);
        arrayList.add(new C17655e());
        xyf xyfVarM54983N4 = this.frag.m54983N4();
        if (xyfVarM54983N4 != null) {
            Long l2 = CoreModule.f17545c.f19687u0.f19255l0.get();
            l2.getClass();
            xyfVarM54983N4.m211767K(arrayList, l2.longValue());
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m139060u(boolean isShow) {
        xdl0.m208344M(m139055m(), isShow);
        xdl0.m208344M(m139058q(), !isShow);
    }

    /* JADX INFO: renamed from: v */
    public final void m139061v(boolean isShow) {
        if (this._get_privilege != null) {
            xdl0.m208344M(m139057p(), isShow);
            this.isShowScrollDlg = false;
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
