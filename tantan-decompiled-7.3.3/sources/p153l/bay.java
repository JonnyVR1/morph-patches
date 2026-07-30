package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.businessdata.meet.IMeetListData;
import com.p051p1.mobile.putong.core.businessdata.meet.MeetFeedSeeItemData;
import com.p051p1.mobile.putong.core.newui.newmeet.feed.seecard.MeetSeeCardItem;
import com.p051p1.mobile.putong.core.newui.newmeet.feed.seecard.MeetSeeDefaultCardItem;
import com.p051p1.mobile.putong.core.newui.newmeet.feed.seecard.StrokeTextView;

/* JADX INFO: loaded from: classes11.dex */
public class bay implements czl {

    /* JADX INFO: renamed from: a */
    public FrameLayout f75747a;

    /* JADX INFO: renamed from: b */
    public MeetSeeCardItem f75748b;

    /* JADX INFO: renamed from: c */
    public MeetSeeCardItem f75749c;

    /* JADX INFO: renamed from: d */
    public RelativeLayout f75750d;

    /* JADX INFO: renamed from: e */
    public MeetSeeCardItem f75751e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f75752f;

    /* JADX INFO: renamed from: g */
    public StrokeTextView f75753g;

    /* JADX INFO: renamed from: h */
    public MeetSeeCardItem f75754h;

    /* JADX INFO: renamed from: i */
    public MeetSeeCardItem f75755i;

    /* JADX INFO: renamed from: j */
    public MeetSeeDefaultCardItem f75756j;

    /* JADX INFO: renamed from: k */
    public MeetFeedSeeItemData f75757k;

    @Override // p153l.czl
    /* JADX INFO: renamed from: a */
    public void mo103244a(IMeetListData iMeetListData, Act act) {
        this.f75757k = (MeetFeedSeeItemData) iMeetListData;
        this.f75747a.setBackground(act.drawable(gbc0.f103135J0));
        if (this.f75757k.item.userIds.size() == 0) {
            m103247d();
            return;
        }
        if (this.f75757k.item.userIds.size() == 1) {
            m103249f();
            return;
        }
        if (this.f75757k.item.userIds.size() == 2) {
            m103251h();
        } else if (this.f75757k.item.userIds.size() == 3) {
            m103250g();
        } else {
            m103248e();
        }
    }

    /* JADX INFO: renamed from: b */
    public View m103245b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return cay.m108517b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.czl
    /* JADX INFO: renamed from: c */
    public View mo103246c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m103245b(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d */
    public final void m103247d() {
        bnl0.m105524M(this.f75748b, false);
        bnl0.m105524M(this.f75749c, false);
        bnl0.m105524M(this.f75750d, false);
        bnl0.m105524M(this.f75754h, false);
        bnl0.m105524M(this.f75755i, false);
        bnl0.m105524M(this.f75752f, false);
        bnl0.m105524M(this.f75756j, true);
        this.f75756j.m43956b(this.f75757k.item.seeCount);
    }

    /* JADX INFO: renamed from: e */
    public final void m103248e() {
        bnl0.m105524M(this.f75748b, false);
        bnl0.m105524M(this.f75749c, true);
        bnl0.m105524M(this.f75750d, true);
        bnl0.m105524M(this.f75754h, true);
        bnl0.m105524M(this.f75755i, true);
        bnl0.m105524M(this.f75752f, true);
        bnl0.m105524M(this.f75756j, false);
        m103252i(this.f75747a, qa00.m175859d(135.0f));
        this.f75749c.m43953b(this.f75757k.item.userIds.get(0));
        this.f75751e.m43953b(this.f75757k.item.userIds.get(1));
        this.f75754h.m43953b(this.f75757k.item.userIds.get(2));
        this.f75755i.m43953b(this.f75757k.item.userIds.get(3));
        this.f75749c.setTextSize(14);
        this.f75751e.setTextSize(14);
        this.f75754h.setTextSize(14);
        this.f75755i.setTextSize(14);
        bnl0.m105537U(this.f75749c, qa00.m175859d(60.0f));
        bnl0.m105539W(this.f75749c, qa00.m175859d(60.0f));
        this.f75749c.setRotation(-10.0f);
        bnl0.m105537U(this.f75750d, qa00.m175859d(70.0f));
        bnl0.m105538V(this.f75750d, qa00.m175859d(65.0f));
        this.f75750d.setRotation(8.0f);
        bnl0.m105539W(this.f75754h, qa00.m175859d(60.0f));
        bnl0.m105540X(this.f75754h, qa00.m175859d(35.0f));
        this.f75754h.setRotation(-18.0f);
        bnl0.m105538V(this.f75755i, qa00.m175859d(60.0f));
        bnl0.m105540X(this.f75755i, qa00.m175859d(65.0f));
        this.f75755i.setRotation(15.0f);
        int i = this.f75757k.item.seeCount;
        StrokeTextView strokeTextView = this.f75753g;
        if (i > 99) {
            strokeTextView.setText(String.valueOf(99));
        } else {
            strokeTextView.setText(String.valueOf(i));
        }
        this.f75752f.setRotation(12.0f);
    }

    /* JADX INFO: renamed from: f */
    public final void m103249f() {
        bnl0.m105524M(this.f75748b, true);
        bnl0.m105524M(this.f75749c, true);
        bnl0.m105524M(this.f75750d, false);
        bnl0.m105524M(this.f75754h, false);
        bnl0.m105524M(this.f75755i, false);
        bnl0.m105524M(this.f75752f, false);
        bnl0.m105524M(this.f75756j, false);
        m103252i(this.f75747a, qa00.m175859d(173.0f));
        this.f75748b.m43954c();
        this.f75749c.m43953b(this.f75757k.item.userIds.get(0));
        this.f75749c.setTextSize(18);
        bnl0.m105538V(this.f75748b, qa00.m175859d(20.0f));
        bnl0.m105539W(this.f75749c, qa00.m175859d(10.0f));
        this.f75749c.setRotation(-10.0f);
    }

    /* JADX INFO: renamed from: g */
    public final void m103250g() {
        bnl0.m105524M(this.f75748b, false);
        bnl0.m105524M(this.f75749c, true);
        bnl0.m105524M(this.f75750d, true);
        bnl0.m105524M(this.f75754h, true);
        bnl0.m105524M(this.f75755i, false);
        bnl0.m105524M(this.f75752f, false);
        bnl0.m105524M(this.f75756j, false);
        m103252i(this.f75747a, qa00.m175859d(135.0f));
        this.f75749c.m43953b(this.f75757k.item.userIds.get(0));
        this.f75751e.m43953b(this.f75757k.item.userIds.get(1));
        this.f75754h.m43953b(this.f75757k.item.userIds.get(2));
        this.f75749c.setTextSize(14);
        this.f75751e.setTextSize(14);
        this.f75754h.setTextSize(14);
        bnl0.m105537U(this.f75749c, qa00.m175859d(70.0f));
        bnl0.m105539W(this.f75749c, qa00.m175859d(10.0f));
        this.f75749c.setRotation(-6.0f);
        bnl0.m105539W(this.f75750d, qa00.m175859d(50.0f));
        bnl0.m105540X(this.f75750d, qa00.m175859d(35.0f));
        this.f75750d.setRotation(-22.0f);
        bnl0.m105538V(this.f75754h, qa00.m175859d(50.0f));
        bnl0.m105540X(this.f75754h, qa00.m175859d(65.0f));
        this.f75754h.setRotation(15.0f);
    }

    /* JADX INFO: renamed from: h */
    public final void m103251h() {
        bnl0.m105524M(this.f75748b, false);
        bnl0.m105524M(this.f75749c, true);
        bnl0.m105524M(this.f75750d, true);
        bnl0.m105524M(this.f75754h, false);
        bnl0.m105524M(this.f75755i, false);
        bnl0.m105524M(this.f75752f, false);
        bnl0.m105524M(this.f75756j, false);
        m103252i(this.f75747a, qa00.m175859d(148.0f));
        this.f75749c.m43953b(this.f75757k.item.userIds.get(0));
        this.f75751e.m43953b(this.f75757k.item.userIds.get(1));
        this.f75749c.setTextSize(15);
        this.f75751e.setTextSize(15);
        bnl0.m105539W(this.f75749c, qa00.m175859d(60.0f));
        bnl0.m105537U(this.f75749c, qa00.m175859d(15.0f));
        this.f75749c.setRotation(-22.0f);
        bnl0.m105538V(this.f75750d, qa00.m175859d(50.0f));
        bnl0.m105540X(this.f75750d, qa00.m175859d(25.0f));
        this.f75750d.setRotation(15.0f);
    }

    /* JADX INFO: renamed from: i */
    public final void m103252i(ViewGroup viewGroup, int i) {
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt instanceof MeetSeeCardItem) {
                ((MeetSeeCardItem) childAt).setWidth(i);
            } else if (childAt instanceof ViewGroup) {
                m103252i((ViewGroup) childAt, i);
            }
        }
    }

    @Override // p153l.czl
    public void release() {
    }
}
