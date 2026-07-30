package com.p051p1.mobile.putong.feed.p065ui.moments;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
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
import com.p051p1.mobile.putong.feed.p065ui.moments.MomentsInProfileView;
import com.tantanapp.common.utils.NullChecker;
import java.util.Date;
import p151v.VDraweeView;
import p151v.VFrame_Anim;
import p151v.VLinear;
import p151v.VProgressBar;
import p151v.VText;
import p153l.f110;
import p153l.gac0;
import p153l.hdc0;
import p153l.k3h;
import p153l.lbc0;
import p153l.pzi0;
import p153l.qa00;
import p153l.uqb0;

/* JADX INFO: loaded from: classes13.dex */
public class MomentsInProfileView extends VLinear implements View.OnLongClickListener {

    /* JADX INFO: renamed from: c */
    public VFrame_Anim f44792c;

    /* JADX INFO: renamed from: d */
    public VProgressBar f44793d;

    /* JADX INFO: renamed from: e */
    public ImageView f44794e;

    /* JADX INFO: renamed from: f */
    public VText f44795f;

    /* JADX INFO: renamed from: g */
    public VText f44796g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f44797h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f44798i;

    /* JADX INFO: renamed from: j */
    public VText f44799j;

    /* JADX INFO: renamed from: k */
    public VText f44800k;

    /* JADX INFO: renamed from: l */
    public VDraweeView[] f44801l;

    /* JADX INFO: renamed from: m */
    public View f44802m;

    /* JADX INFO: renamed from: n */
    public Moment f44803n;

    public MomentsInProfileView(Context context) {
        super(context);
        this.f44801l = new VDraweeView[4];
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m68176P(Moment moment, Dialog dialog, View view, int i, CharSequence charSequence) {
        if (i == 0) {
            FeedModule.f39702c.m61917j4(moment);
        } else if (1 == i) {
            FeedModule.f39702c.m61912h3(moment._id);
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m68180T(View view) {
        f110.m123543a(this, view);
    }

    /* JADX INFO: renamed from: V */
    public MomentsInProfileAct m68181V() {
        return (MomentsInProfileAct) getContext();
    }

    /* JADX INFO: renamed from: W */
    public void m68182W(int i) {
        View viewInflate = m68181V().inflater().inflate(i, (ViewGroup) this.f44798i, false);
        this.f44801l[0] = (VDraweeView) viewInflate.findViewById(hdc0.f108948o0);
        this.f44801l[1] = (VDraweeView) viewInflate.findViewById(hdc0.f108954q0);
        this.f44801l[2] = (VDraweeView) viewInflate.findViewById(hdc0.f108951p0);
        this.f44801l[3] = (VDraweeView) viewInflate.findViewById(hdc0.f108945n0);
        this.f44802m = viewInflate.findViewById(hdc0.f108955q1);
        this.f44798i.addView(viewInflate, 0);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m68183X(Moment moment, View view) {
        m68187b0(m68181V(), moment);
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m68184Y(Moment moment, View view) {
        m68181V().startActivity(MomentsInProfileTextAct.m68175X1(m68181V(), moment.f56859id, moment.owner));
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m68185Z(Moment moment, View view) {
        m68181V().startActivity(MomentsInProfilePreviewAct.m68103K2(m68181V(), moment.f56859id, moment.owner));
    }

    /* JADX INFO: renamed from: a0 */
    public void m68186a0(final Moment moment, int i, Moment moment2, boolean z) {
        boolean z2;
        this.f44803n = moment;
        if (TEnum.equals(moment.status(), "normal")) {
            this.f44792c.setVisibility(4);
            setOnClickListener(null);
            z2 = true;
        } else {
            boolean zEquals = TEnum.equals(moment.status(), LocalStatus.sending);
            VFrame_Anim vFrame_Anim = this.f44792c;
            if (zEquals) {
                vFrame_Anim.setVisibility(0);
                this.f44792c.m224272G(this.f44793d);
                setOnClickListener(null);
            } else {
                vFrame_Anim.setVisibility(0);
                this.f44792c.m224272G(this.f44794e);
                setOnClickListener(new View.OnClickListener() { // from class: l.i010
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f112324a.m68183X(moment, view);
                    }
                });
            }
            z2 = false;
        }
        if (NullChecker.m82486a(moment2)) {
            Date date = new Date((long) moment.createdTime);
            Date date2 = new Date((long) moment2.createdTime);
            boolean z3 = z2 && (date.getYear() != date2.getYear() || date.getMonth() != date2.getMonth() || date.getDate() != date2.getDate());
            if (z3) {
                setPadding(0, qa00.m175859d(16.0f), 0, z ? getResources().getDimensionPixelSize(gac0.f102975b) : qa00.m175859d(8.0f));
            } else {
                setPadding(0, 0, 0, z ? getResources().getDimensionPixelSize(gac0.f102975b) : qa00.m175859d(8.0f));
            }
            z2 = z3;
        } else {
            setPadding(0, qa00.m175859d(20.0f), 0, z ? getResources().getDimensionPixelSize(gac0.f102975b) : qa00.m175859d(8.0f));
        }
        VText vText = this.f44796g;
        if (z2) {
            vText.setText(pzi0.f154867n.format(Double.valueOf(moment.createdTime)));
            this.f44795f.setText(pzi0.f154868o.format(Double.valueOf(moment.createdTime)));
        } else {
            vText.setText("");
            this.f44795f.setText("");
        }
        for (int i2 = 0; i2 < i; i2++) {
            Media media = moment.media.get(i2);
            Picture picture = media instanceof Video ? ((Video) media).cover : media instanceof Picture ? (Picture) media : null;
            if (NullChecker.m82486a(picture)) {
                uqb0.f180374G.m127125Q0(this.f44801l[i2], picture.momentPictureSmall());
            } else {
                uqb0.f180374G.m98798o(this.f44801l[i2]);
            }
        }
        this.f44799j.setText(moment.value);
        LinearLayout linearLayout = this.f44797h;
        if (i == 0) {
            linearLayout.setOnClickListener(null);
            this.f44797h.setClickable(false);
            this.f44798i.setVisibility(8);
            this.f44799j.setMaxLines(3);
            this.f44799j.setBackgroundDrawable(getResources().getDrawable(lbc0.f131101n6));
            this.f44799j.setPadding(qa00.m175859d(16.0f), qa00.m175859d(12.0f), qa00.m175859d(16.0f), qa00.m175859d(12.0f));
            this.f44799j.setOnClickListener(new View.OnClickListener() { // from class: l.j010
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f117773a.m68184Y(moment, view);
                }
            });
            this.f44799j.setOnLongClickListener(this);
        } else {
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: l.k010
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f123351a.m68185Z(moment, view);
                }
            });
            this.f44797h.setOnLongClickListener(this);
        }
        this.f44800k.setVisibility(8);
    }

    /* JADX INFO: renamed from: b0 */
    public void m68187b0(Act act, final Moment moment) {
        act.dialog().m21535f0(new String[]{act.getString(R$string.f39956n), act.getString(R$string.f39900f)}).m21536g0(new Dialog.InterfaceC4462g() { // from class: l.l010
            @Override // com.p051p1.mobile.android.app.Dialog.InterfaceC4462g
            /* JADX INFO: renamed from: a */
            public final void mo21568a(Dialog dialog, View view, int i, CharSequence charSequence) {
                MomentsInProfileView.m68176P(moment, dialog, view, i, charSequence);
            }
        }).m21567z0();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m68180T(this);
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        MomentsInProfileAct momentsInProfileActM68181V = m68181V();
        Moment moment = this.f44803n;
        k3h.m148109x0(momentsInProfileActM68181V, moment.owner, moment, null, null, null, false, true, false);
        return true;
    }

    public MomentsInProfileView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44801l = new VDraweeView[4];
    }

    public MomentsInProfileView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f44801l = new VDraweeView[4];
    }
}
