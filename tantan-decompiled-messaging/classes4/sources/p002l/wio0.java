package p002l;

import android.text.TextUtils;
import com.p1.mobile.putong.data.Pagination;
import com.p1.mobile.putong.live.base.data.BLiveVoiceTopic;
import l.g6n0;
import l.r0v;
import l.r8d0;
import l.vb20;
import l.wq2;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class wio0 {

    /* JADX INFO: renamed from: a */
    public final String f21792a;

    /* JADX INFO: renamed from: b */
    public final String f21793b;

    /* JADX INFO: renamed from: c */
    public String f21794c;

    public wio0(String str, String str2) {
        this.f21793b = str;
        this.f21792a = str2;
    }

    /* JADX INFO: renamed from: a */
    public c<g6n0> m24665a(r8d0 r8d0Var) {
        String str;
        if (r8d0Var == null) {
            return c.error(new NullPointerException());
        }
        if (TextUtils.equals(this.f21793b, "room-topic") || TextUtils.equals(this.f21793b, "topic")) {
            this.f21794c = ((BLiveVoiceTopic) ((wq2) r8d0Var).b.topics.get(0)).id;
        }
        String str2 = this.f21793b;
        int i = hrv.f12252a;
        if (TextUtils.isEmpty(this.f21794c)) {
            str = null;
        } else {
            str = "topicId=" + this.f21794c;
        }
        return hrv.m14800z("suggested", str2, "swipe-in-room", i, null, false, str).map(new r0v());
    }

    /* JADX INFO: renamed from: b */
    public c<g6n0> m24666b(g6n0 g6n0Var) {
        String str;
        if (g6n0Var == null || !g6n0Var.j()) {
            return c.create(new vb20());
        }
        String str2 = this.f21793b;
        int i = hrv.f12252a;
        Pagination paginationI = g6n0Var.i();
        if (TextUtils.isEmpty(this.f21794c)) {
            str = null;
        } else {
            str = "topicId=" + this.f21794c;
        }
        return hrv.m14754A("suggested", str2, "swipe-in-room", i, paginationI, str).map(new r0v());
    }
}
