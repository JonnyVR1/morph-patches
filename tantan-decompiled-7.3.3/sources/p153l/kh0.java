package p153l;

import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.decoration.MediaItemRenderDecoration;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.util.MediaWrapper;

/* JADX INFO: loaded from: classes10.dex */
public class kh0 {

    /* JADX INFO: renamed from: a */
    public final rn20 f126676a;

    /* JADX INFO: renamed from: b */
    public final MediaWrapper f126677b;

    /* JADX INFO: renamed from: c */
    public final int f126678c;

    /* JADX INFO: renamed from: d */
    public final int f126679d;

    /* JADX INFO: renamed from: e */
    public final MediaPickerParamsObject f126680e;

    /* JADX INFO: renamed from: f */
    public final MediaItemRenderDecoration f126681f;

    public kh0(rn20 rn20Var, MediaWrapper mediaWrapper, MediaPickerParamsObject mediaPickerParamsObject, MediaItemRenderDecoration mediaItemRenderDecoration) {
        this.f126676a = rn20Var;
        this.f126677b = mediaWrapper;
        this.f126678c = mediaPickerParamsObject.getMaxImageSelectCount();
        this.f126679d = mediaPickerParamsObject.getMaxVideoSelectCount();
        this.f126680e = mediaPickerParamsObject;
        this.f126681f = mediaItemRenderDecoration;
    }

    /* JADX INFO: renamed from: a */
    public rn20 m149779a() {
        return this.f126676a;
    }

    /* JADX INFO: renamed from: b */
    public int m149780b() {
        return this.f126678c;
    }

    /* JADX INFO: renamed from: c */
    public int m149781c() {
        return this.f126679d;
    }

    /* JADX INFO: renamed from: d */
    public MediaWrapper m149782d() {
        return this.f126677b;
    }
}
