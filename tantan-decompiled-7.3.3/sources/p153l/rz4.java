package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveChatMessageContentInfo;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes4.dex */
public class rz4 {

    /* JADX INFO: renamed from: a */
    public final String f165483a;

    /* JADX INFO: renamed from: b */
    public final String f165484b;

    public rz4(String str, String str2) {
        this.f165484b = str;
        this.f165483a = str2;
    }

    /* JADX INFO: renamed from: a */
    public BLiveChatMessageContentInfo m183688a() {
        if (!m183689b()) {
            BLiveChatMessageContentInfo bLiveChatMessageContentInfoNew_ = BLiveChatMessageContentInfo.new_();
            bLiveChatMessageContentInfoNew_.message = this.f165483a;
            return bLiveChatMessageContentInfoNew_;
        }
        try {
            return BLiveChatMessageContentInfo.JSON_ADAPTER.parse(this.f165483a);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return BLiveChatMessageContentInfo.new_();
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m183689b() {
        return TextUtils.equals(this.f165484b, "json");
    }

    /* JADX INFO: renamed from: l.rz4$a */
    public static class C19938a {

        /* JADX INFO: renamed from: a */
        public String f165485a;

        /* JADX INFO: renamed from: b */
        public String f165486b;

        /* JADX INFO: renamed from: c */
        public String f165487c;

        public C19938a(String str) {
            this.f165485a = str;
        }

        /* JADX INFO: renamed from: a */
        public static C19938a m183690a(BLiveChatMessageContentInfo bLiveChatMessageContentInfo) {
            return new C19938a(bLiveChatMessageContentInfo.groupType);
        }

        /* JADX INFO: renamed from: b */
        public String m183691b() {
            return this.f165485a;
        }

        public C19938a() {
        }
    }
}
