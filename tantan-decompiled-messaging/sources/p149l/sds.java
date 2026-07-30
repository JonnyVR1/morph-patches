package p149l;

import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveOwner;
import com.p046p1.mobile.putong.live.base.data.BLiveState;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class sds {

    /* JADX INFO: renamed from: a */
    public String f163875a;

    /* JADX INFO: renamed from: b */
    public String f163876b;

    /* JADX INFO: renamed from: c */
    public String f163877c;

    /* JADX INFO: renamed from: d */
    public String f163878d;

    /* JADX INFO: renamed from: e */
    public String f163879e;

    /* JADX INFO: renamed from: f */
    public String f163880f;

    /* JADX INFO: renamed from: g */
    public String f163881g;

    /* JADX INFO: renamed from: h */
    public String f163882h;

    /* JADX INFO: renamed from: i */
    public String f163883i;

    /* JADX INFO: renamed from: l.sds$a */
    public static final class C19911a {

        /* JADX INFO: renamed from: a */
        public String f163884a;

        /* JADX INFO: renamed from: b */
        public String f163885b;

        /* JADX INFO: renamed from: c */
        public String f163886c;

        /* JADX INFO: renamed from: d */
        public String f163887d;

        /* JADX INFO: renamed from: e */
        public String f163888e;

        /* JADX INFO: renamed from: f */
        public String f163889f;

        /* JADX INFO: renamed from: g */
        public String f163890g;

        /* JADX INFO: renamed from: h */
        public String f163891h;

        /* JADX INFO: renamed from: i */
        public String f163892i;

        public C19911a() {
            this.f163884a = "";
            this.f163885b = "";
            this.f163886c = "";
            this.f163887d = "";
            this.f163888e = "";
            this.f163889f = "";
            this.f163890g = "";
            this.f163891h = "";
            this.f163892i = "";
        }

        /* JADX INFO: renamed from: a */
        public sds m183542a() {
            sds sdsVar = new sds();
            sdsVar.f163876b = this.f163885b;
            sdsVar.f163875a = this.f163884a;
            sdsVar.f163878d = this.f163887d;
            sdsVar.f163879e = this.f163888e;
            sdsVar.f163882h = this.f163891h;
            sdsVar.f163877c = this.f163886c;
            sdsVar.f163883i = this.f163892i;
            sdsVar.f163880f = this.f163889f;
            sdsVar.f163881g = this.f163890g;
            return sdsVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x001c  */
        /* JADX INFO: renamed from: b */
        public C19911a m183543b(ho2 ho2Var, boolean z) {
            String str;
            C19911a c19911aM183540k = sds.m183540k();
            BLiveAbsData bLiveAbsDataMo149813j = ho2Var.mo149813j();
            if (bLiveAbsDataMo149813j != null) {
                c19911aM183540k.m183548g(bLiveAbsDataMo149813j.state).m183547f(bLiveAbsDataMo149813j.f44323id);
                BLiveOwner bLiveOwner = bLiveAbsDataMo149813j.anchor;
                if (bLiveOwner != null) {
                    str = bLiveOwner.f44419id;
                } else {
                    str = "";
                }
            } else {
                str = "";
            }
            User userM132146l0 = ho2Var.m132146l0();
            if (userM132146l0 != null) {
                str = userM132146l0.f56011id;
            }
            c19911aM183540k.m183545d(str);
            if (z) {
                c19911aM183540k.m183549h(str);
            }
            return c19911aM183540k;
        }

        /* JADX INFO: renamed from: c */
        public C19911a m183544c(LiveMessage liveMessage, und undVar) {
            C19911a c19911aM183546e = sds.m183540k().m183546e("liveMessage");
            LiveMessage.ExtInfo extInfo = liveMessage.extInfo;
            if (extInfo != null) {
                c19911aM183546e.m183549h(extInfo.followUserId);
            } else {
                c19911aM183546e.m183549h("NA");
            }
            BLiveAbsData bLiveAbsDataM194414a = undVar.m194414a();
            if (bLiveAbsDataM194414a != null) {
                c19911aM183546e.m183547f(bLiveAbsDataM194414a.f44323id).m183548g(bLiveAbsDataM194414a.state);
                BLiveOwner bLiveOwner = bLiveAbsDataM194414a.anchor;
                if (bLiveOwner != null) {
                    c19911aM183546e.m183545d(bLiveOwner.f44419id);
                }
            }
            return c19911aM183546e;
        }

        /* JADX INFO: renamed from: d */
        public C19911a m183545d(String str) {
            this.f163892i = str;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C19911a m183546e(String str) {
            this.f163887d = str;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C19911a m183547f(String str) {
            this.f163888e = str;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C19911a m183548g(BLiveState bLiveState) {
            if (TEnum.equals(bLiveState, "onlive")) {
                this.f163889f = "onLive";
                return this;
            }
            this.f163889f = "endLive";
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C19911a m183549h(String str) {
            this.f163886c = str;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C19911a m183550i(String str) {
            this.f163891h = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: k */
    public static C19911a m183540k() {
        return new C19911a();
    }

    /* JADX INFO: renamed from: j */
    public Map<String, Object> m183541j() {
        HashMap map = new HashMap();
        map.put("anchorId", this.f163883i);
        map.put("liveFollow_from", this.f163878d);
        map.put("liveId", this.f163879e);
        map.put("liveStatus", this.f163880f);
        map.put("moment_id", this.f163876b);
        map.put("moment_type", this.f163881g);
        map.put("owner_id", this.f163875a);
        map.put("receiver_user_id", this.f163877c);
        map.put("window_name", this.f163882h);
        return map;
    }
}
