package p149l;

import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveState;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class pds {

    /* JADX INFO: renamed from: a */
    public String f148325a;

    /* JADX INFO: renamed from: b */
    public String f148326b;

    /* JADX INFO: renamed from: c */
    public String f148327c;

    /* JADX INFO: renamed from: d */
    public String f148328d;

    /* JADX INFO: renamed from: e */
    public String f148329e;

    /* JADX INFO: renamed from: f */
    public String f148330f;

    /* JADX INFO: renamed from: g */
    public String f148331g;

    /* JADX INFO: renamed from: h */
    public String f148332h;

    /* JADX INFO: renamed from: i */
    public String f148333i;

    /* JADX INFO: renamed from: l.pds$a */
    public static final class C19186a {

        /* JADX INFO: renamed from: a */
        public String f148334a;

        /* JADX INFO: renamed from: b */
        public String f148335b;

        /* JADX INFO: renamed from: c */
        public String f148336c;

        /* JADX INFO: renamed from: d */
        public String f148337d;

        /* JADX INFO: renamed from: e */
        public String f148338e;

        /* JADX INFO: renamed from: f */
        public String f148339f;

        /* JADX INFO: renamed from: g */
        public String f148340g;

        /* JADX INFO: renamed from: h */
        public String f148341h;

        /* JADX INFO: renamed from: i */
        public String f148342i;

        public C19186a() {
            this.f148334a = "";
            this.f148335b = "";
            this.f148336c = "";
            this.f148337d = "";
            this.f148338e = "";
            this.f148339f = "";
            this.f148340g = "";
            this.f148341h = "";
            this.f148342i = "";
        }

        /* JADX INFO: renamed from: a */
        public pds m168403a() {
            pds pdsVar = new pds();
            pdsVar.f148326b = this.f148335b;
            pdsVar.f148325a = this.f148334a;
            pdsVar.f148328d = this.f148337d;
            pdsVar.f148329e = this.f148338e;
            pdsVar.f148332h = this.f148341h;
            pdsVar.f148327c = this.f148336c;
            pdsVar.f148333i = this.f148342i;
            pdsVar.f148330f = this.f148339f;
            pdsVar.f148331g = this.f148340g;
            return pdsVar;
        }

        /* JADX INFO: renamed from: b */
        public C19186a m168404b(String str) {
            this.f148342i = str;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C19186a m168405c(String str) {
            this.f148337d = str;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C19186a m168406d(String str) {
            this.f148338e = str;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C19186a m168407e(BLiveState bLiveState) {
            if (TEnum.equals(bLiveState, "onlive")) {
                this.f148339f = "onLive";
                return this;
            }
            this.f148339f = "endLive";
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C19186a m168408f(String str) {
            this.f148336c = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: k */
    public static C19186a m168401k() {
        return new C19186a();
    }

    /* JADX INFO: renamed from: j */
    public Map<String, Object> m168402j() {
        HashMap map = new HashMap();
        map.put("anchorId", this.f148333i);
        map.put("liveFollow_from", this.f148328d);
        map.put("liveId", this.f148329e);
        map.put("liveStatus", this.f148330f);
        map.put("moment_id", this.f148326b);
        map.put("moment_type", this.f148331g);
        map.put("owner_id", this.f148325a);
        map.put("receiver_user_id", this.f148327c);
        map.put("window_name", this.f148332h);
        return map;
    }
}
