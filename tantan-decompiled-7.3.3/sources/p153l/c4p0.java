package p153l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m88120d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0018B'\u0012\u000e\u0010\u0003\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u0016\u0010\u000fJ\u000f\u0010\u0017\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0011R\u001f\u0010\u0003\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010;\u001a\u0002048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0014\u0010>\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010=R0\u0010E\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0004\u0018\u00010?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR$\u0010M\u001a\u0004\u0018\u00010F8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001b\u0010S\u001a\u00020N8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R¨\u0006T"}, m88121d2 = {"Ll/c4p0;", "", "Ll/xzs;", "presenter", "", ShareConstants.RES_PATH, "Ll/rq2;", "style", "<init>", "(Ll/xzs;ILl/rq2;)V", "", "Lcom/p1/mobile/putong/live/base/data/BLiveCommonViewConfig;", "operateMenus", "", Constants.KEY_T, "(Ljava/util/List;)V", "k", "()V", "Landroid/view/View;", OMSTemplateModeType.view, "g", "(Landroid/view/View;)V", "p", "h", "a", "Ll/xzs;", "getPresenter", "()Ll/xzs;", "b", "I", "getRes", "()I", "c", "Ll/rq2;", "getStyle", "()Ll/rq2;", "Landroid/widget/LinearLayout;", Constants.INAPP_DATA_TAG, "Landroid/widget/LinearLayout;", "o", "()Landroid/widget/LinearLayout;", "set_root", "(Landroid/widget/LinearLayout;)V", "_root", "Landroidx/recyclerview/widget/RecyclerView;", "e", "Landroidx/recyclerview/widget/RecyclerView;", "n", "()Landroidx/recyclerview/widget/RecyclerView;", "set_menu_list", "(Landroidx/recyclerview/widget/RecyclerView;)V", "_menu_list", "Landroid/widget/ImageView;", "f", "Landroid/widget/ImageView;", "m", "()Landroid/widget/ImageView;", "set_menu_close", "(Landroid/widget/ImageView;)V", "_menu_close", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "adapter", "Ll/z20;", "Ll/z20;", "getClickAction", "()Ll/z20;", "r", "(Ll/z20;)V", "clickAction", "Ll/c4p0$a;", RXScreenCaptureService.KEY_INDEX, "Ll/c4p0$a;", "getDismissListener", "()Ll/c4p0$a;", BLiveStormDanmakuGiftResourceType.f45294s, "(Ll/c4p0$a;)V", "dismissListener", "Lcom/p1/mobile/putong/live/livingroom/archi/dialogcenter/a;", "j", "Lkotlin/Lazy;", BLiveStormDanmakuGiftResourceType.f45292l, "()Lcom/p1/mobile/putong/live/livingroom/archi/dialogcenter/a;", OMSTemplateType.dialog, "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class c4p0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final xzs<?, ?> presenter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int res;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final rq2 style;

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
    public z20<BLiveCommonViewConfig, Integer> clickAction;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public InterfaceC16183a dismissListener;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final Lazy dialog;

    /* JADX INFO: renamed from: l.c4p0$a */
    @Metadata(m88120d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005À\u0006\u0003"}, m88121d2 = {"Ll/c4p0$a;", "", "", "onDismiss", "()V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public interface InterfaceC16183a {
        void onDismiss();
    }

    public c4p0(@NotNull xzs<?, ?> xzsVar, int i, @NotNull rq2 rq2Var) {
        xzsVar.getClass();
        rq2Var.getClass();
        this.presenter = xzsVar;
        this.res = i;
        this.style = rq2Var;
        this.adapter = new LiveBaseAdapter();
        this.dialog = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.w3p0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return c4p0.m107936a(this.f187161a);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static DialogC12774a m107936a(final c4p0 c4p0Var) {
        DialogC12774a dialogC12774a = new DialogC12774a(c4p0Var.presenter, c4p0Var.res, c4p0Var.style);
        dialogC12774a.m72959h0(new y20() { // from class: l.y3p0
            @Override // p153l.y20
            public final void call(Object obj) {
                c4p0.m107942i(this.f197383a, (View) obj);
            }
        });
        return dialogC12774a;
    }

    /* JADX INFO: renamed from: b */
    public static void m107937b(c4p0 c4p0Var, List list, DialogInterface dialogInterface) {
        c4p0Var.m107952p(list);
    }

    /* JADX INFO: renamed from: f */
    public static void m107941f(c4p0 c4p0Var) {
        InterfaceC16183a interfaceC16183a = c4p0Var.dismissListener;
        if (interfaceC16183a != null) {
            interfaceC16183a.onDismiss();
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m107942i(final c4p0 c4p0Var, View view) {
        view.getClass();
        c4p0Var.m107945g(view);
        c4p0Var.m107950n().setLayoutManager(new GridLayoutManager(c4p0Var.presenter.act(), 3));
        c4p0Var.m107950n().setAdapter(c4p0Var.adapter);
        c4p0Var.m107949m().setOnClickListener(new View.OnClickListener() { // from class: l.b4p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                c4p0.m107943j(this.f74960a, view2);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public static final void m107943j(c4p0 c4p0Var, View view) {
        c4p0Var.m107948l().m72940O();
    }

    /* JADX INFO: renamed from: q */
    public static final void m107944q(c4p0 c4p0Var, BLiveCommonViewConfig bLiveCommonViewConfig, int i, View view) {
        z20<BLiveCommonViewConfig, Integer> z20Var = c4p0Var.clickAction;
        if (z20Var != null) {
            z20Var.call(bLiveCommonViewConfig, Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m107945g(View view) {
        d4p0.m114228a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public final void m107946h() {
        bnl0.m105540X(m107950n(), qa00.m175859d(10.0f) + bnl0.m105511F0());
        m107951o().setBackground(n3d0.m161278b(obc0.f146109M));
    }

    /* JADX INFO: renamed from: k */
    public final void m107947k() {
        if (m107948l().isShowing()) {
            m107948l().m72941P(new x20() { // from class: l.a4p0
                @Override // p153l.x20
                public final void call() {
                    c4p0.m107941f(this.f68437a);
                }
            });
        }
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final DialogC12774a m107948l() {
        return (DialogC12774a) this.dialog.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final ImageView m107949m() {
        ImageView imageView = this._menu_close;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m88391r("_menu_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final RecyclerView m107950n() {
        RecyclerView recyclerView = this._menu_list;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.m88391r("_menu_list");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final LinearLayout m107951o() {
        LinearLayout linearLayout = this._root;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m88391r("_root");
        return null;
    }

    /* JADX INFO: renamed from: p */
    public final void m107952p(List<? extends BLiveCommonViewConfig> operateMenus) {
        m107946h();
        if (!wft.m206159b(3)) {
            RecyclerView recyclerViewM107950n = m107950n();
            int i = qa00.f156322i;
            bnl0.m105538V(recyclerViewM107950n, i);
            bnl0.m105539W(m107950n(), i);
        }
        RecyclerView.AbstractC0579o layoutManager = m107950n().getLayoutManager();
        if (layoutManager != null && (layoutManager instanceof GridLayoutManager)) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            if (3 != gridLayoutManager.m3318m()) {
                gridLayoutManager.m3326u(3);
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
            e4p0 e4p0Var = new e4p0(bLiveCommonViewConfig);
            e4p0Var.mo113881A(new View.OnClickListener() { // from class: l.z3p0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    c4p0.m107944q(this.f202848a, bLiveCommonViewConfig, i2, view);
                }
            });
            arrayList.add(e4p0Var);
            i2 = i3;
        }
        this.adapter.m68554Z(arrayList);
    }

    /* JADX INFO: renamed from: r */
    public final void m107953r(@Nullable z20<BLiveCommonViewConfig, Integer> z20Var) {
        this.clickAction = z20Var;
    }

    /* JADX INFO: renamed from: s */
    public final void m107954s(@Nullable InterfaceC16183a interfaceC16183a) {
        this.dismissListener = interfaceC16183a;
    }

    /* JADX INFO: renamed from: t */
    public final void m107955t(@NotNull final List<? extends BLiveCommonViewConfig> operateMenus) {
        operateMenus.getClass();
        m107948l().setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.x3p0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                c4p0.m107937b(this.f192288a, operateMenus, dialogInterface);
            }
        });
        m107948l().show();
    }
}
