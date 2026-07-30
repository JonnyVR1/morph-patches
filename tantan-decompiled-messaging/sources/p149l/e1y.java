package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.businessdata.meet.IMeetListData;
import com.p046p1.mobile.putong.core.businessdata.meet.MeetFeedSeeItemData;
import com.p046p1.mobile.putong.core.newui.newmeet.feed.seecard.MeetSeeCardItem;
import com.p046p1.mobile.putong.core.newui.newmeet.feed.seecard.MeetSeeDefaultCardItem;
import com.p046p1.mobile.putong.core.newui.newmeet.feed.seecard.StrokeTextView;

/* JADX INFO: loaded from: classes11.dex */
public class e1y implements kwl {

    /* JADX INFO: renamed from: a */
    public FrameLayout f88859a;

    /* JADX INFO: renamed from: b */
    public MeetSeeCardItem f88860b;

    /* JADX INFO: renamed from: c */
    public MeetSeeCardItem f88861c;

    /* JADX INFO: renamed from: d */
    public RelativeLayout f88862d;

    /* JADX INFO: renamed from: e */
    public MeetSeeCardItem f88863e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f88864f;

    /* JADX INFO: renamed from: g */
    public StrokeTextView f88865g;

    /* JADX INFO: renamed from: h */
    public MeetSeeCardItem f88866h;

    /* JADX INFO: renamed from: i */
    public MeetSeeCardItem f88867i;

    /* JADX INFO: renamed from: j */
    public MeetSeeDefaultCardItem f88868j;

    /* JADX INFO: renamed from: k */
    public MeetFeedSeeItemData f88869k;

    @Override // p149l.kwl
    /* JADX INFO: renamed from: a */
    public void mo99891a(IMeetListData iMeetListData, Act act) {
        this.f88869k = (MeetFeedSeeItemData) iMeetListData;
        this.f88859a.setBackground(act.drawable(b3c0.f72884J0));
        if (this.f88869k.item.userIds.size() == 0) {
            m114449d();
            return;
        }
        if (this.f88869k.item.userIds.size() == 1) {
            m114451f();
            return;
        }
        if (this.f88869k.item.userIds.size() == 2) {
            m114453h();
        } else if (this.f88869k.item.userIds.size() == 3) {
            m114452g();
        } else {
            m114450e();
        }
    }

    /* JADX INFO: renamed from: b */
    public View m114448b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return f1y.m119147b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.kwl
    /* JADX INFO: renamed from: c */
    public View mo99892c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m114448b(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d */
    public final void m114449d() {
        xdl0.m208344M(this.f88860b, false);
        xdl0.m208344M(this.f88861c, false);
        xdl0.m208344M(this.f88862d, false);
        xdl0.m208344M(this.f88866h, false);
        xdl0.m208344M(this.f88867i, false);
        xdl0.m208344M(this.f88864f, false);
        xdl0.m208344M(this.f88868j, true);
        this.f88868j.m42945b(this.f88869k.item.seeCount);
    }

    /* JADX INFO: renamed from: e */
    public final void m114450e() {
        xdl0.m208344M(this.f88860b, false);
        xdl0.m208344M(this.f88861c, true);
        xdl0.m208344M(this.f88862d, true);
        xdl0.m208344M(this.f88866h, true);
        xdl0.m208344M(this.f88867i, true);
        xdl0.m208344M(this.f88864f, true);
        xdl0.m208344M(this.f88868j, false);
        m114454i(this.f88859a, t100.m186890d(135.0f));
        this.f88861c.m42942b(this.f88869k.item.userIds.get(0));
        this.f88863e.m42942b(this.f88869k.item.userIds.get(1));
        this.f88866h.m42942b(this.f88869k.item.userIds.get(2));
        this.f88867i.m42942b(this.f88869k.item.userIds.get(3));
        this.f88861c.setTextSize(14);
        this.f88863e.setTextSize(14);
        this.f88866h.setTextSize(14);
        this.f88867i.setTextSize(14);
        xdl0.m208357U(this.f88861c, t100.m186890d(60.0f));
        xdl0.m208359W(this.f88861c, t100.m186890d(60.0f));
        this.f88861c.setRotation(-10.0f);
        xdl0.m208357U(this.f88862d, t100.m186890d(70.0f));
        xdl0.m208358V(this.f88862d, t100.m186890d(65.0f));
        this.f88862d.setRotation(8.0f);
        xdl0.m208359W(this.f88866h, t100.m186890d(60.0f));
        xdl0.m208360X(this.f88866h, t100.m186890d(35.0f));
        this.f88866h.setRotation(-18.0f);
        xdl0.m208358V(this.f88867i, t100.m186890d(60.0f));
        xdl0.m208360X(this.f88867i, t100.m186890d(65.0f));
        this.f88867i.setRotation(15.0f);
        int i = this.f88869k.item.seeCount;
        StrokeTextView strokeTextView = this.f88865g;
        if (i > 99) {
            strokeTextView.setText(String.valueOf(99));
        } else {
            strokeTextView.setText(String.valueOf(i));
        }
        this.f88864f.setRotation(12.0f);
    }

    /* JADX INFO: renamed from: f */
    public final void m114451f() {
        xdl0.m208344M(this.f88860b, true);
        xdl0.m208344M(this.f88861c, true);
        xdl0.m208344M(this.f88862d, false);
        xdl0.m208344M(this.f88866h, false);
        xdl0.m208344M(this.f88867i, false);
        xdl0.m208344M(this.f88864f, false);
        xdl0.m208344M(this.f88868j, false);
        m114454i(this.f88859a, t100.m186890d(173.0f));
        this.f88860b.m42943c();
        this.f88861c.m42942b(this.f88869k.item.userIds.get(0));
        this.f88861c.setTextSize(18);
        xdl0.m208358V(this.f88860b, t100.m186890d(20.0f));
        xdl0.m208359W(this.f88861c, t100.m186890d(10.0f));
        this.f88861c.setRotation(-10.0f);
    }

    /* JADX INFO: renamed from: g */
    public final void m114452g() {
        xdl0.m208344M(this.f88860b, false);
        xdl0.m208344M(this.f88861c, true);
        xdl0.m208344M(this.f88862d, true);
        xdl0.m208344M(this.f88866h, true);
        xdl0.m208344M(this.f88867i, false);
        xdl0.m208344M(this.f88864f, false);
        xdl0.m208344M(this.f88868j, false);
        m114454i(this.f88859a, t100.m186890d(135.0f));
        this.f88861c.m42942b(this.f88869k.item.userIds.get(0));
        this.f88863e.m42942b(this.f88869k.item.userIds.get(1));
        this.f88866h.m42942b(this.f88869k.item.userIds.get(2));
        this.f88861c.setTextSize(14);
        this.f88863e.setTextSize(14);
        this.f88866h.setTextSize(14);
        xdl0.m208357U(this.f88861c, t100.m186890d(70.0f));
        xdl0.m208359W(this.f88861c, t100.m186890d(10.0f));
        this.f88861c.setRotation(-6.0f);
        xdl0.m208359W(this.f88862d, t100.m186890d(50.0f));
        xdl0.m208360X(this.f88862d, t100.m186890d(35.0f));
        this.f88862d.setRotation(-22.0f);
        xdl0.m208358V(this.f88866h, t100.m186890d(50.0f));
        xdl0.m208360X(this.f88866h, t100.m186890d(65.0f));
        this.f88866h.setRotation(15.0f);
    }

    /* JADX INFO: renamed from: h */
    public final void m114453h() {
        xdl0.m208344M(this.f88860b, false);
        xdl0.m208344M(this.f88861c, true);
        xdl0.m208344M(this.f88862d, true);
        xdl0.m208344M(this.f88866h, false);
        xdl0.m208344M(this.f88867i, false);
        xdl0.m208344M(this.f88864f, false);
        xdl0.m208344M(this.f88868j, false);
        m114454i(this.f88859a, t100.m186890d(148.0f));
        this.f88861c.m42942b(this.f88869k.item.userIds.get(0));
        this.f88863e.m42942b(this.f88869k.item.userIds.get(1));
        this.f88861c.setTextSize(15);
        this.f88863e.setTextSize(15);
        xdl0.m208359W(this.f88861c, t100.m186890d(60.0f));
        xdl0.m208357U(this.f88861c, t100.m186890d(15.0f));
        this.f88861c.setRotation(-22.0f);
        xdl0.m208358V(this.f88862d, t100.m186890d(50.0f));
        xdl0.m208360X(this.f88862d, t100.m186890d(25.0f));
        this.f88862d.setRotation(15.0f);
    }

    /* JADX INFO: renamed from: i */
    public final void m114454i(ViewGroup viewGroup, int i) {
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt instanceof MeetSeeCardItem) {
                ((MeetSeeCardItem) childAt).setWidth(i);
            } else if (childAt instanceof ViewGroup) {
                m114454i((ViewGroup) childAt, i);
            }
        }
    }

    @Override // p149l.kwl
    public void release() {
    }
}
