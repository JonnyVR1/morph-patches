package p149l;

import com.clevertap.android.sdk.Constants;
import com.momo.mcamera.mask.MaskModel;
import com.momo.mcamera.mask.Sticker;
import com.momo.piplinemomoext.input.audio.InterfaceC4109a;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\u00020\r2\u0006\u0010!\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\r2\u0006\u0010!\u001a\u00020\u0019H\u0016¢\u0006\u0004\b$\u0010\u001cJ\u0017\u0010'\u001a\u00020\r2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J'\u0010-\u001a\u00020\r2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020)H\u0016¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010/R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u00100R\"\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0010018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u00102R\u0018\u00105\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u00104¨\u00066"}, m87232d2 = {"Ll/itf;", "Ll/uql;", "Ll/wmq;", "filter", "Ll/rpl;", "detector", "<init>", "(Ll/wmq;Ll/rpl;)V", "Ll/hql;", BLiveStormDanmakuGiftResourceType.f44446s, "()Ll/hql;", "Lcom/momo/piplinemomoext/input/audio/a;", "surroundMusic", "", Constants.INAPP_DATA_TAG, "(Lcom/momo/piplinemomoext/input/audio/a;)V", "Lcom/momo/mcamera/mask/MaskModel;", "maskModel", "c", "(Lcom/momo/mcamera/mask/MaskModel;)V", "a", "Lcom/momo/mcamera/mask/Sticker;", "sticker", "o", "(Lcom/momo/mcamera/mask/Sticker;)V", "", "stickerType", "e", "(Ljava/lang/String;)V", "", "modelType", BLiveStormDanmakuGiftResourceType.f44444l, "(I)V", "type", "f", "(Ljava/lang/String;Lcom/momo/mcamera/mask/MaskModel;)V", "b", "", "enable", RXScreenCaptureService.KEY_INDEX, "(Z)V", "", "sharpening", "saturation", "contrast", "m", "(FFF)V", "Ll/wmq;", "Ll/rpl;", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "gestureEffects", "Ll/hql;", "proxy", "momomediaext_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class itf implements uql {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final wmq filter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final rpl detector;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private ConcurrentHashMap<String, MaskModel> gestureEffects;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private hql proxy;

    /* JADX INFO: renamed from: l.itf$a */
    @Metadata(m87231d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\r\u0010\f¨\u0006\u000e"}, m87232d2 = {"l/itf$a", "Ll/qrl;", "", "stickerNumber", "Lcom/momo/mcamera/mask/Sticker;", "removeSticker", "", "a", "(ILcom/momo/mcamera/mask/Sticker;)V", "", "gestureType", "gestureDetected", "(Ljava/lang/String;)V", "onPreGestureAdded", "momomediaext_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class C17616a implements qrl {
        public C17616a() {
        }

        @Override // p149l.qrl
        /* JADX INFO: renamed from: a */
        public void mo138198a(int stickerNumber, @NotNull Sticker removeSticker) {
            removeSticker.getClass();
            itf.this.m138197s().mo127576f(removeSticker);
        }

        @Override // p149l.qrl
        public void gestureDetected(@Nullable String gestureType) {
            MaskModel maskModel = (MaskModel) itf.this.gestureEffects.get(gestureType);
            if (maskModel != null) {
                itf itfVar = itf.this;
                maskModel.setTriggerType(gestureType);
                itfVar.mo118385c(maskModel);
            }
        }

        @Override // p149l.qrl
        public void onPreGestureAdded(@Nullable String gestureType) {
            itf.m138196r(itf.this);
        }
    }

    public itf(@NotNull wmq wmqVar, @NotNull rpl rplVar) {
        wmqVar.getClass();
        rplVar.getClass();
        this.filter = wmqVar;
        this.detector = rplVar;
        this.gestureEffects = new ConcurrentHashMap<>();
        wmqVar.m204044t2(new C17616a());
        wmqVar.m204041p2(new mrl() { // from class: l.htf
            @Override // p149l.mrl
            /* JADX INFO: renamed from: a */
            public final void mo132864a(boolean z) {
                itf.m138193g(this.f109389a, z);
            }
        });
        this.gestureEffects.clear();
    }

    /* JADX INFO: renamed from: g */
    public static void m138193g(itf itfVar, boolean z) {
        itfVar.getClass();
        itfVar.detector.mo124906f(0.01f);
        itfVar.detector.mo124913l(0.01f);
        itfVar.detector.mo124904e(z);
    }

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ prl m138196r(itf itfVar) {
        itfVar.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public final synchronized hql m138197s() {
        hql hqlVar;
        try {
            if (this.proxy == null) {
                gqe gqeVar = new gqe(this.filter);
                this.proxy = gqeVar;
                gqeVar.mo127575e(this.detector);
            }
            hqlVar = this.proxy;
            hqlVar.getClass();
        } catch (Throwable th) {
            throw th;
        }
        return hqlVar;
    }

    @Override // p149l.uql
    /* JADX INFO: renamed from: a */
    public void mo118383a(@NotNull MaskModel maskModel) {
        maskModel.getClass();
        eyx.m118802c().m118808g("removeMaskModel === " + maskModel.getFolderPath() + " type === " + maskModel.getModelType());
        m138197s().mo127571a(maskModel);
    }

    @Override // p149l.uql
    /* JADX INFO: renamed from: b */
    public void mo118384b(@NotNull String type) {
        type.getClass();
        this.gestureEffects.remove(type);
        if (this.gestureEffects.isEmpty()) {
            this.filter.stopGestureDetect();
        }
    }

    @Override // p149l.uql
    /* JADX INFO: renamed from: c */
    public void mo118385c(@NotNull MaskModel maskModel) {
        maskModel.getClass();
        eyx.m118802c().m118808g("addMaskModel === " + maskModel.getFolderPath() + " type === " + maskModel.getModelType());
        m138197s().mo127573c(maskModel);
    }

    @Override // p149l.uql
    /* JADX INFO: renamed from: d */
    public void mo118386d(@NotNull InterfaceC4109a surroundMusic) {
        surroundMusic.getClass();
        m138197s().mo127574d(surroundMusic);
    }

    @Override // p149l.uql
    /* JADX INFO: renamed from: e */
    public void mo118387e(@NotNull String stickerType) {
        stickerType.getClass();
        eyx.m118802c().m118808g("removeSticker === " + stickerType);
        this.filter.removeSticker(stickerType);
    }

    @Override // p149l.uql
    /* JADX INFO: renamed from: f */
    public void mo118388f(@NotNull String type, @NotNull MaskModel maskModel) {
        type.getClass();
        maskModel.getClass();
        if (this.gestureEffects.isEmpty()) {
            this.filter.startGestureDetect();
        }
        this.gestureEffects.put(type, maskModel);
    }

    @Override // p149l.uql
    /* JADX INFO: renamed from: i */
    public void mo118389i(boolean enable) {
        this.filter.setDeblurEnable(enable);
    }

    @Override // p149l.uql
    /* JADX INFO: renamed from: l */
    public void mo118391l(int modelType) {
        eyx.m118802c().m118808g("clearMaskWithModelType === " + modelType);
        this.filter.clearMaskWithModelType(modelType);
    }

    @Override // p149l.uql
    /* JADX INFO: renamed from: m */
    public void mo118392m(float sharpening, float saturation, float contrast) {
        this.filter.setDeblurParams(sharpening, saturation, contrast);
    }

    @Override // p149l.uql
    /* JADX INFO: renamed from: o */
    public void mo118394o(@NotNull Sticker sticker) {
        sticker.getClass();
        eyx.m118802c().m118808g("addSticker === " + sticker.getStickerType());
        this.filter.addSticker(sticker);
    }
}
