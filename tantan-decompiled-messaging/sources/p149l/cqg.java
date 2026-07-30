package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.MomentMessage;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert.FeedMomentMesagesView;

/* JADX INFO: loaded from: classes12.dex */
public class cqg {

    /* JADX INFO: renamed from: l.cqg$a */
    public static final class C16212a {

        /* JADX INFO: renamed from: a */
        public Act f82066a;

        /* JADX INFO: renamed from: b */
        public hx60 f82067b;

        /* JADX INFO: renamed from: c */
        public MomentMessage f82068c;

        /* JADX INFO: renamed from: d */
        public Moment f82069d;

        /* JADX INFO: renamed from: e */
        public ViewGroup f82070e;

        /* JADX INFO: renamed from: f */
        public String f82071f;

        /* JADX INFO: renamed from: g */
        public String f82072g;

        public C16212a(Act act, MomentMessage momentMessage, ViewGroup viewGroup) {
            this.f82068c = momentMessage;
            this.f82070e = viewGroup;
            this.f82066a = act;
        }

        /* JADX INFO: renamed from: h */
        public View m108269h() {
            return cqg.m108260a(this);
        }

        /* JADX INFO: renamed from: i */
        public C16212a m108270i(String str) {
            this.f82072g = str;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C16212a m108271j(Moment moment) {
            this.f82069d = moment;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C16212a m108272k(String str) {
            this.f82071f = str;
            return this;
        }

        /* JADX INFO: renamed from: l */
        public C16212a m108273l(hx60 hx60Var) {
            this.f82067b = hx60Var;
            return this;
        }
    }

    /* JADX INFO: renamed from: a */
    public static View m108260a(C16212a c16212a) {
        FeedMomentMesagesView feedMomentMesagesViewM108261b = m108261b(c16212a.f82066a, c16212a.f82067b, c16212a.f82069d, c16212a.f82068c, c16212a.f82071f, c16212a.f82072g);
        c16212a.f82070e.addView(feedMomentMesagesViewM108261b);
        return feedMomentMesagesViewM108261b;
    }

    /* JADX INFO: renamed from: b */
    public static FeedMomentMesagesView m108261b(Act act, hx60 hx60Var, Moment moment, MomentMessage momentMessage, String str, String str2) {
        FeedMomentMesagesView feedMomentMesagesView = (FeedMomentMesagesView) LayoutInflater.from(act).inflate(o6c0.f142287t1, (ViewGroup) null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(t100.m186890d(12.0f), t100.m186890d(12.0f), t100.m186890d(10.0f), 0);
        feedMomentMesagesView.setLayoutParams(layoutParams);
        feedMomentMesagesView.m64585m(act, moment, momentMessage, str, str2, hx60Var);
        return feedMomentMesagesView;
    }
}
