package p153l;

import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveState;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class qfs {

    /* JADX INFO: renamed from: a */
    public String f157323a;

    /* JADX INFO: renamed from: b */
    public String f157324b;

    /* JADX INFO: renamed from: c */
    public String f157325c;

    /* JADX INFO: renamed from: d */
    public String f157326d;

    /* JADX INFO: renamed from: e */
    public String f157327e;

    /* JADX INFO: renamed from: f */
    public String f157328f;

    /* JADX INFO: renamed from: g */
    public String f157329g;

    /* JADX INFO: renamed from: h */
    public String f157330h;

    /* JADX INFO: renamed from: i */
    public String f157331i;

    /* JADX INFO: renamed from: l.qfs$a */
    public static final class C19565a {

        /* JADX INFO: renamed from: a */
        public String f157332a;

        /* JADX INFO: renamed from: b */
        public String f157333b;

        /* JADX INFO: renamed from: c */
        public String f157334c;

        /* JADX INFO: renamed from: d */
        public String f157335d;

        /* JADX INFO: renamed from: e */
        public String f157336e;

        /* JADX INFO: renamed from: f */
        public String f157337f;

        /* JADX INFO: renamed from: g */
        public String f157338g;

        /* JADX INFO: renamed from: h */
        public String f157339h;

        /* JADX INFO: renamed from: i */
        public String f157340i;

        public C19565a() {
            this.f157332a = "";
            this.f157333b = "";
            this.f157334c = "";
            this.f157335d = "";
            this.f157336e = "";
            this.f157337f = "";
            this.f157338g = "";
            this.f157339h = "";
            this.f157340i = "";
        }

        /* JADX INFO: renamed from: a */
        public qfs m176403a() {
            qfs qfsVar = new qfs();
            qfsVar.f157324b = this.f157333b;
            qfsVar.f157323a = this.f157332a;
            qfsVar.f157326d = this.f157335d;
            qfsVar.f157327e = this.f157336e;
            qfsVar.f157330h = this.f157339h;
            qfsVar.f157325c = this.f157334c;
            qfsVar.f157331i = this.f157340i;
            qfsVar.f157328f = this.f157337f;
            qfsVar.f157329g = this.f157338g;
            return qfsVar;
        }

        /* JADX INFO: renamed from: b */
        public C19565a m176404b(String str) {
            this.f157340i = str;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C19565a m176405c(String str) {
            this.f157335d = str;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C19565a m176406d(String str) {
            this.f157336e = str;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C19565a m176407e(BLiveState bLiveState) {
            if (TEnum.equals(bLiveState, "onlive")) {
                this.f157337f = "onLive";
                return this;
            }
            this.f157337f = "endLive";
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C19565a m176408f(String str) {
            this.f157334c = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: k */
    public static C19565a m176401k() {
        return new C19565a();
    }

    /* JADX INFO: renamed from: j */
    public Map<String, Object> m176402j() {
        HashMap map = new HashMap();
        map.put("anchorId", this.f157331i);
        map.put("liveFollow_from", this.f157326d);
        map.put("liveId", this.f157327e);
        map.put("liveStatus", this.f157328f);
        map.put("moment_id", this.f157324b);
        map.put("moment_type", this.f157329g);
        map.put("owner_id", this.f157323a);
        map.put("receiver_user_id", this.f157325c);
        map.put("window_name", this.f157330h);
        return map;
    }
}
