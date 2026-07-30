package com.p051p1.mobile.putong.core.p058ui.vip.privilege;

import android.content.Context;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.data.UserPrivilege;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.PrivilegeODiamondCard;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.je90;
import p153l.ke90;
import p153l.l51;
import p153l.lb2;
import p153l.psd0;
import p153l.qa00;
import p153l.qnp0;
import p153l.upl0;
import p153l.y20;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\nJ-\u0010\u0012\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\nJ\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\nJ\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001a\u0010\nJ\u000f\u0010\u001b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001b\u0010\nJ\u000f\u0010\u001c\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001c\u0010\nR\"\u0010\"\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\u0019R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010.\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010%\u001a\u0004\b,\u0010'\"\u0004\b-\u0010)R\"\u00106\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010:\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u00101\u001a\u0004\b8\u00103\"\u0004\b9\u00105R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010D\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006E"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/vip/privilege/PrivilegeODiamondCard;", "Lcom/p1/mobile/putong/core/ui/vip/privilege/PrivilegeBaseCard;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "q0", "()V", "onFinishInflate", "Ll/lb2;", "adapter", "Lcom/p1/mobile/putong/app/PutongFrag;", "frag", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "h0", "(Ll/lb2;Lcom/p1/mobile/putong/app/PutongFrag;Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "j0", "i0", "Landroid/view/View;", OMSTemplateModeType.view, "l0", "(Landroid/view/View;)V", "p0", "s0", "t0", Constants.INAPP_DATA_TAG, "Landroid/view/View;", "get_background", "()Landroid/view/View;", "set_background", "_background", "Lcom/tantan/library/svga/SVGAnimationView;", "e", "Lcom/tantan/library/svga/SVGAnimationView;", "get_background_svga", "()Lcom/tantan/library/svga/SVGAnimationView;", "set_background_svga", "(Lcom/tantan/library/svga/SVGAnimationView;)V", "_background_svga", "f", "get_icon", "set_icon", "_icon", "Landroid/widget/TextView;", "g", "Landroid/widget/TextView;", "get_title", "()Landroid/widget/TextView;", "set_title", "(Landroid/widget/TextView;)V", "_title", "h", "get_subtitle", "set_subtitle", "_subtitle", RXScreenCaptureService.KEY_INDEX, "Ll/lb2;", "j", "Lcom/p1/mobile/putong/app/PutongFrag;", "k", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "Ljava/lang/Runnable;", BLiveStormDanmakuGiftResourceType.f45292l, "Ljava/lang/Runnable;", "backgroundShimmerRunnable", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class PrivilegeODiamondCard extends PrivilegeBaseCard {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public View _background;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public SVGAnimationView _background_svga;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public SVGAnimationView _icon;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public TextView _title;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public TextView _subtitle;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public lb2 adapter;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public PutongFrag frag;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public PurchaseType purchaseType;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public Runnable backgroundShimmerRunnable;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.PrivilegeODiamondCard$a */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m88121d2 = {"com/p1/mobile/putong/core/ui/vip/privilege/PrivilegeODiamondCard$a", "Lcom/tantan/library/svga/AnimListener;", "", "onFinished", "()V", "onStart", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C9146a extends AnimListener {
        public C9146a() {
        }

        /* JADX INFO: renamed from: a */
        public static void m58071a(PrivilegeODiamondCard privilegeODiamondCard) {
            privilegeODiamondCard.m58070t0();
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            if (PrivilegeODiamondCard.this.backgroundShimmerRunnable == null) {
                final PrivilegeODiamondCard privilegeODiamondCard = PrivilegeODiamondCard.this;
                privilegeODiamondCard.backgroundShimmerRunnable = new Runnable() { // from class: l.ie90
                    @Override // java.lang.Runnable
                    public final void run() {
                        PrivilegeODiamondCard.C9146a.m58071a(privilegeODiamondCard);
                    }
                };
            }
            l51.m152890J(PrivilegeODiamondCard.this.backgroundShimmerRunnable);
            l51.m152888H(PrivilegeODiamondCard.this.getContext(), PrivilegeODiamondCard.this.backgroundShimmerRunnable, 6000L);
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.PrivilegeODiamondCard$b */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m88121d2 = {"com/p1/mobile/putong/core/ui/vip/privilege/PrivilegeODiamondCard$b", "Lcom/tantan/library/svga/AnimListener;", "", "onFinished", "()V", "onStart", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C9147b extends AnimListener {
        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public PrivilegeODiamondCard(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    /* JADX INFO: renamed from: q0 */
    private final void m58065q0() {
        lb2 lb2Var = this.adapter;
        if (lb2Var != null) {
            lb2Var.m153557n(this.frag, CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("oDiamond"))).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.he90
                @Override // p153l.y20
                public final void call(Object obj) {
                    PrivilegeODiamondCard.m58066r0(this.f109068a, (UserPrivilege) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: r0 */
    public static final void m58066r0(PrivilegeODiamondCard privilegeODiamondCard, UserPrivilege userPrivilege) {
        privilegeODiamondCard.get_subtitle().setText(upl0.m197103d(userPrivilege));
    }

    @NotNull
    public final View get_background() {
        View view = this._background;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_background");
        return null;
    }

    @NotNull
    public final SVGAnimationView get_background_svga() {
        SVGAnimationView sVGAnimationView = this._background_svga;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.m88391r("_background_svga");
        return null;
    }

    @NotNull
    public final SVGAnimationView get_icon() {
        SVGAnimationView sVGAnimationView = this._icon;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.m88391r("_icon");
        return null;
    }

    @NotNull
    public final TextView get_subtitle() {
        TextView textView = this._subtitle;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_subtitle");
        return null;
    }

    @NotNull
    public final TextView get_title() {
        TextView textView = this._title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_title");
        return null;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.vip.privilege.PrivilegeBaseCard
    /* JADX INFO: renamed from: h0 */
    public void mo58019h0(@Nullable lb2 adapter, @Nullable PutongFrag frag, @Nullable PurchaseType purchaseType) {
        this.adapter = adapter;
        this.frag = frag;
        this.purchaseType = purchaseType;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.vip.privilege.PrivilegeBaseCard
    /* JADX INFO: renamed from: i0 */
    public void mo58020i0() {
        m58070t0();
        if (get_icon().isAnimating()) {
            return;
        }
        get_icon().startAnimation();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.vip.privilege.PrivilegeBaseCard
    /* JADX INFO: renamed from: j0 */
    public void mo58021j0() {
        m58069s0();
        m58065q0();
    }

    /* JADX INFO: renamed from: l0 */
    public final void m58067l0(View view) {
        ke90.m149318a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m58067l0(this);
        get_title().getPaint().setFakeBoldText(true);
        get_background().setBackground(new je90());
        m58068p0();
    }

    /* JADX INFO: renamed from: p0 */
    public final void m58068p0() {
        Context context = getContext();
        context.getClass();
        SVGALoader.with(context).autoPlay(false).repeatCount(1).from("https://auto.tancdn.com/v1/raw/e67bb529-dc9f-4c96-b818-6b61c83d7b3714.pdf").animListener(new C9146a()).into(get_background_svga());
        qnp0.m177261d1(get_background_svga(), qa00.f156322i);
        Context context2 = getContext();
        context2.getClass();
        SVGALoader.with(context2).autoPlay(false).repeatCount(1).from("https://auto.tancdn.com/v1/raw/a56911cc-64a7-47b5-8de8-6f47d921a9c014.pdf").animListener(new C9147b()).into(get_icon());
    }

    /* JADX INFO: renamed from: s0 */
    public final void m58069s0() {
        get_title().getPaint().setShader(new LinearGradient(0.0f, 0.0f, get_title().getPaint().measureText("黑金会员"), 0.0f, new int[]{Color.parseColor("#98551F"), Color.parseColor("#FFDA98"), Color.parseColor("#FFE5B6"), Color.parseColor("#F8B467")}, (float[]) null, Shader.TileMode.CLAMP));
        get_title().setText("黑金会员");
        get_subtitle().setText(upl0.m197103d(CoreModule.f18264c.f20297C0.m146426x4(SummarizedPrivilegesId.get("oDiamond"))));
    }

    public final void set_background(@NotNull View view) {
        view.getClass();
        this._background = view;
    }

    public final void set_background_svga(@NotNull SVGAnimationView sVGAnimationView) {
        sVGAnimationView.getClass();
        this._background_svga = sVGAnimationView;
    }

    public final void set_icon(@NotNull SVGAnimationView sVGAnimationView) {
        sVGAnimationView.getClass();
        this._icon = sVGAnimationView;
    }

    public final void set_subtitle(@NotNull TextView textView) {
        textView.getClass();
        this._subtitle = textView;
    }

    public final void set_title(@NotNull TextView textView) {
        textView.getClass();
        this._title = textView;
    }

    /* JADX INFO: renamed from: t0 */
    public final void m58070t0() {
        if (get_background_svga().isAnimating()) {
            return;
        }
        l51.m152890J(this.backgroundShimmerRunnable);
        get_background_svga().startAnimation();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PrivilegeODiamondCard(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public /* synthetic */ PrivilegeODiamondCard(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
