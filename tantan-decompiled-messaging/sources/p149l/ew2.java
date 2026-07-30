package p149l;

import android.content.Context;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.momo.mcamera.mask.MaskModel;
import com.momo.mcamera.mask.Sticker;
import com.momo.piplinemomoext.input.audio.InterfaceC4109a;
import com.momo.pub.MomoPipelineModuleRegister;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0010J\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010!\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001d2\u0006\u0010 \u001a\u00020\u0014H\u0016¢\u0006\u0004\b!\u0010\"J+\u0010#\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001d2\u0006\u0010 \u001a\u00020\u0014H\u0016¢\u0006\u0004\b#\u0010\"J#\u0010&\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010\u001d2\b\u0010%\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b&\u0010'J\u0019\u0010)\u001a\u00020\f2\b\u0010(\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\f2\u0006\u0010+\u001a\u00020\u0014H\u0016¢\u0006\u0004\b,\u0010\u0017J\u0017\u0010/\u001a\u00020\f2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\f2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\f2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b5\u00104J\u0017\u00108\u001a\u00020\f2\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020\f2\u0006\u0010:\u001a\u00020\u001dH\u0016¢\u0006\u0004\b;\u0010*J\u0017\u0010=\u001a\u00020\f2\u0006\u0010<\u001a\u00020-H\u0016¢\u0006\u0004\b=\u00100J\u001f\u0010>\u001a\u00020\f2\u0006\u0010.\u001a\u00020\u001d2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020\f2\u0006\u0010.\u001a\u00020\u001dH\u0016¢\u0006\u0004\b@\u0010*J\u0017\u0010C\u001a\u00020\f2\u0006\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bC\u0010DJ'\u0010H\u001a\u00020\f2\u0006\u0010E\u001a\u00020\u00142\u0006\u0010F\u001a\u00020\u00142\u0006\u0010G\u001a\u00020\u0014H\u0016¢\u0006\u0004\bH\u0010IR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010JR\u0018\u0010M\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010LR\u0018\u0010P\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010OR\u0018\u0010S\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010RR\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010TR\u0016\u0010V\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010UR\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u00020X0W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010Y¨\u0006["}, m87232d2 = {"Ll/ew2;", "Ll/zml;", "Lcom/momo/pub/MomoPipelineModuleRegister;", "register", "<init>", "(Lcom/momo/pub/MomoPipelineModuleRegister;)V", "Landroid/content/Context;", "context", "Ll/rpl;", "detector", "Ll/lrl;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "n", "(Landroid/content/Context;Ll/rpl;Ll/lrl;)V", "destroy", "()V", "Ll/nrl;", "j", "(Ll/nrl;)V", "", "scaleFactor", "q", "(F)V", "p", "Lcom/momo/piplinemomoext/input/audio/a;", "surroundMusic", Constants.INAPP_DATA_TAG, "(Lcom/momo/piplinemomoext/input/audio/a;)V", "", "id", Constants.KEY_KEY, "value", "g", "(Ljava/lang/String;Ljava/lang/String;F)V", "updateMakeupStyleValue", "makeupKey", "filterKey", "removeMakeupStyle", "(Ljava/lang/String;Ljava/lang/String;)V", "path", "k", "(Ljava/lang/String;)V", "intensity", "h", "", "type", "r", "(I)V", "Lcom/momo/mcamera/mask/MaskModel;", "maskModel", "c", "(Lcom/momo/mcamera/mask/MaskModel;)V", "a", "Lcom/momo/mcamera/mask/Sticker;", "sticker", "o", "(Lcom/momo/mcamera/mask/Sticker;)V", "stickerType", "e", "modelType", BLiveStormDanmakuGiftResourceType.f44444l, "f", "(Ljava/lang/String;Lcom/momo/mcamera/mask/MaskModel;)V", "b", "", "enable", RXScreenCaptureService.KEY_INDEX, "(Z)V", "sharpening", "saturation", "contrast", "m", "(FFF)V", "Lcom/momo/pub/MomoPipelineModuleRegister;", "Ll/wmq;", "Ll/wmq;", "filter", "Ll/tql;", "Ll/tql;", "faceBeauty", "Ll/uql;", "Ll/uql;", "faceEffect", "Ll/rpl;", "I", "beautyType", "Ljava/util/Queue;", "Ljava/lang/Runnable;", "Ljava/util/Queue;", "actionCaches", "momomediaext_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@SourceDebugExtension
public final class ew2 implements zml {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MomoPipelineModuleRegister register;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private wmq filter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private tql faceBeauty;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private uql faceEffect;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private rpl detector;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int beautyType;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Queue<Runnable> actionCaches;

    public ew2(@NotNull MomoPipelineModuleRegister momoPipelineModuleRegister) {
        momoPipelineModuleRegister.getClass();
        this.register = momoPipelineModuleRegister;
        this.beautyType = 2;
        this.actionCaches = new LinkedList();
    }

    /* JADX INFO: renamed from: A */
    public static void m118364A(ew2 ew2Var, int i) {
        ew2Var.getClass();
        uql uqlVar = ew2Var.faceEffect;
        if (uqlVar != null) {
            uqlVar.mo118391l(i);
        }
    }

    /* JADX INFO: renamed from: B */
    public static void m118365B(ew2 ew2Var, float f) {
        ew2Var.getClass();
        tql tqlVar = ew2Var.faceBeauty;
        if (tqlVar != null) {
            tqlVar.mo98795h(f);
        }
    }

    /* JADX INFO: renamed from: C */
    public static void m118366C(ew2 ew2Var, float f) {
        ew2Var.getClass();
        wmq wmqVar = ew2Var.filter;
        if (wmqVar != null) {
            wmqVar.setWarpScaleFactor(f);
        }
    }

    /* JADX INFO: renamed from: D */
    public static void m118367D(ew2 ew2Var, String str, String str2) {
        ew2Var.getClass();
        tql tqlVar = ew2Var.faceBeauty;
        if (tqlVar != null) {
            tqlVar.removeMakeupStyle(str, str2);
        }
    }

    /* JADX INFO: renamed from: E */
    public static void m118368E(ew2 ew2Var, MaskModel maskModel) {
        ew2Var.getClass();
        maskModel.getClass();
        uql uqlVar = ew2Var.faceEffect;
        if (uqlVar != null) {
            uqlVar.mo118385c(maskModel);
        }
    }

    /* JADX INFO: renamed from: F */
    public static void m118369F(ew2 ew2Var, String str, String str2, float f) {
        ew2Var.getClass();
        tql tqlVar = ew2Var.faceBeauty;
        if (tqlVar != null) {
            tqlVar.mo98794g(str, str2, f);
        }
    }

    /* JADX INFO: renamed from: G */
    public static void m118370G(ew2 ew2Var, String str, String str2, float f) {
        ew2Var.getClass();
        tql tqlVar = ew2Var.faceBeauty;
        if (tqlVar != null) {
            tqlVar.updateMakeupStyleValue(str, str2, f);
        }
    }

    /* JADX INFO: renamed from: H */
    public static void m118371H(ew2 ew2Var) {
        ew2Var.getClass();
        wmq wmqVar = ew2Var.filter;
        if (wmqVar != null) {
            wmqVar.m204043s2();
        }
    }

    /* JADX INFO: renamed from: I */
    public static void m118372I(ew2 ew2Var, MaskModel maskModel) {
        ew2Var.getClass();
        maskModel.getClass();
        uql uqlVar = ew2Var.faceEffect;
        if (uqlVar != null) {
            uqlVar.mo118383a(maskModel);
        }
    }

    /* JADX INFO: renamed from: J */
    public static void m118373J(ew2 ew2Var, float f, float f2, float f3) {
        ew2Var.getClass();
        uql uqlVar = ew2Var.faceEffect;
        if (uqlVar != null) {
            uqlVar.mo118392m(f, f2, f3);
        }
    }

    /* JADX INFO: renamed from: K */
    public static void m118374K(ew2 ew2Var, nrl nrlVar) {
        ew2Var.getClass();
        wmq wmqVar = ew2Var.filter;
        if (wmqVar != null) {
            wmqVar.m204042q2(nrlVar);
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m118375s(ew2 ew2Var, String str) {
        ew2Var.getClass();
        str.getClass();
        uql uqlVar = ew2Var.faceEffect;
        if (uqlVar != null) {
            uqlVar.mo118384b(str);
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m118376t(ew2 ew2Var, InterfaceC4109a interfaceC4109a) {
        ew2Var.getClass();
        interfaceC4109a.getClass();
        uql uqlVar = ew2Var.faceEffect;
        if (uqlVar != null) {
            uqlVar.mo118386d(interfaceC4109a);
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m118377u(ew2 ew2Var, Sticker sticker) {
        ew2Var.getClass();
        sticker.getClass();
        uql uqlVar = ew2Var.faceEffect;
        if (uqlVar != null) {
            uqlVar.mo118394o(sticker);
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m118378v(ew2 ew2Var, int i) {
        ew2Var.getClass();
        tql tqlVar = ew2Var.faceBeauty;
        if (tqlVar != null) {
            tqlVar.mo98797r(i);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m118379w(ew2 ew2Var, String str) {
        ew2Var.getClass();
        str.getClass();
        uql uqlVar = ew2Var.faceEffect;
        if (uqlVar != null) {
            uqlVar.mo118387e(str);
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m118380x(ew2 ew2Var, boolean z) {
        ew2Var.getClass();
        uql uqlVar = ew2Var.faceEffect;
        if (uqlVar != null) {
            uqlVar.mo118389i(z);
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m118381y(ew2 ew2Var, String str, MaskModel maskModel) {
        ew2Var.getClass();
        str.getClass();
        maskModel.getClass();
        uql uqlVar = ew2Var.faceEffect;
        if (uqlVar != null) {
            uqlVar.mo118388f(str, maskModel);
        }
    }

    /* JADX INFO: renamed from: z */
    public static void m118382z(ew2 ew2Var, String str) {
        ew2Var.getClass();
        tql tqlVar = ew2Var.faceBeauty;
        if (tqlVar != null) {
            tqlVar.mo98796k(str);
        }
    }

    @Override // p149l.uql
    /* JADX INFO: renamed from: a */
    public void mo118383a(@NotNull final MaskModel maskModel) {
        maskModel.getClass();
        uql uqlVar = this.faceEffect;
        if (uqlVar == null) {
            this.actionCaches.add(new Runnable() { // from class: l.wv2
                @Override // java.lang.Runnable
                public final void run() {
                    ew2.m118372I(this.f188210a, maskModel);
                }
            });
        } else if (uqlVar != null) {
            uqlVar.mo118383a(maskModel);
        }
    }

    @Override // p149l.uql
    /* JADX INFO: renamed from: b */
    public void mo118384b(@NotNull final String type) {
        type.getClass();
        uql uqlVar = this.faceEffect;
        if (uqlVar == null) {
            this.actionCaches.add(new Runnable() { // from class: l.uv2
                @Override // java.lang.Runnable
                public final void run() {
                    ew2.m118375s(this.f178491a, type);
                }
            });
        } else if (uqlVar != null) {
            uqlVar.mo118384b(type);
        }
    }

    @Override // p149l.uql
    /* JADX INFO: renamed from: c */
    public void mo118385c(@NotNull final MaskModel maskModel) {
        maskModel.getClass();
        uql uqlVar = this.faceEffect;
        if (uqlVar == null) {
            this.actionCaches.add(new Runnable() { // from class: l.xv2
                @Override // java.lang.Runnable
                public final void run() {
                    ew2.m118368E(this.f194573a, maskModel);
                }
            });
        } else if (uqlVar != null) {
            uqlVar.mo118385c(maskModel);
        }
    }

    @Override // p149l.uql
    /* JADX INFO: renamed from: d */
    public void mo118386d(@NotNull final InterfaceC4109a surroundMusic) {
        surroundMusic.getClass();
        uql uqlVar = this.faceEffect;
        if (uqlVar == null) {
            this.actionCaches.add(new Runnable() { // from class: l.lv2
                @Override // java.lang.Runnable
                public final void run() {
                    ew2.m118376t(this.f130115a, surroundMusic);
                }
            });
        } else if (uqlVar != null) {
            uqlVar.mo118386d(surroundMusic);
        }
    }

    @Override // p149l.zml
    public void destroy() {
        String string;
        i3m i3mVarMo124896a;
        this.actionCaches.clear();
        MomoPipelineModuleRegister momoPipelineModuleRegister = this.register;
        wmq wmqVar = this.filter;
        rpl rplVar = this.detector;
        if (rplVar == null || (i3mVarMo124896a = rplVar.mo124896a()) == null || (string = i3mVarMo124896a.toString()) == null) {
            string = "";
        }
        momoPipelineModuleRegister.mo20149I(wmqVar, string);
        this.filter = null;
    }

    @Override // p149l.uql
    /* JADX INFO: renamed from: e */
    public void mo118387e(@NotNull final String stickerType) {
        stickerType.getClass();
        uql uqlVar = this.faceEffect;
        if (uqlVar == null) {
            this.actionCaches.add(new Runnable() { // from class: l.rv2
                @Override // java.lang.Runnable
                public final void run() {
                    ew2.m118379w(this.f161155a, stickerType);
                }
            });
        } else if (uqlVar != null) {
            uqlVar.mo118387e(stickerType);
        }
    }

    @Override // p149l.uql
    /* JADX INFO: renamed from: f */
    public void mo118388f(@NotNull final String type, @NotNull final MaskModel maskModel) {
        type.getClass();
        maskModel.getClass();
        uql uqlVar = this.faceEffect;
        if (uqlVar == null) {
            this.actionCaches.add(new Runnable() { // from class: l.tv2
                @Override // java.lang.Runnable
                public final void run() {
                    ew2.m118381y(this.f172242a, type, maskModel);
                }
            });
        } else if (uqlVar != null) {
            uqlVar.mo118388f(type, maskModel);
        }
    }

    @Override // p149l.tql
    /* JADX INFO: renamed from: g */
    public void mo98794g(@Nullable final String id, @Nullable final String key, final float value) {
        tql tqlVar = this.faceBeauty;
        if (tqlVar == null) {
            this.actionCaches.add(new Runnable() { // from class: l.zv2
                @Override // java.lang.Runnable
                public final void run() {
                    ew2.m118369F(this.f204956a, id, key, value);
                }
            });
        } else if (tqlVar != null) {
            tqlVar.mo98794g(id, key, value);
        }
    }

    @Override // p149l.tql
    /* JADX INFO: renamed from: h */
    public void mo98795h(final float intensity) {
        tql tqlVar = this.faceBeauty;
        if (tqlVar == null) {
            this.actionCaches.add(new Runnable() { // from class: l.dw2
                @Override // java.lang.Runnable
                public final void run() {
                    ew2.m118365B(this.f88134a, intensity);
                }
            });
        } else if (tqlVar != null) {
            tqlVar.mo98795h(intensity);
        }
    }

    @Override // p149l.uql
    /* JADX INFO: renamed from: i */
    public void mo118389i(final boolean enable) {
        uql uqlVar = this.faceEffect;
        if (uqlVar == null) {
            this.actionCaches.add(new Runnable() { // from class: l.cw2
                @Override // java.lang.Runnable
                public final void run() {
                    ew2.m118380x(this.f82740a, enable);
                }
            });
        } else if (uqlVar != null) {
            uqlVar.mo118389i(enable);
        }
    }

    @Override // p149l.zml
    /* JADX INFO: renamed from: j */
    public void mo118390j(@Nullable final nrl listener) {
        wmq wmqVar = this.filter;
        if (wmqVar == null) {
            this.actionCaches.add(new Runnable() { // from class: l.bw2
                @Override // java.lang.Runnable
                public final void run() {
                    ew2.m118374K(this.f77575a, listener);
                }
            });
        } else if (wmqVar != null) {
            wmqVar.m204042q2(listener);
        }
    }

    @Override // p149l.tql
    /* JADX INFO: renamed from: k */
    public void mo98796k(@Nullable final String path) {
        tql tqlVar = this.faceBeauty;
        if (tqlVar == null) {
            this.actionCaches.add(new Runnable() { // from class: l.pv2
                @Override // java.lang.Runnable
                public final void run() {
                    ew2.m118382z(this.f151381a, path);
                }
            });
        } else if (tqlVar != null) {
            tqlVar.mo98796k(path);
        }
    }

    @Override // p149l.uql
    /* JADX INFO: renamed from: l */
    public void mo118391l(final int modelType) {
        uql uqlVar = this.faceEffect;
        if (uqlVar == null) {
            this.actionCaches.add(new Runnable() { // from class: l.vv2
                @Override // java.lang.Runnable
                public final void run() {
                    ew2.m118364A(this.f183143a, modelType);
                }
            });
        } else if (uqlVar != null) {
            uqlVar.mo118391l(modelType);
        }
    }

    @Override // p149l.uql
    /* JADX INFO: renamed from: m */
    public void mo118392m(final float sharpening, final float saturation, final float contrast) {
        uql uqlVar = this.faceEffect;
        if (uqlVar == null) {
            this.actionCaches.add(new Runnable() { // from class: l.aw2
                @Override // java.lang.Runnable
                public final void run() {
                    ew2.m118373J(this.f72004a, sharpening, saturation, contrast);
                }
            });
        } else if (uqlVar != null) {
            uqlVar.mo118392m(sharpening, saturation, contrast);
        }
    }

    @Override // p149l.zml
    /* JADX INFO: renamed from: n */
    public void mo118393n(@NotNull Context context, @NotNull rpl detector, @NotNull lrl listener) {
        context.getClass();
        detector.getClass();
        listener.getClass();
        this.detector = detector;
        wmq wmqVar = new wmq(context, this.register.mo20146F().mo19724z0(), listener);
        this.filter = wmqVar;
        this.faceBeauty = new atf(wmqVar);
        wmq wmqVar2 = this.filter;
        wmqVar2.getClass();
        this.faceEffect = new itf(wmqVar2, detector);
        this.register.mo20148H(this.filter);
        float fM121646C0 = fjx.m121638R().m121646C0();
        float fM121643B0 = fjx.m121638R().m121643B0();
        uql uqlVar = this.faceEffect;
        if (uqlVar != null) {
            uqlVar.mo118389i(true);
        }
        uql uqlVar2 = this.faceEffect;
        if (uqlVar2 != null) {
            uqlVar2.mo118392m(fM121646C0, fM121643B0, 0.0f);
        }
        wmq wmqVar3 = this.filter;
        wmqVar3.getClass();
        detector.mo124910i(wmqVar3);
        Iterator<T> it = this.actionCaches.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.actionCaches.clear();
    }

    @Override // p149l.uql
    /* JADX INFO: renamed from: o */
    public void mo118394o(@NotNull final Sticker sticker) {
        sticker.getClass();
        uql uqlVar = this.faceEffect;
        if (uqlVar == null) {
            this.actionCaches.add(new Runnable() { // from class: l.sv2
                @Override // java.lang.Runnable
                public final void run() {
                    ew2.m118377u(this.f166516a, sticker);
                }
            });
        } else if (uqlVar != null) {
            uqlVar.mo118394o(sticker);
        }
    }

    @Override // p149l.zml
    /* JADX INFO: renamed from: p */
    public void mo118395p() {
        wmq wmqVar = this.filter;
        if (wmqVar == null) {
            this.actionCaches.add(new Runnable() { // from class: l.nv2
                @Override // java.lang.Runnable
                public final void run() {
                    ew2.m118371H(this.f140663a);
                }
            });
        } else if (wmqVar != null) {
            wmqVar.m204043s2();
        }
    }

    @Override // p149l.zml
    /* JADX INFO: renamed from: q */
    public void mo118396q(final float scaleFactor) {
        wmq wmqVar = this.filter;
        if (wmqVar == null) {
            this.actionCaches.add(new Runnable() { // from class: l.yv2
                @Override // java.lang.Runnable
                public final void run() {
                    ew2.m118366C(this.f200215a, scaleFactor);
                }
            });
        } else if (wmqVar != null) {
            wmqVar.setWarpScaleFactor(scaleFactor);
        }
    }

    @Override // p149l.tql
    /* JADX INFO: renamed from: r */
    public void mo98797r(final int type) {
        this.beautyType = type;
        tql tqlVar = this.faceBeauty;
        if (tqlVar == null) {
            this.actionCaches.add(new Runnable() { // from class: l.ov2
                @Override // java.lang.Runnable
                public final void run() {
                    ew2.m118378v(this.f145757a, type);
                }
            });
        } else if (tqlVar != null) {
            tqlVar.mo98797r(type);
        }
    }

    @Override // p149l.tql
    public void removeMakeupStyle(@Nullable final String makeupKey, @Nullable final String filterKey) {
        tql tqlVar = this.faceBeauty;
        if (tqlVar == null) {
            this.actionCaches.add(new Runnable() { // from class: l.mv2
                @Override // java.lang.Runnable
                public final void run() {
                    ew2.m118367D(this.f135863a, makeupKey, filterKey);
                }
            });
        } else if (tqlVar != null) {
            tqlVar.removeMakeupStyle(makeupKey, filterKey);
        }
    }

    @Override // p149l.tql
    public void updateMakeupStyleValue(@Nullable final String id, @Nullable final String key, final float value) {
        tql tqlVar = this.faceBeauty;
        if (tqlVar == null) {
            this.actionCaches.add(new Runnable() { // from class: l.qv2
                @Override // java.lang.Runnable
                public final void run() {
                    ew2.m118370G(this.f156570a, id, key, value);
                }
            });
        } else if (tqlVar != null) {
            tqlVar.updateMakeupStyleValue(id, key, value);
        }
    }
}
