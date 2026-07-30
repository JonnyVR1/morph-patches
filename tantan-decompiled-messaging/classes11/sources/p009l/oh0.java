package p009l;

import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.decoration.MediaItemRenderDecoration;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.util.MediaWrapper;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class oh0 {

    /* JADX INFO: renamed from: a */
    public final hf20 f18038a;

    /* JADX INFO: renamed from: b */
    public final MediaWrapper f18039b;

    /* JADX INFO: renamed from: c */
    public final int f18040c;

    /* JADX INFO: renamed from: d */
    public final int f18041d;

    /* JADX INFO: renamed from: e */
    public final MediaPickerParamsObject f18042e;

    /* JADX INFO: renamed from: f */
    public final MediaItemRenderDecoration f18043f;

    public oh0(hf20 hf20Var, MediaWrapper mediaWrapper, MediaPickerParamsObject mediaPickerParamsObject, MediaItemRenderDecoration mediaItemRenderDecoration) {
        this.f18038a = hf20Var;
        this.f18039b = mediaWrapper;
        this.f18040c = mediaPickerParamsObject.getMaxImageSelectCount();
        this.f18041d = mediaPickerParamsObject.getMaxVideoSelectCount();
        this.f18042e = mediaPickerParamsObject;
        this.f18043f = mediaItemRenderDecoration;
    }

    /* JADX INFO: renamed from: a */
    public hf20 m19760a() {
        return this.f18038a;
    }

    /* JADX INFO: renamed from: b */
    public int m19761b() {
        return this.f18040c;
    }

    /* JADX INFO: renamed from: c */
    public int m19762c() {
        return this.f18041d;
    }

    /* JADX INFO: renamed from: d */
    public MediaWrapper m19763d() {
        return this.f18039b;
    }
}
