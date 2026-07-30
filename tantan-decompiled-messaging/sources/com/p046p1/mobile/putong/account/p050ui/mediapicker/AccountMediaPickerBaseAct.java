package com.p046p1.mobile.putong.account.p050ui.mediapicker;

import com.p046p1.mobile.putong.account.AccountBaseAct;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Video;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import p149l.iti;
import p149l.nqh0;
import p149l.w9j;

/* JADX INFO: loaded from: classes9.dex */
public class AccountMediaPickerBaseAct extends AccountBaseAct {

    /* JADX INFO: renamed from: h */
    public static String f16991h = "selected_image";

    /* JADX INFO: renamed from: i */
    public static w9j<Picture, File> f16992i = new w9j() { // from class: l.et
        @Override // p149l.w9j
        public final Object call(Object obj) {
            return new File(rhi.m179382z(((Picture) obj).url)).getAbsoluteFile().getParentFile();
        }
    };

    /* JADX INFO: renamed from: j */
    public static w9j<Video, File> f16993j = new w9j() { // from class: l.ft
        @Override // p149l.w9j
        public final Object call(Object obj) {
            return new File(rhi.m179382z(((Video) obj).url)).getAbsoluteFile().getParentFile();
        }
    };

    /* JADX INFO: renamed from: k */
    public static w9j<Media, File> f16994k = new w9j() { // from class: l.gt
        @Override // p149l.w9j
        public final Object call(Object obj) {
            return new File(rhi.m179382z(((Media) obj).url)).getAbsoluteFile().getParentFile();
        }
    };

    /* JADX INFO: renamed from: c */
    public nqh0 f16995c = new nqh0();

    /* JADX INFO: renamed from: d */
    public nqh0 f16996d = new nqh0();

    /* JADX INFO: renamed from: e */
    public nqh0 f16997e = this.f16995c;

    /* JADX INFO: renamed from: f */
    public int f16998f = -1;

    /* JADX INFO: renamed from: g */
    public Map<String, Integer> f16999g = new LinkedHashMap();

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.mediapicker.AccountMediaPickerBaseAct$a */
    public interface InterfaceC4671a {
        /* JADX INFO: renamed from: b */
        void mo29168b(iti itiVar);
    }
}
