package com.p051p1.mobile.putong.p070ui.mediapicker;

import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Video;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import p153l.ewi;
import p153l.qcj;
import p153l.uyh0;

/* JADX INFO: loaded from: classes10.dex */
public class MediaPickerBaseAct extends PutongAct {

    /* JADX INFO: renamed from: h */
    public static String f55451h = "selected_image";

    /* JADX INFO: renamed from: i */
    public static qcj<Picture, File> f55452i = new qcj() { // from class: l.nyx
        @Override // p153l.qcj
        public final Object call(Object obj) {
            return new File(oki.m168038z(((Picture) obj).url)).getAbsoluteFile().getParentFile();
        }
    };

    /* JADX INFO: renamed from: j */
    public static qcj<Video, File> f55453j = new qcj() { // from class: l.oyx
        @Override // p153l.qcj
        public final Object call(Object obj) {
            return new File(oki.m168038z(((Video) obj).url)).getAbsoluteFile().getParentFile();
        }
    };

    /* JADX INFO: renamed from: k */
    public static qcj<Media, File> f55454k = new qcj() { // from class: l.pyx
        @Override // p153l.qcj
        public final Object call(Object obj) {
            return new File(oki.m168038z(((Media) obj).url)).getAbsoluteFile().getParentFile();
        }
    };

    /* JADX INFO: renamed from: c */
    public uyh0 f55455c = new uyh0();

    /* JADX INFO: renamed from: d */
    public uyh0 f55456d = new uyh0();

    /* JADX INFO: renamed from: e */
    public uyh0 f55457e = this.f55455c;

    /* JADX INFO: renamed from: f */
    public int f55458f = -1;

    /* JADX INFO: renamed from: g */
    public Map<String, Integer> f55459g = new LinkedHashMap();

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.mediapicker.MediaPickerBaseAct$a */
    public interface InterfaceC13290a {
        /* JADX INFO: renamed from: H */
        int mo48974H();

        /* JADX INFO: renamed from: b */
        void mo48975b(ewi ewiVar);

        /* JADX INFO: renamed from: x */
        Map<String, Integer> mo48983x();

        /* JADX INFO: renamed from: y */
        void mo48984y(Media media, int i);
    }
}
