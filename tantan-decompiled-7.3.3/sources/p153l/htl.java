package p153l;

import com.clevertap.android.sdk.Constants;
import com.momo.mcamera.mask.MaskModel;
import com.momo.mcamera.mask.Sticker;
import com.momo.piplinemomoext.input.audio.InterfaceC4260a;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0010H&¢\u0006\u0004\b\u001b\u0010\u0013J\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cH&¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010$\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020 H&¢\u0006\u0004\b$\u0010%¨\u0006&"}, m88121d2 = {"Ll/htl;", "", "Lcom/momo/piplinemomoext/input/audio/a;", "surroundMusic", "", Constants.INAPP_DATA_TAG, "(Lcom/momo/piplinemomoext/input/audio/a;)V", "Lcom/momo/mcamera/mask/MaskModel;", "maskModel", "c", "(Lcom/momo/mcamera/mask/MaskModel;)V", "a", "Lcom/momo/mcamera/mask/Sticker;", "sticker", "o", "(Lcom/momo/mcamera/mask/Sticker;)V", "", "stickerType", "e", "(Ljava/lang/String;)V", "", "modelType", BLiveStormDanmakuGiftResourceType.f45292l, "(I)V", "type", "f", "(Ljava/lang/String;Lcom/momo/mcamera/mask/MaskModel;)V", "b", "", "enable", RXScreenCaptureService.KEY_INDEX, "(Z)V", "", "sharpening", "saturation", "contrast", "m", "(FFF)V", "momomediaext_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public interface htl {
    /* JADX INFO: renamed from: a */
    void mo137086a(@NotNull MaskModel maskModel);

    /* JADX INFO: renamed from: b */
    void mo137087b(@NotNull String type);

    /* JADX INFO: renamed from: c */
    void mo137088c(@NotNull MaskModel maskModel);

    /* JADX INFO: renamed from: d */
    void mo137089d(@NotNull InterfaceC4260a surroundMusic);

    /* JADX INFO: renamed from: e */
    void mo137090e(@NotNull String stickerType);

    /* JADX INFO: renamed from: f */
    void mo137091f(@NotNull String type, @NotNull MaskModel maskModel);

    /* JADX INFO: renamed from: i */
    void mo137092i(boolean enable);

    /* JADX INFO: renamed from: l */
    void mo137093l(int modelType);

    /* JADX INFO: renamed from: m */
    void mo137094m(float sharpening, float saturation, float contrast);

    /* JADX INFO: renamed from: o */
    void mo137095o(@NotNull Sticker sticker);
}
