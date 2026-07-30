package p153l;

import com.clevertap.android.sdk.Constants;
import com.momo.mcamera.mask.MaskModel;
import com.momo.mcamera.mask.Sticker;
import com.momo.piplinemomoext.input.audio.InterfaceC4260a;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\u00020\r2\u0006\u0010!\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\r2\u0006\u0010!\u001a\u00020\u0019H\u0016¢\u0006\u0004\b$\u0010\u001cJ\u0017\u0010'\u001a\u00020\r2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J'\u0010-\u001a\u00020\r2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020)H\u0016¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010/R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u00100R\"\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0010018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u00102R\u0018\u00105\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u00104¨\u00066"}, m88121d2 = {"Ll/wuf;", "Ll/htl;", "Ll/voq;", "filter", "Ll/esl;", "detector", "<init>", "(Ll/voq;Ll/esl;)V", "Ll/tsl;", BLiveStormDanmakuGiftResourceType.f45294s, "()Ll/tsl;", "Lcom/momo/piplinemomoext/input/audio/a;", "surroundMusic", "", Constants.INAPP_DATA_TAG, "(Lcom/momo/piplinemomoext/input/audio/a;)V", "Lcom/momo/mcamera/mask/MaskModel;", "maskModel", "c", "(Lcom/momo/mcamera/mask/MaskModel;)V", "a", "Lcom/momo/mcamera/mask/Sticker;", "sticker", "o", "(Lcom/momo/mcamera/mask/Sticker;)V", "", "stickerType", "e", "(Ljava/lang/String;)V", "", "modelType", BLiveStormDanmakuGiftResourceType.f45292l, "(I)V", "type", "f", "(Ljava/lang/String;Lcom/momo/mcamera/mask/MaskModel;)V", "b", "", "enable", RXScreenCaptureService.KEY_INDEX, "(Z)V", "", "sharpening", "saturation", "contrast", "m", "(FFF)V", "Ll/voq;", "Ll/esl;", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "gestureEffects", "Ll/tsl;", "proxy", "momomediaext_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class wuf implements htl {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final voq filter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final esl detector;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private ConcurrentHashMap<String, MaskModel> gestureEffects;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private tsl proxy;

    /* JADX INFO: renamed from: l.wuf$a */
    @Metadata(m88120d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\r\u0010\f¨\u0006\u000e"}, m88121d2 = {"l/wuf$a", "Ll/dul;", "", "stickerNumber", "Lcom/momo/mcamera/mask/Sticker;", "removeSticker", "", "a", "(ILcom/momo/mcamera/mask/Sticker;)V", "", "gestureType", "gestureDetected", "(Ljava/lang/String;)V", "onPreGestureAdded", "momomediaext_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class C21184a implements dul {
        public C21184a() {
        }

        @Override // p153l.dul
        /* JADX INFO: renamed from: a */
        public void mo118162a(int stickerNumber, @NotNull Sticker removeSticker) {
            removeSticker.getClass();
            wuf.this.m207949s().mo151030f(removeSticker);
        }

        @Override // p153l.dul
        public void gestureDetected(@Nullable String gestureType) {
            MaskModel maskModel = (MaskModel) wuf.this.gestureEffects.get(gestureType);
            if (maskModel != null) {
                wuf wufVar = wuf.this;
                maskModel.setTriggerType(gestureType);
                wufVar.mo137088c(maskModel);
            }
        }

        @Override // p153l.dul
        public void onPreGestureAdded(@Nullable String gestureType) {
            wuf.m207948r(wuf.this);
        }
    }

    public wuf(@NotNull voq voqVar, @NotNull esl eslVar) {
        voqVar.getClass();
        eslVar.getClass();
        this.filter = voqVar;
        this.detector = eslVar;
        this.gestureEffects = new ConcurrentHashMap<>();
        voqVar.m202166t2(new C21184a());
        voqVar.m202163p2(new ztl() { // from class: l.vuf
            @Override // p153l.ztl
            /* JADX INFO: renamed from: a */
            public final void mo202787a(boolean z) {
                wuf.m207945g(this.f185779a, z);
            }
        });
        this.gestureEffects.clear();
    }

    /* JADX INFO: renamed from: g */
    public static void m207945g(wuf wufVar, boolean z) {
        wufVar.getClass();
        wufVar.detector.mo122374f(0.01f);
        wufVar.detector.mo122378l(0.01f);
        wufVar.detector.mo122373e(z);
    }

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ cul m207948r(wuf wufVar) {
        wufVar.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public final synchronized tsl m207949s() {
        tsl tslVar;
        try {
            if (this.proxy == null) {
                kre kreVar = new kre(this.filter);
                this.proxy = kreVar;
                kreVar.mo151029e(this.detector);
            }
            tslVar = this.proxy;
            tslVar.getClass();
        } catch (Throwable th) {
            throw th;
        }
        return tslVar;
    }

    @Override // p153l.htl
    /* JADX INFO: renamed from: a */
    public void mo137086a(@NotNull MaskModel maskModel) {
        maskModel.getClass();
        b7y.m102882c().m102888g("removeMaskModel === " + maskModel.getFolderPath() + " type === " + maskModel.getModelType());
        m207949s().mo151026a(maskModel);
    }

    @Override // p153l.htl
    /* JADX INFO: renamed from: b */
    public void mo137087b(@NotNull String type) {
        type.getClass();
        this.gestureEffects.remove(type);
        if (this.gestureEffects.isEmpty()) {
            this.filter.stopGestureDetect();
        }
    }

    @Override // p153l.htl
    /* JADX INFO: renamed from: c */
    public void mo137088c(@NotNull MaskModel maskModel) {
        maskModel.getClass();
        b7y.m102882c().m102888g("addMaskModel === " + maskModel.getFolderPath() + " type === " + maskModel.getModelType());
        m207949s().mo151027c(maskModel);
    }

    @Override // p153l.htl
    /* JADX INFO: renamed from: d */
    public void mo137089d(@NotNull InterfaceC4260a surroundMusic) {
        surroundMusic.getClass();
        m207949s().mo151028d(surroundMusic);
    }

    @Override // p153l.htl
    /* JADX INFO: renamed from: e */
    public void mo137090e(@NotNull String stickerType) {
        stickerType.getClass();
        b7y.m102882c().m102888g("removeSticker === " + stickerType);
        this.filter.removeSticker(stickerType);
    }

    @Override // p153l.htl
    /* JADX INFO: renamed from: f */
    public void mo137091f(@NotNull String type, @NotNull MaskModel maskModel) {
        type.getClass();
        maskModel.getClass();
        if (this.gestureEffects.isEmpty()) {
            this.filter.startGestureDetect();
        }
        this.gestureEffects.put(type, maskModel);
    }

    @Override // p153l.htl
    /* JADX INFO: renamed from: i */
    public void mo137092i(boolean enable) {
        this.filter.setDeblurEnable(enable);
    }

    @Override // p153l.htl
    /* JADX INFO: renamed from: l */
    public void mo137093l(int modelType) {
        b7y.m102882c().m102888g("clearMaskWithModelType === " + modelType);
        this.filter.clearMaskWithModelType(modelType);
    }

    @Override // p153l.htl
    /* JADX INFO: renamed from: m */
    public void mo137094m(float sharpening, float saturation, float contrast) {
        this.filter.setDeblurParams(sharpening, saturation, contrast);
    }

    @Override // p153l.htl
    /* JADX INFO: renamed from: o */
    public void mo137095o(@NotNull Sticker sticker) {
        sticker.getClass();
        b7y.m102882c().m102888g("addSticker === " + sticker.getStickerType());
        this.filter.addSticker(sticker);
    }
}
