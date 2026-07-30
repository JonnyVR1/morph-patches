package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC0428k;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.common.BaseBuzzSearchFrag;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.media.BuzzMediaCallManager;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.memoji.call.MemojiBuzzCallFrag;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001e\u0018\u0000 R2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u0019\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\tJ\u0019\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0019\u0010\tJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001f\u0010 J!\u0010!\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b!\u0010 J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u0019\u0010&\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u0007¢\u0006\u0004\b(\u0010\tJ\u0015\u0010+\u001a\u00020\u00072\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020-2\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0007H\u0016¢\u0006\u0004\b0\u0010\tJ\r\u00101\u001a\u00020\u0007¢\u0006\u0004\b1\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001f\u00102\u001a\u0004\b3\u00104R\"\u0010;\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010>\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0014\u00106\u001a\u0004\b<\u00108\"\u0004\b=\u0010:R\"\u0010A\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u00106\u001a\u0004\b?\u00108\"\u0004\b@\u0010:R\"\u0010G\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bB\u0010D\"\u0004\bE\u0010FR\"\u0010J\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u00106\u001a\u0004\bH\u00108\"\u0004\bI\u0010:R\u0018\u0010M\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010O\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010LR\u0018\u0010Q\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010P¨\u0006S"}, m88121d2 = {"Ll/cpy;", "Ll/iam;", "Ll/zoy;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", "q", "()V", "n", "p", "", "id", BLiveStormDanmakuGiftResourceType.f45292l, "(I)V", "Lcom/p1/mobile/android/app/Frag;", "frag", BLiveStormDanmakuGiftResourceType.f45294s, "(Lcom/p1/mobile/android/app/Frag;I)V", "c", "", "full", "f", "(Z)V", "k", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "a", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "inflateView", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "presenter", "b", "(Ll/zoy;)V", "r", "", OMSTemplateModeType.page, RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/String;)V", "Landroid/view/SurfaceView;", ResourceDirection.f39656v, "(Z)Landroid/view/SurfaceView;", "destroy", "j", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Landroid/widget/FrameLayout;", "Landroid/widget/FrameLayout;", "get_memoji_act_root", "()Landroid/widget/FrameLayout;", "set_memoji_act_root", "(Landroid/widget/FrameLayout;)V", "_memoji_act_root", "get_memoji_buzz_root", "set_memoji_buzz_root", "_memoji_buzz_root", Constants.INAPP_DATA_TAG, "set_self_surface_root", "_self_surface_root", "e", "Landroid/view/View;", "()Landroid/view/View;", "set_self_surface_root_avatar_mask_bg", "(Landroid/view/View;)V", "_self_surface_root_avatar_mask_bg", "get_memoji_search_root", "set_memoji_search_root", "_memoji_search_root", "g", "Ljava/lang/String;", "pageType", "h", "modeType", "Landroid/view/SurfaceView;", "localSurface", "Companion", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class cpy implements iam<zoy> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public FrameLayout _memoji_act_root;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public FrameLayout _memoji_buzz_root;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public FrameLayout _self_surface_root;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public View _self_surface_root_avatar_mask_bg;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public FrameLayout _memoji_search_root;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public String pageType;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public String modeType;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public SurfaceView localSurface;

    /* JADX INFO: renamed from: l.cpy$b */
    @Metadata(m88120d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, m88121d2 = {"l/cpy$b", "Landroid/view/SurfaceHolder$Callback;", "Landroid/view/SurfaceHolder;", "holder", "", "surfaceCreated", "(Landroid/view/SurfaceHolder;)V", "", "format", "width", "height", "surfaceChanged", "(Landroid/view/SurfaceHolder;III)V", "p0", "surfaceDestroyed", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class SurfaceHolderCallbackC16333b implements SurfaceHolder.Callback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SurfaceView f83048a;

        public SurfaceHolderCallbackC16333b(SurfaceView surfaceView) {
            this.f83048a = surfaceView;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
            holder.getClass();
            xa2.INSTANCE.m209830a("MemojiBuzzViewModel", "surfaceChanged, width " + width + " height " + height);
            BuzzMediaCallManager.INSTANCE.m48151g0(width, height);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder holder) {
            holder.getClass();
            BuzzMediaCallManager.INSTANCE.m48157l0(this.f83048a);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder p0) {
            p0.getClass();
        }
    }

    public cpy(@NotNull Act act) {
        act.getClass();
        this.act = act;
        this.pageType = "";
        this.modeType = "";
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m111836m(cpy cpyVar, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = bdc0.f76247d;
        }
        cpyVar.m111847l(i);
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m111837u(cpy cpyVar, Frag frag, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = bdc0.f76246c;
        }
        cpyVar.m111852s(frag, i);
    }

    @Override // p153l.iam
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.act;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final View m111838a(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM117434b = dpy.m117434b(this, inflater, parent);
        viewM117434b.getClass();
        return viewM117434b;
    }

    /* JADX INFO: renamed from: c */
    public final void m111840c() {
        String str = this.pageType;
        if (Intrinsics.m88377d(str, "search_memoji")) {
            m111850q();
        } else if (Intrinsics.m88377d(str, "call_end")) {
            m111849p();
        } else {
            m111848n();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final FrameLayout m111841d() {
        FrameLayout frameLayout = this._self_surface_root;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m88391r("_self_surface_root");
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
        m111846k();
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final View m111842e() {
        View view = this._self_surface_root_avatar_mask_bg;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_self_surface_root_avatar_mask_bg");
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final void m111843f(boolean full) {
        xa2.INSTANCE.m209830a("MemojiBuzzViewModel", "handlerSmall " + full);
        ViewGroup.LayoutParams layoutParams = m111841d().getLayoutParams();
        layoutParams.getClass();
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.topMargin = full ? 0 : qa00.f156321h + bnl0.m105511F0();
        layoutParams2.setMarginEnd(full ? 0 : qa00.m175859d(12.0f));
        layoutParams2.width = full ? -1 : qa00.m175859d(90.0f);
        layoutParams2.height = full ? -1 : qa00.m175859d(140.0f);
        m111841d().setBackgroundResource(full ? d9c0.f85757n : d9c0.f85758o);
        FrameLayout frameLayoutM111841d = m111841d();
        int i = full ? 0 : qa00.f156317d;
        frameLayoutM111841d.setPadding(i, i, i, i);
        m111841d().setOutlineProvider(new mmp(full ? 0.0f : qa00.f156322i));
        SurfaceView surfaceView = this.localSurface;
        if (surfaceView != null) {
            surfaceView.setOutlineProvider(new mmp(full ? 0.0f : qa00.f156321h));
        }
        m111841d().setClipToOutline(true);
        SurfaceView surfaceView2 = this.localSurface;
        if (surfaceView2 != null) {
            surfaceView2.setClipToOutline(true);
        }
        m111841d().setLayoutParams(layoutParams2);
        bnl0.m105524M(m111842e(), full);
    }

    /* JADX INFO: renamed from: i */
    public final void m111844i(@NotNull String page) {
        page.getClass();
        if (Intrinsics.m88377d(page, this.pageType)) {
            return;
        }
        this.pageType = page;
        m111840c();
    }

    @Override // p153l.iam
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m111838a(inflater, parent);
    }

    /* JADX INFO: renamed from: j */
    public final void m111845j() {
        if (this.localSurface != null) {
            BuzzMediaCallManager.INSTANCE.m48161n0();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m111846k() {
        m111841d().removeAllViews();
        this.localSurface = null;
    }

    /* JADX INFO: renamed from: l */
    public final void m111847l(int id) {
        FragmentManager supportFragmentManager = this.act.getSupportFragmentManager();
        supportFragmentManager.getClass();
        Fragment fragmentM2555h0 = supportFragmentManager.m2555h0(id);
        AbstractC0428k abstractC0428kM2568m = supportFragmentManager.m2568m();
        abstractC0428kM2568m.getClass();
        xa2.INSTANCE.m209830a("MemojiBuzzViewModel", "removeFragment " + fragmentM2555h0);
        if (fragmentM2555h0 != null) {
            abstractC0428kM2568m.mo2716r(fragmentM2555h0);
            abstractC0428kM2568m.mo2709j();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m111848n() {
        xa2.INSTANCE.m209830a("MemojiBuzzViewModel", "renderVideoCall");
        m111836m(this, 0, 1, null);
        m111837u(this, new MemojiBuzzCallFrag(), 0, 2, null);
    }

    /* JADX INFO: renamed from: p */
    public final void m111849p() {
        m111846k();
        m111841d().setVisibility(4);
        this.act.lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: q */
    public final void m111850q() {
        m111847l(bdc0.f76246c);
        m111852s(BaseBuzzSearchFrag.INSTANCE.m48104a("memojiBuzz", this.modeType), bdc0.f76247d);
    }

    /* JADX INFO: renamed from: r */
    public final void m111851r() {
        this.pageType = this.act.getIntent().getStringExtra("page_type");
        this.modeType = this.act.getIntent().getStringExtra("MODE_TYPE");
        m111840c();
    }

    /* JADX INFO: renamed from: s */
    public final void m111852s(Frag frag, int id) {
        FragmentManager supportFragmentManager = this.act.getSupportFragmentManager();
        supportFragmentManager.getClass();
        AbstractC0428k abstractC0428kM2568m = supportFragmentManager.m2568m();
        abstractC0428kM2568m.getClass();
        abstractC0428kM2568m.m2812s(id, frag);
        abstractC0428kM2568m.mo2709j();
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final SurfaceView m111853v(boolean full) {
        xa2.INSTANCE.m209830a("MemojiBuzzViewModel", "setLocalPreview " + full);
        bnl0.m105524M(m111841d(), true);
        if (this.localSurface == null) {
            SurfaceView surfaceView = new SurfaceView(m111841d().getContext());
            this.localSurface = surfaceView;
            if (surfaceView.getParent() instanceof ViewGroup) {
                ViewParent parent = surfaceView.getParent();
                parent.getClass();
                ((ViewGroup) parent).removeView(surfaceView);
            }
            surfaceView.setZOrderMediaOverlay(true);
            m111841d().addView(surfaceView, 0, new ViewGroup.LayoutParams(-1, -1));
            SurfaceHolder holder = surfaceView.getHolder();
            if (holder != null) {
                holder.addCallback(new SurfaceHolderCallbackC16333b(surfaceView));
            }
        }
        m111843f(full);
        SurfaceView surfaceView2 = this.localSurface;
        surfaceView2.getClass();
        return surfaceView2;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@Nullable zoy presenter) {
    }
}
