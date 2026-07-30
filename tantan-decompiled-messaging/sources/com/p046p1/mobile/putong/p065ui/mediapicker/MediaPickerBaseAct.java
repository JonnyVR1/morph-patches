package com.p046p1.mobile.putong.p065ui.mediapicker;

import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Video;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import p149l.iti;
import p149l.nqh0;
import p149l.w9j;

/* JADX INFO: loaded from: classes11.dex */
public class MediaPickerBaseAct extends PutongAct {

    /* JADX INFO: renamed from: h */
    public static String f54603h = "selected_image";

    /* JADX INFO: renamed from: i */
    public static w9j<Picture, File> f54604i = new w9j() { // from class: l.qpx
        @Override // p149l.w9j
        public final Object call(Object obj) {
            return new File(rhi.m179382z(((Picture) obj).url)).getAbsoluteFile().getParentFile();
        }
    };

    /* JADX INFO: renamed from: j */
    public static w9j<Video, File> f54605j = new w9j() { // from class: l.rpx
        @Override // p149l.w9j
        public final Object call(Object obj) {
            return new File(rhi.m179382z(((Video) obj).url)).getAbsoluteFile().getParentFile();
        }
    };

    /* JADX INFO: renamed from: k */
    public static w9j<Media, File> f54606k = new w9j() { // from class: l.spx
        @Override // p149l.w9j
        public final Object call(Object obj) {
            return new File(rhi.m179382z(((Media) obj).url)).getAbsoluteFile().getParentFile();
        }
    };

    /* JADX INFO: renamed from: c */
    public nqh0 f54607c = new nqh0();

    /* JADX INFO: renamed from: d */
    public nqh0 f54608d = new nqh0();

    /* JADX INFO: renamed from: e */
    public nqh0 f54609e = this.f54607c;

    /* JADX INFO: renamed from: f */
    public int f54610f = -1;

    /* JADX INFO: renamed from: g */
    public Map<String, Integer> f54611g = new LinkedHashMap();

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.mediapicker.MediaPickerBaseAct$a */
    public interface InterfaceC13127a {
        /* JADX INFO: renamed from: G */
        int mo47791G();

        /* JADX INFO: renamed from: b */
        void mo47792b(iti itiVar);

        /* JADX INFO: renamed from: x */
        Map<String, Integer> mo47800x();

        /* JADX INFO: renamed from: y */
        void mo47801y(Media media, int i);
    }
}
