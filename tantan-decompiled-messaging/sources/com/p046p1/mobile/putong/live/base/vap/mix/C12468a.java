package com.p046p1.mobile.putong.live.base.vap.mix;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.MotionEvent;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.core.data.GameIdentity;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.vap.mix.C12468a;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p149l.C21588z0;
import p149l.a5j;
import p149l.b2s;
import p149l.ep0;
import p149l.ff50;
import p149l.hrl;
import p149l.j3j;
import p149l.kml;
import p149l.n3j;
import p149l.no0;
import p149l.r300;
import p149l.w23;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.base.vap.mix.a */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \\2\u00020\u0001:\u0001\u001bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\bJ\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\bJ\u000f\u0010\u001c\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\bJ\u0017\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\"\u0010#R$\u0010*\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u00102\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u00109\u001a\u0004\u0018\u0001038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R$\u0010@\u001a\u0004\u0018\u00010:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010E\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010\u001aR\u0016\u0010G\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010AR\u0018\u0010K\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u001b\u0010Q\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\"\u0010W\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010\u0013\"\u0004\bU\u0010VR\u0014\u0010Z\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010YR\u0016\u0010[\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010S¨\u0006]"}, m87232d2 = {"Lcom/p1/mobile/putong/live/base/vap/mix/a;", "Ll/kml;", "Ll/ep0;", GameIdentity.player, "<init>", "(Ll/ep0;)V", "", BLiveStormDanmakuGiftResourceType.f44444l, "()V", "Ll/no0;", Constants.KEY_CONFIG, BaseSei.f13931Y, "(Ll/no0;)V", BaseSei.f13930X, "m", "p", BaseSei.f13932Z, "", "k", "()Z", "", "e", "(Ll/no0;)I", "f", "frameIndex", Constants.INAPP_DATA_TAG, "(I)V", "a", "onDestroy", "Landroid/view/MotionEvent;", "ev", "b", "(Landroid/view/MotionEvent;)Z", "Ll/ep0;", "u", "()Ll/ep0;", "Ll/hrl;", "Ll/hrl;", "getResourceRequest", "()Ll/hrl;", b2s.C_ZONE, "(Ll/hrl;)V", "resourceRequest", "Ll/ff50;", "c", "Ll/ff50;", "getResourceClickListener", "()Ll/ff50;", "B", "(Ll/ff50;)V", "resourceClickListener", "Lcom/p1/mobile/putong/live/base/vap/mix/d;", "Lcom/p1/mobile/putong/live/base/vap/mix/d;", ResourceDirection.f38808v, "()Lcom/p1/mobile/putong/live/base/vap/mix/d;", "setSrcMap", "(Lcom/p1/mobile/putong/live/base/vap/mix/d;)V", "srcMap", "Ll/n3j;", "Ll/n3j;", BLiveStormDanmakuGiftResourceType.f44446s, "()Ll/n3j;", "setFrameAll", "(Ll/n3j;)V", "frameAll", "I", "r", "()I", "setCurFrameIndex", "curFrameIndex", "g", "resultCbCount", "Lcom/p1/mobile/putong/live/base/vap/mix/b;", "h", "Lcom/p1/mobile/putong/live/base/vap/mix/b;", "mixRender", "Ll/r300;", RXScreenCaptureService.KEY_INDEX, "Lkotlin/Lazy;", Constants.KEY_T, "()Ll/r300;", "mixTouch", "j", "Z", "q", "A", "(Z)V", "autoTxtColorFill", "Ljava/lang/Object;", "Ljava/lang/Object;", JoinPoint.SYNCHRONIZATION_LOCK, "forceStopLock", "Companion", "base_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class C12468a implements kml {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ep0 player;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public hrl resourceRequest;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public ff50 resourceClickListener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public C12471d srcMap;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public n3j frameAll;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int curFrameIndex;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public int resultCbCount;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public C12469b mixRender;

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
    @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f44607a;

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
            f44607a = iArr;
        }
    }

    public C12468a(@NotNull ep0 ep0Var) {
        ep0Var.getClass();
        this.player = ep0Var;
        this.curFrameIndex = -1;
        this.mixTouch = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.j300
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C12468a.m68670j(this.f115995a);
            }
        });
        this.autoTxtColorFill = true;
        this.lock = new Object();
    }

    /* JADX INFO: renamed from: j */
    public static r300 m68670j(C12468a c12468a) {
        return new r300(c12468a);
    }

    /* JADX INFO: renamed from: l */
    private final void m68671l() {
        SparseArray<a5j> sparseArrayM157759a;
        HashMap<String, Src> mapM68703a;
        HashMap<String, Src> mapM68703a2;
        Collection<Src> collectionValues;
        Bitmap bitmap;
        m68686p();
        no0 no0VarM165246b = this.player.getConfigManager().getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String();
        if (no0VarM165246b == null || no0VarM165246b.getIsMix()) {
            ArrayList arrayList = new ArrayList();
            C12471d c12471d = this.srcMap;
            if (c12471d != null && (mapM68703a2 = c12471d.m68703a()) != null && (collectionValues = mapM68703a2.values()) != null) {
                for (Src src : collectionValues) {
                    C12469b c12469b = this.mixRender;
                    if (c12469b != null) {
                        c12469b.m68698c(src.getSrcTextureId());
                    }
                    int i = b.f44607a[src.getSrcType().ordinal()];
                    if (i == 1) {
                        arrayList.add(new C12470c(src));
                    } else if (i == 2 && (bitmap = src.getBitmap()) != null) {
                        bitmap.recycle();
                    }
                }
            }
            hrl hrlVar = this.resourceRequest;
            if (hrlVar != null) {
                hrlVar.mo74262b(arrayList);
            }
            this.curFrameIndex = -1;
            C12471d c12471d2 = this.srcMap;
            if (c12471d2 != null && (mapM68703a = c12471d2.m68703a()) != null) {
                mapM68703a.clear();
            }
            n3j n3jVar = this.frameAll;
            if (n3jVar == null || (sparseArrayM157759a = n3jVar.m157759a()) == null) {
                return;
            }
            sparseArrayM157759a.clear();
        }
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m68672n(Src src, C12468a c12468a, Bitmap bitmap) {
        Bitmap bitmapM201017a;
        if (bitmap == null) {
            C21588z0.INSTANCE.m216707b("AnimPlayer.MixAnimPlugin", "fetch image " + src.getSrcId() + " bitmap return null");
            bitmapM201017a = w23.INSTANCE.m201017a();
        } else {
            bitmapM201017a = bitmap;
        }
        src.m68664p(bitmapM201017a);
        C21588z0.INSTANCE.m216709d("AnimPlayer.MixAnimPlugin", "fetch image " + src.getSrcId() + " finish bitmap is " + (bitmap != null ? Integer.valueOf(bitmap.hashCode()) : null));
        c12468a.m68695z();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m68673o(Src src, C12468a c12468a, String str) {
        src.m68666r(str == null ? "" : str);
        C21588z0.INSTANCE.m216709d("AnimPlayer.MixAnimPlugin", "fetch text " + src.getSrcId() + " finish txt is " + str);
        c12468a.m68695z();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public static final void m68674w(C12468a c12468a, C12470c c12470c) {
        ff50 ff50Var = c12468a.resourceClickListener;
        if (ff50Var != null) {
            ff50Var.mo121109a(c12470c);
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m68675A(boolean z) {
        this.autoTxtColorFill = z;
    }

    /* JADX INFO: renamed from: B */
    public final void m68676B(@Nullable ff50 ff50Var) {
        this.resourceClickListener = ff50Var;
    }

    /* JADX INFO: renamed from: C */
    public final void m68677C(@Nullable hrl hrlVar) {
        this.resourceRequest = hrlVar;
    }

    @Override // p149l.kml
    /* JADX INFO: renamed from: a */
    public void mo68678a() {
        m68671l();
    }

    @Override // p149l.kml
    /* JADX INFO: renamed from: b */
    public boolean mo68679b(@NotNull MotionEvent ev) {
        ev.getClass();
        no0 no0VarM165246b = this.player.getConfigManager().getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String();
        if ((no0VarM165246b != null && !no0VarM165246b.getIsMix()) || this.resourceClickListener == null) {
            return super.mo68679b(ev);
        }
        final C12470c c12470cM177635b = m68690t().m177635b(ev);
        if (c12470cM177635b == null) {
            return true;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: l.i300
            @Override // java.lang.Runnable
            public final void run() {
                C12468a.m68674w(this.f110602a, c12470cM177635b);
            }
        });
        return true;
    }

    @Override // p149l.kml
    /* JADX INFO: renamed from: c */
    public /* bridge */ void mo68680c(int i) {
        super.mo68680c(i);
    }

    @Override // p149l.kml
    /* JADX INFO: renamed from: d */
    public void mo68681d(int frameIndex) {
        SparseArray<a5j> sparseArrayM157759a;
        a5j a5jVar;
        ArrayList<j3j> arrayListM95044b;
        HashMap<String, Src> mapM68703a;
        Src src;
        C12469b c12469b;
        no0 no0VarM165246b = this.player.getConfigManager().getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String();
        if (no0VarM165246b != null && no0VarM165246b.getIsMix()) {
            this.curFrameIndex = frameIndex;
            n3j n3jVar = this.frameAll;
            if (n3jVar == null || (sparseArrayM157759a = n3jVar.m157759a()) == null || (a5jVar = sparseArrayM157759a.get(frameIndex)) == null || (arrayListM95044b = a5jVar.m95044b()) == null) {
                return;
            }
            for (j3j j3jVar : arrayListM95044b) {
                C12471d c12471d = this.srcMap;
                if (c12471d != null && (mapM68703a = c12471d.m68703a()) != null && (src = mapM68703a.get(j3jVar.getSrcId())) != null && (c12469b = this.mixRender) != null) {
                    c12469b.m68699d(no0VarM165246b, j3jVar, src);
                }
            }
        }
    }

    @Override // p149l.kml
    /* JADX INFO: renamed from: e */
    public int mo68682e(@NotNull no0 config) {
        HashMap<String, Src> mapM68703a;
        Collection<Src> collectionValues;
        config.getClass();
        if (!config.getIsMix()) {
            return 0;
        }
        if (this.resourceRequest == null) {
            C21588z0.INSTANCE.m216707b("AnimPlayer.MixAnimPlugin", "IFetchResource is empty");
            return 0;
        }
        m68694y(config);
        m68693x(config);
        m68685m();
        if (!m68684k()) {
            return 10006;
        }
        C21588z0.INSTANCE.m216709d("AnimPlayer.MixAnimPlugin", "load resource " + this.resultCbCount);
        C12471d c12471d = this.srcMap;
        if (c12471d != null && (mapM68703a = c12471d.m68703a()) != null && (collectionValues = mapM68703a.values()) != null) {
            for (Src src : collectionValues) {
                if (src.getBitmap() == null) {
                    C21588z0.INSTANCE.m216707b("AnimPlayer.MixAnimPlugin", "missing src " + src);
                    return 10006;
                }
                Bitmap bitmap = src.getBitmap();
                if ((bitmap != null ? bitmap.getConfig() : null) == Bitmap.Config.ALPHA_8) {
                    C21588z0.INSTANCE.m216707b("AnimPlayer.MixAnimPlugin", "src " + src + " bitmap must not be ALPHA_8");
                    return 10006;
                }
            }
        }
        return 0;
    }

    @Override // p149l.kml
    /* JADX INFO: renamed from: f */
    public void mo68683f() {
        no0 no0VarM165246b = this.player.getConfigManager().getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String();
        if (no0VarM165246b == null || no0VarM165246b.getIsMix()) {
            C21588z0.INSTANCE.m216709d("AnimPlayer.MixAnimPlugin", "mix render init");
            C12469b c12469b = new C12469b(this);
            this.mixRender = c12469b;
            c12469b.m68697b();
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m68684k() {
        HashMap<String, Src> mapM68703a;
        Collection<Src> collectionValues;
        try {
            C12471d c12471d = this.srcMap;
            if (c12471d == null || (mapM68703a = c12471d.m68703a()) == null || (collectionValues = mapM68703a.values()) == null) {
                return true;
            }
            for (Src src : collectionValues) {
                if (src.getSrcType() == Src.SrcType.TXT) {
                    src.m68664p(w23.INSTANCE.m201018b(src));
                }
            }
            return true;
        } catch (OutOfMemoryError e) {
            C21588z0.INSTANCE.m216708c("AnimPlayer.MixAnimPlugin", "draw text OOM " + e, e);
            return false;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m68685m() {
        HashMap<String, Src> mapM68703a;
        Collection<Src> collectionValues;
        HashMap<String, Src> mapM68703a2;
        synchronized (this.lock) {
            this.forceStopLock = false;
            Unit unit = Unit.INSTANCE;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C12471d c12471d = this.srcMap;
        int size = (c12471d == null || (mapM68703a2 = c12471d.m68703a()) == null) ? 0 : mapM68703a2.size();
        C21588z0.INSTANCE.m216709d("AnimPlayer.MixAnimPlugin", "load resource totalSrc = " + size);
        this.resultCbCount = 0;
        C12471d c12471d2 = this.srcMap;
        if (c12471d2 != null && (mapM68703a = c12471d2.m68703a()) != null && (collectionValues = mapM68703a.values()) != null) {
            for (final Src src : collectionValues) {
                if (src.getSrcType() == Src.SrcType.IMG) {
                    C21588z0.INSTANCE.m216709d("AnimPlayer.MixAnimPlugin", "fetch image " + src.getSrcId());
                    hrl hrlVar = this.resourceRequest;
                    if (hrlVar != null) {
                        hrlVar.mo74261a(new C12470c(src), new Function1() { // from class: l.k300
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return C12468a.m68672n(src, this, (Bitmap) obj);
                            }
                        });
                    }
                } else if (src.getSrcType() == Src.SrcType.TXT) {
                    C21588z0.INSTANCE.m216709d("AnimPlayer.MixAnimPlugin", "fetch txt " + src.getSrcId());
                    hrl hrlVar2 = this.resourceRequest;
                    if (hrlVar2 != null) {
                        hrlVar2.mo74263c(new C12470c(src), new Function1() { // from class: l.l300
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return C12468a.m68673o(src, this, (String) obj);
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
        C21588z0.INSTANCE.m216709d("AnimPlayer.MixAnimPlugin", "fetchResourceSync cost=" + (SystemClock.elapsedRealtime() - jElapsedRealtime) + "ms");
    }

    @Override // p149l.kml
    public void onDestroy() {
        m68671l();
    }

    /* JADX INFO: renamed from: p */
    public final void m68686p() {
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
    public final n3j getFrameAll() {
        return this.frameAll;
    }

    /* JADX INFO: renamed from: t */
    public final r300 m68690t() {
        return (r300) this.mixTouch.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: u, reason: from getter */
    public final ep0 getPlayer() {
        return this.player;
    }

    @Nullable
    /* JADX INFO: renamed from: v, reason: from getter */
    public final C12471d getSrcMap() {
        return this.srcMap;
    }

    /* JADX INFO: renamed from: x */
    public final void m68693x(no0 config) {
        JSONObject jsonConfig = config.getJsonConfig();
        if (jsonConfig != null) {
            this.frameAll = new n3j(jsonConfig);
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m68694y(no0 config) {
        JSONObject jsonConfig = config.getJsonConfig();
        if (jsonConfig != null) {
            this.srcMap = new C12471d(jsonConfig);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m68695z() {
        synchronized (this.lock) {
            this.resultCbCount++;
            this.lock.notifyAll();
            Unit unit = Unit.INSTANCE;
        }
    }
}
