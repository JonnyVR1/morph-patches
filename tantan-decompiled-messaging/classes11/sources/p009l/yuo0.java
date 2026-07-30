package p009l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import com.p1.mobile.putong.live.livingroom.archi.dialogcenter.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.aq2;
import l.d30;
import l.e30;
import l.f30;
import l.i3c0;
import l.kvc0;
import l.t100;
import l.vdt;
import l.wxs;
import l.xdl0;
import l.zuo0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0018B'\u0012\u000e\u0010\u0003\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u0016\u0010\u000fJ\u000f\u0010\u0017\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0011R\u001f\u0010\u0003\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010;\u001a\u0002048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0014\u0010>\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010=R0\u0010E\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0004\u0018\u00010?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR$\u0010M\u001a\u0004\u0018\u00010F8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001b\u0010S\u001a\u00020N8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R¨\u0006T"}, d2 = {"Ll/yuo0;", "", "Ll/wxs;", "presenter", "", "res", "Ll/aq2;", "style", "<init>", "(Ll/wxs;ILl/aq2;)V", "", "Lcom/p1/mobile/putong/live/base/data/BLiveCommonViewConfig;", "operateMenus", "", "t", "(Ljava/util/List;)V", "k", "()V", "Landroid/view/View;", "view", "g", "(Landroid/view/View;)V", "p", "h", "a", "Ll/wxs;", "getPresenter", "()Ll/wxs;", "b", "I", "getRes", "()I", "c", "Ll/aq2;", "getStyle", "()Ll/aq2;", "Landroid/widget/LinearLayout;", "d", "Landroid/widget/LinearLayout;", "o", "()Landroid/widget/LinearLayout;", "set_root", "(Landroid/widget/LinearLayout;)V", "_root", "Landroidx/recyclerview/widget/RecyclerView;", "e", "Landroidx/recyclerview/widget/RecyclerView;", "n", "()Landroidx/recyclerview/widget/RecyclerView;", "set_menu_list", "(Landroidx/recyclerview/widget/RecyclerView;)V", "_menu_list", "Landroid/widget/ImageView;", "f", "Landroid/widget/ImageView;", "m", "()Landroid/widget/ImageView;", "set_menu_close", "(Landroid/widget/ImageView;)V", "_menu_close", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "adapter", "Ll/f30;", "Ll/f30;", "getClickAction", "()Ll/f30;", "r", "(Ll/f30;)V", "clickAction", "Ll/yuo0$a;", "i", "Ll/yuo0$a;", "getDismissListener", "()Ll/yuo0$a;", "s", "(Ll/yuo0$a;)V", "dismissListener", "Lcom/p1/mobile/putong/live/livingroom/archi/dialogcenter/a;", "j", "Lkotlin/Lazy;", "l", "()Lcom/p1/mobile/putong/live/livingroom/archi/dialogcenter/a;", "dialog", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class yuo0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final wxs<?, ?> presenter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int res;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final aq2 style;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public LinearLayout _root;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public RecyclerView _menu_list;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public ImageView _menu_close;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final LiveBaseAdapter adapter;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public f30<BLiveCommonViewConfig, Integer> clickAction;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public InterfaceC1336a dismissListener;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final Lazy dialog;

    /* JADX INFO: renamed from: l.yuo0$a */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Ll/yuo0$a;", "", "", "onDismiss", "()V", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface InterfaceC1336a {
        void onDismiss();
    }

    public yuo0(@NotNull wxs<?, ?> wxsVar, int i, @NotNull aq2 aq2Var) {
        wxsVar.getClass();
        aq2Var.getClass();
        this.presenter = wxsVar;
        this.res = i;
        this.style = aq2Var;
        this.adapter = new LiveBaseAdapter();
        this.dialog = LazyKt__LazyJVMKt.b(new Function0() { // from class: l.suo0
            public final Object invoke() {
                return yuo0.m25511a(this.f20476a);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static a m25511a(final yuo0 yuo0Var) {
        a aVar = new a(yuo0Var.presenter, yuo0Var.res, yuo0Var.style);
        aVar.h0(new e30() { // from class: l.uuo0
            public final void call(Object obj) {
                yuo0.m25517i(this.f21343a, (View) obj);
            }
        });
        return aVar;
    }

    /* JADX INFO: renamed from: b */
    public static void m25512b(yuo0 yuo0Var, List list, DialogInterface dialogInterface) {
        yuo0Var.m25527p(list);
    }

    /* JADX INFO: renamed from: f */
    public static void m25516f(yuo0 yuo0Var) {
        InterfaceC1336a interfaceC1336a = yuo0Var.dismissListener;
        if (interfaceC1336a != null) {
            interfaceC1336a.onDismiss();
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m25517i(final yuo0 yuo0Var, View view) {
        view.getClass();
        yuo0Var.m25520g(view);
        yuo0Var.m25525n().setLayoutManager(new GridLayoutManager(yuo0Var.presenter.act(), 3));
        yuo0Var.m25525n().setAdapter(yuo0Var.adapter);
        yuo0Var.m25524m().setOnClickListener(new View.OnClickListener() { // from class: l.xuo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                yuo0.m25518j(this.f22734a, view2);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public static final void m25518j(yuo0 yuo0Var, View view) {
        yuo0Var.m25523l().O();
    }

    /* JADX INFO: renamed from: q */
    public static final void m25519q(yuo0 yuo0Var, BLiveCommonViewConfig bLiveCommonViewConfig, int i, View view) {
        f30<BLiveCommonViewConfig, Integer> f30Var = yuo0Var.clickAction;
        if (f30Var != null) {
            f30Var.call(bLiveCommonViewConfig, Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m25520g(View view) {
        zuo0.a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public final void m25521h() {
        xdl0.X(m25525n(), t100.d(10.0f) + xdl0.F0());
        m25526o().setBackground(kvc0.b(i3c0.M));
    }

    /* JADX INFO: renamed from: k */
    public final void m25522k() {
        if (m25523l().isShowing()) {
            m25523l().P(new d30() { // from class: l.wuo0
                public final void call() {
                    yuo0.m25516f(this.f22332a);
                }
            });
        }
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final a m25523l() {
        return (a) this.dialog.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final ImageView m25524m() {
        ImageView imageView = this._menu_close;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.r("_menu_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final RecyclerView m25525n() {
        RecyclerView recyclerView = this._menu_list;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.r("_menu_list");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final LinearLayout m25526o() {
        LinearLayout linearLayout = this._root;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.r("_root");
        return null;
    }

    /* JADX INFO: renamed from: p */
    public final void m25527p(List<? extends BLiveCommonViewConfig> operateMenus) {
        m25521h();
        if (!vdt.b(3)) {
            RecyclerView recyclerViewM25525n = m25525n();
            int i = t100.i;
            xdl0.V(recyclerViewM25525n, i);
            xdl0.W(m25525n(), i);
        }
        GridLayoutManager layoutManager = m25525n().getLayoutManager();
        if (layoutManager != null && (layoutManager instanceof GridLayoutManager)) {
            GridLayoutManager gridLayoutManager = layoutManager;
            if (3 != gridLayoutManager.m()) {
                gridLayoutManager.u(3);
            }
        }
        ArrayList arrayList = new ArrayList();
        final int i2 = 0;
        for (Object obj : operateMenus) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            final BLiveCommonViewConfig bLiveCommonViewConfig = (BLiveCommonViewConfig) obj;
            avo0 avo0Var = new avo0(bLiveCommonViewConfig);
            avo0Var.A(new View.OnClickListener() { // from class: l.vuo0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    yuo0.m25519q(this.f21798a, bLiveCommonViewConfig, i2, view);
                }
            });
            arrayList.add(avo0Var);
            i2 = i3;
        }
        this.adapter.Z(arrayList);
    }

    /* JADX INFO: renamed from: r */
    public final void m25528r(@Nullable f30<BLiveCommonViewConfig, Integer> f30Var) {
        this.clickAction = f30Var;
    }

    /* JADX INFO: renamed from: s */
    public final void m25529s(@Nullable InterfaceC1336a interfaceC1336a) {
        this.dismissListener = interfaceC1336a;
    }

    /* JADX INFO: renamed from: t */
    public final void m25530t(@NotNull final List<? extends BLiveCommonViewConfig> operateMenus) {
        operateMenus.getClass();
        m25523l().setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.tuo0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                yuo0.m25512b(this.f20875a, operateMenus, dialogInterface);
            }
        });
        m25523l().show();
    }
}
