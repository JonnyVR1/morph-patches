package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.core.glcore.util.SegmentHelper;
import com.momo.mcamera.mask.MaskModel;
import com.momo.mcamera.mask.Sticker;
import com.momo.mcamera.mask.segment.ByteDanceSegmentHelper;
import com.momo.mcamera.mask.segment.SegmentFilterFactory;
import com.momo.piplinemomoext.input.audio.InterfaceC4109a;
import com.p046p1.mobile.putong.data.Detect;
import java.util.Iterator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001dR\u0018\u0010 \u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001fR\u0018\u0010\"\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010!R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010#R\u0016\u0010&\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010%¨\u0006'"}, m87232d2 = {"Ll/gqe;", "Ll/hql;", "Ll/h6s$b;", "Ll/wmq;", "filter", "<init>", "(Ll/wmq;)V", "Lcom/momo/mcamera/mask/MaskModel;", "maskModel", "", "c", "(Lcom/momo/mcamera/mask/MaskModel;)V", "a", "Ll/rpl;", Detect.TYPE, "e", "(Ll/rpl;)V", "Lcom/momo/piplinemomoext/input/audio/a;", "surroundMusic", Constants.INAPP_DATA_TAG, "(Lcom/momo/piplinemomoext/input/audio/a;)V", "Lcom/momo/mcamera/mask/Sticker;", "sticker", "f", "(Lcom/momo/mcamera/mask/Sticker;)V", "", "type", "b", "(Ljava/lang/String;)V", "Ll/wmq;", "Ll/h6s;", "Ll/h6s;", "detectorCounter", "Ll/rpl;", "detector", "Lcom/momo/piplinemomoext/input/audio/a;", "", "I", "audioEffectType", "momomediaext_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class gqe implements hql, h6s.InterfaceC17234b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final wmq filter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private h6s detectorCounter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private rpl detector;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private InterfaceC4109a surroundMusic;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int audioEffectType;

    public gqe(@NotNull wmq wmqVar) {
        wmqVar.getClass();
        this.filter = wmqVar;
        h6s h6sVar = new h6s();
        this.detectorCounter = h6sVar;
        h6sVar.m129525e(this);
    }

    @Override // p149l.hql
    /* JADX INFO: renamed from: a */
    public void mo127571a(@NotNull MaskModel maskModel) {
        h6s h6sVar;
        h6s h6sVar2;
        maskModel.getClass();
        if (maskModel.getRealWrapType() > 0 && (h6sVar2 = this.detectorCounter) != null) {
            h6sVar2.m129523b("face_warp");
        }
        if (maskModel.getTriggeringMicEffect() != 0 && (h6sVar = this.detectorCounter) != null) {
            h6sVar.m129523b("audio_effect");
        }
        if (maskModel.isAudioRecord()) {
            this.filter.m204038X();
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
        this.filter.m204039m2(maskModel);
    }

    @Override // p149l.h6s.InterfaceC17234b
    /* JADX INFO: renamed from: b */
    public void mo127572b(@Nullable String type) {
        if (TextUtils.equals(type, "active_face_expression")) {
            rpl rplVar = this.detector;
            if (rplVar != null) {
                rplVar.mo124912k(false);
                return;
            }
            return;
        }
        if (TextUtils.equals(type, "eye_classify")) {
            rpl rplVar2 = this.detector;
            if (rplVar2 != null) {
                rplVar2.mo124918w(false);
                return;
            }
            return;
        }
        if (TextUtils.equals(type, "face_warp")) {
            this.filter.changeFaceWarp(0, 0.0f, 0.0f);
        } else if (TextUtils.equals(type, "audio_effect")) {
            InterfaceC4109a interfaceC4109a = this.surroundMusic;
            if (interfaceC4109a != null) {
                interfaceC4109a.mo20114f0(0);
            }
            this.audioEffectType = 0;
        }
    }

    @Override // p149l.hql
    /* JADX INFO: renamed from: c */
    public void mo127573c(@NotNull MaskModel maskModel) {
        InterfaceC4109a interfaceC4109a;
        maskModel.getClass();
        int realWrapType = maskModel.getRealWrapType();
        if (realWrapType > 0) {
            h6s h6sVar = this.detectorCounter;
            if (h6sVar != null) {
                h6sVar.m129524c("face_warp");
            }
            this.filter.changeFaceWarp(realWrapType, maskModel.getFaceFacialFeatureScale(), maskModel.getFaceScale());
        }
        int triggeringMicEffect = maskModel.getTriggeringMicEffect();
        if (triggeringMicEffect != 0) {
            h6s h6sVar2 = this.detectorCounter;
            if (h6sVar2 != null) {
                h6sVar2.m129524c("audio_effect");
            }
            InterfaceC4109a interfaceC4109a2 = this.surroundMusic;
            if (interfaceC4109a2 == null) {
                this.audioEffectType = triggeringMicEffect;
            } else if (interfaceC4109a2 != null) {
                interfaceC4109a2.mo20114f0(triggeringMicEffect);
            }
        }
        if (maskModel.isAudioRecord()) {
            this.filter.m204037I1();
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
            sticker.setSegmentType(iu2.INSTANCE.m138351a() ? SegmentFilterFactory.BYTEDANCE : "momo");
        }
        if (z && !z2) {
            this.filter.setEnableSound(true);
        }
        if (z3) {
            rpl rplVar = this.detector;
            if (rplVar != null) {
                rplVar.mo124912k(true);
            }
            h6s h6sVar3 = this.detectorCounter;
            if (h6sVar3 != null) {
                h6sVar3.m129524c("active_face_expression");
            }
        }
        if (z4) {
            rpl rplVar2 = this.detector;
            if (rplVar2 != null) {
                rplVar2.mo124918w(true);
            }
            h6s h6sVar4 = this.detectorCounter;
            if (h6sVar4 != null) {
                h6sVar4.m129524c("eye_classify");
            }
        }
        if (z5) {
            if (iu2.INSTANCE.m138351a()) {
                ByteDanceSegmentHelper.setLicensePath(dkw.m112277d(10));
                ByteDanceSegmentHelper.setModelPath(dkw.m112277d(9));
            } else {
                SegmentHelper.setModelPath(dkw.m112277d(4));
            }
        }
        int modelType = maskModel.getModelType();
        wmq wmqVar = this.filter;
        if (modelType != 4) {
            wmqVar.addMaskModel(maskModel);
        } else if (wmqVar.addGestureMaskModel(maskModel.getTriggerType(), maskModel) && z && z2 && (interfaceC4109a = this.surroundMusic) != null) {
            interfaceC4109a.mo20120l0(soundId, soundPath, false, true);
        }
    }

    @Override // p149l.hql
    /* JADX INFO: renamed from: d */
    public void mo127574d(@NotNull InterfaceC4109a surroundMusic) {
        surroundMusic.getClass();
        this.surroundMusic = surroundMusic;
        int i = this.audioEffectType;
        if (i != 0) {
            surroundMusic.mo20114f0(i);
        }
    }

    @Override // p149l.hql
    /* JADX INFO: renamed from: e */
    public void mo127575e(@NotNull rpl detect) {
        detect.getClass();
        this.detector = detect;
    }

    @Override // p149l.hql
    /* JADX INFO: renamed from: f */
    public void mo127576f(@NotNull Sticker sticker) {
        InterfaceC4109a interfaceC4109a;
        h6s h6sVar;
        h6s h6sVar2;
        sticker.getClass();
        if ((sticker.getTriggerFlag() & 4) > 0 && (h6sVar2 = this.detectorCounter) != null) {
            h6sVar2.m129523b("active_face_expression");
        }
        if ((sticker.getTriggerFlag() & 2) > 0 && (h6sVar = this.detectorCounter) != null) {
            h6sVar.m129523b("eye_classify");
        }
        if (TextUtils.isEmpty(sticker.getSoundPath()) || !sticker.getSoundNeedsPublish() || (interfaceC4109a = this.surroundMusic) == null) {
            return;
        }
        interfaceC4109a.mo20096R1(sticker.getSoundId());
    }
}
