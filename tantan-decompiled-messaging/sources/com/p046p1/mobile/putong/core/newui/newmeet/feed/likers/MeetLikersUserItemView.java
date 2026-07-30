package com.p046p1.mobile.putong.core.newui.newmeet.feed.likers;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.businessdata.meet.MeetFeedUserItemData;
import com.p046p1.mobile.putong.core.data.FeedType;
import com.p046p1.mobile.putong.core.data.MyMeetFeedItem;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.text.DecimalFormat;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VRelative;
import p147v.VText;
import p149l.b3c0;
import p149l.lwl;
import p149l.qib0;
import p149l.roj0;
import p149l.s4y;
import p149l.sb90;
import p149l.vwb;
import p149l.xdl0;
import p149l.xma;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class MeetLikersUserItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f26214a;

    /* JADX INFO: renamed from: b */
    public VImage f26215b;

    /* JADX INFO: renamed from: c */
    public VText f26216c;

    /* JADX INFO: renamed from: d */
    public VRelative f26217d;

    /* JADX INFO: renamed from: e */
    public VText f26218e;

    /* JADX INFO: renamed from: f */
    public VText f26219f;

    /* JADX INFO: renamed from: g */
    public VImage f26220g;

    /* JADX INFO: renamed from: h */
    public View f26221h;

    /* JADX INFO: renamed from: i */
    public VImage f26222i;

    /* JADX INFO: renamed from: j */
    public VImage f26223j;

    /* JADX INFO: renamed from: k */
    public User f26224k;

    public MeetLikersUserItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public final void m42863c(View view) {
        s4y.m182317a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final Act m42864d() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m42865e(User user, boolean z, lwl lwlVar, View view) {
        CoreModule.f17545c.f19664m1.m34698M4().onNext(roj0.f160388a);
        zvf0.m220399u("e_meet_see_card", m42864d().pageId(), vwb.m200311Y("other_user_id", user.f56011id));
        if (z) {
            CoreModule.m29935P().m94651a().mo33568qb(m42864d(), user.f56011id, this);
        } else {
            CoreModule.m29935P().m94651a().mo33534l1(m42864d(), lwlVar.mo151975a(m42871k(user)));
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m42866f(User user, lwl lwlVar, View view) {
        CoreModule.f17545c.f19664m1.m34698M4().onNext(roj0.f160388a);
        zvf0.m220399u("e_meet_see_card_like", m42864d().pageId(), vwb.m200311Y("other_user_id", user.f56011id));
        MyMeetFeedItem myMeetFeedItemNew_ = MyMeetFeedItem.new_();
        myMeetFeedItemNew_.type = FeedType.get(FeedType.localLikersUser);
        lwlVar.mo151978d(new MeetFeedUserItemData(user, myMeetFeedItemNew_), true, false, true, null);
    }

    /* JADX INFO: renamed from: g */
    public void m42867g(final User user, final lwl lwlVar) {
        this.f26224k = user;
        xdl0.m208345M0(this.f26223j, false);
        xdl0.m208345M0(this.f26222i, false);
        boolean zM210071e4 = xma.m210071e4();
        final boolean z = !zM210071e4;
        if (zM210071e4 || sb90.m183207c(user)) {
            qib0.f154691G.m102336O(this.f26214a, user.m60124fp().profile480().formatted(), 2, 30);
        } else {
            qib0.f154691G.m102335N0(this.f26214a, user.m60124fp().profile480().formatted(), false);
        }
        m42868h(user, lwlVar);
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.q4y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f152681a.m42865e(user, z, lwlVar, view);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final void m42868h(final User user, final lwl lwlVar) {
        xdl0.m208344M(this.f26221h, false);
        xdl0.m208344M(this.f26217d, true);
        xdl0.m208344M(this.f26220g, true);
        qib0.f154713b0.f139231b.showUserVerificationLogo(getContext(), user, this.f26215b);
        m42870j(user, CoreModule.f17545c.f19687u0.f19254k0.get().longValue());
        if (!CoreModule.m29935P().m94651a().mo33454Yp() || TextUtils.isEmpty(user.localSeeReminderType)) {
            this.f26218e.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            this.f26218e.setText(String.format("%s岁", user.age));
            this.f26219f.setText(user.name);
        } else {
            this.f26219f.setText(String.format("%1$s %2$s", user.name, user.age));
            m42869i(user);
        }
        if (lwlVar.mo151977c() && CoreModule.m29935P().m94651a().mo33606v4()) {
            this.f26220g.setImageResource(b3c0.f73108n1);
        } else {
            this.f26220g.setImageResource(b3c0.f73100m1);
        }
        this.f26217d.setBackground(m42864d().drawable(b3c0.f73131q0));
        xdl0.m208329E0(this.f26220g, new View.OnClickListener() { // from class: l.r4y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f157737a.m42866f(user, lwlVar, view);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final void m42869i(User user) {
        String str;
        String str2 = user.localSeeReminderType;
        str2.getClass();
        switch (str2) {
            case "nearby":
                int i = user.location.distance;
                if (i >= 1000) {
                    str = String.format("%skm", new DecimalFormat(IdManager.DEFAULT_VERSION_NAME).format(i / 1000.0f));
                } else {
                    if (i < 100) {
                        i = 100;
                    }
                    str = String.format("%sm", Integer.valueOf(i));
                }
                this.f26218e.setText(str);
                xdl0.m208383k(this.f26218e, m42864d().drawable(b3c0.f73028d1));
                break;
            case "online":
                this.f26218e.setText("最近活跃");
                xdl0.m208383k(this.f26218e, m42864d().drawable(b3c0.f73036e1));
                break;
            case "visit":
                this.f26218e.setText("看过我");
                xdl0.m208383k(this.f26218e, m42864d().drawable(b3c0.f73044f1));
                break;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m42870j(User user, long j) {
        xdl0.m208345M0(this.f26216c, false);
        this.f26216c.setTypeface(Typeface.DEFAULT);
        if (NullChecker.m81303a(user.localRelationship) && NullChecker.m81303a(user.localRelationship.cardInfo) && !vwb.m200296J(user.localRelationship.cardInfo.cardTypes) && user.localRelationship.cardInfo.cardTypes.contains("newLikeAfterVerification")) {
            this.f26216c.setText("来自邀请认证");
            this.f26216c.setTypeface(Typeface.DEFAULT_BOLD);
            this.f26216c.setBackgroundResource(qib0.f154713b0.f139231b.mo30692I4() ? b3c0.f73093l2 : b3c0.f73085k2);
            this.f26216c.setCompoundDrawablesWithIntrinsicBounds(qib0.f154713b0.f139231b.mo30692I4() ? b3c0.f73061h2 : b3c0.f73053g2, 0, 0, 0);
            xdl0.m208345M0(this.f26216c, true);
            return;
        }
        if (user.superLikedMe()) {
            this.f26216c.setText(String.format("%s超级喜欢你", user.isFemale() ? "她" : "他"));
            this.f26216c.setTypeface(Typeface.DEFAULT_BOLD);
            this.f26216c.setBackgroundResource(b3c0.f73101m2);
            this.f26216c.setCompoundDrawablesWithIntrinsicBounds(b3c0.f73037e2, 0, 0, 0);
            xdl0.m208345M0(this.f26216c, true);
            return;
        }
        if (CoreModule.f17545c.f19687u0.m30492y5(user)) {
            xdl0.m208345M0(this.f26216c, true);
            this.f26216c.setText("即刻聊天");
            this.f26216c.setTypeface(Typeface.DEFAULT_BOLD);
            this.f26216c.setBackgroundResource(b3c0.f73013b2);
            this.f26216c.setCompoundDrawablesWithIntrinsicBounds(b3c0.f73066i, 0, 0, 0);
            return;
        }
        if (j <= 0 || !NullChecker.m81303a(user.localRelationship)) {
            xdl0.m208345M0(this.f26216c, false);
            return;
        }
        xdl0.m208345M0(this.f26216c, ((double) j) < user.localRelationship.updateTime);
        this.f26216c.setTypeface(Typeface.DEFAULT_BOLD);
        this.f26216c.setText("新喜欢");
        this.f26216c.setBackgroundResource(b3c0.f73085k2);
        this.f26216c.setCompoundDrawablesWithIntrinsicBounds(b3c0.f73029d2, 0, 0, 0);
    }

    /* JADX INFO: renamed from: k */
    public final MeetFeedUserItemData m42871k(User user) {
        MyMeetFeedItem myMeetFeedItemNew_ = MyMeetFeedItem.new_();
        myMeetFeedItemNew_.type = FeedType.get(FeedType.localLikersUser);
        return new MeetFeedUserItemData(user, myMeetFeedItemNew_);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m42863c(this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = (int) (View.MeasureSpec.getSize(i) * 1.33f);
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f26217d.getLayoutParams();
        int i3 = (int) (size * 0.38f);
        if (layoutParams.height != i3) {
            layoutParams.height = i3;
            this.f26217d.setLayoutParams(layoutParams);
        }
    }

    public MeetLikersUserItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MeetLikersUserItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
