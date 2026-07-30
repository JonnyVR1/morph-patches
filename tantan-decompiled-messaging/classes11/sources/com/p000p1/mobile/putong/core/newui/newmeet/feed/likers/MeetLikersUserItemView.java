package com.p000p1.mobile.putong.core.newui.newmeet.feed.likers;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.businessdata.meet.MeetFeedUserItemData;
import com.p1.mobile.putong.core.data.FeedType;
import com.p1.mobile.putong.core.data.MyMeetFeedItem;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.text.DecimalFormat;
import l.b3c0;
import l.j760;
import l.qib0;
import l.roj0;
import l.s4y;
import l.sb90;
import l.vwb;
import l.xdl0;
import l.xma;
import l.zvf0;
import p009l.lwl;
import v.VDraweeView;
import v.VImage;
import v.VRelative;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class MeetLikersUserItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f4992a;

    /* JADX INFO: renamed from: b */
    public VImage f4993b;

    /* JADX INFO: renamed from: c */
    public VText f4994c;

    /* JADX INFO: renamed from: d */
    public VRelative f4995d;

    /* JADX INFO: renamed from: e */
    public VText f4996e;

    /* JADX INFO: renamed from: f */
    public VText f4997f;

    /* JADX INFO: renamed from: g */
    public VImage f4998g;

    /* JADX INFO: renamed from: h */
    public View f4999h;

    /* JADX INFO: renamed from: i */
    public VImage f5000i;

    /* JADX INFO: renamed from: j */
    public VImage f5001j;

    /* JADX INFO: renamed from: k */
    public User f5002k;

    public MeetLikersUserItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public final void m7037c(View view) {
        s4y.a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final Act m7038d() {
        return getContext();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m7039e(User user, boolean z, lwl lwlVar, View view) {
        CoreModule.c.m1.M4().onNext(roj0.a);
        zvf0.u("e_meet_see_card", m7038d().pageId(), new j760[]{vwb.Y("other_user_id", ((DbObject) user).id)});
        if (z) {
            CoreModule.P().a().qb(m7038d(), ((DbObject) user).id, this);
        } else {
            CoreModule.P().a().l1(m7038d(), lwlVar.mo18064a(m7045k(user)));
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m7040f(User user, lwl lwlVar, View view) {
        CoreModule.c.m1.M4().onNext(roj0.a);
        zvf0.u("e_meet_see_card_like", m7038d().pageId(), new j760[]{vwb.Y("other_user_id", ((DbObject) user).id)});
        MyMeetFeedItem myMeetFeedItemNew_ = MyMeetFeedItem.new_();
        myMeetFeedItemNew_.type = FeedType.get("localLikersUser");
        lwlVar.mo18067d(new MeetFeedUserItemData(user, myMeetFeedItemNew_), true, false, true, null);
    }

    /* JADX INFO: renamed from: g */
    public void m7041g(final User user, final lwl lwlVar) {
        this.f5002k = user;
        xdl0.M0(this.f5001j, false);
        xdl0.M0(this.f5000i, false);
        boolean zE4 = xma.e4();
        final boolean z = !zE4;
        if (zE4 || sb90.c(user)) {
            qib0.G.O(this.f4992a, user.fp().profile480().formatted(), 2, 30);
        } else {
            qib0.G.N0(this.f4992a, user.fp().profile480().formatted(), false);
        }
        m7042h(user, lwlVar);
        xdl0.E0(this, new View.OnClickListener() { // from class: l.q4y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f19028a.m7039e(user, z, lwlVar, view);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final void m7042h(final User user, final lwl lwlVar) {
        xdl0.M(this.f4999h, false);
        xdl0.M(this.f4995d, true);
        xdl0.M(this.f4998g, true);
        qib0.b0.b.showUserVerificationLogo(getContext(), user, this.f4993b);
        m7044j(user, ((Long) CoreModule.c.u0.k0.get()).longValue());
        if (!CoreModule.P().a().Yp() || TextUtils.isEmpty(user.localSeeReminderType)) {
            this.f4996e.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            this.f4996e.setText(String.format("%s岁", user.age));
            this.f4997f.setText(user.name);
        } else {
            this.f4997f.setText(String.format("%1$s %2$s", user.name, user.age));
            m7043i(user);
        }
        if (lwlVar.mo18066c() && CoreModule.P().a().v4()) {
            this.f4998g.setImageResource(b3c0.n1);
        } else {
            this.f4998g.setImageResource(b3c0.m1);
        }
        this.f4995d.setBackground(m7038d().drawable(b3c0.q0));
        xdl0.E0(this.f4998g, new View.OnClickListener() { // from class: l.r4y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f19638a.m7040f(user, lwlVar, view);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final void m7043i(User user) {
        String str;
        String str2 = user.localSeeReminderType;
        str2.getClass();
        switch (str2) {
            case "nearby":
                int i = user.location.distance;
                if (i >= 1000) {
                    str = String.format("%skm", new DecimalFormat("0.0").format(i / 1000.0f));
                } else {
                    if (i < 100) {
                        i = 100;
                    }
                    str = String.format("%sm", Integer.valueOf(i));
                }
                this.f4996e.setText(str);
                xdl0.k(this.f4996e, m7038d().drawable(b3c0.d1));
                break;
            case "online":
                this.f4996e.setText("最近活跃");
                xdl0.k(this.f4996e, m7038d().drawable(b3c0.e1));
                break;
            case "visit":
                this.f4996e.setText("看过我");
                xdl0.k(this.f4996e, m7038d().drawable(b3c0.f1));
                break;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m7044j(User user, long j) {
        xdl0.M0(this.f4994c, false);
        this.f4994c.setTypeface(Typeface.DEFAULT);
        if (NullChecker.a(user.localRelationship) && NullChecker.a(user.localRelationship.cardInfo) && !vwb.J(user.localRelationship.cardInfo.cardTypes) && user.localRelationship.cardInfo.cardTypes.contains("newLikeAfterVerification")) {
            this.f4994c.setText("来自邀请认证");
            this.f4994c.setTypeface(Typeface.DEFAULT_BOLD);
            this.f4994c.setBackgroundResource(qib0.b0.b.I4() ? b3c0.l2 : b3c0.k2);
            this.f4994c.setCompoundDrawablesWithIntrinsicBounds(qib0.b0.b.I4() ? b3c0.h2 : b3c0.g2, 0, 0, 0);
            xdl0.M0(this.f4994c, true);
            return;
        }
        if (user.superLikedMe()) {
            this.f4994c.setText(String.format("%s超级喜欢你", user.isFemale() ? "她" : "他"));
            this.f4994c.setTypeface(Typeface.DEFAULT_BOLD);
            this.f4994c.setBackgroundResource(b3c0.m2);
            this.f4994c.setCompoundDrawablesWithIntrinsicBounds(b3c0.e2, 0, 0, 0);
            xdl0.M0(this.f4994c, true);
            return;
        }
        if (CoreModule.c.u0.y5(user)) {
            xdl0.M0(this.f4994c, true);
            this.f4994c.setText("即刻聊天");
            this.f4994c.setTypeface(Typeface.DEFAULT_BOLD);
            this.f4994c.setBackgroundResource(b3c0.b2);
            this.f4994c.setCompoundDrawablesWithIntrinsicBounds(b3c0.i, 0, 0, 0);
            return;
        }
        if (j <= 0 || !NullChecker.a(user.localRelationship)) {
            xdl0.M0(this.f4994c, false);
            return;
        }
        xdl0.M0(this.f4994c, ((double) j) < user.localRelationship.updateTime);
        this.f4994c.setTypeface(Typeface.DEFAULT_BOLD);
        this.f4994c.setText("新喜欢");
        this.f4994c.setBackgroundResource(b3c0.k2);
        this.f4994c.setCompoundDrawablesWithIntrinsicBounds(b3c0.d2, 0, 0, 0);
    }

    /* JADX INFO: renamed from: k */
    public final MeetFeedUserItemData m7045k(User user) {
        MyMeetFeedItem myMeetFeedItemNew_ = MyMeetFeedItem.new_();
        myMeetFeedItemNew_.type = FeedType.get("localLikersUser");
        return new MeetFeedUserItemData(user, myMeetFeedItemNew_);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7037c(this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = (int) (View.MeasureSpec.getSize(i) * 1.33f);
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f4995d.getLayoutParams();
        int i3 = (int) (size * 0.38f);
        if (layoutParams.height != i3) {
            layoutParams.height = i3;
            this.f4995d.setLayoutParams(layoutParams);
        }
    }

    public MeetLikersUserItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MeetLikersUserItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
