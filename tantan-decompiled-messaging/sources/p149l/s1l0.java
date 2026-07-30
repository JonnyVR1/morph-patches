package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC0427k;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.common.BaseBuzzSearchFrag;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.media.BuzzMediaCallManager;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.video.call.VideoBuzzCallFrag;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m87231d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001e\u0018\u0000 R2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u0019\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\tJ\u0019\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0019\u0010\tJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001f\u0010 J!\u0010!\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b!\u0010 J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u0019\u0010&\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u0007¢\u0006\u0004\b(\u0010\tJ\u0015\u0010+\u001a\u00020\u00072\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020-2\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0007H\u0016¢\u0006\u0004\b0\u0010\tJ\r\u00101\u001a\u00020\u0007¢\u0006\u0004\b1\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001f\u00102\u001a\u0004\b3\u00104R\"\u0010;\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010>\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0014\u00106\u001a\u0004\b<\u00108\"\u0004\b=\u0010:R\"\u0010A\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u00106\u001a\u0004\b?\u00108\"\u0004\b@\u0010:R\"\u0010G\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bB\u0010D\"\u0004\bE\u0010FR\"\u0010J\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u00106\u001a\u0004\bH\u00108\"\u0004\bI\u0010:R\u0018\u0010M\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010O\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010LR\u0018\u0010Q\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010P¨\u0006S"}, m87232d2 = {"Ll/s1l0;", "Ll/s7m;", "Ll/p1l0;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", "n", "()V", "p", "q", "", "id", BLiveStormDanmakuGiftResourceType.f44444l, "(I)V", "Lcom/p1/mobile/android/app/Frag;", "frag", BLiveStormDanmakuGiftResourceType.f44446s, "(Lcom/p1/mobile/android/app/Frag;I)V", "c", "", "full", "f", "(Z)V", "k", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "a", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "inflateView", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "presenter", "b", "(Ll/p1l0;)V", "r", "", OMSTemplateModeType.page, RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/String;)V", "Landroid/view/SurfaceView;", ResourceDirection.f38808v, "(Z)Landroid/view/SurfaceView;", "destroy", "j", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Landroid/widget/FrameLayout;", "Landroid/widget/FrameLayout;", "get_video_act_root", "()Landroid/widget/FrameLayout;", "set_video_act_root", "(Landroid/widget/FrameLayout;)V", "_video_act_root", "get_video_buzz_root", "set_video_buzz_root", "_video_buzz_root", Constants.INAPP_DATA_TAG, "set_self_surface_root", "_self_surface_root", "e", "Landroid/view/View;", "()Landroid/view/View;", "set_self_surface_root_avatar_mask_bg", "(Landroid/view/View;)V", "_self_surface_root_avatar_mask_bg", "get_video_search_root", "set_video_search_root", "_video_search_root", "g", "Ljava/lang/String;", "pageType", "h", "modeType", "Landroid/view/SurfaceView;", "localSurface", "Companion", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class s1l0 implements s7m<p1l0> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public FrameLayout _video_act_root;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public FrameLayout _video_buzz_root;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public FrameLayout _self_surface_root;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public View _self_surface_root_avatar_mask_bg;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public FrameLayout _video_search_root;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public String pageType;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public String modeType;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public SurfaceView localSurface;

    /* JADX INFO: renamed from: l.s1l0$b */
    @Metadata(m87231d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, m87232d2 = {"l/s1l0$b", "Landroid/view/SurfaceHolder$Callback;", "Landroid/view/SurfaceHolder;", "holder", "", "surfaceCreated", "(Landroid/view/SurfaceHolder;)V", "", "format", "width", "height", "surfaceChanged", "(Landroid/view/SurfaceHolder;III)V", "p0", "surfaceDestroyed", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class SurfaceHolderCallbackC19825b implements SurfaceHolder.Callback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SurfaceView f161915a;

        public SurfaceHolderCallbackC19825b(SurfaceView surfaceView) {
            this.f161915a = surfaceView;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
            holder.getClass();
            qa2.INSTANCE.m173681a("VideoBuzzViewModel", "surfaceChanged, width " + width + " height " + height);
            BuzzMediaCallManager.INSTANCE.m46968g0(width, height);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder holder) {
            holder.getClass();
            BuzzMediaCallManager.INSTANCE.m46974l0(this.f161915a);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder p0) {
            p0.getClass();
        }
    }

    public s1l0(@NotNull Act act) {
        act.getClass();
        this.act = act;
        this.pageType = "";
        this.modeType = "";
    }

    /* JADX INFO: renamed from: c */
    private final void m181968c() {
        String str = this.pageType;
        if (Intrinsics.m87488d(str, "search_video")) {
            m181973n();
        } else if (Intrinsics.m87488d(str, "call_end")) {
            m181983q();
        } else {
            m181982p();
        }
    }

    /* JADX INFO: renamed from: f */
    private final void m181969f(boolean full) {
        qa2.INSTANCE.m173681a("VideoBuzzViewModel", "handlerSmall " + full);
        ViewGroup.LayoutParams layoutParams = m181978d().getLayoutParams();
        layoutParams.getClass();
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.topMargin = full ? 0 : t100.f167259h + xdl0.m208331F0();
        layoutParams2.setMarginEnd(full ? 0 : t100.m186890d(12.0f));
        layoutParams2.width = full ? -1 : t100.m186890d(90.0f);
        layoutParams2.height = full ? -1 : t100.m186890d(140.0f);
        m181978d().setBackgroundResource(full ? x0c0.f188960n : x0c0.f188961o);
        FrameLayout frameLayoutM181978d = m181978d();
        int i = full ? 0 : t100.f167255d;
        frameLayoutM181978d.setPadding(i, i, i, i);
        m181978d().setOutlineProvider(new mkp(full ? 0.0f : t100.f167260i));
        SurfaceView surfaceView = this.localSurface;
        if (surfaceView != null) {
            surfaceView.setOutlineProvider(new mkp(full ? 0.0f : t100.f167259h));
        }
        m181978d().setClipToOutline(true);
        SurfaceView surfaceView2 = this.localSurface;
        if (surfaceView2 != null) {
            surfaceView2.setClipToOutline(true);
        }
        m181978d().setLayoutParams(layoutParams2);
        xdl0.m208344M(m181979e(), full);
    }

    /* JADX INFO: renamed from: k */
    private final void m181970k() {
        m181978d().removeAllViews();
        this.localSurface = null;
    }

    /* JADX INFO: renamed from: l */
    private final void m181971l(int id) {
        FragmentManager supportFragmentManager = this.act.getSupportFragmentManager();
        supportFragmentManager.getClass();
        Fragment fragmentM2554h0 = supportFragmentManager.m2554h0(id);
        AbstractC0427k abstractC0427kM2567m = supportFragmentManager.m2567m();
        abstractC0427kM2567m.getClass();
        qa2.INSTANCE.m173681a("VideoBuzzViewModel", "removeFragment " + fragmentM2554h0);
        if (fragmentM2554h0 != null) {
            abstractC0427kM2567m.mo2715r(fragmentM2554h0);
            abstractC0427kM2567m.mo2708j();
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m181972m(s1l0 s1l0Var, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = v4c0.f179906m;
        }
        s1l0Var.m181971l(i);
    }

    /* JADX INFO: renamed from: n */
    private final void m181973n() {
        m181971l(v4c0.f179905l);
        m181974s(BaseBuzzSearchFrag.INSTANCE.m46921a("videoBuzz", this.modeType), v4c0.f179906m);
    }

    /* JADX INFO: renamed from: s */
    private final void m181974s(Frag frag, int id) {
        FragmentManager supportFragmentManager = this.act.getSupportFragmentManager();
        supportFragmentManager.getClass();
        AbstractC0427k abstractC0427kM2567m = supportFragmentManager.m2567m();
        abstractC0427kM2567m.getClass();
        abstractC0427kM2567m.m2811s(id, frag);
        abstractC0427kM2567m.mo2708j();
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m181975u(s1l0 s1l0Var, Frag frag, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = v4c0.f179905l;
        }
        s1l0Var.m181974s(frag, i);
    }

    @Override // p149l.s7m
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.act;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final View m181976a(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM186914b = t1l0.m186914b(this, inflater, parent);
        viewM186914b.getClass();
        return viewM186914b;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final FrameLayout m181978d() {
        FrameLayout frameLayout = this._self_surface_root;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m87502r("_self_surface_root");
        return null;
    }

    @Override // p149l.s7m
    public void destroy() {
        m181970k();
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final View m181979e() {
        View view = this._self_surface_root_avatar_mask_bg;
        if (view != null) {
            return view;
        }
        Intrinsics.m87502r("_self_surface_root_avatar_mask_bg");
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final void m181980i(@NotNull String page) {
        page.getClass();
        if (Intrinsics.m87488d(page, this.pageType)) {
            return;
        }
        this.pageType = page;
        m181968c();
    }

    @Override // p149l.s7m
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m181976a(inflater, parent);
    }

    /* JADX INFO: renamed from: j */
    public final void m181981j() {
        if (this.localSurface != null) {
            BuzzMediaCallManager.INSTANCE.m46978n0();
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m181982p() {
        qa2.INSTANCE.m173681a("VideoBuzzViewModel", "renderVideoCall");
        m181972m(this, 0, 1, null);
        m181975u(this, new VideoBuzzCallFrag(), 0, 2, null);
    }

    /* JADX INFO: renamed from: q */
    public final void m181983q() {
        m181970k();
        m181978d().setVisibility(4);
        this.act.lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: r */
    public final void m181984r() {
        this.pageType = this.act.getIntent().getStringExtra("page_type");
        this.modeType = this.act.getIntent().getStringExtra("MODE_TYPE");
        m181968c();
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final SurfaceView m181985v(boolean full) {
        qa2.INSTANCE.m173681a("VideoBuzzViewModel", "setLocalPreview " + full);
        xdl0.m208344M(m181978d(), true);
        if (this.localSurface == null) {
            SurfaceView surfaceView = new SurfaceView(m181978d().getContext());
            this.localSurface = surfaceView;
            if (surfaceView.getParent() instanceof ViewGroup) {
                ViewParent parent = surfaceView.getParent();
                parent.getClass();
                ((ViewGroup) parent).removeView(surfaceView);
            }
            surfaceView.setZOrderMediaOverlay(true);
            m181978d().addView(surfaceView, 0, new ViewGroup.LayoutParams(-1, -1));
            SurfaceHolder holder = surfaceView.getHolder();
            if (holder != null) {
                holder.addCallback(new SurfaceHolderCallbackC19825b(surfaceView));
            }
        }
        m181969f(full);
        SurfaceView surfaceView2 = this.localSurface;
        surfaceView2.getClass();
        return surfaceView2;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(@Nullable p1l0 presenter) {
    }
}
