package com.p046p1.mobile.putong.feed.p060ui.moments;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.data.LocalStatus;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.p060ui.moments.MomentsInProfileView;
import com.tantanapp.common.utils.NullChecker;
import java.util.Date;
import p147v.VDraweeView;
import p147v.VFrame_Anim;
import p147v.VLinear;
import p147v.VProgressBar;
import p147v.VText;
import p149l.b5c0;
import p149l.f3c0;
import p149l.mqi0;
import p149l.qib0;
import p149l.t100;
import p149l.v1h;
import p149l.ws00;
import p149l.z1c0;

/* JADX INFO: loaded from: classes12.dex */
public class MomentsInProfileView extends VLinear implements View.OnLongClickListener {

    /* JADX INFO: renamed from: c */
    public VFrame_Anim f43944c;

    /* JADX INFO: renamed from: d */
    public VProgressBar f43945d;

    /* JADX INFO: renamed from: e */
    public ImageView f43946e;

    /* JADX INFO: renamed from: f */
    public VText f43947f;

    /* JADX INFO: renamed from: g */
    public VText f43948g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f43949h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f43950i;

    /* JADX INFO: renamed from: j */
    public VText f43951j;

    /* JADX INFO: renamed from: k */
    public VText f43952k;

    /* JADX INFO: renamed from: l */
    public VDraweeView[] f43953l;

    /* JADX INFO: renamed from: m */
    public View f43954m;

    /* JADX INFO: renamed from: n */
    public Moment f43955n;

    public MomentsInProfileView(Context context) {
        super(context);
        this.f43953l = new VDraweeView[4];
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m66993P(Moment moment, Dialog dialog, View view, int i, CharSequence charSequence) {
        if (i == 0) {
            FeedModule.f38854c.m60733j4(moment);
        } else if (1 == i) {
            FeedModule.f38854c.m60728h3(moment._id);
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m66997T(View view) {
        ws00.m205336a(this, view);
    }

    /* JADX INFO: renamed from: V */
    public MomentsInProfileAct m66998V() {
        return (MomentsInProfileAct) getContext();
    }

    /* JADX INFO: renamed from: W */
    public void m66999W(int i) {
        View viewInflate = m66998V().inflater().inflate(i, (ViewGroup) this.f43950i, false);
        this.f43953l[0] = (VDraweeView) viewInflate.findViewById(b5c0.f73595o0);
        this.f43953l[1] = (VDraweeView) viewInflate.findViewById(b5c0.f73601q0);
        this.f43953l[2] = (VDraweeView) viewInflate.findViewById(b5c0.f73598p0);
        this.f43953l[3] = (VDraweeView) viewInflate.findViewById(b5c0.f73592n0);
        this.f43954m = viewInflate.findViewById(b5c0.f73602q1);
        this.f43950i.addView(viewInflate, 0);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m67000X(Moment moment, View view) {
        m67004b0(m66998V(), moment);
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m67001Y(Moment moment, View view) {
        m66998V().startActivity(MomentsInProfileTextAct.m66992V1(m66998V(), moment.f56011id, moment.owner));
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m67002Z(Moment moment, View view) {
        m66998V().startActivity(MomentsInProfilePreviewAct.m66919I2(m66998V(), moment.f56011id, moment.owner));
    }

    /* JADX INFO: renamed from: a0 */
    public void m67003a0(final Moment moment, int i, Moment moment2, boolean z) {
        boolean z2;
        this.f43955n = moment;
        if (TEnum.equals(moment.status(), "normal")) {
            this.f43944c.setVisibility(4);
            setOnClickListener(null);
            z2 = true;
        } else {
            boolean zEquals = TEnum.equals(moment.status(), LocalStatus.sending);
            VFrame_Anim vFrame_Anim = this.f43944c;
            if (zEquals) {
                vFrame_Anim.setVisibility(0);
                this.f43944c.m223026G(this.f43945d);
                setOnClickListener(null);
            } else {
                vFrame_Anim.setVisibility(0);
                this.f43944c.m223026G(this.f43946e);
                setOnClickListener(new View.OnClickListener() { // from class: l.zr00
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f204449a.m67000X(moment, view);
                    }
                });
            }
            z2 = false;
        }
        if (NullChecker.m81303a(moment2)) {
            Date date = new Date((long) moment.createdTime);
            Date date2 = new Date((long) moment2.createdTime);
            boolean z3 = z2 && (date.getYear() != date2.getYear() || date.getMonth() != date2.getMonth() || date.getDate() != date2.getDate());
            if (z3) {
                setPadding(0, t100.m186890d(16.0f), 0, z ? getResources().getDimensionPixelSize(z1c0.f201065b) : t100.m186890d(8.0f));
            } else {
                setPadding(0, 0, 0, z ? getResources().getDimensionPixelSize(z1c0.f201065b) : t100.m186890d(8.0f));
            }
            z2 = z3;
        } else {
            setPadding(0, t100.m186890d(20.0f), 0, z ? getResources().getDimensionPixelSize(z1c0.f201065b) : t100.m186890d(8.0f));
        }
        VText vText = this.f43948g;
        if (z2) {
            vText.setText(mqi0.f135262n.format(Double.valueOf(moment.createdTime)));
            this.f43947f.setText(mqi0.f135263o.format(Double.valueOf(moment.createdTime)));
        } else {
            vText.setText("");
            this.f43947f.setText("");
        }
        for (int i2 = 0; i2 < i; i2++) {
            Media media = moment.media.get(i2);
            Picture picture = media instanceof Video ? ((Video) media).cover : media instanceof Picture ? (Picture) media : null;
            if (NullChecker.m81303a(picture)) {
                qib0.f154691G.m102341Q0(this.f43953l[i2], picture.momentPictureSmall());
            } else {
                qib0.f154691G.m184725o(this.f43953l[i2]);
            }
        }
        this.f43951j.setText(moment.value);
        LinearLayout linearLayout = this.f43949h;
        if (i == 0) {
            linearLayout.setOnClickListener(null);
            this.f43949h.setClickable(false);
            this.f43950i.setVisibility(8);
            this.f43951j.setMaxLines(3);
            this.f43951j.setBackgroundDrawable(getResources().getDrawable(f3c0.f94583n6));
            this.f43951j.setPadding(t100.m186890d(16.0f), t100.m186890d(12.0f), t100.m186890d(16.0f), t100.m186890d(12.0f));
            this.f43951j.setOnClickListener(new View.OnClickListener() { // from class: l.as00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f71375a.m67001Y(moment, view);
                }
            });
            this.f43951j.setOnLongClickListener(this);
        } else {
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: l.bs00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f76967a.m67002Z(moment, view);
                }
            });
            this.f43949h.setOnLongClickListener(this);
        }
        this.f43952k.setVisibility(8);
    }

    /* JADX INFO: renamed from: b0 */
    public void m67004b0(Act act, final Moment moment) {
        act.dialog().m20536f0(new String[]{act.getString(R$string.f39108n), act.getString(R$string.f39052f)}).m20537g0(new Dialog.InterfaceC4311g() { // from class: l.cs00
            @Override // com.p046p1.mobile.android.app.Dialog.InterfaceC4311g
            /* JADX INFO: renamed from: a */
            public final void mo20569a(Dialog dialog, View view, int i, CharSequence charSequence) {
                MomentsInProfileView.m66993P(moment, dialog, view, i, charSequence);
            }
        }).m20568z0();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m66997T(this);
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        MomentsInProfileAct momentsInProfileActM66998V = m66998V();
        Moment moment = this.f43955n;
        v1h.m196632x0(momentsInProfileActM66998V, moment.owner, moment, null, null, null, false, true, false);
        return true;
    }

    public MomentsInProfileView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43953l = new VDraweeView[4];
    }

    public MomentsInProfileView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f43953l = new VDraweeView[4];
    }
}
