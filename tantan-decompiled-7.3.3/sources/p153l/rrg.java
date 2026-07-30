package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.MomentMessage;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert.FeedMomentMesagesView;

/* JADX INFO: loaded from: classes13.dex */
public class rrg {

    /* JADX INFO: renamed from: l.rrg$a */
    public static final class C19902a {

        /* JADX INFO: renamed from: a */
        public Act f164571a;

        /* JADX INFO: renamed from: b */
        public n570 f164572b;

        /* JADX INFO: renamed from: c */
        public MomentMessage f164573c;

        /* JADX INFO: renamed from: d */
        public Moment f164574d;

        /* JADX INFO: renamed from: e */
        public ViewGroup f164575e;

        /* JADX INFO: renamed from: f */
        public String f164576f;

        /* JADX INFO: renamed from: g */
        public String f164577g;

        public C19902a(Act act, MomentMessage momentMessage, ViewGroup viewGroup) {
            this.f164573c = momentMessage;
            this.f164575e = viewGroup;
            this.f164571a = act;
        }

        /* JADX INFO: renamed from: h */
        public View m182780h() {
            return rrg.m182771a(this);
        }

        /* JADX INFO: renamed from: i */
        public C19902a m182781i(String str) {
            this.f164577g = str;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C19902a m182782j(Moment moment) {
            this.f164574d = moment;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C19902a m182783k(String str) {
            this.f164576f = str;
            return this;
        }

        /* JADX INFO: renamed from: l */
        public C19902a m182784l(n570 n570Var) {
            this.f164572b = n570Var;
            return this;
        }
    }

    /* JADX INFO: renamed from: a */
    public static View m182771a(C19902a c19902a) {
        FeedMomentMesagesView feedMomentMesagesViewM182772b = m182772b(c19902a.f164571a, c19902a.f164572b, c19902a.f164574d, c19902a.f164573c, c19902a.f164576f, c19902a.f164577g);
        c19902a.f164575e.addView(feedMomentMesagesViewM182772b);
        return feedMomentMesagesViewM182772b;
    }

    /* JADX INFO: renamed from: b */
    public static FeedMomentMesagesView m182772b(Act act, n570 n570Var, Moment moment, MomentMessage momentMessage, String str, String str2) {
        FeedMomentMesagesView feedMomentMesagesView = (FeedMomentMesagesView) LayoutInflater.from(act).inflate(tec0.f173756t1, (ViewGroup) null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(qa00.m175859d(12.0f), qa00.m175859d(12.0f), qa00.m175859d(10.0f), 0);
        feedMomentMesagesView.setLayoutParams(layoutParams);
        feedMomentMesagesView.m65768m(act, moment, momentMessage, str, str2, n570Var);
        return feedMomentMesagesView;
    }
}
