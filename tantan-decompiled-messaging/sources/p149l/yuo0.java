package p149l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.OMSTemplateType;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0018B'\u0012\u000e\u0010\u0003\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u0016\u0010\u000fJ\u000f\u0010\u0017\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0011R\u001f\u0010\u0003\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010;\u001a\u0002048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0014\u0010>\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010=R0\u0010E\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0004\u0018\u00010?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR$\u0010M\u001a\u0004\u0018\u00010F8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001b\u0010S\u001a\u00020N8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R¨\u0006T"}, m87232d2 = {"Ll/yuo0;", "", "Ll/wxs;", "presenter", "", ShareConstants.RES_PATH, "Ll/aq2;", "style", "<init>", "(Ll/wxs;ILl/aq2;)V", "", "Lcom/p1/mobile/putong/live/base/data/BLiveCommonViewConfig;", "operateMenus", "", Constants.KEY_T, "(Ljava/util/List;)V", "k", "()V", "Landroid/view/View;", OMSTemplateModeType.view, "g", "(Landroid/view/View;)V", "p", "h", "a", "Ll/wxs;", "getPresenter", "()Ll/wxs;", "b", "I", "getRes", "()I", "c", "Ll/aq2;", "getStyle", "()Ll/aq2;", "Landroid/widget/LinearLayout;", Constants.INAPP_DATA_TAG, "Landroid/widget/LinearLayout;", "o", "()Landroid/widget/LinearLayout;", "set_root", "(Landroid/widget/LinearLayout;)V", "_root", "Landroidx/recyclerview/widget/RecyclerView;", "e", "Landroidx/recyclerview/widget/RecyclerView;", "n", "()Landroidx/recyclerview/widget/RecyclerView;", "set_menu_list", "(Landroidx/recyclerview/widget/RecyclerView;)V", "_menu_list", "Landroid/widget/ImageView;", "f", "Landroid/widget/ImageView;", "m", "()Landroid/widget/ImageView;", "set_menu_close", "(Landroid/widget/ImageView;)V", "_menu_close", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "adapter", "Ll/f30;", "Ll/f30;", "getClickAction", "()Ll/f30;", "r", "(Ll/f30;)V", "clickAction", "Ll/yuo0$a;", RXScreenCaptureService.KEY_INDEX, "Ll/yuo0$a;", "getDismissListener", "()Ll/yuo0$a;", BLiveStormDanmakuGiftResourceType.f44446s, "(Ll/yuo0$a;)V", "dismissListener", "Lcom/p1/mobile/putong/live/livingroom/archi/dialogcenter/a;", "j", "Lkotlin/Lazy;", BLiveStormDanmakuGiftResourceType.f44444l, "()Lcom/p1/mobile/putong/live/livingroom/archi/dialogcenter/a;", OMSTemplateType.dialog, "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
    public InterfaceC21517a dismissListener;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final Lazy dialog;

    /* JADX INFO: renamed from: l.yuo0$a */
    @Metadata(m87231d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005À\u0006\u0003"}, m87232d2 = {"Ll/yuo0$a;", "", "", "onDismiss", "()V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public interface InterfaceC21517a {
        void onDismiss();
    }

    public yuo0(@NotNull wxs<?, ?> wxsVar, int i, @NotNull aq2 aq2Var) {
        wxsVar.getClass();
        aq2Var.getClass();
        this.presenter = wxsVar;
        this.res = i;
        this.style = aq2Var;
        this.adapter = new LiveBaseAdapter();
        this.dialog = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.suo0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return yuo0.m216133a(this.f166490a);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static DialogC12611a m216133a(final yuo0 yuo0Var) {
        DialogC12611a dialogC12611a = new DialogC12611a(yuo0Var.presenter, yuo0Var.res, yuo0Var.style);
        dialogC12611a.m71776h0(new e30() { // from class: l.uuo0
            @Override // p149l.e30
            public final void call(Object obj) {
                yuo0.m216139i(this.f178410a, (View) obj);
            }
        });
        return dialogC12611a;
    }

    /* JADX INFO: renamed from: b */
    public static void m216134b(yuo0 yuo0Var, List list, DialogInterface dialogInterface) {
        yuo0Var.m216149p(list);
    }

    /* JADX INFO: renamed from: f */
    public static void m216138f(yuo0 yuo0Var) {
        InterfaceC21517a interfaceC21517a = yuo0Var.dismissListener;
        if (interfaceC21517a != null) {
            interfaceC21517a.onDismiss();
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m216139i(final yuo0 yuo0Var, View view) {
        view.getClass();
        yuo0Var.m216142g(view);
        yuo0Var.m216147n().setLayoutManager(new GridLayoutManager(yuo0Var.presenter.act(), 3));
        yuo0Var.m216147n().setAdapter(yuo0Var.adapter);
        yuo0Var.m216146m().setOnClickListener(new View.OnClickListener() { // from class: l.xuo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                yuo0.m216140j(this.f194535a, view2);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public static final void m216140j(yuo0 yuo0Var, View view) {
        yuo0Var.m216145l().m71757O();
    }

    /* JADX INFO: renamed from: q */
    public static final void m216141q(yuo0 yuo0Var, BLiveCommonViewConfig bLiveCommonViewConfig, int i, View view) {
        f30<BLiveCommonViewConfig, Integer> f30Var = yuo0Var.clickAction;
        if (f30Var != null) {
            f30Var.call(bLiveCommonViewConfig, Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m216142g(View view) {
        zuo0.m220238a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public final void m216143h() {
        xdl0.m208360X(m216147n(), t100.m186890d(10.0f) + xdl0.m208331F0());
        m216148o().setBackground(kvc0.m147353b(i3c0.f110781M));
    }

    /* JADX INFO: renamed from: k */
    public final void m216144k() {
        if (m216145l().isShowing()) {
            m216145l().m71758P(new d30() { // from class: l.wuo0
                @Override // p149l.d30
                public final void call() {
                    yuo0.m216138f(this.f188147a);
                }
            });
        }
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final DialogC12611a m216145l() {
        return (DialogC12611a) this.dialog.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final ImageView m216146m() {
        ImageView imageView = this._menu_close;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m87502r("_menu_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final RecyclerView m216147n() {
        RecyclerView recyclerView = this._menu_list;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.m87502r("_menu_list");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final LinearLayout m216148o() {
        LinearLayout linearLayout = this._root;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m87502r("_root");
        return null;
    }

    /* JADX INFO: renamed from: p */
    public final void m216149p(List<? extends BLiveCommonViewConfig> operateMenus) {
        m216143h();
        if (!vdt.m198092b(3)) {
            RecyclerView recyclerViewM216147n = m216147n();
            int i = t100.f167260i;
            xdl0.m208358V(recyclerViewM216147n, i);
            xdl0.m208359W(m216147n(), i);
        }
        RecyclerView.AbstractC0577o layoutManager = m216147n().getLayoutManager();
        if (layoutManager != null && (layoutManager instanceof GridLayoutManager)) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            if (3 != gridLayoutManager.m3317m()) {
                gridLayoutManager.m3325u(3);
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
            avo0Var.mo109662A(new View.OnClickListener() { // from class: l.vuo0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    yuo0.m216141q(this.f183094a, bLiveCommonViewConfig, i2, view);
                }
            });
            arrayList.add(avo0Var);
            i2 = i3;
        }
        this.adapter.m67371Z(arrayList);
    }

    /* JADX INFO: renamed from: r */
    public final void m216150r(@Nullable f30<BLiveCommonViewConfig, Integer> f30Var) {
        this.clickAction = f30Var;
    }

    /* JADX INFO: renamed from: s */
    public final void m216151s(@Nullable InterfaceC21517a interfaceC21517a) {
        this.dismissListener = interfaceC21517a;
    }

    /* JADX INFO: renamed from: t */
    public final void m216152t(@NotNull final List<? extends BLiveCommonViewConfig> operateMenus) {
        operateMenus.getClass();
        m216145l().setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.tuo0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                yuo0.m216134b(this.f172207a, operateMenus, dialogInterface);
            }
        });
        m216145l().show();
    }
}
