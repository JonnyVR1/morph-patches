package p006l;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeEntranceView;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeViewType;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import java.util.Map;
import kotlin.Metadata;
import l.e51;
import l.qq3;
import l.t0m;
import l.t590;
import l.xdl0;
import l.zb90;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: l.a5 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010$\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000e\u001a\u00028\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H&¢\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ;\u0010$\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00132\b\b\u0002\u0010!\u001a\u00020 2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0013¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u0013¢\u0006\u0004\b(\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0016\u0010/\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R0\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u00068"}, d2 = {"Ll/a5;", "Ll/s0m;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "Ll/t0m;", "T", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "_root", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeViewType;", "type", "i", "(Landroid/content/Context;Landroid/view/ViewGroup;Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeViewType;)Ll/t0m;", "", "m", "()V", "", "f", "()Ljava/lang/String;", "h", "", "hidden", "d", "(Z)V", "j", "Landroid/view/View;", "Lcom/tantan/library/svga/SVGAnimationView;", "view", "url", "", "repeatCount", "Lcom/tantan/library/svga/AnimListener;", "animListener", "k", "(Landroid/view/View;Lcom/tantan/library/svga/SVGAnimationView;Ljava/lang/String;ILcom/tantan/library/svga/AnimListener;)V", "o", "(Ljava/lang/String;)V", "e", "a", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "g", "()Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "b", "Z", "isRendered", "", "c", "Ljava/util/Map;", "getParamsMap", "()Ljava/util/Map;", "n", "(Ljava/util/Map;)V", "paramsMap", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AbstractC0495a5 implements s0m {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final PrivilegeEntranceView.a privilegeEntranceInfo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean isRendered;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public Map<String, String> paramsMap;

    public AbstractC0495a5(@NotNull PrivilegeEntranceView.a aVar) {
        aVar.getClass();
        this.privilegeEntranceInfo = aVar;
    }

    /* JADX INFO: renamed from: c */
    public static void m11747c(SVGAnimationView sVGAnimationView, View view, int i, AnimListener animListener, String str) {
        xdl0.C0(sVGAnimationView, view.getHeight());
        xdl0.M(sVGAnimationView, true);
        Context context = view.getContext();
        context.getClass();
        SVGALoader.with(context).repeatCount(i).autoPlay(true).animListener(animListener).from(str).into(sVGAnimationView);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m11748l(AbstractC0495a5 abstractC0495a5, View view, SVGAnimationView sVGAnimationView, String str, int i, AnimListener animListener, int i2, Object obj) {
        if (obj != null) {
            qq3.a("Super calls with default arguments not supported in this target, function: playRootSVGA");
            return;
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            animListener = null;
        }
        abstractC0495a5.m11754k(view, sVGAnimationView, str, i3, animListener);
    }

    /* JADX INFO: renamed from: d */
    public final void m11749d(boolean hidden) {
        if (this.isRendered) {
            mo11696j(hidden);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final String m11750e() {
        if (!xma.m27367X3()) {
            return "diamond_valid";
        }
        if (!xma.m27379e4()) {
            return "svip_valid";
        }
        if (zb90.i()) {
            return "vip_valid";
        }
        if (xma.m27368Y3()) {
            return "diamond_invalid";
        }
        if (xma.m27381f4()) {
            return "svip_invalid";
        }
        return (zb90.i() || !CoreModule.f1534c.f3628e0.m21490p9().isVIPUsed()) ? "no_membership" : "vip_invalid";
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final String m11751f() {
        return "p_navigation_view";
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final PrivilegeEntranceView.a getPrivilegeEntranceInfo() {
        return this.privilegeEntranceInfo;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public abstract String mo11695h();

    @NotNull
    /* JADX INFO: renamed from: i */
    public final <T extends t0m> T m11753i(@NotNull Context context, @NotNull ViewGroup _root, @NotNull PrivilegeViewType type) {
        context.getClass();
        _root.getClass();
        type.getClass();
        return (T) t590.Companion.a(context, _root, type);
    }

    /* JADX INFO: renamed from: k */
    public final void m11754k(@NotNull final View _root, @NotNull final SVGAnimationView view, @NotNull final String url, final int repeatCount, @Nullable final AnimListener animListener) {
        _root.getClass();
        view.getClass();
        url.getClass();
        e51.G(new Runnable() { // from class: l.z4
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC0495a5.m11747c(view, _root, repeatCount, animListener, url);
            }
        });
    }

    @CallSuper
    /* JADX INFO: renamed from: m */
    public void mo11697m() {
        this.isRendered = true;
        if (TextUtils.isEmpty(mo11695h())) {
            return;
        }
        zvf0.y(mo11695h(), m11751f(), this.paramsMap);
    }

    /* JADX INFO: renamed from: n */
    public final void m11755n(@Nullable Map<String, String> map) {
        this.paramsMap = map;
    }

    /* JADX INFO: renamed from: o */
    public final void m11756o(@NotNull String type) {
        type.getClass();
        CoreModule.m1854P().m11706a().m5506qd(this.privilegeEntranceInfo.a(), "p_privilege,navigation_banner", type);
    }

    @Override // p006l.s0m
    public /* bridge */ void release() {
        super.release();
    }

    /* JADX INFO: renamed from: j */
    public void mo11696j(boolean hidden) {
    }
}
