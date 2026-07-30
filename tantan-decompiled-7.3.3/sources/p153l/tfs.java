package p153l;

import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveOwner;
import com.p051p1.mobile.putong.live.base.data.BLiveState;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class tfs {

    /* JADX INFO: renamed from: a */
    public String f173990a;

    /* JADX INFO: renamed from: b */
    public String f173991b;

    /* JADX INFO: renamed from: c */
    public String f173992c;

    /* JADX INFO: renamed from: d */
    public String f173993d;

    /* JADX INFO: renamed from: e */
    public String f173994e;

    /* JADX INFO: renamed from: f */
    public String f173995f;

    /* JADX INFO: renamed from: g */
    public String f173996g;

    /* JADX INFO: renamed from: h */
    public String f173997h;

    /* JADX INFO: renamed from: i */
    public String f173998i;

    /* JADX INFO: renamed from: l.tfs$a */
    public static final class C20303a {

        /* JADX INFO: renamed from: a */
        public String f173999a;

        /* JADX INFO: renamed from: b */
        public String f174000b;

        /* JADX INFO: renamed from: c */
        public String f174001c;

        /* JADX INFO: renamed from: d */
        public String f174002d;

        /* JADX INFO: renamed from: e */
        public String f174003e;

        /* JADX INFO: renamed from: f */
        public String f174004f;

        /* JADX INFO: renamed from: g */
        public String f174005g;

        /* JADX INFO: renamed from: h */
        public String f174006h;

        /* JADX INFO: renamed from: i */
        public String f174007i;

        public C20303a() {
            this.f173999a = "";
            this.f174000b = "";
            this.f174001c = "";
            this.f174002d = "";
            this.f174003e = "";
            this.f174004f = "";
            this.f174005g = "";
            this.f174006h = "";
            this.f174007i = "";
        }

        /* JADX INFO: renamed from: a */
        public tfs m190971a() {
            tfs tfsVar = new tfs();
            tfsVar.f173991b = this.f174000b;
            tfsVar.f173990a = this.f173999a;
            tfsVar.f173993d = this.f174002d;
            tfsVar.f173994e = this.f174003e;
            tfsVar.f173997h = this.f174006h;
            tfsVar.f173992c = this.f174001c;
            tfsVar.f173998i = this.f174007i;
            tfsVar.f173995f = this.f174004f;
            tfsVar.f173996g = this.f174005g;
            return tfsVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x001c  */
        /* JADX INFO: renamed from: b */
        public C20303a m190972b(oo2 oo2Var, boolean z) {
            String str;
            C20303a c20303aM190969k = tfs.m190969k();
            BLiveAbsData bLiveAbsDataMo183435j = oo2Var.mo183435j();
            if (bLiveAbsDataMo183435j != null) {
                c20303aM190969k.m190977g(bLiveAbsDataMo183435j.state).m190976f(bLiveAbsDataMo183435j.f45171id);
                BLiveOwner bLiveOwner = bLiveAbsDataMo183435j.anchor;
                if (bLiveOwner != null) {
                    str = bLiveOwner.f45267id;
                } else {
                    str = "";
                }
            } else {
                str = "";
            }
            User userM168532l0 = oo2Var.m168532l0();
            if (userM168532l0 != null) {
                str = userM168532l0.f56859id;
            }
            c20303aM190969k.m190974d(str);
            if (z) {
                c20303aM190969k.m190978h(str);
            }
            return c20303aM190969k;
        }

        /* JADX INFO: renamed from: c */
        public C20303a m190973c(LiveMessage liveMessage, zod zodVar) {
            C20303a c20303aM190975e = tfs.m190969k().m190975e("liveMessage");
            LiveMessage.ExtInfo extInfo = liveMessage.extInfo;
            if (extInfo != null) {
                c20303aM190975e.m190978h(extInfo.followUserId);
            } else {
                c20303aM190975e.m190978h("NA");
            }
            BLiveAbsData bLiveAbsDataM220733a = zodVar.m220733a();
            if (bLiveAbsDataM220733a != null) {
                c20303aM190975e.m190976f(bLiveAbsDataM220733a.f45171id).m190977g(bLiveAbsDataM220733a.state);
                BLiveOwner bLiveOwner = bLiveAbsDataM220733a.anchor;
                if (bLiveOwner != null) {
                    c20303aM190975e.m190974d(bLiveOwner.f45267id);
                }
            }
            return c20303aM190975e;
        }

        /* JADX INFO: renamed from: d */
        public C20303a m190974d(String str) {
            this.f174007i = str;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C20303a m190975e(String str) {
            this.f174002d = str;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C20303a m190976f(String str) {
            this.f174003e = str;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C20303a m190977g(BLiveState bLiveState) {
            if (TEnum.equals(bLiveState, "onlive")) {
                this.f174004f = "onLive";
                return this;
            }
            this.f174004f = "endLive";
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C20303a m190978h(String str) {
            this.f174001c = str;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C20303a m190979i(String str) {
            this.f174006h = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: k */
    public static C20303a m190969k() {
        return new C20303a();
    }

    /* JADX INFO: renamed from: j */
    public Map<String, Object> m190970j() {
        HashMap map = new HashMap();
        map.put("anchorId", this.f173998i);
        map.put("liveFollow_from", this.f173993d);
        map.put("liveId", this.f173994e);
        map.put("liveStatus", this.f173995f);
        map.put("moment_id", this.f173991b);
        map.put("moment_type", this.f173996g);
        map.put("owner_id", this.f173990a);
        map.put("receiver_user_id", this.f173992c);
        map.put("window_name", this.f173997h);
        return map;
    }
}
