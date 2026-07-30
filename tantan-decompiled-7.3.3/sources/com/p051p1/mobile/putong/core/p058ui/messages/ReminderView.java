package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.CoreMomentInfo;
import com.p051p1.mobile.putong.core.data.Reminder;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.messages.ReminderView;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.bsj0;
import p153l.g9c0;
import p153l.gta;
import p153l.ibc0;
import p153l.kxc0;
import p153l.psd0;
import p153l.pzi0;
import p153l.uqb0;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class ReminderView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f32526a;

    /* JADX INFO: renamed from: b */
    public VImage f32527b;

    /* JADX INFO: renamed from: c */
    public VText f32528c;

    /* JADX INFO: renamed from: d */
    public VText f32529d;

    /* JADX INFO: renamed from: e */
    public VImage f32530e;

    /* JADX INFO: renamed from: f */
    public CoreMomentInfo f32531f;

    /* JADX INFO: renamed from: g */
    public Conversation f32532g;

    public ReminderView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m50176b(Envelope envelope) {
    }

    /* JADX INFO: renamed from: e */
    public final void m50179e(View view) {
        kxc0.m151823a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m50180f(Throwable th) {
        bsj0.m106246D(th);
        m50184j(false);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m50181g(View view) {
        CoreMomentInfo coreMomentInfo = this.f32531f;
        if (coreMomentInfo == null || coreMomentInfo.haveLiked) {
            return;
        }
        m50184j(true);
        FeedService feedServiceM30932N = CoreModule.m30932N();
        String str = this.f32532g.f56859id;
        CoreMomentInfo coreMomentInfo2 = this.f32531f;
        feedServiceM30932N.coreMomentLike(str, coreMomentInfo2.f56856id, true ^ coreMomentInfo2.haveLiked).subscribe(psd0.m173597H(new y20() { // from class: l.ixc0
            @Override // p153l.y20
            public final void call(Object obj) {
                ReminderView.m50176b((Envelope) obj);
            }
        }, new y20() { // from class: l.jxc0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f123018a.m50180f((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m50182h(View view) {
        CoreMomentInfo coreMomentInfo = this.f32531f;
        if (coreMomentInfo == null) {
            return;
        }
        if (!NullChecker.m82486a(coreMomentInfo.media) || this.f32531f.media.size() != 0) {
            getContext().startActivity(CoreModule.m30932N().argsToMomentsFeedPreviewAct(getContext(), this.f32531f.f56856id, 0, false, "ReminderView", this.f32532g.f56859id));
            return;
        }
        Context context = getContext();
        FeedService feedServiceM30932N = CoreModule.m30932N();
        Context context2 = getContext();
        CoreMomentInfo coreMomentInfo2 = this.f32531f;
        context.startActivity(feedServiceM30932N.argsToMomentsSimpleTextAct(context2, coreMomentInfo2.f56856id, coreMomentInfo2.owner));
    }

    /* JADX INFO: renamed from: i */
    public void m50183i(Conversation conversation) {
        Picture picture;
        Reminder reminder = conversation.reminder;
        if (TEnum.equals(reminder.reference.type, "moment")) {
            this.f32532g = conversation;
            CoreMomentInfo coreMomentInfo = (CoreMomentInfo) CoreModule.m30932N().mo61479Mh(reminder.moment, CoreMomentInfo.JSON_ADAPTER);
            this.f32531f = coreMomentInfo;
            if (coreMomentInfo == null) {
                return;
            }
            this.f32529d.setText(pzi0.f154865l.format(Double.valueOf(coreMomentInfo.createdTime)));
            m50184j(this.f32531f.haveLiked);
            boolean zEquals = TEnum.equals(reminder.reference.action, "avatar");
            VText vText = this.f32528c;
            if (zEquals) {
                vText.setText(R$string.f21639X4);
                this.f32527b.setVisibility(8);
            } else {
                vText.setText(!TextUtils.isEmpty(this.f32531f.value) ? this.f32531f.value : getResources().getString(R$string.f21631W4));
            }
            if (!NullChecker.m82486a(this.f32531f.media) || this.f32531f.media.size() <= 0) {
                uqb0.f180374G.m98798o(this.f32526a);
                this.f32526a.setVisibility(8);
                this.f32527b.setVisibility(8);
                return;
            }
            Media media = this.f32531f.media.get(0);
            if (media instanceof Video) {
                picture = ((Video) media).cover;
                this.f32527b.setVisibility(0);
            } else if (media instanceof Picture) {
                picture = (Picture) media;
                this.f32527b.setVisibility(8);
            } else {
                picture = null;
            }
            if (NullChecker.m82486a(picture)) {
                uqb0.f180374G.m127125Q0(this.f32526a, picture.momentPictureSmall());
                this.f32526a.setVisibility(0);
            } else {
                uqb0.f180374G.m98798o(this.f32526a);
                this.f32526a.setVisibility(8);
                this.f32527b.setVisibility(8);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m50184j(boolean z) {
        this.f32530e.setImageResource(z ? ibc0.f113777D7 : ibc0.f113768C7);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m50179e(this);
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f32528c.setTextColor(getResources().getColor(g9c0.f102817g));
            this.f32529d.setTextColor(getResources().getColor(g9c0.f102819i));
        }
        this.f32530e.setOnClickListener(new View.OnClickListener() { // from class: l.gxc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f106929a.m50181g(view);
            }
        });
        setOnClickListener(new View.OnClickListener() { // from class: l.hxc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f111990a.m50182h(view);
            }
        });
    }

    public ReminderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ReminderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
