package p009l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.p000p1.mobile.putong.core.newui.newmeet.feed.seecard.MeetSeeCardItem;
import com.p000p1.mobile.putong.core.newui.newmeet.feed.seecard.MeetSeeDefaultCardItem;
import com.p000p1.mobile.putong.core.newui.newmeet.feed.seecard.StrokeTextView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.businessdata.meet.AbsMeetListData;
import com.p1.mobile.putong.core.businessdata.meet.IMeetListData;
import com.p1.mobile.putong.core.businessdata.meet.MeetFeedSeeItemData;
import l.b3c0;
import l.f1y;
import l.t100;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class e1y implements kwl {

    /* JADX INFO: renamed from: a */
    public FrameLayout f12151a;

    /* JADX INFO: renamed from: b */
    public MeetSeeCardItem f12152b;

    /* JADX INFO: renamed from: c */
    public MeetSeeCardItem f12153c;

    /* JADX INFO: renamed from: d */
    public RelativeLayout f12154d;

    /* JADX INFO: renamed from: e */
    public MeetSeeCardItem f12155e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f12156f;

    /* JADX INFO: renamed from: g */
    public StrokeTextView f12157g;

    /* JADX INFO: renamed from: h */
    public MeetSeeCardItem f12158h;

    /* JADX INFO: renamed from: i */
    public MeetSeeCardItem f12159i;

    /* JADX INFO: renamed from: j */
    public MeetSeeDefaultCardItem f12160j;

    /* JADX INFO: renamed from: k */
    public MeetFeedSeeItemData f12161k;

    @Override // p009l.kwl
    /* JADX INFO: renamed from: a */
    public void mo11817a(IMeetListData iMeetListData, Act act) {
        this.f12161k = (MeetFeedSeeItemData) iMeetListData;
        this.f12151a.setBackground(act.drawable(b3c0.J0));
        if (((AbsMeetListData) this.f12161k).item.userIds.size() == 0) {
            m13639d();
            return;
        }
        if (((AbsMeetListData) this.f12161k).item.userIds.size() == 1) {
            m13641f();
            return;
        }
        if (((AbsMeetListData) this.f12161k).item.userIds.size() == 2) {
            m13643h();
        } else if (((AbsMeetListData) this.f12161k).item.userIds.size() == 3) {
            m13642g();
        } else {
            m13640e();
        }
    }

    /* JADX INFO: renamed from: b */
    public View m13638b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return f1y.b(this, layoutInflater, viewGroup);
    }

    @Override // p009l.kwl
    /* JADX INFO: renamed from: c */
    public View mo11818c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m13638b(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d */
    public final void m13639d() {
        xdl0.M(this.f12152b, false);
        xdl0.M(this.f12153c, false);
        xdl0.M(this.f12154d, false);
        xdl0.M(this.f12158h, false);
        xdl0.M(this.f12159i, false);
        xdl0.M(this.f12156f, false);
        xdl0.M(this.f12160j, true);
        this.f12160j.m7140b(((AbsMeetListData) this.f12161k).item.seeCount);
    }

    /* JADX INFO: renamed from: e */
    public final void m13640e() {
        xdl0.M(this.f12152b, false);
        xdl0.M(this.f12153c, true);
        xdl0.M(this.f12154d, true);
        xdl0.M(this.f12158h, true);
        xdl0.M(this.f12159i, true);
        xdl0.M(this.f12156f, true);
        xdl0.M(this.f12160j, false);
        m13644i(this.f12151a, t100.d(135.0f));
        this.f12153c.m7137b((String) ((AbsMeetListData) this.f12161k).item.userIds.get(0));
        this.f12155e.m7137b((String) ((AbsMeetListData) this.f12161k).item.userIds.get(1));
        this.f12158h.m7137b((String) ((AbsMeetListData) this.f12161k).item.userIds.get(2));
        this.f12159i.m7137b((String) ((AbsMeetListData) this.f12161k).item.userIds.get(3));
        this.f12153c.setTextSize(14);
        this.f12155e.setTextSize(14);
        this.f12158h.setTextSize(14);
        this.f12159i.setTextSize(14);
        xdl0.U(this.f12153c, t100.d(60.0f));
        xdl0.W(this.f12153c, t100.d(60.0f));
        this.f12153c.setRotation(-10.0f);
        xdl0.U(this.f12154d, t100.d(70.0f));
        xdl0.V(this.f12154d, t100.d(65.0f));
        this.f12154d.setRotation(8.0f);
        xdl0.W(this.f12158h, t100.d(60.0f));
        xdl0.X(this.f12158h, t100.d(35.0f));
        this.f12158h.setRotation(-18.0f);
        xdl0.V(this.f12159i, t100.d(60.0f));
        xdl0.X(this.f12159i, t100.d(65.0f));
        this.f12159i.setRotation(15.0f);
        int i = ((AbsMeetListData) this.f12161k).item.seeCount;
        AppCompatTextView appCompatTextView = this.f12157g;
        if (i > 99) {
            appCompatTextView.setText(String.valueOf(99));
        } else {
            appCompatTextView.setText(String.valueOf(i));
        }
        this.f12156f.setRotation(12.0f);
    }

    /* JADX INFO: renamed from: f */
    public final void m13641f() {
        xdl0.M(this.f12152b, true);
        xdl0.M(this.f12153c, true);
        xdl0.M(this.f12154d, false);
        xdl0.M(this.f12158h, false);
        xdl0.M(this.f12159i, false);
        xdl0.M(this.f12156f, false);
        xdl0.M(this.f12160j, false);
        m13644i(this.f12151a, t100.d(173.0f));
        this.f12152b.m7138c();
        this.f12153c.m7137b((String) ((AbsMeetListData) this.f12161k).item.userIds.get(0));
        this.f12153c.setTextSize(18);
        xdl0.V(this.f12152b, t100.d(20.0f));
        xdl0.W(this.f12153c, t100.d(10.0f));
        this.f12153c.setRotation(-10.0f);
    }

    /* JADX INFO: renamed from: g */
    public final void m13642g() {
        xdl0.M(this.f12152b, false);
        xdl0.M(this.f12153c, true);
        xdl0.M(this.f12154d, true);
        xdl0.M(this.f12158h, true);
        xdl0.M(this.f12159i, false);
        xdl0.M(this.f12156f, false);
        xdl0.M(this.f12160j, false);
        m13644i(this.f12151a, t100.d(135.0f));
        this.f12153c.m7137b((String) ((AbsMeetListData) this.f12161k).item.userIds.get(0));
        this.f12155e.m7137b((String) ((AbsMeetListData) this.f12161k).item.userIds.get(1));
        this.f12158h.m7137b((String) ((AbsMeetListData) this.f12161k).item.userIds.get(2));
        this.f12153c.setTextSize(14);
        this.f12155e.setTextSize(14);
        this.f12158h.setTextSize(14);
        xdl0.U(this.f12153c, t100.d(70.0f));
        xdl0.W(this.f12153c, t100.d(10.0f));
        this.f12153c.setRotation(-6.0f);
        xdl0.W(this.f12154d, t100.d(50.0f));
        xdl0.X(this.f12154d, t100.d(35.0f));
        this.f12154d.setRotation(-22.0f);
        xdl0.V(this.f12158h, t100.d(50.0f));
        xdl0.X(this.f12158h, t100.d(65.0f));
        this.f12158h.setRotation(15.0f);
    }

    /* JADX INFO: renamed from: h */
    public final void m13643h() {
        xdl0.M(this.f12152b, false);
        xdl0.M(this.f12153c, true);
        xdl0.M(this.f12154d, true);
        xdl0.M(this.f12158h, false);
        xdl0.M(this.f12159i, false);
        xdl0.M(this.f12156f, false);
        xdl0.M(this.f12160j, false);
        m13644i(this.f12151a, t100.d(148.0f));
        this.f12153c.m7137b((String) ((AbsMeetListData) this.f12161k).item.userIds.get(0));
        this.f12155e.m7137b((String) ((AbsMeetListData) this.f12161k).item.userIds.get(1));
        this.f12153c.setTextSize(15);
        this.f12155e.setTextSize(15);
        xdl0.W(this.f12153c, t100.d(60.0f));
        xdl0.U(this.f12153c, t100.d(15.0f));
        this.f12153c.setRotation(-22.0f);
        xdl0.V(this.f12154d, t100.d(50.0f));
        xdl0.X(this.f12154d, t100.d(25.0f));
        this.f12154d.setRotation(15.0f);
    }

    /* JADX INFO: renamed from: i */
    public final void m13644i(ViewGroup viewGroup, int i) {
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt instanceof MeetSeeCardItem) {
                ((MeetSeeCardItem) childAt).setWidth(i);
            } else if (childAt instanceof ViewGroup) {
                m13644i((ViewGroup) childAt, i);
            }
        }
    }

    @Override // p009l.kwl
    public void release() {
    }
}
