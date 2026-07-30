package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveChatMessageContentInfo;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes4.dex */
public class sy4 {

    /* JADX INFO: renamed from: a */
    public final String f166887a;

    /* JADX INFO: renamed from: b */
    public final String f166888b;

    public sy4(String str, String str2) {
        this.f166888b = str;
        this.f166887a = str2;
    }

    /* JADX INFO: renamed from: a */
    public BLiveChatMessageContentInfo m186606a() {
        if (!m186607b()) {
            BLiveChatMessageContentInfo bLiveChatMessageContentInfoNew_ = BLiveChatMessageContentInfo.new_();
            bLiveChatMessageContentInfoNew_.message = this.f166887a;
            return bLiveChatMessageContentInfoNew_;
        }
        try {
            return BLiveChatMessageContentInfo.JSON_ADAPTER.parse(this.f166887a);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return BLiveChatMessageContentInfo.new_();
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m186607b() {
        return TextUtils.equals(this.f166888b, "json");
    }

    /* JADX INFO: renamed from: l.sy4$a */
    public static class C20071a {

        /* JADX INFO: renamed from: a */
        public String f166889a;

        /* JADX INFO: renamed from: b */
        public String f166890b;

        /* JADX INFO: renamed from: c */
        public String f166891c;

        public C20071a(String str) {
            this.f166889a = str;
        }

        /* JADX INFO: renamed from: a */
        public static C20071a m186608a(BLiveChatMessageContentInfo bLiveChatMessageContentInfo) {
            return new C20071a(bLiveChatMessageContentInfo.groupType);
        }

        /* JADX INFO: renamed from: b */
        public String m186609b() {
            return this.f166889a;
        }

        public C20071a() {
        }
    }
}
