package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.CoreMomentInfo;
import com.p046p1.mobile.putong.core.data.Reminder;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.messages.ReminderView;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.a1c0;
import p149l.c3c0;
import p149l.e30;
import p149l.fpc0;
import p149l.mkd0;
import p149l.mqi0;
import p149l.qib0;
import p149l.ura;
import p149l.yij0;

/* JADX INFO: loaded from: classes3.dex */
public class ReminderView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f31678a;

    /* JADX INFO: renamed from: b */
    public VImage f31679b;

    /* JADX INFO: renamed from: c */
    public VText f31680c;

    /* JADX INFO: renamed from: d */
    public VText f31681d;

    /* JADX INFO: renamed from: e */
    public VImage f31682e;

    /* JADX INFO: renamed from: f */
    public CoreMomentInfo f31683f;

    /* JADX INFO: renamed from: g */
    public Conversation f31684g;

    public ReminderView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m48993b(Envelope envelope) {
    }

    /* JADX INFO: renamed from: e */
    public final void m48996e(View view) {
        fpc0.m122589a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m48997f(Throwable th) {
        yij0.m214926D(th);
        m49001j(false);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m48998g(View view) {
        CoreMomentInfo coreMomentInfo = this.f31683f;
        if (coreMomentInfo == null || coreMomentInfo.haveLiked) {
            return;
        }
        m49001j(true);
        FeedService feedServiceM29934N = CoreModule.m29934N();
        String str = this.f31684g.f56011id;
        CoreMomentInfo coreMomentInfo2 = this.f31683f;
        feedServiceM29934N.coreMomentLike(str, coreMomentInfo2.f56008id, true ^ coreMomentInfo2.haveLiked).subscribe(mkd0.m154956H(new e30() { // from class: l.dpc0
            @Override // p149l.e30
            public final void call(Object obj) {
                ReminderView.m48993b((Envelope) obj);
            }
        }, new e30() { // from class: l.epc0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f92641a.m48997f((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m48999h(View view) {
        CoreMomentInfo coreMomentInfo = this.f31683f;
        if (coreMomentInfo == null) {
            return;
        }
        if (!NullChecker.m81303a(coreMomentInfo.media) || this.f31683f.media.size() != 0) {
            getContext().startActivity(CoreModule.m29934N().argsToMomentsFeedPreviewAct(getContext(), this.f31683f.f56008id, 0, false, "ReminderView", this.f31684g.f56011id));
            return;
        }
        Context context = getContext();
        FeedService feedServiceM29934N = CoreModule.m29934N();
        Context context2 = getContext();
        CoreMomentInfo coreMomentInfo2 = this.f31683f;
        context.startActivity(feedServiceM29934N.argsToMomentsSimpleTextAct(context2, coreMomentInfo2.f56008id, coreMomentInfo2.owner));
    }

    /* JADX INFO: renamed from: i */
    public void m49000i(Conversation conversation) {
        Picture picture;
        Reminder reminder = conversation.reminder;
        if (TEnum.equals(reminder.reference.type, "moment")) {
            this.f31684g = conversation;
            CoreMomentInfo coreMomentInfo = (CoreMomentInfo) CoreModule.m29934N().mo60295Mh(reminder.moment, CoreMomentInfo.JSON_ADAPTER);
            this.f31683f = coreMomentInfo;
            if (coreMomentInfo == null) {
                return;
            }
            this.f31681d.setText(mqi0.f135260l.format(Double.valueOf(coreMomentInfo.createdTime)));
            m49001j(this.f31683f.haveLiked);
            boolean zEquals = TEnum.equals(reminder.reference.action, "avatar");
            VText vText = this.f31680c;
            if (zEquals) {
                vText.setText(R$string.f20897X4);
                this.f31679b.setVisibility(8);
            } else {
                vText.setText(!TextUtils.isEmpty(this.f31683f.value) ? this.f31683f.value : getResources().getString(R$string.f20889W4));
            }
            if (!NullChecker.m81303a(this.f31683f.media) || this.f31683f.media.size() <= 0) {
                qib0.f154691G.m184725o(this.f31678a);
                this.f31678a.setVisibility(8);
                this.f31679b.setVisibility(8);
                return;
            }
            Media media = this.f31683f.media.get(0);
            if (media instanceof Video) {
                picture = ((Video) media).cover;
                this.f31679b.setVisibility(0);
            } else if (media instanceof Picture) {
                picture = (Picture) media;
                this.f31679b.setVisibility(8);
            } else {
                picture = null;
            }
            if (NullChecker.m81303a(picture)) {
                qib0.f154691G.m102341Q0(this.f31678a, picture.momentPictureSmall());
                this.f31678a.setVisibility(0);
            } else {
                qib0.f154691G.m184725o(this.f31678a);
                this.f31678a.setVisibility(8);
                this.f31679b.setVisibility(8);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m49001j(boolean z) {
        this.f31682e.setImageResource(z ? c3c0.f78502D7 : c3c0.f78493C7);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48996e(this);
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f31680c.setTextColor(getResources().getColor(a1c0.f67153g));
            this.f31681d.setTextColor(getResources().getColor(a1c0.f67155i));
        }
        this.f31682e.setOnClickListener(new View.OnClickListener() { // from class: l.bpc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f76618a.m48998g(view);
            }
        });
        setOnClickListener(new View.OnClickListener() { // from class: l.cpc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f81920a.m48999h(view);
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
