package com.p000p1.mobile.putong.account.p002ui.mediapicker;

import com.p000p1.mobile.putong.account.AccountBaseAct;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.Video;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import l.iti;
import l.nqh0;
import l.rhi;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AccountMediaPickerBaseAct extends AccountBaseAct {

    /* JADX INFO: renamed from: h */
    public static String f980h = "selected_image";

    /* JADX INFO: renamed from: i */
    public static w9j<Picture, File> f981i = new w9j() { // from class: l.et
        public final Object call(Object obj) {
            return new File(rhi.z(((Media) ((Picture) obj)).url)).getAbsoluteFile().getParentFile();
        }
    };

    /* JADX INFO: renamed from: j */
    public static w9j<Video, File> f982j = new w9j() { // from class: l.ft
        public final Object call(Object obj) {
            return new File(rhi.z(((Media) ((Video) obj)).url)).getAbsoluteFile().getParentFile();
        }
    };

    /* JADX INFO: renamed from: k */
    public static w9j<Media, File> f983k = new w9j() { // from class: l.gt
        public final Object call(Object obj) {
            return new File(rhi.z(((Media) obj).url)).getAbsoluteFile().getParentFile();
        }
    };

    /* JADX INFO: renamed from: c */
    public nqh0 f984c = new nqh0();

    /* JADX INFO: renamed from: d */
    public nqh0 f985d = new nqh0();

    /* JADX INFO: renamed from: e */
    public nqh0 f986e = this.f984c;

    /* JADX INFO: renamed from: f */
    public int f987f = -1;

    /* JADX INFO: renamed from: g */
    public Map<String, Integer> f988g = new LinkedHashMap();

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.mediapicker.AccountMediaPickerBaseAct$a */
    public interface InterfaceC0097a {
        /* JADX INFO: renamed from: b */
        void mo1074b(iti itiVar);
    }
}
