package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.core.glcore.util.SegmentHelper;
import com.momo.mcamera.mask.MaskModel;
import com.momo.mcamera.mask.Sticker;
import com.momo.mcamera.mask.segment.ByteDanceSegmentHelper;
import com.momo.mcamera.mask.segment.SegmentFilterFactory;
import com.momo.piplinemomoext.input.audio.InterfaceC4260a;
import com.p051p1.mobile.putong.data.Detect;
import java.util.Iterator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001dR\u0018\u0010 \u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001fR\u0018\u0010\"\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010!R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010#R\u0016\u0010&\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010%¨\u0006'"}, m88121d2 = {"Ll/kre;", "Ll/tsl;", "Ll/i8s$b;", "Ll/voq;", "filter", "<init>", "(Ll/voq;)V", "Lcom/momo/mcamera/mask/MaskModel;", "maskModel", "", "c", "(Lcom/momo/mcamera/mask/MaskModel;)V", "a", "Ll/esl;", Detect.TYPE, "e", "(Ll/esl;)V", "Lcom/momo/piplinemomoext/input/audio/a;", "surroundMusic", Constants.INAPP_DATA_TAG, "(Lcom/momo/piplinemomoext/input/audio/a;)V", "Lcom/momo/mcamera/mask/Sticker;", "sticker", "f", "(Lcom/momo/mcamera/mask/Sticker;)V", "", "type", "b", "(Ljava/lang/String;)V", "Ll/voq;", "Ll/i8s;", "Ll/i8s;", "detectorCounter", "Ll/esl;", "detector", "Lcom/momo/piplinemomoext/input/audio/a;", "", "I", "audioEffectType", "momomediaext_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class kre implements tsl, i8s.InterfaceC17666b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final voq filter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private i8s detectorCounter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private esl detector;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private InterfaceC4260a surroundMusic;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int audioEffectType;

    public kre(@NotNull voq voqVar) {
        voqVar.getClass();
        this.filter = voqVar;
        i8s i8sVar = new i8s();
        this.detectorCounter = i8sVar;
        i8sVar.m139026e(this);
    }

    @Override // p153l.tsl
    /* JADX INFO: renamed from: a */
    public void mo151026a(@NotNull MaskModel maskModel) {
        i8s i8sVar;
        i8s i8sVar2;
        maskModel.getClass();
        if (maskModel.getRealWrapType() > 0 && (i8sVar2 = this.detectorCounter) != null) {
            i8sVar2.m139024b("face_warp");
        }
        if (maskModel.getTriggeringMicEffect() != 0 && (i8sVar = this.detectorCounter) != null) {
            i8sVar.m139024b("audio_effect");
        }
        if (maskModel.isAudioRecord()) {
            this.filter.m202160X();
        }
        boolean z = false;
        if (maskModel.getStickers() != null) {
            Iterator<Sticker> it = maskModel.getStickers().iterator();
            while (it.hasNext()) {
                if (!TextUtils.isEmpty(it.next().getSound())) {
                    z = true;
                }
            }
        }
        if (z) {
            this.filter.releaseSoundPlayer();
        }
        this.filter.clearMaskWithModelType(maskModel.getModelType());
        this.filter.m202161m2(maskModel);
    }

    @Override // p153l.i8s.InterfaceC17666b
    /* JADX INFO: renamed from: b */
    public void mo139027b(@Nullable String type) {
        if (TextUtils.equals(type, "active_face_expression")) {
            esl eslVar = this.detector;
            if (eslVar != null) {
                eslVar.mo122377k(false);
                return;
            }
            return;
        }
        if (TextUtils.equals(type, "eye_classify")) {
            esl eslVar2 = this.detector;
            if (eslVar2 != null) {
                eslVar2.mo122381w(false);
                return;
            }
            return;
        }
        if (TextUtils.equals(type, "face_warp")) {
            this.filter.changeFaceWarp(0, 0.0f, 0.0f);
        } else if (TextUtils.equals(type, "audio_effect")) {
            InterfaceC4260a interfaceC4260a = this.surroundMusic;
            if (interfaceC4260a != null) {
                interfaceC4260a.mo21113f0(0);
            }
            this.audioEffectType = 0;
        }
    }

    @Override // p153l.tsl
    /* JADX INFO: renamed from: c */
    public void mo151027c(@NotNull MaskModel maskModel) {
        InterfaceC4260a interfaceC4260a;
        maskModel.getClass();
        int realWrapType = maskModel.getRealWrapType();
        if (realWrapType > 0) {
            i8s i8sVar = this.detectorCounter;
            if (i8sVar != null) {
                i8sVar.m139025c("face_warp");
            }
            this.filter.changeFaceWarp(realWrapType, maskModel.getFaceFacialFeatureScale(), maskModel.getFaceScale());
        }
        int triggeringMicEffect = maskModel.getTriggeringMicEffect();
        if (triggeringMicEffect != 0) {
            i8s i8sVar2 = this.detectorCounter;
            if (i8sVar2 != null) {
                i8sVar2.m139025c("audio_effect");
            }
            InterfaceC4260a interfaceC4260a2 = this.surroundMusic;
            if (interfaceC4260a2 == null) {
                this.audioEffectType = triggeringMicEffect;
            } else if (interfaceC4260a2 != null) {
                interfaceC4260a2.mo21113f0(triggeringMicEffect);
            }
        }
        if (maskModel.isAudioRecord()) {
            this.filter.m202159I1();
        }
        String soundPath = "";
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        int soundId = 0;
        for (Sticker sticker : maskModel.getStickers()) {
            int triggerType = sticker.getTriggerType();
            if (triggerType == 8 || triggerType == 16 || triggerType == 64 || triggerType == 128 || triggerType == 256) {
                sticker.updateTriggerFlag(2);
                z4 = true;
            } else if (triggerType == 512 || triggerType == 1024) {
                sticker.updateTriggerFlag(4);
                z3 = true;
            }
            if (sticker.isClearsBodyArea()) {
                z5 = true;
            }
            if (!TextUtils.isEmpty(sticker.getSound())) {
                soundPath = sticker.getSoundPath();
                soundPath.getClass();
                soundId = sticker.getSoundId();
                z = true;
            }
            if (sticker.getSoundNeedsPublish()) {
                z2 = true;
            }
            sticker.setSegmentType(yu2.INSTANCE.m217354a() ? SegmentFilterFactory.BYTEDANCE : "momo");
        }
        if (z && !z2) {
            this.filter.setEnableSound(true);
        }
        if (z3) {
            esl eslVar = this.detector;
            if (eslVar != null) {
                eslVar.mo122377k(true);
            }
            i8s i8sVar3 = this.detectorCounter;
            if (i8sVar3 != null) {
                i8sVar3.m139025c("active_face_expression");
            }
        }
        if (z4) {
            esl eslVar2 = this.detector;
            if (eslVar2 != null) {
                eslVar2.mo122381w(true);
            }
            i8s i8sVar4 = this.detectorCounter;
            if (i8sVar4 != null) {
                i8sVar4.m139025c("eye_classify");
            }
        }
        if (z5) {
            if (yu2.INSTANCE.m217354a()) {
                ByteDanceSegmentHelper.setLicensePath(cnw.m111545d(10));
                ByteDanceSegmentHelper.setModelPath(cnw.m111545d(9));
            } else {
                SegmentHelper.setModelPath(cnw.m111545d(4));
            }
        }
        int modelType = maskModel.getModelType();
        voq voqVar = this.filter;
        if (modelType != 4) {
            voqVar.addMaskModel(maskModel);
        } else if (voqVar.addGestureMaskModel(maskModel.getTriggerType(), maskModel) && z && z2 && (interfaceC4260a = this.surroundMusic) != null) {
            interfaceC4260a.mo21119l0(soundId, soundPath, false, true);
        }
    }

    @Override // p153l.tsl
    /* JADX INFO: renamed from: d */
    public void mo151028d(@NotNull InterfaceC4260a surroundMusic) {
        surroundMusic.getClass();
        this.surroundMusic = surroundMusic;
        int i = this.audioEffectType;
        if (i != 0) {
            surroundMusic.mo21113f0(i);
        }
    }

    @Override // p153l.tsl
    /* JADX INFO: renamed from: e */
    public void mo151029e(@NotNull esl detect) {
        detect.getClass();
        this.detector = detect;
    }

    @Override // p153l.tsl
    /* JADX INFO: renamed from: f */
    public void mo151030f(@NotNull Sticker sticker) {
        InterfaceC4260a interfaceC4260a;
        i8s i8sVar;
        i8s i8sVar2;
        sticker.getClass();
        if ((sticker.getTriggerFlag() & 4) > 0 && (i8sVar2 = this.detectorCounter) != null) {
            i8sVar2.m139024b("active_face_expression");
        }
        if ((sticker.getTriggerFlag() & 2) > 0 && (i8sVar = this.detectorCounter) != null) {
            i8sVar.m139024b("eye_classify");
        }
        if (TextUtils.isEmpty(sticker.getSoundPath()) || !sticker.getSoundNeedsPublish() || (interfaceC4260a = this.surroundMusic) == null) {
            return;
        }
        interfaceC4260a.mo21095R1(sticker.getSoundId());
    }
}
