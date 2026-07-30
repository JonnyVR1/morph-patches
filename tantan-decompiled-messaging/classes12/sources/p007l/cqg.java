package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.MomentMessage;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert.FeedMomentMesagesView;
import com.p1.mobile.android.app.Act;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class cqg {

    /* JADX INFO: renamed from: l.cqg$a */
    public static final class C2356a {

        /* JADX INFO: renamed from: a */
        public Act f6707a;

        /* JADX INFO: renamed from: b */
        public hx60 f6708b;

        /* JADX INFO: renamed from: c */
        public MomentMessage f6709c;

        /* JADX INFO: renamed from: d */
        public Moment f6710d;

        /* JADX INFO: renamed from: e */
        public ViewGroup f6711e;

        /* JADX INFO: renamed from: f */
        public String f6712f;

        /* JADX INFO: renamed from: g */
        public String f6713g;

        public C2356a(Act act, MomentMessage momentMessage, ViewGroup viewGroup) {
            this.f6709c = momentMessage;
            this.f6711e = viewGroup;
            this.f6707a = act;
        }

        /* JADX INFO: renamed from: h */
        public View m9220h() {
            return cqg.m9211a(this);
        }

        /* JADX INFO: renamed from: i */
        public C2356a m9221i(String str) {
            this.f6713g = str;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C2356a m9222j(Moment moment) {
            this.f6710d = moment;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C2356a m9223k(String str) {
            this.f6712f = str;
            return this;
        }

        /* JADX INFO: renamed from: l */
        public C2356a m9224l(hx60 hx60Var) {
            this.f6708b = hx60Var;
            return this;
        }
    }

    /* JADX INFO: renamed from: a */
    public static View m9211a(C2356a c2356a) {
        FeedMomentMesagesView feedMomentMesagesViewM9212b = m9212b(c2356a.f6707a, c2356a.f6708b, c2356a.f6710d, c2356a.f6709c, c2356a.f6712f, c2356a.f6713g);
        c2356a.f6711e.addView(feedMomentMesagesViewM9212b);
        return feedMomentMesagesViewM9212b;
    }

    /* JADX INFO: renamed from: b */
    public static FeedMomentMesagesView m9212b(Act act, hx60 hx60Var, Moment moment, MomentMessage momentMessage, String str, String str2) {
        FeedMomentMesagesView feedMomentMesagesView = (FeedMomentMesagesView) LayoutInflater.from(act).inflate(o6c0.f11306t1, (ViewGroup) null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(t100.d(12.0f), t100.d(12.0f), t100.d(10.0f), 0);
        feedMomentMesagesView.setLayoutParams(layoutParams);
        feedMomentMesagesView.m5679m(act, moment, momentMessage, str, str2, hx60Var);
        return feedMomentMesagesView;
    }
}
