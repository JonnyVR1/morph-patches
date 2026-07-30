package com.p051p1.mobile.putong.account.p055ui.mediapicker;

import com.p051p1.mobile.putong.account.AccountBaseAct;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Video;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import p153l.ewi;
import p153l.qcj;
import p153l.uyh0;

/* JADX INFO: loaded from: classes9.dex */
public class AccountMediaPickerBaseAct extends AccountBaseAct {

    /* JADX INFO: renamed from: h */
    public static String f17710h = "selected_image";

    /* JADX INFO: renamed from: i */
    public static qcj<Picture, File> f17711i = new qcj() { // from class: l.ys
        @Override // p153l.qcj
        public final Object call(Object obj) {
            return new File(oki.m168038z(((Picture) obj).url)).getAbsoluteFile().getParentFile();
        }
    };

    /* JADX INFO: renamed from: j */
    public static qcj<Video, File> f17712j = new qcj() { // from class: l.zs
        @Override // p153l.qcj
        public final Object call(Object obj) {
            return new File(oki.m168038z(((Video) obj).url)).getAbsoluteFile().getParentFile();
        }
    };

    /* JADX INFO: renamed from: k */
    public static qcj<Media, File> f17713k = new qcj() { // from class: l.at
        @Override // p153l.qcj
        public final Object call(Object obj) {
            return new File(oki.m168038z(((Media) obj).url)).getAbsoluteFile().getParentFile();
        }
    };

    /* JADX INFO: renamed from: c */
    public uyh0 f17714c = new uyh0();

    /* JADX INFO: renamed from: d */
    public uyh0 f17715d = new uyh0();

    /* JADX INFO: renamed from: e */
    public uyh0 f17716e = this.f17714c;

    /* JADX INFO: renamed from: f */
    public int f17717f = -1;

    /* JADX INFO: renamed from: g */
    public Map<String, Integer> f17718g = new LinkedHashMap();

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.mediapicker.AccountMediaPickerBaseAct$a */
    public interface InterfaceC4822a {
        /* JADX INFO: renamed from: b */
        void mo30166b(ewi ewiVar);
    }
}
