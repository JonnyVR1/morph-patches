package com.immomo.velib.player;

import android.net.Uri;
import android.text.TextUtils;
import com.immomo.velib.anim.model.Element;
import com.immomo.velib.anim.model.VideoEffectMatchInfo;
import com.immomo.velib.anim.model.VideoEffectModel;
import java.util.List;
import p149l.bvl;

/* JADX INFO: renamed from: com.immomo.velib.player.a */
/* JADX INFO: loaded from: classes7.dex */
public class C3985a {

    /* JADX INFO: renamed from: a */
    final Uri f14160a;

    /* JADX INFO: renamed from: b */
    final int f14161b;

    /* JADX INFO: renamed from: c */
    final int f14162c;

    /* JADX INFO: renamed from: d */
    final int f14163d;

    /* JADX INFO: renamed from: e */
    final VideoEffectModel f14164e;

    /* JADX INFO: renamed from: f */
    final List<VideoEffectMatchInfo> f14165f;

    /* JADX INFO: renamed from: g */
    final boolean f14166g;

    /* JADX INFO: renamed from: h */
    final String f14167h;

    /* JADX INFO: renamed from: i */
    final String f14168i;

    /* JADX INFO: renamed from: j */
    final boolean f14169j;

    /* JADX INFO: renamed from: k */
    final int f14170k;

    /* JADX INFO: renamed from: l */
    final int f14171l;

    /* JADX INFO: renamed from: m */
    public final bvl f14172m;

    /* JADX INFO: renamed from: com.immomo.velib.player.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private String f14173a;

        /* JADX INFO: renamed from: b */
        private Uri f14174b;

        /* JADX INFO: renamed from: c */
        private int f14175c;

        /* JADX INFO: renamed from: d */
        private int f14176d;

        /* JADX INFO: renamed from: e */
        private int f14177e;

        /* JADX INFO: renamed from: f */
        private VideoEffectModel f14178f;

        /* JADX INFO: renamed from: g */
        private List<VideoEffectMatchInfo> f14179g;

        /* JADX INFO: renamed from: h */
        private boolean f14180h = false;

        /* JADX INFO: renamed from: i */
        private String f14181i = "";

        /* JADX INFO: renamed from: j */
        private String f14182j = "mediump";

        /* JADX INFO: renamed from: k */
        private boolean f14183k = false;

        /* JADX INFO: renamed from: l */
        private int f14184l;

        /* JADX INFO: renamed from: m */
        private int f14185m;

        /* JADX INFO: renamed from: n */
        private bvl f14186n;

        /* JADX INFO: renamed from: o */
        public C3985a m19548o() {
            return new C3985a(this);
        }

        /* JADX INFO: renamed from: p */
        public a m19549p(List<VideoEffectMatchInfo> list) {
            this.f14179g = list;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public a m19550q(VideoEffectModel videoEffectModel) {
            this.f14178f = videoEffectModel;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public a m19551r(int i) {
            this.f14175c = i;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public a m19552s(bvl bvlVar) {
            this.f14186n = bvlVar;
            return this;
        }

        /* JADX INFO: renamed from: t */
        public a m19553t(int i, int i2) {
            this.f14176d = i;
            this.f14177e = i2;
            return this;
        }

        /* JADX INFO: renamed from: u */
        public a m19554u(Uri uri) {
            this.f14174b = uri;
            return this;
        }
    }

    public C3985a(a aVar) {
        this.f14161b = aVar.f14175c;
        this.f14162c = aVar.f14176d;
        this.f14163d = aVar.f14177e;
        VideoEffectModel videoEffectModel = aVar.f14178f;
        this.f14164e = videoEffectModel;
        List<VideoEffectMatchInfo> list = aVar.f14179g;
        this.f14165f = list;
        this.f14166g = aVar.f14180h;
        this.f14167h = aVar.f14181i;
        this.f14168i = aVar.f14182j;
        this.f14169j = aVar.f14183k;
        this.f14170k = aVar.f14184l;
        this.f14171l = aVar.f14185m;
        this.f14172m = aVar.f14186n;
        m19531c(videoEffectModel, list);
        if (aVar.f14174b != null) {
            this.f14160a = aVar.f14174b;
            return;
        }
        if (!TextUtils.isEmpty(aVar.f14173a)) {
            this.f14160a = m19533e(aVar.f14173a);
        } else if (videoEffectModel == null || TextUtils.isEmpty(videoEffectModel.getVideoPath())) {
            this.f14160a = null;
        } else {
            this.f14160a = m19533e(videoEffectModel.getVideoPath());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m19529a(VideoEffectModel videoEffectModel, List<VideoEffectMatchInfo> list) {
        for (Element element : videoEffectModel.getElements()) {
            element.setUrl("");
            element.setText("");
            for (VideoEffectMatchInfo videoEffectMatchInfo : list) {
                if (element.getType() == 1) {
                    if (TextUtils.isEmpty(videoEffectMatchInfo.getId()) || TextUtils.equals(videoEffectMatchInfo.getId(), element.getId())) {
                        element.setUrl(videoEffectMatchInfo.getImgId());
                        break;
                    }
                } else {
                    if (element.getType() == 2 && (TextUtils.isEmpty(videoEffectMatchInfo.getId()) || TextUtils.equals(videoEffectMatchInfo.getId(), element.getId()))) {
                        element.setText(videoEffectMatchInfo.getText());
                        break;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private void m19530b(VideoEffectModel videoEffectModel, List<VideoEffectMatchInfo> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        String imgId = "";
        String text = "";
        for (VideoEffectMatchInfo videoEffectMatchInfo : list) {
            if (TextUtils.isEmpty(imgId) && !TextUtils.isEmpty(videoEffectMatchInfo.getImgId())) {
                imgId = videoEffectMatchInfo.getImgId();
            }
            if (TextUtils.isEmpty(text) && !TextUtils.isEmpty(videoEffectMatchInfo.getText())) {
                text = videoEffectMatchInfo.getText();
            }
        }
        if (videoEffectModel.getAvatar() != null) {
            videoEffectModel.getAvatar().setUrl(imgId);
        }
        if (videoEffectModel.getText() != null) {
            videoEffectModel.getText().setText(text);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m19531c(VideoEffectModel videoEffectModel, List<VideoEffectMatchInfo> list) {
        if (videoEffectModel == null || list == null || list.isEmpty()) {
            return;
        }
        if (videoEffectModel.getElements() != null) {
            m19529a(videoEffectModel, list);
        } else {
            m19530b(videoEffectModel, list);
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m19532d(C3985a c3985a) {
        if (c3985a == null) {
            return false;
        }
        String str = c3985a.f14168i;
        return "highp".equals(str) || "mediump".equals(str) || "lowp".equals(str);
    }

    /* JADX INFO: renamed from: e */
    private Uri m19533e(String str) {
        return str.startsWith("file://") ? Uri.parse(str) : Uri.parse("file://".concat(str));
    }
}
