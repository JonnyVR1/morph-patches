package com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget;

import android.app.Application;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.StringRes;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.immomo.momomediaext.utils.MMLiveUserConfig;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.buzz.R$string;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.media.BuzzCallState;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.media.BuzzMediaCallManager;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget.MemojiBuzzComboEntranceView;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import com.tencent.open.SocialConstants;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p151v.VFrame;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.fo0;
import p153l.gcg0;
import p153l.k3d0;
import p153l.k8w;
import p153l.kcg0;
import p153l.l51;
import p153l.mmp;
import p153l.p9r;
import p153l.psd0;
import p153l.qa00;
import p153l.qcj;
import p153l.qn3;
import p153l.voy;
import p153l.wzx;
import p153l.xa2;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\b\b\u0003\u0010\u001d\u001a\u00020\t¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00020\f2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\fH\u0014¢\u0006\u0004\b$\u0010\u000eJ\r\u0010%\u001a\u00020\f¢\u0006\u0004\b%\u0010\u000eJ\u0015\u0010'\u001a\u00020\f2\u0006\u0010&\u001a\u00020 ¢\u0006\u0004\b'\u0010#R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00103\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u0010*\u001a\u0004\b1\u0010,\"\u0004\b2\u0010.R\"\u0010:\u001a\u00020\u00148\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010J\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010N\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bK\u0010E\u001a\u0004\bL\u0010G\"\u0004\bM\u0010IR\"\u0010R\u001a\u00020\u00148\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bO\u00105\u001a\u0004\bP\u00107\"\u0004\bQ\u00109R\u0014\u0010V\u001a\u00020S8\u0002X\u0082D¢\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010Y\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010XR\u0014\u0010]\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010_\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010\\R\u0014\u0010a\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010\\R\u0018\u0010e\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0018\u0010f\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010dR\u0018\u0010g\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010dR\u0016\u0010i\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010hR\u0016\u0010j\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010hR\u0016\u0010l\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010kR\u0016\u0010n\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010k¨\u0006o"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/MemojiBuzzComboEntranceView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "u", "()V", "p", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", RXScreenCaptureService.KEY_INDEX, "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "n", "(Lcom/p1/mobile/android/app/Act;)V", "count", "bonus", ShareConstants.RES_PATH, "r", "(III)V", "", "release", Constants.KEY_T, "(Z)V", "onDetachedFromWindow", "q", "hidden", "o", "Lv/VFrame;", "a", "Lv/VFrame;", "get_content_root", "()Lv/VFrame;", "set_content_root", "(Lv/VFrame;)V", "_content_root", "b", "get_content_root_preview_root", "set_content_root_preview_root", "_content_root_preview_root", "c", "Landroid/view/View;", "get_content_root_content_bg", "()Landroid/view/View;", "set_content_root_content_bg", "(Landroid/view/View;)V", "_content_root_content_bg", "Lv/VImage;", Constants.INAPP_DATA_TAG, "Lv/VImage;", "get_content_root_icon", "()Lv/VImage;", "set_content_root_icon", "(Lv/VImage;)V", "_content_root_icon", "Lv/VText;", "e", "Lv/VText;", "get_content_root_title", "()Lv/VText;", "set_content_root_title", "(Lv/VText;)V", "_content_root_title", "f", "get_content_root_desc", "set_content_root_desc", "_content_root_desc", "g", "get_red_dot", "set_red_dot", "_red_dot", "", "h", "Ljava/lang/String;", "TAG", "Landroid/view/SurfaceView;", "Landroid/view/SurfaceView;", "localSurface", "Ljava/util/concurrent/atomic/AtomicBoolean;", "j", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isPreview", "k", "sdkInit", BLiveStormDanmakuGiftResourceType.f45292l, "initMemojiRes", "Ll/kcg0;", "m", "Ll/kcg0;", "subscribe", "lifeSubscribe", "mediaBuzzSubscribe", "I", "surfaceWidth", "surfaceHeight", "Z", "isHidden", BLiveStormDanmakuGiftResourceType.f45294s, "isActive", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class MemojiBuzzComboEntranceView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VFrame _content_root;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VFrame _content_root_preview_root;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public View _content_root_content_bg;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VImage _content_root_icon;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VText _content_root_title;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VText _content_root_desc;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public View _red_dot;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final String TAG;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public SurfaceView localSurface;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final AtomicBoolean isPreview;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final AtomicBoolean sdkInit;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final AtomicBoolean initMemojiRes;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public kcg0 subscribe;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public kcg0 lifeSubscribe;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public kcg0 mediaBuzzSubscribe;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public int surfaceWidth;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public int surfaceHeight;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public boolean isHidden;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public boolean isActive;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.lovebuzz.widget.MemojiBuzzComboEntranceView$a */
    @Metadata(m88120d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, m88121d2 = {"com/p1/mobile/putong/core/ui/lovebuzz/widget/MemojiBuzzComboEntranceView$a", "Landroid/view/SurfaceHolder$Callback;", "Landroid/view/SurfaceHolder;", "holder", "", "surfaceCreated", "(Landroid/view/SurfaceHolder;)V", "", "format", "width", "height", "surfaceChanged", "(Landroid/view/SurfaceHolder;III)V", "p0", "surfaceDestroyed", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class SurfaceHolderCallbackC8599a implements SurfaceHolder.Callback {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ SurfaceView f31113b;

        public SurfaceHolderCallbackC8599a(SurfaceView surfaceView) {
            this.f31113b = surfaceView;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
            holder.getClass();
            xa2.INSTANCE.m209830a(MemojiBuzzComboEntranceView.this.TAG, "surfaceChanged, width " + width + " height " + height);
            MemojiBuzzComboEntranceView.this.surfaceWidth = width;
            MemojiBuzzComboEntranceView.this.surfaceHeight = height;
            BuzzMediaCallManager.INSTANCE.m48151g0(width, height);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder holder) {
            holder.getClass();
            xa2 xa2Var = xa2.INSTANCE;
            xa2Var.m209830a(MemojiBuzzComboEntranceView.this.TAG, "surfaceCreated");
            BuzzMediaCallManager buzzMediaCallManager = BuzzMediaCallManager.INSTANCE;
            if (Intrinsics.m88377d(buzzMediaCallManager.m48122C().m222761e(), Boolean.TRUE)) {
                xa2Var.m209830a(MemojiBuzzComboEntranceView.this.TAG, "surfaceCreated, want startPreview but inMediaBuzzCallState true");
                return;
            }
            boolean zM48160n = buzzMediaCallManager.m48160n(false);
            MemojiBuzzComboEntranceView memojiBuzzComboEntranceView = MemojiBuzzComboEntranceView.this;
            if (!zM48160n) {
                xa2Var.m209830a(memojiBuzzComboEntranceView.TAG, "surfaceCreated, checkMediaCanStart false");
            } else if (!memojiBuzzComboEntranceView.sdkInit.get()) {
                xa2Var.m209830a(MemojiBuzzComboEntranceView.this.TAG, "surfaceCreated, want startPreview but sdkInit not init");
            } else {
                k8w.INSTANCE.m148761j(MemojiBuzzComboEntranceView.this.get_content_root_content_bg(), MemojiBuzzComboEntranceView.this.get_content_root_icon());
                buzzMediaCallManager.m48157l0(this.f31113b);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder p0) {
            p0.getClass();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemojiBuzzComboEntranceView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.TAG = "MemojiBuzzComboEntranceView";
        LayoutInflater layoutInflaterM171370a = p9r.m171370a(getContext());
        layoutInflaterM171370a.getClass();
        m48435i(layoutInflaterM171370a, this);
        this.isPreview = new AtomicBoolean(false);
        this.sdkInit = new AtomicBoolean(false);
        this.initMemojiRes = new AtomicBoolean(false);
        this.isHidden = true;
        View view = get_content_root_content_bg();
        int i2 = qa00.f156323j;
        view.setOutlineProvider(new mmp(i2));
        get_content_root_content_bg().setClipToOutline(true);
        get_content_root().setOutlineProvider(new mmp(qa00.f156324k));
        get_content_root().setClipToOutline(true);
        get_content_root_preview_root().setOutlineProvider(new mmp(i2));
        get_content_root_preview_root().setClipToOutline(true);
    }

    /* JADX INFO: renamed from: a */
    public static Boolean m48422a(Boolean bool) {
        return Boolean.valueOf(!bool.booleanValue());
    }

    /* JADX INFO: renamed from: b */
    public static Boolean m48423b(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: c */
    public static void m48424c(String str, gcg0 gcg0Var) {
        BuzzMediaCallManager buzzMediaCallManager = BuzzMediaCallManager.INSTANCE;
        MMLiveUserConfig mMLiveUserConfigM48124E = buzzMediaCallManager.m48124E(str, "");
        Application application = CoreModule.f18263b;
        application.getClass();
        buzzMediaCallManager.m48131L(mMLiveUserConfigM48124E, application, "memojiBuzz", "1");
        gcg0Var.onNext(Unit.INSTANCE);
        gcg0Var.onCompleted();
    }

    /* JADX INFO: renamed from: d */
    public static void m48425d(MemojiBuzzComboEntranceView memojiBuzzComboEntranceView, Boolean bool) {
        memojiBuzzComboEntranceView.m48442u();
    }

    /* JADX INFO: renamed from: e */
    public static void m48426e(MemojiBuzzComboEntranceView memojiBuzzComboEntranceView, Unit unit) {
        memojiBuzzComboEntranceView.sdkInit.set(true);
        memojiBuzzComboEntranceView.m48438p();
    }

    /* JADX INFO: renamed from: f */
    public static void m48427f(Throwable th) {
    }

    /* JADX INFO: renamed from: g */
    public static void m48428g(boolean z, MemojiBuzzComboEntranceView memojiBuzzComboEntranceView) {
        BuzzMediaCallManager buzzMediaCallManager = BuzzMediaCallManager.INSTANCE;
        buzzMediaCallManager.m48161n0();
        if (z) {
            memojiBuzzComboEntranceView.sdkInit.set(false);
            buzzMediaCallManager.m48144Z();
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m48429h(MemojiBuzzComboEntranceView memojiBuzzComboEntranceView, C4470c c4470c) {
        if (Intrinsics.m88377d(c4470c, C4470c.f16269k)) {
            memojiBuzzComboEntranceView.isActive = false;
            if (!memojiBuzzComboEntranceView.isHidden) {
                memojiBuzzComboEntranceView.m48441t(false);
            }
        } else if (Intrinsics.m88377d(c4470c, C4470c.f16267i)) {
            memojiBuzzComboEntranceView.isActive = true;
            if (!memojiBuzzComboEntranceView.isHidden) {
                memojiBuzzComboEntranceView.m48442u();
            }
        }
        xa2.INSTANCE.m209830a(memojiBuzzComboEntranceView.TAG, "initMemojiPreview life " + c4470c.f16276c + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m48434s(MemojiBuzzComboEntranceView memojiBuzzComboEntranceView, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i3 = R$string.f21002w;
        }
        memojiBuzzComboEntranceView.m48440r(i, i2, i3);
    }

    @NotNull
    public final VFrame get_content_root() {
        VFrame vFrame = this._content_root;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.m88391r("_content_root");
        return null;
    }

    @NotNull
    public final View get_content_root_content_bg() {
        View view = this._content_root_content_bg;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_content_root_content_bg");
        return null;
    }

    @NotNull
    public final VText get_content_root_desc() {
        VText vText = this._content_root_desc;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_content_root_desc");
        return null;
    }

    @NotNull
    public final VImage get_content_root_icon() {
        VImage vImage = this._content_root_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_content_root_icon");
        return null;
    }

    @NotNull
    public final VFrame get_content_root_preview_root() {
        VFrame vFrame = this._content_root_preview_root;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.m88391r("_content_root_preview_root");
        return null;
    }

    @NotNull
    public final VText get_content_root_title() {
        VText vText = this._content_root_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_content_root_title");
        return null;
    }

    @NotNull
    public final View get_red_dot() {
        View view = this._red_dot;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_red_dot");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final View m48435i(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM202182b = voy.m202182b(this, inflater, parent);
        viewM202182b.getClass();
        return viewM202182b;
    }

    /* JADX INFO: renamed from: n */
    public final void m48436n(@Nullable Act act) {
        C22421c c22421cDuringCreated;
        C22421c c22421cDelay;
        C22421c c22421cDistinctUntilChanged;
        C22421c<C4470c> c22421cLifecycle;
        if (!k8w.INSTANCE.m148752a(act)) {
            xa2.INSTANCE.m209830a(this.TAG, "initSubscribe act error ");
            return;
        }
        if (this.initMemojiRes.get()) {
            xa2.INSTANCE.m209830a(this.TAG, "initSubscribe act error ");
            return;
        }
        this.initMemojiRes.set(true);
        kcg0 kcg0VarSubscribe = null;
        this.lifeSubscribe = (act == null || (c22421cLifecycle = act.lifecycle()) == null) ? null : c22421cLifecycle.subscribe(psd0.m173596G(new y20() { // from class: l.ooy
            @Override // p153l.y20
            public final void call(Object obj) {
                MemojiBuzzComboEntranceView.m48429h(this.f148401a, (C4470c) obj);
            }
        }));
        if (act != null && (c22421cDuringCreated = act.duringCreated(BuzzMediaCallManager.INSTANCE.m48122C())) != null && (c22421cDelay = c22421cDuringCreated.delay(1L, TimeUnit.SECONDS)) != null && (c22421cDistinctUntilChanged = c22421cDelay.distinctUntilChanged()) != null) {
            final Function1 function1 = new Function1() { // from class: l.poy
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MemojiBuzzComboEntranceView.m48422a((Boolean) obj);
                }
            };
            C22421c c22421cFilter = c22421cDistinctUntilChanged.filter(new qcj() { // from class: l.qoy
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return MemojiBuzzComboEntranceView.m48423b(function1, obj);
                }
            });
            if (c22421cFilter != null) {
                kcg0VarSubscribe = c22421cFilter.subscribe(psd0.m173596G(new y20() { // from class: l.roy
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        MemojiBuzzComboEntranceView.m48425d(this.f164286a, (Boolean) obj);
                    }
                }));
            }
        }
        this.mediaBuzzSubscribe = kcg0VarSubscribe;
    }

    /* JADX INFO: renamed from: o */
    public final void m48437o(boolean hidden) {
        this.isHidden = hidden;
        if (hidden) {
            m48441t(true);
        } else {
            m48442u();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        psd0.m173633z(this.subscribe);
        psd0.m173633z(this.lifeSubscribe);
        psd0.m173633z(this.mediaBuzzSubscribe);
        this.localSurface = null;
    }

    /* JADX INFO: renamed from: p */
    public final void m48438p() {
        xa2.INSTANCE.m209830a(this.TAG, "previewMemoji");
        bnl0.m105524M(get_content_root_preview_root(), true);
        SurfaceView surfaceView = this.localSurface;
        if (surfaceView != null) {
            if (surfaceView != null) {
                BuzzMediaCallManager buzzMediaCallManager = BuzzMediaCallManager.INSTANCE;
                buzzMediaCallManager.m48157l0(surfaceView);
                buzzMediaCallManager.m48151g0(this.surfaceWidth, this.surfaceHeight);
                k8w.INSTANCE.m148761j(get_content_root_content_bg(), get_content_root_icon());
                return;
            }
            return;
        }
        SurfaceView surfaceView2 = new SurfaceView(getContext());
        this.localSurface = surfaceView2;
        if (surfaceView2.getParent() instanceof ViewGroup) {
            ViewParent parent = surfaceView2.getParent();
            parent.getClass();
            ((ViewGroup) parent).removeView(surfaceView2);
        }
        surfaceView2.setZOrderMediaOverlay(true);
        get_content_root_preview_root().addView(surfaceView2, 0, new ViewGroup.LayoutParams(-1, -1));
        surfaceView2.setOutlineProvider(new mmp(qa00.f156323j));
        surfaceView2.setClipToOutline(true);
        SurfaceHolder holder = surfaceView2.getHolder();
        if (holder != null) {
            holder.addCallback(new SurfaceHolderCallbackC8599a(surfaceView2));
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m48439q() {
        if (this.initMemojiRes.get()) {
            this.initMemojiRes.set(false);
            psd0.m173633z(this.subscribe);
            psd0.m173633z(this.lifeSubscribe);
            psd0.m173633z(this.mediaBuzzSubscribe);
            m48441t(true);
            get_content_root_preview_root().removeAllViews();
            this.localSurface = null;
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m48440r(int count, int bonus, @StringRes int res) {
        bnl0.m105524M(get_content_root_desc(), count >= 0);
        VText vText = get_content_root_desc();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String strM148007c = k3d0.m148007c(res);
        strM148007c.getClass();
        vText.setText(String.format(strM148007c, Arrays.copyOf(new Object[]{Integer.valueOf(count)}, 1)));
        bnl0.m105524M(get_red_dot(), bonus > 0);
    }

    public final void set_content_root(@NotNull VFrame vFrame) {
        vFrame.getClass();
        this._content_root = vFrame;
    }

    public final void set_content_root_content_bg(@NotNull View view) {
        view.getClass();
        this._content_root_content_bg = view;
    }

    public final void set_content_root_desc(@NotNull VText vText) {
        vText.getClass();
        this._content_root_desc = vText;
    }

    public final void set_content_root_icon(@NotNull VImage vImage) {
        vImage.getClass();
        this._content_root_icon = vImage;
    }

    public final void set_content_root_preview_root(@NotNull VFrame vFrame) {
        vFrame.getClass();
        this._content_root_preview_root = vFrame;
    }

    public final void set_content_root_title(@NotNull VText vText) {
        vText.getClass();
        this._content_root_title = vText;
    }

    public final void set_red_dot(@NotNull View view) {
        view.getClass();
        this._red_dot = view;
    }

    /* JADX INFO: renamed from: t */
    public final void m48441t(final boolean release) {
        if (bnl0.m105529O0(this)) {
            xa2 xa2Var = xa2.INSTANCE;
            xa2Var.m209830a(this.TAG, "stopPreviewMemoji release " + release);
            if (Intrinsics.m88377d(BuzzMediaCallManager.INSTANCE.m48122C().m222761e(), Boolean.TRUE)) {
                xa2Var.m209830a(this.TAG, "stopPreviewMemoji, but inMediaBuzzCallState true");
                return;
            }
            k8w.INSTANCE.m148763l(get_content_root_content_bg(), get_content_root_icon());
            psd0.m173633z(this.subscribe);
            if (!this.isPreview.get()) {
                xa2Var.m209830a(this.TAG, "stopPreviewMemoji but isPreview false");
            } else {
                this.isPreview.set(false);
                l51.m152919y(new Runnable() { // from class: l.noy
                    @Override // java.lang.Runnable
                    public final void run() {
                        MemojiBuzzComboEntranceView.m48428g(release, this);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m48442u() {
        if (!bnl0.m105529O0(this)) {
            xa2.INSTANCE.m209830a(this.TAG, "tryStartPreview, but self not visible");
            return;
        }
        if (this.isHidden) {
            xa2.INSTANCE.m209830a(this.TAG, "tryStartPreview, but frag isHidden true");
            return;
        }
        if (!this.isActive) {
            xa2.INSTANCE.m209830a(this.TAG, "tryStartPreview, but frag not active");
            return;
        }
        BuzzMediaCallManager buzzMediaCallManager = BuzzMediaCallManager.INSTANCE;
        if (Intrinsics.m88377d(buzzMediaCallManager.m48122C().m222761e(), Boolean.TRUE)) {
            xa2.INSTANCE.m209830a(this.TAG, "tryStartPreview, but inMediaBuzzCallState true");
            return;
        }
        String[] strArr = wzx.m208784k() ? new String[]{"android.permission.RECORD_AUDIO", "android.permission.CAMERA"} : new String[]{"android.permission.RECORD_AUDIO", "android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE"};
        if (!PermissionHelper.m81064b((String[]) Arrays.copyOf(strArr, strArr.length))) {
            xa2.INSTANCE.m209830a(this.TAG, "tryStartPreview, check basic permission is false");
            return;
        }
        if (!buzzMediaCallManager.m48160n(false)) {
            xa2.INSTANCE.m209830a(this.TAG, "tryStartPreview, checkMediaCanStart false");
            return;
        }
        qn3 qn3Var = qn3.INSTANCE;
        if (!qn3.m177191o(qn3Var, null, 1, null)) {
            xa2.INSTANCE.m209830a(this.TAG, "tryStartPreview, but memoji res not load");
            return;
        }
        if (this.isPreview.get()) {
            xa2.INSTANCE.m209830a(this.TAG, "tryStartPreview, but isPreview true");
            return;
        }
        xa2.INSTANCE.m209830a(this.TAG, "tryStartPreview BuzzMediaCallManager callState " + buzzMediaCallManager.m48173y().m222761e());
        qn3Var.m177203y();
        this.isPreview.set(true);
        final String str = CoreModule.f18264c.f20381e0.m116600p9().publicId;
        str.getClass();
        BuzzCallState buzzCallStateM222761e = buzzMediaCallManager.m48173y().m222761e();
        BuzzCallState buzzCallState = BuzzCallState.UN_INIT_STATE;
        AtomicBoolean atomicBoolean = this.sdkInit;
        if (buzzCallStateM222761e != buzzCallState) {
            atomicBoolean.set(true);
        } else {
            atomicBoolean.set(false);
            this.subscribe = C22421c.create(new C22421c.a() { // from class: l.soy
                @Override // p153l.y20
                public final void call(Object obj) {
                    MemojiBuzzComboEntranceView.m48424c(str, (gcg0) obj);
                }
            }).delaySubscription(1000L, TimeUnit.MILLISECONDS).compose(psd0.m173605P()).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.toy
                @Override // p153l.y20
                public final void call(Object obj) {
                    MemojiBuzzComboEntranceView.m48426e(this.f175521a, (Unit) obj);
                }
            }, new y20() { // from class: l.uoy
                @Override // p153l.y20
                public final void call(Object obj) {
                    MemojiBuzzComboEntranceView.m48427f((Throwable) obj);
                }
            }));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MemojiBuzzComboEntranceView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MemojiBuzzComboEntranceView(@NotNull Context context) {
        this(context, null);
        context.getClass();
    }
}
