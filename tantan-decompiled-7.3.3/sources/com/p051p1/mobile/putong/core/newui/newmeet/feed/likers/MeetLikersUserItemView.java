package com.p051p1.mobile.putong.core.newui.newmeet.feed.likers;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.businessdata.meet.MeetFeedUserItemData;
import com.p051p1.mobile.putong.core.data.FeedType;
import com.p051p1.mobile.putong.core.data.MyMeetFeedItem;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.text.DecimalFormat;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VRelative;
import p151v.VText;
import p153l.bnl0;
import p153l.dzl;
import p153l.gbc0;
import p153l.i4g0;
import p153l.joa;
import p153l.jyb;
import p153l.pdy;
import p153l.uqb0;
import p153l.uxj0;
import p153l.wj90;

/* JADX INFO: loaded from: classes11.dex */
public class MeetLikersUserItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f26956a;

    /* JADX INFO: renamed from: b */
    public VImage f26957b;

    /* JADX INFO: renamed from: c */
    public VText f26958c;

    /* JADX INFO: renamed from: d */
    public VRelative f26959d;

    /* JADX INFO: renamed from: e */
    public VText f26960e;

    /* JADX INFO: renamed from: f */
    public VText f26961f;

    /* JADX INFO: renamed from: g */
    public VImage f26962g;

    /* JADX INFO: renamed from: h */
    public View f26963h;

    /* JADX INFO: renamed from: i */
    public VImage f26964i;

    /* JADX INFO: renamed from: j */
    public VImage f26965j;

    /* JADX INFO: renamed from: k */
    public User f26966k;

    public MeetLikersUserItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public final void m43874c(View view) {
        pdy.m171912a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final Act m43875d() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m43876e(User user, boolean z, dzl dzlVar, View view) {
        CoreModule.f18264c.f20406m1.m35701M4().onNext(uxj0.f181467a);
        i4g0.m138523u("e_meet_see_card", m43875d().pageId(), jyb.m147494Y("other_user_id", user.f56859id));
        if (z) {
            CoreModule.m30933P().m143405a().mo34571qb(m43875d(), user.f56859id, this);
        } else {
            CoreModule.m30933P().m143405a().mo34537l1(m43875d(), dzlVar.mo118746a(m43882k(user)));
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m43877f(User user, dzl dzlVar, View view) {
        CoreModule.f18264c.f20406m1.m35701M4().onNext(uxj0.f181467a);
        i4g0.m138523u("e_meet_see_card_like", m43875d().pageId(), jyb.m147494Y("other_user_id", user.f56859id));
        MyMeetFeedItem myMeetFeedItemNew_ = MyMeetFeedItem.new_();
        myMeetFeedItemNew_.type = FeedType.get(FeedType.localLikersUser);
        dzlVar.mo118749d(new MeetFeedUserItemData(user, myMeetFeedItemNew_), true, false, true, null);
    }

    /* JADX INFO: renamed from: g */
    public void m43878g(final User user, final dzl dzlVar) {
        this.f26966k = user;
        bnl0.m105525M0(this.f26965j, false);
        bnl0.m105525M0(this.f26964i, false);
        boolean zM146386f4 = joa.m146386f4();
        final boolean z = !zM146386f4;
        if (zM146386f4 || wj90.m206620c(user)) {
            uqb0.f180374G.m127120O(this.f26956a, user.m61308fp().profile480().formatted(), 2, 30);
        } else {
            uqb0.f180374G.m127119N0(this.f26956a, user.m61308fp().profile480().formatted(), false);
        }
        m43879h(user, dzlVar);
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.ndy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f141556a.m43876e(user, z, dzlVar, view);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final void m43879h(final User user, final dzl dzlVar) {
        bnl0.m105524M(this.f26963h, false);
        bnl0.m105524M(this.f26959d, true);
        bnl0.m105524M(this.f26962g, true);
        uqb0.f180396b0.f170325b.showUserVerificationLogo(getContext(), user, this.f26957b);
        m43881j(user, CoreModule.f18264c.f20429u0.f19996l0.get().longValue());
        if (!CoreModule.m30933P().m143405a().mo34457Yp() || TextUtils.isEmpty(user.localSeeReminderType)) {
            this.f26960e.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            this.f26960e.setText(String.format("%s岁", user.age));
            this.f26961f.setText(user.name);
        } else {
            this.f26961f.setText(String.format("%1$s %2$s", user.name, user.age));
            m43880i(user);
        }
        if (dzlVar.mo118748c() && CoreModule.m30933P().m143405a().mo34609v4()) {
            this.f26962g.setImageResource(gbc0.f103359n1);
        } else {
            this.f26962g.setImageResource(gbc0.f103351m1);
        }
        this.f26959d.setBackground(m43875d().drawable(gbc0.f103382q0));
        bnl0.m105509E0(this.f26962g, new View.OnClickListener() { // from class: l.ody
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f146954a.m43877f(user, dzlVar, view);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final void m43880i(User user) {
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
                this.f26960e.setText(str);
                bnl0.m105563k(this.f26960e, m43875d().drawable(gbc0.f103279d1));
                break;
            case "online":
                this.f26960e.setText("最近活跃");
                bnl0.m105563k(this.f26960e, m43875d().drawable(gbc0.f103287e1));
                break;
            case "visit":
                this.f26960e.setText("看过我");
                bnl0.m105563k(this.f26960e, m43875d().drawable(gbc0.f103295f1));
                break;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m43881j(User user, long j) {
        bnl0.m105525M0(this.f26958c, false);
        this.f26958c.setTypeface(Typeface.DEFAULT);
        if (NullChecker.m82486a(user.localRelationship) && NullChecker.m82486a(user.localRelationship.cardInfo) && !jyb.m147479J(user.localRelationship.cardInfo.cardTypes) && user.localRelationship.cardInfo.cardTypes.contains("newLikeAfterVerification")) {
            this.f26958c.setText("来自邀请认证");
            this.f26958c.setTypeface(Typeface.DEFAULT_BOLD);
            this.f26958c.setBackgroundResource(uqb0.f180396b0.f170325b.mo31695I4() ? gbc0.f103344l2 : gbc0.f103336k2);
            this.f26958c.setCompoundDrawablesWithIntrinsicBounds(uqb0.f180396b0.f170325b.mo31695I4() ? gbc0.f103312h2 : gbc0.f103304g2, 0, 0, 0);
            bnl0.m105525M0(this.f26958c, true);
            return;
        }
        if (user.superLikedMe()) {
            this.f26958c.setText(String.format("%s超级喜欢你", user.isFemale() ? "她" : "他"));
            this.f26958c.setTypeface(Typeface.DEFAULT_BOLD);
            this.f26958c.setBackgroundResource(gbc0.f103352m2);
            this.f26958c.setCompoundDrawablesWithIntrinsicBounds(gbc0.f103288e2, 0, 0, 0);
            bnl0.m105525M0(this.f26958c, true);
            return;
        }
        if (CoreModule.f18264c.f20429u0.m31381C5(user)) {
            bnl0.m105525M0(this.f26958c, true);
            this.f26958c.setText("即刻聊天");
            this.f26958c.setTypeface(Typeface.DEFAULT_BOLD);
            this.f26958c.setBackgroundResource(gbc0.f103264b2);
            this.f26958c.setCompoundDrawablesWithIntrinsicBounds(gbc0.f103317i, 0, 0, 0);
            return;
        }
        if (j <= 0 || !NullChecker.m82486a(user.localRelationship)) {
            bnl0.m105525M0(this.f26958c, false);
            return;
        }
        bnl0.m105525M0(this.f26958c, ((double) j) < user.localRelationship.updateTime);
        this.f26958c.setTypeface(Typeface.DEFAULT_BOLD);
        this.f26958c.setText("新喜欢");
        this.f26958c.setBackgroundResource(gbc0.f103336k2);
        this.f26958c.setCompoundDrawablesWithIntrinsicBounds(gbc0.f103280d2, 0, 0, 0);
    }

    /* JADX INFO: renamed from: k */
    public final MeetFeedUserItemData m43882k(User user) {
        MyMeetFeedItem myMeetFeedItemNew_ = MyMeetFeedItem.new_();
        myMeetFeedItemNew_.type = FeedType.get(FeedType.localLikersUser);
        return new MeetFeedUserItemData(user, myMeetFeedItemNew_);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m43874c(this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = (int) (View.MeasureSpec.getSize(i) * 1.33f);
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f26959d.getLayoutParams();
        int i3 = (int) (size * 0.38f);
        if (layoutParams.height != i3) {
            layoutParams.height = i3;
            this.f26959d.setLayoutParams(layoutParams);
        }
    }

    public MeetLikersUserItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MeetLikersUserItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
