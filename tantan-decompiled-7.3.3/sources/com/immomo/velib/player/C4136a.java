package com.immomo.velib.player;

import android.net.Uri;
import android.text.TextUtils;
import com.immomo.velib.anim.model.Element;
import com.immomo.velib.anim.model.VideoEffectMatchInfo;
import com.immomo.velib.anim.model.VideoEffectModel;
import java.util.List;
import p153l.txl;

/* JADX INFO: renamed from: com.immomo.velib.player.a */
/* JADX INFO: loaded from: classes7.dex */
public class C4136a {

    /* JADX INFO: renamed from: a */
    final Uri f14879a;

    /* JADX INFO: renamed from: b */
    final int f14880b;

    /* JADX INFO: renamed from: c */
    final int f14881c;

    /* JADX INFO: renamed from: d */
    final int f14882d;

    /* JADX INFO: renamed from: e */
    final VideoEffectModel f14883e;

    /* JADX INFO: renamed from: f */
    final List<VideoEffectMatchInfo> f14884f;

    /* JADX INFO: renamed from: g */
    final boolean f14885g;

    /* JADX INFO: renamed from: h */
    final String f14886h;

    /* JADX INFO: renamed from: i */
    final String f14887i;

    /* JADX INFO: renamed from: j */
    final boolean f14888j;

    /* JADX INFO: renamed from: k */
    final int f14889k;

    /* JADX INFO: renamed from: l */
    final int f14890l;

    /* JADX INFO: renamed from: m */
    public final txl f14891m;

    /* JADX INFO: renamed from: com.immomo.velib.player.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private String f14892a;

        /* JADX INFO: renamed from: b */
        private Uri f14893b;

        /* JADX INFO: renamed from: c */
        private int f14894c;

        /* JADX INFO: renamed from: d */
        private int f14895d;

        /* JADX INFO: renamed from: e */
        private int f14896e;

        /* JADX INFO: renamed from: f */
        private VideoEffectModel f14897f;

        /* JADX INFO: renamed from: g */
        private List<VideoEffectMatchInfo> f14898g;

        /* JADX INFO: renamed from: h */
        private boolean f14899h = false;

        /* JADX INFO: renamed from: i */
        private String f14900i = "";

        /* JADX INFO: renamed from: j */
        private String f14901j = "mediump";

        /* JADX INFO: renamed from: k */
        private boolean f14902k = false;

        /* JADX INFO: renamed from: l */
        private int f14903l;

        /* JADX INFO: renamed from: m */
        private int f14904m;

        /* JADX INFO: renamed from: n */
        private txl f14905n;

        /* JADX INFO: renamed from: o */
        public C4136a m20547o() {
            return new C4136a(this);
        }

        /* JADX INFO: renamed from: p */
        public a m20548p(List<VideoEffectMatchInfo> list) {
            this.f14898g = list;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public a m20549q(VideoEffectModel videoEffectModel) {
            this.f14897f = videoEffectModel;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public a m20550r(int i) {
            this.f14894c = i;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public a m20551s(txl txlVar) {
            this.f14905n = txlVar;
            return this;
        }

        /* JADX INFO: renamed from: t */
        public a m20552t(int i, int i2) {
            this.f14895d = i;
            this.f14896e = i2;
            return this;
        }

        /* JADX INFO: renamed from: u */
        public a m20553u(Uri uri) {
            this.f14893b = uri;
            return this;
        }
    }

    public C4136a(a aVar) {
        this.f14880b = aVar.f14894c;
        this.f14881c = aVar.f14895d;
        this.f14882d = aVar.f14896e;
        VideoEffectModel videoEffectModel = aVar.f14897f;
        this.f14883e = videoEffectModel;
        List<VideoEffectMatchInfo> list = aVar.f14898g;
        this.f14884f = list;
        this.f14885g = aVar.f14899h;
        this.f14886h = aVar.f14900i;
        this.f14887i = aVar.f14901j;
        this.f14888j = aVar.f14902k;
        this.f14889k = aVar.f14903l;
        this.f14890l = aVar.f14904m;
        this.f14891m = aVar.f14905n;
        m20530c(videoEffectModel, list);
        if (aVar.f14893b != null) {
            this.f14879a = aVar.f14893b;
            return;
        }
        if (!TextUtils.isEmpty(aVar.f14892a)) {
            this.f14879a = m20532e(aVar.f14892a);
        } else if (videoEffectModel == null || TextUtils.isEmpty(videoEffectModel.getVideoPath())) {
            this.f14879a = null;
        } else {
            this.f14879a = m20532e(videoEffectModel.getVideoPath());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m20528a(VideoEffectModel videoEffectModel, List<VideoEffectMatchInfo> list) {
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
    private void m20529b(VideoEffectModel videoEffectModel, List<VideoEffectMatchInfo> list) {
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
    private void m20530c(VideoEffectModel videoEffectModel, List<VideoEffectMatchInfo> list) {
        if (videoEffectModel == null || list == null || list.isEmpty()) {
            return;
        }
        if (videoEffectModel.getElements() != null) {
            m20528a(videoEffectModel, list);
        } else {
            m20529b(videoEffectModel, list);
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m20531d(C4136a c4136a) {
        if (c4136a == null) {
            return false;
        }
        String str = c4136a.f14887i;
        return "highp".equals(str) || "mediump".equals(str) || "lowp".equals(str);
    }

    /* JADX INFO: renamed from: e */
    private Uri m20532e(String str) {
        return str.startsWith("file://") ? Uri.parse(str) : Uri.parse("file://".concat(str));
    }
}
