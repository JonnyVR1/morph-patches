package com.p000p1.mobile.putong.p004ui.mediapicker;

import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.Video;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import l.rhi;
import l.w9j;
import p009l.iti;
import p009l.nqh0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class MediaPickerBaseAct extends PutongAct {

    /* JADX INFO: renamed from: h */
    public static String f8209h = "selected_image";

    /* JADX INFO: renamed from: i */
    public static w9j<Picture, File> f8210i = new w9j() { // from class: l.qpx
        public final Object call(Object obj) {
            return new File(rhi.z(((Media) ((Picture) obj)).url)).getAbsoluteFile().getParentFile();
        }
    };

    /* JADX INFO: renamed from: j */
    public static w9j<Video, File> f8211j = new w9j() { // from class: l.rpx
        public final Object call(Object obj) {
            return new File(rhi.z(((Media) ((Video) obj)).url)).getAbsoluteFile().getParentFile();
        }
    };

    /* JADX INFO: renamed from: k */
    public static w9j<Media, File> f8212k = new w9j() { // from class: l.spx
        public final Object call(Object obj) {
            return new File(rhi.z(((Media) obj).url)).getAbsoluteFile().getParentFile();
        }
    };

    /* JADX INFO: renamed from: c */
    public nqh0 f8213c = new nqh0();

    /* JADX INFO: renamed from: d */
    public nqh0 f8214d = new nqh0();

    /* JADX INFO: renamed from: e */
    public nqh0 f8215e = this.f8213c;

    /* JADX INFO: renamed from: f */
    public int f8216f = -1;

    /* JADX INFO: renamed from: g */
    public Map<String, Integer> f8217g = new LinkedHashMap();

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.mediapicker.MediaPickerBaseAct$a */
    public interface InterfaceC0529a {
        /* JADX INFO: renamed from: G */
        int m10198G();

        /* JADX INFO: renamed from: b */
        void m10199b(iti itiVar);

        /* JADX INFO: renamed from: x */
        Map<String, Integer> m10200x();

        /* JADX INFO: renamed from: y */
        void m10201y(Media media, int i);
    }
}
