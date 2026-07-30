package com.p051p1.mobile.putong.live.base.vap.mix;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.MotionEvent;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.core.data.GameIdentity;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.vap.mix.C12631a;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.aspectj.lang.JoinPoint;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p153l.C21726z0;
import p153l.ap0;
import p153l.c4s;
import p153l.e6j;
import p153l.i6j;
import p153l.jo0;
import p153l.ln50;
import p153l.m33;
import p153l.oc00;
import p153l.v7j;
import p153l.vtl;
import p153l.wol;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.base.vap.mix.a */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m88120d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \\2\u00020\u0001:\u0001\u001bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\bJ\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\bJ\u000f\u0010\u001c\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\bJ\u0017\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\"\u0010#R$\u0010*\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u00102\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u00109\u001a\u0004\u0018\u0001038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R$\u0010@\u001a\u0004\u0018\u00010:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010E\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010\u001aR\u0016\u0010G\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010AR\u0018\u0010K\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u001b\u0010Q\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\"\u0010W\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010\u0013\"\u0004\bU\u0010VR\u0014\u0010Z\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010YR\u0016\u0010[\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010S¨\u0006]"}, m88121d2 = {"Lcom/p1/mobile/putong/live/base/vap/mix/a;", "Ll/wol;", "Ll/ap0;", GameIdentity.player, "<init>", "(Ll/ap0;)V", "", BLiveStormDanmakuGiftResourceType.f45292l, "()V", "Ll/jo0;", Constants.KEY_CONFIG, BaseSei.f14625Y, "(Ll/jo0;)V", BaseSei.f14624X, "m", "p", BaseSei.f14626Z, "", "k", "()Z", "", "e", "(Ll/jo0;)I", "f", "frameIndex", Constants.INAPP_DATA_TAG, "(I)V", "a", "onDestroy", "Landroid/view/MotionEvent;", "ev", "b", "(Landroid/view/MotionEvent;)Z", "Ll/ap0;", "u", "()Ll/ap0;", "Ll/vtl;", "Ll/vtl;", "getResourceRequest", "()Ll/vtl;", c4s.C_ZONE, "(Ll/vtl;)V", "resourceRequest", "Ll/ln50;", "c", "Ll/ln50;", "getResourceClickListener", "()Ll/ln50;", "B", "(Ll/ln50;)V", "resourceClickListener", "Lcom/p1/mobile/putong/live/base/vap/mix/d;", "Lcom/p1/mobile/putong/live/base/vap/mix/d;", ResourceDirection.f39656v, "()Lcom/p1/mobile/putong/live/base/vap/mix/d;", "setSrcMap", "(Lcom/p1/mobile/putong/live/base/vap/mix/d;)V", "srcMap", "Ll/i6j;", "Ll/i6j;", BLiveStormDanmakuGiftResourceType.f45294s, "()Ll/i6j;", "setFrameAll", "(Ll/i6j;)V", "frameAll", "I", "r", "()I", "setCurFrameIndex", "curFrameIndex", "g", "resultCbCount", "Lcom/p1/mobile/putong/live/base/vap/mix/b;", "h", "Lcom/p1/mobile/putong/live/base/vap/mix/b;", "mixRender", "Ll/oc00;", RXScreenCaptureService.KEY_INDEX, "Lkotlin/Lazy;", Constants.KEY_T, "()Ll/oc00;", "mixTouch", "j", "Z", "q", "A", "(Z)V", "autoTxtColorFill", "Ljava/lang/Object;", "Ljava/lang/Object;", JoinPoint.SYNCHRONIZATION_LOCK, "forceStopLock", "Companion", "base_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class C12631a implements wol {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ap0 player;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public vtl resourceRequest;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public ln50 resourceClickListener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public C12634d srcMap;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public i6j frameAll;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int curFrameIndex;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public int resultCbCount;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public C12632b mixRender;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Lazy mixTouch;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public boolean autoTxtColorFill;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Object lock;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public boolean forceStopLock;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.vap.mix.a$b */
    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f45455a;

        static {
            int[] iArr = new int[Src.SrcType.values().length];
            try {
                iArr[Src.SrcType.IMG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Src.SrcType.TXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f45455a = iArr;
        }
    }

    public C12631a(@NotNull ap0 ap0Var) {
        ap0Var.getClass();
        this.player = ap0Var;
        this.curFrameIndex = -1;
        this.mixTouch = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.gc00
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C12631a.m69853j(this.f103515a);
            }
        });
        this.autoTxtColorFill = true;
        this.lock = new Object();
    }

    /* JADX INFO: renamed from: j */
    public static oc00 m69853j(C12631a c12631a) {
        return new oc00(c12631a);
    }

    /* JADX INFO: renamed from: l */
    private final void m69854l() {
        SparseArray<v7j> sparseArrayM138824a;
        HashMap<String, Src> mapM69886a;
        HashMap<String, Src> mapM69886a2;
        Collection<Src> collectionValues;
        Bitmap bitmap;
        m69869p();
        jo0 jo0VarM150557b = this.player.getConfigManager().getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String();
        if (jo0VarM150557b == null || jo0VarM150557b.getIsMix()) {
            ArrayList arrayList = new ArrayList();
            C12634d c12634d = this.srcMap;
            if (c12634d != null && (mapM69886a2 = c12634d.m69886a()) != null && (collectionValues = mapM69886a2.values()) != null) {
                for (Src src : collectionValues) {
                    C12632b c12632b = this.mixRender;
                    if (c12632b != null) {
                        c12632b.m69881c(src.getSrcTextureId());
                    }
                    int i = b.f45455a[src.getSrcType().ordinal()];
                    if (i == 1) {
                        arrayList.add(new C12633c(src));
                    } else if (i == 2 && (bitmap = src.getBitmap()) != null) {
                        bitmap.recycle();
                    }
                }
            }
            vtl vtlVar = this.resourceRequest;
            if (vtlVar != null) {
                vtlVar.mo75445b(arrayList);
            }
            this.curFrameIndex = -1;
            C12634d c12634d2 = this.srcMap;
            if (c12634d2 != null && (mapM69886a = c12634d2.m69886a()) != null) {
                mapM69886a.clear();
            }
            i6j i6jVar = this.frameAll;
            if (i6jVar == null || (sparseArrayM138824a = i6jVar.m138824a()) == null) {
                return;
            }
            sparseArrayM138824a.clear();
        }
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m69855n(Src src, C12631a c12631a, Bitmap bitmap) {
        Bitmap bitmapM156917a;
        if (bitmap == null) {
            C21726z0.INSTANCE.m218093b("AnimPlayer.MixAnimPlugin", "fetch image " + src.getSrcId() + " bitmap return null");
            bitmapM156917a = m33.INSTANCE.m156917a();
        } else {
            bitmapM156917a = bitmap;
        }
        src.m69847p(bitmapM156917a);
        C21726z0.INSTANCE.m218095d("AnimPlayer.MixAnimPlugin", "fetch image " + src.getSrcId() + " finish bitmap is " + (bitmap != null ? Integer.valueOf(bitmap.hashCode()) : null));
        c12631a.m69878z();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m69856o(Src src, C12631a c12631a, String str) {
        src.m69849r(str == null ? "" : str);
        C21726z0.INSTANCE.m218095d("AnimPlayer.MixAnimPlugin", "fetch text " + src.getSrcId() + " finish txt is " + str);
        c12631a.m69878z();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public static final void m69857w(C12631a c12631a, C12633c c12633c) {
        ln50 ln50Var = c12631a.resourceClickListener;
        if (ln50Var != null) {
            ln50Var.mo154963a(c12633c);
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m69858A(boolean z) {
        this.autoTxtColorFill = z;
    }

    /* JADX INFO: renamed from: B */
    public final void m69859B(@Nullable ln50 ln50Var) {
        this.resourceClickListener = ln50Var;
    }

    /* JADX INFO: renamed from: C */
    public final void m69860C(@Nullable vtl vtlVar) {
        this.resourceRequest = vtlVar;
    }

    @Override // p153l.wol
    /* JADX INFO: renamed from: a */
    public void mo69861a() {
        m69854l();
    }

    @Override // p153l.wol
    /* JADX INFO: renamed from: b */
    public boolean mo69862b(@NotNull MotionEvent ev) {
        ev.getClass();
        jo0 jo0VarM150557b = this.player.getConfigManager().getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String();
        if ((jo0VarM150557b != null && !jo0VarM150557b.getIsMix()) || this.resourceClickListener == null) {
            return super.mo69862b(ev);
        }
        final C12633c c12633cM167071b = m69873t().m167071b(ev);
        if (c12633cM167071b == null) {
            return true;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: l.fc00
            @Override // java.lang.Runnable
            public final void run() {
                C12631a.m69857w(this.f98172a, c12633cM167071b);
            }
        });
        return true;
    }

    @Override // p153l.wol
    /* JADX INFO: renamed from: c */
    public /* bridge */ void mo69863c(int i) {
        super.mo69863c(i);
    }

    @Override // p153l.wol
    /* JADX INFO: renamed from: d */
    public void mo69864d(int frameIndex) {
        SparseArray<v7j> sparseArrayM138824a;
        v7j v7jVar;
        ArrayList<e6j> arrayListM200213b;
        HashMap<String, Src> mapM69886a;
        Src src;
        C12632b c12632b;
        jo0 jo0VarM150557b = this.player.getConfigManager().getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String();
        if (jo0VarM150557b != null && jo0VarM150557b.getIsMix()) {
            this.curFrameIndex = frameIndex;
            i6j i6jVar = this.frameAll;
            if (i6jVar == null || (sparseArrayM138824a = i6jVar.m138824a()) == null || (v7jVar = sparseArrayM138824a.get(frameIndex)) == null || (arrayListM200213b = v7jVar.m200213b()) == null) {
                return;
            }
            for (e6j e6jVar : arrayListM200213b) {
                C12634d c12634d = this.srcMap;
                if (c12634d != null && (mapM69886a = c12634d.m69886a()) != null && (src = mapM69886a.get(e6jVar.getSrcId())) != null && (c12632b = this.mixRender) != null) {
                    c12632b.m69882d(jo0VarM150557b, e6jVar, src);
                }
            }
        }
    }

    @Override // p153l.wol
    /* JADX INFO: renamed from: e */
    public int mo69865e(@NotNull jo0 config) {
        HashMap<String, Src> mapM69886a;
        Collection<Src> collectionValues;
        config.getClass();
        if (!config.getIsMix()) {
            return 0;
        }
        if (this.resourceRequest == null) {
            C21726z0.INSTANCE.m218093b("AnimPlayer.MixAnimPlugin", "IFetchResource is empty");
            return 0;
        }
        m69877y(config);
        m69876x(config);
        m69868m();
        if (!m69867k()) {
            return 10006;
        }
        C21726z0.INSTANCE.m218095d("AnimPlayer.MixAnimPlugin", "load resource " + this.resultCbCount);
        C12634d c12634d = this.srcMap;
        if (c12634d != null && (mapM69886a = c12634d.m69886a()) != null && (collectionValues = mapM69886a.values()) != null) {
            for (Src src : collectionValues) {
                if (src.getBitmap() == null) {
                    C21726z0.INSTANCE.m218093b("AnimPlayer.MixAnimPlugin", "missing src " + src);
                    return 10006;
                }
                Bitmap bitmap = src.getBitmap();
                if ((bitmap != null ? bitmap.getConfig() : null) == Bitmap.Config.ALPHA_8) {
                    C21726z0.INSTANCE.m218093b("AnimPlayer.MixAnimPlugin", "src " + src + " bitmap must not be ALPHA_8");
                    return 10006;
                }
            }
        }
        return 0;
    }

    @Override // p153l.wol
    /* JADX INFO: renamed from: f */
    public void mo69866f() {
        jo0 jo0VarM150557b = this.player.getConfigManager().getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String();
        if (jo0VarM150557b == null || jo0VarM150557b.getIsMix()) {
            C21726z0.INSTANCE.m218095d("AnimPlayer.MixAnimPlugin", "mix render init");
            C12632b c12632b = new C12632b(this);
            this.mixRender = c12632b;
            c12632b.m69880b();
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m69867k() {
        HashMap<String, Src> mapM69886a;
        Collection<Src> collectionValues;
        try {
            C12634d c12634d = this.srcMap;
            if (c12634d == null || (mapM69886a = c12634d.m69886a()) == null || (collectionValues = mapM69886a.values()) == null) {
                return true;
            }
            for (Src src : collectionValues) {
                if (src.getSrcType() == Src.SrcType.TXT) {
                    src.m69847p(m33.INSTANCE.m156918b(src));
                }
            }
            return true;
        } catch (OutOfMemoryError e) {
            C21726z0.INSTANCE.m218094c("AnimPlayer.MixAnimPlugin", "draw text OOM " + e, e);
            return false;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m69868m() {
        HashMap<String, Src> mapM69886a;
        Collection<Src> collectionValues;
        HashMap<String, Src> mapM69886a2;
        synchronized (this.lock) {
            this.forceStopLock = false;
            Unit unit = Unit.INSTANCE;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C12634d c12634d = this.srcMap;
        int size = (c12634d == null || (mapM69886a2 = c12634d.m69886a()) == null) ? 0 : mapM69886a2.size();
        C21726z0.INSTANCE.m218095d("AnimPlayer.MixAnimPlugin", "load resource totalSrc = " + size);
        this.resultCbCount = 0;
        C12634d c12634d2 = this.srcMap;
        if (c12634d2 != null && (mapM69886a = c12634d2.m69886a()) != null && (collectionValues = mapM69886a.values()) != null) {
            for (final Src src : collectionValues) {
                if (src.getSrcType() == Src.SrcType.IMG) {
                    C21726z0.INSTANCE.m218095d("AnimPlayer.MixAnimPlugin", "fetch image " + src.getSrcId());
                    vtl vtlVar = this.resourceRequest;
                    if (vtlVar != null) {
                        vtlVar.mo75444a(new C12633c(src), new Function1() { // from class: l.hc00
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return C12631a.m69855n(src, this, (Bitmap) obj);
                            }
                        });
                    }
                } else if (src.getSrcType() == Src.SrcType.TXT) {
                    C21726z0.INSTANCE.m218095d("AnimPlayer.MixAnimPlugin", "fetch txt " + src.getSrcId());
                    vtl vtlVar2 = this.resourceRequest;
                    if (vtlVar2 != null) {
                        vtlVar2.mo75446c(new C12633c(src), new Function1() { // from class: l.ic00
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return C12631a.m69856o(src, this, (String) obj);
                            }
                        });
                    }
                }
            }
        }
        synchronized (this.lock) {
            while (this.resultCbCount < size && !this.forceStopLock) {
                try {
                    this.lock.wait();
                } catch (Throwable th) {
                    throw th;
                }
            }
            Unit unit2 = Unit.INSTANCE;
        }
        C21726z0.INSTANCE.m218095d("AnimPlayer.MixAnimPlugin", "fetchResourceSync cost=" + (SystemClock.elapsedRealtime() - jElapsedRealtime) + "ms");
    }

    @Override // p153l.wol
    public void onDestroy() {
        m69854l();
    }

    /* JADX INFO: renamed from: p */
    public final void m69869p() {
        synchronized (this.lock) {
            this.forceStopLock = true;
            this.lock.notifyAll();
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final boolean getAutoTxtColorFill() {
        return this.autoTxtColorFill;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final int getCurFrameIndex() {
        return this.curFrameIndex;
    }

    @Nullable
    /* JADX INFO: renamed from: s, reason: from getter */
    public final i6j getFrameAll() {
        return this.frameAll;
    }

    /* JADX INFO: renamed from: t */
    public final oc00 m69873t() {
        return (oc00) this.mixTouch.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: u, reason: from getter */
    public final ap0 getPlayer() {
        return this.player;
    }

    @Nullable
    /* JADX INFO: renamed from: v, reason: from getter */
    public final C12634d getSrcMap() {
        return this.srcMap;
    }

    /* JADX INFO: renamed from: x */
    public final void m69876x(jo0 config) {
        JSONObject jsonConfig = config.getJsonConfig();
        if (jsonConfig != null) {
            this.frameAll = new i6j(jsonConfig);
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m69877y(jo0 config) {
        JSONObject jsonConfig = config.getJsonConfig();
        if (jsonConfig != null) {
            this.srcMap = new C12634d(jsonConfig);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m69878z() {
        synchronized (this.lock) {
            this.resultCbCount++;
            this.lock.notifyAll();
            Unit unit = Unit.INSTANCE;
        }
    }
}
