package p149l;

import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.decoration.MediaItemRenderDecoration;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.util.MediaWrapper;

/* JADX INFO: loaded from: classes11.dex */
public class oh0 {

    /* JADX INFO: renamed from: a */
    public final hf20 f143932a;

    /* JADX INFO: renamed from: b */
    public final MediaWrapper f143933b;

    /* JADX INFO: renamed from: c */
    public final int f143934c;

    /* JADX INFO: renamed from: d */
    public final int f143935d;

    /* JADX INFO: renamed from: e */
    public final MediaPickerParamsObject f143936e;

    /* JADX INFO: renamed from: f */
    public final MediaItemRenderDecoration f143937f;

    public oh0(hf20 hf20Var, MediaWrapper mediaWrapper, MediaPickerParamsObject mediaPickerParamsObject, MediaItemRenderDecoration mediaItemRenderDecoration) {
        this.f143932a = hf20Var;
        this.f143933b = mediaWrapper;
        this.f143934c = mediaPickerParamsObject.getMaxImageSelectCount();
        this.f143935d = mediaPickerParamsObject.getMaxVideoSelectCount();
        this.f143936e = mediaPickerParamsObject;
        this.f143937f = mediaItemRenderDecoration;
    }

    /* JADX INFO: renamed from: a */
    public hf20 m164305a() {
        return this.f143932a;
    }

    /* JADX INFO: renamed from: b */
    public int m164306b() {
        return this.f143934c;
    }

    /* JADX INFO: renamed from: c */
    public int m164307c() {
        return this.f143935d;
    }

    /* JADX INFO: renamed from: d */
    public MediaWrapper m164308d() {
        return this.f143933b;
    }
}
