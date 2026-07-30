package p153l;

import android.content.Context;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.momo.mcamera.mask.MaskModel;
import com.momo.mcamera.mask.Sticker;
import com.momo.piplinemomoext.input.audio.InterfaceC4260a;
import com.momo.pub.MomoPipelineModuleRegister;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0010J\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010!\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001d2\u0006\u0010 \u001a\u00020\u0014H\u0016¢\u0006\u0004\b!\u0010\"J+\u0010#\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001d2\u0006\u0010 \u001a\u00020\u0014H\u0016¢\u0006\u0004\b#\u0010\"J#\u0010&\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010\u001d2\b\u0010%\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b&\u0010'J\u0019\u0010)\u001a\u00020\f2\b\u0010(\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\f2\u0006\u0010+\u001a\u00020\u0014H\u0016¢\u0006\u0004\b,\u0010\u0017J\u0017\u0010/\u001a\u00020\f2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\f2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\f2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b5\u00104J\u0017\u00108\u001a\u00020\f2\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020\f2\u0006\u0010:\u001a\u00020\u001dH\u0016¢\u0006\u0004\b;\u0010*J\u0017\u0010=\u001a\u00020\f2\u0006\u0010<\u001a\u00020-H\u0016¢\u0006\u0004\b=\u00100J\u001f\u0010>\u001a\u00020\f2\u0006\u0010.\u001a\u00020\u001d2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020\f2\u0006\u0010.\u001a\u00020\u001dH\u0016¢\u0006\u0004\b@\u0010*J\u0017\u0010C\u001a\u00020\f2\u0006\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bC\u0010DJ'\u0010H\u001a\u00020\f2\u0006\u0010E\u001a\u00020\u00142\u0006\u0010F\u001a\u00020\u00142\u0006\u0010G\u001a\u00020\u0014H\u0016¢\u0006\u0004\bH\u0010IR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010JR\u0018\u0010M\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010LR\u0018\u0010P\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010OR\u0018\u0010S\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010RR\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010TR\u0016\u0010V\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010UR\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u00020X0W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010Y¨\u0006["}, m88121d2 = {"Ll/uw2;", "Ll/kpl;", "Lcom/momo/pub/MomoPipelineModuleRegister;", "register", "<init>", "(Lcom/momo/pub/MomoPipelineModuleRegister;)V", "Landroid/content/Context;", "context", "Ll/esl;", "detector", "Ll/ytl;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "n", "(Landroid/content/Context;Ll/esl;Ll/ytl;)V", "destroy", "()V", "Ll/aul;", "j", "(Ll/aul;)V", "", "scaleFactor", "q", "(F)V", "p", "Lcom/momo/piplinemomoext/input/audio/a;", "surroundMusic", Constants.INAPP_DATA_TAG, "(Lcom/momo/piplinemomoext/input/audio/a;)V", "", "id", Constants.KEY_KEY, "value", "g", "(Ljava/lang/String;Ljava/lang/String;F)V", "updateMakeupStyleValue", "makeupKey", "filterKey", "removeMakeupStyle", "(Ljava/lang/String;Ljava/lang/String;)V", "path", "k", "(Ljava/lang/String;)V", "intensity", "h", "", "type", "r", "(I)V", "Lcom/momo/mcamera/mask/MaskModel;", "maskModel", "c", "(Lcom/momo/mcamera/mask/MaskModel;)V", "a", "Lcom/momo/mcamera/mask/Sticker;", "sticker", "o", "(Lcom/momo/mcamera/mask/Sticker;)V", "stickerType", "e", "modelType", BLiveStormDanmakuGiftResourceType.f45292l, "f", "(Ljava/lang/String;Lcom/momo/mcamera/mask/MaskModel;)V", "b", "", "enable", RXScreenCaptureService.KEY_INDEX, "(Z)V", "sharpening", "saturation", "contrast", "m", "(FFF)V", "Lcom/momo/pub/MomoPipelineModuleRegister;", "Ll/voq;", "Ll/voq;", "filter", "Ll/gtl;", "Ll/gtl;", "faceBeauty", "Ll/htl;", "Ll/htl;", "faceEffect", "Ll/esl;", "I", "beautyType", "Ljava/util/Queue;", "Ljava/lang/Runnable;", "Ljava/util/Queue;", "actionCaches", "momomediaext_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@SourceDebugExtension
public final class uw2 implements kpl {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MomoPipelineModuleRegister register;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private voq filter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private gtl faceBeauty;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private htl faceEffect;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private esl detector;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int beautyType;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Queue<Runnable> actionCaches;

    public uw2(@NotNull MomoPipelineModuleRegister momoPipelineModuleRegister) {
        momoPipelineModuleRegister.getClass();
        this.register = momoPipelineModuleRegister;
        this.beautyType = 2;
        this.actionCaches = new LinkedList();
    }

    /* JADX INFO: renamed from: A */
    public static void m198316A(uw2 uw2Var, int i) {
        uw2Var.getClass();
        htl htlVar = uw2Var.faceEffect;
        if (htlVar != null) {
            htlVar.mo137093l(i);
        }
    }

    /* JADX INFO: renamed from: B */
    public static void m198317B(uw2 uw2Var, float f) {
        uw2Var.getClass();
        gtl gtlVar = uw2Var.faceBeauty;
        if (gtlVar != null) {
            gtlVar.mo132242h(f);
        }
    }

    /* JADX INFO: renamed from: C */
    public static void m198318C(uw2 uw2Var, float f) {
        uw2Var.getClass();
        voq voqVar = uw2Var.filter;
        if (voqVar != null) {
            voqVar.setWarpScaleFactor(f);
        }
    }

    /* JADX INFO: renamed from: D */
    public static void m198319D(uw2 uw2Var, String str, String str2) {
        uw2Var.getClass();
        gtl gtlVar = uw2Var.faceBeauty;
        if (gtlVar != null) {
            gtlVar.removeMakeupStyle(str, str2);
        }
    }

    /* JADX INFO: renamed from: E */
    public static void m198320E(uw2 uw2Var, MaskModel maskModel) {
        uw2Var.getClass();
        maskModel.getClass();
        htl htlVar = uw2Var.faceEffect;
        if (htlVar != null) {
            htlVar.mo137088c(maskModel);
        }
    }

    /* JADX INFO: renamed from: F */
    public static void m198321F(uw2 uw2Var, String str, String str2, float f) {
        uw2Var.getClass();
        gtl gtlVar = uw2Var.faceBeauty;
        if (gtlVar != null) {
            gtlVar.mo132241g(str, str2, f);
        }
    }

    /* JADX INFO: renamed from: G */
    public static void m198322G(uw2 uw2Var, String str, String str2, float f) {
        uw2Var.getClass();
        gtl gtlVar = uw2Var.faceBeauty;
        if (gtlVar != null) {
            gtlVar.updateMakeupStyleValue(str, str2, f);
        }
    }

    /* JADX INFO: renamed from: H */
    public static void m198323H(uw2 uw2Var) {
        uw2Var.getClass();
        voq voqVar = uw2Var.filter;
        if (voqVar != null) {
            voqVar.m202165s2();
        }
    }

    /* JADX INFO: renamed from: I */
    public static void m198324I(uw2 uw2Var, MaskModel maskModel) {
        uw2Var.getClass();
        maskModel.getClass();
        htl htlVar = uw2Var.faceEffect;
        if (htlVar != null) {
            htlVar.mo137086a(maskModel);
        }
    }

    /* JADX INFO: renamed from: J */
    public static void m198325J(uw2 uw2Var, float f, float f2, float f3) {
        uw2Var.getClass();
        htl htlVar = uw2Var.faceEffect;
        if (htlVar != null) {
            htlVar.mo137094m(f, f2, f3);
        }
    }

    /* JADX INFO: renamed from: K */
    public static void m198326K(uw2 uw2Var, aul aulVar) {
        uw2Var.getClass();
        voq voqVar = uw2Var.filter;
        if (voqVar != null) {
            voqVar.m202164q2(aulVar);
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m198327s(uw2 uw2Var, String str) {
        uw2Var.getClass();
        str.getClass();
        htl htlVar = uw2Var.faceEffect;
        if (htlVar != null) {
            htlVar.mo137087b(str);
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m198328t(uw2 uw2Var, InterfaceC4260a interfaceC4260a) {
        uw2Var.getClass();
        interfaceC4260a.getClass();
        htl htlVar = uw2Var.faceEffect;
        if (htlVar != null) {
            htlVar.mo137089d(interfaceC4260a);
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m198329u(uw2 uw2Var, Sticker sticker) {
        uw2Var.getClass();
        sticker.getClass();
        htl htlVar = uw2Var.faceEffect;
        if (htlVar != null) {
            htlVar.mo137095o(sticker);
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m198330v(uw2 uw2Var, int i) {
        uw2Var.getClass();
        gtl gtlVar = uw2Var.faceBeauty;
        if (gtlVar != null) {
            gtlVar.mo132244r(i);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m198331w(uw2 uw2Var, String str) {
        uw2Var.getClass();
        str.getClass();
        htl htlVar = uw2Var.faceEffect;
        if (htlVar != null) {
            htlVar.mo137090e(str);
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m198332x(uw2 uw2Var, boolean z) {
        uw2Var.getClass();
        htl htlVar = uw2Var.faceEffect;
        if (htlVar != null) {
            htlVar.mo137092i(z);
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m198333y(uw2 uw2Var, String str, MaskModel maskModel) {
        uw2Var.getClass();
        str.getClass();
        maskModel.getClass();
        htl htlVar = uw2Var.faceEffect;
        if (htlVar != null) {
            htlVar.mo137091f(str, maskModel);
        }
    }

    /* JADX INFO: renamed from: z */
    public static void m198334z(uw2 uw2Var, String str) {
        uw2Var.getClass();
        gtl gtlVar = uw2Var.faceBeauty;
        if (gtlVar != null) {
            gtlVar.mo132243k(str);
        }
    }

    @Override // p153l.htl
    /* JADX INFO: renamed from: a */
    public void mo137086a(@NotNull final MaskModel maskModel) {
        maskModel.getClass();
        htl htlVar = this.faceEffect;
        if (htlVar == null) {
            this.actionCaches.add(new Runnable() { // from class: l.mw2
                @Override // java.lang.Runnable
                public final void run() {
                    uw2.m198324I(this.f138993a, maskModel);
                }
            });
        } else if (htlVar != null) {
            htlVar.mo137086a(maskModel);
        }
    }

    @Override // p153l.htl
    /* JADX INFO: renamed from: b */
    public void mo137087b(@NotNull final String type) {
        type.getClass();
        htl htlVar = this.faceEffect;
        if (htlVar == null) {
            this.actionCaches.add(new Runnable() { // from class: l.kw2
                @Override // java.lang.Runnable
                public final void run() {
                    uw2.m198327s(this.f129022a, type);
                }
            });
        } else if (htlVar != null) {
            htlVar.mo137087b(type);
        }
    }

    @Override // p153l.htl
    /* JADX INFO: renamed from: c */
    public void mo137088c(@NotNull final MaskModel maskModel) {
        maskModel.getClass();
        htl htlVar = this.faceEffect;
        if (htlVar == null) {
            this.actionCaches.add(new Runnable() { // from class: l.nw2
                @Override // java.lang.Runnable
                public final void run() {
                    uw2.m198320E(this.f143906a, maskModel);
                }
            });
        } else if (htlVar != null) {
            htlVar.mo137088c(maskModel);
        }
    }

    @Override // p153l.htl
    /* JADX INFO: renamed from: d */
    public void mo137089d(@NotNull final InterfaceC4260a surroundMusic) {
        surroundMusic.getClass();
        htl htlVar = this.faceEffect;
        if (htlVar == null) {
            this.actionCaches.add(new Runnable() { // from class: l.bw2
                @Override // java.lang.Runnable
                public final void run() {
                    uw2.m198328t(this.f78675a, surroundMusic);
                }
            });
        } else if (htlVar != null) {
            htlVar.mo137089d(surroundMusic);
        }
    }

    @Override // p153l.kpl
    public void destroy() {
        String string;
        z5m z5mVarMo122372a;
        this.actionCaches.clear();
        MomoPipelineModuleRegister momoPipelineModuleRegister = this.register;
        voq voqVar = this.filter;
        esl eslVar = this.detector;
        if (eslVar == null || (z5mVarMo122372a = eslVar.mo122372a()) == null || (string = z5mVarMo122372a.toString()) == null) {
            string = "";
        }
        momoPipelineModuleRegister.mo21148I(voqVar, string);
        this.filter = null;
    }

    @Override // p153l.htl
    /* JADX INFO: renamed from: e */
    public void mo137090e(@NotNull final String stickerType) {
        stickerType.getClass();
        htl htlVar = this.faceEffect;
        if (htlVar == null) {
            this.actionCaches.add(new Runnable() { // from class: l.hw2
                @Override // java.lang.Runnable
                public final void run() {
                    uw2.m198331w(this.f111860a, stickerType);
                }
            });
        } else if (htlVar != null) {
            htlVar.mo137090e(stickerType);
        }
    }

    @Override // p153l.htl
    /* JADX INFO: renamed from: f */
    public void mo137091f(@NotNull final String type, @NotNull final MaskModel maskModel) {
        type.getClass();
        maskModel.getClass();
        htl htlVar = this.faceEffect;
        if (htlVar == null) {
            this.actionCaches.add(new Runnable() { // from class: l.jw2
                @Override // java.lang.Runnable
                public final void run() {
                    uw2.m198333y(this.f122870a, type, maskModel);
                }
            });
        } else if (htlVar != null) {
            htlVar.mo137091f(type, maskModel);
        }
    }

    @Override // p153l.gtl
    /* JADX INFO: renamed from: g */
    public void mo132241g(@Nullable final String id, @Nullable final String key, final float value) {
        gtl gtlVar = this.faceBeauty;
        if (gtlVar == null) {
            this.actionCaches.add(new Runnable() { // from class: l.pw2
                @Override // java.lang.Runnable
                public final void run() {
                    uw2.m198321F(this.f154361a, id, key, value);
                }
            });
        } else if (gtlVar != null) {
            gtlVar.mo132241g(id, key, value);
        }
    }

    @Override // p153l.gtl
    /* JADX INFO: renamed from: h */
    public void mo132242h(final float intensity) {
        gtl gtlVar = this.faceBeauty;
        if (gtlVar == null) {
            this.actionCaches.add(new Runnable() { // from class: l.tw2
                @Override // java.lang.Runnable
                public final void run() {
                    uw2.m198317B(this.f176369a, intensity);
                }
            });
        } else if (gtlVar != null) {
            gtlVar.mo132242h(intensity);
        }
    }

    @Override // p153l.htl
    /* JADX INFO: renamed from: i */
    public void mo137092i(final boolean enable) {
        htl htlVar = this.faceEffect;
        if (htlVar == null) {
            this.actionCaches.add(new Runnable() { // from class: l.sw2
                @Override // java.lang.Runnable
                public final void run() {
                    uw2.m198332x(this.f170912a, enable);
                }
            });
        } else if (htlVar != null) {
            htlVar.mo137092i(enable);
        }
    }

    @Override // p153l.kpl
    /* JADX INFO: renamed from: j */
    public void mo150742j(@Nullable final aul listener) {
        voq voqVar = this.filter;
        if (voqVar == null) {
            this.actionCaches.add(new Runnable() { // from class: l.rw2
                @Override // java.lang.Runnable
                public final void run() {
                    uw2.m198326K(this.f165094a, listener);
                }
            });
        } else if (voqVar != null) {
            voqVar.m202164q2(listener);
        }
    }

    @Override // p153l.gtl
    /* JADX INFO: renamed from: k */
    public void mo132243k(@Nullable final String path) {
        gtl gtlVar = this.faceBeauty;
        if (gtlVar == null) {
            this.actionCaches.add(new Runnable() { // from class: l.fw2
                @Override // java.lang.Runnable
                public final void run() {
                    uw2.m198334z(this.f101117a, path);
                }
            });
        } else if (gtlVar != null) {
            gtlVar.mo132243k(path);
        }
    }

    @Override // p153l.htl
    /* JADX INFO: renamed from: l */
    public void mo137093l(final int modelType) {
        htl htlVar = this.faceEffect;
        if (htlVar == null) {
            this.actionCaches.add(new Runnable() { // from class: l.lw2
                @Override // java.lang.Runnable
                public final void run() {
                    uw2.m198316A(this.f133769a, modelType);
                }
            });
        } else if (htlVar != null) {
            htlVar.mo137093l(modelType);
        }
    }

    @Override // p153l.htl
    /* JADX INFO: renamed from: m */
    public void mo137094m(final float sharpening, final float saturation, final float contrast) {
        htl htlVar = this.faceEffect;
        if (htlVar == null) {
            this.actionCaches.add(new Runnable() { // from class: l.qw2
                @Override // java.lang.Runnable
                public final void run() {
                    uw2.m198325J(this.f159851a, sharpening, saturation, contrast);
                }
            });
        } else if (htlVar != null) {
            htlVar.mo137094m(sharpening, saturation, contrast);
        }
    }

    @Override // p153l.kpl
    /* JADX INFO: renamed from: n */
    public void mo150743n(@NotNull Context context, @NotNull esl detector, @NotNull ytl listener) {
        context.getClass();
        detector.getClass();
        listener.getClass();
        this.detector = detector;
        voq voqVar = new voq(context, this.register.mo21145F().mo20723z0(), listener);
        this.filter = voqVar;
        this.faceBeauty = new ouf(voqVar);
        voq voqVar2 = this.filter;
        voqVar2.getClass();
        this.faceEffect = new wuf(voqVar2, detector);
        this.register.mo21147H(this.filter);
        float fM112243C0 = csx.m112235R().m112243C0();
        float fM112240B0 = csx.m112235R().m112240B0();
        htl htlVar = this.faceEffect;
        if (htlVar != null) {
            htlVar.mo137092i(true);
        }
        htl htlVar2 = this.faceEffect;
        if (htlVar2 != null) {
            htlVar2.mo137094m(fM112243C0, fM112240B0, 0.0f);
        }
        voq voqVar3 = this.filter;
        voqVar3.getClass();
        detector.mo122375i(voqVar3);
        Iterator<T> it = this.actionCaches.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.actionCaches.clear();
    }

    @Override // p153l.htl
    /* JADX INFO: renamed from: o */
    public void mo137095o(@NotNull final Sticker sticker) {
        sticker.getClass();
        htl htlVar = this.faceEffect;
        if (htlVar == null) {
            this.actionCaches.add(new Runnable() { // from class: l.iw2
                @Override // java.lang.Runnable
                public final void run() {
                    uw2.m198329u(this.f117239a, sticker);
                }
            });
        } else if (htlVar != null) {
            htlVar.mo137095o(sticker);
        }
    }

    @Override // p153l.kpl
    /* JADX INFO: renamed from: p */
    public void mo150744p() {
        voq voqVar = this.filter;
        if (voqVar == null) {
            this.actionCaches.add(new Runnable() { // from class: l.dw2
                @Override // java.lang.Runnable
                public final void run() {
                    uw2.m198323H(this.f90989a);
                }
            });
        } else if (voqVar != null) {
            voqVar.m202165s2();
        }
    }

    @Override // p153l.kpl
    /* JADX INFO: renamed from: q */
    public void mo150745q(final float scaleFactor) {
        voq voqVar = this.filter;
        if (voqVar == null) {
            this.actionCaches.add(new Runnable() { // from class: l.ow2
                @Override // java.lang.Runnable
                public final void run() {
                    uw2.m198318C(this.f149417a, scaleFactor);
                }
            });
        } else if (voqVar != null) {
            voqVar.setWarpScaleFactor(scaleFactor);
        }
    }

    @Override // p153l.gtl
    /* JADX INFO: renamed from: r */
    public void mo132244r(final int type) {
        this.beautyType = type;
        gtl gtlVar = this.faceBeauty;
        if (gtlVar == null) {
            this.actionCaches.add(new Runnable() { // from class: l.ew2
                @Override // java.lang.Runnable
                public final void run() {
                    uw2.m198330v(this.f96067a, type);
                }
            });
        } else if (gtlVar != null) {
            gtlVar.mo132244r(type);
        }
    }

    @Override // p153l.gtl
    public void removeMakeupStyle(@Nullable final String makeupKey, @Nullable final String filterKey) {
        gtl gtlVar = this.faceBeauty;
        if (gtlVar == null) {
            this.actionCaches.add(new Runnable() { // from class: l.cw2
                @Override // java.lang.Runnable
                public final void run() {
                    uw2.m198319D(this.f84086a, makeupKey, filterKey);
                }
            });
        } else if (gtlVar != null) {
            gtlVar.removeMakeupStyle(makeupKey, filterKey);
        }
    }

    @Override // p153l.gtl
    public void updateMakeupStyleValue(@Nullable final String id, @Nullable final String key, final float value) {
        gtl gtlVar = this.faceBeauty;
        if (gtlVar == null) {
            this.actionCaches.add(new Runnable() { // from class: l.gw2
                @Override // java.lang.Runnable
                public final void run() {
                    uw2.m198322G(this.f106721a, id, key, value);
                }
            });
        } else if (gtlVar != null) {
            gtlVar.updateMakeupStyleValue(id, key, value);
        }
    }
}
