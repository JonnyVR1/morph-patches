package com.p000p1.mobile.putong.feed.p005ui.moments;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.data.LocalStatus;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.Picture;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.p005ui.moments.MomentsInProfileViewLarge;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.Date;
import java.util.List;
import l.mqi0;
import l.qib0;
import l.t100;
import p007l.gs00;
import p007l.v1h;
import p007l.z1c0;
import v.VDraweeView;
import v.VFrame_Anim;
import v.VLinear;
import v.VProgressBar;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class MomentsInProfileViewLarge extends VLinear implements View.OnLongClickListener {

    /* JADX INFO: renamed from: c */
    public VFrame_Anim f5417c;

    /* JADX INFO: renamed from: d */
    public VProgressBar f5418d;

    /* JADX INFO: renamed from: e */
    public ImageView f5419e;

    /* JADX INFO: renamed from: f */
    public VText f5420f;

    /* JADX INFO: renamed from: g */
    public VText f5421g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f5422h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f5423i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f5424j;

    /* JADX INFO: renamed from: k */
    public VText f5425k;

    /* JADX INFO: renamed from: l */
    public Moment f5426l;

    public MomentsInProfileViewLarge(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m8207P(Moment moment, Dialog dialog, View view, int i, CharSequence charSequence) {
        if (i == 0) {
            FeedModule.f315c.m1659j4(moment);
        } else if (1 == i) {
            FeedModule.f315c.m1654h3(((DbObject) moment)._id);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m8210V(Moment moment, View view) {
        m8215Y(m8213T(), moment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m8211W(View view) {
        PutongAct putongActM8213T = m8213T();
        PutongAct putongActM8213T2 = m8213T();
        Moment moment = this.f5426l;
        putongActM8213T.startActivity(MomentDetailAct.m7851V1(putongActM8213T2, ((DbObject) moment).id, moment.owner, false, false));
    }

    /* JADX INFO: renamed from: S */
    public final void m8212S(View view) {
        gs00.m10495a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T */
    public MomentsInProfileAct m8213T() {
        return (MomentsInProfileAct) getContext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X */
    public void m8214X(final Moment moment, int i, Moment moment2, boolean z) {
        boolean z2;
        Media media;
        this.f5426l = moment;
        Picture picture = null;
        if (TEnum.equals(moment.status(), "normal")) {
            this.f5417c.setVisibility(4);
            setOnClickListener((View.OnClickListener) null);
            z2 = true;
        } else {
            boolean zEquals = TEnum.equals(moment.status(), LocalStatus.sending);
            VFrame_Anim vFrame_Anim = this.f5417c;
            if (zEquals) {
                vFrame_Anim.setVisibility(0);
                this.f5417c.G(this.f5418d);
                setOnClickListener((View.OnClickListener) null);
            } else {
                vFrame_Anim.setVisibility(0);
                this.f5417c.G(this.f5419e);
                setOnClickListener(new View.OnClickListener() { // from class: l.ds00
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f7042a.m8210V(moment, view);
                    }
                });
            }
            z2 = false;
        }
        if (NullChecker.a(moment2)) {
            Date date = new Date((long) moment.createdTime);
            Date date2 = new Date((long) moment2.createdTime);
            z2 = z2 && (date.getYear() != date2.getYear() || date.getMonth() != date2.getMonth() || date.getDate() != date2.getDate());
            if (z2) {
                setPadding(0, t100.d(16.0f), 0, z ? getResources().getDimensionPixelSize(z1c0.f15554b) : t100.d(8.0f));
            } else {
                setPadding(0, 0, 0, z ? getResources().getDimensionPixelSize(z1c0.f15554b) : t100.d(8.0f));
            }
        } else {
            setPadding(0, t100.d(20.0f), 0, z ? getResources().getDimensionPixelSize(z1c0.f15554b) : t100.d(8.0f));
        }
        VText vText = this.f5421g;
        if (z2) {
            vText.setText(mqi0.n.format(Double.valueOf(moment.createdTime)));
            this.f5420f.setText(mqi0.o.format(Double.valueOf(moment.createdTime)));
        } else {
            vText.setText("");
            this.f5420f.setText("");
        }
        int size = moment.media.size();
        List<Media> list = moment.media;
        if (size >= 2) {
            media = list.get(1);
        } else {
            media = !list.isEmpty() ? moment.media.get(0) : null;
        }
        if (media instanceof Video) {
            picture = ((Video) media).cover;
        } else if (media instanceof Picture) {
            picture = (Picture) media;
        }
        if (NullChecker.b(picture)) {
            qib0.G.Q0(this.f5424j, picture.momentPictureSmall());
        } else {
            qib0.G.o(this.f5424j);
        }
        this.f5425k.setText(moment.value);
        this.f5422h.setOnClickListener(new View.OnClickListener() { // from class: l.es00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7472a.m8211W(view);
            }
        });
        this.f5422h.setOnLongClickListener(this);
    }

    /* JADX INFO: renamed from: Y */
    public void m8215Y(Act act, final Moment moment) {
        act.dialog().f0(new String[]{act.getString(R$string.f569n), act.getString(R$string.f513f)}).g0(new Dialog.g() { // from class: l.fs00
            /* JADX INFO: renamed from: a */
            public final void m10318a(Dialog dialog, View view, int i, CharSequence charSequence) {
                MomentsInProfileViewLarge.m8207P(moment, dialog, view, i, charSequence);
            }
        }).z0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8212S(this);
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        MomentsInProfileAct momentsInProfileActM8213T = m8213T();
        Moment moment = this.f5426l;
        v1h.m15271x0(momentsInProfileActM8213T, moment.owner, moment, null, null, null, false, true, false);
        return true;
    }

    public MomentsInProfileViewLarge(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MomentsInProfileViewLarge(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
