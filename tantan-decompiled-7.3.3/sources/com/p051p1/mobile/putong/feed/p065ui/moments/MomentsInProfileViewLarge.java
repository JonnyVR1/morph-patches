package com.p051p1.mobile.putong.feed.p065ui.moments;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.data.LocalStatus;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.p065ui.moments.MomentsInProfileViewLarge;
import com.tantanapp.common.utils.NullChecker;
import java.util.Date;
import java.util.List;
import p151v.VDraweeView;
import p151v.VFrame_Anim;
import p151v.VLinear;
import p151v.VProgressBar;
import p151v.VText;
import p153l.gac0;
import p153l.k3h;
import p153l.p010;
import p153l.pzi0;
import p153l.qa00;
import p153l.uqb0;

/* JADX INFO: loaded from: classes13.dex */
public class MomentsInProfileViewLarge extends VLinear implements View.OnLongClickListener {

    /* JADX INFO: renamed from: c */
    public VFrame_Anim f44804c;

    /* JADX INFO: renamed from: d */
    public VProgressBar f44805d;

    /* JADX INFO: renamed from: e */
    public ImageView f44806e;

    /* JADX INFO: renamed from: f */
    public VText f44807f;

    /* JADX INFO: renamed from: g */
    public VText f44808g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f44809h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f44810i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f44811j;

    /* JADX INFO: renamed from: k */
    public VText f44812k;

    /* JADX INFO: renamed from: l */
    public Moment f44813l;

    public MomentsInProfileViewLarge(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m68188P(Moment moment, Dialog dialog, View view, int i, CharSequence charSequence) {
        if (i == 0) {
            FeedModule.f39702c.m61917j4(moment);
        } else if (1 == i) {
            FeedModule.f39702c.m61912h3(moment._id);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m68191V(Moment moment, View view) {
        m68196Y(m68194T(), moment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m68192W(View view) {
        MomentsInProfileAct momentsInProfileActM68194T = m68194T();
        MomentsInProfileAct momentsInProfileActM68194T2 = m68194T();
        Moment moment = this.f44813l;
        momentsInProfileActM68194T.startActivity(MomentDetailAct.m67843X1(momentsInProfileActM68194T2, moment.f56859id, moment.owner, false, false));
    }

    /* JADX INFO: renamed from: S */
    public final void m68193S(View view) {
        p010.m170020a(this, view);
    }

    /* JADX INFO: renamed from: T */
    public MomentsInProfileAct m68194T() {
        return (MomentsInProfileAct) getContext();
    }

    /* JADX INFO: renamed from: X */
    public void m68195X(final Moment moment, int i, Moment moment2, boolean z) {
        boolean z2;
        Media media;
        this.f44813l = moment;
        Picture picture = null;
        if (TEnum.equals(moment.status(), "normal")) {
            this.f44804c.setVisibility(4);
            setOnClickListener(null);
            z2 = true;
        } else {
            boolean zEquals = TEnum.equals(moment.status(), LocalStatus.sending);
            VFrame_Anim vFrame_Anim = this.f44804c;
            if (zEquals) {
                vFrame_Anim.setVisibility(0);
                this.f44804c.m224272G(this.f44805d);
                setOnClickListener(null);
            } else {
                vFrame_Anim.setVisibility(0);
                this.f44804c.m224272G(this.f44806e);
                setOnClickListener(new View.OnClickListener() { // from class: l.m010
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f134289a.m68191V(moment, view);
                    }
                });
            }
            z2 = false;
        }
        if (NullChecker.m82486a(moment2)) {
            Date date = new Date((long) moment.createdTime);
            Date date2 = new Date((long) moment2.createdTime);
            z2 = z2 && (date.getYear() != date2.getYear() || date.getMonth() != date2.getMonth() || date.getDate() != date2.getDate());
            if (z2) {
                setPadding(0, qa00.m175859d(16.0f), 0, z ? getResources().getDimensionPixelSize(gac0.f102975b) : qa00.m175859d(8.0f));
            } else {
                setPadding(0, 0, 0, z ? getResources().getDimensionPixelSize(gac0.f102975b) : qa00.m175859d(8.0f));
            }
        } else {
            setPadding(0, qa00.m175859d(20.0f), 0, z ? getResources().getDimensionPixelSize(gac0.f102975b) : qa00.m175859d(8.0f));
        }
        VText vText = this.f44808g;
        if (z2) {
            vText.setText(pzi0.f154867n.format(Double.valueOf(moment.createdTime)));
            this.f44807f.setText(pzi0.f154868o.format(Double.valueOf(moment.createdTime)));
        } else {
            vText.setText("");
            this.f44807f.setText("");
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
        if (NullChecker.m82487b(picture)) {
            uqb0.f180374G.m127125Q0(this.f44811j, picture.momentPictureSmall());
        } else {
            uqb0.f180374G.m98798o(this.f44811j);
        }
        this.f44812k.setText(moment.value);
        this.f44809h.setOnClickListener(new View.OnClickListener() { // from class: l.n010
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f139583a.m68192W(view);
            }
        });
        this.f44809h.setOnLongClickListener(this);
    }

    /* JADX INFO: renamed from: Y */
    public void m68196Y(Act act, final Moment moment) {
        act.dialog().m21535f0(new String[]{act.getString(R$string.f39956n), act.getString(R$string.f39900f)}).m21536g0(new Dialog.InterfaceC4462g() { // from class: l.o010
            @Override // com.p051p1.mobile.android.app.Dialog.InterfaceC4462g
            /* JADX INFO: renamed from: a */
            public final void mo21568a(Dialog dialog, View view, int i, CharSequence charSequence) {
                MomentsInProfileViewLarge.m68188P(moment, dialog, view, i, charSequence);
            }
        }).m21567z0();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m68193S(this);
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        MomentsInProfileAct momentsInProfileActM68194T = m68194T();
        Moment moment = this.f44813l;
        k3h.m148109x0(momentsInProfileActM68194T, moment.owner, moment, null, null, null, false, true, false);
        return true;
    }

    public MomentsInProfileViewLarge(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MomentsInProfileViewLarge(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
