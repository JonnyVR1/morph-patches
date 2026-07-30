package p002l;

import android.text.TextUtils;
import com.p1.mobile.putong.live.base.data.BLiveChatMessageContentInfo;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class sy4 {

    /* JADX INFO: renamed from: a */
    public final String f19331a;

    /* JADX INFO: renamed from: b */
    public final String f19332b;

    public sy4(String str, String str2) {
        this.f19332b = str;
        this.f19331a = str2;
    }

    /* JADX INFO: renamed from: a */
    public BLiveChatMessageContentInfo m22757a() {
        if (!m22758b()) {
            BLiveChatMessageContentInfo bLiveChatMessageContentInfoNew_ = BLiveChatMessageContentInfo.new_();
            bLiveChatMessageContentInfoNew_.message = this.f19331a;
            return bLiveChatMessageContentInfoNew_;
        }
        try {
            return (BLiveChatMessageContentInfo) BLiveChatMessageContentInfo.JSON_ADAPTER.parse(this.f19331a);
        } catch (Exception e) {
            CrashHelper.c(e);
            return BLiveChatMessageContentInfo.new_();
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m22758b() {
        return TextUtils.equals(this.f19332b, "json");
    }

    /* JADX INFO: renamed from: l.sy4$a */
    public static class C0832a {

        /* JADX INFO: renamed from: a */
        public String f19333a;

        /* JADX INFO: renamed from: b */
        public String f19334b;

        /* JADX INFO: renamed from: c */
        public String f19335c;

        public C0832a(String str) {
            this.f19333a = str;
        }

        /* JADX INFO: renamed from: a */
        public static C0832a m22759a(BLiveChatMessageContentInfo bLiveChatMessageContentInfo) {
            return new C0832a(bLiveChatMessageContentInfo.groupType);
        }

        /* JADX INFO: renamed from: b */
        public String m22760b() {
            return this.f19333a;
        }

        public C0832a() {
        }
    }
}
